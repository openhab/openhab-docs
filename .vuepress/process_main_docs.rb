require_relative "./process_file.rb"

def process_main_docs(docs_source_dir)

    puts ">>> Migrating the introduction article"
    process_file(".", "introduction.md", "docs", "https://github.com/openhab/openhab-docs/blob/master/introduction.md")
    FileUtils.mv("docs/introduction.md", "docs/readme.md")
    
    
    puts ">>> Migrating common images"
    FileUtils.mkdir_p("docs/images")
    FileUtils.cp_r("#{docs_source_dir}/images/distro.png", "docs/images")
    FileUtils.cp_r("#{docs_source_dir}/images/dashboard.png", "docs/images")
    
    
    puts ">>> Migrating logos"
    FileUtils.cp_r("#{docs_source_dir}/images/addons", ".vuepress/public/logos")



    puts ">>> Migrating the Concepts section"
    
    
    if Dir.exists?("#{docs_source_dir}/concepts") then
        Dir.glob("#{docs_source_dir}/concepts/*.md").each { |path|
            file = File.basename(path)
            next if file == "categories.md"
            puts " -> #{file}"
            process_file("#{docs_source_dir}/concepts", file, "docs/concepts", "#{$esh_repo_root}/concepts/#{file}")
        }
        puts " -> images and diagrams"
        FileUtils.cp_r("#{docs_source_dir}/concepts/images", "docs/concepts/images")
        FileUtils.cp_r("#{docs_source_dir}/concepts/diagrams", "docs/concepts/diagrams")
    else
        puts " Skipping non-existing section!"
    end
    
    
    
    puts ">>> Migrating the Installation section"
    
    
    Dir.glob("#{docs_source_dir}/installation/*.md") { |path|
        file = File.basename(path)
        next if file == "designer.md"
        puts " -> #{file}"
        process_file("#{docs_source_dir}/installation", file, "docs/installation", "#{$docs_repo_root}/installation/#{file}")
    }
    puts " -> images"
    FileUtils.cp_r("#{docs_source_dir}/installation/images", "docs/installation/images")
    
    
    
    puts ">>> Migrating the Tutorial section"
    
    
    Dir.glob("#{docs_source_dir}/tutorials/beginner/*.md") { |path|
        file = File.basename(path)
        puts " -> #{file}"
        process_file("#{docs_source_dir}/tutorials/beginner", file, "docs/tutorial", "#{$docs_repo_root}/tutorials/beginner/#{file}")
    }
    puts " -> images"
    FileUtils.cp_r("#{docs_source_dir}/tutorials/beginner/images", "docs/tutorial/images")
    # FileUtils.cp_r("#{docs_source_dir}/tutorials/images/*", "docs/tutorial/images")
    
    
    
    puts ">>> Migrating the Configuration section"
    
    
    Dir.glob("#{docs_source_dir}/configuration/*.md") { |path|
        file = File.basename(path)
        next if file == "transform.md" # Useless, copy the one from addons
        puts " -> #{file}"
        process_file("#{docs_source_dir}/configuration", file, "docs/configuration", "#{$docs_repo_root}/configuration/#{file}")
    }
    puts " -> images"
    FileUtils.cp_r("#{docs_source_dir}/configuration/images", "docs/configuration")
    process_file("#{docs_source_dir}/addons", "actions.md", "docs/configuration", "#{$docs_repo_root}/addons/actions.md")
    process_file("#{docs_source_dir}/addons", "transformations.md", "docs/configuration", "#{$docs_repo_root}/addons/transformations.md")
    process_file("#{docs_source_dir}/tutorials", "migration.md", "docs/configuration/migration", "#{$docs_repo_root}/tutorials/migration.md")
    FileUtils.mv("docs/configuration/migration/migration.md", "docs/configuration/migration/index.md")
    FileUtils.cp_r("#{docs_source_dir}/tutorials/images", "docs/configuration/migration")
    
    
    
    puts ">>> Migrating the UI section"
    
    
    Dir.glob("#{docs_source_dir}/_addons_uis/**") { |path|
        next if path =~ /habpanel/ || path =~ /paper/ # Those already have their own article, no need to include the readme...
        addon = File.basename(path)
        puts " -> #{addon}"
        FileUtils.mkdir_p("docs/configuration/ui/" + addon)
        process_file("#{docs_source_dir}/_addons_uis", addon + "/readme.md", "docs/configuration/ui", "")
        puts " -> images (#{addon})"
        FileUtils.cp_r("#{docs_source_dir}/_addons_uis/#{addon}/doc", "docs/configuration/ui/#{addon}") if Dir.exists?("#{docs_source_dir}/_addons_uis/#{addon}/doc")
    }
    
    
    
    puts ">>> Migrating the Apps section"
    
    
    Dir.glob("#{docs_source_dir}/addons/uis/apps/*.md") { |path|
        file = File.basename(path)
        puts " -> #{file}"
        process_file("#{docs_source_dir}/addons/uis/apps", file, "docs/apps", "#{$docs_repo_root}/addons/uis/apps/#{file}")
    }
    puts " -> images"
    FileUtils.cp_r("#{docs_source_dir}/addons/uis/apps/images", "docs/apps")
    
    
    
    puts ">>> Migrating the Administration section"
    
    
    Dir.glob("#{docs_source_dir}/administration/*.md") { |path|
        file = File.basename(path)
        puts " -> #{file}"
        process_file("#{docs_source_dir}/administration", file, "docs/administration", "#{$docs_repo_root}/administration/#{file}")
    }
    puts " -> images"
    FileUtils.cp_r("#{docs_source_dir}/administration/images", "docs/administration/images")
    
    
    
    puts ">>> Migrating the Developer section"
    
    
    process_file("#{docs_source_dir}/developers", "index.md", "docs/developer", "#{$docs_repo_root}/developer/index.md")
    ["prerequisites", "development", "contributing"].each { |subsection|
        Dir.glob("#{docs_source_dir}/developers/#{subsection}/*.md") { |path|
            file = File.basename(path)
            puts " -> #{subsection}/#{file}"
            process_file("#{docs_source_dir}/developers/#{subsection}", file, "docs/developer/#{subsection}", "#{$docs_repo_root}/developer/#{subsection}/#{file}")
        }
        if subsection != "contributing" then
            puts " -> #{subsection}/images"
            FileUtils.cp_r("#{docs_source_dir}/developers/#{subsection}/images", "docs/developer/#{subsection}")
        end
    }
    
end
