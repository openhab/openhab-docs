---
layout: documentation
title: Wave 1PM Mini - ZWave
---

{% include base.html %}

# Wave 1PM Mini Z-Wave small form factor smart switch with power management
This describes the Z-Wave device *Wave 1PM Mini*, manufactured by *Shelly* with the thing type UID of ```shelly_wave1pmmini_00_000```.

The device is in the category of *Battery*, defining Batteries, Energy Storages.

![Wave 1PM Mini product image](https://opensmarthouse.org/zwavedatabase/1647/image/)


The Wave 1PM Mini supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Wave 1PM (Device) is a single product that enables the control of the on/off function for one electrical device such as bulb, ceiling fan, IR heater. It measures power consumption of the connected device. The Device is compatible with push-buttons and switches.

### Inclusion Information

On factory default the device does not belong to any Z-Wave network. The device needs to be added to an existing wireless network to communicate with the devices of this network. This process is called Inclusion.

This process is initiated by the primary controller of the Z-Wave network. This controller is turned into inclusion mode. Inclusion is then performed doing a special manual action right on the device.

SmartStart inclusion

     SmartStart enabled products can be added into a Z-Wave® network by scanning the Z-Wave® QR Code present on the Device with a gateway providing SmartStart inclusion. No further action is required, and the SmartStart device will be added automatically within 10 minutes of being switched on in the network vicinity.

     With the gateway application scan the QR code on the Device label and add the Security 2 (S2) Device Specific Key (DSK) to the provisioning list in the gateway.

  1. Connect the Device to a power supply.
  2. Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.
  3. Adding will be initiated automatically within a few seconds after connecting the Device to a power supply, and the Device will be added to a Z-Wave® network automatically.
  4. The blue LED will be blinking in Mode 2 during the adding process.
  5. The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

Inclusion with the S button

  1. Connect the Device to a power supply.
  2. Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.
  3. Enable add/remove mode on the gateway.
  4. To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.
  5. Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the Learn mode.
  6. The blue LED will be blinking in Mode 2 during the adding process.
  7. The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

Note: In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

Inclusion with a switch/push-button

  1. Connect the Device to a power supply.
  2. Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.
  3. Enable add/remove mode on the gateway.
  4. Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2, etc.) 3 times within 3 seconds (this procedure puts the Device in Learn mode*). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.
  5. The blue LED will be blinking in Mode 2 during the adding process.
  6. The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

*Learn mode - a state that allows the Device to receive network information from the gateway.

Note: All Device outputs (O, O1, O2, etc. - depending on the Device type) will turn the load 1s on/1s off /1s on/1s off if the Device is successfully added to a Z-Wave® network.

### Exclusion Information

On factory default the device does not belong to any Z-Wave network. The device needs to be added to an existing wireless network to communicate with the devices of this network. This process is called Inclusion.

This process is initiated by the primary controller of the Z-Wave network. This controller is turned into inclusion mode. Inclusion is then performed doing a special manual action right on the device.

SmartStart inclusion

     SmartStart enabled products can be added into a Z-Wave® network by scanning the Z-Wave® QR Code present on the Device with a gateway providing SmartStart inclusion. No further action is required, and the SmartStart device will be added automatically within 10 minutes of being switched on in the network vicinity.

     With the gateway application scan the QR code on the Device label and add the Security 2 (S2) Device Specific Key (DSK) to the provisioning list in the gateway.

  1. Connect the Device to a power supply.
  2. Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.
  3. Adding will be initiated automatically within a few seconds after connecting the Device to a power supply, and the Device will be added to a Z-Wave® network automatically.
  4. The blue LED will be blinking in Mode 2 during the adding process.
  5. The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

Inclusion with the S button

  1. Connect the Device to a power supply.
  2. Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.
  3. Enable add/remove mode on the gateway.
  4. To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.
  5. Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the Learn mode.
  6. The blue LED will be blinking in Mode 2 during the adding process.
  7. The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

Note: In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

Inclusion with a switch/push-button

  1. Connect the Device to a power supply.
  2. Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.
  3. Enable add/remove mode on the gateway.
  4. Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2, etc.) 3 times within 3 seconds (this procedure puts the Device in Learn mode*). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.
  5. The blue LED will be blinking in Mode 2 during the adding process.
  6. The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

*Learn mode - a state that allows the Device to receive network information from the gateway.

Note: All Device outputs (O, O1, O2, etc. - depending on the Device type) will turn the load 1s on/1s off /1s on/1s off if the Device is successfully added to a Z-Wave® network.

### General Usage Information



## Channels

The following table summarises the channels available for the Wave 1PM Mini -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Reset the total power consumption | meter_reset | meter_reset | Energy | Switch | 
| Alarm (heat) | alarm_heat | alarm_heat | temperature_hot | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Reset the total power consumption
Reset the meter.

The ```meter_reset``` channel is of type ```meter_reset``` and supports the ```Switch``` item and is in the ```Energy``` category.

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```temperature_hot``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 14 configuration parameters available in the Wave 1PM Mini.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | SW (SW1) Switch type | This parameter defines as what type the device should treat the switch connected to the SW (SW1) terminal. |
| 17 | Restore state of O (O1) after power failure | This parameter determines if on/off status is saved and restored for load connected to O (O1) after power failure. |
| 19 |  O (O1) Auto OFF with timer | If Load O (O1) is ON, you can schedule it to turn OFF automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an ON command, either remotely (from the Gateway or associated device) or local |
| 20 | O (O1) Auto ON with timer | If Load O (O1) is OFF, you can schedule it to turn ON automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an OFF command, either remotely (from the Gateway or associated device) or local |
| 23 |  O (O1) contact type - NO/NC | Set value determines the type of Relay contact type for O (O1) output. The Relay contact type can be normally open (NO) or normally closed (NC). |
| 25 | Set timer units to s or ms for O (O1) | Set Timer Units to Seconds or Milliseconds Choose if you want to set the timer in seconds or milliseconds in Parameters No. 19, 20. |
| 36 | O (O1) Power report on change - percentage | This parameter determines the minimum change in consumed power that will result in sending new report to the main controller. |
| 39 | Minimal time between reports (O) O1 | This parameter determines minimum time that has to elapse before sending new power report on O (O1) to the main controller. |
| 91 | Water Alarm | This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification. |
| 92 | Smoke Alarm | This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification. |
| 93 | CO Alarm | This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification. |
| 94 | Heat Alarm | This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification. |
| 119 | Reset Parameters to default | Reset all configuration parameters to factory default settings. This is a parameter to reset only configuration parameters, after reseting parameters the Device will do power cycle, the device remain included. |
| 120 | Factory Reset | Reset to factory default settings and removed from the z-wave network |

### Parameter 1: SW (SW1) Switch type

This parameter defines as what type the device should treat the switch connected to the SW (SW1) terminal.

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | momentary switch |
| 1 | toggle switch (contact closed - ON / contact opened - OFF) |
| 2 | toggle switch (device changes status when switch changes status) |

The manufacturer defined default value is ```2``` (	toggle switch (device changes status when switch changes status)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 17: Restore state of O (O1) after power failure

This parameter determines if on/off status is saved and restored for load connected to O (O1) after power failure.

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Device saves last on/off status and restores it after a power failure |
| 1 | Device does not save on/off status and does not restore it after a pow |

The manufacturer defined default value is ```0``` (Device saves last on/off status and restores it after a power failure).

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 19:  O (O1) Auto OFF with timer

If Load O (O1) is ON, you can schedule it to turn OFF automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an ON command, either remotely (from the Gateway or associated device) or local
0 : Auto ON Disabled

1 - 32535 : seconds (or milliseconds – see Parameter no. 25. Auto ON timer enabled for a given amount of seconds (or milliseconds) resolution 100ms
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_19_2``` and is of type ```INTEGER```.


### Parameter 20: O (O1) Auto ON with timer

If Load O (O1) is OFF, you can schedule it to turn ON automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an OFF command, either remotely (from the Gateway or associated device) or local
0 : Auto ON Disabled

1 - 32535 : (or milliseconds – see Parameter no. 25. Auto ON timer enabled for a given amount of seconds (or milliseconds) resolution 100ms
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_20_2``` and is of type ```INTEGER```.


### Parameter 23:  O (O1) contact type - NO/NC

Set value determines the type of Relay contact type for O (O1) output. The Relay contact type can be normally open (NO) or normally closed (NC).

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | NO - normally open |
| 1 | NC - normally closed |

The manufacturer defined default value is ```0``` (NO - normally open).

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.


### Parameter 25: Set timer units to s or ms for O (O1)

Set Timer Units to Seconds or Milliseconds Choose if you want to set the timer in seconds or milliseconds in Parameters No. 19, 20.

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | timer set in seconds |
| 1 | timer set in milliseconds |

The manufacturer defined default value is ```0``` (timer set in seconds).

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 36: O (O1) Power report on change - percentage

This parameter determines the minimum change in consumed power that will result in sending new report to the main controller.
0 : reports are disabled

1 - 100 : % change in power
Values in the range 0 to 10 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_36_1``` and is of type ```INTEGER```.


### Parameter 39: Minimal time between reports (O) O1

This parameter determines minimum time that has to elapse before sending new power report on O (O1) to the main controller.
0 : reports are disabled

1 - 120 : report interval in sThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_39_1``` and is of type ```INTEGER```.


### Parameter 91: Water Alarm

This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification.
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
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
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
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
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
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
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
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
The following option values may be configured, in addition to values in the range 1431655765 to 0 -:

| Value  | Description |
|--------|-------------|
| 0 | Don’t do Factory reset |
| 1431655765 | Do the Factory reset (hex 0x55555555) |

The manufacturer defined default value is ```0``` (Don’t do Factory reset).

This parameter has the configuration ID ```config_120_4``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Wave 1PM Mini supports 3 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline


Association group 1 supports 9 nodes.

### Group 2: Switch 1 - Basic ON/OFF

Switch 1 - Basic ON/OFF

Association group 2 supports 9 nodes.

### Group 3: Switch 1 - Multilevel

Switch 1 - Multilevel

Association group 3 supports 9 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V3| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |

### Documentation Links

* [Manual](https://opensmarthouse.org/zwavedatabase/1647/reference/Wave_1PM_mini_user_guide_multilang_V3.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1647).
