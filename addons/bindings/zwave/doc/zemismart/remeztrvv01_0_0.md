---
layout: documentation
title: Remotec Thermostat 700 series TRV - ZWave
---

{% include base.html %}

# Remotec Thermostat 700 series TRV Z-Wave Plus Remotec Thermostat 700 series TRV
This describes the Z-Wave device *Remotec Thermostat 700 series TRV*, manufactured by *Zemismart* with the thing type UID of ```zemismart_remeztrvv01_00_000```.

The device is in the category of *Battery*, defining Batteries, Energy Storages.

![Remotec Thermostat 700 series TRV product image](https://opensmarthouse.org/zwavedatabase/1639/image/)


The Remotec Thermostat 700 series TRV supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

This device is a Z-Wave controlled electronic radiator thermostat.

It is mounted on wall heating valves and controls them by a motor.

### Inclusion Information

  1. 1. Power on your TRV,
  2. 2. Set your Z-Wave controller into add/inclusion mode.
  3. 3. In the “OF” state, short press the rotary plate three times until the screen shows “–”.
  4. 4. The screen will show “PA” after a few seconds, which meant the inclusion is successful.
  5. 5. And the antenna icon will light on.

### Exclusion Information

  1. 1. Power on your TRV
  2. 2. Set the Z-Wave primary controller into remove/exclusion mode.
  3. 3. In the “OF” state, short press the rotary plate three times until the screen shows “–“.
  4. 4. The screen will turn back to“OF” after a few seconds, which meant the inclusion is successful.
  5. 5. The antenna icon light will be off.

### General Usage Information



## Channels

The following table summarises the channels available for the Remotec Thermostat 700 series TRV -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Thermostat mode
Sets the thermostat.

The ```thermostat_mode``` channel is of type ```thermostat_mode``` and supports the ```Number``` item and is in the ```Temperature``` category.
The following state translation is provided for this channel to the ```Number``` item type -:

| Value | Label     |
|-------|-----------|
| 0 | Off |
| 1 | Heat |
| 2 | Cool |
| 3 | Auto |
| 4 | Aux Heat |
| 5 | Resume |
| 6 | Fan Only |
| 7 | Furnace |
| 8 | Dry Air |
| 9 | Moist Air |
| 10 | Auto Changeover |
| 11 | Heat Economy |
| 12 | Cool Economy |
| 13 | Away |

### Setpoint (heating)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Remotec Thermostat 700 series TRV supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Group 1 for “Lifeline”
1.Battery Report 

The TRV will send a Battery Report When Battery level change is 

greater than 5%(configurable) or the report interval is reached. 

2.Sensor Multilevel Report 

The TRV will send a Sensor Multilevel Report When Room 

Lifeline Group 0x05 

temperature change is greater than 0.5℃ (configurable) or the report 

interval is reached. 

3.Thermostat Mode Report 

The TRV will send a Thermostat Mode Report when the TRV mode 

changed. 

4.Thermostat Setpoint Report 

The TRV will send a Thermostat Setpoint Report when setting 

temperature changed. 

5. Indicator Report 

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V10| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [REMEZTRVV01-Remotec Thermostat Z-Wave](https://opensmarthouse.org/zwavedatabase/1639/reference/REMEZTRVV01-Remotec_Thermostat_Z-Wave.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1639).
