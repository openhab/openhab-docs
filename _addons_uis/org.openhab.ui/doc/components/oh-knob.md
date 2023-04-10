---
title: oh-knob - Knob
component: oh-knob
label: Knob
description: Knob control, allow to change a number value on a circular track
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-knob.md
prev: /docs/ui/components/
---

# oh-knob - Knob & Rounded Slider

![](images/oh-knob/header.png)

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Allows to change a number value on a circular track or a rounded slider
<!-- GENERATED /componentDescription -->

## Configuration

Use the advanced properties to change the appearance from a knob to a rounded slider.

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
<PropBlock type="DECIMAL" name="step" label="Step">
  <PropDescription>
    Minimum interval between values (default 1)
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
    Time to wait before switching from displaying user input to displaying Item state in ms (default 2000)
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
<PropBlock type="BOOLEAN" name="responsive" label="Responsive">
  <PropDescription>
    Size the control using percentages instead of pixels
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="strokeWidth" label="Stroke Width">
  <PropDescription>
    Thickness of the arcs (default 18)
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="startAngle" label="Start Angle">
  <PropDescription>
    Angle of circle where the round slider should start (default -50); 0 is 9 o'clock; only if circleShape is not set
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="endAngle" label="End Angle">
  <PropDescription>
    Angle of circle where the round slider should start (default -130); 360 is 9 o'clock; only if circleShape is not set
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="circleShape" label="Circle Shape">
  <PropDescription>
    Indicates the circle shape to be render
  </PropDescription>
  <PropOptions>
    <PropOption value="full" label="full" />
    <PropOption value="half-top" label="half top" />
    <PropOption value="half-bottom" label="half bottom" />
    <PropOption value="half-left" label="half left" />
    <PropOption value="half-right" label="half right" />
    <PropOption value="quarter-top-left" label="quarter top left" />
    <PropOption value="quarter-top-right" label="quarter top right" />
    <PropOption value="quarter-bottom-left" label="quarter bottom left" />
    <PropOption value="quarter-bottom-right" label="quarter bottom right" />
    <PropOption value="pie" label="pie" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="lineCap" label="Line Cap">
  <PropDescription>
    Sets the shape of the end of the path; dotted path and line cap cannot be used together.
  </PropDescription>
  <PropOptions>
    <PropOption value="square" label="square" />
    <PropOption value="round" label="round" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="dottedPath" label="Dotted Path">
  <PropDescription>
    Length of dotted path segments (using css stroke-dasharray); dotted path and line cap cannot be used together.
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="borderWidth" label="Border Width">
  <PropDescription>
    Sets the border width of the slider (px value)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="handleSize" label="Handle Size">
  <PropDescription>
    Sets the size of the slider handle (px value)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="handleShape" label="Handle Shape">
  <PropDescription>
    Sets the shape of the slider handle
  </PropDescription>
  <PropOptions>
    <PropOption value="square" label="square" />
    <PropOption value="round" label="round" />
    <PropOption value="dot" label="dot" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="borderColor" label="Border Color">
  <PropDescription>
    Sets the border color of the slider; set borderWidth as well! (HTML value)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="pathColor" label="Path Color">
  <PropDescription>
    Sets the path color of the slider (HTML value)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="rangeColor" label="Range Color">
  <PropDescription>
    Sets the range color of the slider (HTML value)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="tooltipColor" label="Tooltip Color">
  <PropDescription>
    Sets the tooltip color of the slider (HTML value)
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

### Inherited Properties

Properties are forwarded to the underlying [vue-round-slider](https://vue.roundsliderui.com/) component, which means you can set [these parameters](https://roundsliderui.com/document.html#options).
A compatibility layer ensures backward compatibility with the [vue-knob-control](https://github.com/kramer99/vue-knob-control#readme) component that was initially used.

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
