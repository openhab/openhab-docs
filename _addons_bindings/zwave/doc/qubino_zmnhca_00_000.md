---
layout: documentation
title: ZMNHCA - ZWave
---

{% include base.html %}

# ZMNHCA Flush Shutter

This describes the Z-Wave device *ZMNHCA*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhca_00_000```. 

Flush Shutter


## Channels
The following table summarises the channels available for the ZMNHCA Flush Shutter.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Blinds Control | blinds_control | blinds_control | Blinds | Rollershutter |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| switch | switch_binary1 | switch_binary | Switch | Switch |
| Blinds Control | blinds_control1 | blinds_control | Blinds | Rollershutter |
| Temperatur Sensor | sensor_temperature1 | sensor_temperature | Temperature | Number |
| Electric meter (watts) | meter_watts1 | meter_watts | Energy | Number |
| Electric meter (kWh) | meter_kwh1 | meter_kwh | Energy | Number |


### Blinds Control

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


### Sensor (temperature)

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Blinds Control

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


### Temperatur Sensor

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZMNHCA Flush Shutter.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 10: ALL ON / ALL OFF | Responds to commands ALL ON / ALL OFF from Main Controller |
| 40: - Power reporting in Watts on power change for Q1 or Q2 | Power consumption change threshold for sending updates |
| 42: Power reporting in Watts by time interval for Q1 or Q2 | Power reporting in Watts by time interval for Q1 or Q2 |
| 71: Operating modes | Operation Mode (Shutter or Venetian) |
| 72: Slats tilting full turn time | Slat full turn time in tenths of a second. |
| 73: Slats position | Slats position |
| 74: Motor moving up/down time | Shutter motor moving time of complete opening or complete closing |
| 76: Motor operation detection | Power threshold |
| 78: Forced Shutter calibration | 0 to 1 a Shutter enters the calibration mode |
| 80: Reporting to controller | reports regarding to main controller |
| 85: Power consumption max delay time | max time before motor power consumption is read |
| 90: Relay delay time | This parameter defines the time delay between output relay switching |
| 1: basic on/off | triggered at change of the input I1 state and reflecting its state |
| 2: basic on/of | triggered at change of the input I2 state and reflecting its state |
| 3: multileve | triggered at changes of value of the Flush shutter position |
| 4: multilevel | triggered at changes of value of slats tilting position |
| 5: default reporting group |  |


#### 10: ALL ON / ALL OFF

Responds to commands ALL ON / ALL OFF from Main Controller  


##### Overview 

Module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system.

Available config. parameters (data type is 2 Byte DEC):

 *   default value 255
 *   255 - ALL ON active, ALL OFF active.
 *   0 - ALL ON is not active, ALL OFF is not active
 *   1 - ALL ON is not active ALL OFF active
 *   2 - ALL ON active ALL OFF is not active


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_2 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | 0 - ALL ON is not active ALL OFF is not active (0) |
|  | 1 - ALL ON is not active ALL OFF active (1) |
|  | 2 - ALL ON is not active ALL OFF is not active (2) |
|  | 255 - ALL ON active, ALL OFF active (255) |


#### 40: - Power reporting in Watts on power change for Q1 or Q2

Power consumption change threshold for sending updates  


##### Overview 

Power report is send (push) only when actual power (in Watts) in real time changes for more than set percentage comparing to previous actual power in Watts, step is 1%.

Set value means percentage, set value from 0 – 100 = 0% - 100%. Available configuration parameters (data type is 1 Byte DEC):

 *   default value 1
 *   0 - reporting disabled
 *   1 - 100 = 1% - 100% Reporting enabled.

NOTE: if power changed is less than 1W, the report is not send (pushed), independent of percentage set.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 |
| Default Value | 1 |


#### 42: Power reporting in Watts by time interval for Q1 or Q2

Power reporting in Watts by time interval for Q1 or Q2  


##### Overview 

Set value means time interval (0 – 32767) in seconds, when power report is send. Available configuration parameters (data type is 2 Byte DEC):

 *   default value 300 = 300s
 *   0 - Reporting Disabled
 *   1 - 32767 = 1 second - 32767 seconds. Reporting enabled, power report is send with time interval set by entered value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 300 |


#### 71: Operating modes

Operation Mode (Shutter or Venetian)  


##### Overview 

This parameter defines selection between two available operating modes. Available configuration parameters (data type is 1 Byte DEC):

 *   default value 0
 *   0 - Shutter mode
 *   1 - venetian mode (up/down and slate rotation) NOTE1: After parameter change, first exclude module (without setting parameters to default value) then wait at least 30s and then re include the module!


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_71_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 0 – Shutter mode (0) |
|  | 1 – Venetian mode (up/down and slate rotation) (1) |


#### 72: Slats tilting full turn time

Slat full turn time in tenths of a second.  


##### Overview 

This parameter defines the time necessary for slats to make full turn (180 degrees). Available configuration parameters (data type is 2 Byte DEC):

 *  default value 150 = 1,5 seconds
 *  0 - tilting time disabled
 *  1 - 32767 = 0,01seconds - 327,67 seconds

NOTE: If time set is too high, this will result that after full turn, Shutter will start move up/down, for time remaining.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_72_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 150 |


#### 73: Slats position

Slats position  


##### Overview 

This parameter defines slats position after up/down movement through Z-wave or push-buttons. Available configuration parameters (data type is 1 Byte DEC):

 *   default value 1
 *   0 - Slats return to previously set position only in case of UI control.
 *   1 - Slats return to previously set position in case of UI control, push button operation or when the limit switch is reached.
 *  2 - Slats return to previously set position in case of UI control, push button, when the limit switch is reached or after receiving a “STOP” control frame (Switch Multilevel Stop Level Change) from UI


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_73_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | previously set position only in case of UI control (0) |
|  | position in case of UI control, push (1) |
|  | position in case of UI control, push button (2) |


#### 74: Motor moving up/down time

Shutter motor moving time of complete opening or complete closing  


##### Overview 

This parameter defines Shutter motor moving time of complete opening or complete closing. Available configuration parameters (data type is 2 Byte DEC):

 *   default value 0
 *   0 - moving time disabled (working with limit switches)
 *   1 - 32767 = 0,1seconds - 3276,7seconds. After that time motor is stopped (relay goes to off state)

NOTE: Important is that the reference position to manually set moving time is always Shutter lower position!

Set parameter 74 to 0 and move the Shutter (using up/down push buttons or main controller UI) to the lowest desired position. On this Shutter position, set parameter 74 to time for complete opening or complete closing. At this point Shutter can be moved up (open) for set time, but can't be moved down because this position is already set as lower Shutter position.

To change Shutter lower position below already set (manual recalibration), parameter 74 must be set to 0 and repeat the procedure described above.

In case Shutter has limit switches, but anyhow you would like to limit opening/closing position by time, you can still do it. In case you put time that is longer that opening/closing real time limited by limit switches, Shutter will stop at limit switch, but the module relay will switch off after define time, not by Shutter limit switch. Take in consideration that in this condition, the positioning with slider through UI will not show correct Shutter position. NOTE that is not recommended using this for slates operation since its positioning can be compromised during time.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_74_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 0 |


#### 76: Motor operation detection

Power threshold  


##### Overview 

Power threshold to be interpreted when motor reach the limit switch. Available configuration parameters (data type is 1 Byte DEC):

 *   default value 10 = 10W
 *   0 - 127 = 1-127 W. The value 0 means reaching a limit switch will not be detected

NOTE: Motors with power consumption less than 0,5W could not be auto calibrated. In that case set time manually (par. 74).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_76_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 10 |


#### 78: Forced Shutter calibration

0 to 1 a Shutter enters the calibration mode  


##### Overview 

By modifying the parameters setting from 0 to 1 a Shutter DC module enters the calibration mode. Available configuration parameters (data type is 1 Byte DEC):

 *   default value 0
 *   1 - Start calibration process (when calibration process is finished, completing full cycle - up, down and up, set the parameter 78 (Forced Shutter calibration) value back to 0.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_78_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 80: Reporting to controller

reports regarding to main controller  


##### Overview 

This parameter defines if reporting regarding power level, multilevel, etc,…is reported to controller or not. Available configuration parameters: default value 1

 *  0 reporting to controller is disabled
 *  1 reporting to controller


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_80_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | reporting to controller is disabled (0) |
|  | reporting to controller is enabled (1) |


#### 85: Power consumption max delay time

max time before motor power consumption is read  


##### Overview 

This parameter defines the max time before motor power consumption is read after one of the relays is switched ON. If there is no power consumption during this max time (motor not connected, damaged or requires higher time to start, motor in end position,...) the relay will switch OFF. Time is defined by entering it manually. Available configuration parameters (data type is 1 Byte DEC):

 *   default value 8 = 800ms
 *   3 - 50 = 0,3seconds - 5seconds (100ms resolution)
 *   0 = time is set automatically


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_85_1 |
| Data Type        | INTEGER |
| Range | 0 to 50 |
| Default Value | 0 |


#### 90: Relay delay time

This parameter defines the time delay between output relay switching  


##### Overview 

This parameter defines the minimum time delay between next motor movement (minimum time between switching motor off and on again). Available configuration parameters (data type is 1 Byte DEC):

 *   default value 5 = 500ms
 *   1 - 30 = 0,1seconds - 3seconds (100ms resolution)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_90_1 |
| Data Type        | INTEGER |
| Range | 1 to 30 |
| Default Value | 5 |


#### 1: basic on/off

triggered at change of the input I1 state and reflecting its state


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: basic on/of

triggered at change of the input I2 state and reflecting its state


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: multileve

triggered at changes of value of the Flush shutter position


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: multilevel

triggered at changes of value of slats tilting position


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: default reporting group


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/635).
