---
layout: documentation
title: L 810 LED iHF - ZWave
---

{% include base.html %}

# L 810 LED iHF Sensor-switched outdoor up and downlighting
This describes the Z-Wave device *L 810 LED iHF*, manufactured by *Steinel* with the thing type UID of ```steinel_l810ledihf_00_000```.

The device is in the category of *Light Bulb*, defining Devices that illuminate something, such as bulbs, etc..

![L 810 LED iHF product image](https://www.cd-jackson.com/zwave_device_uploads/705/705_default.png)


The L 810 LED iHF supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/705) to improve the documentation.

## Channels

The following table summarises the channels available for the L 810 LED iHF -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Scene Number | scene_number |  | Number | 
| Binary Sensor | sensor_binary | Door | Switch | 
| Sensor (luminance) | sensor_luminance | Temperature | Number | 
| Alarm (burglar) | alarm_burglar | Door | Switch | 
| Alarm (system) | alarm_system |  | Switch | 
| Dimmer 1 | switch_dimmer1 | DimmableLight | Dimmer | 
| Scene Number 1 | scene_number1 |  | Number | 
| Alarm (burglar) 2 | alarm_burglar2 | Door | Switch | 

### Dimmer

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Scene Number

Triggers when a scene button is pressed.

The ```scene_number``` channel supports the ```Number``` item.

### Binary Sensor

Indicates if a sensor has triggered.

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (luminance)

Indicates the current light reading.

The ```sensor_luminance``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (burglar)

Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Alarm (system)

Indicates if a system alarm is triggered.

The ```alarm_system``` channel supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Dimmer 1

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer1``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Scene Number 1

Triggers when a scene button is pressed.

The ```scene_number1``` channel supports the ```Number``` item.

### Alarm (burglar) 2

Indicates if the burglar alarm is triggered.

The ```alarm_burglar2``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 15 configuration parameters available in the L 810 LED iHF.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Time | Duration of light after motion detection. |
| 2 | Light | Light threshold \[lx\]: |
| 3 | Dim | Night dim mode and time \[min\]: (only for SLAMP with DIM ability) |
| 4 | Range | Motion Radar Range \[cm\]: (only for iHF sensor) |
| 5 | Sensity | Motion Radar Sensitivity \[%\]: (SLAMP+SPIR) |
| 6 | Brighntes Meas Interval | Brightness measuring interval \[min\]: (only SLAMP) |
| 8 | Global_Light | Use external Ambient Light value: |
| 9 | Slave_Mode | Disable local control: |
| 10 | Off_Behaviour | Off behaviour (timeout): |
| 11 | On_Behaviour | On behaviour (timeout): |
| 12 | On_Time_Over | On behaviour time over (timeout): |
| 13 | On_Off_Behaviour | Sequence On-Off behaviour (timeout): |
| 14 | Off_On_Behaviour | Sequence Off-On behaviour (timeout): |
| 15 | Sequence_Time | Sequence timing: |
| 16 | Motion_Disable | Motion Off behaviour (timeout): |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Time

Duration of light after motion detection.

Values in the range 5 to 900 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: Light

Light threshold \[lx\]:
0 – run Learn ambient light sequence. 2000 – is used as daylight (always night mode). Value can be controlled via potentiometer (if present on device) – potentiometer value is then used as the default value and any potentiometer movement rewrites the current setting.
Values in the range 2 to 2000 may be set.

The manufacturer defined default value is ```2000```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Dim

Night dim mode and time \[min\]: (only for SLAMP with DIM ability)
0 – off (dim = basic light completely disabled). 1-60 – time \[minutes\] (enabled in night mode, starts after lamp is switched off after motion detection). -1 – whole night (dim through the whole night when lamp is off). Dim mode is also disabled when local control is disabled as well as in Slave mode.
Values in the range 0 to 60 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Range

Motion Radar Range \[cm\]: (only for iHF sensor)
Value can be controlled via potentiometer (if present on device) – potentiometer value is then used as default value and any potentiometer movement rewrites the current setting.
Values in the range 100 to 500 may be set.

The manufacturer defined default value is ```500```.

This parameter has the configuration ID ```config_4_2``` and is of type ```INTEGER```.


### Parameter 5: Sensity

Motion Radar Sensitivity \[%\]: (SLAMP+SPIR)
Value can be controlled via potentiometer (if present on device) – potentiometer value is then used as the default value and any potentiometer movement rewrites the current setting.
Values in the range 2 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Brighntes Meas Interval

Brightness measuring interval \[min\]: (only SLAMP)
Interval for measuring ambient light when lamp is on (lamp switches off briefly and measures). 0 = function is off.
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 8: Global_Light

Use external Ambient Light value:
When GLOBAL\_LIGHT mode is ON – device overrides its own light sensor values and uses Light Report values from any Z-Wave light sensor instead – this has to be configured appropriately to send light automatically. If the last remote light level value is older than 30 minutes, the internal light value is used again until the next external value is received.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Slave_Mode

Disable local control:
Bit Field:

 bit 7 6 5 4 3 2 1 0 Function - Don’t use button for lamp switching (STOGGLE) - - - "Stupid" mode Central unit checking in slave mode Slave mode "Stupid" mode (bit 2 = 1):
--------------------------

\- has higher priority then slave mode - lamp/relay is permanently on (for simple power wall switch controlling)

Slave mode (bit 0 =1):
----------------------

\- only if included in Z-Wave network   
\- useful for controlling via third-party sensor - lamp/relay is directly controlled via Z-Wave, internal sensors are not used for controlling it

Central unit checking (bit 1 =1):
---------------------------------

(useful especially for controlling via gateway)

When slave bit is 0:  
\- device signalises fail of lifeline connection (if this bit is zero, fail of lifeline connection is not signalised)

When slave bit is 1:  
\- device checks presence of Z-Wave device in lifeline group (gateway). If it is not present for 2 minutes (testing repeatedly every 30 seconds) device switches to normal mode in the same way as after the end of local disabled mode (ON\_BEHAVIOUR)   
\- the device checks every 1 minute for recovery of lifeline connection   
\- if no lifeline specified   
\- it works in normal mode

Do not use button for lamp switching (bit 6 = 1):
-------------------------------------------------

only for STOGGLE variant   
\- disables button controlling device itself along with controlling group 5. When enabled also works in stand-alone.

**Be careful with this option**, device stops using its own motion sensor in Slave and "Stupid" mode.
Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Off_Behaviour

Off behaviour (timeout):
Behaviour after BASIC OFF (and similar commands). If a transition (even with zero change) with a non-default duration is to be processed, the transition cannot be interrupted by any motion event in any case.

0 Lamp/Relay is switched off and remains so until any new motion event (local or remote) is received.

1 - 209 Lamp/Relay is switched off and remains so until after a specified timeout once a new motion event (local or remote) is received. Timeout: 1..100 – 1 second (1) to 100 seconds (100) in 1-second resolution 101..200 – 1 minute (101) to 100 minutes (200) 1-minute resolution 201..209 – 1 hour (201) to 9 hours (209) in 1-hour resolution

210 - 254 Reserved

255 Lamp/relay is switched off for TIME (cfg 1). It does not wait for a motion event and works normally via current motion evaluation.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: On_Behaviour

On behaviour (timeout):
Behaviour after BASIC ON (and similar commands). If a transition (even with zero change) with a non-default duration is to be processed, the transition cannot be interrupted by any motion event in any case.

0 Lamp/relay is switched on and remains so until any new motion event (local or remote) is received. It then works normally via current motion evaluation. Notice – during the day, this mode cannot be ended remotely due to motion events not being transmitted – only via local motion sensor if enabled.

1 - 209 Lamp/relay is switched on and remains so until after a specified timeout once a new motion event (local or remote) is received. It then works normally via current motion evaluation. Timeout: 1..100 – 1 second (1) to 100 seconds (100) in 1-second resolution 101..200 – 1 minute (101) to 100 minutes (200) in 1-minute resolution 201..209 – 1 hour (201) to 9 hours (209) in 1-hour resolution Notice – during the day, this mode cannot be ended remotely due to motion events not being transmitted – only via local motion sensor if enabled.

210 - 254 Reserved

255 Lamp/relay is switched on for TIME (cfg 1). It does not wait for a motion event and works normally via current motion evaluation.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: On_Time_Over

On behaviour time over (timeout):
Time limit to stop waiting for motion after timeout of ON\_BEHAVIOUR or OFF\_ON\_BEHAVIOUR (0-209) to prevent staying ON forever when there is no motion.

0 No additional waiting for motion.

1 - 209 1..100 – 1 second (1) to 100 seconds (100) in 1-second resolution 101..200 – 1 minute (101) to 100 minutes (200) in 1-minute resolution 201..209 – 1 hour (201) to 9 hours (209) in 1-hour resolution

210 - 254 Reserved

255 Never stop waiting for motion.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```204```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: On_Off_Behaviour

Sequence On-Off behaviour (timeout):
Behaviour after a rapid sequence of BASIC ON and BASIC OFF commands. The intention is to use a much longer timeout value than the time after a single ON command which should then be followed by a short timeout value. The behaviour is the same as for parameter 10 (OFF\_LOCAL\_DISABLE) except: 255 – device ignores ON - OFF sequence and uses OFF behaviour.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```204```.

This parameter has the configuration ID ```config_13_2``` and is of type ```INTEGER```.


### Parameter 14: Off_On_Behaviour

Sequence Off-On behaviour (timeout):
Behaviour after a rapid sequence of BASIC OFF and BASIC ON commands. The intention is to use a much longer timeout value than the time after a single OFF command which should then be followed by a short timeout value. The behaviour is the same as for parameter 11 (ON\_LOCAL\_DISABLE) except: 255 – device ignores OFF - ON sequence and uses ON behaviour.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```204```.

This parameter has the configuration ID ```config_14_2``` and is of type ```INTEGER```.


### Parameter 15: Sequence_Time

Sequence timing:
Time in \[100 milliseconds\] of maximum delay between BASIC ON and BASIC OFF (and vice versa) to consider this as a sequence. It is typically 1 second, but can be exceptionally longer due to retransmissions and overload – in this case, a longer interval can be allowed (up to 5 seconds).
Values in the range 10 to 50 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 16: Motion_Disable

Motion Off behaviour (timeout):
Motion disable timeout after BASIC SET to motion endpoint when the internal motion sensor is not used for evaluating the behaviour of the lamp(SLAMP) relay(SPIR) and groups 2 and 3. Events are, however, still transmitted to the Lifeline, and the device can be controlled via remote motion sensors.

0 BASIC SET to motion sensor endpoint ignored, BASIC to root is mapped to relay endpoint, (SPIR) motion sensor still enabled

1 - 209 Internal motion sensor is disabled for specified timeout after BASIC SET 0x00 to motion endpoint. Timeout: 1..100 – 1 second (1) to 100 seconds (100) in 1-second resolution 101..200 – 1 minute (101) to 100 minutes (200) in 1-minute resolution 201..209 – 1 hour (201) to 9 hours (209) in 1-hour resolution

210 - 254 Reserved

255 BASIC SET to motion endpoint ignored, motion sensor still disabled.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```209```.

This parameter has the configuration ID ```config_16_2``` and is of type ```INTEGER```.

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

The L 810 LED iHF supports 5 association groups.

### Group 1: Lifeline

Lifeline
This group supports 1 nodes.

### Group 2: Control: Key01

On/Off control
This group supports 16 nodes.

### Group 3: Notification: Motion

Motion Begin/End (PIR/radar/iHF)
This group supports 16 nodes.

### Group 4: Sensor: Luminescence

Ambient light
This group supports 15 nodes.

### Group 5: Control: Key02

On/Off button
This group supports 16 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V4| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V4| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ALARM_V4| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V4| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |

### Documentation Links

* [Specification v 1.0.0](https://www.cd-jackson.com/zwave_device_uploads/705/bdal2-110043512.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/705).
