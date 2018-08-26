---
layout: documentation
title: FGRGBW - ZWave
---

{% include base.html %}

# FGRGBW RGBW Controller
This describes the Z-Wave device *FGRGBW*, manufactured by *[Fibargroup](http://www.fibaro.com/)* with the thing type UID of ```fibaro_fgrgbw_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![FGRGBW product image](https://www.cd-jackson.com/zwave_device_uploads/131/131_default.jpg)


The FGRGBW supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/131) to improve the documentation.

## Channels

The following table summarises the channels available for the FGRGBW -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Sensor (power) | sensor_power | Energy | Number | 
| Electric meter (watts) | meter_watts | Energy | Number | 
| Electric meter (kWh) | meter_kwh | Energy | Number | 
| Color | color_color |  | Color | 
| Start animation | scene_number |  | Number | 
| Red | switch_dimmer2 | DimmableLight | Dimmer | 
| Green | switch_dimmer3 | DimmableLight | Dimmer | 
| Blue | switch_dimmer4 | DimmableLight | Dimmer | 
| White | switch_dimmer5 | DimmableLight | Dimmer | 

### Dimmer

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Sensor (power)

Indicates the energy consumption (kWh).

The ```sensor_power``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)

Indicates the instantaneous power consumption.

The ```meter_watts``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)

Indicates the energy consumption (kWh).

The ```meter_kwh``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Color

The color channel allows to control the color of a light.
            It is also possible to dim values and switch the light on and off.

The ```color_color``` channel supports the ```Color``` item.

### Start animation

Triggers when a scene button is pressed.

The ```scene_number``` channel supports the ```Number``` item.

### Red

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer2``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Green

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer3``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Blue

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer4``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### White

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer5``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The following table provides a summary of the 20 configuration parameters available in the FGRGBW.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | ALL ON / ALL OFF function activation | Activation/deactivation of ALL ON/ALL OFF functions. |
| 6 | Associations command class choice | Associations command class choice. By default, Normal (Dimmer) - BASIC\_SET/SWITCH\_MULTILEVEL\_START/STOP. Default setting: Normal (Dimmer) - BASIC\_SET/SWITCH\_MULTILEVEL\_START/STOP |
| 8 | Outputs state change mode | MODE1, Example: change saturation level from 0% to 99% Parameter 9: Step = 5 Parameter 10: Time between steps: 10ms. Default setting: MODE1 |
| 9 | Step value (relevant for MODE1) | Step value (relevant for MODE1).  
 Default setting: 1  
 Available settings: 1 - 255. |
| 10 | Time between steps (relevant for MODE1) | Time between steps (relevant for MODE1).  
 Default setting: 10 ms  
 0 - immediate change of state  
 Available settings: 1 - 60000 ms. |
| 11 | Time for changing from start to end value | Step value (relevant for MODE1).  
 Default setting: 67 (3s)  
 0: immediate change  
 1-63: 20-126 \[ms\] value\*20ms  
 65-127: 1-63 \[s\] (value-64)\*1s  
 129-191: 10-630 \[s\] (value-128)\*10s |
| 12 | Maximum Brightening level | Maximum Brightening level.  
 Default setting: 255  
 Available settings: 3 - 255. |
| 13 | Minimum dim level | Minimum dim level. Default setting: 2 Available settings: 3 - 255. |
| 14 | Inputs/Outputs configuration - relevant for main controllers other than Home Center 2 only | Inputs/Outputs configuration - relevant for main controllers other than Home Center 2 only.  
 Default setting: 4369  
 Controlled device: RGBW, toggle switch inputs (NORMAL MODE). |
| 16 | Remember device status after power failure | Define how will the Plug react after the power supply is back on. Default setting: 1 Available settings: 0 - Device does not memorize its state aft |
| 30 | Alarm of any type (General alarm, flood alarm, smoke alarm: CO, CO2, temperature alarm.) | Alarm of any type (General alarm, flood alarm, smoke alarm: CO, CO2, temperature alarm.) Default setting: INACTIVE |
| 38 | Alarm sequence program | Alarm sequence program.  
 Default setting: 10  
 1-10 specifies alarm program number. |
| 39 | Active PROGRAM alarm time | IActive PROGRAM alarm time.  
 Default setting: 600s  
 1-65534 specifies alarm time in seconds. |
| 42 | Command class reporting Outputs status change | Command class reporting Outputs status change. Default setting: 0 |
| 43 | Reporting 0-10v analog inputs change threshold | Parameter defines a value by which input voltage must change in order to be reported to the main controller.  
 New value is calculated based on last reported value.  
 Default setting: 5 |
| 44 | Power load reporting frequency | Parameter defines Time between reports. The report will be sent if last reported value differs from the current value, else reports will also be sent in case of polling.  
 Default setting: 3 600 (s) |
| 45 | Reporting Changes in energy consumed by controlled devices | Defines the required change in power to generate an unsolicited power report.  
 New, reported energy value is calculated based on last reported value.  
 Default setting: 10 (0,1 kWh). |
| 71 | Response to BRIGHTNESS set to 0% | Response to BRIGHTNESS set to 0%. Default setting: 1 |
| 72 | Starting animation program | Starting animation programm. Starting predefined program when device set to work in RGB/RGBW mode (parameter 14) - relevant for main controllers other than Home Center 2 only. Default setting: 1 |
| 73 | Triple click action | Triple click action. Default setting: 0 |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: ALL ON / ALL OFF function activation

Activation/deactivation of ALL ON/ALL OFF functions.
By default, ALL ON active ALL OFF active.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| -1 | ALL ON active ALL OFF active |
| 0 | ALL ON inactive ALL OFF inactive |
| 1 | ALL ON inactive ALL OFF active |
| 2 | ALL ON active ALL OFF inactive |

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 6: Associations command class choice

Associations command class choice. By default, Normal (Dimmer) - BASIC\_SET/SWITCH\_MULTILEVEL\_START/STOP. Default setting: Normal (Dimmer) - BASIC\_SET/SWITCH\_MULTILEVEL\_START/STOP

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Normal (Dimmer) - BASIC\_SET/SWITCH\_MULTILEVEL\_START/STOP |
| 1 | Normal (RGBW) - COLOR\_CONTROL\_SET/START/STOP\_STATE\_CHANGE |
| 2 | Normal (RGBW) - COLOR\_CONTROL\_SET |
| 3 | Brightness - BASIC\_SET/SWITCH\_MULTILEVEL\_START/STOP |
| 4 | Rainbow (RGBW) - COLOR\_CONTROL\_SET |

The manufacturer defined default value is ```0``` (Normal (Dimmer) - BASIC_SET/SWITCH_MULTILEVEL_START/STOP).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 8: Outputs state change mode

MODE1, Example: change saturation level from 0% to 99% Parameter 9: Step = 5 Parameter 10: Time between steps: 10ms. Default setting: MODE1

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | MODE1 (related parameters: 9-step value, 10-time between steps) |
| 1 | MODE2 (related parameters: 11-time to change value, relevant for RGB/R |

The manufacturer defined default value is ```0``` (MODE1 (related parameters: 9-step value, 10-time between steps)).

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Step value (relevant for MODE1)

Step value (relevant for MODE1).  
 Default setting: 1  
 Available settings: 1 - 255.

Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Time between steps (relevant for MODE1)

Time between steps (relevant for MODE1).  
 Default setting: 10 ms  
 0 - immediate change of state  
 Available settings: 1 - 60000 ms.

Values in the range 0 to 60000 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Time for changing from start to end value

Step value (relevant for MODE1).  
 Default setting: 67 (3s)  
 0: immediate change  
 1-63: 20-126 \[ms\] value\*20ms  
 65-127: 1-63 \[s\] (value-64)\*1s  
 129-191: 10-630 \[s\] (value-128)\*10s

Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```67```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Maximum Brightening level

Maximum Brightening level.  
 Default setting: 255  
 Available settings: 3 - 255.

Values in the range 3 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Minimum dim level

Minimum dim level. Default setting: 2 Available settings: 3 - 255.

Values in the range 2 to 255 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Inputs/Outputs configuration - relevant for main controllers other than Home Center 2 only

Inputs/Outputs configuration - relevant for main controllers other than Home Center 2 only.  
 Default setting: 4369  
 Controlled device: RGBW, toggle switch inputs (NORMAL MODE).

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```4369```.

This parameter has the configuration ID ```config_14_2``` and is of type ```INTEGER```.


### Parameter 16: Remember device status after power failure

Define how will the Plug react after the power supply is back on. Default setting: 1 Available settings: 0 - Device does not memorize its state aft

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Do not remember state |
| 1 | Remember state before power failure |

The manufacturer defined default value is ```1``` (Remember state before power failure).

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 30: Alarm of any type (General alarm, flood alarm, smoke alarm: CO, CO2, temperature alarm.)

Alarm of any type (General alarm, flood alarm, smoke alarm: CO, CO2, temperature alarm.) Default setting: INACTIVE

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | INACTIVE - the device doesn't respond to alarm frames |
| 1 | ALARM ON - the device turns on once alarm is detected (all channels se |
| 2 | ALARM OFF - the device turns off once alarm is detected (all channels |
| 3 | ALARM PROGRAM - alarm sequence turns on (program selected in parameter |

The manufacturer defined default value is ```0``` (INACTIVE - the device doesn't respond to alarm frames).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 38: Alarm sequence program

Alarm sequence program.  
 Default setting: 10  
 1-10 specifies alarm program number.

Values in the range 1 to 10 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_38_1``` and is of type ```INTEGER```.


### Parameter 39: Active PROGRAM alarm time

IActive PROGRAM alarm time.  
 Default setting: 600s  
 1-65534 specifies alarm time in seconds.

Values in the range 1 to 65534 may be set.

The manufacturer defined default value is ```600```.

This parameter has the configuration ID ```config_39_2``` and is of type ```INTEGER```.


### Parameter 42: Command class reporting Outputs status change

Command class reporting Outputs status change. Default setting: 0

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Reporting as a result of inputs and controllers actions (SWITCH MULTIL |
| 1 | Reporting as a result of inputs actions (SWITCH MULTILEVEL) |
| 2 | Reporting as a result of inputs actions (COLOR CONTROL) |

The manufacturer defined default value is ```0``` (Reporting as a result of inputs and controllers actions (SWITCH MULTIL).

This parameter has the configuration ID ```config_42_1``` and is of type ```INTEGER```.


### Parameter 43: Reporting 0-10v analog inputs change threshold

Parameter defines a value by which input voltage must change in order to be reported to the main controller.  
 New value is calculated based on last reported value.  
 Default setting: 5

Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_43_1``` and is of type ```INTEGER```.


### Parameter 44: Power load reporting frequency

Parameter defines Time between reports. The report will be sent if last reported value differs from the current value, else reports will also be sent in case of polling.  
 Default setting: 3 600 (s)

Values in the range 1 to 65534 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_44_2``` and is of type ```INTEGER```.


### Parameter 45: Reporting Changes in energy consumed by controlled devices

Defines the required change in power to generate an unsolicited power report.  
 New, reported energy value is calculated based on last reported value.  
 Default setting: 10 (0,1 kWh).

Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_45_1``` and is of type ```INTEGER```.


### Parameter 71: Response to BRIGHTNESS set to 0%

Response to BRIGHTNESS set to 0%. Default setting: 1

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | illumination colour set to white (all channels controlled together) |
| 1 | last set colour is memorized |

The manufacturer defined default value is ```1``` (last set colour is memorized).

This parameter has the configuration ID ```config_71_1``` and is of type ```INTEGER```.


### Parameter 72: Starting animation program

Starting animation programm. Starting predefined program when device set to work in RGB/RGBW mode (parameter 14) - relevant for main controllers other than Home Center 2 only. Default setting: 1

Values in the range 1 to 10 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_72_1``` and is of type ```INTEGER```.


### Parameter 73: Triple click action

Triple click action. Default setting: 0

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NODE INFO control frame is sent |
| 1 | starting favourite program |

The manufacturer defined default value is ```0``` (NODE INFO control frame is sent).

This parameter has the configuration ID ```config_73_1``` and is of type ```INTEGER```.

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

The FGRGBW supports 5 association groups.

### Group 1: Assigned to IN1 input


This group supports 5 nodes.

### Group 2: Assigned to IN2 input


This group supports 5 nodes.

### Group 3: Assigned to IN3 input


This group supports 5 nodes.

### Group 4: Assigned to IN4 input


This group supports 5 nodes.

### Group 5: Reports device status


This group supports 1 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V2| |
| COMMAND_CLASS_METER_V2| |
| COMMAND_CLASS_SWITCH_COLOR_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
#### Endpoint 5

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|

### Documentation Links

* [User Manual (v2.1-v2.3)](https://www.cd-jackson.com/zwave_device_uploads/131/fibaro-rgbw-controller-2-1-2-3-manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/131).
