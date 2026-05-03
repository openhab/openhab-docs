---
layout: documentation
title: YAML Configuration
---

# YAML Configuration

openHAB provides a modular configuration system that allows supported entities (objects such as Things, Items, etc.) to be defined in one or more YAML files.
The primary directory for these configuration files is `$OPENHAB_CONF/yaml/` and both `.yaml` and `.yml` file extensions are supported.
Files may be further structured within subdirectories, offering flexibility in organizing configurations.

## General Structure

Top-level entries in the YAML file must be unique key-value maps with the following valid keys in no particular order:

- `version`: A mandatory key that contains the file-version. The currently supported version is `1`.
- [things](things): openHAB Things and Bridges
- [items](items): openHAB Items
- [tags](tags): Custom Semantic Tags
- [pages](pages): Main UI Pages
- [widgets](widgets): Main UI Widgets

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
  Unlike the DSL files, YAML files in these directories are not limited to a specific object type; they can contain any supported entities (Things, Items, Tags, etc.).
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

widgets:
  custom-clock-card:
    component: oh-clock-card

pages:
  livingroom-overview:
    component: oh-layout-page
    config:
      label: Living Room
    slots:
      default:
        - component: widget:custom-clock-card
```

See the dedicated pages for the supported keys and examples.
