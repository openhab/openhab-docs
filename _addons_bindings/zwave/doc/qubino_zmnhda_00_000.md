---
layout: documentation
title: ZMNHDA - ZWave
---

{% include base.html %}

# ZMNHDA Flush dimmer

This describes the Z-Wave device *ZMNHDA*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhda_00_000```. 

Flush dimmer


## Channels
The following table summarises the channels available for the ZMNHDA Flush dimmer.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Binary Sensor 1 | sensor_binary1 | sensor_binary | Door | Switch |
| Binary Sensor 2 | sensor_binary2 | sensor_binary | Door | Switch |


### Dimmer

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Sensor (temperature)

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZMNHDA Flush dimmer.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Input 1 switch type | Switch type (input I1) |
| 2: Input 2 contact type | Input 2 contact type |
| 3: Input 3 contact type | Input 3 contact type |
| 10: Activate / deactivate functions ALL ON/ALL OFF | Flush 1 relay module responds to commands ALL ON / ALL OFF that may be sent by the main co... |
| 30: Saving the state of the device after a power failure | Saving the state of the device after a power failure |
| 40: Power reporting in Watts on power change for Q1 | Set value means percentage, set value from 0-100 = 0%-100%. Power report is sent (pushed) ... |
| 42: Power reporting in Watts by time interval | Set value means time interval (0 – 65535) in seconds, when power report is sent. Default v... |
| 60: Minimum dimming value | Range is 1% – 98%, step is 1%. |
| 61: Maximum dimming value | Range is 2% – 99%, step is 1%. |
| 65: Dimming time (soft on/off) | Set value means time of moving the Dimmer between min. and max. dimming values by short pr... |
| 66: Dimming time when key pressed | Time of moving the Dimmer between min. and max dimming values by continues hold of push bu... |
| 1: multilevel (triggered at changes of state/value of the Flush dimmer) |  |
| 2: basic on/off (triggered at change of the input I2 state and reflecting |  |
| 3: basic on/off (triggered at change of the input I3 state and reflecting |  |
| 4: Controller updates |  |


#### 1: Input 1 switch type

Switch type (input I1)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | mono-stable switch (push button) (0) |
|  | bi-stable (toggle) switch (1) |


#### 2: Input 2 contact type

Input 2 contact type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | NO (normally open) input type (0) |
|  | NC (normally close) input type (1) |


#### 3: Input 3 contact type

Input 3 contact type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | NO (normally open) input type (0) |
|  | NC (normally close) input type (1) |


#### 10: Activate / deactivate functions ALL ON/ALL OFF

Flush 1 relay module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALL ON is not active ALL OFF is not active (0) |
|  | ALL ON is not active ALL OFF active (1) |
|  | ALL ON active ALL OFF is not active (2) |
|  | ALL ON active, ALL OFF active (255) |


#### 30: Saving the state of the device after a power failure

Saving the state of the device after a power failure


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Flush dimmer module saves its state before power failure (it returns t (0) |
|  | Flush dimmer module does not save the state after a power failure, it (1) |


#### 40: Power reporting in Watts on power change for Q1

Set value means percentage, set value from 0-100 = 0%-100%. Power report is sent (pushed) only when actual power in Watts in real time changed for more than set percentage comparing to previous actual power in Watts, step is 1%.  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 5 |


#### 42: Power reporting in Watts by time interval

Set value means time interval (0 – 65535) in seconds, when power report is sent. Default value is 300 (power report in Watts is sent each 300s)  


 *  0 = Reporting Disabled
 *  1–65535 = 1 second – 65535 seconds. Reporting enab


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 300 |


#### 60: Minimum dimming value

Range is 1% – 98%, step is 1%.  
Default value is 1 (Minimum dimming value is 1%)  
NOTE: The maximum level may not be lower than the minimum level!  
1% min. dimming value is defined by Z-Wave multilevel device class.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_60_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 1 |


#### 61: Maximum dimming value

Range is 2% – 99%, step is 1%.  
Default value 99 (Maximum dimming value is 99 %)  
NOTE: The maximum level may not be lower than the minimum level!  
99% max. dimming value is defined by Z-Wave multilevel device class.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_61_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 99 |


#### 65: Dimming time (soft on/off)

Set value means time of moving the Dimmer between min. and max. dimming values by short press of push button I1 or controlled through UI.  
Range is 1-255 = 10-2550ms (2.55s), step is 10ms.  
Default value 100 (Dimming time between m


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_65_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 100 |


#### 66: Dimming time when key pressed

Time of moving the Dimmer between min. and max dimming values by continues hold of push button I1.  
Range is 1-255 = 1-255s, step is 1s.  
Default value 3 (Dimming time between min. and max. dimming values is 3s)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_66_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 3 |


#### 1: multilevel (triggered at changes of state/value of the Flush dimmer)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: basic on/off (triggered at change of the input I2 state and reflecting


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: basic on/off (triggered at change of the input I3 state and reflecting


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Controller updates


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/209).
