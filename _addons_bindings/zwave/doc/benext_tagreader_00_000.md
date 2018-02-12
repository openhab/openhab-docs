---
layout: documentation
title: Tag Reader - ZWave
---

{% include base.html %}

# Tag Reader Tag Reader

This describes the Z-Wave device *Tag Reader*, manufactured by *BeNext* with the thing type UID of ```benext_tagreader_00_000```. 

Tag Reader


## Channels
The following table summarises the channels available for the Tag Reader Tag Reader.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
| Alarm (access) | notification_access_control | notification_access_control |  | Number |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the Tag Reader Tag Reader.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Set to Default | Set all configuration values to default values (factory settings) |
| 2: Feedback time | the time the beep goes to off |
| 3: Feedback time-out | waiting for the wake-up-no-more command |
| 4: feedback beeps per second | Amount of beeps a second |
| 5: Mode | To configure mode |
| 6: RFID circuit start-up time | The time the RFID will be started after pressing "home" or "away" |
| 1: Association group 1 | Link devices to the tag reader |


#### 1: Set to Default

Set all configuration values to default values (factory settings)  


##### Overview 

If the Value is set to 0xFF (255) this device will return to factory settings.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 2: Feedback time

the time the beep goes to off  


##### Overview 

0x00 = Off, 0xFF = endless


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 15 |


#### 3: Feedback time-out

waiting for the wake-up-no-more command  


##### Overview 

Too configure the time-out, waiting on the wakeup\_no\_more\_information command before the error sound starts automatically. The error sound is set to 8 short beeps.

0x00 = off


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 4: feedback beeps per second

Amount of beeps a second  


##### Overview 

To set the amount of beeps per second, every beep is around 10ms.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 5 |
| Default Value | 2 |


#### 5: Mode

To configure mode  


##### Overview 

Mode 1 =  normal working mode

Mode 3 = z-wave chip is always on to be asked for information, for example version or manufacturer ID.

Any other value will be reported after a GET, but will be seen as a mode 1.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 1 |


#### 6: RFID circuit start-up time

The time the RFID will be started after pressing "home" or "away"  


##### Overview 

0x64 (100 \* 10 ms = 1 s)

The time (\*10 ms) the RFID circuit waits to start after "home" or "away" has been pressed.

the time \*10 miliseconds, minimum = 0 seconds, max = 2,55 seconds. If the value is not in the allowed size the frame will be ignored.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 100 |


#### 1: Association group 1

Link devices to the tag reader  


##### Overview 

This class can be used to link other devices to the tag reader. These devices also get the burglar frame send to them.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/444).
