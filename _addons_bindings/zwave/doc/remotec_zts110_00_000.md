---
layout: documentation
title: ZTS-110 - ZWave
---

{% include base.html %}

# ZTS-110 ZTS-110 Z Wave Thermostat

This describes the Z-Wave device *ZTS-110*, manufactured by *Remotec* with the thing type UID of ```remotec_zts110_00_000```. 

ZTS-110 Z Wave Thermostat


## Channels
The following table summarises the channels available for the ZTS-110 ZTS-110 Z Wave Thermostat.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Thermostat mode | thermostat_mode | remotec_zts110_00_000_thermostat_mode | Temperature | Number |
| Thermostat Operating State | thermostat_state | thermostat_state | Temperature | Number |
| Setpoint (cooling) | thermostat_setpoint_cooling | thermostat_setpoint | Temperature | Number |
| Setpoint (heating) | thermostat_setpoint_heating | thermostat_setpoint | Temperature | Number |
| Thermostat fan mode | thermostat_fanmode | remotec_zts110_00_000_thermostat_fanmode | Temperature | Number |
| Thermostat fan state | thermostat_fanstate | remotec_zts110_00_000_thermostat_fanstate | Temperature | Number |
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
The following table provides a summary of the configuration parameters available in the ZTS-110 ZTS-110 Z Wave Thermostat.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Swing | Set Swing value from 1F/.5C to 4F/2.0C Available settings: 1 - 4 |
| 2: Differntial | Set Differential value from 1F/.5C to 4F/2.0C Available settings: 1 - 4 |
| 3: Set Filter Counter | Set filter replacement timer from 500 to 4000 hours. |
| 4: Report Filter Counter | READ ONLY: Data in hours |
| 5: Scale of Temperature | Set Temperature Scale to Farhenheit or Centigrade. DEFAULT =1 Farhenheit |
| 6: Upper Limit of Setpoint A | Determines Upper Limit of set point A. Unit in celsius A=(B+2)min (37.0 C)max, Unit in Fah... |
| 7: Lower Limit of Setpoint B | Determines Lower Limit of set point B. Unit in celsius (5.0 C to 35.0 C) Unit in Fahrenhei... |
| 8: Easy Mode | Set Easy Mode 0:DISABLE 1:ENABLED DEFAULT:ENABLED |
| 9: Time Format | Configures for 12 or 24 Hour format. Default is 12 Hours. |
| 10: Repeat Basic Set Counter | Thermostat sends 'Basic Set' command to its association node repeatedly ever X minutes. 0 ... |
| 11: Trigger AUTO report if room temperature is different from last report. | 0 = Disabled or set value from 1 to 8 where each number corresponds to 1 Degree F or .5 De... |
| 12: Sensor temperature calibration. | 0 = Disabled or set value from 1 to 10 in 1 degree F increments or -1 to -10 in 1 degree F... |
| 13: AUTO report by time interval. | 0 = Disabled or set value from 1 to 16 where 1 = .5 hours and each consecutive number incr... |
| 1: Heat Pump |  |
| 2: Compressor |  |
| 3: Controller Update |  |


#### 1: Swing

Set Swing value from 1F/.5C to 4F/2.0C Available settings: 1 - 4


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 1 to 4 |
| Default Value | 2 |


#### 2: Differntial

Set Differential value from 1F/.5C to 4F/2.0C Available settings: 1 - 4


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 1 to 4 |
| Default Value | 2 |


#### 3: Set Filter Counter

Set filter replacement timer from 500 to 4000 hours.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 500 to 4000 |
| Default Value | 500 |


#### 4: Report Filter Counter

READ ONLY: Data in hours


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_2 |
| Data Type        | INTEGER |
| Range | 0 to 9999 |
| Default Value | 0 |


#### 5: Scale of Temperature

Set Temperature Scale to Farhenheit or Centigrade. DEFAULT =1 Farhenheit


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Centigrade (0) |
|  | Farhenheit (1) |


#### 6: Upper Limit of Setpoint A

Determines Upper Limit of set point A. Unit in celsius A=(B+2)min (37.0 C)max, Unit in Fahrenheit A=(B+4)min (99.0 F)max


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_2 |
| Data Type        | INTEGER |
| Range | 37 to 99 |
| Default Value | 99 |


#### 7: Lower Limit of Setpoint B

Determines Lower Limit of set point B. Unit in celsius (5.0 C to 35.0 C) Unit in Fahrenheit (41.0 F to 95.0 F)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_2 |
| Data Type        | INTEGER |
| Range | 5 to 95 |
| Default Value | 41 |


#### 8: Easy Mode

Set Easy Mode 0:DISABLE 1:ENABLED DEFAULT:ENABLED


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Easy Mode Disabled (0) |
|  | Easy Mode Enabled (1) |


#### 9: Time Format

Configures for 12 or 24 Hour format. Default is 12 Hours.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | 24 Hour Format (0) |
|  | 12 Hour Format (1) |


#### 10: Repeat Basic Set Counter

Thermostat sends 'Basic Set' command to its association node repeatedly ever X minutes. 0 = Disabled or Set to Enabled Values available 3 to 255.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 11: Trigger AUTO report if room temperature is different from last report.

0 = Disabled or set value from 1 to 8 where each number corresponds to 1 Degree F or .5 Degrees Celsius.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER |
| Range | 0 to 8 |
| Default Value | 4 |


#### 12: Sensor temperature calibration.

0 = Disabled or set value from 1 to 10 in 1 degree F increments or -1 to -10 in 1 degree F increments .


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | -10 to 10 |
| Default Value | 0 |


#### 13: AUTO report by time interval.

0 = Disabled or set value from 1 to 16 where 1 = .5 hours and each consecutive number increases time by .5 hours.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER |
| Range | 0 to 16 |
| Default Value | 0 |


#### 1: Heat Pump


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Compressor


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Controller Update


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/203).
