---
layout: documentation
title: LC-13 - ZWave
---

{% include base.html %}

# LC-13 Living Connect Z Thermostat

This describes the Z-Wave device *LC-13*, manufactured by *Danfoss* with the thing type UID of ```danfoss_lc13_00_000```. 

Living Connect Z Thermostat  


## Overview 

Radiator Thermostat

  


### Inclusion Information 

Short push middle button

  


### Wakeup Information 

Short push middle button


## Channels
The following table summarises the channels available for the LC-13 Living Connect Z Thermostat.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Setpoint (heating) | thermostat_setpoint_heating | thermostat_setpoint | Temperature | Number |
|  | battery-level | system.battery-level |  |  |
| Clock Time Offset | time_offset | time_offset | Temperature | Number |
| Alarm (general) | alarm_general | alarm_general | Door | Switch |


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


### Device Configuration
The following table provides a summary of the configuration parameters available in the LC-13 Living Connect Z Thermostat.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Target for Wakeup and Override Notifications |  |


#### 1: Target for Wakeup and Override Notifications


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/165).
