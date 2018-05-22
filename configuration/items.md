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

A unique feature of openHAB Items is the ability to connect them to the outside world via [Bindings](#binding).
An Item does not simply store information that is set by software (e.g., `OFF`, 3.141 or "No Error"); the information stored by an Item may also be set by actions that take place in your home.

But let's not get ahead of ourselves.
The rest of this page contains details regarding Items and is structured as follows:

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
    (Note that 1.x and legacy Bindings do not offer this option)

2.  Through text `.items` files located in the `$OPENHAB_CONF/items` folder.
    Files here must have the extension `.items`; you may create as many `.items` files as needed.
    However, each Item must be unique across all `.items` files.
    Refer to the [installation docs]({{base}}/installation/index.html) to determine your specific installation's folder structure.

Generally 1.x version Bindings can only be bound to Items through `.items` files.
2.x Bindings may be configured using either method described above.

**Assumptions for Paper UI:**
The examples below assume that the user is using a text editor to create a `.items` file.
While the way of defining an Item using the graphical, interactive Paper UI is different, the elements and the nature of an Item definition are identical using either method.

**Editor Recommendation:**
It's recommended to edit `.items` files using one of the [openHAB supporting editors]({{base}}/configuration/editors.html).
Doing so will provide you with full IDE support including features such as syntax checking, and context assistance.

{: #syntax}
## Item Definition and Syntax

Items are defined using the following syntax:

```java
itemtype itemname "labeltext [stateformat]" <iconname> (group1, group2, ...) ["tag1", "tag2", ...] {bindingconfig}
```

- Fields must be entered in the order shown
- `itemtype` and `itemname` are manadatory
- All other fields are optional
- Fields may be separated by one or more spaces, or tabs
- An Item definition may span multiple lines

**Examples:**

```java
Switch Kitchen_Light "Kitchen Light" {mqtt="<[...], >[...]" }
String Bedroom_Sonos_CurrentTitle "Title [%s]" (gBedRoom) {channel="sonos:..."}
Number Bathroom_WaschingMachine_Power "Power [%.0f W]" <energy> (gPower) {channel="homematic:..."}

Number Livingroom_Temperature "Temperature [%.1f °C]" <temperature> (gTemperature, gLivingroom) ["TargetTemperature"] {knx="1/0/15+0/0/15"}
```

The last example above defines an Item with the following fields:

- Item [type](#type) `Number`
- Item [name](#name) `Livingroom_Temperature`
- Item [label](#label) "Temperature"
- Item [state formatted](#state-presentation) to display temperature in Celsius to one-tenth of a degree -  for example, "21.5 °C"
- Item [icon](#icons) with the name `temperature`
- Item belongs to [groups](#groups) `gTemperature` and `gLivingroom` (definition not shown in the example)
- Item is [tagged](#tags) as a thermostat with the ability to set a target temperature ("TargetTemperature")
- Item is [bound to](#binding) the openHAB Binding `knx` with binding specific settings ("1/0/15+0/0/15")

The remainder of this article provides additional information regarding Item definition fields.

{: #type}
### Type

The Item type defines what kind of state can be stored in that Item and which commands the Item will accept.
Item types are comparable to basic variable data types in programming languages.
Each Item type has been optimized for a particular kind of component in your smart home.
This optimization is reflected in the data and command types.

Available Item types are:

| Type Name      | Description | Command Types |
|----------------|-------------|---------------|
| Color          | Color information (RGB) | OnOff, IncreaseDecrease, Percent, HSB |
| Contact        | Status of contacts, e.g. door/window contacts | OpenClose |
| DateTime       | Stores date and time | - |
| Dimmer         | Percentage value for dimmers | OnOff, IncreaseDecrease, Percent |
| Group          | Item to nest other items / collect them in groups | - |
| Image          | Binary data of an image | - |
| Location       | GPS coordinates | Point |
| Number         | Values in number format | Decimal |
| Player         | Allows control of players (e.g. audio players) | PlayPause, NextPrevious, RewindFastforward |
| Rollershutter  | Roller shutter Item, typically used for blinds | UpDown, StopMove, Percent |
| String         | Stores texts | String |
| Switch         | Switch Item, typically used for lights (on/off) | OnOff |

More details about all of the available Item types and their commands are available under Concepts, see:
[Item Types Overview]({{base}}/concepts/items.html)

To learn about the technical internals of the individual Item types, please refer to:
[Javadoc on Generic Item and its subclasses](https://eclipse.org/smarthome/documentation/javadoc/org/eclipse/smarthome/core/items/GenericItem.html)

<!-- TODO: Random content. Doesn't make sense here. Might be changed to be a more general example for diverse Items

Example:

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

The Item name is used to uniquely identify an Item.
The name must be unique across all `.items` files in your openHAB configuration.
The only characters permitted in an Item name are letters, numbers and the underscore character.
Names must not begin with numbers.
Spaces and special characters are not permitted.

A good Item name is self-explanatory and hints at its Item type and interaction options.
A good hierarchical arrangement allows you to create common-sense groupings of Items.
Names may be organized by function, and/or location.

Users are advised to establish and follow a consistent naming scheme for Items.
You may wish to think of a logical naming hierarchy that makes sense to you and apply that consistently in your openHAB installation.
Having a well thought out naming scheme can be especially important as your installation grows.
An Item naming scheme with a physical or logical top-down will ensure you can easily identify the function or purpose of the Item, especially over time.

The following naming style guide is recommended:

-   Words build a physical or logical hierarchy

-   Every word of the Item name starts with an uppercase letter

-   Words should be separated by an underscore character, except for words that logically belong together

-   Names that reoccur frequently, such as the names of rooms or appliances, may be abbreviated to reduce overall name length.
(Example: Bathroom = BR)

Examples:

| Item Name                         | Interpretation (assumed Item type, example value) |
|-----------------------------------|---------------------------------------------------|
| "`Livingroom_CeilingLight`"       | Living room light (Switch, e.g. ON) |
| "`Livingroom_CeilingLight_Color`" | Living room light color (Color, e.g. warm white) |
| "`GF_BR_WaschingMachine_Power`"   | Electric power consumed by the washing machine located in the ground floor bathroom (Number, e.g. 100W) |
| "`Lighting_Scene`"                | Overall lighting scene of the house (String, e.g. Party) |
| "`Presence_John_Smartphone`"      | An Item indicating if John is home or not, based on smartphone detection (Switch, e.g. Offline) |

[Group](#groups) is a special Item type that may be used to nest or combine Items.
Users are encouraged to apply the style guide above to group names as well as Item names.
Two naming schemes are established in the community for Group names:

1.  Use a plural word form (e.g. Batteries) where possible.
    Otherwise the word "Group" may be appended for clarity.
2.  Prepend a lowercase "g" to the name (e.g. gBattery)

| Group Name                                | Interpretation |
|-------------------------------------------|----------------|
| "`Batteries`" or "`gBattery`"             | Group combining the states of all battery Items |
| "`Maintenance_Group`" or "`gMaintenance`" | Group containing all maintenance-related Items |
| "`Livingroom_Lights`" or "`gLR_Light`"    | Group containing all light Items belonging to the living room |
| "`Livingroom`" or "`gLR`"                 | Group for *all* Items (including lights) belonging to the living room |

{: #label}
### Label

Label text is used to describe an Item in a human-readable way.
Graphical UIs will display the label text when the Item is included, e.g. in [Basic UI]({{base}}/addons/uis/basic/readme.html) in a [Sitemap]({{base}}/configuration/sitemaps.html) definition.
Some I/O services (e.g. the Amazon Alexa skill) also use the label to match an external voice command to an Item.

In textual configurations the label, in quotation marks, appears next to the optional state presentation field in square brackets (see below).
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

This section provides information about what a user can expect regarding the behavior of the state of an Item.

-   Items are created with a state of `NULL`

-   Operations in openHAB such as a user interacting with the Item using the Basic UI, or a Binding updating the state of an Item will change the state of the Item

-   An Item's state may also be set through a Binding which may be reacting to changes in the real world

-   A Binding may set the state of an Item to `UNDEF` if it looses communications with a Thing (for example, a Z-wave doorbell with a dead battery).
The Binding may also set the state to `UNDEF` if an error exists in the binding configuration, or under other conditions

*N.B.*  Many openHAB users find that it can be very useful to use [Persistence]({{base}}/addons/persistence.html) and [System started]({{base}}/configuration/rules-dsl.html#system-based-triggers) rules so that their systems behaves in a predictable way after an openHAB restart.

{: #command-vs-status}
#### Command vs. Status

Users should bear in mind the difference between an Item used to send a command to a Thing, and an Item that reflects the status of a real-world Thing in the UI.
This distinction may seem obvious, but it can be a little confusing when an Item appears not to reflect the correct status of a Thing.

For example, let's say you have a Switch Item that is used to turn on a light.
You insert this Item into a [sitemap]({{base}}/configuration/sitemaps).
You call up the sitemap and switch on the light using the UI.
The switch icon changes from red to green, but you notice that the light does not turn on.
What happened?
Perhaps the Switch physical device is faulty or perhaps the device lost communications with your network.
In any case, the UI performed correctly - it reflected the fact that you sent a command to the Switch Item.
What the UI did not do is convey the status of the device being switched.
Of course, this is the correct.
As of this point, you do not have any Item in your sitemap that would do this.
If it is critical that you know that the light came on, you could install a sensor that monitors light level.
You could then, through the appropriate Binding, reflect light level changes through a Thing to an Item.
Then you add the light-level Item to your UI.
Now when you send the Switch Item command, and you see a corresponding increase in light level in the room, you know for sure that your command has been received and acted upon, because you have a return status Item in your UI.

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

Transformations can be used in the state part of an Item, to translate the raw state of an Item into another language, or to convert technical values into human readable information.

In the example below, the entry `MAP(window_esp.map)` causes the output of the `Contact` Item to be translated from "CLOSED", to the Spanish "cerrado":

```java
Contact Livingroom_Window "Ventana del salón [MAP(window_esp.map):%s]"
```

Please refer to the article on [Transformations](transform.html) for more usage details and a list of available transformation services.

{: #icons}
### Icons

The icon name is used by openHAB to select the image to display next to an Item name when using one of openHAB's UIs, e.g. Basic UI.
The icon name appears between angle brackets "&lt;&gt;".
In the example below, the "switch" icon has been selected:

```java
Switch Livingroom_Light "Livingroom Ceiling Light" <switch>
```

openHAB provides a set of [classic icons]({{base}}/addons/iconsets/classic/readme.html) by default.
Users may add their own icons in either `png` or `svg` format in the openHAB icons configuration folder, `$OPENHAB_CONF/icons/classic/`.

The following guidelines apply to user-added icon files:

- Only `png` or `svg` file formats may be used
- Icon filenames may include lowercase letters, numbers and underscores (`_`)
- Uppercase letters and special characters are prohibited
- Hyphens (`-`) are reserved for [Dynamic Icons](#dynamic-icons) (see below)
- Example filenames:
  - Good: `myswitch.svg`, `power_meter.png`, `error23.svg`
  - Bad: `PC_Display.svg`, `power-meter.png`, `tür⇔.svg`

**Bitmaps or Vector Graphics:**
openHAB can work with either Bitmap (`png`) or Vector (`svg`) icon files.
The format should match the display capabilities of the user interfaces in use (e.g. Basic UI).
It is thereby important to decide on one format beforehand; vector graphics are recommended.
The setting can be changed via Paper UI for most user interfaces.
Please check the user interface documentation if in doubt.
Note that image files with the wrong file ending will be ignored.

Users may substitute their own icon for an icon from the default icon set by placing a file in the `$OPENHAB_CONF/icons/classic/` folder with the same filename as the name of the icon being substituted.

{: #icons-dynamic}
#### Dynamic Icons

Some icons are dynamically selected by openHAB depending on the Item's state.
For example, a "switch" icon may appear to be green when the Item is "ON" and red when the item is "OFF.
Behind the scenes, openHAB is actually selecting two different icon files depending upon the Item state - `switch-on` or `switch-off`.
A third default icon file, `switch`, is required as well.
This icon file matches when none of the other icon files match the Item state (e.g. when the Item is in an undefined state).

Dynamic icon filenames follow the pattern below:

```perl
<name>-<state>.<extension>
```

- `<name>` - the name of the icon set
- `-<state>` - the Item state the icon maps to (e.g. "ON" or "OFF", "OPEN" or "CLOSED")
- `<extension>` - bitmap (`png`) or vector graphic (`svg`) icon file extension ([see above](#icons))

Dynamic icon sets may consist of as many state-specific icon files as needed.
Each set must meet the following criteria:

-   A default icon is mandatory.
    The default icon filename is the name of the icon without a hyphen or state (e.g. `switch.svg`)

-   Icon filenames must follow the naming restrictions given for [icons](#icons) above

-   The state name must reflect the Item's raw state.
    [Transformations](#state-transformation) applied in the state presentation definition of the Item have no influence on icon selection.

-   The state portion of the icon name must be in lowercase letters

**Example:**

The user defines the "Livingroom_Light" and "Livingroom_Light_Connection" Items:

```java
Switch Livingroom_Light "Livingroom Ceiling Light" <myswitch>
String Livingroom_Light_Connection "Livingroom Ceiling Light [MAP(error.map):%s]" <myerror>
```

On the filesystem, the following icon files are provided by the user:

| File name              | Description                                                        |
|------------------------|--------------------------------------------------------------------|
| `myswitch-off.svg`     | Matches `OFF` or "off" state                                       |
| `myswitch-on.svg`      | Matches `ON` or "on" state                                         |
| `myswitch.svg`         | Default icon, used when no matching icon is found (e.g. `UNDEF`)   |

| File name              | Description                                                        |
|------------------------|--------------------------------------------------------------------|
| `myerror-no_fault.svg` | Matches `NO_FAULT` state                                           |
| `myerror.svg`          | Default icon, used when Item in other state (e.g. `CONNECT_ERROR`) |

Take note, that the Transformation used in the `Livingroom_Light_Connection` Item doesn't effect the needed state specific icons - the icon selection considers "myerror", not the contents of the `error.map` file.

**Number State Matching Rule:**
For Number Items the equal or next lowest state icon that can be found will be used.
For a dimmable light (0-100%), you might provide icons as in the example:

| File name          | Description                                          |
|--------------------|------------------------------------------------------|
| `mydimmer.svg`     | Default icon (used in undefined states)              |
| `mydimmer-0.svg`   | Matches the turned off light (0%)                    |
| `mydimmer-1.svg`   | Matches any dimmed light between 1% up to 74%        |
| `mydimmer-75.svg`  | Matches the bright light state from 75% to full 100% |

Just as with regular icons, user-defined dynamic icon sets may be configured via the custom icons folder `$OPENHAB_CONF/icons/classic/`.

{: #groups}
### Groups

The Group is a special Item type that can be used to define a category or collection into which you can combine other Items or Groups.
An Item may be put into one or more groups, and groups may be nested inside other groups.
The general syntax for Group Items is as follows:

```java
Group groupname ["labeltext"] [<iconname>] [(group1, group2, ...)]
```

The Group item is commonly used to define hierarchies of Items from different perspectives.
For example:

-   Location-oriented or physical perspective:
    - Floors in your house → Rooms on that floor → An appliance in that room...

-   Functional or logical perspective:
    - Maintenance Group → All battery states → Individual battery states in percentage
    - Further examples: all lights, all room temperatures, combined power consumption

These relationships can be exploited in [Sitemaps]({{base}}/configuration/sitemaps.html) or in [automation rules]({{base}}/configuration/rules-dsl.html) to navigate through the hierarchically organized Items or to perform computations and updates on subsets of similar Items.

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

The example shows an Item which stores the temperature of the living room called `Livingroom_Temperature`.

From a **location perspective**, you may have a group called `Livingroom`.
When you add `Livingroom_Temperature` to the `Livingroom` group, `Livingroom_Temperature` is automatically part of the `GroundFloor` and `House` groups.
This is because `Livingroom` is a member of the `GroundFloor` group, and `GroundFloor` is a member of the `House` group.

From a **functional perspective**, the Living room temperature can also be seen as one of many temperatures in the automation setup.
Therefore the addition of `Livingroom_Temperature` to a functional group called `Temperatures`, which itself belongs to the `Sensors` group, seems reasonable.

Using nested group hierarchies such as these allows a rule to iterate through all sensors on the ground floor for maintenance actions, for example.
Because of the hierarchical structure of your group items, the rule will be clean and short.
Additionally, the rule will not need to be modified when a new Item is added to the `Temperatures` group.

{: #group-type}
#### Group Type and State

As you are now aware, an Item can have a state (e.g. "ON", "OFF").
A Group Item can also have a state.
The Group's state is determined by the state of all its Items, and the aggregation function specified in the group definition.

The general syntax for groups with a specific item type and aggregation function is:

```java
Group[:itemtype[:function]] groupname ["labeltext"] [<iconname>] [(group1, group2, ...)]
```

- If the aggregation function is omitted, the function `EQUAL` will be used
- If the aggregation function and `itemtype` are omitted, no group state will be aggregated from member Items

Group state aggregation functions can be any of the following:

| Function               | Description |
|------------------------|-------------|
| `EQUAL`                | Default if no function is specified. If ALL members have state X the group state will be X, otherwise the group state will be `UNDEF`. |
| `AND(value1,value2)`  | [Boolean](https://en.wikipedia.org/wiki/Boolean_algebra) AND operation. If all item states are 'value1', 'value1' is returned, otherwise 'value2' is returned. |
| `OR(value1,value2)`   | [Boolean](https://en.wikipedia.org/wiki/Boolean_algebra) OR operation. If at least one item state is of 'value1', 'value1' is returned, otherwise 'value2' is returned. |
| `NAND(value1,value2)` | [Boolean](https://en.wikipedia.org/wiki/Boolean_algebra) NAND (not AND) operation. Returns the opposite of the AND operation. |
| `NOR(value1,value2)`  | [Boolean](https://en.wikipedia.org/wiki/Boolean_algebra) NOR (not OR) operation. Returns the opposite of the OR operation. |
| `AVG`                  | Calculates the numeric average over all Item states of decimal type. |
| `MAX`                  | Calculates the maximum value of all Item states of decimal type. |
| `MIN`                  | Calculates the minimum value of all Item states of decimal type. |
| `SUM`                  | Calculates the sum of all Item states in the Group. |

Boolean group state functions additionally return a number representing the count of member Items of value 'value1' (see example below).

Because the group state is an aggregation of multiple Item states, not every Item state change results in a change of the group state.

Note that aggregation functions can only be used on compatible Item types.
Incompatible Item types within a Group may result in the invalid aggregation result `UNDEF`.

**Examples:**

```java
Group:Number             Lights       "Active Lights [%d]"              // e.g. "2"
Group:Switch:OR(ON,OFF)  Lights       "Active Lights [%d]"              // e.g. ON and "2"
Group:Number:AVG         Temperatures "All Room Temperatures [%.1f °C]" // e.g. "21.3 °C"
```

The first two examples above compute the number of active lights and store them as group state.
However, the second group is of type switch and has an aggregation function of OR.
This means that the state of the group will be `ON` as soon as any of the member lights are turned on.

Groups do not only aggregate information from individual member Items, they can also accept commands.
Sending a command to a Group causes the command to be sent to all Group members.
An example of this is shown by the second group above; sending a single `ON` or `OFF` command to that group turns all lights in the group on or off.

The third example computes the average temperature of all room temperature Items in the group.

{: #tags}
### Tags

Tags added to an Item definition allow a user to characterize the specific nature of the Item beyond it's basic Item type.
Tags can then be used by add-ons to interact with Items in context-sensitive ways.

Example:
A Light in a typical home setup can be represented by a Switch, a Dimmer or a Color Item.
To be able to interact with the light device via a natural voice command, for example, the fact that the Item is a light can be established by adding the "Lighting" tag as shown below.

```java
Switch Livingroom_Light "Livingroom Ceiling Light" ["Lighting"]
```

Tagging is a new feature and only a few I/O add-ons have implemented it.
The easiest way to determine if tags have been implemented in a specific add-on is to see if the add-on documentation explicitly discusses their usage.
Tags will be ignored if no Items in the openHAB installation support it.

See the [Hue Emulation]({{base}}/addons/ios/hueemulation/readme.html) or [HomeKit Add-on]({{base}}/addons/ios/homekit/readme.html) documentation for more details.

{: #binding}
### Binding Configuration

One of the greatest strengths of an openHAB automation system is the sheer number of devices you can interact with.
See "[currently available Bindings]({{base}}/addons/bindings.html)" for a list of available Bindings.
This capability of interacting with real-world things is enabled through the association of Bindings with Items.

Once an Item is associated with a Binding, the state of one aspect of a device is reflected in openHAB (e.g., you can see if a light is on or off in one of the user interfaces).
Additionally, you have the opportunity to interact with a device through its Items, if interaction is supported for that aspect of the device (e.g., you can command the light to turn ON or turn OFF).

The Binding of an Item is given in the last part of the Item definition between curly brackets e.g. `{channel="..."}` in the example below:

```java
Number Livingroom_Temperature "Temperature [%.1f °C]" {channel="..."}
```

Users should note that there are significant differences between how Items are associated with devices between 1.x Binding configuration and 2.x Channel linking.
These are described below.

<!-- TODO: Everything below was not yet revised -->

#### 1.x Binding Configuration

To bind an Item to a Binding, you add a Binding definition in curly brackets at the end of the Item definition:

```java
Switch Phone_Mobile {ns="192.168.1.123:80"}
```

Where "ns" is the namespace for a certain Binding like "network", "netatmo", "zwave" etc.
Every Binding defines what values must be given in the Binding configuration string.
That can be the id of a sensor, an ip or mac address or anything else.
The information required for each binding is specified in the configuration information provided for each of the available [Bindings]({{base}}/addons/bindings.html).

Examples:

```java
Switch Phone_Mobile        "My Mobile Phone"                 {ns="192.168.1.123:80"}
Number Netatmo_Indoor_CO2  "CO2 [%d]"                        {netatmo="00:00:00:00:00:00#Co2"}
Number Azimuth             "Azimuth [%d]"                    {astro="planet=sun, type=position, property=azimuth"}
Contact Garage_Door        "Garage door is [MAP(en.map):%s]" {zwave="21:command=sensor_binary,respond_to_basic=true"}
```

In some cases, you will need to use legacy openHAB 1.x bindings with your openHAB 2.0 installation.
In this case, you will need to enable this feature through the Paper UI menu by turning on "Include Legacy 1.x Bindings" found at `/configuration/services/configure extension management/`.
You can then download the legacy .jar file and placed it in the `$OPENHAB_CFG/addons/` folder.
If further configuration is required then you will need to create an `openhab.cfg` file in `$OPENHAB_CONF/services/` and paste the appropriate Binding configuration into this file.
For all other native openHAB2 Bindings, configuration is done through a `bindingname.cfg` file in the `OPENHAB_CFG/services/` directory (substitute the name of your binding for `bindingname` above).

Some bindings will automatically create a `.cfg` file in `$OPENHAB_CONF/services/`.
Inside these files are predefined variables which are required for the Binding to operate.
In many cases you will need to view and edit these to suit your system.
These variables can hold IP addresses, API keys, user names, passwords etc.
These are all in plain text, so be careful who you share these with if some data is sensitive.

#### 2.x Binding Configuration

openHAB2 introduces the concept of [Things and Channels]({{base}}/concepts/things.html).
Unlike 1.x version Bindings which each define their own format for the Binding config that is defined on the Item itself, 2.x Bindings define those parameters in a Thing.
Each Thing has one or more Channels, and Items are linked to one or more Channels.

Some Bindings support automatic discovery of Things, in which case discovered Things will appear in the Inbox in the Paper UI.
Once accepted, the new Thing will appear under Configuration > Things.

Other Bindings support defining Things in a `.things` file located in the `OPENHAB_CFG/things/` folder.

See the [Bindings]({{base}}/addons/bindings.html) configuration section for more information on how to discover or manually define Things for a given Binding.

##### Paper UI Linking

As described above, you can link an Item with a Channel using the Paper UI.

1. First create the Item in Paper UI under Configuration Items.
2. Next navigate to the Thing that has the Channel to link to the Item.
3. Click on the expand icon to the right of the Channel to link to the Item and press the `+` next to "Linked Items."
4. Select the Item from the list and press "Link".

##### Text File Linking

You may also link an Item with a Channel using the `.items` file located in the `OPENHAB_CFBG/items/` folder.
Information about available Channels and options can be found in the Binding readme or discovered via Paper UI.

In Paper UI select a Thing to learn about Channels it supports.

Linking an Item to a Channel is of the form `{channel="channel id"}`.

Examples:

```java
Switch  Phone_Mobile       "My Mobile Phone"               {channel="network:device:devicename:online"}
Number  Netatmo_Indoor_CO2 "CO2"                           {channel="netatmo:NAMain:home:inside:Co2"}
Number  Azimuth            "Azimuth"                       {channel="astro:sun:home:position#azimuth"}
Contact Garage             "Garage is [MAP(en.map):%s]"    {channel="zwave:21:command=sensor_binary,respond_to_basic=true"}
```

#### Multi Binding/Channel Linkage

An Item may be linked to multiple Bindings and/or Channels.
Commands and Updates from and to these Items will be combined, and can be used in interesting ways.

Example:

```java
Switch Office_PC {nh="192.168.3.203", wol="192.168.0.2"}
Number Temperature {mysensors="24;1;V_TEMP", expire="5m,-999"}
```

The first example shows a symbiosis of the network health Binding and the Wake-on-LAN Binding to interact with a PC.
The second example shows a common use case for the [expire Binding]({{base}}/addons/bindings/expire1/readme.html)
where the mysensors Binding will update temperature readings regularly but the expire Binding will also listen and eventually modify the Item state.

##### Exception `autoupdate`

`autoupdate="false"` is a special instruction which keeps the current state of the item, even if a *command* has been received.
This way, the Item is unchanged unless you explicitly post an *update* to the item.

Example:

```java
Switch Garage_Gate {binding="xxx", autoupdate="false"}
```
