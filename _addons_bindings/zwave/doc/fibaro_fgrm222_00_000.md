---
layout: documentation
title: FGRM222 - ZWave
---

{% include base.html %}

# FGRM222 Roller Shutter

This describes the Z-Wave device *FGRM222*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgrm222_00_000```. 

Roller Shutter


## Channels
The following table summarises the channels available for the FGRM222 Roller Shutter.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Blinds control | blinds_control | blinds_control | Blinds | Rollershutter |
| Scene Number | scene_number | scene_number |  | Number |
| Sensor (power) | sensor_power | sensor_power | Energy | Number |
| Meter (watts) | meter_watts | meter_watts | Energy | Number |
| Meter (kWh) | meter_kwh | meter_kwh | Energy | Number |


### Blinds control

#### Invert control

Invert the blinds control


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_invert_control |
| Data Type        | BOOLEAN || Default Value | false |
| Options | Yes (true) |
|  | No (false) |


#### Invert percentage value

Invert the blinds percentage value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_invert_percent |
| Data Type        | BOOLEAN || Default Value | false |
| Options | Yes (true) |
|  | No (false) |


#### Step duration

Sets the dim rate speed  
Values from 1 to 127 are defined in seconds, while values from 128 to 254 are defined in minutes.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_duration |
| Data Type        | INTEGER |
| Range | 1 to 254 || Default Value | 255 |
| Options | Device Default (255) |
|  | Change Instantly (0) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the FGRM222 Roller Shutter.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Local protection | Enables/disables local entry. If activated module stops responding to S1 and S2 push butto... |
| 2: Radio protection | Enables/disables RF protection. If activated device stops responding to command frames. Co... |
| 3: Reports type | Parameters value shoud be set to 1 if the module operates in Venetian Blind mode. |
| 10: Roller Shutter operating modes |  |
| 12: Turning time/ delay time | In Venetian Blind mode (parameter 10 set to 2) the parameter determines time of full turn ... |
| 13: Lamellas positioning mode | Parameter influences the lamellas positioning in venetian blind mode (parameter 10 set to ... |
| 14: Switch type | parameter settings are relevant for Roller Blind Mode and Venetian Blind Mode (parameter 1... |
| 17: Delay time after S2 | In roller blind mode or venetian blind mode (parameter 10 set to 0, 1, 2) the parameter de... |
| 18: Motor operation detection | Power threshold to be interpreted as reaching a limit switch. |
| 22: Motor operation time | Time period for the motor to continue operation. |
| 29: Forced Roller Shutter calibration | Seting the parameter to 1 Roller Shutter enters the calibration mode. Parameter is only on... |
| 30: Response to General Alarm |  |
| 31: Response to Water Flood Alarm |  |
| 32: Response to Smoke, CO, CO2 Alarm |  |
| 33: Response to Temperature Alarm |  |
| 35: Managing lamellas in response to alarm | In Venetian Blind Mode (parameter 10 set to 2), the parameter determines how the lamellas ... |
| 40: Power reports | Power level change that will result in new power value report being sent. value is a perce... |
| 42: Periodic power or energy reports | Time to the next report. Value of 0 means the reports are turned off. |
| 43: Energy reports | Energy level change which will result in new energy value report being sent. Value of 0 me... |
| 44: Self-measurement | Enables/disables to include the power and energy used by itself in reports to main control... |
| 50: Scenes/ Associations activation | Parameter determines whether scenes or associations are activated by the switch keys. |
| 1: Momentary click |  |
| 2: Momentary hold |  |
| 3: Controller Updates |  |


#### 1: Local protection

Enables/disables local entry. If activated module stops responding to S1 and S2 push buttons, SCENE ID and association commands will not be sent. Only exception is the B-button.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | No protection. Roller Shutter responds to push buttons (0) |
|  | Local protection active. Roller Shutter does not respond to push butto (2) |


#### 2: Radio protection

Enables/disables RF protection. If activated device stops responding to command frames. Configuration and polling still possible.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No protection. Roller Shutter responds to command frames. (0) |
|  | RF Protection active. Roller Shutter does not respond to the Z-Wave co (1) |


#### 3: Reports type

Parameters value shoud be set to 1 if the module operates in Venetian Blind mode.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Blind position reports sent to the main controller using Z-Wave Comman (0) |
|  | Blind position reports sent to the main controller using Fibar Command (1) |


#### 10: Roller Shutter operating modes


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Roller Blind Mode, without positioning (0) |
|  | Roller Blind Mode, with positioning (1) |
|  | Venetian Blind Mode, with positioning (2) |
|  | Gate Mode, without positioning (3) |
|  | Gate Mode, with positioning (4) |


#### 12: Turning time/ delay time

In Venetian Blind mode (parameter 10 set to 2) the parameter determines time of full turn of the lamellas. In Gate Mode (parameter 10 set to 3 or 4) the parameter defines the delay time after which an open gate starts closing. Type range


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 150 |


#### 13: Lamellas positioning mode

Parameter influences the lamellas positioning in venetian blind mode (parameter 10 set to 2)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Lamellas return to previously set position only in case of the main co (0) |
|  | Lamellas return to previously set position in case of the main control (1) |
|  | Lamellas return to previously set position in case of the main control (2) |


#### 14: Switch type

parameter settings are relevant for Roller Blind Mode and Venetian Blind Mode (parameter 10 set to 0, 1, 2).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Momentary switches (0) |
|  | Toggle switches (1) |
|  | Single, momentary switch. (2) |


#### 17: Delay time after S2

In roller blind mode or venetian blind mode (parameter 10 set to 0, 1, 2) the parameter determines when the Roller Shutter relays are turned off after reaching a limit switch. In Gate Mode (parameter 10 set to 3 or 4) the parameter determines a time perio


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_17_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 10 |


#### 18: Motor operation detection

Power threshold to be interpreted as reaching a limit switch.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_18_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 10 |


#### 22: Motor operation time

Time period for the motor to continue operation.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_22_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 10 |


#### 29: Forced Roller Shutter calibration

Seting the parameter to 1 Roller Shutter enters the calibration mode. Parameter is only only relevant if a Roller Shutter is set to work in positioning mode (parameter 10 set to 1, 2 or 4).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_29_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Deactivated (0) |
|  | Start calibration process (1) |


#### 30: Response to General Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | No response to alarm frames (0) |
|  | Open Blind (1) |
|  | Close Blind (2) |


#### 31: Response to Water Flood Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_31_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No response to alarm frames (0) |
|  | Open Blind (1) |
|  | Close Blind (2) |


#### 32: Response to Smoke, CO, CO2 Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_32_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | No response to alarm frames (0) |
|  | Open Blind (1) |
|  | Close Blind (2) |


#### 33: Response to Temperature Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_33_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | No response to alarm frames (0) |
|  | Open Blind (1) |
|  | Close Blind (2) |


#### 35: Managing lamellas in response to alarm

In Venetian Blind Mode (parameter 10 set to 2), the parameter determines how the lamellas will react upon alarm detection.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_35_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Do not change lamellas position (0) |
|  | Set lamellas to their extreme position (1) |


#### 40: Power reports

Power level change that will result in new power value report being sent. value is a percentage of the previous report.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 10 |


#### 42: Periodic power or energy reports

Time to the next report. Value of 0 means the reports are turned off.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_2 |
| Data Type        | INTEGER |
| Range | -32767 to 32767 |
| Default Value | 3600 |


#### 43: Energy reports

Energy level change which will result in new energy value report being sent. Value of 0 means the reports are turned off.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_43_1 |
| Data Type        | INTEGER |
| Range | -126 to 127 |
| Default Value | 10 |


#### 44: Self-measurement

Enables/disables to include the power and energy used by itself in reports to main controller.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_44_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disabled (0) |
|  | Activated (1) |


#### 50: Scenes/ Associations activation

Parameter determines whether scenes or associations are activated by the switch keys.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_50_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Associations Active (0) |
|  | Scenes Active (1) |


#### 1: Momentary click


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Momentary hold


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
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/116).
