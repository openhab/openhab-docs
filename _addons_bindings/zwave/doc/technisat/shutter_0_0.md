---
layout: documentation
title: TechniSat Shutter - ZWave
---

{% include base.html %}

# TechniSat Shutter Shutter wall switch
This describes the Z-Wave device *TechniSat Shutter*, manufactured by *Technisat* with the thing type UID of ```technisat_shutter_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![TechniSat Shutter product image](https://www.cd-jackson.com/zwave_device_uploads/1242/1242_default.jpg)


The TechniSat Shutter supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

TechniSat roller shutter is a wall switch to control window roller shutters via Z-Wave. At the same time, the roller shutters can still be operated manually via the switch. Furthermore, the power consumption can be determined.

The roller shutter switch is installed in standard flush-mounted boxes

### Inclusion Information

Press the upper position of the left button (T1) 3x within a second.

### Exclusion Information

Press and hold the upper position of the left button (T1) for at least 10 seconds when the shutter is in the top position.

## Channels

The following table summarises the channels available for the TechniSat Shutter -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Blinds Control | blinds_control | blinds_control | Blinds | Rollershutter | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Scene Number | scene_number | scene_number |  | Number | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 

### Blinds Control
Provides start / stop control of blinds.

The ```blinds_control``` channel is of type ```blinds_control``` and supports the ```Rollershutter``` item and is in the ```Blinds``` category.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.
This channel provides the scene, and the event as a decimal value in the form ```<scene>.<event>```. The scene number is set by the device, and the event is as follows -:

| Event ID | Event Description  |
|----------|--------------------|
| 0        | Single key press   |
| 1        | Key released       |
| 2        | Key held down      |
| 3        | Double keypress    |
| 4        | Tripple keypress   |
| 5        | 4 x keypress       |
| 6        | 5 x keypress       |

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 4 configuration parameters available in the TechniSat Shutter.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Central scene notification | Enable/Disable Central scene notifcations for 2x-5x press |
| 2 | Wattage meter | Interval Current wattage meter report in 10s |
| 3 | Energy meter report | Interval of active energy meter report in minutes |
| 4 | Manual shutter calibration | Manual shutter calibration |

### Parameter 1: Central scene notification

Enable/Disable Central scene notifcations for 2x-5x press
0 - disable, 1 - enable
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Wattage meter

Interval Current wattage meter report in 10s
Interval of current wattage meter report in 10 second steps, 30s ... 1day, 0 - disable
Values in the range 0 to 8640 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Energy meter report

Interval of active energy meter report in minutes
Interval of active energy meter report in minutes, 10min ... 3 weeks, 0 - disable
Values in the range 0 to 30240 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_3_2``` and is of type ```INTEGER```.


### Parameter 4: Manual shutter calibration

Manual shutter calibration
Manual shutter calibration (shutter will move up, down and up again)  
0 - idle, 1 - start a manual shutter calibration
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The TechniSat Shutter supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
  * Device Reset Locally Notification
  * Central Scene notification
  * Meter Report
  * Multilevel Switch Report
  * Notification Report

Association group 1 supports 1 node.

### Group 2: Switch State

Basic Set

Association group 2 supports 10 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V2| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V4| Linked to BASIC|
| COMMAND_CLASS_METER_V4| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V2| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V4| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [TechniSat Shutter](https://www.cd-jackson.com/zwave_device_uploads/1242/BDA-Rollladenschalter-V6.pdf)
* [Manual_english_TechniSat Shutter](https://www.cd-jackson.com/zwave_device_uploads/1242/Manual-SMD01-Shutter--1-.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1242).
