---
layout: documentation
title: FGD211 - ZWave
---

{% include base.html %}

# FGD211 Universal Dimmer 500W

This describes the Z-Wave device *FGD211*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgd211_02_001```. 

Universal Dimmer 500W


## Channels
The following table summarises the channels available for the FGD211 Universal Dimmer 500W.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Scene Number | scene_number | scene_number |  | Number |
| Updating the dimming level without switch | config_decimal_param40 | config_decimal |  | Decimal |


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
| 7: Control key #2 behaviour | Checking the device status before sending a control frame from the key no. 2. |
| 8: Dimming step at automatic control |  |
| 9: Time of MANUALLY moving between the extreme dimming values | Options for changing parameter 1-255 (10ms - 2,5s) |
| 10: Time of AUTOMATIC moving between the extreme dimming values | Time of Automatic moving the Dimmer between the extreme dimming values |
| 11: Dimming step at manual control | Options for changing parameter 1-99 |
| 12: Maximum dimmer level control | Options for changing parameter 2-99 |
| 13: Minimum dimmer level control | Options for changing parameter 1-98 |
| 14: Inputs Button/Switch configuration | Binary inputs type configuration |
| 15: Parm 15 | Double-click set lighting at 100% |
| 16: Saving state before power failure | Saving state before power failure |
| 17: 3-way switch | 3-way switch function |
| 18: Synchronizing light level for associated devices | The dimmer communicate the level to the associated devices. (default value 0) |
| 19: Change [On-Off] bi-stable keys | Assigns bistable key status to the device status. |
| 20: Minimum level of the Dimmer | Enable decreasing the minimum level of the Dimmer |
| 30: Relay 1: Response to General Alarm | Resonse to alarm of any type |
| 39: ALARM FLASHING alarm time | Amount of time (ms) the device keeps on flashing after receipt of Alarm Frame |
| 40: Updating the dimming level without switch. | Available settings: from 1 to 99. |
| 41: Scene activation functionality | Sending commands with command class scene activation |
| 1: Switch 1 |  |
| 2: Switch 2 |  |
| 3: Controller Updates |  |


#### 1: Enable/Disable ALL ON/OFF

Activate/Deactive ALL ON/OFF


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALL ON disabled / ALL OFF disabled (0) |
|  | ALL ON disabled / ALL OFF active (1) |
|  | ALL ON active / ALL OFF disabled (2) |
|  | ALL ON active / ALL OFF active (255) |


#### 6: Separation of association sending (key 1)

Activate/Deactivate association sending for group 1 - Also see param \#16  


##### Overview 

Sending commands to control devices assigned to 1-st association group (key no. 1).

NOTE: Parameter 15 value must be set to 1 to work properly. This activates the double-click functionality - dimmer/roller shutter control.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Map status to all devices in group 1 (0) |
|  | Map OFF status to all devices in group 1 - last state (1) |
|  | Map OFF status to all devices in group 1 - 100% state (2) |


#### 7: Control key #2 behaviour

Checking the device status before sending a control frame from the key no. 2.  


##### Overview 

Info: Key no. 2 is not represented by any physical device expect of devices on association list. This functionality prevents of lack of reaction on pressing key no. 2 through polling devices from list one by one and checking thier actual states.

It is not possible to check the device status before sending a control frame from the key no. 2 if roller blind switch is chosen in parameter 14 (value 2)

If devices state is checked before sending asociation then parameter 19 should be set to value 0.


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

Time of Automatic moving the Dimmer between the extreme dimming values  


##### Overview 

Options for changing parameter 0-255 (0ms – 2.5s)

0 - this value disables the smooth change in light intensity

NOTE value 0 is required for inductive and capacitive devices unsuitable for dimming, (e.g. fluorescent lamps , motors etc.)


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
| Default Value | 99 |


#### 13: Minimum dimmer level control

Options for changing parameter 1-98


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER |
| Range | 1 to 98 |
| Default Value | 2 |


#### 14: Inputs Button/Switch configuration

Binary inputs type configuration


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Mono-stable input (button) (0) |
|  | Bi-stable input (switch) (1) |
|  | Roller blind switch (UP / DOWN) (2) |


#### 15: Parm 15

Double-click set lighting at 100%


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disable double click (0) |
|  | Enable double click (1) |


#### 16: Saving state before power failure

Saving state before power failure


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_16_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | State NOT saved at power failure (0) |
|  | State saved at power failure. (1) |


#### 17: 3-way switch

3-way switch function  


##### Overview 

The function of 3 - way switch, provides the option to double key no. 1.  
The Dimmer may control two toggle push-buttons or an infinite number of momentary push-buttons.  


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

Assigns bistable key status to the device status.  


##### Overview 

Info: Remote control from Fibaro System Is Still Possible. This function is useful When you want display status of external devices, e.g. Motion Sensor, in Fibaro System.  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_19_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | [On / Off] Device changes status on key status change (0) |
|  | Device status depends on key status. (1) |


#### 20: Minimum level of the Dimmer

Enable decreasing the minimum level of the Dimmer  


##### Overview 

This function will enable decreasing the minimum level of the Dimmer by extending the control impulse. \[100 - 170\]      

By changing the minimem level, the user may completely dim LED bulbs.

Not all LED bulbs available on the market have the dimmm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER |
| Range | 100 to 170 |
| Default Value | 110 |


#### 30: Relay 1: Response to General Alarm

Resonse to alarm of any type  


##### Overview 

Alarm of any type (general alarm, water flooding alarm, smoke alarm: CO, CO2, temperature alarm).  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | Deactivation (0) |
|  | Alarm Dimmer ON (1) |
|  | Alarm Dimmer OFF (2) |
|  | Alarm Flashing (3) |


#### 39: ALARM FLASHING alarm time

Amount of time (ms) the device keeps on flashing after receipt of Alarm Frame


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_39_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 600 |


#### 40: Updating the dimming level without switch.

Available settings: from 1 to 99.  


##### Overview 

Parameter’s value changes depending on the dimming level.  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1 |
| Data Type        | INTEGER |
| Range | 1 to 99 |
| Default Value | 99 |


#### 41: Scene activation functionality

Sending commands with command class scene activation  


##### Overview 

The device offers the possibility of sending commands compatible with Command class scene activation. Information is sent to devices assigned to association group no. 3. Controllers such as Home Center 2 are able to interpret such commands and based on these commands they activate scenes, to which specific scene IDs have been assigned. The user may expand the functionality of the button connected to inputs S1 and S2 by distinguishing the actions of keys connected to those inputs. For example: double click would activate the scene "goodnight" and triple click would activate the scene "morning"


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_41_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Scene functionality deactivated (0) |
|  | Scene functionality activated (1) |


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
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/119).
