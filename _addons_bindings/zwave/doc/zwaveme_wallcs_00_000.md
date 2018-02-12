---
layout: documentation
title: WALLC-S - ZWave
---

{% include base.html %}

# WALLC-S Wall Controller

This describes the Z-Wave device *WALLC-S*, manufactured by *Z-Wave.Me* with the thing type UID of ```zwaveme_wallcs_00_000```. 

Wall Controller


## Channels
The following table summarises the channels available for the WALLC-S Wall Controller.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Scene Activation | scene_number | scene_number |  | Number |
| Scene Number | scene_number | scene_number |  | Number |
|  | battery-level | system.battery-level |  |  |


### Dimmer

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the WALLC-S Wall Controller.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Button 1 and 3 pair mode | In separate mode button 1 works with group 1, button 3 with groups 3. Click is On, Hold is... |
| 2: Button 2 and 4 pair mode | In separate mode button 1 works with group 2, button 4 with groups 3. Click is On, Hold is... |
| 11: Action on group 1 | In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode t... |
| 12: Action on group 2 | In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode t... |
| 13: Action on group 3 | In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode t... |
| 14: Action on group 4 | In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode t... |
| 21: Send the following Switch All commands |  |
| 22: Invert buttons |  |
| 25: Blocks wakeup even when wakeup interval is set | If the device wakes up and there is no controller nearby, several unsuccessful communicati... |
| 30: Send unsolicited Battery Report on Wake Up |  |
| 1: Lifeline |  |
| 2: Group 1 |  |
| 3: Group 2 |  |
| 4: Group 3 |  |
| 5: Group 4 |  |


#### 1: Button 1 and 3 pair mode

In separate mode button 1 works with group 1, button 3 with groups 3. Click is On, Hold is dimming Up, Double click is Off, Click-Hold is dimming Down. In pair button 1/3 are Up/Down correspondingly. Click is On/Off, Hold is dimming Up/Down. Single clicks


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Separately (0) |
|  | In pair without double clicks (1) |
|  | In pair with double clicks (2) |


#### 2: Button 2 and 4 pair mode

In separate mode button 1 works with group 2, button 4 with groups 3. Click is On, Hold is dimming Up, Double click is Off, Click-Hold is dimming Down. In pair button 2/4 are Up/Down correspondingly. Click is On/Off, Hold is dimming Up/Down. Single clicks


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Separately (0) |
|  | In pair without double clicks (1) |
|  | In pair with double clicks (2) |


#### 11: Action on group 1

In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode the scene ID sent is (10 \* group + ActionID), where ActionID is: 1 = On, 2 = Off, 3 = Dim Up Start, 4 = Dim Down Start, 5 = Dim Up Stop, 6 = Dim Down Stop


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disabled (0) |
|  | Switch On/Off and Dim (send Basic Set and Switch Multilevel) (1) |
|  | Switch On/Off only (send Basic Set) (2) |
|  | Switch all (3) |
|  | Send Scenes (4) |
|  | Send Preconfigured Scenes (5) |
|  | Control Door Lock (7) |
|  | Central Scene to Gateway (8) |


#### 12: Action on group 2

In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode the scene ID sent is (10 \* group + ActionID), where ActionID is: 1 = On, 2 = Off, 3 = Dim Up Start, 4 = Dim Down Start, 5 = Dim Up Stop, 6 = Dim Down Stop


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disabled (0) |
|  | Switch On/Off and Dim (send Basic Set and Switch Multilevel) (1) |
|  | Switch On/Off only (send Basic Set) (2) |
|  | Switch all (3) |
|  | Send Scenes (4) |
|  | Send Preconfigured Scenes (5) |
|  | Control Door Lock (7) |
|  | Central Scene to Gateway (8) |


#### 13: Action on group 3

In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode the scene ID sent is (10 \* group + ActionID), where ActionID is: 1 = On, 2 = Off, 3 = Dim Up Start, 4 = Dim Down Start, 5 = Dim Up Stop, 6 = Dim Down Stop


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disabled (0) |
|  | Switch On/Off and Dim (send Basic Set and Switch Multilevel) (1) |
|  | Switch On/Off only (send Basic Set) (2) |
|  | Switch all (3) |
|  | Send Scenes (4) |
|  | Send Preconfigured Scenes (5) |
|  | Control Door Lock (7) |
|  | Central Scene to Gateway (8) |


#### 14: Action on group 4

In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode the scene ID sent is (10 \* group + ActionID), where ActionID is: 1 = On, 2 = Off, 3 = Dim Up Start, 4 = Dim Down Start, 5 = Dim Up Stop, 6 = Dim Down Stop


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disabled (0) |
|  | Switch On/Off and Dim (send Basic Set and Switch Multilevel) (1) |
|  | Switch On/Off only (send Basic Set) (2) |
|  | Switch all (3) |
|  | Send Scenes (4) |
|  | Send Preconfigured Scenes (5) |
|  | Control Door Lock (7) |
|  | Central Scene to Gateway (8) |


#### 21: Send the following Switch All commands


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | NO (Normal Open) (1) |
|  | NC (Normal Close) (2) |
|  | Switch all on and off (255) |


#### 22: Invert buttons


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_22_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No (0) |
|  | Yes (1) |


#### 25: Blocks wakeup even when wakeup interval is set

If the device wakes up and there is no controller nearby, several unsuccessful communication attempts will drain battery.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_25_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Wakeup is blocked (0) |
|  | Wakeup is possible (1) |


#### 30: Send unsolicited Battery Report on Wake Up


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No (0) |
|  | To same node as wake up notification (1) |
|  | Broadcast to neighbours (2) |


#### 1: Lifeline


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Group 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Group 3


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Group 4


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/145).
