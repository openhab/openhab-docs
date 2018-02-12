---
layout: documentation
title: BTZW125 - ZWave
---

{% include base.html %}

# BTZW125 Danalock v2 circle

This describes the Z-Wave device *BTZW125*, manufactured by *Poly-control* with the thing type UID of ```polycontrol_btzu125_00_000```. 

Danalock v2 circle


## Channels
The following table summarises the channels available for the BTZW125 Danalock v2 circle.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Door Lock | lock_door | lock_door | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the BTZW125 Danalock v2 circle.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Direction | Direction |
| 2: Speed (Torque) | Speed (Torque) |
| 3: Mode | Mode |
| 4: Turn degrees | Turn degrees |
| 5: Auto Latch time | Auto Latch time |
| 6: Sound | Sound |
| 7: Battery Type | Battery Type |
| 8: Battery alarm | Battery alarm value |
| 9: TurnAndGo | TurnAndGo |
| 10: BrakeAndGoBack | Turn 75 degrees back after x seconds |
| 11: Async | Used if the lock is using an optional rotation sensor |
| 12: ReportType | Door lock operation report type |
| 1: LifeLine | Z-Wave Plus Lifeline |


#### 1: Direction

Direction  


##### Overview 

0 -> The motor goes clockwise when latched

1 -> The motor goes counterclockwise when latched


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Clockwise (0) |
|  | The motor goes counterclockwise when latched (1) |


#### 2: Speed (Torque)

Speed (Torque)  


##### Overview 

1 -> Slowest

2 -> Slow

3 -> (Default) Normal

4 -> Fast

5 -> Fastest


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | Slowest (1) |
|  | Slow (2) |
|  | Normal (3) |
|  | Fast (4) |
|  | Fastest (5) |


#### 3: Mode

Mode  


##### Overview 

0 -> Stepper motor mode wave drive(power saving)

1 -> (Default) Stepper motor mode full drive(Normal)

2 -> Relay mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Powersaving (0) |
|  | Full drive (1) |
|  | Relay mode (2) |


#### 4: Turn degrees

Turn degrees  


##### Overview 

(Default) Factor 10 turn degrees ( 1 = 10 degrees, 9 = 90 degrees etc.)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 |
| Default Value | 1 |


#### 5: Auto Latch time

Auto Latch time  


##### Overview 

How many seconds from the lock has been unlatched to it automatically should close again. If 0 then it is disabled.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 0 to 60 |
| Default Value | 0 |


#### 6: Sound

Sound  


##### Overview 

Enable the beep sound from latch or unlatch operations


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disable sound (0) |
|  | Enable Sound (1) |


#### 7: Battery Type

Battery Type  


##### Overview 

2 -> Mains power, changing from and to mains power requires the Danalock to be excluded and included.

0 -> 3,6 Volt battery

1 -> (Default) 3.0 Volt battery.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | 3,6V (0) |
|  | 3,0V (1) |
|  | Mains power (2) |


#### 8: Battery alarm

Battery alarm value  


##### Overview 

When the battery level is under this value, the device will notify user with a beep sound after latch or unlatch


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 0 |


#### 9: TurnAndGo

TurnAndGo  


##### Overview 

using a optional rotation sensor. Latch&Go on will turn automatically when manual turn is detected.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Off (0) |
|  | On (1) |


#### 10: BrakeAndGoBack

Turn 75 degrees back after x seconds  


##### Overview 

0 -> (Default) Disabled

1 to 15 -> Seconds to brake. When used the lock will brake for x amount of seconds and then turn 75 degrees back. Made for special doors without door lever.(Only when unlatching).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disabled (0) |
|  | 1 second (1) |
|  | Brake for 2 seconds (2) |
|  | Brake for 3 seconds (3) |
|  | Brake for 4 seconds (4) |
|  | Brake for 5 seconds (5) |
|  | Brake for 6 seconds (6) |
|  | Brake for 7 seconds (7) |
|  | Brake for 8 seconds (8) |
|  | Brake for 9 seconds (9) |
|  | Brake for 10 seconds (10) |
|  | Brake for 11 seconds (11) |
|  | Brake for 12 seconds (12) |
|  | Brake for 13 seconds (13) |
|  | Brake for 14 seconds (14) |
|  | Brake for 15 seconds (15) |


#### 11: Async

Used if the lock is using an optional rotation sensor  


##### Overview 

0 -> (Default) Async off

1 -> Async on. Used if the lock is using an optional rotation sensor. When async is enabled the lock will auto calibrate if already unlatched and asked to Unlatch again (used for special door locks where the key turn is asynced from the inside nob.)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Async off (0) |
|  | Async on (1) |


#### 12: ReportType

Door lock operation report type  


##### Overview 

Door lock operation report type

2 -> No Door lock operation reports are sent unsolicited.

0 -> (Default) Simple supported by all controllers that support door locks.

1 -> Advanced, more specific reports through notification Command Class.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Default (0) |
|  | Advanced (1) |
|  | No reporting (2) |


#### 1: LifeLine

Z-Wave Plus Lifeline


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/407).
