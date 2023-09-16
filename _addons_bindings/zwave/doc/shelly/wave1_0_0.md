---
layout: documentation
title: Wave 1 - ZWave
---

{% include base.html %}

# Wave 1 Z-Wave smart switch, potential-free output contact (dry contact)
This describes the Z-Wave device *Wave 1*, manufactured by *Shelly* with the thing type UID of ```shelly_wave1_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Wave 1 product image](https://opensmarthouse.org/zwavedatabase/1579/image/)


The Wave 1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Device controls on/off function for one electrical device, e.g., bulb, ceiling fan, IR heater, electrical locks, garage doors, irrigation system, etc. The output contact is potential-free (dry contact), so different power supply loads (up to 16 A) can be connected to the Device. It is compatible with push-buttons and switches (default).

### Inclusion Information

**SmartStart adding (inclusion)**

SmartStart enabled products can be added into a Z-Wave™ network by scanning the Z-Wave™ QR Code present on the Device with a gateway providing SmartStart inclusion. No further action is required, and the SmartStart device will be added automatically within 10 minutes of being switched on in the network vicinity.

With the gateway application scan the QR code on the Device label and add the Security 2 (S2) Device Specific Key (DSK) to the provisioning list in the gateway.

Connect the Device to a power supply.

Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave™ network.

Adding will be initiated automatically within a few seconds after connecting the Device to a power supply, and the Device will be added to a Z-Wave™ network automatically.

The blue LED will be blinking in Mode 2 during the adding process.

The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave™ network.

  


**Adding (inclusion) with the S button**

Connect the Device to a power supply.

Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave™ network.

Enable add/remove mode on the gateway.

To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.

Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the Learn mode.

The blue LED will be blinking in Mode 2 during the adding process.

The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave™ network.

_Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode._

_  
_ 

**Adding (inclusion) with a switch/push-button**

Connect the Device to a power supply.

Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave™ network.

Enable add/remove mode on the gateway.

Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2, etc.) 3 times within 3 seconds (this procedure puts the Device in Learn mode*). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.

The blue LED will be blinking in Mode 2 during the adding process.

The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave™ network.

*Learn mode - a state that allows the Device to receive network information from the gateway.

### Exclusion Information

**Removing (exclusion) with the S button**

Connect the Device to a power supply.

Check if the green LED is blinking in Mode 1. If so, the Device is added to a Z-Wave™ network.

Enable add/remove mode on the gateway.

To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.

Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the LEARN MODE.

The blue LED will be blinking in Mode 2 during the removing process.

The blue LED will be blinking in Mode 1 if the Device is successfully removed from a Z-Wave™ network.

_Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode._

_  
_ 

**Removing (exclusion) with a switch/push-button**

Connect the Device to a power supply.

Check if the green LED is blinking in Mode 1. If so, the Device is added to a Z-Wave™ network.

Enable add/remove mode on the gateway.

Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2,…) 3 times within 3 seconds (this procedure puts the Device in LEARN MODE). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.

The blue LED will be blinking in Mode 2 during the removing process.

The blue LED will be blinking in Mode 1 if the Device is successfully removed from a Z-Wave™ network.

### General Usage Information

https://manual.zwave.eu/backend/make.php?lang=EN&sku=ALREZWE\_W\_1

## Channels

The following table summarises the channels available for the Wave 1 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Alarm (heat) | alarm_heat | alarm_heat | Fire | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```Fire``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 15 configuration parameters available in the Wave 1.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | SW (SW1) Switch type | Type of switch connected to the SW (SW1) terminal. |
| 17 | State of O (O1) after power failure | save and restore status (on/off) after power failure |
| 19 | O (O1) Auto OFF with timer | turn OFF automatically after period defined |
| 20 | O (O1) Auto ON timer | turn ON automatically after period defined |
| 23 | O (O1) contact type - NO/NC | Relay contact type |
| 25 | Timer units | Set timer units to seconds or milliseconds |
| 91 | Water Alarm | Reaction of relay to water alarm |
| 92 | Smoke Alarm | Reaction of relay to smoke alarm |
| 93 | CO Alarm | Reaction of relay to CO Alarm |
| 94 | Heat Alarm | Reaction of relay to Heat Alarm |
| 105 | LED intensity | Intensity of LED on the device |
| 120 | Factory Reset | Reset to factory default settings |
| 201 | Serial Number 1 | Contains a part of device’s serial number |
| 202 | Serial Number 2 | Contains a part of device’s serial number |
| 203 | Serial Number 3 | Contains a part of device’s serial number |

### Parameter 1: SW (SW1) Switch type

Type of switch connected to the SW (SW1) terminal.
This parameter defines how the Device should treat the switch (which type) connected to the SW (SW1) terminal.
The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | momentary switch |
| 1 | toggle switch (closed - ON / opened - OFF) |
| 2 | toggle switch (device changes status with switch) |

The manufacturer defined default value is ```2``` (toggle switch (device changes status with switch)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 17: State of O (O1) after power failure

save and restore status (on/off) after power failure
This parameter determines if the on/off status is saved and restored for the load connected to O (O1) after a power failure.
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | device saves and restores status |
| 1 | status is not saved and restored |

The manufacturer defined default value is ```0``` (device saves and restores status).

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 19: O (O1) Auto OFF with timer

turn OFF automatically after period defined
If the load O (O1) is ON, you can schedule it to turn OFF automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an ON command, either remotely (from the gateway or associated device) or locally from the switch.  


1 - 32535 = 1 - 32535 seconds (or milliseconds – see Parameter no. 25. Auto OFF timer enabled for a given amount of seconds (or milliseconds) resolution 100ms
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | auto OFF disabled |

The manufacturer defined default value is ```0``` (auto OFF disabled).

This parameter has the configuration ID ```config_19_2``` and is of type ```INTEGER```.


### Parameter 20: O (O1) Auto ON timer

turn ON automatically after period defined
If the load O (O1) is OFF, you can schedule it to turn ON automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an OFF command, either remotely (from the gateway or associated device) or locally from the switch.  


1 - 32535 = 1 - 32535 seconds (or milliseconds – see Parameter no. 25. Auto ON timer enabled for a given amount of seconds (or milliseconds) resolution 100ms
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | auto ON disabled |

The manufacturer defined default value is ```0``` (auto ON disabled).

This parameter has the configuration ID ```config_20_2``` and is of type ```INTEGER```.


### Parameter 23: O (O1) contact type - NO/NC

Relay contact type
The set value determines the relay contact type for output O (O1). The relay contact type can be normally open (NO) or normally closed (NC).
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | NO |
| 1 | NC |

The manufacturer defined default value is ```0``` (NO).

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.


### Parameter 25: Timer units

Set timer units to seconds or milliseconds
Set the timer units to seconds or milliseconds. Choose if you want to set the timer in seconds or milliseconds in Parameters No. 19, 20.
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | timer set in seconds |
| 1 | timer set in milliseconds |

The manufacturer defined default value is ```0``` (timer set in seconds).

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 91: Water Alarm

Reaction of relay to water alarm
This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.
The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | no action |
| 1 | open relay |
| 2 | close relay |

The manufacturer defined default value is ```0``` (no action).

This parameter has the configuration ID ```config_91_4``` and is of type ```INTEGER```.


### Parameter 92: Smoke Alarm

Reaction of relay to smoke alarm
This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.
The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | no action |
| 1 | open relay |
| 2 | close relay |

The manufacturer defined default value is ```0``` (no action).

This parameter has the configuration ID ```config_92_4``` and is of type ```INTEGER```.


### Parameter 93: CO Alarm

Reaction of relay to CO Alarm
This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification.
The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | no action |
| 1 | open relay |
| 2 | close relay |

The manufacturer defined default value is ```0``` (no action).

This parameter has the configuration ID ```config_93_4``` and is of type ```INTEGER```.


### Parameter 94: Heat Alarm

Reaction of relay to Heat Alarm
This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.
The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | no action |
| 1 | open relay |
| 2 | close relay |

The manufacturer defined default value is ```0``` (no action).

This parameter has the configuration ID ```config_94_4``` and is of type ```INTEGER```.


### Parameter 105: LED intensity

Intensity of LED on the device
This parameter determines the intensity of the LED on the Device. Some Devices have RGB LEDs and some have Blue/Red LEDs, but all are dimmable.  


_Note: Wave 1, Wave 1PM and Wave 2PM, this parameter will be implemented in 2024._
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_105_1``` and is of type ```INTEGER```.


### Parameter 120: Factory Reset

Reset to factory default settings
Reset to factory default settings and removed from the Z-Wave network.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | no reset |
| 1 | reset |

The manufacturer defined default value is ```0``` (no reset).

This parameter has the configuration ID ```config_120_1``` and is of type ```INTEGER```.


### Parameter 201: Serial Number 1

Contains a part of device’s serial number
This parameter contains a part of device’s serial number.

The parameter is Read-Only and cannot be changed.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_201_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 202: Serial Number 2

Contains a part of device’s serial number
This parameter contains a part of device’s serial number.

The parameter is Read-Only and cannot be changed.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_202_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 203: Serial Number 3

Contains a part of device’s serial number
This parameter contains a part of device’s serial number.

The parameter is Read-Only and cannot be changed.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_203_4``` and is of type ```INTEGER```.
This is a read only parameter.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Wave 1 supports 3 association groups.

### Group 1: Lifeline Group

Lifeline Group for Controller
**Association group 1**

Lifeline Group reports the Device status and allows for assigning single Device only (Gateway by default), 1 node allowed only. Supports the following command classes:

INDICATOR_REPORT : LED status

DEVICE\_RESET\_LOCALLY_NOTIFICATION : triggered upon request

SWITCH\_BINARY\_REPORT : status change report for output O (O1)

NOTIFICATION_REPORT : triggered on Overheat

Association group 1 supports 1 node.

### Group 2: Switch 1 - Basic On/Off

Switch 1 (SW1) Basic On/Off
**Association Group 2**

It is assigned to switch connected to the SW (SW1) terminal (uses Basic command class).

Triggered by SW (SW1). The device sends according to the state of SW (SW1) (switch or push-button) the command BASIC\_SET ON or BASIC\_SET OFF to the associated device. This command is reflected to the output of associated device.Supports the following command classes:

BASIC_SET : set On / Off state at the associated device

Association group 2 supports 9 nodes.

### Group 3: Switch 1 - Multilevel

Switch 1 (SW1) Multilevel
**Association Group 3**

It is assigned to switch connected to the SW (SW1) terminal (uses multilevel start / stop command class).

Triggered by SW (SW1). The device sends according to the state of SW (SW1) (switch or push-button) the command SWITCH\_MULTILEVEL\_START\_LEVEL\_CHANGE or SWITCH\_MULTILEVEL\_STOP\_LEVEL\_CHANGE to the associated device. Supports the following command classes:

SWITCH\_MULTILEVEL\_START\_LEVEL\_CHANGE : initiate a transition to a new level

SWITCH\_MULTILEVEL\_STOP\_LEVEL\_CHANGE : stop an ongoing transition

Association group 3 supports 9 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V2| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
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

### Documentation Links

* [Shelly_Wave_1_PDF](https://opensmarthouse.org/zwavedatabase/1579/reference/Wave_1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1579).
