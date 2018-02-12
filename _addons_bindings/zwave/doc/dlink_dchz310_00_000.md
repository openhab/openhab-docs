---
layout: documentation
title: DCH-Z310 - ZWave
---

{% include base.html %}

# DCH-Z310 Smoke Detector

This describes the Z-Wave device *DCH-Z310*, manufactured by *D-Link* with the thing type UID of ```dlink_dchz310_00_000```. 

Smoke Detector  


## Overview 

The DCH-Z310 mydlink™ Z-Wave Smoke Alarm is a wireless early warning detection system that warns you of developing fires by broadcasting audible alarms via its built-in horn. Based on Z-Wave Plus™ technology, it offers longer battery life, faster operation, better RF coverage, and easier installation while keeping compatibility with classic Z-Wave™ products. You can set an alarm via the mydlink™ Home app so when you’re away, the DCH-Z310 will be enabled and ready to send signals to a hub such as the mydlink™ Home Connected Home Hub. When the alarm is triggered, it will generate an 85 dB (max) audio alarm while pushing instant notifications to your mobile device, so you can stay informed from wherever you are.

  


### Inclusion Information 

Put your hub/controller in Add mode. Press the button on the front of the smoke sensor three times quickly.

  


### Exclusion Information 

Put your hub/controller in Exclusion mode. Press the button on the front of the smoke sensor three times quickly.

  


### Wakeup Information 

After the device is added to the network, it will wake-up once per day in default. When it wake-up it will broadcast the "Wake Up Notification" message to the network, and wake-up for 10 seconds to receive the setting commands. The wake-up interval minimum setting is 30 minutes, and maximum setting is 120 hours. And the interval step is 30 minutes. If the user wants to wake-up the device immediately, please press the button once. The device will wake-up 10 seconds.


## Channels
The following table summarises the channels available for the DCH-Z310 Smoke Detector.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm (smoke) | alarm_smoke | alarm_smoke | Door | Switch |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the DCH-Z310 Smoke Detector.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 7: Customer Function | Customer function switch, using bit control |
| 10: Auto Report Battery Time | The interval time for auto report the battery level |
| 1: Reports | Receiving the report message, like triggered event etc |


#### 7: Customer Function

Customer function switch, using bit control  


##### Overview 

Bit0 : Reserve.  
Bit1 : Reserve.  
Bit2 : Reserve.  
Bit3 : Reserve.  
Bit4 : Notification Type  
0: Using Notification Report  
1: Using Sensor Binary Report  
Bit5 : Reserve.  
Bit6 : Reserve.  
Bit7 : Reserve.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 4 |
| Options | Notification Report (4) |
|  | Sensor Binary Report (20) |


#### 10: Auto Report Battery Time

The interval time for auto report the battery level  


##### Overview 

The interval time for auto report the battery level. 0 means turn off auto report battery. Each tick means 30 minutes.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 12 |


#### 1: Reports

Receiving the report message, like triggered event etc  


##### Overview 

1. Have Z-WaveTM Controller entered association mode.  
2. Press the button three times within 1.5 seconds to enter the association mode.  
Note: The device supports 1 group. This group is for receiving the report message, like triggered event etc. This group supports 8 nodes maximum.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/689).
