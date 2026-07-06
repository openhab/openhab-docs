# frozen_string_literal: true

require "fileutils"

# Ensure we can load files from scripts/lib
$LOAD_PATH.unshift(File.join(File.dirname(__FILE__), "lib"))

require "repo_manager"
require "jfrog_fetcher"
require "addon_processor"
require "thing_types_processor"
require "process_utils"

BASE_DIR = File.expand_path("..", File.dirname(__FILE__))
RESOURCE_FOLDER = File.join(BASE_DIR, ".external-resources")

def copy_file_safe(src, dst, source_url = nil)
  if File.exist?(src)
    FileUtils.mkdir_p(File.dirname(dst))
    if File.extname(src).downcase == ".md" && source_url
      process_markdown(File.dirname(src), File.basename(src), File.dirname(dst), source_url, File.basename(dst))
      puts "    ✔ Processed #{File.basename(src)} -> #{dst}"
    else
      FileUtils.cp(src, dst)
      puts "    ✔ Copied #{File.basename(src)} -> #{dst}"
    end
  else
    warn "    ⚠️ Source file does not exist: #{src}"
  end
end

def copy_dir_safe(src, dst)
  if Dir.exist?(src)
    FileUtils.mkdir_p(dst)
    FileUtils.cp_r(File.join(src, "."), dst)
    puts "    ✔ Copied directory #{src} -> #{dst}"
  else
    warn "    ⚠️ Source directory does not exist: #{src}"
  end
end

def copy_glob_safe(pattern, dst_dir, exclude_fn = nil, source_url_fn = nil)
  Dir.glob(pattern).each do |file|
    next if File.directory?(file)
    next if exclude_fn && exclude_fn.call(file)

    relative_path = File.basename(file)
    target_file = File.join(dst_dir, relative_path)

    FileUtils.mkdir_p(File.dirname(target_file))
    if File.extname(file).downcase == ".md" && source_url_fn
      source_url = source_url_fn.call(relative_path)
      process_markdown(File.dirname(file), File.basename(file), File.dirname(target_file), source_url, File.basename(target_file))
      puts "    ✔ Processed #{File.basename(file)} -> #{target_file}"
    else
      FileUtils.cp(file, target_file)
      puts "    ✔ Copied #{File.basename(file)} -> #{target_file}"
    end
  end
  puts "    ✔ Copied glob #{pattern} -> #{dst_dir}"
end

def update_external_repositories
  FileUtils.mkdir_p(RESOURCE_FOLDER)
  readme_path = File.join(RESOURCE_FOLDER, "README.md")
  unless File.exist?(readme_path)
    File.write(readme_path, "# About\n\nUsed to temporarily store repository clones from related openHAB projects for 'fetch-external-docs.rb'.\n")
  end

  repos = [
    ["openhab-distro", "openhab/openhab-distro.git", "main"],
    ["openhab-addons", "openhab/openhab-addons.git", "main"],
    ["openhabian", "openhab/openhabian.git", "main"],
    ["openhab-alexa", "openhab/openhab-alexa.git", "main"],
    ["openhab-android", "openhab/openhab-android.git", "main"],
    ["openhab-google-assistant", "openhab/openhab-google-assistant.git", "main"],
    ["openhab-webui", "openhab/openhab-webui.git", "main"],
    ["openhab-addons/bundles/org.openhab.binding.zigbee", "openhab/org.openhab.binding.zigbee.git", "main"],
    ["openhab-addons/bundles/org.openhab.binding.zwave", "openhab/org.openhab.binding.zwave.git", "main"],
    ["openhab-garmin", "openhab/openhab-garmin.git", "main"],
    ["openhab-sailfishos", "openhab/openhab-sailfishos.git", "main"]
  ]

  repos.each do |name, repo_path, branch|
    RepoManager.pull_or_clone_repo(File.join(RESOURCE_FOLDER, name), repo_path, branch)
  end

  # Copy zigbee readme to where the addon processor expects it
  zigbee_readme = File.join(RESOURCE_FOLDER, "openhab-addons/bundles/org.openhab.binding.zigbee/org.openhab.binding.zigbee/README.md")
  zigbee_target = File.join(RESOURCE_FOLDER, "openhab-addons/bundles/org.openhab.binding.zigbee/README.md")
  if File.exist?(zigbee_readme)
    FileUtils.cp(zigbee_readme, zigbee_target)
    puts "📋 ✔ Copied Zigbee README to expected location."
  end
end

def main
  puts "Starting fetch external content pipeline..."

  # 1. Update/clone external git repos
  update_external_repositories

  # 2. Fetch feature.xml from JFrog snapshot repository
  JfrogFetcher.fetch_features_xml(File.join(RESOURCE_FOLDER, "jfrog-files/feature.xml"))

  # 3. Generate thing-types JSON
  ThingTypesProcessor.collect_thing_types(RESOURCE_FOLDER, File.join(BASE_DIR, ".vuepress/thing-types.json"))

  # 4. Process add-on markdown files
  AddonProcessor.process_all(
    File.join(RESOURCE_FOLDER, "openhab-distro/features/addons/src/main/feature/feature.xml"),
    File.join(RESOURCE_FOLDER, "jfrog-files/feature.xml"),
    File.join(RESOURCE_FOLDER, "openhab-addons/bundles"),
    File.join(RESOURCE_FOLDER, "openhab-webui/bundles"),
    File.join(BASE_DIR, "addons"),
    File.join(BASE_DIR, "images")
  )

  # Preprocess all generated addon readme files
  puts "  Processing add-on readme files..."
  Dir.glob(File.join(BASE_DIR, "addons/**/*.md")).each do |file|
    next if File.basename(file) != "readme.md"

    dir = File.dirname(file)
    temp_readme = File.join(dir, "readme_raw.md")
    FileUtils.mv(file, temp_readme)
    process_markdown(dir, "readme_raw.md", dir, nil, "readme.md")
    File.delete(temp_readme)
  end
  puts "  ✔ Processed add-on readme files"

  # 5. Inline Ecosystem and Apps copying/renaming
  puts "  Copying ecosystem & apps documentation..."

  # HABPanel Config Docs
  copy_file_safe(
    File.join(RESOURCE_FOLDER, "openhab-webui/bundles/org.openhab.ui.habpanel/doc/habpanel.md"),
    File.join(BASE_DIR, "docs/configuration/habpanel.md"),
    "https://github.com/openhab/openhab-webui/blob/main/bundles/org.openhab.ui.habpanel/doc/habpanel.md"
  )
  copy_dir_safe(
    File.join(RESOURCE_FOLDER, "openhab-webui/bundles/org.openhab.ui.habpanel/doc/images"),
    File.join(BASE_DIR, "docs/configuration/images")
  )

  # openHABian Install Docs (excluding NEWSLOG.md)
  copy_glob_safe(
    File.join(RESOURCE_FOLDER, "openhabian/docs/*.md"),
    File.join(BASE_DIR, "docs/installation"),
    lambda { |f| File.basename(f) == "NEWSLOG.md" },
    lambda { |fn| "https://github.com/openhab/openhabian/blob/main/docs/#{fn}" }
  )
  copy_dir_safe(
    File.join(RESOURCE_FOLDER, "openhabian/docs/images"),
    File.join(BASE_DIR, "docs/installation/images")
  )

  # Android Docs
  copy_file_safe(
    File.join(RESOURCE_FOLDER, "openhab-android/docs/USAGE.md"),
    File.join(BASE_DIR, "docs/apps/android.md"),
    "https://github.com/openhab/openhab-android/blob/main/docs/USAGE.md"
  )
  copy_dir_safe(
    File.join(RESOURCE_FOLDER, "openhab-android/docs/images"),
    File.join(BASE_DIR, "docs/apps/images")
  )

  # Garmin Docs
  copy_file_safe(
    File.join(RESOURCE_FOLDER, "openhab-garmin/docs/USAGE.md"),
    File.join(BASE_DIR, "docs/apps/garmin/readme.md"),
    "https://github.com/openhab/openhab-garmin/blob/main/docs/USAGE.md"
  )
  copy_dir_safe(
    File.join(RESOURCE_FOLDER, "openhab-garmin/docs/images"),
    File.join(BASE_DIR, "docs/apps/garmin/images")
  )

  # SailfishOS Docs
  copy_file_safe(
    File.join(RESOURCE_FOLDER, "openhab-sailfishos/docs/USAGE.md"),
    File.join(BASE_DIR, "docs/apps/sailfishos/readme.md"),
    "https://github.com/openhab/openhab-sailfishos/blob/main/docs/USAGE.md"
  )
  copy_dir_safe(
    File.join(RESOURCE_FOLDER, "openhab-sailfishos/docs/images"),
    File.join(BASE_DIR, "docs/apps/sailfishos/images")
  )

  # Alexa Docs
  copy_file_safe(
    File.join(RESOURCE_FOLDER, "openhab-alexa/docs/USAGE.md"),
    File.join(BASE_DIR, "docs/ecosystem/alexa/readme.md"),
    "https://github.com/openhab/openhab-alexa/blob/main/docs/USAGE.md"
  )
  copy_dir_safe(
    File.join(RESOURCE_FOLDER, "openhab-alexa/docs/images"),
    File.join(BASE_DIR, "docs/ecosystem/alexa/images")
  )

  # Google Assistant Docs
  copy_file_safe(
    File.join(RESOURCE_FOLDER, "openhab-google-assistant/docs/USAGE.md"),
    File.join(BASE_DIR, "docs/ecosystem/google-assistant/readme.md"),
    "https://github.com/openhab/openhab-google-assistant/blob/main/docs/USAGE.md"
  )
  copy_dir_safe(
    File.join(RESOURCE_FOLDER, "openhab-google-assistant/docs/images"),
    File.join(BASE_DIR, "docs/ecosystem/google-assistant/images")
  )

  # Classic Iconset
  copy_dir_safe(
    File.join(RESOURCE_FOLDER, "openhab-webui/bundles/org.openhab.ui.iconset.classic/src/main/resources/icons"),
    File.join(BASE_DIR, "addons/iconsets/classic/icons")
  )

  puts "  ✔ Copied ecosystem & apps documentation"

  puts "✔ External content pipeline completed successfully!"
end

if __FILE__ == $0
  main
end
