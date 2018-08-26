---
layout: documentation
title: GWPN5 - ZWave
---

{% include base.html %}

# GWPN5 Multi-socket PowerNode (5-plug)
This describes the Z-Wave device *GWPN5*, manufactured by *GreenWave Reality Inc.* with the thing type UID of ```greenwave_gwpn5_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

The GWPN5 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

This Configuration is for the 6 plug version of the PowerNode.

### Inclusion Information

On the PowerNode, press and hold the **sync** button for approximately one second until the activity indicator displays a clockwise rotating pattern. This indicates the PowerNode is attempting inclusion. During this process, verify that the Gateway activity indicator still displays a clockwise rotating pattern.

After a few seconds, the rotating pattern on both the PowerNode and the Gateway stops. All bars turn green forming a circle for several seconds. This indicates a successful inclusion.

If all bars on the activity indicator start flashing instead of forming a solid circle, then the PowerNode inclusion process has failed, and you must start the sync process again. If syncing continually fails even though the PowerNode is close to the Gateway, then it may be an indication of a hardware fault, and the PowerNode might need replacing.

### Exclusion Information

On the PowerNode, press and hold the **Sync** button for approximately one second until the PowerNode activity indicator begins to display a counter-clockwise rotating pattern. The PowerNode is attempting exclusion.

## Channels

The following table summarises the channels available for the GWPN5 -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Electric meter (watts) | meter_watts | Energy | Number | 
| Electric meter (kWh) | meter_kwh | Energy | Number | 
| Alarm | alarm_general | Door | Switch | 
| Switch 1 | switch_binary1 | Switch | Switch | 
| Electric meter (watts) 1 | meter_watts1 | Energy | Number | 
| Electric meter (kWh) 1 | meter_kwh1 | Energy | Number | 
| Switch 2 | switch_binary2 | Switch | Switch | 
| Electric meter (watts) 2 | meter_watts2 | Energy | Number | 
| Electric meter (kWh) 2 | meter_kwh2 | Energy | Number | 
| Switch 3 | switch_binary3 | Switch | Switch | 
| Electric meter (watts) 3 | meter_watts3 | Energy | Number | 
| Electric meter (kWh) 3 | meter_kwh3 | Energy | Number | 
| Switch 4 | switch_binary4 | Switch | Switch | 
| Electric meter (watts) 4 | meter_watts4 | Energy | Number | 
| Electric meter (kWh) 4 | meter_kwh4 | Energy | Number | 
| Switch 5 | switch_binary5 | Switch | Switch | 
| Electric meter (watts) 5 | meter_watts5 | Energy | Number | 
| Electric meter (kWh) 5 | meter_kwh5 | Energy | Number | 

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (watts)

Indicates the instantaneous power consumption.

The ```meter_watts``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)

Indicates the energy consumption (kWh).

The ```meter_kwh``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm

Indicates if an alarm is triggered.

The ```alarm_general``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Switch 1

Switch the power on and off.

The ```switch_binary1``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (watts) 1

Indicates the instantaneous power consumption.

The ```meter_watts1``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh) 1

Indicates the energy consumption (kWh).

The ```meter_kwh1``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Switch 2

Switch the power on and off.

The ```switch_binary2``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (watts) 2

Indicates the instantaneous power consumption.

The ```meter_watts2``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh) 2

Indicates the energy consumption (kWh).

The ```meter_kwh2``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Switch 3

Switch the power on and off.

The ```switch_binary3``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (watts) 3

Indicates the instantaneous power consumption.

The ```meter_watts3``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh) 3

Indicates the energy consumption (kWh).

The ```meter_kwh3``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Switch 4

Switch the power on and off.

The ```switch_binary4``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (watts) 4

Indicates the instantaneous power consumption.

The ```meter_watts4``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh) 4

Indicates the energy consumption (kWh).

The ```meter_kwh4``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Switch 5

Switch the power on and off.

The ```switch_binary5``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (watts) 5

Indicates the instantaneous power consumption.

The ```meter_watts5``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh) 5

Indicates the energy consumption (kWh).

The ```meter_kwh5``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 5 configuration parameters available in the GWPN5.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 0 | Min. variation of load current | Minimum variation in load current before a message is sent. |
| 1 | No communication light | Minutes after which the device will flash if controller communicate is lost |
| 2 | Wheel position | Wheel position on the GreenWave device (read-only) |
| 3 | Power-on state | Default state after power loss |
| 4 | LED for network  error | If the LED should indicate a network error by flashing or not |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 0: Min. variation of load current

Minimum variation in load current before a message is sent.
Value in percent (30 => 30%)
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_0_1``` and is of type ```INTEGER```.


### Parameter 1: No communication light

Minutes after which the device will flash if controller communicate is lost

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Wheel position

Wheel position on the GreenWave device (read-only)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 128 | Black |
| 129 | Green |
| 130 | Dark Blue |
| 131 | Red |
| 132 | Yellow |
| 133 | Purple |
| 134 | Orange |
| 135 | Light Blue |
| 136 | Pink |
| 137 | Locked |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Power-on state

Default state after power loss

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | All OFF |
| 1 | Remember last state |
| 2 | All ON |

The manufacturer defined default value is ```2``` (All ON).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: LED for network  error

If the LED should indicate a network error by flashing or not

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable the LED for network error |
| 1 | Enable the LED for network error |

The manufacturer defined default value is ```1``` (Enable the LED for network error).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.

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

The GWPN5 supports 4 association groups.

### Group 1: Wheel position change


This group supports 1 nodes.

### Group 2: Current leakage on relay


This group supports 1 nodes.

### Group 3: Power level change

The new power reading is sent if the delta of the change is greater than the defined minimum variation
This group supports 1 nodes.

### Group 4: Over-current detection


This group supports 1 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_ALL_V0| |
| COMMAND_CLASS_METER_V2| |
| COMMAND_CLASS_CRC_16_ENCAP_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_METER_V2| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_METER_V2| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_METER_V2| |
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_METER_V2| |
#### Endpoint 5

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_METER_V2| |

### Documentation Links

* [Owner Manual](https://www.cd-jackson.com/zwave_device_uploads/264/z-wave-greenwave-powernode-manual.pdf)
* [Technical Manual](https://www.cd-jackson.com/zwave_device_uploads/264/Technical-Doc-for-the-powernodes.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/264).
