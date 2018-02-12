---
layout: documentation
title: FGT-001 - ZWave
---

{% include base.html %}

# FGT-001 Thermostatic Valve

This describes the Z-Wave device *FGT-001*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgt001_00_000```. 

Thermostatic Valve  


## Overview 

FIBARO Heat Controller is a remotely controlled thermostatic head to control temperature in the room. It measures the temperature and automatically adjust the heat level. It can be mounted without tools on three types of thermostatic radiator valves. It is also possible to create schedules via app to easily manage temperature throughout the week.  
Main features:  
• to be installed on three types of valves: M30 x 1.5, Danfoss RTD-N and Danfoss RA-N,  
• compatible with any Z-Wave or Z-Wave+ Controller,  
• supports Z-Wave network Security Modes: S0 with AES-128 encryption and S2 with PRNG-based encryption,  
• built-in battery recharged through standard micro-USB port,  
• easy installation - no tools required,  
• can use dedicated temperature sensor,  
• supports heating schedules,  
• automatic calibration,  
• anti-freeze function,  
• decalc function,  
• unconstrained rotation spherical knob to set desired temperature.

  


### Inclusion Information 

Add the device to the Z-Wave network:

1. Make sure the device is within the direct range of your Z-Wave controller.

2. Set the main controller in (security/non-security) add mode.

3. Use the included key to quickly triple click the button on the thermostatic head.

4. The LED ring will start blinking white.

5. If you are adding in S2 authenticated mode, type in the device pin code (underlined part of the public key on the label).

6. Wait for the adding process to end.

7. Successful adding will be confirmed by the Z-Wave controller.

  


### Exclusion Information 

To remove the device from the Z-Wave network:

1. Make sure the device is within the direct range of your Z-Wave controller.

2. Set the main controller into remove mode.

3. Use the included key to quickly triple click the button on the thermostatic head.

4. The LED ring will start blinking white.

5. Wait for the removing process to end.

6. Successful removing will be confirmed by the Z-Wave controller.

  


### Wakeup Information 

FIBARO Heat Controller is a FLiRS device. The FLiRS device alternates between sleep mode and a partially awake mode in which it is listening beam signal. When device receives this beam, it immediately fully wakes up and then communicates with the controller or other Z-Wave device.


## Channels
The following table summarises the channels available for the FGT-001 Thermostatic Valve.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Thermostat mode | thermostat_mode | fibaro_fgt001_00_000_thermostat_mode | Temperature | Number |
| Setpoint (heating) | thermostat_setpoint_heating | thermostat_setpoint | Temperature | Number |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |
| Alarm (system) | alarm_system | alarm_system |  | Switch |
|  | battery-level | system.battery-level |  |  |
| Clock Time Offset | time_offset | time_offset | Temperature | Number |
| Thermostat mode 1 | thermostat_mode1 | fibaro_fgt001_00_000_thermostat_mode | Temperature | Number |
| Setpoint (heating) 1 | thermostat_setpoint_heating1 | thermostat_setpoint | Temperature | Number |
| Alarm (power) 1 | alarm_power1 | alarm_power | Door | Switch |
| Alarm (system) 1 | alarm_system1 | alarm_system |  | Switch |
|  | battery-level1 | system.battery-level |  |  |
| Clock Time Offset 1 | time_offset1 | time_offset | Temperature | Number |
| Sensor (temperature) 2 | sensor_temperature2 | sensor_temperature | Temperature | Number |
| Alarm (power) 2 | alarm_power2 | alarm_power | Door | Switch |
|  | battery-level2 | system.battery-level |  |  |


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


### Setpoint (heating) 1

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
The following table provides a summary of the configuration parameters available in the FGT-001 Thermostatic Valve.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Override Schedule duration | This parameter determines duration of Override Schedule after turning the knob while norma... |
| 2: Additional functions | This parameter allows to enable different additional functions of the device. |
| 3: Additional functions status (READ-ONLY) | This parameter allows to check statuses of different additional functions. |
| 1: Lifeline | Lifeline |


#### 1: Override Schedule duration

This parameter determines duration of Override Schedule after turning the knob while normal schedule is active (set by Schedule CC).  


##### Overview 

Units = minutes


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_4 |
| Data Type        | INTEGER |
| Range | 10 to 10000 |
| Default Value | 240 |


#### 2: Additional functions

This parameter allows to enable different additional functions of the device.  


##### Overview 

Parameter 2 values may be combined, e.g. 1+8=9 means that Open Window Detector and LED indications when controlling remotely are enabled.

1 (bit 0) - enable Open Window Detector

2 (bit 1) - enable fast Open Window Detector

4 (bit 2) - increase receiver sensitivity (shortens battery life)

8 (bit 3) - enabled LED indications when controlling remotely

16 (bit 4) - protect from setting Full ON and Full OFF mode by turning the knob manually


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_4 |
| Data Type        | INTEGER |
| Range | 0 to 31 |
| Default Value | 1 |


#### 3: Additional functions status (READ-ONLY)

This parameter allows to check statuses of different additional functions.  


##### Overview 

Parameter 3 values may be combined, e.g. 1+2=3 means optional sensor works properly and open window detection was triggered.

1 (bit 0) - optional temperature sensor connected and operational

2 (bit 1) - open window detected


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_4 |
| Data Type        | INTEGER |
| Range | 0 to 3 |
| Default Value | 0 |


#### 1: Lifeline

Lifeline  


##### Overview 

Z-Wave Plus Lifeline association group that reports the device status and allows for assigning single device only (main controller by default)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/749).
