---
layout: documentation
title: StellaZ - ZWave
---

{% include base.html %}

# StellaZ Thermostatic Valve

This describes the Z-Wave device *StellaZ*, manufactured by *Eurotronics* with the thing type UID of ```eurotronic_stellaz_00_000```. 

Thermostatic Valve


## Channels
The following table summarises the channels available for the StellaZ Thermostatic Valve.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Thermostat mode | thermostat_mode | eurotronic_stellaz_00_000_thermostat_mode | Temperature | Number |
| Setpoint (furnace) | thermostat_setpoint_heating_econ | thermostat_setpoint | Temperature | Number |
| Setpoint (heating) | thermostat_setpoint_heating | thermostat_setpoint | Temperature | Number |
|  | battery-level | system.battery-level |  |  |


### Dimmer

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Sensor (temperature)

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Setpoint (furnace)

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
The following table provides a summary of the configuration parameters available in the StellaZ Thermostatic Valve.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/183).
