---
layout: documentation
title: ZMNHSD - ZWave
---

{% include base.html %}

# ZMNHSD DIN Rail Dimmer
This describes the Z-Wave device *ZMNHSD*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhsd_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZMNHSD product image](https://www.cd-jackson.com/zwave_device_uploads/324/324_default.jpg)


The ZMNHSD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

This Z-wave module is used for dimming the bulb or to manage the speed of a fan. The module can be controlled either thorough Z-wave network or through the wall switch.

The module is designed to be mounted inside an electrical cabinet onto DIN rail.

Module measures power consumption of bulb or fan and supports connection of digital temperature sensor. It is designed to act as repeater in order to improve range and stability of Z-wave network.

### Inclusion Information

Press service button S for more than 6 seconds or press push button I five times within 3s (5 times change switch state within 3 seconds) in the first 60 seconds after the module is connected to the power supply

### Exclusion Information

If service button S is pressed more than 2 and less than 6 seconds (or if push button I is pressed three times within 3s) module is excluded, but configuration parametres are not set to default values.

Note: If the module is included with parameter 5 with value different from default and module reset is done, wait at least 30s before next inclusion

## Channels

The following table summarises the channels available for the ZMNHSD -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch  [Deprecated]| switch_binary | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 

### Switch [Deprecated]
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

**Note:** This channel is marked as deprecated so should not be used.

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 17 configuration parameters available in the ZMNHSD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Input switch type |  |
| 5 | Working mode | Module presentation on the user interface. |
| 10 | Activate / deactivate functions ALL ON / ALL OFF | DIN dimmer module responds to commands ALL ON / ALL OFF |
| 11 | Automatic turning off output after set time | Automatic turning off output after set time |
| 12 | Automatic turning on output after set time | Automatic turning on output after set time |
| 21 | Enable / Disable Double click function | If Double click function is enabled, double click to maximum dimming power |
| 30 | Save state of after a power failure | Saving the state of the device after a power failure |
| 40 | Power reporting in watts on power change | Reporting the power in Watts on power change larger then the setpoint |
| 42 | Power reporting in Watts by time interval | Power reporting in Watts by time interval according to setpoint |
| 60 | Minimum dimming value | Minimum % dimming value of dimmer |
| 61 | Maximum dimming value | Maximum % dimming value on dimmer |
| 65 | Dimming time (soft on/off) | Set value means time of moving the Dimmer between min. and max. dimming |
| 66 | Dimming time when key pressed | Time to moving the Dimmer between min. and max values (in seconds). |
| 67 | Ignore start level | Ignore or respect start level when used together with association group 3 |
| 68 | Dimming duration | This parameter is used with association group 3. |
| 110 | Temperature sensor offset settings | Temperature sensor offset settings between -10.0 to 10.0 °C |
| 120 | Digital temperature sensor reporting | Reporting temperature when change is larger than defined by this parameter |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Input switch type



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Mono-stable switch type (push button) |
| 1 | Bi-stable switch type |

The manufacturer defined default value is ```0``` (Mono-stable switch type (push button)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 5: Working mode

Module presentation on the user interface.
With this parameter it is possible to change the module presentation on the user interface.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Dimmer |
| 1 | Switch |

The manufacturer defined default value is ```0``` (Dimmer).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 10: Activate / deactivate functions ALL ON / ALL OFF

DIN dimmer module responds to commands ALL ON / ALL OFF
DIN dimmer module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system. 

  * default value 255
  * 255 - ALL ON active, ALL OFF active.
  * 0 - ALL ON is not active, ALL OFF is not active
  * 1 - ALL ON is not active, ALL OFF active
  * 2 - ALL ON active, ALL OFF is not active
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | ALL ON is not active, ALL OFF is not active |
| 1 | ALL ON is not active, ALL OFF active |
| 2 | ALL ON active, ALL OFF is not active |
| 255 | ALL ON active, ALL OFF active |

The manufacturer defined default value is ```255``` (ALL ON active, ALL OFF active).

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Automatic turning off output after set time

Automatic turning off output after set time
  * 0 - Auto OFF disabled
  * 1 – 32536 = 1 second – 32536 seconds Auto OFF enabled with defined time, step is 1 second.
The following option values may be configured, in addition to values in the range 0 to 32536 -:

| Value  | Description |
|--------|-------------|
| 0 | Auto off DISABLED |

The manufacturer defined default value is ```0``` (Auto off DISABLED).

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Automatic turning on output after set time

Automatic turning on output after set time
  * 0 - Auto ON disabled
  * 1 – 32536 = 1 second – 32536 seconds Auto ON enabled with defined time, step is 1 second.
The following option values may be configured, in addition to values in the range 0 to 32536 -:

| Value  | Description |
|--------|-------------|
| 0 | Auto on DISABLED |

The manufacturer defined default value is ```0``` (Auto on DISABLED).

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 21: Enable / Disable Double click function

If Double click function is enabled, double click to maximum dimming power
If Double click function is enabled, a fast double click on the push button will set dimming power at maximum dimming value.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | double click disabled |
| 1 | double click enabled |

The manufacturer defined default value is ```0``` (double click disabled).

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 30: Save state of after a power failure

Saving the state of the device after a power failure
Available configuration parameters:

  * default value 0
  * 0 – DIN dimmer module saves its state before power failure (it returns to the last position saved before a power failure).
  * 1 – DIN dimmer module does not save the state after a power failure, it returns to "off" position.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Save state enabled |
| 1 | Save state disabled |

The manufacturer defined default value is ```0``` (Save state enabled).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 40: Power reporting in watts on power change

Reporting the power in Watts on power change larger then the setpoint
Set value means percentage, set value from 0 - 100=0% - 100%. 

Available configuration parameters:

  * default value 5
  * 0 – Reporting Disabled
  * 1 – 100 = 1% - 100% Reporting enabled. Power report is send (push) only when actual power in Watts in real time changes for more than set percentage comparing to previous actual power in Watts, step is 1%.

NOTE: if power changed is less than 1W, the report is not send (pushed), independent of percentage set.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 42: Power reporting in Watts by time interval

Power reporting in Watts by time interval according to setpoint
Set value means time interval (0 – 32767) in seconds, when power report is send. 

Available configuration parameters:

  * default value 0
  * 0 – reporting disabled
  * 1 – 32767 = 1 second – 32767 seconds. Reporting enabled. Power report is send with time interval set by entered value. Please note, that too fast reporting can cause too much Z-Wave traffic resulting in Z-Wave poor response.
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_42_2``` and is of type ```INTEGER```.


### Parameter 60: Minimum dimming value

Minimum % dimming value of dimmer
Available configuration parameters:

  * default value 1 = 1% (minimum dimming value)
  * 1- 98 = 1% – 98%, step is 1%. Minimum dimming values is set by entered value.

NOTE: The minimum level may not be higher than the maximum level! 1% min. dimming value is defined by Z-Wave multilevel device class.
Values in the range 1 to 98 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_60_1``` and is of type ```INTEGER```.


### Parameter 61: Maximum dimming value

Maximum % dimming value on dimmer
Available configuration parameters:

  * default value 99 = 99% (Maximum dimming value)
  * 2- 99 = 2% – 99%, step is 1%. Maximum dimming values is set by entered value.

NOTE: The maximum level may not be lower than the minimum level! 99% max. dimming value is defined by Z-Wave multilevel device class.
Values in the range 2 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_61_1``` and is of type ```INTEGER```.


### Parameter 65: Dimming time (soft on/off)

Set value means time of moving the Dimmer between min. and max. dimming
Set value means time of moving the Dimmer between min. and max. dimming values by short press of push button I or controlled through UI (BasicSet). Available configuration parameters (data type is 2 Byte DEC): 

  * default value 100 = 1s
  * 1 - 255 = 100 mseconds – 25500 mseconds (25,5s), step is 100 mseconds
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_65_2``` and is of type ```INTEGER```.


### Parameter 66: Dimming time when key pressed

Time to moving the Dimmer between min. and max values (in seconds).
  * default value 3 = 3s
  * 1- 255 = 1 second – 255 seconds.
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_66_2``` and is of type ```INTEGER```.


### Parameter 67: Ignore start level

Ignore or respect start level when used together with association group 3
This parameter is used with association group 3.

A receiving device SHOULD respect the start level if the Ignore Start Level bit is 0.  
A receiving device MUST ignore the start level if the Ignore Start

Level bit is 1. Available configuration parameters:

  * default value 0 = respect start level
  * 1 = ignore start level
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | respect start level |
| 1 | ignore start level |

The manufacturer defined default value is ```0``` (respect start level).

This parameter has the configuration ID ```config_67_1``` and is of type ```INTEGER```.


### Parameter 68: Dimming duration

This parameter is used with association group 3.
The Duration field MUST specify the time that the transition should take from the current value to the new target value. A supporting device SHOULD respect the specified Duration value.
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_68_1``` and is of type ```INTEGER```.


### Parameter 110: Temperature sensor offset settings

Temperature sensor offset settings between -10.0 to 10.0 °C
Set value is added or subtracted to actual measured value by sensor.

Available configuration parameters:

  * default value = 32536
  * 32536 = offset is 0.0C
  * 1 – 100 = value from 0.1 °C to 10.0 °C is added to actual measured temperature.
  * 1001 – 1100 = value from -0.1 °C to -10.0 °C is subtracted to actual measured temperature.
Values in the range 1 to 32536 may be set.

The manufacturer defined default value is ```32536```.

This parameter has the configuration ID ```config_110_2``` and is of type ```INTEGER```.


### Parameter 120: Digital temperature sensor reporting

Reporting temperature when change is larger than defined by this parameter
If digital temperature sensor is connected, module reports measured temperature on temperature change defined by this parameter.

Available configuration parameters:

  * default value 5 = 0,5°C change
  * 0 = Reporting disabled
  * 1- 127 = 0,1°C – 12,7°C, step is 0,1°C
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_120_1``` and is of type ```INTEGER```.

### Switch All Mode

Set the mode for the switch when receiving SWITCH ALL commands.

The following option values may be configured -:
| Value  | Description |
|--------|-------------|
| 0 | Exclude from All On and All Off groups |
| 1 | Include in All On group |
| 2 | Include in All Off group |
| 255 | Include in All On and All Off groups |

This parameter has the configuration ID ```switchall_mode``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZMNHSD supports 5 association groups.

### Group 1: Controller Updates


Association group 1 supports 1 node.

### Group 2: I1 basic on/off


Association group 2 supports 16 nodes.

### Group 3: I1 start/stop level change


Association group 3 supports 16 nodes.

### Group 4: Multilevel set


Association group 4 supports 16 nodes.

### Group 5: Multilevel sensor report


Association group 5 supports 16 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Qubino DIN Dimmer User Manual](https://www.cd-jackson.com/zwave_device_uploads/324/Qubino-DIN-Dimmer-user-PLUS-manual-V1-0-eng-1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/324).
