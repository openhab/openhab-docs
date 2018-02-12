---
layout: documentation
title: BE369 - ZWave
---

{% include base.html %}

# BE369 Keypad Deadbolt

This describes the Z-Wave device *BE369*, manufactured by *Allegion* with the thing type UID of ```schlage_be369_00_000```. 

Keypad Deadbolt  


## Overview 

Schlage BE369 Keypad Door Lock - 

Shares same hardware as FE599 lock (lever version).

  


### Inclusion Information 

1.  When prompted, follow the lock’s enrollment process:
    
    1.  Enter your 6-digit programming code
    2.  Wait for the device to beep three times
    3.  Press the Schlage button
    4.  Press 0
    5.  The Schlage button will blink three times to confirm

  


### Exclusion Information 

1.  When prompted, follow the lock’s removal process:
    
    1.  Enter your 6-digit programming code
    2.  Wait for the device to beep three times
    3.  Press the Schlage button
    4.  Press 0
    5.  The Schlage button will blink three times to confirm

  


### Wakeup Information 

Unknown


## Channels
The following table summarises the channels available for the BE369 Keypad Deadbolt.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Door Lock | lock_door | lock_door | Door | Switch |
| Alarm | alarm_general | alarm_general | Door | Switch |
| Alarm (access) | notification_access_control | notification_access_control |  | Number |
| Alarm (number) | alarm_number | alarm_number |  |  |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the BE369 Keypad Deadbolt.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 3: Beeper | Turn key beep on or off for keypad |
| 1: Alarm Reports |  |


#### 3: Beeper

Turn key beep on or off for keypad  


##### Overview 

Turn key beep on or off for keypad


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disable Beeper (0) |
|  | Enable Beeper (1) |


#### 1: Alarm Reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/518).
