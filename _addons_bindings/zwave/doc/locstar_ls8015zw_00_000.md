---
layout: documentation
title: LS-8015-ZW - ZWave
---

{% include base.html %}

# LS-8015-ZW KAS-600 Z-Wave Electronic Lock

This describes the Z-Wave device *LS-8015-ZW*, manufactured by *Locstar Technology Co., Ltd* with the thing type UID of ```locstar_ls8015zw_00_000```. 

KAS-600 Z-Wave Electronic Lock  


## Overview 

Zwave enabled single latch door lock with 20 user codes,access logging and scheduled access.

  


### Inclusion Information 

Enter programming code (Default 12345678) followed by 0

  


### Exclusion Information 

Enter programming code (Default 12345678) followed by 0


## Channels
The following table summarises the channels available for the LS-8015-ZW KAS-600 Z-Wave Electronic Lock.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Door Lock | lock_door | lock_door | Door | Switch |
| Alarm (access) | alarm_access | alarm_access | Door | Switch |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |
|  | battery-level | system.battery-level |  |  |
| Clock Time Offset | time_offset | time_offset | Temperature | Number |


### Clock Time Offset

#### Automatic Update Offset

The number of seconds difference in the time before it is reset  
Setting this will automatically update the devices clock when the time difference between the device, and the computer exceeds this number of seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_offset |
| Data Type        | INTEGER |
| Range | 10 to 600 || Default Value | 60 |
| Options | Disable Auto Update (0) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the LS-8015-ZW KAS-600 Z-Wave Electronic Lock.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/752).
