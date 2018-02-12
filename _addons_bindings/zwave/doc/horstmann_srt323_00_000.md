---
layout: documentation
title: SRT323 - ZWave
---

{% include base.html %}

# SRT323 Secure Z-Wave Room Thermostat

This describes the Z-Wave device *SRT323*, manufactured by *Horstmann Controls Limited* with the thing type UID of ```horstmann_srt323_00_000```. 

Secure Z-Wave Room Thermostat


## Channels
The following table summarises the channels available for the SRT323 Secure Z-Wave Room Thermostat.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Thermostat mode | thermostat_mode | horstmann_srt323_00_000_thermostat_mode | Temperature | Number |
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
The following table provides a summary of the configuration parameters available in the SRT323 Secure Z-Wave Room Thermostat.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: 1: Temperature Sensor | Disable or enable temperature sensor |
| 2: 2: Temperature Scale | Temperature Scale |
| 3: 3: Delta T | Define the temperature steps |
| 1: 1: Lifeline |  |
| 2: 2: Nodes to receive Thermostat Operating State reports |  |
| 3: 3: Nodes to receive unsolicited Low Battery Warnings |  |
| 4: 4: Nodes to receive unsolicited Thermostat Set Point Reports |  |
| 5: 5: Nodes to receive unsolicited Multilevel Sensor Reports |  |


#### 1: 1: Temperature Sensor

Disable or enable temperature sensor


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | Disabled (0) |
|  | Enabled (255) |


#### 2: 2: Temperature Scale

Temperature Scale


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (255) |


#### 3: 3: Delta T

Define the temperature steps  


##### Overview 

Change between temperatures to trigger a temperature report (step 0.1) (Default 10 = 1C)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 10 |


#### 1: 1: Lifeline


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: 2: Nodes to receive Thermostat Operating State reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: 3: Nodes to receive unsolicited Low Battery Warnings


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: 4: Nodes to receive unsolicited Thermostat Set Point Reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: 5: Nodes to receive unsolicited Multilevel Sensor Reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/466).
