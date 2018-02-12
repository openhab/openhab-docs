---
layout: documentation
title: TF016 - ZWave
---

{% include base.html %}

# TF016 ZWave Thermostat

This describes the Z-Wave device *TF016*, manufactured by *ThermoFloor* with the thing type UID of ```thermofloor_tf016_00_000```. 

ZWave Thermostat


## Channels
The following table summarises the channels available for the TF016 ZWave Thermostat.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Thermostat mode | thermostat_mode | thermofloor_tf016_00_000_thermostat_mode | Temperature | Number |
| Setpoint (heating) | thermostat_setpoint_heating | thermostat_setpoint | Temperature | Number |
| Setpoint (furnace) | thermostat_setpoint_furnace | thermostat_setpoint | Temperature | Number |
| Setpoint (economy) | thermostat_setpoint_heating_econ | thermostat_setpoint | Temperature | Number |


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


### Setpoint (furnace)

#### Scale

Select the scale to use for setpoints.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Setpoint (economy)

#### Scale

Select the scale to use for setpoints.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the TF016 ZWave Thermostat.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Operation mode | Defines Operation Mode of thermostat |
| 1: Lifeline |  |
| 2: On/Off control |  |


#### 1: Operation mode

Defines Operation Mode of thermostat  


##### Overview 

0....OFF(0x00)

1.....HEAT (0x01)

2.....COOL (0x02)

11....ENERGY SAVE HEAT (0x0B)

Default value 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | OFF (0) |
|  | Heat (1) |
|  | Cool (2) |
|  | ENERGY SAVE HEAT (11) |


#### 1: Lifeline


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: On/Off control


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/247).
