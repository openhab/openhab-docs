# oh-slider-cell - Slider Cell

<!-- GENERATED componentDescription -->
A cell expanding to a big vertical slider
<!-- GENERATED /componentDescription -->

## Configuration

<!-- GENERATED props -->

### Cell

General settings of the cell


- `header` <small>TEXT</small> _Header_

  Header of the cell

- `title` <small>TEXT</small> _Title_

  Title of the cell

- `subtitle` <small>TEXT</small> _Subtitle_

  Subtitle of the cell

- `footer` <small>TEXT</small> _Footer_

  Footer of the cell

- `icon` <small>TEXT</small> _Icon_

  Use <code>oh:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://www.openhab.org/link/icons">openHAB icon</a>) or <code>f7:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://framework7.io/icons/">Framework7 icon</a>)

- `color` <small>TEXT</small> _Highlight Color_

  Color to use when highlighted

- `on` <small>TEXT</small> _"On" expression_

  Expression to determine when the card should be highlighted. If blank, determine automatically from the primary bound item if applicable.

### Slider


- `item` <small>TEXT</small> _Item_

  Item to control

- `min` <small>DECIMAL</small> _Min_

  Minimum value

- `max` <small>DECIMAL</small> _Max_

  Maximum value

- `step` <small>DECIMAL</small> _Step_

  Minimum interval between values

- `vertical` <small>DECIMAL</small> _Vertical_

  Display the slider vertically

- `label` <small>BOOLEAN</small> _Display Label_

  Display a label above the slider knob

- `scale` <small>BOOLEAN</small> _Display Scale_

  Display a scale on the slider

- `scaleSteps` <small>INTEGER</small> _Scale steps_

  Number of (major) scale markers

- `scaleSubSteps` <small>INTEGER</small> _Scale sub-steps_

  Number of scale minor markers between each major marker

- `unit` <small>TEXT</small> _Unit_

  Text to append to the label while dragging the cursor

### Action

Action to perform when the element is clicked


- `action` <small>TEXT</small> _Action_

  Type of action to perform

  | Option | Label |
  |--------|-------|
  | `navigate` | Navigate to page |
  | `command` | Send command |
  | `toggle` | Toggle item |
  | `options` | Command options |
  | `rule` | Run rule |
  | `popup` | Open popup |
  | `popover` | Open popover |
  | `sheet` | Open sheet |
  | `photos` | Open photo browser |
  | `group` | Group details |
  | `analyzer` | Analyze item(s) |
  | `url` | External URL |
  | `variable` | Set Variable |


- `actionUrl` <small>TEXT</small> _Action URL_

  URL to navigate to

- `actionUrlSameWindow` <small>BOOLEAN</small> _Open in same tab/window_

  Open the URL in the same tab/window instead of a new one. This will exit the app.

- `actionItem` <small>TEXT</small> _Action Item_

  Item to perform the action on

- `actionCommand` <small>TEXT</small> _Action Command_

  Command to send to the item. If "toggle item" is selected as the action, only send the command when the state is different

- `actionCommandAlt` <small>TEXT</small> _Action Toggle Command_

  Command to send to the item when "toggle item" is selected as the action, and the item's state is equal to the command above

- `actionOptions` <small>TEXT</small> _Command Options_

  Comma-separated list of options; if omitted, retrieve the command options from the item dynamically. Use <code>value=label</code> format to provide a label different than the option.

- `actionRule` <small>TEXT</small> _Rule_

  Rule to run

- `actionPage` <small>TEXT</small> _Page_

  Page to navigate to

- `actionPageTransition` <small>TEXT</small> _Transition Effect_

  Use a specific <a class="external text-color-blue" target="_blank" href="https://framework7.io/docs/view.html#custom-page-transitions">page transition animation</a>

  | Option | Label |
  |--------|-------|
  | `f7-circle` | Circle |
  | `f7-cover` | Cover |
  | `f7-cover-v` | Cover from bottom |
  | `f7-dive` | Dive |
  | `f7-fade` | Fade |
  | `f7-flip` | Flip |
  | `f7-parallax` | Parallax |
  | `f7-push` | Push |


- `actionModal` <small>TEXT</small> _Modal Page or Widget_

  Page or widget to display in the modal

- `actionModalConfig` <small>TEXT</small> _Modal component configuration_

  Configuration (prop values) for the target modal page or widget

- `actionPhotos` <small>TEXT</small> _Images to show_

  Array of URLs or objects representing the images. Auto-refresh is not supported.<br />Edit in YAML or provide a JSON array, e.g.<br /><code>[ "url1", { "item": "ImageItem1", "caption": "Camera" } ]</code><br />Objects are in the <a class="external text-color-blue" target="_blank" href="https://framework7.io/docs/photo-browser.html#photos-array">photos array format</a> with an additional <code>item</code> property to specify an item to view.

- `actionPhotoBrowserConfig` <small>TEXT</small> _Photo browser configuration_

  Configuration for the photo browser.<br />Edit in YAML or provide a JSON object, e.g.<br /><code>{ "exposition": false, "type": "popup", "theme": "dark" }</code><br /> See <a class="external text-color-blue" target="_blank" href="https://framework7.io/docs/photo-browser.html#photo-browser-parameters">photo browser parameters</a> (not all are supported).

- `actionGroupPopupItem` <small>TEXT</small> _Group Popup Item_

  Group item whose members to show in a popup

- `actionAnalyzerItems` <small>TEXT</small> _Item(s) to Analyze_

  Start analyzing with the specified (set of) item(s)

- `actionAnalyzerChartType` <small>TEXT</small> _Chart Type_

  The initial analyzing period - dynamic or a predefined fixed period: day, week, month or year

  | Option | Label |
  |--------|-------|
  | `(empty)` | Dynamic |
  | `day` | Day |
  | `isoWeek` | Week (starting on Mondays) |
  | `month` | Month |
  | `year` | Year |


- `actionAnalyzerCoordSystem` <small>TEXT</small> _Initial Coordinate System_

  The initial coordinate system of the analyzer - time, aggregate or calendar (only time is supported for dynamic periods)

  | Option | Label |
  |--------|-------|
  | `time` | Time |
  | `aggregate` | Aggregate |
  | `calendar` | Calendar |


- `actionFeedback` <small>TEXT</small> _Action feedback_

  Shows a toast popup when the action has been executed. Can either be a text to show or a JSON object including some of the <a class="external text-color-blue" target="_blank" href="https://framework7.io/docs/toast.html#toast-parameters">supported parameters</a>

- `actionVariable` <small>TEXT</small> _Variable_

  The variable name to set

- `actionVariableValue` <small>TEXT</small> _Variable Value_

  The value to set the variable to

<!-- GENERATED /props -->
