---
layout: documentation
title: WWA-02 - ZWave
---

{% include base.html %}

# WWA-02 Wireless Water and Temperature Alarm

This describes the Z-Wave device *WWA-02*, manufactured by *FortrezZ LLC* with the thing type UID of ```fortrezz_wwa02_00_000```. 

Wireless Water and Temperature Alarm


## Channels
The following table summarises the channels available for the WWA-02 Wireless Water and Temperature Alarm.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Alarm | alarm_flood | alarm_flood | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Sensor (temperature)

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the WWA-02 Wireless Water and Temperature Alarm.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Low Temperature Trigger Point |  |
| 2: High Temperature Trigger Point |  |
| 1: Water and Temperature Alarms |  |
| 2: Water Alarms |  |
| 3: Temperature Alarms |  |


#### 1: Low Temperature Trigger Point


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 4 |


#### 2: High Temperature Trigger Point


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 70 |


#### 1: Water and Temperature Alarms


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Water Alarms


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Temperature Alarms


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/222).
