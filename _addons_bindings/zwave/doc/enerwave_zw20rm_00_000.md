---
layout: documentation
title: ZW20RM - ZWave
---

{% include base.html %}

# ZW20RM In-wall Smart Meter Duplex Receptacle

This describes the Z-Wave device *ZW20RM*, manufactured by *Wenzhou MTLC Electric Appliances Co.,Ltd.* with the thing type UID of ```enerwave_zw20rm_00_000```. 

In-wall Smart Meter Duplex Receptacle


## Channels
The following table summarises the channels available for the ZW20RM In-wall Smart Meter Duplex Receptacle.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Sensor (power) | sensor_power | sensor_power | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |


### Dimmer

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZW20RM In-wall Smart Meter Duplex Receptacle.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1:  | Synchronization of load power and LED indicator |
| 8:  | Instant Energy Autosend Interval (send METER\_REPORT) |
| 9:  | Instant Energy Autosend interval (send SENSOR\_MULTILEVEL\_REPORT) |
| 10:  | Accumulated Energy Autosend Interval report (send METER\_REPORT) |
| 11:  | Enable automatic notifications to associated device |
| 12:  | Minimum change in wattage report |
| 1: Notifications | Lifeline |
| 2: StatusReport | Send basic report |
| 3: PowerReport | Send meter power report |


#### 1: 

Synchronization of load power and LED indicator


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Power on, LED off (0) |
|  | Power on, LED on (1) |


#### 8: 

Instant Energy Autosend Interval (send METER\_REPORT)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 9: 

Instant Energy Autosend interval (send SENSOR\_MULTILEVEL\_REPORT)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 10: 

Accumulated Energy Autosend Interval report (send METER\_REPORT)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 11: 

Enable automatic notifications to associated device  


##### Overview 

Device will send a notification whenever the is a wattage change


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Not report (METER_REPORT) (0) |
|  | Send (METER_REPORT) only (1) |
|  | Send (SENSOR_MULTI_LEVEL_REPORT) only (2) |
|  | Send both (3) |


#### 12: 

Minimum change in wattage report  


##### Overview 

0-255: 0.0-25.5W


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 10 |


#### 1: Notifications

Lifeline


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: StatusReport

Send basic report


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: PowerReport

Send meter power report


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/383).
