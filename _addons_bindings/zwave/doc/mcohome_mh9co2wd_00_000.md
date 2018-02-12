---
layout: documentation
title: MH9-CO2-WD - ZWave
---

{% include base.html %}

# MH9-CO2-WD CO2 Monitor Air quality detector

This describes the Z-Wave device *MH9-CO2-WD*, manufactured by *McoHome Technology Co., Ltd* with the thing type UID of ```mcohome_mh9co2wd_00_000```. 

CO2 Monitor Air quality detector  


## Overview 

MCOHome CO2 Monitor is an air quality detector which compatible with Z-Wave technology.

It is mainly used to monitor CO2 concentration in industrial, agricultural, and residence environment, while monitoring the indoor temperature, humidity and VOC (optional) air quality.

Device can be included into any Z-Wave network, and is compatible with any other Z-Wave certified devices.

**Specification**

 *  Power Supply：DC12V
 *  CO2 display range: 0-2000ppm
 *  Default threshold:1000ppm (adjustable)
 *  Temperature range：-9.0～50 ℃
 *  Humidity range: 0%～99%RH
 *  Installation: Wall-mounted (Vertical)
 *  Work environment:-10~+8℃ 0-90%RH (Non-condensation)
 *  Dimension：90\* 130\*28mm
 *  Hole Pitch：60mm or 82m
 *  Housing: Tempered glass+ PC Alloy

**Command Class supported by the device**

 *  COMMAND\_CLASS\_BASIC
 *  COMMAND\_CLASS\_SENSOR\_MULTILEVEL\_V5
 *  COMMAND\_CLASS\_CONFIGURATION
 *  COMMAND\_CLASS\_NOTIFICATION
 *  COMMAND\_CLASS\_ASSOCIATION
 *  COMMAND\_CLASS\_MANUFACTURER\_SPECIFIC
 *  COMMAND\_CLASS\_VERSION

  


### Inclusion Information 

Activate Inclusion/Exclusion mode in the gateway.

When device is powered on, long press K2 can enter interface for inclusion or exclusion of Z-Wave network.

If device has not been included into any Z-Wave network before, “- - -”will display on the screen.

Then press K2 once, “- - -” flashing and device enters into learning mode to get a node ID. If inclusion is success, a node ID will display on the screen. If not, “- - -” will stop flashing in 20 sec.

  


### Exclusion Information 

Activate Inclusion/Exclusion mode in the gateway.

When device is powered on, long press K2 can enter interface for inclusion or exclusion of Z-Wave network.

If a node ID displays, it means the device is already in a Z-Wave network.

To press K2 once can remove it from the network. “- - -” displays and press K1 once can return to normal work.


## Channels
The following table summarises the channels available for the MH9-CO2-WD CO2 Monitor Air quality detector.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number |
| Sensor (CO2) | sensor_co2 | sensor_co2 |  | Number |
| Alarm (CO2) | alarm_co2 | alarm_co2 | Door | Switch |
| Alarm (general) | alarm_general | alarm_general | Door | Switch |


### Sensor (temperature)

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the MH9-CO2-WD CO2 Monitor Air quality detector.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Notification Threshold | CO2 Notification Threshold |
| 1: Notification | sends report ever 30s when CO2 value above threshold |
| 2: Gateway report | CO2, Temperature and Humidity is reported when changed |


#### 1: Notification Threshold

CO2 Notification Threshold  


##### Overview 

Sets the CO2 notification threshold for association group 1.

When the detected CO2 value is higher than the setting value, the device will send a (CO2 Detected Event) report to the Group 1. And this report will keep sending every 30 sec until the detected value is lower than the setting value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 1 to 2000 |
| Default Value | 1000 |


#### 1: Notification

sends report ever 30s when CO2 value above threshold  


##### Overview 

Group 1 is for “Notification” purpose, which can add up to 5 Node ID. Device works in “Push” mode in “Notification Command Class”.

When the detected CO2 value is higher than the setting value, the device will send a (CO2 Detected Event) report to the Group 1. And this report will keep sending every 30 sec until the detected value is lower than the setting value.

Use “Notification Set” can set this unsolicited report; this function is default as “OFF”.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Gateway report

CO2, Temperature and Humidity is reported when changed  


##### Overview 

A gateway is suggested to associate with Group 2, which can support only one Node ID. The  
gateway can ask for detected data any time. And the device will report to this associated device  
(gateway) when detected data changes:  
CO2: report when any change ≥50ppm“Multilevel sensor Report (CO2=0x11)”  
Temperature: report when any change≥ 0.5 “Multilevel ℃ sensor Report (Temp=0x01)”  
Humidity: report when any change≥ 2%“Multilevel sensor Report (Humidity=0x05)’


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/455).
