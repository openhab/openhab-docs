---
title: oh-equipment-card - Equipment Class Card
component: oh-equipment-card
label: Equipment Class Card
description: A card showing model items belonging to a certain equipment class
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-equipment-card.md
prev: /docs/ui/components/
---

# oh-equipment-card - Equipment Class Card

<!-- Put a screenshot here if relevant:
![](./images/oh-equipment-card/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
A card showing model items belonging to a certain equipment class
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### Model Card
<div class="props">
<PropGroup name="card" label="Model Card">
  General settings for this card
<PropBlock type="TEXT" name="item" label="Item">
  <PropDescription>
    Equipment class to display
  </PropDescription>
  <PropOptions>
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="title" label="Title">
  <PropDescription>
    Title of the card
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="subtitle" label="Subtitle">
  <PropDescription>
    Subtitle of the card
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="backgroundColor" label="Background Color">
  <PropDescription>
    Color of the card's background; if unset, choose automatically from built-in defaults for certain semantic classes
  </PropDescription>
  <PropOptions>
    <PropOption value="red" label="Red" />
    <PropOption value="green" label="Green" />
    <PropOption value="blue" label="Blue" />
    <PropOption value="pink" label="Pink" />
    <PropOption value="yellow" label="Yellow" />
    <PropOption value="(empty)" label="Orange" />
    <PropOption value="purple" label="Purple" />
    <PropOption value="deeppurple" label="Deep Purple" />
    <PropOption value="lightblue" label="Light Blue" />
    <PropOption value="teal" label="Teal" />
    <PropOption value="lime" label="Lime" />
    <PropOption value="deeporange" label="Deep Orange" />
    <PropOption value="gray" label="Gray" />
    <PropOption value="black" label="Black" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="backgroundImage" label="Background Image">
  <PropDescription>
    URL of an image to display in the background
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="invertText" label="Invert Text">
  <PropDescription>
    Display the text in black (for light backgrounds)
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

The contents of the oh-equipment-card.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-equipment-card/example1.jpg)

```yaml
component: oh-equipment-card
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-equipment-card/example2.jpg)

::: details YAML
```yaml
component: oh-equipment-card
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
