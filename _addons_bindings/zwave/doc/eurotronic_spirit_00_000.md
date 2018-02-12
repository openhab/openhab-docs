---
layout: documentation
title: Spirit - ZWave
---

{% include base.html %}

# Spirit Thermostatic Valve

This describes the Z-Wave device *Spirit*, manufactured by *Eurotronics* with the thing type UID of ```eurotronic_spirit_00_000```. 

Thermostatic Valve  


## Overview 

## Intelligenter Energiesparregler für Z-Wave mit wechselbaren Designblenden. 

Die neue Energiesparreglerserie von EUROtronic steht für ein völlig neues Designkonzept. Mit wechselbare Designblenden (als Zubehör erhältlich) kann der smarte Heizkörperthermostat an den individuellen Einrichtungsgeschmack angepasst werden.

Nutzern von Z-Wave bietet der neue Spirit-Z-Wave eine Vielzahl neuer Funktionen.

Ausgestattet mit FLiRS (Frequently Listening Receiver Slave) reagiert der Energiesparregler mit einer besonders kurzen Latenzzeit auf eingehende Befehle (z.B. Temperaturänderungen).  
Sein farbiges Display ist besonders gut ablesbar und hat eine extragroße Temperaturanzeige.  
Durch die per LED mehrfarbig beleuchtete Mitteltaste ist eine intuitive Nutzerführung möglich, da der Nutzer durch farbige Blinkfolgen zur Interaktion mit dem Gerät aufgefordert wird.

  


### Inclusion Information 

Start Inclusion mode of your primary Z-Wave Controller. Press the Boost-Button. Spirit Z-Wave Plus will show the assigned NodeID.

  


### Exclusion Information 

Start Exclusion mode of your primary Z-Wave Controller. Now press and hold the boost button of the Spirit Z-Wave Plus for at least 5 seconds.


## Channels
The following table summarises the channels available for the Spirit Thermostatic Valve.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Current temperature | sensor_temperature | sensor_temperature | Temperature | Number |
| External temperature | sensor_report | sensor_report |  |  |
| Thermostat mode | thermostat_mode | eurotronic_spirit_00_000_thermostat_mode | Temperature | Number |
| Setpoint (heat) | thermostat_setpoint_heating | thermostat_setpoint | Temperature | Number |
| Setpoint (energy heat) | thermostat_setpoint_furnace | thermostat_setpoint | Temperature | Number |
| Alarm (system) | alarm_system | alarm_system |  | Switch |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Dimmer

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Current temperature

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Setpoint (heat)

#### Scale

Select the scale to use for setpoints.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Setpoint (energy heat)

#### Scale

Select the scale to use for setpoints.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the Spirit Thermostatic Valve.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: LCD Invert | LCD Invert |
| 2: LCD Timeout | LCD Timeout |
| 3: Backlight | Backlight |
| 4: Battery report | Battery report |
| 5: Measured Temperature report | Measured Temperature report |
| 6: Valve opening percentage report | Valve opening percentage report |
| 7: Window open detection | Window open detection |
| 8: Measured Temperature offset | Measured Temperature offset |
| 1: Lifeline | Spirit Z-Wave Plus can only be associated with the Z-Wave controller. |


#### 1: LCD Invert

LCD Invert


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | LCD-content normal (0) |
|  | LCD-content inverted (UK Edition) (1) |


#### 2: LCD Timeout

LCD Timeout  


##### Overview 

0: No Timeout LCD always on

5-30: LCD will turn off after 5 to 30 seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 5 to 30 || Default Value | 0 |
| Options | No Timeout LCD always on (0) |


#### 3: Backlight

Backlight


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Backlight disabled (0) |
|  | Backlight enabled (1) |


#### 4: Battery report

Battery report


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | system notification (0) |
|  | Send battery status unsolicited once a day. (1) |


#### 5: Measured Temperature report

Measured Temperature report  


##### Overview 

0: Unsolicited Temperature reporting disabled

1-50: report if temperature changed by delta = 0,1°C ... 5,0 °C

default 5: report on delta T = 0,5°C


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 0 to 50 |
| Default Value | 5 |


#### 6: Valve opening percentage report

Valve opening percentage report  


##### Overview 

0: Unsolicited valve opening percentage reporting disabled.

1-100: report if valve opening changed by delta = 1% ... 100%


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 0 |


#### 7: Window open detection

Window open detection


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | Disabled (0) |
|  | Sensitivity low (1) |
|  | Sensitivity medium (2) |
|  | Sensitivity high (3) |


#### 8: Measured Temperature offset

Measured Temperature offset  


##### Overview 

\-50 - +50: Offsets the measured temperature by-5,0°C – (+)5,0°C

128: External temperature sensor will be used for regulation.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | -50 to 50 || Default Value | 0 |
| Options | External temperature sensor will be used for regulation. (128) |


#### 1: Lifeline

Spirit Z-Wave Plus can only be associated with the Z-Wave controller.  


##### Overview 

Commands:

BATTERY\_REPORT, DEVICE\_RESET\_LOCALLY\_NOTIFICATION, THERMOSTAT\_MODE\_REPORT, THERMOSTAT\_SETPOINT\_REPORT, NOTIFICATION\_REPORT, PROTECTION\_REPORT, SENSOR\_MULTILEVEL\_REPORT, SWITCH\_MULTILEVEL\_REPORT


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/710).
