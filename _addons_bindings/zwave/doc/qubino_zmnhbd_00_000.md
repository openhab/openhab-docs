---
layout: documentation
title: ZMNHBD - ZWave
---

{% include base.html %}

# ZMNHBD Flush 2 relays

This describes the Z-Wave device *ZMNHBD*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhbd_00_000```. 

Flush 2 relays  


## Overview 

This Z-Wave module is used for switching on or off two electrical devices (e.g. lights or fans,..). The module can be controlled either through Z-Wave network or through the wallswitches. The module is designed to be mounted inside a "flush mountingbox", hidden behind a traditional wall switch. Module measures power consumption of two electrical devices and supports connection of digital temperature sensor. It is designed to act as repeater in order to improve range and stability of Z-wave network.

  


### Inclusion Information 

**Module Inclusion (Adding to Z-Wave network)**

 *  Connect module to power supply (with temperature sensor connected -if purchased)
 *  Enable add/remove mode on main controller
 *  Auto-inclusion (works forabout 5 seconds after connected to power supply) or
 *  Press push button I1 three times within 3s (3 times change switch state within 3 seconds) or
 *  Press service button **S** (only applicable for 24 V SELV supply voltage) for more than 2 seconds.

**NOTE1:** For auto-inclusion procedure, first set main controller into inclusion mode and then connect module to power supply.

**NOTE2:** When connecting temperature sensor to module that has already been included, you have to exclude module first. Switch off power supply , connect the sensor and re-include the module.

  


### Exclusion Information 

**Module Exclusion/Reset (Removing from Z-Wavenetwork)**

 *  Connect module to power supply
 *  Bring module within maximum 1 meter (3 feet) of the main controller,
 *  Enable add/remove mode on main controller,
 *  Press push button **I1** five times within 3s (5 times change switch state within 3 seconds) in the first 60 seconds after the module is connected to the power supply or
 *  Press service button **S** (only applicable for 24 V SELV supply voltage) for more than 6 seconds.

By this function all parameters of the module are set to default values and own ID is deleted.

If push button I1 is pressed three times within 3s (or service button S is pressed more than 2 and less than 6 seconds) module is excluded, but configuration parameters are not set to default values.


## Channels
The following table summarises the channels available for the ZMNHBD Flush 2 relays.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch |
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number |
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number |
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch |
| Electric meter (watts) 2 | meter_watts2 | meter_watts | Energy | Number |
| Electric meter (kWh) 2 | meter_kwh2 | meter_kwh | Energy | Number |


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
The following table provides a summary of the configuration parameters available in the ZMNHBD Flush 2 relays.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Input 1 switch type | Input 1 switch type |
| 2: Input 2 switch type | Input 2 switch type |
| 10: Functions ALL ON/ALL OFF | Activate / deactivate functions ALL ON/ALL OFF |
| 11: Automatic turning off output Q1 after set time | When relay Q1 is ON it goes automatically OFF after defined time |
| 12: Automatic turning on output Q1 after set time | When relay Q1 is OFF it goes automatically ON after defined time |
| 13: Automatic turning off relay Q2 after set time | When relay Q2 is ON it goes automatically OFF after defined time |
| 14: Automatic turning on output Q2 after set time | When relay Q2 is OFF it goes automatically ON after defined time |
| 15: Automatic turning off / on seconds or milliseconds selection | Automatic turning off / on seconds or milliseconds selection |
| 30: Saving the state after a power failure | Saving the state of the relays Q1 and Q2 after a power failure |
| 40: Power reporting in Watts for Q1 | Power reporting in Watts on power change for Q1 |
| 41: Power reporting in Watts for Q2 | Power reporting in Watts on power change for Q2 |
| 42: Power reporting time interval for Q1 | Power reporting in Watts by time interval for Q1 |
| 43: Power reporting time interval for Q2 | Power reporting in Watts by time interval for Q2 |
| 63: Output Q1 Switch selection |  |
| 64: Output Q2 Switch selection |  |
| 110: Temperature sensor offset | Temperature sensor offset settings |
| 120: Digital temperature sensor reporting | Digital temperature sensor reporting |
| 1: Default Reporting Group |  |
| 2: Q1 basic on/off |  |
| 3: Q1 switch binary |  |
| 4: Q1 power meter |  |
| 5: Q2 basic on/off |  |
| 6: Q2 switch binary |  |
| 7: Q2 power meter |  |
| 8: Multilevel sensor |  |


#### 1: Input 1 switch type

Input 1 switch type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | mono-stable switch type (push button) (0) |
|  | bi-stable switch type (1) |


#### 2: Input 2 switch type

Input 2 switch type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | mono-stable switch type (push button) (0) |
|  | bi-stable switch type (1) |


#### 10: Functions ALL ON/ALL OFF

Activate / deactivate functions ALL ON/ALL OFF  


##### Overview 

Flush 1 relay module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_2 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALL ON is not active ALL OFF is not active (0) |
|  | ALL ON is not active ALL OFF active (1) |
|  | ALL ON active ALL OFF is not active (2) |
|  | ALL ON active, ALL OFF active (255) |


#### 11: Automatic turning off output Q1 after set time

When relay Q1 is ON it goes automatically OFF after defined time  


##### Overview 

Timer is reset to zero each time the module receive ON command regardless from where it comes  (push button, associated module, controller,..).

 *  0 - Auto OFF disabled
 *  1 - 32535 = 1second (0,01s) - 32535 seconds (325,35s) Auto OFF enabled with define time, step is 1s or 10ms according to parameter nr.15.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER |
| Range | 0 to 32535 |
| Default Value | 0 |


#### 12: Automatic turning on output Q1 after set time

When relay Q1 is OFF it goes automatically ON after defined time  


##### Overview 

Timer is reset to zero each time the module receive OFF command regardless from where it comes (push button, associated module, controller,..).

 *  0 - Auto ON disabled
 *  1 - 32535 = 1second (0,01s) - 32536 seconds (325,35s) Auto ON enabled with define time, step is 1s or 10ms according to parameter nr.15.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 32535 |
| Default Value | 0 |


#### 13: Automatic turning off relay Q2 after set time

When relay Q2 is ON it goes automatically OFF after defined time  


##### Overview 

Timer is reset to zero each time the module receive ON command regardless from where it comes (push button, associated module, controller,..).

 *  0 -Auto OFF disabled
 *  1 - 32535 = 1second (0,01s) - 32535 seconds (325,35s) Auto OFF enabled with define time, step is 1s or 10ms according to parameter nr.15.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_2 |
| Data Type        | INTEGER |
| Range | 0 to 32535 |
| Default Value | 0 |


#### 14: Automatic turning on output Q2 after set time

When relay Q2 is OFF it goes automatically ON after defined time  


##### Overview 

Timer is reset to zero each time the module receive OFF command regardless from where it comes (push button, associated module, controller,..).

 *  0 -Auto ON disabled
 *  1 - 32535 = 1second (0,01s) - 32536 seconds (325,35s) Auto ON enabled with define time, step is 1s or 10ms according to parameter nr.15.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_2 |
| Data Type        | INTEGER |
| Range | 0 to 32535 |
| Default Value | 0 |


#### 15: Automatic turning off / on seconds or milliseconds selection

Automatic turning off / on seconds or milliseconds selection  


##### Overview 

Available configuration parameters:

 *  0 – seconds selected
 *  1 – milliseconds selected

**NOTE:** Parameter is valid for both outputs Q1, Q2 and is the same for turning off or on.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 30: Saving the state after a power failure

Saving the state of the relays Q1 and Q2 after a power failure


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Saves its state before power failure (0) |
|  | Does not save the state after a power failure (1) |


#### 40: Power reporting in Watts for Q1

Power reporting in Watts on power change for Q1  


##### Overview 

Set value means percentage, set value from 0 –100 = 0% -100%.

Available configuration parameters:

 *  0 - reporting disabled
 *  1 -100 = 1% -100% Reporting enabled. Power report is send (push) only when actual power in Watts in real time changes for more than set percentage comparing to previous actual power in Watts, step is 1%.

**NOTE:** If power changed is less than 1W, the report is not send (pushed), independent of percentage set.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 10 |


#### 41: Power reporting in Watts for Q2

Power reporting in Watts on power change for Q2  


##### Overview 

Set value means percentage, set value from 0 –100 = 0% -100%. Available configuration parameters:

 *  0 - reporting disabled
 *  1 - 100 = 1% - 100% Reporting enabled. Power report is send (push) only when actual power in Watts in real time changes for more than set percentage comparing to previous actual power in Watts, step is 1%.

**NOTE:** If power changed is less than 1W, the report is not send (pushed), independent of percentage set.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_41_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 10 |


#### 42: Power reporting time interval for Q1

Power reporting in Watts by time interval for Q1  


##### Overview 

Set value means time interval (0 – 32535) in seconds, when power report is send. Available configuration parameters:

 *  Default value 300 (power report in Watts is send each 300s)
 *  0 - reporting disabled
 *  1 - 32535 = 1 second - 32535 seconds. Reporting enabled, Power report is send with time interval set by entered value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_2 |
| Data Type        | INTEGER |
| Range | 0 to 32535 |
| Default Value | 300 |


#### 43: Power reporting time interval for Q2

Power reporting in Watts by time interval for Q2  


##### Overview 

Set value means time interval (0 –32535) in seconds, when power report is send. Available configuration parameters:

 *  Default value 300 (power report in Watts is send each 300s)
 *  0 - reporting disabled
 *  1 - 32535 = 1 second - 32535 seconds. Reporting enabled, Power report is send with time interval set by entered value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_43_2 |
| Data Type        | INTEGER |
| Range | 0 to 32535 |
| Default Value | 300 |


#### 63: Output Q1 Switch selection


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_63_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | When system is turned off the output is 0V (NC) (0) |
|  | When system is turned off the output is 230V or 24V (NO) (1) |


#### 64: Output Q2 Switch selection


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_64_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | When system is turned off the output is 0V (NC) (0) |
|  | When system is turned off the output is 230V or 24V (NO) (1) |


#### 110: Temperature sensor offset

Temperature sensor offset settings  


##### Overview 

Set value is added or subtracted to actual measured value by sensor. Available configuration parameters:

 *  Default value 32536
 *  32536 - offset is 0.0C
 *  From 1 to 100 - value from 0.1 °C to 10.0 °C is added to actual measured temperature.
 *  From 1001 to 1100 -value from -0.1 °C to -10.0 °C is subtracted to actual measured temperature.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_110_2 |
| Data Type        | INTEGER |
| Range | 0 to 32536 |
| Default Value | 32536 |


#### 120: Digital temperature sensor reporting

Digital temperature sensor reporting  


##### Overview 

If digital temperature sensor is connected, module reports measured temperature on temperature change defined by this parameter. Available configuration parameters:

 *  Default value 5 = 0,5°C
 *  0 – Reporting disabled
 *  1 - 127 = 0,1°C – 12,7°C, step is 0,1°C


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_120_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 5 |


#### 1: Default Reporting Group


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Q1 basic on/off


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Q1 switch binary


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Q1 power meter


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Q2 basic on/off


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


#### 6: Q2 switch binary


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_6 |
| Data Type        | TEXT |
| Range |  to  |


#### 7: Q2 power meter


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_7 |
| Data Type        | TEXT |
| Range |  to  |


#### 8: Multilevel sensor


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_8 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/215).
