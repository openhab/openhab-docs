---
layout: documentation
title: HEATIT Z-TEMP3 - ZWave
---

{% include base.html %}

# HEATIT Z-TEMP3 Waterbased heating thermostat
This describes the Z-Wave device *HEATIT Z-TEMP3*, manufactured by *ThermoFloor* with the thing type UID of ```thermofloor_heatitz-temp3_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![HEATIT Z-TEMP3 product image](https://opensmarthouse.org/zwavedatabase/1670/image/)


The HEATIT Z-TEMP3 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

Heatit Z-Temp3 is a battery-operated thermostat designed for controlling waterbased heating systems. Used in combination with the Heatit Z-Water2, you can control your heating system through the Z-Wave® network or via the buttons on the front panel. The thermostat has a user-friendly interface.

Heatit Z-Temp3 has 3 modes: Heat, Cool, and Eco.

The thermostat fits into System 55 frames, and may be mounted alongside other equipment such as e.g dimmers or light switches. Heatit Z-Temp3 can also be mounted directly on the wall or placed freely, e.g. on a shelf.

Heatit Z-Temp3 can be set as a master thermostat. This means that you can set the setpoint and mode on one unit, and it will automatically send the setpoint and mode to other connected units.

All communication between Heatit Z-Temp3 and the controlled device is 100% wireless.

Heatit Z-Temp3 uses 2x AAA batteries, but you can also connect the device to an external power source. The Heatit Transformer 230VAC (45 126 48) is recommended for this purpose.

Heatit Z-Temp3 can be associated with Heatit ZM Single Relay, other Z-Wave relays, Heatit ZM Thermostat, Heatit Z-TRM6 Thermostat and other Z-Wave devices to control other types of heating solutions.

Heatit Z-Temp3 is a great choice for the restoration or renovation of existing buildings, as it is easy to install without the need for wiring. We recommend using multiple 230VAC devices to create a mesh network.

### Inclusion Information

Access to the main menu pressing during 5 seconds the middle button. Press "+" until "CON" option appears, access to it with middle button. It will appear a "ON" text and maintain the middle button pressed until it apears a loading animation. At this moment starts the inclussion/exclusion mode.

### Exclusion Information

Access to the main menu pressing during 5 seconds the middle button. Press "+" until "CON" option appears, access to it with middle button. It will appear a "ON" text and maintain the middle button pressed until it apears a loading animation. At this moment starts the inclussion/exclusion mode.

### General Usage Information



## Channels

The following table summarises the channels available for the HEATIT Z-TEMP3 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Operating State | thermostat_state | thermostat_state | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Setpoint (furnace) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Setpoint (cooling) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (relative humidity)
Indicates the current relative humidity.

The ```sensor_relhumidity``` channel is of type ```sensor_relhumidity``` and supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

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

### Setpoint (furnace)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Setpoint (cooling)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 17 configuration parameters available in the HEATIT Z-TEMP3.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Disable buttons | Disable buttons |
| 2 | Minimum temperature limit (ALO) | 5°C to 40°C (Default is 5°C) |
| 3 | Maximum temperature limit (AHI) | 5°C to 40°C (Default is 40°C) |
| 4 | Calibration (CAR) | Manually calibrate sensor A ±6°C |
| 6 | Thermostat state update interval | Set the time interval of how often the device updates Thermostat Setpoint set, Thermostat Mode set and Binary set to associated devices |
| 7 | Temperature control hysteresis (HYST) | Choose the hysteresis used when regulation mode is set to HYST. |
| 8 | Temperature display | Select what is shown on the display during Standby state. |
| 9 | Active display brightness (BR1) | Configure the brightness of the display during active state. |
| 10 | Temperature Report Interval | Set the time interval between consecutive temperature reports |
| 11 | Temperature report hysteresis | Set the change in temperature required to send a temperature report based on change |
| 12 | Humidity report interval | Set the time interval between consecutive humidity reports |
| 13 | Humidity report hysteresis | Change in humidity required to send a report |
| 14 | Heating setpoint  | Set setpoint for Heating mode |
| 15 | Cooling setpoint | Set setpoint for Cooling mode |
| 16 | ECO setpoint  | Set setpoint for ECO mode |
| 17 | Operating Mode (MODE) | Set the thermostat mode |
| 18 | Open window detection | Choose to enable or disable the Open windows detection |

### Parameter 1: Disable buttons

Disable buttons
Disable buttons, must be enabled through the parameter, or turned back on locally by holding the center and right button for 30 seconds until the display shows “UNLK”.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Enabled, buttons on the front of the device work (default) |
| 1 | Disabled, buttons on the front of the device are disabled. |

The manufacturer defined default value is ```0``` (Enabled, buttons on the front of the device work (default)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Minimum temperature limit (ALO)

5°C to 40°C (Default is 5°C)
Minimum temperature limit (Menu: ALO)  
5°C to 40°C (Default is 5°C)
Values in the range 50 to 400 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Maximum temperature limit (AHI)

5°C to 40°C (Default is 40°C)
Maximum temperature limit (Menu: AHI)  
5°C to 40°C (Default is 40°C)
Values in the range 50 to 400 may be set.

The manufacturer defined default value is ```400```.

This parameter has the configuration ID ```config_3_2``` and is of type ```INTEGER```.


### Parameter 4: Calibration (CAR)

Manually calibrate sensor A ±6°C
Calibration (Menu: CAR)  


Manually calibrate sensor A ±6°C

NB! To set a negative value, use 256 and subtract the desired value
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 6: Thermostat state update interval

Set the time interval of how often the device updates Thermostat Setpoint set, Thermostat Mode set and Binary set to associated devices
0: Sends only when changed  


from 150 to max: 150 to 65535 seconds. 43200 seconds + when changed. (Default)
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```3600```.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.


### Parameter 7: Temperature control hysteresis (HYST)

Choose the hysteresis used when regulation mode is set to HYST.
Temperature control hysteresis (Menu: HYST)  


Choose the hysteresis used when regulation mode is set to HYST.

0.3°C to 3.0°C. Default is 5 (0.5°C)
Values in the range 3 to 30 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Temperature display

Select what is shown on the display during Standby state.
0: Display setpoint temperature. (Default)

1: Display measured temperature
Values in the range 1 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Active display brightness (BR1)

Configure the brightness of the display during active state.
Active display brightness (Menu: BR1)  
Configure the brightness of the display during active state.  
10 to 100% (Default 100%)
Values in the range 1 to 10 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_9_0``` and is of type ```INTEGER```.


### Parameter 10: Temperature Report Interval

Set the time interval between consecutive temperature reports
150 to 65535 seconds.   
990s (16.5 min) (Default)
Values in the range 150 to 65535 may be set.

The manufacturer defined default value is ```990```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Temperature report hysteresis

Set the change in temperature required to send a temperature report based on change
0.1°C to 10°C

10 (1°C) (Default)
Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Humidity report interval

Set the time interval between consecutive humidity reports
150 to 65535 seconds.

990s (16.5 min) (Default)
Values in the range 150 to 65535 may be set.

The manufacturer defined default value is ```990```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: Humidity report hysteresis

Change in humidity required to send a report
10% to 100%.

25% (Default)
Values in the range 10 to 100 may be set.

The manufacturer defined default value is ```25```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Heating setpoint 

Set setpoint for Heating mode
5°C to 40°C.

21°C (Default)
Values in the range 50 to 400 may be set.

The manufacturer defined default value is ```210```.

This parameter has the configuration ID ```config_14_2``` and is of type ```INTEGER```.


### Parameter 15: Cooling setpoint

Set setpoint for Cooling mode
5°C to 40°C.

25°C (Default)
Values in the range 50 to 400 may be set.

The manufacturer defined default value is ```250```.

This parameter has the configuration ID ```config_15_2``` and is of type ```INTEGER```.


### Parameter 16: ECO setpoint 

Set setpoint for ECO mode
5°C to 40°C.

18°C (Default)
Values in the range 50 to 400 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_16_2``` and is of type ```INTEGER```.


### Parameter 17: Operating Mode (MODE)

Set the thermostat mode
Operating Mode (Menu: MODE)

Set the thermostat mode
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | OFF Thermostat will not operate |
| 1 | Heating mode (Default) |
| 2 | Cooling mode |
| 3 | ECO mode |

The manufacturer defined default value is ```1``` (Heating mode (Default)).

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Open window detection

Choose to enable or disable the Open windows detection
0: Open window detection disabled. (Default)  
1: Open windows detection enabled.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Open window detection disabled. (Default) |
| 1 | Open window detection enabled. |

The manufacturer defined default value is ```0``` (Open window detection disabled. (Default)).

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The HEATIT Z-TEMP3 supports 4 association groups.

### Group 1: Group 1

Lifeline Group to be used by primary controller
Lifeline.

Lifeline Group to be used by primary controller, sends:

- Thermostat Operating State

- Thermostat Setpoint Report

- Thermostat Mode Report

- Sensor multilevel Report

- Device Reset Locally

- Battery Report

- Protection Report

- Configuration Report

Association group 1 supports 1 node.

### Group 2: Group 2

Binary Switch Set
Send Binary Switch set commands based on the internal relay state, sends:

-Binary Switch Set  
  


If the thermostat is to control a relay, an association from Group 2 must be created from the thermostat to the relay that is to be controlled.

Disclaimer: When using the Heatit Z-Temp3 to control multiple relays on a Heatit Z-Water (Art. no. 4512475) or a Heatit Z-Water2 (Art. no. 4512495), only use relays 1 through 7. Do not use relays 8, 9, or 10 for this purpose.

Association group 2 supports 10 nodes.

### Group 3: Group 3

Thermostat Setpoint set
Sends Thermostat Setpoint set commands based on own setpoint to allow for use as master thermostat, sends:

-Thermostat Setpoint Set  
  


If the thermostat is to control other thermostats as a master thermostat, an association from Group 3 and Group 4 must be created from the master thermostat to the thermostats to be controlled.

Association group 3 supports 10 nodes.

### Group 4: Group 4

Thermostat Mode set
Sends Thermostat Mode set commands based on own mode to allow for use as master thermostat, sends:

-Thermostat Mode Set

If the thermostat is to control other thermostats as a master thermostat, an association from Group 3 and Group 4 must be created from the master thermostat to the thermostats to be controlled.

Association group 4 supports 10 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_OPERATING_STATE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_PROTECTION_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Heatit Z-Temp3 User Manual](https://opensmarthouse.org/zwavedatabase/1670/reference/heatit-ztemp3-user-manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1670).
