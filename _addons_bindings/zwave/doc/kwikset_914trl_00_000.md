---
layout: documentation
title: 914TRL - ZWave
---

{% include base.html %}

# 914TRL Touchpad Electronic Deadbolt

This describes the Z-Wave device *914TRL*, manufactured by *Black &amp; Decker* with the thing type UID of ```kwikset_914trl_00_000```. 

Touchpad Electronic Deadbolt  


## Overview 

The following table provides a reference of the Alarm\_Number related messages.

Alarm Type    Alarm Level            Notification Event  

021              001                      Lock Secured using Keyed cylinder or inside thumb-turn  

022              001                      Lock Un-Secured using Keyed cylinder or inside thumb-turn  

026              001                      Lock Auto Secured – Bolt Jammed (Not fully extended)

027              001                      Lock Auto Secured – Successful (Fully extended)  

017              001                      Lock Secured at Keypad – Bolt Jammed (Not fully extended)   

018              000 or User-ID\#\*   Lock Secured at Keypad – Successful (Fully extended)   

019              User-ID\#\*              Lock Un-Secured by User (User-ID) at Keypad  

023              001                      Lock Secured by Controller – Bolt Jammed (Not fully extended)   

024              001                      Lock Secured by Controller – Successful (Fully extended)   

025              001                      Lock Un-Secured by Controller – Successful (Fully retracted)  

112              User-ID\#\*              New User Code (User-ID\#) added to the lock  

032              001                      All User Codes deleted from lock   

161              001                      Failed User Code attempt at Keypad  

162              User-ID\#\*             Attempted access by user (User-ID\#) outside of scheduled   

167              001                      Low battery level   

168              001                      Critical battery level   

169              001                      Battery level too low to operate lock  

\* User-ID\# values: 001 to 030

  


### Inclusion Information 

 Press button “A” on the lock one time to include it in your system.

  


### Exclusion Information 

 Press button “A” on the lock one time to exclude it in your system.


## Channels
The following table summarises the channels available for the 914TRL Touchpad Electronic Deadbolt.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Door Lock | lock_door | lock_door | Door | Switch |
| Alarm | alarm_number | alarm_number |  |  |
| Alarm Raw | alarm_raw | alarm_raw |  | String |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the 914TRL Touchpad Electronic Deadbolt.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 31: Auto Buzzer | Beeping sound enabled. |
| 31: Auto Lock | Automatically re-locks door 30 seconds after unlocking. |
| 31: Lock LED Status | Door lock status LED blinks every 6 seconds. |
| 40: Factory Default | Reset to factory default settings. |
| 1: Group 1 |  |


#### 31: Auto Buzzer

Beeping sound enabled.  


##### Overview 

Beeping sound enabled. When disabled, keypad buttons light red or amber when pressed.

ON position is factory default.

Note: It is recommended that the beeping sound is enabled during programming.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_31_1_00100000 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | OFF (0) |
|  | ON (1) |


#### 31: Auto Lock

Automatically re-locks door 30 seconds after unlocking.  


##### Overview 

Lock automatically re-locks door 30 seconds after unlocking. OFF position is factory default. If this switch is turned on, it will be disabled if all codes are deleted from the lock.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_31_1_01000000 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | OFF (0) |
|  | ON (1) |


#### 31: Lock LED Status

Door lock status LED blinks every 6 seconds.  


##### Overview 

Door lock status LED blinks every 6 seconds. ON position is factory default.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_31_1_10000000 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | OFF (0) |
|  | ON (1) |


#### 40: Factory Default

Reset to factory default settings.  


##### Overview 

Reset factory default settings, except for the anti-theft setting.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1_wo |
| Data Type        | INTEGER |
| Range | 0 to 1 || Default Value | 0 |
| Options | Factory Default (1) |


#### 1: Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/283).
