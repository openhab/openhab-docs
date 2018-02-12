---
layout: documentation
title: MIMO2+ - ZWave
---

{% include base.html %}

# MIMO2+ Dual Digital or Analog Voltage input and Dual Contact Relay

This describes the Z-Wave device *MIMO2+*, manufactured by *FortrezZ LLC* with the thing type UID of ```fortrezz_mimo2_00_000```. 

Dual Digital or Analog Voltage input and Dual Contact Relay  


## Overview 

The MIMO2+ module provides two analog or digital input and two relay output (isolated dry contacts, NO-COM-NC) and can be controlled by ZWaveTM.  The system includes a program switch for Z-WaveTM inclusion/exclusion and a status light (LED) for various indications. 

Input SIG1 and SIG2 is an analog input, internally pulled-up to the MIMO2+ supply voltage. The system allows trigger conditions to be set based on the input voltage being inside or outside a user-defined range (configured via Z-Wave).  This provides great flexibility for capturing events in a wide variety of applications. The trigger status of the input can be read via Z-WaveTM and/or can be automatically sent to a configured node, typically the Controller.  In addition, a count of the trigger events that have occurred for the input channel is internally recorded (and stored in the ‘pulse count’) and is available to be requested or automatically sent via Z-Wave.  The current triggered/un-triggered status can also be read via ZWave.  The SIG1 and SIG2 input can be associated with up to two other Z-WaveTM devices, such that an associated device will automatically turn on (or off) based on the occurrence of a trigger event.  Finally, the analog input channel can be configured so that the analog input level (not just binary trigger status) is periodically sent to up to two other associated nodes. 

The output relay is typically commanded via Z-WaveTM commands. In addition, the user can configure the input SIG1 or SIG2 trigger condition to be mapped to the output relay.  For example, Relay 1 or 2 can be automatically turned on based on Input SIG1 being triggered.  The relay activation can be set via a jumper or via Z-WaveTM for either momentary or latched operation.

  


### Inclusion Information 

1.  Set up the inclusion mode at the controller (for detailed directions, please refer to your controller user manual)
2.  If the LED has a periodic single blink, the unit will be automatically included.  Otherwise, the button has been previously pressed and automatic inclusion mode is no longer active.  In this case, briefly press the button once and the controller will indicate that the unit has been included in the network.  Also, the Status LED will blink when the inclusion completes. Inclusion and exclusion are always done at normal transmit power mode.  

  


### Exclusion Information 

1.  Set up the exclusion mode at the controller (for detailed directions, please refer to your controller user manual)
2.  Press the button and the controller will indicate the unit has been removed from the network. The Status LED will blink when the exclusion completes. 


## Channels
The following table summarises the channels available for the MIMO2+ Dual Digital or Analog Voltage input and Dual Contact Relay.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Sensor | sensor_general | sensor_general |  | Number |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |
| Sensor 1 | sensor_general1 | sensor_general |  | Number |
| Sensor 2 | sensor_general2 | sensor_general |  | Number |
| Relay 1 | switch_binary3 | switch_binary | Switch | Switch |
| Relay 2 | switch_binary4 | switch_binary | Switch | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the MIMO2+ Dual Digital or Analog Voltage input and Dual Contact Relay.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Relay 1 Trigger Interval | Momentary trigger time in 100ms intervals, 10=1s, 0=disable |
| 1: Relay 1 Trigger Configuration | Relay 1 Trigger on Sensor Input |
| 2: Relay 2 Trigger Interval | Momentary trigger time in 100ms intervals, 10=1s, 0=disable |
| 2: Relay 2 Trigger Configuration | Relay 2 Trigger on Sensor Input |
| 3: Sensor 1 Report Interval | Report sensor state every (30s resolution, 0=none, 1=30s, 10=5m, 63=31.5m) |
| 3: Sensor 1 Report Mode | Report state periodically or on change |
| 3: Sensor 1 Trigger Mode | Trigger Inside or Outside Low/High Thresholds |
| 4: Sensor 1 Lower Threshold High |  |
| 5: Sensor 1 Lower Threshold Low |  |
| 6: Sensor 1 Upper Threshold High |  |
| 7: Sensor 1 Upper Threshold Low |  |
| 9: Sensor 1 Report Interval | Report sensor state every (30s resolution, 0=none, 1=30s, 10=5m, 63=31.5m) |
| 9: Sensor 2 Report Mode | Report state periodically or on change |
| 9: Sensor 2 Trigger Mode | Trigger Inside or Outside Low/High Thresholds |
| 10: Sensor 2 Lower Threshold High |  |
| 11: Sensor 2 Lower Threshold Low |  |
| 12: Sensor 2 Upper Threshold High |  |
| 13: Sensor 2 Upper Threshold Low |  |
| 1: Lifeline |  |
| 2: Sensor 1 On Change |  |
| 3: Sensor 2 On Change |  |


#### 1: Relay 1 Trigger Interval

Momentary trigger time in 100ms intervals, 10=1s, 0=disable


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1_0000001F |
| Data Type        | INTEGER |
| Range | 0 to 31 |
| Default Value | 0 |


#### 1: Relay 1 Trigger Configuration

Relay 1 Trigger on Sensor Input


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1_000000E0 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disabled (0) |
|  | Trigger on Sensor 1 (32) |
|  | Trigger on Sensor 2 (64) |
|  | Trigger on Sensor 1 or Sensor 2 (96) |
|  | Trigger on Sensor 1 and Sensor 2 (128) |
|  | Trigger on Sensor 1 and/or Sensor 2 (224) |


#### 2: Relay 2 Trigger Interval

Momentary trigger time in 100ms intervals, 10=1s, 0=disable


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1_0000001F |
| Data Type        | INTEGER |
| Range | 0 to 31 |
| Default Value | 0 |


#### 2: Relay 2 Trigger Configuration

Relay 2 Trigger on Sensor Input


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1_000000E0 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disabled (0) |
|  | Trigger on Sensor 1 (32) |
|  | Trigger on Sensor 2 (64) |
|  | Trigger on Sensor 1 or Sensor 2 (96) |
|  | Trigger on Sensor 1 and Sensor 2 (128) |
|  | Trigger on Sensor 1 and/or Sensor 2 (224) |


#### 3: Sensor 1 Report Interval

Report sensor state every (30s resolution, 0=none, 1=30s, 10=5m, 63=31.5m)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1_0000003F |
| Data Type        | INTEGER |
| Range | 0 to 63 |
| Default Value | 0 |


#### 3: Sensor 1 Report Mode

Report state periodically or on change


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1_00000040 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Periodically (0) |
|  | On Change (1) |


#### 3: Sensor 1 Trigger Mode

Trigger Inside or Outside Low/High Thresholds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1_00000080 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Outside (0) |
|  | Inside (1) |


#### 4: Sensor 1 Lower Threshold High


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_2 |
| Data Type        | INTEGER |
| Range | 0 to 4095 |
| Default Value | 0 |


#### 5: Sensor 1 Lower Threshold Low


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_2 |
| Data Type        | INTEGER |
| Range | 0 to 4095 |
| Default Value | 0 |


#### 6: Sensor 1 Upper Threshold High


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_2 |
| Data Type        | INTEGER |
| Range | 0 to 4095 |
| Default Value | 0 |


#### 7: Sensor 1 Upper Threshold Low


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_2 |
| Data Type        | INTEGER |
| Range | 0 to 4095 |
| Default Value | 0 |


#### 9: Sensor 1 Report Interval

Report sensor state every (30s resolution, 0=none, 1=30s, 10=5m, 63=31.5m)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1_0000003F |
| Data Type        | INTEGER |
| Range | 0 to 63 |
| Default Value | 0 |


#### 9: Sensor 2 Report Mode

Report state periodically or on change


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1_00000040 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Periodically (0) |
|  | On Change (1) |


#### 9: Sensor 2 Trigger Mode

Trigger Inside or Outside Low/High Thresholds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1_00000080 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Outside (0) |
|  | Inside (1) |


#### 10: Sensor 2 Lower Threshold High


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_2 |
| Data Type        | INTEGER |
| Range | 0 to 4095 |
| Default Value | 0 |


#### 11: Sensor 2 Lower Threshold Low


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER |
| Range | 0 to 4095 |
| Default Value | 0 |


#### 12: Sensor 2 Upper Threshold High


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 4095 |
| Default Value | 0 |


#### 13: Sensor 2 Upper Threshold Low


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_2 |
| Data Type        | INTEGER |
| Range | 0 to 4095 |
| Default Value | 0 |


#### 1: Lifeline


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Sensor 1 On Change


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Sensor 2 On Change


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/700).
