---
layout: documentation
title: Spirit - ZWave
---

{% include base.html %}

# Spirit Thermostatic Valve
This describes the Z-Wave device *Spirit*, manufactured by *Aeotec Limited* with the thing type UID of ```aeotec_spirit_00_000```.

The device is in the category of *Radiator Control*, defining Controls on radiators used to heat up rooms.

![Spirit product image](https://www.cd-jackson.com/zwave_device_uploads/1150/1150_default.jpg)


The Spirit supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

Spirit Z-Wave Plus is a Z-Wave radio standard compatible energy-saving radiator thermostat.

FLiRS (Frequently Listening Receiver Slave): Spirit Z-Wave uses FLiRS to provide short latency and short responding times.

### Inclusion Information

Start Inclusion mode of your primary Z-Wave Controller. Press the Boost-Button. Spirit Z-Wave Plus will show the assigned NodeID.

### Exclusion Information

Start Exclusion mode of your primary Z-Wave Controller. Now press and hold the boost button of the Spirit Z-Wave Plus for at least 5 seconds.

## Channels

The following table summarises the channels available for the Spirit -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Current temperature | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| External temperature | sensor_report | sensor_report |  | Number | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Setpoint (heat) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Setpoint (energy heat) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Alarm (system) | alarm_system | alarm_system |  | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Current temperature
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### External temperature
Send report to device.

The ```sensor_report``` channel is of type ```sensor_report``` and supports the ```Number``` item.

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

### Setpoint (heat)
Precision 0,1 and 2 Scale Celsius and Fahrenheit Temp. Range 8°C-28°C

Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Setpoint (energy heat)
Precision 0,1 and 2 Scale Celsius and Fahrenheit Temp. Range 8°C-28°C

Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

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

The following table provides a summary of the 8 configuration parameters available in the Spirit.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | LCD Invert | LCD Invert |
| 2 | LCD Timeout | LCD Timeout |
| 3 | Backlight | Backlight |
| 4 | Battery report | Battery report |
| 5 | Measured  Temperature report | Measured Temperature report |
| 6 | Valve opening percentage report | Valve opening percentage report |
| 7 | Window open detection | Window open detection |
| 8 | Temperature Offset | Measured temperature offset |

### Parameter 1: LCD Invert

LCD Invert

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | LCD-content normal |
| 1 | LCD-content inverted (UK Edition) |

The manufacturer defined default value is ```0``` (LCD-content normal ).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: LCD Timeout

LCD Timeout
0: No Timeout LCD always on

5-30: LCD will turn off after 5 to 30 seconds
The following option values may be configured, in addition to values in the range 5 to 30 -:

| Value  | Description |
|--------|-------------|
| 0 | No Timeout LCD always on |

The manufacturer defined default value is ```0``` (No Timeout LCD always on).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Backlight

Backlight

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Backlight disabled |
| 1 | Backlight enabled |

The manufacturer defined default value is ```1``` (Backlight enabled).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Battery report

Battery report

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | system notification |
| 1 | Send battery status unsolicited once a day. |

The manufacturer defined default value is ```1``` (Send battery status unsolicited once a day. ).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Measured  Temperature report

Measured Temperature report
0: Unsolicited Temperature reporting disabled

1-50: report if temperature changed by delta = 0,1°C ... 5,0 °C

default 5: report on delta T = 0,5°C
Values in the range 0 to 50 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Valve opening percentage report

Valve opening percentage report
0: Unsolicited valve opening percentage reporting disabled.

1-100: report if valve opening changed by delta = 1% ... 100%
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Window open detection

Window open detection

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Sensitivity low |
| 2 | Sensitivity medium |
| 3 | Sensitivity high |

The manufacturer defined default value is ```2``` (Sensitivity medium).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Temperature Offset

Measured temperature offset
-50 ... +50: Offsets the measured temp by -5,0°C ... +5,0°C

128: External temp sensor will be used for regulation.
The following option values may be configured, in addition to values in the range -50 to 50 -:

| Value  | Description |
|--------|-------------|
| 128 | Use ext. temp. sensor |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Spirit supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Spirit Z-Wave Plus can only be associated with the Z-Wave controller.
Commands:

BATTERY\_REPORT, DEVICE\_RESET\_LOCALLY\_NOTIFICATION, THERMOSTAT\_MODE\_REPORT, THERMOSTAT\_SETPOINT\_REPORT, NOTIFICATION\_REPORT, PROTECTION\_REPORT, SENSOR\_MULTILEVEL\_REPORT, SWITCH\_MULTILEVEL\_REPORT

Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| |
| COMMAND_CLASS_THERMOSTAT_MODE_V3| Linked to BASIC|
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_PROTECTION_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V3| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Installation & Operation Guide](https://www.cd-jackson.com/zwave_device_uploads/1150/Eurotronic-Spirit-Thermostat-638f0de8c28ca46b5188891c26a1c05a723a.pdf)
* [Installation & Operation Guide](https://www.cd-jackson.com/zwave_device_uploads/1150/Eurotronic-Spirit-Thermostat-638f0de8c28ca46b5188891c26a1c05a723a.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1150).
