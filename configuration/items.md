---
layout: documentation 
title: Items
---

{% include base.html %}

# Items

{::options toc_levels="2..4"/}

* TOC
{:toc}

## Introduction

OpenHAB has a strict separation between the physical world and the application, which is built around the notion of "Items" (also called the virtual layer).

Items represent functionality that is used by the application (mainly user interfaces or automation logic).
Items have a **state** and changes and updates to that **state** generates **events** which can trigger automation.
They can be **read from**, or **written to**, in order to interact with them.

Items can be **bound to bindings** and **linked to channels**. For example, an Item bound to a sensor receives updated sensor readings and an Item linked to a light's dimmer channel can set the brightness of the lght.
Read the [docs]({{base}}/addons/bindings.html) page for the respective binding to get more information about possible connections and examples.

There are two methods for defining items.
The first is through PaperUI if the binding supports it. Generally all 2.x version bindings can be configured through PaperUI.

The second is by manually editing text `.items` files in the `items` folder.
Files here must have the extension `.items` and you can make as many `.items` files as you need/want; however, each Item must be unique across them all.
Refer to the [installation docs]({{base}}/installation/index.html) to determine your specific installations folder structure.
Generally 1.x version bindings can only be bound to Items through `.items` files.

Groups are also defined in the `.items` files. Groups are a special type of Item that allows one to create a set of Items which are all treated as one unit.
Groups can be nested inside other groups, and Items can be in none, one, or multiple groups.

Typically Items are defined using the [Eclipse SmartHome Designer]({{base}}/installation/designer.html) by editing the items definition files.
Doing so you will have full IDE support like syntax checking, context assist, etc.

## Item Syntax
Items are defined in the following syntax:

```xtend
itemtype itemname ["labeltext"] [<iconname>] [(group1, group2, ...)] [["tag1", "tag2", ...]] [{bindingconfig}]
```

Parts in square brackets ([]) are optional.

The parts of an Item must be defined in this order.

**Example:**

```xtend
Number LivingRoom_Temperature "The Temperature is [%.1f °C]" <temperature> (gTemperature, gLivingRoom) ["TargetTemperature"] {knx="1/0/15+0/0/15"}
```

The example above defines an item:

* of type `Number`
* with name `LivingRoom_Temperature`
* formatting its output in format `%.1f °C` (See Formatting section for syntax explanation)
* displaying icon `temperature`
* belonging to groups `gTemperature` and `gLivingRoom`
* tagged as a thermostat ("TargetTemperature") for usage with I/O addons like [Hue Emulation]({{base}}/addons/io/hueemulation/readme.html)
* bound to the openHAB binding `knx` with write group address `1/0/15` and listening group address `0/0/15`

## Item Types
The Item type defines which kind of values can be stored in that Item and which commands can be sent to it.

Each Item type has been optimized for certain components in your smart home.
This optimization is reflected in the data types, and command types.

An example:
A Philips Hue RGB light bulb provides three pieces of information.
Its on or off state, its current brightness, and the color.

If you want to change one of these values you can use any of four Item types.

* Switch the bulb on or off (`Switch` Item)
* Increase or decrease the brightness (`Dimmer` Item)
* Set the brightness to a specific value (`Number` Item)
* Change the bulb's color (`Color` Item)

All available openHAB2 Item types and their relevant commands can be viewed [here]({{base}}/concepts/items.html).

### Dimmers vs Switches
While a Dimmer Item can accept either On/Off, Increase/Decrease, or Percent updates or command, a Dimmer Item stores its state as a Percent value.
See the following example:

Item:

```xtend
Dimmer  Light_FF_Office  "Dimmer [%d %%]"  {milight="bridge01;3;brightness"}
```

sitemap:

```xtend
Switch  item=Light_FF_Office
Slider  item=Light_FF_Office
```

When the Switch widget is used, it sends ON or OFF commands to the Item which are mapped to 100% and 0%, respectively.
When the slider widget is used, it sends Percent commands (values between 0 and 100) to the Item, which are used as the Item's state.
In the example above, if you move the Slider widget to 60%, move the Switch to OFF, and finally move the switch to ON, the Item's state will be 100%.

## Item Name
The Item name is the unique name of the Item which is used in the `.sitemap`, `.rule` etc. files.
The name must be unique across all Item files.
The name should only consist of letters, numbers and the underscore character.
Spaces and special characters cannot be used.

## Item Label
The label text has two purposes.
First, this text is used to display a description of the specific item (for example, in the sitemap).
Second, it can be used to format or transform the Item's state (for example, making DateTime output more readable).
The state and format of the state is contained inside `[ ]` in the label. See Formatting below for more details.

## Groups
The Item type _Group_ is used to define a Group in which you can nest/collect other items, including other Groups.
You don't need Groups, but they are a great help for your openHAB configuration.
Groups are supported in `sitemaps`, `rules`, `functions`, the `bindingname.cfg` files, and more places.
In all these places you can either write every single applicable item, i.e. All temperature sensors, or if you have grouped your items, you just use this group instead.

On the sitemap, a Group can be included as an Item which is useful to, for example, present a single switch to control multiple lights, or as a Group in which case the sitemap will generate a subframe to display all the members of the Group using their default display parameters.

A Group's state is an aggregation of the states of all its members. Sending a command to a Group will cause that command to be forwarded to all the Group's members.

A simple example Group definition is:

```xtend
Group  TemperatureSensors
```

### Nested Groups
To take this a step further you can begin to nest groups like in the example below:

```xtend
Group  All
Group  gSensor             (All)
Group  gTemperature        (gSensor)

Number  Sensor_Temperature  "The Temperature is [%.1f °C]"  <temperature>  (gTemperature)  {knx="1/0/15+0/0/15"}
```

The Item `Sensor_Temperature` is a member of the Group `gTemperature`, which is itself a member of the Group `gSensor`, which is a member of the Group `All`.

The Item will only be included into each group once, regardless of the number of times the group is nested.
To give an example: the Item `Sensor_Temperature` only exists once in the group `All`.

### Group item types
Group items can also be used to easily determine one or more Items with a defined value or can be used to calculate a value depending on all values within the Group.
Please note that this can only be used if all items in the Group have compatible types.
The format for this is:

```xtend
Group:itemtype:function  itemname  ["labeltext"]  [<iconname>]  [(group1, group2, ...)]
```

By default, if no function is provided to the group, the Group uses OR.
So for a Group of switches the Group state will be ON if any of the members states are ON.
But this means that once one Item in the group has its state change to ON, the Group's state gets set.
Each subsequent Item that changes state to ON will not trigger "myGroup changed" because the Group isn't changing.

This is not a bug, it is the expected and designed behavior.
Because the Group state is an aggregate, every change in the Item members does not necessarily result in a change to the Group's state.
But, this also means that any single change to a member of the Group will result in multiple updates to the aggregate state of the Group.

Group functions can be any of the following:

Function            | Description
--------------------|------------
AND(value1, value2) | This does a logical 'AND' operation. Only if all items are of 'value1' this is returned, otherwise the 'value2' is returned.
AVG                 | Calculates the numeric average over all item values of decimal type.
MAX                 | This calculates the maximum value of all item values of decimal type.
MIN                 | This calculates the minimum value of all item values of decimal type.
NAND(value1, value2)| This does a logical 'NAND' operation. The value is 'calculated' by the normal 'AND' operation and than negated by returning the opposite value. E.g. when the 'AND' operation calculates the value1 the value2 will be returned and vice versa.
NOR(value1, value2) | This does a logical 'NOR' operation. The value is 'calculated' by the normal 'OR' operation and than negated by returning the opposite value. E.g. when the 'OR' operation calculates the value1 the value2 will be returned and vice versa.
OR(value1, value2)  | Does a logical 'OR' operation. If at least one item is of 'value1' this is returned, otherwise the 'value2' is returned.
SUM                 | Calculates the sum of all items in the group.

An example of this would be:

```xtend
Group:Contact:OR(OPEN,CLOSED)  gMotionSensors  (All)
```

## Formatting
Formatting is done applying [Java formatter class syntax](http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax), therefore the syntax is

```xtend
[%[argument_index$][flags][width][.precision]conversion]
```

Only the leading '%' and the trailing 'conversion' are mandatory.
The **argument_index$** must be used if you want to convert the value of the item several times within the label text or if the item has more than one value.
Look at the DateTime and Call item in the following example.

```xtend
Number    MyTemperature  "The Temperature is [%.1f] °C"   { someBinding:somevalue }
String    MyString       "Value: [%s]"                    { someBinding:somevalue }
DateTime  MyLastUpdate   "Last Update: [%1$ta %1$tR]"     { someBinding:somevalue }
```

The output would look like this:

```text
Temperature 23.2 °C
Value: Lorem ipsum
Last Update: Sun 15:26
```

## Transforming
Another possibility in label texts is to use a transformation.
They are used for example to translate a status into another language or convert technical value into human readable ones.
To do this you have to create a .map file in your `transform` folder.
These files are typical key/value pair files.

```text
key1=value1
key2=value2
...
```

Let's make a small example to illustrate this function.
If you have a sensor which returns the number 0 for a closed window and 1 for an open window, you can transform these values into the words "opened" or "closed".
Create a map file named window.map for example and add the desired keys and values.

```text
0=closed
1=opened
NULL=unknown
-=unknown
```

Next we define two items.
One showing the raw value as it is provided from our sensor and one with transformed value.

```xtend
Number WindowRaw          "Window is [%d]"                  { someBinding:somevalue }
Number WindowTransformed  "Window is [MAP(window.map):%s]"  { someBinding:somevalue }
```

The output will be:

```text
Window is 1
Window is opened
```

Transform files use UTF-8 encoding, so Unicode symbols will also work.

```text
ARIES=♈ Aries
TAURUS=♉ Taurus
WAXING_CRESCENT=🌑→🌓 Waxing Crescent
FIRST_QUARTER=🌓 First Quarter
```

## Icons
OpenHAB provides a set of [basic icons]({{base}}/addons/iconsets/classic/readme.html) by default.
However if you wish to use custom icons you need to place them inside the `conf/icons/classic/` folder.
These icons will be used in all of the openHAB frontends.

The images must be in `.png` or `.svg` format, consist of only lowercase letters, hyphens `-` or underscores `_` (if required).
The PaperUI interface (or via the classicui.cfg or basicui.cfg files) allows you to define whether you use Vector (.svg) or Bitmap (.png) icon files by default.

To use a custom icon called `heatpump.svg` the correct syntax is `<heatpump>` in the Item definition.

## Dynamic Icons
You can dynamically change the icon depending on the Item's state.

Dynamic icons must meet the following criteria:

* there must be a default icon
* the name and state part of the icon must consist of all lower case letters, even if the State the icon matches includes uppercase letters
* the icon selected is based on the mapped value used in the label (i.e. what gets returned by `[MAP(file.map):%s]`, not the Item's raw state.

The name of dynamic icons must meet the following format:

```
<name>[-<state>].<png or svg>
```
Where:

* `<name>` is the name of the icon set
* `[-<state>]` is the state that particular icon maps to, the icon without the state part is the default
* `<png or svg>` based on the format of the icon, use the default format as explained above

For example:

| switch.svg     | default, used when no other matching icon is found |
| switch-off.svg | Matches OFF, or "off"                              |
| switch-on.svg  | Matches ON, or "on"                                |

To use the dynamic items just use the default icon name without the extension.

```xtend
Switch  Light_FrontDoor  "Front Door light is [MAP(en.map):%s]"  <switch>  {somebinding:someconfig}
```

As mentioned above, one note of caution is the state used by the sitemap to select the proper icon is the transformed state. So when using a MAP in the label, the icon name must match the mapped state displayed on the sitemap, not the raw Item's state. To use the `Number Window` example from above, the icons for `Number Window` would be:

```xtend
window.png
window-1.png
window-0.png
```

and the icons for `Number WindowTransformed` would be:

```xtend
window.png
window-open.png
window-closed.png
```

## Binding Configuration

As mentioned above, there are two ways to bind/link a device to an Item: 1.x Binding Configs and 2.x Channel Linking.

When you install a binding through PaperUI it will automatically create a `.cfg` file in `conf/services/` for the appropriate binding.
Inside these files are a predefined set of variables which are required for the binding to operate.
In many cases you will need to view and edit these to suit your system.
These variables can hold IP addresses, API keys, user names, passwords etc.
These are all in plain text, so be careful who you share these with if some data is sensitive.

### 1.x Binding Configs
The 1.x binding config defines from where the Item gets it values, and where a given value/command should be sent.

You bind an Item to a binding by adding a binding definition in curly brackets at the end of the Item definition

```xtend
{ nh="192.168.1.123:80" }
```

Where _ns_ is the namespace for a certain binding like "network", "netatmo", "zwave" etc.
Every binding defines what values must be given in the binding configuration string.
That can be the id of a sensor, an ip or mac address or anything else.
You must have a look at your [Bindings]({{base}}/addons/bindings.html) configuration section to know what to use.
Some typical examples are:

```xtend
Switch Phone_Mobile        "My Mobile Phone"               { nh="192.168.1.123:80" }
Number Netatmo_Indoor_CO2  "CO2 [%d]"                      { netatmo="00:00:00:00:00:00#Co2" }
Number Azimuth             "Azimuth [%d]"                  { astro="planet=sun, type=position, property=azimuth" }
Contact Garage             "Garage is [MAP(en.map):%s]     { zwave="21:command=sensor_binary,respond_to_basic=true" }
```

If you need to use legacy openHAB 1.x bindings then you need to enable this feature through the PaperUI menu by turning on "Include Legacy 1.x Bindings" found at `/configuration/services/configure extension management/`.
After downloading the legacy .jar files, they need to be placed in the `/addons/` folder.
If further configuration is required then you will need to create an `openhab.cfg` file in `/conf/services/` and paste the appropriate binding configuration into this.
For all other native openHAB2 bindings, configuration is done through a `bindingname.cfg` file in the same location.

### 2.x Binding Configs
The 2.x bindings introduce the concept of [Things and Channels]({{base}}/concepts/things.html). Unlike with 1.x verion bindings which each define their
own format for the binding config that is defined on the Item itself, 2.x bindings define those parameters in a Thing. Each Thing has one or more Channels
and Items are linked to one or more Channels.

Some bindings support automatic discovery of Things in which case discovered Things will appear in the Inbox in PaperUI. Once accepted it will appear under Configuration > Things.

Other bindings support defining Things in a .things file.

See the [Bindings]({{base}}/addons/bindings.html) configuration section to know how to discover or manually define things for a given binding.

####PaperUI Linking

One can link an Item with a Channel using PaperUI. 

First create the Item in PaperUI under Configuration Items. 

Next navigate to the Thing that has the Channel to link to the Item.

Click on the expand icon to the right of the Channel to link to the Item and press the `+` next to "Linked items." 

Select the Item from the list and press "Link".

####Text File Linking

One can also link an Item with a Channel using the `.items` file.
To discover the Channel ID to link to an Item browse to that Thing in PaperUI. All of the channels that Thing support appear at the bottom of the Thing's page.

Linking an Item to a channel is of the form:

```xtend
{ channel="channel id" }
```

Some examples:

```xtend
Switch  Phone_Mobile       "My Mobile Phone"               { channel="network:device:devicename:online" }
Number  Netatmo_Indoor_CO2 "CO2"                           { channel="netatmo:NAMain:home:inside:Co2" }
Number  Azimuth            "Azimuth"                       { channel="astro:sun:home:position#azimuth" }
Contact Garage             "Garage is [MAP(en.map):%s]"    { channel="zwave:21:command=sensor_binary,respond_to_basic=true" }
```

## Restore States
When restarting your openHAB installation you may find there are times when your logs indicate some items are UNDEF.
This is because, by default, item states are not persisted when openHAB restarts.
To have your states persist across restarts you will need to install a [Persistence]({{base}}/configuration/persistence.html) extension.

Specifically, you need to use a `restoreOnStartup` strategy for all your items.
Then whatever state they were in before the restart will be restored automatically.

```xtend
Strategies {
    default = everyUpdate
}

Items {
    // persist all items on every change and restore them from the MapDB at startup
    * : strategy = everyChange, restoreOnStartup
}
```
