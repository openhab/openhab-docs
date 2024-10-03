---
title: Component Reference
description: Index of all components defined in openHAB's main UI
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/src/index.md
---

# Component Reference

## System Widget Library

| Component | Name | Description |
|--------|------|-------------|
| [`oh-button`](./oh-button.html) |  [Button](./oh-button.html) | Button performing an action |
| [`oh-chart`](./oh-chart.html) |  [Chart](./oh-chart.html) | Visualize series of data |
| [`oh-clock`](./oh-clock.html) |  [Digital Clock](./oh-clock.html) | Display a digital clock |
| [`oh-colorpicker`](./oh-colorpicker.html) |  [Colorpicker](./oh-colorpicker.html) | Control to pick a color |
| [`oh-context`](./oh-context.html) |  [Context](./oh-context.html) | Non-rendered component with functions, constants, and scoped variables for widgets |
| [`oh-gauge`](./oh-gauge.html) |  [Gauge](./oh-gauge.html) | Circular or semi-circular read-only gauge |
| [`oh-icon`](./oh-icon.html) |  [Icon](./oh-icon.html) | Display an openHAB icon |
| [`oh-image`](./oh-image.html) |  [Image](./oh-image.html) | Displays an image from a URL or an item |
| [`oh-input`](./oh-input.html) |  [Input](./oh-input.html) | Displays an input field, used to set a variable |
| [`oh-knob`](./oh-knob.html) |  [Knob & Rounded Slider](./oh-knob.html) | Allows to change a number value on a circular track or a rounded slider |
| [`oh-link`](./oh-link.html) |  [Link](./oh-link.html) | Link performing an action |
| [`oh-list`](./oh-list.html) |  [List](./oh-list.html) | List control, hosts list items |
| [`oh-player`](./oh-player.html) |  [Media player](./oh-player.html) | Media player controls, with previous track/pause/play/next buttons |
| [`oh-repeater`](./oh-repeater.html) |  [Repeater](./oh-repeater.html) | Iterate over an array and repeat the children components in the default slot |
| [`oh-rollershutter`](./oh-rollershutter.html) |  [Rollershutter](./oh-rollershutter.html) | Rollershutter control, with up/down/stop buttons |
| [`oh-sipclient`](./oh-sipclient.html) |  [SIP Client](./oh-sipclient.html) | SIP Client to start and answer SIP calls |
| [`oh-slider`](./oh-slider.html) |  [Slider](./oh-slider.html) | Slider control, allows to pick a number value on a scale |
| [`oh-stepper`](./oh-stepper.html) |  [Stepper](./oh-stepper.html) | Stepper control, allows to input a number or decrement/increment it using buttons |
| [`oh-swiper`](./oh-swiper.html) |  [Swiper](./oh-swiper.html) | Swiper control, allows to display multiple swipeable slides |
| [`oh-toggle`](./oh-toggle.html) |  [Toggle](./oh-toggle.html) | Toggle control, allows to switch on or off |
| [`oh-trend`](./oh-trend.html) |  [Trend line](./oh-trend.html) | Trend line to display the overall recent evolution of an item |
| [`oh-video`](./oh-video.html) |  [Video](./oh-video.html) | Displays a video player from a URL or an item |
| [`oh-webframe`](./oh-webframe.html) |  [Web frame](./oh-webframe.html) | Displays a web page in a frame |


## Standard Widget Library (Standalone Cards)

| Component | Name | Description |
|--------|------|-------------|
| [`oh-card`](./oh-card.html) |  [Card](./oh-card.html) | The basic structure of all card widgets, providing title and footer and requiring a content slot |
| [`oh-clock-card`](./oh-clock-card.html) |  [Digital Clock Card](./oh-clock-card.html) | Display a digital clock in a card |
| [`oh-colorpicker-card`](./oh-colorpicker-card.html) |  [Color Picker Card](./oh-colorpicker-card.html) | Display a color picker in a card |
| [`oh-gauge-card`](./oh-gauge-card.html) |  [Gauge Card](./oh-gauge-card.html) | Display a read-only gauge in a card to visualize a quantifiable item |
| [`oh-image-card`](./oh-image-card.html) |  [Image Card](./oh-image-card.html) | Display an image (URL or Image item ) in a card |
| [`oh-input-card`](./oh-input-card.html) |  [Input Card](./oh-input-card.html) | Display an input in a card |
| [`oh-knob-card`](./oh-knob-card.html) |  [Knob & Rounded Slider Card](./oh-knob-card.html) | Display a knob or a rounded slider in a card to visualize and control a quantifiable item |
| [`oh-label-card`](./oh-label-card.html) |  [Label Card](./oh-label-card.html) | Display the state of an item in a card |
| [`oh-list-card`](./oh-list-card.html) |  [List Card](./oh-list-card.html) | Display a list in a card |
| [`oh-player-card`](./oh-player-card.html) |  [Player Card](./oh-player-card.html) | Display player controls in a card |
| [`oh-rollershutter-card`](./oh-rollershutter-card.html) |  [Rollershutter Card](./oh-rollershutter-card.html) | Display rollershutter controls in a card |
| [`oh-sipclient-card`](./oh-sipclient-card.html) |  [SIP Client Card](./oh-sipclient-card.html) | SIP Client to start and answer SIP calls |
| [`oh-slider-card`](./oh-slider-card.html) |  [Slider Card](./oh-slider-card.html) | Display a slider in a card to control an item |
| [`oh-stepper-card`](./oh-stepper-card.html) |  [Stepper Card](./oh-stepper-card.html) | Display a stepper in a card to control an item |
| [`oh-swiper-card`](./oh-swiper-card.html) |  [Swiper Card](./oh-swiper-card.html) | Display a swiper allowing to browse slides, in a card |
| [`oh-toggle-card`](./oh-toggle-card.html) |  [Toggle Card](./oh-toggle-card.html) | Display a toggle swtich in a card to send ON/OFF commands |
| [`oh-video-card`](./oh-video-card.html) |  [Video Card](./oh-video-card.html) | Display a video (URL or URL from String item) in a card |
| [`oh-webframe-card`](./oh-webframe-card.html) |  [Web Frame Card](./oh-webframe-card.html) | Display a web page in a card |

All cards are based on the [`oh-card`](./oh-card.html) component and share the same config options for modifying the card's appearance.
Refer to the [`oh-card` Style](./oh-card.html#style) documentation to learn about card styling options.

## Standard Widget Library (List Items)

| Component | Name | Description |
|--------|------|-------------|
| [`oh-colorpicker-item`](./oh-colorpicker-item.html) |  [Color Picker List Item](./oh-colorpicker-item.html) | Display a color picker in a list |
| [`oh-input-item`](./oh-input-item.html) |  [Input List Item](./oh-input-item.html) | Display an input field in a list |
| [`oh-label-item`](./oh-label-item.html) |  [Label List Item](./oh-label-item.html) | Display the state of an item in a list |
| [`oh-list-item`](./oh-list-item.html) |  [List Item](./oh-list-item.html) | A list item |
| [`oh-player-item`](./oh-player-item.html) |  [Player List Item](./oh-player-item.html) | Display player controls in a list |
| [`oh-rollershutter-item`](./oh-rollershutter-item.html) |  [Rollershutter List Item](./oh-rollershutter-item.html) | Display rollershutter controls in a list |
| [`oh-slider-item`](./oh-slider-item.html) |  [Slider List Item](./oh-slider-item.html) | Display a slider control in a list |
| [`oh-stepper-item`](./oh-stepper-item.html) |  [Stepper List Item](./oh-stepper-item.html) | Display a stepper control in a list |
| [`oh-toggle-item`](./oh-toggle-item.html) |  [Toggle List Item](./oh-toggle-item.html) | Display a toggle switch in a list |


## Standard Widget Library (Cells)

| Component | Name | Description |
|--------|------|-------------|
| [`oh-cell`](./oh-cell.html) |  [Cell](./oh-cell.html) | A regular or expandable cell |
| [`oh-colorpicker-cell`](./oh-colorpicker-cell.html) |  [Colorpicker Cell](./oh-colorpicker-cell.html) | A cell expanding to a color picker |
| [`oh-knob-cell`](./oh-knob-cell.html) |  [Knob & Rounded Slider Cell](./oh-knob-cell.html) | A cell expanding to a knob or rounded slider control |
| [`oh-label-cell`](./oh-label-cell.html) |  [Label Cell](./oh-label-cell.html) | A cell with a big label to show a short item state value |
| [`oh-rollershutter-cell`](./oh-rollershutter-cell.html) |  [Rollershutter Cell](./oh-rollershutter-cell.html) | A cell expanding to rollershutter controls |
| [`oh-slider-cell`](./oh-slider-cell.html) |  [Slider Cell](./oh-slider-cell.html) | A cell expanding to a big vertical slider |


## Layout Components

| Component | Name | Description |
|--------|------|-------------|
| [`oh-block`](./oh-block.html) |  [Layout Grid Block](./oh-block.html) | A block in a grid layout |
| [`oh-canvas-item`](./oh-canvas-item.html) |  [Canvas Item](./oh-canvas-item.html) | Specific attributes to display widgets on a canvas. |
| [`oh-canvas-layer`](./oh-canvas-layer.html) |  [Canvas Layer](./oh-canvas-layer.html) | Layer for grouping widgets in canvas |
| [`oh-canvas-layout`](./oh-canvas-layout.html) |  [Canvas Layout](./oh-canvas-layout.html) | Position widgets on a canvas layout with arbitrary position and size down to pixel resolution |
| [`oh-grid-col`](./oh-grid-col.html) |  [Layout Grid Column](./oh-grid-col.html) | A column in a grid layout |
| [`oh-grid-layout`](./oh-grid-layout.html) |  [Fixed Grid Layout](./oh-grid-layout.html) | Arranges widgets on a grid of squares with user-defined sizes |
| [`oh-grid-row`](./oh-grid-row.html) |  [Layout Grid Row](./oh-grid-row.html) | A row in a grid layout |
| [`oh-masonry`](./oh-masonry.html) |  [Masonry Layout](./oh-masonry.html) | Arranges widgets automatically depending on the screen size |


## Map Page & Markers

| Component | Name | Description |
|--------|------|-------------|
| [`oh-map-circle-marker`](./oh-map-circle-marker.html) |  [Circle Marker](./oh-map-circle-marker.html) | A circle on a map, to represent a radius |
| [`oh-map-marker`](./oh-map-marker.html) |  [Map Marker](./oh-map-marker.html) | An icon on a map |
| [`oh-map-page`](./oh-map-page.html) |  [Map page](./oh-map-page.html) | Displays markers on a map |


## Floorplan Page & Markers

| Component | Name | Description |
|--------|------|-------------|
| [`oh-plan-marker`](./oh-plan-marker.html) |  [Floor Plan Marker](./oh-plan-marker.html) | A marker on a floor plan |
| [`oh-plan-page`](./oh-plan-page.html) |  [Floor plan](./oh-plan-page.html) | Displays markers on an image overlay |


## Chart Page & Components

| Component | Name | Description |
|--------|------|-------------|
| [`oh-chart-page`](./oh-chart-page.html) |  [Chart Page](./oh-chart-page.html) | Visualize historical series |
| [`oh-chart-grid`](./oh-chart-grid.html) |  [Cartesian Grid](./oh-chart-grid.html) |  |
| [`oh-category-axis`](./oh-category-axis.html) |  [Category Axis](./oh-category-axis.html) |  |
| [`oh-value-axis`](./oh-value-axis.html) |  [Value Axis](./oh-value-axis.html) |  |
| [`oh-time-axis`](./oh-time-axis.html) |  [Time Axis](./oh-time-axis.html) |  |
| [`oh-calendar-axis`](./oh-calendar-axis.html) |  [Calendar](./oh-calendar-axis.html) |  |
| [`oh-data-series`](./oh-data-series.html) |  [Data Series](./oh-data-series.html) |  |
| [`oh-time-series`](./oh-time-series.html) |  [Time Series](./oh-time-series.html) |  |
| [`oh-aggregate-series`](./oh-aggregate-series.html) |  [Aggregate Series](./oh-aggregate-series.html) |  |
| [`oh-calendar-series`](./oh-calendar-series.html) |  [Calendar Series](./oh-calendar-series.html) |  |
| [`oh-chart-tooltip`](./oh-chart-tooltip.html) |  [Tooltip](./oh-chart-tooltip.html) |  |
| [`oh-chart-visualmap`](./oh-chart-visualmap.html) |  [Visual Map](./oh-chart-visualmap.html) |  |
| [`oh-chart-datazoom`](./oh-chart-datazoom.html) |  [Data Zoom](./oh-chart-datazoom.html) |  |
| [`oh-chart-legend`](./oh-chart-legend.html) |  [Legend](./oh-chart-legend.html) |  |
| [`oh-chart-title`](./oh-chart-title.html) |  [Title](./oh-chart-title.html) |  |
| [`oh-chart-toolbox`](./oh-chart-toolbox.html) |  [Toolbox](./oh-chart-toolbox.html) |  |


## Home Page Cards

| Component | Name | Description |
|--------|------|-------------|
| [`oh-location-card`](./oh-location-card.html) |  [Location Card](./oh-location-card.html) | A card showing model items in a certain location |
| [`oh-equipment-card`](./oh-equipment-card.html) |  [Equipment Card](./oh-equipment-card.html) | A card showing model items belonging to a certain equipment class |
| [`oh-property-card`](./oh-property-card.html) |  [Property Card](./oh-property-card.html) | A card showing model items related to a certain property |


