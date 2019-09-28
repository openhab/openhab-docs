---
layout: documentation
title: iLock - ZWave
---

{% include base.html %}

# iLock Smart lock
This describes the Z-Wave device *iLock*, manufactured by *Shenzhen iSurpass Technology Co. ,Ltd* with the thing type UID of ```isurpass_ilock_00_000```.

The device is in the category of *Lock*, defining Devices whose primary pupose is locking something.

![iLock product image](https://www.cd-jackson.com/zwave_device_uploads/964/964_default.png)


The iLock supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

The door lock can work independently as a electronic lock, without any controller. And also work with mobile APP and other home automation devices through a Z-wave gateway.

With the gateway, users can always know who is visiting, track all the open log, check device status,make association, authorization, issue temporary password to visitors/cleaners,etc.

The door lock is standard Z-wave device, it is compatible with all Z-wave gateway, please refer to each gateway manual for details.

**Notes:**

  1. In default station, any password can unlock the doorlock, please register admin password immediately after installation, do not close the door before everything check ok.
  2. Unlock with 4 ways: Password, Mechanical key, App, Card(option).
  3. Power supply by 2 ways: 4*AA Battery for normal use & External 9V Battery for emergency.
  4. Available for door thickness 38-90mm.
  5. Take care of the password, suggest to change it for a certain period for safe.
  6. Do not operate it with wet hand, keep doorlock away from liquid.
  7. Lock the door when leaving home.
  8. Please replace all new battery at the same time when low-voltage battery alarm, do not mix the battery with new and old.
  9. Please keep a mechanical key in a suitable place for emergency situation.

### Inclusion Information

Inclusion： add a device into a zwave network.

1）Set gateway in Inclusion mode or add mode【 pleae refer to gateway guide】

2）Set door lock in learn mode 【see page 7 ,about 10 Inclusion/Exclusion】

3）Wait until success【 pleae refer to gateway guide】

### Exclusion Information

Exclusion：Delet a device for zwave network.

1）Set gateway in Exclusion mode or delete mode【 pleae refer to gateway guide】

2）Set door lock in learn mode 【see page 7 ,about 10 Inclusion/Exclusion】

3）Wait until success【 pleae refer to gateway guide】

## Channels

The following table summarises the channels available for the iLock -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Door Lock | lock_door | lock_door | Door | Switch | 
| Alarm (access) | alarm_access | alarm_access | Door | Switch | 
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 
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

### Alarm (burglar)
Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel is of type ```alarm_burglar``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

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

The iLock supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Our product supports an association group, and this group only support one node(one device) to receive unlock/lock message, battery report, alarm report. Please refer to your gateway guide to know how to set an association.

Association group 1 supports 1 node.

### Group 2: Notify

COMMAND\_CLASS\_ALARM

Association group 2 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_DOOR_LOCK_V1| Linked to BASIC|
| COMMAND_CLASS_USER_CODE_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V3| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_LOCK_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_TIME_PARAMETERS_V1| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [iLock 15 User Manual](https://www.cd-jackson.com/zwave_device_uploads/964/iLock-15-User-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/964).
