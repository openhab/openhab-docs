---
layout: documentation
title: DMOF1 - ZWave
---

{% include base.html %}

# DMOF1 Dome On/Off zwave wall plug for controlling small appliances and lights.
This describes the Z-Wave device *DMOF1*, manufactured by *Elexa Consumer Products Inc.* with the thing type UID of ```elexa_dmof1_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![DMOF1 product image](https://www.cd-jackson.com/zwave_device_uploads/645/645_default.jpg)


The DMOF1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/645) to improve the documentation.

## Channels

The following table summarises the channels available for the DMOF1 -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Electric meter (kWh) | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | Energy | Number | 
| Electric meter (amps) | meter_current | Energy | Number | 
| Electric meter (volts) | meter_voltage | Energy | Number | 
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

### Electric meter (amps)

Indicates the instantaneous current consumption.

The ```meter_current``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts)

Indicates the instantaneous voltage.

The ```meter_voltage``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (power)

Indicates if a power alarm is triggered.

The ```alarm_power``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 10 configuration parameters available in the DMOF1.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Disable Meter Functionality | Enable/Disable the meter report. |
| 2 | METER_REPORT | The time between meter reports. |
| 3 | Set "Overload" Current level | Maximum current the plug will pass |
| 4 | Set "Alert" Current Level | Current level warning threshold |
| 5 | Enable/Disable Indicator LED | This parameter enables or disables the indicator LED. |
| 6 | Current change METER_REPORT level | Report of relative change in current flow |
| 7 | Remember On/Off status | Remember status from last plug in. |
| 8 | Enable/Disable Timer Function | Timer once plugged in before it turn off the device. |
| 9 | Set Timer Time Interval | Time before auto shut off if on. |
| 10 | Enable/Disable BUTTON | Turn off the button |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Disable Meter Functionality

Enable/Disable the meter report.
This parameter enables/disables the METER\_REPORT function, which sends periodic reports to Group1 members with information on line voltage, current load, and power & energy consumption. Also see Param 2 & 6.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable Meter Functionality |
| 1 | Enable Meter Functionality |

The manufacturer defined default value is ```1``` (Enable Meter Functionality).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: METER_REPORT

The time between meter reports.
This parameter sets the amount of time between each successive METER\_REPORT signal sent to Group 1 (also see Param 1 & 6.)
Values in the range 1 to 65535 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Set "Overload" Current level

Maximum current the plug will pass
Sets the maximum current the plug will pass before it cuts off power and sends a NOTIFICATION\_EVENT\_POWER\_ MANAGEMENT\_OVER\_LOAD\_DETECTED signal to Group 1 and a BASIC\_SET(FF) to Group 2. The LED will then blink red once per second until the current returns to normal. To clear the NOTIFICATION and start monitoring again, the BUTTON must be pushed once (only after the current is back to normal.) **NOTE: this value must be higher than Param 4**
Values in the range 1 to 16 may be set.

The manufacturer defined default value is ```13```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Set "Alert" Current Level

Current level warning threshold
Sets the current level at which the On/Off Plug-In Switch will flash its LED yellow, until the current returns to below this level. It will NOT cut off current to the device; this functions as a visible warning to the user. **NOTE: this value must be lower than Param 3**
Values in the range 1 to 16 may be set.

The manufacturer defined default value is ```12```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Enable/Disable Indicator LED

This parameter enables or disables the indicator LED.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable LED |
| 1 | Enable LED |

The manufacturer defined default value is ```1``` (Enable LED).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Current change METER_REPORT level

Report of relative change in current flow
In addition to sending a METER\_REPORT to Group 1 in the time interval set by Param 2, the On/Off Plug-In Switch also sends a METER\_REPORT when it detects a relative change in current flow. This parameter sets this minimum current change amount, in percent, at which point the On/Off Plug-In Switch will send a METER\_REPORT to Group 1. Also see Param 1 & 2.
Values in the range 1 to 64 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Remember On/Off status

Remember status from last plug in.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Don't Remember |
| 1 | Remember |

The manufacturer defined default value is ```1``` (Remember).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Enable/Disable Timer Function

Timer once plugged in before it turn off the device.
If this parameter is enabled, whenever the On/Off Plug-In Switch is turned on, it will automatically turn off after a set amount of time (set in Param 9.)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Set Timer Time Interval

Time before auto shut off if on.
Sets the time interval before the On/Off Plug-In Switch automatically shuts off. See Param 8.
Values in the range 1 to 65535 may be set.

The manufacturer defined default value is ```96```.

This parameter has the configuration ID ```config_9_4``` and is of type ```INTEGER```.


### Parameter 10: Enable/Disable BUTTON

Turn off the button
If this parameter is enabled, the user can turn the device on or off using the BUTTON.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable Button |
| 1 | Enable Button |

The manufacturer defined default value is ```1``` (Enable Button).

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.

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

The DMOF1 supports 3 association groups.

### Group 1: Lifeline


This group supports 5 nodes.

### Group 2: Group 2


This group supports 5 nodes.

### Group 3: Group 3


This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V6| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/645/DMOF1-dome-z-wave-plug-operating-guide.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/645).
