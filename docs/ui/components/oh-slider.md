---
title: oh-slider - Slider
component: oh-slider
label: Slider
description: Slider control, allows to pick a number value on a scale
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-slider.md
prev: /docs/ui/components/
---

# oh-slider - Slider

<!-- Put a screenshot here if relevant:
![](./images/oh-slider/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Slider control, allows to pick a number value on a scale
<!-- GENERATED /componentDescription -->

By default, the slider control will use the display state of the Item, if available.
If the display state is not available, it will use the raw state of the Item.
If you want to always use the raw state, set the `ignoreDisplayState` property to `true`.

::: tip Note
If you have problems with the slider resetting to a different value than the one you set, it is likely that the display state of the Item does not allow enough decimals for the step size of the slider.
In that case, make sure that either the state description of the Item is set to the same number of decimals than the step size (so that the display state has the same precision as the slider),
or that the `ignoreDisplayState` property is set to `true`.
:::

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### General
<div class="props">
<PropGroup label="General">
<PropBlock type="TEXT" name="item" label="Item" context="item">
  <PropDescription>
    Item to control
  </PropDescription>
</PropBlock>
<PropBlock type="DECIMAL" name="min" label="Min">
  <PropDescription>
    Minimum value
  </PropDescription>
</PropBlock>
<PropBlock type="DECIMAL" name="max" label="Max">
  <PropDescription>
    Maximum value
  </PropDescription>
</PropBlock>
<PropBlock type="DECIMAL" name="step" label="Step">
  <PropDescription>
    Minimum interval between values
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="vertical" label="Vertical">
  <PropDescription>
    Display the slider vertically
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="label" label="Display Label">
  <PropDescription>
    Display a label above the slider knob while sliding
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="scale" label="Display Scale">
  <PropDescription>
    Display a scale on the slider
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="scaleSteps" label="Scale steps">
  <PropDescription>
    Number of (major) scale markers
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="scaleSubSteps" label="Scale sub-steps">
  <PropDescription>
    Number of scale minor markers between each major marker
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="unit" label="Unit">
  <PropDescription>
    Unit for the command sent and also append to the label while dragging the cursor, leave empty to use Item's unit
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="ignoreDisplayState" label="Ignore Display State">
  <PropDescription>
    Ignore the display state if available and always use the raw state.
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="releaseOnly" label="Send command only on release">
  <PropDescription>
    If enabled, no commands are sent during sliding
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="commandInterval" label="Command Interval">
  <PropDescription>
    Time to wait between subsequent commands in ms (default 200)
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="delayStateDisplay" label="Delay State Display">
  <PropDescription>
    Time to wait before switching from displaying user input to displaying item state in ms (default 2000)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="variable" label="Variable">
  <PropDescription>
    Name of the variable to set on input change
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="variableKey" label="Variable Key">
  <PropDescription>
    Consider the variable value is an object and set the corresponding deep property within that object using a key syntax. Examples: <code>user.name</code>, <code>user[0].address[1].street</code>, <code>[0]</code>, <code>[0].label</code>. The inner property and its parent hierarchy will be created if missing.
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

The contents of the oh-slider.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-slider/example1.jpg)

```yaml
component: oh-slider
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-slider/example2.jpg)

::: details YAML
```yaml
component: oh-slider
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
