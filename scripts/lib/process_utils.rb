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

  input_path = Pathname.new(indir) / file
  output_path = Pathname.new(outdir) / file
  input_path_str = input_path.to_s

  unless input_path.exist?
    verbose "process_markdown: IGNORING (NON-EXISTING): #{input_path}"
    return
  end

  output_path.dirname.mkpath
  output_path.open("w") do |out|
    input_path.each_line.with_index(1) do |line, line_number|
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
              elsif addon == "zwave" && input_path_str !~ /things/
                puts "    (add-on is zwave)"
                source = "https://github.com/openhab/org.openhab.binding.zwave/blob/#{ADDONS_REPO_BRANCH}/README.md"
              elsif input_path_str !~ /things/
                source = "https://github.com/openhab/openhab-addons/blob/#{ADDONS_REPO_BRANCH}/bundles/org.openhab.#{addon_type}.#{addon}/README.md"
              end

              out.puts "source: #{source}" if source != ""

              # For sub-bundles, set the "prev" link to the main add-on
              out.puts "prev: ../#{addon.split(".")[0]}/" if addon.include?(".")

              # Prev link to the main binding doc for zwave/doc/things.md
              out.puts "prev: ../" if addon == "zwave" && outdir.end_with?("/doc") && input_path.basename.to_s == "things.md"
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
      next if line =~ /include collapsible/ && input_path_str =~ /linux/

      line = "##### #{line}" if line =~ /^Apt Based Systems/ && input_path_str =~ /linux/
      line = "##### #{line}" if line =~ /^Yum or Dnf Based Systems/ && input_path_str =~ /linux/
      line = "##### #{line}" if line =~ /^Systems based on/ && input_path_str =~ /linux/

      # Expand <!--list-subs--> comments with a list of links
      # (https://github.com/eclipse/smarthome/issues/5571)
      if line =~ /<!--\s*list-subs\s*-->/
        parent_addon = input_path.dirname.basename.to_s
        sub_addons = get_subs_links(parent_addon, indir)
        out.puts
        sub_addons.each do |name, title|
          out.puts "- [#{title}](../#{name}/)"
        end
        out.puts
      end

      # Log replacements so we know which files need to be fixed in the source
      log_replace = lambda do |pattern, replacement|
        column = line.index(pattern)
        next if line.gsub!(pattern, replacement).nil?

        from = UI.colorize(pattern.inspect, :red)
        to = UI.colorize(replacement, :green)
        # Build a clickable link in supported terminals
        location = UI.colorize("#{input_path}:#{line_number}:#{column + 1}", :cyan)
        puts "    (replacing #{from} -> #{to} in #{location})"
      end

      # Replace links to generated docs in ZWave's things.md by links to the internal viewer
      line.gsub!(%r{]\((.*)/(.*)\)}, '](../thing.html?manufacturer=\1&file=\2)') if input_path.fnmatch?("*/zwave/doc/things.md")

      # Misc replaces (relative links, remove placeholder interpreted as custom tags)

      # Normal replacements, no logging needed
      line.gsub!("{{base}}/", "./docs/")
      line.gsub!("](doc/", "](./doc/")
      line.gsub!("(images/", "(./images/")
      line.gsub!("src=\"images/", "src=\"./images/")
      line.gsub!("]:images/", "]:./images/")
      line.gsub!("<BR>", "<BR/>")
      line.gsub!("(diagrams/", "(./diagrams/")
      line.gsub!("./docs/", "/docs/")
      line.gsub!(%r{https?://(?:www\.)?openhab\.org/docs/}, "/docs/")

      # Log these replacements as they indicate issues in the source that should be fixed
      log_replace.call(%r{https?://docs\.openhab\.org/addons/uis/habpanel/readme\.html}, "/docs/configuration/habpanel.html")
      log_replace.call(%r{https?://docs\.openhab\.org/addons/uis/basic/readme\.html}, "/addons/ui/basic/")
      log_replace.call(%r{https?://docs\.openhab\.org/addons/(.*)/(.*)/readme\.html}, '/addons/\1/\2/')
      log_replace.call(%r{https?://docs\.openhab\.org/}, "/docs/")
      log_replace.call("/addons/io/", "/addons/integrations/")
      log_replace.call("./docs/tutorials/beginner/", "/docs/tutorial/")
      log_replace.call("<activeState>", '\<activeState\>')
      log_replace.call("<passiveState>", '\<passiveState\>')
      log_replace.call("(?<!`)<dimension>(?!`)", '\<dimension\>')
      # line = line.gsub("<TransformProgram>", '\<TransformProgram\>')  # fixed in source
      # line = line.gsub("<FlahshbriefingDeviceID>", "`<FlahshbriefingDeviceID>`") if file =~ /amazonechocontrol/ # already fixed in source - also misspelling fixed
      # line = line.gsub("<SerialNumber>", "&lt;SerialNumber&gt;") if file =~ /airvisualnode/ # already fixed in source
      # line = line.gsub("<version>", "&lt;version&gt;") if file =~ /caldav/ # binding no longer exists
      # replace.call("by <step>", "by `<step>`") if file =~ /ipx8001/ # binding no longer exists
      log_replace.call("'<package name>:<widget ID>'", "`<package name>:<widget ID>`") if input_path_str =~ /lametrictime/
      log_replace.call("<mac address of bridge>", "`<mac address of bridge>`") if input_path_str =~ /milight/
      log_replace.call("<mac>", "`<mac>`") if input_path_str =~ /milight/
      log_replace.call("<type of bulb>", "`<type of bulb>`") if input_path_str =~ /milight/
      log_replace.call("<IP-Address of bridge>", "`<IP-Address of bridge>`") if input_path_str =~ /milight/
      log_replace.call("<bulb>", "`<bulb>`") if input_path_str =~ /milight/
      log_replace.call("<zone>", "`<zone>`") if input_path_str =~ /milight/
      log_replace.call("[](", "[here](") if input_path_str =~ /powermax1/
      log_replace.call("<n>", "&lt;n&gt;") if input_path_str =~ /rfxcom/
      log_replace.call(" <value> ", " &lt;value&gt; ") if input_path_str =~ /zibase/
      log_replace.call("<username>", "&lt;username&gt;") if input_path_str =~ /zoneminder/
      log_replace.call("<password>", "&lt;password&gt;") if input_path_str =~ /zoneminder/
      log_replace.call("<yourzmip>", "&lt;yourzmip&gt;") if input_path_str =~ /zoneminder/
      log_replace.call(" <chatId> ", " &lt;chatId&gt; ") if input_path_str =~ /telegram/
      log_replace.call(" <token> ", " &lt;token&gt; ") if input_path_str =~ /telegram/
      log_replace.call("<regular expression>", '\<regular expression\>')
      log_replace.call('src="images/', 'src="./images/') if output_path.to_s =~ /apps/
      log_replace.call("](/images/", "](./images/") if output_path.to_s =~ /google-assistant/

      log_replace.call(/\{:(style|target).*\}/, "") # Jekyll inline attributes syntax not supported

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

#
# Simple utility to colorize terminal output for better visibility
#
module UI
  COLORS = {
    red: 31, green: 32, yellow: 33, blue: 34,
    magenta: 35, cyan: 36, white: 37
  }

  def self.colorize(text, color_name)
    color_code = COLORS.fetch(color_name, 37) # Default to white
    "\e[#{color_code}m#{text}\e[0m"
  end
end
