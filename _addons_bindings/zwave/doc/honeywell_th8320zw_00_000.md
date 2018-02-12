---
layout: documentation
title: TH8320ZW - ZWave
---

{% include base.html %}

# TH8320ZW VisionPRO Z-Wave Touchscreen Programmable Thermostat

This describes the Z-Wave device *TH8320ZW*, manufactured by *Honeywell* with the thing type UID of ```honeywell_th8320zw_00_000```. 

VisionPRO Z-Wave Touchscreen Programmable Thermostat


## Channels
The following table summarises the channels available for the TH8320ZW VisionPRO Z-Wave Touchscreen Programmable Thermostat.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Thermostat mode | thermostat_mode | honeywell_th8320zw_00_000_thermostat_mode | Temperature | Number |
| Thermostat Operating State | thermostat_state | thermostat_state | Temperature | Number |
| Setpoint (heating) | thermostat_setpoint_heating | thermostat_setpoint | Temperature | Number |
| Setpoint (cooling) | thermostat_setpoint_cooling | thermostat_setpoint | Temperature | Number |
| Thermostat fan mode | thermostat_fanmode | honeywell_th8320zw_00_000_thermostat_fanmode | Temperature | Number |
| Thermostat fan state | thermostat_fanstate | honeywell_th8320zw_00_000_thermostat_fanstate | Temperature | Number |


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


### Setpoint (cooling)

#### Scale

Select the scale to use for setpoints.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the TH8320ZW VisionPRO Z-Wave Touchscreen Programmable Thermostat.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Relationship of devices in the network |  |


#### 1: Relationship of devices in the network


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/182).
