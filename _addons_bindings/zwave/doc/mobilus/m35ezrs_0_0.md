---
layout: documentation
title: EZRS - ZWave
---

{% include base.html %}

# EZRS Mobilus Tubular Motor
This describes the Z-Wave device *EZRS*, manufactured by *MOBILUS MOTOR Spólka z o.o.* with the thing type UID of ```mobilus_m35ezrs_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![EZRS product image](https://www.cd-jackson.com/zwave_device_uploads/1029/1029_default.jpg)


The EZRS supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Tubular motor mob.iq EZRS M35 10/14 by Mobilus Motor Company is a modern radio controllable drive, designed to drive rolling shields. This device has a number of innovative solutions, including:

## SENSO technology

  * programming of endpoints automatically or using the remote control, 
  * operation regardless of the used hangers type, 
  * bidirectional obstacles detection which eliminates failures due to obstacles (each failure will be reported to controller as an alarm)
  * saving your time due to lack of supervision of your shutters - obstacle detection system, insensitive to minor disruption during work.

## Communication standard

But the most important feature of our motor is the usage of Z-Wave technology as the communication standard. It provides inter alia

  * easy procedure of connection the device to the network,
  * bidirectional communication between the motor operator and control device - therefore the user has the opportunity to receive a variety of information about the motor operator (location, work errors, obstacles encountered in the blinds way of work), 
  * automatic creation of network of devices, so there is no need for additional radio signal repeaters, 
  * compatibility with third party control devices - Z-Wave is a mature standard for radio communication, chosen by over two hundred manufacturers of devices intended to create an intelligent home control systems.

## Technical parameters

  * fi roller tube diameter of 35 mm,
  * torque: 10 Nm, 
  * revolutions per minute: 14 rpm, 
  * supply voltage 230 V.

### Inclusion Information

  1. Plug mob.iq [ M35 EZRS ] motor to the power supply according to schema at the end of instruction. Green diode in PROGRAMMING BUTTON is on. In the other case you need to exclude motor from Z-Wave network according to point 4 of this instruction.
  2. Turn your controller into INCLUDE mode (see instruction of your controller).
  3. Press the PROGRAMMING BUTTON on mob.iq [ M35 EZRS ] motor.
  4. Motor is detected by controller and included into Z-Wave network - the led diode is off.

### Exclusion Information

  1. Turn your controller into exclude mode (see instruction of your controller).
  2. Press the PROGRAMMING BUTTON on mob.iq [ M35 EZRS ] motor.
  3. Motor is detected by controller and excluded from Z-Wave network - the led diode is on.

## Channels

The following table summarises the channels available for the EZRS -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Dimmer  [Deprecated]| switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Blinds Control | blinds_control | blinds_control | Blinds | Rollershutter | 
| Alarm (system) | alarm_system | alarm_system |  | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer [Deprecated]
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

**Note:** This channel is marked as deprecated so should not be used.

### Blinds Control
Provides start / stop control of blinds.

The ```blinds_control``` channel is of type ```blinds_control``` and supports the ```Rollershutter``` item and is in the ```Blinds``` category.

### Alarm (system)
Indicates if a system alarm is triggered.

The ```alarm_system``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 2 configuration parameters available in the EZRS.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 12 | Motor state mode | Allows to change motor state (normal/calibration/discalibration mode) |
| 13 | BASIC SET Respone | Allows to change motor behavior after receiving BASIC_SET with value 0xFF |

### Parameter 12: Motor state mode

Allows to change motor state (normal/calibration/discalibration mode)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Normal mode (default) |
| 1 | Calibration mode |
| 2 | Discalibration mode |

The manufacturer defined default value is ```0``` (Normal mode (default)).

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: BASIC SET Respone

Allows to change motor behavior after receiving BASIC_SET with value 0xFF

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | last known non-zero position (default) |
| 1 | max open |

The manufacturer defined default value is ```0``` (last known non-zero position (default)).

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The EZRS supports 3 association groups.

### Group 1: I ASSOCIATION GROUP

Allows to send information about failures, errors and alarms directly to the controller (max. 5 devices).

Association group 1 supports 5 nodes.

### Group 2: II ASSOCIATION GROUP

Allows to send direct steering commands between SLAVE devices without participation of PRIMARY controller (max. 5 devices).

Association group 2 supports 5 nodes.

### Group 3: III ASSOCIATION GROUP

Allows to send direct steering commands (BASIC_SET with value 0xFF) to other devices if error is detected (max. 5 devices).

Association group 3 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/1029/mob-iq-ezrs-eng.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1029).
