---
layout: documentation
title: FGS223 - ZWave
---

{% include base.html %}

# FGS223 Double Switch 2

This describes the Z-Wave device *FGS223*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgs223_00_000```. 

Double Switch 2  


## Overview 

FIBARO Switch 2 is designed to be installed in standard wall switch boxes or anywhere else where it is necessary to control electric devices. FIBARO Switch 2 allows to control connected devices either via the Z-Wave+ network or via a switch connected directly to it and is equipped with active power and energy consumption metering functionality.

Main features of FIBARO Switch 2:

 *  Compatible with any Z-Wave or Z-Wave+ Controller,
 *  Supports protected mode (Z-Wave network security mode) with
 *  AES-128 encryption,
 *  Advanced microprocessor control,
 *  Active power and energy metering functionality,
 *  Works with various types of switches – momentary, toggle, three-way, etc,
 *  To be installed in wall switch boxes of dimensions allowing for installation, conforming to provisions of applicable regulations,
 *  FIBARO Switch 2 is an extension unit.

  


### Inclusion Information 

Put controller into inclusion mode and triple click S1 switch

  


### Exclusion Information 

Put controller into exclusion mode and triple click S1 switch


## Channels
The following table summarises the channels available for the FGS223 Double Switch 2.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
|  | switch_binary | switch_binary | Switch | Switch |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Scene Number | scene_number | scene_number |  | Number |
| Alarm | alarm_general | alarm_general | Door | Switch |
| Send notification | notification_send | notification_send |  | Number |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch |
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number |
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number |
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch |
| Electric meter (kWh) 2 | meter_kwh2 | meter_kwh | Energy | Number |
| Electric meter (watts) 2 | meter_watts2 | meter_watts | Energy | Number |


### Device Configuration
The following table provides a summary of the configuration parameters available in the FGS223 Double Switch 2.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 9: Restore state after power failure | Restore state after power failure |
| 10: First channel operating mode | First channel - operating mode |
| 11: 1st ch. reaction to switch | First channel - reaction to switch for delay/auto ON/OFF modes |
| 12: time parameter for delay/auto ON/OFF modes | First channel - time parameter for delay/auto ON/OFF modes |
| 13: 1st ch. pulse time for flashing mode | First channel - pulse time for flashing mode |
| 15: 2nd ch. operating mode | Second channel - operating mode |
| 16: 2nd ch. reaction to switch | Second channel - reaction to switch for delay/auto ON/OFF modes |
| 17: 2nd ch. time parameter for delay | Second channel - time parameter for delay/auto ON/OFF modes |
| 18: 2nd ch. pulse time for flashing mode | Second channel - pulse time for flashing mode |
| 20: Switch type | Switch type |
| 21: Flashing mode - reports | Flashing mode - reports |
| 27: Associations in Z-Wave network security mode | Associations in Z-Wave network security mode |
| 28: S1 switch - scenes sent | S1 switch - scenes sent |
| 29: S2 switch - scenes sent | S2 switch - scenes sent |
| 30: S1 assocs. sent to 2nd and 3rd group | S1 switch - associations sent to 2nd and 3rd association groups |
| 31: S1 ON val sent to 2nd and 3rd groups | S1 switch - Switch ON value sent to 2nd and 3rd association groups |
| 32: S1 OFF val sent to 2nd and 3rd groups | S1 switch - Switch ON value sent to 2nd and 3rd association groups |
| 33: S1 DblClick val sent to 2nd and 3rd groups | S1 switch - Double Click value sent to 2nd and 3rd association groups |
| 35: S2 assocs. sent to 4th and 5th group | S2 switch - associations sent to 4th and 5th association groups |
| 36: S2 ON val sent to 4th and 5th groups | S2 switch - Switch ON value sent to 4th and 5th association groups |
| 36: S2 ON val sent to 4th and 5th groups | S2 switch - Switch ON value sent to 4th and 5th association groups |
| 37: S2 OFF val sent to 4th and 5th groups | S2 switch - Switch OFF value sent to 4th and 5th association groups |
| 38: S2 DblClick val sent to 4th and 5th groups |  |
| 40: Reaction to General Alarm | Reaction to General Alarm |
| 41: Reaction to Flood Alarm | Reaction to Flood Alarm |
| 42: Reaction to CO/CO2/Smoke Alarm | Reaction to CO/CO2/Smoke Alarm |
| 43: Reaction to Heat Alarm | Reaction to Heat Alarm |
| 44: Flashing alarm duration | Flashing alarm duration |
| 50: First channel - power reports | First channel - power reports |
| 51: 1st ch min time between reports | First channel - minimal time between power reports |
| 53: 1st ch energy reports | First channel - energy reports |
| 54: Second channel - power reports | Second channel - power reports |
| 55: 2nd ch min time between reports | Second channel - minimal time between power reports |
| 57: 2nd ch energy reports | Second channel - energy reports |
| 58: Periodic power reports | Periodic power reports |
| 59: Periodic energy reports | Periodic energy reports |
| 60: Include own energy | Measuring energy consumed by the device itself |
| 1: Lifeline | reports the device status and allows for assigning single device only (main controller by ... |
| 2: On/Off (S1) | On/Off (S1) is assigned to switch connected to the S1 terminal (uses Basic command class) |
| 3: Dimmer (S1) | “Dimmer (S1)” is assigned to switch connected to the S1 terminal (uses Switch Multilevel c... |
| 4: On/Off (S2) | On/Off (S2) is assigned to switch connected to the S2 terminal (uses Basic command class) |
| 5: Dimmer (S2) | Dimmer (S2) is assigned to switch connected to the S2 terminal (uses Switch Multilevel com... |


#### 9: Restore state after power failure

Restore state after power failure  


##### Overview 

This parameter determines if the device will return to state prior to the power failure after power is restored.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | off after power loss (0) |
|  | restore last state (1) |


#### 10: First channel operating mode

First channel - operating mode  


##### Overview 

This parameter allows to choose operating for the 1st channel controlled by the S1 switch.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | standard operation (0) |
|  | delay ON (1) |
|  | delay OFF (2) |
|  | auto ON (3) |
|  | auto OFF (4) |
|  | flashing mode (5) |


#### 11: 1st ch. reaction to switch

First channel - reaction to switch for delay/auto ON/OFF modes  


##### Overview 

This parameter determines how the device in timed mode reacts to pushing the switch connected to the S1 terminal.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | cancel mode and set target state (0) |
|  | no reaction to switch - mode runs until it ends (1) |
|  | reset timer - start counting from the beginning (2) |


#### 12: time parameter for delay/auto ON/OFF modes

First channel - time parameter for delay/auto ON/OFF modes  


##### Overview 

This parameter allows to set time parameter used in timed modes.

Available settings: 0 (0.1s), 1-32000 (1-32000s, 1s step) - time parameter

Default setting: 50 (50s)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 50 |


#### 13: 1st ch. pulse time for flashing mode

First channel - pulse time for flashing mode  


##### Overview 

This parameter allows to set time of switching to opposite state in flashing mode

Available settings: 1-32000 (0.1-3200.0s, 0.1s step) - time parameter

Default setting: 5 (0.5s)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_2 |
| Data Type        | INTEGER |
| Range | 1 to 32000 |
| Default Value | 5 |


#### 15: 2nd ch. operating mode

Second channel - operating mode  


##### Overview 

This parameter allows to choose operating for the 1st channel controlled by the S2 switch.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | standard operation (0) |
|  | delay ON (1) |
|  | delay OFF (2) |
|  | auto ON (3) |
|  | auto OFF (4) |
|  | flashing mode (5) |


#### 16: 2nd ch. reaction to switch

Second channel - reaction to switch for delay/auto ON/OFF modes


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_16_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | cancel mode and set target state (0) |
|  | no reaction to switch - mode runs until it ends (1) |
|  | reset timer - start counting from the beginning (2) |


#### 17: 2nd ch. time parameter for delay

Second channel - time parameter for delay/auto ON/OFF modes  


##### Overview 

This parameter allows to set time parameter used in timed modes.

Available settings: 0 (0.1s), 1-32000 (1-32000s, 1s step) - time parameter

Default setting: 50 (50s)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_17_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 50 |


#### 18: 2nd ch. pulse time for flashing mode

Second channel - pulse time for flashing mode  


##### Overview 

This parameter allows to set time of switching to opposite state in flashing mode

Available settings: 1-32000 (0.1-3200.0s, 0.1s step) - time parameter

Default setting: 5 (0.5s)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_18_2 |
| Data Type        | INTEGER |
| Range | 1 to 32000 |
| Default Value | 5 |


#### 20: Switch type

Switch type  


##### Overview 

This parameter defines as what type the device should treat the switch connected to the S1 and S2 terminals


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | momentary switch (0) |
|  | toggle switch stable (1) |
|  | toggle switch (2) |


#### 21: Flashing mode - reports

Flashing mode - reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | the device does not send reports (0) |
|  | the device sends reports (1) |


#### 27: Associations in Z-Wave network security mode

Associations in Z-Wave network security mode  


##### Overview 

This parameter defines how commands are sent in specified association groups: as secure or non-secure. Parameter is active only in Z-Wave network security mode. This parameter does not apply to 1st „Lifeline” group.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_27_1 |
| Data Type        | INTEGER || Default Value | 15 |
| Options | no group sent as secure (0) |
|  | 2nd group sent as secure (1) |
|  | 3rd group sent as secure (2) |
|  | 4th group sent as secure (4) |
|  | 5th group sent as secure (8) |
|  | all groups sent as secure (15) |


#### 28: S1 switch - scenes sent

S1 switch - scenes sent  


##### Overview 

This parameter determines which actions result in sending scene IDs assigned to them


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_28_1 |
| Data Type        | INTEGER |
| Range | 0 to 15 || Default Value | 0 |
| Options | no scenes sent (0) |
|  | Key pressed 1 time (1) |
|  | Key pressed 2 times (2) |
|  | Key pressed 3 times (4) |
|  | Key Hold Down and Key Released (8) |


#### 29: S2 switch - scenes sent

S2 switch - scenes sent  


##### Overview 

This parameter determines which actions result in sending scene IDs assigned to them.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_29_1 |
| Data Type        | INTEGER |
| Range | 0 to 15 || Default Value | 0 |
| Options | no scenes sent (0) |
|  | Key pressed 1 time (1) |
|  | Key pressed 2 times (2) |
|  | Key pressed 3 times (4) |
|  | Key Hold Down and Key Released (8) |


#### 30: S1 assocs. sent to 2nd and 3rd group

S1 switch - associations sent to 2nd and 3rd association groups  


##### Overview 

This parameter determines which actions are ignored when sending commands to devices associated in 2nd and 3rd association group. All actions are active by default.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER |
| Range | 0 to 15 || Default Value | 0 |
| Options | All actions are active by default (0) |
|  | ignore turning ON with 1 click of the switch (1) |
|  | ignore turning OFF with 1 click of the switch (2) |
|  | ignore holding and releasing the switch (4) |
|  | ignore double click of the switch (8) |


#### 31: S1 ON val sent to 2nd and 3rd groups

S1 switch - Switch ON value sent to 2nd and 3rd association groups


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_31_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 32: S1 OFF val sent to 2nd and 3rd groups

S1 switch - Switch ON value sent to 2nd and 3rd association groups  


##### Overview 

This parameter defines value sent with Switch OFF command to devices associated in 2nd and 3rd association group.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_32_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 33: S1 DblClick val sent to 2nd and 3rd groups

S1 switch - Double Click value sent to 2nd and 3rd association groups  


##### Overview 

This parameter defines value sent with Double Click command to devices associated in 2nd and 3rd association group.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_33_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 99 |


#### 35: S2 assocs. sent to 4th and 5th group

S2 switch - associations sent to 4th and 5th association groups  


##### Overview 

This parameter determines which actions result in sending commands to devices associated in 4th and 5th association group. All actions are active by default.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_35_1 |
| Data Type        | INTEGER |
| Range | 0 to 15 || Default Value | 0 |
| Options | All actions are active by default (0) |
|  | ignore turning on with 1 click of the switch (1) |
|  | ignore turning off with 1 click of the switch (2) |
|  | ignore holding and releasing the switch (4) |
|  | ignore double click of the switch (8) |


#### 36: S2 ON val sent to 4th and 5th groups

S2 switch - Switch ON value sent to 4th and 5th association groups


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_36_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 36: S2 ON val sent to 4th and 5th groups

S2 switch - Switch ON value sent to 4th and 5th association groups


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_36_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 37: S2 OFF val sent to 4th and 5th groups

S2 switch - Switch OFF value sent to 4th and 5th association groups


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_37_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 38: S2 DblClick val sent to 4th and 5th groups


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_38_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 99 |


#### 40: Reaction to General Alarm

Reaction to General Alarm  


##### Overview 

This parameter determines how the device will react to General Alarm frame.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | alarm frame is ignored (0) |
|  | turn ON after receiving the alarm frame (1) |
|  | turn OFF after receiving the alarm frame (2) |
|  | flash after receiving the alarm frame (3) |


#### 41: Reaction to Flood Alarm

Reaction to Flood Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_41_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | alarm frame is ignored (0) |
|  | turn ON after receiving the alarm frame (1) |
|  | turn OFF after receiving the alarm frame (2) |
|  | flash after receiving the alarm frame (3) |


#### 42: Reaction to CO/CO2/Smoke Alarm

Reaction to CO/CO2/Smoke Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | alarm frame is ignored (0) |
|  | turn ON after receiving the alarm frame (1) |
|  | turn OFF after receiving the alarm frame (2) |
|  | flash after receiving the alarm frame (3) |


#### 43: Reaction to Heat Alarm

Reaction to Heat Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_43_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | alarm frame is ignored (0) |
|  | turn ON after receiving the alarm frame (1) |
|  | turn OFF after receiving the alarm frame (2) |
|  | flash after receiving the alarm frame (3) |


#### 44: Flashing alarm duration

Flashing alarm duration  


##### Overview 

This parameter allows to set duration of flashing alarm mode.

Available settings: 1-32000 (1-32000s, 1s step) - duration

Default setting: 600 (10min)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_44_2 |
| Data Type        | INTEGER |
| Range | 1 to 32000 |
| Default Value | 600 |


#### 50: First channel - power reports

First channel - power reports  


##### Overview 

This parameter determines the minimum change in consumed power that will result in sending new power report to the main controller.

Available settings:

 *  0 - reports are disabled
 *  1-100 (1-100%) - change in power


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_50_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 20 |


#### 51: 1st ch min time between reports

First channel - minimal time between power reports  


##### Overview 

This parameter determines minimum time that has to elapse before sending new power report to the main controller.

Available settings: 

0 - reports are disabled

1-120 (1-120s) - report interval

Default setting: 10 (10s)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_51_1 |
| Data Type        | INTEGER |
| Range | 0 to 120 |
| Default Value | 10 |


#### 53: 1st ch energy reports

First channel - energy reports  


##### Overview 

This parameter determines minimum time that has to elapse before

sending new power report to the main controller.

Available settings:

0 - reports are disabled

1-32000 (0.01 - 320 kWh) - change in energy

Default: 100 (1 KWh)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_53_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 100 |


#### 54: Second channel - power reports

Second channel - power reports  


##### Overview 

This parameter determines the minimum change in consumed power that will result in sending new power report to the main controller.

Available settings:

 *  0 - reports are disabled
 *  1-100 (1-100%) - change in power


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_54_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 20 |


#### 55: 2nd ch min time between reports

Second channel - minimal time between power reports  


##### Overview 

This parameter determines minimum time that has to elapse before sending new power report to the main controller.

Available settings:

0 - periodic reports are disabled

1-120 (1-120s) - report interval

Default setting: 10 (10s)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_55_1 |
| Data Type        | INTEGER |
| Range | 0 to 120 |
| Default Value | 10 |


#### 57: 2nd ch energy reports

Second channel - energy reports  


##### Overview 

This parameter determines the minimum change in consumed energy that will result in sending new energy report to the main controller.

Available settings:

0 - reports are disabled

1-32000 (0.01 - 320 kWh) - change in energy

Default setting: 100 (1 KWh)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_57_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 100 |


#### 58: Periodic power reports

Periodic power reports  


##### Overview 

This parameter determines in what time interval the periodic power reports are sent to the main controller.

Available settings: 

0 - periodic reports are disabled

1-32000 (1-32000s) - report interval

Default setting: 3600 (1h)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_58_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 3600 |


#### 59: Periodic energy reports

Periodic energy reports  


##### Overview 

This parameter determines in what time interval the periodic energy reports are sent to the main controller.

Available settings:

0 - periodic reports are disabled

1-32000 (1-32000s) - report interval

Default setting: 3600 (1h)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_59_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 3600 |


#### 60: Include own energy

Measuring energy consumed by the device itself  


##### Overview 

This parameter determines whether energy metering should include the amount of energy consumed by the device itself. Results are being added to energy reports for first endpoint.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_60_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | function inactive (0) |
|  | function active (1) |


#### 1: Lifeline

reports the device status and allows for assigning single device only (main controller by default).  


##### Overview 

1st association group – “Lifeline” reports the device status and allows for assigning single device only (main controller by default).


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: On/Off (S1)

On/Off (S1) is assigned to switch connected to the S1 terminal (uses Basic command class)  


##### Overview 

2nd association group – “On/Off (S1)” is assigned to switch connected to the S1 terminal (uses Basic command class).


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Dimmer (S1)

“Dimmer (S1)” is assigned to switch connected to the S1 terminal (uses Switch Multilevel command class)  


##### Overview 

“Dimmer (S1)” is assigned to switch connected to the S1 terminal (uses Switch Multilevel command class)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: On/Off (S2)

On/Off (S2) is assigned to switch connected to the S2 terminal (uses Basic command class)  


##### Overview 

On/Off (S2) is assigned to switch connected to the S2 terminal (uses Basic command class)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Dimmer (S2)

Dimmer (S2) is assigned to switch connected to the S2 terminal (uses Switch Multilevel command class)  


##### Overview 

Dimmer (S2) is assigned to switch connected to the S2 terminal (uses Switch Multilevel command class)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/416).
