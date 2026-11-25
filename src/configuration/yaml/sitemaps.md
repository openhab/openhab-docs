---
layout: documentation
title: YAML Sitemaps
---

# YAML Sitemaps

This page describes the `sitemaps` element for [YAML Configuration](./).

## Sitemaps

The `sitemaps` top-level key contains a map of sitemaps, defined by their sitemap name.

### YAML Definition Syntax

```yaml
sitemaps:
  <sitemapName>:
    label: <sitemap label>
    icon: <sitemap icon>
    widgets:
     - type: <widget type> # mandatory
       label: <widget label>
       item: <item> # required for specific widget types
       icon: <widget icon>
       widgets: # for widget types with nested widgets
        - type: <widget type>
          ...
```

- `<sitemapName>`: The unique sitemap name used as the reference to select a sitemap in the UI.
- `<sitemap label>`: Label for the sitemap.
- `<sitemap icon>`: Icon for the sitemap.
- `widgets`: The list of widgets on the sitemap.
  Widgets can be nested for specific widget types.
  See [Supported Widget Types](#supported-widget-types) below.

### Supported Widget Types

YAML sitemaps support the following widget types:

| Widget Types             | Description                                                                               |
|--------------------------|-------------------------------------------------------------------------------------------|
| `Buttongrid`             | Renders a grid containing buttons.                                                        |
| `Button`                 | Renders a button inside a Buttongrid that is used to send commands to a given Item.       |
| `Chart`                  | Adds a time-series chart object for [persisted](persistence.html) data.                   |
| `Colorpicker`            | Allows the user to choose a color from a color wheel.                                     |
| `Colortemperaturepicker` | Allows the user to choose a color temperature from a white color gradient.                |
| `Default`                | Renders an Item in the default UI representation specified by the type of the given Item. |
| `Frame`                  | Establishes an area containing various other Sitemap elements.                            |
| `Group`                  | Concentrates all elements of a given group in a nested block.                             |
| `Image`                  | Renders an image given by an URL.                                                         |
| `Input`                  | Renders an input field for text or numbers.                                               |
| `Mapview`                | Displays an OSM map based on a given Location Item.                                       |
| `Selection`              | Provides a dropdown or modal popup presenting values to choose from for an Item.          |
| `Setpoint`               | Renders a value between an increase and a decrease buttons.                               |
| `Slider`                 | Presents a value in a progress-bar-like slider.                                           |
| `Switch`                 | Renders an Item as an ON/OFF or multi-button switch.                                      |
| `Text`                   | Renders an Item as text.                                                                  |
| `Video`                  | Displays a video stream, given a direct URL.                                              |
| `Webview`                | Displays the content of a webpage.                                                        |
| `Sitemap`                | Renders a referenced sitemap nested into the current sitemap.                             |

## Widgets

Every widget is a map with a mandatory `type` key.
The following keys are common to all widget types:

| Key          | Description                                                                 | See                                        |
|--------------|-----------------------------------------------------------------------------|--------------------------------------------|
| `type`       | The widget type, see [Supported Widget Types](#supported-widget-types)      |                                            |
| `item`       | The name of the Item linked to the widget                                   | [Item](#item)                              |
| `label`      | The label, optionally with a state format and label/value colors            | [Label](#label)                            |
| `icon`       | The icon, optionally static, dynamic or colored                             | [Icon](#icon)                              |
| `visibility` | Rules to dynamically show or hide the widget                                | [Visibility](#visibility)                  |
| `widgets`    | Nested widgets, only for `Frame`, `Text`, `Group`, `Buttongrid` and `Image` |                                            |

### Item

```yaml
item: <itemName>
```

The `item` key contains the name of the Item to link to the widget.
It is mandatory for most widget types, optional for `Frame`, `Text`, `Image`, `Video`, `Webview` and `Sitemap`, and not supported for `Buttongrid`.

```yaml
- type: Switch
  item: LR_CeilingLight
```

### Label

The `label` key can be written in a short form (a plain string) or in a long form (a map).

#### Short Form

```yaml
label: <label text> [<state format>]
```

The short form uses the same syntax as the DSL `label` parameter.
A state format between square brackets at the end of the string is split off as the state format.

```yaml
- type: Text
  item: Livingroom_Temperature
  label: Livingroom # overrides only the text, keeps the state format from the Item
- type: Text
  item: Livingroom_Temperature
  label: Livingroom [] # overrides the text and hides the state
- type: Text
  item: Livingroom_Temperature
  label: Livingroom [%.1f °C] # overrides the text and the state format
```

#### Long Form

```yaml
label:
  label: <label text>
  format: <state format>
  labelColor: <color or color rules>
  valueColor: <color or color rules>
```

All keys are optional.

- `label`: The label text, without state format.
- `format`: The state format, without the enclosing square brackets.
  Use an empty string (`format: ""`) to hide the state.
  A value starting with `%` must be quoted.
  See [State Presentation]({{base}}/configuration/items.html#state-presentation) for the supported patterns and transformations.
- `labelColor`: The color of the label text.
- `valueColor`: The color of the state.

`labelColor` and `valueColor` accept:

- a single color, applied unconditionally: `labelColor: green`
- a single [rule](#conditional-rules), with the color as `value`
- a list of rules, evaluated in order; the first matching rule determines the color

See [Label, Value and Icon Colors]({{base}}/ui/sitemaps.html#label-value-and-icon-colors) for the available colors.
A color defined as a hex code must be quoted, as `#` starts a comment in YAML: `valueColor: "#334455"`.

```yaml
- type: Text
  item: Temperature
  label:
    label: Livingroom
    format: "%.1f °C"
    labelColor: blue
    valueColor:
      - operator: ">="
        argument: "25"
        value: orange
      - operator: ">="
        argument: "15"
        value: green
      - value: blue # default when no previous rule matches
```

### Icon

The `icon` key can also be written in a short form (a plain string) or in a long form (a map).

#### Short Form

```yaml
icon: <icon>
```

The short form sets an icon name.
For openHAB icons, the icon will be dynamic, i.e. it will change with the state of the linked Item (see [Icons]({{base}}/configuration/items.html#icons)).
This corresponds to the DSL `icon` parameter.

```yaml
icon: light
icon: material:home
icon: oh:classic:temperature
```

An icon reference contains at most 3 segments separated by a colon (`<source>:<set>:<name>`).

#### Long Form

```yaml
icon:
  name: <icon or icon rules>
  static: true|false
  color: <color or color rules>
```

All keys are optional.

- `name`: The icon, either
  - a single icon name,
  - a single [rule](#conditional-rules), with the icon as `value`,
  - a list of rules, evaluated in order; the first matching rule determines the icon.
- `static`: If `true`, the icon is not made dynamic based on the state of the linked Item.
  This corresponds to the DSL `staticIcon` parameter.
  It is only relevant when `name` is a single icon name.
- `color`: The icon color.
  It accepts the same values as `labelColor` and `valueColor` in the [label](#long-form) definition.

```yaml
# Static icon, equivalent to DSL: staticIcon=temperature
icon:
  name: temperature
  static: true

# Icon color without changing the default icon
icon:
  color: red

# Conditional icon, equivalent to DSL:
# icon=["UP"=f7:arrowtriangle_up, "DOWN"=f7:arrowtriangle_down, f7:arrowtriangle_right]
icon:
  name:
    - argument: UP
      value: f7:arrowtriangle_up
    - argument: DOWN
      value: f7:arrowtriangle_down
    - value: f7:arrowtriangle_right
```

### Conditional Rules

The `labelColor`, `valueColor`, icon `name`, icon `color`, `visibility` and `confirmCmd` keys can contain conditional rules.
These are the YAML representation of the rules described in [Dynamic Sitemaps]({{base}}/ui/sitemaps.html#dynamic-sitemaps).

A rule with a single condition is a map:

```yaml
item: <itemName>     # optional, defaults to the widget's item
operator: <operator> # optional, defaults to ==
argument: <value>    # the value to compare the Item state with
value: <result>      # the color, icon or message to use when the condition is true
```

A rule with multiple conditions, which must all be true, uses the `and` key:

```yaml
and:
  - item: <itemName>
    operator: <operator>
    argument: <value>
  - item: <itemName>
    operator: <operator>
    argument: <value>
value: <result>
```

Notes:

- A rule can be given as a single map, or as a list of maps.
  In a list, rules are evaluated from top to bottom and the first matching rule wins (OR semantics).
- A rule with only a `value` and no condition always matches.
  Put it last in a list to define a default.
- Valid operators are `==`, `!=`, `<`, `>`, `<=` and `>=`.
  `!=`, `>` and `>=` must be quoted, as `!` and `>` have a special meaning at the start of a YAML value.
- Quote arguments such as `"ON"`, `"OFF"` or numbers to make sure they are read as strings.
- String comparisons are case sensitive.

### Visibility

```yaml
visibility: <rule or list of rules>
```

`visibility` uses [conditional rules](#conditional-rules) without `value`.
The widget is shown if any of the rules is true.
If no `visibility` is defined, the widget is always shown.

```yaml
# DSL: visibility=[Battery_Level<30]
visibility:
  item: Battery_Level
  operator: "<"
  argument: "30"

# DSL: visibility=[Day_Time=="Morning", Day_Time=="Afternoon", Temperature>19]
visibility:
  - item: Day_Time
    argument: Morning
  - item: Day_Time
    argument: Afternoon
  - item: Temperature
    operator: ">"
    argument: "19"

# DSL: visibility=[Day_Time=="Morning" AND Temperature>19]
visibility:
  and:
    - item: Day_Time
      argument: Morning
    - item: Temperature
      operator: ">"
      argument: "19"
```

### Command Confirmation

```yaml
confirmCmd: true | <message> | <rule or list of rules>
```

`confirmCmd` is supported for widget types that can send a command: `Switch`, `Slider`, `Selection`, `Setpoint`, `Colorpicker`, `Colortemperaturepicker`, `Button`, `Input` and `Default`.
See [Command Confirmation Dialog]({{base}}/ui/sitemaps.html#command-confirmation-dialog) for the behavior.

```yaml
# Always confirm with the default message, DSL: confirmCmd=true
confirmCmd: true

# Always confirm with a custom message, DSL: confirmCmd=[="Shall I do this?"]
confirmCmd: Shall I do this?

# Confirm with the default message when the current state is not ON, DSL: confirmCmd=[!= ON]
confirmCmd:
  operator: "!="
  argument: "ON"

# Confirm with a custom message, DSL: confirmCmd=[!= ON="Should I turn it on?"]
confirmCmd:
  operator: "!="
  argument: "ON"
  value: Should I turn it on?
```

### Mappings

```yaml
mappings:
  - command: <command>
    releaseCommand: <command> # optional
    label: <label>
    icon: <icon>              # optional
```

`mappings` is supported for `Switch` and `Selection` widgets, see [Mappings]({{base}}/ui/sitemaps.html#mappings).
`releaseCommand` enables press and release behavior and is only applicable to `Switch` widgets.

```yaml
# DSL: mappings=[ON="Mic On"=material:mic, OFF="Mic Off"=material:mic_off]
mappings:
  - command: "ON"
    label: Mic On
    icon: material:mic
  - command: "OFF"
    label: Mic Off
    icon: material:mic_off

# DSL: mappings=[ON:OFF="On"]
mappings:
  - command: "ON"
    releaseCommand: "OFF"
    label: "On"
```

### Widget Specific Keys

Besides the common keys, the following keys are supported per widget type.
Most keys have the same name and meaning as the corresponding [DSL parameters]({{base}}/ui/sitemaps.html#element-types); the differences are listed below the table.

| Widget Type              | Mandatory Keys                         | Optional Keys                                                                                  |
|--------------------------|----------------------------------------|------------------------------------------------------------------------------------------------|
| `Frame`                  |                                        | `item`                                                                                         |
| `Buttongrid`             |                                        |                                                                                                |
| `Button`                 | `item`, `row`, `column`, `command`     | `releaseCommand`, `stateless`, `confirmCmd`                                                    |
| `Group`                  | `item`                                 |                                                                                                |
| `Text`                   |                                        | `item`                                                                                         |
| `Switch`                 | `item`                                 | `mappings`, `confirmCmd`                                                                       |
| `Selection`              | `item`                                 | `mappings`, `confirmCmd`                                                                       |
| `Setpoint`               | `item`                                 | `min`, `max`, `step`, `confirmCmd`                                                             |
| `Slider`                 | `item`                                 | `min`, `max`, `step`, `switchSupport`, `releaseOnly`, `confirmCmd`                             |
| `Colorpicker`            | `item`                                 | `confirmCmd`                                                                                   |
| `Colortemperaturepicker` | `item`                                 | `min`, `max`, `confirmCmd`                                                                     |
| `Input`                  | `item`                                 | `hint`, `confirmCmd`                                                                           |
| `Default`                | `item`                                 | `height`, `confirmCmd`                                                                         |
| `Image`                  |                                        | `item`, `url`, `refresh`                                                                       |
| `Video`                  | `url`                                  | `item`, `encoding`                                                                             |
| `Chart`                  | `item`, `period`                       | `refresh`, `service`, `legend`, `forceAsItem`, `yAxisDecimalPattern`, `interpolation`          |
| `Mapview`                | `item`                                 | `height`                                                                                       |
| `Webview`                | `url`                                  | `item`, `height`                                                                               |
| `Sitemap`                |                                        | `item`, `name`                                                                                 |

Differences with the DSL syntax:

| DSL                         | YAML                                    | Notes                                                              |
|-----------------------------|-----------------------------------------|--------------------------------------------------------------------|
| `minValue`, `maxValue`      | `min`, `max`                            |                                                                    |
| `inputHint`                 | `hint`                                  | One of `text`, `number`, `date`, `time`, `datetime`                |
| `click`, `release`          | `command`, `releaseCommand`             | `Button` widget                                                    |
| `forceasitem`               | `forceAsItem`                           |                                                                    |
| `switchSupport`, `releaseOnly`, `stateless` | `switchSupport: true`, `releaseOnly: true`, `stateless: true` | Flags without value in DSL are booleans in YAML |
| `staticIcon=<icon>`         | `icon: {name: <icon>, static: true}`    | See [Icon](#icon)                                                  |
| `labelcolor`, `valuecolor`  | `label.labelColor`, `label.valueColor`  | See [Label](#label)                                                |
| `iconcolor`                 | `icon.color`                            | See [Icon](#icon)                                                  |
| `buttons=[...]`             | not supported                           | Use nested `Button` widgets in a `Buttongrid`                      |

## Example

```yaml
version: 1
sitemaps:
  demo:
    label: Demo Sitemap
    widgets:
      - type: Frame
        label: Demo Items
        widgets:
          - type: Text
            item: DemoContact
            label:
              label: Contact
              format: MAP(en.map):%s
              labelColor: green
              valueColor: blue
            icon:
              color: red
          - type: Text
            item: DemoString
            label:
              label: Message
              format: '%s'
            widgets:
              - type: Default
                item: DemoSwitch
                label: Default widget
              - type: Default
                item: DemoLocation
                height: 10
          - type: Text
            item: DemoDateTime
            label:
              label: Date
              format: "%1$tA, %1$td.%1$tm.%1$tY"
              labelColor:
                item: DemoSwitch
                argument: "ON"
                value: blue
              valueColor:
                item: DemoSwitch
                argument: "OFF"
                value: green
            icon:
              name: material:home
              color:
                item: DemoSwitch
                argument: "ON"
                value: red
          - type: Group
            item: DemoSwitchGroup
      - type: Frame
        label: Switch & Selection
        widgets:
          - type: Switch
            item: DemoSwitch
          - type: Switch
            item: DemoSwitch
            mappings:
              - command: "ON"
                label: "On"
              - command: "OFF"
                label: "Off"
          - type: Switch
            item: DemoSwitch
            mappings:
              - command: "ON"
                label: "On"
                icon: switch-on
              - command: "OFF"
                label: "Off"
                icon: switch-off
          - type: Selection
            item: DemoSwitch
            label: Test Selection
            icon: switch
            mappings:
              - command: "ON"
                label: Switch ON
              - command: "OFF"
                label: Switch OFF
          - type: Switch
            item: DemoSwitch
            label: Button with release
            mappings:
              - command: "ON"
                releaseCommand: "OFF"
                label: Switch ON
      - type: Frame
        label: "Input, Slider & Setpoinnt"
        widgets:
          - type: Input
            item: DemoNumber
            label: Test Input
          - type: Input
            item: DemoNumber
            hint: number
          - type: Text
            item: DemoNumber
            label:
              label: Test Text
              format: '%d'
              labelColor:
                - and:
                    - operator: <
                      argument: "50"
                    - item: DemoSwitch
                      operator: ==
                      argument: "ON"
                  value: green
                - operator: <=
                  argument: "75"
                  value: orange
                - value: blue
              valueColor:
                - and:
                    - operator: <
                      argument: "50"
                    - item: DemoSwitch
                      operator: ==
                      argument: "ON"
                  value: blue
                - operator: <=
                  argument: "75"
                  value: red
                - value: green
            icon:
              name: material:settings
              color:
                - and:
                    - operator: <
                      argument: "50"
                    - item: DemoSwitch
                      operator: ==
                      argument: "ON"
                  value: red
                - operator: <=
                  argument: "75"
                  value: green
                - value: violet
              static: true
          - type: Slider
            item: DemoNumber
            label: Test Slider
            icon:
              name: oh:classic:Garden
              static: true
          - type: Slider
            item: DemoNumber
            icon: oh:classic:Garage
            switchSupport: true
          - type: Slider
            item: DemoNumber
            icon:
              name:
                - item: DemoSwitch
                  operator: ==
                  argument: "ON"
                  value: material:home
                - value: material:favorite
              color: blue
            releaseOnly: true
          - type: Slider
            item: DemoNumber
            min: 25
            max: 75
            step: 5
          - type: Setpoint
            item: DemoNumber
            label: Test Setpoint
          - type: Setpoint
            item: DemoNumber
            min: 25
            max: 75
            step: 5
      - type: Frame
        label: Colorpicker & Colortemperaturepicker
        widgets:
          - type: Colorpicker
            item: DemoColor
          - type: Colortemperaturepicker
            item: DemoColorTemp
            label: Test Colortemperaturepicker
          - type: Colortemperaturepicker
            item: DemoColorTemp
            min: 3000
            max: 5000
      - type: Frame
        label: Image & chart & Video
        widgets:
          - type: Image
            item: DemoImage
            label: Test Image
            url: https://raw.githubusercontent.com/wiki/openhab/openhab/images/features.png
          - type: Image
            url: https://raw.githubusercontent.com/wiki/openhab/openhab/images/features.png
            refresh: 600000
          - type: Chart
            item: DemoNumber
            label: Test Chart
            period: 12h
          - type: Chart
            item: DemoNumber
            refresh: 10000
            period: D
            service: rrd4j
            legend: false
            forceAsItem: true
            yAxisDecimalPattern: "#.##E0"
            interpolation: linear
          - type: Video
            label: Test Video
            url: https://demo.openhab.org/Hue.m4v
          - type: Video
            url: https://demo.openhab.org/Hue.m4v
            encoding: hls
      - type: Frame
        label: Buttongrid
        widgets:
          - type: Buttongrid
            widgets:
              - type: Button
                item: DemoString
                label: Go Home
                icon: material:home
                row: 2
                column: 2
                command: HOME
              - type: Button
                item: DemoSwitch
                label: "Off"
                icon: switch-off
                row: 1
                column: 1
                command: "ON"
                stateless: true
                visibility:
                  item: DemoSwitch
                  operator: '!='
                  argument: "ON"
              - type: Button
                item: DemoSwitch
                label: "On"
                icon: switch-on
                row: 1
                column: 1
                command: "OFF"
                stateless: true
                visibility:
                  item: DemoSwitch
                  operator: ==
                  argument: "ON"
              - type: Button
                item: DemoString
                label: Start
                row: 1
                column: 2
                command: START
                stateless: true
              - type: Button
                item: DemoString
                label: Stop
                row: 1
                column: 3
                command: STOP
                stateless: true
      - type: Frame
        label: Magic Test Items
        widgets:
          - type: Colorpicker
            item: MagicColor
          - type: Switch
            item: MagicOnOff
          - type: Slider
            item: MagicDimmer
      - type: Frame
        label: Location
        widgets:
          - type: Mapview
            item: DemoLocation
            visibility:
              item: DemoSwitch
              operator: ==
              argument: "ON"
          - type: Mapview
            item: DemoLocation
            label: Test Mapview
            height: 10
            visibility:
              and:
                - item: DemoSwitch
                  operator: '!='
                  argument: "ON"
                - item: DemoNumber
                  operator: <
                  argument: "100"
      - type: Frame
        label: WEB
        widgets:
          - type: Webview
            url: https://www.openhab.org/
            visibility:
              item: DemoSwitch
              operator: ==
              argument: "ON"
          - type: Webview
            label: Test Webview
            height: 15
            url: https://www.openhab.org/
            visibility:
              - item: DemoSwitch
                operator: '!='
                argument: "ON"
              - item: DemoNumber
                operator: <
                argument: "100"
```
