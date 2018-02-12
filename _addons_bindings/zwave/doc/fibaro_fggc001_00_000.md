---
layout: documentation
title: FGGC001 - ZWave
---

{% include base.html %}

# FGGC001 Fibaro Swipe Scene Controller

This describes the Z-Wave device *FGGC001*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fggc001_00_000```. 

Fibaro Swipe Scene Controller


## Channels
The following table summarises the channels available for the FGGC001 Fibaro Swipe Scene Controller.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the FGGC001 Fibaro Swipe Scene Controller.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Device Orientation | Parameter determines orientation of the Swipe in relation to its default position. |
| 2: Buzzer - acoustic signal settings | Acoustic signalling of gestures detection. |
| 3: LED diode - visual indicator settings | Visual indication of gestures detection |
| 4: Buzzer - signalling result of gesture recognition | Acoustic signalling of gesture recognition result (using the built-in buzzer). |
| 5: Powering mode - interval of updating the current mode | This parameter determines how often the device checks if the USB power supply is connected... |
| 6: Power saving mode (battery mode) | This parameter determines operation of gesture detection when battery powered. |
| 7: Hold gesture to enter the menu | This parameter allows to choose if the menu can be entered using the Hold gesture. |
| 10: Scenes sent to the controller | Defines which actions result in sending scenes to 1st “Lifeline” group. |
| 11: Associations in Z-Wave network security mode | Parameter defines how commands are sent in specified association groups: as secure or non-... |
| 12: Control mode of 2nd - 5th &quot;Flick UP/DOWN/LEFT/RIGHT” association groups and scenes | Parameter allows to choose control mode for 2nd-5th groups and scenes. |
| 13: Rate of smooth level control | Parameter allows to choose how long the hand has to be held near the center of the pad aft... |
| 20: SWITCH ON control frame value for FLICK UP gesture | This parameter allows to set value sent in SWITCH ON command frame to the association grou... |
| 21: SWITCH OFF control frame value for FLICK UP gesture | This parameter allows to set value sent in SWITCH OFF command frame to the association gro... |
| 22: SWITCH ON control frame value for FLICK DOWN gesture | This parameter allows to set value sent in SWITCH ON command frame to the association grou... |
| 23: SWITCH OFF control frame value for FLICK DOWN gesture | This parameter allows to set value sent in SWITCH OFF command frame to the association gro... |
| 24: SWITCH ON control frame value for FLICK LEFT gesture | This parameter allows to set value sent in SWITCH ON command frame to the association grou... |
| 25: SWITCH OFF control frame value for FLICK LEFT gesture | This parameter allows to set value sent in SWITCH OFF command frame to the association gro... |
| 26: SWITCH ON control frame value for FLICK RIGHT gesture | This parameter allows to set value sent in SWITCH ON command frame to the association grou... |
| 27: SWITCH OFF control frame value for FLICK RIGHT gesture | This parameter allows to set value sent in SWITCH OFF command frame to the association gro... |
| 30: Sequence learning mode | Parameter activated by the main Z-Wave controller. Change its value to launch sequence lea... |
| 31: 1st gestures sequence (SLOT 1) | Value containing sequence of gestures. |
| 32: 2nd gestures sequence (SLOT 2) | Value containing sequence of gestures. |
| 33: 3rd gestures sequence (SLOT 3) | Value containing sequence of gestures. |
| 34: 4th gestures sequence (SLOT 4) | Value containing sequence of gestures. |
| 35: 5th gestures sequence (SLOT 5) | Value containing sequence of gestures. |
| 36: 6th gestures sequence (SLOT 6) | Value containing sequence of gestures. |
| 1: Lifeline |  |
| 2: Flick up gesture |  |
| 3: Flick down gesture |  |
| 4: Flick left gesture |  |
| 5: Flick right gesture |  |
| 6: Circular Airwheel |  |


#### 1: Device Orientation

Parameter determines orientation of the Swipe in relation to its default position.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Default Orientation (0) |
|  | 180° rotation (1) |
|  | 90° clockwise rotation (2) |
|  | 90° counter-clockwise rotation (3) |


#### 2: Buzzer - acoustic signal settings

Acoustic signalling of gestures detection.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Gestures detection is not signalled (0) |
|  | Gestures detection is signalled (1) |


#### 3: LED diode - visual indicator settings

Visual indication of gestures detection


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Gestures detection is not indicated (0) |
|  | Gestures detection is indicated (1) |


#### 4: Buzzer - signalling result of gesture recognition

Acoustic signalling of gesture recognition result (using the built-in buzzer).  


##### Overview 

Parameter 4 is relevant only if parameter 2 is set to 1.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | Only successful recognition is signalled (1) |
|  | Only failed recognition is signalled (2) |
|  | Successful and failed recognition is signalled (3) |


#### 5: Powering mode - interval of updating the current mode

This parameter determines how often the device checks if the USB power supply is connected and updates powering mode if needed.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_2 |
| Data Type        | INTEGER |
| Range | 0 to 1080 || Default Value | 4 |
| Options | Powering mode is not updated (0) |
|  | Time interval (in minutes) (1) |


#### 6: Power saving mode (battery mode)

This parameter determines operation of gesture detection when battery powered.  


##### Overview 

When Standby Mode is selected, hold gesture must be performed to exit power saving mode and reactivate normal gesture recognition. The device in Standby Mode consumes the least battery life.

When Simple Mode mode is selected, gesture recognition is always active, but only slowly performed gestures will be recognized properly (high battery consumption).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Standby mode (0) |
|  | Simple mode (1) |
|  | Swipe does not enter power saving mode (2) |


#### 7: Hold gesture to enter the menu

This parameter allows to choose if the menu can be entered using the Hold gesture.  


##### Overview 

After disabling the Hold gesture in parameter 7, menu can be entered by using the B-button only!


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Hold gesture to enter the menu enabled (0) |
|  | Hold gesture to enter the menu disabled (1) |


#### 10: Scenes sent to the controller

Defines which actions result in sending scenes to 1st “Lifeline” group.  


##### Overview 

Parameter 10 values may be combined, e.g. 1+2=3 means that scenes for flick UP and DOWN are enabled.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 1 to 63 || Default Value | 15 |
| Options | Scenes for flick UP gesture enabled (1) |
|  | Scenes for flick DOWN gesture enabled (2) |
|  | Scenes for flick LEFT gesture enabled (4) |
|  | Scenes for flick RIGHT gesture enabled (8) |
|  | Scenes for clockwise circular gesture enabled (16) |
|  | Scenes for counter-clockwise circular gesture enabled (32) |
|  | All commands enabled (63) |


#### 11: Associations in Z-Wave network security mode

Parameter defines how commands are sent in specified association groups: as secure or non-secure. Parameter is active only in Z-Wave network security mode. It does not apply to 1st “Lifeline” association group.  


##### Overview 

Parameter 11 values may be combined, e.g. 1+2=3 means that 2nd & 3rd group are sent as secure.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER |
| Range | 1 to 31 || Default Value | 31 |
| Options | 2nd group ”Flick UP” sent as secure (1) |
|  | 3rd group ”Flick DOWN” sent as secure (2) |
|  | 4th group &quot;Flick LEFT” sent as secure (4) |
|  | 5th group &quot;Flick RIGHT” sent as secure (8) |
|  | 6th group &quot;Circular AirWheel” sent as secure (16) |


#### 12: Control mode of 2nd - 5th &quot;Flick UP/DOWN/LEFT/RIGHT” association groups and scenes

Parameter allows to choose control mode for 2nd-5th groups and scenes.  


##### Overview 

By default, Toggle Mode is active, meaning that a single flick turns ON the group and the same flick turns it OFF, doubled flicks are inactive.

After disabling Toggle Mode a single flick will turn the device ON and the same flick doubled will turn it OFF.

Parameter 12 values may be combined, e.g. 1+2=3 means that 2nd & 3rd group are selected.

**N.B. Disabling Toggle Mode will introduce delay when performing single gestures.**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 1 to 15 || Default Value | 15 |
| Options | Toggle Mode enabled for 2nd association group (1) |
|  | Toggle Mode enabled for 3rd association group (2) |
|  | Toggle Mode enabled for 4th association group (4) |
|  | Toggle Mode enabled for 5th association group (8) |


#### 13: Rate of smooth level control

Parameter allows to choose how long the hand has to be held near the center of the pad after "AirWheel" gesture for the associated devices to reach their maximum/minimum level.  


##### Overview 

Available settings:

0-10 - duration in seconds

255 - default settings of controlled devices


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 20: SWITCH ON control frame value for FLICK UP gesture

This parameter allows to set value sent in SWITCH ON command frame to the association group.  


##### Overview 

Commands sent to association group for turn ON/OFF can be adjusted in parameters 20-27.

0 - turning off associated devices

1-99 - forcing level of associated devices

255 - setting associated devices to the last remembered state or turning them on


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 21: SWITCH OFF control frame value for FLICK UP gesture

This parameter allows to set value sent in SWITCH OFF command frame to the association group.  


##### Overview 

Commands sent to association group for turn ON/OFF can be adjusted in parameters 20-27.

0 - turning off associated devices

1-99 - forcing level of associated devices

255 - setting associated devices to the last remembered state or turning them on


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 22: SWITCH ON control frame value for FLICK DOWN gesture

This parameter allows to set value sent in SWITCH ON command frame to the association group.  


##### Overview 

Commands sent to association group for turn ON/OFF can be adjusted in parameters 20-27.

0 - turning off associated devices

1-99 - forcing level of associated devices

255 - setting associated devices to the last remembered state or turning them on


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_22_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 23: SWITCH OFF control frame value for FLICK DOWN gesture

This parameter allows to set value sent in SWITCH OFF command frame to the association group.  


##### Overview 

Commands sent to association group for turn ON/OFF can be adjusted in parameters 20-27.

0 - turning off associated devices

1-99 - forcing level of associated devices

255 - setting associated devices to the last remembered state or turning them on


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_23_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 24: SWITCH ON control frame value for FLICK LEFT gesture

This parameter allows to set value sent in SWITCH ON command frame to the association group.  


##### Overview 

Commands sent to association group for turn ON/OFF can be adjusted in parameters 20-27.

0 - turning off associated devices

1-99 - forcing level of associated devices

255 - setting associated devices to the last remembered state or turning them on


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_24_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 25: SWITCH OFF control frame value for FLICK LEFT gesture

This parameter allows to set value sent in SWITCH OFF command frame to the association group.  


##### Overview 

Commands sent to association group for turn ON/OFF can be adjusted in parameters 20-27.

0 - turning off associated devices

1-99 - forcing level of associated devices

255 - setting associated devices to the last remembered state or turning them on


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_25_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 26: SWITCH ON control frame value for FLICK RIGHT gesture

This parameter allows to set value sent in SWITCH ON command frame to the association group.  


##### Overview 

Commands sent to association group for turn ON/OFF can be adjusted in parameters 20-27.

0 - turning off associated devices

1-99 - forcing level of associated devices

255 - setting associated devices to the last remembered state or turning them on


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_26_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 27: SWITCH OFF control frame value for FLICK RIGHT gesture

This parameter allows to set value sent in SWITCH OFF command frame to the association group.  


##### Overview 

Commands sent to association group for turn ON/OFF can be adjusted in parameters 20-27.

0 - turning off associated devices

1-99 - forcing level of associated devices

255 - setting associated devices to the last remembered state or turning them on


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_27_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 30: Sequence learning mode

Parameter activated by the main Z-Wave controller. Change its value to launch sequence learning procedure for the desired slot.  


##### Overview 

0 - learning mode disabled

1-6 - launch sequence learning for selected slot

**N.B. Sequences do not allow to use same gestures next to each other**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER |
| Range | 0 to 6 |
| Default Value | 0 |


#### 31: 1st gestures sequence (SLOT 1)

Value containing sequence of gestures.  


##### Overview 

User can create sequences of two or three gestures to expand number of possible actions. Every sequence is saved in its advanced parameter (no. 31-36) with 16 bits, every basic gesture is identified with 4 bits.

Gesture Value Empty 0 ^ 1 v 2 < 3 > 4

######## Rules of creating sequences: 

• Maximum of six sequences can be created.

• Each sequence must be unique.

• Sequence can consist of two or three basic gestures (left, right, up

or down).

• Two identical gestures cannot be used next to each other

To manually create or edit a sequence slot:

1. Calculate new value of parameter using table and formula:

Value of parameter = 256 \* Value of first gesture + 16 \* Value of second gesture + Value of third gesture

2. Change the value of corresponding parameter (parameters 31 to 36 for slots 1 to 6).

**N.B. Setting parameter to 0 will delete the sequence.**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_31_2 |
| Data Type        | INTEGER |
| Range | 0 to 1076 |
| Default Value | 0 |


#### 32: 2nd gestures sequence (SLOT 2)

Value containing sequence of gestures.  


##### Overview 

User can create sequences of two or three gestures to expand number of possible actions. Every sequence is saved in its advanced parameter (no. 31-36) with 16 bits, every basic gesture is identified with 4 bits.

Gesture Value

Empty 0

^ 1

v 2

< 3

> 4

Rules of creating sequences:

• Maximum of six sequences can be created.

• Each sequence must be unique.

• Sequence can consist of two or three basic gestures (left, right, up

or down).

• Two identical gestures cannot be used next to each other

To manually create or edit a sequence slot:

1. Calculate new value of parameter using table and formula:

Value of parameter = 256 \* Value of first gesture + 16 \* Value of second gesture + Value of third gesture

2. Change the value of corresponding parameter (parameters 31 to 36 for slots 1 to 6).

**N.B. Setting parameter to 0 will delete the sequence.**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_32_2 |
| Data Type        | INTEGER |
| Range | 0 to 1076 |
| Default Value | 0 |


#### 33: 3rd gestures sequence (SLOT 3)

Value containing sequence of gestures.  


##### Overview 

User can create sequences of two or three gestures to expand number of possible actions. Every sequence is saved in its advanced parameter (no. 31-36) with 16 bits, every basic gesture is identified with 4 bits.

Gesture Value

Empty 0

^ 1

v 2

< 3

> 4

Rules of creating sequences:

• Maximum of six sequences can be created.

• Each sequence must be unique.

• Sequence can consist of two or three basic gestures (left, right, up

or down).

• Two identical gestures cannot be used next to each other

To manually create or edit a sequence slot:

1. Calculate new value of parameter using table and formula:

Value of parameter = 256 \* Value of first gesture + 16 \* Value of second gesture + Value of third gesture

2. Change the value of corresponding parameter (parameters 31 to 36 for slots 1 to 6).

**N.B. Setting parameter to 0 will delete the sequence.**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_33_2 |
| Data Type        | INTEGER |
| Range | 0 to 1076 |
| Default Value | 0 |


#### 34: 4th gestures sequence (SLOT 4)

Value containing sequence of gestures.  


##### Overview 

User can create sequences of two or three gestures to expand number of possible actions. Every sequence is saved in its advanced parameter (no. 31-36) with 16 bits, every basic gesture is identified with 4 bits.

Gesture Value

Empty 0

^ 1

v 2

< 3

> 4

Rules of creating sequences:

• Maximum of six sequences can be created.

• Each sequence must be unique.

• Sequence can consist of two or three basic gestures (left, right, up

or down).

• Two identical gestures cannot be used next to each other

To manually create or edit a sequence slot:

1. Calculate new value of parameter using table and formula:

Value of parameter = 256 \* Value of first gesture + 16 \* Value of second gesture + Value of third gesture

2. Change the value of corresponding parameter (parameters 31 to 36 for slots 1 to 6).

**N.B. Setting parameter to 0 will delete the sequenc**e.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_34_2 |
| Data Type        | INTEGER |
| Range | 0 to 1076 |
| Default Value | 0 |


#### 35: 5th gestures sequence (SLOT 5)

Value containing sequence of gestures.  


##### Overview 

User can create sequences of two or three gestures to expand number of possible actions. Every sequence is saved in its advanced parameter (no. 31-36) with 16 bits, every basic gesture is identified with 4 bits.

Gesture Value

Empty 0

^ 1

v 2

< 3

> 4

Rules of creating sequences:

• Maximum of six sequences can be created.

• Each sequence must be unique.

• Sequence can consist of two or three basic gestures (left, right, up

or down).

• Two identical gestures cannot be used next to each other

To manually create or edit a sequence slot:

1. Calculate new value of parameter using table and formula:

Value of parameter = 256 \* Value of first gesture + 16 \* Value of second gesture + Value of third gesture

2. Change the value of corresponding parameter (parameters 31 to 36 for slots 1 to 6).

**N.B. Setting parameter to 0 will delete the sequence.**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_35_2 |
| Data Type        | INTEGER |
| Range | 0 to 1076 |
| Default Value | 0 |


#### 36: 6th gestures sequence (SLOT 6)

Value containing sequence of gestures.  


##### Overview 

User can create sequences of two or three gestures to expand number of possible actions. Every sequence is saved in its advanced parameter (no. 31-36) with 16 bits, every basic gesture is identified with 4 bits.

Gesture Value

Empty 0

^ 1

v 2

< 3

> 4

Rules of creating sequences:

• Maximum of six sequences can be created.

• Each sequence must be unique.

• Sequence can consist of two or three basic gestures (left, right, up

or down).

• Two identical gestures cannot be used next to each other

To manually create or edit a sequence slot:

1. Calculate new value of parameter using table and formula:

Value of parameter = 256 \* Value of first gesture + 16 \* Value of second gesture + Value of third gesture

2. Change the value of corresponding parameter (parameters 31 to 36 for slots 1 to 6).

**N.B. Setting parameter to 0 will delete the sequence.**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_36_2 |
| Data Type        | INTEGER |
| Range | 0 to 1076 |
| Default Value | 0 |


#### 1: Lifeline

  


##### Overview 

 Reports the device status and allows for assigning single device only (main controller by default).


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Flick up gesture

  


##### Overview 

Association ensures direct transfer of control commands between devices, is performed without participation of the main controller and requires associated device to be in the direct range.

The Swipe in 2nd to 6th group allows to control 5 regular or multichannel devices per an association group, with the exception of “LifeLine” that is reserved solely for the controller and hence only 1 node can be assigned.

It is not recommended to associate more than 10 devices in general, as the response time to control commands depends on the number of associated devices. In extreme cases, system response may be delayed.

By default 2nd-5th association groups are set to toggle mode -  single gesture will reverse state of the association group (turns ON when it’s OFF, turns OFF when it’s ON). Can be modified via  parameter 12.

States of the association groups are affected only by assigned gestures. Changing state of associated device by other means will not update remembered state of association group.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Flick down gesture

  


##### Overview 

Association ensures direct transfer of control commands between devices, is performed without participation of the main controller and requires associated device to be in the direct range.

The Swipe in 2nd to 6th group allows to control 5 regular or multichannel devices per an association group, with the exception of “LifeLine” that is reserved solely for the controller and hence only 1 node can be assigned.

It is not recommended to associate more than 10 devices in general, as the response time to control commands depends on the number of associated devices. In extreme cases, system response may be delayed.

By default 2nd-5th association groups are set to toggle mode -  single gesture will reverse state of the association group (turns ON when it’s OFF, turns OFF when it’s ON). Can be modified via  parameter 12.

States of the association groups are affected only by assigned gestures. Changing state of associated device by other means will not update remembered state of association group.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Flick left gesture

  


##### Overview 

Association ensures direct transfer of control commands between devices, is performed without participation of the main controller and requires associated device to be in the direct range.

The Swipe in 2nd to 6th group allows to control 5 regular or multichannel devices per an association group, with the exception of “LifeLine” that is reserved solely for the controller and hence only 1 node can be assigned.

It is not recommended to associate more than 10 devices in general, as the response time to control commands depends on the number of associated devices. In extreme cases, system response may be delayed.

By default 2nd-5th association groups are set to toggle mode -  single gesture will reverse state of the association group (turns ON when it’s OFF, turns OFF when it’s ON). Can be modified via  parameter 12.

States of the association groups are affected only by assigned gestures. Changing state of associated device by other means will not update remembered state of association group.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Flick right gesture

  


##### Overview 

Association ensures direct transfer of control commands between devices, is performed without participation of the main controller and requires associated device to be in the direct range.

The Swipe in 2nd to 6th group allows to control 5 regular or multichannel devices per an association group, with the exception of “LifeLine” that is reserved solely for the controller and hence only 1 node can be assigned.

It is not recommended to associate more than 10 devices in general, as the response time to control commands depends on the number of associated devices. In extreme cases, system response may be delayed.

By default 2nd-5th association groups are set to toggle mode -  single gesture will reverse state of the association group (turns ON when it’s OFF, turns OFF when it’s ON). Can be modified via  parameter 12.

States of the association groups are affected only by assigned gestures. Changing state of associated device by other means will not update remembered state of association group.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


#### 6: Circular Airwheel

  


##### Overview 

Association ensures direct transfer of control commands between devices, is performed without participation of the main controller and requires associated device to be in the direct range.

The Swipe in 2nd to 6th group allows to control 5 regular or multichannel devices per an association group, with the exception of “LifeLine” that is reserved solely for the controller and hence only 1 node can be assigned.

It is not recommended to associate more than 10 devices in general, as the response time to control commands depends on the number of associated devices. In extreme cases, system response may be delayed.

By default 2nd-5th association groups are set to toggle mode -  single gesture will reverse state of the association group (turns ON when it’s OFF, turns OFF when it’s ON). Can be modified via  parameter 12.

States of the association groups are affected only by assigned gestures. Changing state of associated device by other means will not update remembered state of association group.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_6 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/349).
