---
layout: documentation
title: FGPB101 - ZWave
---

{% include base.html %}

# FGPB101 A real push button (switch) available in several colors.

This describes the Z-Wave device *FGPB101*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgpb101_00_000```. 

A real push button (switch) available in several colors.


## Channels
The following table summarises the channels available for the FGPB101 A real push button (switch) available in several colors..

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number |
| Alarm | alarm_general | alarm_general | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the FGPB101 A real push button (switch) available in several colors..
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Scenes sent to the controller | This parameter determines which actions result in sending scene IDs to them. |
| 3: Associations in Z-Wave network Security Mode | This parameter defines how commands are sent in specified association groups |
| 10: Key Pressed 1 time – command sent to 2nd group | Associated in 2nd association group after a single click. |
| 11: Key Pressed 1 time – value of SWITCH ON sent to 2nd group | Value of SWITCH ON command sent to devices in 2nd association group |
| 12: Key Pressed 2 times – command sent to 2nd group | Commands sent to devices associated in 2nd association group |
| 13: Key Pressed 2 times – value of SWITCH ON sent to 2nd group | SWITCH ON command in 2nd association group after double click |
| 14: Key Pressed 3 times – command sent to 2nd group | Commands associated in 2nd association group after a triple click. |
| 15: Key Pressed 3 times – value of SWITCH ON sent to 2nd group | Value of SWITCH ON command sent in 2nd association group after a triple click |
| 20: Key Pressed 1 time – command sent to 3rd group | Ssent to devices associated in 3rd association group after a single click. |
| 21: Key Pressed 1 time – value of SWITCH ON sent to 3rd group | Value of SWITCH ON command sent in 3rd association group after a single click. |
| 22: Key Pressed 2 times – command sent to 3rd group | Sent to associated in 3rd association group after a double click. |
| 23: Key Pressed 2 times – value of SWITCH ON sent to 3rd group | Value of SWITCH ON command sent in 3rd association group after a double click. |
| 24: Key Pressed 3 times – command sent to 3rd group | Sent to devices associated in 3rd association group after a triple click. |
| 25: Key Pressed 3 times – value of SWITCH ON sent to 3rd group | Value SWITCH ON command sent in 3rd association group after a triple click. |
| 29: Key Held Down – command sent to 3rd group | Sent associated in 3rd association group after holding the button down. |
| 30: Alarm frame triggers | Which actions result in sending alarm frames to 4th association group. |
| 1: Lifeline | reports the device status and allows for assigning single device only (main controller by ... |
| 2: On/Off | assigned to clicking the button and is used to turn on/off associated devices |
| 3: Dimmer | is assigned to holding the button and is used to change level of associated devices |
| 4: Alarm | assigned to clicking and/or holding the button (triggers are defined in parameter 30) and ... |


#### 1: Scenes sent to the controller

This parameter determines which actions result in sending scene IDs to them.  


##### Overview 

This parameter determines which actions result in sending scene IDs and attributes assigned to them.

Available settings:

1 - Key Pressed 1 time  
2 - Key Pressed 2 times   
4 - Key Pressed 3 times  
8 - Key Pressed 4 times  
16 - Key Pressed 5 times  
32 - Key Held Down  
64 - Key Released

Values of parameter 1 may be combined, e.g. 1+2=3 means that scenes will be sent after pressing the button once or twice.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 1 to 127 |
| Default Value | 127 |


#### 3: Associations in Z-Wave network Security Mode

This parameter defines how commands are sent in specified association groups  


##### Overview 

This parameter defines how commands are sent in specified association groups: as secure or non-secure. Parameter is active only in Z-Wave network Security Mode. It does not apply to 1st „Lifeline” group.  
  
1 - 2nd group sent as secure  
2 - 3rd group sent as secure  
4 - 4th group sent as secure

Values of parameter 3 may be combined, e.g. 1+2=3 means that 2nd & 3rd group are sent as secure


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 1 to 7 |
| Default Value | 7 |


#### 10: Key Pressed 1 time – command sent to 2nd group

Associated in 2nd association group after a single click.  


##### Overview 

This parameter defines commands sent to devices associated in 2nd association group after a single click.

Available settings:

0 - no action  
1 - SWITCH ON  
2 - SWITCH OFF  
3 - SWITCH ON/OFF – alternately


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 0 to 3 |
| Default Value | 3 |


#### 11: Key Pressed 1 time – value of SWITCH ON sent to 2nd group

Value of SWITCH ON command sent to devices in 2nd association group  


##### Overview 

This parameter defines value of SWITCH ON command sent to devices in 2nd association group after a single click.

Available settings:

1-255 - sent value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 255 |


#### 12: Key Pressed 2 times – command sent to 2nd group

Commands sent to devices associated in 2nd association group  


##### Overview 

This parameter defines commands sent to devices associated in 2nd association group after a double click.

Available settings:

0 - no action  
1 - SWITCH ON  
2 - SWITCH OFF  
3 - SWITCH ON/OFF – alternately


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 0 to 3 |
| Default Value | 1 |


#### 13: Key Pressed 2 times – value of SWITCH ON sent to 2nd group

SWITCH ON command in 2nd association group after double click  


##### Overview 

This parameter defines value of SWITCH ON command sent to devices in 2nd association group after a double click.

Available settings:

1-255 - sent value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 99 |


#### 14: Key Pressed 3 times – command sent to 2nd group

Commands associated in 2nd association group after a triple click.  


##### Overview 

This parameter defines commands sent to devices associated in 2nd association group after a triple click.

Available settings:

0 - no action  
1 - SWITCH ON  
2 - SWITCH OFF  
3 - SWITCH ON/OFF – alternately


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER |
| Range | 0 to 3 |
| Default Value | 0 |


#### 15: Key Pressed 3 times – value of SWITCH ON sent to 2nd group

Value of SWITCH ON command sent in 2nd association group after a triple click  


##### Overview 

This parameter defines value of SWITCH ON command sent to devices in 2nd association group after a triple click.

Available settings:

1-255 - sent value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 255 |


#### 20: Key Pressed 1 time – command sent to 3rd group

Ssent to devices associated in 3rd association group after a single click.  


##### Overview 

This parameter defines commands sent to devices associated in 3rd association group after a single click.

Available settings:

0 - no action  
1 - SWITCH ON  
2 - SWITCH OFF  
3 - SWITCH ON/OFF – alternately


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER |
| Range | 0 to 3 |
| Default Value | 3 |


#### 21: Key Pressed 1 time – value of SWITCH ON sent to 3rd group

Value of SWITCH ON command sent in 3rd association group after a single click.  


##### Overview 

This parameter defines value of SWITCH ON command sent to devices in 3rd association group after a single click.

Available settings:

1-255 - sent value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 255 |


#### 22: Key Pressed 2 times – command sent to 3rd group

Sent to associated in 3rd association group after a double click.  


##### Overview 

This parameter defines commands sent to devices associated in 3rd association group after a double click.

Available settings:

0 - no action  
1 - SWITCH ON  
2 - SWITCH OFF  
3 - SWITCH ON/OFF – alternately


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_22_1 |
| Data Type        | INTEGER |
| Range | 0 to 3 |
| Default Value | 1 |


#### 23: Key Pressed 2 times – value of SWITCH ON sent to 3rd group

Value of SWITCH ON command sent in 3rd association group after a double click.  


##### Overview 

This parameter defines value of SWITCH ON command sent to devices in 3rd association group after a double click.

Available settings:

1-255 - sent value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_23_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 99 |


#### 24: Key Pressed 3 times – command sent to 3rd group

Sent to devices associated in 3rd association group after a triple click.  


##### Overview 

This parameter defines commands sent to devices associated in 3rd association group after a triple click.

Available settings:

0 - no action  
1 - SWITCH ON  
2 - SWITCH OFF  
3 - SWITCH ON/OFF – alternately


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_24_1 |
| Data Type        | INTEGER |
| Range | 0 to 3 |
| Default Value | 0 |


#### 25: Key Pressed 3 times – value of SWITCH ON sent to 3rd group

Value SWITCH ON command sent in 3rd association group after a triple click.  


##### Overview 

This parameter defines value of SWITCH ON command sent to devices in 3rd association group after a triple click.

Available settings:

1-255 - sent value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_25_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 255 |


#### 29: Key Held Down – command sent to 3rd group

Sent associated in 3rd association group after holding the button down.  


##### Overview 

This parameter defines commands sent to devices associated in 3rd association group after holding the button down.

Available settings:

0 - no action  
1 - START LEVEL CHANGE UP (brightening)  
2 - START LEVEL CHANGE DOWN (dimming)  
3 - START LEVEL CHANGE UP/DOWN (brightening/dimming) – alternately


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_29_1 |
| Data Type        | INTEGER |
| Range | 0 to 3 |
| Default Value | 3 |


#### 30: Alarm frame triggers

Which actions result in sending alarm frames to 4th association group.  


##### Overview 

Parameter determines which actions result in sending alarm frames to 4th association group.

Available settings:

1 - Key Pressed 1 time  
2 - Key Pressed 2 times  
4 - Key Pressed 3 times  
8 - Key Pressed 4 times  
16 - Key Pressed 5 times  
32 - Key Held Down  
64 - Key Released

Values of parameter 30 may be combined, e.g. 1+2=3 means that alarm frames will be sent after pressing the button once or twice.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER |
| Range | 1 to 127 |
| Default Value | 127 |


#### 1: Lifeline

reports the device status and allows for assigning single device only (main controller by default)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: On/Off

assigned to clicking the button and is used to turn on/off associated devices


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Dimmer

is assigned to holding the button and is used to change level of associated devices


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Alarm

assigned to clicking and/or holding the button (triggers are defined in parameter 30) and is used to send alarm frames to associated devices


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/436).
