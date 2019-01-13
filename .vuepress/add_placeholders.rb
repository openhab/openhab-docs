# This function will add placeholders for pages that are out of scope of the docs preview

def add_placeholder_pages()
    puts ">>> Adding placeholder pages for preview"
    [
        "docs/concepts",
        "docs/configuration/iconsets/classic",
        "docs/configuration/ui/habmin",
        "docs/configuration/ui/habot",
        "docs/configuration/ui/basic",
        "docs/configuration/ui/basic",
        "docs/configuration/ui/classic",
        "docs/ecosystem/alexa",
        "docs/ecosystem/google-assistant",
        "docs/ecosystem/ifttt",
        "docs/ecosystem/ifttt",
        "docs/ecosystem/mycroft",
        "addons/integrations/homekit"
    ].each { |dir|
        puts " -> #{dir}/"
        FileUtils.mkdir_p(dir)
        File.open("#{dir}/readme.md", "w+") { |f|
            f.puts "# This content is unavailable"
            f.puts ""
            f.puts "This content is migrated from another repository, and is not included in this preview."
        }
    }
end
