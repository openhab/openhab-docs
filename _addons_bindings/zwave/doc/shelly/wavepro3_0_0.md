---
layout: documentation
title: Wave Pro 3 - ZWave
---

{% include base.html %}

# Wave Pro 3 A DIN rail mountable 3-channel smart switch with potential-free contacts
This describes the Z-Wave device *Wave Pro 3*, manufactured by *Shelly* with the thing type UID of ```shelly_wavepro3_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Wave Pro 3 product image](https://opensmarthouse.org/zwavedatabase/1661/image/)


The Wave Pro 3 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Device is a DIN rail mountable 3-channel smart switch with potential-free contacts. It controls the on/off function for three independent electrical devices with a load up to 16 A per channel (48 A in total). It is compatible with switches (default) and push-buttons.

### Inclusion Information

SmartStart adding (inclusion)

SmartStart enabled products can be added into a Z-Wave® network by scanning the Z-Wave® QR Code present on the Device with a gateway providing SmartStart inclusion. No further action is required, and the SmartStart device will be added automatically within 10 minutes of being switched on in the network vicinity.

With the gateway application scan the QR code on the Device label and add the Security 2 (S2) Device Specific Key (DSK) to the provisioning list in the gateway.

Connect the Device to a power supply.

Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.

Adding will be initiated automatically within a few seconds after connecting the Device to a power supply, and the Device will be added to a Z-Wave® network automatically.

The blue LED will be blinking in Mode 2 during the adding process.

The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

Adding (inclusion) with the S button (*not available for Long Range inclusion)

Connect the Device to a power supply.

Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.

Enable add/remove mode on the gateway.

To enter the Setting mode, press and hold the S button on the Device until the LED turns solid blue.

Release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the Learn mode.

The blue LED will be blinking in Mode 2 during the adding process.

The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

### Exclusion Information

Removing (exclusion) with the S button

Connect the Device to a power supply.

Check if the green LED is blinking in Mode 1. If so, the Device is added to a Z-Wave® network.

Enable add/remove mode on the gateway.

To enter the Setting mode, press and hold the S button on the Device until the LED turns solid blue.

Release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the Learn mode.

The blue LED will be blinking in Mode 2 during the removing process.

The blue LED will be blinking in Mode 1 if the Device is successfully removed from a Z-Wave® network.

Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

Removing (exclusion) with a switch/push-button

Connect the Device to a power supply.

Check if the green LED is blinking in Mode 1. If so, the Device is added to a Z-Wave® network.

Enable add/remove mode on the gateway.

Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2,…) 3 times within 3 seconds (this procedure puts the Device in Learn mode). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.

The blue LED will be blinking in Mode 2 during the removing process.

The blue LED will be blinking in Mode 1 if the Device is successfully removed from a Z-Wave® network.

### General Usage Information

Factory reset general

After Factory reset, all custom parameters and stored values (kWh, associations, routings, etc.) will return to their default state. HOME ID and NODE ID assigned to the Device will be deleted. Use this reset procedure only when the gateway is missing or otherwise inoperable.

Factory reset with the S button

Note! Factory reset with the S button is possible anytime.

To enter the Setting mode, press and hold the S button on the Device until the LED turns solid blue.

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

## Channels

The following table summarises the channels available for the Wave Pro 3 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Alarm (heat) | alarm_heat | alarm_heat | temperature_hot | Switch | 
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Alarm (heat) 1 | alarm_heat1 | alarm_heat | temperature_hot | Switch | 
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch | 
| Alarm (heat) 2 | alarm_heat2 | alarm_heat | temperature_hot | Switch | 
| Switch 3 | switch_binary3 | switch_binary | Switch | Switch | 
| Alarm (heat) 3 | alarm_heat3 | alarm_heat | temperature_hot | Switch | 

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

### Alarm (heat) 1
Indicates if a heat alarm is triggered.

The ```alarm_heat1``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```temperature_hot``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Switch 2
Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Alarm (heat) 2
Indicates if a heat alarm is triggered.

The ```alarm_heat2``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```temperature_hot``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Switch 3
Switch the power on and off.

The ```switch_binary3``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Alarm (heat) 3
Indicates if a heat alarm is triggered.

The ```alarm_heat3``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```temperature_hot``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The device does not support associations.
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
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ALARM_V8| |
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
| COMMAND_CLASS_ALARM_V8| |
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
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Manual](https://opensmarthouse.org/zwavedatabase/1661/reference/Wave_Pro3_user_guide_multilang_V11_CE_cert.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1661).
