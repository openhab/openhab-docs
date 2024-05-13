---
layout: documentation
title: HE-ZW-SW-5A-1 - ZWave
---

{% include base.html %}

# HE-ZW-SW-5A-1 5 Way Switch old
This describes the Z-Wave device *HE-ZW-SW-5A-1*, manufactured by *Heltun* with the thing type UID of ```heltun_hezwsw5a1_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![HE-ZW-SW-5A-1 product image](https://opensmarthouse.org/zwavedatabase/1597/image/)


The HE-ZW-SW-5A-1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The HELTUN 5 channel wall touch panel switch replaces an existing in-wall switch and enables manual or remote switch (On/Off) controls of lights, blinds, motors and heating systems with a maximum load of SA for each channel.

The switcher has two independent inputs for the relay channels which allows it to control systems with different power sources or to use outputs as dry contacts. Each relay can be controlled by the switcher touch buttons or independently via a Z-Wave gateway.

The panel has five sensitive capacitive touch control buttons with a two-colour (red and blue) backlight for each button. Button backlight brightness can be adjusted automatically depending on the illumination of the ambient environment or manually in the settings.

Each touch button can be configured tocontrol any relay (from one uptofive)outputstate in 7 different modes. The buttons also can be used as controller scene activators and the backlight can indicate the gateway mode or associated device status

### Inclusion Information

Inclusion

  1. Start the inclusion mode from the gateway
  2. To start the inclusion process on the device simultaneously press two bottom touch buttons and hold them for 3 seconds.
  3. Two upper buttons will sequentially blink blue-red
  4. If the inclusion has been successful the two upper buttons will turn blue.
  5. If the inclusion was not completed the two upper buttons will turn red. In that case start the inclusion process again.

Note: In case the device has been part of the Z-Wave network before and not excluded since, inclusion is not possible. In this case, exclusion or factory reset must be performed before inclusion.

Security: SO, S2 unauthorized and S2 authorized inclusion modes are supported. If you use S2 authorized inclusion mode the security key should be used in inclusion process.

NOTE: Be sure to save this key. Without this key it is impossible to perform an inclusion in S2 authorized mode

### Exclusion Information

Exclusion

To exclude the thermostat from the Z-Wave network

  1. Start the exclusion mode from the gateway
  2. Simultaneouslypress two bottom touch buttons and hold them for 3 seconds.
  3. Two upper buttons will sequentially blink blue-red
  4. If the exclusion has been successful the two upper buttons will turn red
  5. If the exclusion was not completed the two upper buttons will turn blue. In that case start the exclusion process again.

### General Usage Information

The device has 5 relays, 5 touch buttons and two-color (red and blue) backlights for each button.

  1. Each relay can be controlled by any touch button or via a Z-Wave network (Z­ Wave gateway).
  2. Each touch button can be configured to control any relay (from one and up to five) output state in below modes:
      1. press the button and the relay output goes to ON state only (contacts are closed).
      2. press the button and the relay output goes to OFF state only (contacts are open).
      3. press the button and the relay output inverts the state (ON to OFF or OFF to ON).
      4. press the button and the relay output goes to ON for a specified time then changes back to OFF. This function can be used to open/close garage doors, blinds, curtains, etc.
      5. press the button and the relay output goes to OFF for the specified time then changes back to ON. nme can be configured from 0.5 sec to 125 sec. This function can be used to switch off some security for a short time.
      6. When the button is held the relay output is ON, as soon as the button is released the relay output state changes to OFF.
      7. When the button is held the relay output is OFF, as soon as the button is released the relay output state changes to ON. Each touch buttons can also be used to run scenarios or modes in the connected gateway or associated devices.
  3. Each button backlight can be configured
      1. To indicate the relay output state
      2. To indicate the touch button state
      3. To indicate some mode state in the connected gateway
      4. To indicate the associated device state I

It is possible to choose the light colour for each state (red for ON and blue for OFF or blue for ON and red for OFF).

If the Heltun wall touch panel switch is included in the z-wave gateway, the scene controller and 10 binary switches appear. The scene controller indicates which button was pressed, held or released and allows the running of scenes. The first 5 binary switches indicate and allow the control of the buttons backlight and the remaining 5 binary switches indicate and control the relays.

The device can be used to manage lighting systems. It allows the association (via multilevel switch command) of a dimmer and control of both turning On and Off as well as smooth up and down light dimming.

The switch can also be used to manage any motorized system e.g. garage doors, window blinds, etc. It allows to association (via basic set or multilevel switch commands) with relay switches and roller shutters by controling the opening or closing of the system. If door/window sensors are installed they can be associated with backlights as well. In this case the touch buttons will serve as controls and the backlight will indicate the actual state of the system (open or closed).

## Channels

The following table summarises the channels available for the HE-ZW-SW-5A-1 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (luminance) | sensor_luminance | sensor_luminance |  | Number | 
| Sensor (power) | sensor_power | sensor_power | Energy | Number | 
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Scene Number | scene_number | scene_number |  | Number | 
| Battery Level | battery-level | system.battery_level | Battery | Number |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch | 
| Switch 3 | switch_binary3 | switch_binary | Switch | Switch | 
| Switch 4 | switch_binary4 | switch_binary | Switch | Switch | 
| Switch 5 | switch_binary5 | switch_binary | Switch | Switch | 
| Switch 6 | switch_binary6 | switch_binary | Switch | Switch | 
| Switch 7 | switch_binary7 | switch_binary | Switch | Switch | 
| Switch 8 | switch_binary8 | switch_binary | Switch | Switch | 
| Switch 9 | switch_binary9 | switch_binary | Switch | Switch | 
| Switch 10 | switch_binary10 | switch_binary | Switch | Switch | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (luminance)
Indicates the current light reading.

The ```sensor_luminance``` channel is of type ```sensor_luminance``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Sensor (power)
Indicates the energy consumption (kWh).

The ```sensor_power``` channel is of type ```sensor_power``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (relative humidity)
Indicates the current relative humidity.

The ```sensor_relhumidity``` channel is of type ```sensor_relhumidity``` and supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

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

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.
### Switch 1
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 2
Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 3
Switch the power on and off.

The ```switch_binary3``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 4
Switch the power on and off.

The ```switch_binary4``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 5
Switch the power on and off.

The ```switch_binary5``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 6
Switch the power on and off.

The ```switch_binary6``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 7
Switch the power on and off.

The ```switch_binary7``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 8
Switch the power on and off.

The ```switch_binary8``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 9
Switch the power on and off.

The ```switch_binary9``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 10
Switch the power on and off.

The ```switch_binary10``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The following table provides a summary of the 41 configuration parameters available in the HE-ZW-SW-5A-1.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Backlight 1 control source | Backlight 1 control source |
| 2 | Backlight 2 control source | Backlight 2 control source |
| 3 | Backlight 3 control source | Backlight 2 control source |
| 4 | Backlight 4 control source | Backlight 2 control source |
| 5 | Backlight 5 control source | Backlight 5 control source |
| 6 | Relay 1 control source | Relay 1 control source |
| 7 | Relay 2 control source | Relay 1 control source |
| 8 | Relay 3 control source | Relay 3 control source |
| 9 | Relay 4 control source | Relay 4 control source |
| 10 | Relay 5 control source | Relay 5 control source |
| 11 | Click control mode for touch button 1 | Click control mode for touch button 1 |
| 12 | Click control mode for touch button 2 | Click control mode for touch button 2 |
| 13 | Click control mode for touch button 3 | Click control mode for touch button 3 |
| 14 | Click control mode for touch button 4 | Click control mode for touch button 4 |
| 15 | Click control mode for touch button 5 | Click control mode for touch button 5 |
| 16 | Hold control mode for touch button 1 | Hold control mode for touch button 1 |
| 17 | Hold control mode for touch button 2 | Hold control mode for touch button 2 |
| 18 | Hold control mode for touch button 3 | Hold control mode for touch button 3 |
| 19 | Hold control mode for touch button 4 | Hold control mode for touch button 4 |
| 20 | Hold control mode for touch button 5 | Hold control mode for touch button 5 |
| 21 | Timer mode duration for button 1 | Timer mode duration for button 1 |
| 22 | Timer mode duration for button 2 | Timer mode duration for button 2 |
| 23 | Timer mode duration for button 3 | Timer mode duration for button 3 |
| 24 | Timer mode duration for button 4 | Timer mode duration for button 1 |
| 25 | Timer mode duration for button 5 | Timer mode duration for button 5 |
| 26 | Power of the Relay 1 load in W | Power of the Relay 1 load in W |
| 27 | Power of the Relay 2 load in W | Power of the Relay 2 load in W |
| 28 | Power of the Relay 3 load in W | Power of the Relay 3 load in W |
| 29 | Power of the Relay 4 load in W | Power of the Relay 4 load in W |
| 30 | Power of the Relay 5 load in W | Power of the Relay 5 load in W |
| 31 | Red colour backlight brightness | Red colour backlight brightness |
| 32 | Blue colour backlight brightness | Blue colour backlight brightness |
| 33 | Red colour auto brightness level 1 max lumens | Red colour auto brightness level 1 max lumens |
| 34 | Red colour auto brightness level 2 max lumens | Red colour auto brightness level 2 max lumens |
| 35 | Blue colour auto brightness level 1 max lumens | Blue colour auto brightness level 1 max lumens |
| 36 | Blue colour auto brightness level 2 max lumens | Blue colour auto brightness level 2 max lumens |
| 37 | Active state backlight colour | Active state backlight colour |
| 38 | Temperature sensor calibration | Temperature sensor calibration |
| 39 | Temperature difference to send to controller value X 10 | Temperature difference to send to controller value X 10 |
| 40 | Touch buttons sensitivity. 10=Super sensitive, 60=lowest sensitivity | Touch buttons sensitivity. 10=Super sensitive, 60=lowest sensitivity |
| 41 | Gateway | Gateway |

### Parameter 1: Backlight 1 control source

Backlight 1 control source
0-Backlight is disabled (both colour leds are turned off)

1—Controlled by touch button

2-Controlled by gateway or associated device

Factory default value: 1 
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Backlight 2 control source

Backlight 2 control source
0-Backlight is disabled (both colour leds are turned off)

1—Controlled by touch button

2-Controlled by gateway or associated device

Factory default value: 1 
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Backlight 3 control source

Backlight 2 control source
0-Backlight is disabled (both colour leds are turned off)

1—Controlled by touch button

2-Controlled by gateway or associated device

Factory default value: 1 
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Backlight 4 control source

Backlight 2 control source
0-Backlight is disabled (both colour leds are turned off)

1—Controlled by touch button

2-Controlled by gateway or associated device

Factory default value: 1 
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Backlight 5 control source

Backlight 5 control source
0-Backlight is disabled (both colour leds are turned off)

1—Controlled by touch button

2-Controlled by gateway or associated device

Factory default value: 1 
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Relay 1 control source

Relay 1 control source
0-Controlled by gateway or associated device

1 —Controlled by touch button N1 (Top Left)

2-Controlled by touch button N2 (Top Right)

3—-Controlled by touch button N3 (Bottom Left)

4-Controlled by touch button N4 (Bottom Right)

5—Controlled by touch button N5 (Center)

Factory default value: Each relay corresponds to its button, e.g. for Relay 3 the

default value is touch number 3 
Values in the range 0 to 5 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Relay 2 control source

Relay 1 control source
0-Controlled by gateway or associated device

1 —Controlled by touch button N1 (Top Left)

2-Controlled by touch button N2 (Top Right)

3—-Controlled by touch button N3 (Bottom Left)

4-Controlled by touch button N4 (Bottom Right)

5—Controlled by touch button N5 (Center)

Factory default value: Each relay corresponds to its button, e.g. for Relay 3 the

default value is touch number 3 
Values in the range 0 to 5 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Relay 3 control source

Relay 3 control source
0-Controlled by gateway or associated device

1 —Controlled by touch button N1 (Top Left)

2-Controlled by touch button N2 (Top Right)

3—-Controlled by touch button N3 (Bottom Left)

4-Controlled by touch button N4 (Bottom Right)

5—Controlled by touch button N5 (Center)

Factory default value: Each relay corresponds to its button, e.g. for Relay 3 the

default value is touch number 3 
Values in the range 0 to 5 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Relay 4 control source

Relay 4 control source
0-Controlled by gateway or associated device

1 —Controlled by touch button N1 (Top Left)

2-Controlled by touch button N2 (Top Right)

3—-Controlled by touch button N3 (Bottom Left)

4-Controlled by touch button N4 (Bottom Right)

5—Controlled by touch button N5 (Center)

Factory default value: Each relay corresponds to its button, e.g. for Relay 3 the

default value is touch number 3 
Values in the range 0 to 5 may be set.

The manufacturer defined default value is ```4```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Relay 5 control source

Relay 5 control source
0-Controlled by gateway or associated device

1 —Controlled by touch button N1 (Top Left)

2-Controlled by touch button N2 (Top Right)

3—-Controlled by touch button N3 (Bottom Left)

4-Controlled by touch button N4 (Bottom Right)

5—Controlled by touch button N5 (Center)

Factory default value: Each relay corresponds to its button, e.g. for Relay 3 the

default value is touch number 3 
Values in the range 0 to 5 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Click control mode for touch button 1

Click control mode for touch button 1
0-Click function is disabled

1 — press the button and the relay inverts the state (ON to OFF, OFF to ON like a

toggle switch) regarding touch button state.

2 -— press the button and the relay inverts the state (ON to OFF, OFF to ON like a

toggle switch) regarding button backlight state

3-—press the button and the relay goes to ON state only

4—press the button and the relay goes to OFF state only

5—Timer mode ON-OFF. Press the button and the relay output goes to the ON state

(contact is closed) then after a specified time it goes back to the OFF state (contactis

open). The time is specified in parameters 21-25.

6 — Timer mode OFF-ON. Press the button and the relay output goes to the OFF

state (contact is open) then after a specified time it goes back to the ON state

(contact is close). The time is specified in Parameters 21-25

Factory default value: 1 
Values in the range 0 to 6 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Click control mode for touch button 2

Click control mode for touch button 2
0-Click function is disabled

1 — press the button and the relay inverts the state (ON to OFF, OFF to ON like a

toggle switch) regarding touch button state.

2 -— press the button and the relay inverts the state (ON to OFF, OFF to ON like a

toggle switch) regarding button backlight state

3-—press the button and the relay goes to ON state only

4—press the button and the relay goes to OFF state only

5—Timer mode ON-OFF. Press the button and the relay output goes to the ON state

(contact is closed) then after a specified time it goes back to the OFF state (contactis

open). The time is specified in parameters 21-25.

6 — Timer mode OFF-ON. Press the button and the relay output goes to the OFF

state (contact is open) then after a specified time it goes back to the ON state

(contact is close). The time is specified in Parameters 21-25

Factory default value: 1 
Values in the range 0 to 6 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Click control mode for touch button 3

Click control mode for touch button 3
0-Click function is disabled

1 — press the button and the relay inverts the state (ON to OFF, OFF to ON like a

toggle switch) regarding touch button state.

2 -— press the button and the relay inverts the state (ON to OFF, OFF to ON like a

toggle switch) regarding button backlight state

3-—press the button and the relay goes to ON state only

4—press the button and the relay goes to OFF state only

5—Timer mode ON-OFF. Press the button and the relay output goes to the ON state

(contact is closed) then after a specified time it goes back to the OFF state (contactis

open). The time is specified in parameters 21-25.

6 — Timer mode OFF-ON. Press the button and the relay output goes to the OFF

state (contact is open) then after a specified time it goes back to the ON state

(contact is close). The time is specified in Parameters 21-25

Factory default value: 1 
Values in the range 0 to 6 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Click control mode for touch button 4

Click control mode for touch button 4
0-Click function is disabled

1 — press the button and the relay inverts the state (ON to OFF, OFF to ON like a

toggle switch) regarding touch button state.

2 -— press the button and the relay inverts the state (ON to OFF, OFF to ON like a

toggle switch) regarding button backlight state

3-—press the button and the relay goes to ON state only

4—press the button and the relay goes to OFF state only

5—Timer mode ON-OFF. Press the button and the relay output goes to the ON state

(contact is closed) then after a specified time it goes back to the OFF state (contactis

open). The time is specified in parameters 21-25.

6 — Timer mode OFF-ON. Press the button and the relay output goes to the OFF

state (contact is open) then after a specified time it goes back to the ON state

(contact is close). The time is specified in Parameters 21-25

Factory default value: 1 
Values in the range 0 to 6 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Click control mode for touch button 5

Click control mode for touch button 5
0-Click function is disabled

1 — press the button and the relay inverts the state (ON to OFF, OFF to ON like a

toggle switch) regarding touch button state.

2 -— press the button and the relay inverts the state (ON to OFF, OFF to ON like a

toggle switch) regarding button backlight state

3-—press the button and the relay goes to ON state only

4—press the button and the relay goes to OFF state only

5—Timer mode ON-OFF. Press the button and the relay output goes to the ON state

(contact is closed) then after a specified time it goes back to the OFF state (contactis

open). The time is specified in parameters 21-25.

6 — Timer mode OFF-ON. Press the button and the relay output goes to the OFF

state (contact is open) then after a specified time it goes back to the ON state

(contact is close). The time is specified in Parameters 21-25

Factory default value: 1 
Values in the range 0 to 6 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 16: Hold control mode for touch button 1

Hold control mode for touch button 1
0—Hold function is disabled

1 — Operate like click

2 — When the button is held the relay output state is ON, as soon as the button is

released the relay output state changes to OFF (momentary switch).

3-— When the button is held the relay output state is OFF, as soon as the button is

released the relay output state changes to ON (momentary switch).

Factory default value: 1
Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 17: Hold control mode for touch button 2

Hold control mode for touch button 2
0—Hold function is disabled

1 — Operate like click

2 — When the button is held the relay output state is ON, as soon as the button is

released the relay output state changes to OFF (momentary switch).

3-— When the button is held the relay output state is OFF, as soon as the button is

released the relay output state changes to ON (momentary switch).

Factory default value: 1
Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Hold control mode for touch button 3

Hold control mode for touch button 3
0—Hold function is disabled

1 — Operate like click

2 — When the button is held the relay output state is ON, as soon as the button is

released the relay output state changes to OFF (momentary switch).

3-— When the button is held the relay output state is OFF, as soon as the button is

released the relay output state changes to ON (momentary switch).

Factory default value: 1
Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 19: Hold control mode for touch button 4

Hold control mode for touch button 4
0—Hold function is disabled

1 — Operate like click

2 — When the button is held the relay output state is ON, as soon as the button is

released the relay output state changes to OFF (momentary switch).

3-— When the button is held the relay output state is OFF, as soon as the button is

released the relay output state changes to ON (momentary switch).

Factory default value: 1
Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_19_1``` and is of type ```INTEGER```.


### Parameter 20: Hold control mode for touch button 5

Hold control mode for touch button 5
0—Hold function is disabled

1 — Operate like click

2 — When the button is held the relay output state is ON, as soon as the button is

released the relay output state changes to OFF (momentary switch).

3-— When the button is held the relay output state is OFF, as soon as the button is

released the relay output state changes to ON (momentary switch).

Factory default value: 1
Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: Timer mode duration for button 1

Timer mode duration for button 1
These parameters specifiy the duration in seconds for the Timer mode (value 5 or 6

in Parameters 11-15 respectively). Press the button and the relay output goes to

ON/OFF for the specified time then changes back to OFF/ON. This function can be

used to open/close garage doors, blinds, curtains, etc. or to turn off the security fora

short time. Time can be configured from 1 sec to 255 sec.

Factory default value: 1
Values in the range 1 to 240 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22: Timer mode duration for button 2

Timer mode duration for button 2
These parameters specifiy the duration in seconds for the Timer mode (value 5 or 6

in Parameters 11-15 respectively). Press the button and the relay output goes to

ON/OFF for the specified time then changes back to OFF/ON. This function can be

used to open/close garage doors, blinds, curtains, etc. or to turn off the security fora

short time. Time can be configured from 1 sec to 255 sec.

Factory default value: 1
Values in the range 1 to 240 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_22_1``` and is of type ```INTEGER```.


### Parameter 23: Timer mode duration for button 3

Timer mode duration for button 3
These parameters specifiy the duration in seconds for the Timer mode (value 5 or 6

in Parameters 11-15 respectively). Press the button and the relay output goes to

ON/OFF for the specified time then changes back to OFF/ON. This function can be

used to open/close garage doors, blinds, curtains, etc. or to turn off the security fora

short time. Time can be configured from 1 sec to 255 sec.

Factory default value: 1
Values in the range 1 to 240 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.


### Parameter 24: Timer mode duration for button 4

Timer mode duration for button 1
These parameters specifiy the duration in seconds for the Timer mode (value 5 or 6

in Parameters 11-15 respectively). Press the button and the relay output goes to

ON/OFF for the specified time then changes back to OFF/ON. This function can be

used to open/close garage doors, blinds, curtains, etc. or to turn off the security fora

short time. Time can be configured from 1 sec to 255 sec.

Factory default value: 1
Values in the range 1 to 240 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 25: Timer mode duration for button 5

Timer mode duration for button 5
These parameters specifiy the duration in seconds for the Timer mode (value 5 or 6

in Parameters 11-15 respectively). Press the button and the relay output goes to

ON/OFF for the specified time then changes back to OFF/ON. This function can be

used to open/close garage doors, blinds, curtains, etc. or to turn off the security fora

short time. Time can be configured from 1 sec to 255 sec.

Factory default value: 1
Values in the range 1 to 240 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 26: Power of the Relay 1 load in W

Power of the Relay 1 load in W
Itis possible to specify the consumption of the loads in watts for each relays channel.

The device will calculate total consumption relativel to the time since the output of

the relays is in the ON state.

Factory default value: 0
Values in the range 0 to 5000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_26_2``` and is of type ```INTEGER```.


### Parameter 27: Power of the Relay 2 load in W

Power of the Relay 2 load in W
Itis possible to specify the consumption of the loads in watts for each relays channel.

The device will calculate total consumption relativel to the time since the output of

the relays is in the ON state.

Factory default value: 0
Values in the range 0 to 5000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_27_2``` and is of type ```INTEGER```.


### Parameter 28: Power of the Relay 3 load in W

Power of the Relay 3 load in W
Itis possible to specify the consumption of the loads in watts for each relays channel.

The device will calculate total consumption relativel to the time since the output of

the relays is in the ON state.

Factory default value: 0
Values in the range 0 to 5000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_28_2``` and is of type ```INTEGER```.


### Parameter 29: Power of the Relay 4 load in W

Power of the Relay 4 load in W
Itis possible to specify the consumption of the loads in watts for each relays channel.

The device will calculate total consumption relativel to the time since the output of

the relays is in the ON state.

Factory default value: 0
Values in the range 0 to 5000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_29_2``` and is of type ```INTEGER```.


### Parameter 30: Power of the Relay 5 load in W

Power of the Relay 5 load in W
Itis possible to specify the consumption of the loads in watts for each relays channel.

The device will calculate total consumption relativel to the time since the output of

the relays is in the ON state.

Factory default value: 0
Values in the range 0 to 5000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_30_2``` and is of type ```INTEGER```.


### Parameter 31: Red colour backlight brightness

Red colour backlight brightness
To activate the auto adjust function for the red colour backlights set the parameter

value 0. The comfort brightness for the red colour can be chosen depending on the

room illumination in Parameters 28 and 29.

0—Auto, 1 —Level 1 (Min), 2—Level 2, 3—Level 3 (Max)

Factory default value: 0 
Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_31_1``` and is of type ```INTEGER```.


### Parameter 32: Blue colour backlight brightness

Blue colour backlight brightness
To activate the auto adjust function for the blue colour backlights set the parameter

value 0. The comfort brightness for the red colour can be chosen depending on the

room illumination in Parameters 28 and 29.

0—Auto, 1 —Level 1 (Min), 2—Level 2, 3—Level 3 (Max)

Factory default value: 0 
Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_32_1``` and is of type ```INTEGER```.


### Parameter 33: Red colour auto brightness level 1 max lumens

Red colour auto brightness level 1 max lumens
The value indicates the maximum level of ambient illumination during which the

brightness of the red colour backlight will be at level 1 (the lowest level). For example

if this parameter value is set to 30 and the ambient illumination is in range 0-30 then

the backlight will be in the lowest brightness level. As soon as the illumination will be

31 or higher the backlight brightness will be changed to Level 2.

Factory default value: 30. 
Values in the range 0 to 5000 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_33_2``` and is of type ```INTEGER```.


### Parameter 34: Red colour auto brightness level 2 max lumens

Red colour auto brightness level 2 max lumens
The value indicates the maximum level of ambient illumination during which the

brightness of the red colour backlight will be at level 2. In case the illumination is in

the range Parameter 33 - Parameter 34 the display brightness will be on level 2. If the

illumination drops below the value of Parameter 33 the brightness will be decreases

to level 1, and if the illumination increases beyond the value of Parameter 34 the

brightness will rise to level 3.

Factory default value: 200. 
Values in the range 0 to 5000 may be set.

The manufacturer defined default value is ```200```.

This parameter has the configuration ID ```config_34_2``` and is of type ```INTEGER```.


### Parameter 35: Blue colour auto brightness level 1 max lumens

Blue colour auto brightness level 1 max lumens
The value indicates the maximum level of ambient illumination during which the

brightness of the blue colour backlight will be at level 1 (at the lowest level).

Factory default value: 30. 
Values in the range 0 to 5000 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_35_2``` and is of type ```INTEGER```.


### Parameter 36: Blue colour auto brightness level 2 max lumens

Blue colour auto brightness level 2 max lumens
The value indicates the maximum level of ambient illumination during which the

brightness of the blue colour backlight will be at level 2. If the illumination increases

beyond this value the brightness will rise to level 3.

Factory default value: 200. 
Values in the range 0 to 5000 may be set.

The manufacturer defined default value is ```200```.

This parameter has the configuration ID ```config_36_2``` and is of type ```INTEGER```.


### Parameter 37: Active state backlight colour

Active state backlight colour
Choose the value 0 if the red colour backlight is required for button active state and

the blue colour for the inactive state. Choose the value 1 if the blue colour backlight

is preferable for the active state and the red colour for the button inactive state.

Factory default value is 1. 
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_37_1``` and is of type ```INTEGER```.


### Parameter 38: Temperature sensor calibration

Temperature sensor calibration
This parameter defines the offset value for the air temperature sensor. If the internal

temperature sensor is not correctly calibrated the change of temperature can be

made by adjusting the values by up to +/- 9.5°C. This value will be added or

subtracted from the internal air temperature sensor reading. To define the offset

value set it is multiplied by 10 (value*10). E.g. the value -15 means -1.5°C.

Factory default value: 0 
Values in the range -95 to 95 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_38_2``` and is of type ```INTEGER```.


### Parameter 39: Temperature difference to send to controller value X 10

Temperature difference to send to controller value X 10
The switcher will send a new temperature to the gateway only in case the

temperature change is equal or greater than the parameter value/10 (value divided

by 10) specified in this parameter. For example if the parameter value is 3 and

sensor reading is 24.0°C the switcher will send new sensor reading to the gateway

only in case if itis 24.3°C and above or in case ifit is 23.7°C and below.

From 1 (0.1°C) to 10 (1.0°C) can be chosen.

Factory default value: 2 (0.2°C)

Note: The switcher sensor is very sensitive to changes of ambient temperature and

can often vary by +0.1C, therefore it is recommended to set this parameter from 2

(0.2°C) and above to reduce the load on your Z-Wave network. 
Values in the range 1 to 10 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_39_1``` and is of type ```INTEGER```.


### Parameter 40: Touch buttons sensitivity. 10=Super sensitive, 60=lowest sensitivity

Touch buttons sensitivity. 10=Super sensitive, 60=lowest sensitivity
The device touch buttons sensitivity can be adjusted.

From 10 (supper sensitive) to 60 (minimum sensitivity) can be chosen.

Factory default value: 20.

Note: Too high sensitivity can lead to false detection. Do not change this parameter

unless there is an urgent need. 
Values in the range 10 to 60 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 41: Gateway

Gateway
If Fibaro Home Center Lite or Fibaro Home Center 2 is used as a gateway for correct

communication of the devices set this parameter 1. For other gateways choose 0.

Factory default value: 0. 
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_41_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The device does not support associations.
## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V10| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 5

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 6

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 7

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 8

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 9

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 10

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |

### Documentation Links

* [manual](https://opensmarthouse.org/zwavedatabase/1597/reference/Switcher_Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1597).
