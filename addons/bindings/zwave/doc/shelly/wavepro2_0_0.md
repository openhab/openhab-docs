---
layout: documentation
title: Wave Pro 2 - ZWave
---

{% include base.html %}

# Wave Pro 2 A DIN rail mountable 2-channel smart switch with potential-free contacts
This describes the Z-Wave device *Wave Pro 2*, manufactured by *Shelly* with the thing type UID of ```shelly_wavepro2_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Wave Pro 2 product image](https://opensmarthouse.org/zwavedatabase/1622/image/)


The Wave Pro 2 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Device is a DIN rail mountable 2-channel smart switch with potential-free contacts. It controls the on/off function for two independent electrical devices with a load up to 16 A per channel (25 A in total). It is compatible with switches (default) and push-buttons.

### Inclusion Information

The blue LED will be blinking in Mode 2 during the adding process.  
The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

Adding (inclusion) with the S button:

  * Connect the Device to a power supply.
  * Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.
  * Enable add/remove mode on the gateway.
  * To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.
  * Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the Learn mode.
  * The blue LED will be blinking in Mode 2 during the adding process.
  * The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

Adding (inclusion) with a switch/push-button:

### Exclusion Information

Removing (exclusion) with the S button:

  * Connect the Device to a power supply.
  * Check if the green LED is blinking in Mode 1. If so, the Device is added to a Z-Wave® network.
  * Enable add/remove mode on the gateway.
  * To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.
  * Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the LEARN MODE.
  * The blue LED will be blinking in Mode 2 during the removing process.
  * The blue LED will be blinking in Mode 1 if the Device is successfully removed from a Z-Wave® network.

Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

Removing (exclusion) with a switch/push-button:

  * Connect the Device to a power supply.
  * Check if the green LED is blinking in Mode 1. If so, the Device is added to a Z-Wave® network.
  * Enable add/remove mode on the gateway.
  * Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2,…) 3 times within 3 seconds (this procedure puts the Device in LEARN MODE). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.
  * The blue LED will be blinking in Mode 2 during the removing process.
  * The blue LED will be blinking in Mode 1 if the Device is successfully removed from a Z-Wave® network.

### General Usage Information

**Factory reset general**

After Factory reset, all custom parameters and stored values (kWh, associations, routings, etc.) will return to their default state. HOME ID and NODE ID assigned to the Device will be deleted. Use this reset procedure only when the gateway is missing or otherwise inoperable.

Factory reset with the S button

Note! Factory reset with the S button is possible anytime.

To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.

Press the S button multiple times until the LED turns solid red.

Press and hold (> 2s) S button on the Device until the red LED starts blinking in Mode 3. Releasing the S button will start the factory reset.

During factory reset, the LED will turn solid green for about 1s, then the blue and red LED will start blinking in Mode 3 for approx. 2s.

The blue LED will be blinking in Mode 1 if the Factory reset is successful.

Factory reset with a switch/push-button

Note! Factory reset with a switch/push-button is only possible within the first minute after the Device is connected to a power supply.

Connect the Device to a power supply.

Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2,…) 5 times within 3 seconds. The Device must receive on/off signal 5 times, which means pressing the push-button 5 times, or toggling the switch on and off 5 times.

During factory reset, the LED will turn solid green for about 1s, then the blue and red LED will start blinking in Mode 3 for approx. 2s.

The blue LED will be blinking in Mode 1 if the Factory reset is successful.

Factory reset remotely with parameter with the gateway

Factory reset can be done remotely by settings in Parameter No. 120

## Channels

The following table summarises the channels available for the Wave Pro 2 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Alarm (heat) | alarm_heat | alarm_heat | temperature_hot | Switch | 
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```temperature_hot``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Switch 1
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 2
Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The following table provides a summary of the 22 configuration parameters available in the Wave Pro 2.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | SW (SW1) Switch type | This parameter defines how the Device should treat the switch (which type) connected to the SW (SW1) terminal. |
| 2 | SW2 Switch type | This parameter defines how the Device should treat the switch (which type) connected to the SW2 terminal. |
| 6 | Inputs SW1 & SW2 Swap | This parameter allows to swap the operation of switches connected to inputs SW1 and SW2 without changing the wiring. |
| 16 | Outputs O1 & O2 swap | This parameter allows to swap the operation of outputs O1 and O2 without changing the wiring (in case of an invalid motor connection) to ensure proper operation. |
| 17 | Restore state of O1 after power failure | This parameter determines if the on/off status is saved and restored for the load connected to O (O1) after a power failure. |
| 18 | Restore the O2 state after a power failure | This parameter determines if the on/off status is saved and restored for the load connected to O2 after a power failure. |
| 19 | O1 Auto OFF with timer | If the load O (O1) is ON, you can schedule it to turn OFF automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an ON command, either remotely (from the gateway or associated device) or lo |
| 20 | O (O1) Auto ON with timer | If the load O (O1) is OFF, you can schedule it to turn ON automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an OFF command, either remotely (from the gateway or associated device) or l |
| 21 | O2 Auto OFF with timer | If the load O2 is ON, you can schedule it to turn OFF automatically after the period of time defined in this parameter. The timer resets to zero each time the device receives an ON command, either remotely (from the gateway or associated device) or locall |
| 22 | O2 Auto ON with timer | If the load O2 is OFF, you can schedule it to turn ON automatically after the period of time defined in this parameter. The timer resets to zero each time the device receives an OFF command, either remotely (from the gateway or associated device) or local |
| 23 | O1 contact type - NO/NC | The set value determines the relay contact type for output O (O1). The relay contact type can be normally open (NO) or normally closed (NC). |
| 24 | O2 contact type - NO/NC | The set value determines the type of Relay contact type for O2 output. The Relay contact type can be normally open (NO) or normally closed (NC). |
| 25 | Set timer units to s or ms for O1 | Set the timer units to seconds or milliseconds. Choose if you want to set the timer in seconds or milliseconds in Parameters No. 19, 20. |
| 26 | Set timer units to s or ms for O2 | Set the timer units to seconds or milliseconds. Choose if you want to set the timer in seconds or milliseconds in Parameters No. 21, 22. |
| 91 | Water Alarm | This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification. |
| 92 | Smoke Alarm | This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification. |
| 93 | CO Alarm | This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification. |
| 94 | Heat Alarm | This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification. |
| 120 | Factory Reset | Reset to factory default settings and removed from the Z-Wave network. |
| 201 | Serial Number 1 | This parameter contains a part of device’s serial number. |
| 202 | Serial Number 2 | This parameter contains a part of device’s serial number. |
| 203 | Serial Number 3 | This parameter contains a part of device’s serial number. |

### Parameter 1: SW (SW1) Switch type

This parameter defines how the Device should treat the switch (which type) connected to the SW (SW1) terminal.

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: SW2 Switch type

This parameter defines how the Device should treat the switch (which type) connected to the SW2 terminal.

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 6: Inputs SW1 & SW2 Swap

This parameter allows to swap the operation of switches connected to inputs SW1 and SW2 without changing the wiring.

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 16: Outputs O1 & O2 swap

This parameter allows to swap the operation of outputs O1 and O2 without changing the wiring (in case of an invalid motor connection) to ensure proper operation.

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 17: Restore state of O1 after power failure

This parameter determines if the on/off status is saved and restored for the load connected to O (O1) after a power failure.

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Restore the O2 state after a power failure

This parameter determines if the on/off status is saved and restored for the load connected to O2 after a power failure.

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 19: O1 Auto OFF with timer

If the load O (O1) is ON, you can schedule it to turn OFF automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an ON command, either remotely (from the gateway or associated device) or lo

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_19_2``` and is of type ```INTEGER```.


### Parameter 20: O (O1) Auto ON with timer

If the load O (O1) is OFF, you can schedule it to turn ON automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an OFF command, either remotely (from the gateway or associated device) or l

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_20_2``` and is of type ```INTEGER```.


### Parameter 21: O2 Auto OFF with timer

If the load O2 is ON, you can schedule it to turn OFF automatically after the period of time defined in this parameter. The timer resets to zero each time the device receives an ON command, either remotely (from the gateway or associated device) or locall

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_21_2``` and is of type ```INTEGER```.


### Parameter 22: O2 Auto ON with timer

If the load O2 is OFF, you can schedule it to turn ON automatically after the period of time defined in this parameter. The timer resets to zero each time the device receives an OFF command, either remotely (from the gateway or associated device) or local

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_22_2``` and is of type ```INTEGER```.


### Parameter 23: O1 contact type - NO/NC

The set value determines the relay contact type for output O (O1). The relay contact type can be normally open (NO) or normally closed (NC).

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.


### Parameter 24: O2 contact type - NO/NC

The set value determines the type of Relay contact type for O2 output. The Relay contact type can be normally open (NO) or normally closed (NC).

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 25: Set timer units to s or ms for O1

Set the timer units to seconds or milliseconds. Choose if you want to set the timer in seconds or milliseconds in Parameters No. 19, 20.

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 26: Set timer units to s or ms for O2

Set the timer units to seconds or milliseconds. Choose if you want to set the timer in seconds or milliseconds in Parameters No. 21, 22.

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_26_1``` and is of type ```INTEGER```.


### Parameter 91: Water Alarm

This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_91_4``` and is of type ```INTEGER```.


### Parameter 92: Smoke Alarm

This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_92_4``` and is of type ```INTEGER```.


### Parameter 93: CO Alarm

This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification.

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_93_4``` and is of type ```INTEGER```.


### Parameter 94: Heat Alarm

This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_94_4``` and is of type ```INTEGER```.


### Parameter 120: Factory Reset

Reset to factory default settings and removed from the Z-Wave network.
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

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

This parameter has the configuration ID ```config_203_0``` and is of type ```INTEGER```.
This is a read only parameter.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Wave Pro 2 supports 5 association groups.

### Group 1: Association group 1

Lifeline Group reports the Device status and allows for assigning single Device only (Gateway by default)
Supports the following command classes:

INDICATOR_REPORT : LED status  
DEVICE\_RESET\_LOCALLY_NOTIFICATION : triggered upon request  
SWITCH\_BINARY\_REPORT : status change report for output O (O1)  
NOTIFICATION_REPORT : triggered on Overheat

Association group 1 supports 2 nodes.

### Group 2: Association Group 2

It is assigned to switch connected to the SW (SW1) terminal (uses Basic command class). Triggered by SW (SW1). The device sends according to the state of SW (SW1) (switch or push-button) the command BASIC\_SET ON or BASIC\_SET OFF to the associated device.
Supports the following command classes:

BASIC_SET : set On / Off state at the associated device

Association group 2 supports 9 nodes.

### Group 3: Association Group 3

It is assigned to switch connected to the SW (SW1) terminal (uses Switch Multilevel command class). Triggered by SW (SW1).
It is recommended to use push buttons for this association. Supports the following command classes:

SWITCH\_MULTILEVEL\_START\_LEVEL\_CHANGE : initiate a transition to a new level (increase or decrease light intensity in case of dimmer, or move shutter up or down, …)  
SWITCH\_MULTILEVEL\_STOP\_LEVEL\_CHANGE : stop an ongoing transition (stop increase or decrease light intensity in case of dimmer, or stop moving shutter up or down, …)

Association group 3 supports 9 nodes.

### Group 4: Association Group 4

It is assigned to switch connected to the SW2 terminal (uses Basic command class). Triggered by SW2.
Supports the following command classes:

BASIC_SET : set On / Off state at the associated device

Association group 4 supports 9 nodes.

### Group 5: Association Group 5

It is assigned to switch connected to the SW2 terminal (uses Switch Multilevel command class). Triggered by SW2.
It is recommended to use push buttons for this association. Supports the following command classes:

SWITCH\_MULTILEVEL\_START\_LEVEL\_CHANGE : initiate a transition to a new level (increase or decrease light intensity in case of dimmer, or move shutter up or down, …)  
SWITCH\_MULTILEVEL\_STOP\_LEVEL\_CHANGE : stop an ongoing transition (stop increase or decrease light intensity in case of dimmer, or stop moving shutter up or down, …)

Association group 5 supports 9 nodes.

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
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_METER_V1| |
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
| COMMAND_CLASS_METER_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Manual](https://opensmarthouse.org/zwavedatabase/1622/reference/Wave_Pro2_multilang_2023_print_V1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1622).
