# frozen_string_literal: true

require "fileutils"
require "pathname"

ADDONS_REPO_BRANCH = "main"

def verbose(message)
  puts message if $verbose
end

# This function converts a "source" file to something looking good in VuePress
def process_markdown(indir, file, outdir, source)
  in_frontmatter = false
  frontmatter_processed = false
  has_source = false
  og_title = "openHAB"
  og_description = "a vendor and technology agnostic open source automation software for your home"

  unless File.exist?("#{indir}/#{file}")
    verbose "process_markdown: IGNORING (NON-EXISTING): #{indir}/#{file}"
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

      og_title = line.gsub("title: ", "").gsub("\n", "") if in_frontmatter && line =~ /^title:/
      if in_frontmatter && line =~ /^description:/
        og_description = line.gsub("description: ", "").gsub("\n", "").gsub("[", "").gsub("]", "").gsub(
          %r{\(http[:/\-0-9A-Za-z.]+\)}, ""
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
              addon = outdir_parts[2]
              source = ""
              if addon_type == "ui"
                puts "    (add-on type is ui)"
                source = "https://github.com/openhab/openhab-webui/blob/#{ADDONS_REPO_BRANCH}/bundles/org.openhab.ui.#{addon}/README.md"
              elsif addon == "zigbee"
                puts "    (add-on is zigbee)"
                source = "https://github.com/openhab/org.openhab.binding.zigbee/blob/#{ADDONS_REPO_BRANCH}/org.openhab.binding.zigbee/README.md"
              elsif addon == "zwave" && file !~ /things/
                puts "    (add-on is zwave)"
                source = "https://github.com/openhab/org.openhab.binding.zwave/blob/#{ADDONS_REPO_BRANCH}/README.md"
              elsif file !~ /things/
                source = "https://github.com/openhab/openhab-addons/blob/#{ADDONS_REPO_BRANCH}/bundles/org.openhab.#{addon_type}.#{addon}/README.md"
              end

              out.puts "source: #{source}" if source != ""

              # For sub-bundles, set the "prev" link to the main add-on
              out.puts "prev: ../#{addon.split(".")[0]}/" if addon.include?(".")

              # Prev link to the main binding doc for zwave/doc/things.md
              out.puts "prev: ../" if addon == "zwave" && outdir.end_with?("/doc") && file == "things.md"
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
      line = line.gsub(%r{https?://docs\.openhab\.org/addons/uis/habpanel/readme\.html},
                       "/docs/configuration/habpanel.html")
      line = line.gsub(%r{https?://docs\.openhab\.org/addons/uis/basic/readme\.html}, "/addons/ui/basic/")
      line = line.gsub(%r{https?://docs\.openhab\.org/addons/(.*)/(.*)/readme\.html}, '/addons/\1/\2/')
      line = line.gsub(%r{https?://docs\.openhab\.org/}, "/docs/")
      line = line.gsub(%r{https?://(?:www\.)?openhab\.org/docs/}, "/docs/")
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

#
# Moves files recursively from src to dst, passing each .md file through process_markdown.
#
# @param src [String, Pathname] the source directory to copy from
# @param dst [String, Pathname] the destination directory to copy to
# @param source_root [String, nil] the GitHub URL prefix used for edit links
# @yield [Pathname] an optional block to filter which files to process (receives the Pathname of each file)
# @yieldreturn [Boolean] whether to process the file (true) or skip it (false)
#
def process_directory(src:, dst:, source_root: nil, &block)
  source = Pathname(src)
  destination = Pathname(dst)
  pattern = source / "**" / "*"

  Pathname.glob(pattern).sort.each do |path|
    next if block && !block.call(path)

    relative = path.relative_path_from(source)
    output_path = destination.join(relative)

    if path.directory?
      output_path.mkpath
      next
    end
    output_dir = output_path.dirname

    source_path = if source_root
                    File.join(source_root, relative.to_s).tr("\\", "/") # Ensure URL uses forward slashes
                  end

    if path.extname.downcase == ".md"
      verbose "   ➡️ #{relative}"
      # Pathname objects can usually be passed to methods expecting strings
      process_markdown(path.dirname.to_s, path.basename.to_s, output_dir.to_s, source_path)
    else
      # Use join for the final destination file path
      FileUtils.cp(path, output_dir.join(path.basename))
    end
  end
end

# Get a list of sub-addons to transform them into links
def get_subs_links(parent_addon_id, search_dir)
  sub_addons = []
  Dir.glob("#{search_dir}/#{parent_addon_id}.*/**/readme.md") do |sub_readme|
    sub_addon_id = File.dirname(sub_readme).split("/").last
    verbose "    ➡️ expanding list of sub-addons: #{sub_addon_id}"
    File.open(sub_readme).each do |line|
      if line =~ /^# /
        sub_addons.push([sub_addon_id, line.gsub("# ", "").strip])
        break
      end
    end
  end

  sub_addons
end
