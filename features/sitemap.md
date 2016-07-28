---
layout: documentation
---

{% include base.html %}

# Sitemaps

Sitemaps are used to create elements of a user interface for making openHAB items accessible to various frontends.

Sitemaps are a declarative UI definition.
With a few lines it is possible to define the structure and the content of your UI screens.
Sitemap files are stored in `${openhab_home}/configurations/sitemaps` and have to have the `.sitemap` filename extension.

If you create a sitemap with the name `default.sitemap` and the sitemap element 'default' then you do not need to specify a sitemap parameter in your URL.
The URL "http://localhost:8080/openhab.app" has the same behaviour as "http://localhost:8080/openhab.app?sitemap=default".

The openHAB runtime comes with a [demo sitemap file](https://github.com/openhab/openhab-distro/blob/master/features/openhab-demo-resources/src/main/resources/sitemaps/demo.sitemap), which should let you easily understand its structure.

For easy editing, the openHAB Designer brings full IDE support for these files, so you can easily check the syntax and find out about the options you have.
(Again, for the technically interested, this is also an [Xtext DSL](https://github.com/openhab/openhab/blob/master/bundles/model/org.openhab.model.sitemap/src/org/openhab/model/Sitemap.xtext).)

## Syntax

Sitemaps are composed by grouping various user interface elements into areas, which then will be rendered and presented by openHAB.

Example ([Explaination](Explanation-of-Sitemaps/#example)):
```java
sitemap demo label="Main Menu" {
	Frame label="Date" {
		Text item=Date
	}
	Frame label="Demo" {
		Text label="Group Demo" icon="1stfloor" {
			Switch item=Lights mappings=[OFF="All Off"]
			Group item=Heating
			Text item=Temperature valuecolor=[>25="orange",>15="green",<=15="blue"]
		}
		Text label="Multimedia" icon="video" {
			Selection item=Radio_Station mappings=[0=off, 1=HR3, 2=SWR3, 3=FFH, 4=Charivari]
			Slider item=Volume
		}
	}
}
```

### Element 'Sitemap'

The _sitemap_ element is **mandatory** in a sitemap definition.
It will always be the first line.
It states the name of your sitemap and the title of the main screen.

```java
sitemap [sitemapname] [label="<title of the main screen>"]
```

The following elements can be used in a sitemap definition file (alphabetical order):

| Element | Description |
|---------|-------------|
| [Colorpicker](#element-colorpicker) | Allows the user to choose a color from a color wheel
| [Chart](#element-chart) | Adds a time-series chart object for displaying logged data
| [Frame](#element-frame) | Area with either various other sitemap elements or further nested frames
| [Group](#element-group) | Renders all elements of a given group defined in an items definiton file
| [Image](#element-image) | Renders an image
| [List](#element-list) | Not supported by any user interface
| [Selection](#element-selection) | Gives access to a new page where the user can choose among values defined in the mappings parameter
| [Setpoint](#element-setpoint) | Shows a value and allows the user to modify it. Optionally, it is possible to specify maximum and minimum allowed values, as well as a step
| [Slider](#element-slider) | Renders a slider
| [Switch](#element-switch) | Renders a switch item
| [Text](#element-text) | Renders a text element
| [Video](#element-video) | Displays a video
| [Webview](#element-webview) | Display a webpage


### Element 'Colorpicker'

```java
Colorpicker [item=<itemname>] [label="<labelname>"] [icon="<iconname>"] [sendFrequency=""]
```

### Element 'Chart'

```java
Chart [item=<itemname>] [icon="<iconname>"] [label="<labelname>"] [service="<service>"] [period=xxxx] [refresh=xxxx]
```
* _refresh_ is the refresh period of the image in milliseconds
* _service_ sets the persistence service to use. If no service is set, openHAB will use the first queryable persistence service it finds. Therefore, for an installation with only a single persistence service, this is not required.
* _period_ sets the length of the time axis of the chart. Valid values are h, 4h, 8h, 12h, D, 3D, W, 2W, M, 2M, 4M, Y
* The following parameters are only available in v1.5 and over the HTTP(S) request:
_begin_ / _end_  sets the begin / end of the time axis of the chart. Valid values are in this format: yyyyMMddHHmm (yyyy := year, MM := month, dd := day, HH := hour (0-23), mm := minutes).

Note that charts are rendered by a chart provider.
By default, openHAB provides a default chart provider which will work with all queryable persistence services.
Other chart providers can be user to render the chart by changing the `chart:provider=default` configuration in openhab.cfg to the name of the alternative provider.
Currently, the only alternative is to use the rrd4j provider to render the graphs.

A few technical constraints and details to be aware of:
 * When using rrd4j persistence, you must use the everyMinute (60 seconds) logging strategy otherwise rrd4j thinks that there is no data and will not properly draw the charts.
 * When using chart:provider=rrd4j, the `service=<service>` is ignored and only the persistence service rrd4j is used.
 * Despite the chart refresh option, charts do not appear to refresh properly according to this setting
 * The visibility of multiple chart objects can be toggled to simulate changing the chart period, and the non-visible chart widgets are NOT generated behind the scenes until it becomes visible.
 * When charting a group of items make sure every label is unique. If the label contains spaces, the first word of the label must be unique. Identical labels result in an empty chart (as of 1.7.0).

Charts from rrd4j can also be generated and shown as images.
Visit [Charts](https://github.com/openhab/openhab/wiki/Charts) in the Wiki for examples.

#### Element 'Frame'

Frames are used to create a visually separated area of items.

```java
Frame [label="<labelname>"] [icon="<icon>"] [item=<item>]
{
	[additional sitemap elements]
}
```

### Element 'Group'

A Group element creates a clickable area that opens up on a new page, where you can show various elements (including nested Groups).

```java
Group [item=<itemname>] [label="<labelname>"] [icon="<iconname>"]
```

Note that all the parameters are optional, but if you don't specify at least one of them, the group will not appear in the interface (unlike the frame).

If you specify at least one parameter, the Group item will appear as a clickable white box.
By clicking, you access a new page that shows the contents inside the group.
Group items can be nested and mixed with frames: this gives a very powerful method to organise your information.

<i>itemname</i> can be a single item, or a item group: in the latter case, the new page will contain all items belonging to it.

If you don't set <i>labelname</i> but specify <i>itemname</i>, the group will get the label from the item.
If you don't set both <i>labelname</i> and <i>itemname</i>, the group will appear as a blank box.
You can see another effect of setting a <i>labelname</i> in the interface navigation bar: the left link that moves you to the previous level shows the text of <i>labelname</i>, or "Back" if the label is not specified.

### Element 'Image'

```java
Image [item=<itemname>] [icon="<iconname>"] url="<url of image>" [label="<labelname>"] [refresh=xxxx]
```
_refresh_ is the refresh period of the image in milliseconds

### Element 'List'

```java
List item=<itemname> [label="<labelname>"] [icon="<iconname>"] [separator=""]
```
Splits a String item at each separator into multiple rows.

Note: Seems not supported by any user interface at the moment.

### Element 'Selection'

```java
Selection item=<itemname> [label="<labelname>"] [icon="<iconname>"] [mappings="<mapping definition>"]
```
An explanation for mappings you can find [here](#wiki-mappings).

Note: Selection renders the elements in the mappings as a list of texts in a separated page.
If you prefer a list of buttons in the same page, then use Switch with an associated mapping.

### Element 'Setpoint'

```java
Setpoint item=<itemname> [label="<labelname>"] [icon="<iconname>"] minValue="<min value>" maxValue="<max value>" step="<step value>"
```

### Element 'Slider'

```java
Slider item=<itemname> [label="<labelname>"] [icon="<iconname>"] [sendFrequency="frequency"] [switchSupport]
```
* _sendFrequency_: Used for distinguishing between long and short button presses in the classic (web) frontend; this parameter defines the interval in miliseconds for sending increase/decrease requests
* _switchSupport_: If specified a short press on the "up" or "down" button/arrow in the classic (web) frontend switched the item on/off completely

### Element 'Switch'

```java
Switch item=<itemname> [label="<labelname>"] [icon="<iconname>"] [mappings="<mapping definition>"]
```
You can find an explanation for mappings you can [here](#wiki-mappings).
Also note that Switch elements with and without mapping are rendered differently in the interface.

### Element 'Text'

```java
Text item=<itemname> [label="<labelname>"] [icon="<iconname>"]
```

### Element 'Video'

```java
Video item=<itemname>  [icon="<iconname>"] url="<url of video to embed>" [encoding="<video encoding>"]
```
_encoding_ is the video encoding.
Be sure to specify "mjpeg" for MJPEG video.
Leave empty for autoselection, but autoselection does not work properly for MJPEG.

### Element 'Webview'

```java
Webview item=<itemname> [label="<labelname>"] [icon="<iconname>"] url="<url>" [height=<heightvalue>]
```
_height_ is the number of rows.

### Mappings

Mappings can be used to let the user chose an item from a list.

```java
mappings = [ "value1"="name1", "value2"="name2" ]
```
Quotes can be omitted if the value string and name string do not contain spaces.

Examples:
```java
mappings = [ "1"="ON", "0"="OFF" ]
mappings = [ 1="BBC", 2="CNN", 3="BLOOMBERG" ]
```
## Dynamic Sitemaps

Sitemaps can be designed to show items dynamically, or add colors depending on their state, or the state of another item.
A few use cases for this are:
* Hide elements of a heating system depending on its mode
* Display different charts or URLs depending on the state of an item
* Show a battery warning if the voltage is low
* Highlight a value with a warning color if it's above or below limits

All widgets in the sitemap have the following three parameters available:
* visibility
* labelcolor
* valuecolor

It is important to note that in all cases rules are parsed from left to right, and the first rule that returns _true_ will take priority.

#### Visibility
To dynamically show or hide an item, the _visibility_ tag is used.
By default, an item is visible if the _visibility_ tag is not provided.
If provided, a set of rules are used to indicate the items visibility status.
If any of the rules are _true_ then the item will be visible, otherwise it will be hidden.

The format of the _visibility_ tag is as follows:
```java
visibility=[item_name operator value, ... ]
```
Multiple rules can be provided using a comma as a delimiter.
Valid operators are the `==`, `>=`, `<=`, `!=`, `>`, `<`.

Examples:
```java
visibility=[Weather_Chart_Period!=ON]
visibility=[Weather_Chart_Period=="Today"]
visibility=[Weather_Chart_Period>1, Weather_Temperature!="Uninitialized"]
```

#### Colors
Colors can be used to emphasise an items label or its value.

The format of the _labelcolor_ and _valuecolor_ tags are as follows:
```java
labelcolor=[item_name operator value = "color", ... ]
```
Multiple rules can be provided using a comma as a delimiter.
Valid operators are the `==`, `>=`, `<=`, `!=`, `>`, `<`.

_itemname_ and _operator_ are optional - if not provided, itemname will default to the current item and operator will default to `==`.
So the following three rules will all do the same thing, and all are valid.

Examples:
```java
Text item=Weather_Temperature valuecolor=[22="green"]
Text item=Weather_Temperature valuecolor=[==22="green"]
Text item=Weather_Temperature valuecolor=[Weather_Temperature==22="green"]
```

openHAB supports a standard set of colors, based on the CSS definitions.
This is a set of 17 colors that should be supported by any UI.
The colors are defined by name, and within openHAB they are translated to the CSS color format (ie "#xxxxxx").
This should ensure a standard interface for these colors.

Below is a list of the standard colors and their respective CSS definitions.
Note that case is not important.

| Name used in sitemap | Color provided in REST interface |
|----------------------|----------------------------------|
| MAROON  | #800000
| RED     | #ff0000
| ORANGE  | #ffa500
| YELLOW  | #ffff00
| OLIVE   | #808000
| PURPLE  | #800080
| FUCHSIA | #ff00ff
| WHITE   | #ffffff
| LIME    | #00ff00
| GREEN   | #008000
| NAVY    | #000080
| BLUE    | #0000ff
| AQUA    | #00ffff
| TEAL    | #008080
| BLACK   | #000000
| SILVER  | #c0c0c0
| GRAY    | #808080

For any color other than those defined above, _"color"_ is passed directly through to the UI, so its exact implementation is up to the UI.
It is generally expected that valid HTML colors can be used (eg "green", "red", "#334455") but a UI could for example define abstract colors that are defined internally depending on the theme.
For example, "warning" could be defined and used in a UI dependant way, but there is currently no standardisation of these terms.


Examples:
```java
valuecolor=[>25="orange",>15="green",>5="orange",<5="blue"]
valuecolor=[Weather_LastUpdate=="Uninitialized"="lightgray",Weather_LastUpdate>600="lightgray",>15="green",>=10="orange",<10="red"]
```

**Hint**: for dynamic icons see the section on [icons](Explanation-of-items/#icon-name) on the items page.

## Example
You may find descriptions like:

```java
sitemap demo label="Main Menu" {
	Frame label="Date" {
		Text item=Date
	}
	Frame label="Demo" {
		Text label="Group Demo" icon="1stfloor" {
			Switch item=Lights mappings=[OFF="All Off"]
			Group item=Heating
			Text item=Temperature valuecolor=[>25="orange",>15="green",<=15="blue"]
		}
		Text label="Multimedia" icon="video" {
			Selection item=Radio_Station mappings=[0=off, 1=HR3, 2=SWR3, 3=FFH, 4=Charivari]
			Slider item=Volume
		}
	}
}
```

Explaination:
- The sitemap "demo" with the shown title "Main Manu" is defined.
- One first frame with a datestamp is shown.
- You want a frame with a visual label "Demo". Then, inside the frame you want two elements:
  - An item called Group Demo with 1stfloor icon that contains 4 items.
    - The first one is the group Lights, that has a mapping. It means that when it receives a value of OFF, it might show a "All off" text.
    - The second one will be the Heating group.
    - The third one will show a temperature with the value is colored acordingly
  - An item called Multimedia with icon video. It has two elements:
    - The Radio_station item that has several mappings
    - The Volume item, shown as an Slider.

#### A note about rule comparison
* String comparisons are case sensitive, so `==ON` is not the same a `==on`.
* DateTime comparisons are relative to the current time and specified in seconds. So a rule >300 will return true if the DateTime item is set to a value that's newer than the past 5 minutes (300 seconds).

Further examples for defining sitemaps can be found in our [openHAB-Samples](https://github.com/openhab/openhab/wiki/Samples-Sitemap-Definitions) section.
