import fs from 'fs'

import * as SystemWidgets from '../../../web/src/assets/definitions/widgets/system/index.ts'
import * as StdCardWidgets from '../../../web/src/assets/definitions/widgets/standard/cards.ts'
import * as StdListItemWidgets from '../../../web/src/assets/definitions/widgets/standard/listitems.ts'
import * as StdCellWidgets from '../../../web/src/assets/definitions/widgets/standard/cells.ts'
import * as LayoutWidgets from '../../../web/src/assets/definitions/widgets/layout/index.ts'
import * as PlanWidgets from '../../../web/src/assets/definitions/widgets/plan/index.ts'
import * as MapWidgets from '../../../web/src/assets/definitions/widgets/map/index.ts'
import { OhChartPageDefinition } from '../../../web/src/assets/definitions/widgets/chart/page.ts'
import ChartWidgetsDefinitions from '../../../web/src/assets/definitions/widgets/chart/index.ts'
import { OhLocationCardParameters, OhEquipmentCardParameters, OhPropertyCardParameters } from '../../../web/src/assets/definitions/widgets/home/index.ts'

const widgetLibraries = {
  SystemWidgets,
  StdCardWidgets,
  StdListItemWidgets,
  StdCellWidgets,
  LayoutWidgets,
  PlanWidgets,
  MapWidgets,
  ChartWidgets: {
    OhChartPageDefinition,
    ...ChartWidgetsDefinitions
  },
  HomePageWidgets: {
    OhLocationCardParameters,
    OhEquipmentCardParameters,
    OhPropertyCardParameters
  }
}

// console.log(widgetLibraries)

let index = fs.readFileSync('./index.md', 'utf8')

const replaceBetweenComments = (commentTag, text, value) => {
  const regexp = new RegExp('(<!-- \\\w* ' + commentTag + ' -->\r?\n)[\\\s\\\S]*(\r?\n<!-- \\\w* \\\/' + commentTag + ' -->)', 'm')
  // console.log(regexp)
  // console.log(regexp.test(text))
  return text.replace(regexp, '$1' + value + '$2')
}

const escapeQuotes = (text) => {
  if (text !== undefined) {
    return text.toString().replace(/"/g, "&quot;");
  }
  return text
}

const buildProp = (prop) => {
  let ret = ''
  ret += '<PropBlock type="' + escapeQuotes(prop.type) + '" '
  if (prop.name) ret += 'name="' + escapeQuotes(prop.name) + '" '
  if (prop.label) ret += 'label="' + escapeQuotes(prop.label) + '" '
  if (prop.required) ret += 'required="true" '
  if (prop.context) ret += 'context="' + escapeQuotes(prop.context) + '" '
  ret = ret.trim() + '>\n'

  if (prop.description) {
    ret += '  <PropDescription>\n'
    ret += '    ' + prop.description + '\n'
    ret += '  </PropDescription>\n'
  }

  if (prop.options) {
    ret += '  <PropOptions'
    if (prop.multiple) ret += ' multiple="true"'
    ret += '>\n'
    prop.options.forEach((o) => {
      ret += '    <PropOption value="' + (escapeQuotes(o.value) || '(empty)') + '" label="' + escapeQuotes(o.label) + '" />\n'
    })
    ret +='  </PropOptions>\n'
  }

  ret += '</PropBlock>\n'
  return ret
}

const buildProps = (component) => {
  let ret = ''
  const propsWithoutGroup = component.props.parameters.filter((p) => p.groupName === undefined)
  if (propsWithoutGroup.length) {
    ret += '### General\n'
    ret += '<div class="props">\n<PropGroup label="General">\n'
    propsWithoutGroup.forEach((p) => ret += buildProp(p))
    ret += '</PropGroup>\n</div>\n\n'
  }
  if (component.props.parameterGroups) {
    component.props.parameterGroups.forEach((g) => {
      ret += '### ' + g.label + '\n'
      ret += '<div class="props">\n<PropGroup name="' + escapeQuotes(g.name) + '" label="' + escapeQuotes(g.label) + '">\n'
      if (g.description) ret += '  ' + g.description + '\n'
      const propsInGroup = component.props.parameters.filter((p) => p.groupName === g.name)
      propsInGroup.forEach((p) => ret += buildProp(p))
      ret += '</PropGroup>\n</div>\n\n'
    })
  }
  return ret
}

const processComponent = (component, name) => {
  const componentType = component.name || name
  console.log(componentType)
  const targetFile = '../' + componentType + '.md'
  const sourceFile = fs.existsSync(targetFile) ? targetFile : './component.md'
  let doc = fs.readFileSync(sourceFile, 'utf8')
  let final = doc
  final = final.replace(/\{componentType\}/g, componentType)
  final = final.replace(/\{componentLabel\}/g, component.label)
  final = final.replace(/\{componentDescription\}/g, component.description || 'Reference documentation for the ' + componentType + ' component')
  final = replaceBetweenComments('componentDescription', final, component.description || '')
  final = replaceBetweenComments('props', final, buildProps(component))
  // final = final.replace(/\{componentDescription\}/g, component.description || '')
  // final = final.replace(/\{props\}/g, buildProps(component))
  fs.writeFileSync('../' + componentType + '.md', final)
}

Object.keys(widgetLibraries).forEach((l) => {
  const library = widgetLibraries[l]
  let table = ''
  Object.keys(library).forEach((w) => {
    const widget = (typeof library[w] === 'function') ? library[w]() : library[w]
    const widgetName = widget.name || w
    if (widgetName.indexOf('oh-') < 0) return
    table += '| [`' + widgetName + '`](./' + widgetName + '.html) |  [' + widget.label + '](./' + widgetName + '.html) | ' + (widget.description || '') + ' |\n'
    processComponent(widget, w)

    if (!fs.existsSync('..\\images\\' + widget.name)) fs.mkdirSync('..\\images\\' + widget.name)
    //if (!fs.existsSync('..\\code\\' + widget.name)) fs.mkdirSync('..\\code\\' + widget.name)

  })
  index = index.replace('{' + l + '}', table)

  if (l === 'StdCardWidgets') {
    const additionalLines = '\nAll cards are based on the [`oh-card`](./oh-card.html) component and share the same config options for modifying the card\'s appearance.\n' +
      'Refer to the [`oh-card` Style](./oh-card.html#style) documentation to learn about card styling options.'
    index = index.replace(table, table + additionalLines)
  }
})

fs.writeFileSync('../index.md', index)
