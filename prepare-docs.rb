# This will clone https://github.com/openhab/openhab-docs
# and migrate content into the website with some changes

require "fileutils"
require "net/http"
require "uri"
require "rexml/document"
# require "nokogiri"

$docs_repo = "https://github.com/openhab/openhab-docs"
$docs_repo_root = $docs_repo + "/blob/master"
$docs_repo_branch = "final"
$esh_repo = "https://github.com/eclipse/smarthome"
$esh_repo_root = $esh_repo + "/blob/master/docs/documentation"
$version = nil


require_relative "./.vuepress/process_file.rb"
require_relative "./.vuepress/process_main_docs.rb"
require_relative "./.vuepress/add_placeholders.rb"


if (Dir.exists?("docs")) then
    puts ">>> Removing processed docs"
    FileUtils.rm_rf("docs")
end
if (Dir.exists?("addons/integrations")) then
    puts ">>> Removing processed addons"
    FileUtils.rm_rf("docs")
end

process_main_docs(".")
add_placeholder_pages()



if (ARGV[0] && ARGV[0] == "--delete-sources") then
    puts ">>> !!! Deleting source files - for ephemeral clones only!"
    ["administration", "appendix", "community", "configuration", "developers", "installation", "tutorials"].each { |d|
        FileUtils.rm_rf(d)
    }
end

# Regenerate the classic iconset docs
#puts ">>> Generating iconset"
#system("ruby generate_iconset_doc.rb #{docs_source_dir}/_addons_iconsets classic #{docs_source_dir}/_data docs/configuration/iconsets")
