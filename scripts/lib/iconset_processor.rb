# frozen_string_literal: true

require "csv"
require "fileutils"
require "pathname"

# IconsetProcessor generates VuePress-compatible iconset documentation.
module IconsetProcessor
  # Re-generate an iconset's documentation
  #
  # - Load the list of icons from the original iconset
  # - Load the categories from the CSV files
  # - Generate a markdown file with the list of icons and their categories
  # - Copy the icons to the `${dst}/classic/icons` folder.
  #
  # @param src [Pathname, String] the path to the original iconsets (e.g. ".vuepress/openhab-docs/_addons_iconsets")
  # @param dst [Pathname, String] the path to the output directory (e.g. "docs/configuration/iconsets")
  # @param data [Pathname, String] the path to the CSV data files (e.g. ".vuepress/openhab-docs/_data")
  #
  def self.process_iconset(src:, dst:, data:)
    puts "  Processing Classic iconset..."

    iconset = "classic"
    src = Pathname(src)
    data = Pathname(data)
    dst = Pathname(dst)

    icons_path = src / iconset / "src/main/resources/icons"
    unless Dir.exist?(icons_path)
      alt_path = src / "org.openhab.ui.iconset.#{iconset}" / "src/main/resources/icons"
      icons_path = alt_path if Dir.exist?(alt_path)
    end

    unless Dir.exist?(icons_path)
      warn "    ⚠️ Classic iconset source directory does not exist: #{icons_path}"
      return
    end

    icons_list = icons_path.glob("*.svg").map { |path| path.basename.to_s }

    categories_channels = {}
    CSV.foreach(data / "categories.csv", headers: true) do |row|
      # Using a standard loop over compact Ruby shorthands for better clarity
      type = row["type"]
      name = row["name"]

      categories_channels[type] ||= []
      categories_channels[type] << name
    end

    categories_places = CSV.foreach(data / "categories_places.csv", headers: true).map { |row| row["name"] }

    thing_csv = data / "categories_thing.csv"
    thing_csv = data / "categories_things.csv" unless File.exist?(thing_csv)
    categories_thing = CSV.foreach(thing_csv, headers: true).map { |row| row["name"] }

    iconset_readme = dst / iconset / "readme.md"
    iconset_readme.dirname.mkpath
    iconset_readme.open("w+") do |f|
      f.puts "---"
      f.puts "title: Icons"
      f.puts "categories:"

      f.puts "  channels:"
      categories_channels.each do |type, channels|
        f.puts "    #{type}:"
        channels.each { |channel| f.puts "      - #{channel.downcase}" }
      end

      f.puts "  places:"
      categories_places.each { |place| f.puts "    - #{place.downcase}" }

      f.puts "  things:"
      categories_thing.each { |thing| f.puts "    - #{thing.downcase}" }

      f.puts "---"
      f.puts # Blank line
      f.puts "# Icons"
      f.puts
      f.puts "These are the classic icons from Eclipse SmartHome."
      f.puts
      f.puts "These icons can be used when describing Items. You can also add your own. See the [instructions](/docs/configuration/items.html#icons) to learn more."
      f.puts
      f.puts "<IconsetDisplay icons=\"#{icons_list.join(",")}\"/>"
    end

    puts "    ✔ File written in #{iconset_readme}"

    # Copy to destination iconset folder
    dest_dir = dst / iconset
    FileUtils.cp_r(icons_path, dest_dir)

    puts "    ✔ Icons copied to #{dest_dir / "icons"}"

    puts "  ✔ Processed Classic iconset"
  end
end

