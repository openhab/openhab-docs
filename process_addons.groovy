

def process_addon_type = { list, type, typedir, suffix, lblremoves, pkgremoves, sources ->
    sources.each { source ->
        def files = new File(project.basedir, "addons/${typedir}/".concat(source))
        files.eachFile {
            def name = it.name
            if(name.contains(type) && !name.endsWith('.test')) {
                def id = it.name
                for(pkg in pkgremoves) {
                    id = id.replace(pkg, '')
                }
            	def target = new File(project.basedir, "addons/${typedir}")
                def simpleNameDir = new File(target.path,  (source == 'oh1' && type == 'binding') ? id + '1' : id)
                it.renameTo(simpleNameDir)
                def readme = new File(simpleNameDir.path, 'README.md')
                if(readme.exists()) {
                    println readme
                    readme.renameTo(new File(simpleNameDir.path, 'readme.md'))
                    def label = readme.readLines().find{it.startsWith('#')}
                    if(label == null) {
                        label = id
                    } else {
                        label = label.replace('#', '')
                        for (remove in lblremoves) {
                            label = label.replaceFirst(remove, '')
                        }
                        label = label.trim()
                    }
                    def icon = new File(project.basedir, 'images/addons/' + id + '.png').exists()
                    def description = ""
                    boolean firstHeadline = false
                    for(def line : readme.readLines()) {
                        if(line.startsWith('#')) {
                            if(!firstHeadline) {
                                firstHeadline = true
                            }
                        } else {
                            if(firstHeadline && line.trim().size() > 0) {
                                description = line.trim().replace('\"', '\'')
                                break
                            }
                        }
                    }
                    def toYaml = { '---\n' + it.collect{ /$it.key: $it.value/ }.join('\n') + '\n---\n\n' }
                    def front = ['layout': 'documentation', 'title': "${label} - ${suffix}", 'source': 'external']
                    if(source == "oh1") {
                        front['source'] = "https://github.com/openhab/openhab1-addons/blob/master/bundles/${type}/org.openhab.${type}.${id}/README.md"
                    }
                    if(!readme.text.startsWith('---')) {
                        readme.write(toYaml(front) + "<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->\n\n{% include base.html %}\n\n" + readme.text)
                    }
                    list.append(source + ',' + type + ',' + id + ',' + icon + ',' + label + ',"' + description + '"\n')
                }
            }
        }
    }
}

def process_addon_files = { ->
    def csv = new File(project.basedir, '_data/addons.csv')
    csv.write("source,type,id,icon,label,description\n")

    //                      type,          typedir,        suffix,        lblremoves,               pkgremoves,                                                sources
    process_addon_type(csv, 'binding',     'bindings',     'Bindings',    [' Binding'],             ['org.openhab.binding.','org.eclipse.smarthome.binding.'], ['oh1', 'oh2'])
    process_addon_type(csv, 'action',      'actions',      'Actions',     [' Actions', ' Action'],  ['org.openhab.action.'],                                   ['oh1'],      )
    process_addon_type(csv, 'persistence', 'persistence',  'Persistence', ['\\s*Persistence\\s*$'], ['org.openhab.persistence.'],                              ['oh1'],      )
    process_addon_type(csv, 'io',          'io',           'Services',    [' Service'],             ['org.openhab.io.','org.eclipse.smarthome.io'],            ['oh1', 'oh2'])
    process_addon_type(csv, 'voice',       'voice',        'Voice',       [:],                      ['org.openhab.voice.','org.eclipse.smarthome.voice.'],            ['oh2'])
    process_addon_type(csv, 'iconset',     'iconsets',     'Icon Sets',   [:],                      ['org.eclipse.smarthome.ui.iconset.'],                            ['oh2'])
    process_addon_type(csv, 'ui',          'uis',          'UI',          [:],                      ['org.openhab.ui.','org.eclipse.smarthome.ui.'],                  ['oh2'])
}

process_addon_files()

