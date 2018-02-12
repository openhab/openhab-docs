---
layout: documentation
title: WTRFID - ZWave
---

{% include base.html %}

# WTRFID Mini Keypad RFID/Z-Wave

This describes the Z-Wave device *WTRFID*, manufactured by *Wintop* with the thing type UID of ```wintop_wtrfid_00_000```. 

Mini Keypad RFID/Z-Wave


## Channels
The following table summarises the channels available for the WTRFID Mini Keypad RFID/Z-Wave.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
| Alarm (access) | notification_access_control | notification_access_control |  | Number |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the WTRFID Mini Keypad RFID/Z-Wave.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Set to Default | Set all configuration values to default values (factory settings). |
| 2: Audible feedback config | To configure the time the beep is automatically turned off in seconds. |
| 3: Feedback timeout | Feedback timeout |
| 4: Feedback beeps per Second | To configure the number of beeps per second. Every beep is fixed about 10ms. |
| 5: Mode | Configure the operating mode |
| 1: Group1 |  |


#### 1: Set to Default

Set all configuration values to default values (factory settings).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 1 |


#### 2: Audible feedback config

To configure the time the beep is automatically turned off in seconds.  


##### Overview 

The Mini Keypad RFiD/Z-Wave supports 3 types of notification sound configurations:

1 | Notification sound disabled (configuration parameter 2 set to zero)

2 | Notification sound enabled (default, configuration parameter 2 set to auto-stop time).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 15 |


#### 3: Feedback timeout

Feedback timeout  


##### Overview 

To configure the timeout to wait for a WAKEUP\_NO\_MORE\_INFORMATION before the error beep is automatically sound. The error beeps are fixed 8 beeps shortly after each other.       

0    ->   disabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 4: Feedback beeps per Second

To configure the number of beeps per second. Every beep is fixed about 10ms.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 2 |


#### 5: Mode

Configure the operating mode  


##### Overview 

To configure the operating mode. If any mode other then 3, that value will be reported after a get but will be handled in SW as mode 1.

5 | The mode DESCRIPTION: To configure the operating mode. DEFAULT: 0x01 SIZE: 1 byte\* PARAM1: MODE 1: Normal operating mode. MODE 3: Z-Wave chip is always on to request e.g. version or manufacturer id. If any mode other then 3, that value will be reported after a get but will be handled in SW as mode 1. PARAM2,3: not used.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 1 |


#### 1: Group1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/217).
