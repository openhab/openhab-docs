---
title: oh-trend - Trend line
component: oh-trend
label: Trend line
description: Trend line to display the overall recent evolution of an item
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-trend.md
prev: /docs/ui/components/
---

# oh-trend - Trend line

<!-- Put a screenshot here if relevant:
![](./images/oh-trend/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Trend line to display the overall recent evolution of an item
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### General
<div class="props">
<PropGroup label="General">
<PropBlock type="TEXT" name="trendItem" label="Trend Line Item" context="item">
  <PropDescription>
    Item to show as a trend line in the background
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="trendStrokeWidth" label="Trend Stroke Width">
  <PropDescription>
    Thickness of the trend line
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="trendWidth" label="Trend Line Width">
  <PropDescription>
    Width of the trend line (leave blank to set automatically)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="trendGradient" label="Trend Line Gradient">
  <PropDescription>
    Colors of the trend line (see <a target="_blank" class="external text-color-blue" href="https://github.com/QingWei-Li/vue-trend#props">vue-trend</a>)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="trendGradientDirection" label="Trend Line Gradient Direction">
  <PropDescription>
    Direction of the trend line gradient (default: top)
  </PropDescription>
  <PropOptions>
    <PropOption value="top" label="top" />
    <PropOption value="bottom" label="bottom" />
    <PropOption value="left" label="left" />
    <PropOption value="right" label="right" />
  </PropOptions>
</PropBlock>
<PropBlock type="INTEGER" name="trendSampling" label="Trend Line Sampling">
  <PropDescription>
    Amount of minutes between each point of the trendline (default: 60). Affected by persistence strategies different from "every minute"
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

The contents of the oh-trend.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-trend/example1.jpg)

```yaml
component: oh-trend
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-trend/example2.jpg)

::: details YAML
```yaml
component: oh-trend
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
