---
layout: documentation
title: builtInDimmer - ZWave
---

{% include base.html %}

# builtInDimmer Built-in Dimmer
This describes the Z-Wave device *builtInDimmer*, manufactured by *[BeNext](http://www.benext.eu/)* with the thing type UID of ```benext_builtindimmer_00_000```.

![builtInDimmer product image](https://www.cd-jackson.com/zwave_device_uploads/225/225_default.png)


The builtInDimmer supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/225) to improve the documentation.

## Channels

The following table summarises the channels available for the builtInDimmer -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Electric meter (kWh) | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | Energy | Number | 

### Dimmer

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Electric meter (kWh)

Indicates the energy consumption (kWh).

The ```meter_kwh``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)

Indicates the instantaneous power consumption.

The ```meter_watts``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 13 configuration parameters available in the builtInDimmer.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Reset to factory settings | Set all configuration values to default values (factory settings). |
| 2 | The way how the button reacts when press/released | The way how the button reacts when press/released |
| 3 | The way the Built-in Dimmer reacts when light is turned on/off with button | The way the Built-in Dimmer reacts when light is turned on/off with button |
| 4 | Enable dimming | This parameter is used to enable the dimming option of the product. When disabled the dimming and fading routine are disabled. |
| 6 | Maximum load | The maximum powerload in watts when light is turned on, when measured higher then this value the Inline Dimmer is automatically turned off. |
| 7 | Dimming speed | The speed of dimming when activated (manual and RF). Dim speed is 1% per value (\* 10 ms) |
| 8 | Fading up speed | The speed of fading when activated (manual and RF). Fade speed is 1% per value (\* 10 ms) |
| 9 | Toggle time | The time window to repress button to start dimming. Toggle time is value (\* 10ms) |
| 11 | Auto meter report: percentage | A percentage that an energy value must be different compared to a previous sent value before an unsolicited meter report is sent. Minimum value = 10% Maximum value = 100% |
| 12 | Auto meter report: watt | A watt value that an energy value must be different compared to a previous sent value before an unsolicited meter report is sent. Minimum value = 5 watt Maximum value = 255 watt |
| 13 | Auto meter report: time | A time value that has to be passed compared to a previous sent value before a unsolicited meter report is sent. Minimum value = 10 seconds Maximum value = 255 seconds |
| 14 | Last known status | What to do with lamp status when power applied. If 0x00: Always switch light off when power applied. If > 0x00: Switch lamp on/off depending on last known lampstatus before power was disconnected. |
| 15 | Fading down speed | The speed of fading when activated (manual and RF). Fade speed is 1% per value (\* 10 ms) |

### Parameter 1: Reset to factory settings

Set all configuration values to default values (factory settings).

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: The way how the button reacts when press/released

The way how the button reacts when press/released

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Toggle light when button is pressed, no action when button is released |
| 1 | Toggle light when button is released, Start dimming when button presse |
| 2 | Toggle light when button is pressed and when button is Released, start |

The manufacturer defined default value is ```0``` (Toggle light when button is pressed, no action when button is released).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: The way the Built-in Dimmer reacts when light is turned on/off with button

The way the Built-in Dimmer reacts when light is turned on/off with button

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Switch own light on and send a Z-Wave message to all associated nodes |
| 1 | Don.t switch own light on but only send a Z-Wave message to associated |

The manufacturer defined default value is ```0``` (Switch own light on and send a Z-Wave message to all associated nodes ).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Enable dimming

This parameter is used to enable the dimming option of the product. When disabled the dimming and fading routine are disabled.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```0``` (Disable).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 6: Maximum load

The maximum powerload in watts when light is turned on, when measured higher then this value the Inline Dimmer is automatically turned off.

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```200```.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.


### Parameter 7: Dimming speed

The speed of dimming when activated (manual and RF). Dim speed is 1% per value (\* 10 ms)

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Fading up speed

The speed of fading when activated (manual and RF). Fade speed is 1% per value (\* 10 ms)

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Toggle time

The time window to repress button to start dimming. Toggle time is value (\* 10ms)

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 11: Auto meter report: percentage

A percentage that an energy value must be different compared to a previous sent value before an unsolicited meter report is sent. Minimum value = 10% Maximum value = 100%

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Auto meter report: watt

A watt value that an energy value must be different compared to a previous sent value before an unsolicited meter report is sent. Minimum value = 5 watt Maximum value = 255 watt

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Auto meter report: time

A time value that has to be passed compared to a previous sent value before a unsolicited meter report is sent. Minimum value = 10 seconds Maximum value = 255 seconds

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Last known status

What to do with lamp status when power applied. If 0x00: Always switch light off when power applied. If > 0x00: Switch lamp on/off depending on last known lampstatus before power was disconnected.

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Fading down speed

The speed of fading when activated (manual and RF). Fade speed is 1% per value (\* 10 ms)

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The builtInDimmer supports 3 association groups.

### Group 1: Group 1


This group supports 8 nodes.

### Group 2: Group 2


This group supports 1 nodes.

### Group 3: Group 3


This group supports 1 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| |
| COMMAND_CLASS_METER_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/225/builtindimmer-quickstart.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/225).
