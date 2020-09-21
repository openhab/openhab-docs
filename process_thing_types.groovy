import groovy.io.FileType
import groovy.json.JsonOutput

class ThingType {
    String bindingId
    String id
    String label
}

def thing_types = []

def process_thing_type_xml = { file ->
    def root = new XmlParser().parse(file)
    def bridges = root["bridge-type"].findAll { bridge ->
        thing_types.add(new ThingType(bindingId: root.@bindingId, id: root.@bindingId + ":" + bridge.@id, label: bridge.label.text()))
    }
    def things = root["thing-type"].findAll { thing ->
        thing_types.add(new ThingType(bindingId: root.@bindingId, id: root.@bindingId + ":" + thing.@id, label: thing.label.text()))
    }
}

def collect_thing_types = {
    def files = new File(project.basedir, "_thing_types").eachFileRecurse(FileType.FILES) {
      process_thing_type_xml(it)
    }
    new File(project.basedir, ".vuepress/thing-types.json").write(JsonOutput.toJson(thing_types))
    println thing_types.size() + " thing types written to thing-types.json"
}

collect_thing_types()

