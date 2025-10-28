---
title: oh-aggregate-series - Aggregate Series
component: oh-aggregate-series
label: Aggregate Series
description: Reference documentation for the oh-aggregate-series component
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-aggregate-series.md
prev: /docs/ui/components/
---

# oh-aggregate-series - Aggregate Series

<!-- Put a screenshot here if relevant:
![](./images/oh-aggregate-series/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->

<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### General
<div class="props">
<PropGroup label="General">
<PropBlock type="TEXT" name="name" label="Name">
  <PropDescription>
    A name which will appear on tooltips and labels
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="item" label="Item" context="item">
  <PropDescription>
    The item whose persisted data to display
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="service" label="Persistence Service" context="persistenceService">
  <PropDescription>
    The identifier of the persistence service to retrieve the data from. Leave blank to the use the default.
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="noBoundary" label="Don't Include Boundary">
  <PropDescription>
    Do not get one value before and after the requested period and move them to the start and end of the period
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="noItemState" label="Don't Include Item State">
  <PropDescription>
    Do not add the current Item state into the requested period (the item state will be before or at the end time)
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="offsetAmount" label="Offset Amount">
  <PropDescription>
    Offset to <em>subtract</em> from the displayed period, use if you want to do period comparisons (see also Offset Unit).
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="offsetUnit" label="Offset Unit" context="offsetUnit">
  <PropDescription>
    Offset to <em>subtract</em> from the displayed period, use if you want to do period comparisons (see also Offset Amount).
  </PropDescription>
  <PropOptions>
    <PropOption value="hour" label="Hour" />
    <PropOption value="minute" label="Minute" />
    <PropOption value="day" label="Day" />
    <PropOption value="week" label="Week" />
    <PropOption value="month" label="Month" />
    <PropOption value="year" label="Year" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="markers" label="Markers">
  <PropDescription>
    The markers to display for the series
  </PropDescription>
  <PropOptions multiple="true">
    <PropOption value="avg" label="Average" />
    <PropOption value="min" label="Minimum" />
    <PropOption value="max" label="Maximum" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="type" label="Type">
  <PropDescription>
    The type of the series.<br/><em>Note: <code>heatmap</code> needs a configured visual map or uses the default and is not supported for time series!</em>
  </PropDescription>
  <PropOptions>
    <PropOption value="line" label="Line" />
    <PropOption value="bar" label="Bar" />
    <PropOption value="heatmap" label="Heatmap" />
    <PropOption value="scatter" label="Scatter" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="dimension1" label="First Dimension">
  <PropDescription>
    The largest data point cluster size.<br />It should be consistent with the chart type, and match the type of a category axis where this series will appear.
  </PropDescription>
  <PropOptions>
    <PropOption value="minute" label="Minute of Hour" />
    <PropOption value="hour" label="Hour of Day" />
    <PropOption value="isoWeekday" label="Day of Week (starting on Monday)" />
    <PropOption value="weekday" label="Day of Week (starting on Sunday)" />
    <PropOption value="date" label="Day of Month" />
    <PropOption value="month" label="Month of Year" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="dimension2" label="Second Dimension">
  <PropDescription>
    The smallest data point cluster size.<br />Set only when you have 2 category axes (for instance day of the week and hour of the day), and make sure to match the type of the 2nd axis.
  </PropDescription>
  <PropOptions>
    <PropOption value="minute" label="Minute of Hour" />
    <PropOption value="hour" label="Hour of Day" />
    <PropOption value="isoWeekday" label="Day of Week (starting on Monday)" />
    <PropOption value="weekday" label="Day of Week (starting on Sunday)" />
    <PropOption value="date" label="Day of Month" />
    <PropOption value="month" label="Month of Year" />
  </PropOptions>
</PropBlock>
<PropBlock type="BOOLEAN" name="transpose" label="Transpose">
  <PropDescription>
    Enable when the first dimension should be mapped to the Y axis instead of the X axis
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="aggregationFunction" label="Aggregation Function">
  <PropDescription>
    How to reduce the data points in a same aggregation cluster to a single value. If not specified, the average function will be used.
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
</PropGroup>
</div>

### Axis and Coordinate System Assignments
<div class="props">
<PropGroup name="componentRelations" label="Axis and Coordinate System Assignments">
<PropBlock type="INTEGER" name="xAxisIndex" label="X Axis Index" context="xAxis">
  <PropDescription>
    The index of the X axis for this series
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="yAxisIndex" label="Y Axis Index" context="yAxis">
  <PropDescription>
    The index of the Y axis for this series
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

<!-- If applicable describe how properties are forwarded to a underlying component from Framework7, ECharts, etc.:
### Inherited Properties

-->

<!-- If applicable describe the slots recognized by the component and what they represent:
### Slots

#### `default`

The contents of the oh-aggregate-series.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-aggregate-series/example1.jpg)

```yaml
component: oh-aggregate-series
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-aggregate-series/example2.jpg)

::: details YAML
```yaml
component: oh-aggregate-series
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
