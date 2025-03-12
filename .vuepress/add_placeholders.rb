# This function will add placeholders for pages that are out of scope of the docs preview

def add_placeholder_pages()
    puts "➡️ Adding placeholder pages for preview"
    [
        "addons/integrations/homekit",
        "addons/integrations/openhabcloud",
        "docs/apps/android.md",
        "docs/configuration/habpanel",
        "docs/configuration/iconsets/classic",
        "docs/ui/components",
        "docs/ui/habpanel",
        "docs/ui/habpanel/habpanel.md",
        "docs/ui/habot",
        "docs/ui/basic",
        "docs/ecosystem/alexa",
        "docs/ecosystem/google-assistant",
        "docs/ecosystem/ifttt",
        "docs/ecosystem/mycroft",
        "docs/installation/openhabian.md"
    ].each { |path|
        puts "  ➡️ #{path}"
        page = path
        if (!(path =~ /\.md/)) then
            FileUtils.mkdir_p(path)
            page = path + "/readme.md"
        end
        File.open(page, "w+") { |f|
            f.puts "# This content is unavailable"
            f.puts ""
            f.puts "This content is migrated from another repository, and is not included in this preview."
        }
    }
end
