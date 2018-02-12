---
layout: documentation
title: doorSensor - ZWave
---

{% include base.html %}

# doorSensor Door Sensor

This describes the Z-Wave device *doorSensor*, manufactured by *BeNext* with the thing type UID of ```benext_doorsensor_00_000```. 

Door Sensor


## Channels
The following table summarises the channels available for the doorSensor Door Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Door Sensor | sensor_door | sensor_door | Door | Contact |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Alarm (CO) | alarm_co | alarm_co | Door | Switch |
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
The following table provides a summary of the configuration parameters available in the doorSensor Door Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Reset to factory settings | Set all configuration values to default values (factory settings). |
| 2: External contact behavior | Configure what the external contact sends when triggered. |
| 5: Operating mode. | The main operating mode for the device. |
| 6: Temperature offset | An offset for the temperature. |
| 1: Send frame to every node in this group (internal contact) |  |
| 2: Send frame to every node in this group (external contact) |  |


#### 1: Reset to factory settings

Set all configuration values to default values (factory settings).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 2: External contact behavior

Configure what the external contact sends when triggered.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Send alarm (0) |
|  | Send basic frame (1) |


#### 5: Operating mode.

The main operating mode for the device.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Normal (1) |
|  | Mode 1 report (2) |
|  | Always-on (3) |


#### 6: Temperature offset

An offset for the temperature.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_2 |
| Data Type        | INTEGER |
| Range | -32768 to 32767 |
| Default Value | 0 |


#### 1: Send frame to every node in this group (internal contact)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Send frame to every node in this group (external contact)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/223).
