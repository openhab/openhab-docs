---
layout: documentation
title: Actions
---

# Actions

Actions are predefined methods that are called from openHAB rules and scripts.
They are automatically imported and can be used to execute openHAB-specific operations or to send commands or data to external hardware or services. There are a set of built in core Actions and optional installable Actions.

The page is structured as follows:

[[toc]]

## Core Actions

The following Actions are a core part of openHAB and do not need to be separately installed.

### Event Bus Actions

- `sendCommand(String itemName, String commandString)`: Sends the given command to the specified Item to the event bus.
- `postUpdate(String itemName, String commandString)`: Sends the given status update to the specified Item to the event bus.

When the result of the commandString is to cause some action (e.g. turn on a light, change a thermostat to a new temperature, etc.) then use sendCommand. When interacting with widgets on the user interfaces commands are sent to the Items.

When the result of the commandString is to change the state of an Item without causing some action (i.e. to make the state of an Item match the state of a device without commanding the device to change) then use postUpdate.

As a general rule, is better to call `MyItem.sendCommand(command)` and `MyItem.postUpdate(command)` where possible because the Item methods are able to handle a wider variety of commands appropriately. The Actions are best reserved for use in cases where the Item's name is determined at runtime.

- `Map<Item, State> storeStates(Item item1, Item item2, ... Item item<n>)`: Returns a `Map<Item, State>` with the current state of each Item. All members of Groups are put into the Map but not the Group's state itself.
- `restoreStates(Map<Item, State> statesMap)`: Restores the items' states from the map. If the saved state can be interpreted as a command (ON/OFF/etc.), a command is sent to the Item. Otherwise an update is sent to the Item.

### Audio & Voice Actions

The framework supports several multimedia actions.
They can be found in the article about [openHAB multimedia]({{base}}/configuration/multimedia.html).

### Logging Actions

- `logDebug(String loggername, String logText)`: Logs logText on level DEBUG to openhab.log
- `logInfo(String loggername, String logText)`: Logs logText on level INFO to openhab.log
- `logWarn(String loggername, String logText)`: Logs logText on level WARN to openhab.log
- `logError(String loggername, String logText)`: Logs logText on level ERROR to openhab.log

`logText` can be a compete String, constructed through concatenation, or through arguments.

- **Complete String Example:** `logInfo("Garage", "This is a complete String")`
- **Concatenation Example:** `logDebug("Lighting", "This is a string concatenation:" + Light.name)`
- **Arguments Example:** `logWarn("Alarm", "The {} window has been open for {} hours!", Window.name, timeOpen)`

One can configure whether specific log entries are logged out and where they get logged to (e.g. to a separate file) by [editing the logger configuration]({{base}}/administration/logging.html).

### Exec Actions

You have different options to execute a command through an action.

- `executeCommandLine(String commandLine)`: Executes a command on the command line without waiting for the command to complete.
  For example you could run `executeCommandLine("path/to/my/script.sh")` which then would be executed and the rule would continue processing.

- `executeCommandLine(Duration.ofSeconds(timeout), String commandLine)`: Executes a command on the command and waits `timeout` seconds for the command to complete, returning the output from the command as a String.
  For example you could run `var ScriptResponse = executeCommandLine(Duration.ofSeconds(60), "path/to/my/script.sh");` would get executed and wait 1 minute for the output to be responded back and write it into the `ScriptResponse` variable.

Other Durations than `ofSeconds` units are possible too.
Check out the [Java Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html?is-external=true) for possible units.

#### Scripts with parameters

Let's assume that your `path/to/my/script.sh`-Script needs two item states to process them with some calculation.
In console you would call it like

```text
path/to/my/script.sh itemState1 itemState2
```

To solve this constellation within a rule you have to add one argument per script parameter to the function.
The script above would be configured like shown below.

```text
// When you are not interested in the script output
executeCommandLine("path/to/my/script.sh", itemState1, itemState2);

// When you need the output in your further rule processing
var ScriptResponse = executeCommandLine(Duration.ofSeconds(60), "path/to/my/script.sh", itemState1, itemState2);

// Space separated constants must be given as separate parameters as well
// e.g. path/to/your/script.sh xyz fred.file
var ScriptResponse = executeCommandLine(Duration.ofSeconds(60), "path/to/your/script.sh", "xyz", "fred.file");
```

### HTTP Actions

- `sendHttpGetRequest(String url)`: Sends a GET-HTTP request and returns the result as a String
- `sendHttpGetRequest(String url, Map<String, String> headers, int timeout)`: Sends a GET-HTTP request with the given request headers, and timeout in ms, and returns the result as a String
- `sendHttpPutRequest(String url)`: Sends a PUT-HTTP request and returns the result as a String
- `sendHttpPutRequest(String url, String contentType, String content)`: Sends a PUT-HTTP request with the given content and returns the result as a String
- `sendHttpPutRequest(String url, String contentType, String content, Map<String, String> headers, int timeout)`: Sends a PUT-HTTP request with the given content, request headers, and timeout in ms, and returns the result as a String
- `sendHttpPostRequest(String url)`: Sends a POST-HTTP request and returns the result as a String
- `sendHttpPostRequest(String url, String contentType, String content)`: Sends a POST-HTTP request with the given content and returns the result as a String
- `sendHttpPostRequest(String url, String contentType, String content, Map<String, String> headers, int timeout)`: Sends a POST-HTTP request with the given content, request headers, and timeout in ms, and returns the result as a String
- `sendHttpDeleteRequest(String url)`: Sends a DELETE-HTTP request and returns the result as a String
- `sendHttpDeleteRequest(String url, Map<String, String> headers, int timeout)`: Sends a DELETE-HTTP request with the given request headers, and timeout in ms, and returns the result as a String
- `setImage(String itemName, String url)`: Downloads an image from a URL and updates the Image item's state with it. Returns `true` if successful, `false` otherwise
- `setImage(String itemName, String url, int timeout)`: Downloads an image from a URL with a specified timeout in milliseconds and updates the Image item's state with it. Returns `true` if successful, `false` otherwise
- `setImage(String itemName, String url, long maxContentLength, int timeout)`: Downloads an image from a URL with a specified maximum content length in bytes and timeout in milliseconds, and updates the Image item's state with it. Returns `true` if successful, `false` otherwise. Use negative values for `maxContentLength` to ignore size limits

::: tip Note
All HTTP Actions can have a last `timeout` parameter added in ms. eg. `sendHttpPostRequest(String url, String contentType, String content, int timeout)`
:::

For example:

```javascript
val headers = newHashMap("Cache-control" -> "no-cache")
val output = sendHttpGetRequest("https://example.com/?id=1", headers, 1000)
```

### Semantics

One can use Semantics features in Rules.
E.g. determine the location of an Item.
Regardless if it is a Point, an Equipment or a Location itself.
Therefore openHAB provides a bunch methods to be used in Rules.

#### Rules DSL

- `boolean isLocation(Item)` - checks if the given Item is a Location
- `boolean isEquipment(Item)` - checks if the given Item is an Equipment
- `boolean isPoint(Item)` - checks if the given Item is a Point
- `Item getLocation(Item)` - gets the Location Item of the Item, returns the related Location Item of the Item or `null`
- `Class<? extends Location> getLocationType(Item)` - gets the Location type of the Item, returns the related Location type of the Item or `null`
- `Item getEquipment(Item)` - gets the Equipment Item an Item belongs to, returns the related Equipment Item of the Item or `null`
- `Class<? extends Equipment> getEquipmentType(Item)` - gets the Equipment type an Item belongs to, returns the related Equipment type of the Item or `null`
- `Class<? extends Point> getPointType(Item)` - gets the Point type of an Item, returns the related Point type of the Item or `null`
- `Class<? extends Property> getPropertyType(Item)` - gets the Property type an Item relates to, returns the related Property type of the Item or `null`
- `Class<? extends Tag> getSemanticType(Item)` - gets the semantic type of an Item (i.e. a sub-type of Location, Equipment or Point)

#### Scripted Automation

One must import the Semantics Action and then call the above functions using `Semantics.<function>`, for example `Semantics.getLocation(Item)`.

### Timers

`createTimer(AbstractInstant instant, Procedure procedure)`: schedules a block of code to execute at a future time

- `instant` is usually a `DateTime` calculated using the built in variable `now`.
- `procedure` is the block of code and is defined using lambda notation (i.e. square brackets)

For example:

```php
var Timer myTimer = null

rule "timer example"
when
    Item YourItem changed
then
    if (YourItem.state == ON) {
        if (myTimer !== null) {
            logInfo("rules", "Timer rescheduled")
            myTimer.reschedule(now.plusMinutes(5))
        } else {
            myTimer = createTimer(now.plusMinutes(5)) [
                logInfo("rules", "Timer activated")
                //Do something...
            ]
            logInfo("rules", "Timer created")
        }
    } else {
        logInfo("rules", "Timer canceled")
        myTimer?.cancel
        myTimer = null
    }
end
```

The Timer object supports the following methods:

- `cancel`: prevents the scheduled timer from executing. Most of the time `cancel` is used used in conjunction with setting the timer handler to `null` as a convenient indicator that some previously defined timer is now finished with. However setting the handler to `null` does not interact with the timer itself.
- `isActive`: returns `true` if the timer will be executed as scheduled, i.e. it has not been cancelled or completed.
- `isCancelled`: returns `true` if the timer has been cancelled _before_ it completed.
- `isRunning`: returns `true` if the code is currently executing (i.e. the timer activated the code but it is not done running).
- `hasTerminated`: returns `true` if the timer has been cancelled or the code has run and completed.
- `reschedule(AbstractInstant instant)`: reschedules the timer to execute at the new time. If the Timer has terminated this method does nothing.

### Thing Status Action

`getThingStatusInfo(String thingUID)`: Gets status information of the given thing identified by `thingUID`.

The result is of type `ThingStatusInfo`.
It contains [Thing Status]({{base}}/concepts/things.html), [Status Details]({{base}}/concepts/things.html) and [Status Description]({{base}}/concepts/things.html).
Refer to [Thing Status API]({{base}}/concepts/things.html) for how to get those information.
If you just want to know the status, you can use `thingStatusInfo.getStatus().toString()` and the result will be one of the values in [Thing Status]({{base}}/concepts/things.html).

> If the thing is removed or it's not added yet, it'll return null.

For example:

```java
var thingStatusInfo = getThingStatusInfo("zwave:device:c5155aa4:node2")

if ((thingStatusInfo !== null) && (thingStatusInfo.getStatus().toString() == "ONLINE")) {
    logInfo("ThingStatus", "The thing is online.")
} else {
    logError("ThingStatus", "The thing is offline or doesn't exist.")
}
```

### Color utilities

- `int[] hsbToRgb(HSBType hsb)`: transforms HSB to RGB returning an array of three int with the RGB values in the range 0 to 255
- `int[] hsbToRgbw(HSBType hsb)`: transforms HSB to RGBW returning an array of four int with the RGB and W values in the range 0 to 255
- `PercentType[] hsbToRgbPercent(HSBType hsb)`: transforms HSB to RGB returning an array of three PercentType with the RGB values in the range 0 to 100 percent
- `PercentType[] hsbToRgbwPercent(HSBType hsb)`: transforms HSB to RGBW returning an array of four PercentType with the RGB and W values in the range 0 to 100 percent
- `int hsbTosRgb(HSBType hsb)`: transforms HSB to the RGB value of the color in the default sRGB color model (Bits 24-31 are alpha, 16-23 are red, 8-15 are green, 0-7 are blue)
- `double[] hsbToXY(HSBType hsb)`: transforms HSB to CIE 1931 "xy" format using default color Gamut, returning an array of three double with the closest matching CIE 1931 x,y,Y in the range 0.0000 to 1.0000
- `double[] hsbToXY(HSBType hsb, double[] gamutR, double[] gamutG, double[] gamutB)`: transforms HSB to CIE 1931 "xy" format using specific color Gamut, returning an array of three double with the closest matching CIE 1931 x,y,Y in the range 0.0000 to 1.0000
- `HSBType rgbToHsb(int[] rgb)`: transforms RGB (array of three or four int with the RGB(W) values in the range 0 to 255) to HSB
- `HSBType rgbToHsb(PercentType[] rgbw)`: transforms RGB(W) (array of three or four PercentType with the RGB(W) values in the range 0 to 100 percent) to HSB
- `HSBType xyToHsb(double[] xy)`: transforms CIE 1931 "xy" format (array of double with CIE 1931 x,y[,Y] in the range 0.0000 to 1.0000 with Y being optional) to HSB using default color Gamut
- `HSBType xyToHsb(double[] xy, double[] gamutR, double[] gamutG, double[] gamutB)`: transforms CIE 1931 "xy" format (array of double with CIE 1931 x,y[,Y] in the range 0.0000 to 1.0000 with Y being optional) to HSB using specific color Gamut

### openHAB Subsystem Actions

openHAB has several subsystems that can be accessed from Rules. These include persistence, see [Persistence Extensions in Scripts and Rules]({{base}}/configuration/persistence.html#persistence-extensions-in-scripts-and-rules), transformations, scripts.

- `callScript(String scriptName)`: Calls a script which must be located in the `$OPENHAB_CONF/scripts` folder. `callScript` returns the value of the last expression of the script.

Scripts are small pieces of Rules DSL code that can be called from Rules.
However, Scripts have limitations.
Scripts cannot accept arguments.
Scripts cannot return a value.
Any reference to a class that would normally need to be imported in a .rules file, the class needs to be referred to by its full package as imports are not supported.

- `transform(String type, String function, String value)`: Applies a transformation of a given type with some function to a value and returns the transformed value as a String or the original value if the transformation failed.

See [Transformations]({{base}}/configuration/transformations.html#usage) for available transformations and their usage.

## Cloud Notification Actions

Notification actions may be placed in Rules to send alerts to mobile devices registered with an [openHAB Cloud instance](https://github.com/openhab/openhab-cloud) such as [myopenHAB.org](https://www.myopenhab.org).

Please head over to [openHAB Cloud Connector: Cloud Notification Actions](/addons/integrations/openhabcloud/#cloud-notification-actions) to learn about the notification actions and check out the examples.

## Ephemeris

Ephemeris is a way to determine what type of day today or a number of days before or after today is.
For example, a way to determine if today is a weekend, a bank holiday, someone’s birthday, trash day, etc.
The default bank holidays and configuration syntax is defined by the [Jollyday library](https://github.com/focus-shift/jollyday).

### Actions Examples

#### Rules DSL

Action | Returns
-|-
`getBankHolidayName` | name of the holiday today, or `null` if today is not a bank holiday
`getBankHolidayName(<offset>)` | name of the holiday `<offset>` days from today, `null` if that day is not a bank holiday
`getBankHolidayName(<datetime>)` | name of the holiday on the day defined by the `ZonedDateTime` `<datetime>`, `null` if that day is not a bank holiday
`getBankHolidayName(<offset>, <file>)` | name of the day defined in `<file>` `<offest>` days from today, `null` if that day is not defined in `<file>`
`getBankHolidayName(<datetime>, <file>)` | name of the day defined in `<file>` for the day defined by the `ZonedDateTime` `<datetime>`, `null` if that day is not defined in `<file>`
`getDaysUntil(<holiday name>)` | number of days from today to the given `<holiday name>`
`getDaysUntil(<holiday name>, <file>)` | number of days from today to the given `<holiday name>` defined in `<file>`
`getDaysUntil(<datetime>, <holiday name>)` | number of days from the day defined by the `ZonedDateTime` `<datetime>` and `<holiday name>`
`getDaysUntil(<datetime>, <holiday name>, <file>)` | number of days from the day defined by the `ZonedDateTime` `<datetime>` and `<holiday name>` defined in `<file>`
`getHolidayDescription(<holiday name>)` | Jollyday defines a mapping between the holiday name and a description. This will return the description based on the holiday name returned by `getBankHolidayName`
`getNextBankHoliday` | name of the next bank holiday
`getNextBankHoliday(<file>)` | name of the next bank holiday defined in `<file>`
`getNextBankHoliday(<offset>)` | name of the next bank holiday after `<offset>` days from today
`getNextBankHoliday(<offset>, <file>)` | name of the next bank holiday after `<offset>` days from today defined in `<file>`. :warning: This action is broken in OH 2.5.x. Use `getNextBankHoliday(<datetime>, <file>)` instead by replacing `<datetime>` with `now.plusDays(<offset>)`
`getNextBankHoliday(<datetime>)` | name of the next bank holiday after the day defined by the `ZonedDateTime` `<datetime>`
`getNextBankHoliday(<datetime>, <file>)` | name of the next bank holiday after the day defined by the `ZonedDateTime` `<datetime>` defined in `<file>`
`isBankHoliday` | `true` if today is a bank holiday (see below), `false` otherwise
`isBankHoliday(<offset>)` | `true` if the day `<offset>` days from today is a bank holiday, `false` otherwise
`isBankHoliday(<datetime>)` | `true` if the day defined by the `ZonedDateTime` `<datetime>` is a bank holiday, `false` otherwise.
`isBankHoliday(<offset>, <file>)` | `true` if the day `<offset>` days from today is a day defined in `<file>`, use 0 for `<offset>` for today; returns `false` otherwise
`isBankHoliday(<datetime>, <file>)` | `true` if the day defined by the `ZonedDateTime` `<datetime>` is in `<file>`, `false` otherwise
`isInDayset("<set>")` | `true` if today is in the custom dayset `<set>` (see below), for example `isInDayset("school")`, `false` otherwise
`isInDayset("<set>", <offset>)` | `true` if the day `<offset>` days from today is in dayset `<set>`, `false` otherwise
`isInDayset("<set>", <datetime>)` | `true` if the day defined by the passed in `ZonedDateTime` `<datetime>` is in dayset `<set>`, `false` otherwise
`isWeekend` | `true` if today is a weekend, `false` otherwise
`isWeekend(<offset>)` | `true` if the day `<offset>` days from today is a weekend
`isWeekend(<datetime>)` | `true` if the day defined by the passed in `ZonedDateTime` `<datetime>` is a weekend, `false` otherwise

In all examples that take `<offset>`, use a negative value to check days in the past.

#### Scripted Automation

One must import the Ephemeris Action and then call the above functions using `Ephemeris.<function>`, for example `Ephemeris.getNextBankHoliday()`.

### Configuration

#### UI

In UI one has the ability to configure which days of the week are considered weekends and set your country, region, and city.
If no country is provided the service uses your system default locale settings.
Browse to Settings -> Ephemeris.
Setting the country, region and optionally city will cause Ephemeris to use the list of bank holidays defined for that location by [Jollyday](https://github.com/focus-shift/jollyday).
You can find the XML file for your country [here](https://github.com/focus-shift/jollyday/tree/main/jollyday-core/src/main/resources/holidays).
You can find the localized mapping files that map between the holiday name in the XML and your preferred language [here](https://github.com/focus-shift/jollyday/tree/main/jollyday-core/src/main/resources/descriptions).

When filling in the country, region and city in that order, if there isn’t a drop down list leave that field blank.
There are no special bank holidays defined by Jollyday for that level.

#### `ephemeris.cfg`

By default Ephemeris supports a weekend dayset and a school dayset.
You can define additional daysets or modify the school dayset.
If you need to define custom daysets, you must do all your configuration through the `ephemeris.cfg` file instead of using UI as described above so make sure to at least redefine the weekend dayset.
If there is no `dayset-weekend` defined, calls to `isWeekend` will generate errors.

Config file location: `$OH_CONF/services/ephemeris.cfg`.

Fields:

Field | Description
-|-
`country` | Country to use to get the built in list of bank holidays, uses the standard two letter country code.
`region` | Uses the appropriate two letter region code if applicable.
`dayset-<name>` | List of the days of that are in this custom dayset. The days are put into a list (i.e. surrounded by `[ ]` and separated by a comma) and the English names for the days of the week should be used, in all caps. See the example below.

If in doubt on what values to use, see the links above to find the XML file for your country, open the XML file, and find the `tns:SubConfigurations` for your region and use the “hierarchy” value for `region`.

For example:

```text
country=de
region=nw
dayset-workday=[MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY]
dayset-weekend=[SATURDAY,SUNDAY]
dayset-trash=[MONDAY]
```

#### Custom Bank Holidays

In addition to the ability to define custom daysets, one can define a custom list of holidays or other important days.
If you have opened the Jollyday XML file for your country already, you have seen an example of what your custom file should look like.
The following is an example listing a few custom days.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<tns:Configuration hierarchy="us" description="United States"
    xmlns:tns="https://www.example.org/Holiday" xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="https://www.example.org/Holiday /Holiday.xsd">
    <tns:Holidays>
        <tns:Fixed month="MARCH" day="20" descriptionPropertiesKey="Rich Birthday" />
        <tns:Fixed month="MARCH" day="27" descriptionPropertiesKey="Son's Birthday" />
        <tns:Fixed month="JUNE" day="12" descriptionPropertiesKey="Wife's Birthday" />
        <tns:Fixed month="DECEMBER" day="27" descriptionPropertiesKey="Anniversary" />
        <tns:FixedWeekday which="FIRST" weekday="TUESDAY" month="NOVEMBER" descriptionPropertiesKey="Election Day"/>
    </tns:Holidays>
</tns:Configuration>
```

For further examples and to find the list of elements to reference holidays that require more complicated calculations (e.g. holidays based on a lunar calendar, Easter, etc.) see the [XSD that defines the structures of the XML](https://github.com/focus-shift/jollyday/blob/main/jollyday-core/src/main/resources/focus_shift.de/jollyday/schema/holiday/holiday.xsd) or the XML file for your country or others.

You can place these XML files anywhere on your file system that openHAB has permission to read.
In the calls to the Actions, use the fully qualified path.
We recommend placing these custom files somewhere inside your `$OH_CONF` folder, such as `$OH_CONF/services`.

#### Localization

Ephemeris supports translation of holidays into many languages. Localization support files can be found in the [GitHub repo](https://github.com/focus-shift/jollyday/tree/main/jollyday-core/src/main/resources/descriptions).
Currently, these language supports are available:

1. [Dutch](https://github.com/focus-shift/jollyday/tree/main/jollyday-core/src/main/resources/descriptions/holiday_descriptions_nl.properties)
1. [English](https://github.com/focus-shift/jollyday/tree/main/jollyday-core/src/main/resources/descriptions/holiday_descriptions.properties)
1. [French](https://github.com/focus-shift/jollyday/tree/main/jollyday-core/src/main/resources/descriptions/holiday_descriptions_fr.properties)
1. [German](https://github.com/focus-shift/jollyday/tree/main/jollyday-core/src/main/resources/descriptions/holiday_descriptions_de.properties)
1. [Greek](https://github.com/focus-shift/jollyday/tree/main/jollyday-core/src/main/resources/descriptions/holiday_descriptions_el.properties)
1. [Portuguese](https://github.com/focus-shift/jollyday/tree/main/jollyday-core/src/main/resources/descriptions/holiday_descriptions_pt.properties)
1. [Swedish](https://github.com/focus-shift/jollyday/tree/main/jollyday-core/src/main/resources/descriptions/holiday_descriptions_sv.properties)

Feel free to extend this list by providing additional language support files.

To enable localization:

- Copy the file for your language to your OH setup.
  - A folder in `$OH_CONF` folder, such as `$OH_CONF/services` is proposed.
- Use the function `Ephemeris.getHolidayDescription` to convert the name according to your localization file.
