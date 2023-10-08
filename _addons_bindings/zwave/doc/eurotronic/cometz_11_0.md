---
layout: documentation
title: Comet Z - ZWave
---

{% include base.html %}

# Comet Z HVAC- Radiator Controller
This describes the Z-Wave device *Comet Z*, manufactured by *Eurotronics* with the thing type UID of ```eurotronic_cometz_11_000```.
This version of the device is limited to firmware versions above 11.0

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![Comet Z product image](https://opensmarthouse.org/zwavedatabase/1561/image/)


The Comet Z supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

Comet Z-Wave is an energy-saving radiator controller compatible with the Z-Wave wireless standard.

FLiRS (Frequently Listening Receiver Slave):

Comet Z-Wave uses the Z-Wave function FLiRS as a radiator thermostat. As a FLiRS device, the radiator thermostat reacts to incoming commands such as temperature changes with a particularly short latency period.

### Inclusion Information

Put your primary Z-Wave controller into include mode.

If Comet Z-Wave was successfully added, the LED display will show the received node ID.

If “PA” is not displayed, press both buttons on the device, until “PA” apppears.

A count down from 99 will be displayed during inclusion.

The Node ID is displayed if inclusioon was successful.

### Exclusion Information

Please put your Z-Wave controller into the exclusion mode. Then press and hold the button in the battery compartment for 5 seconds until “LE” appears in the display.

FACTORY RESET:  


Press and hold the button in the battery compartment of your Comet Z-Wave for at least 10 seconds. From the 5th second on, a counter will run on the thermostat’s display. Keep the button pressed until the 10 appears on your Comet Z-Wave. Then “PA” will be shown again on the display and the controller will be in teach-in mode.

### General Usage Information



## Channels

The following table summarises the channels available for the Comet Z -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Setpoint (furnace) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Alarm (system) | alarm_system | alarm_system |  | Switch | 
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

### Setpoint (furnace)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (system)
Indicates if a system alarm is triggered.

The ```alarm_system``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 6 configuration parameters available in the Comet Z.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | LCD invert | Invert display |
| 2 | LCD Timeout | 5 - 30: Timeout after 5 seconds - 30 seconds; default: 5 |
| 4 | Batteriestatus | Batteriestatus; 0: Send only event-controlled as system warning; 1: Batteriestatus send 1x a day default: 0x00 |
| 5 | Actual-Temperature | 0: Do not send actual temperature automatically; 5-50 With temperature difference of 0.5°C - 5.0°C transfer actual temperature default: 5 (When Delta = 0,5°C report) |
| 7 | Window-opendetection | 0x00 Deactivated; 0x01 low sensitivity; 0x02 medium sensitivity; 0x03 high sensivity; default: 0x01 low sensitive |
| 8 | Actual-Temperature- Offset | 0xCE-0x32 -5,0°C - (+) 5,0°C default: 0x00 0,0°C Offset |

### Parameter 1: LCD invert

Invert display

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | normal |
| 1 | inverted |

The manufacturer defined default value is ```0``` (normal).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: LCD Timeout

5 - 30: Timeout after 5 seconds - 30 seconds; default: 5

Values in the range 5 to 30 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 4: Batteriestatus

Batteriestatus; 0: Send only event-controlled as system warning; 1: Batteriestatus send 1x a day default: 0x00

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | event controlled |
| 1 | once a day |

The manufacturer defined default value is ```0``` (event controlled).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Actual-Temperature

0: Do not send actual temperature automatically; 5-50 With temperature difference of 0.5°C - 5.0°C transfer actual temperature default: 5 (When Delta = 0,5°C report)

Values in the range 1 to 50 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 7: Window-opendetection

0x00 Deactivated; 0x01 low sensitivity; 0x02 medium sensitivity; 0x03 high sensivity; default: 0x01 low sensitive

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | deactivated |
| 1 | low sensitivity |
| 2 | medium sensitivity |
| 3 | high sensitivity |

The manufacturer defined default value is ```1``` (low sensitivity).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Actual-Temperature- Offset

0xCE-0x32 -5,0°C - (+) 5,0°C default: 0x00 0,0°C Offset

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Comet Z supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline

Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
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
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_PROTECTION_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [photo](https://opensmarthouse.org/zwavedatabase/1561/reference/Comet-Z-Wave-EN-2023-04-06.pdf)
* [manual](https://opensmarthouse.org/zwavedatabase/1561/reference/Comet-Z-Wave-EN-2023-04-06_1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1561).
