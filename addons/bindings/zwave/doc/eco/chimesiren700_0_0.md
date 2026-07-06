---
layout: documentation
title: ISZW7-ECO - ZWave
---

{% include base.html %}

# ISZW7-ECO Z-Wave 700 Chime + Siren
This describes the Z-Wave device *ISZW7-ECO*, manufactured by *Ecolink* with the thing type UID of ```eco_chimesiren700_00_000```.

The device is in the category of *Battery*, defining Batteries, Energy Storages.

![ISZW7-ECO product image](https://opensmarthouse.org/zwavedatabase/1476/image/)


The ISZW7-ECO supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Z-Wave Chime and Siren with 20 built in sounds, support for custom sounds via 16GB or 32GB FAT32 SDHC card.

Plugs into standard AC outlet and contains a battery backup.

Suitable for door entry chimes, sensor alarms, etc.

### Inclusion Information

Start by placing the controller into inclusion mode.

**Classic Inclusion:**  


Activate inclusion mode for the siren by pressing the pair button on the side of its chassis (not to be confused with the volume up and down buttons).

**S2 secure pairing (untested):**

Use the DSK QR code or 5 digit PIN printed on the unit

### Exclusion Information

Start by placing the controller into exclusion mode.Exclusion mode on the sensor is performed following the same exact procedure as inclusion.

### General Usage Information



## Channels

The following table summarises the channels available for the ISZW7-ECO -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Alarm (system) | alarm_system | alarm_system |  | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Alarm (system)
Indicates if a system alarm is triggered.

The ```alarm_system``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

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

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The device does not support associations.
## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
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

* [User Manual](https://opensmarthouse.org/zwavedatabase/1476/reference/iszw7eco.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1476).
