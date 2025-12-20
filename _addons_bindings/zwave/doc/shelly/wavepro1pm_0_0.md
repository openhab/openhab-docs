---
layout: documentation
title: Wave Pro 1PM - ZWave
---

{% include base.html %}

# Wave Pro 1PM The Device is a DIN rail mountable 1-channel smart switch with power measurement. It controls the on/off function for one electrical device
This describes the Z-Wave device *Wave Pro 1PM*, manufactured by *Shelly* with the thing type UID of ```shelly_wavepro1pm_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Wave Pro 1PM product image](https://opensmarthouse.org/zwavedatabase/1682/image/)


The Wave Pro 1PM supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Device is a DIN rail mountable smart switch with power measurement. It controls the on/off function for one electrical device with a load up to 16 A. It is compatible with switches (default) and push-buttons.

Switch connected to input terminal SW (SW1)

If the SW (SW1) is configured as a switch (default), each toggle of the switch will change the output O (O1) state to the opposite state - on, off, on, etc.

Change switch position once: Change the state of the output O (O1) state to the opposite state and send the command to the associated devices in associated groups 2 and 3 (check chapter Z-Wave Association).

Change switch position twice: If the delay between the first in the second click is less then 500ms, this is interpreted as “Change the switch possition twice”. Send command to the associated devices (dimmers, shutters,….) in associated groups 2 and 3 (check chapter Z-Wave Association).

Switch-memory connected to input terminal SW (SW1)

If the SW (SW1) is configured as a switch-memory, than:

Switching to Close switch-memory contact: Change the state of the output state O (O1) to the On state and send command to the associated devices in associated groups 2 and 3 (check chapter Z-Wave Association)

Switching to Open switch-memory contact: Change the state of the output state O (O1) to the Off state and send command to the associated devices in associated groups 2 and 3 (check chapter Z-Wave Association)

Push-button connected to input terminal SW (SW1)

If the SW (SW1) is configured as a push-button in the Device settings, each press of the push-button changes the output state O (O1) to opposite - ON, OFF, ON, etc.

Short press: Change the state of the output state O (O1) to the opposite one and send command to the associated devices in associated groups 2 and 3 (check chapter Z-Wave Association)

Hold: Send command to the associated devices in associated group 3 (check chapter Z-Wave Association)

Release: Send command to the associated devices in associated group 3 (check chapter Z-Wave Association)

Switching On/Off load connected to O (O1)

Load connected to O (O1) is possible to switch On/Off by:

by Z-Wave command

Automatically switching can be enabled by proper Parameters No. 19 and 20 settings.

pressing the switch/push-button SW (SW1): Change the state of the connected load to the opposite one

### Inclusion Information

SmartStart adding (inclusion)

SmartStart enabled products can be added into a Z-Wave® network by scanning the Z-Wave® QR Code present on the Device with a gateway providing SmartStart inclusion. No further action is required, and the SmartStart device will be added automatically within 10 minutes of being switched on in the network vicinity.

With the gateway application scan the QR code on the Device label and add the Security 2 (S2) Device Specific Key (DSK) to the provisioning list in the gateway.

Connect the Device to a power supply.

Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.

Adding will be initiated automatically within a few seconds after connecting the Device to a power supply, and the Device will be added to a Z-Wave® network automatically.

The blue LED will be blinking in Mode 2 during the adding process.

The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

Adding (inclusion) with the S button

Connect the Device to a power supply.

Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.

Enable add/remove mode on the gateway.

To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.

Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the Learn mode.

The blue LED will be blinking in Mode 2 during the adding process.

The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

Adding (inclusion) with a switch/push-button

Connect the Device to a power supply.

Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.

Enable add/remove mode on the gateway.

Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2, etc.) 3 times within 3 seconds (this procedure puts the Device in Learn mode*). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.

The blue LED will be blinking in Mode 2 during the adding process.

The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

### Exclusion Information

Removing (exclusion) with the S button

Connect the Device to a power supply.

Check if the green LED is blinking in Mode 1. If so, the Device is added to a Z-Wave® network.

Enable add/remove mode on the gateway.

To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.

Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the LEARN MODE.

The blue LED will be blinking in Mode 2 during the removing process.

The blue LED will be blinking in Mode 1 if the Device is successfully removed from a Z-Wave® network.

Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

Removing (exclusion) with a switch/push-button

Connect the Device to a power supply.

Check if the green LED is blinking in Mode 1. If so, the Device is added to a Z-Wave® network.

Enable add/remove mode on the gateway.

Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2,…) 3 times within 3 seconds (this procedure puts the Device in LEARN MODE). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.

The blue LED will be blinking in Mode 2 during the removing process.

The blue LED will be blinking in Mode 1 if the Device is successfully removed from a Z-Wave® network.

### General Usage Information



## Channels

The following table summarises the channels available for the Wave Pro 1PM -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 
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

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps)
Indicates the instantaneous current consumption.

The ```meter_current``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 15 configuration parameters available in the Wave Pro 1PM.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 0 |  |  |
| 1 | SW (SW1) Switch type | This parameter defines how the Device should treat the switch (which type) connected to the SW (SW1) terminal. |
| 2 | SW2 Switch type | This parameter defines how the Device should treat the switch (which type) connected to the SW2 terminal. |
| 17 | Restore state of O (O1) after power failure | This parameter determines if on/off status is saved and restored for load connected to O (O1) after power failure. |
| 19 | O (O1) Auto OFF with timer | If the load O (O1) is ON, you can schedule it to turn OFF automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an ON command, either remotely (from the gateway or associated device) or lo |
| 20 | O (O1) Auto ON with timer | If the load O (O1) is OFF, you can schedule it to turn ON automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an OFF command, either remotely (from the gateway or associated device) or l |
| 23 | O (O1) contact type - NO/NC | The set value determines the relay contact type for output O (O1). The relay contact type can be normally open (NO) or normally closed (NC). |
| 25 | Set timer units to s or ms for O (O1) | Set Timer Units to Seconds or Milliseconds Choose if you want to set the timer in seconds or milliseconds in Parameters No. 19, 20. |
| 36 | O (O1) Power report on change - percentage | This parameter determines the minimum change in consumed power that will result in sending a new report to the gateway. |
| 39 | Minimal time between reports (O) O1 | This parameter determines the minimum time that must elapse before a new power report on O (O1) is sent to the gateway. |
| 91 | Water Alarm | This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification. |
| 92 | Smoke Alarm | This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification. |
| 93 | CO Alarm | This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification. |
| 94 | Heat Alarm | This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification. |
| 120 | Factory Reset | Reset to factory default settings and removed from the z-wave network |

### Parameter 0: 



Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_0_0``` and is of type ```INTEGER```.


### Parameter 1: SW (SW1) Switch type

This parameter defines how the Device should treat the switch (which type) connected to the SW (SW1) terminal.
0 - momentary switch,

1 - toggle switch (contact closed - ON / contact opened - OFF),

2 - toggle switch (device changes status when switch changes status)
The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | momentary switch |
| 1 | toggle switch (contact closed - ON / contact opened - OFF) |
| 2 | toggle switch (device changes status when switch changes status) |

The manufacturer defined default value is ```2``` (toggle switch (device changes status when switch changes status)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: SW2 Switch type

This parameter defines how the Device should treat the switch (which type) connected to the SW2 terminal.

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | momentary switch (push button) |
| 1 | toggle switch (contact closed - ON / contact opened - OFF) |
| 2 | toggle switch (device changes status when switch changes status) |

The manufacturer defined default value is ```0``` (momentary switch (push button)).

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 17: Restore state of O (O1) after power failure

This parameter determines if on/off status is saved and restored for load connected to O (O1) after power failure.
0 - Device saves last on/off status and restores it after a power failure

1 - Device does not save on/off status and does not restore it after a power failure, it remains off
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Device saves last on/off status and restores it after a power failure |

The manufacturer defined default value is ```0``` (Device saves last on/off status and restores it after a power failure).

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 19: O (O1) Auto OFF with timer

If the load O (O1) is ON, you can schedule it to turn OFF automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an ON command, either remotely (from the gateway or associated device) or lo

The following option values may be configured, in addition to values in the range 0 to 0 -:

| Value  | Description |
|--------|-------------|
| 0 | Auto OFF Disabled |
| 1 | 1 - 32535 seconds (or milliseconds – see Parameter no. 25. |

The manufacturer defined default value is ```0``` (Auto OFF Disabled).

This parameter has the configuration ID ```config_19_2``` and is of type ```INTEGER```.


### Parameter 20: O (O1) Auto ON with timer

If the load O (O1) is OFF, you can schedule it to turn ON automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an OFF command, either remotely (from the gateway or associated device) or l

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Auto ON Disabled |
| 1 | 1 - 32535 seconds (or milliseconds – see Parameter no. 25. Auto ON tim |

The manufacturer defined default value is ```0``` (Auto ON Disabled).

This parameter has the configuration ID ```config_20_2``` and is of type ```INTEGER```.


### Parameter 23: O (O1) contact type - NO/NC

The set value determines the relay contact type for output O (O1). The relay contact type can be normally open (NO) or normally closed (NC).

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | NO |
| 1 | NC |

The manufacturer defined default value is ```0``` (NO).

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

This parameter determines the minimum change in consumed power that will result in sending a new report to the gateway.
NOTE: When the Device reports the power consumption (W), it will also automatically report the voltage (V) and current (A).

NOTE: Regardless of the power consumption change in percentage, the report will not be sent more frequently than defined by Parameter No. 39.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | reports are disabled |

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_36_1``` and is of type ```INTEGER```.


### Parameter 39: Minimal time between reports (O) O1

This parameter determines the minimum time that must elapse before a new power report on O (O1) is sent to the gateway.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | reports are disabled |

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_39_1``` and is of type ```INTEGER```.


### Parameter 91: Water Alarm

This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.

The following option values may be configured, in addition to values in the range 0 to 0 -:

| Value  | Description |
|--------|-------------|
| 0 | no action |
| 1 | open relay |
| 2 | close relay |

The manufacturer defined default value is ```0``` (no action).

This parameter has the configuration ID ```config_91_4``` and is of type ```INTEGER```.


### Parameter 92: Smoke Alarm

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

This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | no action |
| 1 | open relay |
| 2 | close relay |

The manufacturer defined default value is ```0``` (no action).

This parameter has the configuration ID ```config_93_4``` and is of type ```INTEGER```.


### Parameter 94: Heat Alarm

This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.

The following option values may be configured, in addition to values in the range 0 to 3 -:

| Value  | Description |
|--------|-------------|
| 0 | no action |
| 1 | open relay |
| 2 | close relay |

The manufacturer defined default value is ```0``` (no action).

This parameter has the configuration ID ```config_94_4``` and is of type ```INTEGER```.


### Parameter 120: Factory Reset

Reset to factory default settings and removed from the z-wave network

The following option values may be configured, in addition to values in the range 0 to 0 -:

| Value  | Description |
|--------|-------------|
| 0 | Don’t do Factory reset |
| 1431655765 | Do the Factory reset (hex 0x55555555) |

The manufacturer defined default value is ```0``` (Don’t do Factory reset).

This parameter has the configuration ID ```config_120_4``` and is of type ```INTEGER```.


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

* [Shelly Wave Pro 1PM Manual multi-lang](https://opensmarthouse.org/zwavedatabase/1682/reference/Wave_Pro1PM_multilang_2023_print_V1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1682).
