---
layout: documentation
title: ZXT-120 - ZWave
---

{% include base.html %}

# ZXT-120 AC IR Remote

This describes the Z-Wave device *ZXT-120*, manufactured by *Remotec* with the thing type UID of ```remotec_zxt120_00_000```. 

AC IR Remote


## Channels
The following table summarises the channels available for the ZXT-120 AC IR Remote.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Thermostat mode | thermostat_mode | remotec_zxt120_00_000_thermostat_mode | Temperature | Number |
| Setpoint (cooling) | thermostat_setpoint_cooling | thermostat_setpoint | Temperature | Number |
| Setpoint (heating) | thermostat_setpoint_heating | thermostat_setpoint | Temperature | Number |
| Thermostat fan mode | thermostat_fanmode | remotec_zxt120_00_000_thermostat_fanmode | Temperature | Number |
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
The following table provides a summary of the configuration parameters available in the ZXT-120 AC IR Remote.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 25: Indicate a location for IR code learning and start learning |  |
| 26: Learning status register (Read Only) |  |
| 27: IR code number for built-in code library |  |
| 28: External IR Emitter power level |  |
| 32: Surround IR control |  |
| 33: AC function Swing control |  |
| 35: Learn location status. Bitmask. (Read Only) |  |
| 37: Sensor temperature compensation |  |


#### 25: Indicate a location for IR code learning and start learning


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_25_1 |
| Data Type        | INTEGER |
| Range | 0 to 22 |
| Default Value | 1 |


#### 26: Learning status register (Read Only)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_26_1 |
| Data Type        | INTEGER |
| Range | 0 to 4 |
| Default Value | 0 |


#### 27: IR code number for built-in code library


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_27_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 28: External IR Emitter power level


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_28_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | Normal power mode (0) |
|  | High power mode (255) |


#### 32: Surround IR control


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_32_1 |
| Data Type        | INTEGER || Default Value | -1 |
| Options | Enable Surround IR Emitters (-1) |
|  | Disable Surround IR Emitters (0) |


#### 33: AC function Swing control


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_33_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Swing Off (0) |
|  | Swing Auto (1) |


#### 35: Learn location status. Bitmask. (Read Only)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_35_4 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 37: Sensor temperature compensation


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_37_1 |
| Data Type        | INTEGER |
| Range | -5 to 5 |
| Default Value | 0 |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/202).
