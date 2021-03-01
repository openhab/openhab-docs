---
title: oh-knob - Knob
component: oh-knob
label: Knob
description: Knob control, allow to change a number value on a circular track
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-knob.md
prev: /docs/ui/components/
---

# oh-knob - Knob

<!-- Put a screenshot here if relevant:
![](./images/oh-knob/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Knob control, allow to change a number value on a circular track
<!-- GENERATED /componentDescription -->

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
<PropBlock type="INTEGER" name="min" label="Min">
  <PropDescription>
    Minimum value (default 0)
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="max" label="Max">
  <PropDescription>
    Maximum value (default 100)
  </PropDescription>
</PropBlock>
<PropBlock type="DECIMAL" name="stepSize" label="Step">
  <PropDescription>
    Minimum interval between values (default 1)
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="disabled" label="Disabled">
  <PropDescription>
    Disable the slider (usually set via an expression since the value will not be displayed when disabled)
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="size" label="Size">
  <PropDescription>
    Visual size of the control in px (or % if responsive is true)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="primaryColor" label="Primary Color">
  <PropDescription>
    Color of the value arc (HTML value, default #409eff)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="secondaryColor" label="Secondary Color">
  <PropDescription>
    Color of the rest of the control (HTML value, default #dcdfe6)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="textColor" label="Text Color">
  <PropDescription>
    Color of the value text (HTML value, default #000000)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="strokeWidth" label="Stroke Width">
  <PropDescription>
    Thickness of the arcs, default 17
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="responsive" label="Responsive">
  <PropDescription>
    Size the control using percentages instead of pixels
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="variable" label="Variable">
  <PropDescription>
    Name of the variable to set on input change
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

The contents of the oh-knob.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-knob/example1.jpg)

```yaml
component: oh-knob
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-knob/example2.jpg)

::: details YAML
```yaml
component: oh-knob
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
