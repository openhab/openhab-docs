---
title: oh-category-axis - Category Axis
component: oh-category-axis
label: Category Axis
description: Reference documentation for the oh-category-axis component
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-category-axis.md
prev: /docs/ui/components/
---

# oh-category-axis - Category Axis

<!-- Put a screenshot here if relevant:
![](./images/oh-category-axis/header.jpg)
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
<PropBlock type="TEXT" name="categoryType" label="Categories" required="true">
  <PropDescription>
    Type of categories to display
  </PropDescription>
  <PropOptions>
    <PropOption value="hour" label="Minutes of hour" />
    <PropOption value="day" label="Hours of day" />
    <PropOption value="week" label="Days of week" />
    <PropOption value="month" label="Days of month" />
    <PropOption value="year" label="Months of year" />
    <PropOption value="values" label="Values" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="weekdayFormat" label="Weekday Format" required="true">
  <PropDescription>
    Format of weekdays labels
  </PropDescription>
  <PropOptions>
    <PropOption value="default" label="Long (default)" />
    <PropOption value="short" label="Short" />
    <PropOption value="min" label="Minimal" />
  </PropOptions>
</PropBlock>
<PropBlock type="BOOLEAN" name="startonSunday" label="Start Week on Sunday">
  <PropDescription>
    Check to start the week on Sundays instead of Mondays
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="monthFormat" label="Month Format" required="true">
  <PropDescription>
    Format of months labels
  </PropDescription>
  <PropOptions>
    <PropOption value="default" label="Long (default)" />
    <PropOption value="short" label="Short" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="data" label="Category Values">
  <PropDescription>
    Category values to display
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

The contents of the oh-category-axis.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-category-axis/example1.jpg)

```yaml
component: oh-category-axis
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-category-axis/example2.jpg)

::: details YAML
```yaml
component: oh-category-axis
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
