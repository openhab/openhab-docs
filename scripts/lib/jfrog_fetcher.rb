# frozen_string_literal: true

require "net/http"
require "uri"
require "fileutils"

# JfrogFetcher downloads the latest snapshot features XML file from openHAB's
# JFrog Artifactory repository.
#
# It resolves the metadata sequentially:
# 1. Finds the latest SNAPSHOT version from the root maven-metadata.xml.
# 2. Resolves the latest timestamped filename from that version's maven-metadata.xml.
# 3. Downloads the Karaf features XML file and saves it to the specified local path.
#
# It is used by fetch-external-docs.rb to retrieve feature lists for determining
# installation types (e.g., auto vs manual install) of the add-ons.
module JfrogFetcher
  def self.fetch_features_xml(dest_path)
    FileUtils.mkdir_p(File.dirname(dest_path))

    puts "  Fetching latest feature.xml from JFrog snapshot repository..."

    begin
      # 1. Download root metadata
      root_metadata_url = "https://openhab.jfrog.io/openhab/libs-snapshot/org/openhab/distro/openhab-addons/maven-metadata.xml"
      root_xml = Net::HTTP.get(URI(root_metadata_url))

      latest_version = root_xml.match(/<latest>(.*?)<\/latest>/)&.captures&.first
      raise "Could not parse latest version from metadata" unless latest_version

      puts "   Latest version: #{latest_version}"

      # 2. Download version metadata
      version_metadata_url = "https://openhab.jfrog.io/openhab/libs-snapshot/org/openhab/distro/openhab-addons/#{latest_version}/maven-metadata.xml"
      version_xml = Net::HTTP.get(URI(version_metadata_url))

      timestamp = version_xml.match(/<timestamp>(.*?)<\/timestamp>/)&.captures&.first
      build_number = version_xml.match(/<buildNumber>(.*?)<\/buildNumber>/)&.captures&.first

      raise "Could not parse timestamp or buildNumber" unless timestamp && build_number

      puts "   Build Timestamp: #{timestamp}"
      puts "   Build Number: #{build_number}"

      base_version = latest_version.sub("-SNAPSHOT", "")
      latest_file_name = "openhab-addons-#{base_version}-#{timestamp}-#{build_number}-features.xml"
      features_url = "https://openhab.jfrog.io/openhab/libs-snapshot/org/openhab/distro/openhab-addons/#{latest_version}/#{latest_file_name}"

      puts "   Downloading: #{latest_file_name}"

      # 3. Download the features XML file
      features_xml = Net::HTTP.get(URI(features_url))

      # 4. Save to target destination
      File.write(dest_path, features_xml)
      puts "  ✔ Saved features XML to #{dest_path}"
    rescue => e
      warn "  ⚠️ Error fetching features XML: #{e.message}"
      raise e
    end
  end
end
