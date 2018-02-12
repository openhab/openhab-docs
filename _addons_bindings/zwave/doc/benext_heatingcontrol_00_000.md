---
layout: documentation
title: Heating Control - ZWave
---

{% include base.html %}

# Heating Control Thermostat for controlling the opentherm protocol

This describes the Z-Wave device *Heating Control*, manufactured by *BeNext* with the thing type UID of ```benext_heatingcontrol_00_000```. 

Thermostat for controlling the opentherm protocol  


## Overview 

The Heating Control is the central point of your climate environment. You can overwrite the temperature setpoint of your thermostat, and this product also reports information about your thermostat or boiler. For example the room temperature, boiler pressure, modulation level or water temperature.

This product can be simply placed between your thermostat and boiler. The current setup is not changed and therefore you can still use the device as you normally would do. You don’t have to replace your current thermostat.

Note: This product only works if the current communication between your thermostat and boiler uses the standardized modulating protocol Open Therm. If you are not sure whether your thermostat/boiler uses Open Therm, you may find that in the manual of your thermostat/boiler. You can also find it on the internet. You can search for example on ‘Honeywell round clock open therm’.


## Channels
The following table summarises the channels available for the Heating Control Thermostat for controlling the opentherm protocol.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Room temperature | sensor_temperature | sensor_temperature | Temperature | Number |
| Outside temperature | sensor_temperature | sensor_temperature | Temperature | Number |
| Thermostat mode | thermostat_mode | benext_heatingcontrol_00_000_thermostat_mode | Temperature | Number |
| Heating setpoint | thermostat_setpoint_1 | thermostat_setpoint | Temperature | Number |
| Energy save setpoint | thermostat_setpoint_11 | thermostat_setpoint | Temperature | Number |


### Room temperature

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Outside temperature

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Heating setpoint

#### Scale

Select the scale to use for setpoints.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Energy save setpoint

#### Scale

Select the scale to use for setpoints.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the Heating Control Thermostat for controlling the opentherm protocol.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Set to default | Set all configuration values to default values (factory settings) |
| 2: Data request interval | Interval of updating data from thermostat and boiler |
| 3: T room update difference | Difference of temperature before new update |
| 4: T setpoint update difference | Difference in setpoint before new update |
| 5: Unsolicited CRC | CRC-16 encapulation |
| 6: Type of &#x27;special&#x27; thermostat | Type of 'special' thermostat if applicable |
| 7: Status auto report | Status auto report boiler/thermostat report. |
| 9: Enable/Disable thermostat schedule | Enable/Disable thermostat schedule inside the controller |
| 11: Readout manual setpoint thermostat | Readout manual setpoint thermostat |
| 1: Group 1 | Unsolicited reports |


#### 1: Set to default

Set all configuration values to default values (factory settings)  


##### Overview 

If 0xFF (255) then set to default


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Reset (255) |


#### 2: Data request interval

Interval of updating data from thermostat and boiler  


##### Overview 

The interval in seconds that data is requested (and therefore updated) from the thermostat and boiler. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 14 |


#### 3: T room update difference

Difference of temperature before new update  


##### Overview 

The value that the room temperature must differ (compared to his previous send value) before an unsolicited room temperature report is send to the associated node. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 1 |


#### 4: T setpoint update difference

Difference in setpoint before new update  


##### Overview 

The value that the temperature setpoint must differ (compared to his previous send value) before an unsolicited temperature setpoint report is send to the associated node. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 5 |


#### 5: Unsolicited CRC

CRC-16 encapulation  


##### Overview 

Configure if the unsolicited reports are send with the CRC-16 encapsulation. Not that the receiving node should support this encapsulation to parse the Z-Wave frame! 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Off (0) |
|  | On (255) |


#### 6: Type of &#x27;special&#x27; thermostat

Type of 'special' thermostat if applicable  


##### Overview 

Type of 'special' thermostat. NOTE: when remeha Celcia 20 support is set than any other thermostat cannot be set (!) NOTE2: when Remeha Celcia 20 gives 'Fout 203' send cfg value again 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No special (0) |
|  | Remeha Celcia 20 (1) |
|  | Honeywell (rounded temperatures) (2) |


#### 7: Status auto report

Status auto report boiler/thermostat report.  


##### Overview 

Status auto report boiler/thermostat report.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable boiler/thermostat status messages auto report (0) |
|  | Enable boiler/thermostat status messages auto report (255) |


#### 9: Enable/Disable thermostat schedule

Enable/Disable thermostat schedule inside the controller  


##### Overview 

Enable/Disable thermostat schedule inside the heatingcontroller


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable thermostat schedule (0) |
|  | Enable thermostat schedule (255) |


#### 11: Readout manual setpoint thermostat

Readout manual setpoint thermostat  


##### Overview 

This parameter is used to set the possible manual readout of the setpoint on the thermostat. If the thermostat is manually set to a different mode it is then possible to readout this value if enabled.

(NB. This setting is not in the manual but verified through contacting the service department of BeNext).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Readout OFF (0) |
|  | Readout ON (255) |


#### 1: Group 1

Unsolicited reports  


##### Overview 

Every unsolicited report will be sent to the nodes in this group. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/473).
