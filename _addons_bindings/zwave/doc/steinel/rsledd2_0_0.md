---
layout: documentation
title: RS LED D2 Z-Wave - ZWave
---

{% include base.html %}

# RS LED D2 Z-Wave Indoor LED-light with motion sensor
This describes the Z-Wave device *RS LED D2 Z-Wave*, manufactured by *Steinel* with the thing type UID of ```steinel_rsledd2_00_000```.

The device is in the category of *Light Bulb*, defining Devices that illuminate something, such as bulbs, etc..

![RS LED D2 Z-Wave product image](https://www.cd-jackson.com/zwave_device_uploads/759/759_default.png)


The RS LED D2 Z-Wave supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

  * The sensor-switched indoor light contains an active motion detector.
  * The integrated HF sensor emits high-frequency electromagnetic waves (5.8 GHz) and receives their echo.
  * The change in echo caused by the slightest movement within the detection zone of the light is detected by the sensor.
  * A microprocessor then issues the switch command "switch light ON".
  * Detection is possible through doors, panes of glass or thin walls.
  * This device can be integrated into the Smart Friends  system or any other Z-Wave network.
  * Z-Wave is a wireless standard for interconnecting Z-Wave devices.
  * The sensor parameters of the RS LED D2 indoor light can be used for wireless-based building automation.

The sensor-switched light can be put into service after mounting the enclosure and connecting to the mains power supply. The light will also work without being integrated into a Z-Wave network. In this case, the time setting is permanently set to 3 minutes. When putting the light into operation, the light will switch OFF after the 10-second calibration phase and is then activated for sensor mode. This light can now be integrated into the Z-Wave network. The settings can be made via the control dials or via Z-Wave network. The settings last selected will always be in effect regardless of whether they were made via the control dials or via Z-Wave network.

This product can be operated in any Z-Wave network with other Z-Wave certified devices from other manufacturers. All non-battery operated nodes within the network will act as repeaters regardless of vendor to increase reliability of the network.

### Inclusion Information

These instructions for including and excluding Steinel Z-Wave products have been written for the Smart Friends system. They may not always apply to other Z-Wave products. You will find further details in the description of your Z-Wave controller.

**To start the light's inclusion or exclusion mode, briefly press button SET.**

Following exclusion, all configuration parameters (time, sensitivity etc.) remain intact until next inclusion and the light now works in standalone mode – as a result, Z-Wave can also be used for the light's standalone setting.  
  
SET = Z-Wave button: Button for inclusion and exclusion as well as for returning the device  to the factory setting.

### Exclusion Information

**To start the light's inclusion or exclusion mode, briefly press button SET.**

## Channels

The following table summarises the channels available for the RS LED D2 Z-Wave -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Scene Number | scene_number | scene_number |  | Number | 
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Sensor (luminance) | sensor_luminance | sensor_luminance |  | Number | 
| Alarm (system) | alarm_system | alarm_system |  | Switch | 
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Scene Number 1 | scene_number1 | scene_number |  | Number | 
| Alarm (burglar) 2 | alarm_burglar2 | alarm_burglar | Door | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (luminance)
Indicates the current light reading.

The ```sensor_luminance``` channel is of type ```sensor_luminance``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Alarm (system)
Indicates if a system alarm is triggered.

The ```alarm_system``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (burglar)
Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel is of type ```alarm_burglar``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Switch 1
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number 1
Triggers when a scene button is pressed.

The ```scene_number1``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Alarm (burglar) 2
Indicates if the burglar alarm is triggered.

The ```alarm_burglar2``` channel is of type ```alarm_burglar``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 14 configuration parameters available in the RS LED D2 Z-Wave.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Time [s] | Duration of light after motion detection. |
| 2 | Light threshold [lx] | LIGHT |
| 4 | Motion Radar Range [cm] | RANGE |
| 5 | Motion Radar Sensitivity [%] | SENSITIVITY |
| 6 | Brightness measuring interval [min] | (only SLAMP) |
| 8 | Use external Ambient Light value | GLOBAL_LIGHT |
| 9 | Disable local control | SLAVE_MODE |
| 10 | Off behaviour (timeout) | OFF_BEHAVIOUR |
| 11 | On behaviour (timeout) | ON_BEHAVIOUR |
| 12 | On behaviour time over (timeout) | ON\_TIME\_OVER |
| 13 | Sequence On-Off behaviour (timeout) | ON\_OFF\_ BEHAVIOUR |
| 14 | Sequence Off-On behaviour (timeout) | OFF\_ON\_ BEHAVIOUR |
| 15 | Sequence timing | SEQUENCE_TIME |
| 16 | Motion Off behaviour (timeout) | MOTION_ DISABLE |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Time [s]

Duration of light after motion detection.

Values in the range 5 to 900 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: Light threshold [lx]

LIGHT
0      – run Learn ambient light sequence.  
2000 – is used as daylight (always night mode).

Value can be controlled via potentiometer (if present on device) – potentiometer value is then used as the default value and any potentiometer movement rewrites the current setting
Values in the range 2 to 2000 may be set.

The manufacturer defined default value is ```2000```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 4: Motion Radar Range [cm]

RANGE
Value can be controlled via potentiometer (if present on device) – potentiometer value is then used as default value and any potentiometer movement rewrites the current setting.
Values in the range 100 to 500 may be set.

The manufacturer defined default value is ```500```.

This parameter has the configuration ID ```config_4_2``` and is of type ```INTEGER```.


### Parameter 5: Motion Radar Sensitivity [%]

SENSITIVITY
Value can be controlled via potentiometer (if present on device) – potentiometer value is then used as the default value and any potentiometer movement rewrites the current setting.
Values in the range 2 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Brightness measuring interval [min]

(only SLAMP)
Interval for measuring ambient light when lamp is on (lamp switches off briefly and measures). 0 = function is off.
Values in the range 5 to 120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 8: Use external Ambient Light value

GLOBAL_LIGHT
When GLOBAL_LIGHT mode is ON – device overrides its own light sensor values and uses Light Report values from any Z-Wave light sensor instead – this has to be configured appropriately to send light automatically.

If the last remote light level value is older than 30 minutes, the internal light value is used again until the next external value is received.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Disable local control

SLAVE_MODE
**"Stupid" mode (bit 2 = 1):**  
  - has higher priority then slave mode  
  - lamp/relay is permanently on (for simple power wall switch controlling)

**Slave mode (bit 0 =1):**  
  - only if included in Z-Wave network  
  - useful for controlling via third-party sensor  
  - lamp/relay is directly controlled via Z-Wave, internal sensors are not used for controlling it

**Central unit checking (bit 1 =1):** (useful especially for controlling via gateway)  
  When slave bit is 0:  
  - device signalises fail of lifeline connection (if this bit is zero, fail of lifeline connection is not signalised)

  When slave bit is 1:  
  - device checks presence of Z-Wave device in lifeline group (gateway).  
    If it is not present for 2 minutes (testing repeatedly every 30 seconds)  
    device switches to normal mode in the same way as after the end of  
    local disabled mode (ON_BEHAVIOUR)  
  - the device checks every 1 minute for recovery of lifeline connection  
  - if no lifeline specified - it works in normal mode

Do not use button for lamp switching (bit 6 = 1): only for STOGGLE variant  
  - disables button controlling device itself along with controlling group 5.

    When enabled also works in stand-alone.

**Be careful with this option, device stops using its own motion sensor in** **Slave and "Stupid" mode.**

bit field:

7 - no Function

6 - Don’t use button for lamp - switching (STOGGLE)

4 - no Function

3 - no Function

2 - "Stupid" mode

1 - Central unit checking in slave mode

0 - Slave mode
Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Off behaviour (timeout)

OFF_BEHAVIOUR
Behaviour after BASIC OFF (and similar commands).  
If a transition (even with zero change) with a non-default duration is to be pro-  
cessed, the transition cannot be interrupted by any motion event in any case.

0 = Lamp/Relay is switched off and remains so until any new motion event (local or remote) is received.

1 - 209 = Lamp/Relay is switched off and remains so until after a specified timeout once a new motion event (local or remote) is received.  
    Timeout:  
    1..100 – 1 second (1) to 100 seconds (100) in 1-second resolution  
    101..200 – 1 minute (101) to 100 minutes (200) 1-minute resolution  
    201..209 – 1 hour (201) to 9 hours (209) in 1-hour resolution

210 - 254 = Reserved

255 = Lamp/relay is switched off for TIME (cfg 1). It does not wait for a motion event and works normally via current motion evaluation.
The following option values may be configured, in addition to values in the range 0 to 209 -:

| Value  | Description |
|--------|-------------|
| 255 | Lamp/relay is switched off for TIME (cfg 1) |

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: On behaviour (timeout)

ON_BEHAVIOUR
Behaviour after BASIC ON (and similar commands).  
If a transition (even with zero change) with a non-default duration is to be processed, the transition cannot be interrupted by any motion event in any case.

0 = Lamp/relay is switched on and remains so until any new motion event (local or remote) is received. It then works normally via current motion evaluation.  
Notice – during the day, this mode cannot be ended remotely due to motion events not being transmitted – only via local motion sensor if enabled.

1 - 209 = Lamp/relay is switched on and remains so until after a specified timeout once a new motion event (local or remote) is received. It then works normally via current motion evaluation.  
    Timeout:  
    1..100 – 1 second (1) to 100 seconds (100) in 1-second resolution  
    101..200 – 1 minute (101) to 100 minutes (200) in 1-minute resolution  
    201..209 – 1 hour (201) to 9 hours (209) in 1-hour resolution  
Notice – during the day, this mode cannot be ended remotely due to motion events not being transmitted – only via local motion sensor if enabled.

210 - 254 = Reserved

255 = Lamp/relay is switched on for TIME (cfg 1). It does not wait for a motion event and works normally via current motion evaluation.
Values in the range 2 to 209 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: On behaviour time over (timeout)

ON\_TIME\_OVER
Time limit to stop waiting for motion after timeout of ON_BEHAVIOUR or  
OFF\_ON\_BEHAVIOUR (0-209) to prevent staying ON forever when there is  
no motion.

0 = No additional waiting for motion.

1 - 209 =  1..100 – 1 second (1) to 100 seconds (100) in 1-second resolution  
                  101..200 – 1 minute (101) to 100 minutes (200) in 1-minute resolution  
                  201..209 – 1 hour (201) to 9 hours (209) in 1-hour resolution

210 - 254 = Reserved

255 = Never stop waiting for motion.
Values in the range 0 to 209 may be set.

The manufacturer defined default value is ```204```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: Sequence On-Off behaviour (timeout)

ON\_OFF\_ BEHAVIOUR
Behaviour after a rapid sequence of BASIC ON and BASIC OFF commands.  
The intention is to use a much longer timeout value than the time after a  
single ON command which should then be followed by a short timeout value.  
The behaviour is the same as for parameter 10 (OFF\_LOCAL\_DISABLE)  
except: 255 – device ignores ON - OFF sequence and uses OFF behaviour.
Values in the range 0 to 209 may be set.

The manufacturer defined default value is ```204```.

This parameter has the configuration ID ```config_13_2``` and is of type ```INTEGER```.


### Parameter 14: Sequence Off-On behaviour (timeout)

OFF\_ON\_ BEHAVIOUR
Behaviour after a rapid sequence of BASIC OFF and BASIC ON commands.  
The intention is to use a much longer timeout value than the time after a sin-  
gle OFF command which should then be followed by a short timeout value.  
The behaviour is the same as for parameter 11 (ON\_LOCAL\_DISABLE)  
except: 255 – device ignores OFF - ON sequence and uses ON behaviour.
Values in the range 0 to 209 may be set.

The manufacturer defined default value is ```204```.

This parameter has the configuration ID ```config_14_2``` and is of type ```INTEGER```.


### Parameter 15: Sequence timing

SEQUENCE_TIME
Time in [100 milliseconds] of maximum delay between BASIC ON and BASIC  
OFF (and vice versa) to consider this as a sequence. It is typically 1 second,  
but can be exceptionally longer due to retransmissions and overload – in this  
case, a longer interval can be allowed (up to 5 seconds).
Values in the range 10 to 50 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 16: Motion Off behaviour (timeout)

MOTION_ DISABLE
Motion disable timeout after BASIC SET to motion endpoint when the inter-  
nal motion sensor is not used for evaluating the behaviour of the lamp (SLAMP)  
relay (SPIR) and groups 2 and 3. Events are, however, still transmitted to the  
Lifeline, and the device can be controlled via remote motion sensors.

0 = BASIC SET to motion sensor endpoint ignored, BASIC to root is  
mapped to relay endpoint, (SPIR) motion sensor still enabled

  
1 - 209 = Internal motion sensor is disabled for specified timeout after BASIC  
SET 0x00 to motion endpoint.  
Timeout:  
1..100 – 1 second (1) to 100 seconds (100) in 1-second resolution  
101..200 – 1 minute (101) to 100 minutes (200) in 1-minute resolution  
201..209 – 1 hour (201) to 9 hours (209) in 1-hour resolution

210 - 254 = Reserved

255 = BASIC SET to motion endpoint ignored, motion sensor still disabled.
Values in the range 2 to 209 may be set.

The manufacturer defined default value is ```0```.

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

The RS LED D2 Z-Wave supports 5 association groups.

### Group 0: Root

Root

Association group 0 supports 1 node.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline
Lifeline messages

 - Device Reset Locally (immediately)  
 - Notifications:  
    0x09 (System) – Hardware failure with manufacturer proprietary code (0x03)  
    0x09 (System) – Software failure with manufacturer proprietary code (0x04)  
    0x07 (Home security) – Motion Begin event (0x08)  
    0x07 (Home security) – Motion End event (0x00, 0x08)  
- Binary Switch Report (SPIR)  
- Binary Switch Report (SBIN)  
- Multilevel Switch Report (SMUL)  
- Multilevel Sensor Report – value of internal ambient light sensor  
- Central scene notification (STOGGLE)

Motion Begin and Motion End events are sent along with frames to group 3.

If multichannel association is created the events are sent from motion sensor endpoint.

Switch Report is sent immediately upon a change of status along with frames to group 2.

If multichannel association is created the events are sent from lamp/relay endpoint.

Multilevel Sensor Report is sent a maximum of once per 1 minute (if the value has changed by at least 3%) and a minimum of once per 15 minutes (if the value has not changed).

If the ambient light value is old (cannot be measured because of permanent light), the value is not transmitted via lifeline.

Multilevel Sensor Report can also be added to some other events to send in bulk.

If multichannel association is created the events are sent from light sensor endpoint.

Central scene notification is sent as reaction to user interaction.

If multichannel association is created the events are sent from toggle button endpoint.

All notifications to lifeline are sent as sensor states regardless of sensor settings and states as SLAVE\_MODE, LOCAL\_DISABLED and MOTION_ENABLE.

Association group 1 supports 1 node.

### Group 2: Control: Key01

On/Off control (Never ever add controller, only third-party devices!)
Group 2 is used for directly controlling Z-Wave devices via BASIC SET commands through the evaluation of movement and light, as with internal use (so that all of these devices work together).

This is intended for use especially with third-party devices that do not implement reactions for motion events.

BASIC_SET and similar Z-Wave commands are not retransmitted intentionally to slaves and must be sent to slave devices via the controlling device simultaneously.

Only for use in master-slave system, multi-device control is not possible.

Association group 2 supports 16 nodes.

### Group 3: Motion Begin/End (PIR/radar/iHF)

Notification: Motion
Group 3 sends MOTION\_BEGIN and MOTION\_END frames.

  MOTION_BEGIN frame = Notification 0x07 (Home security) – Motion detection without location (0x08)  
  MOTION_END frame = Notification 0x07 (Home security) – Event inactive (0x00, parameter 0x08)

After the first motion detection, MOTION_BEGIN is sent.

If continual movement is detected, MOTION_BEGIN is sent every 1 minute repeatedly.

When motion ends, MOTION_END is sent 5 seconds after the last motion detection.

Notification to group 3 is sent only when NIGHT\_MODE = ON and MOTION\_ENABLE = ON, regardless of LOCAL_DISABLE state.

All devices in a group should have the same TIME settings in order that they switch off at the same time.

If multichannel association is created the events are sent from motion sensor endpoint.

Group 2 is evaluated and frames are transmitted there also in SLAVE\_MODE, regardless of LOCAL\_DISABLED state and when MOTION_ENABLE is off (not using internal motion sensor, just reacting to remote motion events in this case).

If multichannel association is created the events are sent from motion sensor endpoint.

Association group 3 supports 16 nodes.

### Group 4: Ambient light

Sensor: Luminescence
Ambient Light via Group 4 is intended to substitute locally measured LUX  
values in target devices – so that the network can have one source of ambient light value.

Frames are sent a maximum of once per 2.5 minutes and a minimum of once per 15 minutes.

When device already uses remote Ambient Light value, then this value is also retransmitted to group 4.

All devices in such a group should have the same LIGHT (threshold) settings in order that night mode is detected at the same time.

Association group 4 supports 15 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| |
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
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
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
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ALARM_V4| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V4| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |

### Documentation Links

* [STEINEL RS LED D2 Z-Wave - operation manual](https://www.cd-jackson.com/zwave_device_uploads/759/bedien-110043511.pdf)
* [STEINEL RS LED D2 Z-Wave, Z-Wave Interface v 1.0.0](https://www.cd-jackson.com/zwave_device_uploads/759/bdal2-110043511.pdf)
* [STEINEL RS LED D2 Z-Wave - Data Sheet](https://www.cd-jackson.com/zwave_device_uploads/759/Steinel-RS-LED-D2-Z-Wave---DataSheet.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/759).
