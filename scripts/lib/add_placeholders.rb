# frozen_string_literal: true

# This function will add placeholders for pages that are out of scope of the docs preview

def add_placeholder_pages
  puts "➡️ Adding placeholder pages for preview"
  [
    "docs/apps/android.md",
    "docs/apps/garmin",
    "docs/apps/sailfishos",
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
    "docs/installation/openhabian.md",
    "docs/installation/openhabian-troubleshooting.md",
    "docs/installation/openhabian-backup.md",
    "docs/installation/openhabian-exim.md"
  ].each do |path|
    puts "  ➡️ #{path}"
    page = path
    unless path =~ /\.md/
      FileUtils.mkdir_p(path)
      page = File.join(path, "readme.md")
    end
    File.open(page, "w+") do |f|
      f.puts "# This content is unavailable"
      f.puts ""
      f.puts "This content is migrated from another repository, and is not included in this preview."
    end
  end
end
