---
layout: documentation
title: CT100 Plus - ZWave
---

{% include base.html %}

# CT100 Plus Z-Wave Thermostat

This describes the Z-Wave device *CT100 Plus*, manufactured by *Radio Thermostat Company of America (RTC)* with the thing type UID of ```rtc_ct100plus_00_000```. 

Z-Wave Thermostat


## Channels
The following table summarises the channels available for the CT100 Plus Z-Wave Thermostat.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Thermostat mode | thermostat_mode | rtc_ct100plus_00_000_thermostat_mode | Temperature | Number |
| Thermostat Operating State | thermostat_state | thermostat_state | Temperature | Number |
| Setpoint (heating) | thermostat_setpoint_heating | thermostat_setpoint | Temperature | Number |
| Setpoint (cooling) | thermostat_setpoint_cooling | thermostat_setpoint | Temperature | Number |
| Setpoint (dry air) | thermostat_setpoint_dry_air | thermostat_setpoint | Temperature | Number |
| Setpoint (furnace) | thermostat_setpoint_furnace | thermostat_setpoint | Temperature | Number |
| Thermostat fan mode | thermostat_fanmode | rtc_ct100plus_00_000_thermostat_fanmode | Temperature | Number |
| Thermostat fan state | thermostat_fanstate | rtc_ct100plus_00_000_thermostat_fanstate | Temperature | Number |
|  | battery-level | system.battery-level |  |  |
| Clock Time Offset | time_offset | time_offset | Temperature | Number |
| Sensor (relative humidity) 1 | sensor_relhumidity1 | sensor_relhumidity | Humidity | Number |
| Sensor (temperature) 1 | sensor_temperature1 | sensor_temperature | Temperature | Number |
| Thermostat mode 1 | thermostat_mode1 | rtc_ct100plus_00_000_thermostat_mode | Temperature | Number |
| Thermostat Operating State 1 | thermostat_state1 | thermostat_state | Temperature | Number |
| Setpoint (heating) 1 | thermostat_setpoint_heating1 | thermostat_setpoint | Temperature | Number |
| Setpoint (cooling) 1 | thermostat_setpoint_cooling1 | thermostat_setpoint | Temperature | Number |
| Setpoint (dry air) 1 | thermostat_setpoint_dry_air1 | thermostat_setpoint | Temperature | Number |
| Setpoint (furnace) 1 | thermostat_setpoint_furnace1 | thermostat_setpoint | Temperature | Number |
| Thermostat fan mode 1 | thermostat_fanmode1 | rtc_ct100plus_00_000_thermostat_fanmode | Temperature | Number |
| Thermostat fan state 1 | thermostat_fanstate1 | rtc_ct100plus_00_000_thermostat_fanstate | Temperature | Number |
| Clock Time Offset 1 | time_offset1 | time_offset | Temperature | Number |
| Sensor (relative humidity) 2 | sensor_relhumidity2 | sensor_relhumidity | Humidity | Number |
| Sensor (temperature) 2 | sensor_temperature2 | sensor_temperature | Temperature | Number |


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


### Setpoint (dry air)

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


### Sensor (temperature) 1

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Setpoint (heating) 1

#### Scale

Select the scale to use for setpoints.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Setpoint (cooling) 1

#### Scale

Select the scale to use for setpoints.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Setpoint (dry air) 1

#### Scale

Select the scale to use for setpoints.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Setpoint (furnace) 1

#### Scale

Select the scale to use for setpoints.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Clock Time Offset 1

#### Automatic Update Offset

The number of seconds difference in the time before it is reset  
Setting this will automatically update the devices clock when the time difference between the device, and the computer exceeds this number of seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_offset |
| Data Type        | INTEGER |
| Range | 10 to 600 || Default Value | 60 |
| Options | Disable Auto Update (0) |


### Sensor (temperature) 2

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the CT100 Plus Z-Wave Thermostat.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Temperature Reporting Threshold | Reporting threshold for changes in the ambient temperature |
| 2: HVAC Settings | Configured HVAC settings |
| 4: Power Status | C-Wire / Battery Status |
| 5: Humidity Reporting Threshold | Reporting threshold for changes in the relative humidity |
| 6: Auxiliary/Emergency | Enables or disables auxiliary / emergency heating |
| 7: Thermostat Swing Temperature | Variance allowed from setpoint to engage HVAC |
| 8: Thermostat Diff Temperature | Configures additional stages |
| 9: Thermostat Recovery Mode | Fast or Economy recovery mode |
| 10: Temperature Filter Lower Bound Unit | Upper/Lower bounds for thermostat temperature reporting |
| 10: Temperature Filter Upper Bound | Upper/Lower bounds for thermostat temperature reporting |
| 10: Temperature Filter Upper Bound Unit | Upper/Lower bounds for thermostat temperature reporting |
| 10: Temperature Filter Lower Bound | Upper/Lower bounds for thermostat temperature reporting |
| 11: Simple UI Mode | Simple mode enable/disable |
| 12: Multicast | Enable or disables Multicast |
| 3: Utility Lock Enable/Disable | Prevents setpoint changes at thermostat |
| 1: Group 1 | Send report about Thermostat Mode, Thermostat Operating State, Fan Mode, Fan State, Setpoi... |


#### 1: Temperature Reporting Threshold

Reporting threshold for changes in the ambient temperature  


##### Overview 

This value determines the reporting threshold when association reporting is enabled. Unsupported values will be ignored.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | Disabled (0) |
|  | 0.5° F (1) |
|  | 1.0° F (2) |
|  | 1.5° F (3) |
|  | 2.0° F (4) |


#### 2: HVAC Settings

Configured HVAC settings  


##### Overview 

Byte 1 = HVAC Setup: Normal (0x01) or Heat Pump (0x02)  
Byte 2 = Aux Setup (Gas (0x01) or Electric (0x02)) & Number of Auxiliary Stages (Heat Pump)/Number of Heat Stages (Normal)  
Byte 3 = Number of Heat Pump Stages  
Byte 4 = Number of Cool Stages


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_4 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 4: Power Status

C-Wire / Battery Status  


##### Overview 

If 0x01, the thermostat is powered by a C-wire. If 0x02, the thermostat is powered by batteries.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 5: Humidity Reporting Threshold

Reporting threshold for changes in the relative humidity  


##### Overview 

This value determines the reporting threshold when association reporting is enabled. Unsupported values will be ignored.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disabled (0) |
|  | 3% RH (1) |
|  | 5% RH (2) |
|  | 10% RH (3) |


#### 6: Auxiliary/Emergency

Enables or disables auxiliary / emergency heating  


##### Overview 

If set to 0, auxiliary / emergency heat is disabled, all other values, 1-255, will enable the auxiliary / emergency heat. This can only be enabled when the thermostat is set to Heat Pump mode.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Auxiliary/Emergency heat disabled (0) |
|  | Auxiliary/Emergency heat enabled (1) |


#### 7: Thermostat Swing Temperature

Variance allowed from setpoint to engage HVAC  


##### Overview 

The thermostat swing temperature is in units of 0.5 degrees Fahrenheit.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | 0.5° F (1) |
|  | 1.0° F (2) |
|  | 1.5° F (3) |
|  | 2.0° F (4) |
|  | 2.5° F (5) |
|  | 3.0° F (6) |
|  | 3.5° F (7) |
|  | 4.0° F (8) |


#### 8: Thermostat Diff Temperature

Configures additional stages  


##### Overview 

Sets the differential temperature for multi-stage HVAC systems. The differential temperature delta defines when the thermostat will turn on additional stages. This command configures both the heat and cool differential temperatures.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER || Default Value | 4 |
| Options | 2.0° F (4) |
|  | 4.0° F (8) |
|  | 6.0° F (12) |


#### 9: Thermostat Recovery Mode

Fast or Economy recovery mode  


##### Overview 

The Thermostat Recovery Mode can be either fast (1) or economy (2).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | Fast recovery mode (1) |
|  | Economy recovery mode (2) |


#### 10: Temperature Filter Lower Bound Unit

Upper/Lower bounds for thermostat temperature reporting  


##### Overview 

Specifies unit for lower bound parameter. If set to 1, lower bound is Celsius. If set to 9, lower bound is Fahrenheit.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_4 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Celsius (1) |
|  | Fahreheit (9) |


#### 10: Temperature Filter Upper Bound

Upper/Lower bounds for thermostat temperature reporting  


##### Overview 

The thermostat will report ambient temperature changes for temperature values greater than the upper bound. This field must be between 0F and 124F. By default, this value is 0F (report all temperature changes).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_4_000000FF |
| Data Type        | INTEGER |
| Range | 0 to 124 |
| Default Value | 0 |


#### 10: Temperature Filter Upper Bound Unit

Upper/Lower bounds for thermostat temperature reporting  


##### Overview 

Specifies unit for upper bound parameter. If set to 1, upper bound is Celsius. If set to 9, upper bound is Fahrenheit.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_4_0000FF00 |
| Data Type        | INTEGER || Default Value | 9 |
| Options | Celsius (0) |
|  | Fahrenheit (9) |


#### 10: Temperature Filter Lower Bound

Upper/Lower bounds for thermostat temperature reporting  


##### Overview 

The thermostat will report ambient temperature changes for temperature values less than the lower bound. This field must be between 0F and 124F. By default, this value is 124F (report all temperature changes).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_4_00FF0000 |
| Data Type        | INTEGER |
| Range | 0 to 124 |
| Default Value | 124 |


#### 11: Simple UI Mode

Simple mode enable/disable  


##### Overview 

If the value is set to 0 then Normal Mode is enabled. If the value is set to 1 then Simple Mode is enabled.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Normal mode enabled (0) |
|  | Simple mode enabled (1) |


#### 12: Multicast

Enable or disables Multicast  


##### Overview 

If set to 0, Multicast is disabled. If set to 1, Multicast is enabled.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Multicast disabled (0) |
|  | Multicast enabled (1) |


#### 3: Utility Lock Enable/Disable

Prevents setpoint changes at thermostat  


##### Overview 

If set to 0, the utility lock is disabled, all other values, 1-255, will enable the utility lock. This will prevent changes to the setpoint at the thermostat screen.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1_wo |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Utility lock disabled (0) |
|  | Utility lock enabled (1) |


#### 1: Group 1

Send report about Thermostat Mode, Thermostat Operating State, Fan Mode, Fan State, Setpoint, Sensor Multilevel


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/641).
