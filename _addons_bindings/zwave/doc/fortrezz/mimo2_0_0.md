---
layout: documentation
title: MIMO2+ - ZWave
---

{% include base.html %}

# MIMO2+ Dual Digital or Analog Voltage input and Dual Contact Relay
This describes the Z-Wave device *MIMO2+*, manufactured by *FortrezZ LLC* with the thing type UID of ```fortrezz_mimo2_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![MIMO2+ product image](https://www.cd-jackson.com/zwave_device_uploads/700/700_default.png)


The MIMO2+ supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The MIMO2+ module provides two analog or digital input and two relay output (isolated dry contacts, NO-COM-NC) and can be controlled by ZWaveTM.  The system includes a program switch for Z-WaveTM inclusion/exclusion and a status light (LED) for various indications. 

Input SIG1 and SIG2 is an analog input, internally pulled-up to the MIMO2+ supply voltage. The system allows trigger conditions to be set based on the input voltage being inside or outside a user-defined range (configured via Z-Wave).  This provides great flexibility for capturing events in a wide variety of applications. The trigger status of the input can be read via Z-WaveTM and/or can be automatically sent to a configured node, typically the Controller.  In addition, a count of the trigger events that have occurred for the input channel is internally recorded (and stored in the ‘pulse count’) and is available to be requested or automatically sent via Z-Wave.  The current triggered/un-triggered status can also be read via ZWave.  The SIG1 and SIG2 input can be associated with up to two other Z-WaveTM devices, such that an associated device will automatically turn on (or off) based on the occurrence of a trigger event.  Finally, the analog input channel can be configured so that the analog input level (not just binary trigger status) is periodically sent to up to two other associated nodes. 

The output relay is typically commanded via Z-WaveTM commands. In addition, the user can configure the input SIG1 or SIG2 trigger condition to be mapped to the output relay.  For example, Relay 1 or 2 can be automatically turned on based on Input SIG1 being triggered.  The relay activation can be set via a jumper or via Z-WaveTM for either momentary or latched operation.

### Inclusion Information

  1. Set up the inclusion mode at the controller (for detailed directions, please refer to your controller user manual)
  2. If the LED has a periodic single blink, the unit will be automatically included.  Otherwise, the button has been previously pressed and automatic inclusion mode is no longer active.  In this case, briefly press the button once and the controller will indicate that the unit has been included in the network.  Also, the Status LED will blink when the inclusion completes. Inclusion and exclusion are always done at normal transmit power mode.  

### Exclusion Information

  1. Set up the exclusion mode at the controller (for detailed directions, please refer to your controller user manual)
  2. Press the button and the controller will indicate the unit has been removed from the network. The Status LED will blink when the exclusion completes. 

## Channels

The following table summarises the channels available for the MIMO2+ -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Sensor | sensor_general | sensor_general |  | Number | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Sensor 1 | sensor_general1 | sensor_general |  | Number | 
| Sensor 2 | sensor_general2 | sensor_general |  | Number | 
| Relay 1 | switch_binary3 | switch_binary | Switch | Switch | 
| Relay 2 | switch_binary4 | switch_binary | Switch | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Sensor


The ```sensor_general``` channel is of type ```sensor_general``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Sensor 1


The ```sensor_general1``` channel is of type ```sensor_general``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Sensor 2


The ```sensor_general2``` channel is of type ```sensor_general``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Relay 1
Switch the power on and off.

The ```switch_binary3``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Relay 2
Switch the power on and off.

The ```switch_binary4``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The following table provides a summary of the 18 configuration parameters available in the MIMO2+.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Relay 1 Trigger Interval | Momentary trigger time in 100ms intervals, 10=1s, 0=disable |
| 1 | Relay 1 Trigger Configuration | Relay 1 Trigger on Sensor Input |
| 2 | Relay 2 Trigger Interval | Momentary trigger time in 100ms intervals, 10=1s, 0=disable |
| 2 | Relay 2 Trigger Configuration | Relay 2 Trigger on Sensor Input |
| 3 | Sensor 1 Report Interval | Report sensor state every (30s resolution, 0=none, 1=30s, 10=5m, 63=31.5m) |
| 3 | Sensor 1 Report Mode | Report state periodically or on change |
| 3 | Sensor 1 Trigger Mode | Trigger Inside or Outside Low/High Thresholds |
| 4 | Sensor 1 Lower Threshold High |  |
| 5 | Sensor 1 Lower Threshold Low |  |
| 6 | Sensor 1 Upper Threshold High |  |
| 7 | Sensor 1 Upper Threshold Low |  |
| 9 | Sensor 2 Report Interval | Report sensor state every (30s resolution, 0=none, 1=30s, 10=5m, 63=31.5m) |
| 9 | Sensor 2 Report Mode | Report state periodically or on change |
| 9 | Sensor 2 Trigger Mode | Trigger Inside or Outside Low/High Thresholds |
| 10 | Sensor 2 Lower Threshold High |  |
| 11 | Sensor 2 Lower Threshold Low |  |
| 12 | Sensor 2 Upper Threshold High |  |
| 13 | Sensor 2 Upper Threshold Low |  |

### Parameter 1: Relay 1 Trigger Interval

Momentary trigger time in 100ms intervals, 10=1s, 0=disable

Values in the range 0 to 31 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_1_0000001F``` and is of type ```INTEGER```.


### Parameter 1: Relay 1 Trigger Configuration

Relay 1 Trigger on Sensor Input

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 32 | Trigger on Sensor 1 |
| 64 | Trigger on Sensor 2 |
| 96 | Trigger on Sensor 1 or Sensor 2 |
| 128 | Trigger on Sensor 1 and Sensor 2 |
| 224 | Trigger on Sensor 1 and/or Sensor 2 |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_1_1_000000E0``` and is of type ```INTEGER```.


### Parameter 2: Relay 2 Trigger Interval

Momentary trigger time in 100ms intervals, 10=1s, 0=disable

Values in the range 0 to 31 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_1_0000001F``` and is of type ```INTEGER```.


### Parameter 2: Relay 2 Trigger Configuration

Relay 2 Trigger on Sensor Input

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 32 | Trigger on Sensor 1 |
| 64 | Trigger on Sensor 2 |
| 96 | Trigger on Sensor 1 or Sensor 2 |
| 128 | Trigger on Sensor 1 and Sensor 2 |
| 224 | Trigger on Sensor 1 and/or Sensor 2 |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_2_1_000000E0``` and is of type ```INTEGER```.


### Parameter 3: Sensor 1 Report Interval

Report sensor state every (30s resolution, 0=none, 1=30s, 10=5m, 63=31.5m)

Values in the range 0 to 63 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1_0000003F``` and is of type ```INTEGER```.


### Parameter 3: Sensor 1 Report Mode

Report state periodically or on change

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Periodically |
| 1 | On Change |

The manufacturer defined default value is ```1``` (On Change).

This parameter has the configuration ID ```config_3_1_00000040``` and is of type ```INTEGER```.


### Parameter 3: Sensor 1 Trigger Mode

Trigger Inside or Outside Low/High Thresholds

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Outside |
| 1 | Inside |

The manufacturer defined default value is ```1``` (Inside).

This parameter has the configuration ID ```config_3_1_00000080``` and is of type ```INTEGER```.


### Parameter 4: Sensor 1 Lower Threshold High



Values in the range 0 to 4095 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_2``` and is of type ```INTEGER```.


### Parameter 5: Sensor 1 Lower Threshold Low



Values in the range 0 to 4095 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_2``` and is of type ```INTEGER```.


### Parameter 6: Sensor 1 Upper Threshold High



Values in the range 0 to 4095 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.


### Parameter 7: Sensor 1 Upper Threshold Low



Values in the range 0 to 4095 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_2``` and is of type ```INTEGER```.


### Parameter 9: Sensor 2 Report Interval

Report sensor state every (30s resolution, 0=none, 1=30s, 10=5m, 63=31.5m)

Values in the range 0 to 63 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_9_1_0000003F``` and is of type ```INTEGER```.


### Parameter 9: Sensor 2 Report Mode

Report state periodically or on change

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Periodically |
| 1 | On Change |

The manufacturer defined default value is ```1``` (On Change).

This parameter has the configuration ID ```config_9_1_00000040``` and is of type ```INTEGER```.


### Parameter 9: Sensor 2 Trigger Mode

Trigger Inside or Outside Low/High Thresholds

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Outside |
| 1 | Inside |

The manufacturer defined default value is ```1``` (Inside).

This parameter has the configuration ID ```config_9_1_00000080``` and is of type ```INTEGER```.


### Parameter 10: Sensor 2 Lower Threshold High



Values in the range 0 to 4095 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Sensor 2 Lower Threshold Low



Values in the range 0 to 4095 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Sensor 2 Upper Threshold High



Values in the range 0 to 4095 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: Sensor 2 Upper Threshold Low



Values in the range 0 to 4095 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_13_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The MIMO2+ supports 3 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 1 node.

### Group 2: Sensor 1 On Change


Association group 2 supports 2 nodes.

### Group 3: Sensor 2 On Change


Association group 3 supports 2 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V9| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V2| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V9| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V9| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/700/User-Manual-MIMO2--8May2017-removed-MI-address.pdf)
* [Technical Manual](https://www.cd-jackson.com/zwave_device_uploads/700/Tech-Appendix-MIMO2--8May2017-removed-MI-address.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/700).
