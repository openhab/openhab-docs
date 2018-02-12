---
layout: documentation
title: TP-802ZD - ZWave
---

{% include base.html %}

# TP-802ZD Door/Window Sensor

This describes the Z-Wave device *TP-802ZD*, manufactured by *Kaipule Technology Co., Ltd.* with the thing type UID of ```kaipule_doorwindowsensor_00_000```. 

Door/Window Sensor  


## Overview 

The sensor must be added to the Zwave network prior to use.

\- This sensor can not work alone, need connect to Z-wave gateway - First time connect, the distance between sensor and gateway better less than 1.0 meter, after connected, then install the sensor where you need - When connect to gateway, choose add device in your gateway software, then quickly click the sensor's z-wave trigger 3 times to send signal to gateway, delet device similar operation - When install, the door sensor main part and magnetic stripe gap must less than 5mm - The work distance to gateway is 10 to 20 meters indoor, more wall or barrier will influence the distance

Factory Setting  
Press the tamper switch 6 times in 2s, it will recover to factory setting after a period of time  
(Please use the reset procedure only when the primary controller is missing or inoperable)

  


### Inclusion Information 

To include the sensor in a networks start by placing the controller in inclusion mode. Then activate the inclusion mode at the sensor by pressing the tamper switch 3 times within 1.5s.

  


### Exclusion Information 

To exclude the sensor in a networks start by placing the controller in exclusion mode. Then activate the exclusion mode at the sensor by pressing the tamper switch 3 times within 1.5s.

  


### Wakeup Information 

a) Manual Wake-up  
Quickly press tamper switch once, the door sensor will automatically send wake-up  
information, and there will be 10s after wake-up to receive gateway setting information.  
b) Automatic Wake-up  
Default time of automatic wake-up is 24 hours, and there will be 10s after wake-up to receive  
gateway setting information, the max automatic report time = 24 hours, minimum=30min


## Channels
The following table summarises the channels available for the TP-802ZD Door/Window Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
| Alarm (access) | alarm_access | alarm_access | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the TP-802ZD Door/Window Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Basic Set Level | Basic Set Command will be sent when the door/window is opened or closed |
| 2: Turn Off Light Time Configuration | Turn Off Light Time |
| 3: Door Sensor Status Report | Auto report Door/Window status time |
| 1: Group 1 | Is assigned to the device status - OPEN/CLOSED. |
| 2: Group 2 | Sending control commands to associated devices |


#### 1: Basic Set Level

Basic Set Command will be sent when the door/window is opened or closed  


##### Overview 

If there is any device under Association Group2, the door sensor will send “Basic Set = value”  
command to control that device when the door sensor is opened.

“Value” configuration rule is as below:

Available settings:

1 to 100 Dimmer Level

255 (Default) For ON/OFF Light Only


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 |
| Default Value | 255 |


#### 2: Turn Off Light Time Configuration

Turn Off Light Time  


##### Overview 

If there is any device under Association Group2, the door sensor will send “Basic Set = value”  
command to Group2, and send “Basic Set = 0x00” command to turn-off light after “t” seconds,  
Set value = “t”, means to send Basic Set command after “t” seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 1 to 120 |
| Default Value | 20 |


#### 3: Door Sensor Status Report

Auto report Door/Window status time  


##### Overview 

Under normal working status (without trigger), the door sensor will automatically send report  
to the Gateway about its current tamper & open/close status. Set value = t, means “t” hours,  
(“t”=0, means no status report)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 24 |
| Default Value | 12 |


#### 1: Group 1

Is assigned to the device status - OPEN/CLOSED.  


##### Overview 

1.It will send “NOTIFICATION\_REPORT”to the device in Group 1 when the door sensor is opened / closed, tamper switch is triggered / recovered.

2.When in low battery status, door sensor will send “BATTERY\_REPORT” to Group 1 device periodically.

3.The door sensor will send “DEVICE\_RESET\_LOCALLY\_NOTIFICATION” to Group1 device when the device recovers to factory settings.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2

Sending control commands to associated devices  


##### Overview 

When the door sensor is opened, it will send “BASIC SET” command to control these devices in Group2.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/633).
