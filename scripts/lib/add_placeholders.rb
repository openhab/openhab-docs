# frozen_string_literal: true

require "pathname"

# This function will add placeholders for pages that are out of scope of the docs preview

def add_placeholder_pages
  puts "➡️ Adding placeholder pages for preview"

  pages = [
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
  ].map { |p| Pathname.new(p) }

  # Using a standard loop for better clarity and explicit logic at a glance
  pages.each do |path|
    puts "  ➡️ #{path}"

    # Determine if we are writing a specific .md file or a folder's readme
    target_file = (path.extname == ".md") ? path : path.join("readme.md")

    # Ensure the parent directory exists
    target_file.dirname.mkpath

    target_file.write <<~MARKDOWN
      # This content is unavailable

      This content is migrated from another repository and is not included in this preview.
    MARKDOWN
  end
end
