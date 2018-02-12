---
layout: documentation
title: ZMNHUD - ZWave
---

{% include base.html %}

# ZMNHUD Flush pilot (DIN version)

This describes the Z-Wave device *ZMNHUD*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhud_00_000```. 

Flush pilot (DIN version)


## Channels
The following table summarises the channels available for the ZMNHUD Flush pilot (DIN version).

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |


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
The following table provides a summary of the configuration parameters available in the ZMNHUD Flush pilot (DIN version).
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Input 1 switch type |  |
| 2: Input 2 switch type |  |
| 3: Input 3 switch type |  |
| 4: Input 1 contact type |  |
| 5: Input 2 contact type |  |
| 6: Input 3 contact type |  |
| 11: Input 1 operation mode selection |  |
| 12: Input 2 operation mode selection |  |
| 13: Input 3 operation mode selection |  |
| 30: Saving the state of the device after a power failure |  |
| 1: Lifeline group | Reserved for communication with the main controller |
| 2: Multilevel | Triggered at changes of state/value of the Flush pilot wire |
| 3: Basic on/off | Triggered at change of the input I1 state and reflecting its state |
| 4: Basic on/off | Triggered at change of the input I2 state and reflecting its state |
| 5: Basic on/off | Triggered at change of the input I3 state and reflecting its state |


#### 1: Input 1 switch type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | mono-stable switch type (push button) (0) |
|  | bi-stable switch type (1) |


#### 2: Input 2 switch type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | mono-stable switch type (push button) (0) |
|  | bi-stable switch type (1) |


#### 3: Input 3 switch type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | mono-stable switch type (push button) (0) |
|  | bi-stable switch type (1) |


#### 4: Input 1 contact type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | NO (normally open) input type (0) |
|  | NC (normally close) input type (1) |


#### 5: Input 2 contact type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | NO (normally open) input type (0) |
|  | NC (normally close) input type (1) |


#### 6: Input 3 contact type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | NO (normally open) input type (0) |
|  | NC (normally close) input type (1) |


#### 11: Input 1 operation mode selection


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Button does not influence on selected mode (0) |
|  | Comfort (1) |
|  | Comfort-1°C (2) |
|  | Comfort-2°C (3) |
|  | Eco Mode (4) |
|  | Frost Protection (5) |
|  | Stop (6) |


#### 12: Input 2 operation mode selection


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER || Default Value | 4 |
| Options | Button does not influence on selected mode (0) |
|  | Comfort (1) |
|  | Comfort-1°C (2) |
|  | Comfort-2°C (3) |
|  | Eco Mode (4) |
|  | Frost Protection (5) |
|  | Stop (6) |


#### 13: Input 3 operation mode selection


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER || Default Value | 5 |
| Options | Button does not influence on selected mode (0) |
|  | Comfort (1) |
|  | Comfort-1°C (2) |
|  | Comfort-2°C (3) |
|  | Eco Mode (4) |
|  | Frost Protection (5) |
|  | Stop (6) |


#### 30: Saving the state of the device after a power failure


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | The module saves its state before power failure (0) |
|  | The module does not save the state (1) |


#### 1: Lifeline group

Reserved for communication with the main controller


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Multilevel

Triggered at changes of state/value of the Flush pilot wire


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Basic on/off

Triggered at change of the input I1 state and reflecting its state


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Basic on/off

Triggered at change of the input I2 state and reflecting its state


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Basic on/off

Triggered at change of the input I3 state and reflecting its state


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/715).
