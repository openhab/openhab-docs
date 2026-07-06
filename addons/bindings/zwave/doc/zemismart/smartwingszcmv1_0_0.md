---
layout: documentation
title: Z-CM-V01 - ZWave
---

{% include base.html %}

# Z-CM-V01 SmartWings Motorized Window Treatments
This describes the Z-Wave device *Z-CM-V01*, manufactured by *Zemismart* with the thing type UID of ```zemismart_smartwingszcmv1_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![Z-CM-V01 product image](https://opensmarthouse.org/zwavedatabase/1628/image/)


The Z-CM-V01 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

Motor control device that powers smart window treatments from brands such as SmartWings and Zemismart

### Inclusion Information

Pairing Method 1:

  1.   1. Remove the back cover of the remote.
  2.   2. Briefly press the P button until the motor jogs once.
  3.   3. Press the UP button until the motor jogs again.
  4.   4. Press the P button once more until the motor jogs once.
  5.   5. A red LED light will illuminate, indicating the motor is in inclusion mode

Pairing Method 2:

  1.   1. Press and hold the P1 button on the motor head for 6 seconds until the motor jogs twice.
  2.   2. A red LED light will illuminate, indicating the motor is in inclusion mode

### Exclusion Information

  1. 1. Remove the back cover of the remote.
  2. 2. Briefly press the P button until the motor jogs once.
  3. 3. Press the DOWN button until the motor jogs again.
  4. 4. Press the P button once more until the motor jogs once.

### General Usage Information



## Channels

The following table summarises the channels available for the Z-CM-V01 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Blinds Control | blinds_control | blinds_control | Blinds | Rollershutter | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Blinds Control
Provides start / stop control of blinds.

The ```blinds_control``` channel is of type ```blinds_control``` and supports the ```Rollershutter``` item and is in the ```Blinds``` category.

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


## Device Configuration

The following table provides a summary of the 10 configuration parameters available in the Z-CM-V01.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Set to start holding hands | This parameter can be used to set the motor open hand start function |
| 2 | Set motor direction | This parameter can be used to set the motor rotation direction. |
| 3 | Manually set open borders | Manually set / cancel open borders |
| 4 | Manually set close borders | Manually set / cancel close borders |
| 5 | Set motor status | Set motor status |
| 6 | Calibration the limit position | Calibration the limit position |
| 7 | Delete the limit position | Delete the limit position |
| 8 | Low battery level alarm threshold | Configure low battery report threshold, sends low battery report via battery report when battery level drops under setting |
| 9 | Battery auto report interval time | Interval time set in seconds. Battery Report will be sent when timeout. |
| 10 | Battery change report threshold | Battery level range = 1% to 50% |

### Parameter 1: Set to start holding hands

This parameter can be used to set the motor open hand start function
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | close |
| 1 | Open |

The manufacturer defined default value is ```1``` (open).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Set motor direction

This parameter can be used to set the motor rotation direction.
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 1 to 3 -:

| Value  | Description |
|--------|-------------|
| 1 | forward |
| 2 | opposite |
| 3 | reversing |

The manufacturer defined default value is ```1``` (forward).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Manually set open borders

Manually set / cancel open borders
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | cancel |
| 1 | set |

The manufacturer defined default value is ```0``` (cancel).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Manually set close borders

Manually set / cancel close borders
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | cancel |
| 1 | set |

The manufacturer defined default value is ```0``` (cancel).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Set motor status

Set motor status
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 1 to 3 -:

| Value  | Description |
|--------|-------------|
| 1 | Open |
| 2 | close |
| 3 | stop |

The manufacturer defined default value is ```3``` (stop).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Calibration the limit position

Calibration the limit position
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 1 to 3 -:

| Value  | Description |
|--------|-------------|
| 1 | up |
| 2 | down |
| 3 | third |

The manufacturer defined default value is ```1``` (up).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Delete the limit position

Delete the limit position
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 3 -:

| Value  | Description |
|--------|-------------|
| 0 | all |
| 1 | up |
| 2 | down |
| 3 | third |

The manufacturer defined default value is ```0``` (all).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Low battery level alarm threshold

Configure low battery report threshold, sends low battery report via battery report when battery level drops under setting
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 50 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Battery auto report interval time

Interval time set in seconds. Battery Report will be sent when timeout.
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2678400 may be set.

The manufacturer defined default value is ```3600```.

This parameter has the configuration ID ```config_9_4``` and is of type ```INTEGER```.


### Parameter 10: Battery change report threshold

Battery level range = 1% to 50%
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 50 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Z-CM-V01 supports 4 association groups.

### Group 1: Group 1

Switch Multilevel Report / Device Reset Locally / Indicator Report
1. Switch Multilevel Report.

Changings of curtain caused by user action or receiving of Multilevel Set or Basic Set or Window Covering Set will trigger.

2. Device Reset Locally.

Config Button is press and hold for 10 seconds.

3. Indicator Report

Receiving Indicator Set will trigger this CC.

Association group 1 supports 5 nodes.

### Group 2: Group 2

Basic set
Send Basic Set to Group 2 when receiving Basic Set

Association group 2 supports 5 nodes.

### Group 3: Group 3

Switch Multilevel Set
Send Switch Multilevel Set to Group 3 when receiving Switch Multilevel Set

Association group 3 supports 5 nodes.

### Group 4: Group 4

Switch Multilevel Start Level Change / Stop Level Change
Send Switch Multilevel Start Level Change / Stop Level Change to Group 4 when receiving Switch Multilevel Start Level Change / Stop Level Change

Association group 4 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| Linked to BASIC|
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_WINDOW_COVERING_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Manual](https://opensmarthouse.org/zwavedatabase/1628/reference/SmartWings_Z-wave_Motor_Programming_Guide.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1628).
