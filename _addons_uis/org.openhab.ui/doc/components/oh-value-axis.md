---
title: oh-value-axis - Value Axis
component: oh-value-axis
label: Value Axis
description: Reference documentation for the oh-value-axis component
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-value-axis.md
prev: /docs/ui/components/
---

# oh-value-axis - Value Axis

<!-- Put a screenshot here if relevant:
![](./images/oh-value-axis/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->

<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### General
<div class="props">
<PropGroup label="General">
<PropBlock type="TEXT" name="name" label="Name">
  <PropDescription>
    A name which will appear on tooltips and labels
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="min" label="Min">
  <PropDescription>
    Minimum boundary
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="max" label="Max">
  <PropDescription>
    Maximum boundary
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="scale" label="Do Not Force Scale to Include Zero">
  <PropDescription>
    If checked the scale will not necessarily include the origin (has no effect if min or max are set explicitely)
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Name Display
<div class="props">
<PropGroup name="nameDisplay" label="Name Display">
<PropBlock type="TEXT" name="nameLocation" label="Name Location">
  <PropDescription>
    Location of axis name
  </PropDescription>
  <PropOptions>
    <PropOption value="start" label="Start" />
    <PropOption value="center" label="Center" />
    <PropOption value="end" label="End (default)" />
  </PropOptions>
</PropBlock>
<PropBlock type="INTEGER" name="nameGap" label="Name Gap">
  <PropDescription>
    Gap between axis name and axis line.
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="nameRotate" label="Name Rotate">
  <PropDescription>
    Rotation of axis name
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Axis and Coordinate System Assignments
<div class="props">
<PropGroup name="componentRelations" label="Axis and Coordinate System Assignments">
<PropBlock type="INTEGER" name="gridIndex" label="Grid Index" context="chartGrid">
  <PropDescription>
    The index of the grid for this axis
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

The contents of the oh-value-axis.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-value-axis/example1.jpg)

```yaml
component: oh-value-axis
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-value-axis/example2.jpg)

::: details YAML
```yaml
component: oh-value-axis
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
