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

| Key                                  | Object Type                                                                                                        |
|:-------------------------------------|:-------------------------------------------------------------------------------------------------------------------|
| `version`                            | A mandatory key that contains the file-version. The currently supported version is `1`.                            |
| `readOnly`                           | An optional key which when set to `true` (the default) would declare that the file may not be modified by openHAB. |
| [variables](#variable-substitutions) | Variables for Substitutions                                                                                        |
| [packages](#packages)                | Packages                                                                                                           |
| [tags](#tags)                        | Custom Semantic Tags                                                                                               |
| [things](#things)                    | openHAB [Things]({{base}}/concepts/things.html)                                                                    |
| [items](#items)                      | openHAB [Items]({{base}}/concepts/items.html)                                                                      |

The YAML files in general must follow the standard YAML syntax, with a few openHAB-specific features:

- Each YAML file must contain a `version` key which must be set to `1`.
  YAML files without a valid `version` key will be ignored.
- Comments are allowed, either on its own line, or at the end of the line of an existing element.
- Blank lines are allowed.
- Only unquoted `true` and `false` (case insensitive) are valid `boolean` values.
  `ON`, `OFF`, `Yes`, `No`, `disable`, and `enable` are parsed as plain strings.
  To specify `true` or `false` as a string, they must be enclosed in single or double quotes.

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
    label: Volume [%d]
    channel: lgwebos:WebOSTV:3aab9eea-953b-4272-bdbd-f0cd0ecf4a46:volume
```

## Object Configuration Structure

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

Example:

```yaml
version: 1

tags:
  Location_Indoor_Room_HomeCinemaRoom:
    label: Home Cinema Room
    description: The room containing my home cinema system
    synonyms:
      - Home theater room

  Location_Outdoor_VegetableGarden:
    label: Vegetable Garden

  Property_Height: {} # no label/description/synonyms
```

The tag's full UID defines the location of the semantic tag in the tree.
In the example, `Location_Indoor_Room_HomeCinemaRoom` defines semantic tag `HomeCinemaRoom` as a child of `Room` which is a child of `Indoor` which is a child of `Location`.
There are constraints on the name of a semantic tag (like HomeCinemaRoom): it must start with a capital letter and contain only letters and numbers.

You can have multiple YAML files with different semantic tags but keep semantic tags dependent on each other in the same file.

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
    channels: # To define custom channels if necessary
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

| Configuration Key | Description                                                                                                                                     |
|:------------------|:------------------------------------------------------------------------------------------------------------------------------------------------|
| `<thing_uid>`     | The UID of the Thing or Bridge being defined. The UID format is `<binding_id>:<thing_type_id>:[<bridge_id>:]<thing_id>`, e.g. `astro:sun:home`. |
| `isBridge`        | Whether the entity is a Bridge (`true`) or a Thing (`false`). Default: `false` (a Thing).                                                       |
| `bridge`          | The bridge UID that this Thing belongs to.                                                                                                      |
| `label`           | Thing label.                                                                                                                                    |
| `location`        | The location of the Thing.                                                                                                                      |
| `config`          | A key-value map of the Thing's configuration. Refer to the Binding's documentation for details.                                                 |
| `channels`        | A map of custom channels. Most bindings provide a set of built-in channels automatically, so this is not always needed.                         |

Channel Map:

| Channel Configuration Key | Description                                                                                                                                                                          |
|:--------------------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `<channel_id>`            | The channel ID. It is a single word that when combined with the Thing UID forms the full channel UID.                                                                                |
| `type`                    | Channel type as defined by the Binding. When the channel type is defined, `kind`, `itemType`, and `itemDimension` should not be defined because the channel type will override them. |
| `kind`                    | Whether it's a State channel or a Trigger channel. Default: `state`                                                                                                                  |
| `itemType`                | The item type that this channel can be linked to. Usually this is defined by the binding when channel `type` is defined.                                                             |
| `itemDimension`           | This may be used to further define a `Number` `itemType`.                                                                                                                            |
| `label`                   | Channel label.                                                                                                                                                                       |
| `description`             | Channel description.                                                                                                                                                                 |
| `config`                  | A key-value map of the channel's configuration. Refer to the Binding's documentation for details.                                                                                    |

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
    format: <format pattern> # short form for state description's pattern
    unit: <unit> # short form for the unit metadata
    autoupdate: true|false # short form for the autoupdate metadata
    channel: <channel_uid> # short form to define an item-channel link if there is only one channel
    channels:
      <channel_uid>:
        # the item-channel link configuration is defined here as a key-value map
        <config key>: <config value>
    metadata:
      <metadata_key>:
        value: <metadata value>
        config:
          <config key>: <config value>
```

| Configuration Key | Description                                                                                                                                                                                                                                                                      |
|:------------------|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `type`            | Valid [item type]({{base}}/configuration/items.html#type) (mandatory).                                                                                                                                                                                                           |
| `dimension`       | For dimensioned `Number` items, the `item type` must be set to just `Number`, and the dimension is set separately using this key. Valid dimensions are listed under the **Type** column in the [List of Units]({{base}}/concepts/units-of-measurement.html#list-of-units) table. |
| `group`           | This key allows defining the group type, dimension and function. For more details, see [Derive Group State from Member Items]({{base}}/configuration/items.html#derive-group-state-from-member-items).                                                                           |
| `label`           | Item label. Unlike the DSL syntax in an `.items` file, the label here must only contain the label without any formatting syntax.                                                                                                                                                 |
| `icon`            | The item's icon.                                                                                                                                                                                                                                                                 |
| `groups`          | The list of parent group names.                                                                                                                                                                                                                                                  |
| `tags`            | The list of tags. This can contain both semantic tags and non-semantic tags.                                                                                                                                                                                                     |
| `format`          | A short form for the `stateDescription` `pattern` metadata. This is the equivalent of the format enclosed in square brackets in DSL's item label.                                                                                                                                |
| `unit`            | A short form for the `unit` metadata, to define the item's unit.                                                                                                                                                                                                                 |
| `autoupdate`      | A short form for the `autoupdate` metadata. Valid values are: `true` or `false`.                                                                                                                                                                                                 |
| `channel`         | A short form for the `channels` list to define a linked channel UID for when there is only one channel with a blank config.                                                                                                                                                      |
| `channels`        | A key-value map to define the channels linked from this item. The key is the channel uid to link to, and the value is the link configuration as a key-value map. When no configuration is required, an empty map `{}` must be used as the value.                                 |
| `metadata`        | A key-value map to define item metadata. The metadata defined in here overrides any short forms when both are specified.                                                                                                                                                         |

Example:

```yaml
version: 1

items:
  BedRoom1_Switch:
    type: Group
    label: Bedroom1 Light Bulb
    groups:
      - lBedroom1
    tags:
      - Lightbulb

  BedRoom1_Light_Switch:
    type: Switch
    label: Bed Room1 Light Switch
    icon: switch
    format: '%s'
    groups:
      - BedRoom1_Light_Bulb
    tags:
      - Switch
    channel: mqtt:topic:bedroom1-switch:switch1

  BedRoom1_Switch_StatusLED:
    type: Switch
    groups:
      - BedRoom1_Switch_Group
    channels:
      mqtt:topic:bedroom1-switch:statusled:
        # The configuration of this item-channel link is defined below
        profile: transform:MAP
        function: "|open=ON;closed=OFF" # | is a YAML special character, so enclose it in quotes.
```

> Note:
>
> The last item-channel link in the example above requires some configurations,
> so it needs to be defined with `channels:` instead of the short form `channel:`.
> In this instance, it is configured to use a Profile,
> specifically a MAP Profile.
> The item-channel configuration keys and values depend on which profile is used, and
> the details can be found in the corresponding profile's documentation.
> For example, [MAP Profile]({{base}}/addons/transformations/map/#usage-as-a-profile) requires
> a `function` parameter.
>
> For more information on Profiles, see:
>
> - [Item-Channel Link Profile]({{base}}/configuration/items.html#profiles)
> - [Script Transformation Profile]({{base}}/configuration/transformations.html#script-transformation-profile)
> - List of available [transfomation addons](https://www.openhab.org/addons/#transform), most of which support profiles

## YAML Extensions

openHAB includes custom extensions that enhance the flexibility and usability of YAML configurations.

### Variable Substitutions

Variable substitutions allows you to reference and reuse values dynamically within your YAML configuration files.
This helps reduce duplication and makes templates more flexible and maintainable.

#### Syntax

Variables are referenced using the `${...}` syntax.
Several forms are supported:

| Syntax            | Description                                                |
|:------------------|:-----------------------------------------------------------|
| `${var}`          | Inserts the value of var, or an empty string if undefined. |
| `${var-default}`  | Uses default if var is undefined.                          |
| `${var:-default}` | Uses default if var is undefined or empty.                 |
| `${var${nested}}` | Supports nested interpolation up to 10 levels deep.        |

Notes:

- Substitutions only work in double-quoted or unquoted strings.
- Single-quoted strings are treated as literals and will not be interpolated.
- Substitutions are also performed in key names and in default values, e.g. `${var:-${variable_default}}`.

#### Variable Sources and Precedence

Variables can be defined in multiple places, resolved in the following order of precedence:

1. Inline `vars` in `!include` directives
1. Global `variables` defined in the main file
1. Local `variables` defined in the [included file](#including-other-files)

Variables specified in the `vars` block of an `!include` directive are visible only within the included file, but they take precedence over global and local variables.
This enables included files to act as parameterized templates that can be reused with different values.

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

openHAB introduces a set of special variables that are automatically available during YAML preprocessing.

Available Special Variables:

| Variable        | Description                                                                 |
|:----------------|:----------------------------------------------------------------------------|
| `__FILE__`      | Absolute path to the current file, e.g. `/path/to/file.inc.yaml`            |
| `__FILE_NAME__` | The filename portion without the extension or leading path, e.g. `file.inc` |
| `__FILE_EXT__`  | The file extension portion of the file name, e.g. `yaml`                    |
| `__DIRECTORY__` | The directory portion of the current file, e.g. `/path/to`                  |
| `__DIR__`       | Alias for `__DIRECTORY__`.                                                  |

These variables can be interpolated just like regular ones using `${...}` syntax.
These will be useful when combined with the `!include` directive described below.

### Including Other Files

openHAB supports including external YAML files to facilitate modular, reusable, and maintainable configurations.
This is especially useful for templating, creating device packages, or separating concerns across multiple files.

#### Syntax Options

Two syntaxes are supported for the `!include` directive:

##### Simple Syntax

```yaml
keyname: !include filename.inc.yaml
```

Use this when no variable overrides are needed.

##### Full Syntax

```yaml
keyname: !include
  file: filename.inc.yaml
  vars:
    var1: value1
    var2: value2

# Or compact form:
keyname: !include { file: filename.inc.yaml, vars: { var1: value1, var2: value2 } }
```

> Note:
> According to [variable precedence](#variable-sources-and-precedence), variables defined in the `vars` block of an `!include` directive will override variables of the same name declared in the `variables` section of either the included file or the main file.

The contents of the referenced file will be inserted as the value for the given key.

Example:

`feature.yaml`

```yaml
keyname: !include ${__FILE_NAME__}.inc.yaml
```

`feature.inc.yaml`

```yaml
foo: bar
baz:
  qux: quux
```

The resulting configuration will resolve to:

```yaml
keyname:
  foo: bar
  baz:
    qux: quux
```

#### File Naming & Reload Behavior

- The file can be specified as an absolute path or as a path relative to the including file.
- Use the `.inc.yaml` or `.inc.yml` extension for included files so they aren’t loaded as primary configuration files.
- Changes to included files automatically trigger a reload of the primary file.

### Packages

openHAB’s YAML configuration system supports packages &mdash; modular bundles of related configuration elements (such as Things, Items, and Tags) that define a device or feature in a reusable way.
Packages allow complex setups to be reused, customized, and consistently applied across multiple files.

> 💡 Why use packages?
>
> Packages help eliminate duplication.
> By defining shared structures once and instantiating them with different variables, you avoid repetitive YAML blocks and reduce maintenance overhead.

#### Purpose

Packages are designed to:

- Group related configuration elements into a single logical unit.
- Enable reuse of device templates with different parameters via variable substitution.
- Simplify large configurations by isolating reusable components.
- Avoid copy-pasting the same setup multiple times across files.

#### Package Syntax & Structure

Packages are defined under the top-level `packages:` section:

```yaml
packages:
  <package_key>: !include
    file: <path/to/package_file>
    vars:
      var1: value1
      var2: value2
```

Each entry consists of:

- A key (e.g. my_device) to uniquely identify each instance of the package.
  Other than having to be unique, the package key is not used elsewhere.
  You may use a descriptive name for your own purpose.
- An `!include` directive pointing to a reusable `.inc.yaml` file which contains references to variables to create unique object UIDs.
- A `vars` block to pass variables to the included file.

> Note: Variables defined in the global `variables:` block are automatically available in included files, unless they are overridden by variables specified in the `vars` block of the `!include` directive.

#### Package File Contents

- Package files may contain any [valid entities](#object-configuration-structure).
- They should not contain top-level keys like `version:` or `readOnly:`.

> Tip: File naming: Use `.inc.yaml` or `.inc.yml` to prevent package files from being processed as standalone configurations.

#### Package Example

`main.yaml`

```yaml
version: 1

packages:
  livingroom-light: !include
    file: templates/mqtt-light.inc.yaml
    vars:
      thingid: livingroom-light
      name: Living_Room_Light
      label: Living Room Light

  # Reuse the same template
  bedroom-light: !include
    file: templates/mqtt-light.inc.yaml
    vars:
      thingid: bedroom-light
      name: Bed_Room_Light
      label: Bed Room Light

# Custom override
items:
  Bed_Room_Light_Power:
    label: My Bedroom Light Power
    tags: [Switch2]
    channels:
      mqtt:topic:bedroom-light:switch2: {}
```

`templates/mqtt-light.inc.yaml`

```yaml
things:
  mqtt:topic:${thingid}:
    bridge: mqtt:broker:main
    label: ${label}
    channels:
      switch1:
        type: switch
        config:
          stateTopic: ${thingid}/switch/switch1/state
          commandTopic: ${thingid}/switch/switch1/command

items:
  ${name}_Power:
    type: Switch
    label: ${label} Power
    tags: [Switch]
    # This can be done using the short form `channel:`
    # but we're using the `channels:` map here to demonstrate merging
    channels:
      mqtt:topic:${thingid}:switch1: {}
```

➡️ Resolves to:

```yaml
things:
  mqtt:topic:livingroom-light:
    bridge: mqtt:broker:main
    label: Living Room Light
    channels:
      switch1:
        type: switch
        config:
          stateTopic: livingroom-light/switch/switch1/state
          commandTopic: livingroom-light/switch/switch1/command

  mqtt:topic:bedroom-light:
    bridge: mqtt:broker:main
    label: Bed Room Light
    channels:
      switch1:
        type: switch
        config:
          stateTopic: bedroom-light/switch/switch1/state
          commandTopic: bedroom-light/switch/switch1/command

items:
  Living_Room_Light_Power:
    type: Switch
    label: Living Room Light Power
    tags: [Switch]
    channels:
      mqtt:topic:livingroom-light:switch1: {}

  Bed_Room_Light_Power:
    type: Switch
    label: My Bedroom Light Power # Note this was overridden in the main file
    tags: [Switch, Switch2] # merged from the main definition because it's a list
    channels:
      mqtt:topic:bedroom-light:switch1: {}
      mqtt:topic:bedroom-light:switch2: {} # merged from the main definition because it's a map
```

🔄 Merge Behavior

- Package contents are merged into the main YAML structure.
- Scalar definitions in the main file override matching definitions from the package (by key).
  This can be used to refine a generic package on a case-by-case basis.
- Map and List definitions in the main file will be merged.

File structure can be nested, e.g. you may organize packages under `includes/` or `templates/` as long as they’re excluded from default parsing by giving them a `.inc.yaml` or `.inc.yml` extension.
