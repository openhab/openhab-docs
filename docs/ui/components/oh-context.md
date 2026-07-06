---
title: oh-context - Widget Context
component: oh-context
label: Widget Context
description: Non-rendered component with functions, constants, and local variables for widgets
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-context.md
prev: /docs/ui/components/
---

# oh-context - Widget Context

<!-- Put a screenshot here if relevant:
![](./images/oh-context/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Non-rendered component with functions, constants, and scoped variables for widgets
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### General
<div class="props">
<PropGroup label="General">
<PropBlock type="TEXT" name="functions" label="Widget Functions">
  <PropDescription>
    Object with key:arrow-function pairs. Functions are available to expressions in all child components via the <code>fn</code> object.<br />Functions are evaluated on every call and re-evaluated when dependency values change.
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="constants" label="Widget Constants">
  <PropDescription>
    Object with key:constant pairs. Constants are available to expressions in all child components via the <code>const</code> object.<br />Constants are evaluated once before the widget is displayed the first time and cannot be changed.
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="variables" label="Widget Variables">
  <PropDescription>
    Object with key:variable default value pairs. Variables are available to expressions in all child components via the <code>vars</code> object and take precedence over variables with the same name from higher contexts.<br />Variables are evaluated once before the widget is displayed the first time . Their values can only be changed by other component variable actions (e.g. <a class="external text-color-blue" target="_blank" href="https://www.openhab.org/docs/ui/components/oh-button.html#action-variable">oh-button</a>)
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

The contents of the oh-context.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-context/example1.jpg)

```yaml
component: oh-context
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-context/example2.jpg)

::: details YAML
```yaml
component: oh-context
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
