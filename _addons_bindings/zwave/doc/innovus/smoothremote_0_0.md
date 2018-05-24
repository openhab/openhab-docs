---
layout: documentation
title: SmoothRemote - ZWave
---

{% include base.html %}

# SmoothRemote SmoothRemote
This describes the Z-Wave device *SmoothRemote*, manufactured by *INNOVUS* with the thing type UID of ```innovus_smoothremote_00_000```.

# Overview

## Channels
The following table summarises the channels available for the SmoothRemote

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|



## Device Configuration
The following table provides a summary of the 4 configuration parameters available in the SmoothRemote.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 0 | Button Press Time | Button Press Time, time for presses on a single button to register as seperate and not part of a sequence, measured in 0.01s. 0 is interpreted as a 1. |
| 1 | Button Multiple Press Time | Button Multiple Press Time, time for presses on multiple buttons to register as seperate and not part of a sequence, measured in 0.01 s. 0 is interpreted as a 1. |
| 2 | Button Hold Time | Button Hold Time, time for presses to register as being held down in 0.01s. 0 is interpreted as a 1. |
| 3 | Network Update Interval | Network Update Interval, time between network updates in 256 seconds. Disabled if 0. |

### Parameter 0: Button Press Time
Button Press Time, time for presses on a single button to register as seperate and not part of a sequence, measured in 0.01s. 0 is interpreted as a 1.
Warning: All Configuration values have serious effects on the functioning of the device and as such shouldn't be changed unless one is certain of the consequences.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is 50.

This parameter has the configuration ID ```config_0_1``` and is of type ```INTEGER```.


### Parameter 1: Button Multiple Press Time
Button Multiple Press Time, time for presses on multiple buttons to register as seperate and not part of a sequence, measured in 0.01 s. 0 is interpreted as a 1.
Warning: All Configuration values have serious effects on the functioning of the device and as such shouldn't be changed unless one is certain of the consequences.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is 100.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Button Hold Time
Button Hold Time, time for presses to register as being held down in 0.01s. 0 is interpreted as a 1.
Warning: All Configuration values have serious effects on the functioning of the device and as such shouldn't be changed unless one is certain of the consequences.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is 40.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Network Update Interval
Network Update Interval, time between network updates in 256 seconds. Disabled if 0.
Warning: All Configuration values have serious effects on the functioning of the device and as such shouldn't be changed unless one is certain of the consequences.
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is 168.

This parameter has the configuration ID ```config_3_2``` and is of type ```INTEGER```.


## Association Groups
Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The SmoothRemote supports 0 association group.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/440).
