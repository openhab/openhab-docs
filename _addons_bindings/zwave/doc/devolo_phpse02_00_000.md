---
layout: documentation
title: ph-pse02 - ZWave
---

{% include base.html %}

# ph-pse02 Multisound indoor siren (Zipato/Devolo)

This describes the Z-Wave device *ph-pse02*, manufactured by *Devolo* with the thing type UID of ```devolo_phpse02_00_000```. 

Multisound indoor siren (Zipato/Devolo)  


## Overview 

**\#\#\# NOTE \#\#\#**

The XML used for adding this device to the database comes from the Devolo Home Control Alarmsiren (http://www.devolo.de/article/devolo-home-control-alarmsirene/). But it seems to be made by Zipato (https://www.zipato.com/product/multisound-indoor-siren).  
  
**\#\#\# FEATURES \#\#\#**  
  
\- Indoor multichannel siren that works with a a variety of Z-Wave networks/controllers, regardless of the manufacturer  
\- The new Z-Wave 500 series chip supports multichannel operationand higher data rates (9.6/40/100kbps)  
\- 110db sound level  
\- 6 sounds: Door Chime, Bi Bi Arm/Disarm, Intruder alarm, Ambulance, Police car  
\- Higher output power enhances communication range(+6dBm output power as compared to -2.5dBm 300 series)  
\- DC or Li-ion battery power (over 24 hours of battery life)  
\- Battery overcharge protection  
\- Very low power consumption  
\- Over-the-air firmware update  
\- Easy to install in EU/China/Taiwan wall sockets  
\- Tamperproof protection  
  
  
**\#\#\# TECHNICAL SPECIFICATIONS \#\#\#**  
  
PROTOCOL: Z-Wave Plus  
  
POWER  
\- DC 5V, Li-Ion battery (optional)  
\- BATTERY CAPACITY 1150mAh  
  
OPERATING CONDITIONS:  
\- OPERATING VOLTAGE 3.7V  
\- OPERATING CURRENT 150 mA  
\- OPERATION TEMPERATURE -10°C ~ 40°C  
  
RANGE  
\- Minimum 30 meters indoor  
\- 70 meters outdoor (meant for indoor use only)  
  
DIMENSIONS  
\- DEVICE  DIMENSIONS 110 x 110 x 22 mm  
\- DEVICE WEIGHT 113g  
\- PACKAGE DIMENSIONS 117 x 50 x 117 mm  
\- PACKAGE WEIGHT 217g  
  
FREQUENCY  
  
    ph-pse02.au 921.42 MHz (AU)  
    ph-pse02.eu 868.42 MHz (EU)  
    ph-pse02.in 865.20 MHz (IN)  
    ph-pse02.is 916.02 MHz (IS)  
    ph-pse02.ru 869.02 MHz (RU)  
    ph-pse02.us 908.42 MHz (US)  
  
Source: https://www.zipato.com/product/multisound-indoor-siren


## Channels
The following table summarises the channels available for the ph-pse02 Multisound indoor siren (Zipato/Devolo).

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
| Alarm (general) | alarm_general | alarm_general | Door | Switch |
| Start Sound | notification_send | notification_send |  | Number |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ph-pse02 Multisound indoor siren (Zipato/Devolo).
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 7: Costumer Function | NotificationReport/BinaryReport |
| 29: Disable Alarm | Disable the alarm function. |
| 31: Alarm Duration | Play alarm sound duration. |
| 1: Report Message | Report Message, e.g. tamper alarm |


#### 7: Costumer Function

NotificationReport/BinaryReport  


##### Overview 

Notification Type,

0: Using Notification Report.

1: Using Sensor Binary Report.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_4 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 4 |


#### 29: Disable Alarm

Disable the alarm function.  


##### Overview 

Disable the alarm function.

1: Disable Alarm,

0: Enable Alarm.

Caution: After the power up, this configuration is always 0.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_29_4 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 31: Alarm Duration

Play alarm sound duration.  


##### Overview 

Play alarm sound duration, 1 tick is 30 seconds.

Default is 3 minutes, maximum is 63.5 minutes.

0 means never auto stop.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_31_4_0000000C |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 6 |


#### 1: Report Message

Report Message, e.g. tamper alarm  


##### Overview 

Notice: The device supports 1 group.

The group 1 is for receiving the report message, like tamper event. And the group 8 nodes maximum


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/453).
