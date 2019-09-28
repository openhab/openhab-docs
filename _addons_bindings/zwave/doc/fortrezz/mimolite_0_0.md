---
layout: documentation
title: MIMOlite - ZWave
---

{% include base.html %}

# MIMOlite Digital or Analog Voltage input and/or Dry Contact Relay
This describes the Z-Wave device *MIMOlite*, manufactured by *FortrezZ LLC* with the thing type UID of ```fortrezz_mimolite_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![MIMOlite product image](https://www.cd-jackson.com/zwave_device_uploads/219/219_default.jpg)


The MIMOlite supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The MIMOlite module provides one analog or digital input and one relay output (isolated dry contacts, NO-COM-NC) and can be controlled by ZWaveTM.  The system includes a program switch for Z-WaveTM inclusion/exclusion and a status light (LED) for various indications. 

Input SIG1 is an analog input, internally pulled-up to the MIMOlite supply voltage. The system allows trigger conditions to be set based on the input voltage being inside or outside a user-defined range (configured via Z-Wave).  This provides great flexibility for capturing events in a wide variety of applications. The trigger status of the input can be read via Z-WaveTM and/or can be automatically sent to a configured node, typically the Controller.  In addition, a count of the trigger events that have occurred for the input channel is internally recorded (and stored in the ‘pulse count’) and is available to be requested or automatically sent via Z-Wave.  The current triggered/un-triggered status can also be read via ZWave.

The SIG1 input can be associated with up to two other Z-WaveTM devices, such that an associated device will automatically turn on (or off) based on the occurrence of a trigger event.  Finally, the analog input channel can be configured so that the analog input level (not just binary trigger status) is periodically sent to up to two other associated nodes. 

The output relay is typically commanded via Z-WaveTM commands. In addition, the user can configure the input SIG1 trigger condition to be mapped to the output relay.  For example, Relay 1 can be automatically turned on based on Input SIG1 being triggered.  The relay activation can be set via a jumper or via Z-WaveTM for either momentary or latched operation.

### Inclusion Information

  1. Set up the inclusion mode at the controller (for detailed directions, please refer to your controller user manual)
  2. If the LED has a periodic single blink, the unit will be automatically included.  Otherwise, the button has been previously pressed and automatic inclusion mode is no longer active.  In this case, briefly press the button once and the controller will indicate that the unit has been included in the network.  Also, the Status LED will blink when the inclusion completes. Inclusion and exclusion are always done at normal transmit power mode.  

### Exclusion Information

  1. Set up the exclusion mode at the controller (for detailed directions, please refer to your controller user manual)
  2. Press the MIMOlite button and the controller will indicate the unit has been removed from the network. The Status LED will blink when the exclusion completes.  

## Channels

The following table summarises the channels available for the MIMOlite -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Sensor (general) | sensor_general | sensor_general |  | Number | 
| Alarm | alarm_general | alarm_general | Alarm | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (general)


The ```sensor_general``` channel is of type ```sensor_general``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Alarm
Indicates if an alarm is triggered.

The ```alarm_general``` channel is of type ```alarm_general``` and supports the ```Switch``` item and is in the ```Alarm``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 9 configuration parameters available in the MIMOlite.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 2 | Clear_Pulse_Meter_Counts |  |
| 3 | Trigger_Mapping | Input-to-relay Mapping |
| 4 | Lower_Threshold_High | Lower Threshold, High |
| 5 | Lower_Threshold_Low | Lower Threshold, Low |
| 6 | Upper_Threshold_High | Upper Threshold, High |
| 7 | Upper_Threshold_Low | Upper Threshold, Low |
| 8 | Trigger_Level_And_Input_Threshold |  |
| 9 | Multilevel_AutoReport_Interval | Multilevel AutoReport Interval |
| 11 | Momentary_Relay1_Duration | Momentary Relay1 output enable/disable (100msec). |

### Parameter 2: Clear_Pulse_Meter_Counts



The following option values may be configured, in addition to values in the range 0 to 255 -:

| Value  | Description |
|--------|-------------|
| 0 | Clear Pulse Meter Counts |

The manufacturer defined default value is ```0``` (Clear Pulse Meter Counts).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Trigger_Mapping

Input-to-relay Mapping
The MIMOlite can be configured to automatically turn the relay on when the input is triggered or a Z-Wave command can also turn the relay on. The Configuration Command Class, Parameter 3, is used to set the input-to-relay mapping (See Technical Appendix). When input-to-relay mapping is enabled, Z-WaveTM commands to set the relay are overridden. The default for the relay is no input-to-relay mapping. Momentary vs Latched relay operation is selected by jumper P5 on the circuit board. The Momentary/Latched jumper is read only at power on when the MIMOlite is not in a ZWave network. When the jumper is off, momentary (default 500ms) operation is selected. If desired, once in-network, a Zwave configuration command (Parameter 11) can be used to override the jumper setting. The momentary configuration can be set from 100ms to 25.5ms (approximate) in increments of 100ms via the ZWave command. 

Note that neither a Basic Report nor a Binary Switch Report is sent when relay is automatically set or cleared by Trigger Mapping.
The following option values may be configured, in addition to values in the range 0 to 255 -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | SIG1 triggered/untriggered sets or clears Relay1 |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Lower_Threshold_High

Lower Threshold, High
Lower Threshold, High (Default=0xBB; must be less than Upper Threshold Low and greater than Lower Threshold Low).
The following option values may be configured, in addition to values in the range 0 to 255 -:

| Value  | Description |
|--------|-------------|
| 187 | Default (0xBB) |

The manufacturer defined default value is ```187``` (Default (0xBB)).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Lower_Threshold_Low

Lower Threshold, Low

The following option values may be configured, in addition to values in the range 0 to 255 -:

| Value  | Description |
|--------|-------------|
| 171 | Default (0xAB) |

The manufacturer defined default value is ```171``` (Default (0xAB)).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Upper_Threshold_High

Upper Threshold, High

The following option values may be configured, in addition to values in the range 0 to 255 -:

| Value  | Description |
|--------|-------------|
| 255 | Default (0xFF) |

The manufacturer defined default value is ```255``` (Default (0xFF)).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Upper_Threshold_Low

Upper Threshold, Low
Upper Threshold, Low (Default = 0xFE; must be greater than Lower Threshold High and less than Upper Threshold High).
The following option values may be configured, in addition to values in the range 0 to 255 -:

| Value  | Description |
|--------|-------------|
| 254 | Default (0xFE) |

The manufacturer defined default value is ```254``` (Default (0xFE)).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Trigger_Level_And_Input_Threshold



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | ANALOG, trigger OUTSIDE of thresholds. |
| 1 | ANALOG, trigger BETWEEN thresholds. |
| 2 | DIGITAL, trigger OUTSIDE of thresholds. |
| 3 | DIGITAL, trigger BETWEEN thresholds. |

The manufacturer defined default value is ```3``` (DIGITAL, trigger BETWEEN thresholds.).

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Multilevel_AutoReport_Interval

Multilevel AutoReport Interval
Periodic send interval of Multilevel Sensor Reports (Association Group 2) and/or Pulse Count Reports (Association Group 5) for SIG1. This parameter has a resolution of 10 seconds; for example, 1 = 10 seconds, 2 = 20 seconds, 3 = 30 seconds (Default), …, 255 = 2550 seconds = 42.5 minutes. A value of 0 disables automatic reporting.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable Automatic Reports |
| 3 | Enable Reports every 30 seconds (Default) |

The manufacturer defined default value is ```3``` (Enable Reports every 30 seconds (Default)).

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 11: Momentary_Relay1_Duration

Momentary Relay1 output enable/disable (100msec).
Momentary Relay1 output enable/disable. 0 = disable (Default) 1..255 = enable / value sets the approximate momentary on time in increments of 100msec.
The following option values may be configured, in addition to values in the range 0 to 255 -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled (Default) |
| 5 | 500 milliseconds |

The manufacturer defined default value is ```0``` (Disabled (Default)).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The MIMOlite supports 5 association groups.

### Group 1: Binary input Set Group

When the input is triggered or untriggered, the MIMOlite will automatically send a Basic Set command to turn on or off the device(s) associated with this group.

Association group 1 supports 2 nodes.

### Group 2: MultiLevel Sensor report

The MIMOlite will periodically send a MultiLevel Sensor report indicating the input’s analog voltage level.

Association group 2 supports 2 nodes.

### Group 3: Power Alarm

If a power dropout occurs, the MIMOlite will send an Alarm Command Class report (if there is enough available residual power).

Association group 3 supports 2 nodes.

### Group 4: Binary Sensor report

When the input is triggered or untriggered, the MIMOlite will automatically send a Binary Sensor report to this group’s associated device(s).

Association group 4 supports 2 nodes.

### Group 5: Pulse Meter Sensor report

Pulse meter counts will be sent to this group’s associated device(s). This will be sent periodically at the same intervals as Association Group 2, MLS Report except that if the pulse meter count is unchanged the report will not be sent.

Association group 5 supports 2 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [FortrezZ MIMOlite User Manual ](https://www.cd-jackson.com/zwave_device_uploads/219/user-manual-mimolite-05may2015.pdf)
* [FortrezZ MIMOlite Technical Appendix](https://www.cd-jackson.com/zwave_device_uploads/219/tech-appendix-mimolite-05may2015.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/219).
