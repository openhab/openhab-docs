---
layout: documentation
title: Wave Pro 2PM - ZWave
---

{% include base.html %}

# Wave Pro 2PM The Device is a DIN rail mountable 2-channel smart switch with power measurement. It controls the on/off function for two independent electrical devic
This describes the Z-Wave device *Wave Pro 2PM*, manufactured by *Shelly* with the thing type UID of ```shelly_wavepro2pm_00_000```.

The device is in the category of *Battery*, defining Batteries, Energy Storages.

![Wave Pro 2PM product image](https://opensmarthouse.org/zwavedatabase/1640/image/)


The Wave Pro 2PM supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Professional 2-channel DIN rail Z-Wave® smart switch with dry contacts​

Suitable for home and facility automation with remote control. DIN rail mountable inside a breaker box. Enhanced safety features.​

2 outputs, 16 A each. Total device maximum of 25 A.

Potential-free contacts (dry contacts) ​

DIN-rail mountable​

Extremely low power consumption: < 0.3 W​

Z-Wave frequency band: 868,4 MHz (CEPT-Länder)

Latest technology: Z-Wave 800 Series​

Automatic set-up with SmartStart ​

Security 2 Authenticated for the highest level of security​

Over-the-air firmware updates​

Works with Z-Wave-certified gateways and over 4,000 Z-Wave devices​

### Inclusion Information

SmartStart adding (inclusion)

SmartStart enabled products can be added into a Z-Wave™ network by scanning the Z-Wave™ QR Code present on the Device with a gateway providing SmartStart inclusion. No further action is required, and the SmartStart device will be added automatically within 10 minutes of being switched on in the network vicinity.

With the gateway application scan the QR code on the Device label and add the Security 2 (S2) Device Specific Key (DSK) to the provisioning list in the gateway.

Connect the Device to a power supply.

Check if the blue LED is blinking slowly. If so, the Device is not added to a Z-Wave™ network.

Adding will be initiated automatically within a few seconds after connecting the Device to a power supply, and the Device will be added to a Z-Wave™ network automatically.

The blue LED will be blinking faster during the adding process.

The green LED will be blinking in slowly if the Device is successfully added to a Z-Wave™ network.

Adding (inclusion) with the S button

Connect the Device to a power supply.

Check if the blue LED is blinking slowly. If so, the Device is not added to a Z-Wave™ network.

Enable add/remove mode on the gateway.

To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.

Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking slowly. Releasing the S button will start the Learn mode.

The blue LED will be blinking faster during the adding process.

The green LED will be blinking slowly if the Device is successfully added to a Z-Wave™ network.

Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

Adding (inclusion) with a switch/push-button

Connect the Device to a power supply.

Check if the blue LED is blinking slowly. If so, the Device is not added to a Z-Wave™ network.

Enable add/remove mode on the gateway.

Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2, etc.) 3 times within 3 seconds (this procedure puts the Device in Learn mode*). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.

The blue LED will be blinking faster during the adding process.

The green LED will be blinking slowly if the Device is successfully added to a Z-Wave™ network.

*Learn mode - a state that allows the Device to receive network information from the gateway.

### Exclusion Information

Removing the Device from a Z-Wave™ network (exclusion)

Note! The Device will be removed from your Z-wave™ network, but any custom configuration parameters will not be erased.

Note! All Device outputs (O, O1, O2, etc. - depending on the Device type) will turn the load 1s on/1s off /1s on/1s off if the Device is successfully added to/removed from a Z-Wave™ network.

Removing (exclusion) with the S button

  1. Connect the Device to a power supply.
  2. Check if the green LED will be blinking slowly. If so, the Device is added to a Z-Wave™ network.
  3. Enable add/remove mode on the gateway.
  4. To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.
  5. Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking slowly. Releasing the S button will start the LEARN MODE.
  6. The blue LED will be blinking faster during the removing process.
  7. The blue LED will be blinking slower if the Device is successfully removed from a Z-Wave™ network.

Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

Removing (exclusion) with a switch/push-button

  1. Connect the Device to a power supply.
  2. Check if the green LED will be blinking slowly. If so, the Device is added to a Z-Wave™ network.
  3. Enable add/remove mode on the gateway.
  4. Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2,…) 3 times within 3 seconds (this procedure puts the Device in LEARN MODE). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.
  5. The blue LED will be blinking faster during the removing process.
  6. The blue LED will be blinking slower if the Device is successfully removed from a Z-Wave™ network.

### General Usage Information



## Channels

The following table summarises the channels available for the Wave Pro 2PM -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 
| Alarm (heat) | alarm_heat | alarm_heat | temperature_hot | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number | 
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number | 
| Electric meter (volts) 1 | meter_voltage1 | meter_voltage | Energy | Number | 
| Electric meter (amps) 1 | meter_current1 | meter_current | Energy | Number | 
| Alarm (power) 1 | alarm_power1 | alarm_power | Energy | Switch | 
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch | 
| Electric meter (kWh) 2 | meter_kwh2 | meter_kwh | Energy | Number | 
| Electric meter (watts) 2 | meter_watts2 | meter_watts | Energy | Number | 
| Electric meter (volts) 2 | meter_voltage2 | meter_voltage | Energy | Number | 
| Electric meter (amps) 2 | meter_current2 | meter_current | Energy | Number | 
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

### Switch 1
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (kWh) 1
Indicates the energy consumption (kWh).

The ```meter_kwh1``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 1
Indicates the instantaneous power consumption.

The ```meter_watts1``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts) 1
Indicates the instantaneous voltage.

The ```meter_voltage1``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps) 1
Indicates the instantaneous current consumption.

The ```meter_current1``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

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

### Electric meter (volts) 2
Indicates the instantaneous voltage.

The ```meter_voltage2``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps) 2
Indicates the instantaneous current consumption.

The ```meter_current2``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (power) 2
Indicates if a power alarm is triggered.

The ```alarm_power2``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 24 configuration parameters available in the Wave Pro 2PM.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 0 | O (O1) Auto OFF with timer | If Load O (O1) is ON, you can schedule it to turn OFF automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an ON command, either remotely (from the Gateway or associated device) or locall |
| 1 | SW (SW1) Switch type | This parameter defines as what type the device should treat the switch connected to the SW (SW1) terminal. |
| 2 | SW (SW2) Switch type | This parameter defines as what type the device should treat the switch connected to the SW (SW2) terminal. |
| 6 | Inputs SW1 & SW2 Swap | This parameter allows to swap the operation of switches connected to inputs SW1 and SW2 without changing the wiring. |
| 16 | Outputs O1 & O2 swap | This parameter allows to swap the operation of outputs O1 and O2 without changing the wiring. |
| 17 | Restore state of O (O1) after power failure | This parameter determines if on/off status is saved and restored for load connected to O (O1) after power failure. |
| 18 | Restore state of O (O2) after power failure | This parameter determines if on/off status is saved and restored for load connected to O (O2) after power failure. |
| 19 | O (O1) Auto OFF with timer | If Load O (O1) is ON, you can schedule it to turn OFF automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an ON command, either remotely (from the Gateway or associated device) or locall |
| 20 | O (O1) Auto ON with timer | If Load O (O1) is OFF, you can schedule it to turn ON automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an OFF command, either remotely (from the Gateway or associated device) or local |
| 21 | O (O2) Auto OFF with timer | If Load O (O2) is ON, you can schedule it to turn OFF automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an ON command, either remotely (from the Gateway or associated device) or locall |
| 22 | O (O2) Auto ON with timer | If Load O (O2) is OFF, you can schedule it to turn ON automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an OFF command, either remotely (from the Gateway or associated device) or local |
| 23 | O (O1) contact type - NO/NC | Set value determines the type of Relay contact type for O (O1) output. The Relay contact type can be normally open (NO) or normally closed (NC). |
| 24 | O (O2) contact type - NO/NC | Set value determines the type of Relay contact type for O (O2) output. The Relay contact type can be normally open (NO) or normally closed (NC). |
| 25 | Set timer units to s or ms for O (O1) | Set Timer Units to Seconds or Milliseconds Choose if you want to set the timer in seconds or milliseconds in Parameters No. 19, 20. |
| 26 | Set timer units to s or ms for O (O2) | Set Timer Units to Seconds or Milliseconds Choose if you want to set the timer in seconds or milliseconds in Parameters No. 21, 22. |
| 36 | Power report on change - percentage | This parameter determines the minimum change in consumed power that will result in sending new report to the main controller. |
| 37 | O (O2) Power report on change - percentage | This parameter determines the minimum change in consumed power that will result in sending new report to the main controller. |
| 39 | 39: Minimal time between reports (O) O1 | This parameter determines minimum time that has to elapse before sending new power report on O (O1) to the main controller. |
| 40 | Minimal time between reports (O) O2 | This parameter determines minimum time that has to elapse before sending new power report on O (O2) to the main controller. |
| 91 | Water Alarm | This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification. |
| 92 | Smoke Alarm | This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification. |
| 93 | CO Alarm | This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification. |
| 94 | Heat Alarm | This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification. |
| 120 | Factory Reset | Reset to factory default settings and removed from the z-wave network |

### Parameter 0: O (O1) Auto OFF with timer

If Load O (O1) is ON, you can schedule it to turn OFF automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an ON command, either remotely (from the Gateway or associated device) or locall
seconds (or milliseconds – see Parameter no. 25. Auto ON timer enabled for a given amount of seconds (or milliseconds) resolution 100ms
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_0_2``` and is of type ```INTEGER```.


### Parameter 1: SW (SW1) Switch type

This parameter defines as what type the device should treat the switch connected to the SW (SW1) terminal.

Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: SW (SW2) Switch type

This parameter defines as what type the device should treat the switch connected to the SW (SW2) terminal.

Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 6: Inputs SW1 & SW2 Swap

This parameter allows to swap the operation of switches connected to inputs SW1 and SW2 without changing the wiring.

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 16: Outputs O1 & O2 swap

This parameter allows to swap the operation of outputs O1 and O2 without changing the wiring.

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 17: Restore state of O (O1) after power failure

This parameter determines if on/off status is saved and restored for load connected to O (O1) after power failure.

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Restore state of O (O2) after power failure

This parameter determines if on/off status is saved and restored for load connected to O (O2) after power failure.

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 19: O (O1) Auto OFF with timer

If Load O (O1) is ON, you can schedule it to turn OFF automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an ON command, either remotely (from the Gateway or associated device) or locall
seconds (or milliseconds – see Parameter no. 25. Auto OFF timer enabled for a given amount of seconds (or milliseconds) resolution 100ms
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_19_2``` and is of type ```INTEGER```.


### Parameter 20: O (O1) Auto ON with timer

If Load O (O1) is OFF, you can schedule it to turn ON automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an OFF command, either remotely (from the Gateway or associated device) or local
seconds (or milliseconds – see Parameter no. 25. Auto ON timer enabled for a given amount of seconds (or milliseconds) resolution 100ms
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_20_2``` and is of type ```INTEGER```.


### Parameter 21: O (O2) Auto OFF with timer

If Load O (O2) is ON, you can schedule it to turn OFF automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an ON command, either remotely (from the Gateway or associated device) or locall
seconds (or milliseconds – see Parameter no. 26. Auto OFF timer enabled for a given amount of seconds (or milliseconds) resolution 100ms
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_21_2``` and is of type ```INTEGER```.


### Parameter 22: O (O2) Auto ON with timer

If Load O (O2) is OFF, you can schedule it to turn ON automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an OFF command, either remotely (from the Gateway or associated device) or local
seconds (or milliseconds – see Parameter no. 26. Auto ON timer enabled for a given amount of seconds (or milliseconds) resolution 100ms
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_22_2``` and is of type ```INTEGER```.


### Parameter 23: O (O1) contact type - NO/NC

Set value determines the type of Relay contact type for O (O1) output. The Relay contact type can be normally open (NO) or normally closed (NC).

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | NO |
| 1 | NC |

The manufacturer defined default value is ```0``` (NO).

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.


### Parameter 24: O (O2) contact type - NO/NC

Set value determines the type of Relay contact type for O (O2) output. The Relay contact type can be normally open (NO) or normally closed (NC).

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 25: Set timer units to s or ms for O (O1)

Set Timer Units to Seconds or Milliseconds Choose if you want to set the timer in seconds or milliseconds in Parameters No. 19, 20.

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 26: Set timer units to s or ms for O (O2)

Set Timer Units to Seconds or Milliseconds Choose if you want to set the timer in seconds or milliseconds in Parameters No. 21, 22.

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_26_1``` and is of type ```INTEGER```.


### Parameter 36: Power report on change - percentage

This parameter determines the minimum change in consumed power that will result in sending new report to the main controller.
NOTE! When the Device reports the power consumption (W), it will also automatically report the voltage (V) and current (A).

NOTE! Regardless of the power consumption change in percentage, the report will not be sent more frequently than defined by Parameter No. 39.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_36_1``` and is of type ```INTEGER```.


### Parameter 37: O (O2) Power report on change - percentage

This parameter determines the minimum change in consumed power that will result in sending new report to the main controller.
NOTE! When the Device reports the power consumption (W), it will also automatically report the voltage (V) and current (A).

NOTE! Regardless of the power consumption change in percentage, the report will not be sent more frequently than defined by Parameter No. 40.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_37_1``` and is of type ```INTEGER```.


### Parameter 39: 39: Minimal time between reports (O) O1

This parameter determines minimum time that has to elapse before sending new power report on O (O1) to the main controller.
NOTE! This Parameter is in relation to Parameter No. 36.

NOTE! Setting the value to less than 30s can cause the Z-Wave network congestion state (slow Device response and decreased network stability).
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_39_1``` and is of type ```INTEGER```.


### Parameter 40: Minimal time between reports (O) O2

This parameter determines minimum time that has to elapse before sending new power report on O (O2) to the main controller.
NOTE! This Parameter is in relation to Parameter No. 37

NOTE! Setting the value to less than 30s can cause the Z-Wave network congestion state (slow Device response and decreased network stability).
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 91: Water Alarm

This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification.

Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_91_4``` and is of type ```INTEGER```.


### Parameter 92: Smoke Alarm

This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification.

Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_92_4``` and is of type ```INTEGER```.


### Parameter 93: CO Alarm

This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification.

Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_93_4``` and is of type ```INTEGER```.


### Parameter 94: Heat Alarm

This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification.

Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_94_4``` and is of type ```INTEGER```.


### Parameter 120: Factory Reset

Reset to factory default settings and removed from the z-wave network

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_120_4``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Wave Pro 2PM supports 5 association groups.

### Group 1: Association Group 1 - Lifeline

“Lifeline Group” reports the status of the Device a and allows to assign only one device (gateway by default); only 1 node is allowed
Association Group 1 - Lifeline

1. INDICATOR_REPORT : LED status

2. DEVICE\_RESET\_LOCALLY_NOTIFICATION : triggered upon request

3. SWITCH\_BINARY\_REPORT : status change report for all outputs O (O, O1, O2, …) - common

4. NOTIFICATION_REPORT : triggered on Overheat

5. NOTIFICATION_REPORT : triggered on Over-current detected sum of all outputs O (O1+O2+…)

6. NOTIFICATION_REPORT : triggered on Over-voltage detected

7. NOTIFICATION_REPORT : triggered on AC mains disconnected

8. METER_REPORT : triggered by the load power consumption of all connected loads to all outputs O (O1+O2+…) (according to the settings of Parameters from No. 36 to 43)

Association group 1 supports 2 nodes.

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

* [ShellyWavePro2PM.pdf](https://opensmarthouse.org/zwavedatabase/1640/reference/ShellyWavePro2PM.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1640).
