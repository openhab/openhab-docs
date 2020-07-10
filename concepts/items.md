---
layout: documentation
title: Items
---

{% include base.html %}

# Items

openHAB has a strict separation between the physical world (the "Things", see below) and the application, which is built around the notion of "Items" (also called the virtual layer).

Items represent functionality that is used by the application (mainly user interfaces or automation logic).
Items have a state and are used through events.
  
The following Item types are currently available (alphabetical order):

| Item Name          | Description                                                        | Command Types                              |
|--------------------|--------------------------------------------------------------------|--------------------------------------------|
| Color              | Color information (RGB)                                            | OnOff, IncreaseDecrease, Percent, HSB      |
| Contact            | Item storing status of e.g. door/window contacts                   | OpenClosed                                 |
| DateTime           | Stores date and time                                               | -                                          |
| Dimmer             | Item carrying a percentage value for dimmers                       | OnOff, IncreaseDecrease, Percent           |
| Group              | Item to nest other Items / collect them in Groups                  | -                                          |
| Image              | Holds the binary data of an image                                  | -                                          |
| Location           | Stores GPS coordinates                                             | Point                                      |
| Number             | Stores values in number format, takes an optional dimension suffix | Decimal                                    |
| Number:<dimension> | like Number, additional dimension information for unit support     | Quantity                                   |
| Player             | Allows to control players (e.g. audio players)                     | PlayPause, NextPrevious, RewindFastforward |
| Rollershutter      | Typically used for blinds                                          | UpDown, StopMove, Percent                  |
| String             | Stores texts                                                       | String                                     |
| Switch             | Typically used for lights (on/off)                                 | OnOff                                      |

## Group Items

Group Items collect other Items into Groups.
Group Items can themselves be members of other Group Items.
Cyclic membership is not forbidden but strongly not recommended.
User interfaces might display Group Items as single entries and provide navigation to its members.

Example for a Group Item as a simple collection of other Items:
```
    Group groundFloor
    Switch kitchenLight (groundFloor)
    Switch livingroomLight (groundFloor)
``` 

### Derive Group State from Member Items

Group Items can derive their own state from their member Items.
To derive a state the Group Item must be constructed using a base Item and a Group function.
When calculating the state, Group functions recursively traverse the Group's members and also take members of subgroups into account.
If a subgroup however defines a state on its own (having base Item & Group function set) traversal stops and the state of the subgroup member is taken.

For available Group functions and examples see [Configuration Guide](../configuration/items.html#group-type).

## State and Command Type Formatting

### StringType

`StringType` objects store a simple Java String.

### DateTimeType

`DateTimeType` objects are parsed using Java's `SimpleDateFormat.parse()` using the first matching pattern:

1. `yyyy-MM-dd'T'HH:mm:ss.SSSZ`
2. `yyyy-MM-dd'T'HH:mm:ss.SSSz`
3. `yyyy-MM-dd'T'HH:mm:ss.SSSX`
4. `yyyy-MM-dd'T'HH:mm:ssz`
5. `yyyy-MM-dd'T'HH:mm:ss`

| Literal | Standard           | Example                               |
|---------|--------------------|---------------------------------------|
| z       | General time zone  | Pacific Standard Time; PST; GMT-08:00 |
| Z       | RFC 822 time zone  | -0800                                 |
| X       | ISO 8601 time zone | -08; -0800; -08:00                    |

### DecimalType, PercentType

`DecimalType` and `PercentType` objects use Java's `BigDecimal` constructor for conversion.
`PercentType` values range from 0 to 100.

### QuantityType

A numerical type which carries a unit in addition to its value.
The framework is capable of automatic conversion between units depending on the user's locale settings.
See the concept on [Units of Measurement](units-of-measurement.html) for more details.

### HSBType

HSB string values consist of three comma-separated values for hue (0-360°), saturation (0-100%), and brightness (0-100%) respectively, e.g. `240,100,100` for "maximum" blue.

### PointType

`PointType` strings consist of three `DecimalType`s separated by commas, indicating latitude and longitude in degrees, and altitude in meters respectively.

### Enum Types

| Type                  | Supported Values        |
|-----------------------|-------------------------|
| IncreaseDecreaseType  | `INCREASE`, `DECREASE`  |
| NextPreviousType      | `NEXT`, `PREVIOUS`      |
| OnOffType             | `ON`, `OFF`             |
| OpenClosedType        | `OPEN`, `CLOSED`        |
| PlayPauseType         | `PLAY`, `PAUSE`         |
| RewindFastforwardType | `REWIND`, `FASTFORWARD` |
| StopMoveType          | `STOP`, `MOVE`          |
| UpDownType            | `UP`, `DOWN`            |

## A note on Items which accept multiple state data types

There are a number of Items which accept multiple state data types, for example `DimmerItem`, which accepts `OnOffType` and `PercentType`, `RollershutterItem`, which  accepts `PercentType` and `UpDownType`, or `ColorItem`, which accepts `HSBType`, `OnOffType` and `PercentType`.
Since an Item has a SINGLE state, these multiple data types can be considered different views to this state.
The data type carrying the most information about the state is usually used to keep the internal state for the Item, and other datatypes are converted from this main data type.
This main data type is normally the first element in the list returned by `Item.getAcceptedDataTypes()`.

Here is a short table demonstrating conversions for the examples above:

| Item Name     | Main Data Type | Additional Data Types Conversions                                                                                                                                             |
|---------------|----------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Color         | `HSBType`      | &bull; `OnOffType` - `OFF` if the brightness level in the `HSBType` equals 0, `ON` otherwise <br/> &bull; `PercentType` - the value for the brightness level in the `HSBType` |
| Dimmer        | `PercentType`  | `OnOffType` - `OFF` if the brightness level indicated by the percent type equals 0, `ON` otherwise                                                                            |
| Rollershutter | `PercentType`  | `UpDownType` - `UP` if the shutter level indicated by the percent type equals 0, `DOWN` if it equals 100, and `UnDefType.UNDEF` for any other value                           |

## Item Metadata

Sometimes additional information is required to be attached to Items for certain use-cases. 
This could be an application which needs some hints in order to render the Items in a generic way, or an integration with voice controlled assistants, or any other services which access the Items and need to understand their "meaning".

Such metadata can be attached to Items using disjunct namespaces so they won't conflict with each other. 
Each metadata entry has a main value and optionally additional key/value pairs. 
There can be metadata attached to an Item for as many namespaces as desired, like in the following example: 

    Switch MyFan "My Fan" { homekit="Fan.v2", alexa="Fan" [ type="oscillating", speedSteps=3 ] }

The metdata can be included with the channel linking, here an Alexa metadata mapping is added after the channel linking separated with a comma. An example for a ZWave switch is given below.
```
Switch LightSwitch "Light Switch" {channel="zwave:device:22c99d1e:node3:switch_binary", alexa="PowerController.powerState"}
``` 

The metadata can be maintained via a dedicated REST endpoint and is included in the `EnrichedItemDTO` responses.

Extensions which can infer some metadata automatically need to implement and register a `MetadataProvider` service in order to make them available to the system. 
They may provision them from any source they like and also dynamically remove or add data. 
They are also not restricted to a single namespace.

The `MetadataRegistry` provides access for all extensions which need to read the Item metadata programmatically. 
It is the central place where additional information about Items is kept.
