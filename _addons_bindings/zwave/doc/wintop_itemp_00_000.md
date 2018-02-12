---
layout: documentation
title: ITEMP - ZWave
---

{% include base.html %}

# ITEMP Contact and temperature sensor

This describes the Z-Wave device *ITEMP*, manufactured by *Wintop* with the thing type UID of ```wintop_itemp_00_000```. 

Contact and temperature sensor


## Channels
The following table summarises the channels available for the ITEMP Contact and temperature sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Alarm (CO2) | alarm_co2 | alarm_co2 | Door | Switch |
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
The following table provides a summary of the configuration parameters available in the ITEMP Contact and temperature sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Reset to factory default | Delete configuration but keeps inclusion |
| 2: Command sent on external dry contact | Configure what te external contact sends when trigger |
| 5: Operating Mode | Defines if the sensor is in normal wakeup mode or always on (drains battery fast) |
| 6: Temperature Offset | Can be used to calibrate the temperature sensors function. Calibrated as factory default. |
| 1: Binary input Group |  |
| 2: Alarm Group |  |


#### 1: Reset to factory default

Delete configuration but keeps inclusion


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No (default) (0) |
|  | Execute reset (1) |


#### 2: Command sent on external dry contact

Configure what te external contact sends when trigger


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Alarm Resport Type 2 (default) (0) |
|  | Basic On or Basic Off (1) |


#### 5: Operating Mode

Defines if the sensor is in normal wakeup mode or always on (drains battery fast)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Normal Wakeup (default) (1) |
|  | Always awake (3) |


#### 6: Temperature Offset

Can be used to calibrate the temperature sensors function. Calibrated as factory default.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_2 |
| Data Type        | INTEGER |
| Range | 0 to 15300 |
| Default Value | 0 |


#### 1: Binary input Group


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Alarm Group


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/216).
