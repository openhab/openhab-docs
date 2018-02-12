---
layout: documentation
title: HKZW_MS01 - ZWave
---

{% include base.html %}

# HKZW_MS01 Multisensor

This describes the Z-Wave device *HKZW_MS01*, manufactured by *Hank* with the thing type UID of ```hank_hkzwms01_00_000```. 

Multisensor


## Channels
The following table summarises the channels available for the HKZW_MS01 Multisensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number |
| Sensor (luminance) | sensor_luminance | sensor_luminance | Temperature | Number |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
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
The following table provides a summary of the configuration parameters available in the HKZW_MS01 Multisensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 12: Motion Sensor&#x60;s Sensitivity | The higher the value,the more sensitive the PIR sensor |
| 14: Enable/Disable Basic Set Command | The motion Sensor can reverse its value of BASIC SET when motion is triggered |
| 15: value of basic set command |  |
| 1: Lifeline | Reports the motion detection and battery |
| 2: Basic Set | assigned to send Basic Set Command |


#### 12: Motion Sensor&#x60;s Sensitivity

The higher the value,the more sensitive the PIR sensor


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER || Default Value | 8 |
| Options | 1 (1) |
|  | 2 (2) |
|  | 3 (3) |
|  | 4 (4) |
|  | 5 (5) |
|  | 6 (6) |
|  | 7 (7) |
|  | 8 (8) |


#### 14: Enable/Disable Basic Set Command

The motion Sensor can reverse its value of BASIC SET when motion is triggered


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (1) |


#### 15: value of basic set command


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | send off (0) |
|  | send on (1) |


#### 1: Lifeline

Reports the motion detection and battery  


##### Overview 

Reports the motion detection and battery


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Basic Set

assigned to send Basic Set Command


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/675).
