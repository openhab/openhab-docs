---
layout: documentation
title: ZMNHOD - ZWave
---

{% include base.html %}

# ZMNHOD Flush Shutter DC

This describes the Z-Wave device *ZMNHOD*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhod_00_000```. 

Flush Shutter DC


## Channels
The following table summarises the channels available for the ZMNHOD Flush Shutter DC.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Blinds control | blinds_control | blinds_control | Blinds | Rollershutter |
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch |
| Blinds control 1 | blinds_control1 | blinds_control | Blinds | Rollershutter |
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number |
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number |
| Sensor (temperature) 2 | sensor_temperature2 | sensor_temperature | Temperature | Number |


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


### Sensor (temperature) 2

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZMNHOD Flush Shutter DC.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 10: Activate/deactivate functions ALL ON / ALL OFF | Module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by... |
| 40: Power reporting in Watts on power change for Q1 or Q2 | Set value 0 – 100 as percentage. |
| 42: Power reporting in Watts by time interval for Q1 or Q2 | Set value determines interval in seconds, when power report is send. |
| 71: Operating modes | This parameter defines selection between two available operating modes. |
| 72: Slats tilting full turn time | This parameter defines the time necessary for slats to make full turn (180 degrees) |
| 73: Slats position | This parameter defines slats position after up/down movement through Z-wave or push-button... |
| 74: Motor moving up/down time | This parameter defines shutter motor moving time of complete opening or complete closing. |
| 76: Motor operation detection | Power threshold to be interpreted when motor reaches the limit switch. |
| 78: Forced Shutter DC calibration | Setting value 0 or 1 a Shutter DC module enters the calibration mode. |
| 85: Power consumption max delay time | This parameter defines the max time before motor power consumption is read after one of th... |
| 86: Power consumption at limit switch delay time | This parameter defines the max time at limit switch, when power consumption is below power... |
| 90: Time delay for next motor movement | This parameter defines the minimum time delay between next motor movemen. |
| 110: Temperature sensor offset settings | Set value is added or subtracted to actual measured value by sensor. default value 32536 3... |
| 120: Digital temperature sensor reporting | If digital temperature sensor is connected, module reports measured temperature on tempera... |
| 1: Default reporting group |  |
| 2: Basic on/off | Triggered at change of the input I1 state and reflecting its state |
| 3: Basic on/off | Triggered at change of the input I2 state and reflecting its state |
| 4: Basic on/off | Triggered at sensing moving direction of roller |
| 5: Basic on/off | Triggered at reaching roller position |
| 6: Basic on/off | Triggered at reaching roller position |
| 7: Multilevel set | triggered at changes of value of the Flush Shutter DC position |
| 8: Multilevel set | Triggered at changes of value of slats tilting position |
| 9: Multilevel sensor report | Triggered at change of temperature sensor |


#### 10: Activate/deactivate functions ALL ON / ALL OFF

Module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_2 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALL ON is not active, ALL OFF is not active (0) |
|  | ALL ON is not active ALL OFF active (1) |
|  | ALL ON is not active ALL OFF is not active (2) |
|  | ALL ON active, ALL OFF active (255) |


#### 40: Power reporting in Watts on power change for Q1 or Q2

Set value 0 – 100 as percentage.  
Available configuration parameters.  


 *  0 = Reporting Disabled
 *  1–100 = 1% - 100% Reporting enabled

Power report is sent only when actual power (in Watts) in real


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 1 |


#### 42: Power reporting in Watts by time interval for Q1 or Q2

Set value determines interval in seconds, when power report is send.  
Available configuration parameters.  


 *  default value 300 = 300s
 *  0 – Reporting Disabled
 *  1 – 32767 = 1 second – 32767 seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 300 |


#### 71: Operating modes

This parameter defines selection between two available operating modes.  
NOTE: When setting parameter, module needs to be excluded and included again! Please check detailed description in this manual.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_71_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Shutter mode. (0) |
|  | Venetian mode (up/down and slate rotation) (1) |


#### 72: Slats tilting full turn time

This parameter defines the time necessary for slats to make full turn (180 degrees)  
NOTE: If time set is too high, this will result that after full turn, shutter will start move up or down, for time remaining.

 *  default value 15


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_72_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 150 |


#### 73: Slats position

This parameter defines slats position after up/down movement through Z-wave or push-buttons.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_73_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Slats return to previously set position only in case of Z-wave control (0) |
|  | Slats return to previously set position in case of Z-wave control, pus (1) |


#### 74: Motor moving up/down time

This parameter defines shutter motor moving time of complete opening or complete closing.  
NOTE: If time set is too high, this will result that after full turn, shutter will start move up or down, for time remaining.

 *  defau


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_74_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 0 |


#### 76: Motor operation detection

Power threshold to be interpreted when motor reaches the limit switch.

 *  default value 6 = 0,6W
 *  5 - 100 (0,5W - 10W), step is 0,1W.
 *  The value 0 means reaching a limit switch will not be detected


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_76_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 6 |


#### 78: Forced Shutter DC calibration

Setting value 0 or 1 a Shutter DC module enters the calibration mode.  
When calibration process is finished, completing full cycle - up, down and up, set parameter 78 back to default of 0.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_78_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Default (0) |
|  | Start calibration process. (1) |


#### 85: Power consumption max delay time

This parameter defines the max time before motor power consumption is read after one of the relays is switched ON.  
If there is no power consumption during this max time (motor not connected, damaged or requires higher time to start, mo


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_85_1 |
| Data Type        | INTEGER |
| Range | 3 to 50 |
| Default Value | 8 |


#### 86: Power consumption at limit switch delay time

This parameter defines the max time at limit switch, when power consumption is below power threshold.  
If the power consumption during this time is below power threshold (par. 76), the active output will switch off, means that limit sw


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_86_1 |
| Data Type        | INTEGER |
| Range | 3 to 50 |
| Default Value | 8 |


#### 90: Time delay for next motor movement

This parameter defines the minimum time delay between next motor movemen.  
(minimum time between switching motor off and on again)

 *  default value 5 = 500ms
 *  1 – 30 = 0,1seconds – 3seconds (100ms resolution)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_90_1 |
| Data Type        | INTEGER |
| Range | 1 to 30 |
| Default Value | 5 |


#### 110: Temperature sensor offset settings

Set value is added or subtracted to actual measured value by sensor. default value 32536 32536 – offset is 0.0C From 1 to 100 – value from 0.1 °C to 10.0 °C is added to actual measured temperature.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_110_2 |
| Data Type        | INTEGER |
| Range | 1 to 32536 |
| Default Value | 32536 |


#### 120: Digital temperature sensor reporting

If digital temperature sensor is connected, module reports measured temperature on temperature change defined by this parameter.

 *  Default value 5 = 0,5°C
 *  32536 – offset is 0.0C
 *  0 – Reporting disabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_120_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 5 |


#### 1: Default reporting group


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Basic on/off

Triggered at change of the input I1 state and reflecting its state


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Basic on/off

Triggered at change of the input I2 state and reflecting its state


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Basic on/off

Triggered at sensing moving direction of roller  


##### Overview 

up=FF, down=0


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Basic on/off

Triggered at reaching roller position  


##### Overview 

bottom=FF, top=0


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


#### 6: Basic on/off

Triggered at reaching roller position  


##### Overview 

bottom=FF, not bottom=0


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_6 |
| Data Type        | TEXT |
| Range |  to  |


#### 7: Multilevel set

triggered at changes of value of the Flush Shutter DC position


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_7 |
| Data Type        | TEXT |
| Range |  to  |


#### 8: Multilevel set

Triggered at changes of value of slats tilting position


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_8 |
| Data Type        | TEXT |
| Range |  to  |


#### 9: Multilevel sensor report

Triggered at change of temperature sensor


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_9 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/214).
