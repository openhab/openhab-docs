def collect_feature_xml = { features, xml, attrs ->
    def feature = new File(project.basedir, xml)
    def root = new XmlParser().parse(feature)
    root.feature.each {
      def name = it['@name']
      features[name] = attrs
    }
}

def collect_features = { features ->
    collect_feature_xml(features, '.external-resources/openhab-distro/features/addons-esh/src/main/feature/feature.xml',              ['install': 'auto',   'since': '2x'])
    collect_feature_xml(features, '.external-resources/openhab-distro/features/addons/src/main/feature/feature.xml',                  ['install': 'auto',   'since': '2x'])
    collect_feature_xml(features, '.external-resources/openhab2-addons/features/openhab-addons/src/main/feature/feature.xml',         ['install': 'auto',   'since': '2x'])
    collect_feature_xml(features, '.external-resources/openhab1-addons/features/openhab-addons/src/main/feature/feature.xml',         ['install': 'auto',   'since': '1x'])
    collect_feature_xml(features, '.external-resources/openhab1-addons/features/openhab-addons-legacy/src/main/feature/feature.xml',  ['install': 'legacy', 'since': '1x'])
}

def process_addon_type = { features, sources, type, collection, suffix, lblremoves, pkgremoves ->
    sources.each { source ->
        println "--------------------------------------------------"
        println "Processing: _" + collection + "/" + source + "\n"
        def files = new File(project.basedir, "_${collection}/".concat(source))
        if (! files.exists()) {
            println "No resources found."
            return
        }
        files.eachFile {
            def name = it.name
            println name
            if (! name.contains(type)) log.warn("Addon package name doesn't contain '${type}'.")
            if (name.endsWith('.test')) {
                log.info("Skip.")
                it.deleteDir()
            } else {
                def id = it.name
                for (pkg in pkgremoves) {
                    id = id.replace(pkg, '')
                }
                def target = new File(project.basedir, "_${collection}")
                def simpleNameDir = new File(target.path, (source == 'oh1' && type == 'binding') ? id + '1' : id)
                it.renameTo(simpleNameDir)
                def readme = new File(simpleNameDir.path, 'README.md')
                if (! readme.exists()) {
                    log.warn("No README.md found.")
                } else {
                    def readmeLowerCase = new File(simpleNameDir.path, 'readme.md')
                    readme.renameTo(readmeLowerCase)
                    readme = readmeLowerCase
                    def label = readme.readLines().find{it.startsWith('#')}
                    if (label == null) {
                        log.warn("No level 1 header found.")
                        label = id
                    } else {
                        label = label.replace('#', '')
                        for (remove in lblremoves) {
                            label = label.replaceFirst(remove, '')
                        }
                        label = label.trim()
                    }
                    def logo = new File(project.basedir, 'images/addons/' + id + '.png').exists()
                    if (! logo) log.info("No logo found.")
                    def description = ""
                    boolean firstHeadline = false
                    for (def line : readme.readLines()) {
                        if (line.startsWith('#')) {
                            if (! firstHeadline) {
                                firstHeadline = true
                            }
                        } else {
                            if(firstHeadline && line.trim().size() > 0) {
                                description = line.trim().replace('\"', '\'')
                                break
                            }
                        }
                    }
                    def front = ['id': "${id}", 'label': "${label}", 'title': "${label}${suffix}", 'type': "${type}", description: "\"${description}\""]
                    if (source == 'oh1') {
                        front['source'] = "https://github.com/openhab/openhab1-addons/blob/master/bundles/${type}/org.openhab.${type}.${id}/README.md"
                        front['since'] = '1x'
                    } else {
                        front['since'] = '2x'
                    }
                    if (logo) {
                        front['logo'] = 'images/addons/' + id + '.png'
                    }
                    def feature_id = (source == 'oh1' && (type == 'binding' || type == 'io')) ? id + '1' : id
                    def feature = features.find {
                        it.key.startsWith("openhab-${type}-${feature_id}") ||
                        (type == 'io' && it.key.startsWith("openhab-misc-${feature_id}")) ||
                        (type == 'transform' && it.key.startsWith("openhab-transformation-${feature_id}"))
                        }?.value
                    if (feature == null) {
                        feature = ['install': 'manual']
                    }
                    front = front + feature
                    def toYaml = { '---\n' + it.collect{ /$it.key: $it.value/ }.join('\n') + '\n---\n\n' }
                    readme.write(toYaml(front) + '<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->\n\n{% include base.html %}\n\n' + readme.text)
                }
            }
            print "\n"
        }
        def temp_folder = new File(project.basedir, "_${collection}/".concat(source))
        if (temp_folder.list().length > 0) {
            log.warn("Folder not empty after processing.")
        }
        temp_folder.deleteDir()
    }
}

def process_addon_files = { features ->
    //                 features, sources,               type,          collection,               suffix,                       lblremoves,                  pkgremoves
    process_addon_type(features, ['oh1'],               'action',      'addons_actions',         ' - Actions',                 [' Actions', ' Action'],     ['org.openhab.action.']                                  )
    process_addon_type(features, ['oh1', 'oh2'],        'binding',     'addons_bindings',        ' - Bindings',                [' Binding'],                ['org.openhab.binding.','org.eclipse.smarthome.binding.'])
    process_addon_type(features,        ['oh2'],        'iconset',     'addons_iconsets',        ' - Icon Sets',               [:],                         ['org.eclipse.smarthome.ui.iconset.']                    )
    process_addon_type(features, ['oh1', 'oh2', 'ext'], 'io',          'addons_ios',             ' - System Integrations',     [' Service'],                ['org.openhab.io.','org.eclipse.smarthome.io']           )
    process_addon_type(features, ['oh1'],               'persistence', 'addons_persistences',    ' - Persistence Services',    ['\\s*Persistence\\s*$'],    ['org.openhab.persistence.']                             )
    process_addon_type(features,        ['oh2'],        'transform',   'addons_transformations', ' - Transformation Services', [' Transformation Service'], ['org.eclipse.smarthome.transform.']                     )
    process_addon_type(features,        ['oh2'],        'ui',          'addons_uis',             ' - UIs',                     [:],                         ['org.openhab.ui.','org.eclipse.smarthome.ui.']          )
    process_addon_type(features,        ['oh2'],        'voice',       'addons_voices',          ' - Voices',                  [:],                         ['org.openhab.voice.','org.eclipse.smarthome.voice.']    )
}

if (! new File(project.basedir, ".external-resources").exists()) {
    println "\n"
    log.warn("Folder '.external-resources' missing. Please use the update script to run all steps in order. Exiting.")
    println "\n"
    return
}
def features = [:]
collect_features(features)
process_addon_files(features)
