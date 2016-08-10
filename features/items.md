---
layout: documentation
title: Items
---

{% include base.html %}

# Items

## Introduction
OpenHAB has a strict separation between the physical world and the application, which is built around the notion of “items” (also called the virtual layer).

Items represent functionality that is used by the application (mainly user interfaces or automation logic). Items have a state and are used through events. They can be read from, or written to, in order to interact with them.
Items can be bound to bindings i.e. for reading the status from e.g. Sonos, or for updating them. Read the [docs](http://docs.openhab.org/addons/bindings.html) page for the respective binding for more help and examples.
There are two methods for defining items. If the binding supports it, PaperUI can do this. Otherwise items must be defined in one or more files in the `items` folder. Files here must have the extension .items but you can make as many .items files as you need/want however each item must be unique across them all. Refer to the [installation docs](http://docs.openhab.org/installation/index.html) to determine your specific installations folder structure.

Groups are also defined in the .items files. Groups can be nested inside other groups, and items can be in none, one, or more groups.

Typically items are defined using the [openHAB Designer](http://docs.openhab.org/installation/designer.html) by editing the items definition files. Doing so you will have full IDE support like syntax checking, context assist etc.

## Item Syntax
Items are defined in the following syntax:
```xtend
itemtype itemname ["labeltext"] [<iconname>] [(group1, group2, ...)] [{bindingconfig}]
```
Note: Parts in square brackets ([]) are optional.

**Example**
```xtend
Number Sensor_Temperature "The Temperature is [%.1f °C]" <temperature> (gTemperature, gSensor) {knx="1/0/15+0/0/15"}
```
The example above defines an item:
- of type `Number`
- with name `Sensor_Temperature`
- formatting its output in format `%.1f °C` (See Formatting section for syntax explanation)
- displaying icon `temperature`
- belonging to groups `gTemperature` and `gSensor`
- bound to openHAB binding `knx` with write group address `1/0/15` and listening group address `0/0/15`

## Item Types
The item type defines which kind of values can be stored in that item and which commands can be sent to it.

Each item type has been optimized for certain components in your smart home. This optimization is reflected in the data types, and command types.

An example:
Have a look at the following table and find the itemtype "Color". A Philips Hue RGB light bulb provides three pieces of information. Its on or off state, its current brightness, and the color.

If you want to change one of these values you can use four commands.
- Switch the bulb on or off (`Switch` item)
- Increase or decrease the brightness (`Dimmer` Item)
- Set the brightness to a specific value (`Number` item)
- Change the bulb's color (`Color` item)

OpenHAB2 provides you the following item types:

Item Type | Description | Accepted Command Types
----------|-------------|-----------------------
Switch    | Represents a switch that can be ON or OFF e.g. lights, etc. but can also represent virtual switches e.g. presence detection, etc. | OnOff
Number    | Stores a decimal value and is usually used for all kinds of sensors, i.e. temperature, brightness, wind, etc. It can also be used as a counter or as any other thing that can be expressed as a number.                                                               | Decimal
String    | Stores any kind of string or textual representation of a DateTime.       | String
Group     | Item to nest other items / collect them in groups                        | The accepted command types of a group item is the same as of the underlying base item. If none is defined, the intersection of all sets of accepted command types of all group members is used instead.
Dimmer    | Accepts percent values to set the dimmed state. Can also be used as a switch by accepting ON/OFF commands (though this only mimics a Switch by sending 0% and 100% for ON/OFF. See 'Dimmers vs Switches' note below                                                 | OnOff, IncreaseDecrease, Percent
Color     | Can be used for color information (RGB)                                  | OnOff, IncreaseDecrease, Percent, HSB
Contact   | Can be used for sensors that return an "open" or "close" as a state. This is useful for doors, windows, etc. | OpenClose
DateTime  | Stores a timestamp including a valid time zone.                          | DateTime
Player    | Allows the conrtol players, i.e. Sonos or Squeezebox.                    | PlayPause, NextPrevious, RewindFastforward
Rollershutter | Allows the control of roller shutters, i.e. moving them up, down, stopping or setting it to close to a certain percentage. | UpDown, StopMove, Percent

### Dimmers vs Switches
While a Dimmer item can accept either OnOff, IncreaseDecrease, or Percent updates, Dimmer items store their state as a Percent value.  See the following example:

item:
```xtend
Dimmer  Light_FF_Office  "Dimmer [%d %%]"  {milight="bridge01;3;brightness"}
```

sitemap:
```xtend
Switch  item=Light_FF_Office
Slider  item=Light_FF_Office
```
When the Switch widget is used, it sends ON or OFF commands to the item, but these are mapped to 100% and 0%, respectively.  When the slider widget is used, it sends Percent commands to the item, which are used as the item's state.  In the example above, if you move the Slider widget to 60%, move the Switch to OFF, and finally move the switch to ON, the item's state will be 100%.

## Item names
The item name is the unique name of the item which is used in the .sitemap, .rule etc files. The name must be unique across all item files. The name should only consist of letters, numbers and the underscore character. Spaces cannot be used.

## Label text
The label text has two purposes. First, this text is used to display a description of the specific item (for example, in the sitemap). Second, it can be used to format or transform output from the item (for example, making DateTime output more readable). If you want to display a special character you must mask the character with a '%'. So, to display one '%' enter the text '%%'.

## Groups
The item type _group_ is used to define a group in which you can nest/collect other items, including other groups. You don't need groups, but they are a great help for your openHAB configuration. Groups are supported in `sitemaps`, `rules`, `functions`, the `bindingname.cfg` files, and more places. In all these places you can either write every single applicable item, i.e. All temperature sensors, or if you have grouped your items, you just use this group instead. A simple example group definition is:

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

The item `Sensor_Temperature` is a member of the group `gTemperature`, which is itself a member of the group `gSensor`, which is a member of the group `All`.

The item will only be included into each group once, regardless of the number of times the group is nested. e.g. The item `Sensor_Temperature` only exists once in the group `All`.

### Group item types
Group items can also be used to easily determine one or more items with a defined value or can be used to calculate a value depending on all values within the group. Please note that this can only be used if all items in the group have the same type. The format for this is:

```xtend
Group:itemtype:function  itemname  ["labeltext"]  [<iconname>]  [(group1, group2, ...)]
```

By default, if no function is provided to the group, the Group uses OR. So for a Group of switches the Group state will be ON if any of the members states are ON. But this means that once one Item in the group has its state change to ON, the Group's state gets set. Each subsequent Item that changes state to ON will not trigger "myGroup changed" because the Group isn't changing.

This is not a bug, it is the expected and designed behaviour. Because the group state is an aggregate, every change in the Item members does not necessarily result in a change to the Group's state.

Group functions can be any of the following:

Function | Description
---------|------------
AND(value1, value2) | This does a logical 'and' operation. Only if all items are of 'value1' this is returned, otherwise the 'value2' is returned.
AVG                 | Calculates the numeric average over all item values of decimal type.
MAX                 | This calculates the maximum value of all item values of decimal type.
MIN                 | This calculates the minimum value of all item values of decimal type.
NAND(value1, value2)| This does a logical 'nand' operation. The value is 'calculated' by the normal 'and' operation and than negated by returning the opposite value. E.g. when the 'and' operation calculates the value1 the value2 will be returned and vice versa.
NOR(value1, value2) | This does a logical 'nor' operation. The value is 'calculated' by the normal 'or' operation and than negated by returning the opposite value. E.g. when the 'or' operation calculates the value1 the value2 will be returned and vice versa.
OR(value1, value2)  | Does a logical 'or' operation. If at least one item is of 'value1' this is returned, otherwise the 'value2' is returned.
SUM                 | Calculates the sum of all items in the group.

An example of this would be:
```xtend
Group:Contact:OR(OPEN,CLOSED)  gMotionSensors  (All)
```

## Formatting
Formatting is done applying [Java formatter class syntax](http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax), therefore the syntax is

```xtend
%[argument_index$][flags][width][.precision]conversion
```

Only the leading '%' and the trailing 'conversion' are mandatory. The **argument_index$** must be used if you want to convert the value of the item several times within the label text or if the item has more than one value. Look at the DateTime and Call item in the following example.

```xtend
Number    MyTemperature  "The Temperature is [%.1f] °C"   { someBinding:somevalue }
String    MyString       "Value: [%s]"                    { someBinding:somevalue }
DateTime  MyLastUpdate   "Last Update: [%1$ta %1$tR]"     { someBinding:somevalue }
```

The output would look like this:

    Temperature 23.2 °C
    Value: Lorem ipsum
    Last Update: Sun 15:26

## Transforming
Another possibility in label texts is to use a transformation. They are used for example to translate a status into another language or convert technical value into human readable ones. To do this you have to create a .map file in your `transform` folder. These files are typical key/value pair files.

    key1=value1
    key2=value2
    ...

Let's make a small example to illustrate this function. If you have a sensor which returns you the number 0 for a closed window and 1 for an open window, you can transform these values into the words "opened" or "closed". Create a map file named window.map for example and add the desired keys and values.

    0=closed
    1=opened
    NULL=unknown
    -=unknown

Next we define two items. One showing the raw value as it is provided from our sensor and one with transformed value.

```xtend
Number WindowRaw          "Window is [%d]"                  { someBinding:somevalue }
Number WindowTransformed  "Window is [MAP(window.map):%s]"  { someBinding:somevalue }
```

The output will be
    Window is 1
    Window is opened

Transform files use UTF-8 encoding, so unicode symbols will also work.

    ARIES=♈ Aries
    TAURUS=♉ Taurus
    WAXING_CRESCENT=🌑→🌓 Waxing Crescent
    FIRST_QUARTER=🌓 First Quarter

## Icons
OpenHAB provides you a set of [basic icons](http://docs.openhab.org/addons/iconsets/classic/readme.html) by default. However if you wish to use custom icons you need to create the folder `conf/icons/classic/` and place all your icons inside. These icons will be used in all of the openHAB frontends. The images must be in .png or .svg format, and have a name with only small letters and a hyphen or underscore (if required). The PaperUI interface (or via the classicui.cfg or basicui.cfg files) allows you to define whether you use Vector (.svg) or Bitmap (.png) icon files.

As an example, to use a custom icon called `heatpump.svg` the correct syntax is `<heatpump>`.  

## Dynamic icons
You can dynamically change the icon depending on the item state. You have to provide a default file and one icon file per state with the states name append to the icons name.

Example:

    switch.svg
    switch-off.svg
    switch-on.svg

If you want to use the dynamically items just use the image name without the added states.

```xtend
Switch  Light_FrontDoor  "Front Door light is [MAP(en.map):%s]"  <switch>  {somebinding:someconfig}
```

## Binding Configuration
The binding configuration is the most import part of an item. It defines from where the item gets it values, and where a given value/command should be sent.

You bind an item to a binding by adding a binding definition in curly brackets at the end of the item definition

    { channel="ns:bindingconfig" }

Where _ns_ is the namespace for a certain binding like "network", "netatmo", "zwave" etc. Every binding defines what values must be given in the binding configuration string. That can be the id of a sensor, an ip or mac address or anything else. You must have a look at your [[Bindings]] configuration section to know what to use. Some typical examples are:

```xtend
Switch  Phone_Mobile       "My Mobile Phone"               { channel="network:device:devicename:online" }
Number  Netatmo_Indoor_CO2 "CO2"                           { channel="netatmo:NAMain:home:inside:Co2" }
Number  Azimuth            "Azimuth"                       { channel="astro:sun:home:position#azimuth" }
Contact Garage             "Garage is [MAP(en.map):%s]"    { channel="zwave:21:command=sensor_binary,respond_to_basic=true" }
```

When you install a binding through PaperUI it will automatically create a .cfg file in `conf/services/` for the appropriate binding. Inside these files are a predefined set of variables which are required for the binding to operate. In many cases you will need to view and edit these to suit your system. These variables can hold ip addresses, API keys, user names, passwords etc. These are all in plain text, so be careful who you share these with if some data is sensitive.

If you are using legacy openHAB 1.x ( or beta/custom bindings ), then these .jar files need to be placed in the `/addons/` folder. If configuration is required then you will need to create an `openhag.cfg` file in `/conf/services/` and paste the appropriate binding configuration into this.

## Restore States
When restarting your openHAB installation you may find there are times when your logs indicate some items are UNDEF. This is because, by default, item states are not persisted when openHAB restarts. To have your states persist across restarts you will need to install a [Persistence](http://docs.openhab.org/features/persistence.html) extension.

Specifically, you need to use a restoreOnStartup strategy for all your items. Then whatever state they were in before the restart will be restored automatically.

```xtend
Strategies {
        default = everyUpdate
}

Items {
        // persist all items on every change and restore them from the MapDB at startup
        * : strategy = everyChange, restoreOnStartup
}
```

## Notes
1. Every [binding](bindings) provides it own item samples to clarify the appropriate syntax of the binding.
