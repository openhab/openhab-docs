---
title: oh-stepper - Stepper
component: oh-stepper
label: Stepper
description: Stepper control, allows to input a number or decrement/increment it using buttons
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-stepper.md
prev: /docs/ui/components/
---

# oh-stepper - Stepper

<!-- Put a screenshot here if relevant:
![](./images/oh-stepper/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Stepper control, allows to input a number or decrement/increment it using buttons
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
<PropBlock type="DECIMAL" name="offset" label="Offset">
  <PropDescription>
    Offset to be applied to the Item's state (e.g. Item state = 2; offset = 20; stepper behaves as Item state would be 22)
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="buttonsOnly" label="Buttons Only">
  <PropDescription>
    Display the buttons without the value in the middle
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="enableInput" label="Enable Input Field">
  <PropDescription>
    Enables the input field between the buttons. Note that this might not work when min/max is set.
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="small" label="Small">
  <PropDescription>
    Smaller size
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="large" label="Large">
  <PropDescription>
    Larger size
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="fill" label="Fill">
  <PropDescription>
    Fill the buttons with the primary color
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="raised" label="Raised">
  <PropDescription>
    Display the buttons with a raised style
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="round" label="Round">
  <PropDescription>
    Display the buttons with a rounded style
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="autorepeat" label="Auto-repeat">
  <PropDescription>
    Continue to increase/decrease the value while the buttons keep being pressed
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="autorepeatDynamic" label="Dynamic Auto-repeat">
  <PropDescription>
    Speed up the increase/decrease over time while the buttons keep being pressed
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

The contents of the oh-stepper.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-stepper/example1.jpg)

```yaml
component: oh-stepper
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-stepper/example2.jpg)

::: details YAML
```yaml
component: oh-stepper
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
