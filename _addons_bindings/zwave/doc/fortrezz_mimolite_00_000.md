---
layout: documentation
title: MIMOlite - ZWave
---

{% include base.html %}

# MIMOlite Digital or Analog Voltage input and/or Dry Contact Relay

This describes the Z-Wave device *MIMOlite*, manufactured by *FortrezZ LLC* with the thing type UID of ```fortrezz_mimolite_00_000```. 

Digital or Analog Voltage input and/or Dry Contact Relay  


## Overview 

The MIMOlite module provides one analog or digital input and one relay output (isolated dry contacts, NO-COM-NC) and can be controlled by ZWaveTM.  The system includes a program switch for Z-WaveTM inclusion/exclusion and a status light (LED) for various indications. 

Input SIG1 is an analog input, internally pulled-up to the MIMOlite supply voltage. The system allows trigger conditions to be set based on the input voltage being inside or outside a user-defined range (configured via Z-Wave).  This provides great flexibility for capturing events in a wide variety of applications. The trigger status of the input can be read via Z-WaveTM and/or can be automatically sent to a configured node, typically the Controller.  In addition, a count of the trigger events that have occurred for the input channel is internally recorded (and stored in the ‘pulse count’) and is available to be requested or automatically sent via Z-Wave.  The current triggered/un-triggered status can also be read via ZWave.  The SIG1 input can be associated with up to two other Z-WaveTM devices, such that an associated device will automatically turn on (or off) based on the occurrence of a trigger event.  Finally, the analog input channel can be configured so that the analog input level (not just binary trigger status) is periodically sent to up to two other associated nodes. 

The output relay is typically commanded via Z-WaveTM commands. In addition, the user can configure the input SIG1 trigger condition to be mapped to the output relay.  For example, Relay 1 can be automatically turned on based on Input SIG1 being triggered.  The relay activation can be set via a jumper or via Z-WaveTM for either momentary or latched operation.

  


### Inclusion Information 

1.  Set up the inclusion mode at the controller (for detailed directions, please refer to your controller user manual)
2.  If the LED has a periodic single blink, the unit will be automatically included.  Otherwise, the button has been previously pressed and automatic inclusion mode is no longer active.  In this case, briefly press the button once and the controller will indicate that the unit has been included in the network.  Also, the Status LED will blink when the inclusion completes. Inclusion and exclusion are always done at normal transmit power mode.  

  


### Exclusion Information 

1.  Set up the exclusion mode at the controller (for detailed directions, please refer to your controller user manual)
2.  Press the MIMOlite button and the controller will indicate the unit has been removed from the network. The Status LED will blink when the exclusion completes.  


## Channels
The following table summarises the channels available for the MIMOlite Digital or Analog Voltage input and/or Dry Contact Relay.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (general) | sensor_general | sensor_general |  | Number |
| Alarm | alarm_general | alarm_general | Door | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the MIMOlite Digital or Analog Voltage input and/or Dry Contact Relay.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 2: Clear_Pulse_Meter_Counts |  |
| 3: Trigger_Mapping | Input-to-relay Mapping |
| 4: Lower_Threshold_High | Lower Threshold, High |
| 5: Lower_Threshold_Low | Lower Threshold, Low |
| 6: Upper_Threshold_High | Upper Threshold, High |
| 7: Upper_Threshold_Low | Upper Threshold, Low |
| 8: Trigger_Level_And_Input_Threshold |  |
| 9: Multilevel_AutoReport_Interval | Multilevel AutoReport Interval |
| 10: Not_Used_2 |  |
| 11: Momentary_Relay1_Duration | Momentary Relay1 output enable/disable (100msec). |
| 1: Binary input Set Group |  |
| 2: MultiLevel Sensor report |  |
| 3: Power Alarm |  |
| 4: Binary Sensor report |  |
| 5: Pulse Meter Sensor report |  |


#### 2: Clear_Pulse_Meter_Counts


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Clear Pulse Meter Counts (0) |


#### 3: Trigger_Mapping

Input-to-relay Mapping  


##### Overview 

The MIMOlite can be configured to automatically turn the relay on when the input is triggered or a Z-Wave command can also turn the relay on. The Configuration Command Class, Parameter 3, is used to set the input-to-relay mapping (See Technical Appendix). When input-to-relay mapping is enabled, Z-WaveTM commands to set the relay are overridden. The default for the relay is no input-to-relay mapping. Momentary vs Latched relay operation is selected by jumper P5 on the circuit board. The Momentary/Latched jumper is read only at power on when the MIMOlite is not in a ZWave network. When the jumper is off, momentary (default 500ms) operation is selected. If desired, once in-network, a Zwave configuration command (Parameter 11) can be used to override the jumper setting. The momentary configuration can be set from 100ms to 25.5ms (approximate) in increments of 100ms via the ZWave command. 

Note that neither a Basic Report nor a Binary Switch Report is sent when relay is automatically set or cleared by Trigger Mapping.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disabled (0) |
|  | SIG1 triggered/untriggered sets or clears Relay1 (1) |


#### 4: Lower_Threshold_High

Lower Threshold, High  


##### Overview 

Lower Threshold, High (Default=0xBB; must be less than Upper Threshold Low and greater than Lower Threshold Low).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 187 |
| Options | Default (0xBB) (187) |


#### 5: Lower_Threshold_Low

Lower Threshold, Low


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 171 |
| Options | Default (0xAB) (171) |


#### 6: Upper_Threshold_High

Upper Threshold, High


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | Default (0xFF) (255) |


#### 7: Upper_Threshold_Low

Upper Threshold, Low  


##### Overview 

Upper Threshold, Low (Default = 0xFE; must be greater than Lower Threshold High and less than Upper Threshold High).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 254 |
| Options | Default (0xFE) (254) |


#### 8: Trigger_Level_And_Input_Threshold


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | ANALOG, trigger OUTSIDE of thresholds. (0) |
|  | ANALOG, trigger BETWEEN thresholds. (1) |
|  | DIGITAL, trigger OUTSIDE of thresholds. (2) |
|  | DIGITAL, trigger BETWEEN thresholds. (3) |


#### 9: Multilevel_AutoReport_Interval

Multilevel AutoReport Interval  


##### Overview 

Periodic send interval of Multilevel Sensor Reports (Association Group 2) and/or Pulse Count Reports (Association Group 5) for SIG1. This parameter has a resolution of 10 seconds; for example, 1 = 10 seconds, 2 = 20 seconds, 3 = 30 seconds (Default), …, 255 = 2550 seconds = 42.5 minutes. A value of 0 disables automatic reporting.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | Disable Automatic Reports (0) |
|  | Enable Reports every 30 seconds (Default) (3) |


#### 10: Not_Used_2


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Null (0) |


#### 11: Momentary_Relay1_Duration

Momentary Relay1 output enable/disable (100msec).  


##### Overview 

Momentary Relay1 output enable/disable. 0 = disable (Default) 1..255 = enable / value sets the approximate momentary on time in increments of 100msec.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disabled (Default) (0) |
|  | 500 milliseconds (5) |


#### 1: Binary input Set Group

  


##### Overview 

When the input is triggered or untriggered, the MIMOlite will automatically send a Basic Set command to turn on or off the device(s) associated with this group.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: MultiLevel Sensor report

  


##### Overview 

The MIMOlite will periodically send a MultiLevel Sensor report indicating the input’s analog voltage level.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Power Alarm

  


##### Overview 

If a power dropout occurs, the MIMOlite will send an Alarm Command Class report (if there is enough available residual power).


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Binary Sensor report

  


##### Overview 

When the input is triggered or untriggered, the MIMOlite will automatically send a Binary Sensor report to this group’s associated device(s).


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Pulse Meter Sensor report

  


##### Overview 

Pulse meter counts will be sent to this group’s associated device(s). This will be sent periodically at the same intervals as Association Group 2, MLS Report except that if the pulse meter count is unchanged the report will not be sent.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/219).
