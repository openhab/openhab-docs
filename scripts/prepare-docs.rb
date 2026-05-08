# frozen_string_literal: true

require "fileutils"
require "pathname"

require_relative "lib/process_utils"
require_relative "lib/add_placeholders"

SRC_ROOT = "src"
DST_ROOT = "docs"

FileUtils.rm_rf(DST_ROOT)

puts "➡️ Deploying the main documentation pages"
process_directory src: SRC_ROOT, dst: DST_ROOT, source_root: "https://github.com/openhab/openhab-docs/blob/main/src"

add_placeholder_pages
