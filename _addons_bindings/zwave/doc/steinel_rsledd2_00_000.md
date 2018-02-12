---
layout: documentation
title: RS LED D2 Z-Wave - ZWave
---

{% include base.html %}

# RS LED D2 Z-Wave Indoor LED-light with motion sensor

This describes the Z-Wave device *RS LED D2 Z-Wave*, manufactured by *Steinel* with the thing type UID of ```steinel_rsledd2_00_000```. 

Indoor LED-light with motion sensor  


## Overview 

The sensor-switched indoor light contains an active motion detector.  
The integrated HF sensor emits high-frequency electromagnetic waves (5.8 GHz) and receives their echo.  
The change in echo caused by the slightest movement within the detection zone of the light is detected by the sensor.  
A microprocessor then issues the switch command "switch light ON".  
Detection is possible through doors, panes of glass or thin walls.  
This device can be integrated into the Smart Friends  system or any other Z-Wave network.  
Z-Wave is a wireless standard for interconnecting Z-Wave devices.  
The sensor parameters of the RS LED D2 indoor light can be used for wireless-based building automation.  
Besides certified Z-Wave controllers, it is recommended  to use the Smart Friends box.  
This smart-home control centre can be used for interconnecting Z-Wave products from STEINEL and the Smart Friends products from ABUS, Paulmann and Schellenberg.

The sensor-switched light can be put into service after mounting the enclosure and connecting to the mains power supply.  
The light will also work without being integrated into a Z-Wave network.  
In this case, the time setting is permanently set to 3 minutes.  
When putting the light into operation, the light will switch OFF after the 10-second calibration phase and is then activated for sensor mode.  
This light can now be integrated into the Z-Wave network.  
The settings can be made via the control dials or via Z-Wave network.  
The settings last selected will always be in effect regardless of whether they were made via the control dials or via Z-Wave network.

This product can be operated in any Z-Wave network with other Z-Wave certified devices from other manufacturers.  
All non-battery operated nodes within the network will act as repeaters regardless of vendor to increase reliability of the network.

  


### Inclusion Information 

These instructions for including and excluding Steinel Z-Wave products have been written for the Smart Friends system.  
They may not always apply to other Z-Wave products.  
You will find further details in the description of your Z-Wave controller.

**To start the light's inclusion or exclusion mode, briefly press button SET.**

Following exclusion, all configuration parameters (time, sensitivity etc.) remain intact until next inclusion and the light now works in standalone mode – as a result, Z-Wave can also be used for the light's standalone setting.  
  
SET = Z-Wave button: Button for inclusion and exclusion as well as for returning the device  to the factory setting.

  


### Exclusion Information 

**To start the light's inclusion or exclusion mode, briefly press button SET.**


## Channels
The following table summarises the channels available for the RS LED D2 Z-Wave Indoor LED-light with motion sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Scene Number | scene_number | scene_number |  | Number |
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (luminance) | sensor_luminance | sensor_luminance | Temperature | Number |
| Alarm (system) | alarm_system | alarm_system |  | Switch |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch |
| Scene Number 1 | scene_number1 | scene_number |  | Number |
| Alarm (burglar) 2 | alarm_burglar2 | alarm_burglar | Door | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the RS LED D2 Z-Wave Indoor LED-light with motion sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Time [s] | Duration of light after motion detection. |
| 2: Light threshold [lx] | LIGHT |
| 5: Motion Radar Sensitivity [%] | SENSITIVITY |
| 6: Brightness measuring interval [min] | (only SLAMP) |
| 8: Use external Ambient Light value | GLOBAL\_LIGHT |
| 9: Disable local control | SLAVE\_MODE |
| 10: Off behaviour (timeout) | OFF\_BEHAVIOUR |
| 11: On behaviour (timeout) | ON\_BEHAVIOUR |
| 12: On behaviour time over (timeout) | ON\_TIME\_OVER |
| 13: Sequence On-Off behaviour (timeout) | ON\_OFF\_ BEHAVIOUR |
| 14: Sequence Off-On behaviour (timeout) | OFF\_ON\_ BEHAVIOUR |
| 15: Sequence timing | SEQUENCE\_TIME |
| 16: Motion Off behaviour (timeout) | MOTION\_ DISABLE |
| 0: Root | Root |
| 1: Lifeline | Lifeline |
| 2: Control: Key01 | On/Off control (Never ever add controller, only third-party devices!) |
| 3: Motion Begin/End (PIR/radar/iHF) | Notification: Motion |
| 4: Ambient light | Sensor: Luminescence |


#### 1: Time [s]

Duration of light after motion detection.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 5 to 900 |
| Default Value | 180 |


#### 2: Light threshold [lx]

LIGHT  


##### Overview 

0      – run Learn ambient light sequence.  
2000 – is used as daylight (always night mode).

Value can be controlled via potentiometer (if present on device) – potentiometer value is then used as the default value and any potentiometer movement rewrites the current setting


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 2 to 2000 |
| Default Value | 2000 |


#### 5: Motion Radar Sensitivity [%]

SENSITIVITY  


##### Overview 

Value can be controlled via potentiometer (if present on device) – potentiometer value is then used as the default value and any potentiometer movement rewrites the current setting.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 2 to 100 |
| Default Value | 100 |


#### 6: Brightness measuring interval [min]

(only SLAMP)  


##### Overview 

Interval for measuring ambient light when lamp is on (lamp switches off briefly and measures). 0 = function is off.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 5 to 120 |
| Default Value | 0 |


#### 8: Use external Ambient Light value

GLOBAL\_LIGHT  


##### Overview 

When GLOBAL\_LIGHT mode is ON – device overrides its own light sensor values and uses Light Report values from any Z-Wave light sensor instead – this has to be configured appropriately to send light automatically.

If the last remote light level value is older than 30 minutes, the internal light value is used again until the next external value is received.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 1 |


#### 9: Disable local control

SLAVE\_MODE  


##### Overview 

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
    local disabled mode (ON\_BEHAVIOUR)  
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


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER |
| Range | 0 to 4 |
| Default Value | 2 |


#### 10: Off behaviour (timeout)

OFF\_BEHAVIOUR  


##### Overview 

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


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_2 |
| Data Type        | INTEGER || Default Value | 10 |
| Options | Lamp/relay is switched off for TIME (cfg 1) (255) |


#### 11: On behaviour (timeout)

ON\_BEHAVIOUR  


##### Overview 

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


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER |
| Range | 2 to 209 |
| Default Value | 255 |


#### 12: On behaviour time over (timeout)

ON\_TIME\_OVER  


##### Overview 

Time limit to stop waiting for motion after timeout of ON\_BEHAVIOUR or  
OFF\_ON\_BEHAVIOUR (0-209) to prevent staying ON forever when there is  
no motion.

0 = No additional waiting for motion.

1 - 209 =  1..100 – 1 second (1) to 100 seconds (100) in 1-second resolution  
                  101..200 – 1 minute (101) to 100 minutes (200) in 1-minute resolution  
                  201..209 – 1 hour (201) to 9 hours (209) in 1-hour resolution

210 - 254 = Reserved

255 = Never stop waiting for motion.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 209 |
| Default Value | 204 |


#### 13: Sequence On-Off behaviour (timeout)

ON\_OFF\_ BEHAVIOUR  


##### Overview 

Behaviour after a rapid sequence of BASIC ON and BASIC OFF commands.  
The intention is to use a much longer timeout value than the time after a  
single ON command which should then be followed by a short timeout value.  
The behaviour is the same as for parameter 10 (OFF\_LOCAL\_DISABLE)  
except: 255 – device ignores ON - OFF sequence and uses OFF behaviour.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_2 |
| Data Type        | INTEGER |
| Range | 0 to 209 |
| Default Value | 204 |


#### 14: Sequence Off-On behaviour (timeout)

OFF\_ON\_ BEHAVIOUR  


##### Overview 

Behaviour after a rapid sequence of BASIC OFF and BASIC ON commands.  
The intention is to use a much longer timeout value than the time after a sin-  
gle OFF command which should then be followed by a short timeout value.  
The behaviour is the same as for parameter 11 (ON\_LOCAL\_DISABLE)  
except: 255 – device ignores OFF - ON sequence and uses ON behaviour.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_2 |
| Data Type        | INTEGER |
| Range | 0 to 209 |
| Default Value | 204 |


#### 15: Sequence timing

SEQUENCE\_TIME  


##### Overview 

Time in \[100 milliseconds\] of maximum delay between BASIC ON and BASIC  
OFF (and vice versa) to consider this as a sequence. It is typically 1 second,  
but can be exceptionally longer due to retransmissions and overload – in this  
case, a longer interval can be allowed (up to 5 seconds).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER |
| Range | 10 to 50 |
| Default Value | 10 |


#### 16: Motion Off behaviour (timeout)

MOTION\_ DISABLE  


##### Overview 

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


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_16_2 |
| Data Type        | INTEGER |
| Range | 2 to 209 |
| Default Value | 0 |


#### 0: Root

Root


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_0 |
| Data Type        | TEXT |
| Range |  to  |


#### 1: Lifeline

Lifeline  


##### Overview 

Lifeline messages

 - Device Reset Locally (immediately)  
 - Notifications:  
    0x09 (System) – Hardware failure with manufacturer proprietary code (0x03)  
    0x09 (System) – Software failure with manufacturer proprietary code (0x04)  
    0x07 (Home security) – Motion Begin event (0x08)  
    0x07 (Home security) – Motion End event (0x00, 0x08)  
\- Binary Switch Report (SPIR)  
\- Binary Switch Report (SBIN)  
\- Multilevel Switch Report (SMUL)  
\- Multilevel Sensor Report – value of internal ambient light sensor  
\- Central scene notification (STOGGLE)

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

All notifications to lifeline are sent as sensor states regardless of sensor settings and states as SLAVE\_MODE, LOCAL\_DISABLED and MOTION\_ENABLE.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Control: Key01

On/Off control (Never ever add controller, only third-party devices!)  


##### Overview 

Group 2 is used for directly controlling Z-Wave devices via BASIC SET commands through the evaluation of movement and light, as with internal use (so that all of these devices work together).

This is intended for use especially with third-party devices that do not implement reactions for motion events.

BASIC\_SET and similar Z-Wave commands are not retransmitted intentionally to slaves and must be sent to slave devices via the controlling device simultaneously.

Only for use in master-slave system, multi-device control is not possible.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Motion Begin/End (PIR/radar/iHF)

Notification: Motion  


##### Overview 

Group 3 sends MOTION\_BEGIN and MOTION\_END frames.

  MOTION\_BEGIN frame = Notification 0x07 (Home security) – Motion detection without location (0x08)  
  MOTION\_END frame = Notification 0x07 (Home security) – Event inactive (0x00, parameter 0x08)

After the first motion detection, MOTION\_BEGIN is sent.

If continual movement is detected, MOTION\_BEGIN is sent every 1 minute repeatedly.

When motion ends, MOTION\_END is sent 5 seconds after the last motion detection.

Notification to group 3 is sent only when NIGHT\_MODE = ON and MOTION\_ENABLE = ON, regardless of LOCAL\_DISABLE state.

All devices in a group should have the same TIME settings in order that they switch off at the same time.

If multichannel association is created the events are sent from motion sensor endpoint.

Group 2 is evaluated and frames are transmitted there also in SLAVE\_MODE, regardless of LOCAL\_DISABLED state and when MOTION\_ENABLE is off (not using internal motion sensor, just reacting to remote motion events in this case).

If multichannel association is created the events are sent from motion sensor endpoint.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Ambient light

Sensor: Luminescence  


##### Overview 

Ambient Light via Group 4 is intended to substitute locally measured LUX  
values in target devices – so that the network can have one source of ambient light value.

Frames are sent a maximum of once per 2.5 minutes and a minimum of once per 15 minutes.

When device already uses remote Ambient Light value, then this value is also retransmitted to group 4.

All devices in such a group should have the same LIGHT (threshold) settings in order that night mode is detected at the same time.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/759).
