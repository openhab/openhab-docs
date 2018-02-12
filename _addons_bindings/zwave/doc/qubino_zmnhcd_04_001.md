---
layout: documentation
title: ZMNHCD - ZWave
---

{% include base.html %}

# ZMNHCD Flush Shutter

This describes the Z-Wave device *ZMNHCD*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhcd_04_001```. 

Flush Shutter  


## Overview 

To enable endpoint 2 (lamella tilt for venetian blinds), follow the procedure:

1.  set Param 71 to 0 -> save ( make sure it has been set really )
2.  set Param 71 to 1 -> save ( make sure it has been set really )
3.  exclude device from network and delete Node xml, stop openHAB
4.  switch off the power supply of the device ( according to the support team this is an alternative to wait 30s )
5.  switch on the power supply again and start openHAB
6.  include device to the network
7.  add the Thing to openhab via HABmin
8.  Be patient until the binding until processed all your nodes again


## Channels
The following table summarises the channels available for the ZMNHCD Flush Shutter.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Blinds Control | blinds_control | blinds_control | Blinds | Rollershutter |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch |
| Blinds control 1 | blinds_control1 | blinds_control | Blinds | Rollershutter |
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number |
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number |
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch |
| Blinds control 2 | blinds_control2 | blinds_control | Blinds | Rollershutter |


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


### Blinds control 1

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


### Blinds control 2

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
The following table provides a summary of the configuration parameters available in the ZMNHCD Flush Shutter.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 10: ALL ON/ALL OFF | Responds to commands ALL ON / ALL OFF from Main Controller |
| 40: Power reporting in watts on power change | Power consumption change threshold for sending updates |
| 42: Power reporting in Watts by time interval | Power reporting in Watts by time interval for Q1 or Q2 |
| 71: Operating modes | Operation Mode (Shutter or Venetian) |
| 72: Slats tilting full turn time | Slat full turn time in tenths of a second. |
| 73: Slats position | Slats position after up/down movement. |
| 74: Motor moving up/down time | Shutter motor moving time of complete opening or complete closing |
| 76: Motor operation detection | Power threshold to be interpreted when motor reach the limit switch |
| 78: Forced Shutter calibration | Enters calibration mode if set to 1 |
| 80: Reporting to Controller | Defines if reporting regarding power level, etc is reported to controller. |
| 85: Power consumption max delay time | Time delay for detecting motor errors |
| 86: Power consumption at limit switch delay time | Sets the time delay for detecting limit switches |
| 90: Relay delay time | Defines the minimum time delay between next motor movement |
| 110: Temperature sensor offset settings | Adds or removes an offset from the measured temperature. |
| 120: Digital temperature sensor reporting | Threshold for sending temperature change reports |
| 1: Controller Updates |  |
| 2: On/Off Triggered by I2 |  |
| 3: On/Off Triggered by I3 |  |
| 4: Multi-level Triggerd by Shutter Position |  |
| 5: Multilevel Trigger by Slat Position |  |


#### 10: ALL ON/ALL OFF

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


#### 40: Power reporting in watts on power change

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
| Range | 0 to 100 |
| Default Value | 1 |


#### 42: Power reporting in Watts by time interval

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

 *   default value 150 = 1,5 seconds
 *   0 - tilting time disabled
 *   1 - 32767 = 0,01seconds - 327,67 seconds

NOTE: If time set is too high, this will result that after full turn, Shutter will start move up/down, for time remaining.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_72_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 150 |


#### 73: Slats position

Slats position after up/down movement.  


##### Overview 

This parameter defines slats position after up/down movement through Z-wave or push-buttons. Available configuration parameters (data type is 1 Byte DEC):

 *   default value 1
 *   0 - Slats return to previously set position only in case of Z-wave control (not valid for limit switch positions).
 *   1 - Slats return to previously set position in case of Z-wave control, push-button operation or when the lower limit switch is reached.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_73_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | 0 - return to previous position for Z-wave control only (0) |
|  |  (0) |
|  | 1 - return to previous position in all cases (1) |


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

Power threshold to be interpreted when motor reach the limit switch  


##### Overview 

Power threshold to be interpreted when motor reach the limit switch. Available configuration parameters (data type is 1 Byte DEC):

 *   default value 6 = 0,6W
 *   5 - 100 (0,5W - 10W), step is 0,1W.

NOTE: Motors with power consumption less than 0,5W could not be auto calibrated. In that case set time manually (par. 74).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_76_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 10 |


#### 78: Forced Shutter calibration

Enters calibration mode if set to 1  


##### Overview 

By modifying the parameters setting from 0 to 1 a Shutter DC module enters the calibration mode. Available configuration parameters (data type is 1 Byte DEC):

 *   default value 0
 *   1 - Start calibration process (when calibration process is finished, completing full cycle - up, down and up, set the parameter 78 (Forced Shutter calibration) value back to 0.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_78_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 0 - Default (0) |
|  | 1 - Start Calibration Process (1) |


#### 80: Reporting to Controller

Defines if reporting regarding power level, etc is reported to controller.  


##### Overview 

This parameter defines if reporting regarding power level, multilevel, etc,…is reported to controller or not. Available configuration parameters: default value 1

 *  0 reporting to controller is disabled
 *  1 reporting to controller


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_80_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | 0 - Reporting to Controller Disabled (0) |
|  | 1 - Reporting to Controller Enabled (1) |


#### 85: Power consumption max delay time

Time delay for detecting motor errors  


##### Overview 

This parameter defines the max time before motor power consumption is read after one of the relays is switched ON. If there is no power consumption during this max time (motor not connected, damaged or requires higher time to start, motor in end position,...) the relay will switch OFF. Time is defined by entering it manually. Available configuration parameters (data type is 1 Byte DEC):

 *   default value 8 = 800ms
 *   3 - 50 = 0,3seconds - 5seconds (100ms resolution)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_85_1 |
| Data Type        | INTEGER |
| Range | 0 to 50 |
| Default Value | 8 |


#### 86: Power consumption at limit switch delay time

Sets the time delay for detecting limit switches  


##### Overview 

This parameter defines the max time at limit switch, when power consumption is below power threshold. If the power consumption during this time is below power threshold (par. 76), the active output will switch off, means that limit switch is reached. Available configuration parameters (data type is 1 Byte DEC):

 *   default value 8 = 800ms
 *   3 - 50 = 0,3seconds - 5seconds (100ms resolution)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_86_1 |
| Data Type        | INTEGER |
| Range | 3 to 50 |
| Default Value | 8 |


#### 90: Relay delay time

Defines the minimum time delay between next motor movement  


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


#### 110: Temperature sensor offset settings

Adds or removes an offset from the measured temperature.  


##### Overview 

Set value is added or subtracted to actual measured value by sensor. Available configuration parameters (data type is 2 Byte DEC):

 *   default value 32536
 *   32536 - offset is 0.0C
 *   From 1 to 100 - value from 0.1 °C to 10.0 °C is added to actual measured temperature.
 *   From 1001 to 1100 - value from -0.1 °C to -10.0 °C is subtracted to actual measured temperature.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_110_2 |
| Data Type        | INTEGER |
| Range | 1 to 32536 |
| Default Value | 32536 |


#### 120: Digital temperature sensor reporting

Threshold for sending temperature change reports  


##### Overview 

If digital temperature sensor is connected, module reports measured temperature on temperature change defined by this parameter. Available configuration parameters (data type is 1 Byte DEC):

 *   Default value 5 = 0,5°C
 *   0 - reporting disabled
 *   1-127 = 0,1°C - 12,7°C, step is 0,1°C


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_120_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 5 |


#### 1: Controller Updates


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: On/Off Triggered by I2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: On/Off Triggered by I3


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Multi-level Triggerd by Shutter Position


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Multilevel Trigger by Slat Position


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/213).
