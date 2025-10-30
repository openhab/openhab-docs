---
layout: documentation
title: SDCO-1-RhTH-ZW-SC-OTA - ZWave
---

{% include base.html %}

# SDCO-1-RhTH-ZW-SC-OTA Smoke and Carbon Monocide Detector
This describes the Z-Wave device *SDCO-1-RhTH-ZW-SC-OTA*, manufactured by *Climax Technology, Ltd.* with the thing type UID of ```climax_sdco1rhth_00_000```.

The device is in the category of *Battery*, defining Batteries, Energy Storages.

![SDCO-1-RhTH-ZW-SC-OTA product image](https://opensmarthouse.org/zwavedatabase/1545/image/)


The SDCO-1-RhTH-ZW-SC-OTA supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

Z-Wave Smoke and Carbon Monoxide Detector with 

temperature, humidity, and heat detection, as well as voice prompts and allows access to the “S2 Unauthenticated” class. It is 

capable of sending wireless signals to the Z-Wave gateway/control panel upon detection of smoke particles or Carbon Monoxide.

The device is also serially connected with other sensors in the Z-Wave gateway to serve as an extra siren. When any other 

sensor in the Z-Wave network is activated and sends an alarm signal, the Smoke Detector will also raise alarm with its built-in 

buzzer as a siren to help sound warning (for serial connection models)

### Inclusion Information

  1. Put the Z-Wave gateway or control panel into Inclusion mode (please refer to the Z-Wave gateway or control panel manual).
  2. Within 1.5 seconds, press the button 3 times.
  3. Refer to the operation manual of the Z-Wave gateway or control panel to complete the inclusion process.
  4. If the sensor has already been included into another Z-Wave Gateway/Control Panel, or if the sensor is unable to be included into the current Z-Wave Gateway/Control Panel, please exclude it first (see Exclusion) before attempting to include it into the current Z-WaveGateway/Control Panel

### Exclusion Information

The SDCO must be removed from existing Z-Wave network before being included into another.

  1. Put the Z-Wave gateway or control panel into Exclusion mode (please refer to the Z-Wave gateway or control panel manual).
  2. Within 1.5 seconds, press the button 3 times and the SDCO will be removed from the Z-Wave network.

### General Usage Information



## Channels

The following table summarises the channels available for the SDCO-1-RhTH-ZW-SC-OTA -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number | 
| Alarm (smoke) | alarm_smoke | alarm_smoke | Smoke | Switch | 
| Alarm (CO) | alarm_co | alarm_co |  | Switch | 
| Alarm (heat) | alarm_heat | alarm_heat | temperature_hot | Switch | 
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (relative humidity)
Indicates the current relative humidity.

The ```sensor_relhumidity``` channel is of type ```sensor_relhumidity``` and supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (smoke)
Indicates if a smoke is triggered.

The ```alarm_smoke``` channel is of type ```alarm_smoke``` and supports the ```Switch``` item and is in the ```Smoke``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (CO)
Indicates if the carbon monoxide alarm is triggered.

The ```alarm_co``` channel is of type ```alarm_co``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```temperature_hot``` category. This is a read only channel so will only be updated following state changes from the device.

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

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The SDCO-1-RhTH-ZW-SC-OTA supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Main group to send sensory and notification messages
Group 1 for “LifeLine”:

Battery CC (COMMAND\_CLASS\_BATTERY)

Notification CC,V8 (COMMAND\_CLASS\_NOTIFICATION)

Sensor Multilevel CC, V11 (COMMAND\_CLASS\_SENSOR_MULTILEVEL)

Device Reset Locally CC (COMMAND\_CLASS\_DEVICE\_RESET\_LOCALLY)

Association group 1 supports 1 node.

### Group 2: Sensor Basic Set

Group to control siren
Basic CC (COMMAND\_CLASS\_BASIC)

When the Smoke Detector is active, it will send Basic Set (0xFF) in Group 2.

When the Smoke Detector is restored, it will send Basic Set (0x00) in Group 2

Association group 2 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V10| |
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
| COMMAND_CLASS_INDICATOR_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Product Manual](https://opensmarthouse.org/zwavedatabase/1545/reference/SDCO-1-RhTH-AC-ZW_190905.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1545).
