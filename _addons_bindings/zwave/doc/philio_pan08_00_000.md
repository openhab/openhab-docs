---
layout: documentation
title: PAN08 - ZWave
---

{% include base.html %}

# PAN08 Relay Insert for Blind Control

This describes the Z-Wave device *PAN08*, manufactured by *Philio Technology Corp* with the thing type UID of ```philio_pan08_00_000```. 

Relay Insert for Blind Control


## Channels
The following table summarises the channels available for the PAN08 Relay Insert for Blind Control.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Blinds Control | blinds_control | blinds_control | Blinds | Rollershutter |
| Scene Number | scene_number | scene_number |  | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (power factor) | meter_powerfactor | meter_powerfactor | Energy | Number |
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number |
| Electric meter (amps) | meter_current | meter_current | Energy | Number |
| Alarm | alarm_general | alarm_general | Door | Switch |


### Blinds Control

#### Invert control

Invert the blinds control


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_invert_control |
| Data Type        | BOOLEAN || Default Value | false |
| Options | Yes (true) |
|  | No (false) |


#### Invert percentage value

Invert the blinds percentage value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_invert_percent |
| Data Type        | BOOLEAN || Default Value | false |
| Options | Yes (true) |
|  | No (false) |


#### Step duration

Sets the dim rate speed  
Values from 1 to 127 are defined in seconds, while values from 128 to 254 are defined in minutes.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_duration |
| Data Type        | INTEGER |
| Range | 1 to 254 || Default Value | 255 |
| Options | Device Default (255) |
|  | Change Instantly (0) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the PAN08 Relay Insert for Blind Control.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Watt meter report interval (5s) | Interval (x5 seconds) to send out watt meter report |
| 2: KWH Meter Report Interval (10min) | Interval (x10 minutes) to send out KWH Meter Report |
| 3: Threshold for Load Caution (10mA) | Threshold (x0.01A) of current for Load Caution |
| 4: Threshold of KWh for Load Caution |  |
| 1: Blind Control |  |


#### 1: Watt meter report interval (5s)

Interval (x5 seconds) to send out watt meter report


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 1 to 32767 |
| Default Value | 720 |


#### 2: KWH Meter Report Interval (10min)

Interval (x10 minutes) to send out KWH Meter Report


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 1 to 32767 |
| Default Value | 6 |


#### 3: Threshold for Load Caution (10mA)

Threshold (x0.01A) of current for Load Caution


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 1 to 1100 |
| Default Value | 1100 |


#### 4: Threshold of KWh for Load Caution


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_2 |
| Data Type        | INTEGER |
| Range | 1 to 10000 |
| Default Value | 10000 |


#### 1: Blind Control


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/175).
