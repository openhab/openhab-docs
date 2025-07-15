def collect_feature_xml = { features, xml, attrs ->
  def feature = new File(project.basedir, xml)
  def root = new XmlParser().parse(feature)
  root.feature.each {
    def name = it['@name']
    features[name] = attrs
  }
}

def collect_features = { features ->
  collect_feature_xml(features, '.external-resources/openhab-distro/features/addons/src/main/feature/feature.xml', ['install': 'auto'])
  collect_feature_xml(features, '.external-resources/jfrog-files/feature.xml', ['install': 'auto'])
}

def process_addon_type = { features, type, collection, suffix, lblremoves, pkgremoves ->
  println "\n"
  log.info "--------------------------------------------------"
  log.info "Processing: _" + collection + "/"
  def files = new File(project.basedir, "_${collection}/")
  if (!files.exists()) {
    log.warn "No resources found."
    return
  }
  files.eachFile {
    def name = it.name
    if (!name.contains(type)) log.warn("Add-on package name '${name}' doesn't contain '${type}'.")
    if (name.endsWith('.test')) {
      log.info("Skipping .test bundle")
      it.deleteDir()
    } else {
      def id = it.name
      log.info "Processing: _" + collection + "/" + id
      for (pkg in pkgremoves) {
        id = id.replace(pkg, '')
      }
      def target = new File(project.basedir, "_${collection}")
      def simpleNameDir = new File(target.path, id)
      if (simpleNameDir.exists()) {
        log.warn("Destination folder already exists: " + simpleNameDir)
      }
      boolean success = it.renameTo(simpleNameDir)
      if (!success) {
        log.warn("Move failed.")
      }
      def readme = new File(simpleNameDir.path, 'README.md')
      if (!readme.exists()) {
        log.warn("No readme.md/README.md found.")
      } else {
        def readmeLowerCase = new File(simpleNameDir.path, 'readme.md')
        readme.renameTo(readmeLowerCase)
        readme = readmeLowerCase
        def label = readme.readLines().find { it.startsWith('#') }
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
        def logo_svg = new File(project.basedir, 'images/addons/' + id + '.svg').exists()
        def logo_png = new File(project.basedir, 'images/addons/' + id + '.png').exists()
        if (!(logo_svg || logo_png)) log.info("No logo found.")
        def description = ""
        boolean firstHeadline = false
        for (line in readme.readLines()) {
          if (line.startsWith('#')) {
            if (!firstHeadline) {
              firstHeadline = true
            }
          } else {
            if (firstHeadline && line.trim().size() > 0) {
              description = line.trim().replace('\"', '\'')
              break
            }
          }
        }
        def front = ['id': "${id}", 'label': "${label}", 'title': "${label}${suffix}", 'type': "${type}", description: "\"${description}\""]
        if (logo_svg) {
          front['logo'] = 'images/addons/' + id + '.svg'
        } else if (logo_png) {
          front['logo'] = 'images/addons/' + id + '.png'
        }
        def feature = features.find {
          it.key.startsWith("openhab-${type}-${id}") ||
            (type == 'io' && it.key.startsWith("openhab-misc-${id}")) ||
            (type == 'transform' && it.key.startsWith("openhab-transformation-${id}"))
        }?.value
        if (feature == null) {
          feature = ['install': 'manual']
        }
        front = front + feature
        def toYaml = { '---\n' + it.collect { /$it.key: $it.value/ }.join('\n') + '\n---\n\n' }
        def heading = readme.text.find(/# .*/)
        def text = readme.text.replace(heading, '')
        readme.write(toYaml(front)
          + '<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->\n\n{% include base.html %}\n\n'
          + heading
          + ((logo_svg || logo_png) ? '\n\n<AddonLogo />' : '')
          + text)
      }
    }
  }
}

def process_addon_files = { features ->
  //                 features, type,          collection,               suffix,                       lblremoves,                  pkgremoves
  process_addon_type(features, 'automation',  'addons_automation',      ' - Automation',              [:],                         ['org.openhab.automation.'])
  process_addon_type(features, 'binding',     'addons_bindings',        ' - Bindings',                [' Binding'],                ['org.openhab.binding.'])
  process_addon_type(features, 'iconset',     'addons_iconsets',        ' - Icon Sets',               [:],                         ['org.openhab.ui.iconset.'])
  process_addon_type(features, 'io',          'addons_ios',             ' - System Integrations',     [' Service'],                ['org.openhab.io.'])
  process_addon_type(features, 'persistence', 'addons_persistences',    ' - Persistence Services',    ['\\s*Persistence\\s*$'],    ['org.openhab.persistence.'])
  process_addon_type(features, 'transform',   'addons_transformations', ' - Transformation Services', [' Transformation Service'], ['org.openhab.transform.'])
  process_addon_type(features, 'ui',          'addons_uis',             ' - UIs',                     [:],                         ['org.openhab.ui.'])
  process_addon_type(features, 'voice',       'addons_voices',          ' - Voices',                  [:],                         ['org.openhab.voice.'])
}

if (!new File(project.basedir, ".external-resources").exists()) {
  println "\n"
  log.warn("Folder '.external-resources' missing. Please use the update script to run all steps in order. Exiting.")
  println "\n"
  return
}
def features = [:]
collect_features(features)
process_addon_files(features)
