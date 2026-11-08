# frozen_string_literal: true

require "rexml/document"
require "json"
require "fileutils"

# ThingTypesProcessor crawls the XML files in openhab-addons bundles to collect
# all bridge and thing type definitions.
#
# It looks for files matching `**/OH-INF/thing/**/*.xml`, parses their
# `bridge-type` and `thing-type` elements via REXML, and aggregates them.
# The resulting collection is exported as a JSON file, which is consumed by
# the website to provide the add-on / thing search functionality.
#
# It is called by fetch-external-docs.rb to write thing-types.json to the dest_path.
module ThingTypesProcessor
  def self.collect_thing_types(resource_folder, dest_path)
    puts "  Collecting thing types..."

    thing_types = []
    xml_pattern = File.join(resource_folder, "openhab-addons/bundles/**/OH-INF/thing/**/*.xml")
    xml_files = Dir.glob(xml_pattern)

    xml_files.each do |file_path|
      next unless File.file?(file_path)

      begin
        xml_content = File.read(file_path)
        doc = REXML::Document.new(xml_content)
        root = doc.root
        next if root.nil?

        binding_id = root.attributes["bindingId"]
        next if binding_id.nil? || binding_id.empty?

        # Find bridge-types
        root.elements.each("bridge-type") do |bridge|
          bridge_id = bridge.attributes["id"]
          label_node = bridge.elements["label"]
          label = label_node ? label_node.text : ""

          thing_types << {
            "bindingId" => binding_id,
            "id" => "#{binding_id}:#{bridge_id}",
            "label" => label
          }
        end

        # Find thing-types
        root.elements.each("thing-type") do |thing|
          thing_id = thing.attributes["id"]
          label_node = thing.elements["label"]
          label = label_node ? label_node.text : ""

          thing_types << {
            "bindingId" => binding_id,
            "id" => "#{binding_id}:#{thing_id}",
            "label" => label
          }
        end
      rescue => e
        warn "  ⚠️ Failed to parse thing XML at #{file_path}: #{e.message}"
        raise e
      end
    end

    # Write output to dest_path
    FileUtils.mkdir_p(File.dirname(dest_path))
    File.write(dest_path, JSON.pretty_generate(thing_types))
    puts "  ✔ #{thing_types.size} thing types written to #{dest_path}"
  end
end
