---
layout: documentation
title: YAML Configuration
---

# YAML Configuration

openHAB provides a modular configuration system that allows supported entities (objects such as Things, Items, etc.) to be defined in one or more YAML files.
The primary directory for these configuration files is `$OPENHAB_CONF/yaml/` and both `.yaml` and `.yml` file extensions are supported.
Files may be further structured within subdirectories, offering flexibility in organizing configurations.

[[toc]]

## General Structure

Top-level entries in the YAML file must be unique key-value maps with the following valid keys in no particular order:

| Key                                  | Object Type                                                                             |
|:-------------------------------------|:----------------------------------------------------------------------------------------|
| `version`                            | A mandatory key that contains the file-version. The currently supported version is `1`. |
| [things](#things)                    | openHAB [Things]({{base}}/concepts/things.html)                                         |
| [items](#items)                      | openHAB [Items]({{base}}/concepts/items.html)                                           |
| [tags](#tags)                        | Custom Semantic Tags                                                                    |
| [variables](#variable-substitutions) | Variables for Substitutions                                                             |
| [packages](#packages)                | Packages                                                                                |
| [.hiddenkeys](#hidden-keys)          | Top-level keys starting with a dot (`.`) are not included in the final YAML.            |

The YAML files in general must follow the standard YAML syntax, with a few openHAB-specific features:

- Each YAML file must contain a `version` key which must be set to `1`.
  YAML files without a valid `version` key will be ignored.
- Comments are allowed, either on its own line, or at the end of the line of an existing element.
- Blank lines are allowed.

::: tip Note:

Only unquoted `true` and `false` (case insensitive) are valid `boolean` values.
`ON`, `OFF`, `Yes`, `No`, `disable`, and `enable` are parsed as plain strings.
To specify `true` or `false` as a string, they must be enclosed in single or double quotes.

:::

Notes about entities:

- Entities may be distributed across multiple files; however, each entity must be fully defined within a single file and uniquely identified across all loaded YAML files.
  For example, Item A can be defined in file1.yaml and Item B in file2.yaml, but Item A must not be defined again in file2.yaml.
  If duplicates exist, the definition from the first loaded file takes precedence.
- For convenience, YAML files placed in `$OPENHAB_CONF/items/`, `$OPENHAB_CONF/things/`, and `$OPENHAB_CONF/tags/` are also recognized and processed by openHAB.
  Unlike the DSL files, YAML files in these directories are not limited to a specific object type—they can contain any supported entities (Things, Items, Tags, etc.).
  For example, a file like `$OPENHAB_CONF/items/myitems.yaml` may define Things and Tags in addition to Items, or even exclusively contain other entities.
  To avoid confusion and maintain clarity, it is recommended to place YAML files containing a mix of different entity types in the `$OPENHAB_CONF/yaml/` directory.

### A Quick Example

```yaml
version: 1

# All the top-level sections below are optional and may appear in any order

tags:
  Equipment_Curtain:
    label: Curtain

  Location_Indoor_Room_HomeCinemaRoom:
    label: Home Cinema Room
    description: The room containing my home cinema system
    synonyms:
      - Home theater room
      - TV room
      - Movie room

things:
  lgwebos:WebOSTV:3aab9eea-953b-4272-bdbd-f0cd0ecf4a46:
    config:
      host: 192.168.2.119
      key: 6ef1dff6c7c936c8dc5056fc85ea3aef
      macAddress: 3c:cd:93:c2:20:e0

items:
  TV_Power:
    type: Switch
    label: TV Power
    icon: television
    autoupdate: false
    channel: lgwebos:WebOSTV:3aab9eea-953b-4272-bdbd-f0cd0ecf4a46:power

  TV_Volume:
    type: Dimmer
    label: Volume # Label must not contain a format pattern
    format: "%d" # Values starting with a percent sign must be quoted
    channel: lgwebos:WebOSTV:3aab9eea-953b-4272-bdbd-f0cd0ecf4a46:volume
```

## Object Configuration Structure

### Things

The `things` top-level key contains a map of Things, defined by their Thing UID.

#### Thing YAML definition syntax:

```yaml
things:
  <thing_uid>:
    isBridge: true|false
    bridge: <bridge_uid>
    label: <Thing label>
    location: <Location>
    config:
      <config key>: <config value>
    channels: # To set channel config or define custom channels
      <channel_id>:
        type: <channel type>
        kind: state|trigger # Default: state
        itemType: <item type>
        itemDimension: <item dimension> # Only if itemType is "Number"
        label: <channel label>
        description: <description>
        config:
          <channel config key>: <config value>
```

| Key           | Description                                                                                                                                     |
|:--------------|:------------------------------------------------------------------------------------------------------------------------------------------------|
| `<thing_uid>` | The UID of the Thing or Bridge being defined. The UID format is `<binding_id>:<thing_type_id>:[<bridge_id>:]<thing_id>`, e.g. `astro:sun:home`. |
| `isBridge`    | Whether the entity is a Bridge (`true`) or a Thing (`false`). Default: `false` (a Thing).                                                       |
| `bridge`      | The bridge UID that this Thing belongs to.                                                                                                      |
| `label`       | Thing label.                                                                                                                                    |
| `location`    | The location of the Thing.                                                                                                                      |
| `config`      | A key-value map of the Thing's configuration. Refer to the Binding's documentation for details.                                                 |
| `channels`    | Configure built-in channel parameters, or define custom channels.                                                                               |

Channels Section:

| Key             | Description                                                                                                                                                                          |
|:----------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `<channel_id>`  | The channel ID. It is a single word that when combined with the Thing UID forms the full channel UID.                                                                                |
| `type`          | Channel type as defined by the Binding. When the channel type is defined, `kind`, `itemType`, and `itemDimension` should not be defined because the channel type will override them. |
| `kind`          | Whether it's a `state` channel or a `trigger` channel. Default: `state`                                                                                                              |
| `itemType`      | The item type that this channel can be linked to. It is required when the channel type is not defined.                                                                               |
| `itemDimension` | This may be used to further define a `Number` `itemType`.                                                                                                                            |
| `label`         | Channel label.                                                                                                                                                                       |
| `description`   | Channel description.                                                                                                                                                                 |
| `config`        | A key-value or a key-array-of-values map of the channel's configuration. Refer to the Binding's documentation for details.                                                           |

Example:

```yaml
version: 1

things:
  mqtt:broker:mosquitto:
    isBridge: true
    config:
      host: 192.168.1.1
      lwtMessage: offline
      lwtTopic: openhab/status
      lwtQos: 1
      birthMessage: online
      birthTopic: openhab/status
      shutdownMessage: offline
      shutdownTopic: openhab/status
      enableDiscovery: false

  mqtt:topic:bedroom1-switch:
    bridge: mqtt:broker:mosquitto
    label: Bed Room1 Switch
    config:
      availabilityTopic: bedroom1-switch/status
      payloadAvailable: online
      payloadNotAvailable: offline
    channels:
      switch1:
        type: switch
        config:
          stateTopic: bedroom1-switch/switch/switch1/state
          commandTopic: bedroom1-switch/switch/switch1/command
      button1:
        type: string
        config:
          stateTopic: bedroom1-switch/button1
          postCommand: true
      statusled:
        type: switch
        config:
          stateTopic: bedroom1-switch/light/status_led/state
          commandTopic: bedroom1-switch/light/status_led/command
          transformationPattern:
            - JSONPATH:$.state
          formatBeforePublish: '{"state": "%s"}' # This needs to be quoted to be parsed as a string
                                                 # because YAML interprets {} as a map object

  # Example to configure a built-in channel
  astro:sun:home:
    config:
      geolocation: 52.5200066,13.4049540,100
      interval: 60
    channels:
      rise#event:
        type: rangeEvent
        config:
          offset: -30
```

### Items

The `items` top-level key contains a map of Items, defined by their item name.

#### Item YAML definition syntax:

```yaml
items:
  <ItemName>:
    type: <item type> # mandatory
    dimension: <item dimension> # Only if item type is "Number"
    group: # To further configure a Group item. Only if item type is "Group"
      type: <GroupItem type>
      dimension: <GroupItem dimension> # Only if the group type is "Number"
      function: <Group function> # Example: AND
      parameters: <List of group function parameters> # Example: [ON, OFF]
    label: labeltext
    icon: iconname
    groups:
      - group1
      - group2
    tags:
      - tag1
      - tag2
    format: <format pattern> # short form for state description's pattern metadata
    unit: <unit> # short form for the unit metadata
    autoupdate: true|false # short form for the autoupdate metadata
    channel: <channel_uid> # short form to link to a single channel
    channels: # long form to link to multiple channels or to add link config
      <channel_uid>:
        # the item-channel link configuration (e.g. profile) is defined here as a key-value map
        <config key>: <config value>
    metadata:
      <metadata_key>:
        value: <metadata value>
        config:
          <config key>: <config value>
```

| Key          | Description                                                                                                                                                                                                                                                                             |
|:-------------|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `<ItemName>` | The unique name to refer to the item, e.g. in rules. The item name must start with an alphabet or underscore (`A`-`Z`, `a`-`z`, or `_`), optionally followed by one or more alphabet, underscore or digits (`0`-`9`). It is checked against the regex pattern `[a-zA-Z_][a-zA-Z0-9_]*`. |
| `type`       | Valid [item type]({{base}}/configuration/items.html#type) (mandatory, case-insensitive).                                                                                                                                                                                                |
| `dimension`  | For dimensioned `Number` items, the `item type` must be set to just `Number`, and the dimension is set separately using this key. Valid dimensions are listed under the **Type** column in the [List of Units]({{base}}/concepts/units-of-measurement.html#list-of-units) table.        |
| `group`      | This key allows defining the group type, dimension and function. For more details, see [Derive Group State from Member Items]({{base}}/configuration/items.html#derive-group-state-from-member-items).                                                                                  |
| `label`      | Item label. Unlike the DSL syntax in an `.items` file, the label here must only contain the label without any formatting syntax.                                                                                                                                                        |
| `icon`       | The item's [icon]({{base}}/configuration/items.html#icons). The syntax is described in [icon-sources]({{base}}/configuration/items.html#icon-sources).                                                                                                                                  |
| `groups`     | The list of parent group names.                                                                                                                                                                                                                                                         |
| `tags`       | The list of tags. This can contain both semantic tags and non-semantic tags.                                                                                                                                                                                                            |
| `format`     | A short form for the `stateDescription` → `pattern` metadata, equivalent to the format enclosed in square brackets in the DSL item label. If the pattern begins with a percent sign (`%`), it must be enclosed in single or double quotes to comply with YAML syntax.                   |
| `unit`       | A short form for the `unit` metadata, to define the item's unit.                                                                                                                                                                                                                        |
| `autoupdate` | A short form for the `autoupdate` metadata. Valid values are: `true` or `false`.                                                                                                                                                                                                        |
| `channel`    | A short form for the `channels` list to define a linked channel UID for when there is only one channel with a blank config.                                                                                                                                                             |
| `channels`   | A key-value map to define the channels linked to this item. The key is the channel uid to link to, and the value is the link configuration as a key-value map. When no configuration is required, an empty map `{}` must be used as the value.                                          |
| `metadata`   | A key-value map to define item metadata. The metadata defined in here overrides any short forms when both are specified.                                                                                                                                                                |

Example:

```yaml
version: 1

items:
  lBedroom1:
    type: Group
    label: Bedroom 1
    tags:
      - Bedroom

  BedRoom1_WallSwitch:
    type: Group
    label: Bedroom1 Light Wall Switch
    groups:
      - lBedroom1
    tags:
      - WallSwitch

  BedRoom1_Light_Switch:
    type: Switch
    label: Bedroom1 Light Switch
    icon: switch
    format: '%s'
    groups:
      - BedRoom1_WallSwitch
    tags:
      - Switch
    channel: mqtt:topic:bedroom1-switch:switch1 # short form

  BedRoom1_Light_Button:
    type: String
    label: Bedroom1 Light Button Action
    groups:
      - BedRoom1_WallSwitch
    channels: # long form
      mqtt:topic:bedroom1-switch:button1: {} # No config

  BedRoom1_WallSwitch_StatusLED:
    type: Switch
    groups:
      - BedRoom1_WallSwitch
    channels:
      mqtt:topic:bedroom1-switch:statusled:
        # The configuration of this item-channel link is defined below
        profile: transform:MAP
        function: "|open=ON;closed=OFF" # | is a YAML special character, so enclose it in quotes.
```

::: tip Note:

The last item-channel link in the example above requires some configurations, so it needs to be defined with `channels:` instead of the short form `channel:`.
In this instance, it is configured to use a Profile, specifically a MAP Profile.
The item-channel configuration keys and values depend on which profile is used, and the details can be found in the corresponding profile's documentation.
For example, [MAP Profile]({{base}}/addons/transformations/map/#usage-as-a-profile) requires a `function` parameter.

For more information on Profiles, see:

- [Item-Channel Link Profile]({{base}}/configuration/items.html#profiles)
- [Script Transformation Profile]({{base}}/configuration/transformations.html#script-transformation-profile)
- List of available [transfomation addons](https://www.openhab.org/addons/#transform), most of which support profiles

:::

### Tags

openHAB comes with pre-defined [semantic tags](https://github.com/openhab/openhab-core/blob/main/bundles/org.openhab.core.semantics/model/SemanticTags.csv) that can be readily used.
It is also possible to add custom semantic tags into the system and subsequently use them alongside the built-in tags.

Custom semantic tags can be defined under the `tags` section.

#### Tags YAML Definition Syntax

```yaml
tags:
  <tag_full_uid>:
    label: <tag label>
    description: <tag description>
    synonyms:
      - tag synonym 1
      - tag synonym 2
```

Each tag is specified with the tag's full UID as the key.
The rest are optional.

| Key              | Description                                                                                                                                 |
|:-----------------|:--------------------------------------------------------------------------------------------------------------------------------------------|
| `<tag_full_uid>` | The tag's full UID. See below for more details.                                                                                             |
| `label`          | The tag's label in the local language for display and context interpretation purposes. This may be used to define the tag name with spaces. |
| `description`    | A longer description for the tag.                                                                                                           |
| `synonyms`       | A _list_ containing one or more synonyms for the tag's label.                                                                               |

##### `tag_full_uid`

To define a custom tag named `TagName`, you must use its full UID format: `Root[_IntermediateParent...]_TagName`.

This format outlines the tag's position within the semantic hierarchy:

- Each segment is separated by an underscore (`_`)
- The Root segment must be one of: `Location`, `Equipment`, `Point`, or `Property`
- Zero or more `IntermediateParent` segments may follow — each representing a nested parent within the hierarchy
- The final segment is the `TagName`, which must:
  - Begin with a capital letter
  - Contain only letters and numbers (alphanumeric)

This structure ensures that the tag is uniquely identified and correctly integrated into the semantic model.

Example:

```yaml
version: 1

tags:
  Location_Indoor_Room_HomeCinemaRoom:
    label: Home Cinema Room
    description: The room containing my home cinema system
    synonyms:
      - Home theater room

  Location_Outdoor_Garden_VegetableGarden:
    label: Vegetable Garden

  Property_Height: {} # no label/description/synonyms
```

In the example `Location_Indoor_Room_HomeCinemaRoom`, the semantic tag `HomeCinemaRoom` is nested under `Room`, which itself is a child of `Indoor`, which in turn belongs to the root tag `Location`.

You can have multiple YAML files with different semantic tags but keep semantic tags dependent on each other in the same file.

## YAML Features and Extensions

openHAB supports extensions that enhance the flexibility and usability of YAML configurations.

### Variables and Variable Substitutions

Variables can be defined and referenced within the YAML file and within any [included files](#including-other-files).

#### Variable Definition

Variables are declared in the top-level `variables:` section.
The example below defines three variables:

```yaml
variables:
  broker: mqtt:broker:default
  temperature_unit: °C
  light_expire: 5m,command=OFF
```

YAML files are processed in two passes, so variable references may appear before the `variables:` section.

#### Variable Substitutions

Variable substitutions let you reuse values dynamically within your configuration, reducing duplication and improving maintainability.

##### Syntax

Variables are referenced using the `${...}` syntax.
Several forms are supported:

| Syntax            | Description                                                |
|:------------------|:-----------------------------------------------------------|
| `${var}`          | Inserts the value of var, or an empty string if undefined. |
| `${var-default}`  | Uses default if var is undefined.                          |
| `${var:-default}` | Uses default if var is undefined or empty.                 |
| `${var${nested}}` | Supports nested interpolation up to 10 levels deep.        |

::: tip Notes:

- Substitutions only work in double-quoted or unquoted strings.
- Single-quoted strings are treated as literals and will not be interpolated.
- Substitutions are also performed in key names and in default values, e.g. `${var:-${variable_default}}`.

:::

Example:

```yaml
version: 1

variables:
  broker: mqtt:broker:main
  device_id1: sensor01
  location1: Kitchen
  device_id2: sensor02
  location2: Living Room

things:
  mqtt:topic:${device_id1}:
    label: ${location1} Sensor
    bridge: ${broker}
    config:
      availabilityTopic: ${device_id1}/status

  mqtt:topic:${device_id2}:
    label: ${location2} Sensor
    bridge: ${broker}
    config:
      availabilityTopic: ${device_id2}/status
```

The resulting configuration will resolve to:

```yaml
version: 1

things:
  mqtt:topic:sensor01:
    label: Kitchen Sensor
    bridge: mqtt:broker:main
    config:
      availabilityTopic: sensor01/status

  mqtt:topic:sensor02:
    label: Living Room Sensor
    bridge: mqtt:broker:main
    config:
      availabilityTopic: sensor02/status
```

#### Special Variables

openHAB injects a set of special variables that are automatically available during YAML preprocessing.

Available Special Variables:

| Variable        | Description                                                                                                                                                                                 |
|:----------------|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `__FILE__`      | Absolute path to the current file, e.g. `/path/to/file.inc.yaml`                                                                                                                            |
| `__FILE_NAME__` | The filename portion without the extension or leading path, e.g. `file.inc`                                                                                                                 |
| `__FILE_EXT__`  | The file extension portion of the file name, e.g. `yaml`                                                                                                                                    |
| `__DIRECTORY__` | The directory portion of the current file, e.g. `/path/to`                                                                                                                                  |
| `__DIR__`       | Alias for `__DIRECTORY__`.                                                                                                                                                                  |
| `package_id`    | When used in a package file, automatically resolved to the package key. Only available within `packages:` includes and can be overridden by explicitly specifying it in the `vars` section. |

These variables can be interpolated just like regular ones using `${...}` syntax.
These may be useful when combined with the `!include` directive described below.

### Including Other Files

openHAB supports including external YAML files to facilitate modular, reusable, and maintainable configurations.
This is especially useful for templating, creating device [packages](#packages), or separating concerns across multiple files.

#### Syntax Options

Two syntaxes are supported for the `!include` directive:

##### Simple Syntax

```yaml
keyname: !include filename.inc.yaml
```

Use this when no variable overrides are needed.

##### Full Syntax

```yaml
# Block style (multi-line)
keyname: !include
  file: filename.inc.yaml
  vars:
    var1: value1
    var2: value2

# Or inline style (single-line)
keyname: !include { file: filename.inc.yaml, vars: { var1: value1, var2: value2 } }
```

In the full syntax, the `vars` section is optional.

::: tip Tip:

The values in the `vars` section can be literal values or references to existing variables (defined in the current file or the main file using the `${...}` syntax), allowing you to pass and reuse variables between the main configuration and included files.

:::

The contents of the include file will be inserted as the value for the given key.
This means that the top-level keys in the include file will become sub-keys of the key in the main file.

#### Variable Precedence

When include files are involved, variables can originate from multiple sources. Their values are resolved according to the following precedence:

1. Inline `vars` in `!include` directives (see [Including Other Files](#including-other-files))
1. Global `variables` defined in the main file
1. Local `variables` defined inside the include file

Variables specified in the `vars` section of an `!include` directive are visible only within the included file, but they take precedence over global and local variables.
Local variables, defined inside an include file, can act as "default values" for when they are not defined in the `!include` directive.
This enables included files to act as parameterized templates that can be reused with different values.

Example:

`main.yaml`

```yaml
version: 1

variables:
  broker: mqtt:broker:main

things:
  mqtt:topic:livingroom-window: !include
    file: zigbee_contact.inc.yaml
    vars:
      label: Living Room Window
      id: livingroom-window

  mqtt:topic:bedroom-window: !include
    file: zigbee_contact.inc.yaml
    vars:
      label: Bedroom Window
      id: bedroom-window
      broker: mqtt:broker:external # override the global broker variable
```

`zigbee_contact.inc.yaml`

```yaml
# Template file for a zigbee contact sensor
# Note that the keys start as top-level keys in this file

# ${broker} variable automatically inherits the global variable defined in the main file
# unless overridden by include vars
bridge: ${broker}
label: ${label}
config:
  availabilityTopic: zigbee2mqtt/${id}/availability
  payloadAvailable: '{"state":"online"}'
  payloadNotAvailable: '{"state":"offline"}'
channels:
   contact:
     type: contact
     config:
       stateTopic: zigbee2mqtt/${id}/contact
       "on": "false"
       "off": "true"
   linkquality:
     type: number
     label: Link Quality
     config:
       stateTopic: zigbee2mqtt/${id}/linkquality
   battery:
     type: number
     label: Battery Level
     config:
       stateTopic: zigbee2mqtt/${id}/battery
```

The resulting configuration will resolve to:

```yaml
version: 1

things:
  mqtt:topic:livingroom-window:
    bridge: mqtt:broker:main
    label: Living Room Window
    config:
      availabilityTopic: zigbee2mqtt/livingroom-window/availability
      payloadAvailable: '{"state":"online"}'
      payloadNotAvailable: '{"state":"offline"}'
    channels:
      contact:
        type: contact
        config:
          stateTopic: zigbee2mqtt/livingroom-window/contact
          "on": "false"
          "off": "true"
      linkquality:
        type: number
        label: Link Quality
        config:
          stateTopic: zigbee2mqtt/livingroom-window/linkquality
      battery:
        type: number
        label: Battery Level
        config:
          stateTopic: zigbee2mqtt/livingroom-window/battery

  mqtt:topic:bedroom-window:
    bridge: mqtt:broker:external
    label: Bedroom Window
    config:
      availabilityTopic: zigbee2mqtt/bedroom-window/availability
      payloadAvailable: '{"state":"online"}'
      payloadNotAvailable: '{"state":"offline"}'
    channels:
      contact:
        type: contact
        config:
          stateTopic: zigbee2mqtt/bedroom-window/contact
          "on": "false"
          "off": "true"
      linkquality:
        type: number
        label: Link Quality
        config:
          stateTopic: zigbee2mqtt/bedroom-window/linkquality
      battery:
        type: number
        label: Battery Level
        config:
          stateTopic: zigbee2mqtt/bedroom-window/battery
```

#### File Naming & Reload Behavior

- The file can be specified as an absolute path or as a path relative to the current file.
  It may be helpful to store all include files in a subdirectory, for example, and refer to them with a relative path.
- Use the `.inc.yaml` or `.inc.yml` extension for included files so they aren't loaded as primary configuration files.
- Changes to included files automatically trigger a reload of the primary file.
- File inclusions can be nested, i.e. an include file can include another file.
  For example: `main.yaml` can include `a.inc.yaml`, which in turn can include `b.inc.yaml`, and so on.

### Packages

`!include` helps reduce repetition by inserting reusable YAML fragments into a specific section/key such as `things` or `items`.
Packages extend this concept by allowing multiple top-level sections to be combined into a single reusable file.

#### Purposes

- Packages allow the definition of a Thing and its linked Items to be grouped together in one file, representing a complete device.
- With variable substitutions, a single package file can be reused to define multiple devices that share the same structure.

#### Package Syntax and Structure

Packages are defined under the top-level `packages:` section:

```yaml
packages:
  <package1>: !include
    file: <path/to/package_file>
    vars:
      var1: value1
      var2: value2
  <package2>: !include
    file: <path/to/package_file>
    vars:
      var1: value1
      var2: value2
```

Each entry consists of:

- `package key` (in the above example, package1 and package2): a unique identifier for this package entry.
  It must be unique within the `packages` section.
  You may choose any descriptive name you like, including names with spaces.
  Within the included package file, the special variable `${package_id}` is automatically available and resolves to this package key.
- An `!include` directive pointing to a reusable package file.
  Package files should use an extension such as `.inc.yaml` or `.inc.yml` to prevent them from being loaded as a main YAML file.
  An optional `vars` block can be passed to the included package file to parameterize it.
  Note that this is a part of the `!include` directive, and not a special syntax of packages.
  If needed, the special `package_id` variable can be explicitly overridden by specifying it in the `vars` section.

#### Package File Contents

- Package files may contain a combination of any top-level sections such as `things:` and/or `items:` with one or more entities defined inside them.
- Because package files can be included multiple times, entity UIDs should use variable substitutions to ensure uniqueness.
- Package files must not contain unique top-level keys such as `version:`.
- A package file can include other files.

#### Package Example

`main.yaml`

```yaml
version: 1

variables:
  broker: mqtt:broker:main

packages:
  livingroom-light: !include
    file: templates/mqtt-light.inc.yaml
    vars:
      name: Living_Room_Light
      label: Living Room Light

  # Reuse the same template
  bedroom-light: !include
    file: templates/mqtt-light.inc.yaml
    vars:
      name: Bed_Room_Light
      label: Bed Room Light

# Custom override (optional)
items:
  Bed_Room_Light_Power:
    label: My Bedroom Light Power # scalar values overwrite the package
    tags: [Switch2] # List values will get merged with the package
    channels: # Map values also get merged
      mqtt:topic:bedroom-light:switch2: {}
```

`templates/mqtt-light.inc.yaml`

```yaml
things:
  mqtt:topic:${package_id}:
    bridge: ${broker}
    label: ${label}
    channels:
      power:
        type: switch
        config:
          stateTopic: zigbee2mqtt/${package_id}/state
          commandTopic: zigbee2mqtt/${package_id}/set/state
      brightness:
        type: dimmer
        config:
          stateTopic: zigbee2mqtt/${package_id}/brightness
          commandTopic: zigbee2mqtt/${package_id}/set/brightness
          min: 0
          max: 255
          step: 1
      color_temp:
        type: dimmer
        config:
          stateTopic: zigbee2mqtt/${package_id}/color_temp
          commandTopic: zigbee2mqtt/${package_id}/set/color_temp
          min: 153
          max: 500
          step: 1

items:
  ${name}_Power:
    type: Switch
    label: ${label} Power
    tags: [Switch]
    # This can be done using the short form `channel:`
    # but we're using the `channels:` map here to demonstrate merging
    channels:
      mqtt:topic:${package_id}:power: {}

  ${name}_Brightness:
    type: Dimmer
    label: ${label} Brightness
    tags: [Brightness]
    channel: mqtt:topic:${package_id}:brightness

  ${name}_CT:
    type: Dimmer
    label: ${label} Color Temperature
    tags: [ColorTemperature]
    channel: mqtt:topic:${package_id}:color_temp
```

➡️ Resolves to:

```yaml
version: 1

things:
  mqtt:topic:bedroom-light:
    bridge: mqtt:broker:main
    label: Bed Room Light
    channels:
      power:
        type: switch
        config:
          stateTopic: zigbee2mqtt/bedroom-light/state
          commandTopic: zigbee2mqtt/bedroom-light/set/state
      brightness:
        type: dimmer
        config:
          stateTopic: zigbee2mqtt/bedroom-light/brightness
          commandTopic: zigbee2mqtt/bedroom-light/set/brightness
          min: 0
          max: 255
          step: 1
      color_temp:
        type: dimmer
        config:
          stateTopic: zigbee2mqtt/bedroom-light/color_temp
          commandTopic: zigbee2mqtt/bedroom-light/set/color_temp
          min: 153
          max: 500
          step: 1

  mqtt:topic:livingroom-light:
    bridge: mqtt:broker:main
    label: Living Room Light
    channels:
      power:
        type: switch
        config:
          stateTopic: zigbee2mqtt/livingroom-light/state
          commandTopic: zigbee2mqtt/livingroom-light/set/state
      brightness:
        type: dimmer
        config:
          stateTopic: zigbee2mqtt/livingroom-light/brightness
          commandTopic: zigbee2mqtt/livingroom-light/set/brightness
          min: 0
          max: 255
          step: 1
      color_temp:
        type: dimmer
        config:
          stateTopic: zigbee2mqtt/livingroom-light/color_temp
          commandTopic: zigbee2mqtt/livingroom-light/set/color_temp
          min: 153
          max: 500
          step: 1

items:
  Bed_Room_Light_Power:
    type: Switch
    label: My Bedroom Light Power
    tags:
      - Switch
      - Switch2
    channels:
      mqtt:topic:bedroom-light:power: {}
      mqtt:topic:bedroom-light:switch2: {}
  Bed_Room_Light_Brightness:
    type: Dimmer
    label: Bed Room Light Brightness
    tags: [Brightness]
    channel: mqtt:topic:bedroom-light:brightness
  Bed_Room_Light_CT:
    type: Dimmer
    label: Bed Room Light Color Temperature
    tags: [ColorTemperature]
    channel: mqtt:topic:bedroom-light:color_temp
  Living_Room_Light_Power:
    type: Switch
    label: Living Room Light Power
    tags: [Switch]
    channel: mqtt:topic:livingroom-light:power
  Living_Room_Light_Brightness:
    type: Dimmer
    label: Living Room Light Brightness
    tags: [Brightness]
    channel: mqtt:topic:livingroom-light:brightness
  Living_Room_Light_CT:
    type: Dimmer
    label: Living Room Light Color Temperature
    tags: [ColorTemperature]
    channel: mqtt:topic:livingroom-light:color_temp
```

#### Merge Behavior

When a package is included into the main YAML file, the package contents are merged into the main YAML structure.
By default, any redefinition in the main file will interact with the corresponding keys from the package according to their data type:

**Default Behavior:**

- **Scalar values** (strings, numbers, booleans): Definitions in the main file **overwrite** the package values.
- **Maps** (key-value objects): Definitions in the main file are **merged** key‑by‑key with the package maps.
- **Lists** (arrays): Definitions in the main file are **merged** (concatenated) with the package lists.

**Controlling Replacement/Removal with Tags:**

You can use special YAML tags in the main file to control how specific keys interact with package definitions:

- **`!replace`** – Replaces the value for the key in the main file instead of merging it with the package value (useful for maps and lists).
- **`!remove`** – Removes the corresponding key after the package is combined into the main file.

**Example: Merge by default (no tags needed):**

Package file (`device.inc.yaml`):

```yaml
items:
  MyDevice_Status:
    type: String
    label: Device Status
    tags: [Status]
    metadata:
      stateDescription:
        config:
          pattern: "%s"
```

Main file (default merge):

```yaml
version: 1

packages:
  device1: !include
    file: device.inc.yaml

items:
  MyDevice_Status:
    tags: [Airflow]  # Merges with [Status] from package → [Status, Airflow]
    metadata:
      stateDescription:
        config:
          options: "ONLINE=Online,OFFLINE=Offline"  # Merges with pattern from package
```

Result:

```yaml
items:
  MyDevice_Status:
    type: String
    label: Device Status
    tags: [Status, Airflow]  # Both tags are present
    metadata:
      stateDescription:
        config:
          pattern: "%s"
          options: "ONLINE=Online,OFFLINE=Offline"  # Both config keys are present
```

##### The `!replace` Tag

The `!replace` tag forces replacement behavior for maps and lists that would otherwise merge by default.
This is useful when you want to completely override a map or list from the package instead of merging with it.

**Example:**

Main file with `!replace`:

```yaml
version: 1

packages:
  device1: !include
    file: device.inc.yaml

items:
  MyDevice_Status:
    tags: !replace [Measurement]  # Replaces tags; result → [Measurement]
    metadata:
      stateDescription:
        config: !replace
          pattern: "%d"  # Replaces entire config map (no merge)
```

Result:

```yaml
items:
  MyDevice_Status:
    type: String
    label: Device Status
    tags: [Measurement]  # Only Measurement remains
    metadata:
      stateDescription:
        config:
          pattern: "%d"  # Replaced config (pattern only)
```

##### The `!remove` Tag

The `!remove` tag removes the corresponding key from the final configuration after the package has been merged.
This is useful when a package defines a generic entity that you want to exclude in specific instances.

**Example:**

Package file (`sensor.inc.yaml`):

```yaml
items:
  ${device_id}_Temperature:
    type: Number
    dimension: Temperature
    label: ${device_name} Temperature
    tags: [Temperature]
    metadata:
      stateDescription:
        config:
          pattern: "%s"
          options: "ONLINE=Online,OFFLINE=Offline"  # Both config keys are present

  ${device_id}_Humidity:
    type: Number
    dimension: Dimensionless
    label: ${device_name} Humidity
    tags: [Humidity]
```

Main file with `!remove`:

```yaml
version: 1

packages:
  outdoor-sensor: !include
    file: sensor.inc.yaml
    vars:
      device_id: Outdoor
      device_name: Outdoor Sensor

items:
  Outdoor_Temperature:
    label: !remove
    metadata:
      stateDescription:
        config:
          options: !remove

  Outdoor_Humidity: !remove  # This sensor doesn't have humidity, remove the entire item
```

Result:

```yaml
items:
  Outdoor_Temperature:
    type: Number
    dimension: Temperature
    tags: [Temperature]
    metadata:
      stateDescription:
        config:
          pattern: "%s"

  # Outdoor_Humidity is removed from the final configuration
```

::: tip Notes:

- `!replace` and `!remove` are only meaningful in the **main YAML file**, not in package files.
- Use `!replace` when you need to fully replace a map or list that would otherwise merge by default.
- Use `!remove` to drop a key introduced by a package.

:::

### Anchors and Aliases

Anchors and aliases provide lightweight, in‑file templating that helps reduce repetition without using include files or packages.

#### What Are Anchors and Aliases?

- **Anchor (`&name`)** defines a reusable block of YAML content.
  Unlike [variables](#variable-substitutions), anchors can contain any YAML structure, including maps, lists, and scalars.
- **Alias (`*name`)** references an anchor and inserts its content at the alias location.
  When used with the merge key (`<<:`), the aliased content is merged into the current block.
- Anchors and aliases are **file‑local**.
  An anchor defined in an include file cannot be referenced from the main file, and vice versa.

Anchors are ideal for small, repeated structures within a single file.

#### Hidden Keys

Hidden keys are:

- Top level YAML keys beginning with a dot (`.`)
- Parsed during preprocessing
- Commonly used to hold anchors
- Removed from the final processed YAML output, so they are not processed by openHAB

They allow you to store templates or fragments without adding extra entities to the resulting configuration.

##### Example

```yaml
version: 1

.light-template: &LIGHT_TEMPLATE
  type: Switch
  label: "Light"
  tags: [Lighting]

items:
  Light1:
    <<: *LIGHT_TEMPLATE
    name: Light1

  Light2:
    <<: *LIGHT_TEMPLATE
    name: Light2
```

##### How It Works

- `.light-template` is a hidden key and does not appear in the final configuration.
- `&LIGHT_TEMPLATE` defines a reusable template using an **anchor**.
- `<<: *LIGHT_TEMPLATE` merges the template into each item using an **alias**.
- Each item can override or extend fields as needed.

#### Merge Behavior

When using the merge key (`<<:`):

- Maps are merged key by key
- Lists are concatenated
- Scalars in the referencing block override those in the anchor

#### When to Use Anchors and Aliases

Anchors are well suited for defining base templates that can be customized per Thing, Item, or Channel.
They are especially useful for:

- Reusable static snippets or templates
- Repeating channel or metadata structures
- Standardizing common fields across many Items
- Keeping a single YAML file concise and maintainable

#### Best Practices

- Store anchors under hidden keys (for example, `.template-name`) to keep the final configuration clean.
- Name anchors in ALL_CAPS to distinguish them from normal keys.
- Use anchors for small, structural **in‑file reuse**.
- Use include files or packages for **cross‑file reuse** or **multi‑entity device templates**.
