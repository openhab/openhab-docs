---
layout: documentation
title: FGKF601 - ZWave
---

{% include base.html %}

# FGKF601 Keyfob

This describes the Z-Wave device *FGKF601*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgkf601_00_000```. 

Keyfob


## Channels
The following table summarises the channels available for the FGKF601 Keyfob.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the FGKF601 Keyfob.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Lock Mode - unlocking sequence | 0 - Lock Mode disabled, 9-28086 - unlocking sequence |
| 2: Lock Mode - time to lock and locking button | 0 - Lock Mode disabled, 5-1791 - calculated value |
| 3: First scene sequence | 0 - 1st sequence disabled, 9-28086 - value of sequence |
| 4: Second scene sequence | 0 - 2nd sequence disabled, 9-28086 - value of sequence |
| 5: Third scene sequence | 0 - 3rd sequence disabled, 9-28086 - value of sequence |
| 6: Fourth scene sequence | 0 - 4th sequence disabled, 9-28086 - value of sequence |
| 7: Fifth scene sequence | 0 - 5th sequence disabled, 9-28086 - value of sequence |
| 8: Sixth scene sequence | 0 - 6th sequence disabled, 9-28086 - value of sequence |
| 9: Sequences - timeout | 5-30 (0.5-3s, 0.1s step) - time to lock |
| 10: Single button associations - operating mode |  |
| 11: Value sent to □ association group | 1-99 or 255 (last state) |
| 12: Value sent to ○ association group | 1-99 or 255 (last state) |
| 13: Value sent to x association group | 1-99 or 255 (last state) |
| 14: Value sent to Δ association group | 1-99 or 255 (last state) |
| 15: Value sent to - association group | 1-99 or 255 (last state) |
| 16: Value sent to + association group | 1-99 or 255 (last state) |
| 17: Paired buttons association for □ and ○ |  |
| 18: Paired buttons association for x and Δ |  |
| 19: Paired buttons association for - and + |  |
| 21: Scene activation for □ button | 1 = 1 time, 2 = 2 times, 4 = 3 times, 8 = held down and released |
| 22: Scene activation for ○ button | 1 = 1 time, 2 = 2 times, 4 = 3 times, 8 = held down and released |
| 23: Scene activation for x button | 1 = 1 time, 2 = 2 times, 4 = 3 times, 8 = held down and released |
| 24: Scene activation for Δ button | 1 = 1 time, 2 = 2 times, 4 = 3 times, 8 = held down and released |
| 25: Scene activation for - button | 1 = 1 time, 2 = 2 times, 4 = 3 times, 8 = held down and released |
| 26: Scene activation for + button | 1 = 1 time, 2 = 2 times, 4 = 3 times, 8 = held down and released |
| 29: Associations in Z-Wave network security mode |  |
| 1: Lifeline | “Lifeline” reports the device status and allows for assigning single device only (main con... |
| 2: Square - On/Off | “Square - On/Off” is assigned to clicking the □ button and is used to turn on/off associat... |
| 3: Square - Multilevel | “Square - Multilevel” is assigned to clicking and holding the □ button and is used to turn... |
| 4: Circle - On/Off | “Circle - On/Off” is assigned to clicking the ○ button and is used to turn on/off associat... |
| 5: Circle - Multilevel | “Circle - Multilevel” is assigned to clicking and holding the ○ button and is used to turn... |
| 6: Cross - On/Off | “Cross - On/Off” is assigned to clicking the x button and is used to turn on/off associate... |
| 7: Cross - Multilevel | “Cross - Multilevel” is assigned to clicking and holding the x button and is used to turn ... |
| 8: Triangle - On/Off | “Triangle - On/Off” is assigned to clicking the Δ button and is used to turn on/off associ... |
| 9: Triangle - Multilevel | “Triangle - Multilevel” is assigned to clicking and holding the Δ button and is used to tu... |
| 10: Minus - On/Off | “Minus - On/Off” is assigned to clicking the - button and is used to turn on/off associate... |
| 11: Minus - Multilevel | “Minus - Multilevel” is assigned to clicking and holding the - button and is used to turn ... |
| 12: Plus - On/Off | “Plus - On/Off” is assigned to clicking the + button and is used to turn on/off associated... |
| 13: Plus - Multilevel | “Plus - Multilevel” is assigned to clicking and holding the + button and is used to turn o... |


#### 1: Lock Mode - unlocking sequence

0 - Lock Mode disabled, 9-28086 - unlocking sequence  


##### Overview 

This parameter allows to activate Lock Mode and set up unlocking sequence. Device will lock after time set in parameter 2 or after pressing and holding selected button. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 0 to 28086 |
| Default Value | 0 |


#### 2: Lock Mode - time to lock and locking button

0 - Lock Mode disabled, 5-1791 - calculated value  


##### Overview 

This parameter allows to set time that must elapse from the last press of the button to lock the device and locking button.

Setting locking button will deactivate associations and scenes for pressing and holding the selected button.

This parameter is irrelevant if parameter 1 is set to 0 (Lock Mode disable).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 0 to 1791 |
| Default Value | 60 |


#### 3: First scene sequence

0 - 1st sequence disabled, 9-28086 - value of sequence  


##### Overview 

This parameter allows to set up sequence that activates scene with ID 7. See "Sequences" on page 10 for more information.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 0 to 28086 |
| Default Value | 0 |


#### 4: Second scene sequence

0 - 2nd sequence disabled, 9-28086 - value of sequence  


##### Overview 

This parameter allows to set up sequence that activates scene with ID 8.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_2 |
| Data Type        | INTEGER |
| Range | 0 to 28086 |
| Default Value | 0 |


#### 5: Third scene sequence

0 - 3rd sequence disabled, 9-28086 - value of sequence  


##### Overview 

This parameter allows to set up sequence that activates scene with ID 9.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_2 |
| Data Type        | INTEGER |
| Range | 0 to 28086 |
| Default Value | 0 |


#### 6: Fourth scene sequence

0 - 4th sequence disabled, 9-28086 - value of sequence  


##### Overview 

This parameter allows to set up sequence that activates scene with ID 10. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_2 |
| Data Type        | INTEGER |
| Range | 0 to 28086 |
| Default Value | 0 |


#### 7: Fifth scene sequence

0 - 5th sequence disabled, 9-28086 - value of sequence  


##### Overview 

This parameter allows to set up sequence that activates scene with ID 11. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_2 |
| Data Type        | INTEGER |
| Range | 0 to 28086 |
| Default Value | 0 |


#### 8: Sixth scene sequence

0 - 6th sequence disabled, 9-28086 - value of sequence  


##### Overview 

This parameter allows to set up sequence that activates scene with ID 12.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_2 |
| Data Type        | INTEGER |
| Range | 0 to 28086 |
| Default Value | 0 |


#### 9: Sequences - timeout

5-30 (0.5-3s, 0.1s step) - time to lock  


##### Overview 

This parameter allows to set time that must elapse from the last click of the button to check if the sequence is valid.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER |
| Range | 5 to 30 |
| Default Value | 10 |


#### 10: Single button associations - operating mode

  


##### Overview 

This parameter allows to choose operating mode for single button associations. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | single click switches state to opposite (0) |
|  | single click &#x3D;&gt; opposite, double click &#x3D;&gt; max (1) |
|  | single click turns on, double click turns off (2) |


#### 11: Value sent to □ association group

1-99 or 255 (last state)  


##### Overview 

This parameter allows to set value sent to devices in association group. It will result in turning multilevel devices on with set or last level. Value is irrelevant for simple on/off devices.

**1-99** - forcing level of associated devices  
**255** - setting associated devices to the last remembered state or turning them on


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 255 |


#### 12: Value sent to ○ association group

1-99 or 255 (last state)  


##### Overview 

This parameter allows to set value sent to devices in association group. It will result in turning multilevel devices on with set or last level. Value is irrelevant for simple on/off devices.

**1-99** \- forcing level of associated devices  
**255** \- setting associated devices to the last remembered state or turning them on


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 255 |


#### 13: Value sent to x association group

1-99 or 255 (last state)  


##### Overview 

This parameter allows to set value sent to devices in association group. It will result in turning multilevel devices on with set or last level. Value is irrelevant for simple on/off devices.

**1-99** - forcing level of associated devices  
**255** - setting associated devices to the last remembered state or turning them on


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 255 |


#### 14: Value sent to Δ association group

1-99 or 255 (last state)  


##### Overview 

This parameter allows to set value sent to devices in association group. It will result in turning multilevel devices on with set or last level. Value is irrelevant for simple on/off devices.

**1-99** - forcing level of associated devices  
**255** - setting associated devices to the last remembered state or turning them on


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 255 |


#### 15: Value sent to - association group

1-99 or 255 (last state)  


##### Overview 

This parameter allows to set value sent to devices in association group. It will result in turning multilevel devices on with set or last level. Value is irrelevant for simple on/off devices.

**1-99** - forcing level of associated devices  
**255** - setting associated devices to the last remembered state or turning them on


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 255 |


#### 16: Value sent to + association group

1-99 or 255 (last state)  


##### Overview 

This parameter allows to set value sent to devices in association group. It will result in turning multilevel devices on with set or last level. Value is irrelevant for simple on/off devices.

**1-99** - forcing level of associated devices  
**255** - setting associated devices to the last remembered state or turning them on


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_16_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 255 |


#### 17: Paired buttons association for □ and ○

  


##### Overview 

This parameter allows to activate paired buttons association mode for □ and ○ buttons. Paired buttons are dependent and association are sent only to □ groups. ○ turns devices on and increases value, □ turns them off and decreases value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_17_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | paired buttons association inactive (0) |
|  | paired buttons association active (1) |


#### 18: Paired buttons association for x and Δ

  


##### Overview 

This parameter allows to activate paired buttons association mode for x and Δ buttons. Paired buttons are dependent and association are sent only to x groups. Δ turns devices on and increases value, x turns them off and decreases value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_18_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | paired buttons association inactive (0) |
|  | paired buttons association active (1) |


#### 19: Paired buttons association for - and +

  


##### Overview 

This parameter allows to activate paired buttons association mode for - and + buttons. Paired buttons are dependent and association are sent only to - groups. + turns devices on and increases value, - turns them off and decreases value. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_19_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | paired buttons association inactive (0) |
|  | paired buttons association active (1) |


#### 21: Scene activation for □ button

1 = 1 time, 2 = 2 times, 4 = 3 times, 8 = held down and released  


##### Overview 

This parameter determines which actions result in sending assigned scene IDs and attributes to the controller.

**1** \- Key pressed 1 time  
**2** \- Key pressed 2 times  
**4** - Key pressed 3 times  
**8** \- Key held down & released

Combine multiple actions by or'ing the values.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER |
| Range | 0 to 15 |
| Default Value | 9 |


#### 22: Scene activation for ○ button

1 = 1 time, 2 = 2 times, 4 = 3 times, 8 = held down and released  


##### Overview 

This parameter determines which actions result in sending assigned scene IDs and attributes to the controller.

**1** - Key pressed 1 time  
**2** - Key pressed 2 times  
**4** - Key pressed 3 times  
**8** - Key held down & released

Combine multiple actions by or'ing the values.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_22_1 |
| Data Type        | INTEGER |
| Range | 0 to 15 |
| Default Value | 9 |


#### 23: Scene activation for x button

1 = 1 time, 2 = 2 times, 4 = 3 times, 8 = held down and released  


##### Overview 

This parameter determines which actions result in sending assigned scene IDs and attributes to the controller.

**1** - Key pressed 1 time  
**2** - Key pressed 2 times  
**4** - Key pressed 3 times  
**8** - Key held down & released

Combine multiple actions by or'ing the values.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_23_1 |
| Data Type        | INTEGER |
| Range | 0 to 15 |
| Default Value | 9 |


#### 24: Scene activation for Δ button

1 = 1 time, 2 = 2 times, 4 = 3 times, 8 = held down and released  


##### Overview 

This parameter determines which actions result in sending assigned scene IDs and attributes to the controller.

**1** - Key pressed 1 time  
**2** - Key pressed 2 times  
**4** - Key pressed 3 times  
**8** - Key held down & released

Combine multiple actions by or'ing the values.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_24_1 |
| Data Type        | INTEGER |
| Range | 0 to 15 |
| Default Value | 9 |


#### 25: Scene activation for - button

1 = 1 time, 2 = 2 times, 4 = 3 times, 8 = held down and released  


##### Overview 

This parameter determines which actions result in sending assigned scene IDs and attributes to the controller.

**1** - Key pressed 1 time  
**2** - Key pressed 2 times  
**4** - Key pressed 3 times  
**8** - Key held down & released

Combine multiple actions by or'ing the values.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_25_1 |
| Data Type        | INTEGER |
| Range | 0 to 15 |
| Default Value | 9 |


#### 26: Scene activation for + button

1 = 1 time, 2 = 2 times, 4 = 3 times, 8 = held down and released  


##### Overview 

This parameter determines which actions result in sending assigned scene IDs and attributes to the controller.

**1** - Key pressed 1 time  
**2** - Key pressed 2 times  
**4** - Key pressed 3 times  
**8** - Key held down & released

Combine multiple actions by or'ing the values.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_26_1 |
| Data Type        | INTEGER |
| Range | 0 to 15 |
| Default Value | 9 |


#### 29: Associations in Z-Wave network security mode

  


##### Overview 

Parameter defines how commands are sent in specified association groups: using Security Mode or not. Parameter is active only in Z-Wave network Security Mode. It does not apply to 1st “Lifeline” association group.

Available settings:

**1** \- 2nd group sent using Security Mode  
**2** \- 3rd group sent using Security Mode  
**4** - 4th group sent using Security Mode  
**8** \- 5th group sent using Security Mode  
**16** \- 6th group sent using Security Mode  
**32** \- 7th group sent using Security Mode  
**64** \- 8th group sent using Security Mode  
**128** \- 9th group sent using Security Mode  
**256** \- 10th group sent using Security Mode  
**512** \- 11th group sent using Security Mode  
**1024** \- 12th group sent using Security Mode  
**2048** \- 13th group sent using Security Mode

Set multiple values by or'ing the values together.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_29_2 |
| Data Type        | INTEGER |
| Range | 0 to 4095 |
| Default Value | 4095 |


#### 1: Lifeline

“Lifeline” reports the device status and allows for assigning single device only (main controller by default).


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Square - On/Off

“Square - On/Off” is assigned to clicking the □ button and is used to turn on/off associated devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Square - Multilevel

“Square - Multilevel” is assigned to clicking and holding the □ button and is used to turn on/off and change level of associated devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Circle - On/Off

“Circle - On/Off” is assigned to clicking the ○ button and is used to turn on/off associated devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Circle - Multilevel

“Circle - Multilevel” is assigned to clicking and holding the ○ button and is used to turn on/off and change level of associated devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


#### 6: Cross - On/Off

“Cross - On/Off” is assigned to clicking the x button and is used to turn on/off associated devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_6 |
| Data Type        | TEXT |
| Range |  to  |


#### 7: Cross - Multilevel

“Cross - Multilevel” is assigned to clicking and holding the x button and is used to turn on/off and change level of associated devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_7 |
| Data Type        | TEXT |
| Range |  to  |


#### 8: Triangle - On/Off

“Triangle - On/Off” is assigned to clicking the Δ button and is used to turn on/off associated devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_8 |
| Data Type        | TEXT |
| Range |  to  |


#### 9: Triangle - Multilevel

“Triangle - Multilevel” is assigned to clicking and holding the Δ button and is used to turn on/off and change level of associated devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_9 |
| Data Type        | TEXT |
| Range |  to  |


#### 10: Minus - On/Off

“Minus - On/Off” is assigned to clicking the - button and is used to turn on/off associated devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_10 |
| Data Type        | TEXT |
| Range |  to  |


#### 11: Minus - Multilevel

“Minus - Multilevel” is assigned to clicking and holding the - button and is used to turn on/off and change level of associated devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_11 |
| Data Type        | TEXT |
| Range |  to  |


#### 12: Plus - On/Off

“Plus - On/Off” is assigned to clicking the + button and is used to turn on/off associated devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_12 |
| Data Type        | TEXT |
| Range |  to  |


#### 13: Plus - Multilevel

“Plus - Multilevel” is assigned to clicking and holding the + button and is used to turn on/off and change level of associated devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_13 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/542).
