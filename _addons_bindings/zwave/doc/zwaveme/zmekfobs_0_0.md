---
layout: documentation
title: ZME_KFOB-S - ZWave
---

{% include base.html %}

# ZME\_KFOB-S Secure 4 Button Key Chain Controller
This describes the Z-Wave device *ZME_KFOB-S*, manufactured by *Z-Wave.Me* with the thing type UID of ```zwaveme_zmekfobs_00_000```.

The device is in the category of Remote Control, defining Any portable or hand-held device that controls the status of something, e.g. remote control, keyfob etc..

# Overview


## Channels

The following table summarises the channels available for the ZME_KFOB-S

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Scene Number | scene_number |  | Number | 

### Scene Number

The ```scene_number``` channel supports the ```Number``` item.



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

### Parameter 1: Button 1 and 3 pair mode 

Set Button 1 and 3 pair mode
In separate mode button 1 works with group A, button 3 with groups C. Click is On, Hold is dimming Up, Double click is Off, Click-Hold is dimming Down. In pair button 1/3 are Up/Down correspondingly. Click is On/Off, Hold is dimming Up/Down. Single clicks works with group A, double click with group C. Default Value: 01
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Separately |
| 1 | In pair without double clicks |
| 2 | In pair with double clicks |

The manufacturer defined default value is 1 (In pair without double clicks).

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

The manufacturer defined default value is 1 (In pair without double clicks).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 11: Command to Control Group A

Set Command to Control Group A
This parameter defines the command to be sent to devices of control group A when the related button is pressed. Default Value: 08
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim (send Basic Set and Switch Multilevel) |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 6 | Control devices in proximity |
| 7 | Control DoorLock |
| 8 | Central Scene to Gateway |

The manufacturer defined default value is 8 (Central Scene to Gateway).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Command to Control Group B

Set Command to Control Group B
This parameter defines the command to be sent to devices of control group B when the related button is pressed. Default Value: 08
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim (send Basic Set and Switch Multilevel) |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 6 | Control devices in proximity |
| 7 | Control DoorLock |
| 8 | Central Scene to Gateway |

The manufacturer defined default value is 8 (Central Scene to Gateway).

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Command to Control Group C

Set Command to Control Group C
This parameter defines the command to be sent to devices of control group C when the related button is pressed. Default Value: 08
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim (send Basic Set and Switch Multilevel) |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 6 | Control devices in proximity |
| 7 | Control DoorLock |
| 8 | Central Scene to Gateway |

The manufacturer defined default value is 8 (Central Scene to Gateway).

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Command to Control Group D

Set Command to Control Group D
This parameter defines the command to be sent to devices of control group D when the related button is pressed. Default Value: 08
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim (send Basic Set and Switch Multilevel) |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 6 | Control devices in proximity |
| 7 | Control DoorLock |
| 8 | Central Scene to Gateway |

The manufacturer defined default value is 8 (Central Scene to Gateway).

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

The manufacturer defined default value is 1 (Switch off only).

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22: Invert buttons

Invert buttons
Invert buttons
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No |
| 1 | Yes |

The manufacturer defined default value is 0 (No).

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

The manufacturer defined default value is 0 (Wakeup is blocked).

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

The manufacturer defined default value is 1 (To same node as wake up notification).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZME_KFOB-S supports 5 association groups.

### Group 1: Lifeline


This group supports 10 nodes.

### Group 2: Control Group A


This group supports 10 nodes.

### Group 3: Control Group B


This group supports 10 nodes.

### Group 4: Control Group C


This group supports 10 nodes.

### Group 5: Control Group D


This group supports 10 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V0| |
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

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/548).
