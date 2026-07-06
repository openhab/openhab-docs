---
title: oh-masonry - Masonry Layout
component: oh-masonry
label: Masonry Layout
description: Arranges widgets automatically depending on the screen size
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-masonry.md
prev: /docs/ui/components/
---

# oh-masonry - Masonry Layout

<!-- Put a screenshot here if relevant:
![](./images/oh-masonry/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Arranges widgets automatically depending on the screen size
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### General
<div class="props">
<PropGroup label="General">
<PropBlock type="TEXT" name="flavor" label="Flavor">
  <PropDescription>
    Choose the implementation of the masonry layout
  </PropDescription>
  <PropOptions>
    <PropOption value="vue-masonry-css" label="vue-masonry-css" />
    <PropOption value="css-grid" label="CSS Grid (no library)" />
  </PropOptions>
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

The contents of the oh-masonry.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-masonry/example1.jpg)

```yaml
component: oh-masonry
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-masonry/example2.jpg)

::: details YAML
```yaml
component: oh-masonry
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
