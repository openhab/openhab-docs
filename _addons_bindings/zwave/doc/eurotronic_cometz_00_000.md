---
layout: documentation
title: CometZ - ZWave
---

{% include base.html %}

# CometZ Thermostatic Valve

This describes the Z-Wave device *CometZ*, manufactured by *Eurotronics* with the thing type UID of ```eurotronic_cometz_00_000```. 

Thermostatic Valve


## Channels
The following table summarises the channels available for the CometZ Thermostatic Valve.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Openness Of The Valve | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Temperature measured by the device | sensor_temperature | sensor_temperature | Temperature | Number |
| Thermostat mode | thermostat_mode | eurotronic_cometz_00_000_thermostat_mode | Temperature | Number |
| Temperature for Heat (Eco) | thermostat_setpoint_furnace | thermostat_setpoint | Temperature | Number |
| Temperature for Heat (Comfort) | thermostat_setpoint_heating | thermostat_setpoint | Temperature | Number |
|  | battery-level | system.battery-level |  |  |


### Openness Of The Valve

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Temperature measured by the device

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Temperature for Heat (Eco)

#### Scale

Select the scale to use for setpoints.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Temperature for Heat (Comfort)

#### Scale

Select the scale to use for setpoints.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the CometZ Thermostatic Valve.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/372).
