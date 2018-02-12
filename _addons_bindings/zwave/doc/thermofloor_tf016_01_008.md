---
layout: documentation
title: TF016 - ZWave
---

{% include base.html %}

# TF016 ZWave Thermostat

This describes the Z-Wave device *TF016*, manufactured by *ThermoFloor* with the thing type UID of ```thermofloor_tf016_01_008```. 

ZWave Thermostat


## Channels
The following table summarises the channels available for the TF016 ZWave Thermostat.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Thermostat mode | thermostat_mode | thermofloor_tf016_01_008_thermostat_mode | Temperature | Number |
| Setpoint (heating) | thermostat_setpoint_heating | thermostat_setpoint | Temperature | Number |
| Setpoint (heating economy) | thermostat_setpoint_heating_econ | thermostat_setpoint | Temperature | Number |
| Setpoint (furnace) | thermostat_setpoint_furnace | thermostat_setpoint | Temperature | Number |
| Sensor mode | config_decimal_param2 | thermofloor_tf016_01_008_config_decimal_param2 |  | Number |


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


### Setpoint (heating economy)

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


### Device Configuration
The following table provides a summary of the configuration parameters available in the TF016 ZWave Thermostat.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Operation mode |  |
| 2: Sensor mode |  |
| 3: Floor sensor type |  |
| 4: DIFF l. Temperature control Hysteresis | Range 3-30 (0.3°C 3.0°C) |
| 5: FLo, Floor min limit | Range 50-400 (5.0°C 40.0°C) |
| 6: FHi, Floor max limit | Range 50-400 (5.0°C 40.0°C) |
| 7: ALo, Air min limit | Range 50-400 (5.0°C 40.0°C) |
| 8: AHi, Air max limit | Range 50-400 (5.0°C 40.0°C) |
| 9: PLo, FP-mode P setting |  |
| 10: CO mode setpoint | Range 50-400 (5.0°C 40.0°C) |
| 11: ECO mode setpoint | Range 50-400 (5.0°C 40.0°C) |
| 12: P setting |  |
| 13: COOL setpoint | Only if cooling enabled. Range 50-400 (5.0°C 40.0°C) |
| 1: Lifeline |  |
| 2: On/Off control |  |


#### 1: Operation mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | OFF (0) |
|  | HEAT (1) |
|  | COOL (2) |
|  | ENERGY SAVE HEAT (11) |


#### 2: Sensor mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | F-mode (0) |
|  | A-mode (1) |
|  | AF-mode (2) |
|  | A2-mode (3) |
|  | P-mode (4) |
|  | FP-mode (5) |


#### 3: Floor sensor type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 10k NTC (0) |
|  | 12k NTC (1) |
|  | 15k NTC (2) |
|  | 22k NTC (3) |
|  | 33k NTC (4) |
|  | 47k NTC (5) |


#### 4: DIFF l. Temperature control Hysteresis

Range 3-30 (0.3°C 3.0°C)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_2 |
| Data Type        | INTEGER |
| Range | 3 to 30 |
| Default Value | 5 |


#### 5: FLo, Floor min limit

Range 50-400 (5.0°C 40.0°C)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_2 |
| Data Type        | INTEGER |
| Range | 50 to 400 |
| Default Value | 50 |


#### 6: FHi, Floor max limit

Range 50-400 (5.0°C 40.0°C)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_2 |
| Data Type        | INTEGER |
| Range | 50 to 400 |
| Default Value | 400 |


#### 7: ALo, Air min limit

Range 50-400 (5.0°C 40.0°C)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_2 |
| Data Type        | INTEGER |
| Range | 50 to 400 |
| Default Value | 50 |


#### 8: AHi, Air max limit

Range 50-400 (5.0°C 40.0°C)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_2 |
| Data Type        | INTEGER |
| Range | 50 to 400 |
| Default Value | 400 |


#### 9: PLo, FP-mode P setting


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_2 |
| Data Type        | INTEGER |
| Range | 0 to 9 |
| Default Value | 0 |


#### 10: CO mode setpoint

Range 50-400 (5.0°C 40.0°C)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_2 |
| Data Type        | INTEGER |
| Range | 50 to 400 |
| Default Value | 210 |


#### 11: ECO mode setpoint

Range 50-400 (5.0°C 40.0°C)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER |
| Range | 50 to 400 |
| Default Value | 180 |


#### 12: P setting


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 10 |
| Default Value | 2 |


#### 13: COOL setpoint

Only if cooling enabled. Range 50-400 (5.0°C 40.0°C)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_2 |
| Data Type        | INTEGER |
| Range | 50 to 400 |
| Default Value | 210 |


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
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/412).
