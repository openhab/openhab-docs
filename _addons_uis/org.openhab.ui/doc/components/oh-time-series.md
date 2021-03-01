---
title: oh-time-series - Time Series
component: oh-time-series
label: Time Series
description: Reference documentation for the oh-time-series component
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-time-series.md
prev: /docs/ui/components/
---

# oh-time-series - Time Series

<!-- Put a screenshot here if relevant:
![](./images/oh-time-series/header.jpg)
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
<PropBlock type="TEXT" name="item" label="Item" context="item">
  <PropDescription>
    The item whose persisted data to display
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="service" label="Persistence Service" context="persistenceService">
  <PropDescription>
    The identifier of the persistence service to retrieve the data from. Leave blank to the use the default.
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="offsetAmount" label="Offset Amount">
  <PropDescription>
    Offset to <em>subtract</em> from the displayed period, use if you want to do period comparisons (see also Offset Unit).
  </PropDescription>
</PropBlock>
<PropBlock type="STRING" name="offsetUnit" label="Offset Unit" context="offsetUnit">
  <PropDescription>
    Offset to <em>subtract</em> from the displayed period, use if you want to do period comparisons (see also Offset Amount).
  </PropDescription>
  <PropOptions>
    <PropOption value="hour" label="Hour" />
    <PropOption value="minute" label="Minute" />
    <PropOption value="day" label="Day" />
    <PropOption value="week" label="Week" />
    <PropOption value="month" label="Month" />
    <PropOption value="year" label="Year" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="type" label="Type">
  <PropDescription>
    The type of the series.<br/><em>Note: heatmap needs a configured visual map and is not supported for time series</em>
  </PropDescription>
  <PropOptions>
    <PropOption value="line" label="Line" />
    <PropOption value="bar" label="Bar" />
    <PropOption value="heatmap" label="Heatmap" />
    <PropOption value="scatter" label="Scatter" />
  </PropOptions>
</PropBlock>
</PropGroup>
</div>

### Axis and Coordinate System Assignments
<div class="props">
<PropGroup name="componentRelations" label="Axis and Coordinate System Assignments">
<PropBlock type="INTEGER" name="xAxisIndex" label="X Axis Index" context="xAxis">
  <PropDescription>
    The index of the X axis for this series
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="yAxisIndex" label="Y Axis Index" context="yAxis">
  <PropDescription>
    The index of the Y axis for this series
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

The contents of the oh-time-series.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-time-series/example1.jpg)

```yaml
component: oh-time-series
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-time-series/example2.jpg)

::: details YAML
```yaml
component: oh-time-series
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
