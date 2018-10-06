---
layout: documentation
title: Da Vinci v9 - ZWave
---

{% include base.html %}

# Da Vinci v9
This describes the Z-Wave device *Da Vinci v9*, manufactured by *Avadesign Technology Co.* with the thing type UID of ```avadesign_davinciv9_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Da Vinci v9 product image](https://www.cd-jackson.com/zwave_device_uploads/910/910_default.png)


## Overview

The Da Vinci wall controller is a Multi Chanel Z-Wave device that contains up to 6 relays and up to 9 touch buttons that can be set to control either the relays (On/Off switches and shutters) or any other on/off (SWITCH\_BINARY) , shutter (MULTILEVEL\_SWITCH) Z-Wave device.

Double Press the following buttons in the following order 8,1,3. Use the reset procedure only when the primary controller is missing or inoperable.

### Inclusion Information

Press the #1 button 3 times.

### Exclusion Information

Press the #1 button 3 times.

## Channels

The following table summarises the channels available for the Da Vinci v9 -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|



## Device Configuration

The following table provides a summary of the 36 configuration parameters available in the Da Vinci v9.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | EP 1 Type | End point 1 Type |
| 2 | EP 1 Partner Id |  |
| 3 | EP 1 Blind Duration |  |
| 4 | EP 1 Output | End point 1 Output – Relay number |
| 5 | EP 2 Type | End point 2 Type |
| 6 | EP 2 Partner Id |  |
| 7 | EP 2 Blind Duration |  |
| 8 | EP 2 Output | End point 2 Output – Relay number. |
| 9 | EP 3 Type | End point 3 Type |
| 10 | EP 3 Partner Id |  |
| 11 | EP 3 Blind Duration |  |
| 12 | EP 3 Output | End point 3 Output – Relay number. |
| 13 | EP 4 Type | End point 4 Type |
| 14 | EP 4 Partner Id |  |
| 15 | EP 4 Blind Duration |  |
| 16 | EP 4 Output | End point 4 Output – Relay number. |
| 17 | EP 5 Type | End point 5 Type |
| 18 | End point Id |  |
| 19 | EP 5 Blind Duration |  |
| 20 | EP 5 Output | End point 5 Output – Relay number. |
| 21 | EP 6 Type | End point 6 Type |
| 22 | EP 6 Partner Id |  |
| 23 | EP 6 Blind Duration |  |
| 24 | EP 6 Output | End point 6 Output – Relay number. |
| 25 | EP 7 Type | End point 7 Type |
| 26 | EP 7 Partner Id |  |
| 27 | EP 7 Blind Duration |  |
| 28 | EP 7 Output | End point 7 Output – Relay number. |
| 29 | EP 8 Type | End point 8 Type |
| 30 | EP 8 Partner Id |  |
| 31 | EP 8 Blind Duration |  |
| 32 | EP 8 Output | End point 8 Output – Relay number. |
| 33 | EP 9 Type | End point 9 Type |
| 34 | EP 9 Partner Id |  |
| 35 | EP 9 Blind Duration |  |
| 36 | EP 9 Output | End point 9 Output – Relay number. |

### Parameter 1: EP 1 Type

End point 1 Type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | On/Off Switch |
| 1 | Blind up |
| 2 | Blind down |

The manufacturer defined default value is ```0``` (On/Off Switch).

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: EP 1 Partner Id



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | End point Id |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 3: EP 1 Blind Duration



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 3 | Seconds |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 4: EP 1 Output

End point 1 Output – Relay number

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Relay number |

The manufacturer defined default value is ```1``` (Relay number).

This parameter has the configuration ID ```config_4_2``` and is of type ```INTEGER```.


### Parameter 5: EP 2 Type

End point 2 Type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | On/Off Switch |
| 1 | Blind up |
| 2 | Blind down |

The manufacturer defined default value is ```0``` (On/Off Switch).

This parameter has the configuration ID ```config_5_2``` and is of type ```INTEGER```.


### Parameter 6: EP 2 Partner Id



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | End point Id |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 7: EP 2 Blind Duration



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 3 | Seconds |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 8: EP 2 Output

End point 2 Output – Relay number.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Relay number |

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_8_2``` and is of type ```INTEGER```.


### Parameter 9: EP 3 Type

End point 3 Type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | On/Off Switch |
| 1 | Blind up |
| 2 | Blind down |

The manufacturer defined default value is ```0``` (On/Off Switch).

This parameter has the configuration ID ```config_9_2``` and is of type ```INTEGER```.


### Parameter 10: EP 3 Partner Id



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | End point Id |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 11: EP 3 Blind Duration



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 3 | Seconds |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 12: EP 3 Output

End point 3 Output – Relay number.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Relay number |

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: EP 4 Type

End point 4 Type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | On/Off Switch |
| 1 | Blind up |
| 2 | Blind down |

The manufacturer defined default value is ```0``` (On/Off Switch).

This parameter has the configuration ID ```config_13_2``` and is of type ```INTEGER```.


### Parameter 14: EP 4 Partner Id



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | End point Id |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_14_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 15: EP 4 Blind Duration



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 3 | Seconds |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_15_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 16: EP 4 Output

End point 4 Output – Relay number.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Relay number |

The manufacturer defined default value is ```4```.

This parameter has the configuration ID ```config_16_2``` and is of type ```INTEGER```.


### Parameter 17: EP 5 Type

End point 5 Type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | On/Off Switch |
| 1 | Blind up |
| 2 | Blind down |

The manufacturer defined default value is ```0``` (On/Off Switch).

This parameter has the configuration ID ```config_17_2``` and is of type ```INTEGER```.


### Parameter 18: End point Id



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | End point Id |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_18_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 19: EP 5 Blind Duration



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 3 | Seconds |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_19_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 20: EP 5 Output

End point 5 Output – Relay number.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Relay number |

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_20_2``` and is of type ```INTEGER```.


### Parameter 21: EP 6 Type

End point 6 Type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | On/Off Switch |
| 1 | Blind up |
| 2 | Blind down |

The manufacturer defined default value is ```0``` (On/Off Switch).

This parameter has the configuration ID ```config_21_2``` and is of type ```INTEGER```.


### Parameter 22: EP 6 Partner Id



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | End point Id |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_22_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 23: EP 6 Blind Duration



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 3 | Seconds |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_23_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 24: EP 6 Output

End point 6 Output – Relay number.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Relay number |

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_24_2``` and is of type ```INTEGER```.


### Parameter 25: EP 7 Type

End point 7 Type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | On/Off Switch |
| 1 | Blind up |
| 2 | Blind down |

The manufacturer defined default value is ```0``` (On/Off Switch).

This parameter has the configuration ID ```config_25_2``` and is of type ```INTEGER```.


### Parameter 26: EP 7 Partner Id



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | End point Id |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_26_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 27: EP 7 Blind Duration



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 3 | Seconds |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_27_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 28: EP 7 Output

End point 7 Output – Relay number.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Relay number |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_28_2``` and is of type ```INTEGER```.


### Parameter 29: EP 8 Type

End point 8 Type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | On/Off Switch |
| 1 | Blind up |
| 2 | Blind down |

The manufacturer defined default value is ```0``` (On/Off Switch).

This parameter has the configuration ID ```config_29_2``` and is of type ```INTEGER```.


### Parameter 30: EP 8 Partner Id



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | End point Id |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_30_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 31: EP 8 Blind Duration



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 3 | Seconds |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_31_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 32: EP 8 Output

End point 8 Output – Relay number.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Relay number |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_32_2``` and is of type ```INTEGER```.


### Parameter 33: EP 9 Type

End point 9 Type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | On/Off Switch |
| 1 | Blind up |
| 2 | Blind down |

The manufacturer defined default value is ```0``` (On/Off Switch).

This parameter has the configuration ID ```config_33_2``` and is of type ```INTEGER```.


### Parameter 34: EP 9 Partner Id



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | End point Id |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_34_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 35: EP 9 Blind Duration



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 3 | Seconds |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_35_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 36: EP 9 Output

End point 9 Output – Relay number.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Relay number |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_36_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Da Vinci v9 supports 37 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

### Group 2: SWITCH_BINARY_SET

Sends a SWITCH\_BINARY\_SET command to all group members

Association group 2 supports 5 nodes.

### Group 3: SWITCH_BINARY_REPORT 

Sends a SWITCH\_BINARY\_REPORT command to all group members

Association group 3 supports 5 nodes.

### Group 4: SWITCH_MULTILEVEL_SET

Sends a SWITCH\_MULTILEVEL\_SET command to all group members

Association group 4 supports 5 nodes.

### Group 5: SWITCH_MULTILEVEL_REPORT

Sends a SWITCH\_MULTILEVEL\_REPORT command to all group members

Association group 5 supports 5 nodes.

### Group 6: SWITCH_BINARY_SET

Sends a SWITCH\_BINARY\_SET command to all group members

Association group 6 supports 5 nodes.

### Group 7: SWITCH_BINARY_REPORT

Sends a SWITCH\_BINARY\_REPORT command to all group members

Association group 7 supports 5 nodes.

### Group 8: SWITCH_MULTILEVEL_SET

Sends a SWITCH\_MULTILEVEL\_SET command to all group members

Association group 8 supports 5 nodes.

### Group 9: SWITCH_MULTILEVEL_REPORT

Sends a SWITCH\_MULTILEVEL\_REPORT command to all group members

Association group 9 supports 5 nodes.

### Group 10: SWITCH_BINARY_SET

Sends a SWITCH\_BINARY\_SET command to all group members

Association group 10 supports 5 nodes.

### Group 11: SWITCH_BINARY_REPORT

Sends a SWITCH\_BINARY\_REPORT command to all group members

Association group 11 supports 5 nodes.

### Group 12: SWITCH_MULTILEVEL_SET

Sends SWITCH\_MULTILEVEL\_SET command to all group members

Association group 12 supports 5 nodes.

### Group 13: SWITCH_MULTILEVEL_REPORT

Sends a SWITCH\_MULTILEVEL\_REPORT command to all group members

Association group 13 supports 5 nodes.

### Group 14: SWITCH_BINARY_SET

Sends a SWITCH\_BINARY\_SET command to all group members

Association group 14 supports 5 nodes.

### Group 15: SWITCH_BINARY_REPORT

Sends a SWITCH\_BINARY\_REPORT command to all group members

Association group 15 supports 5 nodes.

### Group 16: SWITCH_MULTILEVEL_SET

Sends a SWITCH\_MULTILEVEL\_SET command to all group members

Association group 16 supports 5 nodes.

### Group 17: SWITCH_MULTILEVEL_REPORT command to all group members


Association group 17 supports 5 nodes.

### Group 18: Sends a SWITCH_BINARY_SET command to all group members


Association group 18 supports 5 nodes.

### Group 19: Sends a SWITCH_BINARY_REPORT command to all group members


Association group 19 supports 5 nodes.

### Group 20: SWITCH_MULTILEVEL_SET command to all group members


Association group 20 supports 5 nodes.

### Group 21: SWITCH_MULTILEVEL_REPORT command to all group members


Association group 21 supports 5 nodes.

### Group 22: Sends a SWITCH_BINARY_SET command to all group members


Association group 22 supports 5 nodes.

### Group 23: Sends a SWITCH_BINARY_REPORT command to all group members


Association group 23 supports 5 nodes.

### Group 24: SWITCH_MULTILEVEL_SET command to all group members


Association group 24 supports 5 nodes.

### Group 25: SWITCH_MULTILEVEL_REPORT command to all group members


Association group 25 supports 5 nodes.

### Group 26: Sends a SWITCH_BINARY_SET command to all group members


Association group 26 supports 5 nodes.

### Group 27: Sends a SWITCH_BINARY_REPORT command to all group members


Association group 27 supports 5 nodes.

### Group 28: SWITCH_MULTILEVEL_SET command to all group members


Association group 28 supports 5 nodes.

### Group 29: SWITCH_MULTILEVEL_REPORT command to all group members


Association group 29 supports 5 nodes.

### Group 30: Sends a SWITCH_BINARY_SET command to all group members


Association group 30 supports 5 nodes.

### Group 31: Sends a SWITCH_BINARY_REPORT command to all group members


Association group 31 supports 5 nodes.

### Group 32: SWITCH_MULTILEVEL_SET command to all group members


Association group 32 supports 5 nodes.

### Group 33: SWITCH_MULTILEVEL_REPORT command to all group members


Association group 33 supports 5 nodes.

### Group 34: Sends a SWITCH_BINARY_SET command to all group members


Association group 34 supports 5 nodes.

### Group 35: Sends a SWITCH_BINARY_REPORT command to all group members


Association group 35 supports 5 nodes.

### Group 36: SWITCH_MULTILEVEL_SET command to all group members


Association group 36 supports 5 nodes.

### Group 37: SWITCH_MULTILEVEL_REPORT command to all group members


Association group 37 supports 5 nodes.

## Technical Information

### Endpoints


### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/910/DA-VINCI-ver-9.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/910).
