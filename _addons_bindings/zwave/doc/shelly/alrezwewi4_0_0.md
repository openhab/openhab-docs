---
layout: documentation
title: Wave i4 - ZWave
---

{% include base.html %}

# Wave i4 Z-Wave 4-digital inputs module (110-240 V AC) that controls other devices within the Z-Wave network.
This describes the Z-Wave device *Wave i4*, manufactured by *Shelly* with the thing type UID of ```shelly_alrezwewi4_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Wave i4 product image](https://opensmarthouse.org/zwavedatabase/1646/image/)


The Wave i4 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Device is a 4-digital inputs module (110-240 V AC) that controls other devices within the Z-Wave network.

It enables manual activation or deactivation of scenes through a switch/push-button.

Note that endpoints 2-5 correspond to the module inputs SW1-SW4 !

### Inclusion Information

Adding (inclusion) with the S button

  1. Connect the Device to a power supply.
  2. Check if the blue LED is blinking slowly. If so, the Device is not added to a Z-Wave® network.
  3. Enable add/remove mode on the gateway.
  4. To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.
  5. Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking slowly. Releasing the S button will start the Learn mode.
  6. The blue LED will be blinking faster during the adding process.
  7. The green LED will be blinking slowly if the Device is successfully added to a Z-Wave® network.

Adding (inclusion) with a switch/push-button

  1. Connect the Device to a power supply.
  2. Check if the blue LED is blinking slowly. If so, the Device is not added to a -Wave® network.
  3. Enable add/remove mode on the gateway.
  4. Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2, etc.) 3 times within 3 seconds (this procedure puts the Device in Learn mode*). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.
  5. The blue LED will be blinking faster during the adding process.
  6. The green LED will be blinking slowly if the Device is successfully added to a Z-Wave® network.

### Exclusion Information

Removing (exclusion) with the S button

  1. Connect the Device to a power supply.
  2. Check if the green LED will be blinking slowly. If so, the Device is added to a Z-Wave® network.
  3. Enable add/remove mode on the gateway.
  4. To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.
  5. Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking slowly. Releasing the S button will start the LEARN MODE.
  6. The blue LED will be blinking faster during the removing process.
  7. The blue LED will be blinking slower if the Device is successfully removed from a Z-Wave® network.

Removing (exclusion) with a switch/push-button

  1. Connect the Device to a power supply.
  2. Check if the green LED will be blinking slowly. If so, the Device is added to a Z-Wave® network.
  3. Enable add/remove mode on the gateway.
  4. Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2,…) 3 times within 3 seconds (this procedure puts the Device in LEARN MODE). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.
  5. The blue LED will be blinking faster during the removing process.
  6. The blue LED will be blinking slower if the Device is successfully removed from a Z-Wave® network.

### General Usage Information



## Channels

The following table summarises the channels available for the Wave i4 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Scene Number | scene_number | scene_number |  | Number | 
| Alarm (heat) | alarm_heat | alarm_heat | Fire | Switch | 
| Switch 1 | switch_binary2 | switch_binary | Switch | Switch | 
| Switch 2 | switch_binary3 | switch_binary | Switch | Switch | 
| Switch 3 | switch_binary4 | switch_binary | Switch | Switch | 
| Switch 4 | switch_binary5 | switch_binary | Switch | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.
This channel provides the scene, and the event as a decimal value in the form ```<scene>.<event>```. The scene number is set by the device, and the event is as follows -:

| Event ID | Event Description  |
|----------|--------------------|
| 0        | Single key press   |
| 1        | Key released       |
| 2        | Key held down      |
| 3        | Double keypress    |
| 4        | Tripple keypress   |
| 5        | 4 x keypress       |
| 6        | 5 x keypress       |

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```Fire``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Switch 1
Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 2
Switch the power on and off.

The ```switch_binary3``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 3
Switch the power on and off.

The ```switch_binary4``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 4
Switch the power on and off.

The ```switch_binary5``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The following table provides a summary of the 9 configuration parameters available in the Wave i4.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | SW1 Switch type | This parameter defines how the Device should treat the switch (which type) connected to the SW (SW1) terminal. |
| 2 | SW2 Switch type | This parameter defines how the Device should treat the switch (which type) connected to the SW2 terminal. |
| 3 | SW3 Switch type | This parameter defines how the Device should treat the switch (which type) connected to the SW3 terminal. |
| 4 | SW4 Switch type | This parameter defines how the Device should treat the switch (which type) connected to the SW4 terminal. |
| 105 | LED Signalisation intensity | In Wave 1, Wave 1PM and Wave 2PM, Plug US, Plug UK, this parameter will be implemented in 2024. This parameter determines the intensity of the LED on the Device. Some Devices have RGB LEDs and some have Blue/Red LEDs, but all are dimmable. |
| 120 | Factory Reset | Reset to factory default settings and removed from the Z-Wave network. |
| 201 | Serial Number 1 | This parameter contains a part of device’s serial number. |
| 202 | Serial Number 2 | This parameter contains a part of device’s serial number. |
| 203 | Serial Number 3 | This parameter contains a part of device’s serial number. |

### Parameter 1: SW1 Switch type

This parameter defines how the Device should treat the switch (which type) connected to the SW (SW1) terminal.

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | Momentary switch (push button) |
| 1 | Toggle switch (contact closed - ON / contact opened - OFF) |
| 2 | Toggle switch (device changes status when switch changes status) |

The manufacturer defined default value is ```2``` (Toggle switch (device changes status when switch changes status)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: SW2 Switch type

This parameter defines how the Device should treat the switch (which type) connected to the SW2 terminal.

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | momentary switch (push button) |
| 1 | Toggle switch (contact closed - ON / contact opened - OFF) |
| 2 | Toggle switch (device changes status when switch changes status) |

The manufacturer defined default value is ```2``` (Toggle switch (device changes status when switch changes status)).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: SW3 Switch type

This parameter defines how the Device should treat the switch (which type) connected to the SW3 terminal.

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | Momentary switch (push button) |
| 1 | Toggle switch (contact closed - ON / contact opened - OFF) |

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: SW4 Switch type

This parameter defines how the Device should treat the switch (which type) connected to the SW4 terminal.

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | Momentary switch (push button) |
| 1 | Toggle switch (contact closed - ON / contact opened - OFF) |
| 2 | Toggle switch (device changes status when switch changes status) |

The manufacturer defined default value is ```2``` (Toggle switch (device changes status when switch changes status)).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 105: LED Signalisation intensity

In Wave 1, Wave 1PM and Wave 2PM, Plug US, Plug UK, this parameter will be implemented in 2024. This parameter determines the intensity of the LED on the Device. Some Devices have RGB LEDs and some have Blue/Red LEDs, but all are dimmable.
0-100 (0-100%, every 1%)
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_105_1``` and is of type ```INTEGER```.


### Parameter 120: Factory Reset

Reset to factory default settings and removed from the Z-Wave network.
Values & descriptions:

0 - No action

1 - Factory resetThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_120_1``` and is of type ```INTEGER```.


### Parameter 201: Serial Number 1

This parameter contains a part of device’s serial number.
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_201_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 202: Serial Number 2

This parameter contains a part of device’s serial number.
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_202_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 203: Serial Number 3

This parameter contains a part of device’s serial number.
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_203_4``` and is of type ```INTEGER```.
This is a read only parameter.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Wave i4 supports 9 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
“Lifeline Group” reports the status of the Device and allows to assign only one device (gateway by default).
The following command classes are supported:

1. INDICATOR_REPORT : LED status

2. DEVICE\_RESET\_LOCALLY_NOTIFICATION : triggered upon request

3. SWITCH\_BINARY\_REPORT : status change report on SW1

4. SWITCH\_BINARY\_REPORT : status change report on SW2

5. SWITCH\_BINARY\_REPORT : status change report on SW3

6. SWITCH\_BINARY\_REPORT : status change report on SW4

Association group 1 supports 2 nodes.

### Group 4: Group 4

It is assigned to switch connected to the SW (SW1) terminal (uses Basic command class).
Triggered by SW (SW1). Supports the following command classes:

BASIC_SET : set On / Off state at the associated device

Association group 4 supports 9 nodes.

### Group 5: Group 5

It is assigned to switch connected to the SW (SW1) terminal (uses Switch Multilevel command class).
Triggered by SW (SW1). It is recommended to use push buttons for this association. Supports the following command classes:

SWITCH\_MULTILEVEL\_START\_LEVEL\_CHANGE : initiate a transition to a new level (increase or decrease light intensity in case of dimmer, or move shutter up or down, …)

SWITCH\_MULTILEVEL\_STOP\_LEVEL\_CHANGE : stop an ongoing transition (stop increase or decrease light intensity in case of dimmer, or stop moving shutter up or down, …)

Association group 5 supports 9 nodes.

### Group 6: Group 6

It is assigned to switch connected to the SW2 terminal (uses Basic command class).
Triggered by SW2. Supports the following command classes:

BASIC_SET : set On / Off state at the associated device

Association group 6 supports 9 nodes.

### Group 7: Group 7

It is assigned to switch connected to the SW2 terminal (uses Switch Multilevel command class).
Triggered by SW2. It is recommended to use push buttons for this association. Supports the following command classes:

SWITCH\_MULTILEVEL\_START\_LEVEL\_CHANGE : initiate a transition to a new level (increase or decrease light intensity in case of dimmer, or move shutter up or down, …)

SWITCH\_MULTILEVEL\_STOP\_LEVEL\_CHANGE : stop an ongoing transition (stop increase or decrease light intensity in case of dimmer, or stop moving shutter up or down, …)

Association group 7 supports 9 nodes.

### Group 8: Group 8

It is assigned to switch connected to the SW3 terminal (uses Basic command class).
Triggered by SW3. Supports the following command classes:

BASIC_SET : set On / Off state at the associated device

Association group 8 supports 9 nodes.

### Group 9: Group 9

It is assigned to switch connected to the SW3 terminal (uses Switch Multilevel command class).
Triggered by SW3. It is recommended to use push buttons for this association. Supports the following command classes:

SWITCH\_MULTILEVEL\_START\_LEVEL\_CHANGE : initiate a transition to a new level (increase or decrease light intensity in case of dimmer, or move shutter up or down, …)

SWITCH\_MULTILEVEL\_STOP\_LEVEL\_CHANGE : stop an ongoing transition (stop increase or decrease light intensity in case of dimmer, or stop moving shutter up or down, …)

Association group 9 supports 9 nodes.

### Group 10: Group 10

It is assigned to switch connected to the SW4 terminal (uses Basic command class).
Triggered by SW4. Supports the following command classes:

BASIC_SET : set On / Off state at the associated device

Association group 10 supports 9 nodes.

### Group 11: Group 11

It is assigned to switch connected to the SW4 terminal (uses Switch Multilevel command class).
Triggered by SW4. It is recommended to use push buttons for this association. Supports the following command classes:

SWITCH\_MULTILEVEL\_START\_LEVEL\_CHANGE : initiate a transition to a new level (increase or decrease light intensity in case of dimmer, or move shutter up or down, …)

SWITCH\_MULTILEVEL\_STOP\_LEVEL\_CHANGE : stop an ongoing transition (stop increase or decrease light intensity in case of dimmer, or stop moving shutter up or down, …)c

Association group 11 supports 9 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 5

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Documentation (details at https://kb.shelly.cloud/knowledge-base/wave-i4)](https://opensmarthouse.org/zwavedatabase/1646/reference/Wave_i4_multilang_2023_V3.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1646).
