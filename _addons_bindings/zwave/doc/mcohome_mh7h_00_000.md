---
layout: documentation
title: MH7H - ZWave
---

{% include base.html %}

# MH7H Water / Electrical Heating Thermostat

This describes the Z-Wave device *MH7H*, manufactured by *McoHome Technology Co., Ltd* with the thing type UID of ```mcohome_mh7h_00_000```. 

Water / Electrical Heating Thermostat  


## Overview 

MCOHome Water / Electrical Heating Thermostat is a Z-Wave enabled device for indoor temperature control. MH7H-WH is mainly applied to control wall mounted boiler, water valve/pump etc. , while MH7H-EH is for electrical heating system. The device is of high reliability and practicability, which can be included and operated in any Z-Wave network with other Z-Wave certified devices from any other manufacturers.

Features:

 *  Capacitive touch buttons
 *  Tempered glass panel, PC alloy enclosure
 *  Precise temperature calibration function
 *  Attractive appearance
 *  Clear display, easy to operate

Specifications:

 *  Power Supply:AC85-260V, 50/60HZ
 *  Output: MH7H-WH ≤ 5A ; MH7H-EH ≤ 16A
 *  Self Consumption: ≤ 1W
 *  Internal Temp. Sensor: NTC 15K
 *  External Temp. Sensor(optional): NTC R25°C=15KΩ B25°C/50°C=3550K
 *  Working Environment:0-50 °C ; 0-90% RH(Non-condensation)
 *  Temperature Setting:5-37 °C(41-99°F) (Adjustable)
 *  Dimension:86\*86\*15mm
 *  Hole Pitch:60-61mm

  


### Inclusion Information 

In normal working interface, press and hold S4 to enter interface for inclusion or exclusion of Z-Wave network. Before device included into network, “- - -” will display on the screen. Then press S4 once, device will enter learning mode to get a node ID. If inclusion is success, a node ID will display on the screen in a few seconds.

After inclusion, turn off the device and then turn it on. Now the device is ready to be operated by controller/ gateway in Z-Wave network.

  


### Exclusion Information 

In normal working interface, press and hold S4 to enter interface for inclusion or exclusion of Z-Wave network. Before device included into network, “- - -” will display on the screen. Then press S4 once, device will enter learning mode to get a node ID. If inclusion is success, a node ID will display on the screen in a few seconds.


## Channels
The following table summarises the channels available for the MH7H Water / Electrical Heating Thermostat.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Thermostat mode | thermostat_mode | mcohome_mh7h_00_000_thermostat_mode | Temperature | Number |
| Thermostat Operating State | thermostat_state | thermostat_state | Temperature | Number |
| Setpoint (heating) | thermostat_setpoint_heating | thermostat_setpoint | Temperature | Number |
| Setpoint (furnace) | thermostat_setpoint_furnace | thermostat_setpoint | Temperature | Number |
| Setpoint (economy) | thermostat_setpoint_heating_econ | thermostat_setpoint | Temperature | Number |
| Setpoint (away) | thermostat_setpoint_away_heating | thermostat_setpoint | Temperature | Number |
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


### Setpoint (away)

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
The following table provides a summary of the configuration parameters available in the MH7H Water / Electrical Heating Thermostat.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Upload temperature format automatically | Upload temperature format automatically |
| 2: Upload temperature and humidity automatically | Upload temperature and humidity automatically |
| 3: Upload temperature difference | Base on 0.1°C unit, 5 by default, 5\*0.1°C=0.5°C |
| 4: Upload time interval regularly | Base on 1s unit, it suggest to be set above 30s |
| 5: Upload humidity difference | Upload when percent difference exceeded |
| 255: Factory setting | Restore the factory setting - write only, set to 85 to reset |
| 1: Lifeline | For sending temperature, working mode, etc. notifications |


#### 1: Upload temperature format automatically

Upload temperature format automatically


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |
|  | Follow the main display (2) |


#### 2: Upload temperature and humidity automatically

Upload temperature and humidity automatically


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | OFF (0) |
|  | Upload the difference value only (1) |
|  | Timing upload mode only (2) |
|  | Upload the difference+timing upload mode (3) |


#### 3: Upload temperature difference

Base on 0.1°C unit, 5 by default, 5\*0.1°C=0.5°C


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 3 to 1000 |
| Default Value | 5 |


#### 4: Upload time interval regularly

Base on 1s unit, it suggest to be set above 30s


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_2 |
| Data Type        | INTEGER |
| Range | 19 to 65535 |
| Default Value | 30 |


#### 5: Upload humidity difference

Upload when percent difference exceeded


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 2 to 255 |
| Default Value | 3 |


#### 255: Factory setting

Restore the factory setting - write only, set to 85 to reset


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_255_1_wo |
| Data Type        | INTEGER |
| Range |  to  |
| Default Value | 0 |


#### 1: Lifeline

For sending temperature, working mode, etc. notifications  


##### Overview 

Thermostat supports 1 association group. A gateway is suggested to associate with this group.

Then if any changes happen, such as: temperature, working mode, etc., the thermostat will report to this associated device (gateway).


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/773).
