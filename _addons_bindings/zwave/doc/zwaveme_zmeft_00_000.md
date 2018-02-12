---
layout: documentation
title: ZME_FT - ZWave
---

{% include base.html %}

# ZME_FT Floor Thermostat

This describes the Z-Wave device *ZME_FT*, manufactured by *Z-Wave.Me* with the thing type UID of ```zwaveme_zmeft_00_000```. 

Floor Thermostat


## Channels
The following table summarises the channels available for the ZME_FT Floor Thermostat.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Thermostat mode | thermostat_mode | zwaveme_zmeft_00_000_thermostat_mode | Temperature | Number |
| Setpoint (heating) | thermostat_setpoint_heating | thermostat_setpoint | Temperature | Number |
| Setpoint (furnace) | thermostat_setpoint_furnace | thermostat_setpoint | Temperature | Number |


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


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZME_FT Floor Thermostat.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Boost Dry mode duration |  |
| 2: Button mode |  |
| 3: Basic mode |  |
| 4: Temperature control interval |  |
| 5: Maximum allowed temperature deviation |  |
| 6: Maximal allowed temperature | In all modes the thermostat will switch off heating until temperature drops below this lim... |
| 10: Typical click timeout | Typical time used to differenciate click from hold |
| 1: Group 1 | Unsolicited notifications about thermostat mode and setpoint temperature changes |


#### 1: Boost Dry mode duration


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 0 to 1800 |
| Default Value | 1800 |


#### 2: Button mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Toggle Normal Heating / Off (0) |
|  | Toggle Normal Heating / Energy Save (1) |
|  | Toggle Boost Dry (2) |


#### 3: Basic mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Toggle Normal Heating / Off (0) |
|  | Toggle Normal Heating / Energy Save (1) |
|  | Toggle Boost Dry (2) |
|  | Set Normal Heating set point temperature (in 0.1 C units) (3) |
|  | Switch on/off relay directly (only if Thermostat Mode is in Off state) (4) |


#### 4: Temperature control interval


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 1 to 60 |
| Default Value | 18 |


#### 5: Maximum allowed temperature deviation


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 1 to 60 |
| Default Value | 30 |


#### 6: Maximal allowed temperature

In all modes the thermostat will switch off heating until temperature drops below this limit. For wooden and laminate floor maximal allowed temperature is 27 degree. For tile and concrete floor maximal allowed temperature value is 45 degree.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 20 to 55 |
| Default Value | 27 |


#### 10: Typical click timeout

Typical time used to differenciate click from hold


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 |
| Default Value | 50 |


#### 1: Group 1

Unsolicited notifications about thermostat mode and setpoint temperature changes


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/151).
