---
layout: documentation
title: plug - ZWave
---

{% include base.html %}

# plug Inteset Power Plug
This describes the Z-Wave device *plug*, manufactured by *[Inteset Technologies,](https://intesettech.com/)* with the thing type UID of ```inteset_plug_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![plug product image](https://opensmarthouse.org/zwavedatabase/1321/image/)


The plug supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Z-Wave Plug - Single Outlet (w/ wattage meter)

### Inclusion Information

Touch the code button on plug 3 times rapidly. LED will flash yellow/green 5 times.

### Exclusion Information

Touch the code button on plug 3 times rapidly. LED will flash pink/blue 5 times.

### General Usage Information



## Channels

The following table summarises the channels available for the plug -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps)
Indicates the instantaneous current consumption.

The ```meter_current``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 12 configuration parameters available in the plug.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Send Meter Report Enable | Defines disable/enable meter report measure data to gateway |
| 2 | Meter Report Interval | Defines interval time (in seconds) that the meter report data will be sent to the z-wave gateway |
| 3 | Maximum Over-Load Current | Defines maximum current which power plug can provide for household load that is connected to the plug. |
| 4 | Maximum Alarm Current | Defines maximum current. If load is greater than this parameter, the LED light will flash yellow. |
| 5 | LED Display | Defines LED funtion (on/off) |
| 6 | Configure Power Report | Defines how much power variation rate should reach to make the power plug report to the gateway. |
| 7 | Remember Relay Status | Defines the relay status to be remembered or not. If remembered, plug would keep the relay status to be the same as the status before disconnection. |
| 8 | Plug Time Switch Function | Defines the timer function enable/disable. Time period defined in parameter 9. |
| 9 | Time Switch Period | Defines the time period that the plug will be switched off automatically. |
| 10 | Button On/Off Enable | Enable/Disable the on/off function of the button on the device |
| 11 | Clear Accumulated Energy | Clears accumulated energy saved in the plug |
| 12 | Meter Enable | Enable/Disable the meter function |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Send Meter Report Enable

Defines disable/enable meter report measure data to gateway

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Meter Report Interval

Defines interval time (in seconds) that the meter report data will be sent to the z-wave gateway

Values in the range 1 to 65535 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Maximum Over-Load Current

Defines maximum current which power plug can provide for household load that is connected to the plug.

Values in the range 1 to 16 may be set.

The manufacturer defined default value is ```13```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Maximum Alarm Current

Defines maximum current. If load is greater than this parameter, the LED light will flash yellow.

Values in the range 1 to 16 may be set.

The manufacturer defined default value is ```13```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: LED Display

Defines LED funtion (on/off)

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Configure Power Report

Defines how much power variation rate should reach to make the power plug report to the gateway.

Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Remember Relay Status

Defines the relay status to be remembered or not. If remembered, plug would keep the relay status to be the same as the status before disconnection.

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Plug Time Switch Function

Defines the timer function enable/disable. Time period defined in parameter 9.

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Time Switch Period

Defines the time period that the plug will be switched off automatically.

Values in the range 1 to 65535 may be set.

The manufacturer defined default value is ```150```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Button On/Off Enable

Enable/Disable the on/off function of the button on the device

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Clear Accumulated Energy

Clears accumulated energy saved in the plug

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Meter Enable

Enable/Disable the meter function

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.

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

The plug supports 3 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

### Group 2: Group 2

Sends control commands to associated devices

Association group 2 supports 5 nodes.

### Group 3: Group 3

Sends notifications to associtaed devices in this group.

Association group 3 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Inteset-PowerPlug-UserManual](https://opensmarthouse.org/zwavedatabase/1321/reference/Inteset-PowerPlug-UserManual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1321).
