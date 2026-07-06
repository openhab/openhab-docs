---
layout: documentation
title: Wave Pro 1 - ZWave
---

{% include base.html %}

# Wave Pro 1 Smart 1-Channel DIN-Rail Z-Wave Switch
This describes the Z-Wave device *Wave Pro 1*, manufactured by *Shelly* with the thing type UID of ```shelly_wavepro1_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Wave Pro 1 product image](https://opensmarthouse.org/zwavedatabase/1696/image/)


The Wave Pro 1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Device is a DIN rail mountable 1-channel smart switch with potential-free contact. It controls the on/off function for one electrical device with a load up to 16A. It is compatible with switches (default) and push-buttons.

### Inclusion Information

**SmartStart adding (inclusion)**

SmartStart enabled products can be added into a Z-Wave® network by scanning the Z-Wave® QR Code present on the Device with a gateway providing SmartStart inclusion. No further action is required, and the SmartStart device will be added automatically within 10 minutes of being switched on in the network vicinity.

  1. With the gateway application scan the QR code on the Device label and add the Security 2 (S2) Device Specific Key (DSK) to the provisioning list in the gateway.
  2. Connect the Device to a power supply.
  3. Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.
  4. Adding will be initiated automatically within a few seconds after connecting the Device to a power supply, and the Device will be added to a Z-Wave® network automatically.
  5. The blue LED will be blinking in Mode 2 during the adding process.
  6. The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

  


**Adding (inclusion) with the S button**

  1. Connect the Device to a power supply.
  2. Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.
  3. Enable add/remove mode on the gateway.
  4. To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.
  5. Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the Learn mode.
  6. The blue LED will be blinking in Mode 2 during the adding process.
  7. The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

**Adding (inclusion) with a switch/push-button**

  1. Connect the Device to a power supply.
  2. Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.
  3. Enable add/remove mode on the gateway.
  4. Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2, etc.) 3 times within 3 seconds (this procedure puts the Device in Learn mode*). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.
  5. The blue LED will be blinking in Mode 2 during the adding process.
  6. The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

### Exclusion Information

**Removing (exclusion) with the S button**

  1. Connect the Device to a power supply.
  2. Check if the green LED is blinking in Mode 1. If so, the Device is added to a Z-Wave® network.
  3. Enable add/remove mode on the gateway.
  4. To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.
  5. Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the LEARN MODE.
  6. The blue LED will be blinking in Mode 2 during the removing process.
  7. The blue LED will be blinking in Mode 1 if the Device is successfully removed from a Z-Wave® network.Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

  


**Removing (exclusion) with a switch/push-button**

  1. Connect the Device to a power supply.
  2. Check if the green LED is blinking in Mode 1. If so, the Device is added to a Z-Wave® network.
  3. Enable add/remove mode on the gateway.
  4. Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2,…) 3 times within 3 seconds (this procedure puts the Device in LEARN MODE). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.
  5. The blue LED will be blinking in Mode 2 during the removing process.
  6. The blue LED will be blinking in Mode 1 if the Device is successfully removed from a Z-Wave® network.

### General Usage Information



## Channels

The following table summarises the channels available for the Wave Pro 1 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Alarm (heat) | alarm_heat | alarm_heat | temperature_hot | Switch | 

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



## Device Configuration

The following table provides a summary of the 13 configuration parameters available in the Wave Pro 1.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 |  SW (SW1) Switch type | This parameter defines as what type the device should treat the switch connected to the SW (SW1) terminal. |
| 2 | SW (SW2) Switch type | This parameter defines as what type the device should treat the switch connected to the SW (SW2) terminal. |
| 17 | Restore state of O (O1) after power failure | This parameter determines if on/off status is saved and restored for load connected to O (O1) after power failure. |
| 19 | O (O1) Auto OFF with timer | If Load O (O1) is ON, you can schedule it to turn OFF automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an ON command, either remotely (from the Gateway or associated device) or locall |
| 20 | O (O1) Auto ON with timer | If Load O (O1) is OFF, you can schedule it to turn ON automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an OFF command, either remotely (from the Gateway or associated device) or local |
| 23 | O (O1) contact type - NO/NC | Set value determines the type of Relay contact type for O (O1) output. The Relay contact type can be normally open (NO) or normally closed (NC). |
| 25 | Set timer units to s or ms for O (O1) | Set Timer Units to Seconds or Milliseconds Choose if you want to set the timer in seconds or milliseconds in Parameters No. 19, 20. |
| 91 | Water Alarm | This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification. |
| 92 | Smoke Alarm | This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification. |
| 93 | CO Alarm | This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification. |
| 94 | Heat Alarm | This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification. |
| 119 | Reset Parameters to default | Reset all configuration parameters to factory default settings. This is a parameter to reset only configuration parameters, after reseting parameters the Device will do power cycle, the device remain included. |
| 120 | Factory Reset | Reset to factory default settings and removed from the z-wave network |

### Parameter 1:  SW (SW1) Switch type

This parameter defines as what type the device should treat the switch connected to the SW (SW1) terminal.

The following option values may be configured, in addition to values in the range 1 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | momentary switch |
| 1 | toggle switch (contact closed - ON / contact opened - OFF) |
| 2 | toggle switch (device changes status when switch changes status) |

The manufacturer defined default value is ```2``` (toggle switch (device changes status when switch changes status)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: SW (SW2) Switch type

This parameter defines as what type the device should treat the switch connected to the SW (SW2) terminal.

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | momentary switch |
| 1 | toggle switch (contact closed - ON / contact opened - OFF) |
| 2 | toggle switch (device changes status when switch changes status) |

The manufacturer defined default value is ```2``` (toggle switch (device changes status when switch changes status)).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 17: Restore state of O (O1) after power failure

This parameter determines if on/off status is saved and restored for load connected to O (O1) after power failure.

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Device saves last on/off status and restores it after a power failure |
| 1 | Device does not save on/off status and does not restore it after a pow |

The manufacturer defined default value is ```0``` (	Device saves last on/off status and restores it after a power failure).

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 19: O (O1) Auto OFF with timer

If Load O (O1) is ON, you can schedule it to turn OFF automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an ON command, either remotely (from the Gateway or associated device) or locall

Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_19_2``` and is of type ```INTEGER```.


### Parameter 20: O (O1) Auto ON with timer

If Load O (O1) is OFF, you can schedule it to turn ON automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an OFF command, either remotely (from the Gateway or associated device) or local

Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_20_2``` and is of type ```INTEGER```.


### Parameter 23: O (O1) contact type - NO/NC

Set value determines the type of Relay contact type for O (O1) output. The Relay contact type can be normally open (NO) or normally closed (NC).

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | NO |

The manufacturer defined default value is ```0``` (NO).

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.


### Parameter 25: Set timer units to s or ms for O (O1)

Set Timer Units to Seconds or Milliseconds Choose if you want to set the timer in seconds or milliseconds in Parameters No. 19, 20.

The following option values may be configured, in addition to values in the range 0 to 0 -:

| Value  | Description |
|--------|-------------|
| 0 | timer set in seconds |
| 1 | timer set in milliseconds |

The manufacturer defined default value is ```0``` (timer set in seconds).

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 91: Water Alarm

This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification.

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | no action |
| 1 | open relay |
| 2 | close relay |

The manufacturer defined default value is ```0``` (no action).

This parameter has the configuration ID ```config_91_4``` and is of type ```INTEGER```.


### Parameter 92: Smoke Alarm

This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification.

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | no action |
| 1 | open relay |
| 2 | close relay |

The manufacturer defined default value is ```0``` (no action).

This parameter has the configuration ID ```config_92_4``` and is of type ```INTEGER```.


### Parameter 93: CO Alarm

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

This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification.

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | no action |
| 1 | open relay |
| 2 | close relay |

The manufacturer defined default value is ```0``` (no action).

This parameter has the configuration ID ```config_94_4``` and is of type ```INTEGER```.


### Parameter 119: Reset Parameters to default

Reset all configuration parameters to factory default settings. This is a parameter to reset only configuration parameters, after reseting parameters the Device will do power cycle, the device remain included.
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Do not reset |
| 1 | Reset parameters to default value |

The manufacturer defined default value is ```0``` (Do not reset).

This parameter has the configuration ID ```config_119_1``` and is of type ```INTEGER```.


### Parameter 120: Factory Reset

Reset to factory default settings and removed from the z-wave network
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 1431655765 -:

| Value  | Description |
|--------|-------------|
| 0 | Don’t do Factory reset |
| 1431655765 | Do the Factory reset (hex 0x55555555) |

The manufacturer defined default value is ```0``` (Don’t do Factory reset).

This parameter has the configuration ID ```config_120_4``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Wave Pro 1 supports 5 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline

Association group 1 supports 9 nodes.

### Group 2: Basic ON /OFF

It is assigned to switch connected to the SW (SW1) terminal

Association group 2 supports 9 nodes.

### Group 3: Switch Multilevel

It is assigned to switch connected to the SW (SW1) terminal

Association group 3 supports 9 nodes.

### Group 4: Basic ON/OFF

It is assigned to switch connected to the SW2 terminal

Association group 4 supports 9 nodes.

### Group 5: Switch Multilevel

It is assigned to switch connected to the SW (SW2) terminal

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

* [Manual](https://opensmarthouse.org/zwavedatabase/1696/reference/Shelly-WavePro1-Manual_EN.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1696).
