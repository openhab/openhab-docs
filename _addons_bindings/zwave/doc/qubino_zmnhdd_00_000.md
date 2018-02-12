---
layout: documentation
title: ZMNHDD - ZWave
---

{% include base.html %}

# ZMNHDD Flush Dimmer Plus

This describes the Z-Wave device *ZMNHDD*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhdd_00_000```. 

Flush Dimmer Plus  


## Overview 

This Z-Wave module is used for dimming the bulb or to manage the speed of a fan. The module can be controlled either through a Z-Wave network or through the wall switch. The module is designed to be mounted inside a "flush mounting box", hidden behind a traditional wall switch. Module measures power consumption of bulb or fan and supports connection of digital temperature sensor. It is designed to act as repeater in order to improve range and stability of Z-wave network.

  


### Inclusion Information 

WARNING: Service button S **must NOT be used** when module is connected to 110-230V power supply.

 *  Connect module to power supply (with temperature sensor connected - if purchased),
 *  Enable add/remove mode on main controller
 *  Auto-inclusion (works for about 2 minutesafter connected to power supply) or
 *  **110V-230V power supply: **Press push button I1 three times within 3 seconds (3 times change switch state within 3 seconds)
 *  **24V SELV: **Press service button **S** for more than 2 seconds.

**NOTE1:** For auto-inclusion procedure, first set main controller into inclusion mode and then connect module to power supply.

**NOTE2:** When connecting temperature sensor to module that has already been included, you have to exclude module first. Switch off power supply,connect the sensor and re-include the module.

  


### Exclusion Information 

WARNING: Service button S **must NOT be used** when module is connected to 110-230V power supply.

 *  Connect module to power supply
 *  Bring module within maximum 1 meter (3 feet) of the main controller
 *  Enable add/remove mode on main controller
 *  **110V-230V power supply:** Press push button **I1** five times within 3 seconds (5 times change switch state within 3 seconds) in the first 60 seconds after the module is connected to the power supply
 *  **24V SELV:** Press ervice button **S** for more than 6 seconds.

By this function all parameters of the module are set to default values and own ID is deleted. If push button I1 is pressed three times within 3 seconds (or service button S is pressed more than 2 and less than 6 seconds) module is excluded, but configuration parameters are not set to default values.

NOTE: If the module is included with parameters 100 or 101 with values different to default and module reset is done, wait at least 30s before next inclusion.


## Channels
The following table summarises the channels available for the ZMNHDD Flush Dimmer Plus.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Reset the total power consumption | meter_reset | meter_reset | Energy | Switch |
| Alarm | alarm_general | alarm_general | Door | Switch |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch |
| Dimmer 1 | switch_dimmer1 | switch_dimmer | DimmableLight | Dimmer |
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number |
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number |
| Binary Sensor 2 | sensor_binary2 | sensor_binary | Door | Switch |
| Alarm 2 | alarm_general2 | alarm_general | Door | Switch |
| Binary Sensor 3 | sensor_binary3 | sensor_binary | Door | Switch |
| Alarm 3 | alarm_general3 | alarm_general | Door | Switch |


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


### Dimmer 1

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZMNHDD Flush Dimmer Plus.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Input 1 switch type |  |
| 2: Input 2 switch type |  |
| 3: Input 2 contact type |  |
| 4: Input 3 contact type |  |
| 10: Activate / deactivate functions ALL ON / ALL OFF | Flush dimmer module responds to commands ALL ON / ALL OFF |
| 11: Automatic turning off output after set time | Auto OFF enabled with defined time, step is 1 second. |
| 12: Automatic turning on output after set time | Auto ON enabled with defined time, step is 1 second. |
| 20: Enable / Disable 3-way switch | Dimming is done by push button or switch connected to I1. |
| 21: Enable / Disable Double click function | A fast double click on the push button will set dimming power at maximum. |
| 30: Saving the state of the device after a power failure | If enabled, flush dimmer module saves its state before power failure. |
| 40: Power reporting in watts on power change | Set value is percentage, set value from 0 - 100 = 0% - 100%. |
| 42: Power reporting in Watts by time interval | Set value means time interval (0 – 32767) in seconds. |
| 60: Minimum dimming value | Minimum dimming value is set by entered value. |
| 61: Maximum dimming value | Maximum dimming value is set by entered value. |
| 65: Dimming time (soft on/off) | Set value means time of moving the Dimmer between min. and max. dimming values |
| 66: Dimming time when key pressed | Time of moving the Dimmer between min. and max dimming values |
| 67: Ignore start level | This parameter is used with association group 3 |
| 68: Dimming duration | This parameter is used with association group 3 |
| 100: Enable / Disable Endpoints I2 | Enabling I2 means that Endpoint (I2) will be present on UI. |
| 101: Enable / Disable Endpoints I3 | Enabling I3 means that Endpoint (I3) will be present on UI. |
| 110: Temperature sensor offset settings | Offset to actual measured value |
| 120: Digital temperature sensor reporting | Module reports measured temperature on defined temperature change |
| 1: Controller Updates | Lifeline group |
| 2: I1 basic on/off | Triggered at change of the input I1 state and reflecting its state |
| 3: I1 start/stop level change | Triggered at change of the input I1 state and reflecting its state |
| 4: Multilevel | Triggered at changes of state/value of the Flush Dimmer |
| 5: I2 basic on/off | Triggered at change of the input I2 state and reflecting its state |
| 6: I2 notification report | Triggered at change of the input I2 state and reflecting its state |
| 7: I2 binary sensor | Triggered at change of the input I2 state and reflecting its state |
| 8: I3 basic on/off | Triggered at change of the input I3 state and reflecting its state |
| 9: I3 notification report | Triggered at change of the input I3 state and reflecting its state |
| 10: I3 binary sensor | Triggered at change of the input I3 state and reflecting its state |
| 11: Multilevel sensor | Triggered at change of temperature sensor |


#### 1: Input 1 switch type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Mono-stable switch type (push button) (0) |
|  | 1 - Bi-stable switch type (1) |


#### 2: Input 2 switch type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 0 - Mono-stable switch type (push button) (0) |
|  | 1 - Bi-stable switch type (1) |


#### 3: Input 2 contact type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 0 - NO (normally open) input type (0) |
|  | 1 - NC (normally closed) input type (1) |


#### 4: Input 3 contact type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 0 - NO (normally open) input type (0) |
|  | 1 - NC (normally closed) input type (1) |


#### 10: Activate / deactivate functions ALL ON / ALL OFF

Flush dimmer module responds to commands ALL ON / ALL OFF  


##### Overview 

Flush dimmer module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_2 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALL ON is not active, ALL OFF is not active (0) |
|  | ALL ON is not active, ALL OFF active (1) |
|  | ALL ON active, ALL OFF is not active (2) |
|  | ALL ON active, ALL OFF active (255) |


#### 11: Automatic turning off output after set time

Auto OFF enabled with defined time, step is 1 second.  


##### Overview 

 *  0 - Auto OFF disabled
 *  1 – 32536 = 1 second – 32536 seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER |
| Range | 0 to 32536 |
| Default Value | 0 |


#### 12: Automatic turning on output after set time

Auto ON enabled with defined time, step is 1 second.  


##### Overview 

 *  0 - Auto ON disabled
 *  1 – 32536 = 1 second – 32536 seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 32536 |
| Default Value | 0 |


#### 20: Enable / Disable 3-way switch

Dimming is done by push button or switch connected to I1.  


##### Overview 

Dimming is done by push button or switch connected to I1 (by default).

Enabling 3way switch, dimming can be controlled by push button or switch connected to I1 and I2.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 0 - single push button (connected to I1) (0) |
|  | 1 - 3-way switch (connected to I1 and I2) (1) |
|  | 2 - Additional switch connected to I2 (2) |


#### 21: Enable / Disable Double click function

A fast double click on the push button will set dimming power at maximum.  


##### Overview 

If Double click function is enabled, a fast double click on the push button will set dimming power at maximum dimming value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 0 - double click disabled (0) |
|  | 1 - double click enabled (1) |


#### 30: Saving the state of the device after a power failure

If enabled, flush dimmer module saves its state before power failure.  


##### Overview 

If state saving is enabled, flush dimmer module saves its state before power failure (it returns to the last position saved before a power failure).

If state saving is disabled, flush dimmer module does not save the state after a power failure.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 0 - Save state enabled (0) |
|  | 1 - Save state disabled (1) |


#### 40: Power reporting in watts on power change

Set value is percentage, set value from 0 - 100 = 0% - 100%.  


##### Overview 

Set value means percentage, set value from 0 - 100 = 0% - 100%. Default value is 5.

 *  0 – Reporting Disabled
 *  1 – 100 = 1% - 100% Reporting enabled.

Power report is send (push) only when actual power in Watts in real time changes for more than set percentage comparing to previous actual power in Watts, step is 1%.

NOTE: if power changed is less than 1W, the report is not send (pushed), independent of percentage set.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 5 |


#### 42: Power reporting in Watts by time interval

Set value means time interval (0 – 32767) in seconds.  


##### Overview 

Set value means time interval (0 – 32767) in seconds, when power report is sent.

 *  0 – reporting disabled
 *  1 – 32767 = 1 second – 32767 seconds. Reporting enabled.

Power report is send with time interval set by entered value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 300 |


#### 60: Minimum dimming value

Minimum dimming value is set by entered value.  


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

Maximum dimming value is set by entered value.  


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

Set value means time of moving the Dimmer between min. and max. dimming values  


##### Overview 

Set value means time of moving the Dimmer between min. and max. dimming values by short press of push button I1 or controlled through UI (BasicSet).

 *  default value 100 = 1s
 *  1 - 255 = 100 mseconds – 25500 mseconds, step is 10 mseconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_65_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 100 |


#### 66: Dimming time when key pressed

Time of moving the Dimmer between min. and max dimming values  


##### Overview 

Time of moving the Dimmer between min. and max dimming values by continuous hold of push button I1 or associated device.

 *  default value 3 = 3s
 *  1- 255 = 1 second – 255 seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_66_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 3 |


#### 67: Ignore start level

This parameter is used with association group 3  


##### Overview 

This parameter is used with association group 3. A receiving device SHOULD respect the start level if the Ignore Start Level bit is 0. A receiving device MUST ignore the start level if the Ignore Start Level bit is 1.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_67_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 0 - respect start level (0) |
|  | 1 - ignore start level (1) |


#### 68: Dimming duration

This parameter is used with association group 3  


##### Overview 

This parameter is used with association group 3. The Duration field MUST specify the time that the transition should take from the current value to the new target value. A supporting device SHOULD respect the specified Duration value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_68_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 100: Enable / Disable Endpoints I2

Enabling I2 means that Endpoint (I2) will be present on UI.  


##### Overview 

Enabling I2 means that Endpoint (I2) will be present on UI. Disabling it will result in hiding the endpoint according to the parameter set value. Additionally, a Notification Type and Event can be selected for the endpoint.

NOTE1: After parameter change, first exclude module (without setting parameters to default value) then wait at least 30s and then re include the module!

NOTE 2: When the parameter is set to value 9 the notifications are send for Home Security.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_100_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 0 – Disabled (0) |
|  | 1 – Home Security (1) |
|  | 2 – Carbon Monoxide (2) |
|  | 3 – Carbon Dioxide (3) |
|  | 4 – Water Alarm (4) |
|  | 5 – Heat Alarm (5) |
|  | 6 - Smoke Alarm (6) |
|  | 9 – Sensor binary (9) |


#### 101: Enable / Disable Endpoints I3

Enabling I3 means that Endpoint (I3) will be present on UI.  


##### Overview 

Enabling I3 means that Endpoint (I3) will be present on UI. Disabling it will result in hiding the endpoint according to the parameter set value. Additionally, a Notification Type and Event can be selected for the endpoint.

NOTE1: After parameter change, first exclude module (without setting parameters to default value) then wait at least 30s and then re include the module!

NOTE 2: When the parameter is set to value 9 the notifications are send for Home Security.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_101_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 0 – Disabled (0) |
|  | 1 – Home Security (1) |
|  | 2 – Carbon Monoxide (2) |
|  | 3 – Carbon Dioxide (3) |
|  | 4 – Water Alarm (4) |
|  | 5 – Heat Alarm (5) |
|  | 6 - Smoke Alarm (6) |
|  | 9 – Sensor binary (9) |


#### 110: Temperature sensor offset settings

Offset to actual measured value  


##### Overview 

Set value is added or subtracted to actual measured value by sensor. Available configuration parameters:

 *  default value 32536
 *  32536 – offset is 0.0C
 *  From 1 to 100 – value from 0.1 °C to 10.0 °C is added to actual measured temperature.
 *  From 1001 to 1100 -value from -0.1 °C to -10.0 °C is subtracted to actual measured temperature.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_110_2 |
| Data Type        | INTEGER |
| Range | 1 to 32536 |
| Default Value | 32536 |


#### 120: Digital temperature sensor reporting

Module reports measured temperature on defined temperature change  


##### Overview 

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

Lifeline group


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: I1 basic on/off

Triggered at change of the input I1 state and reflecting its state


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: I1 start/stop level change

Triggered at change of the input I1 state and reflecting its state


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Multilevel

Triggered at changes of state/value of the Flush Dimmer


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: I2 basic on/off

Triggered at change of the input I2 state and reflecting its state


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


#### 6: I2 notification report

Triggered at change of the input I2 state and reflecting its state


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_6 |
| Data Type        | TEXT |
| Range |  to  |


#### 7: I2 binary sensor

Triggered at change of the input I2 state and reflecting its state


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_7 |
| Data Type        | TEXT |
| Range |  to  |


#### 8: I3 basic on/off

Triggered at change of the input I3 state and reflecting its state


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_8 |
| Data Type        | TEXT |
| Range |  to  |


#### 9: I3 notification report

Triggered at change of the input I3 state and reflecting its state


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_9 |
| Data Type        | TEXT |
| Range |  to  |


#### 10: I3 binary sensor

Triggered at change of the input I3 state and reflecting its state


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_10 |
| Data Type        | TEXT |
| Range |  to  |


#### 11: Multilevel sensor

Triggered at change of temperature sensor


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_11 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/210).
