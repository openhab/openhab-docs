---
layout: documentation
title: DP-32 / IX-30 / IX-32 - ZWave
---

{% include base.html %}

# DP-32 / IX-30 / IX-32 PIR Sensor

This describes the Z-Wave device *DP-32 / IX-30 / IX-32*, manufactured by *Kaipule Technology Co., Ltd.* with the thing type UID of ```kaipule_ix32_06_000```. 

PIR Sensor  


## Overview 

The hardware board for the IX30 (wall) and IX32 (ceiling) is the same thing and reports the same Type and ID.


## Channels
The following table summarises the channels available for the DP-32 / IX-30 / IX-32 PIR Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Motion Alarm | alarm_motion | alarm_motion | Door | Switch |
| Tamper Alarm | alarm_tamper | alarm_tamper |  | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the DP-32 / IX-30 / IX-32 PIR Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Basic Set | If there is any device in Association Group 2 the PIR Sensor will send BASIC Set = Value c... |
| 2: Turn Off Light Time Configuration | If there is any device in Association Group 2 the PIR Sensor will send BASIC Set = Value c... |
| 3: PIR Sensor Alarm Elemination Time Configuration | Min time is 5s. Eg If the config is 1, this means it will eliminate alarm after 1 \* 5s = ... |
| 1: Lifeline | Send "notification\_Report" to the device in Life line group |
| 2: Basic Set Command |  |


#### 1: Basic Set

If there is any device in Association Group 2 the PIR Sensor will send BASIC Set = Value command to control that deivce when the PIR is triggered.  


##### Overview 

If there is any device in Association Group 2 the PIR Sensor will send BASIC Set = Value command to control that deivce when the PIR is triggered.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 |
| Default Value | 255 |


#### 2: Turn Off Light Time Configuration

If there is any device in Association Group 2 the PIR Sensor will send BASIC Set = Value command to Group 2 and send Basic Set = 0x00 to turn of light after 5 x t seconds- Set value t means to send the BAsic Set command after t seconds.  


##### Overview 

If there is any device in Association Group 2 the PIR Sensor will send BASIC Set = Value command to Group 2 and send Basic Set = 0x00 to turn of light after 5 x t seconds- Set value t means to send the BAsic Set command after t seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 1 to 120 |
| Default Value | 20 |


#### 3: PIR Sensor Alarm Elemination Time Configuration

Min time is 5s. Eg If the config is 1, this means it will eliminate alarm after 1 \* 5s = 5 seconds  


##### Overview 

The selected value is multiplied with 5. After this time the sensor will report PIR OFF.

E.g. If you select value --> 3 \* 5s = 15 seconds.

The Sensor will report PIR Off after 15 seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 1 to 120 |
| Default Value | 20 |


#### 1: Lifeline

Send "notification\_Report" to the device in Life line group


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Basic Set Command

  


##### Overview 

When sensor is triggered:

\[Command Class BAsic, Basic Set, Value = 0xFF(default 0xFF, configurable, see Config Parameters)

When light up timeout:

\[Command Class BAsic, BAsic Set, Value =0x00\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/667).
