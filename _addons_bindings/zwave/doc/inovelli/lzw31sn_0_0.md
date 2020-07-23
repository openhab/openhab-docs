---
layout: documentation
title: LZW31-SN - ZWave
---

{% include base.html %}

# LZW31-SN Red Series Dimmer
This describes the Z-Wave device *LZW31-SN*, manufactured by *Inovelli* with the thing type UID of ```inovelli_lzw31sn_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![LZW31-SN product image](https://www.cd-jackson.com/zwave_device_uploads/1146/1146_default.jpg)


The LZW31-SN supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Inovelli’s new dimmer switch is packed with features and designed with your house in mind.

From a hardware side we’ve upgraded our Z-Wave module for better distance and there is no longer a need for a neutral wire. The switch can be used in any 3-Way or 4-Way setting and allows you to use either an auxiliary switch, a smart switch or your existing dumb switch (NOTE: this only applies if a neutral wire is installed. If there is no neutral wire, the switch only works in a single-pole setting).

From a firmware side, this switch has it all (literally). Scene control, notifications (flashes if your garage door is left open) and can be configured on any HUB.

==

Important:  If you have a neutral wire, set parameter 21 correctly.  If setting the switch up in a 3-way configuration, set parameter 22 (you may need to enable advanced settings to see this).

### Inclusion Information

Once the inclusion process has started press the config button 3X and the LED bar will flash blue.  If the switch was included successfully the bar will turn GREEN, however if the switch was not included successfully it will turn RED.

### Exclusion Information

Put your HUB in Exclusion mode and press the Config Button 3X until your HUB says the device is excluded.

## Channels

The following table summarises the channels available for the LZW31-SN -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Reset Meter | meter_reset | meter_reset | Energy | Switch | 
| Scene Number | scene_number | scene_number |  | Number | 
| LED Strip Effect | config_decimal | config_decimal |  | Number | 
| Default Level (Local) | config_decimal | config_decimal |  | Number | 
| LED Indicator Color | config_decimal | config_decimal |  | Number | 
| LED Indicator Intensity | config_decimal | config_decimal |  | Number | 
| Protection Local | protection_local | protection_local |  | Number | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Reset Meter
Reset the meter.

The ```meter_reset``` channel is of type ```meter_reset``` and supports the ```Switch``` item and is in the ```Energy``` category.

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

### LED Strip Effect
Generic class for configuration parameter.

The ```config_decimal``` channel is of type ```config_decimal``` and supports the ```Number``` item.

### Default Level (Local)
Generic class for configuration parameter.

The ```config_decimal``` channel is of type ```config_decimal``` and supports the ```Number``` item.

### LED Indicator Color
Generic class for configuration parameter.

The ```config_decimal``` channel is of type ```config_decimal``` and supports the ```Number``` item.

### LED Indicator Intensity
Generic class for configuration parameter.

The ```config_decimal``` channel is of type ```config_decimal``` and supports the ```Number``` item.

### Protection Local
Sets the local protection mode.

The ```protection_local``` channel is of type ```protection_local``` and supports the ```Number``` item.
The following state translation is provided for this channel to the ```Number``` item type -:

| Value | Label     |
|-------|-----------|
| 0 | Unprotected |
| 1 | Protection by sequence |
| 2 | No operation possible |



## Device Configuration

The following table provides a summary of the 24 configuration parameters available in the LZW31-SN.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Dimming Speed (Z-Wave) | Dimming Speed (Z-Wave) |
| 2 | Dimming Speed (from switch) | Dimming Speed (from switch) |
| 3 | Ramp Rate (Z-Wave) | Ramp Rate (Z-Wave) |
| 4 | Ramp Rate (from switch) | Ramp Rate (from switch) |
| 5 | Minimum Dim Level | Minimum Dim Level |
| 6 | Maximum Dim Level | Maximum Dim Level |
| 7 | Invert Switch | Invert Switch |
| 8 | Auto Off Timer | Auto Off Timer |
| 9 | Default Level (Local) | Default Level (Local) |
| 10 | Default Level (Z-Wave) | Default Level (Z-Wave) |
| 11 | Power On State | Power On State |
| 12 | Association Behavior | Association Behavior |
| 13 | LED Indicator Color | LED Indicator Color |
| 14 | LED Indicator Intensity | LED Indicator Intensity |
| 15 | LED Indicator Intensity (When Off) | LED Indicator Intensity (When Off) |
| 16 | LED Strip Effect | LED Strip Effect |
| 17 | LED Indicator Timeout | LED Indicator Timeout |
| 18 | Active Power Reports | Active Power Reports |
| 19 | Periodic Power & Energy Reports | Periodic Power & Energy Reports |
| 20 | Energy Reports | Energy Reports |
| 21 | AC Power Type | AC Power Type |
| 22 | Switch Type | Switch Type |
| 51 | Instant On | Instant On |
| 52 | Enable "smart bulb" mode | Enable "smart bulb" mode |

### Parameter 1: Dimming Speed (Z-Wave)

Dimming Speed (Z-Wave)

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Dimming Speed (from switch)

Dimming Speed (from switch)

Values in the range 0 to 101 may be set.

The manufacturer defined default value is ```101```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Ramp Rate (Z-Wave)

Ramp Rate (Z-Wave)

Values in the range 0 to 101 may be set.

The manufacturer defined default value is ```101```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Ramp Rate (from switch)

Ramp Rate (from switch)

Values in the range 0 to 101 may be set.

The manufacturer defined default value is ```101```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Minimum Dim Level

Minimum Dim Level

Values in the range 1 to 45 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Maximum Dim Level

Maximum Dim Level

Values in the range 55 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Invert Switch

Invert Switch
Inverts the switch (Tap Down = On, Tap Up = Off)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Auto Off Timer

Auto Off Timer
Automatically turns the switch off after x amount of seconds.
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_2``` and is of type ```INTEGER```.


### Parameter 9: Default Level (Local)

Default Level (Local)

Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Default Level (Z-Wave)

Default Level (Z-Wave)

Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Power On State

Power On State
When power is restored, the switch reverts to either On, Off or Last Level.

0=Off, 1-99=Specific % On, 101=Returns to level before Power Outage.
Values in the range 0 to 101 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Association Behavior

Association Behavior
When should the switch send commands to the associated devices:

01 = Local, 02 = 3-Way, 03 = 3-Way & Local, 04 = Z-Wave Hub, 05 = Z-Wave Hub & Local, 06 = Z-Wave Hub & 3-Way, 07 = Z-Wave Hub & Local & 3-Way, 08 = Timer, 09 = Timer & Local, 10 = Timer & 3-Way, 11 =Timer & 3-Way & Local, 12 = Timer & Z-Wave Hub, 13 = Timer & Z-Wave Hub & Local, 14 = Timer & Z-Wave Hub & 3-Way, 15 = All
Values in the range 0 to 15 may be set.

The manufacturer defined default value is ```15```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: LED Indicator Color

LED Indicator Color

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```170```.

This parameter has the configuration ID ```config_13_2``` and is of type ```INTEGER```.


### Parameter 14: LED Indicator Intensity

LED Indicator Intensity
This will set the intensity of the LED bar (ie: how bright it is) in 10% increments.
Values in the range 0 to 10 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: LED Indicator Intensity (When Off)

LED Indicator Intensity (When Off)
This is the intensity of the LED bar when the switch is off in 10% increments.
Values in the range 0 to 10 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 16: LED Strip Effect

LED Strip Effect
Addition:  To get the final code for the desired color/effect/duration, use this calculator:  https://nathanfiscus.github.io/inovelli-notification-calc/This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 100600575 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_16_4``` and is of type ```INTEGER```.


### Parameter 17: LED Indicator Timeout

LED Indicator Timeout
Changes the amount of time the RGB Bar shows the Dim level if the LED Bar has been disabled.
Values in the range 0 to 10 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Active Power Reports

Active Power Reports

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 19: Periodic Power & Energy Reports

Periodic Power & Energy Reports

Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```3600```.

This parameter has the configuration ID ```config_19_2``` and is of type ```INTEGER```.


### Parameter 20: Energy Reports

Energy Reports

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: AC Power Type

AC Power Type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No-Neutral |
| 1 | Neutral |

The manufacturer defined default value is ```1``` (Neutral).

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22: Switch Type

Switch Type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Single-Pole (One Switch) |
| 1 | Multi-Switch (Dumb Switch) |
| 2 | Multi-Switch (Auxiliary Switch) |

The manufacturer defined default value is ```0``` (Single-Pole (One Switch)).

This parameter has the configuration ID ```config_22_1``` and is of type ```INTEGER```.


### Parameter 51: Instant On

Instant On
Enable instant on (ie: disable 700ms delay at the switch). If delay is disabled, scene control will be limited to button 1 (ie: tap up 1x or tap down 1x) and button 7 (config button). All other buttons (2-6) will be disabled.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No delay |
| 1 | 700ms delay |

The manufacturer defined default value is ```1``` (700ms delay).

This parameter has the configuration ID ```config_51_1``` and is of type ```INTEGER```.


### Parameter 52: Enable "smart bulb" mode

Enable "smart bulb" mode
Smart bulb mode: If set to 1, power will output maximum % when dimmer is on to optimize performance with smart bulbs.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | normal bulb |
| 1 | smart bulb |

The manufacturer defined default value is ```0``` (normal bulb).

This parameter has the configuration ID ```config_52_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The LZW31-SN supports 4 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Members of this group will receive unsolicited messages related to the status of the switch.

Association group 1 supports 5 nodes.

### Group 2: Basic Set

Single press UP button sends BasicSet (0xFF) and single press Down sends BasicSet (0x00)

Association group 2 supports 5 nodes.

### Group 3: Switch Multilevel Set

Sends dim/brighten commands to associated device when switch is pressed.

Association group 3 supports 5 nodes.

### Group 4: Switch Multilevel Start/Stop

Sends start and stop level changes to associated devices.

Association group 4 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V2| Linked to BASIC|
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_PROTECTION_V2| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Product manual](https://www.cd-jackson.com/zwave_device_uploads/1146/LZW31-SN-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1146).
