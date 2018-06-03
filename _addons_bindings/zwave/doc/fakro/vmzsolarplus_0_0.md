---
layout: documentation
title: VMZ Solar z-wave plus - ZWave
---

{% include base.html %}

# VMZ Solar z-wave plus Awning Blind z-wave plus version
This describes the Z-Wave device *VMZ Solar z-wave plus*, manufactured by *Fakro* with the thing type UID of ```fakro_vmzsolarplus_00_000```.

The VMZ Solar z-wave plus supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/750) to improve the documentation.

## Channels

The following table summarises the channels available for the VMZ Solar z-wave plus -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Blinds control | blinds_control | Blinds | Rollershutter | 
| Alarm (power) | alarm_power | Door | Switch | 
| Battery Level | battery-level | Battery | Number |

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Blinds control

Provides start / stop control of blinds.

The ```blinds_control``` channel supports the ```Rollershutter``` item and is in the ```Blinds``` category.

### Alarm (power)

Indicates if a power alarm is triggered.

The ```alarm_power``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level``` channel supports the ```Number``` item and is in the ```Battery``` category.



## Device Configuration

The following table provides a summary of the 15 configuration parameters available in the VMZ Solar z-wave plus.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | operating mode | operating mode |
| 2 | winter mode | Summer/Winter mode |
| 3 | Delay time | delay to auto shade |
| 4 | Level of sensitivity for day | Level of insolation to open/close the shades |
| 5 | Temperature | Temperature |
| 6 | STM active | STM AutoShade active |
| 13 | Restore last position | Restore last position |
| 17 | Insolation level | Current on autoshade solar panel |
| 21 | Motor current | Motor current |
| 77 | CLOSE current | CLOSE current |
| 78 | OPEN current | OPEN current |
| 79 | CLOSE overload current | CLOSE overload current |
| 80 | OPEN overload current | OPEN overload current |
| 99 | Restore default config values | Restore default config values |
| 100 | Autoexclude | Autoexclude |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: operating mode

operating mode
Operating mode. Available values:

0 - manual

1 - semiauto: goes down automatically but does not go up.

2 - auto
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | manual |
| 1 | semiauto |
| 2 | auto |

The manufacturer defined default value is ```0``` (manual).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: winter mode

Summer/Winter mode
summer mode: go down if sun shines and go up if it is cloudy

winter mode: if temperature is below 0 deg C and sun shines then go up if it is cloudy go down. If temperature is above 0 deg C works as a summer mode
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | summer mode only |
| 2 | winter mode |

The manufacturer defined default value is ```1``` (summer mode only).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Delay time

delay to auto shade
Delay time in minutes after which the shade is open or closed in auto mode
Values in the range 0 to 30 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Level of sensitivity for day

Level of insolation to open/close the shades
Level of insolation in mA to open/close the shades in the auto mode
Values in the range 3 to 100 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Temperature

Temperature
T\[<sup>o</sup>C\] = x minus 50
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 6: STM active

STM AutoShade active

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | no |
| 1 | yes |

The manufacturer defined default value is ```0``` (no).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 13: Restore last position

Restore last position
Restore last position or always go down till the end.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | go down |
| 2 | restore last position |

The manufacturer defined default value is ```1``` (go down).

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 17: Insolation level

Current on autoshade solar panel
Current from autoshade solar panel for loading battery: 0 - 255 mA
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 21: Motor current

Motor current
Current used by motor: 10\[mA\] - 2,55\[A\]
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 77: CLOSE current

CLOSE current
CLOSE current: 1\[mA\] - 255\[mA\]
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_77_1``` and is of type ```INTEGER```.


### Parameter 78: OPEN current

OPEN current
OPEN current: 1\[mA\] - 255\[mA\]
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_78_1``` and is of type ```INTEGER```.


### Parameter 79: CLOSE overload current

CLOSE overload current
CLOSE overload current: 10\[mA\] - 2,55\[A\]
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_79_1``` and is of type ```INTEGER```.


### Parameter 80: OPEN overload current

OPEN overload current
OPEN overload current: 10\[mA\] - 2,55\[A\]
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_80_1``` and is of type ```INTEGER```.


### Parameter 99: Restore default config values

Restore default config values
Restore default config values.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | restore default config values |
| 2 | user values |

The manufacturer defined default value is ```2``` (user values).

This parameter has the configuration ID ```config_99_1``` and is of type ```INTEGER```.


### Parameter 100: Autoexclude

Autoexclude

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | off |
| 2 | on |

The manufacturer defined default value is ```1``` (off).

This parameter has the configuration ID ```config_100_1``` and is of type ```INTEGER```.

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

The VMZ Solar z-wave plus supports 4 association groups.

### Group 1: Lifeline


This group supports 1 nodes.

### Group 2: BasicRepeat


This group supports 5 nodes.

### Group 3: MultilevelRepeat


This group supports 5 nodes.

### Group 4: BasicControl


This group supports 5 nodes.

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
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V3| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/750).
