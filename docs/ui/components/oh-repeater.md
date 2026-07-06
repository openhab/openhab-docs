---
title: oh-repeater - Repeater
component: oh-repeater
label: Repeater
description: Iterate over an array and repeat the children components in the default slot
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-repeater.md
prev: /docs/ui/components/
---

# oh-repeater - Repeater

<!-- Put a screenshot here if relevant:
![](./images/oh-repeater/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Iterate over an array and repeat the children components in the default slot
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### General
<div class="props">
<PropGroup label="General">
<PropBlock type="TEXT" name="for" label="Current element variable">
  <PropDescription>
    Name of the variable holding the current element in the iteration, it will be propagated to the children components in the default slot. 2 additional variables with the <code>"_idx"</code> and <code>"_source"</code> suffixes will also be defined to hold the current index and source array, respectively.
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="sourceType" label="Source type">
  <PropDescription>
    What to iterate on
  </PropDescription>
  <PropOptions>
    <PropOption value="array" label="Array (default) in the &quot;in&quot; parameter" />
    <PropOption value="range" label="Range of integers defined by &quot;rangeStart&quot;, &quot;rangeStop&quot;, &quot;rangeStep&quot;" />
    <PropOption value="itemsInGroup" label="Member of the group defined in the &quot;groupItem&quot; parameter" />
    <PropOption value="itemsWithTags" label="Items with tags in the &quot;itemTags&quot; parameter" />
    <PropOption value="itemStateOptions" label="State options of the item specified in &quot;itemOptions&quot;" />
    <PropOption value="itemCommandOptions" label="Command options of the item specified in &quot;itemOptions&quot;" />
    <PropOption value="rulesWithTags" label="Rules with tags in the &quot;ruleTags&quot; parameter" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="in" label="Source array">
  <PropDescription>
    Source array (for "array" source type)
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="rangeStart" label="Range Start">
  <PropDescription>
    Start of range (for "range" source type)
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="rangeStop" label="Range Stop">
  <PropDescription>
    End of range (for "range" source type)
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="rangeStep" label="Range Step">
  <PropDescription>
    Step of range (for "range" source type)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="groupItem" label="Group Item" context="item">
  <PropDescription>
    Group item to whose members will be iterated (for "itemsInGroup" source type)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="itemTags" label="Item Tags">
  <PropDescription>
    Iterate over items with the given tags (comma-separated, for "itemsWithTags" source type)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="ruleTags" label="Rule Tags">
  <PropDescription>
    Iterate over rules with the given tags (comma-separated, for "rulesWithTags" source type)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="itemOptions" label="Item with Options">
  <PropDescription>
    Iterate over the state options or command options of this item (for "itemStateOptions" or "itemCommandOptions" source type)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="fetchMetadata" label="Fetch Item Metadata Namespaces">
  <PropDescription>
    Fetch the metadata from these namespaces (for "itemsInGroup" and "itemsWithTags" source types)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="filter" label="Filter expression">
  <PropDescription>
    Specify an expression WITHOUT THE = PREFIX to filter the resulting array
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="map" label="Map expression">
  <PropDescription>
    Specify an expression WITHOUT THE = PREFIX to transform the resulting array elements
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="listContainer" label="List container">
  <PropDescription>
    The child components will be wrapped in a <code>ul</code> HTML elements instead of a <code>div</code>
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="containerClasses" label="Classes of the container">
  <PropDescription>
    Add these CSS classes to the container
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="containerStyle" label="Styles of the container">
  <PropDescription>
    Add these CSS styles to the container
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="fragment" label="No container (fragment)">
  <PropDescription>
    Render all children directly under the repeater's parent, without any container
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="cacheSource" label="Suppress source refresh">
  <PropDescription>
    For loaded sources (e.g. with Items or rules), the source array will be cached and not refreshed on page updates
  </PropDescription>
</PropBlock>
</PropGroup>
</div>


<!-- GENERATED /props -->

<!-- If applicable describe how properties are forwarded to a underlying component from Framework7, ECharts, etc.:
### Inherited Properties

-->

<!-- If applicable describe the slots recognized by the component and what they represent:
### Slots

#### `default`

The contents of the oh-repeater.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-repeater/example1.jpg)

```yaml
component: oh-repeater
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-repeater/example2.jpg)

::: details YAML
```yaml
component: oh-repeater
config:
  prop1: value1
  prop2: value2
slots
```
:::

-->

<!-- Try to clean up URLs to the forum (https://community.openhab.org/t/<threadID>[/<postID>] should suffice)
## Community Resources

- [Community Post 1](https://community.openhab.org/t/12345)
- [Community Post 2](https://community.openhab.org/t/23456)
-->
