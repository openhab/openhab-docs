---
layout: documentation
title: WCD2 - ZWave
---

{% include base.html %}

# WCD2 Double Paddle Wall Controller

This describes the Z-Wave device *WCD2*, manufactured by *Z-Wave.Me* with the thing type UID of ```zwaveme_wcd2_00_000```. 

Double Paddle Wall Controller


## Channels
The following table summarises the channels available for the WCD2 Double Paddle Wall Controller.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the WCD2 Double Paddle Wall Controller.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Button 1 and 3 pair mode | In separate mode button 1 works with group 1, button 3 with groups 3. Click is On, Hold is... |
| 2: Button 2 and 4 pair mode | In separate mode button 1 works with group 2, button 4 with groups 3. Click is On, Hold is... |
| 11: Action on group 1 | In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode t... |
| 12: Action on group 2 | In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode t... |
| 13: Action on group 3 | In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode t... |
| 14: Action on group 4 | In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode t... |
| 20: Typical click timeout | Typical time used to differentiate click, hold and double clicks in 10ms units |
| 21: Send the following Switch All commands |  |
| 22: Invert buttons |  |
| 24: Led Confirmation Mode | This allows to save battery |
| 30: Send unsolicited Battery Report on Wake Up |  |
| 1: Group 1 |  |
| 2: Group 2 |  |
| 3: Group 3 |  |
| 4: Group 4 |  |


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


#### 20: Typical click timeout

Typical time used to differentiate click, hold and double clicks in 10ms units


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 50 |


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


#### 24: Led Confirmation Mode

This allows to save battery


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_24_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No Confirmations (0) |
|  | Confirm Button Press (1) |
|  | Confirm Button Press and delivery (2) |


#### 30: Send unsolicited Battery Report on Wake Up


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No (0) |
|  | To same node as wake up notification (1) |
|  | Broadcast to neighbours (2) |


#### 1: Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Group 3


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Group 4


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/147).
