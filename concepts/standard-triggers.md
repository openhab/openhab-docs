---
layout: documentation
title: Standard Triggers
---

# Standard Triggers

OpenHAB comes with a set of standard triggers.
This is a short presentation of these triggers and their configuration.
Standard triggers in openHAB are built-in mechanisms that initiate rule execution based on specific events or conditions.
They provide a way to automate actions without the need for custom scripting, making them accessible and easy to use.

## Trigger structure

The standard triggers are fundamentally Java classes that implements the required logic to make them do what they should.
We identify these triggers using a code that is often called the trigger type.
These codes are used as titles for the sections below.
To tell the trigger implementation what to react to, triggers can have configuration parameters with predefined names.
These configuration parameters and a brief description of what values they expect, are listed in the below sections.

### `timer.DateTimeTrigger`

This triggers when the system time matches the time or date and time of the specified `DateTimeType` `Item`.

| Parameter  | Description                                                                  |
|------------|------------------------------------------------------------------------------|
| `itemName` | The name of the `DateTimeType` `Item`.                                       |
| `timeOnly` | Whether only the time of the `Item` should be compared or the date and time. |
| `offset`   | The offset in seconds to add to the time of the `Item` state (optional).     |

### `timer.GenericCronTrigger`

This triggers when the system time matches the specified [Cron expression](https://en.wikipedia.org/wiki/Cron).

| Parameter        | Description          |
|------------------|----------------------|
| `cronExpression` | The cron expression. |

### `timer.TimeOfDayTrigger`

This triggers every day at a specified time of day.

| Parameter | Description                 |
|-----------|-----------------------------|
| `time`    | The time in "hh:mm" format. |

### `core.ItemCommandTrigger`

This triggers when the specified `Item` receives a `Command`.

| Parameter  | Description               |
|------------|---------------------------|
| `itemName` | The name of the `Item`.   |
| `command`  | The `Command` (optional). |

### `core.ItemStateUpdateTrigger`

This triggers when the specified `Item`'s `State` is updated, even if the new value is equal to the old value.

| Parameter  | Description             |
|------------|-------------------------|
| `itemName` | The name of the `Item`. |
| `state`    | The `State` (optional). |

### `core.ItemStateChangeTrigger`

This triggers when the specified `Item`'s `State` is changed.

| Parameter       | Description                      |
|-----------------|----------------------------------|
| `itemName`      | The name of the `Item`.          |
| `previousState` | The previous `State` (optional). |
| `state`         | The `State` (optional).          |

### `core.GroupCommandTrigger`

| Parameter   | Description                  |
|-------------|------------------------------|
| `groupName` | The name of the `GroupItem`. |
| `command`   | The `Command` (optional)     |


### core.ItemEventTrigger

| Parameter  | Description                                                                           |
|------------|---------------------------------------------------------------------------------------|
| `eventName`| The event to listen for, such as `ITEM_STATE_CHANGED`, `ITEM_COMMAND_RECEIVED`, etc.  |

### core.ChannelEventTrigger

| Parameter  | Description                                                               |
|------------|---------------------------------------------------------------------------|
| `channelUID`| The UID of the channel to listen to events from.                         |
| `eventTopic`| The topic of the event to listen for.                                    |

### core.ThingStatusChangeTrigger

| Parameter  | Description                                                              |
|------------|--------------------------------------------------------------------------|
| `thingUID` | The UID of the thing to monitor for status changes.                      |
| `statusFrom` | The previous status that the thing must have been in (optional).       |
| `statusTo`   | The new status that the thing must change to (optional).               |

### core.SystemEventTrigger

| Parameter  | Description                                                               |
|------------|---------------------------------------------------------------------------|
| `eventTopic` | The topic of the system event to listen for.                            |

### ModuleType and TriggerHandlerFactory

- **ModuleType**: [`org.openhab.core.automation.type.ModuleType`](https://www.openhab.org/javadoc/latest/org/openhab/core/automation/type/moduletype) 
- **TriggerHandlerFactory**: [`org.openhab.core.automation.module.script.rulesupport.shared.factories.ScriptedTriggerHandlerFactory`](https://www.openhab.org/javadoc/latest/org/openhab/core/automation/module/script/rulesupport/shared/factories/scriptedtriggerhandlerfactory) 
- **TriggerType**: [`org.openhab.core.automation.type.TriggerType`](https://www.openhab.org/javadoc/latest/org/openhab/core/automation/type/triggertype) 

## Additional Information

For more details on rules and their structure, refer to [the Rules documentation](rules.md).
