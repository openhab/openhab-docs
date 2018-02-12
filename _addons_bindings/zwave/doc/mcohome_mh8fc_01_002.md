---
layout: documentation
title: MH8-FC - ZWave
---

{% include base.html %}

# MH8-FC Fan Coil Thermostat

This describes the Z-Wave device *MH8-FC*, manufactured by *McoHome Technology Co., Ltd* with the thing type UID of ```mcohome_mh8fc_01_002```. 

Fan Coil Thermostat


## Channels
The following table summarises the channels available for the MH8-FC Fan Coil Thermostat.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Thermostat mode | thermostat_mode | mcohome_mh8fc_01_002_thermostat_mode | Temperature | Number |
| Thermostat Operating State | thermostat_state | thermostat_state | Temperature | Number |
| Setpoint (cooling) | thermostat_setpoint_cooling | thermostat_setpoint | Temperature | Number |
| Setpoint (heating) | thermostat_setpoint_heating | thermostat_setpoint | Temperature | Number |
| Thermostat fan mode | thermostat_fanmode | mcohome_mh8fc_01_002_thermostat_fanmode | Temperature | Number |
| Thermostat fan state | thermostat_fanstate | mcohome_mh8fc_01_002_thermostat_fanstate | Temperature | Number |


### Sensor (temperature)

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Setpoint (cooling)

#### Scale

Select the scale to use for setpoints.


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
The following table provides a summary of the configuration parameters available in the MH8-FC Fan Coil Thermostat.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Gateway | For sending temperature, working mode, etc. notifications |


#### 1: Gateway

For sending temperature, working mode, etc. notifications


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/336).
