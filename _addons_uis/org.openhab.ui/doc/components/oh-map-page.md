---
title: oh-map-page - Map page
component: oh-map-page
label: Map page
description: Displays markers on a map
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-map-page.md
prev: /docs/ui/components/
---

# oh-map-page - Map page

<!-- Put a screenshot here if relevant:
![](./images/oh-map-page/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Displays markers on a map
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### General
<div class="props">
<PropGroup label="General">
<PropBlock type="TEXT" name="initialCenter" label="Initial Center" context="location">
  <PropDescription>
    The center to use when no markers are present or have valid positions
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="initialZoom" label="Initial Zoom Level">
  <PropDescription>
    The zoom level to use when no markers are present or have valid positions
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="noZoomOrDrag" label="Disable Zooming & Dragging">
  <PropDescription>
    Disable the ability to zoom and drag
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="noZoomAnimation" label="No Zoom Animation">
  <PropDescription>
    Change zoom levels without animation, can also avoid graphic glitches with persistent tooltips
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="noMarkerZoomAnimation" label="Hide Markers during Zoom Animation">
</PropBlock>
<PropBlock type="TEXT" name="tileLayerProvider" label="Provider for the background tiles">
  <PropDescription>
    The provider of tiles to use for the background of the map. Use one from <a class="external text-color-blue" target="_blank" href="https://leaflet-extras.github.io/leaflet-providers/preview/">Leaflet Providers</a>, Some providers will not work until you set options, like access tokens, in the <code>tileLayerProviderOptions</code> parameter (in Code view). See <a class="external text-color-blue" target="_blank" href="https://github.com/leaflet-extras/leaflet-providers#providers-requiring-registration">here</a> for more info. The default is CartoDB, the variant depending on the dark mode setting.
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="overlayTileLayerProvider" label="Provider for the overlay tiles">
  <PropDescription>
    The provider of tiles to use for the overlay layer above the background of the map. Use one from <a class="external text-color-blue" target="_blank" href="https://leaflet-extras.github.io/leaflet-providers/preview/">Leaflet Providers</a>, Some providers will not work until you set options, like access tokens, in the <code>overlayTileLayerProviderOptions</code> parameter (in Code view). See <a class="external text-color-blue" target="_blank" href="https://github.com/leaflet-extras/leaflet-providers#providers-requiring-registration">here</a> for more info. 
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

The contents of the oh-map-page.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-map-page/example1.jpg)

```yaml
component: oh-map-page
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-map-page/example2.jpg)

::: details YAML
```yaml
component: oh-map-page
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
