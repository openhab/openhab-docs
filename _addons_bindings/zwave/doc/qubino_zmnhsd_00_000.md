---
layout: documentation
title: ZMNHSD - ZWave
---

{% include base.html %}

# ZMNHSD DIN Rail Dimmer

This describes the Z-Wave device *ZMNHSD*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhsd_00_000```. 

DIN Rail Dimmer


## Channels
The following table summarises the channels available for the ZMNHSD DIN Rail Dimmer.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |


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
The following table provides a summary of the configuration parameters available in the ZMNHSD DIN Rail Dimmer.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Input switch type |  |
| 5: Working mode | With this parameter it is possible to change the module presentation on the user interface... |
| 10: Activate / deactivate functions ALL ON / ALL OFF | DIN dimmer module responds to commands ALL ON / ALL OFF that may be sent by the main contr... |
| 11: Automatic turning off output after set time |  |
| 12: Automatic turning on output after set time |  |
| 21: Enable / Disable Double click function | If Double click function is enabled, a fast double click on the push button will set dimmi... |
| 30: Saving the state of the device after a power failure | If state saving is enabled, DIN dimmer module saves its state before power failure (it ret... |
| 40: Power reporting in watts on power change | Set value means percentage, set value from 0 - 100 = 0% - 100%. Default value is 5. 0 – Re... |
| 42: Power reporting in Watts by time interval | Set value means time interval (0 – 32767) in seconds, when power report is sent. |
| 60: Minimum dimming value |  |
| 61: Maximum dimming value |  |
| 65: Dimming time (soft on/off) | Set value means time of moving the Dimmer between min. and max. dimming values by short pr... |
| 66: Dimming time when key pressed | Time to moving the Dimmer between min. and max values (in seconds). |
| 67: Ignore start level | This parameter is used with association group 3. A receiving device SHOULD respect the sta... |
| 68: Dimming duration | This parameter is used with association group 3. |
| 110: Temperature sensor offset settings | Set value is added or subtracted to actual measured value by sensor. Available configurati... |
| 120: Digital temperature sensor reporting | If digital temperature sensor is connected, module reports measured temperature on tempera... |
| 1: Controller Updates |  |
| 2: I1 basic on/off |  |
| 3: I1 start/stop level change |  |
| 4: Multilevel set |  |
| 5: Multilevel sensor report |  |


#### 1: Input switch type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 0 - Mono-stable switch type (push button) (0) |
|  | 1 - Bi-stable switch type (1) |


#### 5: Working mode

With this parameter it is possible to change the module presentation on the user interface.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Dimmer (0) |
|  | Switch (1) |


#### 10: Activate / deactivate functions ALL ON / ALL OFF

DIN dimmer module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_2 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALL ON is not active, ALL OFF is not active (0) |
|  | ALL ON is not active, ALL OFF active (1) |
|  | ALL ON active, ALL OFF is not active (2) |
|  | ALL ON active, ALL OFF active (255) |


#### 11: Automatic turning off output after set time

  


##### Overview 

 *  0 - Auto OFF disabled
 *  1 – 32536 = 1 second – 32536 seconds Auto OFF enabled with defined time, step is 1 second.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER |
| Range | 0 to 32536 || Default Value | 0 |
| Options | Auto off DISABLED (0) |


#### 12: Automatic turning on output after set time

  


##### Overview 

 *  0 - Auto ON disabled
 *  1 – 32536 = 1 second – 32536 seconds Auto ON enabled with defined time, step is 1 second.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 32536 || Default Value | 0 |
| Options | Auto on DISABLED (0) |


#### 21: Enable / Disable Double click function

If Double click function is enabled, a fast double click on the push button will set dimming power at maximum dimming value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 0 - double click disabled (0) |
|  | 1 - double click enabled (1) |


#### 30: Saving the state of the device after a power failure

If state saving is enabled, DIN dimmer module saves its state before power failure (it returns to the last position saved before a power failure). If state saving is disabled, DIN dimmer module does not save the state after a powe


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 0 - Save state enabled (0) |
|  | 1 - Save state disabled (1) |


#### 40: Power reporting in watts on power change

Set value means percentage, set value from 0 - 100 = 0% - 100%. Default value is 5. 0 – Reporting Disabled 1 – 100 = 1% - 100% Reporting enabled. Power report is sent (push) only when actual power in Watts in real time changes for more than set p


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 5 |


#### 42: Power reporting in Watts by time interval

Set value means time interval (0 – 32767) in seconds, when power report is sent.  


##### Overview 

 *  0 – reporting disabled
 *  1 – 32767 = 1 second – 32767 seconds. Reporting enabled. Power report is sent with time interval set by entered


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 300 |


#### 60: Minimum dimming value

  


##### Overview 

 *  1-98 = 1% – 98%, step is 1%. Minimum dimming value is set by entered value.

NOTE: The minimum level may not be higher than the maximum level! 1% min. dimming value is defined by Z- Wave multilevel device class.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_60_1 |
| Data Type        | INTEGER |
| Range | 1 to 98 |
| Default Value | 1 |


#### 61: Maximum dimming value

  


##### Overview 

 *  2-99 = 2% – 99%, step is 1%. Maximum dimming value is set by entered value.

NOTE: The maximum level may not be lower than the minimum level! 99% max. dimming value is defined by Z- Wave multilevel device class.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_61_1 |
| Data Type        | INTEGER |
| Range | 2 to 99 |
| Default Value | 99 |


#### 65: Dimming time (soft on/off)

Set value means time of moving the Dimmer between min. and max. dimming values by short press of push button I1 or controlled through UI (BasicSet).

 *  default value 100 = 1s
 *  1 - 255 = 100 mseconds – 25500 mseconds (25.5


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_65_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 100 |


#### 66: Dimming time when key pressed

Time to moving the Dimmer between min. and max values (in seconds).  


##### Overview 

 *  default value 3 = 3s
 *  1- 255 = 1 second – 255 seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_66_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 3 |


#### 67: Ignore start level

This parameter is used with association group 3. A receiving device SHOULD respect the start level if the Ignore Start Level bit is 0. A receiving device MUST ignore the start level if the Ignore Start Level bit is 1.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_67_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 0 - respect start level (0) |
|  | 1 - ignore start level (1) |


#### 68: Dimming duration

This parameter is used with association group 3.  


##### Overview 

The Duration field MUST specify the time that the transition should take from the current value to the new target value. A supporting device SHOULD respect the specified Duration value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_68_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 110: Temperature sensor offset settings

Set value is added or subtracted to actual measured value by sensor. Available configuration parameters:

 *  default value 32536
 *  32536 – offset is 0.0C
 *  From 1 to 100 – value from 0.1 °C to 10.0 °C is added to


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_110_2 |
| Data Type        | INTEGER |
| Range | 1 to 32536 |
| Default Value | 32536 |


#### 120: Digital temperature sensor reporting

If digital temperature sensor is connected, module reports measured temperature on temperature change defined by this parameter. Available configuration parameters:

 *  default value 5 = 0.5°C
 *  0 – Reporting disabled


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


#### 2: I1 basic on/off


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: I1 start/stop level change


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Multilevel set


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Multilevel sensor report


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/324).
