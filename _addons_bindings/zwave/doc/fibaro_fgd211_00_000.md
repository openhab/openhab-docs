---
layout: documentation
title: FGD211 - ZWave
---

{% include base.html %}

# FGD211 Universal Dimmer 500W

This describes the Z-Wave device *FGD211*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgd211_00_000```. 

Universal Dimmer 500W


## Channels
The following table summarises the channels available for the FGD211 Universal Dimmer 500W.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |


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
The following table provides a summary of the configuration parameters available in the FGD211 Universal Dimmer 500W.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Enable/Disable ALL ON/OFF | Activate/Deactive ALL ON/OFF |
| 6: Separation of association sending (key 1) | Activate/Deactivate association sending for group 1 - Also see param \#16 |
| 7: Control key #2 behaviour | Key no.2 is not represented by any physical device - only devices in the association list.... |
| 8: Dimming step at automatic control |  |
| 9: Time of MANUALLY moving between the extreme dimming values | Options for changing parameter 1-255 (10ms - 2,5s) |
| 10: Time of AUTOMATIC moving between the extreme dimming values | Options for changing parameter 1-255 (10ms - 2,5s) - 0: this value disables the smooth cha... |
| 11: Dimming step at manual control | Options for changing parameter 1-99 |
| 12: Maximum dimmer level control | Options for changing parameter 2-99 |
| 13: Minimum dimmer level control | Options for changing parameter 1-98 |
| 14: Inputs Button/Switch configuration | Binary inputs type configuration |
| 15: Parm 15 | Double-click set lighting at 100% |
| 16: Saving state before power failure | Saving state before power failure |
| 17: 3-way switch | The function of 3-way switch provides the option to double key no. 1. The dimmer may contr... |
| 18: Synchronizing light level for associated devices | The dimmer communicate the level to the associated devices. (default value 0) |
| 19: Change [On-Off] bi-stable keys | This function allow user to change \[On-Off\] bi-stable keys (parameter no. 14) (default v... |
| 20: Parm 20 | This function will enable decreasing the minimum level of the Dimmer by extending the cont... |
| 30: Relay 1: Response to General Alarm |  |
| 39: ALARM FLASHING alarm time | Amount of time (ms) the device keeps on flashing after receipt of Alarm Frame |
| 1: Switch 1 |  |
| 2: Switch 2 |  |
| 3: Controller Updates |  |


#### 1: Enable/Disable ALL ON/OFF

Activate/Deactive ALL ON/OFF


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALL ON active / ALL OFF active (-1) |
|  | ALL ON disabled / ALL OFF disabled (0) |
|  | ALL ON disabled / ALL OFF active (1) |
|  | ALL ON active / ALL OFF disabled (2) |


#### 6: Separation of association sending (key 1)

Activate/Deactivate association sending for group 1 - Also see param \#16


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Map status to all devices in group 1 (0) |
|  | Map OFF status to all devices in group 1, Double click on key 1 will s (1) |
|  | Map OFF status to all devices in group 1, Double click on key 1 will s (2) |


#### 7: Control key #2 behaviour

Key no.2 is not represented by any physical device - only devices in the association list. This functionality prevents of lack of reaction on pressing key no.2 through polling devices from association list one by one and checking their


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Device status is not checked (0) |
|  | Device status is checked (1) |


#### 8: Dimming step at automatic control


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 1 to 99 |
| Default Value | 1 |


#### 9: Time of MANUALLY moving between the extreme dimming values

Options for changing parameter 1-255 (10ms - 2,5s)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 5 |


#### 10: Time of AUTOMATIC moving between the extreme dimming values

Options for changing parameter 1-255 (10ms - 2,5s) - 0: this value disables the smooth change in light intensity. NOTE: value 0 is required for inductive and capacitive devices unsuitable for dimming (e.g. fluorescent lamps, motors, etc...)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 1 |


#### 11: Dimming step at manual control

Options for changing parameter 1-99


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER |
| Range | 1 to 99 |
| Default Value | 1 |


#### 12: Maximum dimmer level control

Options for changing parameter 2-99


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 2 to 99 |
| Default Value | 2 |


#### 13: Minimum dimmer level control

Options for changing parameter 1-98


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 14: Inputs Button/Switch configuration

Binary inputs type configuration


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Mono-stable input (button) (0) |
|  | Bi-stable input (switch) (1) |


#### 15: Parm 15

Double-click set lighting at 100%


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable double click (0) |
|  | Enable double click (1) |


#### 16: Saving state before power failure

Saving state before power failure


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_16_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | State NOT saved at power failure, all outputs are set to OFF upon powe (0) |
|  | State saved at power failure, all outputs are set to previous state up (1) |


#### 17: 3-way switch

The function of 3-way switch provides the option to double key no. 1. The dimmer may control two bi-stable push-buttons or an infinite number of mono-stable push-buttons. (default value 0)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_17_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (1) |


#### 18: Synchronizing light level for associated devices

The dimmer communicate the level to the associated devices. (default value 0)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_18_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (1) |


#### 19: Change [On-Off] bi-stable keys

This function allow user to change \[On-Off\] bi-stable keys (parameter no. 14) (default value 0)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_19_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Device changes status on key status change (0) |
|  | Device status depends on key status; ON when the key is ON, OFF when t (1) |


#### 20: Parm 20

This function will enable decreasing the minimum level of the Dimmer by extending the control impulse.\[100 - 170\] By changing the minimem level, the user may completely dim LED bulbs. Not all LED bulbs available on the market have the dimmm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER |
| Range | 100 to 170 |
| Default Value | 110 |


#### 30: Relay 1: Response to General Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | DEACTIVATION - no response to alarm frames (0) |
|  | ALARM RELAY ON - relay will turn ON upon receipt of alarm frame (1) |
|  | ALARM RELAY OFF - relay will turn OFF upon receipt of alarm frame (2) |
|  | ALARM FLASHING - relay will turn ON and OFF periodically (see param.39 (3) |


#### 39: ALARM FLASHING alarm time

Amount of time (ms) the device keeps on flashing after receipt of Alarm Frame


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_39_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 600 |


#### 1: Switch 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Switch 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Controller Updates


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/117).
