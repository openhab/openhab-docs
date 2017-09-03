---
layout: documentation
title: Items
---

{% include base.html %}

# Items

In openHAB "Items" represent all properties and capabilities of the user’s home automation.

While a device or service might be quite specific, Items are unified substitutions inside the openHAB world.
Items can be Strings, Numbers, Switches or one of a few other basic Item types, a programmer can rightly compare Item Types with base variable types of a programming language.

One unique feature of openHAB Items (in comparison to normal variables) is the possibility to connect them to the outside world (via Bindings, more about that later).
An Item does not simply hold a certain information (e.g., "No Error", 3.141, OFF), the information is synchronized with the real world in both ways.

But let's not get ahead of ourselves.
The rest of this page contains all details regarding Items and is structured as follows:

{::options toc_levels="2..4"/}

- TOC
{:toc}

## Introduction

Items are basic data types and have a *state* which can be *read from*, or *written to*, in order to interact with them.

Items can be *bound to Bindings* or *linked to Channels*.
For example, an Item bound to a sensor receives updated sensor readings and an Item linked to a light's dimmer Channel can set the brightness of the light bulb.
Read the [docs page for the respective Binding]({{base}}/addons/bindings.html) to get more information about possible connections and examples.

There are two methods for defining Items:

1.  The first is through PaperUI.
    Generally all 2.x version Bindings can be configured through PaperUI.
    Other 1.x and legacy Bindings do not offer this path.

2.  The second method is through text `.items` files in the `items` folder.
    Files here must have the extension `.items` and you can create as many `.items` files as you need/want - however, each Item must be unique across them all.
    Refer to the [installation docs]({{base}}/installation/index.html) to determine your specific installations folder structure.
    Generally 1.x version Bindings can only be bound to Items through `.items` files.
    2.x Bindings can also be used with this method

**Assumptions for PaperUI:**
The following content will discuss details of item definition on the example of `.items` files.

**Editor Recommendation:**
It's recommended to edit `.items` files using one of the [openHAB supporting editors]({{base}}/configuration/editors.html).
Doing so you will have full IDE support like syntax checking, context assist, etc.

## Item Definition and Syntax

Items are defined in the following syntax.
The parts of an Item must be defined in this order.
Besides the `itemtype` and `itemname` all parts are optional.

```java
itemtype itemname "labeltext" <iconname> (group1, group2, ...) ["tag1", "tag2", ...] {bindingconfig}
```

**Examples:**

```java
Number BathRoom_WaschingMachine_Power "Power [%.0f W]" <energy> (gPower) {channel="homematic:HG-HM-ES-PMSw1-Pl:ccu:LEQ1275872:2#POWER"}
Switch Kitchen_Light "Kitchen Light OnOff" {mqtt="<[...], >[...]" }
String BedRoom_Sonos_CurrentTitle "Title [%s]" (gBedRoom) {channel="sonos:PLAY3:RINCON_C5E93734496A0A400:currenttitle"}

Number LivingRoom_Temperature "Temperature [%.1f °C]" <temperature> (gTemperature, gLivingRoom) ["TargetTemperature"] {knx="1/0/15+0/0/15"}
```

The last example above defines an Item with the following parts:

- Item type `Number`
- Item name `LivingRoom_Temperature`
- Item state formatted in a way which will produce for example "21.5 °C" as its output
- Item displaying icon with the name `temperature`
- Item belongs to groups `gTemperature` and `gLivingRoom`
- Item is tagged as a thermostat ("TargetTemperature")
- Item is bound to the openHAB Binding `knx` with binding specific settings

The remainder of this article describes the Item definition parts in more detail.

### Type

The Item type defines which kind of state can be stored in that Item and which commands can be sent to it, e.g. String, Number or binary Switch.
They are comparable with basic variable data types in programming languages.

Each Item type has been optimized for certain components in your smart home.
This optimization is reflected in the data types, and command types.

All available openHAB2 Item types and their relevant commands can be viewed here: [Item Types]({{base}}/concepts/items.html).

**Dimmer vs. Switch:**
While a Dimmer Item can accept either On/Off, Increase/Decrease, or Percent updates or command, a Dimmer Item stores its state as a Percent value.
See the following example:

Item:

```java
Dimmer Office_Light "Dimmer [%d %%]" {milight="bridge01;3;brightness"}
```

Sitemap:

```perl
Switch item=Office_Light
Slider item=Office_Light
```

When the Switch widget is used, it sends ON or OFF commands to the Item which are mapped to 100% and 0%, respectively.
When the Slider widget is used, it sends Percent commands (values between 0 and 100) to the Item, which are used as the Item's state.
In the example above, if you move the Slider widget to 60%, move the Switch to OFF, and finally move the switch to ON, the Item's state will be 100%.

### Name

The Item name is the unique identified of the Item.
The name should only consist of letters, numbers and the underscore character.
Spaces and special characters cannot be used.

**Style Guide:**
It is advised to follow a predefined naming scheme.
The officially recommended scheme is used throughout this documentation and builds on a hierarchy idea.
Floor or room names can be abbreviated to reduce overall name length.

Every word of the Item name starts with a uppercase letter.
Words are separated by an underscore character, except for logically belonging words.

Examples:

- "`BathRoom_WaschingMachine_Power`" for the used power of a washing machine in a single floor apartment bathroom
- "`GF_LR_Heating_Setpoint`" for the Groundfloor Livingroom set temperature
- "`Heating_Mode`" for the overall heating mode of the house/apartment

### Label

The label text has two purposes.
First, this text is used to display a description of the specific Item (for example, in the Sitemap).

Secondly, the label also includes the value displaying definition for the Item's state.
This part is contained inside "`[ ]`" in the label and can be left out to not display the state of an Item.

### State

The state part of the Item definition determines the Item value presentation, e.g., regarding formatting, decimal places, unit display and more.
The state definition is part of the Item Label definition and contained inside square brackets "`[ ]`").

#### State Formatting

Formatting is done applying [Java formatter class syntax](http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax), therefore the syntax is

```java
[%[argument_index$][flags][width][.precision]conversion]
```

Only the leading '%' and the trailing 'conversion' are mandatory.
The **argument_index$** must be used if you want to convert the value of the Item several times within the label text or if the Item has more than one value.
Look at the DateTime and Call Item in the following example.

```java
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

### State Transformations

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
Create a map file named `window.map` for example and add the desired keys and values.

```text
0=closed
1=opened
NULL=unknown
-=unknown
```

Next we define two Items.
One showing the raw value as it is provided from our sensor and one with transformed value.

```java
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

### Icons

The icon name is used to reference an image presented next to an Item, e.g. in BasicUI.

openHAB provides a set of [classic icons]({{base}}/addons/iconsets/classic/readme.html) by default.
Additional icons can be placed under `icons/classic/` inside the openHAB configuration folder.

Custom Icons must abide to the following file name restrictions to be accepted by openHAB:

-   `png` or `svg` file format

-   Only lowercase letters, numbers and underscores (`_`)

-   No uppercase letters or special characters.

-   Hyphens (`-`) are reserved for [Dynamic Icons](#dynamic-icons) (see below)

-   Examples:
    - Good: `switch.svg`, `power_meter.png`, `error2.svg`
    - Bad: `PC_Display.svg`, `power-meter.png`, `tür⇔.svg`

**Bitmaps or Vector Graphics:**
openHAB can work with either Bitmap (`.png`) or Vector (`.svg`) icon files.
The format used needs to be configured for the individual interfaces (e.g. BasicUI).
It is thereby important to decide on one format beforehand, vector graphics are recommended.
The setting can be done via PaperUI or inside the configuration files `classicui.cfg` and `basicui.cfg`.
Images in the respective other format will be ignored.

Predefined icons from the default icon set can be replaced.

#### Dynamic Icons

Some icons come in icon sets, from which one icon is dynamically selected depending on the Item's state.

The state related part of an icon is appended to the icon name after the special hyphen delimiter.
To give an example:

| File name        | Description                                             |
|:-----------------|:--------------------------------------------------------|
| `switch-off.svg` | Matches `OFF` or "off" state                            |
| `switch-on.svg`  | Matches `ON` or "on" state                              |
| `switch.svg`     | Default icon, used when no other matching icon is found |

Dynamic icon sets can consist of as many icon files as needed.
Each set must meet the following criteria:

- A default icon is mandatory.
- The state information in the icon name must consist of all lower case letters (even if the state of the Item includes uppercase letters).
- The state name has to reflect the Item value state. [Transformations](transform.html) applied to the Item value for the sake of better visual representation have no influence on icon selection. 

**Syntax:**
The name of dynamic icons must meet the following format:

```java
<name>-<state>.<png or svg>
```

- `<name>` is the name of the icon set.
- `-<state>` is the Item state that particular icon maps to.
- `<png or svg>` can be either file extension and depends on your UI settings.

**Usage:**
The default icon name without state and extension is added to the Item or Sitemap element definiton.

**State Matching Rule:**
For Number Items openHAB will use the equal or next lowest state icon that can be found.
For a dimmer light (0 - 100%), you might provide icons as in the example:

| File name        | Description                                        |
|:-----------------|:---------------------------------------------------|
| `dimmer.svg`     | default icon (used in the undefined state)         |
| `dimmer-0.svg`   | off light icon (0%)                                |
| `dimmer-1.svg`   | dimmed light icon (1% up to 74%)                   |
| `dimmer-75.svg`  | bright light icon (75% up to 100%)                 |

### Groups

The *Group* is a special Item Type.
It is used to define a category or collection in which you can nest/collect other Items or other Groups.
Groups are supported in Sitemaps, Automation Rules and other areas of openHAB.

A simple example Group definition is:

```java
Group gGroundFloorTemperatures
```

**Style Guide:**
To differentiate between single Items and Item groups it is recommended to name Groups with a prepended "g".
Furthermore single words are joined with uppercase first letters and without underscores.

**Group State:**
A Group also has a state.
The Group's state is an aggregation of the states of all its members.
Sending a command to a Group will cause that command to be forwarded to all the Group's members.

Items can be in none, one, or multiple groups, groups can be nested inside other groups.

#### Nested Groups

Groups can be nested inside each other.
This functionality is commonly used to define hierarchies of Items from different perspectives.

- Regional perspective: e.g. Stories of a Building → Corridors on that story → Rooms along the corridor ...
- Data perspective: e.g. Room temperatures, power consumption, all lights in the Building, ....
- Maintenance perspective: e.g. Error states, Battery health, ...
- and so on ...

Let's look at the example below:

```java
Group gAll
Group gRoom        (gAll)
Group gLivingRoom  (gRoom)
Group gSensor      (gAll)
Group gTemperature (gSensor)

Number Sensor_Temperature  "Temperature [%.1f °C]"  <temperature>  (gTemperature)  {knx="1/0/15+0/0/15"}
```

The Item `Sensor_Temperature` is a member of the Group `gTemperature`, which is itself a member of the Group `gSensor`, which is a member of the Group `All`.

This relation can be exploited in sitemaps or in automation rules.

#### Group Types

Group Items can also be used to easily determine one or more Items with a defined value or can be used to calculate a value depending on all values within the Group.
Please note that this can only be used if all Items in the Group have compatible types (otherwise the calculated state will most likely be `UNDEF`.

The format for this is:

```java
Group:itemtype:function  itemname  ["labeltext"]  [<iconname>]  [(group1, group2, ...)]
```

As an example consider a group of switches:

```java
Group:Switch:OR(ON,OFF)  mySwitches
```

The state of the `mySwitches` group will be ON if any of the members states are ON.
But this means that once one Item in the group has its state changed to ON, the group's state gets set.
Each subsequent Item that changes state to ON will not trigger "mySwitches changed" because the group isn't changing.

This is not a bug, it is the expected and designed behavior.
Because the group state is an aggregate, every change in the Item members does not necessarily result in a change to the group's state.

If you omit the type or function definitions for a group the following behavior is used:

If there is a type but no function like in the example below,

```java
Group:Switch  mySwitches
```

the function `EQUAL` (Equality) will be used.

If you omit the type AND the function the group state will NOT be influenced by its members, i.e. such a group is only useful for grouping items in GUIs.

Group functions can be any of the following:

| Function             | Description |
|:---------------------|:-----------|
| EQUAL                | Default, if no function is specified. (a type for the group MUST be set). If ALL members have state X the group state will be X, otherwise it is UNDEF. |
| AND(value1, value2)  | This does a logical 'AND' operation. Only if all items are of 'value1' this is returned, otherwise the 'value2' is returned. |
| AVG                  | Calculates the numeric average over all item values of decimal type. |
| MAX                  | This calculates the maximum value of all item values of decimal type. |
| MIN                  | This calculates the minimum value of all item values of decimal type. |
| NAND(value1, value2) | This does a logical 'NAND' operation. The value is 'calculated' by the normal 'AND' operation and than negated by returning the opposite value. E.g. when the 'AND' operation calculates the value1 the value2 will be returned and vice versa. |
| NOR(value1, value2)  | This does a logical 'NOR' operation. The value is 'calculated' by the normal 'OR' operation and than negated by returning the opposite value. E.g. when the 'OR' operation calculates the value1 the value2 will be returned and vice versa. |
| OR(value1, value2)   | Does a logical 'OR' operation. If at least one item is of 'value1' this is returned, otherwise the 'value2' is returned. |
| SUM                  | Calculates the sum of all items in the group. |

### Tagging

Tagging is a new feature under development.
Tags are used by some I/O add-ons, see [Hue Emulation]({{base}}/addons/io/hueemulation/readme.html) for more details.

Tags are only of interest if an add-on or integration README explicitly discusses their usage.

### Binding Configuration

As mentioned above, there are two ways to bind/link a device to an Item: 1.x Binding Configs and 2.x Channel Linking.

When you install a Binding through PaperUI it will automatically create a `.cfg` file in `$OPENHAB_CONF/services/` for the appropriate Binding.
Inside these files are a predefined set of variables which are required for the Binding to operate.
In many cases you will need to view and edit these to suit your system.
These variables can hold IP addresses, API keys, user names, passwords etc.
These are all in plain text, so be careful who you share these with if some data is sensitive.

#### 1.x Binding Configuration

The 1.x Binding configuration defines from where the Item gets it values, and where a given value/command should be sent.

You bind an Item to a Binding by adding a Binding definition in curly brackets at the end of the Item definition:

```java
{ ns="192.168.1.123:80" }
```

Where "ns" is the namespace for a certain Binding like "network", "netatmo", "zwave" etc.
Every Binding defines what values must be given in the Binding configuration string.
That can be the id of a sensor, an ip or mac address or anything else.
You must have a look at your [Bindings]({{base}}/addons/bindings.html) configuration section to know what to use.
Some typical examples are:

```java
Switch Phone_Mobile        "My Mobile Phone"               { nh="192.168.1.123:80" }
Number Netatmo_Indoor_CO2  "CO2 [%d]"                      { netatmo="00:00:00:00:00:00#Co2" }
Number Azimuth             "Azimuth [%d]"                  { astro="planet=sun, type=position, property=azimuth" }
Contact Garage             "Garage is [MAP(en.map):%s]"    { zwave="21:command=sensor_binary,respond_to_basic=true" }
```

If you need to use legacy openHAB 1.x Bindings then you need to enable this feature through the PaperUI menu by turning on "Include Legacy 1.x Bindings" found at `/configuration/services/configure extension management/`.
After downloading the legacy .jar files, they need to be placed in the `addons/` folder.
If further configuration is required then you will need to create an `openhab.cfg` file in `$OPENHAB_CONF/services/` and paste the appropriate Binding configuration into this.
For all other native openHAB2 Bindings, configuration is done through a `bindingname.cfg` file in the same location.

#### 2.x Binding Configs

The 2.x Bindings introduce the concept of [Things and Channels]({{base}}/concepts/things.html).
Unlike with 1.x version Bindings which each define their own format for the Binding config that is defined on the Item itself, 2.x Bindings define those parameters in a Thing.
Each Thing has one or more Channels and Items are linked to one or more Channels.

Some Bindings support automatic discovery of Things in which case discovered Things will appear in the Inbox in PaperUI.
Once accepted it will appear under Configuration > Things.

Other Bindings support defining Things in a `.things` file.

See the [Bindings]({{base}}/addons/bindings.html) configuration section to know how to discover or manually define Things for a given Binding.

##### PaperUI Linking

One can link an Item with a Channel using PaperUI.

1. First create the Item in PaperUI under Configuration Items.
2. Next navigate to the Thing that has the Channel to link to the Item.
3. Click on the expand icon to the right of the Channel to link to the Item and press the `+` next to "Linked Items."
4. Select the Item from the list and press "Link".

##### Text File Linking

One can also link an Item with a Channel using the `.items` file.
Information about available Channels and options can be found in the Binding readme or discovered via PaperUI.

In PaperUI select a Thing to learn about all Channels the Thing support.

Linking an Item to a Channel is of the form `{channel="channel id"}`.
Some examples:

```java
Switch  Phone_Mobile       "My Mobile Phone"               { channel="network:device:devicename:online" }
Number  Netatmo_Indoor_CO2 "CO2"                           { channel="netatmo:NAMain:home:inside:Co2" }
Number  Azimuth            "Azimuth"                       { channel="astro:sun:home:position#azimuth" }
Contact Garage             "Garage is [MAP(en.map):%s]"    { channel="zwave:21:command=sensor_binary,respond_to_basic=true" }
```

#### Multi Binding/Channel Linkage

One Item can be linked to multiple Bindings and/or Channels.
Commands and Updates from and to these will be mixed/combined and can be used in interesting ways.

```java
Switch Office_PC { nh="192.168.3.203", wol="192.168.0.2" }
Number Temperature { mysensors="24;1;V_TEMP", expire="5m,-999" }
```

The first example shows a symbiosis of the network health Binding and the Wake-on-LAN Binding to interact with a PC.
The second example shows a prominent use case for the [expire Binding](http://docs.openhab.org/addons/bindings/expire1/readme.html)
where the mysensors Binding will update temperature readings regularly but the expire Binding will also listen and eventually modify the Item state.

##### Exception `autoupdate`

`autoupdate="false"` is a special instruction which keeps the current state of the item, even if a *command* has been received.
This way, the Item is always unchanged unless you explicitly post an *update* to the item.

```java
Switch Garage_Gate { binding="xxx", autoupdate="false"}
```

## Restore States

When restarting your openHAB installation you may find there are times when your logs indicate some Items are UNDEF.
This is because, by default, Item states are not persisted when openHAB restarts.
To have your states persist across restarts you will need to install a [Persistence]({{base}}/configuration/persistence.html) extension.

Specifically, you need to use a `restoreOnStartup` strategy for all your Items.
Then whatever state they were in before the restart will be restored automatically.

```java
Strategies {
    default = everyUpdate
}

Items {
    // persist all Items on every change and restore them from the MapDB at startup
    * : strategy = everyChange, restoreOnStartup
}
```
