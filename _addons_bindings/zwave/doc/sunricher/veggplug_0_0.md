---
layout: documentation
title: VEGGPLUG - ZWave
---

{% include base.html %}

# VEGGPLUG NAMRON Smart Plug
This describes the Z-Wave device *VEGGPLUG*, manufactured by *[Sunricher](www.sunricher.com)* with the thing type UID of ```sunricher_veggplug_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![VEGGPLUG product image](https://www.cd-jackson.com/zwave_device_uploads/1143/1143_default.jpg)


The VEGGPLUG supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Zwave Smart Plug

### Inclusion Information

Press and hold down action button for 10 seconds

### Exclusion Information

Triple click the action button

## Channels

The following table summarises the channels available for the VEGGPLUG -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Scene Number | scene_number | scene_number |  | Number | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps)
Indicates the instantaneous current consumption.

The ```meter_current``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 9 configuration parameters available in the VEGGPLUG.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 12 | Percentage Threshold Level | Percentage Threshold Level |
| 13 | Absolute Value Threshold Level | Absolute Value Threshold Level |
| 14 | Time Interval Report Voltage | Time Interval Report Voltage |
| 15 | Time Interval Report Current | Time Interval Report Current |
| 16 | Time Interval Report Power | Time Interval Report Power |
| 17 | Time Interval Report Energy | Time Interval Report Energy |
| 18 | Saving load state before power failure | Saving load state before power failure |
| 19 | Enable/Disable Switch Binary Report | Enable/Disable Switch Binary Report |
| 20 | Enable/Disable Current Protection Function | Enable/Disable Current Protection Function |

### Parameter 12: Percentage Threshold Level

Percentage Threshold Level

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Absolute Value Threshold Level

Absolute Value Threshold Level

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_13_2``` and is of type ```INTEGER```.


### Parameter 14: Time Interval Report Voltage

Time Interval Report Voltage

Values in the range 0 to 2678400 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_14_4``` and is of type ```INTEGER```.


### Parameter 15: Time Interval Report Current

Time Interval Report Current

Values in the range 0 to 2678400 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_15_4``` and is of type ```INTEGER```.


### Parameter 16: Time Interval Report Power

Time Interval Report Power

Values in the range 0 to 2678400 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_16_4``` and is of type ```INTEGER```.


### Parameter 17: Time Interval Report Energy

Time Interval Report Energy

Values in the range 0 to 2678400 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_17_4``` and is of type ```INTEGER```.


### Parameter 18: Saving load state before power failure

Saving load state before power failure

Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 19: Enable/Disable Switch Binary Report

Enable/Disable Switch Binary Report

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_19_1``` and is of type ```INTEGER```.


### Parameter 20: Enable/Disable Current Protection Function

Enable/Disable Current Protection Function

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The VEGGPLUG supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V3| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Instruction manual](https://www.cd-jackson.com/zwave_device_uploads/1143/4512717-INSTRUCTION-MANUAL.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1143).
