---
layout: documentation
title: ZSE50LR - ZWave
---

{% include base.html %}

# ZSE50LR Siren and Chime
This describes the Z-Wave device *ZSE50LR*, manufactured by *[Zooz](http://www.getzooz.com/)* with the thing type UID of ```zooz_zse50lr_00_000```.

The device is in the category of *Siren*, defining Siren used by Alarm systems.

![ZSE50LR product image](https://opensmarthouse.org/zwavedatabase/1672/image/)


The ZSE50LR supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

- Sound and visual Z-Wave™ alarm

- Upload custom playback files for chime and siren

- Great for DIY security and alert applications

- Just plug it into a standard receptacle

- Z-Wave™ Long Range for an ultra stable network

- Built-in battery for back-up power up to 24 hours

- 800 series Z-Wave™ and S2 SmartStart Security

### Inclusion Information

Manual inclusion: initiate inclusion (pairing) in the app or hub UI. Make sure the device is powered and finalize the inclusion at the siren: tap the + buttonon the device 3 times quickly.

### Exclusion Information

Manual inclusion: initiate inclusion (pairing) in the app or hub UI. Make sure the device is powered and finalize the inclusion at the siren: tap the + buttonon the device 3 times quickly.

### General Usage Information

If your primary controller is missing or inoperable, you may need to reset the device to factory settings.

To reset the relay, hold the + and - buttons together for at least 15 seconds. The LED will turn green a????er 3 seconds (keep holding the buttons), then start blinking red a????er 8 seconds, and it will turn solid red a????er 15 seconds to confirm successful reset. You’ll also hear a confirmation message that the device has been reset.

NOTE: All previously recorded activity and custom settings will be erased from the device’s memory.

## Channels

The following table summarises the channels available for the ZSE50LR -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Change Siren Playback Mode | config_decimal | config_decimal |  | Number | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Siren Notification | notification_siren | notification_siren |  | Switch | 
| Sound Tone Play | sound_tone_play | sound_tone_play |  | Number | 
| Sound Volume | sound_volume | sound_volume |  | Dimmer | 
| Default Sound Tone | sound_default_tone | sound_default_tone |  | Number | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Change Siren Playback Mode
Change the playback mode dynamically

Generic class for configuration parameter.

The ```config_decimal``` channel is of type ```config_decimal``` and supports the ```Number``` item.

### Alarm (power)
Device connection to mains (or not)

Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Siren Notification
Indicates the siren notification has been triggered.

The ```notification_siren``` channel is of type ```notification_siren``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

### Sound Tone Play
Plays the Tone file. 

The Sound tone that will play. The allowed tone numbers depend on the device. 
            The value 0 will stop any tone beeing played. 
            The value 255 will play the default tone.

The ```sound_tone_play``` channel is of type ```sound_tone_play``` and supports the ```Number``` item.
The following state translation is provided for this channel to the ```Number``` item type -:

| Value | Label     |
|-------|-----------|
| 0 | Stop |
| 255 | Play default tone |

### Sound Volume
Volume of Sound

The sound volume channel allows control of the loudness.

The ```sound_volume``` channel is of type ```sound_volume``` and supports the ```Dimmer``` item.

### Default Sound Tone
See list of default sound files

The sound default tone used when the device is activated.

The ```sound_default_tone``` channel is of type ```sound_default_tone``` and supports the ```Number``` item.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 16 configuration parameters available in the ZSE50LR.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Playback Mode | Set siren playback mode. |
| 2 | Playback Duration | Set playback duration for the siren. |
| 3 | Playback Loop Count | Set the number of playback loops |
| 4 | Playback Tone | Set the default tone for the siren playback. |
| 5 | Playback Volume | Set the volume for siren playback. |
| 6 | LED Indicator Mode | Set the LED indicator mode for the siren. |
| 7 | LED Indicator Color | Set the LED indicator color for the siren. |
| 8 | Low Battery Report | Low Battery Report |
| 9 | LED in Back-Up Battery Mode | Set the LED indicator for the siren in back-up battery mode. |
| 10 | Button Tone Selection | Disable tone selection from physical buttons on the siren. |
| 11 | Button Volume Selection | Disable volume adjustment from physical buttons on the siren |
| 12 | Basic Set Commands | Basic set command to group 2 |
| 13 | System Message Volume | Set the volume for siren system messages |
| 14 | LED Indicator Brightness | Choose the LED indicator's brightness level. |
| 15 | Battery Reporting Frequency | Set the reporting interval for the battery. |
| 16 | Battery Reporting Threshold | Threshold for battery reporting in % changes. |

### Parameter 1: Playback Mode

Set siren playback mode.
Siren playback mode. 0 – Play once; 1 – Play in a loop for set duration (set in parameter 2); 2 – Play in a loop for set number (set in parameter 3); 3 – Play in a loop until cancelled by user; 4 – No sound, LED indicator only.
The following option values may be configured, in addition to values in the range 0 to 4 -:

| Value  | Description |
|--------|-------------|
| 0 | Play Once |
| 1 | Play in a loop for set duration (set in parameter 2) |
| 2 | Play in a loop for set number (set in parameter 3) |
| 3 | Play in a loop until cancelled by user |
| 4 | No sound, LED indicator only |

The manufacturer defined default value is ```0``` (Play Once).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Playback Duration

Set playback duration for the siren.
Set playback duration for the siren (in seconds) when the siren is in playback mode 1 (set in parameter 1).
Values in the range 1 to 900 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Playback Loop Count

Set the number of playback loops
Set the number of playback loops for the selected tone when the siren is in playback mode 2 (parameter 1).
Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Playback Tone

Set the default tone for the siren playback.
0=Stop,1=Door-open,2=Door-closed,3=Window-open,4=Window-closed,5=Motion-detected,6=Motion-cleared,7=Leak-detected,8=Leak-cleared,9=ambulance,10=buzzer-alarm,11=cluster-chimes,12=doorbell1,13=doorbell2,14=doorbell3,15=doorbell4,16=doorbell5,17=doorbell6,18=fire-alarm,19=jingle-bells,20=microwave,21=old-doorbell,22=siren1,23=siren2,24=siren3,25=tone,255=default-Tone See documentation for the instructions on how to upload your own files.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Playback Volume

Set the volume for siren playback.
Set the volume for siren playback. Use 0 to mute, or 1–100 to adjust volume level.

Values: 0 – Mute (volume off); 1-100 (volume). Default: 100.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Muted |

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: LED Indicator Mode

Set the LED indicator mode for the siren.
Set the LED indicator mode for the siren. 0 – LED always off; 1 – LED strobe single color (set in param 7); 2 – LED strobe red and blue; 3 – LED pulse single color (set in param 7); 4 – LED solid on single color (set in param 7). Default: 1.
The following option values may be configured, in addition to values in the range 0 to 4 -:

| Value  | Description |
|--------|-------------|
| 0 | LED Always Off |
| 1 | LED strobe single color (set in param 7) |
| 2 | LED strobe red and blue |
| 3 | LED pulse single color (set in param 7) |
| 4 | LED solid on single color (set in param 7) |

The manufacturer defined default value is ```1``` (LED strobe single color (set in param 7)).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: LED Indicator Color

Set the LED indicator color for the siren.
More colors available through custom values corresponding to the color wheel. See advanced documentation for details.

Values: 0 – Red; 42 – Yellow; 85 – Green; 127 – Indigo; 170 – Blue; 212 – Purple; 255 – White. Default: 0. 
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Low Battery Report

Low Battery Report
Decide which % level should the device report low battery to the hub. Values: 10-50 %. Default: 20.
Values in the range 10 to 50 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: LED in Back-Up Battery Mode

Set the LED indicator for the siren in back-up battery mode.
Values: 0 – LED off (save battery); 1 – Regular LED mode (set in param 6); 2 – LED pulse white for full battery and red for low battery. Default: 1. 
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Button Tone Selection

Disable tone selection from physical buttons on the siren.
Disable tone selection from physical buttons on the siren. When disabled, you'll only be able to program tones using the advanced parameters in the Z-Wave UI. 

Values: 0 – Tone selection from buttons disabled; 1 – Tone selection from buttons enabled.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Button Volume Selection

Disable volume adjustment from physical buttons on the siren
Disable volume adjustment from physical buttons on the siren. When disabled, you'll only be able to adjust volume using the advanced parameters in the Z-Wave UI. 

Values: 0 – Volume adjustment from buttons disabled; 1 – Volume adjustment from buttons enabled.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Basic Set Commands

Basic set command to group 2
Decide if and when the siren sends Basic Set commands to devices associated in Group 2.
The following option values may be configured, in addition to values in the range 0 to 6 -:

| Value  | Description |
|--------|-------------|
| 0 | No Basic set commands sent |
| 1 | Basic Set ON sent when playback starts, Off when playback stops |
| 2 | Basic Set OFF sent when playback starts, On when playback stops |
| 3 | Basic Set ON sent when playback starts only |
| 4 | Basic Set OFF when playback stops only |
| 5 | Basic Set OFF sent when playback starts only |
| 6 | Basic Set ON when playback stops only |

The manufacturer defined default value is ```1``` (Basic Set ON sent when playback starts, Off when playback stops).

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: System Message Volume

Set the volume for siren system messages
Set the volume for siren system messages.

Values: 0 – Mute (volume off); 1-100 (volume). Default: 50.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: LED Indicator Brightness

Choose the LED indicator's brightness level.
Choose the LED indicator's brightness level.

Values: 0-10 (0 – off, 10 – high). Default: 5. 
Values in the range 0 to 10 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Battery Reporting Frequency

Set the reporting interval for the battery.
Set the reporting interval for the battery. 

Values: 1-84 hours. Default: 12.
Values in the range 1 to 84 may be set.

The manufacturer defined default value is ```12```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 16: Battery Reporting Threshold

Threshold for battery reporting in % changes.
Set the threshold for battery reporting in % changes. Set to 0 to disable reporting based on threshold.

Values: 0 – Don't send reports based on threshold changes; 1-20 %. Default: 0
Values in the range 0 to 20 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZSE50LR supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline

Association group 1 supports 5 nodes.

### Group 2: On-Off Control

On-Off Control
This device will send Sound Switch Play Report and

Notification Report to group 1 and Basic Set command to group 2

when the status changes.

You can set direct association to have the siren control another ZWave

device independently of the hub by using Group 2.

Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_SOUND_SWITCH_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Manual](https://opensmarthouse.org/zwavedatabase/1672/reference/zooz-z-wave-long-range-siren-chime-zse50-800lr-manual_1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1672).
