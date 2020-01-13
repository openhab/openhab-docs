---
layout: documentation
title: RXZ-2C - ZWave
---

{% include base.html %}

# RXZ-2C Thermostat
This describes the Z-Wave device *RXZ-2C*, manufactured by *Danfoss* with the thing type UID of ```danfoss_rxz2c_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![RXZ-2C product image](https://www.cd-jackson.com/zwave_device_uploads/1189/1189_default.png)


The RXZ-2C supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

230VAC powered static controller with binary switch capability containing 2 power relays

### Inclusion Information

After the device is Factory Reset it automatically enters Inclusion Mode.

  1. Press PROG to place in Program mode (Red LED on stead)
  2. Press and hold CH1 button for at least 15 seconds (PROG LED rapidly flashed red and green)
  3. Press and hold down the PROG button for at least 15 seconds

Channel LEDs will show red and PROG LED will slowly flash green

### Exclusion Information

Factory Reset the device th exclude it.

  1. Press PROG to place in Program mode (Red LED on stead)
  2. Press and hold CH1 button for at least 15 seconds (PROG LED rapidly flashed red and green)
  3. Press and hold down the PROG button for at least 15 seconds

Channel LEDs will show red and PROG LED will slowly flash green

## Channels

The following table summarises the channels available for the RXZ-2C -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Setpoint (heating) 1 | thermostat_setpoint1 | thermostat_setpoint | Heating | Number:Temperature | 
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch | 
| Setpoint (heating) 2 | thermostat_setpoint2 | thermostat_setpoint | Heating | Number:Temperature | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Setpoint (heating)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Switch 1
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Setpoint (heating) 1
Sets the thermostat setpoint.

The ```thermostat_setpoint1``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Switch 2
Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Setpoint (heating) 2
Sets the thermostat setpoint.

The ```thermostat_setpoint2``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The RXZ-2C supports 1 association group.

### Group 1: Group 1


Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CMD_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |

### Documentation Links

* [Scanned Manual](https://www.cd-jackson.com/zwave_device_uploads/1189/RXZ-2C-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1189).
