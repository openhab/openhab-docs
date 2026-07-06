---
layout: documentation
title: VZW31-SN - ZWave
---

{% include base.html %}

# VZW31-SN Red Series 2-1 Switch
This describes the Z-Wave device *VZW31-SN*, manufactured by *Inovelli* with the thing type UID of ```inovelli_vzw31sn_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![VZW31-SN product image](https://opensmarthouse.org/zwavedatabase/1573/image/)


The VZW31-SN supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Introducing Z-Wave's first certified 800 Series Light Switch powered by Inovelli. Featuring Z-Wave Long Range which boasts open air signal of up to 1 mile, government level encryption and security, multi-tap scene control, LED notifications, power monitoring and over 60 parameters, this smart switch has it all. Best of all, it was developed by 1,000's of community members, which makes this truly a switch for the smart home enthusiast.

### Inclusion Information

When you are ready to include/pair your switch, please start the inclusion process on your Z-Wave enabled hub. If you are unsure how to do that, please refer to the specific hub instructions here:

Once your hub has started the inclusion process, quickly tap three (3) times on the configuration/favorites button and the LED Bar will start to pulse blue.

If your switch includes successfully, the LED Bar will blink Green temporarily and then go back to Blue. If the switch does not include successfully, the LED Bar will blink Red temporarily and then go back to Blue.

**Note:** If you run into issues where your switch is not including, you may have to try an exclusion process. To exclude your switch, start the exclusion process on your hub and then tap the config/favorites button 3x rapidly. If you continue to have issues after an exclusion, you may have to move the switch closer to the hub.

### Exclusion Information

Exclusion will reset your device as well and can be done directly from the hub. This is helpful if you’re running into issues with inclusion. To exclude a device, start the exclusion process on your hub and press the Configuration / Favorites Button 3x rapidly. The LED Bar will start pulsing blue and if successful, it will flash green. If unsuccessful it will flash red.

### General Usage Information



## Channels

The following table summarises the channels available for the VZW31-SN -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Scene Number | scene_number | scene_number |  | Number | 
| LED Strip Effect | config_decimal | config_decimal |  | Number | 
| LED Indicator Color | config_decimal | config_decimal |  | Number | 
| LED Indicator Intensity | config_decimal | config_decimal |  | Number | 

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

### LED Strip Effect
To adjust the LED Bar's notification (LED's 1-7) on the Red Series 2-1, find parameter 99 in your hub's UI and change it accordingly. The easiest way to see the notification's appearance is to go to the Inovelli Toolbox. First, select, "On\Off + Dimmer Switch (VZW31-SN)" followed by making sure the drop-down that says, "LED" says, "All". Then you can play with the color selector, brightness level, and duration and finally, you can select the animation itself by clicking on the "Effect" drop-down. The default is for all LED's 1-7 notifications to be set to 0, which is off.  


https://inovelliusa.github.io/inovelli-switch-toolbox/

Generic class for configuration parameter.

The ```config_decimal``` channel is of type ```config_decimal``` and supports the ```Number``` item.

### LED Indicator Color
Control the color of the LED Strip as per the Inovelli Switch Toolbox.

https://inovelliusa.github.io/inovelli-switch-toolbox/

Generic class for configuration parameter.

The ```config_decimal``` channel is of type ```config_decimal``` and supports the ```Number``` item.

### LED Indicator Intensity
Control the brightness of the LED Strip as per the Inovelli Switch Toolbox. https://inovelliusa.github.io/inovelli-switch-toolbox/

Generic class for configuration parameter.

The ```config_decimal``` channel is of type ```config_decimal``` and supports the ```Number``` item.



## Device Configuration

The following table provides a summary of the 49 configuration parameters available in the VZW31-SN.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Dimming Speed (↑) - Remote | How fast or slow the light turns on when you change the dim level remotely |
| 2 | Dimming Speed (↑) - Local | How fast or slow the light the light turns on when you hold up on the switch |
| 3 | Ramp Rate (Off → On) - Remote | How fast or slow the light turns on when you remotely bring the switch from Off to On |
| 4 | Ramp Rate (Off → On) - Local | How fast or slow the light turns on when you press the switch up 1x to bring from Off to On |
| 5 | Dimming Speed (↓) - Remote | How fast or slow the light turns off when you change the dim level remotely |
| 6 | Dimming Speed (↓) - Local | How fast or slow the light the light turns off when you hold down on the switch |
| 7 | Ramp Rate (On → Off) - Remote | How fast or slow the light turns on when you remotely bring the switch from Off to On |
| 8 | Ramp Rate (On → Off) - Local | How fast or slow the light turns on when you press the switch up 1x to bring from Off to On |
| 9 | Minimum Dim Level | Minimum level the light switch will dim to |
| 10 | Maximum Dim Level | Maximum level the light switch will dim to |
| 11 | Invert Switch | Inverts the switch (Tapping ↓ = On, Tapping ↑ = Off) |
| 12 | Auto Off Timer | Automatically turns the switch off after x amount of seconds |
| 13 | Default Level - Local | The default dim level the switch goes to when turned on locally (at the switch) |
| 14 | Default Level - Remote | The default dim level the switch goes to when powered on via a remote command |
| 15 | Level After Power Restored | When power is restored, the switch reverts to either On, Off, or Last Level |
| 17 | LED Indicator Timeout | Changes the amount of time (in seconds) the RGB Bar shows the Dim level |
| 18 | Active Power Reports | The power level change that will result in a new power report being sent in wattage (W) |
| 19 | Periodic Power & Energy Reports | Time period between consecutive power and energy reports being sent (in seconds) |
| 20 | Energy Reports | The energy level change that will result in a new energy report being sent in kilowatt hours (kWh) |
| 21 | AC Power Type | Select whether you are wiring your switch with or without a neutral wire |
| 22 | Aux Switch Type & Full Sine Mode | Select the Aux Switch type as well as Full Sine Mode |
| 25 | Higher Output in Non-Neutral | Ability to increase level in non-neutral mode. |
| 50 | Button Press Delay | Adjusts the delay between button taps in 100ms increments |
| 52 | Enables or disables smart bulb mode | Enables or disables smart bulb mode |
| 53 | Double-Tap Up to Parameter 55 | Enable or Disable setting brightness to parameter 55 on double-tap up. |
| 54 | Double-Tap Down to Parameter 56 | Enable or Disable setting brightness to parameter 56 on double-tap down. |
| 55 | Brightness Level for Double-Tap Up | Set this level on double-tap up (if enabled by P53) |
| 56 | Brightness Level for Double-Tap Down | Set this level on double-tap down (if enabled by P54) |
| 58 | Exclusion Behavior | How the device behaves during exclusion |
| 59 | Association Behavior | Choose when the switch sends commands to associated devices |
| 64 | LED #1 Notification | A 4-Byte encoded LED Notification for LED #1 (bottom LED) |
| 69 | LED #2 Notification | A 4-Byte encoded LED Notification for LED #2 (second from the bottom LED) |
| 74 | LED #3 Notification | A 4-Byte encoded LED Notification for LED #3 (third from the bottom LED) |
| 79 | LED #4 Notification | A 4-Byte encoded LED Notification for LED #4 (middle LED) |
| 84 | LED #5 Notification | A 4-Byte encoded LED Notification for LED #5 (third from the top LED) |
| 89 | LED #6 Notification | A 4-Byte encoded LED Notification for LED #6 (second from the top LED) |
| 94 | LED #7 Notification | A 4-Byte encoded LED Notification for LED #7 (top LED) |
| 95 | LED Indicator Color (When On) - LED #'s 1-7 | This will set the default color of the LED Bar (all 7 LED's) when the switch is on |
| 96 | LED Indicator Color (When Off) - LED #'s 1-7 | This will set the default color of the LED Bar (all 7 LED's) when the switch is off |
| 97 | LED Indicator Intensity (When On) - LED #'s 1-7 | This will set the intensity (ie: how bright it is) of the LED bar (all 7 LED's) when the switch is on |
| 98 | 	LED Indicator Intensity (When Off) - LED #'s 1-7 | This will set the intensity (ie: how bright it is) of the LED bar (all 7 LED's) when the switch is off |
| 99 | All LED Notification | A 4-Byte encoded LED Notification for LED's 1-7 (all LED's) |
| 100 | LED Bar Scaling | Method used for LED Bar scaling. |
| 123 | Aux Switch Unique Scenes | Have unique scene numbers for scenes activated with the aux switch. |
| 158 | Switch Type | Select what type of installation you have |
| 159 | LED Bar in On/Off Switch Mode | When the device in in On/Off Mode, use the Full LED Bar or just one LED |
| 160 | Firmware Update-in-Progress Bar | Display the firmware update progress on the LED Bar |
| 161 | Relay Click | Audible click in On/Off Mode |
| 162 | Double-Tap Config/Favorites Button to Clear Notification | Double-Tap the config/favorites button to clear notifications |

### Parameter 1: Dimming Speed (↑) - Remote

How fast or slow the light turns on when you change the dim level remotely
**Dimmer Mode Only**  


How fast or slow the light turns on when you change the dim level remotely (ie: dimming from 10-20%, 60-80%, etc)

More Details  


0 = Instant On  


5 = Fast (500ms)  


126 = Slow (12.6s)

IF USING A DUMB SWITCH: This parameter will not work when pressing the dumb switch manually.

**NOTE:** Third party code may need to be implemented (device handler, driver, etc) for this to work properly. Some hubs may not support this feature.
Values in the range 0 to 254 may be set.

The manufacturer defined default value is ```25```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Dimming Speed (↑) - Local

How fast or slow the light the light turns on when you hold up on the switch
**Dimmer Mode Only**  


How fast or slow the light the light turns on when you hold up on the switch (ie: dimming from 10-20%, 60-80%, etc)

More Details

0 = Instant On

5 = Fast (500ms)

126 = Slow (12.6s)

255 = Sync to Parameter 1

IF USING A DUMB SWITCH: This parameter will not work when pressing the dumb switch manually.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Ramp Rate (Off → On) - Remote

How fast or slow the light turns on when you remotely bring the switch from Off to On
**Dimmer Mode Only**  


How fast or slow the light turns on when you remotely bring the switch from Off to On

More Details

0 = Instant On

5 = Fast (500ms)

126 = Slow (12.6s)

255 = Sync to Parameter 1

**NOTE:** Third party code may need to be implemented (device handler, driver, etc) for this to work properly. Some hubs may not support this feature.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Ramp Rate (Off → On) - Local

How fast or slow the light turns on when you press the switch up 1x to bring from Off to On
**Dimmer Mode Only**  


How fast or slow the light turns on when you press the switch up 1x to bring from Off to On

More Details

0 = Instant On

5 = Fast (500ms)

126 = Slow (12.6s)

255 = Sync to Parameter 3
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Dimming Speed (↓) - Remote

How fast or slow the light turns off when you change the dim level remotely
**Dimmer Mode Only**  


How fast or slow the light turns off when you change the dim level remotely (ie: dimming from 80-60%, 20-10%, etc)

More Details

0 = Instant Off

5 = Fast (500ms)

126 = Slow (12.6s)

127 = Sync to Parameter 1

IF USING A DUMB SWITCH: This parameter will not work when pressing the dumb switch manually.

**NOTE:** Third party code may need to be implemented (device handler, driver, etc) for this to work properly. Some hubs may not support this feature.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Dimming Speed (↓) - Local

How fast or slow the light the light turns off when you hold down on the switch
**Dimmer Mode Only**  


How fast or slow the light the light turns off when you hold down on the switch (ie: dimming from 80-60%, 20-10%, etc)

More Details

0 = Instant Off

5 = Fast (500ms)

126 = Slow (12.6s)

127 = Sync to Parameter 2

IF USING A DUMB SWITCH: This parameter will not work when pressing the dumb switch manually.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Ramp Rate (On → Off) - Remote

How fast or slow the light turns on when you remotely bring the switch from Off to On
**Dimmer Mode Only**  


How fast or slow the light turns on when you remotely bring the switch from Off to On  


More Details  


0 = Instant Off

5 = Fast (500ms)

126 = Slow (12.6s)

255 = Sync to Parameter 3

**NOTE:** Third party code may need to be implemented (device handler, driver, etc) for this to work properly. Some hubs may not support this feature.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Ramp Rate (On → Off) - Local

How fast or slow the light turns on when you press the switch up 1x to bring from Off to On
**Dimmer Mode Only**  


How fast or slow the light turns on when you press the switch up 1x to bring from Off to On

More Details

0 = Instant Off

5 = Fast (500ms)

126 = Slow (12.6s)

255 = Sync to Parameter 4
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Minimum Dim Level

Minimum level the light switch will dim to
**Dimmer Mode Only**  


Minimum level the light switch will dim to

More Details

Lower the numeric value = lower the min dim level (1 = ~1%)

Higher the numeric value = higher the min dim level (54 = 99%)

Great for fixing flickering bulbs or calibrating the bulb if it shuts off prior to 1%
Values in the range 1 to 54 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Maximum Dim Level

Maximum level the light switch will dim to
**Dimmer Mode Only**  


Maximum level the light switch will dim to

More Details

Lower the numeric value = lower the max dim level (2 = ~2%)

Higher the numeric value = higher the max dim level (99 = 99%)

**NOTE:** Great for calibrating a bulb when it reaches maximum level before 99%
Values in the range 55 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Invert Switch

Inverts the switch (Tapping ↓ = On, Tapping ↑ = Off)
Inverts the switch (Tapping ↓ = On, Tapping ↑ = Off)

More Details

0 = Disabled

1 = Enabled
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Auto Off Timer

Automatically turns the switch off after x amount of seconds
Automatically turns the switch off after x amount of seconds

More Details

0 = Disabled

1 = 1s

32767 = 32767s
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: Default Level - Local

The default dim level the switch goes to when turned on locally (at the switch)
**Dimmer Mode Only**  


The default dim level the switch goes to when turned on locally (at the switch)

More Details

1-99 = Specific level on

0 = Returns to prior state it was before being turned off
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Default Level - Remote

The default dim level the switch goes to when powered on via a remote command
**Dimmer Mode Only**  


The default dim level the switch goes to when powered on via a remote command

More Details

1-99 = Specific level on

0 = Returns to prior state it was before being turned off
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Level After Power Restored

When power is restored, the switch reverts to either On, Off, or Last Level
When power is restored, the switch reverts to either On, Off, or Last Level

More Details

0 = Off

1-99 = Specific level on

100 = Returns to level before power outage
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 17: LED Indicator Timeout

Changes the amount of time (in seconds) the RGB Bar shows the Dim level
Changes the amount of time (in seconds) the RGB Bar shows the Dim level

More Details

0 = Always off

1 = 1 second after level is adjusted

10 = 10 seconds after level is adjusted

11 = Always on
Values in the range 0 to 11 may be set.

The manufacturer defined default value is ```11```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Active Power Reports

The power level change that will result in a new power report being sent in wattage (W)
The power level change that will result in a new power report being sent in wattage (W)

More Details

0 = Disabled

1 = 0.1W change

10 = 1W change

100 = 10W change

32767 = 3276.7W
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_18_2``` and is of type ```INTEGER```.


### Parameter 19: Periodic Power & Energy Reports

Time period between consecutive power and energy reports being sent (in seconds)
Time period between consecutive power and energy reports being sent (in seconds)

More Details

0 = Disabled

1 = 1s

32767 = 32767s

**NOTE:** Timer resets after every report is sent
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```3600```.

This parameter has the configuration ID ```config_19_2``` and is of type ```INTEGER```.


### Parameter 20: Energy Reports

The energy level change that will result in a new energy report being sent in kilowatt hours (kWh)
The energy level change that will result in a new energy report being sent in kilowatt hours (kWh)

More Details

0 = Disabled

1 = 0.01kWh

10 = 0.1kWh

100 = 1kWh

32767 = 327.67kWh
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_20_2``` and is of type ```INTEGER```.


### Parameter 21: AC Power Type

Select whether you are wiring your switch with or without a neutral wire
Select whether you are wiring your switch with or without a neutral wire

More Details

0 = No-Neutral

1 = Neutral
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | No-Neutral |
| 1 | Neutral |

The manufacturer defined default value is ```1``` (Neutral).

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22: Aux Switch Type & Full Sine Mode

Select the Aux Switch type as well as Full Sine Mode
Select the Aux Switch type as well as Full Sine Mode

More Details

0 = None

1 = 3-Way Dumb Switch

2 = 3-Way Aux Switch

3 = Single Pole Full Sine Wave
The following option values may be configured, in addition to values in the range 0 to 3 -:

| Value  | Description |
|--------|-------------|
| 0 | None |
| 1 | 3-Way Dumb Switch |
| 2 | 3-Way Aux Switch |
| 3 | Single Pole Full Sine Wave |

The manufacturer defined default value is ```0``` (None).

This parameter has the configuration ID ```config_22_1``` and is of type ```INTEGER```.


### Parameter 25: Higher Output in Non-Neutral

Ability to increase level in non-neutral mode.
Ability to increase level in non-neutral mode but may cause problems with high level ficker or aux switch detection. Adjust max level (P10) if you have problems with this enabled.

More Details

0 = Disabled

1 = Enabled
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 50: Button Press Delay

Adjusts the delay between button taps in 100ms increments
Adjusts the delay between button taps in 100ms increments

0 = 0ms / No Delay (disables multi-tap scene control)

1 = 100ms

2 = 200ms

9 = 900ms
Values in the range 0 to 9 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_50_1``` and is of type ```INTEGER```.


### Parameter 52: Enables or disables smart bulb mode

Enables or disables smart bulb mode
Enables or disables smart bulb mode

More Details

0 = Disable SBM

1 = Enable SBM
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Disable SBM |
| 1 | Enable SBM |

The manufacturer defined default value is ```0``` (Disable SBM).

This parameter has the configuration ID ```config_52_1``` and is of type ```INTEGER```.


### Parameter 53: Double-Tap Up to Parameter 55

Enable or Disable setting brightness to parameter 55 on double-tap up.
**Dimmer Mode Only**  


Enable or Disable setting brightness to parameter 55 on double-tap up.

More Details

0 = Disabled

1 = Enabled
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_53_1``` and is of type ```INTEGER```.


### Parameter 54: Double-Tap Down to Parameter 56

Enable or Disable setting brightness to parameter 56 on double-tap down.
Enable or Disable setting brightness to parameter 56 on double-tap down.

More Details

0 = Disabled

1 = Enabled
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_54_1``` and is of type ```INTEGER```.


### Parameter 55: Brightness Level for Double-Tap Up

Set this level on double-tap up (if enabled by P53)
**Dimmer Mode Only**  


Set this level on double-tap up (if enabled by P53)

More Details

1 = 1%

2 = 2%

99 = 99%
Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_55_1``` and is of type ```INTEGER```.


### Parameter 56: Brightness Level for Double-Tap Down

Set this level on double-tap down (if enabled by P54)
**Dimmer Mode Only**  


Set this level on double-tap down (if enabled by P54)

More Details

0 = off

1 = 1%

2 = 2%

99 = 99%
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_56_1``` and is of type ```INTEGER```.


### Parameter 58: Exclusion Behavior

How the device behaves during exclusion
How the device behaves during exclusion

More Details

0 = LED Bar Does Not Pulse (when config tapped 3x)

1 = LED Bar pulses blue

2 = Device does not enter exclusion mode (requires factory reset to leave network or change this parameter)
The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | LED Bar Does Not Pulse |
| 1 | LED Bar pulses blue |
| 2 | Device does not enter exclusion mode |

The manufacturer defined default value is ```1``` (LED Bar pulses blue).

This parameter has the configuration ID ```config_58_1``` and is of type ```INTEGER```.


### Parameter 59: Association Behavior

Choose when the switch sends commands to associated devices
Choose when the switch sends commands to associated devices

More Details

0 = Never

1 = Local

2 = Z-Wave

3 = Both
The following option values may be configured, in addition to values in the range 0 to 3 -:

| Value  | Description |
|--------|-------------|
| 0 | Never |
| 1 | Local |
| 2 | Z-Wave |
| 3 | Both |

The manufacturer defined default value is ```1``` (Local).

This parameter has the configuration ID ```config_59_1``` and is of type ```INTEGER```.


### Parameter 64: LED #1 Notification

A 4-Byte encoded LED Notification for LED #1 (bottom LED)
A 4-Byte encoded LED Notification for LED #1 (bottom LED)

More Details

To see an example, please go to the following URL: https://inovelliusa.github.io/inovelli-switch-toolbox/ and select, "VZW31-SN" under the "Switch Type" dropdown. Then select, "1" under where it says, "LED" and then play with the values (Color, Brightness, Duration, etc).
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_64_4``` and is of type ```INTEGER```.


### Parameter 69: LED #2 Notification

A 4-Byte encoded LED Notification for LED #2 (second from the bottom LED)
A 4-Byte encoded LED Notification for LED #2 (bottom LED)

More Details

To see an example, please go to the following URL: https://inovelliusa.github.io/inovelli-switch-toolbox/ and select, "VZW31-SN" under the "Switch Type" dropdown. Then select, "2" under where it says, "LED" and then play with the values (Color, Brightness, Duration, etc).
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_69_4``` and is of type ```INTEGER```.


### Parameter 74: LED #3 Notification

A 4-Byte encoded LED Notification for LED #3 (third from the bottom LED)
A 4-Byte encoded LED Notification for LED #3 (third from the bottom LED)

More Details

To see an example, please go to the following URL: https://inovelliusa.github.io/inovelli-switch-toolbox/ and select, "VZW31-SN" under the "Switch Type" dropdown. Then select, "3" under where it says, "LED" and then play with the values (Color, Brightness, Duration, etc).
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_74_4``` and is of type ```INTEGER```.


### Parameter 79: LED #4 Notification

A 4-Byte encoded LED Notification for LED #4 (middle LED)
A 4-Byte encoded LED Notification for LED #4 (middle LED)

More Details

To see an example, please go to the following URL: https://inovelliusa.github.io/inovelli-switch-toolbox/ and select, "VZW31-SN" under the "Switch Type" dropdown. Then select, "4" under where it says, "LED" and then play with the values (Color, Brightness, Duration, etc).
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_79_4``` and is of type ```INTEGER```.


### Parameter 84: LED #5 Notification

A 4-Byte encoded LED Notification for LED #5 (third from the top LED)
A 4-Byte encoded LED Notification for LED #5 (third from the top LED)

More Details

To see an example, please go to the following URL: https://inovelliusa.github.io/inovelli-switch-toolbox/ and select, "VZW31-SN" under the "Switch Type" dropdown. Then select, "5" under where it says, "LED" and then play with the values (Color, Brightness, Duration, etc).
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_84_4``` and is of type ```INTEGER```.


### Parameter 89: LED #6 Notification

A 4-Byte encoded LED Notification for LED #6 (second from the top LED)
A 4-Byte encoded LED Notification for LED #6 (second from the top LED)

More Details

To see an example, please go to the following URL: https://inovelliusa.github.io/inovelli-switch-toolbox/ and select, "VZW31-SN" under the "Switch Type" dropdown. Then select, "6" under where it says, "LED" and then play with the values (Color, Brightness, Duration, etc).
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_89_4``` and is of type ```INTEGER```.


### Parameter 94: LED #7 Notification

A 4-Byte encoded LED Notification for LED #7 (top LED)
A 4-Byte encoded LED Notification for LED #7 (top LED)

More Details

To see an example, please go to the following URL: https://inovelliusa.github.io/inovelli-switch-toolbox/ and select, "VZW31-SN" under the "Switch Type" dropdown. Then select, "7" under where it says, "LED" and then play with the values (Color, Brightness, Duration, etc).
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_94_4``` and is of type ```INTEGER```.


### Parameter 95: LED Indicator Color (When On) - LED #'s 1-7

This will set the default color of the LED Bar (all 7 LED's) when the switch is on
This will set the default color of the LED Bar (all 7 LED's) when the switch is on

More Details

0 = Red

14 = Orange

35 = Lemon

64 = Lime

85 = Green

106 = Teal

127 = Cyan

149 = Aqua

170 = Blue

191 = Violet

212 = Magenta

234 = Pink

255 = White
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Red |
| 14 | Orange |
| 35 | Lemon |
| 64 | Lime |
| 85 | Green |
| 106 | Teal |
| 127 | Cyan |
| 149 | Aqua |
| 170 | Blue |
| 191 | Violet |
| 212 | Magenta |
| 234 | Pink |
| 255 | White |

The manufacturer defined default value is ```170``` (Blue).

This parameter has the configuration ID ```config_95_1``` and is of type ```INTEGER```.


### Parameter 96: LED Indicator Color (When Off) - LED #'s 1-7

This will set the default color of the LED Bar (all 7 LED's) when the switch is off
This will set the default color of the LED Bar (all 7 LED's) when the switch is off

More Details

0 = Red

14 = Orange

35 = Lemon

64 = Lime

85 = Green

106 = Teal

127 = Cyan

149 = Aqua

170 = Blue

191 = Violet

212 = Magenta

234 = Pink

255 = White
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Red |
| 14 | Orange |
| 35 | Lemon |
| 64 | Lime |
| 85 | Green |
| 106 | Teal |
| 127 | Cyan |
| 149 | Aqua |
| 170 | Blue |
| 191 | Violet |
| 212 | Magenta |
| 234 | Pink |
| 255 | White |

The manufacturer defined default value is ```170``` (Blue).

This parameter has the configuration ID ```config_96_1``` and is of type ```INTEGER```.


### Parameter 97: LED Indicator Intensity (When On) - LED #'s 1-7

This will set the intensity (ie: how bright it is) of the LED bar (all 7 LED's) when the switch is on
This will set the intensity (ie: how bright it is) of the LED bar (all 7 LED's) when the switch is on

More Details

0 = Off

10 = Low

50 = Medium

100 = High
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```33```.

This parameter has the configuration ID ```config_97_1``` and is of type ```INTEGER```.


### Parameter 98: 	LED Indicator Intensity (When Off) - LED #'s 1-7

This will set the intensity (ie: how bright it is) of the LED bar (all 7 LED's) when the switch is off
This will set the intensity (ie: how bright it is) of the LED bar (all 7 LED's) when the switch is off

More Details

0 = Off

10 = Low

50 = Medium

100 = High
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_98_1``` and is of type ```INTEGER```.


### Parameter 99: All LED Notification

A 4-Byte encoded LED Notification for LED's 1-7 (all LED's)
A 4-Byte encoded LED Notification for LED's 1-7 (all LED's)

More Details

To see an example, please go to the following URL: https://inovelliusa.github.io/inovelli-switch-toolbox/ and select, "VZW31-SN" under the "Switch Type" dropdown. Then select, "All" under where it says, "LED" and then play with the values (Color, Brightness, Duration, etc).
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_99_4``` and is of type ```INTEGER```.


### Parameter 100: LED Bar Scaling

Method used for LED Bar scaling.
**Dimmer Mode Only**  


Method used for LED Bar scaling. This allows you to match the scaling when two different generations are in the same gang box (ie: Gen 2 LZW31, LZW31-SN vs Gen 3 VZW31-SN)

More Details

0 = Gen 3 (VZW)

1 = Gen 2 (LZW)
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Gen 3 (VZW) |
| 1 | Gen 2 (LZW) |

The manufacturer defined default value is ```0``` (Gen 3 (VZW)).

This parameter has the configuration ID ```config_100_1``` and is of type ```INTEGER```.


### Parameter 123: Aux Switch Unique Scenes

Have unique scene numbers for scenes activated with the aux switch.
Have unique scene numbers for scenes activated with the aux switch. In other words, you can activate Scene A (multi-tap) from the smart switch and activate Scene B (multi-tap) from the auxiliary switch with the same number of multi-taps.

More Details

0 = Disabled

1 = Enabled
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_123_1``` and is of type ```INTEGER```.


### Parameter 158: Switch Type

Select what type of installation you have
Select what type of installation you have

More Details

0 = Single-Pole (ie: one switch)

1 = Multi-Way (Dumb Switch)

2 = Multi-Way (Auxiliary Switch)
The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | Single-Pole (ie: one switch) |
| 1 | Multi-Way (Dumb Switch) |
| 2 | Multi-Way (Auxiliary Switch) |

The manufacturer defined default value is ```0``` (Single-Pole (ie: one switch)).

This parameter has the configuration ID ```config_158_1``` and is of type ```INTEGER```.


### Parameter 159: LED Bar in On/Off Switch Mode

When the device in in On/Off Mode, use the Full LED Bar or just one LED
**On/Off Mode Only**  


When the device in in On/Off Mode, use the Full LED Bar or just one LED

More Details

0 = Full Bar

1 = One LED
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Full Bar |
| 1 | One LED |

The manufacturer defined default value is ```0``` (Full Bar).

This parameter has the configuration ID ```config_159_1``` and is of type ```INTEGER```.


### Parameter 160: Firmware Update-in-Progress Bar

Display the firmware update progress on the LED Bar
Display the firmware update progress on the LED Bar

More Details

0 = Disabled

1 = Enabled
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (Enabled).

This parameter has the configuration ID ```config_160_1``` and is of type ```INTEGER```.


### Parameter 161: Relay Click

Audible click in On/Off Mode
Audible click in On/Off Mode

More Details

0 = Enabled

1 = Disabled
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Enabled |
| 1 | Disabled |

The manufacturer defined default value is ```1``` (Disabled).

This parameter has the configuration ID ```config_161_1``` and is of type ```INTEGER```.


### Parameter 162: Double-Tap Config/Favorites Button to Clear Notification

Double-Tap the config/favorites button to clear notifications
Double-Tap the config/favorites button to clear notifications

More Details

0 = Enabled

1 = Disabled
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Enabled |
| 1 | Disabled |

The manufacturer defined default value is ```0``` (Enabled).

This parameter has the configuration ID ```config_162_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The VZW31-SN supports 6 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Members of this group will receive unsolicited messages related to the status of the switch

Association group 1 supports 10 nodes.

### Group 2: Basic Set

Sends On & Off commands to associated devices

1. Single press on the up button sends BasicSet (0xFF)

2. Single press on the down button sends BasicSet (0x00)

Association group 2 supports 10 nodes.

### Group 3: Switch Multilevel Set

Sends set level commands to associated devices when switch is pressed.

1. Release up or down button sends Switch MultiLevelSet which keeps associated devices in sync with this device

2. Single press on the up button sends SwitchMultiLevelSet (0xFF)

3. Single press on the down button sends SwitchMultiLevelSet (0x00)

4. If param. 53 = 1, 2x press up sends SwitchMultiLevelSet to P55

5. If param. 54 = 1, 2x press down sends SwitchMultiLevelSet to P56

Association group 3 supports 10 nodes.

### Group 4: Switch Multilevel Start/Stop

Sends start / stop level change to associated devices (only in dimmer mode)

1. Hold up button sends SW\_MULTILEVEL\_START\_LEVEL\_CHANGE (Up)

2. Hold down button sends SW\_MULTILEVEL\_START\_LEVEL\_CHANGE (Down)

3. Release either button sends SW\_MULTILEVEL\_STOP\_LEVEL\_CHANGE

Association group 4 supports 10 nodes.

### Group 5: Double-Tap Basic Set

Sends On & Off commands to associated devices

1. 2x/3x press on the up button sends BasicSet (0xFF)

2. 2x/3x press on the down button sends BasicSet (0x00)

Association group 5 supports 10 nodes.

### Group 6: Triple-Tap Basic Set

Sends On & Off commands to associated devices

1. 2x/3x press on the up button sends BasicSet (0xFF)

2. 2x/3x press on the down button sends BasicSet (0x00)

Association group 6 supports 10 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_METER_V2| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_PROTECTION_V2| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Product Manual](https://opensmarthouse.org/zwavedatabase/1573/reference/manual-red-series-2-1-switch.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1573).
