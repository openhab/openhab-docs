---
title: oh-plan-marker - Floor Plan Marker
component: oh-plan-marker
label: Floor Plan Marker
description: A marker on a floor plan
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-plan-marker.md
prev: /docs/ui/components/
---

# oh-plan-marker - Floor Plan Marker

<!-- Put a screenshot here if relevant:
![](./images/oh-plan-marker/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
A marker on a floor plan
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### Marker Settings
<div class="props">
<PropGroup name="marker" label="Marker Settings">
<PropBlock type="TEXT" name="name" label="Name">
  <PropDescription>
    The name of the marker (for identification)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="coords" label="Coordinates">
  <PropDescription>
    The coordinates of this marker in the floor plan Coordinate Reference System; usually set by dragging the marker at design time
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="item" label="Item" context="item">
  <PropDescription>
    The item whose state to display on this marker
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="visible" label="Visibility">
  <PropDescription>
    Enter an expression to dynamically show the marker, see <a class="external text-color-blue" target="_blank" href="https://www.openhab.org/docs/ui/building-pages.html#widgets-definition-usage">Building Pages: <code>visible</code></a>
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Icon
<div class="props">
<PropGroup name="icon" label="Icon">
  You can customize the styles further with CSS attributes in the <code>iconStyle</code> parameter (in YAML only)
<PropBlock type="TEXT" name="icon" label="Icon">
  <PropDescription>
    Use <code>oh:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://www.openhab.org/link/icons">openHAB icon</a>), <code>f7:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://framework7.io/icons/">Framework7 icon</a>), <code>material:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://jossef.github.io/material-design-icons-iconfont/">Material icon</a>) or <code>iconify:iconSet:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://icon-sets.iconify.design">Iconify icon</a>, requires being online if not in cache)
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="iconUseState" label="Icon depends on state">
  <PropDescription>
    Use the state of the Item to get a dynamic icon (enabled by default for <code>Contact</code>, <code>Dimmer</code>, <code>Rollershutter</code> & <code>Switch</code> Item types) (for openHAB icons only)
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="iconSize" label="Icon Size">
  <PropDescription>
    Size of the icon in pixels (40 by default)
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="iconWidth" label="Icon Width">
  <PropDescription>
    Width of the icon in pixels (for openHAB icons only, 40 by default)
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="iconHeight" label="Icon Height">
  <PropDescription>
    Height of the icon in pixels (for openHAB icons only, 40 by default)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="iconColor" label="Icon Color">
  <PropDescription>
    Color of the icon (for Framework7/Material/certain Iconify icons); use expression for dynamic colors
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="iconRotation" label="Icon Rotation">
  <PropDescription>
    Rotation of the icon in degrees
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Tooltip
<div class="props">
<PropGroup name="tooltip" label="Tooltip">
  You can customize the styles further with CSS attributes in the <code>tooltipStyle</code> parameter (in YAML only)
<PropBlock type="TEXT" name="tooltip" label="Tooltip Text">
  <PropDescription>
    The tooltip text - leave blank to display the state of the item
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="tooltipPermanent" label="Always display the tooltip">
</PropBlock>
<PropBlock type="BOOLEAN" name="useTooltipAsLabel" label="Use Tooltip as Label">
  <PropDescription>
    Put the tooltip text directly over the plan instead of displaying an icon
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="tooltipFontSize" label="Tooltip Font Size">
  <PropDescription>
    Font size of the tooltip text
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="tooltipColor" label="Tooltip color">
  <PropDescription>
    Color of the tooltip
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="tooltipDirection" label="Tooltip Direction">
  <PropDescription>
    The direction of the tooltip
  </PropDescription>
  <PropOptions>
    <PropOption value="top" label="Top" />
    <PropOption value="bottom" label="Bottom" />
    <PropOption value="left" label="Left" />
    <PropOption value="right" label="Right" />
    <PropOption value="center" label="Center" />
    <PropOption value="auto" label="Auto" />
  </PropOptions>
</PropBlock>
<PropBlock type="INTEGER" name="tooltipOffsetX" label="Tooltip Offset X">
  <PropDescription>
    The X offset of the tooltip from the marker in pixels
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="tooltipOffsetY" label="Tooltip Offset Y">
  <PropDescription>
    The Y offset of the tooltip from the marker in pixels
  </PropDescription>
</PropBlock>
<PropBlock type="DECIMAL" name="tooltipOpacity" label="Tooltip Opacity">
  <PropDescription>
    The opacity of the tooltip (0-1)
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Zoom Visibility
<div class="props">
<PropGroup name="zoomVisibility" label="Zoom Visibility">
  Hide this marker outside certain zoom labels
<PropBlock type="INTEGER" name="zoomVisibilityMin" label="Zoom Visibility Minimum">
  <PropDescription>
    Visible only when zoomed to above this level (no limit if empty)
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="zoomVisibilityMax" label="Zoom Visibility Maximum">
  <PropDescription>
    Visible only when zoomed to below this level (no limit if empty)
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Action
<div class="props">
<PropGroup name="actions" label="Action">
  Action to perform when the marker is clicked
<PropBlock type="TEXT" name="action" label="Action">
  <PropDescription>
    Type of action to perform
  </PropDescription>
  <PropOptions>
    <PropOption value="navigate" label="Navigate to page" />
    <PropOption value="command" label="Send command" />
    <PropOption value="toggle" label="Toggle Item" />
    <PropOption value="options" label="Command options" />
    <PropOption value="rule" label="Run scene, script or rule" />
    <PropOption value="popup" label="Open popup" />
    <PropOption value="popover" label="Open popover" />
    <PropOption value="sheet" label="Open sheet" />
    <PropOption value="photos" label="Open photo browser" />
    <PropOption value="group" label="Group details" />
    <PropOption value="analyzer" label="Analyze item(s)" />
    <PropOption value="url" label="Navigate to external URL" />
    <PropOption value="http" label="Send HTTP request" />
    <PropOption value="variable" label="Set Variable" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="actionUrl" label="Action URL" context="url">
  <PropDescription>
    URL to navigate to or to send HTTP request to
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="actionUrlSameWindow" label="Open in same tab/window">
  <PropDescription>
    Open the URL in the same tab/window instead of a new one. This will exit the app.
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionHttpMethod" label="HTTP Method">
  <PropDescription>
    HTTP method to use for the request
  </PropDescription>
  <PropOptions>
    <PropOption value="GET" label="GET" />
    <PropOption value="POST" label="POST" />
    <PropOption value="PUT" label="PUT" />
    <PropOption value="DELETE" label="DELETE" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="actionHttpBody" label="HTTP Body">
  <PropDescription>
    Body to send with the request
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionItem" label="Action Item" context="item">
  <PropDescription>
    Item to perform the action on
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionCommand" label="Action Command">
  <PropDescription>
    Command to send to the Item. If "Toogle Item" is selected as the action, only send the command when the state is different
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionCommandAlt" label="Action Toggle Command">
  <PropDescription>
    Command to send to the Item when "Toggle Item" is selected as the action, and the Item's state is equal to the command above
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionOptions" label="Command Options">
  <PropDescription>
    Comma-separated list of options; if omitted, retrieve the command options from the Item dynamically. Use <code>value=label</code> format to provide a label different than the option.
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionRule" label="Scene, Script or Rule" context="rule">
  <PropDescription>
    Scene, Script or Rule to run
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionRuleContext" label="Context" context="script">
  <PropDescription>
    Object representing the optional context to pass. Edit in YAML or provide a JSON object, e.g. <code>{ "param1": "value1", "param2": { "subkey1": "testing", "subkey2": 123 } }</code>.
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionPage" label="Page" context="page">
  <PropDescription>
    Page to navigate to
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionPageTransition" label="Transition Effect">
  <PropDescription>
    Use a specific <a class="external text-color-blue" target="_blank" href="https://framework7.io/docs/view.html#custom-page-transitions">page transition animation</a>
  </PropDescription>
  <PropOptions>
    <PropOption value="f7-circle" label="Circle" />
    <PropOption value="f7-cover" label="Cover" />
    <PropOption value="f7-cover-v" label="Cover from bottom" />
    <PropOption value="f7-dive" label="Dive" />
    <PropOption value="f7-fade" label="Fade" />
    <PropOption value="f7-flip" label="Flip" />
    <PropOption value="f7-parallax" label="Parallax" />
    <PropOption value="f7-push" label="Push" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="actionModal" label="Modal Page or Widget" context="pagewidget">
  <PropDescription>
    Page or widget to display in the modal
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionModalConfig" label="Modal component configuration" context="props">
  <PropDescription>
    Configuration (prop values) for the target modal page or widget
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionPhotos" label="Images to show">
  <PropDescription>
    Array of URLs or objects representing the images. Auto-refresh is not supported.<br />Edit in YAML, e.g.<br /><code><pre>- item: ImageItem1<br />  caption: Camera</pre></code>or provide a JSON array, e.g.<br /><code>[ "url1", { "item": "ImageItem1", "caption": "Camera" } ]</code><br />Objects are in the <a class="external text-color-blue" target="_blank" href="https://framework7.io/docs/photo-browser.html#photos-array">photos array format</a> with an additional <code>item</code> property to specify an item to view.
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionPhotoBrowserConfig" label="Photo browser configuration">
  <PropDescription>
    Configuration for the photo browser.<br />Edit in YAML or provide a JSON object, e.g.<br /><code>{ "exposition": false, "type": "popup", "theme": "dark" }</code><br /> See <a class="external text-color-blue" target="_blank" href="https://framework7.io/docs/photo-browser.html#photo-browser-parameters">photo browser parameters</a> (not all are supported).
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionGroupPopupItem" label="Group Popup Item" context="item">
  <PropDescription>
    Group Item whose members to show in a popup
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionAnalyzerItems" label="Item(s) to Analyze" required="true" context="item">
  <PropDescription>
    Start analyzing with the specified (set of) Item(s)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionAnalyzerChartType" label="Chart Type">
  <PropDescription>
    The initial analyzing period - dynamic or a predefined fixed period: day, week, month or year
  </PropDescription>
  <PropOptions>
    <PropOption value="(empty)" label="Dynamic" />
    <PropOption value="day" label="Day" />
    <PropOption value="isoWeek" label="Week (starting on Mondays)" />
    <PropOption value="month" label="Month" />
    <PropOption value="year" label="Year" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="actionAnalyzerCoordSystem" label="Initial Coordinate System">
  <PropDescription>
    The initial coordinate system of the analyzer - time, aggregate or calendar (only time is supported for dynamic periods)
  </PropDescription>
  <PropOptions>
    <PropOption value="time" label="Time" />
    <PropOption value="aggregate" label="Aggregate" />
    <PropOption value="calendar" label="Calendar" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="actionAnalyzerAggregation" label="Initial Aggregation">
  <PropDescription>
    The initial aggregation of the analyzer - 
  </PropDescription>
  <PropOptions>
    <PropOption value="average" label="Average" />
    <PropOption value="sum" label="Sum" />
    <PropOption value="min" label="Minimum" />
    <PropOption value="max" label="Maximum" />
    <PropOption value="first" label="First (earliest)" />
    <PropOption value="last" label="Last (latest)" />
    <PropOption value="diff_first" label="Difference of firsts" />
    <PropOption value="diff_last" label="Difference of lasts" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="actionConfirmation" label="Action Confirmation">
  <PropDescription>
    Shows a dialog or sheet to ask for confirmation before the action is executed. Can either be a text to show in the dialog or a JSON object <code>{ type: "dialog", title: "Confirm", text: "Are you sure?" }</code> or <code>{ type: "sheet", text: "Confirm", color: "green" }</code>
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionFeedback" label="Action Feedback">
  <PropDescription>
    Shows a toast popup when the action has been executed. Can either be a text to show or a JSON object including some of the <a class="external text-color-blue" target="_blank" href="https://framework7.io/docs/toast.html#toast-parameters">supported parameters</a>
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionVariable" label="Variable">
  <PropDescription>
    The variable name to set
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionVariableValue" label="Variable Value">
  <PropDescription>
    The value to set the variable to
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionVariableKey" label="Variable Key">
  <PropDescription>
    Consider the variable value is an object and set the corresponding deep property within that object using a key syntax. Examples: <code>user.name</code>, <code>user[0].address[1].street</code>, <code>[0]</code>, <code>[0].label</code>. The inner property and its parent hierarchy will be created if missing.
  </PropDescription>
</PropBlock>
</PropGroup>
</div>


<!-- GENERATED /props -->

## Examples

note that you must not have semicolons at the end of the css style

### iconStyle: 

```yaml
iconStyle:
  padding: 10px
  border-radius: 4px
  border: 5px solid #f00
```

### tooltipStyle:

```yaml
tooltipStyle:
  textShadow: 0 0 15px red
  fontSize: 40px
  color: yellow
```

<!-- If applicable describe how properties are forwarded to a underlying component from Framework7, ECharts, etc.:
### Inherited Properties

-->

<!-- If applicable describe the slots recognized by the component and what they represent:
### Slots

#### `default`

The contents of the oh-plan-marker.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-plan-marker/example1.jpg)

```yaml
component: oh-plan-marker
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-plan-marker/example2.jpg)

::: details YAML
```yaml
component: oh-plan-marker
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
