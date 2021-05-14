---
title: oh-chart-visualmap - Visual Map
component: oh-chart-visualmap
label: Visual Map
description: Reference documentation for the oh-chart-visualmap component
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-chart-visualmap.md
prev: /docs/ui/components/
---

# oh-chart-visualmap - Visual Map

<!-- Put a screenshot here if relevant:
![](./images/oh-chart-visualmap/header.jpg)
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
<PropBlock type="BOOLEAN" name="show" label="Show">
  <PropDescription>
    Whether to show or not this component
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Boundaries
<div class="props">
<PropGroup name="boundariesGroup" label="Boundaries">
  Values considered in range for this visual map (by default [0, 200])<br/><strong>These cannot be determined from the series and have to be defined manually!</strong>
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
</PropGroup>
</div>

### Appearance
<div class="props">
<PropGroup name="appearanceGroup" label="Appearance">
<PropBlock type="TEXT" name="type" label="Type">
  <PropDescription>
    Type of visual map - continuous or piecewise
  </PropDescription>
  <PropOptions>
    <PropOption value="continuous" label="Continuous" />
    <PropOption value="piecewise" label="Piecewise" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="orient" label="Orientation">
  <PropOptions>
    <PropOption value="horizontal" label="Horizontal" />
    <PropOption value="vertical" label="Vertical" />
  </PropOptions>
</PropBlock>
<PropBlock type="BOOLEAN" name="calculable" label="Show handles">
  <PropDescription>
    Show handles to filter data in continuous mode
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="pieces" label="Number of pieces">
  <PropDescription>
    Number of pieces in piecewise mode
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="presetPalette" label="Preset color palette">
  <PropDescription>
    Choose from a selection of preset color palettes for the values in range. The default is a yellow (low) to red (high) gradient
  </PropDescription>
  <PropOptions>
    <PropOption value="greenred" label="Green-Yellow-Red" />
    <PropOption value="whiteblue" label="White-Blue" />
    <PropOption value="bluered" label="Blue-red" />
  </PropOptions>
</PropBlock>
</PropGroup>
</div>

### Position
<div class="props">
<PropGroup name="position" label="Position">
  Each parameter accepts pixel values or percentages. Additionally, top accepts "top", "middle" and "bottom" to align the component vertically, and left accepts "left", "center" and "right" to align the component horizontally
<PropBlock type="TEXT" name="top" label="Top">
</PropBlock>
<PropBlock type="TEXT" name="bottom" label="Bottom">
</PropBlock>
<PropBlock type="TEXT" name="left" label="Left">
</PropBlock>
<PropBlock type="TEXT" name="right" label="Right">
</PropBlock>
<PropBlock type="TEXT" name="width" label="Width">
</PropBlock>
<PropBlock type="TEXT" name="height" label="Height">
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

The contents of the oh-chart-visualmap.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-chart-visualmap/example1.jpg)

```yaml
component: oh-chart-visualmap
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-chart-visualmap/example2.jpg)

::: details YAML
```yaml
component: oh-chart-visualmap
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
