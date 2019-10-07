---
layout: documentation
title: ZME_KFOB-S - ZWave
---

{% include base.html %}

# ZME_KFOB-S Secure 4 Button Key Chain Controller
This describes the Z-Wave device *ZME_KFOB-S*, manufactured by *Z-Wave.Me* with the thing type UID of ```zwaveme_zmekfobs_00_000```.

The device is in the category of *Remote Control*, defining Any portable or hand-held device that controls the status of something, e.g. remote control, keyfob etc..

![ZME_KFOB-S product image](https://www.cd-jackson.com/zwave_device_uploads/548/548_default.png)


The ZME_KFOB-S supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The ZME_KFOB-S does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

The Z-Wave.Me Key Fob is a Z-Wave device that can both control other Z-Wave devices and activate predefined scenes in an IP gateway. Although it is controlling other devices the fob can?t act as Z-Wave network controller (primary or secondary) and will always need a Z-Wave network controller to be included into a Z-Wave network. The Key Fob can be used in five different modes that are picked by configuration commands:

  1. Direct Control of associated Devices with On/Off/Dim commands
  2. Direct Control of associated Devices with On/Off commands
  3. Switch All On/Off
  4. Scene Activation in IP Gateway
  5. Direct Activation of preconfigured Scenes
  6. Direct Control of Devices in proximity

### Inclusion Information

  1. Pushing all four buttons for 5 sec. will turn the fob into management mode. Management mode will time out after 10 sec
  2.  Button 3 confirms standard inclusion/exclusion by a primary controller,

### Exclusion Information

  1. Pushing all four buttons for 5 sec. will turn the fob into management mode. Management mode will time out after 10 sec
  2.  Button 3 confirms standard inclusion/exclusion by a primary controller,

### Wakeup Information

The ZME_KFOB-S does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


  1. Pushing all four buttons for 5 sec. will turn the fob into management mode. Management mode will time out after 10 sec
  2. Button 2 issues a node information frame or wakeup notification

## Channels

The following table summarises the channels available for the ZME_KFOB-S -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.
This channel provides the scene, and the event as a decimal value in the form ```<scene>.<event>```. The scene number is set by the device, and the event is as follows -:

| Event ID | Event Description  |
|----------|--------------------|
| 0        | Single key press   |
| 1        | Key released       |
| 2        | Key held down      |
| 3        | Double keypress    |
| 4        | Tripple keypress   |
| 5        | 4 x keypress       |
| 6        | 5 x keypress       |

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 10 configuration parameters available in the ZME_KFOB-S.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Button 1 and 3 pair mode  | Set Button 1 and 3 pair mode |
| 2 | Button 2 and 4 pair mode  | Set Button 2 and 4 pair mode |
| 11 | Command to Control Group A | Set Command to Control Group A |
| 12 | Command to Control Group B | Set Command to Control Group B |
| 13 | Command to Control Group C | Set Command to Control Group C |
| 14 | Command to Control Group D | Set Command to Control Group D |
| 21 | Send the following Switch All commands | Set Send the following Switch All commands |
| 22 | Invert buttons | Invert buttons |
| 25 | Blocks wakeup even when wakeup interval is set  | Set Blocks wakeup even when wakeup interval is set |
| 30 | Send unsolicited Battery Report on Wake Up | Set Send unsolicited Battery Report on Wake Up |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Button 1 and 3 pair mode 

Set Button 1 and 3 pair mode
In separate mode button 1 works with group A, button 3 with groups C. Click is On, Hold is dimming Up, Double click is Off, Click-Hold is dimming Down. In pair button 1/3 are Up/Down correspondingly. Click is On/Off, Hold is dimming Up/Down. Single clicks works with group A, double click with group C. Default Value: 01
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Separately |
| 1 | In pair without double clicks |
| 2 | In pair with double clicks |

The manufacturer defined default value is ```1``` (In pair without double clicks).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Button 2 and 4 pair mode 

Set Button 2 and 4 pair mode
In separate mode button 2 works with control group B, button 4 with control group D. Click is On, Hold is dimming Up, Double click is Off, Click-Hold is dimming Down. In pair button B/D are Up/Down correspondingly. Click is On/Off, Hold is dimming Up/Down. Single clicks works with group B, double click with group D. Default Value: 01
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Separately |
| 1 | In pair without double clicks |
| 2 | In pair with double clicks |

The manufacturer defined default value is ```1``` (In pair without double clicks).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 11: Command to Control Group A

Set Command to Control Group A
This parameter defines the command to be sent to devices of control group A when the related button is pressed. Default Value: 08
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 6 | Control devices in proximity |
| 7 | Control DoorLock |
| 8 | Central Scene to Gateway |

The manufacturer defined default value is ```8``` (Central Scene to Gateway).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Command to Control Group B

Set Command to Control Group B
This parameter defines the command to be sent to devices of control group B when the related button is pressed. Default Value: 08
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 6 | Control devices in proximity |
| 7 | Control DoorLock |
| 8 | Central Scene to Gateway |

The manufacturer defined default value is ```8``` (Central Scene to Gateway).

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Command to Control Group C

Set Command to Control Group C
This parameter defines the command to be sent to devices of control group C when the related button is pressed. Default Value: 08
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 6 | Control devices in proximity |
| 7 | Control DoorLock |
| 8 | Central Scene to Gateway |

The manufacturer defined default value is ```8``` (Central Scene to Gateway).

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Command to Control Group D

Set Command to Control Group D
This parameter defines the command to be sent to devices of control group D when the related button is pressed. Default Value: 08
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 6 | Control devices in proximity |
| 7 | Control DoorLock |
| 8 | Central Scene to Gateway |

The manufacturer defined default value is ```8``` (Central Scene to Gateway).

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 21: Send the following Switch All commands

Set Send the following Switch All commands
Send the following Switch All commands
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Switch off only |
| 2 | Switch on only |
| 255 | Switch all on and off |

The manufacturer defined default value is ```1``` (Switch off only).

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22: Invert buttons

Invert buttons
Invert buttons
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No |
| 1 | Yes |

The manufacturer defined default value is ```0``` (No).

This parameter has the configuration ID ```config_22_1``` and is of type ```INTEGER```.


### Parameter 25: Blocks wakeup even when wakeup interval is set 

Set Blocks wakeup even when wakeup interval is set
If the KFOB wakes up and there is no controller nearby, several unsuccessful communication attempts will drain battery  
Size: 1 Byte, Default Value: 00
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Wakeup is blocked |
| 1 | Wakeup is possible if configured accordingly |

The manufacturer defined default value is ```0``` (Wakeup is blocked).

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 30: Send unsolicited Battery Report on Wake Up

Set Send unsolicited Battery Report on Wake Up
Set Send unsolicited Battery Report on Wake Up
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No |
| 1 | To same node as wake up notification |
| 2 | Broadcast to neighbors |

The manufacturer defined default value is ```1``` (To same node as wake up notification).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.

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

The ZME_KFOB-S supports 5 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 10 nodes.

### Group 2: Control Group A

Control Group A, controlled by button 1 or single clicks of buttons

Association group 2 supports 10 nodes.

### Group 3: Control Group B

Control Group B, controlled by button 2 or single clicks of buttons 2

Association group 3 supports 10 nodes.

### Group 4: Control Group C

Control Group C, controlled by button 3 or double clicks of buttons 1

Association group 4 supports 10 nodes.

### Group 5: Control Group D

Control Group D, controlled by button 4 or double clicks of buttons 2

Association group 5 supports 10 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SCENE_CONTROLLER_CONF_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V1| Linked to BASIC|
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CMD_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/548/ZME-KFOB-S.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/548).
