---
title: oh-location-card - Location Card
component: oh-location-card
label: Location Card
description: A card showing model items in a certain location
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-location-card.md
prev: /docs/ui/components/
---

# oh-location-card - Location Card

<!-- Put a screenshot here if relevant:
![](./images/oh-location-card/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
A card showing model items in a certain location
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### Model Card
<div class="props">
<PropGroup name="card" label="Model Card">
  General settings for this card
<PropBlock type="TEXT" name="item" label="Item" context="item">
  <PropDescription>
    Location to display
  </PropDescription>
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

### Card at-a-glance badges
<div class="props">
<PropGroup name="glance" label="Card at-a-glance badges">
<PropBlock type="BOOLEAN" name="disableBadges" label="Disable badges">
  <PropDescription>
    Do not examine items to display badges - can help with performance if you don't need them.
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="badges" label="Enabled badges">
  <PropDescription>
    Select the badges you wish to show in the header of the card. Display all if none are selected.
  </PropDescription>
  <PropOptions multiple="true">
    <PropOption value="battery" label="Low Battery Warning" />
    <PropOption value="lights" label="Lights On" />
    <PropOption value="windows" label="Open Windows" />
    <PropOption value="doors" label="Open Doors" />
    <PropOption value="garagedoors" label="Open Garage Doors" />
    <PropOption value="blinds" label="Open Blinds" />
    <PropOption value="presence" label="Presence Detected" />
    <PropOption value="lock" label="Locks" />
    <PropOption value="climate" label="Climate Control Powered On" />
    <PropOption value="screens" label="Screens Powered On" />
    <PropOption value="projectors" label="Projectors Powered On" />
    <PropOption value="speakers" label="Speakers/AV Receivers Powered On" />
    <PropOption value="temperature" label="Average Temperature (+ Setpoint)" />
    <PropOption value="humidity" label="Average Humidity" />
    <PropOption value="co2" label="Average CO2" />
    <PropOption value="luminance" label="Average Luminance" />
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

The contents of the oh-location-card.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-location-card/example1.jpg)

```yaml
component: oh-location-card
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-location-card/example2.jpg)

::: details YAML
```yaml
component: oh-location-card
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
