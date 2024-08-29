---
layout: documentation
title: Items
---

# Items

In openHAB Items represent all properties and capabilities of the user’s home automation.

While a device or service might be quite specific, Items are unified substitutions inside the openHAB world.
Items can be Strings, Numbers, Switches or one of a few other basic [Item types](#type).
A programmer can compare Item types with base variable data types of a programming language.

A unique feature of openHAB Items is the ability to connect them to the outside world via [Bindings](/addons/#binding).

[[toc]]

## Introduction

Items are basic data types and have a state which can be read from, or written to.
Items can be linked to a [Binding](/addons/#binding) channel for interaction with the outside world.
For example, an Item bound to a sensor receives updated sensor readings and an Item linked to a light's dimmer channel can set the brightness of the light bulb.

There are two methods for defining Items:

1. Through UI

1. Through text `.items` files located in the `$OPENHAB_CONF/items` folder.
    Files here must have the extension `.items`; you may create as many `.items` files as needed.
    However, each Item must be unique across all `.items` files.
    Refer to the [installation docs]({{base}}/installation/index.html) to determine your specific installation's folder structure.

Generally 1.x version Bindings can only be bound to Items through `.items` files.
2.x Bindings may be configured using either method described above.

**Assumptions for UI:**
The examples below assume that the user is using a text editor to create a `.items` file.
While the way of defining an Item using the graphical, interactive UI is different, the elements and the nature of an Item definition are identical using either method.

**Editor Recommendation:**
It's recommended to edit `.items` files using one of the [openHAB supporting editors]({{base}}/configuration/editors.html).
Doing so will provide you with full IDE support including features such as syntax checking, and context assistance.

## Item Definition and Syntax

Items are defined using the following syntax:

```java
itemtype itemname "labeltext [stateformat]" <iconname> (group1, group2, ...) ["tag1", "tag2", ...] {bindingconfig}
```

- Fields must be entered in the order shown
- `itemtype` and `itemname` are mandatory
- All other fields are optional
- Fields may be separated by one or more spaces, or tabs
- An Item definition may span multiple lines

**Examples:**

```java
Switch Kitchen_Light "Kitchen Light" {channel="mqtt:topic:..." }
String Bedroom_Sonos_CurrentTitle "Title [%s]" (gBedRoom) {channel="sonos:..."}
Number:Power Bathroom_WashingMachine_Power "Power [%.0f W]" <energy> (gPower) {channel="homematic:..."}

Number:Temperature Livingroom_Temperature "Temperature [%.1f °C]" <temperature> (gTemperature, gLivingroom) ["Setpoint", "Temperature"] {knx="1/0/15+0/0/15"}
```

The last example above defines an Item with the following fields:

- Item [type](#type) `Number`
- Item [name](#name) `Livingroom_Temperature`
- Item [label](#label) "Temperature"
- Item [state formatted](#state-presentation) to display temperature in Celsius to one-tenth of a degree -  for example, "21.5 °C"
- Item [icon](#icons) with the name `temperature`
- Item belongs to [groups](#groups) `gTemperature` and `gLivingroom` (definition not shown in the example)
- Item is [tagged](#tags) as a thermostat with the ability to set a target temperature ("Setpoint", "Temperature")
- Item is [bound to](/addons/#binding) the openHAB Binding `knx` with binding specific settings ("1/0/15+0/0/15")

The remainder of this article provides additional information regarding Item definition fields.

### Type

The Item type defines what kind of state can be stored in that Item and which commands the Item will accept.
Item types are comparable to basic variable data types in programming languages.
Each Item type has been optimized for a particular kind of component in your smart home.
This optimization is reflected in the data and command types.

Available Item types are:

| Item Name                | Description                                                        | Command Types                                       |
| ------------------------ | ------------------------------------------------------------------ | --------------------------------------------------- |
| Call                     | Identify phone calls                                               | Refresh                                             |
| Color                    | Color information (RGB)                                            | OnOff, IncreaseDecrease, Percent, HSB, Refresh      |
| Contact                  | Item storing status of e.g. door/window contacts                   | OpenClosed, Refresh                                 |
| DateTime                 | Stores date and time                                               | DateTime                                            |
| Dimmer                   | Item carrying a percentage value for dimmers                       | OnOff, IncreaseDecrease, Percent, Refresh           |
| Group                    | Item to nest other Items / collect them in Groups                  | -                                                   |
| Image                    | Holds the binary data of an image                                  | Refresh                                             |
| Location                 | Stores GPS coordinates                                             | Point, Refresh                                      |
| Number                   | Stores values in number format, takes an optional dimension suffix | Decimal, Refresh                                    |
| Number:&lt;dimension&gt; | like Number, additional dimension information for unit support     | Quantity, Refresh                                   |
| Player                   | Allows to control players (e.g. audio players)                     | PlayPause, NextPrevious, RewindFastforward, Refresh |
| Rollershutter            | Typically used for blinds                                          | UpDown, StopMove, Percent, Refresh                  |
| String                   | Stores texts                                                       | String, Refresh                                     |
| Switch                   | Typically used for lights (on/off)                                 | OnOff, Refresh                                      |

More details about all of the available Item types and their commands are available under Concepts, see:
[Item Types Overview]({{base}}/concepts/items.html)

To learn about the technical internals of the individual Item types, please refer to:
[Javadoc on Generic Item and its subclasses](https://www.openhab.org/javadoc/latest/org/openhab/core/items/genericitem)

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

- Words build a physical or logical hierarchy

- Every word of the Item name starts with an uppercase letter

- Words should be separated by an underscore character, except for words that logically belong together

- Names that reoccur frequently, such as the names of rooms or appliances, may be abbreviated to reduce overall name length.
    (Example: Bathroom = BR)

Examples:

| Item Name                       | Interpretation (assumed Item type, example value)                                                       |
| ------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `Livingroom_CeilingLight`       | Living room light (Switch, e.g. ON)                                                                     |
| `Livingroom_CeilingLight_Color` | Living room light color (Color, e.g. warm white)                                                        |
| `GF_BR_WashingMachine_Power`    | Electric power consumed by the washing machine located in the ground floor bathroom (Number, e.g. 100W) |
| `Lighting_Scene`                | Overall lighting scene of the house (String, e.g. Party)                                                |
| `Presence_John_Smartphone`      | An Item indicating if John is home or not, based on smartphone detection (Switch, e.g. Offline)         |

[Group](#groups) is a special Item type that may be used to nest or combine Items.
Users are encouraged to apply the style guide above to group names as well as Item names.
Two naming schemes are established in the community for Group names:

1. Use a plural word form (e.g. Batteries) where possible.
    Otherwise the word "Group" may be appended for clarity.
1. Prepend a lowercase "g" to the name (e.g. gBattery)

| Group Name                            | Interpretation                                                        |
| ------------------------------------- | --------------------------------------------------------------------- |
| `Batteries` or `gBattery`             | Group combining the states of all battery Items                       |
| `Maintenance_Group` or `gMaintenance` | Group containing all maintenance-related Items                        |
| `Livingroom_Lights` or `gLR_Light`    | Group containing all light Items belonging to the living room         |
| `Livingroom` or `gLR`                 | Group for _all_ Items (including lights) belonging to the living room |

### Label

Label text is used to describe an Item in a human-readable way.
Graphical UIs will display the label text when the Item is included, e.g. in Basic UI in a [Sitemap]({{base}}/ui/sitemaps.html) definition.
Some I/O services (e.g. the Amazon Alexa skill) also use the label to match an external voice command to an Item.

In textual configurations the label, in quotation marks, appears next to the optional [state presentation](#state-presentation) field in square brackets (see below).
The label for the Item in the following example is "Temperature" and the optional state representation is set to be displayed, e.g. as "23.9 °C":

```java
Number:Temperature Livingroom_Temperature "Temperature [%.1f °C]"
```

Channel labels can be overwritten by Item definitions and Item labels can be overwritten in [Sitemaps]({{base}}/ui/sitemaps.html#element-types).

### State

The state of an Item depends on the Item type, the Channel bound to the Item, and internal or external events.
A analogy can be drawn between the state of an Item and the value of a variable in a computer program.

#### Item State

This section provides information about what a user can expect regarding the behavior of the state of an Item.

- Items are created with a state of `NULL`

- Operations in openHAB such as a user interacting with the Item using the Basic UI, or a Binding updating the state of an Item will change the state of the Item

- An Item's state may also be set through a Binding which may be reacting to changes in the real world

- A Binding may set the state of an Item to `UNDEF` if it looses communications with a Thing (for example, a Z-wave doorbell with a dead battery).
    The Binding may also set the state to `UNDEF` if an error exists in the binding configuration, or under other conditions

_N.B._  Many openHAB users find that it can be very useful to use [Persistence](/addons/#persistence) and [System started]({{base}}/configuration/rules-dsl.html#system-based-triggers) rules so that their systems behaves in a predictable way after an openHAB restart.

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

#### State Presentation

The Item definition determines the Item's textual state presentation, e.g., regarding formatting, decimal places, unit display and more.
The state presentation is part of the Item label definition and contained inside square brackets.
The state presentation for the Item in the following example is "`%.1f °C`":

```java
Number:Temperature Livingroom_Temperature "Temperature [%.1f °C]"
```

If no square brackets are given and the Item is not linked to a channel, the Item will not provide a textual presentation of its internal state (i.e. in UIs no state is shown).
No text between the square brackets also implies no textual presentation.
This is often meaningful when an Item is presented by a non-textual UI elements like a switch or a diagram.

Formatting of the presentation is done applying [Java formatter class syntax](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html#syntax).

If square brackets are given, the leading `%` and the trailing formatter conversion are mandatory.
Free text, like a unit, can be added before or after the formatter string.
A few examples are given below:

```java
Number:Temperature    Livingroom_Temperature   "Temperature [%.1f °C]"             // e.g. "23.5 °C"
String    Livingroom_TV_Channel    "Now Playing [%s]"                  // e.g. "Lorem ipsum"
DateTime  Livingroom_TV_LastUpdate "Last Update [%1$ta %1$tR]"         // e.g. "Sun 15:26"
Number    Livingroom_Clock_Battery "Battery Charge [%d %%]"            // e.g. "50 %"
Location  My_Location              "My Location [%2$s°N %3$s°E %1$sm]" // e.g. "49.26°N 123.19°E 0m"
```

#### State Transformation

Transformations can be used in the state part of an Item, to translate the raw state of an Item into another language, or to convert technical values into human readable information.

In the example below, the entry `MAP(window_esp.map)` causes the output of the `Contact` Item to be translated from "CLOSED", to the Spanish "cerrado":

```java
Contact Livingroom_Window "Ventana del salón [MAP(window_esp.map):%s]"
```

Please refer to the article on [Transformations](/docs/configuration/transformations.html) for more usage details and a list of available transformation services.

### Icons

The icon name is used by openHAB to select the image to display next to an Item name when using one of openHAB's UIs, e.g. Basic UI.
The icon name appears between angle brackets "&lt;&gt;".
In the example below, the "switch" icon has been selected:

```java
Switch Livingroom_Light "Livingroom Ceiling Light" <switch>
```

Please note that icons (also known as categories) are not meant to be changed dynamically via rules.

#### Icons provided with openHAB

openHAB provides a set of [classic icons](/docs/configuration/iconsets/classic/) by default.
The community marketplace provides other openHAB icon sets that can be installed, e.g. [this subset of iconify icons]( https://community.openhab.org/t/iconify-icon-provider/144508).
Users may also add their own icons in either `png` or `svg` format in the openHAB icons configuration folder, `$OPENHAB_CONF/icons/classic/`.

The following guidelines apply to user-added icon files:

- Only `png` or `svg` file formats may be used
- Icon filenames may include lowercase letters, numbers, hyphens (`-`) and underscores (`_`)
- Example filenames:
  - Good: `myswitch.svg`, `power_meter.png`, `tuer23.svg`
  - Bad: `MySwitch.svg`, `power-meter.png`, `tür23.svg`

**Bitmaps or Vector Graphics:**
openHAB can work with either Bitmap (`png`) or Vector (`svg`) icon files.
The format should match the display capabilities of the user interfaces in use.
It is thereby important to decide on one format beforehand; vector graphics are recommended.
Most user interfaces don't expose this setting because they support both formats transparently.
But the setting can be changed via UI in certain user interfaces.
Please check the user interface documentation if in doubt.
Note that image files with the wrong file ending will be ignored.

Users may substitute their own icon for an icon from the default icon set by placing a file in the `$OPENHAB_CONF/icons/classic/` folder with the same filename as the name of the icon being substituted.

#### Icon sources

Some user interfaces supports other icons than those provided by openHAB.
Thus, the most generic reference to an icon is composed of 3 segments separated by a colon:

1. The first segment is the icon source, e.g. "oh"

1. The second segment is the icon set from this source, e.g. "classic"

1. The third segment is the name of an icon in this set, e.g. "switch"

If the value contains only two segments, the first segment is assumed to be the icon source and the second the icon name.
In this case, the icon set is to "classic" by default.
This is used in particular when the icon source only provides a single set of icons.
As an example, `<material:favorite>` references the "favorite" icon from the Material icons.
`<oh:switch>` references the "switch" icon from the openHAB classic icon set.

If the value contains only one segment, it is assumed to be the name of an icon from the openHAB classic icon set.
As an example, `<switch>` references the "switch" icon from the openHAB classic icon set.

Here are few examples showing the different options:

```java
Switch Livingroom_Light "Livingroom Ceiling Light" <switch>
Switch Parent_Bedroom_Light "Parent Bedroom Light" <oh:switch>
Switch Child_Bedroom_Light "Child Bedroom Light" <oh:classic:switch>
Switch Bathroom_Light "Bathroom Light" <material:lightbulb>
Switch Kitchen_Light "Kitchen Light" <f7:lightbulb>
Switch Garage_Light "Garage Light" <if:mdi:lightbulb>
```

Here is the list of available icon sources that are supported by the major user interfaces (Main UI, Basic UI, Android and iOS app).

| Source name       | Source description                                                       |
| ----------------- | ------------------------------------------------------------------------ |
| `oh`              | Icons provided via the openHAB server                                    |
| `material`        | [Material icons](https://fonts.google.com/icons?icon.set=Material+Icons) |
| `f7`              | [Framework7 icons](https://framework7.io/icons/)                         |
| `if` or `iconify` | [iconify icons](https://icon-sets.iconify.design/)                       |

Please note that the iconify option requires internet connectivity on the client to access the external API.
Certain user interfaces provide a setting to enable this option, e.g. Basic UI disables this option by default but allows it to be enabled.

#### Dynamic Icons

If and only if the icon source is openHAB, some icons are dynamically selected by openHAB depending on the Item's state.
For example, a "switch" icon may appear to be green when the Item is "ON" and red when the item is "OFF.
Behind the scenes, openHAB is actually selecting two different icon files depending upon the Item state - `switch-on` or `switch-off`.
A third default icon file, `switch`, is required as well.
This icon file matches when none of the other icon files match the Item state (e.g. when the Item is in an undefined state).

Dynamic icon filenames follow the pattern below:

```perl
<name>-<state>.<extension>
```

- `<name>` - the name of the icon
- `-<state>` - the Item state the icon maps to in lowercase (e.g. "-on" or "-off", "-open" or "-closed")
- `<extension>` - bitmap (`png`) or vector graphic (`svg`) icon file extension ([see above](#icons))

Dynamic icon sets may consist of as many state-specific icon files as needed.
Each set must meet the following criteria:

- A default icon is mandatory.
    The default icon filename is the name of the icon without a state (e.g. `switch.svg`)

- Icon filenames must follow the naming restrictions given for [icons](#icons) above

- The state name must reflect the Item's raw state.
    [Transformations](#state-transformation) applied in the state presentation definition of the Item have no influence on icon selection.

- The state portion of the icon name must be in lowercase letters

**Example:**

The user defines the "Livingroom_Light" and "Livingroom_Light_Connection" Items:

```java
Switch Livingroom_Light "Livingroom Ceiling Light" <myswitch>
String Livingroom_Light_Connection "Livingroom Ceiling Light [MAP(error.map):%s]" <myerror>
```

On the filesystem, the following icon files are provided by the user:

| File name          | Description                                                      |
| ------------------ | ---------------------------------------------------------------- |
| `myswitch-off.svg` | Matches `OFF` or "off" state                                     |
| `myswitch-on.svg`  | Matches `ON` or "on" state                                       |
| `myswitch.svg`     | Default icon, used when no matching icon is found (e.g. `UNDEF`) |

| File name              | Description                                                        |
| ---------------------- | ------------------------------------------------------------------ |
| `myerror-no_fault.svg` | Matches `NO_FAULT` state                                           |
| `myerror.svg`          | Default icon, used when Item in other state (e.g. `CONNECT_ERROR`) |

Take note, that the Transformation used in the `Livingroom_Light_Connection` Item doesn't effect the needed state specific icons - the icon selection considers "myerror", not the contents of the `error.map` file.

**Number State Matching Rule:**
For Number Items the equal or next lowest state icon that can be found will be used.
The default icon will be used for negative numbers, or above 100 i.e. the available filename range is icon-0 to icon-99 only.
Dimmer type Items work in the same way, being limited to 0-100 anyway.

For a dimmable light (0-100%), you might provide icons as in the example:
| File name         | Description                                          |
| ----------------- | ---------------------------------------------------- |
| `mydimmer.svg`    | Default icon (used in undefined states)              |
| `mydimmer-0.svg`  | Matches the turned off light (0%)                    |
| `mydimmer-1.svg`  | Matches any dimmed light between 1% up to 74%        |
| `mydimmer-75.svg` | Matches the bright light state from 75% to full 100% |

Just as with regular icons, user-defined dynamic icon sets may be configured via the custom icons folder `$OPENHAB_CONF/icons/classic/`.

### Groups

The Group is a special Item type that can be used to define a category or collection into which you can combine other Items or Groups.
An Item may be put into one or more groups, and groups may be nested inside other groups.
The general syntax for Group Items is as follows:

```java
Group groupname ["labeltext"] [<iconname>] [(group1, group2, ...)]
```

The Group item is commonly used to define hierarchies of Items from different perspectives.
For example:

- Location-oriented or physical perspective:
  - Floors in your house → Rooms on that floor → An appliance in that room...

- Functional or logical perspective:
  - Maintenance Group → All battery states → Individual battery states in percentage
  - Further examples: all lights, all room temperatures, combined power consumption

These relationships can be exploited in [Sitemaps]({{base}}/ui/sitemaps.html) or in [automation rules]({{base}}/configuration/rules-dsl.html) to navigate through the hierarchically organized Items or to perform computations and updates on subsets of similar Items.

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
Number:Temperature Livingroom_Temperature "Temperature [%.1f °C]" (Livingroom, Temperatures)
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

### Derive Group State from Member Items

As you are now aware, an Item can have a state (e.g. "ON", "OFF").
A Group Item can also have a state.
The Group's state is determined by the state of all its Items, and the aggregation function specified in the group definition.

The general syntax for groups with a specific item type and aggregation function is:

```java
Group[:itemtype[:function]] groupname ["labeltext"] [<iconname>] [(group1, group2, ...)]
```

- If the aggregation function is omitted, the function `EQUALITY` will be used.
- If the aggregation function and `itemtype` are omitted, no group state will be aggregated from member Items.

Group state aggregation functions can be any of the following:

|     | Function                   | Parameters                    | Base Item                                   | Description                                                                                                                                                                                                           |     |
| --- | -------------------------- | ----------------------------- | ------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --- |
|     | `EQUALITY`                 | -                             | \<all\>                                     | Default if no function is specified. Sets the state of the members if all have equal state. Otherwise `UNDEF` is set. In the Item DSL `EQUALITY` is the default and may be omitted.                                   |     |
|     | `AND`, `OR`, `NAND`, `NOR` | <activeState>, <passiveState> | \<all\> (must match active & passive state) | [Boolean](https://en.wikipedia.org/wiki/Boolean_algebra) operation. Sets the \<activeState\>, if the members state \<activeState\> evaluates to `true` under the boolean term. Otherwise the \<passiveState\> is set. |     |
|     | `SUM`, `AVG`, `MIN`, `MAX` | -                             | Number                                      | [Arithmetic](https://en.wikipedia.org/wiki/Arithmetic) operation. Sets the state according to the arithmetic function over all members states.                                                                        |     |
|     | `COUNT`                    | <regular expression>          | Number                                      | Sets the state to the number of members matching the given regular expression with their states.                                                                                                                      |     |
|     | `LATEST`, `EARLIEST`       | -                             | DateTime                                    | Sets the state to the latest/earliest date from all members states                                                                                                                                                    |     |

Boolean group state functions additionally return a number representing the count of member Items of value 'value1' (see example below).

Because the group state is an aggregation of multiple Item states, not every Item state change results in a change of the group state.

Note that aggregation functions can only be used on compatible Item types.
Incompatible Item types within a Group may result in the invalid aggregation result `UNDEF`.

**Examples:**

Examples for derived states on Group Items when declared in the Item DSL:

```java
Group:Number                  Lights       "Active Lights [%d]"              // e.g. "2"
Group:Switch:OR(ON,OFF)       Lights       "Active Lights [%d]"              // e.g. ON and "2"
Group:Switch:AND(ON,OFF)      Lights       "Active Lights [%d]"              // e.g. ON and "2"
Group:Number:Temperature:AVG  Temperatures "All Room Temperatures [%.1f °C]" // e.g. "21.3 °C"
Group:DateTime:EARLIEST       LatestUpdate "Latest Update [%1$tY.%1$tm.%1$tY %1$tH:%1$tM:%1$tS]"
Group:DateTime:LATEST         LastSeen     "Last Seen [%1$tY.%1$tm.%1$tY %1$tH:%1$tM:%1$tS]"
Group:Number:COUNT("OFFLINE") OfflineDevices "Offline Devices [%d]"     // e.g. "2"
```

The first three examples above compute the number of active lights and store them as group state.
However, the second group is of type switch and has an aggregation function of `OR`.
This means that the state of the group will be `ON` as soon as any of the member lights are turned on.
The third uses `AND` and sets the Group state to `ON` if all of its members have the state `ON`, `OFF` if any of the Group members has a different state than `ON`.

Groups do not only aggregate information from individual member Items, they can also accept commands.
Sending a command to a Group causes the command to be sent to all Group members.
An example of this is shown by the second group above; sending a single `ON` or `OFF` command to that group turns all lights in the group on or off.

The fourth example computes the average temperature of all room temperature Items in the group.

Assuming we have a Group containing three timestamps: `now().minusDays(10)`, `now()` and `now().plusSeconds(30)`.
The `EARLIEST` function returns `now().minusDays(10)`, the `LATEST` function returns `now().plusSeconds(30)`.

The last Group counts all members of it matching the given regular expression, here any character or state (simply counts all members).

### Tags

Tags added to an Item definition allow a user to characterize the specific nature of the Item beyond its basic Item type.
Tags can then be used by add-ons to interact with Items in context-sensitive ways.
Tags are used by the [Semantic Model]({{base}}/tutorial/model.html).
The `"Light"` example below maps the item to the Semantic Model.

Example:
A Light in a typical home setup can be represented by a Switch, a Dimmer or a Color Item.
To be able to interact with the light device via a natural voice command, for example, the fact that the Item is a light can be established by adding the "Light" tag as shown below.

```java
Switch Livingroom_Light "Livingroom Ceiling Light" ["Light"]
```

The easiest way to determine if tags have been implemented in a specific add-on is to see if the add-on documentation explicitly discusses their usage.

See the [Hue Emulation Service](/addons/integrations/hueemulation/) or [HomeKit Add-on](/addons/integrations/homekit/) documentation for more details.

### Binding Configuration

One of the greatest strengths of an openHAB automation system is the sheer number of devices you can interact with.
See "[currently available Bindings](/addons/#binding)" for a list of available Bindings.
This capability of interacting with real-world things is enabled through the association of Bindings with Items.

Once an Item is associated with a Binding, the state of one aspect of a device is reflected in openHAB (e.g., you can see if a light is on or off in one of the user interfaces).
Additionally, you have the opportunity to interact with a device through its Items, if interaction is supported for that aspect of the device (e.g., you can command the light to turn ON or turn OFF).

The Binding of an Item is given in the last part of the Item definition between curly brackets e.g. `{channel="..."}` in the example below:

```java
Number:Temperature Livingroom_Temperature "Temperature [%.1f °C]" {channel="..."}
```

openHAB introduces the concept of [Things and Channels]({{base}}/concepts/things.html).
Each Thing has one or more Channels, and Items are linked to one or more Channels.
There are two different kinds of channels:

- State Channels will, as soon as linked to the Item, update the state of it and/or listen for Commands you send to it.
    For example, if you have a `Player` Item, a State Channel could be responsible for propagating the state of an audio player (`PLAYING`, `PAUSED`) to your Item as well as listening for proper Commands (`PLAY`, `PAUSE`, `PREVIOUS`, `NEXT`)
- Trigger Channels will only send events that won't have any effect on the Item unless you treat them with Rules or use a Trigger Profile to do state changes or commands based on your event.
    For example, when you use a Binding that integrates buttons or wall switches, a Trigger Channel could be responsible for sending a `PRESSED` event when someone is pressing the button of the device.
    This event on its own won't change anything on the Item, but you could use, for example, the Trigger Profile "rawbutton-toggle-switch" to toggle a lamp on or off when the button is clicked.
    Also, you could e.g. define a Rule that is triggered by this event and calculates the color of the lamp based on the sun position.

Some Bindings support automatic discovery of Things, in which case discovered Things will appear in the Inbox in the UI.
Once accepted, the new Thing will appear under Settings > Things.

Other Bindings support defining Things in a `.things` file located in the `$OPENHAB_CONFIG/things/` folder.

See the [Bindings](/addons/#binding) configuration section for more information on how to discover or manually define Things for a given Binding.

#### UI Linking

As described above, you can link an Item with a Channel using the UI.
The easiest way to do so, is navigating to the thing and the wanted channel of it.
Expand the view of the needed channel and press `Add Link to item...`.
The then opened view will ask you for an existing item or give you the offer to add a new one.

#### Text File Linking

You may also link an Item with a Channel using the `.items` file located in the `$OPENHAB_CONFIG/items/` folder.
Information about available Channels and options can be found in the Binding readme or discovered via UI.

In UI select a Thing to learn about Channels it supports.

Linking an Item to a Channel is of the form `{channel="channel id"}`.

Examples:

```java
Switch  Phone_Mobile       "My Mobile Phone"               {channel="network:device:devicename:online"}
Number  Netatmo_Indoor_CO2 "CO2"                           {channel="netatmo:NAMain:home:inside:Co2"}
Number  Azimuth            "Azimuth"                       {channel="astro:sun:home:position#azimuth"}
Contact Garage             "Garage is [MAP(en.map):%s]"    {channel="zwave:21:command=sensor_binary,respond_to_basic=true"}
```

#### Multi Binding / Channel Linkage

An Item may be linked to multiple Bindings and/or Channels.
Commands and Updates from and to these Items will be combined, and can be used in interesting ways.

Example:

```java
Switch Office_PC {
  channel="lgwebos:WebOSTV:01dd3ac4-62f4-7505-208b-12345679",
  channel="network:servicedevice:6d5de4e65d"
}
```

The first example shows a symbiosis of the LG webOS Binding and the Wake-on-LAN Binding to interact with a TV.

#### Parameters

While the `channel` parameter is used to link an item to a channel of a thing, it is possible to add further parameters for additional features.
Parameters are provided as a comma separated list.
The order of the parameters does not matter.

##### Parameter `autoupdate`

When left as default, openHAB's `autoupdate` function attempts to predict the outcome of a _command_ on the Item _state_.
This prediction may be influenced by any linked channels.
`autoupdate="false"` is a special instruction which keeps the current state of the Item, even if a _command_ has been received.
This way, the Item is unchanged unless you explicitly post an _update_ to the Item, or a binding updates it.
`autoupdate="true"` forces `autoupdate` to act, overriding any binding recommendations.

Example:

```java
Switch Garage_Gate {channel="xxx", autoupdate="false"}
```

##### Parameter `expire`

This parameter allows to post an update or command to an item after a period of time has passed.

The expiration timer is started or restarted every time an item receives an update or a command _other than_ the specified "expire" update/command.
Any future expiring update or command is cancelled, if the item receives an update or command that matches the "expire" update/command.

The parameter accepts a duration of time that can be a combination of hours, minutes and seconds in the format

```shell
expire="1h 30m 45s"
expire="1h05s"
expire="55h 59m 12s"
```

Every part is optional, but all parts present must be in the given order (hours, minutes, seconds).
Whitespaces are allowed between the sections.

This duration can optionally be followed by a comma and the state or command to post, when the timer expires.
If this optional section is not present, it defaults to the Undefined (`UnDefType.UNDEF`) state.

```shell
Player MyPlayer   { expire="1h,command=STOP" }                // send STOP command after one hour
Number MyChannel  { channel="xxx", expire="5m,state=0" }      // update state to 0 after five minutes
String MyMessage  { channel="xxx", expire="3m12s,Hello" }     // update state to Hello after three minutes and 12 seconds
Switch MySwitch   { channel="xxx", expire="2h" }              // update state to Undefined two hours after last value
```

Note that the `state=` part is optional.

In the special case of a String item, it is possible to define a state/command as the string "UNDEF" or "NULL" by putting it into single quotes (e.g. "1m,state='UNDEF'").
Without the quotes, the state would be the system type `UNDEF`.

#### Profiles

With Profiles, you are able to change the behavior how Channels interact with your Items.
You can use _State Profiles_ on State Channels and _Trigger Profiles_ on Trigger Channels.

Profiles can be specified as a parameter for a given Channel on the Item configuration:

```java
<item-type> MyItem { channel="<bindingID>:<thing-typeID>:MyThing:myChannel"[profile="system:<profileID>", <profile-parameterID>="MyValue", ...]}
```

There are some built-in Profiles available which are described in the table below.

Some Bindings may offer additional Profiles for Binding-specific use cases.
If this is the case, you will find those within the documentation of the Binding.

| Profile ID                                                                                    | Type    | Supported Item Types  | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
|-----------------------------------------------------------------------------------------------|---------|-----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `default`                                                                                     | State   | All                   | If you don't specify any Profile, this Profile will be used. For State Channels, this means that states and commands are just propagated from the Channel to the Item and vice versa without any changes. For Trigger Channels, the Default Profile won't change anything on the Item.                                                                                                                                                                                                                                                                   |
| `follow`                                                                                      | State   | All                   | If one device should "follow" the actions of another device, this can be used. The term "follow" in this case means that any state that is sent to an Item will be forwarded from this Item to any linked Channel with the `follow` Profile. It takes state updates on an Item and sends them as a command onto the Channel. In the direction from the ThingHandler towards the Item, this Profile ignores state updates.                                                                                                                                |
| `hysteresis`                                                                                  | State   | Switch                | The `hysteresis` Profile can be configured via three parameters: `lower` (**mandatory**) `QuantityType` or `DecimalType`, `upper` (optional) `QuantityType` or `DecimalType`, `inverted` (optional) `boolean`.  This Profile can be used to trigger alarms when number values exceed a given `lower` bound - sends `ON` to the Switch Item. By defining an additional `upper` bound it can provide kind of anti-flapping. The `inverted` parameter negates the resulting State of the Switch.                                                            |
| `offset`                                                                                      | State   | Number                | An offset can be specified via the parameter `offset` which has to be a `QuantityType` or `DecimalType`. The specified offset will be applied to the value from the device before it arrives at the Item.                                                                                                                                                                                                                                                                                                                                                |
| `range`                                                                                       | State   | Switch                | The `range` Profile can be used to trigger alarms when number values exceed given limits (`lower` and `upper` bounds). It sends ON to a Switch Item. There are three parameters: `lower` and `upper` (**mandatory**) `QuantityType` or `DecimalType` and `inverted` (optional) `boolean`.                                                                                                                                                                                                                                                                |
| `timestamp-change`                                                                            | State   | DateTime              | This Profile will update a DateTime Item to track every change of the state of a given Channel.                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| `timestamp-offset`                                                                            | State   | DateTime              | This Profile can be specified via the parameter `offset` (in seconds) which has to be a `DecimalType`. The specified offset will be applied to the date time before it is passed to the Item. Additionally it allows to modify the timezone by setting the parameter of the same name (e.g. "Europe / Berlin").                                                                                                                                                                                                                                          |
| `timestamp-update`                                                                            | State   | DateTime              | This Profile will update a DateTime Item to track every update of the state of a given Channel, whatever the state is.                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| `rawbutton-on-off-switch`                                                                     | Trigger | Color, Dimmer, Switch | This Profile can only be used on Channels of the type `system.rawbutton`. On those Channels, it will set the Item state to `ON` when a `PRESSED` event arrives and to `OFF` when a `RELEASED` event arrives.                                                                                                                                                                                                                                                                                                                                             |
| `rawbutton-toggle-player`                                                                     | Trigger | Player                | This Profile can only be used on Channels of the type `system.rawbutton`. On those Channels, it will toggle the Player Item state between `PLAY` and `PAUSE` when `PRESSED` events arrive.                                                                                                                                                                                                                                                                                                                                                               |
| `rawbutton-toggle-rollershutter`                                                              | Trigger | Rollershutter         | This Profile can only be used on Channels of the type `system.rawbutton`. On those Channels, it will toggle the Rollershutter Item state between `UP` and `DOWN` when `PRESSED` events arrive.                                                                                                                                                                                                                                                                                                                                                           |
| `rawbutton-toggle-switch`                                                                     | Trigger | Color, Dimmer, Switch | This Profile can only be used on Channels of the type `system.rawbutton`. On those Channels, it will toggle the Item state when `PRESSED` events arrive. This Profile can e.g. be used to add button channels to a lighting item which will enable you to turn the lighting on and off with your button.                                                                                                                                                                                                                                                 |
| `rawrocker-to-on-off`                                                                         | Trigger | Dimmer, Switch        | This Profile can only be used on Channels of the type `system.rawrocker`. On those Channels, it will convert a press on the first rocker button to an `ON` command while the second one will be converted to an `OFF` command.                                                                                                                                                                                                                                                                                                                           |
| `rawrocker-to-dimmer`                                                                         | Trigger | Dimmer                | Same as `rawrocker-to-on-off`, but additionally it allows to dim by holding the respective button. Technically, this Profile sends an `INCREASE` or `DECREASE` Command every 500 milliseconds while you hold.                                                                                                                                                                                                                                                                                                                                            |
| `rawrocker-to-play-pause`, `rawrocker-to-next-previous` and `rawrocker-to-rewind-fastforward` | Trigger | Player                | These Profiles can only be used on Channels of the type `system.rawrocker` and Player Items. They will convert a press on the first rocker button to an `PLAY` / `NEXT` / `FASTFORWARD` command while the second one will be converted to an `PAUSE` / `PREVIOUS` / `REWIND` command.                                                                                                                                                                                                                                                                    |
| `rawrocker-to-stop-move` and `rawrocker-to-up-down`                                           | Trigger | Rollershutter         | These Profiles can only be used on Channels of the type `system.rawrocker` and Rollershutter Items. They will convert a press on the first rocker button to an `MOVE` / `UP` command while the second one will be converted to an `STOP` / `DOWN` command.                                                                                                                                                                                                                                                                                               |
| `timestamp-trigger`                                                                           | Trigger | DateTime              | This Profile can be used to link a trigger Channel to a DateTime Item and will update it every time the Channel triggers an event, whatever the event is.                                                                                                                                                                                                                                                                                                                                                                                                |
| `trigger-event-string`                                                                        | Trigger | String                | This Profile can be used to link a trigger channel to a String item. The item's state will be updated to the string representation of the triggering event (e.g. `PRESSED`).                                                                                                                                                                                                                                                                                                                                                                             |
| `transform:<SERVICE>`                                                                         | State   | All                   | Transformation Profiles can be used to transform the item state using the specified transformation service at channel-link level instead of only transforming the visual representation. You can find the documentation of these profiles within the [transformations docs](/docs/configuration/transformations.html) for script transformations or in the [add-on docs](/addons/#transform) for transformation add-ons, e.g. [Map](/addons/transformations/map/#usage-as-a-profile) or [JsonPath](/addons/transformations/jsonpath/#usage-as-a-profile) |

##### Implicit Profiles

If an Item does not have an explicitly defined Profile the framework actually uses an implicit profile 'behind the scenes'.
The implicit profile type depends on the Channel kind and type, and the respective Item type or Command type, as shown below.

| Channel Kind | Channel Type        | Item / Command Type | Implicit Profile                 |
|--------------|---------------------|---------------------| ---------------------------------|
| State        | any                 | any                 | `default`                        |
| Trigger      | any                 | String              | `trigger-event-string`           |
| Trigger      | `system.rawbutton`  | Player              | `rawbutton-toggle-player`        |
| Trigger      | `system.rawbutton`  | Rollershutter       | `rawbutton-toggle-rollershutter` |
| Trigger      | `system.rawbutton`  | Switch              | `rawbutton-toggle-switch`        |
| Trigger      | `system.rawrocker`  | Dimmer              | `rawrocker-dimmer`               |
| Trigger      | `system.rawrocker`  | PlayPause           | `rawrocker-play-pause`           |
| Trigger      | `system.rawrocker`  | UpDown              | `rawrocker-up-down`              |
| Trigger      | `system.rawrocker`  | OnOff               | `rawrocker-on-off`               |

##### Basic Example

You have an Item called `Bedroom_Light` that is connected to a Hue lamp

```java
Color Bedroom_Light { channel="hue:0210:1:bulb1:color" }
```

and a [Rule]({{base}}/configuration/rules-dsl.html) to toggle this light with a serial button:

```java
when
    Channel "serialbutton:button:mybutton:button" triggered PRESSED
then
    if (Bedroom_Light.getStateAs(OnOffType) != ON)
        Bedroom_Light.sendCommand(ON)
    else
        Bedroom_Light.sendCommand(OFF)
end
```

Instead of using this Rule, you can also use the `rawbutton-toggle-switch` Profile in combination with [Multi-Channel Linking](#multi-binding--channel-linkage):

```java
Color Bedroom_Light {
  channel="hue:0210:1:bulb1:color",
  channel="serialbutton:button:mybutton:button" [profile="system:rawbutton-toggle-switch"]
}
DateTime Bedroom_Light_Updated { channel="hue:0210:1:bulb1:color" [profile="system:timestamp-update"] }
DateTime Bedroom_Light_Changed { channel="hue:0210:1:bulb1:color" [profile="system:timestamp-change"] }
```

This will make your Rule obsolete.
So with Profiles, you can significantly reduce the amount of Rules you need for your Smart Home which helps you to keep your configuration short and clear.

##### Advanced Examples

```java
/** Hysteresis Profile **/
Number:Temperature Outdoor_Temperature { channel="openweathermap:weather-and-forecast:api:local:current#temperature" }
// Triggers a temperature high alarm (Switch = ON) as of 30 °c and stays ON until temperature drops below 29 °C
Switch Outdoor_Temperature_High_Alert { channel="openweathermap:weather-and-forecast:api:local:current#temperature" [profile="system:hysteresis", lower="29 °C", upper="30 °C"] }
// Temperature low alert below 0 °C
Switch Outdoor_Temperature_Low_Alert { channel="openweathermap:weather-and-forecast:api:local:current#temperature" [profile="system:hysteresis", lower="0 °C", inverted="true"] }

/** Battery Level Profile **/
Number Battery_Level { channel="serialbutton:button:mybutton:battery-level" }
// Indicates a battery low alarm if battery level drops below 15
Switch Low_Battery { channel="serialbutton:button:mybutton:battery-level" [profile="system:hysteresis", lower=15, inverted="true"] }

/** Range Profile **/
Number:Dimensionless Outdoor_Humidity { channel="openweathermap:weather-and-forecast:api:local:current#humidity" }
// Triggers a humidity low / high alarm (Switch = ON) if humidity drops below 40 % or exceeds 60 %
Switch Outdoor_Humidity_Alert { channel="openweathermap:weather-and-forecast:api:local:current#humidity" [profile="system:range", lower="40 %", upper="60 %", inverted="true"] }

/** Timestamp Offset **/
// 30 min before sunrise
DateTime Sunrise { channel="astro:sun:home:rise#start" [profile="system:timestamp-offset", offset=-1800] }
```
