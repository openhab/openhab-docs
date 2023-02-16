---
title: oh-knob-cell - Knob Cell
component: oh-knob-cell
label: Knob Cell
description: A cell expanding to a knob control
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-knob-cell.md
prev: /docs/ui/components/
---

# oh-knob-cell - Knob Cell

![](images/oh-knob/header.png)

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
A cell expanding to a knob control
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### Cell
<div class="props">
<PropGroup name="cell" label="Cell">
  General settings of the cell
<PropBlock type="TEXT" name="header" label="Header">
  <PropDescription>
    Header of the cell
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="title" label="Title">
  <PropDescription>
    Title of the cell
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="subtitle" label="Subtitle">
  <PropDescription>
    Subtitle of the cell
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="footer" label="Footer">
  <PropDescription>
    Footer of the cell
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="icon" label="Icon">
  <PropDescription>
    Use <code>oh:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://www.openhab.org/link/icons">openHAB icon</a>), <code>f7:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://framework7.io/icons/">Framework7 icon</a>), <code>material:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://jossef.github.io/material-design-icons-iconfont/">Material icon</a>) or <code>iconify:iconSet:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://icon-sets.iconify.design">Iconify icon</a>, requires being online if not in cache)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="color" label="Highlight Color">
  <PropDescription>
    Color to use when highlighted
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="on" label="&quot;On&quot; expression">
  <PropDescription>
    Expression to determine when the card should be highlighted. If blank, determine automatically from the primary bound item if applicable.
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Knob
<div class="props">
<PropGroup name="knob" label="Knob">
<PropBlock type="TEXT" name="item" label="Item" context="item">
  <PropDescription>
    Item to control
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="useSliderControl" label="Use Slider Control">
  <PropDescription>
    Use <a class="external text-color-blue" target="_blank" href="https://vue.roundsliderui.com/">round-slider control</a> instead of knob control (allows more customization) - parameters are advanced!
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
<PropBlock type="TEXT" name="circleShape" label="Circle Shape">
  <PropDescription>
    full, pie, half-top/-bottom/-left/-right, quarter-top-left/-right, quarter-bottom-left/-right - slider control only!
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="startAngle" label="Start Angle">
  <PropDescription>
    Angle of circle where the round slider should start (default 0); 0 is 9 o'clock; only if circleShape is not set - slider control only!
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="endAngle" label="End Angle">
  <PropDescription>
    Angle of circle where the round slider should start (default 360); 360 is 9 o'clock; only if circleShape is not set - slider control only!
  </PropDescription>
</PropBlock>
<PropBlock type="DECIMAL" name="stepSize" label="Step">
  <PropDescription>
    Minimum interval between values (default 1)
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
<PropBlock type="TEXT" name="primaryColor" label="Primary Color">
  <PropDescription>
    Color of the value arc (HTML value, default #409eff)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="secondaryColor" label="Secondary Color">
  <PropDescription>
    Color of the rest of the control (HTML value, default #dcdfe6)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="textColor" label="Text Color">
  <PropDescription>
    Color of the value text (HTML value, default #000000)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="borderColor" label="Border Color">
  <PropDescription>
    Sets the border color of the slider. By default it will inherit the primaryColor value (HTML value, default #000000) - slider control only!
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="borderWidth" label="Border Width">
  <PropDescription>
    Indicates the border width of the slider - slider control only!
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="strokeWidth" label="Stroke Width">
  <PropDescription>
    Thickness of the arcs (default 17)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="lineCap" label="Line End Type">
  <PropDescription>
    butt, round, square, none - slider control only!
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="dottedPath" label="Dotted Path">
  <PropDescription>
    Length of dotted path segments (css stroke-dasharray) - slider control only!
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="responsive" label="Responsive">
  <PropDescription>
    Size the control using percentages instead of pixels
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
    Time to wait before switching from displaying user input to displaying item state in ms (default 2000)
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Action
<div class="props">
<PropGroup name="actions" label="Action">
  Action to perform when the element is clicked
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
    <PropOption value="url" label="External URL" />
    <PropOption value="variable" label="Set Variable" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="actionUrl" label="Action URL" context="url">
  <PropDescription>
    URL to navigate to
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="actionUrlSameWindow" label="Open in same tab/window">
  <PropDescription>
    Open the URL in the same tab/window instead of a new one. This will exit the app.
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
<PropBlock type="TEXT" name="actionAnalyzerItems" label="Item(s) to Analyze" context="item">
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
<PropBlock type="TEXT" name="actionFeedback" label="Action feedback">
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

<!-- If applicable describe how properties are forwarded to a underlying component from Framework7, ECharts, etc.:
### Inherited Properties

-->

<!-- If applicable describe the slots recognized by the component and what they represent:
### Slots

#### `default`

The contents of the oh-knob-cell.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-knob-cell/example1.jpg)

```yaml
component: oh-knob-cell
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-knob-cell/example2.jpg)

::: details YAML
```yaml
component: oh-knob-cell
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
