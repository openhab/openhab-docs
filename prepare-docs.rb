# frozen_string_literal: true

require "fileutils"

require_relative "./.vuepress/process_file.rb"
require_relative "./.vuepress/add_placeholders.rb"

$verbose = false

def verbose(message)
  puts message if $verbose
end

if Dir.exist?("docs") then
    puts "➡️ Removing processed docs"
    FileUtils.rm_rf("docs")
end
if Dir.exist?("addons/integrations") then
    puts "➡️ Removing processed addons"
    FileUtils.rm_rf("docs")
end

puts "➡️ Migrating the introduction article"
process_file(".", "introduction.md", "docs", "https://github.com/openhab/openhab-docs/blob/main/introduction.md")
FileUtils.mv("docs/introduction.md", "docs/readme.md")

# puts "➡️ Migrating common images"
# FileUtils.mkdir_p("docs/images")

puts "➡️ Migrating logos"
FileUtils.cp_r("./images/addons", ".vuepress/public/logos")

puts "➡️ Migrating the Concepts section"
Dir.glob("./concepts/*.md") do |path|
  file = File.basename(path)
  verbose "   ➡️ #{file}"
  process_file("./concepts", file, "docs/concepts", "#{$docs_repo_root}/concepts/#{file}")
end
verbose "   ➡️ images and diagrams"
FileUtils.cp_r("./concepts/images", "docs/concepts")
FileUtils.cp_r("./concepts/diagrams", "docs/concepts")

puts "➡️ Migrating the Installation section"
Dir.glob("./installation/*.md") do |path|
  file = File.basename(path)
  next if file == "designer.md"

  verbose "   ➡️ #{file}"
  process_file("./installation", file, "docs/installation",
               "#{$docs_repo_root}/installation/#{file}")
end
verbose "   ➡️ images"
FileUtils.cp_r("./installation/images", "docs/installation")

puts "➡️ Migrating the Tutorial section"
Dir.glob("./tutorials/getting_started/*.md") do |path|
  file = File.basename(path)
  verbose "   ➡️ #{file}"
  process_file("./tutorials/getting_started", file, "docs/tutorial",
               "#{$docs_repo_root}/tutorials/getting_started/#{file}")
end
verbose "   ➡️ images"
FileUtils.cp_r("./tutorials/getting_started/images", "docs/tutorial")

puts "➡️ Migrating the Configuration section"
Dir.glob("./configuration/*.md") do |path|
  file = File.basename(path)
  next if file == "transform.md" # Useless, copy the one from addons

  verbose "   ➡️ #{file}"
  process_file("./configuration", file, "docs/configuration",
               "#{$docs_repo_root}/configuration/#{file}")
end
verbose "   ➡️ images"
FileUtils.cp_r("./configuration/images", "docs/configuration")

puts "➡️ Migrating the Main UI section"
Dir.glob("./mainui/*.md") do |path|
  file = File.basename(path)
  verbose "   ➡️ #{file}"
  process_file("./mainui", file, "docs/mainui", "#{$docs_repo_root}/mainui/#{file}")
end
%w[developer settings].each do |subsection|
  Dir.glob("./mainui/#{subsection}/*.md") do |path|
    file = File.basename(path)
    verbose "   ➡️ #{subsection}/#{file}"
    process_file("./mainui/#{subsection}", file, "docs/mainui/#{subsection}",
                  "#{$docs_repo_root}/mainui/#{subsection}/#{file}")
  end
end
verbose "   ➡️ images"
FileUtils.cp_r("./mainui/images", "docs/mainui")

puts "➡️ Migrating the Migration Tutorial section"
Dir.glob("./configuration/migration/*.md") do |path|
  file = File.basename(path)
  verbose "   ➡️ #{file}"
  process_file("./configuration/migration", file, "docs/configuration/migration",
               "#{$docs_repo_root}/configuration/migration/#{file}")
end
verbose "   ➡️ images"
# FileUtils.cp_r("./configuration/migration/images", "docs/configuration/migration/") // no images placed yet

puts "➡️ Migrating the Blockly Tutorial section"
Dir.glob("./configuration/blockly/*.md") do |path|
  file = File.basename(path)
  verbose "   ➡️ #{file}"
  process_file("./configuration/blockly", file, "docs/configuration/blockly",
               "#{$docs_repo_root}/configuration/blockly/#{file}")
end
verbose "   ➡️ images"
# FileUtils.cp_r("./configuration/blockly/images", "docs/configuration/blockly/") // no images placed yet

puts "➡️ Migrating the UI section"
Dir.glob("./ui/*.md") do |path|
  file = File.basename(path)
  verbose "   ➡️ #{file}"
  process_file("./ui", file, "docs/ui", "#{$docs_repo_root}/ui/#{file}")
end
verbose "   ➡️ images"
FileUtils.cp_r("./ui/images", "docs/ui")

verbose "   ➡️ habpanel"
FileUtils.mkdir_p("docs/ui/habpanel")
process_file("./_addons_uis/habpanel/doc", "habpanel.md", "docs/ui/habpanel", "")
verbose "      ➡️ images"
if Dir.exist?("./_addons_uis/habpanel/doc/images")
  FileUtils.cp_r("./_addons_uis/habpanel/doc/images",
                 "docs/ui/habpanel")
end

verbose "   ➡️ habot"
FileUtils.mkdir_p("docs/ui/habot")
process_file("./_addons_uis/habot", "readme.md", "docs/ui/habot", "")
verbose "      ➡️ images"

verbose "   ➡️ components"
FileUtils.mkdir_p("docs/ui/components")
Dir.glob("./_addons_uis/org.openhab.ui/doc/components/*.md") do |path|
  file = File.basename(path)
  verbose "    ➡️ #{file}"
  process_file("./_addons_uis/org.openhab.ui/doc/components", file, "docs/ui/components", "https://github.com/openhab/openhab-webui/blob/main/bundles/org.openhab.ui/doc/components/#{file}")
end
verbose "      ➡️ images"
if Dir.exist?("./_addons_uis/org.openhab.ui/doc/components/images")
  FileUtils.cp_r("./_addons_uis/org.openhab.ui/doc/components/images",
                 "docs/ui/components")
end

puts "➡️ Migrating the Apps section"
Dir.glob("./addons/uis/apps/*.md") do |path|
  file = File.basename(path)
  verbose "   ➡️ #{file}"
  process_file("./addons/uis/apps", file, "docs/apps",
               "#{$docs_repo_root}/addons/uis/apps/#{file}")
end
verbose "   ➡️ images"
FileUtils.cp_r("./addons/uis/apps/images", "docs/apps")

puts "➡️ Migrating the Administration section"
Dir.glob("./administration/*.md") do |path|
  file = File.basename(path)
  verbose "   ➡️ #{file}"
  process_file("./administration", file, "docs/administration",
               "#{$docs_repo_root}/administration/#{file}")
end
verbose "   ➡️ images"
FileUtils.cp_r("./administration/images", "docs/administration")

puts "➡️ Migrating the Developer section"
Dir.glob("./developers/*.md") do |path|
  file = File.basename(path)
  verbose "   ➡️ #{file}"
  process_file("./developers", file, "docs/developer", "#{$docs_repo_root}/developer/#{file}")
end
%w[audio bindings ioservices legacy module-types osgi persistence transformations utils
   ide].each do |subsection|
  Dir.glob("./developers/#{subsection}/*.md") do |path|
    file = File.basename(path)
    verbose "   ➡️ #{subsection}/#{file}"
    process_file("./developers/#{subsection}", file, "docs/developer/#{subsection}",
                 "#{$docs_repo_root}/developer/#{subsection}/#{file}")
  end
end

verbose "   ➡️ images"
FileUtils.cp_r("./developers/bindings/images", "docs/developer/bindings")
FileUtils.cp_r("./developers/osgi/images", "docs/developer/osgi")
FileUtils.cp_r("./developers/ide/images", "docs/developer/ide")

["addons"].each do |subsection|
  Dir.glob("./developers/#{subsection}/*.md") do |path|
    file = File.basename(path)
    verbose "   ➡️ #{subsection}/#{file}"
    process_file("./developers/#{subsection}", file, "docs/developer/#{subsection}",
                 "#{$docs_repo_root}/developer/#{subsection}/#{file}")
  end
end

add_placeholder_pages()
