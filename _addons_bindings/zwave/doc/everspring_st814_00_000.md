---
layout: documentation
title: ST814 - ZWave
---

{% include base.html %}

# ST814 Temperature and Humidity Sensor

This describes the Z-Wave device *ST814*, manufactured by *Everspring* with the thing type UID of ```everspring_st814_00_000```. 

Temperature and Humidity Sensor


## Channels
The following table summarises the channels available for the ST814 Temperature and Humidity Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Alarm (CO2) | alarm_co2 | alarm_co2 | Door | Switch |
| Alarm (smoke) | alarm_smoke | alarm_smoke | Door | Switch |
|  | battery-level | system.battery-level |  |  |
| Sensor (temperature) 1 | sensor_temperature1 | sensor_temperature | Temperature | Number |
| Sensor (relative humidity) 2 | sensor_relhumidity2 | sensor_relhumidity | Humidity | Number |


### Sensor (temperature)

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Sensor (temperature) 1

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ST814 Temperature and Humidity Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Basic Set Level | Set basic set value to be on or off |
| 2: Temperature Trigger ON value | Temperature level when a ON command is sent out. Set to 99 to disable. |
| 3: Temperature Trigger OFF value | Temperature level when a OFF command is sent out. Set to 99 to disable. |
| 4: Humidity Trigger ON value | Humidity level when a ON command is sent out. Set to 99 to disable. |
| 5: Humidity Trigger OFF value | Humidity level when a OFF command is sent out. Set to 99 to disable. |
| 6: Auto report time | Sets the time interval when a sensor report is sent |
| 7: Auto report temperature | Sets the temperature change causing a sensor report. |
| 8: Auto report humidity | Sets the humidity change causing a sensor report. |
| 1: Reports |  |
| 2: Control |  |


#### 1: Basic Set Level

Set basic set value to be on or off  


##### Overview 

0=Disable

1-99=Use Value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 99 || Default Value | 99 |
| Options | Disable (0) |


#### 2: Temperature Trigger ON value

Temperature level when a ON command is sent out. Set to 99 to disable.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | -20 to 50 || Default Value | 99 |
| Options | Disable (99) |


#### 3: Temperature Trigger OFF value

Temperature level when a OFF command is sent out. Set to 99 to disable.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | -20 to 50 || Default Value | 99 |
| Options | Disable (99) |


#### 4: Humidity Trigger ON value

Humidity level when a ON command is sent out. Set to 99 to disable.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 20 to 90 || Default Value | 99 |
| Options | Disable (99) |


#### 5: Humidity Trigger OFF value

Humidity level when a OFF command is sent out. Set to 99 to disable.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 20 to 99 || Default Value | 99 |
| Options | Disable (99) |


#### 6: Auto report time

Sets the time interval when a sensor report is sent  


##### Overview 

0 = Disable

1 min - 1439 min = Auto report periodically


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_2 |
| Data Type        | INTEGER |
| Range | 0 to 1439 || Default Value | 0 |
| Options | Disable (0) |


#### 7: Auto report temperature

Sets the temperature change causing a sensor report.  


##### Overview 

0 = Disable

1 - 70 = Auto report on temperature change


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 0 to 70 || Default Value | 0 |
| Options | Disable (0) |


#### 8: Auto report humidity

Sets the humidity change causing a sensor report.  


##### Overview 

0 = Disable

5 - 70 = Auto report on humidity change


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 5 to 70 || Default Value | 0 |
| Options | Disable (0) |


#### 1: Reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Control


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/31).
