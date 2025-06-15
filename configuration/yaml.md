---
layout: documentation
title: YAML Configurations
---

# YAML Configurations

openHAB supports a modular configuration system which can be defined in one or more YAML files with `.yaml` extension, located in `$OPENHAB_CONF/settings/` directory.

Quick example:

```yaml
version: 1 # This is Mandatory!

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
  LG_TV0_Power:
    type: Switch
    label: TV Power
    category: television
    autoupdate: false
    channel: lgwebos:WebOSTV:3aab9eea-953b-4272-bdbd-f0cd0ecf4a46:power

  LG_TV0_Volume:
    type: Dimmer
    label: Volume [%d]
    channel: lgwebos:WebOSTV:3aab9eea-953b-4272-bdbd-f0cd0ecf4a46:volume
```

Notes:

- Each YAML file must contain a `version` key which is currently must be set to `1`.
  YAML files without a valid `version` key will be ignored.
- Comments are allowed

[[toc]]

## Configuration Entities

The YAML configuration currently supports the creation of the following entities:

- Custom Semantic Tags
- Things
- Items

### Custom Semantic Tags

In addition to the [built-in tags](https://github.com/openhab/openhab-core/blob/main/bundles/org.openhab.core.semantics/model/SemanticTags.csv), custom semantic tags can be defined under a `tags` key in a YAML configuration file.
Each tag is specified with the tag's full UID as the key, and the following _optional_ sub-keys:

| Key           | Type            |
|:--------------|:----------------|
| `label`       | String          |
| `description` | String          |
| `synonyms`    | List of Strings |

The UID defines the location of the semantic tag in the tree. In the example, `Location_Indoor_Room_HomeCinemaRoom` defines semantic tag `HomeCinemaRoom` as a child of `Room` which is a child of `Indoor` which is a child of `Location`.
There are constraints on the name of a semantic tag (like HomeCinemaRoom): it must start with a capital letter letter and contain only letters and numbers.

You can have multiple YAML files with different semantic tags but keep semantic tags dependent on each other in the same file.

### Things

### Items

## YAML Enhancements

### Variable Substitutions

### Including Other Files

### Templating / Packaging System