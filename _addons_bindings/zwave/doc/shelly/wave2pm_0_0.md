---
layout: documentation
title: Wave 2PM - ZWave
---

{% include base.html %}

# Wave 2PM Z-Wave™ smart switch, 2 channels 16 A total current (18 A peak), with power metering
This describes the Z-Wave device *Wave 2PM*, manufactured by *Shelly* with the thing type UID of ```shelly_wave2pm_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Wave 2PM product image](https://opensmarthouse.org/zwavedatabase/1578/image/)


The Wave 2PM supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Remotely control two independent electrical appliances (e.g. lights) and monitor their power consumption separately and in total.

  * 2 channels (2x 10 A, 16 A total)
  * Power metering on each channel and in total
  * Extremely low power consumption: 0.3 W.
  * Z-Wave frequency band: 868.4 MHz (CEPT countries)
  * Latest technology: Z-Wave 800 Series
  * Automatic set-up with SmartStart 
  * Security 2 Authenticated for the highest level of security
  * Supports over-the-air firmware updates
  * Simple installation in most standard electrical boxes and switches
  * Works with Z-Wave certified gateways and over 4,000 Z-Wave devices

*A gateway (smart hub) is not included. A gateway (smart hub) is required for the configuration of the device.

### Inclusion Information

SmartStart adding (inclusion)

SmartStart enabled products can be added into a Z-Wave™ network by scanning the Z-Wave™ QR Code present on the Device with a gateway providing SmartStart inclusion. No further action is required, and the SmartStart device will be added automatically within 10 minutes of being switched on in the network vicinity.

  1. With the gateway application scan the QR code on the Device label and add the Security 2 (S2) Device Specific Key (DSK) to the provisioning list in the gateway.
  2. Connect the Device to a power supply.
  3. Check if the blue LED is blinking slowly. If so, the Device is not added to a Z-Wave™ network.
  4. Adding will be initiated automatically within a few seconds after connecting the Device to a power supply, and the Device will be added to a Z-Wave™ network automatically.
  5. The blue LED will be blinking faster during the adding process.
  6. The green LED will be blinking in slowly if the Device is successfully added to a Z-Wave™ network.

Adding (inclusion) with the S button

  1. Connect the Device to a power supply.
  2. Check if the blue LED is blinking slowly. If so, the Device is not added to a Z-Wave™ network.
  3. Enable add/remove mode on the gateway.
  4. To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.
  5. Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking slowly. Releasing the S button will start the Learn mode.
  6. The blue LED will be blinking faster during the adding process.
  7. The green LED will be blinking slowly if the Device is successfully added to a Z-Wave™ network.

Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

Adding (inclusion) with a switch/push-button

  1. Connect the Device to a power supply.
  2. Check if the blue LED is blinking slowly. If so, the Device is not added to a Z-Wave™ network.
  3. Enable add/remove mode on the gateway.
  4. Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2, etc.) 3 times within 3 seconds (this procedure puts the Device in Learn mode*). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.
  5. The blue LED will be blinking faster during the adding process.
  6. The green LED will be blinking slowly if the Device is successfully added to a Z-Wave™ network.

*Learn mode - a state that allows the Device to receive network information from the gateway.

### Exclusion Information

Removing the Device from a Z-Wave™ network (exclusion)

Note! The Device will be removed from your Z-wave™ network, but any custom configuration parameters will not be erased.

Note! All Device outputs (O, O1, O2, etc. - depending on the Device type) will turn the load 1s on/1s off /1s on/1s off if the Device is successfully added to/removed from a Z-Wave™ network.

Removing (exclusion) with the S button

  1. 1. Connect the Device to a power supply.
  2. 2. Check if the green LED will be blinking slowly. If so, the Device is added to a Z-Wave™ network.
  3. 3. Enable add/remove mode on the gateway.
  4. 4. To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.
  5. 5. Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking slowly. Releasing the S button will start the LEARN MODE.
  6. 6. The blue LED will be blinking faster during the removing process.
  7. 7. The blue LED will be blinking slower if the Device is successfully removed from a Z-Wave™ network.

Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

Removing (exclusion) with a switch/push-button

  1. 1. Connect the Device to a power supply.
  2. 2. Check if the green LED will be blinking slowly. If so, the Device is added to a Z-Wave™ network.
  3. 3. Enable add/remove mode on the gateway.
  4. 4. Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2,…) 3 times within 3 seconds (this procedure puts the Device in LEARN MODE). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.
  5. 5. The blue LED will be blinking faster during the removing process.
  6. 6. The blue LED will be blinking slower if the Device is successfully removed from a Z-Wave™ network.

### General Usage Information

Factory reset

Factory reset general

After Factory reset, all custom parameters and stored values (kWh, associations, routing, etc.) will return to their default state. HOME ID and NODE ID assigned to the Device will be deleted. Use this reset procedure only when the gateway is missing or otherwise inoperable.

Factory reset with the S button

Note! Factory reset with the S button is possible anytime.

  1. 1. To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.
  2. 2. Press the S button multiple times until the LED turns solid red.
  3. 3. Press and hold (> 2s) S button on the Device until the red LED starts blinking faster. Releasing the S button will start the factory reset.
  4. 4. During factory reset, the LED will turn solid green for about 1s, then the blue and red LED will start blinking faster for approx. 2s.
  5. 5. The blue LED will be blinking slower if the Factory reset is successful.

Factory reset with a switch/push-button

Note! Factory reset with a switch/push-button is only possible within the first minute after the Device is connected to a power supply.

  1. 1. Connect the Device to a power supply.
  2. 2. Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2,…) 5 times within 3 seconds. The Device must receive on/off signal 5 times, which means pressing the push-button 5 times, or toggling the switch on and off 5 times.
  3. 3. During factory reset, the LED will turn solid green for about 1s, then the blue and red LED will start blinking faster for approx. 2s.
  4. 4. The blue LED will be blinking slower if the Factory reset is successful.

Factory reset remotely with parameter with the gateway

  1. 1. Factory reset can be done remotely by settings in Parameter No. 120

## Channels

The following table summarises the channels available for the Wave 2PM -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Alarm (heat) | alarm_heat | alarm_heat | Fire | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number | 
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number | 
| Alarm (heat) 1 | alarm_heat1 | alarm_heat | Fire | Switch | 
| Alarm (power) 1 | alarm_power1 | alarm_power | Energy | Switch | 
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch | 
| Electric meter (kWh) 2 | meter_kwh2 | meter_kwh | Energy | Number | 
| Electric meter (watts) 2 | meter_watts2 | meter_watts | Energy | Number | 
| Alarm (heat) 2 | alarm_heat2 | alarm_heat | Fire | Switch | 
| Alarm (power) 2 | alarm_power2 | alarm_power | Energy | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```Fire``` category. This is a read only channel so will only be updated following state changes from the device.

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

### Switch 1
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (kWh) 1
Indicates the energy consumption (kWh).

The ```meter_kwh1``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 1
Indicates the instantaneous power consumption.

The ```meter_watts1``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (heat) 1
Indicates if a heat alarm is triggered.

The ```alarm_heat1``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```Fire``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (power) 1
Indicates if a power alarm is triggered.

The ```alarm_power1``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Switch 2
Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (kWh) 2
Indicates the energy consumption (kWh).

The ```meter_kwh2``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 2
Indicates the instantaneous power consumption.

The ```meter_watts2``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (heat) 2
Indicates if a heat alarm is triggered.

The ```alarm_heat2``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```Fire``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (power) 2
Indicates if a power alarm is triggered.

The ```alarm_power2``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 26 configuration parameters available in the Wave 2PM.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | SW (SW1) Switch type | This parameter defines how the Device should treat the switch (which type) connected to the SW (SW1) terminal. |
| 2 | SW2 Switch type | This parameter defines how the Device should treat the switch (which type) connected to the SW2 terminal. |
| 6 | Inputs SW1 & SW2 Swap | This parameter allows to swap the operation of switches connected to inputs SW1 and SW2 without changing the wiring. |
| 16 | Outputs O1 & O2 swap | This parameter allows to swap the operation of outputs O1 and O2 without changing the wiring (in case of an invalid motor connection) to ensure proper operation. |
| 17 | Restore the O (O1) state after a power failure | This parameter determines if the on/off status is saved and restored for the load connected to O (O1) after a power failure. |
| 18 | Restore the O2 state after a power failure | This parameter determines if the on/off status is saved and restored for the load connected to O2 after a power failure. |
| 19 | O (O1) Auto OFF with timer | If the load O (O1) is ON, you can schedule it to turn OFF automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an ON command, either remotely (from the gateway or associated device) or lo |
| 20 | O (O1) Auto ON with timer | If the load O (O1) is ON, you can schedule it to turn OFF automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an ON command, either remotely (from the gateway or associated device) or lo |
| 21 | O2 Auto OFF with timer | If the load O2 is ON, you can schedule it to turn OFF automatically after the period of time defined in this parameter. The timer resets to zero each time the device receives an ON command, either remotely (from the gateway or associated device) or locall |
| 22 | O2 Auto ON with timer | If the load O2 is OFF, you can schedule it to turn ON automatically after the period of time defined in this parameter. The timer resets to zero each time the device receives an OFF command, either remotely (from the gateway or associated device) or local |
| 23 | O (O1) contact type - NO/NC | The set value determines the relay contact type for output O (O1). The relay contact type can be normally open (NO) or normally closed (NC). |
| 24 | O2 contact type - NO/NC | The set value determines the type of Relay contact type for O2 output. The Relay contact type can be normally open (NO) or normally closed (NC). |
| 25 | Set timer units to s or ms for O (O1) | Set the timer units to seconds or milliseconds. Choose if you want to set the timer in seconds or milliseconds in Parameters No. 19, 20. |
| 26 | Set timer units to s or ms for O2 | Set the timer units to seconds or milliseconds. Choose if you want to set the timer in seconds or milliseconds in Parameters No. 21, 22. |
| 36 | O (O1) Power report on change - percentage | This parameter determines the minimum change in consumed power that will result in sending a new report to the gateway. |
| 37 | O2 Power report on change - percentage | This parameter determines the minimum change in consumed power that will result in sending a new report to the gateway. |
| 39 | Minimum time between reports (O) O1 | This parameter determines the minimum time that must elapse before a new power report on O (O1) is sent to the gateway. |
| 40 | Minimum time between reports O2 | This parameter determines the minimum time that must elapse before a new power report on O2 is sent to the gateway. |
| 91 | Water Alarm | This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification. |
| 92 | Smoke Alarm | This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification. |
| 93 | CO Alarm | This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification. |
| 94 | Heat Alarm | This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification. |
| 120 | Factory Reset | Reset to factory default settings and removed from the Z-Wave network. The parameter is Advanced and may be hidden under the Advanced tag. |
| 201 | Serial Number 1 | This parameter contains a part of device’s serial number. The parameter is Read-Only and cannot be changed. The parameter is Advanced and may be hidden under the Advanced tag. |
| 202 | Serial Number 2 | This parameter contains a part of device’s serial number. The parameter is Read-Only and cannot be changed. The parameter is Advanced and may be hidden under the Advanced tag. |
| 203 | Serial Number 3 | This parameter contains a part of device’s serial number. The parameter is Read-Only and cannot be changed. The parameter is Advanced and may be hidden under the Advanced tag. |

### Parameter 1: SW (SW1) Switch type

This parameter defines how the Device should treat the switch (which type) connected to the SW (SW1) terminal.

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | seconds or milliseconds – see Parameter no. 25. Set timer units to s o |
| 1 | toggle switch (contact closed - ON / contact opened - OFF) |
| 2 | toggle switch (Device changes status when switch changes status) |

The manufacturer defined default value is ```2``` (toggle switch (Device changes status when switch changes status)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: SW2 Switch type

This parameter defines how the Device should treat the switch (which type) connected to the SW2 terminal.

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | momentary switch (push button) |
| 1 | toggle switch (contact closed - ON / contact opened - OFF) |
| 2 | toggle switch (Device changes status when switch changes status) |

The manufacturer defined default value is ```2``` (toggle switch (Device changes status when switch changes status)).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 6: Inputs SW1 & SW2 Swap

This parameter allows to swap the operation of switches connected to inputs SW1 and SW2 without changing the wiring.

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | default (SW1 - O1, SW2 - O2) |
| 1 | swapped (SW1 - O2, SW2 - O1) |

The manufacturer defined default value is ```0``` (default (SW1 - O1, SW2 - O2)).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 16: Outputs O1 & O2 swap

This parameter allows to swap the operation of outputs O1 and O2 without changing the wiring (in case of an invalid motor connection) to ensure proper operation.

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | default |
| 1 | reversed |

The manufacturer defined default value is ```0``` (default).

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 17: Restore the O (O1) state after a power failure

This parameter determines if the on/off status is saved and restored for the load connected to O (O1) after a power failure.

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Device saves last on/off status and restores it after a power failure |
| 1 | Device does not save on/off status, it remains off |

The manufacturer defined default value is ```0``` (Device saves last on/off status and restores it after a power failure).

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Restore the O2 state after a power failure

This parameter determines if the on/off status is saved and restored for the load connected to O2 after a power failure.

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Device saves last on/off status and restores it after a power failure |
| 1 | Device does not save on/off status, it remains off |

The manufacturer defined default value is ```0``` (Device saves last on/off status and restores it after a power failure).

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 19: O (O1) Auto OFF with timer

If the load O (O1) is ON, you can schedule it to turn OFF automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an ON command, either remotely (from the gateway or associated device) or lo
seconds or milliseconds – see Parameter no. 25. Set timer units to s or ms for O (O1) resolution 100ms
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_19_2``` and is of type ```INTEGER```.


### Parameter 20: O (O1) Auto ON with timer

If the load O (O1) is ON, you can schedule it to turn OFF automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an ON command, either remotely (from the gateway or associated device) or lo
seconds (or milliseconds – see Parameter No. 25. Set timer units to s or ms for O (O1) resolution 100ms
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_20_2``` and is of type ```INTEGER```.


### Parameter 21: O2 Auto OFF with timer

If the load O2 is ON, you can schedule it to turn OFF automatically after the period of time defined in this parameter. The timer resets to zero each time the device receives an ON command, either remotely (from the gateway or associated device) or locall
seconds (or milliseconds – see Parameter no. 26. Set timer units to s or ms for O2 resolution 100ms
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_21_2``` and is of type ```INTEGER```.


### Parameter 22: O2 Auto ON with timer

If the load O2 is OFF, you can schedule it to turn ON automatically after the period of time defined in this parameter. The timer resets to zero each time the device receives an OFF command, either remotely (from the gateway or associated device) or local
seconds (or milliseconds – see Parameter no. 26. Set timer units to s or ms for O2 resolution 100ms
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_22_2``` and is of type ```INTEGER```.


### Parameter 23: O (O1) contact type - NO/NC

The set value determines the relay contact type for output O (O1). The relay contact type can be normally open (NO) or normally closed (NC).

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | NO |
| 1 | NC |

The manufacturer defined default value is ```0``` (NO).

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.


### Parameter 24: O2 contact type - NO/NC

The set value determines the type of Relay contact type for O2 output. The Relay contact type can be normally open (NO) or normally closed (NC).

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | NO |
| 1 | NC |

The manufacturer defined default value is ```0``` (NO).

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 25: Set timer units to s or ms for O (O1)

Set the timer units to seconds or milliseconds. Choose if you want to set the timer in seconds or milliseconds in Parameters No. 19, 20.

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | timer set in seconds |
| 1 | timer set in milliseconds |

The manufacturer defined default value is ```0``` (timer set in seconds).

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 26: Set timer units to s or ms for O2

Set the timer units to seconds or milliseconds. Choose if you want to set the timer in seconds or milliseconds in Parameters No. 21, 22.

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | timer set in seconds |
| 1 | timer set in milliseconds |

The manufacturer defined default value is ```0``` (timer set in seconds).

This parameter has the configuration ID ```config_26_1``` and is of type ```INTEGER```.


### Parameter 36: O (O1) Power report on change - percentage

This parameter determines the minimum change in consumed power that will result in sending a new report to the gateway.
NOTE! When the Device reports the power consumption (W), it will also automatically report the voltage (V) and current (A).

NOTE! Regardless of the power consumption change in percentage, the report will not be sent more frequently than defined by Parameter No. 39.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_36_1``` and is of type ```INTEGER```.


### Parameter 37: O2 Power report on change - percentage

This parameter determines the minimum change in consumed power that will result in sending a new report to the gateway.
NOTE! When the Device reports the power consumption (W), it will also automatically report the voltage (V) and current (A).

NOTE! Regardless of the power consumption change in percentage, the report will not be sent more frequently than defined by Parameter No. 40.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_37_1``` and is of type ```INTEGER```.


### Parameter 39: Minimum time between reports (O) O1

This parameter determines the minimum time that must elapse before a new power report on O (O1) is sent to the gateway.
NOTE! This Parameter is in relation to Parameter No. 36.

NOTE! Setting the value to less than 30s can cause the Z-Wave network congestion state (slow Device response and decreased network stability).
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_39_1``` and is of type ```INTEGER```.


### Parameter 40: Minimum time between reports O2

This parameter determines the minimum time that must elapse before a new power report on O2 is sent to the gateway.
NOTE! This Parameter is in relation to Parameter No. 37

NOTE! Setting the value to less than 30s can cause the Z-Wave network congestion state (slow Device response and decreased network stability).
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 91: Water Alarm

This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | no action |
| 1 | open relay / Open blinds (Up position) |
| 2 | close relay / Close blinds (Down position) |

The manufacturer defined default value is ```0``` (no action).

This parameter has the configuration ID ```config_91_4``` and is of type ```INTEGER```.


### Parameter 92: Smoke Alarm

This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | no action |
| 1 | open relay / Open blinds (Up position) |
| 2 | close relay / Close blinds (Down position) |

The manufacturer defined default value is ```0``` (no action).

This parameter has the configuration ID ```config_92_4``` and is of type ```INTEGER```.


### Parameter 93: CO Alarm

This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | no action |
| 1 | open relay / Open blinds (Up position) |
| 2 | close relay / Close blinds (Down position) |

The manufacturer defined default value is ```0``` (no action).

This parameter has the configuration ID ```config_93_4``` and is of type ```INTEGER```.


### Parameter 94: Heat Alarm

This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | no action |
| 1 | open relay / Open blinds (Up position) |
| 2 | close relay / Close blinds (Down position) |

The manufacturer defined default value is ```0``` (no action).

This parameter has the configuration ID ```config_94_4``` and is of type ```INTEGER```.


### Parameter 120: Factory Reset

Reset to factory default settings and removed from the Z-Wave network. The parameter is Advanced and may be hidden under the Advanced tag.

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Don’t do Factory reset |
| 1 | Do the Factory reset |

The manufacturer defined default value is ```0``` (Don’t do Factory reset).

This parameter has the configuration ID ```config_120_1``` and is of type ```INTEGER```.


### Parameter 201: Serial Number 1

This parameter contains a part of device’s serial number. The parameter is Read-Only and cannot be changed. The parameter is Advanced and may be hidden under the Advanced tag.

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_201_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 202: Serial Number 2

This parameter contains a part of device’s serial number. The parameter is Read-Only and cannot be changed. The parameter is Advanced and may be hidden under the Advanced tag.

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_202_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 203: Serial Number 3

This parameter contains a part of device’s serial number. The parameter is Read-Only and cannot be changed. The parameter is Advanced and may be hidden under the Advanced tag.

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_203_4``` and is of type ```INTEGER```.
This is a read only parameter.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Wave 2PM supports 5 association groups.

### Group 1: Association Group 1 - Lifeline

“Lifeline Group” reports the status of the Device status and allows to assign only one device (gateway by default); only 1 node is allowed
Association Group 1 - Lifeline

1. INDICATOR_REPORT : LED status

2. DEVICE\_RESET\_LOCALLY_NOTIFICATION : triggered upon request

3. SWITCH\_BINARY\_REPORT : status change report for all outputs O (O, O1, O2, …) - common

4. NOTIFICATION_REPORT : triggered on Overheat

5. NOTIFICATION_REPORT : triggered on Over-current detected sum of all outputs O (O1+O2+…)

6. NOTIFICATION_REPORT : triggered on Over-voltage detected

7. NOTIFICATION_REPORT : triggered on AC mains disconnected

8. METER_REPORT : triggered by the load power consumption of all connected loads to all outputs O (O1+O2+…) (according to the settings of Parameters from No. 36 to 43)

Association group 1 supports 1 node.

### Group 2: Association Group 2

It is assigned to switch connected to the SW (SW1) terminal (uses Basic command class). Triggered by SW (SW1).
The device sends according to the state of SW (SW1) (switch or push-button) the command BASIC\_SET ON or BASIC\_SET OFF to the associated device. This command is reflected to the output of associated device. Supports the following command classes:

BASIC_SET : set On / Off state at the associated device

Association group 2 supports 9 nodes.

### Group 3: Association Group 3

It is assigned to switch connected to the SW (SW1) terminal (uses Switch Multilevel command class). Triggered by SW (SW1)
Supports the following command classes:

1. SWITCH\_MULTILEVEL\_START\_LEVEL\_CHANGE : initiate a transition to a new level (increase or decrease light intensity in case of dimmer, or move shutter up or down, …)

2. SWITCH\_MULTILEVEL\_STOP\_LEVEL\_CHANGE : stop an ongoing transition (stop increase or decrease light intensity in case of dimmer, or stop moving shutter up or down, …)

It is recommended to use push buttons for this association.

Association group 3 supports 9 nodes.

### Group 4: Association Group 4

It is assigned to switch connected to the SW2 terminal (uses Basic command class). Triggered by SW2.
Supports the following command classes:

BASIC_SET : set On / Off state at the associated device

Association group 4 supports 9 nodes.

### Group 5: Association Group 5

It is assigned to switch connected to the SW2 terminal (uses Switch Multilevel command class). Triggered by SW2.
Supports the following command classes:

SWITCH\_MULTILEVEL\_START\_LEVEL\_CHANGE : initiate a transition to a new level (increase or decrease light intensity in case of dimmer, or move shutter up or down, …)

SWITCH\_MULTILEVEL\_STOP\_LEVEL\_CHANGE : stop an ongoing transition (stop increase or decrease light intensity in case of dimmer, or stop moving shutter up or down, …)

It is recommended to use push buttons for this association.

Association group 5 supports 9 nodes.

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
| COMMAND_CLASS_METER_V3| |
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
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Printed manual](https://opensmarthouse.org/zwavedatabase/1578/reference/Wave_2PM_multilang_2023_print_V4.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1578).
