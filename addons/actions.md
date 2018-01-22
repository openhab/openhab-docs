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

### Audio Actions

- `setMasterVolume(float volume)`: Sets the volume of the host machine (volume in range 0-1)
- `increaseMasterVolume(float percent)`: Increases the volume by the given percent
- `decreaseMasterVolume(float percent)`: Decreases the volume by the given percent
- `float getMasterVolume()`: Returns the current volume as a float between 0 and 1
- `playSound(String filename)`: Plays the given sound file. The file must be an mp3 or wav and located in `${openhab.home}/sounds`
- `playStream(String url)`: Plays the audio stream at the given url
- `say(String text)`: Says the given text through Text-to-Speech
- `say(String text, String voice)`: Says the given text through the given voice (depends on the TTS engine and voices installed)
- ` say(String text, String voice, String device)`: Says the given text through the given voice to the given output device (Mac OSX only).

To get a list of available voices use `say -v ?` and to get a list of devices uses `say -a ?`.

### Logging Actions

- `logDebug(String loggername, String logText)`: Logs logText on level DEBUG to openhab.log
- `logInfo(String loggername, String logText)`: Logs logText on level INFO to openhab.log
- `logWarn(String loggername, String logText)`: Logs logText on level WARN to openhab.log
- `logError(String loggername, String logText)`: Logs logText on level ERROR to openhab.log

`logText` can be a compete String, constructed through concatination, or through arguments.

- **Complete String Example:** `logInfo("Garage", "This is a complete String")`
- **Concatination Example:** `logDebug("Lighting", "This is a string concatination:" + Light.name)`
- **Arguments Example:** `logWarn("Alarm", "The {} window has been open for {} hours!", Window.name, timeOpen)`

One can configure whether specific log entries are logged out and where they get logged to (e.g. to a separate file) by [editing the logger configuration]({{base}}/administration/logging.html).

### HTTP Actions

- `sendHttpGetRequest(String url)`: Sends an GET-HTTP request and returns the result as a String
- `sendHttpPutRequest(String url)`: Sends a PUT-HTTP request and returns the result as a String
- `sendHttpPutRequest(String url, Sting contentType, String content)`: Sends a PUT-HTTP request with the given content and returns the result as a String
- `sendHttpPostRequest(String url)`: Sends a POST-HTTP request and returns the result as a String
- `sendHttpPostRequest(String url, String contentType, String content)`: Sends a POST-HTTP request with the given content and returns the result as a String
- `sendHttpDeleteRequest(String url)`: Sends a DELETE-HTTP request and returns the result as a String

### Timers

`createTimer(AbstractInstant instant, Procedure procedure)`: schedules a block of code to execute at a future time

- `instant` is usually a `DateTime` calculated using the built in variable `now`.
- `procedure` is the block of code and is defined using lambda notation (i.e. square brackets)

For example:

```javascript
var Timer myTimer = createTimer(now.plusMinutes(5), [|
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

if ((thingStatusInfo != null) && (thingStatusInfo.getStatus().toString() == "ONLINE")) {
    logInfo("ThingStatus", "The thing is online.")
} else {
    logError("ThingStatus", "The thing is offline or doesn't exist.")
}
```

## Cloud Notification Actions

Notification actions may be placed in Rules to send alerts to mobile devices registered with an [openHAB Cloud instance](https://github.com/openhab/openhab-cloud) such as [myopenHAB.org](https://myopenhab.org).
Three different actions are available:

- `sendNotification("your myopenHAB user email address here","message")`: Sends a notification containing 'message'
- `sendBroadcastNotification("message")`: Sends a notification containing "message" to *all* devices of *all* users
- `sendLogNotification("message")`: Sends a log notification containing "message" to the `notifications` list at your openHAB Cloud instance.  Notifications are NOT sent to any registered devices

**Example**

```javascript
rule "Front Door Notification"
when
  Item Apartment_FrontDoor changed to OPEN
then
  send Notification("me@email.com", "Front door was opened!")
end
```

For information on making use of the [openHAB Cloud service](https://github.com/openhab/openhab-cloud/blob/master/README.md) hosted by the [openHAB Foundation e.V.](https://www.openhabfoundation.org/), visit the [myopehnab.org website](http://www.myopenhab.org).

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
