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
| [things](#things)                    | openHAB [Things]({{base}}/concepts/things.html)                                                                    |
| [items](#items)                      | openHAB [Items]({{base}}/concepts/items.html)                                                                      |
| [tags](#tags)                        | Custom Semantic Tags                                                                                               |

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

# All the sections below are optional and may appear in any order

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

| Configuration Key | Description                                                                                                                                     |
|:------------------|:------------------------------------------------------------------------------------------------------------------------------------------------|
| `<thing_uid>`     | The UID of the Thing or Bridge being defined. The UID format is `<binding_id>:<thing_type_id>:[<bridge_id>:]<thing_id>`, e.g. `astro:sun:home`. |
| `isBridge`        | Whether the entity is a Bridge (`true`) or a Thing (`false`). Default: `false` (a Thing).                                                       |
| `bridge`          | The bridge UID that this Thing belongs to.                                                                                                      |
| `label`           | Thing label.                                                                                                                                    |
| `location`        | The location of the Thing.                                                                                                                      |
| `config`          | A key-value map of the Thing's configuration. Refer to the Binding's documentation for details.                                                 |
| `channels`        | Configure built-in channel parameters, or define custom channels.                                                                               |

Channel Map:

| Channel Configuration Key | Description                                                                                                                                                                          |
|:--------------------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `<channel_id>`            | The channel ID. It is a single word that when combined with the Thing UID forms the full channel UID.                                                                                |
| `type`                    | Channel type as defined by the Binding. When the channel type is defined, `kind`, `itemType`, and `itemDimension` should not be defined because the channel type will override them. |
| `kind`                    | Whether it's a `state` channel or a `trigger` channel. Default: `state`                                                                                                              |
| `itemType`                | The item type that this channel can be linked to. It is required when the channel type is not defined.                                                                               |
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

| Configuration Key | Description                                                                                                                                                                                                                                                                             |
|:------------------|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `<ItemName>`      | The unique name to refer to the item, e.g. in rules. The item name must start with an alphabet or underscore (`A`-`Z`, `a`-`z`, or `_`), optionally followed by one or more alphabet, underscore or digits (`0`-`9`). It is checked against the regex pattern `[a-zA-Z_][a-zA-Z0-9_]*`. |
| `type`            | Valid [item type]({{base}}/configuration/items.html#type) (mandatory, case-insensitive).                                                                                                                                                                                                |
| `dimension`       | For dimensioned `Number` items, the `item type` must be set to just `Number`, and the dimension is set separately using this key. Valid dimensions are listed under the **Type** column in the [List of Units]({{base}}/concepts/units-of-measurement.html#list-of-units) table.        |
| `group`           | This key allows defining the group type, dimension and function. For more details, see [Derive Group State from Member Items]({{base}}/configuration/items.html#derive-group-state-from-member-items).                                                                                  |
| `label`           | Item label. Unlike the DSL syntax in an `.items` file, the label here must only contain the label without any formatting syntax.                                                                                                                                                        |
| `icon`            | The item's [icon]({{base}}/configuration/items.html#icons). The syntax is described in [icon-sources]({{base}}/configuration/items.html#icon-sources).                                                                                                                                  |
| `groups`          | The list of parent group names.                                                                                                                                                                                                                                                         |
| `tags`            | The list of tags. This can contain both semantic tags and non-semantic tags.                                                                                                                                                                                                            |
| `format`          | A short form for the `stateDescription` `pattern` metadata. This is the equivalent of the format enclosed in square brackets in DSL's item label.                                                                                                                                       |
| `unit`            | A short form for the `unit` metadata, to define the item's unit.                                                                                                                                                                                                                        |
| `autoupdate`      | A short form for the `autoupdate` metadata. Valid values are: `true` or `false`.                                                                                                                                                                                                        |
| `channel`         | A short form for the `channels` list to define a linked channel UID for when there is only one channel with a blank config.                                                                                                                                                             |
| `channels`        | A key-value map to define the channels linked to this item. The key is the channel uid to link to, and the value is the link configuration as a key-value map. When no configuration is required, an empty map `{}` must be used as the value.                                          |
| `metadata`        | A key-value map to define item metadata. The metadata defined in here overrides any short forms when both are specified.                                                                                                                                                                |

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
      - Lightbulb

  BedRoom1_Light_Switch:
    type: Switch
    label: Bedroom1 Light Switch
    icon: switch
    format: '%s'
    groups:
      - BedRoom1_WallSwitch
    tags:
      - Switch
    channel: mqtt:topic:bedroom1-switch:switch1

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
