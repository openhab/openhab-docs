---
layout: documentation
title: FGS213 - ZWave
---

{% include base.html %}

# FGS213 Single Switch 2

This describes the Z-Wave device *FGS213*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgs213_00_000```. 

Single Switch 2  


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
 *  FIBARO Switch 2 is an extension unit

  


### Inclusion Information 

Put controller into inclusion mode and triple click S1 switch

  


### Exclusion Information 

Put controller into exclusion mode and triple click S1 switch


## Channels
The following table summarises the channels available for the FGS213 Single Switch 2.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Sensor (power) | sensor_power | sensor_power | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Reset the total power consumption | meter_reset | meter_reset | Energy | Switch |
| Scene Number | scene_number | scene_number |  | Number |
| Alarm (heat) | alarm_heat | alarm_heat |  | Switch |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch |
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number |
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number |
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the FGS213 Single Switch 2.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 9: Restore state after power failure | Restore state after power failure |
| 10: First channel operating mode | First channel - operating mode |
| 11: 1st ch. reaction to switch | First channel - reaction to switch for delay/auto ON/OFF modes |
| 12: time parameter for delay/auto ON/OFF modes | First channel - time parameter for delay/auto ON/OFF modes |
| 13: 1st ch. pulse time for flashing mode | First channel - pulse time for flashing mode |
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
| 50: Active power reports | The parameter defines the power level change that will result in a new power report being ... |
| 51: Minimal time between power report | This parameter determines minimum time that has to elapse before sending new power report ... |
| 53: Energy reports | Energy level change which will result in sending a new energy report. Available settings: ... |
| 58: Periodic power reports | This parameter determines in what time interval the periodic power reports are sent to the... |
| 59: Periodic energy reports | This parameter determines in what time interval the periodic energy reports are sent to th... |
| 60: Measuring energy consumed by the device itself | This parameter determines whether energy metering should include the amount of energy cons... |
| 1: Lifeline | Status |
| 2: Switch 1 | Switch 1 On/Off |
| 3: Dimmer 1 | Dimmer for Switch 1 |
| 4: Switch 2 | Switch 2 On/Off |
| 5: Dimmer 2 | Dimmer for Switch 2 |


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

This parameter determines which actions result in sending scene IDs assigned to them


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


#### 50: Active power reports

The parameter defines the power level change that will result in a new power report being sent. The value is a percentage of the previous report. 0 disables the function.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_50_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 20 |


#### 51: Minimal time between power report

This parameter determines minimum time that has to elapse before sending new power report to the main controller. 0 disables the function. 1-120s - report interval in seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_51_1 |
| Data Type        | INTEGER |
| Range | 0 to 120 |
| Default Value | 10 |


#### 53: Energy reports

Energy level change which will result in sending a new energy report. Available settings: 1-32000 (0.01 - 320 kWh). 0 disables the function.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_53_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 100 |


#### 58: Periodic power reports

This parameter determines in what time interval the periodic power reports are sent to the main controller. 0 - periodic reports are disabled, 1-32000 (1-32000s) - report interval


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_58_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 3600 |


#### 59: Periodic energy reports

This parameter determines in what time interval the periodic energy reports are sent to the main controller. 0 - periodic reports are disabled 1-32000 (1-32000s) - report interval


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_59_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 3600 |


#### 60: Measuring energy consumed by the device itself

This parameter determines whether energy metering should include the amount of energy consumed by the device itself. Results are be - ing added to energy reports for first endpoint. 0: Function deactivated 1: Function activated


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_60_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Self-measurement inactive (0) |
|  | Self-measurement active (1) |


#### 1: Lifeline

Status  


##### Overview 

Reports the device status and allows


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Switch 1

Switch 1 On/Off  


##### Overview 

This is assigned to the switch connected to the S1 terminal (uses Basic command class).


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Dimmer 1

Dimmer for Switch 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Switch 2

Switch 2 On/Off  


##### Overview 

This is assigned to the switch connected to the S2 terminal (uses Basic command class).


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Dimmer 2

Dimmer for Switch 2  


##### Overview 

This is assigned to the switch connected to the S2 terminal (uses Switch Multilevel command class).


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/423).
