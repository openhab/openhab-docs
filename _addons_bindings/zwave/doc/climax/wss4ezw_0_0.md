---
layout: documentation
title: WSS-4E-ZW - ZWave
---

{% include base.html %}

# WSS-4E-ZW Smart Scenario Switch
This describes the Z-Wave device *WSS-4E-ZW*, manufactured by *Climax Technology, Ltd.* with the thing type UID of ```climax_wss4ezw_00_000```.

The device is in the category of *Remote Control*, defining Any portable or hand-held device that controls the status of something, e.g. remote control, keyfob etc..

![WSS-4E-ZW product image](https://opensmarthouse.org/zwavedatabase/1478/image/)


The WSS-4E-ZW supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

WSS-4E-ZW is a Z-Wave Four-Button Scenario Switch designed to control a group of pre-programmed home automation devices by simply pressing the scenario buttons under the same Z-Wave network

### Inclusion Information

  1. Remove the cover by using a screwdriver.
  2. Insert the battery then replace the cover.
  3. Put the Z-Wave control panel into Inclusion mode (please refer to the Z-Wave control panel manual).
  4. Within 1.5 seconds, press the Function Button 3 times.
  5. Refer to the operation manual of the Z-Wave gateway or control panel to complete the adding process.
  6. If the device has already been added (included) into another Z-Wave Gateway/Control Panel, or if the device is unable to be added into the current Z-Wave Gateway/Control Panel, try removing it first (see Removing Device).

### Exclusion Information

  1. Put the Z-Wave gateway or control panel into Exclusion mode (please refer to the Z-Wave or control panel manual).
  2. Within 1.5 seconds, press the Function Button 3 times and the device will be removed from the Z-Wave network.

### General Usage Information

Press and hold the Function Button of the device for 10 seconds to factory reset.

## Channels

The following table summarises the channels available for the WSS-4E-ZW -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number | 
| Alarm | alarm_general | alarm_general | Alarm | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Alarm
Indicates if an alarm is triggered.

The ```alarm_general``` channel is of type ```alarm_general``` and supports the ```Switch``` item and is in the ```Alarm``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The WSS-4E-ZW supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Group 1 for “LifeLine”
Group 1 for “LifeLine”:

Scene Activation CC

(COMMAND\_CLASS\_SCENE_ACTIVATION)

Battery CC (COMMAND\_CLASS\_BASIC)

Device Reset Locally CC

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ALARM_V4| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [WSS-4E-ZW-(OTA)_20210105.pdf](https://opensmarthouse.org/zwavedatabase/1478/reference/WSS-4E-ZW-OTA_20210105.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1478).
