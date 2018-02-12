---
layout: documentation
title: HS-DS100+ - ZWave
---

{% include base.html %}

# HS-DS100+ Homeseer Z-Wave Door/Window Sensor

This describes the Z-Wave device *HS-DS100+*, manufactured by *HomeSeer Technologies* with the thing type UID of ```homeseer_hsds100_00_000```. 

Homeseer Z-Wave Door/Window Sensor  


## Overview 

HS-DS100+ is a battery operated sensor that is designed to issue Z-Wave commands when doors or windows are opened or closed. HSDS100+ may be associated directly with other Z-Wave devices or it may be used with a wide variety of Z-Wave hubs and controllers to trigger events, scenes and other automations.

  


### Inclusion Information 

1.  Ensure AAA batteries are installed. Pull plastic tab from battery compartment (if necessary)
2.  Put your home automation controller into ‘inclusion’ mode. Consult your system’s manual for details.
3.  HS-DS100+ may be included “securely” (option a) or “non-securely” (option b). If your automation controller does not support secure devices, or if you wish to improve battery life, add the sensor “non-securely”. Otherwise, include the sensor “securely”
    
     *  a) Secure inclusion: Press and hold the Z-Wave button inside the sensor body for 3 seconds. Wait for the process to finish.
     *  b) Non-Secure inclusion: Triple-click the Z-Wave button inside the sensor body. Wait for the process to finish.
4.  If successful, the sensor body LED will blink briefly and then stay on for 3 seconds. If unsuccessful, the LED with blink briefly and then turn off. Should this happen, repeat the inclusion process.

Note: If you want this Door/window sensor to function as a security device using secure/encrypted Z-Wave communications, then a security enabled Z-Wave controller is required. 

  


### Exclusion Information 

1. Put your home automation controller into ‘exclusion’ mode. Consult your system’s manual for details.

2. Triple-click the Z-Wave button inside the sensor body. If successful, the LED will turn off within 1 second. If unsuccessful, the LED with blink for 5 seconds. Should this happen, repeat the exclusion process.


## Channels
The following table summarises the channels available for the HS-DS100+ Homeseer Z-Wave Door/Window Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Tamper Alarm | alarm_tamper | alarm_tamper |  | Switch |
| Door Sensor | sensor_door | sensor_door | Door | Contact |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the HS-DS100+ Homeseer Z-Wave Door/Window Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 14: Enable / Disable BASIC SET command | Enable / Disable BASIC SET command |
| 15: Value of BASIC SET |  |
| 32: Defines value of LOW BATTERY | Defines value of LOW BATTERY |
| 1: Group 1 |  |
| 2: Group 2 |  |


#### 14: Enable / Disable BASIC SET command

Enable / Disable BASIC SET command  


##### Overview 

A setting of “0” disables the regular reporting feature and requires the sensor to be manually woken up to send updates. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (1) |


#### 15: Value of BASIC SET


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Sends 255 value for open and 0 value for closed (0) |
|  | Sends 0 value for open and 255 value for closed (1) |


#### 32: Defines value of LOW BATTERY

Defines value of LOW BATTERY


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_32_1 |
| Data Type        | INTEGER |
| Range | 10 to 50 |
| Default Value | 20 |


#### 1: Group 1

  


##### Overview 

Group 1 reports the sensor’s condition, battery level and tamper state. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2

  


##### Overview 

Group 2 sends the BASIC SET command.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/732).
