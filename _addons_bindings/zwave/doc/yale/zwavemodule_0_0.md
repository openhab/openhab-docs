---
layout: documentation
title: Yale Smart Door Lock Z-Wave Module - ZWave
---

{% include base.html %}

# Yale Smart Door Lock Z-Wave Module The Yale Smart Door Lock Z-Wave module allows you to control your Yale Connected Smart Door Lock from anywhere in the world when linked to a leading Z
This describes the Z-Wave device *Yale Smart Door Lock Z-Wave Module*, manufactured by *ASSA ABLOY* with the thing type UID of ```yale_zwavemodule_00_000```.

The device is in the category of *Lock*, defining Devices whose primary pupose is locking something.

![Yale Smart Door Lock Z-Wave Module product image](https://www.cd-jackson.com/zwave_device_uploads/810/810_default.jpg)


The Yale Smart Door Lock Z-Wave Module supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

Adds Z-Wave functionality to some locks.

### Inclusion Information

**Conexis L1**

Press the R button on the lock 3 times quickly.

**Keyless Connected or Keyfree Connected**

  1. Enter the Master code on the lock followed by #
  2. Press the 4 button followed by #
  3. Press the 1 button followed by #

### Exclusion Information

**Conexis L1**

Press the R button on the lock 3 times quickly.

**Keyless Connected or Keyfree Connected**

  1. Enter the Master code on the lock followed by #
  2. Press the 4 button followed by #
  3. Press the 3 button followed by #

## Channels

The following table summarises the channels available for the Yale Smart Door Lock Z-Wave Module -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Door Lock | lock_door | lock_door | Door | Switch | 
| Alarm | alarm_general | alarm_general | Alarm | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |
| Clock Time Offset | time_offset | time_offset | Temperature | Number | 

### Door Lock
Lock and unlock the door.

The ```lock_door``` channel is of type ```lock_door``` and supports the ```Switch``` item and is in the ```Door``` category.
The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Locked |
| OFF | Unlocked |

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
### Clock Time Offset
Provides the current time difference for the devices time.

The ```time_offset``` channel is of type ```time_offset``` and supports the ```Number``` item and is in the ```Temperature``` category.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Yale Smart Door Lock Z-Wave Module supports 1 association group.

### Group 1: Alarm Reports


Association group 1 supports 4 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_DOOR_LOCK_LOGGING_V1| |
| COMMAND_CLASS_SCHEDULE_ENTRY_LOCK_V1| |
| COMMAND_CLASS_DOOR_LOCK_V1| |
| COMMAND_CLASS_USER_CODE_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_PROTECTION_V2| |
| COMMAND_CLASS_LOCK_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_TIME_V1| |
| COMMAND_CLASS_TIME_PARAMETERS_V1| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/810/Z-Wave-Module-2-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/810).
