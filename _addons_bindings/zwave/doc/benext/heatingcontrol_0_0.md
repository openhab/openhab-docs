---
layout: documentation
title: Heating Control - ZWave
---

{% include base.html %}

# Heating Control Thermostat for controlling the opentherm protocol
This describes the Z-Wave device *Heating Control*, manufactured by *[BeNext](http://www.benext.eu/)* with the thing type UID of ```benext_heatingcontrol_00_000```.

![Heating Control product image](https://www.cd-jackson.com/zwave_device_uploads/473/473_default.png)


The Heating Control supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

The Heating Control is the central point of your climate environment. You can overwrite the temperature setpoint of your thermostat, and this product also reports information about your thermostat or boiler. For example the room temperature, boiler pressure, modulation level or water temperature.

This product can be simply placed between your thermostat and boiler. The current setup is not changed and therefore you can still use the device as you normally would do. You don’t have to replace your current thermostat.

Note: This product only works if the current communication between your thermostat and boiler uses the standardized modulating protocol Open Therm. If you are not sure whether your thermostat/boiler uses Open Therm, you may find that in the manual of your thermostat/boiler. You can also find it on the internet. You can search for example on ‘Honeywell round clock open therm’.

## Channels

The following table summarises the channels available for the Heating Control -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Room temperature | sensor_temperature | Temperature | Number | 
| Outside temperature | sensor_temperature | Temperature | Number | 
| Thermostat mode | thermostat_mode | Temperature | Number | 
| Heating setpoint | thermostat_setpoint | Temperature | Number | 
| Energy save setpoint | thermostat_setpoint | Temperature | Number | 

### Room temperature

Room temperature of the room thermostat

Indicates the current temperature.

The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Outside temperature

The temperature outside, if reported by the boiler

Indicates the current temperature.

The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Thermostat mode

Determines the mode of the thermostat, either ON ("Heat", 1), or OFF ("Off", 0). The heating setpoint will be applied if the mode Heat is applied and the Energy saving setpoint if the mode Off is applied

Sets the thermostat.

The ```thermostat_mode``` channel supports the ```Number``` item and is in the ```Temperature``` category.
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
| 15 | Full Power |
| 31 | Manufacturer Specific |

### Heating setpoint

The setpoint used for the heating schedule

Sets the thermostate setpoint.

The ```thermostat_setpoint``` channel supports the ```Number``` item and is in the ```Temperature``` category.

### Energy save setpoint

The setpoint used for the energy save heating program

Sets the thermostate setpoint.

The ```thermostat_setpoint``` channel supports the ```Number``` item and is in the ```Temperature``` category.



## Device Configuration

The following table provides a summary of the 9 configuration parameters available in the Heating Control.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Set to default | Set all configuration values to default values (factory settings) |
| 2 | Data request interval | Interval of updating data from thermostat and boiler |
| 3 | T room update difference | Difference of temperature before new update |
| 4 | T setpoint update difference | Difference in setpoint before new update |
| 5 | Unsolicited CRC | CRC-16 encapulation |
| 6 | Type of 'special' thermostat | Type of 'special' thermostat if applicable |
| 7 | Status auto report | Status auto report boiler/thermostat report. |
| 9 | Enable/Disable thermostat schedule | Enable/Disable thermostat schedule inside the controller |
| 11 | Readout manual setpoint thermostat | Readout manual setpoint thermostat |

### Parameter 1: Set to default

Set all configuration values to default values (factory settings)
If 0xFF (255) then set to default
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 255 | Reset |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Data request interval

Interval of updating data from thermostat and boiler
The interval in seconds that data is requested (and therefore updated) from the thermostat and boiler.
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```14```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: T room update difference

Difference of temperature before new update
The value that the room temperature must differ (compared to his previous send value) before an unsolicited room temperature report is send to the associated node.
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: T setpoint update difference

Difference in setpoint before new update
The value that the temperature setpoint must differ (compared to his previous send value) before an unsolicited temperature setpoint report is send to the associated node.
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Unsolicited CRC

CRC-16 encapulation
Configure if the unsolicited reports are send with the CRC-16 encapsulation. Not that the receiving node should support this encapsulation to parse the Z-Wave frame!This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 255 | On |

The manufacturer defined default value is ```0``` (Off).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Type of 'special' thermostat

Type of 'special' thermostat if applicable
Type of 'special' thermostat. NOTE: when remeha Celcia 20 support is set than any other thermostat cannot be set (!) NOTE2: when Remeha Celcia 20 gives 'Fout 203' send cfg value again
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No special |
| 1 | Remeha Celcia 20 |
| 2 | Honeywell (rounded temperatures) |

The manufacturer defined default value is ```0``` (No special).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Status auto report

Status auto report boiler/thermostat report.
Status auto report boiler/thermostat report.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable boiler/thermostat status messages auto report |
| 255 | Enable boiler/thermostat status messages auto report |

The manufacturer defined default value is ```0``` (Disable boiler/thermostat status messages auto report).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 9: Enable/Disable thermostat schedule

Enable/Disable thermostat schedule inside the controller
Enable/Disable thermostat schedule inside the heatingcontroller
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable thermostat schedule |
| 255 | Enable thermostat schedule |

The manufacturer defined default value is ```0``` (Disable thermostat schedule).

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 11: Readout manual setpoint thermostat

Readout manual setpoint thermostat
This parameter is used to set the possible manual readout of the setpoint on the thermostat. If the thermostat is manually set to a different mode it is then possible to readout this value if enabled.

(NB. This setting is not in the manual but verified through contacting the service department of BeNext).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Readout OFF |
| 255 | Readout ON |

The manufacturer defined default value is ```0``` (Readout OFF).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Heating Control supports 1 association group.

### Group 1: Group 1

Unsolicited reports
This group supports 1 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V6| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| Linked to BASIC|
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_CRC_16_ENCAP_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V3| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Heating Control Manual EN](https://www.cd-jackson.com/zwave_device_uploads/473/heatingcontrol.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/473).
