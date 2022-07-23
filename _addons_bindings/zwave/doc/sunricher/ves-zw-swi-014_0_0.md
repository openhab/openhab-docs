---
layout: documentation
title: VES-ZW-SWI-014 - ZWave
---

{% include base.html %}

# VES-ZW-SWI-014 Vesternet Z-Wave 2 Channel Switch
This describes the Z-Wave device *VES-ZW-SWI-014*, manufactured by *[Sunricher](www.sunricher.com)* with the thing type UID of ```sunricher_ves-zw-swi-014_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![VES-ZW-SWI-014 product image](https://opensmarthouse.org/zwavedatabase/1504/image/)


The VES-ZW-SWI-014 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Switch module to switch two loads on and off.

2 Inputs For Connecting Switches

2 Independently Controlled Output Channels

Power, Energy, Voltage & Current Metering

3-Wire (with Neutral)

Configurable Power Failure State

### Inclusion Information

Press the onboard button three times in quick succession to put module into include mode.

### Exclusion Information

Press the onboard button three times in quick succession to put module into exclusion mode.

### General Usage Information

Module is designed to be hidden behind a blank or switch plate.

## Channels

The following table summarises the channels available for the VES-ZW-SWI-014 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Scene Number | scene_number | scene_number |  | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (kVAh) | meter_kvah | meter_kvah | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 
| Scene Number | scene_number | scene_number |  | Number | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Scene Number 1 | scene_number1 | scene_number |  | Number | 
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch | 
| Scene Number 2 | scene_number2 | scene_number |  | Number | 

### Switch
Module ON/OFF

Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kVAh)
Indicates the energy consumption (kVAh).

The ```meter_kvah``` channel is of type ```meter_kvah``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps)
Indicates the instantaneous current consumption.

The ```meter_current``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

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

### Switch 1
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number 1
Triggers when a scene button is pressed.

The ```scene_number1``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Switch 2
Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number 2
Triggers when a scene button is pressed.

The ```scene_number2``` channel is of type ```scene_number``` and supports the ```Number``` item.



## Device Configuration

The following table provides a summary of the 10 configuration parameters available in the VES-ZW-SWI-014.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 2 | Binary Report | Wether to report when relay state changes. |
| 4 | Reset Power State | Switch state after reset power |
| 5 | Overcurrent Protection | Enable/disable over current protection |
| 7 | External Button Configuration | Configuration of behaviour of external buttons. |
| 8 | Exclusion | Enable/disable to add the device or remove it from a Z-wave network. |
| 9 | Scene Activation | sending of scene activation command CENTRAL\_SCENE\_NOTIFICATION_V3 when the switches S1 and S2 are pressed |
| 10 | Power change Threshold | Power change report threshold |
| 11 | Current change threshold | Current change absolute threshold report |
| 12 | Voltage change threshold | Voltage change absolute threshold report |
| 14 | Report time cycle | Time value to report energy consumption value |

### Parameter 2: Binary Report

Wether to report when relay state changes.

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Disable Report |
| 1 | Enable Report |

The manufacturer defined default value is ```1``` (Enable Report).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 4: Reset Power State

Switch state after reset power

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | Shut off load |
| 1 | Turn on load |
| 2 | Save load state before reset |

The manufacturer defined default value is ```2``` (Save load state before reset).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Overcurrent Protection

Enable/disable over current protection

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Disable Protection |
| 1 | Enable Protection |

The manufacturer defined default value is ```1``` (Enable Protection).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 7: External Button Configuration

Configuration of behaviour of external buttons.
Value 0:

Short press S1 to switch ON/OFF L1. Press and hold down S1 or release S1 to switch ON/OFF L1.

Short press S2 to switch ON/OFF L2. Press and hold down S2 or release S2 to switch ON/OFF L2.

Value 1:

Short press S1 to switch ON/OFF L1. When S1 is pressed and held down, then released, not processed.

Short press S2 to switch ON/OFF L2. When S2 is pressed and held down, then released, not processed.

Value 2:

Press and hold down S1 or release S1 to switch ON/OFF L1. When S1 short pressed, not processed.

Press and hold down S2 or release S2 to switch ON/OFF L2. When S2 short pressed, not processed.

Value 3:

Short press S1 or S2 to switch ON/OFF both L1 and L2 simultaneously. When S1 or S2 is pressed and held down, then released, not processed.

Value 4:

Press and hold down S1 os S2 or release S1 or S2 to switch ON/OFF L1 and L2 simultaneously. Short press S1 or S2, not processed.
Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Exclusion

Enable/disable to add the device or remove it from a Z-wave network.

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```1``` (Enable).

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Scene Activation

sending of scene activation command CENTRAL\_SCENE\_NOTIFICATION_V3 when the switches S1 and S2 are pressed

The following option values may be configured, in addition to values in the range 0 to 0 -:

| Value  | Description |
|--------|-------------|
| 0 | Disable send action for both S1 and S2 |
| 1 | Enable send action for both S1 and S2 |
| 2 | Enable to send action for S1 only |
| 3 | Enable to send action for S2 only |

The manufacturer defined default value is ```1``` (Enable send action for both S1 and S2).

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Power change Threshold

Power change report threshold
0: Disable absolute threshold comparison

1-100 : value of the power change threshold
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Current change threshold

Current change absolute threshold report
0 : Disable

1-10 : value of the current change ansolute threshold
Values in the range 0 to 10 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Voltage change threshold

Voltage change absolute threshold report
0 : Disable voltage threshold report

1-10 : value of the voltage change absolute threshold
Values in the range 0 to 10 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 14: Report time cycle

Time value to report energy consumption value

Values in the range 60 to 2678400 may be set.

The manufacturer defined default value is ```3600```.

This parameter has the configuration ID ```config_14_4``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The VES-ZW-SWI-014 supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline
1: When press and hold down S1 for 10S to reset the device, send "Device Reset Locally Notification" to associated devices of this group to report factory reset information.

2: When overload detected, send "NOTIFICATION_REPORT" to associates devices of this group.

3: Send METER_REPORT actively.

4: When action of S1 and S2 is detected, send CENTRAL\_SCENE\_NOTIFICATION

5: SWITCH\_BINARY\_REPORT

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
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Device Manual](https://opensmarthouse.org/zwavedatabase/1504/reference/VES-ZW-SWI-014.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1504).
