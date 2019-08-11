---
layout: documentation
title: builtInDimmer - ZWave
---

{% include base.html %}

# builtInDimmer Built-in Dimmer
This describes the Z-Wave device *builtInDimmer*, manufactured by *[BeNext](http://www.benext.eu/)* with the thing type UID of ```benext_builtindimmer_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![builtInDimmer product image](https://www.cd-jackson.com/zwave_device_uploads/225/225_default.png)


The builtInDimmer supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Basic operations

  * The Built-in Dimmer can trigger any rule or lifestyle.
  * The Built-in Dimmer can dim up to 125Watt.
  * The Built-in Dimmer can be placed behind your wall switch (41\*41\*13mm).
  * The Built-in Dimmer is easy to install and configured.
  * The Built-in Dimmer will power itself through halogen or incandescent light. (no blue wire or neutral line is needed)
  * Indoor use only. 

### Inclusion Information

When the light is off (!) press/flip the wall switch once, after circa two seconds release/flip back the wall switch to start the inclusion process. 

### Exclusion Information

When the light is off (!) press/flip the wall switch once, after circa two seconds release/flip back the wall switch to start the exclusion process.

## Channels

The following table summarises the channels available for the builtInDimmer -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 13 configuration parameters available in the builtInDimmer.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Reset to factory settings | Set all configuration values to default values (factory settings). |
| 2 | The way how the button reacts when press/released | The way how the button reacts when press/released |
| 3 | Control Type | The way the Built-in Dimmer reacts when light is turned on/off with button |
| 4 | Enable dimming | Enable dimming |
| 6 | Maximum load | Maximum load |
| 7 | Dimming speed | Dimming speed |
| 8 | Fading up speed | Fading up speed |
| 9 | Toggle time | Toggle time |
| 11 | Auto meter report: percentage | Auto meter report: percentage |
| 12 | Auto meter report: watt | Auto meter report: watt |
| 13 | Auto meter report: time | Auto meter report: time |
| 14 | Last known status | Last known status |
| 15 | Fading down speed | Fading down speed |

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
| 0 | Toggle light when button is pressed only |
| 1 | Toggle light on release, dimming on press |
| 2 | Toggle on press & Dim with quick press & release |

The manufacturer defined default value is ```0``` (Toggle light when button is pressed only).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Control Type

The way the Built-in Dimmer reacts when light is turned on/off with button

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Switch own light on and send message to all nodes |
| 1 | Don't switch own light. only send to extern node |

The manufacturer defined default value is ```0``` (Switch own light on and send message to all nodes ).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Enable dimming

Enable dimming
This parameter is used to enable the dimming option of the product.

When disabled the dimming and fading routine are disabled.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```0``` (Disable).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 6: Maximum load

Maximum load
The maximum power load in watts when light is turned on, when measured higher then this value the Inline Dimmer is automatically turned off.
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```200```.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.


### Parameter 7: Dimming speed

Dimming speed
The speed of dimming when activated (manual and RF). Dim speed is 1% per value (* 10 ms)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Fading up speed

Fading up speed
The speed of fading when activated (manual and RF). Fade speed is 1% per value (* 10 ms)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Toggle time

Toggle time
The time window to re-press button to start dimming. Toggle time is value (* 10ms)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 11: Auto meter report: percentage

Auto meter report: percentage
A percentage that an energy value must be different compared to a previous sent value before an unsolicited meter report is sent.

Minimum value = 10%  Maximum value = 100%
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Auto meter report: watt

Auto meter report: watt
A watt value that an energy value must be different compared to a previous sent value before an unsolicited meter report is sent.

Minimum value = 5 watt  Maximum value = 255 watt
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Auto meter report: time

Auto meter report: time
A time value that has to be passed compared to a previous sent value before a unsolicited meter report is sent.

Minimum value = 10 seconds  Maximum value = 255 seconds
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Last known status

Last known status
What to do with lamp status when power applied.

If 0x00: Always switch light off when power applied.

If > 0x00: Switch lamp on/off depending on last known lamp status before power was disconnected.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Fading down speed

Fading down speed
The speed of fading when activated (manual and RF).

Fade speed is 1% per value (* 10 ms)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The builtInDimmer supports 3 association groups.

### Group 1: Group 1

All nodes in this group will receive a BASIC_SET frame
All nodes in this group will receive a BASIC_SET frame when light is set to a certain state with the button of the Built-in Dimmer (manual switching).

When light is switched off with button: BASIC_SET frame with value 0 is sent to associated nodes.

When light is set to a dim level with button: BASIC_SET frame with value 0 – 99 is sent to associated nodes.

When light is switched on with button: BASIC_SET frame with value 255 is sent to associated nodes.

It is most likely that switch\_binary/switch\_multilevel devices are associated in this group so that you can switch multiple nodes on/off with 1 button pres

Association group 1 supports 8 nodes.

### Group 2: Group 2

The node associated in this group will receive a SWITCH\_MULTILEVEL\_REPORT frame every time the level of light is changed, where the value represents the (changed) dim level. The status is reported after every change that means manual but also if changed by Z-Wave.

The node in this group will also received the (auto) METER\_REPORT (see § COMMAND\_CLASS\_METER à unsolicited METER\_REPORT for more information about this feature).

It is most likely that a controller or screen is associated in this group to report (unsolicited) any changes to the light.

Association group 2 supports 1 node.

### Group 3: Group 3

If configured that the control mode is extern only (configuration param3 à value 1) then a BASIC\_SET frame is sent to the node in this group when the button is changed. Note that the light of the Built-in Dimmer is not switched on/off but instead the BASIC\_SET frame is sent, because the Built-in Dimmer doesn’t know what the extern status is the value of the BASIC_SET frame toggles between the values 0 and 255.

It is most likely that a Gateway (controller) is associated in this group. A Gateway can handle upon the received frame. With a Gateway controlled network it possible to add multiple functionalities to the button of the Builtin Dimmer.

Association group 3 supports 1 node.

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
