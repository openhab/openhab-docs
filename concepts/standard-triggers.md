---
layout: documentation
title: Standard Triggers
---

# Standard Triggers

This page describes the standard triggers for [rules](./rules.md).

OpenHAB comes with a set of standard triggers.
This is a short presentation of these triggers and their configuration.
Standard triggers in openHAB are built-in mechanisms that initiate rule execution based on specific events or conditions.
They provide a way to automate actions without the need for custom scripting, making them accessible and easy to use.

## Trigger structure

The standard triggers are fundamentally Java classes that implement the required logic to make them do what they should.
We identify these triggers using a code that is often called the trigger type.
These codes are used as titles for the sections below.
To tell the trigger implementation what to react to, triggers can have configuration parameters with predefined names.
These configuration parameters and a brief description of what values they expect are listed in the below sections.

### `timer.DateTimeTrigger`

This trigger fires when the system time matches the time or date and time specified by the `DateTimeType` `Item`.

| Parameter  | Description                                                                   |
|------------|-------------------------------------------------------------------------------|
| `itemName` | The name of the `DateTimeType` `Item`.                                        |
| `timeOnly` | Whether only the time of the `Item` should be compared, or the date and time. |
| `[offset]` | The offset in seconds to add to the time of the `Item` state (optional).      |

### `timer.GenericCronTrigger`

This trigger fires when the system time matches the specified [Cron expression](https://en.wikipedia.org/wiki/Cron).

| Parameter        | Description          |
|------------------|----------------------|
| `cronExpression` | The cron expression. |

### `timer.TimeOfDayTrigger`

This trigger fires every day at a specified time of day.

| Parameter | Description                 |
|-----------|-----------------------------|
| `time`    | The time in "hh:mm" format. |

### `core.ItemCommandTrigger`

This trigger fires when the specified `Item` receives a `Command`.

| Parameter   | Description                 |
|-------------|-----------------------------|
| `itemName`  | The name of the `Item`.     |
| `[command]` | The `Command` (optional).   |

### `core.ItemStateUpdateTrigger`

This trigger fires when the specified `Item`'s `State` is updated, even if the new value is equal to the old value.

| Parameter  | Description             |
|------------|-------------------------|
| `itemName` | The name of the `Item`. |
| `[state]`  | The `State` (optional). |

### `core.ItemStateChangeTrigger`

This trigger fires when the specified `Item`'s `State` changes.

| Parameter         | Description                      |
|-------------------|----------------------------------|
| `itemName`        | The name of the `Item`.          |
| `[previousState]` | The previous `State` (optional). |
| `[state]`         | The `State` (optional).          |

### `core.GroupCommandTrigger`

This trigger fires when a member of the specified item group receives a `Command`.

| Parameter   | Description                  |
|-------------|------------------------------|
| `groupName` | The name of the `GroupItem`. |
| `[command]` | The `Command` (optional).    |

### `core.GroupStateUpdateTrigger`

This trigger fires when the `State` of a member of the specified item group is updated, even if the new value is equal to the old value.

| Parameter   | Description                  |
|-------------|------------------------------|
| `groupName` | The name of the `GroupItem`. |
| `[state]`   | The `State` (optional).      |

### `core.GroupStateChangeTrigger`

This trigger fires when the `State` of a member of the specified item group changes.

| Parameter         | Description                      |
|-------------------|----------------------------------|
| `groupName`       | The name of the `GroupItem`.     |
| `[previousState]` | The previous `State` (optional). |
| `[state]`         | The `State` (optional).          |

### `core.ThingStatusUpdateTrigger`

This trigger fires when the specified `Thing`'s status is updated, even if the new status is equal to the old status.

| Parameter  | Description                   |
|------------|-------------------------------|
| `thingUID` | The `thingUID`.               |
| `[status]` | The `ThingStatus` (optional). |

### `core.ThingStatusChangeTrigger`

This trigger fires when the specified `Thing`'s status changes.

| Parameter          | Description                            |
|--------------------|----------------------------------------|
| `thingUID`         | The `thingUID`.                        |
| `[previousStatus]` | The previous `ThingStatus` (optional). |
| `[status]`         | The `ThingStatus` (optional).          |

### `core.ChannelEventTrigger`

This trigger fires when the specified trigger channel receives an event.

| Parameter    | Description                               |
|--------------|-------------------------------------------|
| `channelUID` | The `ChannelUID` of the `Channel`.        |
| `[event]`    | The `Channel` trigger `Event` (optional). |

### `core.GenericEventTrigger`

This trigger fires when a matching `Event` appears on the event bus.

| Parameter   | Description                                                                                                                                                                                                                                                                                                                                                                             |
|-------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `[topic]`   | The topic to match, as a file-system style glob (`*`, `**`, `?`, and `{}` operators).<br><br>Example filters:<br>Item events: `openhab/items/\*/`<br>Channel events: `openhab/channels/\*/triggered`<br>Thing events: `openhab/things/\*\*`                                                                                                                                             |
| `[source]`  | A string that represents the entity that caused the event.                                                                                                                                                                                                                                                                                                                              |
| `[types]`   | `ItemCommandEvent`, `ItemStateEvent`, `ItemStateChangedEvent`, `GroupItemStateChangedEvent`, `ItemAddedEvent`, `ItemRemovedEvent`, `ThingAddedEvent`, `ThingRemovedEvent`, `ThingStatusInfoChangedEvent`, `ThingStatusInfoEvent`, `ThingUpdatedEvent`, etc. A non-exhaustive list can be found [in the Javadocs](https://www.openhab.org/javadoc/latest/org/openhab/core/events/event). |
| `[payload]` | A [regular expression](https://en.wikipedia.org/wiki/Regular_expression) to match against the actual event data.                                                                                                                                                                                                                                                                        |

### `core.SystemStartlevelTrigger`

This trigger fires when the system has reached the specified start level.

| Parameter    | Description              |
|--------------|--------------------------|
| `startlevel` | The system `StartLevel`. |
