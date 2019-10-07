---
layout: documentation
title: PID15654 - ZWave
---

{% include base.html %}

# PID15654 Z Wave Wall Socket Plug In Receptical
This describes the Z-Wave device *PID15654*, manufactured by *Monoprice* with the thing type UID of ```monoprice_wallsocket_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![PID15654 product image](https://www.cd-jackson.com/zwave_device_uploads/628/628_default.png)


The PID15654 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Monitor and manage energy consumption to reduce costs with the Monoprice Z-Wave Plus® Wall Socket Smart Plug. This product is a Z-Wave® switched AC plug-in adapter. AC power can be remotely switched on or off manually with a button on the plug, remotely using Z-Wave manual control, or automatically with Z-Wave programming or triggered response.

Using Z-Wave commands, you can query the plug-in to report the power consumption, either as direct wattage or the kilowatt hours (kWh). It also includes two USB ports, one capable of 1A of charging power and the other capable of 2.4A of charging power, so you can keep your mobile devices charged without using another AC power socket for a wall charger.

### Inclusion Information

# Non-Secure

Triple-click the Z-Button on the plug-in.

# Secure

Press and hold the Z-Button for about 3 seconds. The LED indicator will begin blinking rapidly.

### Exclusion Information

Triple-click the Z-Button on the plug-in.

## Channels

The following table summarises the channels available for the PID15654 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Scene Number | scene_number | scene_number |  | Number | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps)
Indicates the instantaneous current consumption.

The ```meter_current``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 10 configuration parameters available in the PID15654.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 20 | Overload Protection | If current exceeds 16.5A over 5 seconds, relay will turn off. |
| 21 | Device Status after Power Failure | Define how the plug reacts after power failure |
| 24 | Notifcation on Load Change | Smart Plug can send notifications to association device load state changes. |
| 27 | Indicator Modes | LED in the device will indicate the state of load |
| 151 | Threshold of power report | Power Threshold at which to send meter report |
| 152 | Percentage Threshold of Power Report | Percentage Threshold at which to send meter report |
| 171 | Power Report Frequency | The interval of sending power report to association device (Group Lifeline). |
| 172 | Energy Report Frequency | The interval of sending energy report to association device (Group Lifeline). |
| 173 | Voltage Report Frequency | The interval of sending voltage report to association device (Group Lifeline) |
| 174 | Electricity Report Frequency | Interval for sending electricity report. |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 20: Overload Protection

If current exceeds 16.5A over 5 seconds, relay will turn off.
If current exceeds 16.5A over 5 seconds, relay will turn off.

0 - The function is disabled

1 - The function is enabled.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: Device Status after Power Failure

Define how the plug reacts after power failure
Define how the plug reacts after power failure:

0 - Smart Plug returns to previous state after a power failure.

1 - Smart Plug does not memorize its state after a powerfailure.

Connected device will be on after the power supply is reconnected.

2 - Smart Plug does not memorize its state after a power failure.

Connected device will be off after the power supply is reconnected.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 24: Notifcation on Load Change

Smart Plug can send notifications to association device load state changes.
Smart Plug can send notifications to association device load state changes.

0 -Disabled.

1 - Basic report.

2 - Basic report only when Load condition not changed by Z-WAVE Command.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 27: Indicator Modes

LED in the device will indicate the state of load
After smart plug is included into a Z-Wave network, the LED in the device will indicate the state of load.

0 - The LED will follow the status (on/off) of its load.

1 - When the state of Switch’s load changed, The LED will follow the status (on/off) of its load, but the red LED will turn off after 5 seconds if there is not any switch action.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_27_1``` and is of type ```INTEGER```.


### Parameter 151: Threshold of power report

Power Threshold at which to send meter report
Power threshold to be interpreted, when the change value of load power exceeds the setting threshold, the smart plug will send meter report to association device (Group Lifeline).

Available settings: 0 - 65535 (0 - 65535W)

0 - The function is disabled.

Default setting: 50 (50W)
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_151_2``` and is of type ```INTEGER```.


### Parameter 152: Percentage Threshold of Power Report

Percentage Threshold at which to send meter report
Power percentage threshold to be interpreted, when change value of the load power exceeds the setting threshold, the smart plug will send meter report to association device (Group Lifeline).

Available settings: 0 - 255 (0 - 255%)

0 - The function is disabled.

Default setting: 10 (10%)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_152_1``` and is of type ```INTEGER```.


### Parameter 171: Power Report Frequency

The interval of sending power report to association device (Group Lifeline).
The interval of sending power report to association device (Group Lifeline).

Available settings: 5- 2678400 (5 - 2678400 seconds)

0 -The function is disabled.

Default setting: 30 (30 seconds).
Values in the range 5 to 2678400 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_171_4``` and is of type ```INTEGER```.


### Parameter 172: Energy Report Frequency

The interval of sending energy report to association device (Group Lifeline).
The interval of sending energy report to association device (Group Lifeline).

Available settings: 5- 2678400 (5 - 2678400 seconds)

0 -The function is disabled.

Default setting: 300 (300 seconds).
Values in the range 5 to 2678400 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_172_4``` and is of type ```INTEGER```.


### Parameter 173: Voltage Report Frequency

The interval of sending voltage report to association device (Group Lifeline)
The interval of sending voltage report to association device (Group Lifeline)

Available settings: 5- 2678400 (5 - 2678400 seconds)

0 -The function is disabled.

Default setting: 0 (disabled).
Values in the range 0 to 2678400 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_173_4``` and is of type ```INTEGER```.


### Parameter 174: Electricity Report Frequency

Interval for sending electricity report.
The interval of sending electricity report to association device (Group Lifeline).

Available settings: 5- 2678400 (5 - 2678400 seconds)

0 -The function is disabled.

Default setting: 0 (disabled).
Values in the range 0 to 2678400 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_174_4``` and is of type ```INTEGER```.

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

The PID15654 supports 1 association group.

### Group 1: Basic Report

Sends Basic Report at On/Off event
Association command class allows Smart Plug to communicate with other Z-Wave devices directly, such as sending BASIC REPORT whenever the smart plug is turn on or off.

Smart Plug supports 1 association grouping.

The max number of associated nodes is 5.

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/628/15654-Manual-161024.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/628).
