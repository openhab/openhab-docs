---
layout: documentation
title: Danalock V3-BTZE - ZWave
---

{% include base.html %}

# Danalock V3-BTZE Z-Wave controlled door lock with Bluetooth Smart
This describes the Z-Wave device *Danalock V3-BTZE*, manufactured by *[Poly-control](https://www.danalock.com/)* with the thing type UID of ```polycontrol_btze_00_000```.

The device is in the category of *Lock*, defining Devices whose primary pupose is locking something.

![Danalock V3-BTZE product image](https://www.cd-jackson.com/zwave_device_uploads/708/708_default.png)


The Danalock V3-BTZE supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

Danalock supports:

  * S0/S2 Z-Wave Security
  * Bluetooth Smart
  * Twist Assist
  * Auto Lock
  * Hold And Release
  * Back To Back 

### Inclusion Information

To add or include the Danalock into a Z-Wave network

  1. Pair the lock with bluetooth first
  2. Set the controller in inclusion mode

  3. Push the switch once.

  4. Wait 5 seconds. 

### Exclusion Information

To remove or exclude the Danalock into a Z-Wave network

  1. Delete the lock within the app (bluetooth)
  2. Set the controller in exclusion mode

  3. Push the switch once.

  4. Wait 5 seconds. 

### General Usage Information

Additional hints:

**Inclusion**: Do **not** include the lock to a Z-Wave network before it has been paired through bluetooth. Otherwise the lock is blocked and you are not able to pair through bluetooth. If you are not able to pair through the app then there is still z-wave information that has not been erased. A factory reset does not delete this Z-Wave information. You must exclude.

**Exclusion**: Delete the lock from the app before you exclude. Otherwise it won’t work. Exclusion is successful when the green light stops lightning immediately. If you use the Aeotec Z-Stick Gen5 it is easier to exclude with the USB stick detached. Inclusion of course with the stick attached to the PC. You can use any kind of controller to exclude - no matter with which controller it has been paired before.

## Channels

The following table summarises the channels available for the Danalock V3-BTZE -:

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

The following table provides a summary of the 6 configuration parameters available in the Danalock V3-BTZE.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Twin Assist | Helps you to lock and unlock your door lock. |
| 2 | Hold and Release | After a unlock operation the lock holds the lock, so the door can be opened |
| 3 | Block to block | The lock will run the motor until it hits resistance. |
| 4 | BLE Temporary Allowed | The BLE is enabled for a number of seconds. |
| 5 | BLE Always Allowed | BLE Always Allowed |
| 6 | Autolock | Lock after an unlock.Value is delay in sec before lock is locked again. |
|  | Lock Timeout | Sets the time after which the door will auto lock |

### Parameter 1: Twin Assist

Helps you to lock and unlock your door lock.
0 -> disabled

1 -> enabled
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (disabled).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Hold and Release

After a unlock operation the lock holds the lock, so the door can be opened
0 -> disabled

1 to 2147483647 -> enabled no. of seconds
The following option values may be configured, in addition to values in the range 0 to 2147483647 -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_2_4``` and is of type ```INTEGER```.


### Parameter 3: Block to block

The lock will run the motor until it hits resistance.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: BLE Temporary Allowed

The BLE is enabled for a number of seconds.
0 -> Disabled

1 to 2147483647 -> enabled no. of seconds
Values in the range 0 to 2147483647 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_4``` and is of type ```INTEGER```.


### Parameter 5: BLE Always Allowed

BLE Always Allowed
0 -> BLE Always disabled

1 -> BLE Always enabled
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | BLE Always disabled |
| 1 | BLE Always enabled |

The manufacturer defined default value is ```0``` (BLE Always disabled).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Autolock

Lock after an unlock.Value is delay in sec before lock is locked again.
0 -> disabled

1 to 2147483647 -> enabled no. of seconds
Values in the range 0 to 2147483647 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_4``` and is of type ```INTEGER```.

### Lock Timeout

Sets the time after which the door will auto lock.

This parameter has the configuration ID ```doorlock_timeout``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Danalock V3-BTZE supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Z-Wave Plus Lifeline
Z-Wave Plus Lifeline

  * Device Reset Locally: triggered upon reset.
  * Battery/notification: triggered upon low battery.
  * Door Lock operation report: triggered upon a change in door lock
  * Notification: triggered upon a change in door lock

Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_DOOR_LOCK_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V2| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V4| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Product manual](https://www.cd-jackson.com/zwave_device_uploads/708/Danalock-V3-Product-manual-Z-Wave-V-0-9-1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/708).
