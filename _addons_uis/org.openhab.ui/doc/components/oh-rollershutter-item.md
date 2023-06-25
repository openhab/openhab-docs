---
title: oh-rollershutter-item - Rollershutter List Item
component: oh-rollershutter-item
label: Rollershutter List Item
description: Display rollershutter controls in a list
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-rollershutter-item.md
prev: /docs/ui/components/
---

# oh-rollershutter-item - Rollershutter List Item

<!-- Put a screenshot here if relevant:
![](./images/oh-rollershutter-item/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Display rollershutter controls in a list
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### List Item
<div class="props">
<PropGroup name="listitem" label="List Item">
  General settings of the list item
<PropBlock type="TEXT" name="title" label="Title">
  <PropDescription>
    Title of the item
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="subtitle" label="Subtitle">
  <PropDescription>
    Subtitle of the item
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="after" label="After">
  <PropDescription>
    Text to display on the opposite side of the item (set either this or a badge)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="icon" label="Icon">
  <PropDescription>
    Use <code>oh:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://www.openhab.org/link/icons">openHAB icon</a>), <code>f7:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://framework7.io/icons/">Framework7 icon</a>), <code>material:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://jossef.github.io/material-design-icons-iconfont/">Material icon</a>) or <code>iconify:iconSet:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://icon-sets.iconify.design">Iconify icon</a>, requires being online if not in cache)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="iconColor" label="Icon Color">
  <PropDescription>
    Not applicable to openHAB icons
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="iconUseState" label="Icon depends on state">
  <PropDescription>
    Use the state of the Item to get a dynamic icon (enabled by default for <code>Contact</code>, <code>Dimmer</code>, <code>Rollershutter</code> & <code>Switch</code> Item types) (for openHAB icons only)
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Orientation
<div class="props">
<PropGroup name="orientation" label="Orientation">
<PropBlock type="BOOLEAN" name="vertical" label="Vertical">
  <PropDescription>
    Vertical orientation
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Rollershutter Controls
<div class="props">
<PropGroup name="controls" label="Rollershutter Controls">
<PropBlock type="TEXT" name="item" label="Item" context="item">
  <PropDescription>
    Rollershutter item to control
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="dirIconsStyle" label="Direction Icons Style">
  <PropDescription>
    Icons to use for the UP/DOWN buttons
  </PropDescription>
  <PropOptions>
    <PropOption value="arrowtriangle_{dir}" label="arrowtriangle_{dir}" />
    <PropOption value="arrowtriangle_{dir}_fill" label="arrowtriangle_{dir}_fill" />
    <PropOption value="arrowtriangle_{dir}_circle" label="arrowtriangle_{dir}_circle" />
    <PropOption value="arrowtriangle_{dir}_circle_fill" label="arrowtriangle_{dir}_circle_fill" />
    <PropOption value="arrowtriangle_{dir}_square" label="arrowtriangle_{dir}_square" />
    <PropOption value="arrowtriangle_{dir}_square_fill" label="arrowtriangle_{dir}_square_fill" />
    <PropOption value="chevron_{dir}" label="chevron_{dir}" />
    <PropOption value="chevron_{dir}_2" label="chevron_{dir}_2" />
    <PropOption value="chevron_compact_{dir}_2" label="chevron_compact_{dir}_2" />
    <PropOption value="chevron_{dir}_fill" label="chevron_{dir}_fill" />
    <PropOption value="chevron_{dir}_circle" label="chevron_{dir}_circle" />
    <PropOption value="chevron_{dir}_circle_fill" label="chevron_{dir}_circle_fill" />
    <PropOption value="chevron_{dir}_square" label="chevron_{dir}_square" />
    <PropOption value="chevron_{dir}_square_fill" label="chevron_{dir}_square_fill" />
    <PropOption value="arrow_{dir}" label="arrow_{dir}" />
    <PropOption value="arrow_{dir}_2" label="arrow_{dir}_2" />
    <PropOption value="arrow_{dir}_fill" label="arrow_{dir}_fill" />
    <PropOption value="arrow_{dir}_circle" label="arrow_{dir}_circle" />
    <PropOption value="arrow_{dir}_circle_fill" label="arrow_{dir}_circle_fill" />
    <PropOption value="arrow_{dir}_square" label="arrow_{dir}_square" />
    <PropOption value="arrow_{dir}_square_fill" label="arrow_{dir}_square_fill" />
    <PropOption value="arrow_{dir}_to_line" label="arrow_{dir}_to_line" />
    <PropOption value="arrow_{dir}_to_line_alt" label="arrow_{dir}_to_line_alt" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="stopIconStyle" label="Stop Icon Style">
  <PropDescription>
    Icons to use for the STOP button
  </PropDescription>
  <PropOptions>
    <PropOption value="stop" label="stop" />
    <PropOption value="stop_fill" label="stop_fill" />
    <PropOption value="stop_circle" label="stop_circle" />
    <PropOption value="stop_circle_fill" label="stop_circle_fill" />
    <PropOption value="multiply" label="multiply" />
    <PropOption value="multiply_fill" label="multiply_fill" />
    <PropOption value="multiply_circle" label="multiply_circle" />
    <PropOption value="multiply_circle_fill" label="multiply_circle_fill" />
  </PropOptions>
</PropBlock>
<PropBlock type="BOOLEAN" name="stateInCenter" label="State in Center">
  <PropDescription>
    Display state value inside the STOP button instead of icon
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

The contents of the oh-rollershutter-item.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-rollershutter-item/example1.jpg)

```yaml
component: oh-rollershutter-item
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-rollershutter-item/example2.jpg)

::: details YAML
```yaml
component: oh-rollershutter-item
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
