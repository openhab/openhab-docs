---
layout: documentation
title: High load switch - ZWave
---

{% include base.html %}

# High load switch In wall micromodule single switch
This describes the Z-Wave device *High load switch*, manufactured by *[Sunricher](www.sunricher.com)* with the thing type UID of ```sunricher_highloadswitch_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![High load switch product image](https://opensmarthouse.org/zwavedatabase/1582/image/)


The High load switch supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Product Description

The in-wall switch is a Z-Wave device that is used to switch ON/OFF the connected light or electrical appliances and can be controlled by other Z-Wave devices. The In-wall switch can be included and operated in any Z-Wave network with other Z-Wave certified devices from other manufacturers and/or other applications. All non-battery operated nodes within the network will act as repeaters regardless of vendor to increase reliability of the network.

This device supports the SmartStart inclusion. SmartStart enabled products can be added into a Z-Wave network by scanning the Z-Wave QR Code present on the product with a controller providing SmartStart inclusion. No further action is required and the SmartStart product will be added automatically within a period after the QR code being scanned or reset power of the device. Please find the QR code on the device casing.

The encryption mode that the switch supports is S2 Unauthenticated. When the switch is being included into a Z-Wave network, you can use your primary controller/gateway to enable encryption mode or disable encryption. (The primary controller/gateway shall support encryption mode configuration). The switch supports OTA and can update firmware wirelessly. In addition, the switch is equipped with Power Metering and over current protection.  


Z-Wave Frequency . 868 42 MHZ (EU)

Input Voltage AC100-240V

Output Voltage AC100-240V

Output Current 16A max.

Operating temperature 0 to 40°C

Relative humidity 8% to 80%

Dimensions 45.5x45x20.3mm

### Inclusion Information

Inclusion (adding to a Z-Wave network)

  1. Set primary controller/gateway into inclusion mode (Please refer to your primary controllers manual on how to turn your controller into inclusion).
  2. Power on the in-wall switch and set it into inclusion mode. There are two methods to set the in-wall switch into inclusion mode:
      1. Triple press the action button on the switch, LED indicator will flash rapidly, it will set the switch into inclusion mode for 30 seconds, if there is no reply from the gateway, the device will quit inclusion mode after 30 seconds.
      2. When the value of parameter 5 is configured as 1, triple press the external switch rapidly within 1.5 seconds, LED indicator will flash rapidly, it will set the switch into inclusion mode for 30 seconds, if there is no reply from the gateway, the device will quit inclusion mode after 30 seconds.

The LED indicator will stay solid on for 3 seconds if the device is added to the network successfully. The indicator will turn off if inclusion fails.

### Exclusion Information

Exclusion (removing from a Z-Wave network)

There are two exclusion methods:

Method 1: Exclusion from the primary controller/gateway as follows:

  1. Set the primary controller/gateway into exclusion mode (Please refer to your primary controllers manual on how to set your controller into exclusion).
  2. Power on the in-wall switch and set it into exclusion mode. There are two methods to set the in-wall switch into exclusion mode:
      1. Triple press the action button on the switch, LED indicator will flash rapidly, it will set the switch into exclusion mode for 30 seconds, if there is no reply from the gateway, the device will quit exclusion mode after 30 seconds.
      2. When the value of parameter 5 is configured as 1, triple press the external switch rapidly within 1.5 seconds, LED indicator will flash rapidly, it will set the switch into exclusion mode for 30 seconds, if there is no reply from the gateway, the device will quit exclusion mode after 30 seconds.

The LED indicator will stay solid on for 3 seconds if the device is removed from the network successfully. The indicator will turn off if exclusion fails.

Method 2: Factory reset the switch will force the switch to be excluded from a network. (please refer to the part "Factory Reset" of this manual)

Note: Factory reset is not recommended for exclusion, please use this procedure only if the primary controller/gateway is missing or otherwise inoperable.

Factory Reset

Press and hold down the action button for over 10 seconds, LED indicator flashes slowly, the switch will restart and reset to factory defaults.

### General Usage Information

This unit is unusual in 2 ways:

  1. The inbuilt relay switches the Live feed as is convention.  However the external switch/switches are wired using a neutral circuit.  This means care has to be taken when adding to a new location where a standard wall switch has been installed as they will be within the live circuit.
  2. The connections to the inbuilt relay need 2 live feeds to be wired in and 2 live feeds out.  This means there are a lot of live connections to be made.  As the unit is not the smallest take care re the depth of the backbox and/or consider using Wago connectors as they take up very little space.

## Channels

The following table summarises the channels available for the High load switch -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Scene Number | scene_number | scene_number |  | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (kVAh) | meter_kvah | meter_kvah | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kVAh)
Indicates the energy consumption (kVAh).

The ```meter_kvah``` channel is of type ```meter_kvah``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps)
Indicates the instantaneous current consumption.

The ```meter_current``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

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
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_METER_V3| |
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

* [VES-ZW-HLD-016 high load switch instructions](https://opensmarthouse.org/zwavedatabase/1582/reference/VES-ZW-HLD-016_high_load_switch_instructions.pdf)
* [VES-ZW-HLD-016 high load switch instructions](https://opensmarthouse.org/zwavedatabase/1582/reference/VES-ZW-HLD-016_high_load_switch_instructions_1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1582).
