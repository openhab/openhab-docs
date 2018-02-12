---
layout: documentation
title: AZEMT500BB32MA - ZWave
---

{% include base.html %}

# AZEMT500BB32MA American Standard Z-Wave Programmable Thermostat

This describes the Z-Wave device *AZEMT500BB32MA*, manufactured by *Trane Corporation* with the thing type UID of ```trane_azemt500bb32ma_00_000```. 

American Standard Z-Wave Programmable Thermostat


## Channels
The following table summarises the channels available for the AZEMT500BB32MA American Standard Z-Wave Programmable Thermostat.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number |
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Thermostat mode | thermostat_mode | trane_azemt500bb32ma_00_000_thermostat_mode | Temperature | Number |
| Thermostat Operating State | thermostat_state | thermostat_state | Temperature | Number |
| Setpoint (heating) | thermostat_setpoint_heating | thermostat_setpoint | Temperature | Number |
| Setpoint (cooling) | thermostat_setpoint_cooling | thermostat_setpoint | Temperature | Number |
| Thermostat fan mode | thermostat_fanmode | trane_azemt500bb32ma_00_000_thermostat_fanmode | Temperature | Number |
| Thermostat fan state | thermostat_fanstate | trane_azemt500bb32ma_00_000_thermostat_fanstate | Temperature | Number |
| Clock Time Offset | time_offset | time_offset | Temperature | Number |


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


### Clock Time Offset

#### Automatic Update Offset

The number of seconds difference in the time before it is reset  
Setting this will automatically update the devices clock when the time difference between the device, and the computer exceeds this number of seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_offset |
| Data Type        | INTEGER |
| Range | 10 to 600 || Default Value | 60 |
| Options | Disable Auto Update (0) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the AZEMT500BB32MA American Standard Z-Wave Programmable Thermostat.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 132: Schedule Mode |  |
| 1: Reports |  |


#### 132: Schedule Mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_132_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Hold (0) |
|  | Schedule (1) |


#### 1: Reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/572).
