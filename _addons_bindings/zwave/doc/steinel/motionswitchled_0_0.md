---
layout: documentation
title: MotionSwitch LED - ZWave
---

{% include base.html %}

# MotionSwitch LED Infrared motion detector with orientation light
This describes the Z-Wave device *MotionSwitch LED*, manufactured by *Steinel* with the thing type UID of ```steinel_motionswitchled_00_000```.

The device is in the category of *Light Bulb*, defining Devices that illuminate something, such as bulbs, etc..

![MotionSwitch LED product image](https://www.cd-jackson.com/zwave_device_uploads/1060/1060_default.png)


The MotionSwitch LED supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Infrared motion detector with orientation light and Z-Wave interface for indoor power sockets.

The ininfrared sensor can be used for switching light ON and OFF automatically. The unit is not suitable for burglar alarm systems as it is not tamperproof in the manner prescribed for such systems. The orientation light can be switched ON and OFF via the sensor or the button on the MotionSwitch LED. The relevant setting can be programmed.

### Inclusion Information

To start the motion detector's inclusion mode, press the button three times in rapid succession. During inclusion mode and following configuration process device is blinking.

### Exclusion Information

To start the motion detector's exclusion mode, press the button three times in rapid succession. During exclusion mode and following configuration process device is blinking.

Following exclusion, all configuration parameters (time, sensitivity etc.) remain intact until the next inclusion.

## Channels

The following table summarises the channels available for the MotionSwitch LED -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Sensor (luminance) | sensor_luminance | sensor_luminance |  | Number | 
| Scene Number | scene_number | scene_number |  | Number | 
| Duration of light after motion detection [s] | config_decimal | config_decimal |  | Number | 
| Light threshold [lx] | config_decimal | config_decimal |  | Number | 
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 
| Alarm (burglar) 1 | alarm_burglar1 | alarm_burglar | Door | Switch | 
| Sensor (luminance) 2 | sensor_luminance2 | sensor_luminance |  | Number | 
| Switch 3 | switch_binary3 | switch_binary | Switch | Switch | 
| Scene Number 4 | scene_number4 | scene_number |  | Number | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Sensor (luminance)
Indicates the current light reading.

The ```sensor_luminance``` channel is of type ```sensor_luminance``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

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

### Duration of light after motion detection [s]
Generic class for configuration parameter.

The ```config_decimal``` channel is of type ```config_decimal``` and supports the ```Number``` item.

### Light threshold [lx]
Generic class for configuration parameter.

The ```config_decimal``` channel is of type ```config_decimal``` and supports the ```Number``` item.

### Alarm (burglar)
Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel is of type ```alarm_burglar``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (burglar) 1
Indicates if the burglar alarm is triggered.

The ```alarm_burglar1``` channel is of type ```alarm_burglar``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Sensor (luminance) 2
Indicates the current light reading.

The ```sensor_luminance2``` channel is of type ```sensor_luminance``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Switch 3
Switch the power on and off.

The ```switch_binary3``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number 4
Triggers when a scene button is pressed.

The ```scene_number4``` channel is of type ```scene_number``` and supports the ```Number``` item.
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



## Device Configuration

The following table provides a summary of the 16 configuration parameters available in the MotionSwitch LED.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | TIME | Duration of light after motion detection [s] |
| 2 | LIGHT | Light threshold [lx] |
| 5 | SENSITIVITY | Motion Radar Sensitivity [%] |
| 6 | Brightness measuring interval  | Brightness measuring interval [min] |
| 8 | GLOBAL_LIGHT | Use external Ambient Light Value |
| 9 | SLAVE_MODE | Disable local control |
| 10 | OFF_BEHAVIOUR | Off behaviour ( timeout ) |
| 11 | ON_BEHAVIOUR | On behaviour ( timeout ) |
| 12 | ON_TIME_OVER | On behaviour time over ( timeout ) |
| 13 | ON_OFF_BEHAVIOUR | Sequence On-Off behaviour ( timeout ) |
| 14 | OFF_ON_BEHAVIOUR | Sequence Off-On behaviour ( timeout ) |
| 15 | SEQUENCE_TIME | Sequence Off-On behaviour ( timeout ) |
| 16 | MOTION_DISABLE | Motion Off behaviour ( timeout ) |
| 17 | BUTTON_BEHAVIOUR | Toggle button behaviour |
| 18 | BUTTON_SCENES | Toggle button Scene 1-4 |
| 19 | LEGACY_INACTIVITY_TIME ) | Toggle button inactivity time in "legacy" mode ( timeout ) |

### Parameter 1: TIME

Duration of light after motion detection [s]

The following option values may be configured, in addition to values in the range 5 to 900 -:

| Value  | Description |
|--------|-------------|
| 0 | Duration of light after motion detection [s] |

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: LIGHT

Light threshold [lx]
Light threshold: 2 - 2000, 0 lx

0 - run Learn ambient light sequence. 2000 - is used as daylight ( always night mode ).
The following option values may be configured, in addition to values in the range 0 to 2000 -:

| Value  | Description |
|--------|-------------|
| 0 | Light threshold [lx] |

The manufacturer defined default value is ```2000```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 5: SENSITIVITY

Motion Radar Sensitivity [%]

Values in the range 2 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Brightness measuring interval 

Brightness measuring interval [min]
Interval for measuring ambient light when lamp is on ( lamp switches off briefly and measures ): 5 - 120 min. 0 = function is off.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 8: GLOBAL_LIGHT

Use external Ambient Light Value
When GLOBAL_LIGHT mode is ON - device overrides its own light sensor values and uses Light report values from any Z-Wave light sensor instead - this has to be configured appropriately to send light automatically. If the last remote light level value is older than 30 minutes, the internal light value is used again until the next external value is received.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: SLAVE_MODE

Disable local control
Bit Field:

<table>
  <tr>
    <td>
      Bit
    </td>
    
    <td>
      7
    </td>
    
    <td>
      6
    </td>
    
    <td>
      5
    </td>
    
    <td>
      4
    </td>
    
    <td>
      3
    </td>
    
    <td>
      2
    </td>
    
    <td>
      1
    </td>
    
    <td>
    </td>
  </tr>
  
  <tr>
    <td>
      Function
    </td>
    
    <td>
      -
    </td>
    
    <td>
      -
    </td>
    
    <td>
      -
    </td>
    
    <td>
      -
    </td>
    
    <td>
      -
    </td>
    
    <td>
      "Stupid" mode
    </td>
    
    <td>
      Central unit<br />checking in<br />slave mode
    </td>
    
    <td>
      Slave mode
    </td>
  </tr>
</table>

  
**"Stupid" mode ( bit 2 = 1 ):**  
- has higher priority then slave mode.  
- LED is permanently on ( for simple power wall switch controlling ).

  
**Slave mode ( bit 0 = 1 ):**  
- only if included in Z-Wave network  
- useful for controlling via third-party sensor  
- LED is directly controlled via Z-Wave, internal sensors are not used for controlling it

  
**Central unit checking ( bit 1 = 1 ):** ( useful especially for controlling via gateway )  
When slave bit is 0:  
- device signalises fail of lifeline connection ( if this bit is zero, fail of lifeline connection  
is not signalised )  
When slave bit is 1:  
- device checks presence of Z-Wave device in lifeline group ( gateway ). If it is not  
present for 2 minutes ( testing repeatedly every 30 seconds ) device switches  
to normal mode in the same way as after the end of local disabled mode  
( ON_BEHAVIOUR )  
- the device checks every 1 minute for recovery of Lifeline connection.  
- if no lifeline specified - it works in normal mode

  
**Be careful with this option**, device stops using its own motion sensor in Slave  
and Stupid mode.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: OFF_BEHAVIOUR

Off behaviour ( timeout )
Behaviour after BASIC OFF ( and similar commands ).  
If a transition ( even with zero change ) with a non-default duration is to be processed,  
the transition cannot be interrupted by any motion event in any case.

0 LED is switched off and remains so until any new motion event ( local or remote ) is received.  
1 - 209 LED is switched off and remains so until after a specified timeout once a new motion event ( local or remote ) is received.  
Timeout:  
1..100 - 1 second ( 1 ) to 100 seconds ( 100 ) in 1-second resolution  
101..200 - 1 minute ( 101 ) to 100 minutes ( 200 ) 1-minute resolution  
201..209 - 1 hour ( 201 ) to 9 hours ( 209 ) in 1-hour resolution  
210 - 254 Reserved  
255 LED is switched off for TIME ( cfg 1 ). It does not wait for a motion event and works normally via current motion evaluation.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 209 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: ON_BEHAVIOUR

On behaviour ( timeout )
Behaviour after BASIC ON ( and similar commands ).  
If a transition ( even with zero change ) with a non-default duration is to be processed, the transition cannot be interrupted by any motion event in any case.

0 LED is switched on and remains so until any new motion event ( local or remote ) is received. It then works normally via current motion evaluation.  
Notice - during the day, this mode cannot be ended remotely due to motion events not being transmitted - only via local motion sensor if enabled.  
1 - 209 LED is switched off and remains so until after a specified timeout  
once a new motion event ( local or remote ) is received.  
Timeout:  
1..100 - 1 second ( 1 ) to 100 seconds ( 100 ) in 1-second resolution  
101..200 - 1 minute ( 101 ) to 100 minutes ( 200 ) 1-minute resolution  
201..209 - 1 hour ( 201 ) to 9 hours ( 209 ) in 1-hour resolution  
Notice - during the day, this mode cannot be ended remotely due to motion  
events not being transmitted - only via local motion sensor if enabled.  
210 - 254 Reserved  
255 LED is switched off for TIME ( cfg 1 ). It does not wait for a motion  
event and works normally via current motion evaluation.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: ON_TIME_OVER

On behaviour time over ( timeout )
Time limit to stop waiting for motion after timeout of ON\_BEHAVIOUR or OFF\_ON_BEHAVIOUR ( 0-209 ) to prevent staying ON forever when there is no motion.

0 No additional waiting for motion.  
1..100 - 1 second ( 1 ) to 100 seconds ( 100 ) in 1-second resolution  
101..200 - 1 minute ( 101 ) to 100 minutes ( 200 ) in 1-minute resolution  
201..209 - 1 hour ( 201 ) to 9 hours ( 209 ) in 1-hour resolution  
210 - 254 Reserved  
255 Never stop waiting for motion.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 209 may be set.

The manufacturer defined default value is ```204```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: ON_OFF_BEHAVIOUR

Sequence On-Off behaviour ( timeout )
Behaviour after a rapid sequence of BASIC ON and BASIC OFF commands.  
The intention is to use a much longer timeout value than the time after a single ON command which should then be followed by a short timeout value.  
The behaviour is the same as for parameter 10 ( OFF\_LOCAL\_DISABLE ) except: 255 - device ignores ON - OFF sequence and uses OFF behaviourThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 209 may be set.

The manufacturer defined default value is ```204```.

This parameter has the configuration ID ```config_13_2``` and is of type ```INTEGER```.


### Parameter 14: OFF_ON_BEHAVIOUR

Sequence Off-On behaviour ( timeout )
Behaviour after a rapid sequence of BASIC OFF and BASIC ON commands.  
The intention is to use a much longer timeout value than the time after a single OFF command which should then be followed by a short timeout value.  
The behaviour is the same as for parameter 11 ( ON\_LOCAL\_DISABLE ) except: 255 - device ignores OFF - ON sequence and uses ON behaviour.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 209 may be set.

The manufacturer defined default value is ```204```.

This parameter has the configuration ID ```config_14_2``` and is of type ```INTEGER```.


### Parameter 15: SEQUENCE_TIME

Sequence Off-On behaviour ( timeout )
Time in [100 milliseconds] of maximum delay between BASIC ON and BASIC OFF ( and vice versa ) to consider this as a sequence. It is typically 1 second, but can be exceptionally longer due to retransmissions and overload - in this case, a longer interval can be allowed ( up to 5 seconds ).This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 10 to 50 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 16: MOTION_DISABLE

Motion Off behaviour ( timeout )
Motion disable timeout after BASIC SET to motion endpoint when the internal motion sensor is not used for evaluating the behaviour of the LED and groups 2 and 3. Events are, however, still transmitted to the Lifeline, and the device can be controlled via remote motion sensors.

  
0 BASIC SET to Motion sensor endpoint ignored, BASIC to root is mapped to LED endpoint, motion sensor still enabled  
1 - 209 Internal motion sensor is disabled for specified timeout after BASIC SET 0x00 to Motion sensor endpoint. BASIC to root is mapped to Motion sensor endpoint. ( SPIR )  
Timeout:  
1..100 - 1 second ( 1 ) to 100 seconds ( 100 ) in 1-second resolution  
101..200 - 1 minute ( 101 ) to 100 minutes ( 200 ) in 1-minute resolution  
201..209 - 1 hour ( 201 ) to 9 hours ( 209 ) in 1-hour resolution  
210 - 254 Reserved  
255 BASIC SET to Motion sensor endpoint ignored, BASIC to root is mapped to LED endpoint, motion sensor still disabledThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 209 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_16_2``` and is of type ```INTEGER```.


### Parameter 17: BUTTON_BEHAVIOUR

Toggle button behaviour
Bit Field:

<table>
  <tr>
    <td>
      Bit
    </td>
    
    <td>
      7
    </td>
    
    <td>
      6
    </td>
    
    <td>
      5
    </td>
    
    <td>
      4
    </td>
    
    <td>
      3
    </td>
    
    <td>
      2
    </td>
    
    <td>
      1
    </td>
    
    <td>
    </td>
  </tr>
  
  <tr>
    <td>
      Function
    </td>
    
    <td>
      -
    </td>
    
    <td>
      -
    </td>
    
    <td>
      -
    </td>
    
    <td>
      Dim<br />disable
    </td>
    
    <td>
      Network<br />behaviour
    </td>
    
    <td>
      Standalone<br />behaviour
    </td>
    
    <td>
      Scene<br />switch
    </td>
    
    <td>
      Dim<br />increase
    </td>
  </tr>
</table>

  
**Dim increase ( bit 0 ):**  
- long press of button does dim decreasing ( 0 = default )  
- long press of button does dim increasing ( 1 )

**Scene switch ( bit 1 ):**  
- short press of button does toggle - on/off ( 0 = default )  
- short press of button does scene switch ( 1 )

**Standalone behaviour ( bit 2 ):**  
- using "legacy" sensor deactivity after button press ( 0 = default )  
- using "cfg 10-14" sensor deactivity after button press ( 1 )

**Network behaviour ( bit 3 ):**  
- using "legacy" sensor deactivity after button press ( 0 )  
- using "cfg 10-14" sensor deactivity after button press ( 1 = default )

**Dim disable ( bit 4 ):**  
- dim events ( long press ) are used ( 0 = default )  
- dim events ( long press ) are ignored ( 1 )

"legacy" sensor deactivity behaviour does this:  
- Pressing push button when LED is OFF: LED will switch on as long as there is  
movement and the delay time runs of  
- Pressing push button when LED is ON: LED will switch off as long as there is  
movement ans the delay time runs of ( invers logic ).

"cfg 10-14" sensor deactivity behaviour uses behaviour specified in parameters  
10-14 ( the same behaviour as pressing of external switch using BASIC ON/OFF  
functions )This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 31 may be set.

The manufacturer defined default value is ```8```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: BUTTON_SCENES

Toggle button Scene 1-4
Parameters 18 specifies scene numbers ( from 1 to number ) to be switched by  
toggle button. 0 menas - do not useany.
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 19: LEGACY_INACTIVITY_TIME )

Toggle button inactivity time in "legacy" mode ( timeout )
In "legacy" button mode function this timeout is used to cancel motion sensor inactivity mode after motion end ( both for on and off state of LED ).

Timeout:  
1..100 - 1 second ( 1 ) to 100 seconds ( 100 ) in 1-second resolution  
101..200 - 1 minute ( 101 ) to 100 minutes ( 200 ) in 1-minute resolution  
201..209 - 1 hour ( 201 ) to 9 hours ( 209 ) in 1-hour resolution
Values in the range 1 to 209 may be set.

The manufacturer defined default value is ```103```.

This parameter has the configuration ID ```config_19_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The MotionSwitch LED supports 8 association groups.

### Group 0: ROOT DEVICE

Root

Association group 0 supports 1 node.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline
Lifeline messages  
- Device Reset Locally  
- Notifications:  
0x07 ( Home security ) - Motion Begin event ( 0x08 )  
0x07 ( Home security ) - Motion End event ( 0x00, 0x08 )  
- Binary Switch Report - LED state  
- Multilevel Sensor Report - value of internal ambient light sensor  
- Central scene notification - button events

Motion Begin and Motion End events are sent along with frames to group 3. If multichannel  
association is created the events are sent from motion sensor endpoint.  
Switch Report is sent immediately upon a change of status along with frames  
to group 2. If multichannel association is created the events are sent from LED  
endpoint.  
All notifications to lifeline are sent as sensor states regardless of sensor settings  
and states as SLAVE\_MODE, LOCAL\_DISABLED and MOTION_ENABLE.  
Multilevel Sensor Report is sent a maximum of once per 1 minute ( if the value has  
changed by at least 3% ) and a minimum of once per 15 minutes ( if the value has  
not changed ). If the ambient light value is old ( cannot be measured because of  
permanent light ), the value is not transmitted via lifeline. Multilevel Sensor Report  
can also be added to some other events to send in bulk. If multichannel association  
is created the events are sent from light sensor endpoint.  
Central scene notification is send as reaction to user interaction. If multichannel  
association is created the events are send from toogle button endpoint.

Association group 1 supports 1 node.

### Group 2: On/Off control

On/Off control
Group 2 is used for directly controlling Z-Wave devices via BASIC SET commands  
through the evaluation of movement and light, as with internal use ( so that all of  
these devices work together ). This is intended for use especially with third-party  
devices that do not implement reactions for motion events. BASIC_SET and  
similar Z-Wave commands are not retransmitted intentionally to slaves and must  
be sent to slave devices via the controlling device simultaneously. Only for use in  
master-slave system, multi-device control is not possible.  
Group 2 is evaluated and frames are transmitted there also in SLAVE_MODE, regardless  
of LOCAL\_DISABLED state and when MOTION\_ENABLE is off ( not using  
internal motion sensor, just reacting to remote motion events in this case ).  
If multichannel association is created the events are send from motion sensor  
endpoint.

Association group 2 supports 16 nodes.

### Group 3: Notification Report

Notification Report
Group 3 sends MOTION\_BEGIN and MOTION\_END frames.  
MOTION_BEGIN frame = Notification 0x07 ( Home security ) - Motion detection without location ( 0x08 )  
MOTION_END frame = Notification 0x07 ( Home security ) - Event inactive ( 0x00, parameter 0x08 )  
After the first motion detection, MOTION\_BEGIN is sent. If continual movement is detected, MOTION\_BEGIN is sent every 1 minute repeatedly. When motion ends, MOTION_END is sent 5 seconds after the last motion detection.  
Notification to group 3 is sent only when NIGHT\_MODE = ON and MOTION\_ENABLE = ON, regardless of LOCAL_DISABLE state.  
All devices in a group should have the same TIME settings in order that they switch  
off at the same time.  
If multichannel association is created the events are send from motion sensor  
endpoint.

Association group 3 supports 16 nodes.

### Group 4: Ambient light

Ambient light
Ambient Light via Group 4 is intended to substitute locally measured LUX values in target devices - so that the network can have one source of ambient light value.  
Frames are sent a maximum of once per 2.5 minutes and a minimum of once per 15 minutes.  
When device already uses remote Ambient light value, then this value is also retransmitted to group 4.  
All devices in such a group should have the same LIGHT ( threshold ) settings in order that night mode is detected at the same time.  
If multichannel association is created the events are send from light sensor endpoint.

Association group 4 supports 6 nodes.

### Group 5: Button on/off

Button on/off
Group 5 is used for directly controlling Z-Wave devices via BASIC SET commands by button. This function is allowed by default in cfg 17 ( BUTTON_BEHAVIOUR ).  
If multichannel association is created the events are sent from toggle button endpoint.

Association group 5 supports 16 nodes.

### Group 6: Button scene

Button scene
Group 6 is used for scene activation - switches from scene 1 to scene specified in cfg 18 ( BUTTON\_SCENES ) - increased by 1 - this function must be allowed in cfg 17 ( BUTTON\_BEHAVIOUR ). If multichannel association is created the events are sent from toggle button endpoint.

Association group 6 supports 16 nodes.

### Group 7: Button dim

Button dim
Group 7 is used for dimming ( use just for multilevel lamps ). This function is allowed by default in cfg 17 ( BUTTON_BEHAVIOUR ).  
If multichannel association is created the events are sent from toggle button endpoint.

Association group 7 supports 16 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V4| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V4| |
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
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ALARM_V4| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V4| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| Linked to BASIC|
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Motion_Switch_LED-180718.pdf](https://www.cd-jackson.com/zwave_device_uploads/1060/Motion-Switch-LED-180718.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1060).
