---
layout: documentation
title: FMS01 - ZWave
---

{% include base.html %}

# FMS01 Multifunction Switch
This describes the Z-Wave device *FMS01*, manufactured by *Smartly AS* with the thing type UID of ```smartly_multiswitch_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![FMS01 product image](https://www.cd-jackson.com/zwave_device_uploads/1032/1032_default.jpg)


The FMS01 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Multifunction Switch is a Z-Wave Plus mains powered Wallbox mountable Wall Controller. It can be configured to control up to Four separate Light Zones or Central Scenes. Each Light Zone can consist of both Dimmers and Switches. The device can be combined with a Back Unit, which provide local Switch or Dimmer functionality.   
Room and Floor temperature sensors can also be connected to the device, which enables the device to function as a head-less Thermostat. The Thermostat is fully controllable from a Z-Wave Controller, and can control both a Local and Remote heating relay.

The Multifunction Switch is capable of controlling local loads via a modular Back Unit. The back unit can be mounted and connected to mains electricity inside a Electrical Wall box. Two types of Relay and Dimmer Back Units are currently available. The maximum controllable local load are specified in each Back Unit product sheets. 

### Inclusion Information

Push and Hold both Lower buttons simultaneously for 5 seconds. Inclusion is indicated by the LEDs flashing in a "U" shaped pattern. 

### Exclusion Information

Push and Hold both Lower buttons simultaneously for 5 seconds. Exclusion is indicated by the LEDs flashing in a "U" shaped pattern. 

## Channels

The following table summarises the channels available for the FMS01 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (power) | sensor_power | sensor_power | Energy | Number | 
| Sensor (current) | sensor_current | sensor_current |  |  | 
| Sensor (voltage) | sensor_voltage | sensor_voltage |  | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Scene Number | scene_number | scene_number |  | Number | 
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Dimmer 1 | switch_dimmer1 | switch_dimmer | DimmableLight | Dimmer | 
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch | 
| Dimmer 2 | switch_dimmer2 | switch_dimmer | DimmableLight | Dimmer | 
| Switch 3 | switch_binary3 | switch_binary | Switch | Switch | 
| Dimmer 3 | switch_dimmer3 | switch_dimmer | DimmableLight | Dimmer | 
| Switch 4 | switch_binary4 | switch_binary | Switch | Switch | 
| Dimmer 4 | switch_dimmer4 | switch_dimmer | DimmableLight | Dimmer | 
| Switch 5 | switch_binary5 | switch_binary | Switch | Switch | 
| Dimmer 5 | switch_dimmer5 | switch_dimmer | DimmableLight | Dimmer | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (power)
Indicates the energy consumption (kWh).

The ```sensor_power``` channel is of type ```sensor_power``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (current)
Channel type information on this channel is not found.

### Sensor (voltage)
Indicates the current voltage.

The ```sensor_voltage``` channel is of type ```sensor_voltage``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

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

### Setpoint (heating)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.
This channel provides the scene, and the event as a decimal value in the form ```<scene>.<event>```. The scene number is set by the device, and the event is as follows -:

| Event ID | Event Description  |
|----------|--------------------|
| 0        | Single key press   |
| 1        | Key released       |
| 2        | Key held down      |
| 3        | Double keypress    |
| 4        | Tripple keypress   |
| 5        | 4 x keypress       |
| 6        | 5 x keypress       |

### Switch 1
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 1
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer1``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Switch 2
Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 2
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer2``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Switch 3
Switch the power on and off.

The ```switch_binary3``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 3
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer3``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Switch 4
Switch the power on and off.

The ```switch_binary4``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 4
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer4``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Switch 5
Switch the power on and off.

The ```switch_binary5``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 5
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer5``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The following table provides a summary of the 24 configuration parameters available in the FMS01.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 4 | Safety Activate Delay | Safety Activate Delay in seconds |
| 5 | Safety OFF Period | Safety OFF Period in seconds |
| 6 | Safety ON Period | Safety ON Period in seconds |
| 10 | Dimming speed | Dimmer Speed in 1/100th of a Second |
| 11 | Dimmer mode | Dimmer Operation Mode |
| 12 | Maximum Level | Maximum Dimmer Level |
| 13 | Minimum Level | Minimum Dimmer Level |
| 14 | Button mode | Operating mode for switch |
| 15 | Light Zone Control Mode | Light Zone Control Mode |
| 17 | Back Unit Role | Selected Back Unit Role |
| 18 | Back Unit Light Zone | Selected Back Unit Light Zone |
| 32 | Thermostat Set Point Max | Set Point Max in 1/10th of a degree Celcius |
| 34 | Thermostat Set Point Min | Set Point Min in 1/10th of a degree Celcius |
| 36 | Thermostat Control Resend Interval | Resend Interval in seconds |
| 37 | Thermostat Minimum On/Off Interval | Minimum On/Off interval in seconds |
| 38 | Thermostat Floor Temp Max | Floor Temp Max in 1/10th of a degree Celcius |
| 40 | Temperature Sensor Select | Temperature Sensor Select |
| 44 | Cold Start Minimum Level | Cold Start Minimum Level |
| 64 | Temperature Report Inteval | Report Interval in seconds |
| 66 | Temperature Report Threshold | Report Threshold in 1/10th of a degree Celcius |
| 67 | Thermostat On∕Off Interval Override Threshold | Temperature Threshold in 1/10th of a degree Celcius |
| 80 | Button LED Mode | Selected LED Mode |
| 240 | Floor Sensor Temperature Offset | Temperature Offset in 1/10th of a degree Celcius |
| 241 | Room Sensor Temperature Offset | Temperature Offset in 1/10th of a degree Celcius |

### Parameter 4: Safety Activate Delay

Safety Activate Delay in seconds
Safety Mode is activated after the configured number of seconds has elapsed. It will start by turning OFF the Back Unit when activated. A 0 value Disables Safety Mode. The MAX limit is 32767 seconds (9 hours, 6 minutes and 7 seconds). The minimum Actication delay is 60 seconds, and values from 1 to 59 will automatically be translated to a 60 second delay.
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_2``` and is of type ```INTEGER```.


### Parameter 5: Safety OFF Period

Safety OFF Period in seconds
The number of seconds to stay in OFF mode when Safety is activated. The Back unit turns ON when the timer have elapsed. If value is 0, the Back Unit will not turn back ON. The MAX limit is 32767 seconds (9 hours, 6 minutes and 7 seconds). A 60 second minimum period applies.
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```600```.

This parameter has the configuration ID ```config_5_2``` and is of type ```INTEGER```.


### Parameter 6: Safety ON Period

Safety ON Period in seconds
The number of seconds to stay in ON mode when Safety is activated. The Back Unit turns back OFF when the timer have elapsed (and continues to turn ON and OFF alternately). If value is 0, the Back Unit WILL NOT turn ON at all. The MAX limit is 32767 seconds (9 hours, 6 minutes and 7 seconds). A 60 second minimum period applies.
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.


### Parameter 10: Dimming speed

Dimmer Speed in 1/100th of a Second
Defines the "fade" time when setting a dim level from a controller. Fade time is defined as the time it takes to dim from MIN level to MAX level, which means an increase of 10% in light level takes 1/10th of the configured time. The value defines the dim time in 1/100'th of a second, which means a value of 200 gives a Dimming Speed of 2.0 seconds from MIN to MAX. Max time is 327.67 seconds (almost 11 minutes). Values below 30 (0.3 seconds) are ignored ̧ and values below 100 (1 second) are discouraged.
Values in the range 30 to 32767 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Dimmer mode

Dimmer Operation Mode
[ Leading Edge (LE) = 0, Tailing Edge (TE) = 1 ] Defines if Dimmer should operate in Leading or Tailing Edge mode. Most Lights work quite OK in the default Leading Edge mode, but this mode also usually cause some noise from the dimmer unit. During installation it is therefore recommended to try TE mode, and use this if the Light operates properly. Tailing Edge mode is known to cause instability in some type of Lights! This configuration does not have any effect on 1-10V Dimmer Back Units!
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Maximum Level

Maximum Dimmer Level
The Maximum Light level of the dimmer. Typically there is no visible difference when the dimming level reaches a point in the range 75 - 90, and the installer should set this value to the lowest value where no change is visible. The default value of 90 is usually OK.
Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```90```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Minimum Level

Minimum Dimmer Level
The Minimum Light Level of the dimmer. This should be adjusted so the controlled Light is still ON and stable. Remember that LED type lights may work if dimmed down to a low value, but may not start if the light is turned OFF and ON again.
Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```15```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Button mode

Operating mode for switch
Controls the operation mode of the buttons. Valid configuration values are:  
0 – Single Switch Mode (default)  
1 – Dual Switch Mode  
2 – Quadruple Switch Mode  
3 – Legacy Scenario Mode  
4 – Central Scene Controller Mode
Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Light Zone Control Mode

Light Zone Control Mode
Controls if the Light Zones should operate in Switch or Dimmer Mode (only used in Button Modes 0, 1 and 2):  
0 – All Light Zones in Dimmer Mode (default) 1 – All Light Zones in Switch Mode

To control Light Zone switch mode individually, add any of the following values to enable switch mode individually (dimmer is default):  
2 – Light Zone 1 Switch Mode  
4 – Light Zone 2 Switch Mode  
8 – Light Zone 3 Switch Mode  
16 – Light Zone 4 Switch Mode  
Example: A value of 10 (8 + 2) enables switch mode in Light Zone 1 and 3.
Values in the range 0 to 30 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 17: Back Unit Role

Selected Back Unit Role
Configures the Role of the Back Unit, which dictates what Local functionality controls it. Valid configuration values are:  
0 - The Thermostat will control the Back Unit (if the back unit is a dimmer, then this value has no effect as Thermostats requires a local relay for local control)

1 - The Light Control feature (buttons) will control the Back Unit.  
2 - Disconnected mode means the Back Unit is not controlled by any local UI or features, and can only be controlled via Z-Wave End-Point 1 (or the Root Device).
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Back Unit Light Zone

Selected Back Unit Light Zone
Selects which Light Zone controls the Back Unit (in Light Mode). Possible values are:  
1 – Light Zone 1 (Button and Z-Wave) (default) 2 – Light Zone 2 (Button and Z-Wave)  
3 – Light Zone 3 (Button and Z-Wave)  
4 – Light Zone 4 (Button and Z-Wave)

This does not have any effect however when the BU role is set to Thermostat or Disconnected!
Values in the range 1 to 4 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 32: Thermostat Set Point Max

Set Point Max in 1/10th of a degree Celcius
Maximum Heat Set Point the Thermostat is allowed to be set to. If the Thermostat is used for Floor Heating, please make sure that this value is configured to the same value as (or lower than) the Max Floor Temperature. Given in 1/10 of a degree Celcius, which means a value of 300 means 30 degrees C. 
Values in the range 0 to 500 may be set.

The manufacturer defined default value is ```270```.

This parameter has the configuration ID ```config_32_2``` and is of type ```INTEGER```.


### Parameter 34: Thermostat Set Point Min

Set Point Min in 1/10th of a degree Celcius
Minimum Heat Set Point the Thermostat is allowed to be set to. Given in 1/10 of a degree Celcius, which means a value of 50 means 5 degrees C.
Values in the range 0 to 500 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_34_2``` and is of type ```INTEGER```.


### Parameter 36: Thermostat Control Resend Interval

Resend Interval in seconds
Defines the interval between each time the Thermostat will repeat its last control command. This is used in combination with the Relay Safety configuration when controlling external Relays. If the Thermostat should fail, it would then stop sending control commands which in turn means the Relay will turn itself OFF after the safety mode delay has expired. This insures that heating will not be left ON indefinitely in failure situations.
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```3600```.

This parameter has the configuration ID ```config_36_2``` and is of type ```INTEGER```.


### Parameter 37: Thermostat Minimum On/Off Interval

Minimum On/Off interval in seconds
This configuration defines the minimum interval the controlled Thermostat Relays will be ON and OFF. This is a feature intended to avoid turning control relays ON and OFF too frequently, which should insure a better lifetime of controlled relays. The default value is 5 minutes, which is OK for most electrical heating control. If used to control Water based heating, the value MUST be adjusted in accordance with the manufacturers specifications.
Values in the range 60 to 32767 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_37_2``` and is of type ```INTEGER```.


### Parameter 38: Thermostat Floor Temp Max

Floor Temp Max in 1/10th of a degree Celcius
Max floor temperature if a local floor sensor is connected. If the Floor Sensor reads a temperature Higher than the configured value, it will immediately turn the relay (or any associated relays) OFF.

The relay will stay off until the temperature sinks below this value, and the Thermostat issues it's next control command. Disabled if zero (0) value, or if no floor sensor is connected. The value is given as 1/10th of a degree Celcius. Range: 0 – 500 (0-50 degrees).

NOTE! MAX 27 degrees is recommended for Wooden Floors!

NOTE! This function is always active as long as a Floor Sensor is connected, regardless of the sensor configuration described below.
Values in the range 0 to 500 may be set.

The manufacturer defined default value is ```270```.

This parameter has the configuration ID ```config_38_2``` and is of type ```INTEGER```.


### Parameter 40: Temperature Sensor Select

Temperature Sensor Select
Defines which temperature Sensor should be used for Heating Control. The default value is Both (3), which should work well in most scenarios (even when only a Floor or Room sensor is present). If both a Room and Floor sensor is used, the Thermostat will always control heating based on the lowest temperature reading of the two, to insure a comfortable floor temperature even if the room is already warm enough. If this is not wanted, the Thermostat should be configured to use the Room sensor Only. NOTE! The Floor Max Temperature feature will ALWAYS be active as long as a floor sensor is available, even if the Thermostat is configured to only use the Room Sensor.

1 - Local Room - Use temperature from Locally connected Room sensor ONLY. Max Floor Temp protection is still active as long as a floor sensor is available.

2 - Local Floor - Use temperature from Locally connected Floor sensor ONLY  
3 - Both - Use temperature from Locally connected Floor AND Room sensor if available (Default).
Values in the range 1 to 3 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 44: Cold Start Minimum Level

Cold Start Minimum Level
Sets the minimum level the Dimmer should go to when the light is switched ON. This is typically used for LED lamps which does not switch ON correctly when the dimming level is at the Minimum.
Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_44_1``` and is of type ```INTEGER```.


### Parameter 64: Temperature Report Inteval

Report Interval in seconds
Defines the Periodic Report interval for temperature readings. This can be configured to a minimum of 60 seconds and maximum of (32767 seconds. A 0 value disables the Interval based Periodic reporting, and any value below 60 results in a 60 second interval.
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```600```.

This parameter has the configuration ID ```config_64_2``` and is of type ```INTEGER```.


### Parameter 66: Temperature Report Threshold

Report Threshold in 1/10th of a degree Celcius
Defines a temperature change threshold where a temperature report is sent regardless of the Report Interval. This also works if the report interval is disabled. The value is given in 1/10 of a degree celsius, and can be in the range 1-127. A zero value disables the Threshold.
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_66_1``` and is of type ```INTEGER```.


### Parameter 67: Thermostat On∕Off Interval Override Threshold

Temperature Threshold in 1/10th of a degree Celcius
Defines a temperature threshold at which the configured On/Off interval is overridden and the Heating relay state will change regardless. The value is given in 1/10th of a degree, supporting a max threshold of 12.7 degrees celcius. A Zero (0) value disables this feature (the default).
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_67_1``` and is of type ```INTEGER```.


### Parameter 80: Button LED Mode

Selected LED Mode
Controls the operation of the LEDs. Possible values are:  
0 – LEDs are always OFF (default)  
1 – Momentary ON

2 – Stable ON

The LED operation is described in details later in this document, and depends on the Button Mode configuration.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_80_1``` and is of type ```INTEGER```.


### Parameter 240: Floor Sensor Temperature Offset

Temperature Offset in 1/10th of a degree Celcius
Defines an offset to the Floor Temperature, given as a signed integer at 1/10 of a degree celcius. This provides an offset range of –12.8 to +12.7 degrees celcius.
Values in the range -128 to 127 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_240_1``` and is of type ```INTEGER```.


### Parameter 241: Room Sensor Temperature Offset

Temperature Offset in 1/10th of a degree Celcius
Defines an offset to the Room Temperature, given as a signed integer at 1/10 of a degree celcius. This provides an offset range of –12.8 to +12.7 degrees celcius.
Values in the range -128 to 127 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_241_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The FMS01 supports 7 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
The Lifeline group where all Local State Changes are reported. All unsolicited Reports for the supported command classes will be issued to this group.  
Commands Issued:

- Basic Report - Notifies Local Light Zone changes (button press)  
- Central Scene Notification - Notifies Scene events from the controller (in Scene Mode)  
- Sensor Multilevel Report - Reports Power Consumption and Temperatures  
- Meter - Reports power consumption to the Controller every 15 minutes.  
- Device Reset Locally – Reports factory resets to the Controller

Association group 1 supports 5 nodes.

### Group 2: Light Zone 1

Associated devices will be controlled by Light Zone 1. Also supports multichannel association in any combination. Command Issued: Basic Set

Association group 2 supports 5 nodes.

### Group 3: Light Zone 2

Associated devices will be controlled by Light Zone 2.  
Also supports multichannel association in any combination. Command Issued: Basic Set

Association group 3 supports 5 nodes.

### Group 4: Light Zone 3

Associated devices will be controlled by Light Zone 3.  
Also supports multichannel association in any combination. Command Issued: Basic Set

Association group 4 supports 5 nodes.

### Group 5: Light Zone 4

Associated devices will be controlled by Light Zone 4.  
Also supports multichannel association in any combination. Command Issued: Basic Set

Association group 5 supports 5 nodes.

### Group 6: Thermostat Control

Control Set-Point and Mode of an external Thermostat Device Commands Issued: Thermostat Setpoint Set and Thermostat Mode Set

Association group 6 supports 5 nodes.

### Group 7: Thermostat Relay Control

Control external Relay from the Local Thermostat Command Issued: Basic Set (ON and OFF values ONLY).

Association group 7 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| |
| COMMAND_CLASS_METER_V2| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 5

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/1032/SEdevices---FMS01-Multifunction-Switch-Z-Wave-User-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1032).
