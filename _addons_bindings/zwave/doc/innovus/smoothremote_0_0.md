---
layout: documentation
title: SmoothRemote - ZWave
---

{% include base.html %}

# SmoothRemote SmoothRemote
This describes the Z-Wave device *SmoothRemote*, manufactured by *INNOVUS* with the thing type UID of ```innovus_smoothremote_00_000```.

The device is in the category of *Remote Control*, defining Any portable or hand-held device that controls the status of something, e.g. remote control, keyfob etc..

![SmoothRemote product image](https://www.cd-jackson.com/zwave_device_uploads/440/440_default.png)


The SmoothRemote does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

The company's Z-Wave product portfolio is rounded off with the "SmoothRemote" remote control. This allows all INNOVUS devices as well as other third-party Z-Wave devices to be conveniently controlled from the sofa. 

The application fields are virtually unlimited. For example, the lights in the entire house can be switched on or off from the living room, unnecessary consumers switched off, or the room temperature in other rooms lowered or increased. All processes can be conveniently and easily set up via the House Control System

### Inclusion Information

The remote can be added to or removed from a Z-Wave network by triple clicking the Shift button

### Exclusion Information

The remote can be added to or removed from a Z-Wave network by triple clicking the Shift button

### Wakeup Information

The SmoothRemote does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


It is possible to make the device send a Wake Up Notification clicking VIII button 4 times

## Channels

The following table summarises the channels available for the SmoothRemote -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 4 configuration parameters available in the SmoothRemote.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 0 | Button Press Time | Button Press Time |
| 1 | Button Multiple Press Time | Button Multiple Press Time |
| 2 | Button Hold Time | Button Hold Time |
| 3 | Network Update Interval | Network Update Interval |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 0: Button Press Time

Button Press Time
 Time for presses on a single button to register as seperate and not part of a sequence, measured in 0.01s.

0 is interpreted as a 1.

**Warning**: All Configuration values have serious effects on the functioning of the device and as such shouldn't be changed unless one is certain of the consequences.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_0_1``` and is of type ```INTEGER```.


### Parameter 1: Button Multiple Press Time

Button Multiple Press Time
Time for presses on multiple buttons to register as seperate and not part of a sequence, measured in 0.01 s.

0 is interpreted as a 1.

**Warning**: All Configuration values have serious effects on the functioning of the device and as such shouldn't be changed unless one is certain of the consequences.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Button Hold Time

Button Hold Time
Time for presses to register as being held down in 0.01s.

0 is interpreted as a 1.

**Warning:** All Configuration values have serious effects on the functioning of the device and as such shouldn't be changed unless one is certain of the consequences. 
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```40```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Network Update Interval

Network Update Interval
Time between network updates in 256 seconds. Disabled if 0.

**Warning:** All Configuration values have serious effects on the functioning of the device and as such shouldn't be changed unless one is certain of the consequences. 
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```168```.

This parameter has the configuration ID ```config_3_2``` and is of type ```INTEGER```.

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

The SmoothRemote supports 68 association groups.

### Group 1: BASIC SET


Association group 1 supports 30 nodes.

### Group 2: BASIC SET


Association group 2 supports 30 nodes.

### Group 3: BASIC SET


Association group 3 supports 30 nodes.

### Group 4: BASIC SET


Association group 4 supports 30 nodes.

### Group 5: BASIC SET


Association group 5 supports 30 nodes.

### Group 6: BASIC SET


Association group 6 supports 30 nodes.

### Group 7: BASIC SET


Association group 7 supports 30 nodes.

### Group 8: SWITCH ALL ON


Association group 8 supports 30 nodes.

### Group 9: HAIL


Association group 9 supports 30 nodes.

### Group 10: BASIC SET


Association group 10 supports 30 nodes.

### Group 11: BASIC SET


Association group 11 supports 30 nodes.

### Group 12: BASIC SET


Association group 12 supports 30 nodes.

### Group 13: BASIC SET


Association group 13 supports 30 nodes.

### Group 14: BASIC SET


Association group 14 supports 30 nodes.

### Group 15: BASIC SET


Association group 15 supports 30 nodes.

### Group 16: BASIC SET


Association group 16 supports 30 nodes.

### Group 17: SWITCH ALL OFF


Association group 17 supports 30 nodes.

### Group 18: HAIL


Association group 18 supports 30 nodes.

### Group 19: SWITCH MULTILEVEL START LEVEL CHANGE


Association group 19 supports 30 nodes.

### Group 20: SWITCH MULTILEVEL START LEVEL CHANGE


Association group 20 supports 30 nodes.

### Group 21: SWITCH MULTILEVEL START LEVEL CHANGE


Association group 21 supports 30 nodes.

### Group 22: SWITCH MULTILEVEL START LEVEL CHANGE


Association group 22 supports 30 nodes.

### Group 23: SWITCH MULTILEVEL START LEVEL CHANGE


Association group 23 supports 30 nodes.

### Group 24: SWITCH MULTILEVEL START LEVEL CHANGE


Association group 24 supports 30 nodes.

### Group 25: SWITCH MULTILEVEL START LEVEL CHANGE


Association group 25 supports 30 nodes.

### Group 26: HAIL


Association group 26 supports 30 nodes.

### Group 27: HAIL


Association group 27 supports 30 nodes.

### Group 28: SWITCH MULTILEVEL START LEVEL CHANGE


Association group 28 supports 30 nodes.

### Group 29: SWITCH MULTILEVEL START LEVEL CHANGE


Association group 29 supports 30 nodes.

### Group 30: SWITCH MULTILEVEL START LEVEL CHANGE


Association group 30 supports 30 nodes.

### Group 31: SWITCH MULTILEVEL START LEVEL CHANGE


Association group 31 supports 30 nodes.

### Group 32: SWITCH MULTILEVEL START LEVEL CHANGE


Association group 32 supports 30 nodes.

### Group 33: SWITCH MULTILEVEL START LEVEL CHANGE


Association group 33 supports 30 nodes.

### Group 34: SWITCH MULTILEVEL START LEVEL CHANGE


Association group 34 supports 30 nodes.

### Group 35: HAIL


Association group 35 supports 30 nodes.

### Group 36: HAIL


Association group 36 supports 30 nodes.

### Group 37: SWITCH MULTILEVEL STOP LEVEL CHANGE


Association group 37 supports 30 nodes.

### Group 38: SWITCH MULTILEVEL STOP LEVEL CHANGE


Association group 38 supports 30 nodes.

### Group 39: SWITCH MULTILEVEL STOP LEVEL CHANGE


Association group 39 supports 30 nodes.

### Group 40: SWITCH MULTILEVEL STOP LEVEL CHANGE


Association group 40 supports 30 nodes.

### Group 41: SWITCH MULTILEVEL STOP LEVEL CHANGE


Association group 41 supports 30 nodes.

### Group 42: SWITCH MULTILEVEL STOP LEVEL CHANGE


Association group 42 supports 30 nodes.

### Group 43: SWITCH MULTILEVEL STOP LEVEL CHANGE


Association group 43 supports 30 nodes.

### Group 44: HAIL


Association group 44 supports 30 nodes.

### Group 45: HAIL


Association group 45 supports 30 nodes.

### Group 46: HAIL


Association group 46 supports 30 nodes.

### Group 47: HAIL


Association group 47 supports 30 nodes.

### Group 48: HAIL


Association group 48 supports 30 nodes.

### Group 49: HAIL


Association group 49 supports 30 nodes.

### Group 50: HAIL


Association group 50 supports 30 nodes.

### Group 51: HAIL


Association group 51 supports 30 nodes.

### Group 52: HAIL


Association group 52 supports 30 nodes.

### Group 53: HAIL


Association group 53 supports 30 nodes.

### Group 54: HAIL


Association group 54 supports 30 nodes.

### Group 55: HAIL


Association group 55 supports 30 nodes.

### Group 56: HAIL


Association group 56 supports 30 nodes.

### Group 57: HAIL


Association group 57 supports 30 nodes.

### Group 58: HAIL


Association group 58 supports 30 nodes.

### Group 59: HAIL


Association group 59 supports 30 nodes.

### Group 60: HAIL


Association group 60 supports 30 nodes.

### Group 61: HAIL


Association group 61 supports 30 nodes.

### Group 62: HAIL


Association group 62 supports 30 nodes.

### Group 63: HAIL


Association group 63 supports 30 nodes.

### Group 64: HAIL


Association group 64 supports 30 nodes.

### Group 65: HAIL


Association group 65 supports 30 nodes.

### Group 66: HAIL


Association group 66 supports 30 nodes.

### Group 67: HAIL


Association group 67 supports 30 nodes.

### Group 68: HAIL


Association group 68 supports 30 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Technical manual](https://www.cd-jackson.com/zwave_device_uploads/440/smoothremote-00120001-tech.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/440).
