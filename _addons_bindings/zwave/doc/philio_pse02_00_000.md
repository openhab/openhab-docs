---
layout: documentation
title: PSE02 - ZWave
---

{% include base.html %}

# PSE02 Siren

This describes the Z-Wave device *PSE02*, manufactured by *Philio Technology Corp* with the thing type UID of ```philio_pse02_00_000```. 

Siren


## Channels
The following table summarises the channels available for the PSE02 Siren.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Start sound | notification_send | notification_send |  | Number |


### Device Configuration
The following table provides a summary of the configuration parameters available in the PSE02 Siren.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 7: Costumer Function | NotificationReport/BinaryReport |
| 29: Disable Alarm | Disable the alarm function. |
| 31: Alarm Duration |  |


#### 7: Costumer Function

NotificationReport/BinaryReport  


##### Overview 

Customer function switch, using bit control. 0       Bit4: Notification Type,       0: Using Notification Report.   1: Using Sensor Binary Report.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_4 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 4 |


#### 29: Disable Alarm

Disable the alarm function.  


##### Overview 

Disable the alarm  function. 1: Disable  Alarm, 0: Enable Alarm.  Caution: After the power  up, this configuration is  always 0.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_29_4 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 31: Alarm Duration


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_31_4_0000000C |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 6 |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/320).
