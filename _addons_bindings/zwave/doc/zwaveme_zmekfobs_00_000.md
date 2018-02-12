---
layout: documentation
title: ZME_KFOB-S - ZWave
---

{% include base.html %}

# ZME_KFOB-S Secure 4 Button Key Chain Controller

This describes the Z-Wave device *ZME_KFOB-S*, manufactured by *Z-Wave.Me* with the thing type UID of ```zwaveme_zmekfobs_00_000```. 

Secure 4 Button Key Chain Controller


## Channels
The following table summarises the channels available for the ZME_KFOB-S Secure 4 Button Key Chain Controller.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZME_KFOB-S Secure 4 Button Key Chain Controller.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Button 1 and 3 pair mode | Set Button 1 and 3 pair mode |
| 2: Button 2 and 4 pair mode | Set Button 2 and 4 pair mode |
| 11: Command to Control Group A | Set Command to Control Group A |
| 12: Command to Control Group B | Set Command to Control Group B |
| 13: Command to Control Group C | Set Command to Control Group C |
| 14: Command to Control Group D | Set Command to Control Group D |
| 21: Send the following Switch All commands | Set Send the following Switch All commands |
| 22: Invert buttons | Invert buttons |
| 25: Blocks wakeup even when wakeup interval is set | Set Blocks wakeup even when wakeup interval is set |
| 30: Send unsolicited Battery Report on Wake Up | Set Send unsolicited Battery Report on Wake Up |
| 1: Lifeline |  |
| 2: Control Group A |  |
| 3: Control Group B |  |
| 4: Control Group C |  |
| 5: Control Group D |  |


#### 1: Button 1 and 3 pair mode

Set Button 1 and 3 pair mode  


##### Overview 

In separate mode button 1 works with group A, button 3 with groups C. Click is On, Hold is dimming Up, Double click is Off, Click-Hold is dimming Down. In pair button 1/3 are Up/Down correspondingly. Click is On/Off, Hold is dimming Up/Down. Single clicks works with group A, double click with group C. Default Value: 01


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Separately (0) |
|  | In pair without double clicks (1) |
|  | In pair with double clicks (2) |


#### 2: Button 2 and 4 pair mode

Set Button 2 and 4 pair mode  


##### Overview 

In separate mode button 2 works with control group B, button 4 with control group D. Click is On, Hold is dimming Up, Double click is Off, Click-Hold is dimming Down. In pair button B/D are Up/Down correspondingly. Click is On/Off, Hold is dimming Up/Down. Single clicks works with group B, double click with group D. Default Value: 01


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Separately (0) |
|  | In pair without double clicks (1) |
|  | In pair with double clicks (2) |


#### 11: Command to Control Group A

Set Command to Control Group A  


##### Overview 

This parameter defines the command to be sent to devices of control group A when the related button is pressed. Default Value: 08


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER || Default Value | 8 |
| Options | Disabled (0) |
|  | Switch On/Off and Dim (send Basic Set and Switch Multilevel) (1) |
|  | Switch On/Off only (send Basic Set) (2) |
|  | Switch All (3) |
|  | Send Scenes (4) |
|  | Send Preconfigured Scenes (5) |
|  | Control devices in proximity (6) |
|  | Control DoorLock (7) |
|  | Central Scene to Gateway (8) |


#### 12: Command to Control Group B

Set Command to Control Group B  


##### Overview 

This parameter defines the command to be sent to devices of control group B when the related button is pressed. Default Value: 08


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER || Default Value | 8 |
| Options | Disabled (0) |
|  | Switch On/Off and Dim (send Basic Set and Switch Multilevel) (1) |
|  | Switch On/Off only (send Basic Set) (2) |
|  | Switch All (3) |
|  | Send Scenes (4) |
|  | Send Preconfigured Scenes (5) |
|  | Control devices in proximity (6) |
|  | Control DoorLock (7) |
|  | Central Scene to Gateway (8) |


#### 13: Command to Control Group C

Set Command to Control Group C  


##### Overview 

This parameter defines the command to be sent to devices of control group C when the related button is pressed. Default Value: 08


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER || Default Value | 8 |
| Options | Disabled (0) |
|  | Switch On/Off and Dim (send Basic Set and Switch Multilevel) (1) |
|  | Switch On/Off only (send Basic Set) (2) |
|  | Switch All (3) |
|  | Send Scenes (4) |
|  | Send Preconfigured Scenes (5) |
|  | Control devices in proximity (6) |
|  | Control DoorLock (7) |
|  | Central Scene to Gateway (8) |


#### 14: Command to Control Group D

Set Command to Control Group D  


##### Overview 

This parameter defines the command to be sent to devices of control group D when the related button is pressed. Default Value: 08


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER || Default Value | 8 |
| Options | Disabled (0) |
|  | Switch On/Off and Dim (send Basic Set and Switch Multilevel) (1) |
|  | Switch On/Off only (send Basic Set) (2) |
|  | Switch All (3) |
|  | Send Scenes (4) |
|  | Send Preconfigured Scenes (5) |
|  | Control devices in proximity (6) |
|  | Control DoorLock (7) |
|  | Central Scene to Gateway (8) |


#### 21: Send the following Switch All commands

Set Send the following Switch All commands  


##### Overview 

Send the following Switch All commands


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Switch off only (1) |
|  | Switch on only (2) |
|  | Switch all on and off (255) |


#### 22: Invert buttons

Invert buttons  


##### Overview 

Invert buttons


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_22_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No (0) |
|  | Yes (1) |


#### 25: Blocks wakeup even when wakeup interval is set

Set Blocks wakeup even when wakeup interval is set  


##### Overview 

If the KFOB wakes up and there is no controller nearby, several unsuccessful communication attempts will drain battery  
Size: 1 Byte, Default Value: 00


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_25_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Wakeup is blocked (0) |
|  | Wakeup is possible if configured accordingly (1) |


#### 30: Send unsolicited Battery Report on Wake Up

Set Send unsolicited Battery Report on Wake Up  


##### Overview 

Set Send unsolicited Battery Report on Wake Up


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | No (0) |
|  | To same node as wake up notification (1) |
|  | Broadcast to neighbors (2) |


#### 1: Lifeline


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Control Group A

  


##### Overview 

Control Group A, controlled by button 1 or single clicks of buttons


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Control Group B

  


##### Overview 

Control Group B, controlled by button 2 or single clicks of buttons 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Control Group C

  


##### Overview 

Control Group C, controlled by button 3 or double clicks of buttons 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Control Group D

  


##### Overview 

Control Group D, controlled by button 4 or double clicks of buttons 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/548).
