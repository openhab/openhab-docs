# frozen_string_literal: true

require "fileutils"

require_relative "lib/process_utils"
require_relative "lib/add_placeholders"

SRC_ROOT = "src"
DST_ROOT = "docs"

clean = !ARGV.include?("--no-clean")
placeholders = !ARGV.include?("--no-placeholders")

if clean
  puts "🧹 Cleaning destination directory: #{DST_ROOT}"
  FileUtils.rm_rf(DST_ROOT)
end

puts "➡️ Deploying the main documentation pages"
process_directory src: SRC_ROOT, dst: DST_ROOT, source_root: "https://github.com/openhab/openhab-docs/blob/main/src"

if placeholders
  add_placeholder_pages
end
