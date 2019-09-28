---
layout: documentation
title: ZMNHTD - ZWave
---

{% include base.html %}

# ZMNHTD Smart Meter
This describes the Z-Wave device *ZMNHTD*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhtd_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![ZMNHTD product image](https://www.cd-jackson.com/zwave_device_uploads/414/414_default.jpg)


The ZMNHTD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

This Z-Wave module is used for energy measurements in single-phase electrical power network and can be used in residential, industrial and utility applications. Meters measure energy directly in 2-wire networks according to the principle of fast sampling of voltage and current signals. A built-in microprocessor calculates energy, power and power factor from the measured signals. The module can be controlled through Z-wave network and it acts as repeater in order to improve range and stability of Z-wave network. It is designed to be mounted on DIN rail. 

Measurements: Voltage V Current I Power – Active W Power – Active total Import kWh Power – Active total Export kWh Power – Reactive var Power – Reactive total kvarh Power – Apparent total kVAh Power Factor PF 

It is possible to connect two external relay to Smart Meter module. One controlled by built-in optical (IR) communication port on the side, second controlled by output on terminal 5. 

### Inclusion Information

Module Inclusion (Adding to Z-wave network)

  * Connect module to power supply
  * enable add/remove mode on main controller
  * auto-inclusion (works for about 5 seconds after connected to power supply) or
  * press service button S for more than 2 second

NOTE: For auto-inclusion procedure, first set main controller into inclusion mode and then connect module to power supply.

### Exclusion Information

Module Exclusion/Reset (Removing from Z-Wave network):

  * Connect module to power supply
  * bring module within maximum 1 Meter (3 feet) of the main controller,
  * enable add/remove mode on main controller
  * press service button S for more than 6 seconds.

By this function all parameters of the module are set to default values and own ID is deleted. If service button S is pressed more than 2 and less than 6 seconds module is excluded, but configuration parameters are not set to default values.

## Channels

The following table summarises the channels available for the ZMNHTD -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Power factor | meter_powerfactor | meter_powerfactor | Energy | Number | 
| Voltage | meter_voltage | meter_voltage | Energy | Number | 
| Active Power | meter_watts | meter_watts | Energy | Number | 
| Active Energy Comsumption | meter_kwh | meter_kwh | Energy | Number | 
| Apparent Energy Consumption | meter_kvah | meter_kvah | Energy | Number | 
| Current | meter_current | meter_current | Energy | Number | 
| Reset Meter Stats | meter_reset | meter_reset | Energy | Switch | 
| switch_binary | switch_binary1 | switch_binary | Switch | Switch | 
| Power factor  [Deprecated]| meter_powerfactor1 | meter_powerfactor | Energy | Number | 
| Switch Relay | switch_binary2 | switch_binary | Switch | Switch | 

### Power factor
Indicates the instantaneous power factor.

The ```meter_powerfactor``` channel is of type ```meter_powerfactor``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Voltage
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Active Power
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Active Energy Comsumption
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Apparent Energy Consumption
Indicates the energy consumption (kVAh).

The ```meter_kvah``` channel is of type ```meter_kvah``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Current
Indicates the instantaneous current consumption.

The ```meter_current``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Reset Meter Stats
Reset the meter.

The ```meter_reset``` channel is of type ```meter_reset``` and supports the ```Switch``` item and is in the ```Energy``` category.

### switch_binary
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Power factor [Deprecated]
Indicates the instantaneous power factor.

The ```meter_powerfactor1``` channel is of type ```meter_powerfactor``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

**Note:** This channel is marked as deprecated so should not be used.

### Switch Relay
External relay ON

External relay OFF

Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The following table provides a summary of the 24 configuration parameters available in the ZMNHTD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 7 | Input 1 switch function selection | IR external relay or External Relay control mode |
| 11 | Timer turning off IR external relay | Automatic turning off IR external relay output after set time |
| 12 |  Timer turning on IR external relay output  | Automatic turning on IR external relay output after set time |
| 13 | Timer turning off External relay output | Automatic turning off External relay output after set time |
| 14 | Timer turning on External relay after output | Automatic turning on External relay after output set time |
| 40 | Power reporting (Watts) on power change  | Power reporting in Watts on power change |
| 42 | Power reporting (Watts) by time interval | Power reporting in Watts by time interval |
| 45 | Reset Power counters | Reset Power counters |
| 100 | Enable / Disable endpoints relays | Enable / Disable endpoints IR external relay and External relay |
| 110 | Maximum Power auto off | Maximum Power auto off |
| 111 | Delay overpower off | Delay overpower off |
| 112 | Relay to power off | Relay to power off |
| 130 | Serial Number |  |
| 131 | Meter Software reference |  |
| 132 | Meter Hardware reference |  |
| 140 | Voltage U1 |  |
| 141 | Current I1 |  |
| 142 | Active Power Total (Pt) |  |
| 143 | Reactive Power Total (Qt) |  |
| 144 | Power Factor Total (PFt) |  |
| 145 | Active power accumulated (import) |  |
| 146 | Reactive power accumulated |  |
| 147 | Apparent power accumulated |  |
| 148 | Active power accumulated (export) |  |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 7: Input 1 switch function selection

IR external relay or External Relay control mode
Available config. parameters (data type is 1 Byte DEC
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 2 | IR external control – mono stable push button |
| 3 | IR external relay control - bi stable switch |
| 4 | External relay control – mono stable push button |
| 5 | External relay control – bi stable switch |

The manufacturer defined default value is ```4``` (External relay control – mono stable push button).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 11: Timer turning off IR external relay

Automatic turning off IR external relay output after set time
When External IR relay is ON it goes automatically OFF after time defined in this parameter. Timer is reset to zero each time the device receives ON command.  
Values (size is 2 byte dec):  
• Default value 0  
• 0-59 = Auto OFF disabled  
• 60-32535 = 60 seconds – 32535 seconds
The following option values may be configured, in addition to values in the range 0 to 32535 -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12:  Timer turning on IR external relay output 

Automatic turning on IR external relay output after set time
When IR external relay is OFF it goes automatically ON after time defined by this Parameter. Timer is reset to zero each time the module receive OFF command regardless from where it comes (push button, associated module, controller,..). Available configuration parameters (data type is 2 Byte DEC)
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: Timer turning off External relay output

Automatic turning off External relay output after set time
When External relay is ON it goes automatically OFF after time defined by this parameter. Timer is reset to zero each time the module receive ON command regardless from where it comes (push button, associated module, controller,..). Available configuration parameters (data type is 2 Byte DEC)
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_13_2``` and is of type ```INTEGER```.


### Parameter 14: Timer turning on External relay after output

Automatic turning on External relay after output set time
When External relay is OFF it goes automatically ON after time defined by this parameter. Timer is reset to zero each time the module receive OFF command regardless from where it comes (push button, associated module, controller,..). Available configuration parameters (data type is 2 Byte DEC)
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_14_2``` and is of type ```INTEGER```.


### Parameter 40: Power reporting (Watts) on power change 

Power reporting in Watts on power change
Set value means percentage, set value from 0 – 100 = 0% - 100%. Available configuration parameters (data type is 1 Byte DEC)

Power report is send (push) only when actual power in Watts in real time changes for more than set percentage comparing to previous actual power in Watts, step is 1%

NOTE: if power changed is less than 1W, the report is not send (pushed), independent of percentage set. When reporting Watts, module will automatically reports also V (Voltage), A (Amperes), Power factor, kVar (Reactive Power). 
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_40_2``` and is of type ```INTEGER```.


### Parameter 42: Power reporting (Watts) by time interval

Power reporting in Watts by time interval
Set value means time interval (0 – 32535) in seconds, when power report is send. Available config. parameters (data type is 2 Byte DEC).

Power report is send with time interval set by entered value. When reporting Watts, module will automatically reports also V (Voltage), A (Amperes), Power factor, kVar (Reactive Power)
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_42_2``` and is of type ```INTEGER```.


### Parameter 45: Reset Power counters

Reset Power counters
Available config. parameters (data type is 1 Byte DEC
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No function |
| 1 | reset counter 1 – KWh |
| 2 | reset counter 2 – kVARh |
| 4 | reset counter 3 – kVAh |
| 15 | reset ALL counters |

The manufacturer defined default value is ```0``` (No function).

This parameter has the configuration ID ```config_45_1``` and is of type ```INTEGER```.


### Parameter 100: Enable / Disable endpoints relays

Enable / Disable endpoints IR external relay and External relay
Enabling IR external relay and External relay or both of them, means that endpoint (IR external relay) and endpoint (External relay) or both will be present on UI. Disabling them will result in hiding endpoints according to Parameter set value. Note that hiding endpoint has no impact on its functionality. Available configuration parameters (data type is 1 Byte DEC)

NOTE1: After parameter change, first exclude module (without setting parameters to default value) and then re include the module. NOTE 2: If you don't have IR BiComm relay module mounted and you enable IR communication (parameter 100 is 2 or 3) there will be no valid IR relay state reported. It will be reported IR COMMUNICATION ERROR and LED2 will BLINK
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | EP IR external relay and External relay disabled |
| 1 | EP IR external relay dsbld, External relay enbld |
| 2 | EP IR external relay enbld, External relay dsbld |
| 3 | EP IR external relay and External relay enabled |

The manufacturer defined default value is ```0``` (EP IR external relay and External relay disabled).

This parameter has the configuration ID ```config_100_1``` and is of type ```INTEGER```.


### Parameter 110: Maximum Power auto off

Maximum Power auto off
Set value means Maximum Power Consumption (0 - 15000) in watts (W), when relays are turned off according to parameters no. 111 and 112. Available configuration parameters (data type is 2 Bytes DEC
The following option values may be configured, in addition to values in the range 0 to 15000 -:

| Value  | Description |
|--------|-------------|
| 0 | No function |
| 15000 | Maximum Power Consumption |

The manufacturer defined default value is ```0``` (No function).

This parameter has the configuration ID ```config_110_2``` and is of type ```INTEGER```.


### Parameter 111: Delay overpower off

Delay overpower off
Set value means number of second to power off relay (defined by parameters no. 110 and 112) before restart (30 - 32535) in seconds (s). Available configuration parameters (data type is 2 Bytes DEC): 
Values in the range 0 to 32525 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_111_2``` and is of type ```INTEGER```.


### Parameter 112: Relay to power off

Relay to power off
Set value selects relay to be powered off when threshold is reached (defined by parameters no. 110 and 111). Available config. parameters (data type is 1 Byte DEC)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | switch between the 2 relays |
| 1 | always power off relay 1 (IR external relay) |
| 2 | always power off relay 2 (External relay) |
| 3 | always power off both relays (relay 1 and relay 2) |

The manufacturer defined default value is ```0``` (switch between the 2 relays).

This parameter has the configuration ID ```config_112_1``` and is of type ```INTEGER```.


### Parameter 130: Serial Number



Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_130_32``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 131: Meter Software reference



Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_131_16``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 132: Meter Hardware reference



Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_132_16``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 140: Voltage U1



Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_140_24``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 141: Current I1



Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_141_24``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 142: Active Power Total (Pt)



Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_142_24``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 143: Reactive Power Total (Qt)



Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_143_24``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 144: Power Factor Total (PFt)



Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_144_16``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 145: Active power accumulated (import)



Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_145_32``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 146: Reactive power accumulated



Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_146_32``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 147: Apparent power accumulated



Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_147_32``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 148: Active power accumulated (export)



Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_148_32``` and is of type ```INTEGER```.
This is a read only parameter.

### Switch All Mode

Set the mode for the switch when receiving SWITCH ALL commands.

The following option values may be configured -:
| Value  | Description |
|--------|-------------|
| 0 | Exclude from All On and All Off groups |
| 1 | Include in All On group |
| 2 | Include in All Off group |
| 255 | Include in All On and All Off groups |

This parameter has the configuration ID ```switchall_mode``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZMNHTD supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Reserved for communication with the main controller

Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V2| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_METER_V4| |
| COMMAND_CLASS_CRC_16_ENCAP_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V2| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_V4| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V2| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_MARK_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V2| Linked to BASIC|
| COMMAND_CLASS_METER_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V2| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_MARK_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V2| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V2| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_MARK_V1| |

### Documentation Links

* [Manual Goap Smart Meter ZMNHTD](https://www.cd-jackson.com/zwave_device_uploads/414/Qubino-Smart-Meter-PLUS-user-manual-V1-7-1.pdf)
* [Qubino_Smart-Meter-PLUS-user-manual_V1.9_eng-1](https://www.cd-jackson.com/zwave_device_uploads/414/Qubino-Smart-Meter-PLUS-user-manual-V1-9-eng-1--1-.pdf)
* [Qubino_Smart-Meter-PLUS-extended-manual_eng_2.3](https://www.cd-jackson.com/zwave_device_uploads/414/Qubino-Smart-Meter-PLUS-extended-manual-eng-2-3.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/414).
