---
layout: documentation
title: ZME_RC2 - ZWave
---

{% include base.html %}

# ZME\_RC2 Z-Wave Remote Control+
This describes the Z-Wave device *ZME_RC2*, manufactured by *Z-Wave.Me* with the thing type UID of ```zwaveme_zmerc2_00_000```.

The ZME_RC2 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The ZME_RC2 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour. The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/149) to improve the documentation.

## Channels

The following table summarises the channels available for the ZME_RC2 -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Scene Number | scene_number |  | Number | 
| Battery Level | battery-level | Battery | Number |

### Scene Number

Triggers when a scene button is pressed.

The ```scene_number``` channel supports the ```Number``` item.

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level``` channel supports the ```Number``` item and is in the ```Battery``` category.



## Device Configuration

The following table provides a summary of the 12 configuration parameters available in the ZME_RC2.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 10 | Command to Control Group No1 (association group 2) | This parameter defines the command to be sent to devices of control group No1 when the related button is pressed (association group 2) |
| 11 | Command to Control Group No2 (association group 3) | This parameter defines the command to be sent to devices of control group No2 when the related button is pressed (association group 3) |
| 12 | Command to Control Group No3 (association group 4) | This parameter defines the command to be sent to devices of control group No3 when the related button is pressed (association group 4) |
| 13 | Command to Control Group No4 (association group 5) | This parameter defines the command to be sent to devices of control group No4 when the related button is pressed (association group 5) |
| 14 | Command to Control Group No5 (association group 6) | This parameter defines the command to be sent to devices of control group No5 when the related button is pressed (association group 6) |
| 15 | Command to Control Group No6 (association group 7) | This parameter defines the command to be sent to devices of control group No6 when the related button is pressed (association group 7) |
| 16 | Command to Control Group No7 (association group 8) | This parameter defines the command to be sent to devices of control group No7 when the related button is pressed (association group 8) |
| 17 | Command to Control Scene No1 (association group 9) | This parameter defines the command to be sent to devices of control scene group No1 when the related button is pressed (association group 9) |
| 18 | Command to Control Scene No2 (association group 10) | This parameter defines the command to be sent to devices of control scene group No2 when the related button is pressed (association group 10) |
| 19 | Command to Control Scene No3 (association group 11) | This parameter defines the command to be sent to devices of control scene group No3 when the related button is pressed (association group 11) |
| 20 | Command to Control group All On/Off (association group 12) | This parameter defines the command to be sent to devices of control group All On/Off when the related button is pressed (association group 12) |
| 21 | Send the following Switch All commands | Send the following Switch All commands |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 10: Command to Control Group No1 (association group 2)

This parameter defines the command to be sent to devices of control group No1 when the related button is pressed (association group 2)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim (send Basic Set and Switch Multilevel) |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```1``` (Switch On/Off and Dim (send Basic Set and Switch Multilevel)).

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Command to Control Group No2 (association group 3)

This parameter defines the command to be sent to devices of control group No2 when the related button is pressed (association group 3)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim (send Basic Set and Switch Multilevel) |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```1``` (Switch On/Off and Dim (send Basic Set and Switch Multilevel)).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Command to Control Group No3 (association group 4)

This parameter defines the command to be sent to devices of control group No3 when the related button is pressed (association group 4)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim (send Basic Set and Switch Multilevel) |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```1``` (Switch On/Off and Dim (send Basic Set and Switch Multilevel)).

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Command to Control Group No4 (association group 5)

This parameter defines the command to be sent to devices of control group No4 when the related button is pressed (association group 5)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim (send Basic Set and Switch Multilevel) |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```1``` (Switch On/Off and Dim (send Basic Set and Switch Multilevel)).

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Command to Control Group No5 (association group 6)

This parameter defines the command to be sent to devices of control group No5 when the related button is pressed (association group 6)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim (send Basic Set and Switch Multilevel) |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```1``` (Switch On/Off and Dim (send Basic Set and Switch Multilevel)).

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Command to Control Group No6 (association group 7)

This parameter defines the command to be sent to devices of control group No6 when the related button is pressed (association group 7)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim (send Basic Set and Switch Multilevel) |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```1``` (Switch On/Off and Dim (send Basic Set and Switch Multilevel)).

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 16: Command to Control Group No7 (association group 8)

This parameter defines the command to be sent to devices of control group No7 when the related button is pressed (association group 8)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim (send Basic Set and Switch Multilevel) |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```1``` (Switch On/Off and Dim (send Basic Set and Switch Multilevel)).

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 17: Command to Control Scene No1 (association group 9)

This parameter defines the command to be sent to devices of control scene group No1 when the related button is pressed (association group 9)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim (send Basic Set and Switch Multilevel) |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```4``` (Send Scenes).

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Command to Control Scene No2 (association group 10)

This parameter defines the command to be sent to devices of control scene group No2 when the related button is pressed (association group 10)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim (send Basic Set and Switch Multilevel) |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```4``` (Send Scenes).

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 19: Command to Control Scene No3 (association group 11)

This parameter defines the command to be sent to devices of control scene group No3 when the related button is pressed (association group 11)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim (send Basic Set and Switch Multilevel) |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```4``` (Send Scenes).

This parameter has the configuration ID ```config_19_1``` and is of type ```INTEGER```.


### Parameter 20: Command to Control group All On/Off (association group 12)

This parameter defines the command to be sent to devices of control group All On/Off when the related button is pressed (association group 12)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim (send Basic Set and Switch Multilevel) |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```3``` (Switch All).

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: Send the following Switch All commands

Send the following Switch All commands

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Switch off only |
| 2 | Switch on only |
| 255 | Switch all on and off |

The manufacturer defined default value is ```255``` (Switch all on and off).

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.

### Wakeup Interval

The wakeup interval sets the period at which the device will listen for messages from the controller. This is required for battery devices that sleep most of the time in order to conserve battery life. The device will wake up at this interval and send a message to the controller to tell it that it can accept messages - after a few seconds, it will go back to sleep if there is no further communications. 

This setting is defined in *seconds*. It is advisable not to set this interval too short or it could impact battery life. A period of 1 hour (3600 seconds) is suitable in most instances.

Note that this setting does not affect the devices ability to send sensor data, or notification events.

This parameter has the configuration ID ```wakeup_interval``` and is of type ```INTEGER```.

### Wakeup Node

When sleeping devices wake up, they send a notification to a listening device. Normally, this device is the network controller, and normally the controller will set this automatically to its own address.
In the event that the network contains multiple controllers, it may be necessary to configure this to a node that is not the main controller. This is an advanced setting and should not be changed without a full understanding of the impact.

This parameter has the configuration ID ```wakeup_node``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZME_RC2 supports 12 association groups.

### Group 1: Lifeline. Send to controller battery level and WakeUp Notification


This group supports 5 nodes.

### Group 2: The buttons of group No1


This group supports 5 nodes.

### Group 3: The buttons of group No2


This group supports 5 nodes.

### Group 4: The buttons of group No3


This group supports 5 nodes.

### Group 5: The buttons of group No4


This group supports 5 nodes.

### Group 6: The buttons of group No5


This group supports 5 nodes.

### Group 7: The buttons of group No6


This group supports 5 nodes.

### Group 8: The buttons of group No7


This group supports 5 nodes.

### Group 9: The buttons of scene No1


This group supports 5 nodes.

### Group 10: The buttons of scene No2


This group supports 5 nodes.

### Group 11: The buttons of scene No3


This group supports 5 nodes.

### Group 12: The buttons of All On/Off


This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V2| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/149/zwave-me-RC2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/149).
