---
layout: documentation
title: FGRGBW - ZWave
---

{% include base.html %}

# FGRGBW RGBW Controller

This describes the Z-Wave device *FGRGBW*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgrgbw_00_000```. 

RGBW Controller


## Channels
The following table summarises the channels available for the FGRGBW RGBW Controller.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Sensor (power) | sensor_power | sensor_power | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Color | color_color | color_color |  | Color |
| Start animation | scene_number_param72 | scene_number |  | Number |
| Red | switch_dimmer2 | switch_dimmer | DimmableLight | Dimmer |
| Green | switch_dimmer3 | switch_dimmer | DimmableLight | Dimmer |
| Blue | switch_dimmer4 | switch_dimmer | DimmableLight | Dimmer |
| White | switch_dimmer5 | switch_dimmer | DimmableLight | Dimmer |


### Dimmer

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Red

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Green

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Blue

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### White

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the FGRGBW RGBW Controller.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: ALL ON / ALL OFF function activation | Activation/deactivation of ALL ON/ALL OFF functions. |
| 6: Associations command class choice | Associations command class choice. By default, Normal (Dimmer) - BASIC\_SET/SWITCH\_MULTIL... |
| 8: Outputs state change mode | MODE1, Example: change saturation level from 0% to 99% Parameter 9: Step = 5 Parameter 10:... |
| 9: Step value (relevant for MODE1) | Step value (relevant for MODE1). |
| 10: Time between steps (relevant for MODE1) | Time between steps (relevant for MODE1). |
| 11: Time for changing from start to end value | Step value (relevant for MODE1). |
| 12: Maximum Brightening level | Maximum Brightening level. |
| 13: Minimum dim level | Minimum dim level. Default setting: 2 Available settings: 3 - 255. |
| 14: Inputs/Outputs configuration - relevant for main controllers other than Home Center 2 only | Inputs/Outputs configuration - relevant for main controllers other than Home Center 2 only... |
| 16: Remember device status after power failure | Define how will the Plug react after the power supply is back on. Default setting: 1 Avail... |
| 30: Alarm of any type (General alarm, flood alarm, smoke alarm: CO, CO2, temperature alarm.) | Alarm of any type (General alarm, flood alarm, smoke alarm: CO, CO2, temperature alarm.) D... |
| 38: Alarm sequence program | Alarm sequence program. |
| 39: Active PROGRAM alarm time | IActive PROGRAM alarm time. |
| 42: Command class reporting Outputs status change | Command class reporting Outputs status change. Default setting: 0 |
| 43: Reporting 0-10v analog inputs change threshold | Parameter defines a value by which input voltage must change in order to be reported to th... |
| 44: Power load reporting frequency | Parameter defines Time between reports. The report will be sent if last reported value dif... |
| 45: Reporting Changes in energy consumed by controlled devices | Defines the required change in power to generate an unsolicited power report. |
| 71: Response to BRIGHTNESS set to 0% | Response to BRIGHTNESS set to 0%. Default setting: 1 |
| 72: Starting animation program | Starting animation programm. Starting predefined program when device set to work in RGB/RG... |
| 73: Triple click action | Triple click action. Default setting: 0 |
| 1: Assigned to IN1 input |  |
| 2: Assigned to IN2 input |  |
| 3: Assigned to IN3 input |  |
| 4: Assigned to IN4 input |  |
| 5: Reports device status |  |


#### 1: ALL ON / ALL OFF function activation

Activation/deactivation of ALL ON/ALL OFF functions.  


##### Overview 

By default, ALL ON active ALL OFF active.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALL ON active ALL OFF active (-1) |
|  | ALL ON inactive ALL OFF inactive (0) |
|  | ALL ON inactive ALL OFF active (1) |
|  | ALL ON active ALL OFF inactive (2) |


#### 6: Associations command class choice

Associations command class choice. By default, Normal (Dimmer) - BASIC\_SET/SWITCH\_MULTILEVEL\_START/STOP. Default setting: Normal (Dimmer) - BASIC\_SET/SWITCH\_MULTILEVEL\_START/STOP


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Normal (Dimmer) - BASIC_SET/SWITCH_MULTILEVEL_START/STOP (0) |
|  | Normal (RGBW) - COLOR_CONTROL_SET/START/STOP_STATE_CHANGE (1) |
|  | Normal (RGBW) - COLOR_CONTROL_SET (2) |
|  | Brightness - BASIC_SET/SWITCH_MULTILEVEL_START/STOP (3) |
|  | Rainbow (RGBW) - COLOR_CONTROL_SET (4) |


#### 8: Outputs state change mode

MODE1, Example: change saturation level from 0% to 99% Parameter 9: Step = 5 Parameter 10: Time between steps: 10ms. Default setting: MODE1


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | MODE1 (related parameters: 9-step value, 10-time between steps) (0) |
|  | MODE2 (related parameters: 11-time to change value, relevant for RGB/R (1) |


#### 9: Step value (relevant for MODE1)

Step value (relevant for MODE1).  
Default setting: 1  
Available settings: 1 - 255.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 1 |


#### 10: Time between steps (relevant for MODE1)

Time between steps (relevant for MODE1).  
Default setting: 10 ms  
0 - immediate change of state  
Available settings: 1 - 60000 ms.  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_2 |
| Data Type        | INTEGER |
| Range | 0 to 60000 |
| Default Value | 10 |


#### 11: Time for changing from start to end value

Step value (relevant for MODE1).  
Default setting: 67 (3s)  
0: immediate change  
1-63: 20-126 \[ms\] value\*20ms  
65-127: 1-63 \[s\] (value-64)\*1s  
129-191: 10-630 \[s\] (value-128)\*10s


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 67 |


#### 12: Maximum Brightening level

Maximum Brightening level.  
Default setting: 255  
Available settings: 3 - 255.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 3 to 255 |
| Default Value | 255 |


#### 13: Minimum dim level

Minimum dim level. Default setting: 2 Available settings: 3 - 255.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER |
| Range | 2 to 255 |
| Default Value | 2 |


#### 14: Inputs/Outputs configuration - relevant for main controllers other than Home Center 2 only

Inputs/Outputs configuration - relevant for main controllers other than Home Center 2 only.  
Default setting: 4369  
Controlled device: RGBW, toggle switch inputs (NORMAL MODE).  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 4369 |


#### 16: Remember device status after power failure

Define how will the Plug react after the power supply is back on. Default setting: 1 Available settings: 0 - Device does not memorize its state aft


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_16_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Do not remember state (0) |
|  | Remember state before power failure (1) |


#### 30: Alarm of any type (General alarm, flood alarm, smoke alarm: CO, CO2, temperature alarm.)

Alarm of any type (General alarm, flood alarm, smoke alarm: CO, CO2, temperature alarm.) Default setting: INACTIVE


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | INACTIVE - the device doesn&#x27;t respond to alarm frames (0) |
|  | ALARM ON - the device turns on once alarm is detected (all channels se (1) |
|  | ALARM OFF - the device turns off once alarm is detected (all channels (2) |
|  | ALARM PROGRAM - alarm sequence turns on (program selected in parameter (3) |


#### 38: Alarm sequence program

Alarm sequence program.  
Default setting: 10  
1-10 specifies alarm program number.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_38_1 |
| Data Type        | INTEGER |
| Range | 1 to 10 |
| Default Value | 10 |


#### 39: Active PROGRAM alarm time

IActive PROGRAM alarm time.  
Default setting: 600s  
1-65534 specifies alarm time in seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_39_2 |
| Data Type        | INTEGER |
| Range | 1 to 65534 |
| Default Value | 600 |


#### 42: Command class reporting Outputs status change

Command class reporting Outputs status change. Default setting: 0


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Reporting as a result of inputs and controllers actions (SWITCH MULTIL (0) |
|  | Reporting as a result of inputs actions (SWITCH MULTILEVEL) (1) |
|  | Reporting as a result of inputs actions (COLOR CONTROL) (2) |


#### 43: Reporting 0-10v analog inputs change threshold

Parameter defines a value by which input voltage must change in order to be reported to the main controller.  
New value is calculated based on last reported value.  
Default setting: 5  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_43_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 |
| Default Value | 5 |


#### 44: Power load reporting frequency

Parameter defines Time between reports. The report will be sent if last reported value differs from the current value, else reports will also be sent in case of polling.  
Default setting: 3 600 (s)  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_44_2 |
| Data Type        | INTEGER |
| Range | 1 to 65534 |
| Default Value | 30 |


#### 45: Reporting Changes in energy consumed by controlled devices

Defines the required change in power to generate an unsolicited power report.  
New, reported energy value is calculated based on last reported value.  
Default setting: 10 (0,1 kWh).  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_45_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 1 |


#### 71: Response to BRIGHTNESS set to 0%

Response to BRIGHTNESS set to 0%. Default setting: 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_71_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | illumination colour set to white (all channels controlled together) (0) |
|  | last set colour is memorized (1) |


#### 72: Starting animation program

Starting animation programm. Starting predefined program when device set to work in RGB/RGBW mode (parameter 14) - relevant for main controllers other than Home Center 2 only. Default setting: 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_72_1 |
| Data Type        | INTEGER |
| Range | 1 to 10 |
| Default Value | 1 |


#### 73: Triple click action

Triple click action. Default setting: 0


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_73_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | NODE INFO control frame is sent (0) |
|  | starting favourite program (1) |


#### 1: Assigned to IN1 input


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Assigned to IN2 input


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Assigned to IN3 input


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Assigned to IN4 input


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Reports device status


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/131).
