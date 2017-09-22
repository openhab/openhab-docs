---
layout: documentation
title: Items
---

{% include base.html %}

# Items

In openHAB Items represent all properties and capabilities of the user’s home automation.

While a device or service might be quite specific, Items are unified substitutions inside the openHAB world.
Items can be Strings, Numbers, Switches or one of a few other basic [Item types](#type).
A programmer can compare Item types with base variable data types of a programming language.

A unique feature of openHAB Items is the immediate option to connect them to the outside world via [Bindings](#binding).
An Item does not simply hold a certain information (e.g., `OFF`, 3.141 or "No Error"), the information is synchronized with the real world in both ways.

But let's not get ahead of ourselves.
The rest of this page contains all details regarding Items and is structured as follows:

{::options toc_levels="2..4"/}

- TOC
{:toc}

## Introduction

Items are basic data types and have a state which can be read from, or written to.
Items can be linked to a [Binding](#binding) channel for interaction with the outside world.
For example, an Item bound to a sensor receives updated sensor readings and an Item linked to a light's dimmer channel can set the brightness of the light bulb.

There are two methods for defining Items:

1.  Through [Paper UI]({{base}}/addons/uis/paper/readme.html).
    Generally all 2.x version Bindings can be configured through Paper UI.
    Other 1.x and legacy Bindings do not offer this path.

2.  Through text `.items` files in the `items` folder.
    Files here must have the extension `.items` and you can create as many `.items` files as you need/want - however, each Item must be unique across them all.
    Refer to the [installation docs]({{base}}/installation/index.html) to determine your specific installations folder structure.

Generally 1.x version Bindings can only be bound to Items through `.items` files.
2.x Bindings can be used both ways.

**Assumptions for Paper UI:**
The following content will discuss details of item definition on the example of `.items` files.
While the way of defining an Item through the graphical interactive Paper UI is different, the elements and their nature of the Item definition are identical.

**Editor Recommendation:**
It's recommended to edit `.items` files using one of the [openHAB supporting editors]({{base}}/configuration/editors.html).
Doing so you will have full IDE support with features like syntax checking, context assist, etc.

{: #syntax}
## Item Definition and Syntax

Items are defined in the following syntax:

```java
itemtype itemname "labeltext [stateformat]" <iconname> (group1, group2, ...) ["tag1", "tag2", ...] {bindingconfig}
```

- All parts must be given in the order shown
- Parts `itemtype` and `itemname` are manadatory
- All other parts are optional
- In between the parts one or more spaces or tabs are allowed
- One Item definition can span over multiple lines

**Examples:**

```java
Switch Kitchen_Light "Kitchen Light" {mqtt="<[...], >[...]" }
String Bedroom_Sonos_CurrentTitle "Title [%s]" (gBedRoom) {channel="sonos:..."}
Number Bathroom_WaschingMachine_Power "Power [%.0f W]" <energy> (gPower) {channel="homematic:..."}

Number Livingroom_Temperature "Temperature [%.1f °C]" <temperature> (gTemperature, gLivingroom) ["TargetTemperature"] {knx="1/0/15+0/0/15"}
```

The last example defines an Item with the following parts:

- Item [type](#type) `Number`
- Item [name](#name) `Livingroom_Temperature`
- Item [label](#label) "Temperature"
- Item [state formatted](#state-presentation) in a way which will produce for example "21.5 °C" as its output
- Item [icon](#icons) with the name `temperature`
- Item belongs to [groups](#groups) `gTemperature` and `gLivingroom` (definition not shown in the example)
- Item is [tagged](#tags) as a thermostat with the ability to control a target temperature ("TargetTemperature")
- Item is [bound to](#binding) the openHAB Binding `knx` with binding specific settings

The remainder of this article describes the Item definition parts in more detail.

{: #type}
### Type

The Item type defines which kind of state can be stored in that Item and which commands it accepts.
Item types are comparable with basic variable data types in programming languages.
Each Item type has been optimized for certain components in your smart home.
This optimization is reflected in the data and command types.

Available Item types are:

| Item Name      | Description | Command Types |
|----------------|-------------|---------------|
| Color          | Color information (RGB) | OnOff, IncreaseDecrease, Percent, HSB |
| Contact        | Item storing status of e.g. door/window contacts | OpenClose |
| DateTime       | Stores date and time | - |
| Dimmer         | Item carrying a percentage value for dimmers | OnOff, IncreaseDecrease, Percent |
| Group          | Item to nest other items / collect them in groups | - |
| Image          | Holds the binary data of an image | - |
| Location       | Stores GPS coordinates | Point |
| Number         | Stores values in number format | Decimal |
| Player         | Allows to control players (e.g. audio players) | PlayPause, NextPrevious, RewindFastforward |
| Rollershutter  | Typically used for blinds | UpDown, StopMove, Percent |
| String         | Stores texts | String |
| Switch         | Typically used for lights (on/off) | OnOff |

More details about all available Item types and their relevant commands are listed under Concepts, see:
[Item Types Overview]({{base}}/concepts/items.html)

To learn about the technical internals of the individual Item types, please refer to:
[Javadoc on Generic Item and its subclasses](https://eclipse.org/smarthome/documentation/javadoc/org/eclipse/smarthome/core/items/GenericItem.html)

<!-- TODO: Random content. Doesn't make sense here. Might be changed to be a more general example for diverse Items

**Dimmer vs. Switch:**
While a Dimmer Item can accept either On/Off, Increase/Decrease, or Percent updates or command, a Dimmer Item stores its state as a Percent value.
See the following example:

```java
//demo.items
Dimmer Office_Light "Dimmer [%d %%]" {milight="bridge01;3;brightness"}
```

```javascript
//demo.sitemap
Switch item=Office_Light
Slider item=Office_Light
```

When the Switch widget is used, it sends ON or OFF commands to the Item which are mapped to 100% and 0%, respectively.
When the Slider widget is used, it sends Percent commands (values between 0 and 100) to the Item, which are used as the Item's state.
In the example above, if you move the Slider widget to 60%, move the Switch to OFF, and finally move the switch to ON, the Item's state will be 100%.

-->

{: #name}
### Name

The Item name is the unique identifier of an Item.
The name should only consist of letters, numbers and the underscore character.
Spaces and special characters cannot be used.

It is advised to follow a consistent naming scheme to be able to handle growing setups.
The officially recommended scheme is used throughout this documentation and builds on a hierarchical idea.
A physical or logical top-down approach while naming an Item will ensure the comprehension of its meaning.

A good Item name is self-explanatory and already suggests its Item type and interaction options.
The following table contains a few examples:

| Example Item Name                 | Interpretation (assumed Item type, example value) |
|-----------------------------------|---------------------------------------------------|
| "`Livingroom_CeilingLight`"       | Living room light (Switch, e.g. ON) |
| "`Livingroom_CeilingLight_Color`" | Living room light color (Color, e.g. warm white) |
| "`GF_BR_WaschingMachine_Power`"   | Electric power used by the washing machine in the ground floor bathroom (Number, e.g. 100W) |
| "`Lighting_Scene`"                | Overall lighting scene of the house/apartment (String, e.g. Party) |
| "`Presence_John_Smartphone`"      | An Item indicating if John is home or not, based on a smartphone detection (Switch, e.g. Offline) |

The following naming style guide is recommended:

- Words build a physical or logical hierarchy
- Every word of the Item name starts with an uppercase letter
- Words are separated by an underscore character, except for logically belonging words
- Words like the names of recurring rooms or appliances can be abbreviated to reduce overall name length

[Group](#groups) is a special Item type to nest and/or combine Items.
Just as with single Items the demand for a speaking self-explanatory name should be met.
Two naming schemes are established in the community for Group names:

1. Use of plural word forms where possible, otherwise the word "Group" can be appended for clearness
2. Prepending a lowercase "g"

| Example Group Name                        | Interpretation |
|-------------------------------------------|----------------|
| "`Batteries`" or "`gBattery`"             | Combining Group for all device battery states |
| "`Maintenance_Group`" or "`gMaintenance`" | Logical summary of all maintenance related Items and Groups |
| "`Livingroom`" or "`gLR`"                 | Nesting group for all devices belonging to the living room |
| "`Livingroom_Lights`" or "`gLR_Light`"    | Combination of all living room lights |

{: #label}
### Label

The label text is used to describe the Item in a human readable way.
Graphical UIs will display the label when the Item is included, e.g. in [Basic UI]({{base}}/addons/uis/basic/readme.html) through a [Sitemap]({{base}}/configuration/sitemaps.html) definition.
Some IO services (e.g. the Amazon Alexa skill) also use the label to match external commands to specific Items.

In textual configuration the label is given in in quotes next to the optional state presentation part in square brackets (see below).
The label for the Item in the following example is "Temperature":

```java
Number Livingroom_Temperature "Temperature [%.1f °C]"
```

{: #state}
### State

The state of an Item depends on the Item type, the Channel bound to the Item, and internal or external events.
A analogy can be drawn between the state of an Item and the value of a variable in a computer program.

{: #item-state}
#### Item State

This section provides information about what a user can expect regarding the behavior of the state of an Item
<!-- TODO: It would be great to have an Item state diagram similar to the one on this page (docs.openhab.org/concepts/things.html)

-  Items are created with a state of `NULL`.  The Item will remain in this state until it has been acted upon
-  Subsequent to the creation of an Item, operations in openHAB such as a user interacting with the Item using the `Basic UI`, or a Binding updating the state of an Item will change the state of the Item 
-  Once an Item is being used, its state will depend upon the Thing to which it is linked, or upon the specifics of the Binding that created the Item.  Example - The state of a Switch may change from `NULL` to `ON` or `OFF`
-  A Binding may set the state of an Item to `UNDEF` if it looses communications with a Thing (for example, a Z-wave doorbell with a dead battery). The Binding may also set the state to `UNDEF` if an error exists in the binding configuration, or under other conditions
-  An Item may be assigned a particular state as part of the execution of a [Rule]({{base}}/configuration/rules-dsl.html).  See, particularly, [Manipulating Item States]({{base}}/configuration/rules-dsl.html#Manipulating Item States)
-  The state of an Item after an openHAB startup will depend upon whether the user has configured [Persistence]({{base}}/configuration/persistence.html) or has created a set of ["System started"](https://github.com/openhab/openhab1-addons/wiki/Persistence#Startup Behavior) rules

*N.B.*  Many openHAB users find that it can be very useful to use Persistence and "System started" rules so that their systems behaves in a predictable way after an openHAB restart.

{: #state-presentation}
#### State Presentation

The Item definition determines the Item's textual state presentation, e.g., regarding formatting, decimal places, unit display and more.
The state presentation is part of the Item label definition and contained inside square brackets.
The state presentation for the Item in the following example is "`%.1f °C`":

```java
Number Livingroom_Temperature "Temperature [%.1f °C]"
```

If no state presentation and no square brackets are given, the Item will not provide a textual presentation of it's internal state (i.e. in UIs no state is shown).
This is often meaningful when an Item is presented by a non-textual UI elements like a switch or a diagram.

Formatting of the presentation is done applying [Java formatter class syntax](http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax).

If square brackets are given, the leading `%` and the trailing formatter conversion are mandatory.
Free text, like a unit, can be added before or after the formatter string.
A few examples are given below:

```java
Number    Livingroom_Temperature   "Temperature [%.1f °C]"     // e.g. "23.5 °C"
String    Livingroom_TV_Channel    "Now Playing [%s]"          // e.g. "Lorem ipsum"
DateTime  Livingroom_TV_LastUpdate "Last Update [%1$ta %1$tR]" // e.g. "Sun 15:26"
Number    Livingroom_Clock_Battery "Battery Charge [%d %%]"    // e.g. "50 %"
```

{: #state-transformation}
#### State Transformation

Transformations can be used in the state part of an Item, to translate the raw state of an Item into another language or convert technical values into human readable information.

To give an example, the technical raw state "CLOSED" can be translated to the Spanish "cerrado":

```java
Contact Livingroom_Window "Ventana del salón [MAP(window_esp.map):%s]"
```

Please refer to the article on [Transformations](transform.html) for more usage details and a list of available transformation services.

{: #icons}
### Icons

The icon name is used to reference an image presented next to an Item, e.g. in Basic UI.
The following example shows the usage of the "switch" icon:

```java
Switch Livingroom_Light "Livingroom Ceiling Light" <switch>
```

openHAB provides a set of [classic icons]({{base}}/addons/iconsets/classic/readme.html) by default.
Additional icons can be placed in `$OPENHAB_CONF/icons/classic/` inside the openHAB configuration folder.

Custom Icons must abide to the following file name restrictions to be accepted by openHAB:

- `png` or `svg` file format
- Only lowercase letters, numbers and underscores (`_`)
- No uppercase letters or special characters
- Hyphens (`-`) are reserved for [Dynamic Icons](#dynamic-icons) (see below)
- Examples:
  - Good: `myswitch.svg`, `power_meter.png`, `error23.svg`
  - Bad: `PC_Display.svg`, `power-meter.png`, `tür⇔.svg`

**Bitmaps or Vector Graphics:**
openHAB can work with either Bitmap (`png`) or Vector (`svg`) icon files.
The format used needs to be configured for the individual interfaces (e.g. Basic UI).
It is thereby important to decide on one format beforehand, vector graphics are recommended.
The setting can be done via Paper UI or inside the configuration files `classicui.cfg` and `basicui.cfg`.
Images in the respective other format will be ignored.

Predefined icons from the default icon set can be substituted by placing equally named files in the custom icons folder.

{: #icons-dynamic}
#### Dynamic Icons

Some icons come in icon sets, from which one icon is dynamically selected depending on the Item's state.
Just as single icons, user-defined dynamic icon sets can be provided via the custom icons folder `$OPENHAB_CONF/icons/classic/`.

The state related part of an icon is appended to the icon name after the special hyphen delimiter:

```perl
<name>-<state>.<extension>
```

- `<name>` - the name of the icon set
- `-<state>` - the Item state that particular icon maps to
- `<extension>` - bitmap (`png`) or vector graphic (`svg`) icon file extension ([see above](#icons))

Dynamic icon sets can consist of as many state-specific icon files as needed.
Each set must meet the following criteria:

- A default icon is mandatory (no specified state part)
- The file name must follow the naming restrictions given for [icons](#icons) in general
- The state name has to reflect the Item's raw state. [Transformations](#state-transformation) applied in the state presentation definition of the Item have no influence on icon selection
- The state in the icon name must be given in lowercase letters

**Usage Example:**
The default icon name without state and extension is added to the Item or Sitemap element definition.
The following example shows the typical usage:

```java
Switch Livingroom_Light "Livingroom Ceiling Light" <myswitch>
String Livingroom_Light_Connection "Livingroom Ceiling Light [MAP(error.map):%s]" <myerror>
```

On filesystem the following icon files could be provided by the user for those Items:

| File name              | Description                                                        |
|------------------------|--------------------------------------------------------------------|
| `myswitch-off.svg`     | Matches `OFF` or "off" state                                       |
| `myswitch-on.svg`      | Matches `ON` or "on" state                                         |
| `myswitch.svg`         | Default icon, used when no matching icon is found (e.g. `UNDEF`)   |

| File name              | Description                                                        |
|------------------------|--------------------------------------------------------------------|
| `myerror-no_fault.svg` | Matches `NO_FAULT` state                                           |
| `myerror.svg`          | Default icon, used when Item in other state (e.g. `CONNECT_ERROR`) |

Take note, that the Transformation used in the `Livingroom_Light_Connection` Item doesn't effect the needed state specific items.

**Number State Matching Rule:**
For Number Items the equal or next lowest state icon that can be found will be used.
For a dimmable light (0-100%), you might provide icons as in the example:

| File name          | Description                                          |
|--------------------|------------------------------------------------------|
| `mydimmer.svg`     | Default icon (used in undefined states)              |
| `mydimmer-0.svg`   | Matches the turned off light (0%)                    |
| `mydimmer-1.svg`   | Matches any dimmed light between 1% up to 74%        |
| `mydimmer-75.svg`  | Matches the bright light state from 75% to full 100% |

{: #groups}
### Groups

The Group is a special Item type.
It is used to define a category or collection in which you can nest and/or combine other Items or Groups.
Single Items can be in none or multiple groups and a group can be nested inside other groups.
The general syntax for Group Items follows the syntax for Items:

```java
Group groupname ["labeltext"] [<iconname>] [(group1, group2, ...)]
```

Groups can be nested inside each other, Items can be added to all of them.
This functionality is commonly used to define hierarchies of Items from different perspectives, like:

-   Location/Vertical/Physical perspective:
    - Floors in your house → Rooms on that floor → An appliance in that room...

-   Functional/Horizontal/Logical/Context perspective:
    - Maintenance Group → All battery states → Individual battery states in percentage
    - Further examples: All lights, All room temperatures, Combined power consumption, ...

These relations can be exploited in [Sitemaps]({{base}}/configuration/sitemaps.html) or in [automation rules]({{base}}/configuration/rules-dsl.html) to navigate through the hierarchically organized Items or to perform computations and updates on subsets of similar Items.

**Example:**

```java
// Overarching group
Group House
// Location perspective
Group GroundFloor  (House)
Group Livingroom   (GroundFloor)
// Functional perspective
Group Sensors      (House)
Group Temperatures (Sensors)

// Example Item
Number Livingroom_Temperature "Temperature [%.1f °C]" (Livingroom, Temperatures)
```

The example shows an Item which supposedly stores the temperature of the living room called `Livingroom_Temperature`.

From a **location perspective**, you may have a group called `Livingroom`.
With the `Livingroom_Temperature` being added to the `Livingroom` group, it also belongs to the `GroundFloor` and `House` groups.

From a **functional perspective**, the Living room temperature can also be seen as one of many temperatures in the automation setup.
Therefore the addition to a functional group called `Temperatures`, which itself belongs to the `Sensors` group, seems reasonable.

Using nested group hierarchies such as these allows a rule to, e.g., iterate through all sensors on the ground floor for maintenance actions.
The rule will be clean and short and it doesn't need to be updated when a new item were to be added to the `Temperatures` group.

{: #group-type}
#### Group Type and State

A Group Item can also have a state.
The Group's state is generated depending on the states of all its member Items.
Sending a command to a Group will cause that command to be forwarded to all Group members.

The general syntax for groups with a specific aggregation type and function is:

```java
Group[:itemtype[:function]] groupname ["labeltext"] [<iconname>] [(group1, group2, ...)]
```

- If the aggregation function is omitted, the function `EQUAL` will be used.
- If the aggregation function and `itemtype` are omitted, no group state will be aggregated from member Items.

Group state functions can be any of the following:

| Function               | Description |
|------------------------|-------------|
| `EQUAL`                | Default if no function is specified. If ALL members have state X the group state will be X, otherwise it is `UNDEF`. |
| `AND(value1,value2)`  | [Boolean](https://en.wikipedia.org/wiki/Boolean_algebra) AND operation. If all item states are 'value1', 'value1' is returned, otherwise 'value2' is returned. |
| `OR(value1,value2)`   | [Boolean](https://en.wikipedia.org/wiki/Boolean_algebra) OR operation. If at least one item is of 'value1', 'value1' is returned, otherwise 'value2' is returned. |
| `NAND(value1,value2)` | [Boolean](https://en.wikipedia.org/wiki/Boolean_algebra) NAND (not AND) operation. Returns the opposite of the AND operation. |
| `NOR(value1,value2)`  | [Boolean](https://en.wikipedia.org/wiki/Boolean_algebra) NOR (not OR) operation. Returns the opposite of the OR operation. |
| `AVG`                  | Calculates the numeric average over all Item states of decimal type. |
| `MAX`                  | This calculates the maximum value of all Item states of decimal type. |
| `MIN`                  | This calculates the minimum value of all Item states of decimal type. |
| `SUM`                  | Calculates the sum of all Item states in the Group. |

Boolean group state functions additionally return a number representing the count of member Items of value 'value1' (see example below).

Because the group state is an aggregation of multiple Item states, not every Item state change results in a change of the group state.

Note that aggregation functions can only be used on compatible Item types.
Incompatible Item types within one Group might result in the invalid aggregation result `UNDEF`.

**Examples:**

```java
Group:Number             Lights       "Active Lights [%d]"              // e.g. "2"
Group:Switch:OR(ON, OFF) Lights       "Active Lights [%d]"              // e.g. ON and "2"
Group:Number:AVG         Temperatures "All Room Temperatures [%.1f °C]" //e.g. "21.3 °C"
```

The first two group aggregations equally compute the number of active lights and store them as group state.
Additionally, the second group is of type switch and follows the given OR function.
The state of the group will be `ON` as soon as any of the member lights are turned on.
Other than the first group, the second can also be commanded to turn all lights ON and OFF with a simple switch command.
The third example groups combines all room temperatures and the group state represents the average of those.

{: #tags}
### Tags

Tags added to an Item definition characterize a specific nature of the Item beyond it's basic Item type.
Tags can then be used by add-ons to interact with Items in context-sensitive ways.

To give an example:
A Light in a typical home setup can be represented either by a Switch, Dimmer or Color Item.
To be able to specifically interact with the light device, e.g. via a natural voice command, the nature of the Item as a Light needs to be known.
This can be achieved by adding the "Lighting" tag.

```java
Switch Livingroom_Light "Livingroom Ceiling Light" ["Lighting"]
```

Tagging is still a new feature and only some specific I/O add-ons are using it.
Tags are only of interest, if the documentation for a specific add-on or integration explicitly discusses their usage.

See the [Hue Emulation]({{base}}/addons/io/hueemulation/readme.html) or [HomeKit Add-on](http://docs.openhab.org/addons/io/homekit/readme.html) documentation for more details.

{: #binding}
### Binding Configuration

Each Item can be bound to a Binding to receive or trigger external changes.
The binding of an Item is given in the last part of the Item definition:
 
```java
Number Livingroom_Temperature "Temperature [%.1f °C]" {/*Binding part*/}
```

Navigate to the list of [currently available Bindings]({{base}}/addons/bindings.html) to get more information about possible connections and examples.

There are two ways to bind/link a device to an Item, 1.x Binding configuration or 2.x Channel Linking.

<!-- TODO: Everything below was not yet revised -->

#### 1.x Binding Configuration

When you install a Binding, some of them will automatically create a `.cfg` file in `$OPENHAB_CONF/services/`.
Inside these files are predefined variables which are required for the Binding to operate.
In many cases you will need to view and edit these to suit your system.
These variables can hold IP addresses, API keys, user names, passwords etc.
These are all in plain text, so be careful who you share these with if some data is sensitive.

The 1.x Binding configuration defines from where the Item gets it values, and where a given value/command should be sent.

You bind an Item to a Binding by adding a Binding definition in curly brackets at the end of the Item definition:

```java
Switch Phone_Mobile {ns="192.168.1.123:80"}
```

Where "ns" is the namespace for a certain Binding like "network", "netatmo", "zwave" etc.
Every Binding defines what values must be given in the Binding configuration string.
That can be the id of a sensor, an ip or mac address or anything else.
You must have a look at your [Bindings]({{base}}/addons/bindings.html) configuration section to know what to use.
Some typical examples are:

```java
Switch Phone_Mobile        "My Mobile Phone"                 {nh="192.168.1.123:80"}
Number Netatmo_Indoor_CO2  "CO2 [%d]"                        {netatmo="00:00:00:00:00:00#Co2"}
Number Azimuth             "Azimuth [%d]"                    {astro="planet=sun, type=position, property=azimuth"}
Contact Garage_Door        "Garage door is [MAP(en.map):%s]" {zwave="21:command=sensor_binary,respond_to_basic=true"}
```

If you need to use legacy openHAB 1.x Bindings then you need to enable this feature through the Paper UI menu by turning on "Include Legacy 1.x Bindings" found at `/configuration/services/configure extension management/`.
After downloading the legacy .jar files, they need to be placed in the `addons/` folder.
If further configuration is required then you will need to create an `openhab.cfg` file in `$OPENHAB_CONF/services/` and paste the appropriate Binding configuration into this.
For all other native openHAB2 Bindings, configuration is done through a `bindingname.cfg` file in the same location.

#### 2.x Binding Configuration

The 2.x Bindings introduce the concept of [Things and Channels]({{base}}/concepts/things.html).
Unlike with 1.x version Bindings which each define their own format for the Binding config that is defined on the Item itself, 2.x Bindings define those parameters in a Thing.
Each Thing has one or more Channels and Items are linked to one or more Channels.

Some Bindings support automatic discovery of Things in which case discovered Things will appear in the Inbox in Paper UI.
Once accepted it will appear under Configuration > Things.

Other Bindings support defining Things in a `.things` file.

See the [Bindings]({{base}}/addons/bindings.html) configuration section to know how to discover or manually define Things for a given Binding.

##### Paper UI Linking

One can link an Item with a Channel using Paper UI.

1. First create the Item in Paper UI under Configuration Items.
2. Next navigate to the Thing that has the Channel to link to the Item.
3. Click on the expand icon to the right of the Channel to link to the Item and press the `+` next to "Linked Items."
4. Select the Item from the list and press "Link".

##### Text File Linking

One can also link an Item with a Channel using the `.items` file.
Information about available Channels and options can be found in the Binding readme or discovered via Paper UI.

In Paper UI select a Thing to learn about all Channels the Thing support.

Linking an Item to a Channel is of the form `{channel="channel id"}`.
Some examples:

```java
Switch  Phone_Mobile       "My Mobile Phone"               {channel="network:device:devicename:online"}
Number  Netatmo_Indoor_CO2 "CO2"                           {channel="netatmo:NAMain:home:inside:Co2"}
Number  Azimuth            "Azimuth"                       {channel="astro:sun:home:position#azimuth"}
Contact Garage             "Garage is [MAP(en.map):%s]"    {channel="zwave:21:command=sensor_binary,respond_to_basic=true"}
```

#### Multi Binding/Channel Linkage

One Item can be linked to multiple Bindings and/or Channels.
Commands and Updates from and to these will be mixed/combined and can be used in interesting ways.

```java
Switch Office_PC {nh="192.168.3.203", wol="192.168.0.2"}
Number Temperature {mysensors="24;1;V_TEMP", expire="5m,-999"}
```

The first example shows a symbiosis of the network health Binding and the Wake-on-LAN Binding to interact with a PC.
The second example shows a prominent use case for the [expire Binding](http://docs.openhab.org/addons/bindings/expire1/readme.html)
where the mysensors Binding will update temperature readings regularly but the expire Binding will also listen and eventually modify the Item state.

##### Exception `autoupdate`

`autoupdate="false"` is a special instruction which keeps the current state of the item, even if a *command* has been received.
This way, the Item is always unchanged unless you explicitly post an *update* to the item.

```java
Switch Garage_Gate {binding="xxx", autoupdate="false"}
```

<!-- TODO: This should be part of a separate Item state chapter -->

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
