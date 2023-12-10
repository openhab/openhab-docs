---
layout: documentation
title: Keemple KP-SO-02 - ZWave
---

{% include base.html %}

# Keemple KP-SO-02 Wall Plug Switch
This describes the Z-Wave device *Keemple KP-SO-02*, manufactured by *Keemplecom Limited* with the thing type UID of ```keemple_wallplug_04_000```.
This version of the device is limited to firmware versions above 4.0

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Keemple KP-SO-02 product image](https://opensmarthouse.org/zwavedatabase/1359/image/)


The Keemple KP-SO-02 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

This Plug provides line voltage, current load, power consumption and energy consumption measuring. 

Voltage – The Supply Power Voltage For Plug.

Current – The Current for the Electric Device Connect to Plug Consumption.

Power – Power Consumed by an Electric Device in an instant, unit: Watt (W).

Energy – Energy Consumed by an Electric Device through a Time Period. Most commonly measured in Kilowatt-hours (kWh). One kilowatt-hour is Equal to One Kilowatt of Power Consumed over a Period of One Hour, 1kWh = 1000Wh.0Wh.

### Inclusion Information

  1. Connect a plug to power and wait at least 20 seconds.
  2. Set Z‐Wave controller or Z‐Wave gateway into inclusion mode (refer to the controller or gateway operating manual).
  3. Briefly press the plug button three times (the LED will alternately flash gree five times).

### Exclusion Information

  1. Connect a plug to power and wait at least 20 seconds.
  2. Set Z‐Wave controller or Z‐Wave gateway into exclusion mode (refer to the controller or gateway operating manual).
  3. Briefly press the plug button three times (the LED will alternately flash pink five times).

### General Usage Information



## Channels

The following table summarises the channels available for the Keemple KP-SO-02 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

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

The Keemple KP-SO-02 supports 3 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Assigned to Plugs status - On/Off. Allows for receiving control command from trigger devices whenever the Plug is turned On or Off.
NOTIFICATION\_REPORT\_V4

METER\_REPORT\_V4

SWITCH\_BINARY\_REPORT

DEVICE\_RESET\_LOCALLY_NOTIFICATION

Association group 1 supports 1 node.

### Group 2: Group 2

Sending control commands to associated devices. If current load is over the max current defined in parameter #3, the Plug will send a BASIC\_SET (0xFF) to associated devices. When current load is normal, plug will send a BASIC\_SET (0x00).
BASIC_SET

Association group 2 supports 5 nodes.

### Group 3: Group 3

Send Notification to associated devices.
NOTIFICATION\_REPORT\_V4

Association group 3 supports 5 nodes.

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
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [User Manual PL](https://opensmarthouse.org/zwavedatabase/1359/reference/Keemple_KP-SO-02_manual_PL.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1359).
