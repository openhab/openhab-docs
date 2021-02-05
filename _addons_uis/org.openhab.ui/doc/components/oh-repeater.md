---
title: oh-repeater - Repeater
component: oh-repeater
label: Repeater
description: Iterate over an array and repeat the children components in the default slot
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-repeater.md
---

# oh-repeater - Repeater

<!-- GENERATED componentDescription -->
Iterate over an array and repeat the children components in the default slot
<!-- GENERATED /componentDescription -->

## Configuration

<!-- GENERATED props -->

- `for` <small>TEXT</small> _Current element variable_

  Name of the variable holding the current element in the iteration, it will be propagated to the children components in the default slot. 2 additional variables with the <code>"_idx"</code> and <code>"_source"</code> suffixes will also be defined to hold the current index and source array, respectively.

- `sourceType` <small>TEXT</small> _Source type_

  What to iterate on

  | Option | Label |
  |--------|-------|
  | `array` | Array (default) in the "in" parameter |
  | `range` | Range of integers defined by "rangeStart", "rangeStop", "rangeStep" |
  | `itemsInGroup` | Member of the group defined in the "groupItem" parameter |
  | `itemsWithTags` | Items with tags in the "itemTags" parameter |
  | `itemStateOptions` | State options of the item specified in "itemOptions" |
  | `itemCommandOptions` | Command options of the item specified in "itemOptions" |


- `in` <small>TEXT</small> _Source array_

  Source array (for "array" source type)

- `rangeStart` <small>INTEGER</small> _Range Start_

  Start of range (for "range" source type)

- `rangeStop` <small>INTEGER</small> _Range Stop_

  End of range (for "range" source type)

- `rangeStep` <small>INTEGER</small> _Range Step_

  Step of range (for "range" source type)

- `groupItem` <small>TEXT</small> _Group Item_

  Group item to whose members will be iterated (for "itemsInGroup" source type)

- `itemTags` <small>TEXT</small> _Item Tags_

  Iterate over items with the given tags (comma-separated, for "itemsWithTags" source type)

- `itemOptions` <small>TEXT</small> _Item with Options_

  Iterate over the state options or command options of this item (for "itemStateOptions" or "itemCommandOptions" source type)

- `fetchMetadata` <small>TEXT</small> _Fetch Item Metadata Namespaces_

  Fetch the metadata from these namespaces (for "itemsInGroup" and "itemsWithTags" source types)

- `filter` <small>TEXT</small> _Filter expression_

  Specify an expression WITHOUT THE = PREFIX to filter the resulting array

- `map` <small>TEXT</small> _Map expression_

  Specify an expression WITHOUT THE = PREFIX to transform the resulting array elements

- `listContainer` <small>BOOLEAN</small> _List container_

  The child components will be wrapped in a <code>ul</code> HTML elements instead of a <code>div</code>

- `containerClasses` <small>TEXT</small> _Classes of the container_

  Add these CSS classes to the container

- `containerStyle` <small>TEXT</small> _Styles of the container_

  Add these CSS styles to the container

- `fragment` <small>BOOLEAN</small> _No container (fragment)_

  Render all children directly under the repeater's parent, without any container

<!-- GENERATED /props -->
