---
layout: documentation
title: IM-20 - ZWave
---

{% include base.html %}

# IM-20 Door Sensor

This describes the Z-Wave device *IM-20*, manufactured by *Kaipule Technology Co., Ltd.* with the thing type UID of ```kaipule_im20_00_000```. 

Door Sensor  


## Overview 

Factory Setting  
Press the tamper switch 6 times in 2s, it will recover to factory setting after a period of time  
(Please use the reset procedure only when the primary controller is missing or inoperable)

  


### Inclusion Information 

Enter the Inclusion Mode of gateway, and press the tamper switch 3 times within 1.5s,  
then the door sensor will stay in enrollment state until successfully enrolled into network or  
enrollment time out after 30s.

  


### Exclusion Information 

Enter the Exclusion Mode of gateway, and press the tamper switch 3 times within  
1.5s, then the door sensor will be removed after a period of time.

  


### Wakeup Information 

a) Manual Wake-up  
Quickly press tamper switch once, the door sensor will automatically send wake-up  
information, and there will be 10s after wake-up to receive gateway setting information.  
b) Automatic Wake-up  
Default time of automatic wake-up is 24 hours, and there will be 10s after wake-up to receive  
gateway setting information, the max automatic report time = 24 hours, minimum=30min


## Channels
The following table summarises the channels available for the IM-20 Door Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
| Alarm (access) | alarm_access | alarm_access | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the IM-20 Door Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Group 1 |  |


#### 1: Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/254).
