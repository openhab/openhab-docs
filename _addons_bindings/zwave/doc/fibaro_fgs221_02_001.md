---
layout: documentation
title: FGS221 - ZWave
---

{% include base.html %}

# FGS221 Double Relay Switch 2x1.5kW

This describes the Z-Wave device *FGS221*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgs221_02_001```. 

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
| 1: Activate / deactivate functions ALL ON / ALL OFF | Activate / deactivate functions ALL ON / ALL OFF |
| 3: Auto off relay after specified time | Auto off relay after specified time |
| 4: Auto off for relay 1 | Time period for auto off, in miliseconds 0 - Auto off disabled |
| 5: Auto off for relay 2 | Time period for auto off, in miliseconds 0 - Auto off disabled |
| 6: Sending commands to group 1 devices | Sending commands to group 1 devices |
| 7: Sending commands to group 2 devices | Sending commands to group 2 devices |
| 13: Assigns bistable key status to the device status | Assigns bistable key status to the device status |
| 14: Switch type connector | Switch type connector, you may choose between momentary and toggle switches |
| 15: Operation of the Dimmer and Roller Shutter Controller | Operation of the Dimmer and Roller Shutter Controller |
| 16: Saving the state of the device after a power failure | Fibaro Switch returns to the last position saved before a power failure |
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


#### 1: Activate / deactivate functions ALL ON / ALL OFF

Activate / deactivate functions ALL ON / ALL OFF


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALL ON is not active ALL OFF is not active (0) |
|  | ALL ON is not active ALL OFF active (1) |
|  | ALL ON active ALL OFF is not active (2) |
|  | ALL ON active, ALL OFF active (255) |


#### 3: Auto off relay after specified time

Auto off relay after specified time  


##### Overview 

Auto off relay after specified time, with the possibility of manual override - immediate Off after button push.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Manual override disabled (0) |
|  | Manual override enabled. (1) |


#### 4: Auto off for relay 1

Time period for auto off, in miliseconds 0 - Auto off disabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 5: Auto off for relay 2

Time period for auto off, in miliseconds 0 - Auto off disabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 6: Sending commands to group 1 devices

Sending commands to group 1 devices  


##### Overview 

Sending commands to control devices assigned to 1-st association group (key no. 1)  
NOTE: Parameter 15 value must be set to 1 to work properly. This activates the double-click functionality - dimmer/roller shutter control


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Commands are sent when device is turned on and off (0) |
|  | Commands sent when device off with memorized state (1) |
|  | Commands are sent when device is turned off (2) |


#### 7: Sending commands to group 2 devices

Sending commands to group 2 devices  


##### Overview 

Sending commands to control devices assigned to 2-nd association group (key no. 2).  

Info: Parameter 15 must be set to 1 to make this parameter work properly. This activates the double-click functionality - dimmer/roller shutter control.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Commands are sent when device is turned on and off (0) |
|  | Commands sent when device off with memorized state (1) |
|  | Commands are sent when device is turned off (2) |


#### 13: Assigns bistable key status to the device status

Assigns bistable key status to the device status  


##### Overview 

Info: Remote control from Fibaro System Is Still Possible. This function is useful When you want display status of external devices, e.g. Motion Sensor, in Fibaro System.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | [On / Off] device changes status on key status change (0) |
|  | Device status depends on key status (1) |


#### 14: Switch type connector

Switch type connector, you may choose between momentary and toggle switches


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Momentary switch (0) |
|  | Toggle switch (1) |


#### 15: Operation of the Dimmer and Roller Shutter Controller

Operation of the Dimmer and Roller Shutter Controller  


##### Overview 

Operation of the Dimmer and Roller Shutter Controller - enabling this option allows the user to dim lighting/shut roller by associating dimmer/Roller Shutter Controller and holding or double press of double switch (only mono-stable switch).  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Dimmer/Roller Shutter Controller control is not active (0) |
|  | Dimmer/Roller Shutter Controller control is active (1) |


#### 16: Saving the state of the device after a power failure

Fibaro Switch returns to the last position saved before a power failure  


##### Overview 

Options for changing the parameter 0-1


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_16_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Fibaro Switch does not save the state after a power failure (0) |
|  | Fibaro Switch saves its state before power failure (1) |


#### 30: Relay 1: Response to General Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | Alarm deactivation relay 1 (0) |
|  | Alarm relay 1 on (1) |
|  | Alarm Relay 1 off (2) |
|  | Alarm relay 1 flashing (3) |


#### 31: Relay 1: Response to Water Flood Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_31_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | Alarm deactivation relay 1 (0) |
|  | Alarm relay 1 on (1) |
|  | Alarm relay 1 off (2) |
|  | Alarm relay 1 flashing (3) |


#### 32: Relay 1: Response to Smoke, CO, CO2 Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_32_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | Alarm deactivation relay 1 (0) |
|  | Alarm relay 1 on (1) |
|  | Alarm relay 1 off (2) |
|  | Alarm relay 1 flashing (3) |


#### 33: Relay 1: Response to Temperature Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_33_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Alarm deactivation relay 1 (0) |
|  | Alarm relay 1 on (1) |
|  | Alarm relay 1 off (2) |
|  | Alarm relay 1 flashing (3) |


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
| Options | Alarm deactivation relay 2 (0) |
|  | Alarm relay 2 on (1) |
|  | Alarm relay 2 off (2) |
|  | Alarm relay 2 flashing (3) |


#### 41: Relay 2: Response to Water Flood Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_41_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | Alarm deactivation relay 2 (0) |
|  | Alarm relay 2 on (1) |
|  | Alarm relay 2 off (2) |
|  | Alarm relay 2 flashing (3) |


#### 42: Relay 2: Response to Smoke, CO, CO2 Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | Alarm deactivation relay 2 (0) |
|  | Alarm relay 2 on (1) |
|  | Alarm relay 2 off (2) |
|  | Alarm relay 2 flashing (3) |


#### 43: Relay 2: Response to Temperature Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_43_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Alarm deactivation relay 2 (0) |
|  | Alarm relay 2 on (1) |
|  | Alarm relay 2 off (2) |
|  | Alarm relay 2 flashing (3) |


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
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/123).
