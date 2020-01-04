---
layout: documentation
title: KeyWe Smart lock  - ZWave
---

{% include base.html %}

# KeyWe Smart lock Smart lock GKW-2000D
This describes the Z-Wave device *KeyWe Smart lock *, manufactured by *Guardtec* with the thing type UID of ```guardtec_keywesmartlock_00_000```.

The device is in the category of *Lock*, defining Devices whose primary pupose is locking something.

![KeyWe Smart lock  product image](https://www.cd-jackson.com/zwave_device_uploads/1175/1175_default.png)


The KeyWe Smart lock  supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

The GKW-2000D is a smart lock that can be conveniently used with Z-Wave and Bluetooth.  
You can control the door lock directly from the phone via the Bluetooth function in close range.

You can also check the status of the door lock on the outside by connecting to the Z-Wave hub.  
You can also control door locks and check status via Google Home or Amazon Alexa.

### Inclusion Information

To add or include the GKW-2000D into a Z-Wave network:

  1. Set the controller in inclusion mode.
  2. Open the battery cover of the indoor body and press the [S button.
  3. Press the Master Pin \[1]\[2\]\[3\][4\] (Default value) button after press the [#] button.
  4. Press the \[8\]\[8\] button after press the [*] button.

### Exclusion Information

To remove or exclude the GKW-2000D into a Z-Wave network

  1. Set the controller in exclusion mode.
  2. Open the battery cover of the indoor body and press the [S] button.
  3. Press the Master Pin \[1]\[2\]\[3\][4\] (Default value) button after pressi the [#] button.
  4. Press the \[9\]\[9\] button after press the [*] button.

## Channels

The following table summarises the channels available for the KeyWe Smart lock  -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Door Lock | lock_door | lock_door | Door | Switch | 
| Alarm (access) | alarm_access | alarm_access | Door | Switch | 
| Alarm (emergency) | alarm_emergency | alarm_emergency | Alarm | Switch | 
| Alarm (raw) | alarm_raw | alarm_raw |  | String | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Door Lock
Lock and unlock the door.

The ```lock_door``` channel is of type ```lock_door``` and supports the ```Switch``` item and is in the ```Door``` category.
The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Locked |
| OFF | Unlocked |

### Alarm (access)
Indicates if the access control alarm is triggered.

The ```alarm_access``` channel is of type ```alarm_access``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (emergency)
Indicates Police, Fire, or Medical services should be contacted.

The ```alarm_emergency``` channel is of type ```alarm_emergency``` and supports the ```Switch``` item and is in the ```Alarm``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | EMERGENCY |
| OFF | OK |

### Alarm (raw)
Provides alarm parameters as json string.

The ```alarm_raw``` channel is of type ```alarm_raw``` and supports the ```String``` item. This is a read only channel so will only be updated following state changes from the device.
This channel sets, and provides the alarm state as a JSON string. It is designed for use in rules.
### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The KeyWe Smart lock  supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

### Group 2: Doorlock Op Group


Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_DOOR_LOCK_V1| |
| COMMAND_CLASS_USER_CODE_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [GKW-2000D](https://www.cd-jackson.com/zwave_device_uploads/1175/GKW-2000D-Z-Wave-Manual-20180807.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1175).
