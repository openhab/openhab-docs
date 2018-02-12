---
layout: documentation
title: IDL-101 - ZWave
---

{% include base.html %}

# IDL-101 Z-Wave Lock

This describes the Z-Wave device *IDL-101*, manufactured by *Alphonsus Tech* with the thing type UID of ```idlock_idl101_00_000```. 

Z-Wave Lock  


## Overview 

http://idlock.no/

  


### Inclusion Information 

1.  Bring the controller as close as possible to the lock unit
2.  Set the controller to inclusion mode
3.  Push and hold KEY button on the inside panel on the lock until all keys on the outside light up and a audible signal is given.
4.  Release the KEY button on the inside panel
5.  Press the key 8 on the outside panel
6.  The LED flashes blue when inclusion is in progress
7.  The inclusion may take some time as security is required

  


### Exclusion Information 

1.  Set the controller to exclusion mode
2.  Push and hold KEY button on the inside panel on the lock until all keys on the outside light up and a audible signal is given.
3.  Release the KEY button on the inside panel
4.  Press the key 8 on the outside panel
5.  The LED flashes blue when exclusion is done

  


### Wakeup Information 

This is a frequently listening device (FLIRS) which supports beaming. This means that the lock will check regularly for incoming commands, and respond quickly without the need for any user specification of wakeup intervals or physical wakeup procedures.


## Channels
The following table summarises the channels available for the IDL-101 Z-Wave Lock.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Door Lock | lock_door | lock_door | Door | Switch |
| Alarm (access) | alarm_access | alarm_access | Door | Switch |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
| Alarm (emergency) | alarm_general | alarm_general | Door | Switch |
| Alarm (number) | alarm_number | alarm_number |  |  |
| Alarm (raw) | alarm_raw | alarm_raw |  | String |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the IDL-101 Z-Wave Lock.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Door Lock Mode | Sets the door lock mode |
| 2: RFID Register Mode | Sets the RFID registration mode |
| 1: Lifeline | Notification reports are sent out to devices included in this association group |


#### 1: Door Lock Mode

Sets the door lock mode  


##### Overview 

No details in manual, will update when the meaning of this parameter is uncovered.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disable Away Manual Lock (0) |
|  | Disable Away Auto Lock (1) |
|  | Enable Away Manual Lock (2) |
|  | Enable Away Auto Lock (3) |


#### 2: RFID Register Mode

Sets the RFID registration mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 1: Lifeline

Notification reports are sent out to devices included in this association group


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/384).
