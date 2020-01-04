---
layout: documentation
title: ThermIQ Temperature Sensor - ZWave
---

{% include base.html %}

# ThermIQ Temperature Sensor Ambient Temperature Sensor
This describes the Z-Wave device *ThermIQ Temperature Sensor*, manufactured by *[BeNext](http://www.benext.eu/)* with the thing type UID of ```benext_thermiqtemp_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![ThermIQ Temperature Sensor product image](https://www.cd-jackson.com/zwave_device_uploads/1172/1172_default.png)


The ThermIQ Temperature Sensor supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The ThermIQ Temperature Sensor does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Simple ambient temperature sensor that comes with ThermIQ infrared panels

### Inclusion Information

  * Remove the back cover
  * Mount 2 AAA batteries
  * Enable inclusion mode on the controller
  * Press and hold tamper switch till the red led starts blinking
  * Release tamper switch

### Exclusion Information

  * Remove the back cover
  * Mount 2 AAA batteries
  * Enable exclusion mode on the controller
  * Press and hold tamper switch till the red led starts blinking
  * Release tamper switch

### Wakeup Information

The ThermIQ Temperature Sensor does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Device can be set to wake up on a set time interval

### General Usage Information

Typically used in combination with the Resistive High Power Dimmer for an IR Panel that is also delivered by ThermIQ. Set the temperature setpoint with THERMOSTAT\_SETPOINT\_SET and the Thermostat then controls the IR PANEL with BASIC\_ON and BASIC\_OFF. Still searching for specific documentation, adding BeNext config (Dutch) and Resistive High Power Dimmer doc.

## Channels

The following table summarises the channels available for the ThermIQ Temperature Sensor -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Alarm | alarm_general | alarm_general | Alarm | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Setpoint (heating)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Alarm
Indicates if an alarm is triggered.

The ```alarm_general``` channel is of type ```alarm_general``` and supports the ```Switch``` item and is in the ```Alarm``` category. This is a read only channel so will only be updated following state changes from the device.

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

The ThermIQ Temperature Sensor supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [BeNext environment configuration (NL)](https://www.cd-jackson.com/zwave_device_uploads/1172/Hoe-meld-ik-thermostaten-aan---ThermIQ.pdf)
* [Resistive High Power Dimmer EU Quick Start](https://www.cd-jackson.com/zwave_device_uploads/1172/ir-paneel-dimmer.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1172).
