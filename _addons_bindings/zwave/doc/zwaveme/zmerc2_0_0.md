---
layout: documentation
title: ZME_RC2 - ZWave
---

{% include base.html %}

# ZME_RC2 Z-Wave Remote Control+
This describes the Z-Wave device *ZME_RC2*, manufactured by *Z-Wave.Me* with the thing type UID of ```zwaveme_zmerc2_00_000```.

The device is in the category of *Remote Control*, defining Any portable or hand-held device that controls the status of something, e.g. remote control, keyfob etc..

![ZME_RC2 product image](https://www.cd-jackson.com/zwave_device_uploads/149/149_default.png)


The ZME_RC2 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The ZME_RC2 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

The Z-Wave.Me Remote controls Z-Wave actuators such as dimmers, switches, thermostats or motor controls for blinds or jalousies and it can activate scenes in central gateways or any other Z-Wave devices. Devices can be turned on and off but dimmers and motor controls can also be turned into a desired dimming level to motor position by keeping a button pushed and releasing it. Although it is controlling other devices, the device can not act as ZWave network controller (primary or secondary) and will always need a Z-Wave network controller to be included into a Z-Wave network.

The device can be used in different modes that are selected by configuration parameters 11-21:

  1. Direct control of associated devices
  2. Control of all devices in the Z-Wave network
  3. Simple and enhanced scene activation

10 pair of buttons - illuminated by blue light when operated - allow to control up to 10 control groups (either association groups or scenes)

### Inclusion Information

Bring your primary controller into inclusion mode

For Inclusion press the "Inclusion" button 3 times. The LED will flash green for a moment for confirmation. 

### Exclusion Information

Bring your primary controller into inclusion mode

For Exclusion press the "Exclusion" button for 5 secs. The LED will flash green for a moment for confirmation.

### Wakeup Information

The ZME_RC2 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


This device is battery operated and turned into deep sleep state most of the time to save battery life time. Communication with the device is limited. In order to communicate with the device, a static controller C is needed in the network. This controller will maintain a mailbox for the battery operated devices and store commands that can not be received during deep sleep state. Without such a controller, communication may become impossible and/or the battery life time is significantly decreased.

This device will wakeup regularly and announce the wakeup state by sending out a so called Wakeup Notification. The controller can then empty the mailbox. Therefore, the device needs to be configured with the desired wakeup interval and the node ID of the controller. If the device was included by a static controller this controller will usually perform all necessary configurations. The wakeup interval is a tradeoff between maximal battery life time and the desired responses of the device.

Pressing the "INCL." button for three times will wake up the device.

It is possible to set the node ID to 255 to send wakeup notifications as broadcast. In this mode device takes more time to go to sleep and drains battery faster, but can notify all it's direct neighbors about a wakeup.

## Channels

The following table summarises the channels available for the ZME_RC2 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 12 configuration parameters available in the ZME_RC2.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 10 | Command to Control Group No1 (Assoc. Group 2) | Defines the command sent to group 1 when the button is pressed (Assoc. Group 2) |
| 11 | Command to Control Group No2 (association group 3) | Command to Control Group No2 (association group 3) |
| 12 | Command to Control Group No3 (association group 4) | Command to Control Group No3 (association group 4) |
| 13 | Command to Control Group No4 (association group 5) | Command to Control Group No4 (association group 5) |
| 14 | Command to Control Group No5 (association group 6) | Command to Control Group No5 (association group 6) |
| 15 | Command to Control Group No6 (association group 7) | Command to Control Group No6 (association group 7) |
| 16 | Command to Control Group No7 (association group 8) | Command to Control Group No7 (association group 8) |
| 17 | Command to Control Scene No1 (association group 9) | Command to Control Scene No1 (association group 9) |
| 18 | Command to Control Scene No2 | Command to Control Scene No2 |
| 19 | Command to Control Scene No3  | Command to Control Scene No3 |
| 20 | Command to Control group All On/Off | Command to Control group All On/Off |
| 21 | Send the following Switch All commands | Send the following Switch All commands |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 10: Command to Control Group No1 (Assoc. Group 2)

Defines the command sent to group 1 when the button is pressed (Assoc. Group 2)
This parameter defines the command to be sent to devices of control group №1 when the related button is pressed (association group 2).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```1``` (Switch On/Off and Dim).

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Command to Control Group No2 (association group 3)

Command to Control Group No2 (association group 3)
This parameter defines the command to be sent to devices of control group No2 when the related button is pressed (association group 3)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```1``` (Switch On/Off and Dim ).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Command to Control Group No3 (association group 4)

Command to Control Group No3 (association group 4)
This parameter defines the command to be sent to devices of control group No3 when the related button is pressed (association group 4)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```1``` (Switch On/Off and Dim ).

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Command to Control Group No4 (association group 5)

Command to Control Group No4 (association group 5)
This parameter defines the command to be sent to devices of control group No4 when the related button is pressed (association group 5)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```1``` (Switch On/Off and Dim ).

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Command to Control Group No5 (association group 6)

Command to Control Group No5 (association group 6)
This parameter defines the command to be sent to devices of control group No5 when the related button is pressed (association group 6)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```1``` (Switch On/Off and Dim).

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Command to Control Group No6 (association group 7)

Command to Control Group No6 (association group 7)
This parameter defines the command to be sent to devices of control group No6 when the related button is pressed (association group 7)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```1``` (Switch On/Off and Dim ).

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 16: Command to Control Group No7 (association group 8)

Command to Control Group No7 (association group 8)
This parameter defines the command to be sent to devices of control group No7 when the related button is pressed (association group 8)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```1``` (Switch On/Off and Dim).

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 17: Command to Control Scene No1 (association group 9)

Command to Control Scene No1 (association group 9)
This parameter defines the command to be sent to devices of control scene group No1 when the related button is pressed (association group 9)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```4``` (Send Scenes).

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Command to Control Scene No2

Command to Control Scene No2
This parameter defines the command to be sent to devices of control scene group No2 when the related button is pressed (association group 10)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```4``` (Send Scenes).

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 19: Command to Control Scene No3 

Command to Control Scene No3
This parameter defines the command to be sent to devices of control scene group No3 when the related button is pressed (association group 11)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |

The manufacturer defined default value is ```4``` (Send Scenes).

This parameter has the configuration ID ```config_19_1``` and is of type ```INTEGER```.


### Parameter 20: Command to Control group All On/Off

Command to Control group All On/Off
This parameter defines the command to be sent to devices of control group All On/Off when the related button is pressed (association group 12)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
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

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Send to controller battery level and WakeUp Notification

Association group 1 supports 5 nodes.

### Group 2: The buttons of group No1


Association group 2 supports 5 nodes.

### Group 3: The buttons of group No2


Association group 3 supports 5 nodes.

### Group 4: The buttons of group No3


Association group 4 supports 5 nodes.

### Group 5: The buttons of group No4


Association group 5 supports 5 nodes.

### Group 6: The buttons of group No5


Association group 6 supports 5 nodes.

### Group 7: The buttons of group No6


Association group 7 supports 5 nodes.

### Group 8: The buttons of group No7


Association group 8 supports 5 nodes.

### Group 9: The buttons of scene No1


Association group 9 supports 5 nodes.

### Group 10: The buttons of scene No2


Association group 10 supports 5 nodes.

### Group 11: The buttons of scene No3


Association group 11 supports 5 nodes.

### Group 12: The buttons of All On/Off


Association group 12 supports 5 nodes.

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
