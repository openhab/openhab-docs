---
layout: documentation
title: FGS221 - ZWave
---

{% include base.html %}

# FGS221 Double Relay Switch 2x1.5kW

This describes the Z-Wave device *FGS221*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgs221_01_004```. 

Double Relay Switch 2x1.5kW


## Channels
The following table summarises the channels available for the FGS221 Double Relay Switch 2x1.5kW.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch |
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the FGS221 Double Relay Switch 2x1.5kW.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Enable/Disable ALL ON/OFF | Activate/Deactive ALL ON/OFF |
| 3: Enable/Disable OFF-delay | Activate/Deactivate Automatic turning off relay after set time |
| 4: Relay 1: OFF-delay time (10ms steps) | Automatic turning off relay 1 after set time, in 10ms increments (default: 200ms) |
| 5: Relay 2: OFF-delay time (10ms steps) | Automatic turning off relay 2 after set time, in 10ms increments (default: 200ms) |
| 6: Separation of association sending (key 1) | Activate/Deactivate association sending for group 1 - activate param \#15 for this to work |
| 7: Separation of association sending (key 2) | Activate/Deactivate association sending for group 2 - activate param \#15 for this to work |
| 13: Inputs behaviour | In case of bi-stable switches, define their behaviour (toggle or follow) |
| 14: Inputs Button/Switch configuration | Binary inputs type configuration |
| 15: Dimmer/Roller shutter control | Enable/Disable operation of dimmer or roller shutter devices associated to group 1. Availa... |
| 16: Saving state before power failure | Saving state before power failure |
| 30: Relay 1: Response to General Alarm |  |
| 31: Relay 1: Response to Water Flood Alarm |  |
| 32: Relay 1: Response to Smoke, CO, CO2 Alarm |  |
| 33: Relay 1: Response to Temperature Alarm |  |
| 39: ALARM FLASHING alarm time | Amount of time (ms) the device keeps on flashing after receipt of Alarm Frame |
| 40: Relay 2: Response to General Alarm |  |
| 41: Relay 2: Response to Water Flood Alarm |  |
| 42: Relay 2: Response to Smoke, CO, CO2 Alarm |  |
| 43: Relay 2: Response to Temperature Alarm |  |
| 1: Switch 1 |  |
| 2: Switch 2 |  |
| 3: Controller Updates |  |


#### 1: Enable/Disable ALL ON/OFF

Activate/Deactive ALL ON/OFF


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALL ON disabled/ ALL OFF disabled (0) |
|  | ALL ON disabled/ ALL OFF active (1) |
|  | ALL ON active / ALL OFF disabled (2) |
|  | ALL ON active / ALL OFF active (255) |


#### 3: Enable/Disable OFF-delay

Activate/Deactivate Automatic turning off relay after set time


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Auto OFF disabled for both relays (0) |
|  | Auto OFF active only for relay 1 (1) |
|  | Auto OFF active only for relay 2 (2) |
|  | Auto OFF active for both relays (3) |


#### 4: Relay 1: OFF-delay time (10ms steps)

Automatic turning off relay 1 after set time, in 10ms increments (default: 200ms)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 20 |


#### 5: Relay 2: OFF-delay time (10ms steps)

Automatic turning off relay 2 after set time, in 10ms increments (default: 200ms)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 20 |


#### 6: Separation of association sending (key 1)

Activate/Deactivate association sending for group 1 - activate param \#15 for this to work


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Map status to all devices in group 1 (0) |
|  | Map OFF status to all devices in group 1, double click on key 1 will s (1) |
|  | Map OFF status to all devices in group 1, double click on key 1 will s (2) |


#### 7: Separation of association sending (key 2)

Activate/Deactivate association sending for group 2 - activate param \#15 for this to work


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Map status to all devices in group 2 (0) |
|  | Map OFF status to all devices in group 2, double click on key 2 will s (1) |
|  | Map OFF status to all devices in group 2, double click on key 2 will s (2) |


#### 13: Inputs behaviour

In case of bi-stable switches, define their behaviour (toggle or follow)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Toggle (0) |
|  | Follow switch contact (closed&#x3D;ON, open&#x3D;OFF) (1) |


#### 14: Inputs Button/Switch configuration

Binary inputs type configuration


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Mono-stable input (button) (0) |
|  | Bi-stable input (switch) (1) |


#### 15: Dimmer/Roller shutter control

Enable/Disable operation of dimmer or roller shutter devices associated to group 1. Available only when using mono-stable inputs (buttons) - Hold button 1 or double-tap for operation


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable Dimmer/Roller shutter control (0) |
|  | Enable Dimmer/Roller shutter control (1) |


#### 16: Saving state before power failure

Saving state before power failure


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_16_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | State NOT saved at power failure, all outputs are set to OFF upon powe (0) |
|  | State saved at power failure, all outputs are set to previous state up (1) |


#### 30: Relay 1: Response to General Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | DEACTIVATION - no response to alarm frames (0) |
|  | ALARM RELAY ON - relay will turn ON upon receipt of alarm frame (1) |
|  | ALARM RELAY OFF - relay will turn OFF upon receipt of alarm frame (2) |
|  | ALARM FLASHING - relay will turn ON and OFF periodically (see param.39 (3) |


#### 31: Relay 1: Response to Water Flood Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_31_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | DEACTIVATION - no response to alarm frames (0) |
|  | ALARM RELAY ON - relay will turn ON upon receipt of alarm frame (1) |
|  | ALARM RELAY OFF - relay will turn OFF upon receipt of alarm frame (2) |
|  | ALARM FLASHING - relay will turn ON and OFF periodically (see param.39 (3) |


#### 32: Relay 1: Response to Smoke, CO, CO2 Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_32_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | DEACTIVATION - no response to alarm frames (0) |
|  | ALARM RELAY ON - relay will turn ON upon receipt of alarm frame (1) |
|  | ALARM RELAY OFF - relay will turn OFF upon receipt of alarm frame (2) |
|  | ALARM FLASHING - relay will turn ON and OFF periodically (see param.39 (3) |


#### 33: Relay 1: Response to Temperature Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_33_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | DEACTIVATION - no response to alarm frames (0) |
|  | ALARM RELAY ON - relay will turn ON upon receipt of alarm frame (1) |
|  | ALARM RELAY OFF - relay will turn OFF upon receipt of alarm frame (2) |
|  | ALARM FLASHING - relay will turn ON and OFF periodically (see param.39 (3) |


#### 39: ALARM FLASHING alarm time

Amount of time (ms) the device keeps on flashing after receipt of Alarm Frame


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_39_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 600 |


#### 40: Relay 2: Response to General Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | DEACTIVATION - no response to alarm frames (0) |
|  | ALARM RELAY ON - relay will turn ON upon receipt of alarm frame (1) |
|  | ALARM RELAY OFF - relay will turn OFF upon receipt of alarm frame (2) |
|  | ALARM FLASHING - relay will turn ON and OFF periodically (see param.39 (3) |


#### 41: Relay 2: Response to Water Flood Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_41_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | DEACTIVATION - no response to alarm frames (0) |
|  | ALARM RELAY ON - relay will turn ON upon receipt of alarm frame (1) |
|  | ALARM RELAY OFF - relay will turn OFF upon receipt of alarm frame (2) |
|  | ALARM FLASHING - relay will turn ON and OFF periodically (see param.39 (3) |


#### 42: Relay 2: Response to Smoke, CO, CO2 Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | Deactivated (0) |
|  | Alarm Relay On (1) |
|  | Alarm Relay Off (2) |
|  | Alarm Flashing (3) |


#### 43: Relay 2: Response to Temperature Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_43_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | DEACTIVATION - no response to alarm frames (0) |
|  | ALARM RELAY ON - relay will turn ON upon receipt of alarm frame (1) |
|  | ALARM RELAY OFF - relay will turn OFF upon receipt of alarm frame (2) |
|  | ALARM FLASHING - relay will turn ON and OFF periodically (see param.39 (3) |


#### 1: Switch 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Switch 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Controller Updates


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/121).
