---
layout: documentation
title: FGWDEU - ZWave
---

{% include base.html %}

# FGWDEU Fibaro Walli Dimmer
This describes the Z-Wave device *FGWDEU*, manufactured by *[Fibargroup](http://www.fibaro.com/)* with the thing type UID of ```fibaro_fgwdeu111_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![FGWDEU product image](https://www.cd-jackson.com/zwave_device_uploads/1074/1074_default.jpg)


The FGWDEU supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

FIBARO Walli Dimmer is a smart wall dimmer designed to control light source via Z-Wave network. It measures active power and energy consumed by the controlled load. You can install it with provided cover plate and switch button or other compatible.

### Inclusion Information

  1. Set the main controller into the adding mode (see the controller’s manual).
  2. Quickly, three times click one of the buttons.
  3. If you are adding in Security S2 Authenticated, input the underlined part of the DSK (label on the bottom of the box).
  4. LED will start blinking yellow, wait for the adding process to end.
  5. Adding result will be confirmed by the Z-Wave controller’s message and the LED frame: 
      * Green – successful (non-secure, S0, S2 non-authenticated),
      * Magenta – successful (Security S2 Authenticated),
      * Red – not successful.

### Exclusion Information

  1. Set the main controller in remove mode (see the controller's manual).
  2. Quickly, three times click one of the buttons.
  3. LED will start blinking yellow, wait for the removing process to end.
  4. Successful removing will be confirmed by the Z-Wave controller’s message and red LED colour.
  5. The device will start calibrating the load.

### General Usage Information

https://manuals.fibaro.com/walli-dimmer/

## Channels

The following table summarises the channels available for the FGWDEU -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Scene Number | scene_number | scene_number |  | Number | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Alarm (system) | alarm_system | alarm_system |  | Switch | 

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

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (system)
Indicates if a system alarm is triggered.

The ```alarm_system``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 46 configuration parameters available in the FGWDEU.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Remember device state | Determines how the device will react in the event of power supply failure |
| 2 | Overload safety switch | Turn off the controlled device in case of exceeding the defined power |
| 10 | LED frame – power limit | Determines maximum active power. |
| 11 | LED frame – colour when ON | This parameter defines the LED colour when the device is ON. |
| 12 | LED frame – colour when OFF | This parameter defines the LED colour when the device is OFF. |
| 13 | LED frame – brightness | This parameter allows to adjust the LED frame brightness. |
| 24 | Buttons orientation | This parameter allows reversing the operation of the buttons. |
| 30 | Alarm configuration - 1st slot | determines to which alarm frames and how the device should react |
| 31 | Alarm configuration - 2nd slot | determines to which alarm frames and how the device should react |
| 32 | Alarm configuration - 3rd slot | determines to which alarm frames and how the device should react |
| 33 | Alarm configuration - 4th slot | determines to which alarm frames and how the device should react |
| 34 | Alarm configuration - 5th slot | determines to which alarm frames and how the device should react |
| 35 | Alarm configuration – duration | defines duration of alarm sequence |
| 40 | First button – scenes sent | determines which actions result in sending scene IDs |
| 41 | Second button – scenes sent | determines which actions result in sending scene IDs |
| 60 | Power reports – include self-consumption | determines whether the power measurements should include self-consumption |
| 61 | Power reports – on change | defines minimal change to be reported |
| 62 | Power reports – periodic | defines reporting interval for measured power |
| 65 | Energy reports – on change | defines minimal change to be reported |
| 66 | Energy reports – periodic | defines reporting interval for measured energy |
| 150 | Minimum brightness level | Minimum brightness level - initialised at calibration |
| 151 | Maximum brightness level | Maximum brightness level - initalised at calibration |
| 152 | Incandescence level of compact fluorescent lamps | Incandescence level of dimmable compact fluorescent lamps |
| 153 | Incandescence time of compact fluorescent lamps | Incandescence time of dimmable compact fluorescent lamps |
| 154 | Automatic control – dimming step size | defines the percentage value of dimming step |
| 155 | Automatic control – time of dimming step | Automatic control – time of dimming step |
| 156 | Manual control – dimming step size | Manual control – dimming step size |
| 157 | Manual control – time of dimming step | Manual control – time of dimming step |
| 158 | Auto-off functionality | Auto-off functionality |
| 159 | Force auto-calibration | Force auto-calibration |
| 160 | Auto-calibration status (read-only) | Auto-calibration status (read-only parameter) |
| 161 | Burnt out bulb detection | Burnt out bulb detection |
| 162 | Delay of a burnt out bulb and overload detection | Time delay of a burnt out bulb and overload detection |
| 163 | 1st button ON value sent to association groups | First button – Switch ON value sent to 2nd and 3rd association groups |
| 164 | 2nd button OFF value sent to association groups | Second button – Switch OFF value sent to 2nd and 3rd association groups |
| 165 | Double click – set level | Double click – set level |
| 170 | Load control mode | Load control mode |
| 171 | Load control mode recognized  | Load control mode recognized during auto-calibration |
| 172 | ON/OFF mode | ON/OFF mode |
| 173 | Dimmability of the load (read only) | Dimmability of the load (read only) |
| 174 | Soft-start functionality | Soft-start functionality |
| 175 | Auto-calibration after power on | Auto-calibration after power on |
| 176 | Behaviour after OVERCURRENT or SURGE | Behaviour after OVERCURRENT or SURGE |
| 177 | Brightness level correction flickering  | Brightness level correction for flickering loads |
| 178 | Method of calculating the active power | Method of calculating the active power |
| 179 | Approximated power at max brightness | Approximated power at the maximum brightness level |

### Parameter 1: Remember device state

Determines how the device will react in the event of power supply failure
This parameter determines how the device will react in the event of power supply failure (e.g. power outage). 

Default value: 1 (restores the state) 

Available values: 

0 – remains switched off after restoring power 

1 – restores remembered state after restoring power
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | remains switched off after restoring power |
| 1 | restores remembered state after restoring power |

The manufacturer defined default value is ```1``` (restores remembered state after restoring power).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Overload safety switch

Turn off the controlled device in case of exceeding the defined power
This function allows to turn off the controlled device in case of exceeding the defined power. Controlled device can be turned back on via the button or sending a control frame.

0 – function disabled  
10-5000 (1.0-500.0W, step 0.1W) – power  threshold
Values in the range 0 to 5000 may be set.

The manufacturer defined default value is ```3500```.

This parameter has the configuration ID ```config_2_4``` and is of type ```INTEGER```.


### Parameter 10: LED frame – power limit

Determines maximum active power.
This parameter determines maximum active power. Exceeding it results in the LED frame flashing violet. Function is active only when parameter 11 is set to 8 or 9.

100-5000 (10.0-500.0W, step 0.1W) – power threshold
Values in the range 100 to 5000 may be set.

The manufacturer defined default value is ```3500```.

This parameter has the configuration ID ```config_10_4``` and is of type ```INTEGER```.


### Parameter 11: LED frame – colour when ON

This parameter defines the LED colour when the device is ON.
This parameter defines the LED colour when the device is ON.

When set to 8 or 9, LED frame colour will change depending on the measured power and parameter 10. Other colours are set permanently and do not depend on power consumption.

Available values:

0 – LED disabled

1 – White

2 – Red

3 – Green

4 – Blue

5 – Yellow

6 – Cyan

7 – Magenta

8 – colour changes smoothly depending on measured power

9 – colour changes in steps depending on measured power
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | LED diabled |
| 1 | White |
| 2 | Red |
| 3 | Green |
| 4 | Blue |
| 5 | Yellow |
| 6 | Cyan |
| 7 | Magenta |
| 8 | changes smoothly |
| 9 | changes in steps |

The manufacturer defined default value is ```1``` (White).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: LED frame – colour when OFF

This parameter defines the LED colour when the device is OFF.
Available values: 0 – LED disabled 1 – White 2 – Red 3 – Green 4 – Blue 5 – Yellow 6 – Cyan 7 – Magenta
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | White |
| 2 | Red |
| 3 | Green |
| 4 | Blue |
| 5 | Yellow |
| 6 | Cyan |
| 7 | Magenta |

The manufacturer defined default value is ```0``` (disabled).

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: LED frame – brightness

This parameter allows to adjust the LED frame brightness.
Available values:

0 – LED disabled

1-100 (1-100% brightness)

101 – brightness directly proportional to set level

102 – brightness inversely proportional to set level
Values in the range 0 to 102 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 24: Buttons orientation

This parameter allows reversing the operation of the buttons.
0 – default (1st button brightens, 2nd button dims)

1 – reversed (1st button dims, 2nd button brightens)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | default (1st button brightens, 2nd button dims) |
| 1 | reversed (1st button dims, 2nd button brightens) |

The manufacturer defined default value is ```0``` (default (1st button brightens, 2nd button dims)).

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 30: Alarm configuration - 1st slot

determines to which alarm frames and how the device should react
This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification.

1B [MSB] – Notification Type

2B – Notification Status

3B – Event/State Parameters

4B [LSB] – action:

0x00 – no action,  
0xX1 – turn ON,  
0xX2 – turn OFF,  
0xX3 – turn ON/OFF continuously,  
0x0X – no action on LED frame,  
0x1X – LED frame blinks red,  
0x2X – LED frame blinks green,  
0x4X – LED frame blinks blue,  
0x8X – disable LED frame,  
0xFX – LED frame LAPD signal (red-white-blue)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_30_4_0000000F``` and is of type ```INTEGER```.


### Parameter 31: Alarm configuration - 2nd slot

determines to which alarm frames and how the device should react
This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification.

Parameter size: 4B

Default value

[0x05, 0xFF, 0x00, 0x00]

(Water Alarm, any notification, no action)

Available values:

1B [MSB] – Notification Type

2B – Notification Status

3B – Event/State Parameters

4B [LSB] – action:

0x00 – no action,  
0xX1 – turn ON,  
0xX2 – turn OFF,  
0xX3 – turn ON/OFF continuously,  
0x0X – no action on LED frame,  
0x1X – LED frame blinks red,  
0x2X – LED frame blinks green,  
0x4X – LED frame blinks blue,  
0x8X – disable LED frame,  
0xFX – LED frame LAPD signal (red-white-blue)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_31_4_0000000F``` and is of type ```INTEGER```.


### Parameter 32: Alarm configuration - 3rd slot

determines to which alarm frames and how the device should react
This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification.

Parameter size: 4B

Default value

[0x01, 0xFF, 0x00, 0x00]

(Smoke Alarm, any notification, no action)

Available values:

1B [MSB] – Notification Type

2B – Notification Status

3B – Event/State Parameters

4B [LSB] – action:

0x00 – no action,  
0xX1 – turn ON,  
0xX2 – turn OFF,  
0xX3 – turn ON/OFF continuously,  
0x0X – no action on LED frame,  
0x1X – LED frame blinks red,  
0x2X – LED frame blinks green,  
0x4X – LED frame blinks blue,  
0x8X – disable LED frame,  
0xFX – LED frame LAPD signal (red-white-blue)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_32_4_0000000F``` and is of type ```INTEGER```.


### Parameter 33: Alarm configuration - 4th slot

determines to which alarm frames and how the device should react
This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification.

Parameter size: 4B

Default value

[0x02, 0xFF, 0x00, 0x00]

(CO Alarm, any notification, no action)

Available values:

1B [MSB] – Notification Type

2B – Notification Status

3B – Event/State Parameters

4B [LSB] – action:

0x00 – no action,  
0xX1 – turn ON,  
0xX2 – turn OFF,  
0xX3 – turn ON/OFF continuously,  
0x0X – no action on LED frame,  
0x1X – LED frame blinks red,  
0x2X – LED frame blinks green,  
0x4X – LED frame blinks blue,  
0x8X – disable LED frame,  
0xFX – LED frame LAPD signal (red-white-blue)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_33_4_0000000F``` and is of type ```INTEGER```.


### Parameter 34: Alarm configuration - 5th slot

determines to which alarm frames and how the device should react
This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification.

Parameter size: 4B

Default value

[0x04, 0xFF, 0x00, 0x00]

(Heat Alarm, any notification, no action)

Available values:

1B [MSB] – Notification Type

2B – Notification Status

3B – Event/State Parameters

4B [LSB] – action:

0x00 – no action,  
0xX1 – turn ON,  
0xX2 – turn OFF,  
0xX3 – turn ON/OFF continuously,  
0x0X – no action on LED frame,  
0x1X – LED frame blinks red,  
0x2X – LED frame blinks green,  
0x4X – LED frame blinks blue,  
0x8X – disable LED frame,  
0xFX – LED frame LAPD signal (red-white-blue)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_34_4_0000000F``` and is of type ```INTEGER```.


### Parameter 35: Alarm configuration – duration

defines duration of alarm sequence
0 – infinite

1-32400 (1s-9h, 1s step) – duration
Values in the range 0 to 32400 may be set.

The manufacturer defined default value is ```600```.

This parameter has the configuration ID ```config_35_2``` and is of type ```INTEGER```.


### Parameter 40: First button – scenes sent

determines which actions result in sending scene IDs
This parameter determines which actions result in sending scene IDs assigned to them. Values can be combined (e.g. 1+2=3 means that scenes for single and double click are sent).

Enabling scenes for triple click disables entering the device in learn mode by triple clicking.

Parameter size: 1B

Default value: 0 (no scenes)

Available values:

1 – Key pressed 1 time

2 – Key pressed 2 times

4 – Key pressed 3 times

8 – Key hold down and key released
The following option values may be configured, in addition to values in the range 0 to 15 -:

| Value  | Description |
|--------|-------------|
| 0 | no scenes |
| 1 | Key pressed once |
| 2 | Key pressed twice |
| 4 | Key pressed 3 times |
| 8 | Key held down and released |

The manufacturer defined default value is ```0``` (no scenes).

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 41: Second button – scenes sent

determines which actions result in sending scene IDs

Values in the range 0 to 15 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_41_1``` and is of type ```INTEGER```.


### Parameter 60: Power reports – include self-consumption

determines whether the power measurements should include self-consumption
This parameter determines whether the power measurements should include power consumed by the device itself.

Parameter size: 1B

Default value: 0 (not included)

Available values:

0 – Self-consumption not included

1 – Self-consumption included
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_60_1``` and is of type ```INTEGER```.


### Parameter 61: Power reports – on change

defines minimal change to be reported
This parameter defines minimal change (from the last reported) in measured power that results in sending new report. For loads under 50W the parameter is irrelevant, report are sent every 5W change.

Parameter size: 2B

Default value: 15 (15%)

Available values:

0 – reporting on change disabled

1-500 (1-500%, 1% step) – minimal change
Values in the range 0 to 500 may be set.

The manufacturer defined default value is ```15```.

This parameter has the configuration ID ```config_61_2``` and is of type ```INTEGER```.


### Parameter 62: Power reports – periodic

defines reporting interval for measured power
This parameter defines reporting interval for measured power. Periodic reports are independent from changes in value (parameter 61).

Parameter size: 2B

Default value: 3600 (1h)

Available values:

0 – periodic reports disabled

30-32400 (30s-9h, 1s step) – time interval
Values in the range 0 to 32400 may be set.

The manufacturer defined default value is ```3600```.

This parameter has the configuration ID ```config_62_2_wo``` and is of type ```INTEGER```.
This is a write only parameter.


### Parameter 65: Energy reports – on change

defines minimal change to be reported
This parameter defines minimal change (from the last reported) in measured energy that results in sending new report.

Parameter size: 2B

Default value: 10 (0.1kWh)

Available values:

0 – reporting on change disabled

1-500 (0.01-5kWh, 0.01kWh step) – minimal change
Values in the range 0 to 500 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_65_2``` and is of type ```INTEGER```.


### Parameter 66: Energy reports – periodic

defines reporting interval for measured energy
This parameter defines reporting interval for measured energy. Periodic reports are independent from changes in value (parameter 65).

Parameter size: 2B

Default value: 3600 (1h)

Available values:

0 – periodic reports disabled

30-32400 (30s-9h, 1s step) – time interval
Values in the range 0 to 32400 may be set.

The manufacturer defined default value is ```3600```.

This parameter has the configuration ID ```config_66_2``` and is of type ```INTEGER```.


### Parameter 150: Minimum brightness level

Minimum brightness level - initialised at calibration
This parameter is set automatically during the calibration process, but can be changed manually after the calibration.

Parameter size: 1B

Default value: 1

Available values:

1-98 (1-98%, 1% step) – level of brightness
Values in the range 1 to 98 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_150_1``` and is of type ```INTEGER```.


### Parameter 151: Maximum brightness level

Maximum brightness level - initalised at calibration
This parameter is set automatically during the calibration process, but can be changed manually after the calibration.

Parameter size: 1B

Default value: 99

Available values:

2-99 (2-99%, 1% step) – level of brightness
Values in the range 2 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_151_1``` and is of type ```INTEGER```.


### Parameter 152: Incandescence level of compact fluorescent lamps

Incandescence level of dimmable compact fluorescent lamps
The virtual value set as a percentage level between parameters MIN (1%) and MAX. (99%). The device will set to this value after the first switch on. It is required for warming up and switching dimmable compact fluorescent lamps and certain types of light sources.

Parameter size: 1B

Default value: 1

Available values:

1-99 (1-98%, 1% step) – level of brightness
Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_152_1``` and is of type ```INTEGER```.


### Parameter 153: Incandescence time of compact fluorescent lamps

Incandescence time of dimmable compact fluorescent lamps
This parameter determines the time required for switching compact fluorescent lamps and certain types of light sources. Setting this parameter to 0 will disable the incandescence functionality.

Parameter size: 2B

Default value: 0

Available values:

0-255 (0-25.5s, 0.1s step) – incandescence time
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_153_2``` and is of type ```INTEGER```.


### Parameter 154: Automatic control – dimming step size

defines the percentage value of dimming step
This parameter defines the percentage value of dimming step during the automatic control.

Parameter size: 1B

Default value: 1

Available values:

1-99 (1-99%, 1% step) – dimming step
Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_154_1``` and is of type ```INTEGER```.


### Parameter 155: Automatic control – time of dimming step

Automatic control – time of dimming step
This parameter defines the time of performing a single dimming step set in parameter 154 during the automatic control.

Parameter size: 2B

Default value: 1 (10ms)

Available values:

0-255 (0-2.55s, 10ms step)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_155_2``` and is of type ```INTEGER```.


### Parameter 156: Manual control – dimming step size

Manual control – dimming step size
This parameter defines the percentage value of the dimming step during the manual control.

Parameter size: 1B

Default value: 1

Available values:

1-99 (1-99%, 1% step) – dimming step
Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_156_1``` and is of type ```INTEGER```.


### Parameter 157: Manual control – time of dimming step

Manual control – time of dimming step
This parameter defines the time of performing a single dimming step set in parameter 156 during the manual control.

Parameter size: 2B

Default value: 5 (50ms)

Available values:

0-255 (0-2.55s, 10ms step)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_157_2``` and is of type ```INTEGER```.


### Parameter 158: Auto-off functionality

Auto-off functionality
This parameter allows to automatically switch off the device after a specified time from switching the light source on. It may be useful when the device is installed in the stairway.

Parameter size: 2B

Default value: 0

Available values:

0 – auto-off disabled

1-32767 (1s-9.1h, 1s step) – auto-off time
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_158_2``` and is of type ```INTEGER```.


### Parameter 159: Force auto-calibration

Force auto-calibration
Changing value of this parameter will force the calibration process. During the calibration parameter is set to 1 or 2 and switched to 0 upon completion.

Parameter size: 1B

Default value: 0

Available values:

0 – readout

1 – force auto-calibration without FIBARO Bypass 2

2 – force auto-calibration with FIBARO Bypass 2
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_159_1``` and is of type ```INTEGER```.


### Parameter 160: Auto-calibration status (read-only)

Auto-calibration status (read-only parameter)
This parameter determines operating mode of the device (automatic/manual settings).

Parameter size: 1B

Default value: 0

Available values:

0 – calibration procedure not performed or the device operates on manual settings

1 – the device operates on auto-calibration settings
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_160_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 161: Burnt out bulb detection

Burnt out bulb detection
This parameter defines percentage power variation (compared to power consumption measured during the calibration) to be interpreted as load error/burnt out bulb.

Parameter size: 1B

Default value: 0

Available values:

0 – function disabled

1-99 (1-99%, 1% step) – power variation
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_161_1``` and is of type ```INTEGER```.


### Parameter 162: Delay of a burnt out bulb and overload detection

Time delay of a burnt out bulb and overload detection
This parameter defines detection delay for the burnt out bulb (parameter 161) and overload (parameter 2).

Parameter size: 2B

Default value: 5

Available values:

0 – detection of a burnt out bulb disabled

1-255 (1-255s, 1s step) – time delay
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_162_2``` and is of type ```INTEGER```.


### Parameter 163: 1st button ON value sent to association groups

First button – Switch ON value sent to 2nd and 3rd association groups
This parameter defines value sent with Switch ON command to devices associated in 2nd and 3rd association group.

Parameter size: 2B

Default value: 255

Available values:

0-99, 255 – value sent

254 – send value equal to the current level
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_163_2``` and is of type ```INTEGER```.


### Parameter 164: 2nd button OFF value sent to association groups

Second button – Switch OFF value sent to 2nd and 3rd association groups
This parameter defines value sent with Switch OFF command to devices associated in 2nd and 3rd association group.

Parameter size: 2B

Default value: 0

Available values:

0-99, 255 – value sent

254 – send value equal to the current level
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_164_2``` and is of type ```INTEGER```.


### Parameter 165: Double click – set level

Double click – set level
This parameter defines brightness level set after double-clicking any of the buttons. The same value is also sent to devices associated with 2nd and 3rd association group.

Parameter size: 1B

Default value: 99

Available values:

0-99 (0-99%, 1% step) – set level
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_165_1``` and is of type ```INTEGER```.


### Parameter 170: Load control mode

Load control mode
This parameter allows to set the desired load control mode. Auto-calibration sets value of this parameter to 2 (control mode recognized during auto-calibration), but the installer may force control mode using this parameter.

After changing parameter value, turn the load OFF and ON to change control mode.

Parameter size: 1B

Default value: 2

Available values:

0 – forced leading edge

1 – forced trailing edge

2 – control mode selected automatically (based on auto-calibration)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | forced leading edge |
| 1 | forced trailing edge |
| 2 | control mode selected automatically |

The manufacturer defined default value is ```2``` (control mode selected automatically ).

This parameter has the configuration ID ```config_170_1``` and is of type ```INTEGER```.


### Parameter 171: Load control mode recognized 

Load control mode recognized during auto-calibration
This parameter allows to read load control mode that was set during auto-calibration.

Parameter size: 1B

Default value: –

Available values:

0 – leading edge

1 – trailing edge
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_171_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 172: ON/OFF mode

ON/OFF mode
This mode is necessary while connecting non-dimmable light sources. Setting this parameter to 1 automatically ignores brightening/dimming time settings. Forced auto-calibration will set this parameter’s value to 2.

Parameter size: 1B

Default value: 2

Available values:

0 – ON/OFF mode disabled (dimming is possible)

1 – ON/OFF mode enabled (dimming is not possible)

2 – mode selected automatically
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_172_1``` and is of type ```INTEGER```.


### Parameter 173: Dimmability of the load (read only)

Dimmability of the load (read only)
This parameter allows to read if the load detected during calibration procedure is dimmable.

Parameter size: 1B

Default value: —

Available values:

0 – load recognized as dimmable

1 – load recognized as non-dimmable
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_173_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 174: Soft-start functionality

Soft-start functionality
This parameter allows to set time required to warm up the filament of halogen bulb.

Parameter size: 1B

Default value: 1

Available values:

0 – no soft-start

1 – short soft-start (0.1s)

2 – long soft-start (0.5s)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | no soft-start |
| 1 | short soft-start (0.1s) |
| 2 | long soft-start (0.5s) |

The manufacturer defined default value is ```1``` (short soft-start (0.1s)).

This parameter has the configuration ID ```config_174_1``` and is of type ```INTEGER```.


### Parameter 175: Auto-calibration after power on

Auto-calibration after power on
This parameter determines the trigger of auto-calibration procedure, e.g. power on, load error, etc.

Parameter size: 1B

Default value: 1

Available values:

0 – no auto-calibration after power on

2 – Auto-calibration after each power on

3 – Auto-calibration after each LOAD ERROR (no load, load failure, burnt out bulb), if parameter 176 is set to 1 also after SURGE (output overvoltage) and OVERCURRENT (output overcurrent)

4 – Auto-calibration after each power on or after each LOAD ERROR (no load, load failure, burnt out bulb), if parameter 176 is set to 1 also after SURGE (output overvoltage) and OVERCURRENT (output overcurrent)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | no auto-calibration after power on |
| 1 | Auto-calibration after each power on |
| 2 | Auto-calibration after each LOAD ERROR |
| 4 | Auto-calibratie after each power on or LOAD ERROR |

The manufacturer defined default value is ```1``` (Auto-calibration after each power on).

This parameter has the configuration ID ```config_175_1``` and is of type ```INTEGER```.


### Parameter 176: Behaviour after OVERCURRENT or SURGE

Behaviour after OVERCURRENT or SURGE

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | permanently disabled |
| 1 | three attempts to turn on the load |

The manufacturer defined default value is ```1``` (three attempts to turn on the load).

This parameter has the configuration ID ```config_176_1``` and is of type ```INTEGER```.


### Parameter 177: Brightness level correction flickering 

Brightness level correction for flickering loads
Correction reduces spontaneous flickering of some capacitive loads (e.g. dimmable LEDs) at certain brightness levels in 2-wire installation.

In countries using ripple-control, correction may cause changes in brightness. In this case it is necessary to disable correction or adjust the time of correction for flickering loads.

Parameter size: 2B

Default value: 255

Available values:

0 – automatic correction disabled

1-254 (1-254s, 1s step) – duration of correction

255 – automatic correction always enabled
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_177_2``` and is of type ```INTEGER```.


### Parameter 178: Method of calculating the active power

Method of calculating the active power
This parameter defines how to calculate active power. It is useful in a case of 2-wire connection with light sources other than resistive.

Parameter size: 1B

Default value: 0

Available values:

0 – measurement based on the standard algorithm

1 – approximation based on the calibration data

2 – approximation based on the control angle
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | standard algorithm |
| 1 | approximation / calibration data |
| 2 | approximation / control angle |

The manufacturer defined default value is ```0``` ( standard algorithm).

This parameter has the configuration ID ```config_178_1``` and is of type ```INTEGER```.


### Parameter 179: Approximated power at max brightness

Approximated power at the maximum brightness level
This parameter determines the approximate value of the power that will be reported by the device at its maximum brightness level.

Parameter size: 2B

Default value: 0

Available values:

0-500 (0-500W, 1W step) – power consumed by the load at the maximum brightness level.
Values in the range 0 to 500 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_179_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The FGWDEU supports 3 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline

Association group 1 supports 1 node.

### Group 2: 2nd association group

“On/Off” is used to turn the associated devices on/off reflecting button operation (uses Basic command class).

Association group 2 supports 5 nodes.

### Group 3: 3rd association group

"Dimmer” is used to change level of associated devices reflecting button operation (uses Switch Multilevel command class).

Association group 3 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| Linked to BASIC|
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_CRC_16_ENCAP_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_PROTECTION_V2| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Operating Manual Fibaro Walli Dimmer FGWDEU-111](https://www.cd-jackson.com/zwave_device_uploads/1074/FGWDEU-111-T-EN-v1-0.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1074).
