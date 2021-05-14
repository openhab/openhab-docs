---
title: oh-chart-toolbox - Toolbox
component: oh-chart-toolbox
label: Toolbox
description: Reference documentation for the oh-chart-toolbox component
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-chart-toolbox.md
prev: /docs/ui/components/
---

# oh-chart-toolbox - Toolbox

<!-- Put a screenshot here if relevant:
![](./images/oh-chart-toolbox/header.jpg)
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
<PropBlock type="TEXT" name="presetFeatures" label="Features" required="true">
  <PropOptions multiple="true">
    <PropOption value="saveAsImage" label="Save as Image" />
    <PropOption value="restore" label="Restore" />
    <PropOption value="dataView" label="Data Table" />
    <PropOption value="dataZoom" label="Drag Range to Zoom" />
    <PropOption value="magicType" label="Change Chart Type" />
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

The contents of the oh-chart-toolbox.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-chart-toolbox/example1.jpg)

```yaml
component: oh-chart-toolbox
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-chart-toolbox/example2.jpg)

::: details YAML
```yaml
component: oh-chart-toolbox
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
