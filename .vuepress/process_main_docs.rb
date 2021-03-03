require_relative "./process_file.rb"

def process_main_docs(docs_source_dir)

    puts ">>> Migrating the introduction article"
    process_file(".", "introduction.md", "docs", "https://github.com/openhab/openhab-docs/blob/main/introduction.md")
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


    Dir.glob("#{docs_source_dir}/tutorials/getting_started/*.md") { |path|
        file = File.basename(path)
        puts " -> #{file}"
        process_file("#{docs_source_dir}/tutorials/getting_started", file, "docs/tutorial", "#{$docs_repo_root}/tutorials/getting_started/#{file}")
    }
    puts " -> images"
     FileUtils.cp_r("#{docs_source_dir}/tutorials/getting_started/images", "docs/tutorial/images")
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
    #process_file("#{docs_source_dir}/tutorials", "migration.md", "docs/configuration/migration", "#{$docs_repo_root}/tutorials/migration.md")
    #FileUtils.mv("docs/configuration/migration/migration.md", "docs/configuration/migration/index.md")
    #FileUtils.cp_r("#{docs_source_dir}/tutorials/images", "docs/configuration/migration")

    puts ">>> Migrating the Migration Tutorial section"


    Dir.glob("#{docs_source_dir}/configuration/migration/*.md") { |path|
        file = File.basename(path)
        puts " -> #{file}"
        process_file("#{docs_source_dir}/configuration/migration", file, "docs/configuration/migration", "#{$docs_repo_root}/configuration/migration/#{file}")
    }
    puts " -> images"
    #FileUtils.cp_r("#{docs_source_dir}/configuration/images", "docs/configuration") // no images placed yet

    puts ">>> Migrating the UI section"


    Dir.glob("#{docs_source_dir}/ui/*.md") { |path|
        file = File.basename(path)
        puts " -> #{file}"
        process_file("#{docs_source_dir}/ui", file, "docs/ui", "#{$docs_repo_root}/ui/#{file}")
    }
    puts " -> images"
    FileUtils.cp_r("#{docs_source_dir}/ui/images", "docs/ui/images")



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


    Dir.glob("#{docs_source_dir}/developers/*.md") { |path|
        file = File.basename(path)
        puts " -> #{file}"
        process_file("#{docs_source_dir}/developers", file, "docs/developer", "#{$docs_repo_root}/developer/#{file}")
    }
    ["audio", "bindings", "ioservices", "legacy", "module-types", "osgi", "persistence", "transformations", "utils", "ide"].each { |subsection|
        Dir.glob("#{docs_source_dir}/developers/#{subsection}/*.md") { |path|
            file = File.basename(path)
            puts " -> #{subsection}/#{file}"
            process_file("#{docs_source_dir}/developers/#{subsection}", file, "docs/developer/#{subsection}", "#{$docs_repo_root}/developer/#{subsection}/#{file}")
        }
    }

    puts " -> images"
    FileUtils.cp_r("#{docs_source_dir}/developers/bindings/images", "docs/developer/bindings/images")
    FileUtils.cp_r("#{docs_source_dir}/developers/osgi/images", "docs/developer/osgi/images")
    FileUtils.cp_r("#{docs_source_dir}/developers/ide/images", "docs/developer/ide/images")

end
