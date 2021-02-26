---
layout: documentation
title: Z-Smoke - ZWave
---

{% include base.html %}

# Z-Smoke Smoke detector and motion sensor
This describes the Z-Wave device *Z-Smoke*, manufactured by *ThermoFloor* with the thing type UID of ```thermofloor_Zsmoke_00_000```.

The device is in the category of *Smoke Detector*, defining Smoke detectors.

![Z-Smoke product image](https://opensmarthouse.org/zwavedatabase/1343/image/)


The Z-Smoke supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Heatit Z-Smoke Detector is a wireless smoke sensor with built-in PIR motion sensor, temperature sensor and emergency light. Heatit Z-Smoke Detector is a wireless operated photo-electronic smoke detector designed to interact with most Z-Wave enabled controllers. The detector features smoke-, temperature-, and IR-detection.

When other sensors in the Z-Wave network are activated and send an alarm signal, the smoke detector will also sound an alarm with its built-in siren to help give warning.

### Inclusion Information

After power is applied, the smoke detector initiates a 1-minute warm-up period. During this minute, the device will automatically enter add/remove mode, and may now be added to the system via the primary controller.

After the calibration process is finished, you may access the add/remove mode by pressing the function button three times within 1.5 seconds. Removing the device will reset it to factory settings.

### Exclusion Information

Put controller into exclusion mode and access the add/remove mode by pressing the function button three times within 1.5 seconds. Removing the device will reset it to factory settings.

### General Usage Information

Function button:

• Press the button once to send a test signal and temperature report to gateway.

• Press the button once during an alarm to silence the alarm.

• Press the button 3 times within 1.5 seconds to send a learn code.

• Press and hold the button for 10 seconds to enter the calibration process.

• Press and hold the button for 20 seconds to perform a factory reset.

## Channels

The following table summarises the channels available for the Z-Smoke -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Alarm (smoke) | alarm_smoke | alarm_smoke | Smoke | Switch | 
| Alarm (heat) | alarm_heat | alarm_heat | Fire | Switch | 
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Switch


Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Alarm (smoke)
Indicates if a smoke is triggered.

The ```alarm_smoke``` channel is of type ```alarm_smoke``` and supports the ```Switch``` item and is in the ```Smoke``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```Fire``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (burglar)
Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel is of type ```alarm_burglar``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

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

The Z-Smoke supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Device status
Lifeline. Normally used by the Z-Wave

Controller.

Association group 1 supports 5 nodes.

### Group 2: Sensor Basic set

Basic set
When the smoke detector is active, it will send basic set (0xFF). When the smoke detector is deactived, it will send basic set (0x00).

Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V11| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Manual_Heatit-Z-Smoke-Detector-230V-ENG.pdf](https://opensmarthouse.org/zwavedatabase/1343/reference/Manual_Heatit-Z-Smoke-Detector-230V-ENG.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1343).
