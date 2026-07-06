# frozen_string_literal: true

require "rexml/document"
require "fileutils"

# AddonProcessor processes external add-on repositories (openhab-addons and openhab-webui).
#
# It does the following:
# 1. Calls collect_features to parse distro and downloaded snapshot features XML
#    to build a map of installation metadata (install: auto).
# 2. Loops through various add-on bundle directories (bindings, persistences, voices, uis, etc.).
# 3. Strips OSGi package prefixes from bundle names (e.g. org.openhab.binding.) to get add-on IDs.
# 4. Cleans target directories and recursively copies config, documentation, and image assets.
# 5. Formats each add-on README: extracts the title, logo, and description; merges Karaf
#    installation status; generates VuePress YAML frontmatter; and writes the resulting
#    readme.md file.
#
# It is called by fetch-external-docs.rb to process and place add-on documentations.
module AddonProcessor
  def self.collect_feature_xml(features, xml_path, attrs)
    return unless File.exist?(xml_path)

    begin
      xml_content = File.read(xml_path)
      doc = REXML::Document.new(xml_content)
      doc.elements.each("features/feature") do |feature|
        name = feature.attributes["name"]
        features[name] = attrs
      end
    rescue => e
      warn "  ⚠️ Failed to parse feature XML at #{xml_path}: #{e.message}"
      raise e
    end
  end

  def self.collect_features(distro_features_path, snapshot_features_path)
    features = {}
    collect_feature_xml(features, distro_features_path, { "install" => "auto" })
    collect_feature_xml(features, snapshot_features_path, { "install" => "auto" })
    features
  end

  def self.process_addon_type(features, dest_addons_dir, images_dir, src_bundles_dir, type, dest_folder_name, suffix, lblremoves, pkgremoves)
    puts "  Processing add-on type: #{type} -> #{dest_folder_name}..."

    unless Dir.exist?(src_bundles_dir)
      warn "  ⚠️ Source directory not found: #{src_bundles_dir}"
      return
    end

    Dir.foreach(src_bundles_dir) do |addon_name|
      next if addon_name == "." || addon_name == ".."

      # Match the type in package name structure (org.openhab.<type>...)
      parts = addon_name.split(".")
      next unless parts[0] == "org" && parts[1] == "openhab"

      if type == "iconset"
        next unless parts[2] == "ui" && parts[3] == "iconset"
      elsif type == "ui"
        next unless parts[2] == "ui" && parts[3] != "iconset"
        next if addon_name == "org.openhab.ui"
      else
        next unless parts[2] == type
      end

      addon_path = File.join(src_bundles_dir, addon_name)
      next unless Dir.exist?(addon_path)

      if addon_name.end_with?(".test")
        puts "  Skipping test bundle: #{addon_name}"
        next
      end

      # Determine final ID by stripping pkgremoves
      id = addon_name
      pkgremoves.each { |pkg| id = id.gsub(pkg, "") }

      puts "    Processing addon: #{dest_folder_name}/#{id}..."

      # Construct target directory
      target_dir = File.join(dest_addons_dir, dest_folder_name, id)
      FileUtils.rm_rf(target_dir) # start fresh
      FileUtils.mkdir_p(target_dir)

      # Copy doc/, cfg/, images/, and icons/ if they exist
      ["doc", "cfg", "images", "icons"].each do |sub_dir|
        source_sub = File.join(addon_path, sub_dir)
        if id == "zwave" && sub_dir == "doc"
          zwave_things_md = File.join(source_sub, "thing.md")
          if File.exist?(zwave_things_md)
            target_doc_dir = File.join(target_dir, "doc")
            FileUtils.mkdir_p(target_doc_dir)
            FileUtils.cp(zwave_things_md, File.join(target_doc_dir, "thing.md"))
          end
          next
        end
        if Dir.exist?(source_sub)
          FileUtils.cp_r(source_sub, target_dir)
        end
      end

      # Look for README.md (case-insensitive)
      readme_src = Dir.glob(File.join(addon_path, "[Rr][Ee][Aa][Dd][Mm][Ee].[Mm][Dd]")).first
      if readme_src.nil? || !File.exist?(readme_src)
        warn "    ⚠️ No readme.md/README.md found in #{addon_name}"
        next
      end

      # Read and parse readme
      readme_text = File.read(readme_src)

      # Determine label from first level 1 header
      label = nil
      readme_text.each_line do |line|
        if line.start_with?("#")
          label = line.gsub("#", "").strip
          lblremoves.each { |remove| label = label.gsub(Regexp.new(remove), "") }
          label = label.strip
          break
        end
      end

      if label.nil? || label.empty?
        warn "    ⚠️ No level 1 header found in README of #{addon_name}."
        label = id
      end

      # Logo check in images/addons/ of the main project repo
      logo_svg = File.exist?(File.join(images_dir, "addons", "#{id}.svg"))
      logo_png = File.exist?(File.join(images_dir, "addons", "#{id}.png"))

      # Find description (first non-empty text line after first level 1 header)
      description = ""
      first_headline = false
      readme_text.each_line do |line|
        if line.start_with?("#")
          first_headline = true
        elsif first_headline && !line.strip.empty?
          description = line.strip.gsub('"', "'")
          break
        end
      end

      # Build frontmatter hash
      front = {
        "id" => id,
        "label" => label,
        "title" => "#{label}#{suffix}",
        "type" => type,
        "description" => "\"#{description}\""
      }

      if logo_svg
        front["logo"] = "images/addons/#{id}.svg"
      elsif logo_png
        front["logo"] = "images/addons/#{id}.png"
      end

      # Find install type from features list
      feature_entry = features.find do |key, val|
        key.start_with?("openhab-#{type}-#{id}") ||
          (type == "io" && key.start_with?("openhab-misc-#{id}")) ||
          (type == "transform" && key.start_with?("openhab-transformation-#{id}"))
      end

      install_attrs = feature_entry ? feature_entry[1] : { "install" => "manual" }
      front.merge!(install_attrs)

      # Build frontmatter block
      frontmatter_str = "---\n" + front.map { |k, v| "#{k}: #{v}" }.join("\n") + "\n---\n\n"

      # Re-format readme content: remove first heading and replace with custom template
      first_h1_match = readme_text.match(/^# .*/)
      heading = first_h1_match ? first_h1_match[0] : "# #{label}"
      text_without_heading = first_h1_match ? readme_text.sub(heading, "") : readme_text

      addon_logo_tag = (logo_svg || logo_png) ? "\n\n<AddonLogo />" : ""

      final_content = <<~MARKDOWN
        #{frontmatter_str}<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

        #{heading}#{addon_logo_tag}#{text_without_heading}
      MARKDOWN

      # Write to target as lowercase readme.md
      File.write(File.join(target_dir, "readme.md"), final_content)

      puts "    ✔ Processed addon: #{dest_folder_name}/#{id}"
    end

    puts "  ✔ Processed add-on type: #{type} -> #{dest_folder_name}"
  end

  def self.process_all(distro_features_path, snapshot_features_path, addons_bundles_dir, webui_bundles_dir, dest_addons_dir, images_dir)
    features = collect_features(distro_features_path, snapshot_features_path)

    # Arguments: features, dest_addons_dir, images_dir, src_bundles_dir, type, dest_folder_name, suffix, lblremoves, pkgremoves
    process_addon_type(features, dest_addons_dir, images_dir, addons_bundles_dir, "automation", "automation", " - Automation", [], ["org.openhab.automation."])
    process_addon_type(features, dest_addons_dir, images_dir, addons_bundles_dir, "binding", "bindings", " - Bindings", [" Binding"], ["org.openhab.binding."])
    process_addon_type(features, dest_addons_dir, images_dir, addons_bundles_dir, "io", "integrations", " - System Integrations", [" Service"], ["org.openhab.io."])
    process_addon_type(features, dest_addons_dir, images_dir, addons_bundles_dir, "persistence", "persistence", " - Persistence Services", [/\\s*Persistence\\s*$/], ["org.openhab.persistence."])
    process_addon_type(features, dest_addons_dir, images_dir, addons_bundles_dir, "transform", "transformations", " - Transformation Services", [" Transformation Service"], ["org.openhab.transform."])
    process_addon_type(features, dest_addons_dir, images_dir, addons_bundles_dir, "voice", "voice", " - Voices", [], ["org.openhab.voice."])

    # UI bundles from webui repo
    # Note: Maven POM has excludes for ui-docs: iconset, org.openhab.ui.iconset.classic, cordova, src
    # Here we only process bundles under openhab-webui/bundles containing 'org.openhab.ui.' but excluding iconset.
    process_addon_type(features, dest_addons_dir, images_dir, webui_bundles_dir, "ui", "ui", " - UIs", [], ["org.openhab.ui."])
  end
end
