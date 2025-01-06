# frozen_string_literal: true

require "fileutils"

# This function converts a "source" file to something looking good in VuePress
def process_file(indir, file, outdir, source)
  in_frontmatter = false
  frontmatter_processed = false
  has_source = false
  has_logo = false
  since_1x = false
  obsolete_binding = false
  og_title = "openHAB"
  og_description = "a vendor and technology agnostic open source automation software for your home"

  unless File.exist?("#{indir}/#{file}")
    verbose "process_file: IGNORING (NON-EXISTING): #{indir}/#{file}"
    return
  end

  FileUtils.mkdir_p(outdir)
  File.open("#{outdir}/#{file}", "w+") do |out|
    File.open("#{indir}/#{file}").each do |line|
      next if line =~ /^layout: documentation/
      next if line =~ /^layout: tutorial/
      next if line =~ /^layout: developers/
      next if line =~ /^layout: intro/
      next if line =~ /^{% include base.html %}/
      next if line =~ /\{: #/
      next if line =~ /\{::options/
      next if line =~ /TOC/
      next if line =~ /no_toc/

      has_source = true if in_frontmatter && line =~ /^source:/
      has_logo = true if in_frontmatter && line =~ /^logo:/
      since_1x = true if in_frontmatter && line =~ /^since: 1x/

      og_title = line.gsub("title: ", "").gsub("\n", "") if in_frontmatter && line =~ /^title:/
      if in_frontmatter && line =~ /^description:/
        og_description = line.gsub("description: ", "").gsub("\n", "").gsub("[", "").gsub("]", "").gsub(
          %r{\(http[:/\-0-9A-Za-z\.]+\)}, ""
        )
      end

      if line =~ /^---$/
        if !in_frontmatter
          in_frontmatter = true
        elsif !frontmatter_processed
          if !has_source && source
            # Prefer already present source
            out.puts "source: #{source}"
          elsif !has_source
            # Try to determine the source
            outdir_parts = outdir.split("/")
            outdir_parts[1] = "binding" if outdir_parts[1] == "bindings"
            outdir_parts[1] = "transform" if outdir_parts[1] == "transformations"
            outdir_parts[1] = "io" if outdir_parts[1] == "integrations"
            if outdir_parts[0] == "addons"
              addon_type = outdir_parts[1]
              addon = file.split("/")[0]
              source = ""
              if addon_type == "ui"
                puts "    (add-on type is ui)"
                source = "https://github.com/openhab/openhab-webui/blob/#{$addons_repo_branch}/bundles/org.openhab.ui.#{addon}/README.md"
              elsif addon == "zigbee"
                puts "    (add-on is zigbee)"
                source = "https://github.com/openhab/org.openhab.binding.zigbee/blob/#{$addons_repo_branch}/org.openhab.binding.zigbee/README.md"
              elsif addon == "zwave" && file !~ /things/
                puts "    (add-on is zwave)"
                source = "https://github.com/openhab/org.openhab.binding.zwave/blob/#{$addons_repo_branch}/README.md"
              elsif file !~ /things/
                source = "https://github.com/openhab/openhab-addons/blob/#{$addons_repo_branch}/bundles/org.openhab.#{addon_type}.#{addon}/README.md"
              end

              out.puts "source: #{source}" if source != ""

              # For sub-bundles, set the "prev" link to the main add-on
              out.puts "prev: ../#{addon.split(".")[0]}/" if addon.include?(".")

              # Prev link to the main binding doc for zwave/doc/things.md
              out.puts "prev: ../" if file == "zwave/doc/things.md"
            end
          end

          # Add OpenGraph tags
          out.puts "meta:"
          out.puts "  - property: og:title"
          out.puts "    content: \"#{og_title.gsub('"', '\"')}\""
          out.puts "  - property: og:description"
          out.puts "    content: #{og_description}"

          in_frontmatter = false
          frontmatter_processed = true
        end
      end

      # Remove collapsibles in Linux install document and replace them by regular headings
      next if line =~ /include collapsible/ && file =~ /linux/

      line = "##### #{line}" if line =~ /^Apt Based Systems/ && file =~ /linux/
      line = "##### #{line}" if line =~ /^Yum or Dnf Based Systems/ && file =~ /linux/
      line = "##### #{line}" if line =~ /^Systems based on/ && file =~ /linux/

      # Expand <!--list-subs--> comments with a list of links
      # (https://github.com/eclipse/smarthome/issues/5571)
      if line =~ /<!--\s*list-subs\s*-->/
        sub_addons = get_subs_links(file.split("/")[0], indir)
        out.puts
        sub_addons.each do |sub|
          out.puts "- [#{sub[1]}](../#{sub[0]}/)"
        end
        out.puts
      end

      # Replace links to generated docs in ZWave's things.md by links to the internal viewer
      line = line.gsub(%r{]\((.*)/(.*)\)}, '](../thing.html?manufacturer=\1&file=\2)') if file == "zwave/doc/things.md"

      # Misc replaces (relative links, remove placeholder interpreted as custom tags)
      line = line.gsub("http://docs.openhab.org/addons/uis/habpanel/readme.html", "/docs/configuration/habpanel.html")
      line = line.gsub("http://docs.openhab.org/addons/uis/basic/readme.html", "/addons/ui/basic/")
      line = line.gsub(%r{http://docs\.openhab\.org/addons/(.*)/(.*)/readme\.html}, '/addons/\1/\2/')
      line = line.gsub("http://docs.openhab.org/", "/docs/")
      line = line.gsub("/addons/io/", "/addons/integrations/")
      line = line.gsub("{{base}}/", "./docs/")
      line = line.gsub("(images/", "(./images/")
      line = line.gsub("src=\"images/", "src=\"./images/")
      line = line.gsub("]:images/", "]:./images/")
      line = line.gsub("](doc/", "](./doc/")
      line = line.gsub("(diagrams/", "(./diagrams/")
      line = line.gsub("./docs/tutorials/beginner/", "/docs/tutorial/")
      line = line.gsub("./docs/", "/docs/")
      line = line.gsub("<activeState>", '\<activeState\>')
      line = line.gsub("<passiveState>", '\<passiveState\>')
      line = line.gsub("(?<!`)<dimension>(?!`)", '\<dimension\>')
      line = line.gsub("<TransformProgram>", '\<TransformProgram\>')
      line = line.gsub("<FlahshbriefingDeviceID>", "`<FlahshbriefingDeviceID>`") if file =~ /amazonechocontrol/
      line = line.gsub("<SerialNumber>", "&lt;SerialNumber&gt;") if file =~ /airvisualnode/
      line = line.gsub("<version>", "&lt;version&gt;") if file =~ /caldav/
      line = line.gsub("by <step>", "by `<step>`") if file =~ /ipx8001/
      line = line.gsub("<BR>", "<BR/>")
      line = line.gsub("'<package name>:<widget ID>'", "`<package name>:<widget ID>`") if file =~ /lametrictime/
      line = line.gsub("<mac address of bridge>", "`<mac address of bridge>`") if file =~ /milight/
      line = line.gsub("<mac>", "`<mac>`") if file =~ /milight/
      line = line.gsub("<type of bulb>", "`<type of bulb>`") if file =~ /milight/
      line = line.gsub("<IP-Address of bridge>", "`<IP-Address of bridge>`") if file =~ /milight/
      line = line.gsub("<bulb>", "`<bulb>`") if file =~ /milight/
      line = line.gsub("<zone>", "`<zone>`") if file =~ /milight/
      line = line.gsub("[](", "[here](") if file =~ /powermax1/
      line = line.gsub("<n>", "&lt;n&gt;") if file =~ /rfxcom/
      line = line.gsub(" <value> ", " &lt;value&gt; ") if file =~ /zibase/
      line = line.gsub("<username>", "&lt;username&gt;") if file =~ /zoneminder/
      line = line.gsub("<password>", "&lt;password&gt;") if file =~ /zoneminder/
      line = line.gsub("<yourzmip>", "&lt;yourzmip&gt;") if file =~ /zoneminder/
      line = line.gsub(" <chatId> ", " &lt;chatId&gt; ") if file =~ /telegram/
      line = line.gsub(" <token> ", " &lt;token&gt; ") if file =~ /telegram/
      line = line.gsub("<regular expression>", '\<regular expression\>')
      line = line.gsub('src="images/', 'src="./images/') if outdir =~ /apps/
      line = line.gsub("](/images/", "](./images/") if outdir =~ /google-assistant/

      line = line.gsub(/\{:(style|target).*\}/, "") # Jekyll inline attributes syntax not supported

      out.puts line
    end

    # Add the component for the edit link
    out.puts
    out.puts "<EditPageLink/>"
  end
end
