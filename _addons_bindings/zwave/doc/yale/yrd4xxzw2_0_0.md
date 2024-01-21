---
layout: documentation
title: YRD4XX-ZW2 - ZWave
---

{% include base.html %}

# YRD4XX-ZW2 Yale 2nd Generation Assure Deadbolt
This describes the Z-Wave device *YRD4XX-ZW2*, manufactured by *ASSA ABLOY* with the thing type UID of ```yale_yrd4xxzw2_00_000```.

The device is in the category of *Battery*, defining Batteries, Energy Storages.

![YRD4XX-ZW2 product image](https://opensmarthouse.org/zwavedatabase/1596/image/)


The YRD4XX-ZW2 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

Yale's latest and most advanced Assure Lock 2 collection with Z-Wave Plus built-in connects you to hundreds of brands and devices so you can build your smart home ecosystem.

Supported Models:

  * YRD410-ZW2 (2nd Generation Assure Keyed Push Button Deadbolt) 
  * YRD420-ZW2 (2nd Generation Assure Keyed Touch Screen Deadbolt)
  * YRD430-ZW2 (2nd Generation Assure Keyless Push Button Deadbolt)
  * YRD450-ZW2 (2nd Generation Assure KeylessTouch Screen Deadbolt)

### Inclusion Information

To include the lock in a Z-Wave Network:  


  * On your lock keypad, enter your programming code, followed by the gear icon
  * Press the 7 key, followed by the gear icon
  * Press the 1 key, followed by the gear icon

### Exclusion Information

To include the lock in a Z-Wave Network:  


  * On your lock keypad, enter your programming code, followed by the gear icon
  * Press the 7 key, followed by the gear icon
  * Press the 1 key, followed by the gear icon

### General Usage Information



## Channels

The following table summarises the channels available for the YRD4XX-ZW2 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Door Lock | lock_door | lock_door | Door | Switch | 
| Alarm (access) | alarm_access | alarm_access | Door | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
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

### Alarm (access)
Indicates if the access control alarm is triggered.

The ```alarm_access``` channel is of type ```alarm_access``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 9 configuration parameters available in the YRD4XX-ZW2.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Volume Level |  |
| 2 | Auto Relock |  |
| 3 | Auto Relock Time | Auto Relock after 10 to 180 seconds |
| 4 | Wrong Code Entry Limit | 3 to 10 attempts allowed |
| 7 | Shut Down Time (after wrong code entries) | 10 to 180 seconds before more attempts |
| 8 | Operating Mode |  |
| 11 | One Touch Locking |  |
| 13 | Lock Status LED |  |
| 15 | Reset to Factory Defaults | Lock will execute Reset To Factory! |
|  | Lock Timeout | Sets the time after which the door will auto lock |

### Parameter 1: Volume Level



The following option values may be configured, in addition to values in the range 1 to 3 -:

| Value  | Description |
|--------|-------------|
| 1 | High |
| 2 | Low |
| 3 | Silent |

The manufacturer defined default value is ```2``` (Low).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Auto Relock



The following option values may be configured, in addition to values in the range 0 to 0 -:

| Value  | Description |
|--------|-------------|
| -1 | Off |
| 0 | On |

The manufacturer defined default value is ```-1``` (Off).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Auto Relock Time

Auto Relock after 10 to 180 seconds

Values in the range 10 to 180 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Wrong Code Entry Limit

3 to 10 attempts allowed

Values in the range 3 to 10 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 7: Shut Down Time (after wrong code entries)

10 to 180 seconds before more attempts

Values in the range 10 to 180 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Operating Mode



The following option values may be configured, in addition to values in the range 0 to 3 -:

| Value  | Description |
|--------|-------------|
| 0 | Normal Mode |
| 1 | Vacation Mode, key only |
| 2 | Privacy Mode, no keypad |
| 3 | Passage Mode, no auto lock |

The manufacturer defined default value is ```0``` (Normal Mode).

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 11: One Touch Locking



The following option values may be configured, in addition to values in the range 0 to 0 -:

| Value  | Description |
|--------|-------------|
| -1 | On |
| 0 | Off |

The manufacturer defined default value is ```-1``` (On).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 13: Lock Status LED



The following option values may be configured, in addition to values in the range 0 to 0 -:

| Value  | Description |
|--------|-------------|
| -1 | On |
| 0 | Off |

The manufacturer defined default value is ```0``` (Off).

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 15: Reset to Factory Defaults

Lock will execute Reset To Factory!
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 0 -:

| Value  | Description |
|--------|-------------|
| -1 | Reset to Factory On |
| 0 | Reset to Factory Off |

The manufacturer defined default value is ```0``` (Reset to Factory Off).

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.

### Lock Timeout

Sets the time after which the door will auto lock.

This parameter has the configuration ID ```doorlock_timeout``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The YRD4XX-ZW2 supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Z-Wave Plus Lifeline
Lifeline / Alarm / Battery

Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_DOOR_LOCK_LOGGING_V1| |
| COMMAND_CLASS_SCHEDULE_ENTRY_LOCK_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_DOOR_LOCK_V1| |
| COMMAND_CLASS_USER_CODE_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V4| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_TIME_V1| |
| COMMAND_CLASS_TIME_PARAMETERS_V1| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [400_series_keypad.pdf](https://opensmarthouse.org/zwavedatabase/1596/reference/400_series_Keyed.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1596).
