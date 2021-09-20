---
layout: documentation
title: HKZW-SO08 - ZWave
---

{% include base.html %}

# HKZW-SO08 Smart Plug
This describes the Z-Wave device *HKZW-SO08*, manufactured by *[Hank](http://www.hank-tech.com/)* with the thing type UID of ```hank_hkzwso08_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![HKZW-SO08 product image](https://opensmarthouse.org/zwavedatabase/1391/image/)


The HKZW-SO08 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Smart Plug is a Z-Wave Switch plugin module specifically used to enable Z-Wave command and control (on/off) of any plug-in tool. It can report wattage consumption or kWh energy usage.

This device is a security enabled Z-Wave Plus product that is able to use encrypted Z-Wave Plus messages to communicate to other security enabled Z-Wave Plus products.

Smart Plug is also a security Z-Wave device and supports the Over The Air (OTA) feature for the product’s firmware upgrade.

This device must be used in conjunction with a Security Enabled Z-Wave Controller in order to fully utilize all implemented functions.

Features:

  1. AC output switch on/off by manual or Z-Wave command;
  2. RGB LED indicates the Z-WAVE network range and load power;
  3. Support S0 and S2 security network;
  4. Supporting power meter;
  5. Supporting repeater role;
  6. Supporting firmware OTA;
  7. Supporting Smart Start;
  8. Supports over-current protection

### Inclusion Information

Manual Z-Wave network inclusion:

  1. Connect the power supply.
  2. Set the Z-Wave network main controller into learning mode (see Z-Wave network controller operating manual).
  3. Triple click the Z-button
  4. Smart Plug should be recognized and included into the Z-Wave network.

### Exclusion Information

To remove Smart Plug from the Z-Wave network:  


  1. Insert the Plug into a socket
  2. Set the Z-Wave network controller into the exclusion mode (see Z-Wave controller operating manual)
  3. Triple click the Z button.

### General Usage Information



## Channels

The following table summarises the channels available for the HKZW-SO08 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Scene Number | scene_number | scene_number |  | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps)
Indicates the instantaneous current consumption.

The ```meter_current``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 10 configuration parameters available in the HKZW-SO08.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 20 | Overload Protection | If current exceeds 11.5A over 5 seconds, relay will turn off. |
| 21 | Device Status after Power Failure | Define how the plug reacts after power failure |
| 24 | Notification on State Change | Smart Plug can send notifications when device state changes. |
| 27 | Indicator Mode | LED in the device will indicate the state of the device |
| 151 | Threshold of Power Report | Power Threshold at which to send meter report |
| 152 | Percentage Threshold of Power Report | Percentage Threshold at which to send meter report |
| 171 | Power Report Frequency | The interval of sending power report to association device (Group Lifeline). |
| 172 | Energy Report Frequency | The interval of sending energy report to association device (Group Lifeline). |
| 173 | Voltage Report Frequency | The interval of sending voltage (V) report to association device (Group Lifeline) |
| 174 | Electric Current Report Frequency | Interval for sending electric current (A) report. |

### Parameter 20: Overload Protection

If current exceeds 11.5A over 5 seconds, relay will turn off.
If current exceeds 11.5A over 5 seconds, relay will turn off.

0 - The function is disabled

1 - The function is enabled.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: Device Status after Power Failure

Define how the plug reacts after power failure
Define how the plug reacts after power failure:

0 - Smart Plug returns to previous state after a power failure.

1 - Smart Plug does not memorize its state after a powerfailure.

Connected device will be on after the power supply is reconnected.

2 - Smart Plug does not memorize its state after a power failure.

Connected device will be off after the power supply is reconnected.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 24: Notification on State Change

Smart Plug can send notifications when device state changes.
Smart Plug can send notifications to association device state changes.

0 - Disabled. But state can be gathered through polling every X minutes.

1 - Basic report.

2 - Basic report only when device activated using its physical button.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 27: Indicator Mode

LED in the device will indicate the state of the device
After smart plug is included into a Z-Wave network, the LED in the device will indicate the state (ON/OFF).

0 - The LED will follow the status (on/off) of its load.

1 - When the state changes, the LED will follow the status (on/off), but only for 5 seconds after state modification.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_27_1``` and is of type ```INTEGER```.


### Parameter 151: Threshold of Power Report

Power Threshold at which to send meter report
Power threshold to be interpreted, when the change value of load power exceeds the setting threshold, the smart plug will send meter report to association device (Group Lifeline).

Available settings: 0 - 2300 (0 - 2300W, being the mazximum power supported by the device, higher values technically possible but irrelevant)

0 - The function is disabled.

Default setting: 50 (50W)

NOTE: Don't provide a too low value otherwise you may flood your Z-Wave network
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_151_2``` and is of type ```INTEGER```.


### Parameter 152: Percentage Threshold of Power Report

Percentage Threshold at which to send meter report
Power percentage threshold to be interpreted, when change value of the load power exceeds the setting threshold, the smart plug will send meter report to association device (Group Lifeline).

Available settings: 0 - 100 (0 - 100%)

0 - The function is disabled.

Default setting: 10 (10%)

NOTE: Don't provide a too low value otherwise you may flood your Z-Wave network
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_152_1``` and is of type ```INTEGER```.


### Parameter 171: Power Report Frequency

The interval of sending power report to association device (Group Lifeline).
The interval of sending power report to association device (Group Lifeline).

Available settings: 0- 2678400 (0 - 2678400 seconds)

0 -The function is disabled.

Default setting: 3600 (1 hour).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |

The manufacturer defined default value is ```3600```.

This parameter has the configuration ID ```config_171_4``` and is of type ```INTEGER```.


### Parameter 172: Energy Report Frequency

The interval of sending energy report to association device (Group Lifeline).
The interval of sending energy report to association device (Group Lifeline).

Available settings: 3600 - 2678400 (3600 - 2678400 seconds)

0 -The function is disabled.

Default setting: 7200 (2 hours).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |

The manufacturer defined default value is ```7200```.

This parameter has the configuration ID ```config_172_4``` and is of type ```INTEGER```.


### Parameter 173: Voltage Report Frequency

The interval of sending voltage (V) report to association device (Group Lifeline)
The interval of sending voltage report to association device (Group Lifeline)

Available settings: 3600 - 2678400 (3600 - 2678400 seconds)

0 -The function is disabled.

Default setting: 0 (disabled).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_173_4``` and is of type ```INTEGER```.


### Parameter 174: Electric Current Report Frequency

Interval for sending electric current (A) report.
The interval of sending electric current (A) report to association device (Group Lifeline).

Available settings: 3600 - 2678400 (3600 - 2678400 seconds)

0 -The function is disabled.

Default setting: 0 (disabled).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_174_4``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The HKZW-SO08 supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Meter, Basic etc.

Association group 1 supports 5 nodes.

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
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [French Manual](https://opensmarthouse.org/zwavedatabase/1391/reference/Manuel_Francais_mini_Prise_Z-Wave_Plus_HKZW-SO08.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1391).
