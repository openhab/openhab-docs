---
layout: documentation
title: Yale Zwave S2 Security Module - ZWave
---

{% include base.html %}

# Yale Zwave S2 Security Module Supported on Lock models - SYDM3109PLUS and SYDM4109PLUS
This describes the Z-Wave device *Yale Zwave S2 Security Module*, manufactured by *ASSA ABLOY* with the thing type UID of ```yale_zws2dsk_00_000```.

The device is in the category of *Lock*, defining Devices whose primary pupose is locking something.

![Yale Zwave S2 Security Module product image](https://opensmarthouse.org/zwavedatabase/1492/image/)


The Yale Zwave S2 Security Module supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

RFHX-YZW51-00

YALE AU ZWAVE MODULE FOR ASEAN MODEL  


Yale Z-Wave Network Module

Lose Your Keys - Forget carrying around keys; lock and unlock your door with your smartphone. Remote Access Control - With the Yale Z-Wave Network Module control your Yale SYDM3109plus/ 4109plus Lock from anywhere via your Home Automation Hub.

Features

  * Remote access to lock features
  * Requires compatible 3rd party Z-Wave Home Automation Hub (sold separately)
  * Features may vary based on 3rd party hub software
  * Supported on Lock models - SYDM3109PLUS and SYDM4109PLUS

### Inclusion Information

  1. Put the Z-Wave controller into add or learn mode
  2. Enter the master code on the lock, followed by Registration(R or I)
  3. Press the 9 button, followed by #
  4. Press the 1 button followed by #

### Exclusion Information

  1. Put the Z-Wave controller into add or learn mode
  2. Enter the master code on the lock, followed by Registration(R or I)
  3. Press the 9 button, followed by #
  4. Press the 3 button followed by #
  5. Enter the master code on the lock

### General Usage Information



## Channels

The following table summarises the channels available for the Yale Zwave S2 Security Module -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Door Lock | lock_door | lock_door | Door | Switch | 
| Alarm | alarm_general | alarm_general | Alarm | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |
| Clock Time Offset | time_offset | time_offset | Time | Number | 

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

The ```time_offset``` channel is of type ```time_offset``` and supports the ```Number``` item and is in the ```Time``` category.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Yale Zwave S2 Security Module supports 1 association group.

### Group 1: Alarm Reports

Alarm reports are sent out to all devices in the association group

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_DOOR_LOCK_LOGGING_V1| |
| COMMAND_CLASS_SCHEDULE_ENTRY_LOCK_V1| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_DOOR_LOCK_V1| |
| COMMAND_CLASS_USER_CODE_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_TIME_V1| |
| COMMAND_CLASS_TIME_PARAMETERS_V1| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Digital Door Lock User Guide YDM4109+](https://opensmarthouse.org/zwavedatabase/1492/reference/ee461a5278225137fad662f2072f7c045b0bf9c6f33919aa03ece635917c8b72.pdf)
* [Digital Door Lock User Guide YDM3109+](https://opensmarthouse.org/zwavedatabase/1492/reference/Manual_for_YDM3109_plus.pdf)
* [Yale Zwave S2 security Module Installation & Programming Instructions ](https://opensmarthouse.org/zwavedatabase/1492/reference/RFHX-YZW51-00_YA_EN_II1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1492).
