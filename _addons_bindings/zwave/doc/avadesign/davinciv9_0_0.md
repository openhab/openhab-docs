---
layout: documentation
title: Da Vinci v9 - ZWave
---

{% include base.html %}

# Da Vinci v9
This describes the Z-Wave device *Da Vinci v9*, manufactured by *Avadesign Technology Co.* with the thing type UID of ```avadesign_davinciv9_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Da Vinci v9 product image](https://www.cd-jackson.com/zwave_device_uploads/910/910_default.png)


The Da Vinci v9 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

The Da Vinci wall controller is a Multi Chanel Z-Wave device that contains up to 6 relays and up to 9 touch buttons that can be set to control either the relays (On/Off switches and shutters) or any other on/off (SWITCH\_BINARY) , shutter (MULTILEVEL\_SWITCH) Z-Wave device.

Double Press the following buttons in the following order 8,1,3. Use the reset procedure only when the primary controller is missing or inoperable.

### Inclusion Information

Press the #1 button 3 times.

### Exclusion Information

Press the #1 button 3 times.

## Channels

The following table summarises the channels available for the Da Vinci v9 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary1 | switch_binary | Switch | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The following table provides a summary of the 51 configuration parameters available in the Da Vinci v9.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Button 1 Type | button 1 Type |
| 2 | Button 1 Partner-Id | Button 1 Partner-Id |
| 3 | Button 1 Blind Duration | Button 1 Blind Duration |
| 4 | Button 1 Output | Button 1 Output |
| 5 | Button 1 attributes | Button 1 attributes |
| 6 | Button 2 Type | Button 2 Type |
| 7 | Button 2 Partner-Id | Button 2 Partner-Id |
| 8 | Button 2 Blind Duration | Button 2 Blind Duration |
| 9 | Button 2 Output | Button 2 Output |
| 10 | Button 2 attributes | Button 2 attributes |
| 11 | Button 3 Type | Button 3 Type |
| 12 | Button 3 Partner-Id | Button 3 Partner-Id |
| 13 | Button 3 Blind Duration | Button 3 Blind Duration |
| 14 | Button 3 Output | Button 3 Output |
| 15 | Button 3 attributes | Button 3 attributes |
| 16 | Button 4 Type | Button 4 Type |
| 17 | Button 4 Partner-Id | Button 4 Partner-Id |
| 18 | Button 4 Blind Duration | Button 4 Blind Duration |
| 19 | Button 4 Output | Button 4 Output |
| 20 | Button 4 attributes | Button 4 attributes |
| 21 | Button 5 Type | Button 5 Type |
| 22 | Button 5 Partner-Id | Button 5 Partner-Id |
| 23 | Button 5 Blind Duration | Button 5 Blind Duration |
| 24 | Button 5 Output | Button 5 Output |
| 25 | Button 5 attributes | Button 5 attributes |
| 26 | Button 6 Type | Button 6 Type |
| 27 | Button 6 Partner-Id | Button 6 Partner-Id |
| 28 | Button 6 Blind Duration | Button 6 Blind Duration |
| 29 | Button 6 Output | Button 6 Output |
| 30 | Button 6 attributes | Button 6 attributes |
| 31 | Button 7 Type | Button 7 Type |
| 32 | Button 7 Partner-Id | Button 7 Partner-Id |
| 33 | Button 7 Blind Duration | Button 7 Blind Duration |
| 34 | Button 7 Output | Button 7 Output |
| 35 | Button 7 attribute | Button 7 attribute |
| 36 | Button 8 Type | Button 8 Type |
| 37 | Button 8 Partner-Id | Button 8 Partner-Id |
| 38 | Button 8 Blind Duration | Button 8 Blind Duration |
| 39 | Button 8 Output | Button 8 Output |
| 40 | Button 8 attribute | Button 8 attribute |
| 41 | Button 9 Type | Button 9 Type |
| 42 | Button 9 Partner-Id | Button 9 Partner-Id |
| 43 | Button 9 Blind Duration | Button 9 Blind Duration |
| 44 | Button 9 Output | Button 9 Output |
| 45 | Button 9 attributes | Button 9 attributes |
| 46 | Device Led on intensity | Device Led on intensity |
| 47 | Device Led off intensity | Device Led off intensity |
| 48 | Device Toggle or Pulse the output | Device Toggle or Pulse the output |
| 49 | Device Background LEDs Timeout | Device Background LEDs Timeout |
| 50 | Device touch sensitivity | Device touch sensitivity |
| 51 | Save and Reset | Save and Reset |

### Parameter 1: Button 1 Type

button 1 Type
1 = switch on/off

2 = blind up

3 = blind down

4 = switch multiway

5 = blind-up multiway

6 = blind-down multiway
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Null |
| 1 | Switch On/Off |
| 2 | Blind up |
| 3 | Blind down |
| 4 | Switch multiway |
| 5 | Blind-up multiway |
| 6 | Blind-down multiway |

The manufacturer defined default value is ```1``` (Switch On/Off).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Button 1 Partner-Id

Button 1 Partner-Id
  * When setting Button (EP) to blind, Partner Id EP also change to blind (opposite direction).
  * Blind must contain Partner Id which is different than 0 and it must be unique. 
  * When setting blind to switch, Partner Id also change to switch
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Partner-Id 0 |
| 1 | Partner-Id 1 |
| 2 | Partner-Id 2 |
| 3 | Partner-Id 3 |
| 4 | Partner-Id 4 |
| 5 | Partner-Id 5 |
| 6 | Partner-Id 6 |
| 7 | Partner-Id 7 |
| 8 | Partner-Id 8 |
| 9 | Partner-Id 9 |

The manufacturer defined default value is ```0``` (Partner-Id 0).

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Button 1 Blind Duration

Button 1 Blind Duration

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 3 | Duration 3 Seconds |
| 10 | Duration 10 Seconds |
| 30 | Duration 30 Seconds |
| 60 | Duration 60 Seconds |
| 90 | Duration 90 Seconds |
| 120 | Duration 120 Seconds |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Button 1 Output

Button 1 Output
Output = Relay
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No output |
| 1 | Output number 1 |
| 2 | Output number 2 |
| 3 | Output number 3 |
| 4 | Output number 4 |
| 5 | Output number 5 |
| 6 | Output number 6 |

The manufacturer defined default value is ```1``` (Output number 1).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Button 1 attributes

Button 1 attributes
Bit [0] = LED enable

Bit [1] = Sound enable

Bit [2] = Dry contact enable

Bit [3] = Motor enable
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | None |
| 1 | Only Led |
| 2 | Only Sound |

The manufacturer defined default value is ```7```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Button 2 Type

Button 2 Type
1 = switch on/off

2 = blind up

3 = blind down

4 = switch multiway

5 = blind-up multiway

6 = blind-down multiway
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Switch On/Off |
| 2 | Blind up |
| 3 | Blind down |
| 4 | Switch multiway |
| 5 | Blind-up multiway |
| 6 | Blind-down multiway |

The manufacturer defined default value is ```1``` (Switch On/Off).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Button 2 Partner-Id

Button 2 Partner-Id
  * When setting Button (EP) to blind, Partner Id EP also change to blind (opposite direction).
  * Blind must contain Partner Id which is different than 0 and it must be unique. 
  * When setting blind to switch, Partner Id also change to switch
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Partner-Id 0 |
| 1 | Partner-Id 1 |
| 2 | Partner-Id 2 |
| 3 | Partner-Id 3 |
| 4 | Partner-Id 4 |
| 5 | Partner-Id 5 |
| 6 | Partner-Id 6 |
| 7 | Partner-Id 7 |
| 8 | Partner-Id 8 |
| 9 | Partner-Id 9 |

The manufacturer defined default value is ```0``` (Partner-Id 0).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Button 2 Blind Duration

Button 2 Blind Duration
Possible values

3-127
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 3 | Duration 3 Seconds |
| 10 | Duration10 Seconds |
| 30 | Duration 30 Seconds |
| 60 | Duration 60 Seconds |
| 90 | Duration 90 Seconds |
| 120 | Duration 120 Seconds |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Button 2 Output

Button 2 Output

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No output |
| 1 | Output number 1 |
| 2 | Output number 2 |
| 3 | Output number 3 |
| 4 | Output number 4 |
| 5 | Output number 5 |
| 6 | Output number 6 |

The manufacturer defined default value is ```2``` (Output number 2).

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Button 2 attributes

Button 2 attributes
Bit [0] = LED enable

Bit [1] = Sound enable

Bit [2] = Dry contact enable

Bit [3] = Motor enable
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | None |
| 1 | Only Led |
| 2 | Only Sound |

The manufacturer defined default value is ```7```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Button 3 Type

Button 3 Type
1 = switch on/off

2 = blind up

3 = blind down

4 = switch multiway

5 = blind-up multiway

6 = blind-down multiway
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Switch On/Off |
| 2 | Blind up |
| 3 | Blind down |
| 4 | Switch multiway |
| 5 | Blind-up multiway |
| 6 | Blind-down multiway |

The manufacturer defined default value is ```1``` (Switch On/Off).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Button 3 Partner-Id

Button 3 Partner-Id
  * When setting Button (EP) to blind, Partner Id EP also change to blind (opposite direction).
  * Blind must contain Partner Id which is different than 0 and it must be unique. 
  * When setting blind to switch, Partner Id also change to switch
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Partner-Id 0 |
| 1 | Partner-Id 1 |
| 2 | Partner-Id 2 |
| 3 | Partner-Id 3 |
| 4 | Partner-Id 4 |
| 5 | Partner-Id 5 |
| 6 | Partner-Id 6 |
| 7 | Partner-Id 7 |
| 8 | Partner-Id 8 |
| 9 | Partner-Id 9 |

The manufacturer defined default value is ```0``` (Partner-Id 0).

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Button 3 Blind Duration

Button 3 Blind Duration

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 3 | Duration 3 Seconds |
| 30 | Duration 30 Seconds |
| 60 | Duration 60 Seconds |
| 90 | Duration 90 Seconds |
| 120 | Duration 120 Seconds |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Button 3 Output

Button 3 Output

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No output |
| 1 | Output number 1 |
| 2 | Output number 2 |
| 3 | Output number 3 |
| 4 | Output number 4 |
| 5 | Output number 5 |
| 6 | Output number 6 |

The manufacturer defined default value is ```3``` (Output number 3).

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Button 3 attributes

Button 3 attributes
Bit [0] = LED enable

Bit [1] = Sound enable

Bit [2] = Dry contact enable

Bit [3] = Motor enable
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | None |
| 1 | Only Led |
| 2 | Only Sound |

The manufacturer defined default value is ```7```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 16: Button 4 Type

Button 4 Type
1 = switch on/off

2 = blind up

3 = blind down

4 = switch multiway

5 = blind-up multiway

6 = blind-down multiway
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Switch On/Off |
| 2 | Blind up |
| 3 | Blind down |
| 4 | Switch multiway |
| 5 | Blind-up multiway |
| 6 | Blind-down multiway |

The manufacturer defined default value is ```1``` (Switch On/Off).

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 17: Button 4 Partner-Id

Button 4 Partner-Id
  * When setting Button (EP) to blind, Partner Id EP also change to blind (opposite direction).
  * Blind must contain Partner Id which is different than 0 and it must be unique. 
  * When setting blind to switch, Partner Id also change to switch
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | None |
| 1 | Partner-Id 1 |
| 2 | Partner-Id 2 |
| 3 | Partner-Id 3 |
| 4 | Partner-Id 4 |
| 5 | Partner-Id 5 |
| 6 | Partner-Id 6 |
| 7 | Partner-Id 7 |
| 8 | Partner-Id 8 |
| 9 | Partner-Id 9 |

The manufacturer defined default value is ```0``` (None).

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Button 4 Blind Duration

Button 4 Blind Duration

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 3 | Duration 3 Seconds |
| 30 | Duration 30 Seconds |
| 60 | Duration 60 Seconds |
| 90 | Duration 90 Seconds |
| 120 | Duration 120 Seconds |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 19: Button 4 Output

Button 4 Output

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No output |
| 1 | Output number 1 |
| 2 | Output number 2 |
| 3 | Output number 3 |
| 4 | Output number 4 |
| 5 | Output number 5 |
| 6 | Output number 6 |

The manufacturer defined default value is ```4``` (Output number 4).

This parameter has the configuration ID ```config_19_1``` and is of type ```INTEGER```.


### Parameter 20: Button 4 attributes

Button 4 attributes
Bit [0] = LED enable

Bit [1] = Sound enable

Bit [2] = Dry contact enable

Bit [3] = Motor enable
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | None |
| 1 | Only Led |
| 2 | Only Sound |

The manufacturer defined default value is ```7```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: Button 5 Type

Button 5 Type
1 = switch on/off

2 = blind up

3 = blind down

4 = switch multiway

5 = blind-up multiway

6 = blind-down multiway
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Switch On/Off |
| 2 | Blind up |
| 3 | Blind down |
| 4 | Switch multiway |
| 5 | Blind-up multiway |
| 6 | Blind-down multiway |

The manufacturer defined default value is ```1``` (Switch On/Off).

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22: Button 5 Partner-Id

Button 5 Partner-Id
  * When setting Button (EP) to blind, Partner Id EP also change to blind (opposite direction).
  * Blind must contain Partner Id which is different than 0 and it must be unique. 
  * When setting blind to switch, Partner Id also change to switch
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | None |
| 1 | Partner-Id 1 |
| 2 | Partner-Id 2 |
| 3 | Partner-Id 3 |
| 4 | Partner-Id 4 |
| 5 | Partner-Id 5 |
| 6 | Partner-Id 6 |
| 7 | Partner-Id 7 |
| 8 | Partner-Id 8 |
| 9 | Partner-Id 9 |

The manufacturer defined default value is ```0``` (None).

This parameter has the configuration ID ```config_22_1``` and is of type ```INTEGER```.


### Parameter 23: Button 5 Blind Duration

Button 5 Blind Duration

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 3 | Duration 3 Seconds |
| 30 | Duration 30 Seconds |
| 60 | Duration 60 Seconds |
| 90 | Duration 90 Seconds |
| 120 | Duration 120 Seconds |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.


### Parameter 24: Button 5 Output

Button 5 Output

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No output |
| 1 | Output number 1 |
| 2 | Output number 2 |
| 3 | Output number 3 |
| 4 | Output number 4 |
| 5 | Output number 5 |
| 6 | Output number 6 |

The manufacturer defined default value is ```6``` (Output number 6).

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 25: Button 5 attributes

Button 5 attributes
Bit [0] = LED enable

Bit [1] = Sound enable

Bit [2] = Dry contact enable

Bit [3] = Motor enable
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | None |
| 1 | Only Led |
| 2 | Only Sound |

The manufacturer defined default value is ```7```.

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 26: Button 6 Type

Button 6 Type
1 = switch on/off

2 = blind up

3 = blind down

4 = switch multiway

5 = blind-up multiway

6 = blind-down multiway
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Switch On/Off |
| 2 | Blind up |
| 3 | Blind down |
| 4 | Switch multiway |
| 5 | Blind-up multiway |
| 6 | Blind-down multiway |

The manufacturer defined default value is ```1``` (Switch On/Off).

This parameter has the configuration ID ```config_26_1``` and is of type ```INTEGER```.


### Parameter 27: Button 6 Partner-Id

Button 6 Partner-Id
  * When setting Button (EP) to blind, Partner Id EP also change to blind (opposite direction).
  * Blind must contain Partner Id which is different than 0 and it must be unique. 
  * When setting blind to switch, Partner Id also change to switch
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | None |
| 1 | Partner-Id 1 |
| 2 | Partner-Id 2 |
| 3 | Partner-Id 3 |
| 4 | Partner-Id 4 |
| 5 | Partner-Id 5 |
| 6 | Partner-Id 6 |
| 7 | Partner-Id 7 |
| 8 | Partner-Id 8 |
| 9 | Partner-Id 9 |

The manufacturer defined default value is ```0``` (None).

This parameter has the configuration ID ```config_27_1``` and is of type ```INTEGER```.


### Parameter 28: Button 6 Blind Duration

Button 6 Blind Duration

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 3 | Duration 3 Seconds |
| 30 | Duration 30 Seconds |
| 60 | Duration 60 Seconds |
| 90 | Duration 90 Seconds |
| 120 | Duration 120 Seconds |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_28_1``` and is of type ```INTEGER```.


### Parameter 29: Button 6 Output

Button 6 Output

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No output |
| 1 | Output number 1 |
| 2 | Output number 2 |
| 3 | Output number 3 |
| 4 | Output number 4 |
| 5 | Output number 5 |
| 6 | Output number 6 |

The manufacturer defined default value is ```6``` (Output number 6).

This parameter has the configuration ID ```config_29_1``` and is of type ```INTEGER```.


### Parameter 30: Button 6 attributes

Button 6 attributes
Bit [0] = LED enable

Bit [1] = Sound enable

Bit [2] = Dry contact enable

Bit [3] = Motor enable
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | None |
| 1 | Only Led |
| 2 | Only Sound |

The manufacturer defined default value is ```7```.

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 31: Button 7 Type

Button 7 Type
1 = switch on/off

2 = blind up

3 = blind down

4 = switch multiway

5 = blind-up multiway

6 = blind-down multiway
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | On/Off Switch |
| 2 | Blind up |
| 3 | Blind down |
| 4 | Switch multiway |
| 5 | Blind-up multiway |
| 6 | Blind-down multiway |

The manufacturer defined default value is ```1``` (On/Off Switch).

This parameter has the configuration ID ```config_31_1``` and is of type ```INTEGER```.


### Parameter 32: Button 7 Partner-Id

Button 7 Partner-Id
  * When setting Button (EP) to blind, Partner Id EP also change to blind (opposite direction).
  * Blind must contain Partner Id which is different than 0 and it must be unique. 
  * When setting blind to switch, Partner Id also change to switch
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | None |
| 1 | Partner-Id 1 |
| 2 | Partner-Id 2 |
| 3 | Partner-Id 3 |
| 4 | Partner-Id 4 |
| 5 | Partner-Id 5 |
| 6 | Partner-Id 6 |
| 7 | Partner-Id 7 |
| 8 | Partner-Id 8 |
| 9 | Partner-Id 9 |

The manufacturer defined default value is ```0``` (None).

This parameter has the configuration ID ```config_32_1``` and is of type ```INTEGER```.


### Parameter 33: Button 7 Blind Duration

Button 7 Blind Duration

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 3 | Duration 3 Seconds |
| 30 | Duration 30 Seconds |
| 60 | Duration 60 Seconds |
| 90 | Duration 90 Seconds |
| 120 | Duration 120 Seconds |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_33_1``` and is of type ```INTEGER```.


### Parameter 34: Button 7 Output

Button 7 Output

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | None |
| 1 | Output number 1 |
| 2 | Output number 2 |
| 3 | Output number 3 |
| 4 | Output number 4 |
| 5 | Output number 5 |
| 6 | Output number 6 |

The manufacturer defined default value is ```0``` (None).

This parameter has the configuration ID ```config_34_1``` and is of type ```INTEGER```.


### Parameter 35: Button 7 attribute

Button 7 attribute
Bit [0] = LED enable

Bit [1] = Sound enable

Bit [2] = Dry contact enable

Bit [3] = Motor enable
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | None |
| 1 | Only Led |
| 2 | Only Sound |

The manufacturer defined default value is ```7```.

This parameter has the configuration ID ```config_35_1``` and is of type ```INTEGER```.


### Parameter 36: Button 8 Type

Button 8 Type
1 = switch on/off

2 = blind up

3 = blind down

4 = switch multiway

5 = blind-up multiway

6 = blind-down multiway
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Switch On/Off |
| 2 | Blind up |
| 3 | Blind down |
| 4 | Switch multiway |
| 5 | Blind-up multiway |
| 6 | Blind-down multiway |

The manufacturer defined default value is ```1``` (Switch On/Off).

This parameter has the configuration ID ```config_36_1``` and is of type ```INTEGER```.


### Parameter 37: Button 8 Partner-Id

Button 8 Partner-Id
  * When setting Button (EP) to blind, Partner Id EP also change to blind (opposite direction).
  * Blind must contain Partner Id which is different than 0 and it must be unique. 
  * When setting blind to switch, Partner Id also change to switch
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | None |
| 1 | Partner-Id 1 |
| 2 | Partner-Id 2 |
| 3 | Partner-Id 3 |
| 4 | Partner-Id 4 |
| 5 | Partner-Id 5 |
| 6 | Partner-Id 6 |
| 7 | Partner-Id 7 |
| 8 | Partner-Id 8 |
| 9 | Partner-Id 9 |

The manufacturer defined default value is ```0``` (None).

This parameter has the configuration ID ```config_37_1``` and is of type ```INTEGER```.


### Parameter 38: Button 8 Blind Duration

Button 8 Blind Duration

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 3 | Duration 3 Seconds |
| 30 | Duration 30 Seconds |
| 60 | Duration 60 Seconds |
| 90 | Duration 90 Seconds |
| 120 | Duration 120 Seconds |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_38_1``` and is of type ```INTEGER```.


### Parameter 39: Button 8 Output

Button 8 Output

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No output |
| 1 | Output number 1 |
| 2 | Output number 2 |
| 3 | Output number 3 |
| 4 | Output number 4 |
| 5 | Output number 5 |
| 6 | Output number 6 |
| 255 | BLANK |

The manufacturer defined default value is ```0``` (No output).

This parameter has the configuration ID ```config_39_1``` and is of type ```INTEGER```.


### Parameter 40: Button 8 attribute

Button 8 attribute
Bit [0] = LED enable

Bit [1] = Sound enable

Bit [2] = Dry contact enable

Bit [3] = Motor enable
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | None |
| 1 | Only Led |
| 2 | Only Sound |

The manufacturer defined default value is ```7```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 41: Button 9 Type

Button 9 Type
1 = switch on/off

2 = blind up

3 = blind down

4 = switch multiway

5 = blind-up multiway

6 = blind-down multiway
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Switch On/Off |
| 2 | Blind up |
| 3 | Blind down |
| 4 | Switch multiway |
| 5 | Blind-up multiway |
| 6 | Blind-down multiway |

The manufacturer defined default value is ```1``` (Switch On/Off).

This parameter has the configuration ID ```config_41_1``` and is of type ```INTEGER```.


### Parameter 42: Button 9 Partner-Id

Button 9 Partner-Id
  * When setting Button (EP) to blind, Partner Id EP also change to blind (opposite direction).
  * Blind must contain Partner Id which is different than 0 and it must be unique. 
  * When setting blind to switch, Partner Id also change to switch
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | None |
| 1 | Partner-Id 1 |
| 2 | Partner-Id 2 |
| 3 | Partner-Id 3 |
| 4 | Partner-Id 4 |
| 5 | Partner-Id 5 |
| 6 | Partner-Id 6 |
| 7 | Partner-Id 7 |
| 8 | Partner-Id 8 |
| 9 | Partner-Id 9 |

The manufacturer defined default value is ```0``` (None).

This parameter has the configuration ID ```config_42_1``` and is of type ```INTEGER```.


### Parameter 43: Button 9 Blind Duration

Button 9 Blind Duration

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 3 | Duration 3 Seconds |
| 30 | Duration 30 Seconds |
| 60 | Duration 60 Seconds |
| 90 | Duration 90 Seconds |
| 120 | Duration 120 Seconds |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_43_1``` and is of type ```INTEGER```.


### Parameter 44: Button 9 Output

Button 9 Output

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No output |
| 1 | Output number 1 |
| 2 | Output number 2 |
| 3 | Output number 3 |
| 4 | Output number 4 |
| 5 | Output number 5 |
| 6 | Output number 6 |

The manufacturer defined default value is ```0``` (No output).

This parameter has the configuration ID ```config_44_1``` and is of type ```INTEGER```.


### Parameter 45: Button 9 attributes

Button 9 attributes
Bit [0] = LED enable

Bit [1] = Sound enable

Bit [2] = Dry contact enable

Bit [3] = Motor enable
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | None |
| 1 | Only Led |
| 2 | Only Sound |

The manufacturer defined default value is ```7```.

This parameter has the configuration ID ```config_45_1``` and is of type ```INTEGER```.


### Parameter 46: Device Led on intensity

Device Led on intensity

Values in the range 0 to 7 may be set.

The manufacturer defined default value is ```7```.

This parameter has the configuration ID ```config_46_1``` and is of type ```INTEGER```.


### Parameter 47: Device Led off intensity

Device Led off intensity

Values in the range 0 to 7 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_47_1``` and is of type ```INTEGER```.


### Parameter 48: Device Toggle or Pulse the output

Device Toggle or Pulse the output
**Device Toggle or Pulse the output:**

0 = Toggle

1 = Pulse
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_48_1``` and is of type ```INTEGER```.


### Parameter 49: Device Background LEDs Timeout

Device Background LEDs Timeout
**Device Background LEDs Timeout:**

0 = always Off

10 - 40 = Timeout in seconds

255 = always On!!!!!!!
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_49_1``` and is of type ```INTEGER```.


### Parameter 50: Device touch sensitivity

Device touch sensitivity
**You can choose value between 0 – 7**

0 = most sensitive

7 = least sensitive
Values in the range 0 to 7 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_50_1``` and is of type ```INTEGER```.


### Parameter 51: Save and Reset

Save and Reset
255 = save and reset
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Do NOT Save and Reset |
| 255 | Save and Reset |

The manufacturer defined default value is ```0``` (Do NOT Save and Reset).

This parameter has the configuration ID ```config_51_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Da Vinci v9 supports 37 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

### Group 2: EP1_SWITCH_BINARY_SET

SWITCH\_BINARY\_SET

EP1\_SWITCH\_BINARY_SET

Association group 2 supports 5 nodes.

### Group 3: EP1_SWITCH_BINARY_REPORT

SWITCH\_BINARY\_REPORT 

EP1\_SWITCH\_BINARY_REPORT

Association group 3 supports 5 nodes.

### Group 4: EP1_SWITCH_MULTILEVEL_SET

SWITCH\_MULTILEVEL\_SET

EP1\_SWITCH\_MULTILEVEL_SET

Association group 4 supports 5 nodes.

### Group 5: EP1_SWITCH_MULTILEVEL_REPORT

SWITCH\_MULTILEVEL\_REPORT

EP1\_SWITCH\_MULTILEVEL_REPORT

Association group 5 supports 5 nodes.

### Group 6: EP2_SWITCH_BINARY_SET

SWITCH\_BINARY\_SET

Association group 6 supports 5 nodes.

### Group 7: EP2_SWITCH_BINARY_REPORT

SWITCH\_BINARY\_REPORT

Association group 7 supports 5 nodes.

### Group 8: EP2_SWITCH_MULTILEVEL_SET

SWITCH\_MULTILEVEL\_SET

Association group 8 supports 5 nodes.

### Group 9: EP2_SWITCH_MULTILEVEL_REPORT

SWITCH\_MULTILEVEL\_REPORT

Association group 9 supports 5 nodes.

### Group 10: EP3_SWITCH_BINARY_SET

SWITCH\_BINARY\_SET

Association group 10 supports 5 nodes.

### Group 11: EP3_SWITCH_BINARY_REPORT

SWITCH\_BINARY\_REPORT

Association group 11 supports 5 nodes.

### Group 12: EP3_SWITCH_MULTILEVEL_SET

SWITCH\_MULTILEVEL\_SET

Association group 12 supports 5 nodes.

### Group 13: EP3_SWITCH_MULTILEVEL_REPORT

SWITCH\_MULTILEVEL\_REPORT

Association group 13 supports 5 nodes.

### Group 14: EP4_SWITCH_BINARY_SET

SWITCH\_BINARY\_SET

Association group 14 supports 5 nodes.

### Group 15: EP4_SWITCH_BINARY_REPORT

SWITCH\_BINARY\_REPORT

Association group 15 supports 5 nodes.

### Group 16: EP4_SWITCH_MULTILEVEL_SET

SWITCH\_MULTILEVEL\_SET

Association group 16 supports 5 nodes.

### Group 17: EP4_SWITCH_MULTILEVEL_REPORT

SWITCH\_MULTILEVEL\_REPORT

Association group 17 supports 5 nodes.

### Group 18: EP5_SWITCH_BINARY_SET

SWITCH\_BINARY\_SET

Association group 18 supports 5 nodes.

### Group 19: EP5_SWITCH_BINARY_REPORT

SWITCH\_BINARY\_REPORT

Association group 19 supports 5 nodes.

### Group 20: EP5_SWITCH_MULTILEVEL_SET

SWITCH\_MULTILEVEL\_SET

Association group 20 supports 5 nodes.

### Group 21: EP5_SWITCH_MULTILEVEL_REPORT

SWITCH\_MULTILEVEL\_REPORT

Association group 21 supports 5 nodes.

### Group 22: EP6_SWITCH_BINARY_SET

SWITCH\_BINARY\_SET

Association group 22 supports 5 nodes.

### Group 23: EP6_SWITCH_BINARY_REPORT

SWITCH\_BINARY\_REPORT

Association group 23 supports 5 nodes.

### Group 24: EP6_SWITCH_MULTILEVEL_SET

SWITCH\_MULTILEVEL\_SET

Association group 24 supports 5 nodes.

### Group 25: EP6_SWITCH_MULTILEVEL_REPORT

SWITCH\_MULTILEVEL\_REPORT

Association group 25 supports 5 nodes.

### Group 26: EP7_ SWITCH_BINARY_SET

SWITCH\_BINARY\_SET

Association group 26 supports 5 nodes.

### Group 27: EP7_SWITCH_BINARY_REPORT

SWITCH\_BINARY\_REPORT

Association group 27 supports 5 nodes.

### Group 28: EP7_ SWITCH_MULTILEVEL_SET

SWITCH\_MULTILEVEL\_SET

Association group 28 supports 5 nodes.

### Group 29: EP7_ SWITCH_MULTILEVEL_REPORT

SWITCH\_MULTILEVEL\_REPORT

Association group 29 supports 5 nodes.

### Group 30: EP8_SWITCH_BINARY_SET

SWITCH\_BINARY\_SET

Association group 30 supports 5 nodes.

### Group 31: EP8_ SWITCH_BINARY_REPORT

SWITCH\_BINARY\_REPORT

Association group 31 supports 5 nodes.

### Group 32: EP8_ SWITCH_MULTILEVEL_SET

SWITCH\_MULTILEVEL\_SET

Association group 32 supports 5 nodes.

### Group 33: EP8_ SWITCH_MULTILEVEL_REPORT

SWITCH\_MULTILEVEL\_REPORT

Association group 33 supports 5 nodes.

### Group 34: EP9_ SWITCH_BINARY_SET

SWITCH\_BINARY\_SET

Association group 34 supports 5 nodes.

### Group 35: EP9_SWITCH_BINARY_REPORT

SWITCH\_BINARY\_REPORT

Association group 35 supports 5 nodes.

### Group 36: EP9_ SWITCH_MULTILEVEL_SET

SWITCH\_MULTILEVEL\_SET

Association group 36 supports 5 nodes.

### Group 37: EP9_ SWITCH_MULTILEVEL_REPORT

SWITCH\_MULTILEVEL\_REPORT

Association group 37 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/910/DA-VINCI-ver-9.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/910).
