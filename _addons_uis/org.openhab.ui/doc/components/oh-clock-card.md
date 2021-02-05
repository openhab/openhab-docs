---
title: oh-clock-card - Digital Clock Card
component: oh-clock-card
label: Digital Clock Card
description: Display a digital clock in a card
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-clock-card.md
---

# oh-clock-card - Digital Clock Card

<!-- GENERATED componentDescription -->
Display a digital clock in a card
<!-- GENERATED /componentDescription -->

## Configuration

<!-- GENERATED props -->

### Card

Parameters of the card


- `title` <small>TEXT</small> _Title_

  Title of the card

- `footer` <small>TEXT</small> _Footer text_

  Footer of the card

- `noBorder` <small>BOOLEAN</small> _No Border_

  Do not render the card border

- `noShadow` <small>BOOLEAN</small> _No Shadow_

  Do not render a shadow effect to the card

- `outline` <small>BOOLEAN</small> _Outline_

  Show the card outline

### Clock


- `timeFormat` <small>TEXT</small> _Time Format_

  Time format, see <a class="external text-color-blue" target="_blank" href="https://day.js.org/docs/en/display/format">dayjs docs</a>

  | Option | Label |
  |--------|-------|
  | `LTS` | Localized time including seconds ('LTS', e.g. '8:02:18 PM') |
  | `LT` | Localized time ('LT'. e.g. '8:02 PM') |
  | `HH:mm:ss` | Current time ('HH:mm:ss') |


- `background` <small>TEXT</small> _Background style_

  Background style (in CSS "background" attribute format)

- `timeFontSize` <small>TEXT</small> _Time Font Size_

  Time font size (e.g. "34px")

- `timeFontWeight` <small>TEXT</small> _Time Font Weight_

  Time font weight (e.g. "normal" or "bold")

- `showDate` <small>BOOLEAN</small> _Show the date_

  Show the current date in addition to the time

- `dateFormat` <small>TEXT</small> _Date Format_

  Date format, see <a class="external text-color-blue" target="_blank" href="https://day.js.org/docs/en/display/format">dayjs docs</a>

  | Option | Label |
  |--------|-------|
  | `LL` | Localized long date ('LL', e.g. 'August 16, 2018') |
  | `L` | Localized short date ('L', e.g. '08/16/2018') |
  | `MM/DD/YYYY` | Current date ('MM/DD/YYYY') |


- `datePos` <small>TEXT</small> _Date Position_

  Where to show the date

  | Option | Label |
  |--------|-------|
  | `above` | Above time |
  | `below` | Below time |


- `dateFontSize` <small>TEXT</small> _Date Font Size_

  Date font size (e.g. "34px")

- `dateFontWeight` <small>TEXT</small> _Date Font Weight_

  Date font weight (e.g. "normal" or "bold")

### Action

Action to perform when the clock is clicked


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
