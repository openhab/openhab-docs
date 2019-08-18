---
layout: documentation
title: FGWREU-111 - ZWave
---

{% include base.html %}

# FGWREU-111 Fibaro Walli Roller Shutter
This describes the Z-Wave device *FGWREU-111*, manufactured by *[Fibargroup](http://www.fibaro.com/)* with the thing type UID of ```fibaro_fgwreu111_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![FGWREU-111 product image](https://www.cd-jackson.com/zwave_device_uploads/1083/1083_default.jpg)


The FGWREU-111 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Smart wall switch designed to control motors of roller blinds, awnings, venetian blinds and other single phase, AC powered devices via Z-Wave network.

It measures active power and energy consumed by the controlled load.

You can install it with provided cover plate and switch button or other compatible.

### Inclusion Information

Z-Wave device learning mode, allowing to add the device to existing Z-Wave network:

  1. Power the device.
  2. Set the main controller into the adding mode (OH2: search for new things, select Z-Wave binding).
  3. Quickly, three times click one of the buttons.
  4. If you are adding in Security S2 Authenticated, input the underlined part of the DSK (label on the bottom of the box).
  5. LED will start blinking yellow, wait for the adding process to end.
  6. Adding result will be confirmed by the Z-Wave controller’s message and the LED frame: 
      * **Green** – successful (non-secure, S0, S2 non-authenticated),
      * **Magenta** – successful (Security S2 Authenticated),
      * **Red** – not successful.

### Exclusion Information

Z-Wave device learning mode, allowing to remove the device from existing Z-Wave network. Removing also results in resetting the device to factory defaults:

  1. Power the device.
  2. Set the main controller in remove mode (see the controller's manual).
  3. Quickly, three times click one of the buttons.
  4. LED will start blinking yellow, wait for the removing process to end.
  5. Successful removing will be confirmed by the Z-Wave controller’s message and red LED colour.

## Channels

The following table summarises the channels available for the FGWREU-111 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Blinds Control  [Deprecated]| blinds_control | blinds_control | Blinds | Rollershutter | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Scene Number | scene_number | scene_number |  | Number | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Alarm (system) | alarm_system | alarm_system |  | Switch | 
| Blinds Control | blinds_control1 | blinds_control | Blinds | Rollershutter | 
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number | 
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number | 
| Alarm (power) 1 | alarm_power1 | alarm_power | Energy | Switch | 
| Alarm (system) 1 | alarm_system1 | alarm_system |  | Switch | 
| Slats Control | blinds_control2 | blinds_control | Blinds | Rollershutter | 

### Blinds Control [Deprecated]
Provides start / stop control of blinds.

The ```blinds_control``` channel is of type ```blinds_control``` and supports the ```Rollershutter``` item and is in the ```Blinds``` category.

**Note:** This channel is marked as deprecated so should not be used.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

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

### Blinds Control
Provides start / stop control of blinds.

The ```blinds_control1``` channel is of type ```blinds_control``` and supports the ```Rollershutter``` item and is in the ```Blinds``` category.

### Electric meter (watts) 1
Indicates the instantaneous power consumption.

The ```meter_watts1``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh) 1
Indicates the energy consumption (kWh).

The ```meter_kwh1``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (power) 1
Indicates if a power alarm is triggered.

The ```alarm_power1``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (system) 1
Indicates if a system alarm is triggered.

The ```alarm_system1``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Slats Control
Provides start / stop control of blinds.

The ```blinds_control2``` channel is of type ```blinds_control``` and supports the ```Rollershutter``` item and is in the ```Blinds``` category.



## Device Configuration

The following table provides a summary of the 26 configuration parameters available in the FGWREU-111.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 11 | LED frame colour when moving | This parameter defines the LED colour when the motor is running. |
| 12 | LED frame – colour when not moving | This parameter defines the LED colour when the device motor is not running. |
| 13 | LED frame – brightness | This parameter allows to adjust the LED frame brightness. |
| 24 | Buttons orientation | This parameter allows reversing the operation of the buttons. |
| 25 | Outputs orientation | reversing the operation of Q1 and Q2 |
| 30 | Alarm configuration - 1st slot | Which alarm frames and how the device should react |
| 31 | Alarm configuration - 2nd slot | which alarm frames and how the device should react |
| 32 | Alarm configuration - 3rd slot | which alarm frames and how the device should react |
| 33 | Alarm configuration - 4th slot | which alarm frames and how the device should react |
| 34 | Alarm configuration - 5th slot | which alarm frames and how the device should react |
| 35 | Alarm configuration – duration | duration of alarm sequence |
| 40 | First button – scenes sent | which actions result in sending scene IDs |
| 41 | Second button – scenes sent | which actions result in sending scene IDs |
| 60 | Power reports – include self-consumption | power measurements include device itself |
| 61 | Power reports – on change | minimal change in measured power to report |
| 62 | Power reports – periodic | reporting interval for measured power |
| 65 | Energy reports – on change | minimal change in measured energy to report |
| 66 | Energy reports – periodic | This reporting interval for measured energy |
| 150 | Force calibration | Set 2 to force device into calibration mode |
| 151 | Operating mode | This parameter allows adjusting operation ac-cording to the connected device. |
| 152 | Venetian blind – time of full turn of the slats | time of full turn cycle of the slats |
| 153 | Set slats back to previous position | slats positioning in various situations |
| 154 | Delay motor stop after reaching end switch | time after which the motor will be stopped after contacts closed |
| 155 | Motor operation detection | Power threshold interpreted as reaching a limit switch. |
| 156 | Time of up movement | time needed for roller blinds to reach the top |
| 157 | Time of down movement | time needed for roller blinds to reach the bottom |

### Parameter 11: LED frame colour when moving

This parameter defines the LED colour when the motor is running.
0 – LED disabled

1 – White

2 – Red

3 – Green

4 – Blue

5 – Yellow

6 – Cyan

7 – Magenta
Values in the range 0 to 7 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: LED frame – colour when not moving

This parameter defines the LED colour when the device motor is not running.
0 – LED disabled

1 – White

2 – Red

3 – Green

4 – Blue

5 – Yellow

6 – Cyan

7 – Magenta
Values in the range 0 to 7 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: LED frame – brightness

This parameter allows to adjust the LED frame brightness.
0 – LED disabled

1-100 (1-100% brightness)
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 24: Buttons orientation

This parameter allows reversing the operation of the buttons.
0 – default (1st button UP, 2nd button DOWN)

1 – reversed (1st button DOWN, 2nd button UP)
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 25: Outputs orientation

reversing the operation of Q1 and Q2
This parameter allows reversing the operation of Q1 and Q2 without changing the wiring (e.g. in case of invalid motor connection).

0 - default (Q1 – UP, Q2 – DOWN)

1 - reversed (Q1 – DOWN, Q2 – UP)
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 30: Alarm configuration - 1st slot

Which alarm frames and how the device should react
This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most sig-nificant bytes are set according to the official Z-Wave protocol specification.

1B [MSB] – Notification Type

2B – Notification Status

3B – Event/State Parameters

4B [LSB] – action:

  * 0x00 – no action,
  * 0xX1 – open,
  * 0xX2 – close,
  * 0x0X – no action on LED frame,
  * 0x1X – LED frame blinks red,
  * 0x2X – LED frame blinks green,
  * 0x4X – LED frame blinks blue,
  * 0x8X – dis-able LED frame,
  * 0xFX – LED frame LAPD signal (red-white-blue)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_30_4_0000000F``` and is of type ```INTEGER```.


### Parameter 31: Alarm configuration - 2nd slot

which alarm frames and how the device should react
This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most sig-nificant bytes are set according to the official Z-Wave protocol specification.

default: \[0x05, 0xFF, 0x00, 0x00\](Water Alarm, any notification, no action)

1B [MSB] – Notification Type

2B – Notification Status

3B – Event/State Parameters

4B [LSB] – action:

  * 0x00 – no action,
  * 0xX1 – open,
  * 0xX2 – close,
  * 0x0X – no action on LED frame,
  * 0x1X – LED frame blinks red,
  * 0x2X – LED frame blinks green,
  * 0x4X – LED frame blinks blue,
  * 0x8X – dis-able LED frame,
  * 0xFX – LED frame LAPD signal (red-white-blue)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_31_4_0000000F``` and is of type ```INTEGER```.


### Parameter 32: Alarm configuration - 3rd slot

which alarm frames and how the device should react
This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most sig-nificant bytes are set according to the official Z-Wave protocol specification.

Default: \[0x01, 0xFF, 0x00, 0x00\](Smoke Alarm, any notification, no action)

1B [MSB] – Notification Type

2B – Notification Status

3B – Event/State Parameters

4B [LSB] – action:

  * 0x00 – no action,
  * 0xX1 – open,
  * 0xX2 – close,
  * 0x0X – no action on LED frame,
  * 0x1X – LED frame blinks red,
  * 0x2X – LED frame blinks green,
  * 0x4X – LED frame blinks blue,
  * 0x8X – dis-able LED frame,
  * 0xFX – LED frame LAPD signal (red-white-blue)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_32_4_0000000F``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 33: Alarm configuration - 4th slot

which alarm frames and how the device should react
This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most sig-nificant bytes are set according to the official Z-Wave protocol specification.

default: \[0x02, 0xFF, 0x00, 0x00\](CO Alarm, any notification, no action)

1B [MSB] – Notification Type

2B – Notification Status

3B – Event/State Parameters

4B [LSB] – action:

  * 0x00 – no action,
  * 0xX1 – open,
  * 0xX2 – close,
  * 0x0X – no action on LED frame,
  * 0x1X – LED frame blinks red,
  * 0x2X – LED frame blinks green,
  * 0x4X – LED frame blinks blue,
  * 0x8X – dis-able LED frame,
  * 0xFX – LED frame LAPD signal (red-white-blue)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_33_4_0000000F``` and is of type ```INTEGER```.


### Parameter 34: Alarm configuration - 5th slot

which alarm frames and how the device should react
This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most sig-nificant bytes are set according to the official Z-Wave protocol specification.

default: 0x04, 0xFF, 0x00, 0x00](Heat Alarm, any notification, no action)

1B [MSB] – Notification Type

2B – Notification Status

3B – Event/State Parameters

4B [LSB] – action:

  * 0x00 – no action,
  * 0xX1 – open,
  * 0xX2 – close,
  * 0x0X – no action on LED frame,
  * 0x1X – LED frame blinks red,
  * 0x2X – LED frame blinks green,
  * 0x4X – LED frame blinks blue,
  * 0x8X – dis-able LED frame,
  * 0xFX – LED frame LAPD signal (red-white-blue)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_34_4_0000000F``` and is of type ```INTEGER```.


### Parameter 35: Alarm configuration – duration

duration of alarm sequence
This parameter defines duration of alarm se-quence. When time set in this parameter elaps-es, alarm is cancelled, LED frame and relay re-store normal operation, but do not recover state from before the alarm.

0 – infinite

1-32400 (1s-9h, 1s step) – duration
Values in the range 0 to 32400 may be set.

The manufacturer defined default value is ```600```.

This parameter has the configuration ID ```config_35_2``` and is of type ```INTEGER```.


### Parameter 40: First button – scenes sent

which actions result in sending scene IDs
This parameter determines which actions result in sending scene IDs assigned to them. Values can be combined (e.g. 1+2=3 means that scenes for single and double click are sent).Enabling scenes for triple click disables entering the device in learn mode by triple clicking

0 (no scenes)

1 – Key pressed 1 time

2 – Key pressed 2 times

4 – Key pressed 3 times

8 – Key hold down and key released
Values in the range 0 to 15 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 41: Second button – scenes sent

which actions result in sending scene IDs
This parameter determines which actions result in sending scene IDs assigned to them. Values can be combined (e.g. 1+2=3 means that scenes for single and double click are sent).Enabling scenes for triple click disables entering the device in learn mode by triple clicking.

0 (no scenes)

1 – Key pressed 1 time

2 – Key pressed 2 times

4 – Key pressed 3 times

8 – Key hold down and key released
Values in the range 0 to 15 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_41_1``` and is of type ```INTEGER```.


### Parameter 60: Power reports – include self-consumption

power measurements include device itself
whether the power measurements should include power consumed by the device itself

0 – self-consumption not included

1 – self-consumption included
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_60_1``` and is of type ```INTEGER```.


### Parameter 61: Power reports – on change

minimal change in measured power to report
This parameter defines minimal change (from the last reported) in measured power that re-sults in sending new report. For loads under 50W the parameter is irrelevant, report are sent every 5W change.

0 - reporting on change disabled

1-500 (1-500%, 1% step) – minimal change
Values in the range 0 to 500 may be set.

The manufacturer defined default value is ```15```.

This parameter has the configuration ID ```config_61_2``` and is of type ```INTEGER```.


### Parameter 62: Power reports – periodic

reporting interval for measured power
This parameter defines reporting interval for measured power. Periodic reports are indepen-dent from changes in value (parameter 61).

0 – periodic reports disabled

30-32400 (30s-9h, 1s step) – time interval
Values in the range 0 to 32400 may be set.

The manufacturer defined default value is ```3600```.

This parameter has the configuration ID ```config_62_2``` and is of type ```INTEGER```.


### Parameter 65: Energy reports – on change

minimal change in measured energy to report
This parameter defines minimal change (from the last reported) in measured energy that re-sults in sending new report.

0 - reporting on change disabled

1-500 (0.01-5kWh, 0.01kWh step) – minimal change
Values in the range 0 to 500 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_65_2``` and is of type ```INTEGER```.


### Parameter 66: Energy reports – periodic

This reporting interval for measured energy
This parameter defines reporting interval for measured energy. Periodic reports are indepen-dent from changes in value (parameter 65).

0 – periodic reports disabled

30-32400 (30s-9h, 1s step) – time interval
Values in the range 0 to 32400 may be set.

The manufacturer defined default value is ```3600```.

This parameter has the configuration ID ```config_66_2``` and is of type ```INTEGER```.


### Parameter 150: Force calibration

Set 2 to force device into calibration mode
By setting this parameter to 2 the device enters the calibration mode. The parameter relevant only if the device is set to work in positioning mode (parameter 151 set to 1 or 2).

0 - device is not calibrated

1 - device is calibrated

2 - force device calibration
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_150_1``` and is of type ```INTEGER```.


### Parameter 151: Operating mode

This parameter allows adjusting operation ac-cording to the connected device.
1 – roller blind (with positioning)

2 – Venetian blind (with positioning)

5 – roller blind with built-in driver

6 – roller blind with built-in driver (impulse)
Values in the range 1 to 6 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_151_1``` and is of type ```INTEGER```.


### Parameter 152: Venetian blind – time of full turn of the slats

time of full turn cycle of the slats
For Venetian blinds (parameter 151 set to 2) the parameter determines time of full turn cycle of the slats. The parameter is irrelevant for other modes.

0-65535 (0 - 655.35s, every 0.01s) - time of turn
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```150```.

This parameter has the configuration ID ```config_152_4``` and is of type ```INTEGER```.


### Parameter 153: Set slats back to previous position

slats positioning in various situations
For Venetian blinds (parameter 151 set to 2) the parameter determines slats positioning in various situations. The parameter is irrelevant for other modes.

0 – slats return to previously set position only in case of the main controller operation

1 – slats return to previously set position in case of the main controller operation, momentary switch operation, or when the limit switch is reached

2 – slats return to previously set position in case of the main controller operation, momen-tary switch operation, when the limit switch is reached or after receiving the Switch Multilevel Stop control frame
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_153_1``` and is of type ```INTEGER```.


### Parameter 154: Delay motor stop after reaching end switch

time after which the motor will be stopped after contacts closed
The parameter determines the time after which the motor will be stopped after end switch contacts are closed.

1-255 (0.1s - 25.5 seconds)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_154_2``` and is of type ```INTEGER```.


### Parameter 155: Motor operation detection

Power threshold interpreted as reaching a limit switch.
1-255 (1-255W) - report interval

0 - no detection
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_155_2``` and is of type ```INTEGER```.


### Parameter 156: Time of up movement

time needed for roller blinds to reach the top
This parameter determines the time needed for roller blinds to reach the top. For modes with positioning value is set automatically during calibration, otherwise, it must be set manually.

1-65535 (0.01 - 655.35 seconds)
Values in the range 1 to 65535 may be set.

The manufacturer defined default value is ```6000```.

This parameter has the configuration ID ```config_156_4``` and is of type ```INTEGER```.


### Parameter 157: Time of down movement

time needed for roller blinds to reach the bottom
This parameter determines the time needed for roller blinds to reach the bottom.For modes with positioning value is set automatically during calibration, otherwise, it must be set manually.

1-65535 (0.01 - 655.35 seconds)
Values in the range 1 to 65535 may be set.

The manufacturer defined default value is ```6000```.

This parameter has the configuration ID ```config_157_4``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The FGWREU-111 supports 3 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 1 node.

### Group 2: Roller Shutter


Association group 2 supports 5 nodes.

### Group 3: Slats


Association group 3 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_CRC_16_ENCAP_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
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
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Operating Manual](https://www.cd-jackson.com/zwave_device_uploads/1083/FGWREU-111-T-EN-v1-0.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1083).
