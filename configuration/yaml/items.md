---
layout: documentation
title: YAML Items
---

# YAML Items

This page describes the `items` element for [YAML Configuration](./).

[[toc]]

## Items

The `items` top-level key contains a map of Items, defined by their item name.

### YAML Definition Syntax

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

### Example

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
> - List of available [transformation addons](https://www.openhab.org/addons/#transform), most of which support profiles
