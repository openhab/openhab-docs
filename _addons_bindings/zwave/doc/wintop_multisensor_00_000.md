---
layout: documentation
title: Multisensor - ZWave
---

{% include base.html %}

# Multisensor Multi-sensor

This describes the Z-Wave device *Multisensor*, manufactured by *Wintop* with the thing type UID of ```wintop_multisensor_00_000```. 

Multi-sensor


## Channels
The following table summarises the channels available for the Multisensor Multi-sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Alarm | alarm_general | alarm_general | Door | Switch |
|  | battery-level | system.battery-level |  |  |
| Sensor (temperature) 1 | sensor_temperature1 | sensor_temperature | Temperature | Number |
| Sensor (luminance) 2 | sensor_luminance2 | sensor_luminance | Temperature | Number |


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
The following table provides a summary of the configuration parameters available in the Multisensor Multi-sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Set to default | Set all config values to default values (factory settings). |
| 2: Mode Timeout | The time used in mode 2 to turn the sensor off . |
| 3: Switch off time | Switch off time starts after timeout. |
| 4: Sensitivity | The sensitivity of the motion circuit |
| 5: Mode | The mode that is entered after detection |
| 6: The temperature offset | An offset for the temperature. |
| 1: Group 1 |  |


#### 1: Set to default

Set all config values to default values (factory settings).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 2: Mode Timeout

The time used in mode 2 to turn the sensor off .  


##### Overview 

The time used in mode 2 to turn the sensor off . 

This Time will start running as soon as detection is seen.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 0 to 3600 |
| Default Value | 900 |


#### 3: Switch off time

Switch off time starts after timeout.  


##### Overview 

The switch off time will start running as soon as mode timeout is done. Motion sensor is turned on and when movement is de tected again the mode timeout (cfg param 1) will start running all over again. When switch off time is done a basic off message is s


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 0 to 7200 |
| Default Value | 2700 |


#### 4: Sensitivity

The sensitivity of the motion circuit


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 80 |


#### 5: Mode

The mode that is entered after detection  


##### Overview 

Normal operation mode is default.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 1 to 3 |
| Default Value | 2 |


#### 6: The temperature offset

An offset for the temperature.  


##### Overview 

Param1,2: A signed integer to determine the offset off the temperature.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_2 |
| Data Type        | INTEGER |
| Range | -10 to 10 |
| Default Value | 0 |


#### 1: Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/326).
