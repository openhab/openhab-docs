---
title: oh-chart-datazoom - Data Zoom
component: oh-chart-datazoom
label: Data Zoom
description: Reference documentation for the oh-chart-datazoom component
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-chart-datazoom.md
prev: /docs/ui/components/
---

# oh-chart-datazoom - Data Zoom

<!-- Put a screenshot here if relevant:
![](./images/oh-chart-datazoom/header.jpg)
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
<PropBlock type="TEXT" name="type" label="Type" required="true">
  <PropDescription>
    Type: slider (default) or inside (allows to zoom with the mousewheel or a pinch gesture)
  </PropDescription>
  <PropOptions>
    <PropOption value="slider" label="Slider" />
    <PropOption value="inside" label="Inside" />
  </PropOptions>
</PropBlock>
<PropBlock type="BOOLEAN" name="show" label="Show">
  <PropDescription>
    Whether to show or not this component
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="orient" label="Orientation">
  <PropOptions>
    <PropOption value="horizontal" label="Horizontal" />
    <PropOption value="vertical" label="Vertical" />
  </PropOptions>
</PropBlock>
</PropGroup>
</div>

### Position
<div class="props">
<PropGroup name="position" label="Position">
  Applicable only to slider types
</PropGroup>
</div>


<!-- GENERATED /props -->

<!-- If applicable describe how properties are forwarded to a underlying component from Framework7, ECharts, etc.:
### Inherited Properties

-->

<!-- If applicable describe the slots recognized by the component and what they represent:
### Slots

#### `default`

The contents of the oh-chart-datazoom.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-chart-datazoom/example1.jpg)

```yaml
component: oh-chart-datazoom
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-chart-datazoom/example2.jpg)

::: details YAML
```yaml
component: oh-chart-datazoom
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
