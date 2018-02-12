---
layout: documentation
title: HRT4-ZW - ZWave
---

{% include base.html %}

# HRT4-ZW Battery Powered Wall Thermostat

This describes the Z-Wave device *HRT4-ZW*, manufactured by *Horstmann Controls Limited* with the thing type UID of ```horstmann_hrt4zw_00_000```. 

Battery Powered Wall Thermostat  


## Overview 

**Note**: This device is also sold as Secure SRT321


## Channels
The following table summarises the channels available for the HRT4-ZW Battery Powered Wall Thermostat.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Thermostat mode | thermostat_mode | horstmann_hrt4zw_00_000_thermostat_mode | Temperature | Number |
| Setpoint (heating) | thermostat_setpoint_heating | thermostat_setpoint | Temperature | Number |
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


### Setpoint (heating)

#### Scale

Select the scale to use for setpoints.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the HRT4-ZW Battery Powered Wall Thermostat.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Enable Temperature Sensor | Controls the use of the temperature sensor on the device |
| 2: Temperature Scale | Controls the temperature sensor scale |
| 3: Delta T | Defines the temperature steps of the heating control. Steps are 0.1 K |
| 1: Thermostat Mode Set |  |
| 2: Binary Switch Set |  |
| 3: Unsolicited Battery Level Reports |  |
| 4: Thermostat Set Point Reports |  |
| 5: Unsolicited Sensor Multilevel Reports |  |


#### 1: Enable Temperature Sensor

Controls the use of the temperature sensor on the device


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (255) |


#### 2: Temperature Scale

Controls the temperature sensor scale


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (255) |


#### 3: Delta T

Defines the temperature steps of the heating control. Steps are 0.1 K


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 10 |


#### 1: Thermostat Mode Set


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Binary Switch Set


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Unsolicited Battery Level Reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Thermostat Set Point Reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Unsolicited Sensor Multilevel Reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/20).
