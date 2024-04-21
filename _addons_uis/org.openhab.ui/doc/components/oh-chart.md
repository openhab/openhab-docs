---
title: oh-chart - Chart
component: oh-chart
label: Chart
description: Visualize series of data
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-chart.md
prev: /docs/ui/components/
---

# oh-chart - Chart

<!-- Put a screenshot here if relevant:
![](./images/oh-chart/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Visualize series of data
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### General
<div class="props">
<PropGroup label="General">
<PropBlock type="TEXT" name="chartType" label="Chart Type" required="true">
  <PropDescription>
    Define a fixed period for the chart, aligned at the beginning of the period, e.g. January 1st at midnight for a year chart. If not set (or set to dynamic), the length of the period will be configurable but certain combinations like aggregated series might not work
  </PropDescription>
  <PropOptions>
    <PropOption value="(empty)" label="Dynamic period" />
    <PropOption value="day" label="Day" />
    <PropOption value="isoWeek" label="Week (starting on Monday)" />
    <PropOption value="week" label="Week (starting on Sunday)" />
    <PropOption value="month" label="Month" />
    <PropOption value="year" label="Year" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="period" label="Initial Period">
  <PropDescription>
    The initial period for the chart
  </PropDescription>
  <PropOptions>
    <PropOption value="h" label="h" />
    <PropOption value="2h" label="2h" />
    <PropOption value="4h" label="4h" />
    <PropOption value="12h" label="12h" />
    <PropOption value="D" label="D" />
    <PropOption value="2D" label="2D" />
    <PropOption value="3D" label="3D" />
    <PropOption value="W" label="W" />
    <PropOption value="2W" label="2W" />
    <PropOption value="M" label="M" />
    <PropOption value="2M" label="2M" />
    <PropOption value="4M" label="4M" />
    <PropOption value="6M" label="6M" />
    <PropOption value="Y" label="Y" />
    <PropOption value="3Y" label="3Y" />
    <PropOption value="5Y" label="5Y" />
    <PropOption value="10Y" label="10Y" />
  </PropOptions>
</PropBlock>
<PropBlock type="BOOLEAN" name="future" label="Future Period">
  <PropDescription>
    Whether the period should extend to the future instead of the past
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

The contents of the oh-chart.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-chart/example1.jpg)

```yaml
component: oh-chart
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-chart/example2.jpg)

::: details YAML
```yaml
component: oh-chart
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
