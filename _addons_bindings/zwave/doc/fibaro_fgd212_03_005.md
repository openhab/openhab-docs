---
layout: documentation
title: FGD212 - ZWave
---

{% include base.html %}

# FGD212 Dimmer 2

This describes the Z-Wave device *FGD212*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgd212_03_005```. 

Dimmer 2


## Channels
The following table summarises the channels available for the FGD212 Dimmer 2.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Sensor (power) | sensor_power | sensor_power | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Alarm (heat) | alarm_heat | alarm_heat |  | Switch |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |
| Alarm (system) | alarm_system | alarm_system |  | Switch |
| Dimmer 1 | switch_dimmer1 | switch_dimmer | DimmableLight | Dimmer |
| Sensor (power) 1 | sensor_power1 | sensor_power | Energy | Number |
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number |
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number |
| Alarm (heat) 1 | alarm_heat1 | alarm_heat |  | Switch |
| Alarm (power) 1 | alarm_power1 | alarm_power | Door | Switch |
| Alarm (system) 1 | alarm_system1 | alarm_system |  | Switch |
| Dimmer 2 | switch_dimmer2 | switch_dimmer | DimmableLight | Dimmer |


### Dimmer

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Dimmer 1

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Dimmer 2

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the FGD212 Dimmer 2.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Minimum brightness level | The parameter is set automatically during the calibration process. The parameter can be ch... |
| 2: Maximum brightness level | The parameter is set automatically during the calibration process. The parameter can be ch... |
| 3: Incandescence level of dimmable compact fluorescent lamps | Virtual value set as a percentage level between parameters MIN (1%) and MAX. (99%). The Di... |
| 4: Incandescence time of dimmable compact fluorescent lamps | This parameter determines the time required for switching compact fluorescent lamps and ce... |
| 5: Dimming Step at Automatic Control | The parameter defines the percentage of a dimming step at automatic control. 1-99 |
| 6: Dimming Step Timing at Automatic Control | The parameter defines the time of a dimming step at automatic control. Available settings:... |
| 7: Dimming Step at Manual Control | The parameter defines the percentage of a dimming step at manual control. 1-99 |
| 8: Dimming Step Timing at Manual Control | The parameter defines the time of a dimming step at manual control. Available settings: 0-... |
| 9: Saving state before power failure | Saving state before power failure |
| 10: Timer functionality (auto - off). 0 disables the function | The parameter defines the setting of the timer. Available settings:1-32767 - time to turn ... |
| 11: ALL ON/ALL OFF function | The parameter specifies the available functions. |
| 13: Force auto-calibration | Changing the value of this parameter to 1 will force the calibration process. During the c... |
| 14: Auto-calibration status (read-only parameter) | This parameter determines operating mode of the Dimmer (automatic/manual settings). |
| 15: Burnt out bulb detection | percentage value of power variation, compared to standard power consumption, measured duri... |
| 16: Time delay of a burnt out bulb (parameter 15) or overload (parameter 39) detection | Time of delay (in seconds) for power variation detection, interpreted as a LOAD ERROR or O... |
| 19: Forced switch on brightness level | If the parameter is active, switching on the Dimmer 2 (S1 single click) will always set th... |
| 20: Inputs Button/Switch configuration | Binary inputs type configuration |
| 21: Value sent to associated devices on single click | The value sent to associated devices on single click. |
| 22: Change [On-Off] bi-stable keys | This function allow user to change \[On-Off\] bi-stable keys (parameter no. 14) (default v... |
| 23: Double click option | Double-click set lighting at 100% |
| 24: Command frames sent in 2nd and 3rd association groups (S1 associations) | Parameter determines, which actions will not result in sending frames to association group... |
| 25: Command frames sent in 4th and 5th association groups (S2associations) | Parameter determines, which actions will not result in sending frames to association group... |
| 26: The function of 3-way switch | Key no. 2 controls the Dimmer additionally (in 3-way switch mode). Function disabled for p... |
| 27: Associations in Z-Wave network security mode | This parameter defines how commands are sent in specified association groups: as secure or... |
| 28: Scene activation functionality | SCENE ID depends on the switch type configuration |
| 29: Switch functionality of S1 and S2 | Switch S1 and S2 buttons |
| 30: Load control mode | The parameter defines the used control mode. |
| 31: Load control mode recognized during auto-calibration | Load control mode recognized during auto-calibration |
| 32: On/Off mode | This mode is necessary while connecting non-dimmable light sources. Enabling parameter 32 ... |
| 33: Dimmability of the load (read only) | Dimmability of the load (read only) |
| 34: Soft-Start functionality | Time required to warm up the filament of halogen bulb. |
| 35: Auto-calibration after power on | This parameter determines the trigger of auto-calibration procedure, e.g. power on, load e... |
| 37: Behaviour of the Dimmer after overload or surge |  |
| 38: Brightness level correction for flickering loads | This parameter specifies the duration of Brightness level correction for flickering loads ... |
| 39: Power limit - OVERLOAD | Reaching the defined value will result in turning off the load. Parameter 39 is relevant o... |
| 40: General Purpose Alarm | The parameter specifies the response to an alarm. |
| 41: Water Flooding Alarm | The parameter specifies the response to an alarm. |
| 42: Smoke, CO or CO2 Alarm | The parameter specifies the response to an alarm. |
| 43: Temperature Alarm | The parameter specifies the response to an alarm. |
| 44: Time of alarm state | Alarm state may be cancelled earlier, as a result of pushing the wall-switch keys or sendi... |
| 45: OVERLOAD alarm report | (load power consumption too high) |
| 46: LOAD ERROR alarm report | (no load, load failure, burnt out bulb) |
| 47: OVERCURRENT alarm report | (short circuit, burnt out bulb causing overcurrent) |
| 48: SURGE alarm report | (Dimmer output overvoltage) |
| 49: OVERHEAT (critical temperature) and VOLTAGE DROP (low voltage) alarm report |  |
| 50: Active power reports | The parameter defines the power level change that will result in a new power report being ... |
| 52: Periodic active power and energy reports | Parameter 52 defines a time period between consecutive reports. Timer is reset and counted... |
| 53: Energy reports | Energy level change which will result in sending a new energy report. Available settings: ... |
| 54: Self-measurement | The Dimmer may include active power and energy used by itself in reports sent to the main ... |
| 58: Method of calculating the active power | This parameter defines how to calculate active power. It is useful in a case of 2-wire con... |
| 59: Approximated power at the maximum brightness level | This parameter determines the approximate value of the power that will be reported by the ... |
| 1: Lifeline |  |
| 2: Sends BASIC SET command class frame according to the state of the devi |  |
| 3: Sends BASIC SET command class frame according to the state of the devi |  |
| 4: Sends BASIC SET command class frame according to the state of the devi |  |
| 5: Sends BASIC SET command class frame according to the state of the devi |  |


#### 1: Minimum brightness level

The parameter is set automatically during the calibration process. The parameter can be changed manually after the calibration.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 1 to 98 |
| Default Value | 1 |


#### 2: Maximum brightness level

The parameter is set automatically during the calibration process. The parameter can be changed manually after the calibration.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 1 to 99 |
| Default Value | 99 |


#### 3: Incandescence level of dimmable compact fluorescent lamps

Virtual value set as a percentage level between parameters MIN (1%) and MAX. (99%). The Dimmer will set to this value after first switch on. It is required for warming up and switching dimmable compact fluorescent lamps and certain types of light sources.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 1 to 99 |
| Default Value | 1 |


#### 4: Incandescence time of dimmable compact fluorescent lamps

This parameter determines the time required for switching compact fluorescent lamps and certain types of light sources. Setting this parameter to 0 will disable the incandescence functionality. Available settings: 0-255 (0s - 25,5s)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 5: Dimming Step at Automatic Control

The parameter defines the percentage of a dimming step at automatic control. 1-99


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 1 to 99 |
| Default Value | 1 |


#### 6: Dimming Step Timing at Automatic Control

The parameter defines the time of a dimming step at automatic control. Available settings: 0-255 (0s - 2,55s)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 1 |


#### 7: Dimming Step at Manual Control

The parameter defines the percentage of a dimming step at manual control. 1-99


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 1 to 99 |
| Default Value | 1 |


#### 8: Dimming Step Timing at Manual Control

The parameter defines the time of a dimming step at manual control. Available settings: 0-255 (0s - 2,55s)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 5 |


#### 9: Saving state before power failure

Saving state before power failure


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | State NOT saved at power failure, all outputs are set to OFF upon powe (0) |
|  | State saved at power failure, all outputs are set to previous state up (1) |


#### 10: Timer functionality (auto - off). 0 disables the function

The parameter defines the setting of the timer. Available settings:1-32767 - time to turn off measured in seconds (1s - 9,1h)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 0 |


#### 11: ALL ON/ALL OFF function

The parameter specifies the available functions.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALL ON not active, ALL OFF not active (0) |
|  | ALL ON not active, ALL OFF active (1) |
|  | ALL ON active, ALL OFF not active (2) |
|  | ALL ON active, ALL OFF active (255) |


#### 13: Force auto-calibration

Changing the value of this parameter to 1 will force the calibration process. During the calibration parameter is set to 1 and switched to 0 upon completion.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | readout (0) |
|  | force auto-calibration of the load without Fibaro Bypass (1) |
|  | force auto-calibration of the load with Fibaro Bypass (2) |


#### 14: Auto-calibration status (read-only parameter)

This parameter determines operating mode of the Dimmer (automatic/manual settings).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | calibration procedure not performed or Dimmer operates on manual setti (0) |
|  | Dimmer operates on auto-calibration settings (1) |


#### 15: Burnt out bulb detection

percentage value of power variation, compared to standard power consumption, measured during the calibration procedure (to be interpreted as load error/burnt out bulb). 1-99, 0 disables the function.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER |
| Range | 0 to 99 |
| Default Value | 30 |


#### 16: Time delay of a burnt out bulb (parameter 15) or overload (parameter 39) detection

Time of delay (in seconds) for power variation detection, interpreted as a LOAD ERROR or OVERLOAD detection (too much power connected to the Dimmer 2). 0 disables the function.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_16_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 5 |


#### 19: Forced switch on brightness level

If the parameter is active, switching on the Dimmer 2 (S1 single click) will always set this brightness level. 0 disables the function.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_19_1 |
| Data Type        | INTEGER |
| Range | 0 to 99 |
| Default Value | 0 |


#### 20: Inputs Button/Switch configuration

Binary inputs type configuration


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Mono-stable input (button) (0) |
|  | Bi-stable input (switch) (1) |
|  | Roller blind switch (UP / DOWN) (2) |


#### 21: Value sent to associated devices on single click

The value sent to associated devices on single click.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 0xFF value is sent, which will set associated devices to their last sa (0) |
|  | current Dimmer 2 state is sent, which will synchronize brightness leve (1) |


#### 22: Change [On-Off] bi-stable keys

This function allow user to change \[On-Off\] bi-stable keys (parameter no. 14) (default value 0)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_22_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Device changes status on key status change (0) |
|  | Device status depends on key status; ON when the key is ON, OFF when t (1) |


#### 23: Double click option

Double-click set lighting at 100%


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_23_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disable double click (0) |
|  | Enable double click (1) |


#### 24: Command frames sent in 2nd and 3rd association groups (S1 associations)

Parameter determines, which actions will not result in sending frames to association groups.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_24_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | all actions send to association groups (0) |
|  | do not send when switching ON (single click) (1) |
|  | do not send when switching OFF (single click) (2) |
|  | do not send when changing dimming level (holding and releasing) (4) |
|  | do not send on double click (8) |
|  | send 0xFF value on double click (16) |


#### 25: Command frames sent in 4th and 5th association groups (S2associations)

Parameter determines, which actions will not result in sending frames to association groups.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_25_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | all actions send to association groups (0) |
|  | do not send when switching ON (single click) (1) |
|  | do not send when switching OFF (single click) (2) |
|  | do not send when changing dimming level (holding and releasing) (4) |
|  | do not send on double click (8) |
|  | send 0xFF value on double click (16) |


#### 26: The function of 3-way switch

Key no. 2 controls the Dimmer additionally (in 3-way switch mode). Function disabled for parameter 20 set to 2 (roller blind switch).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_26_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 3-way switch function for S2 disabled (0) |
|  | 3-way switch function for S2 enabled (1) |


#### 27: Associations in Z-Wave network security mode

This parameter defines how commands are sent in specified association groups: as secure or non-secure. Parameter is active only in Z-Wave network security mode. It does not apply to 1st Lifeline group.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_27_1 |
| Data Type        | INTEGER || Default Value | 15 |
| Options | all groups (II-V) sent as non-secure (0) |
|  | 2nd group sent as secure (1) |
|  | 3rd group sent as secure (2) |
|  | 4th group sent as secure (4) |
|  | 5th group sent as secure (8) |
|  | all groups (II-V) sent as secure (15) |


#### 28: Scene activation functionality

SCENE ID depends on the switch type configuration


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_28_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Scene functionality deactivated (0) |
|  | Scene functionality activated (1) |


#### 29: Switch functionality of S1 and S2

Switch S1 and S2 buttons


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_29_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | standard mode (0) |
|  | S1 operates as S2, S2 operates as S1 (1) |


#### 30: Load control mode

The parameter defines the used control mode.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | forced leading edge control (0) |
|  | forced trailing edge control (1) |
|  | control mode selected automatically (based on auto-calibration) (2) |


#### 31: Load control mode recognized during auto-calibration

Load control mode recognized during auto-calibration


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_31_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | leading edge control (0) |
|  | trailing edge control (1) |


#### 32: On/Off mode

This mode is necessary while connecting non-dimmable light sources. Enabling parameter 32 automatically ignores brightening/- dimming time settings.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_32_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | on/off mode disabled (dimming is possible) (0) |
|  | on/off mode enabled (dimming is not possible) (1) |
|  | mode selected automatically (2) |


#### 33: Dimmability of the load (read only)

Dimmability of the load (read only)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_33_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Load recognized as dimmable (0) |
|  | Load recognized as non-dimmable (1) |


#### 34: Soft-Start functionality

Time required to warm up the filament of halogen bulb.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_34_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | no soft-start (0) |
|  | short soft-start (0,1s) (1) |
|  | long soft-start (0,5s) (2) |


#### 35: Auto-calibration after power on

This parameter determines the trigger of auto-calibration procedure, e.g. power on, load error, etc.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_35_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | No auto-calibration of the load after power on (0) |
|  | Auto-calibration performed after first power on (1) |
|  | Auto-calibration performed after each power on (2) |
|  | Auto-calibration performed after first power on or after each LOAD ERR (3) |
|  | Auto-calibration performed after each power on or after each LOAD ERRO (4) |


#### 37: Behaviour of the Dimmer after overload or surge


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_37_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | device permanently disabled until re-enabling by comand or push-button (0) |
|  | three attempts to turn on the load (1) |


#### 38: Brightness level correction for flickering loads

This parameter specifies the duration of Brightness level correction for flickering loads in seconds. 255 sets the function to "always enabled". 0 disables the function.  


##### Overview 

Correction reduces spontaneous flickering of some capacitive load (e.g. dimmable LEDs) at certain brightness levels in 2-wire installation. 

In countries using ripple-control, correction may cause changes in brightness. In this case it is necessary to disable correction or adjust time of correction for flickering loads.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_38_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 39: Power limit - OVERLOAD

Reaching the defined value will result in turning off the load. Parameter 39 is relevant only in a 3-wire connection i or a 2-wire connection for load of cosφ ≥ 0.99. (1 W - 250 W). 0 disables the function.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_39_2 |
| Data Type        | INTEGER |
| Range | 0 to 250 |
| Default Value | 250 |


#### 40: General Purpose Alarm

The parameter specifies the response to an alarm.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | No reaction (0) |
|  | Turn on the load (1) |
|  | Turn off the load (2) |
|  | Load blinking (3) |


#### 41: Water Flooding Alarm

The parameter specifies the response to an alarm.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_41_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | No reaction (0) |
|  | Turn on the load (1) |
|  | Turn off the load (2) |
|  | Load blinking (3) |


#### 42: Smoke, CO or CO2 Alarm

The parameter specifies the response to an alarm.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | No reaction (0) |
|  | Turn on the load (1) |
|  | Turn off the load (2) |
|  | Load blinking (3) |


#### 43: Temperature Alarm

The parameter specifies the response to an alarm.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_43_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | No reaction (0) |
|  | Turn on the load (1) |
|  | Turn off the load (2) |
|  | Load blinking (3) |


#### 44: Time of alarm state

Alarm state may be cancelled earlier, as a result of pushing the wall-switch keys or sending the Z-Wave command frame. Available settings: 1-32767 (1s - 32767s).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_44_2 |
| Data Type        | INTEGER |
| Range | 1 to 32767 |
| Default Value | 600 |


#### 45: OVERLOAD alarm report

(load power consumption too high)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_45_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | No reaction (0) |
|  | Send an alarm frame (1) |


#### 46: LOAD ERROR alarm report

(no load, load failure, burnt out bulb)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_46_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | No reaction (0) |
|  | Send an alarm frame (1) |


#### 47: OVERCURRENT alarm report

(short circuit, burnt out bulb causing overcurrent)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_47_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | No reaction (0) |
|  | Send an alarm frame (1) |


#### 48: SURGE alarm report

(Dimmer output overvoltage)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_48_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | No reaction (0) |
|  | Send an alarm frame (1) |


#### 49: OVERHEAT (critical temperature) and VOLTAGE DROP (low voltage) alarm report


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_49_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | No reaction (0) |
|  | Send an alarm frame (1) |


#### 50: Active power reports

The parameter defines the power level change that will result in a new power report being sent. The value is a percentage of the previous report. 0 disables the function.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_50_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 10 |


#### 52: Periodic active power and energy reports

Parameter 52 defines a time period between consecutive reports. Timer is reset and counted from zero after each report (1 sec - 32767 sec). 0 disables the function.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_52_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 3600 |


#### 53: Energy reports

Energy level change which will result in sending a new energy report. Available settings: 1-255 (0,01 - 2,55 kWh). 0 disables the function.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_53_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 10 |


#### 54: Self-measurement

The Dimmer may include active power and energy used by itself in reports sent to the main controller.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_54_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Self-measurement inactive (0) |
|  | Self-measurement active (1) |


#### 58: Method of calculating the active power

This parameter defines how to calculate active power. It is useful in a case of 2-wire connection with light sources other than resistive. Note: Parameter 58 is set to 0 after forced auto-calibration


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_58_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | measurement based on the standard algorithm (0) |
|  | approximation based on the calibration data (1) |
|  | approximation based on the control angle (2) |


#### 59: Approximated power at the maximum brightness level

This parameter determines the approximate value of the power that will be reported by the device at its maximum brightness level. Available settings: 0-500 (0-500W). Note: Parameter 59 works only when parameter 58 has a value other than 0.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_59_2 |
| Data Type        | INTEGER |
| Range | 0 to 500 |
| Default Value | 0 |


#### 1: Lifeline


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Sends BASIC SET command class frame according to the state of the devi


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Sends BASIC SET command class frame according to the state of the devi


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Sends BASIC SET command class frame according to the state of the devi


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Sends BASIC SET command class frame according to the state of the devi


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/787).
