---
title: oh-list-card - List Card
component: oh-list-card
label: List Card
description: Display a list in a card
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-list-card.md
prev: /docs/ui/components/
---

# oh-list-card - List Card

<!-- Put a screenshot here if relevant:
![](./images/oh-list-card/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Display a list in a card
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### Card
<div class="props">
<PropGroup name="card" label="Card">
  Parameters of the card
<PropBlock type="TEXT" name="title" label="Title">
  <PropDescription>
    Title of the card
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="footer" label="Footer text">
  <PropDescription>
    Footer of the card
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="noBorder" label="No Border">
  <PropDescription>
    Do not render the card border
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="noShadow" label="No Shadow">
  <PropDescription>
    Do not render a shadow effect to the card
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="outline" label="Outline">
  <PropDescription>
    Show the card outline
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### List
<div class="props">
<PropGroup name="list" label="List">
<PropBlock type="BOOLEAN" name="simpleList" label="Simple List">
  <PropDescription>
    Use for simple lists
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="mediaList" label="Media List">
  <PropDescription>
    Use for list with rich list items with icons
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="accordionList" label="Accordion List">
  <PropDescription>
    Use for lists with accordion (collapsible) items
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

The contents of the oh-list-card.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-list-card/example1.jpg)

```yaml
component: oh-list-card
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-list-card/example2.jpg)

::: details YAML
```yaml
component: oh-list-card
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
