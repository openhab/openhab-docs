---
layout: documentation
title: KONOzw - ZWave
---

{% include base.html %}

# KONOzw LUX KONOzw Smart Hub Thermostat
This describes the Z-Wave device *KONOzw*, manufactured by *Johnson Controls* with the thing type UID of ```johnson_konozw_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![KONOzw product image](https://www.cd-jackson.com/zwave_device_uploads/1154/1154_default.gif)


The KONOzw supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

KONOzw is the smart hub thermostat made with you in mind. It seamlessly connects to many smart hubs and blends in or stands out with its interchangeable Décorsnap covers™. KONOzw makes it easier than ever to personalize your comfort, décor, and savings.

### Inclusion Information

- In HOME screen, press the knob once to enter the menu settings 

- Rotate the knob to select wireless symbol, then press the knob to enter the inclusion/exclusion menu

- In the inclusion/exclusion menu, select ADD and press the knob to confirm

- The device will begin the adding process

### Exclusion Information

- In HOME screen, press the knob once to enter the menu settings 

- Rotate the knob to select wireless symbol, then press the knob to enter the inclusion/exclusion menu

- In the inclusion/exclusion menu, select RST and press the knob to confirm

- The device will begin the removal process

## Channels

The following table summarises the channels available for the KONOzw -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Operating State | thermostat_state | thermostat_state | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Setpoint (cooling) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Setpoint (auto changeover) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Setpoint (moist air) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Thermostat fan mode | thermostat_fanmode | thermostat_fanmode |  |  | 
| Thermostat fan state | thermostat_fanstate | thermostat_fanstate |  |  | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |
| Clock Time Offset | time_offset | time_offset | Time | Number | 

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

### Operating State
Sets the thermostat operating state.

The ```thermostat_state``` channel is of type ```thermostat_state``` and supports the ```Number``` item and is in the ```Temperature``` category.
The following state translation is provided for this channel to the ```Number``` item type -:

| Value | Label     |
|-------|-----------|
| 0 | Idle |
| 1 | Heating |
| 2 | Cooling |
| 3 | Fan Only |
| 4 | Pending Heat |
| 5 | Pending Cool |
| 6 | Vent / Economiser |

### Setpoint (heating)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Setpoint (cooling)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Setpoint (auto changeover)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Setpoint (moist air)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Thermostat fan mode
Channel type information on this channel is not found.

### Thermostat fan state
Channel type information on this channel is not found.

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
### Clock Time Offset
Provides the current time difference for the devices time.

The ```time_offset``` channel is of type ```time_offset``` and supports the ```Number``` item and is in the ```Time``` category.



## Device Configuration

The following table provides a summary of the 14 configuration parameters available in the KONOzw.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | User Temperature Calibration | Step-size = 10 |
| 2 | Temperature Unit (C/F) | 0=C, 1=F |
| 3 | Available Control mode | 0=Auto Heat & Cool, 1=Heat Only, 2=Cool Only, 3=No Auto Heat & Cool, 4=Reserved |
| 4 | System Type | 0=Furnace Gas, 1=Furnace Electric, 2=Heat Pump, 3=Boiler no fan, 4=Reserved |
| 5 | Reversal valve Type in Heat Pump | 0=O-valve, 1=B-valve |
| 8 | Temperature Limit - Heat Max | Increment by 1F |
| 9 | Temperature Limit - Heat Min | Increment by 1F |
| 10 | Temperature Limit - Cool Max | Increment by 1F. Actual allowable range depends on the heat set point limit |
| 11 | Temperature Limit - Cool Min | Increment by 1F. Actual allowable range depends on the heat set point limit |
| 12 | Temperature Minimum Setpoint Deadband | 100 to 250, stepsize = 10 |
| 14 | Ambient Temperature Change Stepsize | 0.5F – 4F range with a step-size of 0.5F (0.25C) |
| 15 | Regular Ambient Temperature Reporting Interval | 1-24 hours |
| 16 | Regular Operating State Reporting Interval | 1-24 hours |
| 17 | Command Echo Enable | 0=Disable, 1=Enable |

### Parameter 1: User Temperature Calibration

Step-size = 10
Adjusts room temperature display to match a calibrated value.
Values in the range -250 to 250 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: Temperature Unit (C/F)

0=C, 1=F

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Celsius |
| 1 | Fahrenheit (Default) |

The manufacturer defined default value is ```1``` (Fahrenheit (Default)).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Available Control mode

0=Auto Heat & Cool, 1=Heat Only, 2=Cool Only, 3=No Auto Heat & Cool, 4=Reserved

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Heat and Cool, Auto (Default) |
| 1 | Heat Only |
| 2 | Cool Only |
| 3 | Heat and Cool, no Auto |
| 4 | Reserved |

The manufacturer defined default value is ```0``` (Heat and Cool, Auto (Default)).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: System Type

0=Furnace Gas, 1=Furnace Electric, 2=Heat Pump, 3=Boiler no fan, 4=Reserved

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Furnace Gas (Default) |
| 1 | Furnace Electric |
| 2 | Heat Pump |
| 3 | Boiler no fan |
| 4 | Reserved |

The manufacturer defined default value is ```0``` (Furnace Gas (Default)).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Reversal valve Type in Heat Pump

0=O-valve, 1=B-valve

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | O-valve (Default) |
| 1 | B-valve |

The manufacturer defined default value is ```0``` (O-valve (Default)).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 8: Temperature Limit - Heat Max

Increment by 1F
60.00F-90.00F (16C-32C)
Values in the range 60 to 90 may be set.

The manufacturer defined default value is ```90```.

This parameter has the configuration ID ```config_8_2``` and is of type ```INTEGER```.


### Parameter 9: Temperature Limit - Heat Min

Increment by 1F
45.00F-60.00F (7C-16C)
Values in the range 45 to 60 may be set.

The manufacturer defined default value is ```45```.

This parameter has the configuration ID ```config_9_2``` and is of type ```INTEGER```.


### Parameter 10: Temperature Limit - Cool Max

Increment by 1F. Actual allowable range depends on the heat set point limit
60F-95F (16C-35C)
Values in the range 60 to 95 may be set.

The manufacturer defined default value is ```95```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Temperature Limit - Cool Min

Increment by 1F. Actual allowable range depends on the heat set point limit
50F-75F (10C-24C)
Values in the range 50 to 75 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Temperature Minimum Setpoint Deadband

100 to 250, stepsize = 10
The Dead Band is a temperature range in which neither COOL or HEAT turns on when in AUTO mode.
Values in the range 100 to 250 may be set.

The manufacturer defined default value is ```200```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 14: Ambient Temperature Change Stepsize

0.5F – 4F range with a step-size of 0.5F (0.25C)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 50 | 0.5F (0.25C) |
| 100 | 1.0F (0.50C) |
| 150 | 1.5F (0.75C) |
| 200 | 2.0F (1.00C) |
| 250 | 2.5F (1.25C) |
| 300 | 3.0F (1.50C) |
| 350 | 3.5F (1.75C) |
| 400 | 4.0F (2.00C) |

The manufacturer defined default value is ```50``` (0.5F (0.25C)).

This parameter has the configuration ID ```config_14_2``` and is of type ```INTEGER```.


### Parameter 15: Regular Ambient Temperature Reporting Interval

1-24 hours

Values in the range 1 to 24 may be set.

The manufacturer defined default value is ```4```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 16: Regular Operating State Reporting Interval

1-24 hours

Values in the range 1 to 24 may be set.

The manufacturer defined default value is ```4```.

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 17: Command Echo Enable

0=Disable, 1=Enable

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The KONOzw supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Z-Wave Plus Lifeline

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| Linked to BASIC|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_OPERATING_STATE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_THERMOSTAT_FAN_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_FAN_STATE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V4| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_PROTECTION_V2| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_CLOCK_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/1154/KONOzw-Operation-Guideline-V1-7-190711.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1154).
