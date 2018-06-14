---
layout: documentation
title: SES FS-ZW - ZWave
---

{% include base.html %}

# SES FS-ZW Plug Actuator
This describes the Z-Wave device *SES FS-ZW*, manufactured by *Diehl AKO* with the thing type UID of ```diehl_sesfszw_00_000```.

The SES FS-ZW supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

### Inclusion Information

The inclusion process is controlled by the central unit – refer to the documentation for the central unit.

1\. Plug the plug actuator into a fixed mains outlet with grounding contacts (CEE 7/4).

2\. Start “Inclusion” mode on the chosen central unit.

3\. Press the button on the plug actuator 3 times within a period of around 2 seconds.

The Status LED lights up white.

During the next 5 seconds, the wireless connection is established and the inclusion process for linking the plug actuator to the central unit is performed.

### Exclusion Information

The exclusion process is controlled by the central unit – refer to the documentation for the central unit.

1\. Make sure that no device is plugged into the plug actuator.

2\. Start “Exclusion” mode on the chosen central unit.

3\. Press the button on the plug actuator 3 times within a period of around 2 seconds.

The Status LED lights up white.

The exclusion process for disconnecting the plug actuator from the central unit runs for the next 5 seconds. The Status LED flashes white 3x once the exclusion process has been successfully completed.

## Channels

The following table summarises the channels available for the SES FS-ZW -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Electric meter (kWh) | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | Energy | Number | 
| Alarm (system) | alarm_system |  | Switch | 
| Alarm (heat) | alarm_heat |  | Switch | 
| Alarm (power) | alarm_power | Door | Switch | 

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (kWh)

Indicates the energy consumption (kWh).

The ```meter_kwh``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)

Indicates the instantaneous power consumption.

The ```meter_watts``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (system)

Indicates if a system alarm is triggered.

The ```alarm_system``` channel supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Alarm (heat)

Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Alarm (power)

Indicates if a power alarm is triggered.

The ```alarm_power``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 11 configuration parameters available in the SES FS-ZW.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Default switch state | Behaviour after mains failure |
| 2 | Energy minimum report time | Minimum time between two (non-requested) energy values |
| 3 | Energy maximum report time | Maximum time between two energy values, independently of changes in the value |
| 4 | Power minimum report time | Minimum time between two (non-requested) power values |
| 5 | Power maximum report time | Maximum time between two power values, independently of changes in the value |
| 6 | Energy delta value | Minimum change required for a new energy value to be transmitted. |
| 7 | Power delta value | Minimum change required for a new power value to be transmitted. |
| 8 | Safety shutdown configuration | Behaviour in the event of a safety shutdown |
| 9 | Reset of overcurrent shutdown | Activation despite 3x safety shutdown |
| 10 | Night mode | Set Night mode of the Status LED |
| 11 | Info LED colour | Set color of the Info LED |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Default switch state

Behaviour after mains failure

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Plug actuator OFF |
| 1 | Plug actuator ON |
| 2 | Last status is restored |

The manufacturer defined default value is ```2``` (Last status is restored).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Energy minimum report time

Minimum time between two (non-requested) energy values

Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Energy maximum report time

Maximum time between two energy values, independently of changes in the value

Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```120```.

This parameter has the configuration ID ```config_3_2``` and is of type ```INTEGER```.


### Parameter 4: Power minimum report time

Minimum time between two (non-requested) power values

Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_4_2``` and is of type ```INTEGER```.


### Parameter 5: Power maximum report time

Maximum time between two power values, independently of changes in the value

Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```120```.

This parameter has the configuration ID ```config_5_2``` and is of type ```INTEGER```.


### Parameter 6: Energy delta value

Minimum change required for a new energy value to be transmitted.
The transmission must take place in the time window between parameter 2 and 3.
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.


### Parameter 7: Power delta value

Minimum change required for a new power value to be transmitted.
The transmission must take place in the time window between parameter 4 and 5
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```150```.

This parameter has the configuration ID ```config_7_2``` and is of type ```INTEGER```.


### Parameter 8: Safety shutdown configuration

Behaviour in the event of a safety shutdown
The plug actuator remains OFF after 3x safety shutdowns.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Plug actuator remains OFF |
| 1 | Automatic restart |

The manufacturer defined default value is ```0``` (Plug actuator remains OFF).

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Reset of overcurrent shutdown

Activation despite 3x safety shutdown
 Activation despite 3x safety shutdown (parameter 8 = 1)

 A reset request (“Set” command) is normally executed very quickly, as a result of which a query (“Get” command) for this parameter usually returns the response “0” (no reset) for this parameter. In some cases, this can be interpreted incorrectly. Consequently, this parameter should be treated only as “write only”.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No reset |
| 1 | Reset |

The manufacturer defined default value is ```0``` (No reset).

This parameter has the configuration ID ```config_9_1_wo``` and is of type ```INTEGER```.
This is a write only parameter.


### Parameter 10: Night mode

Set Night mode of the Status LED

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Night mode OFF |
| 1 | Night mode ON |

The manufacturer defined default value is ```0``` (Night mode OFF).

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Info LED colour

Set color of the Info LED

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Info LED OFF |
| 1 | Info LED green |
| 2 | Info LED yellow |
| 3 | Info LED red |

The manufacturer defined default value is ```0``` (Info LED OFF).

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.

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

The SES FS-ZW supports 1 association group.

### Group 1: reportd


This group supports 1 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_METER_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V3| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_PROTECTION_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_INDICATOR_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/671/SES-FS-ZW-BA-06-15-B.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/671).
