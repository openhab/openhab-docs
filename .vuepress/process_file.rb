# This function converts a "source" file to something looking good in VuePress,
# adding, replacing and stuff
require "fileutils"
require "net/http"
require "uri"
require "rexml/document"

def process_file(indir, file, outdir, source)
    in_frontmatter = false
    frontmatter_processed = false
    has_source = false
    has_logo = false
    obsolete_binding = false
    og_title = 'openHAB'
    og_description = 'a vendor and technology agnostic open source automation software for your home'

    if !File.exists?("#{indir}/#{file}") then
        puts "process_file: IGNORING (NON-EXISTING): #{indir}/#{file}"
        return
    end

    FileUtils.mkdir_p(outdir)
    File.open("#{outdir}/#{file}", "w+") { |out|
        File.open("#{indir}/#{file}").each { |line|
            next if line =~ /^layout: documentation/
            next if line =~ /^layout: tutorial/
            next if line =~ /^layout: developers/
            next if line =~ /^layout: intro/
            next if line =~ /^{% include base.html %}/
            next if line =~ /\{: #/
            next if line =~ /\{::options/
            next if line =~ /TOC/
            next if line =~ /no_toc/
            has_source = true if in_frontmatter && line =~ /^source:/
            has_logo = true if in_frontmatter && line =~ /^logo:/
            if in_frontmatter && line =~ /^title:/ then
                og_title = line.gsub('title: ', '').gsub("\n", "")
            end
            if in_frontmatter && line =~ /^description:/ then
                og_description = line.gsub('description: ', '').gsub("\n", "").gsub('[', '').gsub(']', '').gsub(/\(http[:\/\-0-9A-Za-z\.]+\)/, '')
            end

            if line =~ /^---$/ then
                if !in_frontmatter then
                    in_frontmatter = true
                elsif !frontmatter_processed
                    if !has_source && source then
                        # Prefer already present source
                        out.puts "source: #{source}"
                    elsif !has_source
                        # Try to determine the source
                        outdir_parts = outdir.split('/')
                        outdir_parts[1] = "binding" if outdir_parts[1] == "bindings"
                        outdir_parts[1] = "transform" if outdir_parts[1] == "transformations"
                        outdir_parts[1] = "io" if outdir_parts[1] == "integrations"
                        if (outdir_parts[0] == "addons") then
                            addon_type = outdir_parts[1]
                            addon = file.split('/')[0]
                            source = ""
                            if addon == "habmin" then
                                puts "    (add-on is habmin)"
                                source = "https://github.com/openhab/org.openhab.ui.habmin/blob/master/README.md"
                            elsif addon == "habpanel" then
                                puts "    (add-on is habpanel)"
                                source = "https://github.com/openhab/org.openhab.ui.habpanel/blob/master/README.md"
                            elsif addon == "zigbee" then
                                puts "    (add-on is zigbee)"
                                source = "https://github.com/openhab/org.openhab.binding.zigbee/blob/master/org.openhab.binding.zigbee/README.md"
                            elsif addon == "zwave" && !(file =~ /things/) then
                                puts "    (add-on is zwave)"
                                source = "https://github.com/openhab/org.openhab.binding.zwave/blob/master/README.md"
                            elsif $esh_features.include?("esh-#{addon_type}-#{addon.gsub('.', '-')}") then
                                puts "    (add-on is from ESH)"
                                source = "https://github.com/eclipse/smarthome/blob/master/extensions/#{addon_type}/org.eclipse.smarthome.#{addon_type}.#{addon}/README.md"
                            elsif !(file =~ /things/) then
                                puts "    (add-on is from openhab2-addons)"
                                source = "https://github.com/openhab/openhab2-addons/blob/master/addons/#{addon_type}/org.openhab.#{addon_type}.#{addon}/README.md"
                            end

                            out.puts "source: #{source}" if source != ""

                            # For sub-bundles, set the "prev" link to the main add-on
                            out.puts "prev: ../#{addon.split('.')[0]}/" if addon.include?('.')

                            # Prev link to the main binding doc for zwave/doc/things.md
                            out.puts "prev: ../" if file == 'zwave/doc/things.md'
                        end
                    end

                    # Add OpenGraph tags
                    out.puts "meta:"
                    out.puts "  - property: og:title"
                    out.puts "    content: \"#{og_title.gsub('"', '\"')}\""
                    out.puts "  - property: og:description"
                    out.puts "    content: #{og_description}"

                    in_frontmatter = false
                    frontmatter_processed = true
                end
            end

            # Replace the Jekyll "contribution wanted" include file by custom VuePress markup
            line = "[[toc]]" if line =~ /\{:toc/
            if line =~ /\{% include contribution-wanted.html %\}/
                out.puts "::: tip Contribution Wanted"
                out.puts "Please help us improve the documentation! "
                out.puts "If you'd like to leave corrections, additions or comments for this article or any other part of this website, please drop a word at:"
                out.puts "[Documentation Issue Tracker](#{$docs_repo}/issues)"
                out.puts ":::"
                next
            end

            # Actions and transformations are currently partly in add-ons, copy the content above the list of add-ons
            break if line =~ /^More details regarding this and other Transformation services can be found in the individual transformation articles linked below./
            break if line =~ /^## Installable Actions/

            # Remove collapsibles in Linux install document and replace them by regular headings
            next if line =~ /include collapsible/ && file =~ /linux/
            line = "##### " + line if line =~ /^Apt Based Systems/ && file =~ /linux/
            line = "##### " + line if line =~ /^Yum or Dnf Based Systems/ && file =~ /linux/
            line = "##### " + line if line =~ /^Systems based on/ && file =~ /linux/

            # Fix headers for some pages
            line = line.gsub(/^##/, "#") if (outdir == "docs/configuration/ui" && (file =~ /basic/ || file =~ /classic/)) || file == 'astro1/readme.md'

            # Fix broken links in the package selection article
            if outdir == 'docs/configuration' && file =~ /packages/ then
                line = line.gsub('(../addons/uis/paper/readme.html)', '(paperui.html)')
                line = line.gsub('(../addons/uis/basic/readme.html)', '(ui/basic/)')
                line = line.gsub('(../addons/uis/classic/readme.html)', '(ui/classic/)')
                line = line.gsub('(../addons/uis/habmin/readme.html)', '(ui/habmin/)')
                line = line.gsub('(../addons/uis/habpanel/readme.html)', '(habpanel.html)')
            end


            # Handle obsolete bindings
            if in_frontmatter && (line =~ /label: / || line =~ /title: /) && outdir == 'addons/bindings' && file =~ /1\// then
                addon = file.split('/')[0]
                if !$ignore_bindings.include?(addon.gsub('1', '')) && Dir.exists?("#{indir}/#{addon.gsub('1', '')}") then
                    line = line.gsub("\n", "") + ' (1.x)' if !(line =~ /1\.x/)
                    if !obsolete_binding then
                        obsolete_binding = true
                        out.puts "obsolete: true"
                        puts "     obsolete!"
                    end
                end
            end

            if !in_frontmatter && line =~ /^# / then
                # Put a warning banner for obsolete bindings
                out.puts line
                if obsolete_binding then
                    out.puts
                    out.puts "::: danger OBSOLETE BINDING"
                    new_addon = file.split('/')[0].gsub('1', '')
                    out.puts "This 1.x binding is obsolete; it has been replaced by the 2.x [#{new_addon}](../#{new_addon}/) binding which you should use instead."
                    out.puts ":::"
                    out.puts
                    obsolete_binding = false
                end
                # Add the logo if specified
                if has_logo then
                    out.puts
                    out.puts '<AddonLogo/>'
                    has_logo = false
                end
                next
            end

            # Expand <!--list-subs--> comments with a list of links
            # (https://github.com/eclipse/smarthome/issues/5571)
            if line =~ /<!--\s*list-subs\s*-->/ then
                sub_addons = get_subs_links(file.split('/')[0], indir)
                out.puts
                sub_addons.each { |sub|
                    out.puts "- [#{sub[1]}](../#{sub[0]}/)"
                }
                out.puts
            end

            # Replace links to generated docs in ZWave's things.md by links to the internal viewer
            line = line.gsub(/]\((.*)\/(.*)\)/, '](../thing.html?manufacturer=\1&file=\2)') if file == 'zwave/doc/things.md'

            # Misc replaces (relative links, remove placeholder interpreted as custom tags)
            line = line.gsub('http://docs.openhab.org/addons/uis/paper/readme.html', '/docs/configuration/paperui.html')
            line = line.gsub('http://docs.openhab.org/addons/uis/habpanel/readme.html', '/docs/configuration/habpanel.html')
            line = line.gsub('http://docs.openhab.org/addons/uis/habmin/readme.html', '/docs/configuration/habmin.html')
            line = line.gsub('http://docs.openhab.org/addons/uis/basic/readme.html', '/docs/configuration/ui/basic/')
            line = line.gsub(/http:\/\/docs\.openhab\.org\/addons\/(.*)\/(.*)\/readme\.html/, '/addons/\1/\2/')
            line = line.gsub('http://docs.openhab.org/', '/docs/')
            line = line.gsub('/addons/io/', '/addons/integrations/')
            line = line.gsub("{{base}}/", "./docs/")
            line = line.gsub("{{docu}}/", "./docs/")
            line = line.gsub("(images/", "(./images/")
            line = line.gsub("src=\"images/", "src=\"./images/")
            line = line.gsub("]:images/", "]:./images/")
            line = line.gsub("](doc/", "](./doc/")
            line = line.gsub("(diagrams/", "(./diagrams/")
            line = line.gsub("./docs/tutorials/beginner/", "/docs/tutorial/")
            line = line.gsub("./docs/", "/docs/")
            line = line.gsub("<activeState>", '\<activeState\>')
            line = line.gsub("<passiveState>", '\<passiveState\>')
            line = line.gsub("<dimension>", '\<dimension\>')
            line = line.gsub("<TransformProgram>", '\<TransformProgram\>')
            line = line.gsub("<FlahshbriefingDeviceID>", '`<FlahshbriefingDeviceID>`') if file =~ /amazonechocontrol/
            line = line.gsub("<SerialNumber>", '&lt;SerialNumber&gt;') if file =~ /airvisualnode/
            line = line.gsub("<version>", '&lt;version&gt;') if file =~ /caldav/
            line = line.gsub("by <step>", 'by `<step>`') if file =~ /ipx8001/
            line = line.gsub("<BR>", '<BR/>')
            line = line.gsub("'<package name>:<widget ID>'", '`<package name>:<widget ID>`') if file =~ /lametrictime/
            line = line.gsub("<mac address of bridge>", '`<mac address of bridge>`') if file =~ /milight/
            line = line.gsub("<mac>", '`<mac>`') if file =~ /milight/
            line = line.gsub("<type of bulb>", '`<type of bulb>`') if file =~ /milight/
            line = line.gsub("<IP-Address of bridge>", '`<IP-Address of bridge>`') if file =~ /milight/
            line = line.gsub("<bulb>", '`<bulb>`') if file =~ /milight/
            line = line.gsub("<zone>", '`<zone>`') if file =~ /milight/
            line = line.gsub("[](", '[here](') if file =~ /powermax1/
            line = line.gsub("<n>", '&lt;n&gt;') if file =~ /rfxcom/
            line = line.gsub(" <value> ", ' &lt;value&gt; ') if file =~ /zibase/
            line = line.gsub("<username>", '&lt;username&gt;') if file =~ /zoneminder/
            line = line.gsub("<password>", '&lt;password&gt;') if file =~ /zoneminder/
            line = line.gsub("<yourzmip>", '&lt;yourzmip&gt;') if file =~ /zoneminder/
            line = line.gsub(" <chatId> ", ' &lt;chatId&gt; ') if file =~ /telegram/
            line = line.gsub(" <token> ", ' &lt;token&gt; ') if file =~ /telegram/
            line = line.gsub("<regular expression>", '\<regular expression\>')
            line = line.gsub('src="images/', 'src="./images/') if outdir =~ /apps/
            line = line.gsub('](/images/', '](./images/') if outdir =~ /google-assistant/

            line = line.gsub(/\{:(style|target).*\}/, '') # Jekyll inline attributes syntax not supported

            out.puts line
        }

        # Add the components for the versions dropdown and the edit link
        out.puts
        out.puts '<DocPreviousVersions/>' unless file == "introduction.md" and outdir == "docs"
        out.puts '<EditPageLink/>'
    }
end
