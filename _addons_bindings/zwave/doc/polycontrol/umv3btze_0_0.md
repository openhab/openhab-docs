---
layout: documentation
title: UMV3-BTZ - ZWave
---

{% include base.html %}

# UMV3-BTZ Danalock Universal Module V3
This describes the Z-Wave device *UMV3-BTZ*, manufactured by *[Poly-control](https://www.danalock.com/)* with the thing type UID of ```polycontrol_umv3btze_00_000```.

The device is in the category of *Lock*, defining Devices whose primary pupose is locking something.

![UMV3-BTZ product image](https://www.cd-jackson.com/zwave_device_uploads/1053/1053_default.jpg)


The UMV3-BTZ supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

The Universal Model V3 supports: - S0/S2 Z-Wave Security - Can operate 3 outputs. - Outputs can be delayed. - Bluetooth Smart

The UMV3 can be set to factory settings by pushing the switch 10 times. Please use this procedure only when the primary controller is missing or otherwise inoperable.

### Inclusion Information

To add or include the UMV3 into a Z-Wave network 1. Set the controller in inclusion mode 2. Push the switch once. 3. Wait 5 seconds.

### Exclusion Information

To remove or exclude the UMV3 into a Z-Wave network 1. Set the controller in exclusion mode 2. Push the switch once. 3. Wait 5 seconds.

## Channels

The following table summarises the channels available for the UMV3-BTZ -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Door Lock | lock_door | lock_door | Door | Switch | 
| Entry Alarm | alarm_entry | alarm_entry | Door | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Door Lock
Lock and unlock the door.

The ```lock_door``` channel is of type ```lock_door``` and supports the ```Switch``` item and is in the ```Door``` category.
The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Locked |
| OFF | Unlocked |

### Entry Alarm
Indicates if the entry alarm is triggered.

The ```alarm_entry``` channel is of type ```alarm_entry``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Open |
| OFF | Closed |

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 12 configuration parameters available in the UMV3-BTZ.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Relay 1 Pulse length (ms) | Time the relay is on in milliseconds. |
| 2 | Relay 1 Delay length (ms)  | Time before the relay is activated. |
| 3 | Relay 2 Pulse length (ms) | Time the relay is on in milliseconds. |
| 4 | Relay 2 Delay length (ms)  | Time before the relay is activated. |
| 5 | Relay 3 Pulse length (ms) | Time the relay is on in milliseconds. |
| 6 | Relay 3 Delay length (ms)  | Time before the relay is activated. |
| 7 | Disable battery alarm | Disable battery alarm0 = Battery Alarm enable,1 = Battery Alarm disable |
| 8 |  Battery Sample Interval Seconds  | Battery Sample Interval Seconds |
| 9 | Battery Milli Volt Level Threshold Maximum | Maximum battery alarm level in mV. |
| 10 | Battery Milli Volt Level Threshold Minimum | Minimum battery alarm level in mV. |
| 11 | Ble temporary allow – timer - seconds | Allow Bluetooth to be on for a time in seconds |
| 12 | BLE Always allowed | 0 = Not always allowed. 1= Always allowed. |
|  | Lock Timeout | Sets the time after which the door will auto lock |

### Parameter 1: Relay 1 Pulse length (ms)

Time the relay is on in milliseconds.

Values in the range 0 to 2147483647 may be set.

The manufacturer defined default value is ```5000```.

This parameter has the configuration ID ```config_1_4``` and is of type ```INTEGER```.


### Parameter 2: Relay 1 Delay length (ms) 

Time before the relay is activated.

Values in the range 0 to 2147483647 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_4``` and is of type ```INTEGER```.


### Parameter 3: Relay 2 Pulse length (ms)

Time the relay is on in milliseconds.

Values in the range 0 to 2147483647 may be set.

The manufacturer defined default value is ```5000```.

This parameter has the configuration ID ```config_3_4``` and is of type ```INTEGER```.


### Parameter 4: Relay 2 Delay length (ms) 

Time before the relay is activated.

Values in the range 0 to 2147483647 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_4``` and is of type ```INTEGER```.


### Parameter 5: Relay 3 Pulse length (ms)

Time the relay is on in milliseconds.

Values in the range 0 to 2147483647 may be set.

The manufacturer defined default value is ```5000```.

This parameter has the configuration ID ```config_5_4``` and is of type ```INTEGER```.


### Parameter 6: Relay 3 Delay length (ms) 

Time before the relay is activated.

Values in the range 0 to 2147483647 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_4``` and is of type ```INTEGER```.


### Parameter 7: Disable battery alarm

Disable battery alarm0 = Battery Alarm enable,1 = Battery Alarm disable

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Battery Alarm enable |
| 1 | Battery Alarm disable |

The manufacturer defined default value is ```0``` (Battery Alarm enable).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8:  Battery Sample Interval Seconds 

Battery Sample Interval Seconds

Values in the range 0 to 2147483647 may be set.

The manufacturer defined default value is ```3600```.

This parameter has the configuration ID ```config_8_4``` and is of type ```INTEGER```.


### Parameter 9: Battery Milli Volt Level Threshold Maximum

Maximum battery alarm level in mV.

Values in the range 0 to 12100 may be set.

The manufacturer defined default value is ```12100```.

This parameter has the configuration ID ```config_9_4``` and is of type ```INTEGER```.


### Parameter 10: Battery Milli Volt Level Threshold Minimum

Minimum battery alarm level in mV.

Values in the range 0 to 2147483647 may be set.

The manufacturer defined default value is ```11600```.

This parameter has the configuration ID ```config_10_4``` and is of type ```INTEGER```.


### Parameter 11: Ble temporary allow – timer - seconds

Allow Bluetooth to be on for a time in seconds

Values in the range 0 to 2147483647 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_4``` and is of type ```INTEGER```.


### Parameter 12: BLE Always allowed

0 = Not always allowed. 1= Always allowed.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Not always allowed |
| 1 | Always allowed |

The manufacturer defined default value is ```0``` (Not always allowed).

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.

### Lock Timeout

Sets the time after which the door will auto lock.

This parameter has the configuration ID ```doorlock_timeout``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The UMV3-BTZ supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 1 node.

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
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/1053/Danalock-UMV3-ZWave-Manual-V0-03.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1053).
