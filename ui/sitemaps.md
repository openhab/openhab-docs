---
layout: documentation
title: Sitemaps
---

# Sitemaps

::: tip
Sitemaps have existed since the first versions of openHAB. Therefore you will probably encounter a lot of examples referring to them throughout the documentation and in older community discussions.
⚠️ **Keep in mind that the main UI is not currently able to display them**.
If you are a new user, it's probably a good idea to start [customizing your Overview page first]({{base}}/tutorial/auto_overview.html#customization-page-configuration).
:::

In openHAB a collection of [Things]({{base}}/concepts/things.html) and [Items]({{base}}/concepts/items.html) represent physical or logical objects in the user's home automation setup.
Sitemaps are one way to select and compose these elements into a user-oriented representation for various User Interfaces (UIs), including the [openHAB app for Android]({{base}}/apps/android.html).

This page is structured as follows:

[[toc]]

Sitemaps are text files with the `.sitemap` extension, and are stored in the `$OPENHAB_CONF/sitemaps` directory.
Sitemaps follow the syntax described in this article.

For easy editing of sitemap definition files, we suggest to use one of the [openHAB supporting editors]({{base}}/configuration/editors.html).
These provide full IDE support for sitemap files, including syntax checking and auto-completion.

The openHAB runtime distribution comes with a demo configuration package containing a sitemap file named [`demo.sitemap`](https://github.com/openhab/openhab-distro/blob/main/features/distro-resources/src/main/resources/sitemaps/demo.sitemap).
You may find it useful to use this file as a starting point in creating a sitemap that fits your personal home setup.

The following example illustrates what a typical Sitemap definition might look like:

```java
sitemap demo label="My home automation" {
    Frame label="Date" {
        Text item=Date
    }
    Frame label="Demo" {
        Switch item=Lights icon="light"
        Text item=LR_Temperature label="Livingroom [%.1f °C]"
        Group item=Heating
        Text item=LR_Multimedia_Summary label="Multimedia [%s]" staticIcon="video" {
            Selection item=LR_TV_Channel mappings=[0="off", 1="DasErste", 2="BBC One", 3="Cartoon Network"]
            Slider item=LR_TV_Volume
        }
    }
}
```

<!-- Note to author: If you update this example, remember to copy it to the end of the article as well! -->

This textual UI configuration will produce a user interface similar to this:
![Presentation of the example in BasicUI](images/sitemap_demo_fullexample.png)

<!-- Note to author: The files to create all screenshots can be found at the end of the article! -->

A full explanation for this example can be found [at the end of this article](#full-example).

## Concepts

### Elements

Sitemaps are composed by arranging various user interface elements.
A set of different element types supports a user-friendly and clear presentation.
The example above contains `Frame`, `Text` and `Switch` elements among others.
Elements present information, allow interaction and are highly configurable based on the system state.
One line of Sitemap element definition produces one corresponding UI element.
As shown in the example, each element generates a descriptive text next to an icon on the left side and a status and/or interaction elements on the right.

#### Nested Elements

##### Frames

By encapsulating elements with curly brackets, multiple elements can be nested inside or behind others.
The `Frame` element type is often used in combination with element blocks.
Frames are used to visually distinguish multiple elements of the same topic on one interface page.

```java
Frame label="Date" {
    Text item=Date
}
Frame label="Demo" {
    Switch item=Lights icon="light"
    Text item=LR_Temperature label="Livingroom [%.1f °C]"
    Group item=Heating
    Text item=LR_Multimedia_Summary label="Multimedia [%s]" staticIcon="video" {
        Selection item=LR_TV_Channel mappings=[0="off", 1="DasErste", 2="BBC One", 3="Cartoon Network"]
        Slider item=LR_TV_Volume
    }
}
```

::: tip Note
When you are using `Frame` elements at one hierarchy level of your sitemap, you can not use any other element type besides `Frame`.
Different elements can be used on the previous or next hierarchy level.
:::

##### Blocks

When using code blocks behind other element types such as `Text` or `Group`, these UI elements will, in addition to their normal function, be links to a new view, presenting the nested elements.

```java
Text item=LR_Multimedia_Summary label="Multimedia [%s]" staticIcon="video" {
    Selection item=LR_TV_Channel mappings=[0="off", 1="DasErste", 2="BBC One", 3="Cartoon Network"]
    Slider item=LR_TV_Volume
}
```

#### Special Element 'sitemap'

The `sitemap` element is **mandatory** in a Sitemap definition.
This element shall be the first line in the sitemap file, and the following code block comprises the entire Sitemap definition.

```java
sitemap <sitemapname> label="<title of the main screen>" {
    [all sitemap elements]
}
```

- `sitemapname` shall always be equal to the Sitemaps file name, e.g. the `sitemapname` in a sitemap file named `demo.sitemap` must be "demo"
- `label` is free text and will be shown as the title of the main screen.

(Note that the element `sitemap` is written with a lower case "s".)

### Parameters

A certain set of parameters can be configured to customize the presentation of an element.
In the shown example `item`, `label` and `valuecolor` are parameters.
Almost all parameters are optional, some are however needed to result in a meaningful user interface.
To avoid very long or unstructured lines of element definition, parameters can be broken down to multiple code lines.

### Dependencies

A typical sitemap contains dozens of individual elements.
A system state and possible interactions are however often closely dependent.
openHAB supports these dependencies by providing parameters for dynamic behavior.
Be sure to check out the [Dynamic Sitemaps](#dynamic-sitemaps) chapter.

For the technically interested: The Sitemap definition language is an
Xtext Domain Specific Language and the sitemap file model can be found [here](https://github.com/openhab/openhab-core/blob/main/bundles/org.openhab.core.model.sitemap/src/org/openhab/core/model/sitemap/Sitemap.xtext).

## Element Types

The following element types may be used in a Sitemap definition file.

| Element                                  | Description                                                                               |
| ---------------------------------------- | ----------------------------------------------------------------------------------------- |
| [Buttongrid](#element-type-buttongrid)   | Renders a grid of stateless buttons used to send commands to a given Item.                |
| [Chart](#element-type-chart)             | Adds a time-series chart object for [persisted](persistence.html) data.                   |
| [Colorpicker](#element-type-colorpicker) | Allows the user to choose a color from a color wheel.                                     |
| [Default](#element-type-default)         | Renders an Item in the default UI representation specified by the type of the given Item. |
| [Frame](#element-type-frame)             | Establishes an area containing various other Sitemap elements.                            |
| [Group](#element-type-group)             | Concentrates all elements of a given group in a nested block.                             |
| [Image](#element-type-image)             | Renders an image given by an URL.                                                         |
| [Input](#element-type-input)             | Renders an input field for text or numbers.                                               |
| [Mapview](#element-type-mapview)         | Displays an OSM map based on a given Location Item.                                       |
| [Selection](#element-type-selection)     | Provides a dropdown or modal popup presenting values to choose from for an Item.          |
| [Setpoint](#element-type-setpoint)       | Renders a value between an increase and a decrease buttons.                               |
| [Slider](#element-type-slider)           | Presents a value in a progress-bar-like slider.                                           |
| [Switch](#element-type-switch)           | Renders an Item as an ON/OFF or multi-button switch.                                      |
| [Text](#element-type-text)               | Renders an Item as text.                                                                  |
| [Video](#element-type-video)             | Displays a video stream, given a direct URL.                                              |
| [Webview](#element-type-webview)         | Displays the content of a webpage.                                                        |

**Choosing the right element type:**
Data presented by Sitemap elements will almost always originate from a referenced [Item]({{base}}/configuration/items.html).
Each Item is of a certain Item type, for example `Switch`, `Number` or `String`.

While not all combinations are meaningful, Items of one datatype may be linked to different Sitemap element types.
This provides the flexibility to present Items in the way desired in your home automation user interface.

**General remarks on parameters:**

- In the following definitions, parameters in `[square brackets]` are optional.

- Parameters must be supplied in the order shown.

- Common parameters, also known from [items definition]({{base}}/configuration/items.html#item-syntax):
  - `item` defines the name of the Item you want to present (e.g. `Temperature`), [more details]({{base}}/configuration/items.html#item-name).
  - `label` sets the textual description displayed next to the preprocessed Item data (e.g. "`Now [%s °C]`"), [more details]({{base}}/configuration/items.html#item-label).
  - `icon` chooses the icon to show next to the element, [more details]({{base}}/configuration/items.html#icons).

- When an [Item]({{base}}/configuration/items.html) is defined, you have the opportunity to assign a label and/or an icon at that point.
    If no label or icon are specified in the Sitemap, then the label and/or icon you assigned to the Item will be displayed.
    Setting a value for `label` or `icon`  or `staticIcon` of a Sitemap element will override the values defined for the linked Item.
    There is an exception for chart, image, video, mapview and webview Sitemap elements: the item label is ignored and only the value of `label` is considered for the label.

- The parameters `icon` and `staticIcon` are exclusive; both allow choosing the icon to show next to the element but `staticIcon` also indicates not to try to create a dynamic icon (using the current state of a linked item). The value of these two parameters can optionally be enclosed in double quotes.

It has to be considered that if the label defined in a Channel or an Item contains text and state, these representations have to be overwritten separately in the Sitemap.
In the following example an Item which has a label and state defined is overwritten.

```java
sitemap demo label="My home automation" {
    Frame label="Temperature" {
        // Overrides only the text, but will keep the state format from the Item definition
        Text item=Livingroom_Temperature label="Livingroom"
        // Overrides the text and hides any state representation.
        Text item=Livingroom_Temperature label="Livingroom []"
        // Overrides the text and state representation
        // and also changes the state unit to Fahrenheit
        // if the value of the item supports UoM (link below) the value will be transformed.
        Text item=Livingroom_Temperature label="Livingroom [%.2f °F]"
    }
}
```

UoM = [Units of Measurement]({{base}}/concepts/units-of-measurement.html)

- Additional parameters such as `mappings` and `valuecolor` are described below.

### Element Type 'Frame'

```java
Frame [label="<labelname>"] [icon=<iconref>] [staticIcon=<iconref>] {
    [additional sitemap elements]
}
```

Frames are used to visually separate areas of items when the items are viewed in a UI.

**Example:**

```java
Frame label="Demo" {
    Switch item=Lights icon="light"
    //# and so on...
}
```

![Presentation of the Frame element in BasicUI](images/sitemap_demo_frame.png)

### Element Type 'Default'

```java
Default item=<itemname> [label="<labelname>"] [icon=<iconref>] [staticIcon=<iconref>]
```

Presents an Item using the default UI representation specified by the type of the given Item.
E.g., a `Dimmer` Item will be represented as a [Slider](#element-type-slider) element while a `Player` Item will be rendered with player button controls (Previous/Pause/Play/Next).

### Element Type 'Text'

```java
Text [item=<itemname>] [label="<labelname>"] [icon=<iconref>] [staticIcon=<iconref>]
```

Presents data as normal text.
Most Item types can be used; the values can be prepared and reformatted by using string formatters and transformations.
Please refer to the documentation on [item State Presentation]({{base}}/configuration/items.html#state-presentation) for details.

**Example:**

```java
Text item=Temperature label="Livingroom [%.1f °C]" staticIcon=temperature
```

![Presentation of the Text element in BasicUI](images/sitemap_demo_text.png)

### Element Type 'Group'

```java
Group item=<itemname> [label="<labelname>"] [icon=<iconref>] [staticIcon=<iconref>]
```

Clicking on a Group element will reveal a new view showing all group items using the [Default](#element-type-default) element type.
In addition, Item groups may be configured to hold a value, just as with normal items.
Please refer to the documentation on [Item groups]({{base}}/configuration/items.html#groups) for details.

- `item` refers to the name of the Item group to be presented.

**Attention:**
There is no way to override the parameters, change the default element type, change the order, use dynamic tags, or insert other elements (e.g. Chart, Image, Webview, etc) in the subframe generated by the Group element.
Please see the Blocks section above for information on how to create a custom subframe with full control over its contents and appearance.

**Example:**

```java
Group item=gTemperature label="Room Temperatures [%.1f °C]"
```

![Presentation of the Group element in BasicUI](images/sitemap_demo_group.png)

### Element Type 'Switch'

```java
Switch item=<itemname> [label="<labelname>"] [icon=<iconref>] [staticIcon=<iconref>] [mappings="<mapping definition>"]
```

Switches are one of the more common elements of a typical Sitemap.
A Switch will present a discrete state Item and allow changing of its value.
Note that Switch elements can be rendered differently on the user interface, based on the Item type and the `mappings` parameter.

- `mappings` comes as an array of value-to-string translations, [documented further down](#mappings).
  Without the mappings parameter, user interfaces will present an On/Off Switch, if mappings are given, several buttons with label or icon will be rendered.

**Examples:**

```java
Switch item=LR_CeilingLight label="Ceiling Light" icon=light
Switch item=LR_TV_Channel label="TV Channel" mappings=[0="DasErste", 1="BBC One", 2="Cartoon Network"]
```

![Presentation of the On/Off Switch element in BasicUI](images/sitemap_demo_switch1.png)
![Presentation of the multi-state Switch element in BasicUI](images/sitemap_demo_switch2.png)

### Element Type 'Buttongrid'

```java
Buttongrid item=<itemname> [label="<labelname>"] [icon=<iconref>] [staticIcon=<iconref>] [buttons="<Button definition>"]
```

A Buttongrid represents a grid of buttons and enables commands to be sent to an Item.
When a button is pressed, the associated command is sent to the linked Item.
Buttons never appear as selected, they do not display the current state of the linked Item.

This is a typical element for simulating a remote control, for example.

- `label` if set, a header row will be displayed containing this label and the icon.
- `buttons` defines the position of each button within the grid and the command associated with each button; provided as an array.

Buttons syntax:

```java
buttons=[row_1:column_1:command_1="description_1", row_2:column_2:command_2="description_2"=<iconname>, ...]
```

The buttons can be defined in any order, their position in the grid is defined by a row index and a column index.
The top left position is row index 1 and column index 1.
The grid must not exceed 12 columns so the maximum allowed column index is 12 columns.
It is not mandatory to define a button in all grid cells.
The user interfaces will automatically determine the grid size so that all buttons are presented.

The content of each button can be text but also an icon; the icon will be used by default if provided.

**Examples:**

```java
Buttongrid label="Remote Control" staticIcon=screen item=RemoteControl buttons=[1:1:POWER="Power"=switch-off , 1:2:MENU="Menu" , 1:3:EXIT="Exit" , 2:2:UP="Up"=f7:arrowtriangle_up , 4:2:DOWN="Down"=f7:arrowtriangle_down , 3:1:LEFT="Left"=f7:arrowtriangle_left , 3:3:RIGHT="Right"=f7:arrowtriangle_right , 3:2:OK="Ok" , 2:4:VOL_PLUS="Volume +" , 4:4:VOL_MINUS="Volume -" , 3:4:MUTE="Mute"=soundvolume_mute]
```

![Presentation of the Buttongrid element in BasicUI](images/sitemap_demo_buttongrid.png)

### Element Type 'Selection'

```java
Selection item=<itemname> [label="<labelname>"] [icon=<iconref>] [staticIcon=<iconref>] [mappings="<mapping definition>"]
```

The Selection element type renders the options as a dropdown menu or as a modal dialog prompt, depending on the user interface.
The element type is, in its use cases, similar to a Switch with multiple states but has the advantage that the main UI stays clean, and more options can be offered.

- `mappings` comes as an array of value-to-string translations, [documented further down](#mappings).

**Example:**

```java
Selection item=LR_TV_Channel label="TV Channel" mappings=[0="DasErste", 1="BBC One", 2="Cartoon Network"]
```

![Presentation of the Selection element in BasicUI](images/sitemap_demo_selection.png)

### Element Type 'Setpoint'

```java
Setpoint item=<itemname> [label="<labelname>"] [icon=<iconref>] [staticIcon=<iconref>] minValue=<min value> maxValue=<max value> step=<step value>
```

- `minValue` (defaults to 0) and `maxValue` (defaults to 100) limit the possible range of the value (both included in the range).
- `step` (defaults to 1) defines how much the value will change when the button is pressed one time.

**Example:**

```java
Setpoint item=KI_Temperature label="Kitchen [%.1f °C]" minValue=4.5 maxValue=30 step=0.5
```

![Presentation of the Setpoint element in BasicUI](images/sitemap_demo_setpoint.png)

### Element Type 'Slider'

```java
Slider item=<itemname> [label="<labelname>"] [icon=<iconref>] [staticIcon=<iconref>] [sendFrequency="frequency"] [switchSupport] [minValue=<min value>] [maxValue=<max value>] [step=<step value>] [releaseOnly]
```

This type presents a value as a user-adjustable control which slides from left (0) to right (100).

- `sendFrequency` is used to distinguish between long and short button presses in the classic (web) frontend.
    This parameter defines the interval in milliseconds for sending increase/decrease requests.

- `switchSupport` is a parameter without an assignment.
  - Android app: If specified, a short press on the item row (except the slider itself) switches the item "on" or "off".
  - This parameter has no effect in other UIs.

- `minValue` (defaults to 0) and `maxValue` (defaults to 100) limit the possible range of the value (both included in the range).
- `step` (defaults to 1) defines the distance between two possible/selectable datapoints on the slider.
- `releaseOnly`: If specified, the new value is only sent on releasing the slider. Otherwise values are sent while sliding.

**Example:**

```java
Slider item=KI_Temperature label="Kitchen"
```

![Presentation of the Slider element in BasicUI](images/sitemap_demo_slider.png)

### Element Type 'Colorpicker'

```java
Colorpicker item=<itemname> [label="<labelname>"] [icon=<iconref>] [staticIcon=<iconref>] [sendFrequency=<sendFrequency>]
```

This element is a combined control for something like a rgb or rgbw light where you can adjust brightness as well es the color hue.
The down-button decreases brightness to zero and switches the light off. The up-button sets brightness to full but keeps the previous color (hue).
The middle button opens an overlay to finetune your color. A color wheel let you pick the hue and a slider allows to set the brightness.

- `sendFrequency` is used to distinguish between long and short button presses in the classic (web) frontend.
  This parameter defines the interval in milliseconds for sending increase/decrease requests.

**Example:**

```java
Colorpicker item=LR_LEDLight_Color label="LED Light Color" staticIcon=colorwheel
```

![Presentation of the Colorpicker element in BasicUI](images/sitemap_demo_colorpicker.png)

### Element Type 'Input'

```java
Input item=<itemname> [label="<labelname>"] [icon=<iconref>] [staticIcon=<iconref>] [inputHint="<inputHint>"]
```

This element allows entering of text, numbers and dates/times and updating the underlying items.
This can for example be useful to update manually collected meter readings and storing the information in an item.
Text, number or number with unit values and dates/times can be updated in the respective item types.
[Formatting](/docs/configuration/items.html#item-label) in the label parameter will format the current value, but the value update will be as entered in the field.
E.g. this makes it possible to use formatting like `[%.0f %unit%]` to show the current value without fractions, but still update to whatever is entered.

- `inputHint` will give a hint to the user interface to use a specific widget adapted to a specific use. Valid values for the parameter are `text`, `number`, `date`, `time` and `datetime`. Support of these widget types vary by user interface and/or browser.

Note that this element type may not be supported on all user interfaces that support sitemaps.

**Example:**

```java
Input item=Meter_Reading label="Meter [%.0f %unit%]" staticIcon=energy inputHint="number"
```

![Presentation of the Input element in BasicUI](images/sitemap_demo_input.png)

### Element Type 'Webview'

```java
Webview item=<itemname> [label="<labelname>"] [icon=<iconref>] [staticIcon=<iconref>] url="<url>" [height=<heightvalue>]
```

The content of a webpage will be presented live on your user interface next to other Sitemap elements.
Please be aware that Webview elements are not usable by all user interface options.

- `label` if set, a header row will be displayed containing this label and the icon.
- `height` is the number of element rows to fill.

**Example:**

```java
Webview url="https://www.openhab.org" height=5
```

![Presentation of the Webview element in BasicUI](images/sitemap_demo_webview.png)

### Element Type 'Mapview'

```java
Mapview [item=<itemname>] [label="<labelname>"] [icon=<iconref>] [staticIcon=<iconref>] [height=<heightvalue>]
```

Displays an [OSM](https://www.openstreetmap.org) map based on a given Location Item.

- `label` if set, a header row will be displayed containing this label and the icon.
- `height` is the number of element rows to fill.

**Example:**

```java
Mapview item=Demo_Location height=5
```

![Presentation of the Mapview element in BasicUI](images/sitemap_demo_mapview.png)

### Element Type 'Image'

```java
Image [item=<itemname>] [label="<labelname>"] [icon=<iconref>] [staticIcon=<iconref>] url="<url of image>" [refresh=xxxx]
```

This element type is able to present an image.
The image must be available on a reachable website or webserver without password or access token.
Alternatively, the image file (e.g. YourImageFile.png) may be stored locally in the $OPENHAB_CONF/html folder, and will be accessible through the static route, `https://<my.openHAB.device>:8080/static/YourImageFile.png`.

- `label` if set, a header row will be displayed containing this label and the icon.
- `item` can refer to either an Image Item whose state is the raw data of the image, or a String Item whose state is an URL that points to an image. Some clients may not (yet) consider `item`.
- `url` is the default URL from which to retrieve the image, if there is no associated Item or if the associated item's state is not a URL.
- `refresh` is the refresh period of the image in milliseconds ("60000" for minutely updates).

**Example:**

```java
Image url="https://raw.githubusercontent.com/wiki/openhab/openhab/images/features.png"

// display a snapshot image from an IP camera, using refresh parameter to get updated images
Image url="https://192.168.1.203:8080/?action=snapshot" refresh=10000
```

![Presentation of the Image element in BasicUI](images/sitemap_demo_image.png)

### Element Type 'Video'

```java
Video [item=<itemname>] [label="<labelname>"] [icon=<iconref>] [staticIcon=<iconref>] url="<url of video to embed>" [encoding="<video encoding>"]
```

Allows you to display a video as part of your Sitemap.
::: tip Note
Not all video encodings (formats) are supported; you may need to transcode your video.
The video must be reachable directly via URL.
An embedded and/or protected video is not supported.
:::

- `label` if set, a header row will be displayed containing this label and the icon.
- `item` can refer to a String Item whose state is a URL to a video. Some clients may not (yet) consider `item`.
- `url` is the default URL from which to retrieve the video if there is no associated Item or if the associated item's state is not a URL.
- `encoding` should be set to "mjpeg" for an MJPEG video, or "HLS" for an HTTP Live Streaming playlist (file with .m3u8 extension).  If you omit the `encoding` parameter, openHAB will attempt to automatically select the correct format.

**Example:**

```java
Video url="https://demo.openhab.org/Hue.m4v"
```

![Presentation of the Video element in BasicUI](images/sitemap_demo_video.png)

### Element Type 'Chart'

```java
Chart item=<itemname> [label="<labelname>"] [icon=<iconref>] [staticIcon=<iconref>] [refresh=xxxx]
period=xxxx [service="<service>"] [legend=true/false] [forceasitem=true/false] [yAxisDecimalPattern=xxxx]
```

Adds a time-series chart object for the display of logged data.

- `label` if set, a header row will be displayed containing this label and the icon.

- `refresh` defines the refresh period of the Image (in milliseconds).

- `service` sets the persistence service to use.
    If no service is specified, openHAB will use the first queryable persistence service it finds.
    Therefore, for an installation with only a single persistence service, this is not required.

- `period` is the scale of the time axis.
    The time axis can be either entirely in the past ending at the present time, entirely in the future starting at the present time, or partly in the past and partly in the future around the present time.
    To do this, the value can be composed of two parts separated by the "-" character, the value before the "-" is then the scale in the past and the value after the "-" is the scale in the future.
    Valid values before and after the central character "-" are `h, 2h, 3h, ..., D, 2D, 3D, ..., W, 2W, 3W, ..., M, 2M, 3M, ..., Y, 2Y, ...` and any valid duration following the ISO8601 duration notation such as `P1Y6M` for the last year and a half or `PT1H30M` for the last hour and a half.
    If only a period is provided, i.e. without the final "-" character or without anything after the "-" character, only a period in the past is taken into account.

- `legend` is used to show or to hide the chart legend.
    Valid values are `true` (always show the legend) and `false` (never show the legend).
    If this parameter is not set, the legend is hidden if there is only one chart series.

- `forceasitem` is used to show the value of a `Group` instead of showing a graph for each member (which is the default).

- `yAxisDecimalPattern` is used to format the values on the y axis.
    It accepts [DecimalFormat](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/DecimalFormat.html).
    For example with `#.##` a number has to decimals.

Visit [Charts](https://github.com/openhab/openhab/wiki/Charts) in the Wiki for examples.

**Other options to look out for:**
The Chart element type is a good way to present time series data quickly.
For more sophisticated diagrams, openHAB supports the integration of outside sources like most logging and graphing solutions (e.g. [Grafana](https://grafana.org)).
See this [Tutorial](https://community.openhab.org/t/13761/1) for more details.

**Technical constraints and details:**

- When using rrd4j persistence, the strategy `everyMinute` (60 seconds) has to be used. Otherwise no data will be persisted (stored) and the chart will not be drawn properly (see [rrd4j Persistence](/addons/persistence/rrd4j)).
- The visibility of multiple Chart objects may be toggled to simulate changing the Chart period; non-visible Chart widgets are NOT generated behind the scenes until they become visible.
- When charting a group of item, make sure that every label is unique.

## Mappings

Mappings is an optional parameter for the [Switch](#element-type-switch) and [Selection](#element-type-selection) element types.

Mapping syntax:

```java
mappings=[value_1="description_1", value_2="description_2"=<iconname>, ...]
```

Examples:

```java
mappings=[ON="on", OFF="standby"]
mappings=[1="DasErste", 2="BBC One", 3="Cartoon Network"]

mappings=[OFF="All heaters off"]
mappings=[15="Gone", 19="Chilly", 21="Cozy"]

mappings=[ON="Mic On"=material:mic, OFF="Mic Off"=material:mic_off]
```

As you can see, different Item data types are accepted as mappings values.
The first two lines show very typical use cases.
Imagine your TV is part of your openHAB setup.
Its power state is represented by a binary Switch Item.
Its channel number is a discrete number Item that may only be set to one of three states.
By using a Switch or Selection element with a mappings array, you can replace these meaningless values with user-friendly descriptions for display on the user interface.

This mapping changes the displayed power state of the TV from "ON" and "OFF" to the more accurate terms, "on" and "standby".
Similarly, mapping above changes the numbers "1", "2", and "3" to "DasErste", "BBC One", and "Cartoon Network" respectively.

In the third and fourth examples above, only a subset of the possible values of items belonging to a heating system are presented to the user.
This limits the possible input values, which is yet another often occurring use case for mappings.

In the fifth example above, user interfaces will display buttons using the provided icon rather than the provided description.
Icons are usable in Switch element but ignored in Selection element.

## Dynamic Sitemaps

All Sitemap elements can be configured to be hidden, color highlighted or to have a [dynamic icon]({{base}}/configuration/items.html#dynamic-icons), depending on certain Item states.
A few practical use cases are:

- Show a battery warning if the voltage level of a device is below 30%
- Hide further control elements for the TV if it is turned off
- Highlight a value with a warning color if it is outside accepted limits
- Present a special icon, depending on the state of an item (a [dynamic icon]({{base}}/configuration/items.html#dynamic-icons))

### Visibility

The `visibility` parameter is used to dynamically show or hide an Item.
If the parameter is not provided, the default is to display the Item.

Visibility syntax:

```java
visibility=[item_name operator value, item_name operator value AND item_name operator value, ... ]
```

You can set as many conditions as you want.

A condition can be a single comparison or a combination of several comparisons all separated by the AND operator.
A condition including the AND operator will be considered as true if all individual comparisons are considered as true.
Of course, it is possible to reference a different item in each comparison.

Note that `item_name` and `operator` are both optional.
If `item_name` is not provided, the Item name will default to the current Item.
If an operator is not specified, the operator will default to `==`.

Valid comparison operators are:

- equal to `==`, unequal to `!=`
- less than or equal to `<=`, greater than or equal to`>=`
- less than `<`, greater than `>`

Expressions are evaluated from left to right.
The Item will be visible if any one of the conditions is evaluated as `true`, otherwise it will be hidden.

**Examples:**

```java
Text item=BatteryWarning visibility=[Battery_Level<30]
Switch item=CinemaLight label="Cinema light" visibility=[TV_Power==ON]
Switch item=LawnSprinkler visibility=[Day_Time=="Morning", Day_Time=="Afternoon", Temperature>19]
Switch item=LawnSprinkler visibility=[Day_Time=="Morning" AND Temperature>19]
```

In the third example above, a control for a lawn sprinkler will be visible if it is Morning, _OR_ if it is Afternoon, _OR_ if the temperature is above 19 °C.
In the fourth example above, multiple conditions are combined, a control for a lawn sprinkler will be visible if it is Morning _AND_ if the temperature is above 19 °C.

### Label, Value and Icon Colors

Colors can be used to emphasize an items label or its value based on conditions.
Colors may be assigned to either the label or the value associated with an Item.
The icon may be tinted depending on the state as well.

**Label, Value and Icon Color Syntax:**

```java
labelcolor=[item_name operator value = "color", item_name operator value AND item_name operator value = "color", ... ]
valuecolor=[item_name operator value = "color", item_name operator value AND item_name operator value = "color", ... ]
iconcolor=[item_name operator value = "color", item_name operator value AND item_name operator value = "color",... ]
```

You can set as many conditions as you want, along with a color for each condition.

A condition can be a single comparison or a combination of several comparisons all separated by the AND operator.
A condition including the AND operator will be considered as true if all individual comparisons are considered as true.
Of course, it is possible to reference a different item in each comparison.

Note that `item_name` and `operator` are both optional.
If `item_name` is not provided, the Item name will default to the current Item.
If an operator is not specified, the operator will default to `==`.

If only a color is specified, that condition is considered as true and that color will be used.
Providing only a color can be used as a last condition to set a default color that will be used when none of the other previous conditions were true.

The comparison operators for `labelcolor`, `valuecolor` and `iconcolor` are the same as for the visibility parameter.

**Examples:**

The following three lines are equivalent.

```java
Text item=Temperature labelcolor=[>0="blue"] valuecolor=[22="green"] iconcolor=[22="green"]
Text item=Temperature labelcolor=[>0="blue"] valuecolor=[==22="green"] iconcolor=[==22="green"]
Text item=Temperature labelcolor=[Temperature>0="blue"] valuecolor=[Temperature==22="green"] iconcolor=[Temperature==22="green"]
```

The line below illustrates setting a default color (gray) and how to combine multiple comparisons with an AND operator:

```java
Text item=NumberItem labelcolor=[>0 AND <50="yellow", >=50="green", "gray"] valuecolor=[>0 AND <50="yellow", >=50="green", "gray"] iconcolor=[>0 AND <50="yellow", >=50="green", "gray"]
```

The line below illustrates the importance of operator order:

```java
Text item=Temperature valuecolor=[Last_Update=="Uninitialized"="gray",
                                  >=25="orange", >=15="green", 0="white", <15="blue"]
```

Note that expressions are evaluated from left to right; the first matching expression determines the color.
If the order of the expressions was reversed, the color assignment would not work.
Note also, the effect of omitting `Temperature` and the comparison operator in the expression `0="white"` (as compared to `==0="white"`).

Below is a list of standard colors and their respective RGB color codes.

| Color Name | Preview                                     | RGB Color Code |
|------------|---------------------------------------------|----------------|
| maroon     | <div style="color: #800000;">&#11044;</div> | `#800000`      |
| red        | <div style="color: #ff0000;">&#11044;</div> | `#ff0000`      |
| orange     | <div style="color: #ffa500;">&#11044;</div> | `#ffa500`      |
| olive      | <div style="color: #808000;">&#11044;</div> | `#808000`      |
| yellow     | <div style="color: #ffff00;">&#11044;</div> | `#ffff00`      |
| purple     | <div style="color: #800080;">&#11044;</div> | `#800080`      |
| fuchsia    | <div style="color: #ff00ff;">&#11044;</div> | `#ff00ff`      |
| pink       | <div style="color: #ffc0cb;">&#11044;</div> | `#ffc0cb`      |
| white      | <div style="color: #ffffff;">&#11044;</div> | `#ffffff`      |
| lime       | <div style="color: #00ff00;">&#11044;</div> | `#00ff00`      |
| green      | <div style="color: #008000;">&#11044;</div> | `#008000`      |
| navy       | <div style="color: #000080;">&#11044;</div> | `#000080`      |
| blue       | <div style="color: #0000ff;">&#11044;</div> | `#0000ff`      |
| teal       | <div style="color: #008080;">&#11044;</div> | `#008080`      |
| aqua       | <div style="color: #00ffff;">&#11044;</div> | `#00ffff`      |
| black      | <div style="color: #000000;">&#11044;</div> | `#000000`      |
| silver     | <div style="color: #c0c0c0;">&#11044;</div> | `#c0c0c0`      |
| gray       | <div style="color: #808080;">&#11044;</div> | `#808080`      |
| gold       | <div style="color: #ffd700;">&#11044;</div> | `#ffd700`      |

Please take note that colors other than those listed in the list above may be used.
Generally, you can expected that valid HTML colors will be accepted (e.g. `green`, `lightgrey`, `#334455`), but note that a UI may only accept internally defined colors, or work with a special theme.
The color names above are agreed on between all openHAB UIs and are therefore your safest choice.
Colors defined by a human-readable name may be adjusted for higher contrast, e.g. on a dark theme `black` may be displayed as white, because white has a higher contrast to the dark background compared to black.

There are also the following keywords that can be used as colors:

| Color Name | Note                               |
|------------|------------------------------------|
| primary    | Primary theme color                |
| secondary  | Secondary theme color              |
| itemValue  | The state of the linked Color item |

### Icons

openHAB allows a set of icons to be assigned to the different states of an Item and therefore to be presented in a Sitemap.
This first way of proceeding only considers the current state of the linked item and requires the use of icons provided by openHAB and a particular syntax of icon names.
Please refer to the documentation on [Item configuration]({{base}}/configuration/items.html#icons) for details.

![battery-0](/iconsets/classic/battery-0.svg "battery-0")
![battery-30](/iconsets/classic/battery-30.svg "battery-30")
![battery-60](/iconsets/classic/battery-60.svg "battery-60")
![battery-100](/iconsets/classic/battery-100.svg "battery-100")

There is also a more powerful way to define a dynamic icon based on the states of different items and allowing you to attach any type of icon regardless of its source (not restricted to icons provided by openHAB).

The `icon` parameter can be used to provide conditional rules.

Extended icon syntax:

```java
icon=[item_name operator value = icon, item_name operator value AND item_name operator value = icon, ... ]
```

You can set as many conditions as you want, along with a reference to an icon for each condition.

A condition can be a single comparison or a combination of several comparisons all separated by the AND operator.
A condition including the AND operator will be considered as true if all individual comparisons are considered as true.
Of course, it is possible to reference a different item in each comparison.

Note that `item_name` and `operator` are both optional.
If `item_name` is not provided, the Item name will default to the current Item.
If an operator is not specified, the operator will default to `==`.

Conditions are evaluated from left to right; the first matching condition determines the icon.
If only a reference to an icon is specified, that condition is considered as true and that icon will be used.
Providing only a reference to an icon can be used as a last condition to set a default icon that will be used in case any of the other previous conditions is true.

The comparison operators are the same as for the visibility parameter.

**Examples:**

The following three lines are equivalent.

```java
Text item=TemperatureTrend icon=["UP"=f7:arrowtriangle_up, "DOWN"=f7:arrowtriangle_down, f7:arrowtriangle_right]
Text item=TemperatureTrend icon=[=="UP"=f7:arrowtriangle_up, =="DOWN"=f7:arrowtriangle_down, f7:arrowtriangle_right]
Text item=TemperatureTrend icon=[TemperatureTrend=="UP"=f7:arrowtriangle_up, TemperatureTrend=="DOWN"=f7:arrowtriangle_down, f7:arrowtriangle_right]
```

## Full Example

![Presentation of the example in BasicUI](images/sitemap_demo_fullexample.png)

<!-- Note to author: If you update this example, remember to copy it to the beginning of this article as well! -->

```java
sitemap demo label="My home automation" {
    Frame label="Date" {
        Text item=Date
    }
    Frame label="Demo" {
        Switch item=Lights icon="light"
        Text item=LR_Temperature label="Livingroom [%.1f °C]"
        Group item=Heating
        Text item=LR_Multimedia_Summary label="Multimedia [%s]" staticIcon="video" {
            Selection item=LR_TV_Channel mappings=[0="off", 1="DasErste", 2="BBC One", 3="Cartoon Network"]
            Slider item=LR_TV_Volume
        }
    }
}
```

<!-- Note to author: If you update this example, remember to copy it to the beginning of this article as well! -->

Explanation:

- The Sitemap "demo" with the shown title "My home automation" is defined.

- One first Frame with a date stamp is shown.

- Another Frame with a visual label "Demo" is presented, containing:

  - A Switch for the Item "Lights"

  - A Text element showing a temperature in a given format

  - A Group element. Upon clicking the element, a new view containing all "Heating" Items will be shown.

  - Another Text element showing a "Multimedia" summary, e.g. "Currently playing".
        The element is additionally the host for a nested block.
        By clicking in the element, a new view with two elements is presented:
    - A Selection presenting four options in a modal dialog prompt
    - A Slider to set the volume (e.g. 0-100%)

<!-- Note to author: If you update this example, remember to copy it to the beginning of this article as well! -->

## Further notes and comparison details

- String comparisons are case sensitive, so `==ON` is not the same as `==on`.

- DateTime comparisons are relative to the current time and specified in seconds.
    So the expression `Lights_On_Time > 300` will return true if the DateTime Item is set to a value that's newer than the past 5 minutes (300 seconds).

- Further examples for defining Sitemaps can be found in our [openHAB-Samples](https://github.com/openhab/openhab/wiki/Samples-Sitemap-Definitions) section.
