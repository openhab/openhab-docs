---
layout: documentation
title: YAML Tags
---

# YAML Tags

This page describes the `tags` element for [YAML Configuration](./).

[[toc]]

## Tags

openHAB comes with pre-defined [semantic tags](https://github.com/openhab/openhab-core/blob/main/bundles/org.openhab.core.semantics/model/SemanticTags.csv) that can be readily used.
It is also possible to add custom semantic tags into the system and subsequently use them alongside the built-in tags.

Custom semantic tags can be defined under the `tags` section.

### YAML Definition Syntax

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

### `tag_full_uid`

To define a custom tag named `TagName`, you must use its full UID format: `Root[_IntermediateParent...]_TagName`.

This format outlines the tag's position within the semantic hierarchy:

- Each segment is separated by an underscore (`_`)
- The Root segment must be one of: `Location`, `Equipment`, `Point`, or `Property`
- Zero or more `IntermediateParent` segments may follow — each representing a nested parent within the hierarchy
- The final segment is the `TagName`, which must begin with a capital letter and contain only letters and numbers.

This structure ensures that the tag is uniquely identified and correctly integrated into the semantic model.

### Example

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
