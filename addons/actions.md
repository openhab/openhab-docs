---
layout: documentation
title: Actions
---

{% include base.html %}

# Actions

Actions are predefined methods that are called from openHAB rules and scripts.
They are automatically imported and can be used to execute openHAB-specific operations or to send commands or data to external hardware or services. There are a set of built in core Actions and optional installable Actions.

The page is structured as follows:

{::options toc_levels="2..4"/}

- TOC
{:toc}

## Core Actions

The following Actions are a core part of openHAB and do not need to be separately installed.

### Event Bus Actions

- `sendCommand(String itemName, String commandString)`: Sends the given command to the specified Item to the event bus.
- `postUpdate(String itemName, String commandString)`: Sends the given status update to the specified Item to the event bus.

When the result of the commandString is to cause some action (e.g. turn on a light, change a thermostat to a new temperature, etc.) then use sendCommand. When interacting with widgets on the user interfaces commands are sent to the Items.

When the result of the commandString is to change the state of an Item without causing some action (i.e. to make the state of an Item match the state of a device without commanding the device to change) then use postUpdate.

As a general rule, is better to call `MyItem.sendCommand(command)` and `MyItem.postUpdate(command)` where possible because the Item methods are able to handle a wider variety of commands appropriately. The Actions are best reserved for use in cases where the Item's name is determined at runtime.

- `Map<Item, State> storeStates(Item item1, Item item2, ... Item itemn)`: Returns a `Map<Item, State>` with the current state of each Item. All members of Groups are put into the Map but not the Group's state itself.
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

- `executeCommandLine(String commandLine)`: Executes a command on the command line without waiting for the command to complete
- `executeCommandLine(String commandLine, int timeout)`: Executes a command on the command and waits timeout milliseconds for the command to complete, returning the output from the command as a String

Note: Simple arguments that contain no spaces can be separated with spaces, for example `executeCommandLine("touch file.txt")`. When one or more arguments contain spaces, use `@@` instead of a space as the argument separator. For example the bash command `touch -t 01010000 "some file with space.txt"` will have to be written as `touch@@-t@@01010000@@some file with space.txt`.

### HTTP Actions

- `sendHttpGetRequest(String url)`: Sends an GET-HTTP request and returns the result as a String
- `sendHttpPutRequest(String url)`: Sends a PUT-HTTP request and returns the result as a String
- `sendHttpPutRequest(String url, String contentType, String content)`: Sends a PUT-HTTP request with the given content and returns the result as a String
- `sendHttpPostRequest(String url)`: Sends a POST-HTTP request and returns the result as a String
- `sendHttpPostRequest(String url, String contentType, String content)`: Sends a POST-HTTP request with the given content and returns the result as a String
- `sendHttpDeleteRequest(String url)`: Sends a DELETE-HTTP request and returns the result as a String

Note: All HTTP Actions can have a last `timeout` parameter added in ms. eg. `sendHttpPostRequest(String url, String contentType, String content, int timeout)`

### Timers

`createTimer(AbstractInstant instant, Procedure procedure)`: schedules a block of code to execute at a future time

- `instant` is usually a `DateTime` calculated using the built in variable `now`.
- `procedure` is the block of code and is defined using lambda notation (i.e. square brackets)

For example:

```javascript
var Timer myTimer = createTimer(now.plusMinutes(5), [ |
    logInfo("rules", "Timer activated")
])
```

The Timer object supports the following methods:

- `cancel`: prevents the scheduled timer from executing
- `isRunning`: returns true if the code is currently executing (i.e. the timer activated the code but it is not done running)
- `hasTerminated`: returns true if the code has run and completed
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

### openHAB Subsystem Actions
openHAB has several subsystems that can be accessed from Rules. These include persistence, see [Persistence Extensions in Scripts and Rules]({{base}}/configuration/persistence.html#persistence-extensions-in-scripts-and-rules), transformations, scripts.

- `callScript(String scriptName)`: Calls a script which must be located in the `$OPENHAB_CONF/scripts` folder.

Scripts are small pieces of Rules DSL code that can be called from Rules.
However, Scripts have limitations.
Scripts cannot accept arguments.
Scripts cannot return a value.
Any reference to a class that would normally need to be imported in a .rules file, the class needs to be referred to by its full package as imports are not supported.

- `transform(String type, String function, String value)`: Applies a transformation of a given type with some function to a value and returns the transformed value as a String or the original value if the transformation failed.

See [Transformations]({{base}}/configuration/transformations.html#usage) for available transformations and their usage.

## Cloud Notification Actions

Notification actions may be placed in Rules to send alerts to mobile devices registered with an [openHAB Cloud instance](https://github.com/openhab/openhab-cloud) such as [myopenHAB.org](https://myopenhab.org).
Three different actions are available:

- `sendNotification(emailAddress, message)`: Sends a notification to a specific cloud instance user
- `sendBroadcastNotification(message)`: Sends a notification to *all* devices of *all* users
- `sendLogNotification(message)`: Sends a log notification to the `notifications` list at your openHAB Cloud instance.  Notifications are NOT sent to any registered devices

For each of the three actions, there's another variant accepting an icon name and a severity:
- `sendNotification(emailAddress, message, icon, severity)`
- `sendBroadcastNotification(message, icon, severity)`
- `sendLogNotification(message, icon, severity)`

Icon and severity can potentially be used by cloud instance clients (such as the openHAB apps for Android or iOS) to be displayed in the list of notifications.

The parameters for these actions have the following meaning:
- `emailAddress`: String containing the email address the target user is registered with in the cloud instance
- `message`: String containing the notification message text
- `icon`: String containing the icon name (as described in [Items]({{base}}/configuration/items.html#icons))
- `severity`: String containing a description of the severity of the incident

**Example**

```javascript
rule "Front Door Notification"
when
  Item Apartment_FrontDoor changed to OPEN
then
  sendNotification("me@email.com", "Front door was opened!")
end
```

For information on making use of the [openHAB Cloud service](https://github.com/openhab/openhab-cloud/blob/master/README.md) hosted by the [openHAB Foundation e.V.](https://www.openhabfoundation.org/), visit the [myopenhab.org website](http://www.myopenhab.org).

## Ephemeris

Ephemeris is a way to determine what type of day today or a number of days before or after today is.
For example, a way to determine if today is a weekend, a bank holiday, someone’s birthday, trash day, etc.
The default bank holidays and configuration syntax is defined by the [Jollyday library](https://github.com/svendiedrichsen/jollyday).

### Actions

#### Rules DSL

Action | Returns
-|-
`getBankHolidayName` | name of the holiday today, or `null` if today is not a bank holiday
`getBankHolidayName(<offset>)` | name of the holiday `<offset>` days from today, `null` if that day is not a bank holiday
`getBankHolidayName(<datetime>)` | name of the holiday on the day defined by the Joda DateTime `<datetime>`, `null` if that day is not a bank holiday
`getBankHolidayName(<offset>, <file>)` | name of the day defined in `<file>` `<offest>` days from today, `null` if that day is not defined in `<file>`
`getBankHolidayName(<datetime>, <file>)` | name of the day defined in `<file>` for the day defined by the Joda DateTime `<datetime>`, `null` if that day is not defined in `<file>`
`getDaysUntil(<holiday name>)` | number of days from today to the given `<holiday name>`
`getDaysUntil(<holiday name>, <file>)` | number of days from today to the given `<holiday name>` defined in `<file>`
`getDaysUntil(<datetime>, <holiday name>)` | number of days from the day defined by the Joda DateTime `<datetime>` and `<holiday name>`
`getDaysUntil(<datetime>, <holiday name>, <file>)` | number of days from the day defined by the Joda DateTime `<datetime>` and `<holiday name>` defined in `<file>`
`getHolidayDescription(<holiday name>)` | Jollyday defines a mapping between the holiday name and a description. This will return the description based on the holiday name returned by `getBankHolidayName`
`getNextBankHoliday` | name of the next bank holiday
`getNextBankHoliday(<file>)` | name of the next bank holiday defined in `<file>`
`getNextBankHoliday(<offset>)` | name of the next bank holiday after `<offset>` days from today
`getNextBankHoliday(<offset>, <file>)` | name of the next bank holiday after `<offset>` days from today defined in `<file>`
`getNextBankHoliday(<datetime>)` | name of the next bank holiday after the day defined by the Joda DateTime `<datetime>`
`getNextBankHoliday(<datetime>, <file>)` | name of the next bank holiday after the day defined by the Joda DateTime `<datetime>` defined in `<file>`
`isBankHoliday` | `true` if today is a bank holiday (see below), `false` otherwise
`isBankHoliday(<offset>)` | `true` if the day `<offset>` days from today is a bank holiday, `false` otherwise
`isBankHoliday(<datetime>)` | `true` if the day defined by the Joda DateTime `<datetime>` is a bank holiday, `false` otherwise.
`isBankHoliday(<offset>, <file>)` | `true` if the day `<offset>` days from today is a day defined in `<file>`, use 0 for `<offset>` for today; returns `false` otherwise
`isBankHoliday(<datetime>, <file>)` | `true` if the day defined by the Joda DateTime `<datetime>` is in `<file>`, `false` otherwise
`isInDayset("<set>")` | `true` if today is in the custom dayset `<set>` (see below), for example `isInDayset("school")`, `false` otherwise
`isInDayset("<set>", <offset>)` | `true` if the day `<offset>` days from today is in dayset `<set>`, `false` otherwise
`isInDayset("<set>", <datetime>)` | `true` if the day defined by the passed in Joda DateTime `<datetime>` os in dayset `<set>`, `false` otherwise
`isWeekend` | `true` if today is a weekend, `false` otherwise
`isWeekend(<offset>)` | `true` if the day `<offset>` days from today is a weekend
`isWeekend(<datetime>)` | `true` if the day defined by the passed in Joda DateTime is a weekend, `false` otherwise

In all examples that take `<offset>`, use a negative value to check days in the past.

#### Scripted Automation

One must import the Ephemeris Action and then call the above functions using `Ephemeris.<function>`, for example `Ephemeris.getNextBankHoliday()`.

### Configuration

#### PaperUI

In PaperUI one has the ability to configure which days of the week are considered weekends and set your country, region, and city.
If no country is provided the service uses your system default locale settings.
Browse to Configuration and System and scroll down to the Ephemeris section.
Setting the country, region and optionally city will cause Ephemeris to use the list of bank holidays defined for that location by [Jollyday](https://github.com/svendiedrichsen/jollyday).
You can find the XML file for your country [here](https://github.com/svendiedrichsen/jollyday/tree/master/src/main/resources/holidays).
You can find the localized mapping files that map between the holiday name in the XML and your preferred language [here](https://github.com/svendiedrichsen/jollyday/tree/master/src/main/resources/descriptions).

When filling in the country, region and city in that order, if there isn’t a drop down list leave that field blank.
There are no special bank holidays defined by Jollyday for that level.

#### `ephemeris.cfg`

By default Ephemeris supports a weekend dayset and a school dayset.
You can define additional daysets or modify the school dayset.
If you need to define custom daysets, you must do all your configuration through the `ephemeris.cfg` file instead of using PaperUI as described above so make sure to at least redefine the weekend dayset.
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
    xmlns:tns="http://www.example.org/Holiday" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.example.org/Holiday /Holiday.xsd">
    <tns:Holidays>
        <tns:Fixed month="MARCH" day="20" descriptionPropertiesKey="Rich Birthday" />
        <tns:Fixed month="MARCH" day="27" descriptionPropertiesKey="Son's Birthday" />
        <tns:Fixed month="JUNE" day="12" descriptionPropertiesKey="Wife's Birthday" />
        <tns:Fixed month="DECEMBER" day="27" descriptionPropertiesKey="Anniversary" />
        <tns:FixedWeekday which="FIRST" weekday="TUESDAY" month="NOVEMBER" descriptionPropertiesKey="Election Day"/>
    </tns:Holidays>
</tns:Configuration>
```
For further examples and to find the list of elements to reference holidays that require more complicated calculations (e.g. holidays based on a lunar calendar, Easter, etc.) see the [XSD that defines the structures of the XML](https://github.com/svendiedrichsen/jollyday/blob/b78fa20e75d48bdf14e3fa8107befe44e3bacf3a/src/main/xsd/Holiday.xsd) or the XML file for your country or others.

You can place these XML files anywhere on your file system that openHAB has permission to read.
In the calls to the Actions, use the fully qualified path.
We recommend placing these custom files somewhere inside your `$OH_CONF` folder, such as `$OH_CONF/services`.

## Installable Actions

The following actions are available as installable add-ons.

<table id="actions-select" class="striped">
  <tbody>
    <tr>
      <td width="20%">
        <p>
          <input type="checkbox" class="filled-in" id="manual-checkbox" />
          <label for="manual-checkbox"><img src="{{base}}/images/tag-install-manual.svg"></label>
        </p>
      </td>
      <td>
        <p>
        Some openHAB 1 actions have not yet completed validation for inclusion in the distribution; however, they may indeed work properly under openHAB 2.
        All openHAB 1 addons can be downloaded in a <a href="https://bintray.com/openhab/mvn/download_file?file_path=org%2Fopenhab%2Fdistro%2Fopenhab%2F1.9.0%2Fopenhab-1.9.0-addons.zip">zip file</a>.
        We need your help testing them so that they may be easily installed in a future distribution.
        Please see the <a href="{{base}}/developers/development/compatibilitylayer.html#how-to-use-openhab-1x-add-ons-that-are-not-part-of-the-distribution">compatibility layer documentation</a> and
        also search the <a href="https://community.openhab.org">openHAB community forum</a> for the latest information and steps for manual installation.
        </p>
      </td>
    </tr>
  </tbody>
</table>

<table id="actions-overview" class="bordered addon-table">
  <thead>
    <tr>
      <th data-field="label" width="20%">Name</th>
      <th data-field="description">Description</th>
    </tr>
  </thead>
  <tbody>
    {% for action in site.addons_actions %}
        <tr class="install-{{action.install}} since-{{action.since}}">
          <td>
            <h4><a href="{{base}}{{action.url}}">{% if action.logo %}<img class="logo" src="{{base}}/{{action.logo}}" title="{{ action.label }}" alt="{{ action.label }}" />{% else %}{{ action.label }}{% endif %}</a></h4>
            <img src="{{base}}/images/tag-since-{{action.since}}.svg"> <img src="{{base}}/images/tag-install-{{action.install}}.svg">
          </td>
          <td>{{ action.description | markdownify }}</td>
        </tr>
    {% endfor %}
 </tbody>
</table>
