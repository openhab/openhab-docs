---
layout: documentation
title: SCSC-17 - ZWave
---

{% include base.html %}

# SCSC-17 7 Day Room Thermostat

This describes the Z-Wave device *SCSC-17*, manufactured by *Horstmann Controls Limited* with the thing type UID of ```horstmann_scsc17_00_000```. 

7 Day Room Thermostat


## Channels
The following table summarises the channels available for the SCSC-17 7 Day Room Thermostat.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Thermostat mode | thermostat_mode | horstmann_scsc17_00_000_thermostat_mode | Temperature | Number |
| Thermostat Operating State | thermostat_state | thermostat_state | Temperature | Number |
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
The following table provides a summary of the configuration parameters available in the SCSC-17 7 Day Room Thermostat.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Temperature Scale | Controls the temperature sensor scale |
| 2: Lower temperature limit | Defines the minimum temperature. Steps are 1C |
| 3: Upper temperature limit | Defines the maximum temperature. Steps are 1C |
| 4: Delta T | Defines the temperature steps of the heating control value is 0.1 °С. |
| 1: Reports |  |
| 2: Control |  |


#### 1: Temperature Scale

Controls the temperature sensor scale


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Celsius (0) |
|  | Kelvin (255) |


#### 2: Lower temperature limit

Defines the minimum temperature. Steps are 1C


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 5 |


#### 3: Upper temperature limit

Defines the maximum temperature. Steps are 1C


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 5 |


#### 4: Delta T

Defines the temperature steps of the heating control value is 0.1 °С.  
1 0.1 ̊C / ̊F - 50 0.1 ̊C / ̊F


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 5 |


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
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/21).
