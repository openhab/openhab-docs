---
layout: documentation
title: Standard Triggers
---

# Standard Triggers

OpenHAB comes with a set of standard triggers. This is a short presentation of the triggers and their configuration.

## Overview of Standard Triggers

Standard triggers in openHAB are built-in mechanisms that initiate rule execution based on specific events or conditions. They provide a way to automate actions without the need for custom scripting, making them accessible and easy to use.

### TriggerType Objects

The following trigger types are defined by openHAB (custom triggers can also be defined) and take the specified parameters in the constructor of [`org.openhab.core.config.core.Configuration`](https://www.openhab.org/javadoc/latest/org/openhab/core/config/core/configuration). The configuration can be passed to `TriggerBuilder.withConfiguration()`. All parameters are Strings. Read the JSR223 language-specific documentation for examples of using these `TriggerType` objects .

#### timer.DateTimeTrigger

| Parameter  | Description                                                               |
|------------|---------------------------------------------------------------------------|
| `itemName` | The name of the `Item`                                                    |

#### core.ItemEventTrigger

| Parameter  | Description                                                                           |
|------------|---------------------------------------------------------------------------------------|
| `eventName`| The event to listen for, such as `ITEM_STATE_CHANGED`, `ITEM_COMMAND_RECEIVED`, etc.  |

#### core.ChannelEventTrigger

| Parameter  | Description                                                               |
|------------|---------------------------------------------------------------------------|
| `channelUID`| The UID of the channel to listen to events from.                         |
| `eventTopic`| The topic of the event to listen for.                                    |

#### core.ThingStatusChangeTrigger

| Parameter  | Description                                                              |
|------------|--------------------------------------------------------------------------|
| `thingUID` | The UID of the thing to monitor for status changes.                      |
| `statusFrom` | The previous status that the thing must have been in (optional).       |
| `statusTo`   | The new status that the thing must change to (optional).               |

#### core.SystemEventTrigger

| Parameter  | Description                                                               |
|------------|---------------------------------------------------------------------------|
| `eventTopic` | The topic of the system event to listen for.                            |

### ModuleType and TriggerHandlerFactory

- **ModuleType**: [`org.openhab.core.automation.type.ModuleType`](https://www.openhab.org/javadoc/latest/org/openhab/core/automation/type/moduletype) 
- **TriggerHandlerFactory**: [`org.openhab.core.automation.module.script.rulesupport.shared.factories.ScriptedTriggerHandlerFactory`](https://www.openhab.org/javadoc/latest/org/openhab/core/automation/module/script/rulesupport/shared/factories/scriptedtriggerhandlerfactory) 
- **TriggerType**: [`org.openhab.core.automation.type.TriggerType`](https://www.openhab.org/javadoc/latest/org/openhab/core/automation/type/triggertype) 

## Additional Information

For more details on rules and their structure, refer to [the Rules documentation](rules.md).
