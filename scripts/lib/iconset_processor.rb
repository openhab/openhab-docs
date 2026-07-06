# frozen_string_literal: true

require "csv"
require "fileutils"

# IconsetProcessor generates VuePress-compatible iconset documentation.
#
# It scans the source SVGs, parses categories CSVs, and generates
# configuration page structure for classic icons.
module IconsetProcessor
  def self.generate_classic_doc(resource_folder, base_dir)
    puts "  Generating Classic Iconset documentation..."

    icons_src_dir = File.join(resource_folder, "openhab-webui/bundles/org.openhab.ui.iconset.classic/src/main/resources/icons")
    data_dir = File.join(base_dir, "classic_iconset_data")
    out_dir = File.join(base_dir, "docs/configuration/iconsets/classic")

    unless Dir.exist?(icons_src_dir)
      warn "    ⚠️ Classic iconset source directory does not exist: #{icons_src_dir}"
      return
    end

    icons_list = []
    Dir.glob(File.join(icons_src_dir, "*.svg")) do |path|
      icons_list.push(File.basename(path))
    end

    categories_channels = {}
    categories_places = []
    categories_thing = []

    categories_csv = File.join(data_dir, "categories.csv")
    if File.exist?(categories_csv)
      CSV.foreach(categories_csv, headers: true) do |cat|
        categories_channels[cat[0]] = [] unless categories_channels.include?(cat[0])
        categories_channels[cat[0]].push(cat[1])
      end
    end

    categories_places_csv = File.join(data_dir, "categories_places.csv")
    if File.exist?(categories_places_csv)
      CSV.foreach(categories_places_csv, headers: true) do |cat|
        categories_places.push(cat[0])
      end
    end

    categories_things_csv = File.join(data_dir, "categories_things.csv")
    categories_thing_csv = File.join(data_dir, "categories_thing.csv")
    thing_csv_path = File.exist?(categories_things_csv) ? categories_things_csv : categories_thing_csv

    if File.exist?(thing_csv_path)
      CSV.foreach(thing_csv_path, headers: true) do |cat|
        categories_thing.push(cat[0])
      end
    end

    FileUtils.mkdir_p(out_dir)
    File.open(File.join(out_dir, "readme.md"), "w+") do |f|
      f.puts "---"
      f.puts "title: Icons"
      f.puts "categories:"
      f.puts "  channels:"
      categories_channels.each do |k, c|
        f.puts "    #{k}:"
        c.each do |i|
          f.puts "    - #{i.downcase}"
        end
      end

      f.puts "  places:"
      categories_places.each do |i|
        f.puts "  - #{i.downcase}"
      end
      f.puts "  things:"
      categories_thing.each do |i|
        f.puts "  - #{i.downcase}"
      end

      f.puts "---"
      f.puts
      f.puts "# Icons"
      f.puts
      f.puts "These are the classic icons from Eclipse SmartHome."
      f.puts
      f.puts "These icons can be used when describing Items. You can also add your own. See the [instructions](/docs/configuration/items.html#icons) to learn more."
      f.puts
      f.puts "<IconsetDisplay icons=\"#{icons_list.join(",")}\"/>"
    end

    puts "    ✔ File written in #{out_dir}/readme.md"

    # Copy to docs/configuration/iconsets/classic/icons
    docs_icons_dir = File.join(out_dir, "icons")
    FileUtils.mkdir_p(docs_icons_dir)
    FileUtils.cp_r(File.join(icons_src_dir, "."), docs_icons_dir)
    puts "    ✔ Icons copied to #{docs_icons_dir}"
  end
end
