---
layout: documentation
title: Alarm Sound - ZWave
---

{% include base.html %}

# Alarm Sound Alarm sound

This describes the Z-Wave device *Alarm Sound*, manufactured by *BeNext* with the thing type UID of ```benext_alarmsound_00_000```. 

Alarm sound


## Channels
The following table summarises the channels available for the Alarm Sound Alarm sound.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Alarm | alarm_general | alarm_general | Door | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the Alarm Sound Alarm sound.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Set to Default | Set all configuration values to default values (factory settings) |
| 2: Destination routine on/off | Test connection by sending a periodic test. if the device doesn't react the user will be n... |
| 3: Desitnation routine succes time | Time it takes to send a new frame after the last frame has succesfully send |
| 4: Destination routine failed time | Time elapsed between failing to end a frame and sending a new frame. |
| 7: Select index sound/light mode | The index of the sound mode when a switch binary/basic set frame been received |
| 8: power offline sound/light mode | The sound and light mode that will be used when the device gets unplugged. |
| 10: sound/light index 1 | Sound/light that will be played when index 1 has been selected |
| 28: sound/light index 2 | Sound/light that will be played when index 2 has been selected |
| 46: sound/light index 3 | Sound/light that will be played when index 3 has been selected |
| 64: sound/light index 4 | Sound/light that will be played when index 4 has been selected |
| 82: sound/light index 5 | Sound/light that will be played when index 5 has been selected |
| 100: sound/light index 6 | Sound/light that will be played when index 6 has been selected |
| 1: Association group 1 | Changes the LED on the device |
| 2: Association group 2 | The alarm sound reports it status to the associated devices |


#### 1: Set to Default

Set all configuration values to default values (factory settings)  


##### Overview 

If value is set to 255 reset to default settings.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 1 |


#### 2: Destination routine on/off

Test connection by sending a periodic test. if the device doesn't react the user will be notified by a sound.  


##### Overview 

0 this is turned off. 1-255 turn it on.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 3: Desitnation routine succes time

Time it takes to send a new frame after the last frame has succesfully send  


##### Overview 

t(s) = param1 \* 6 \*60


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 60 |
| Default Value | 60 |


#### 4: Destination routine failed time

Time elapsed between failing to end a frame and sending a new frame.  


##### Overview 

t(s) = param1 \*60


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 240 |
| Default Value | 240 |


#### 7: Select index sound/light mode

The index of the sound mode when a switch binary/basic set frame been received  


##### Overview 

0 to switch off, 1-6 to select light/sound mode.

If value is put higher then 5 the application will read this as 1.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 0 to 6 |
| Default Value | 1 |


#### 8: power offline sound/light mode

The sound and light mode that will be used when the device gets unplugged.  


##### Overview 

0 to switch off, 1-6 to select light/sound mode.

If value is put higher then 5 the application will read this as 1.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 0 to 6 |
| Default Value | 6 |


#### 10: sound/light index 1

Sound/light that will be played when index 1 has been selected  


##### Overview 

Params 10-27 are the values to set the sound/light (this will be set when index 1)

When the configuration is not this size the frame will be ignored.

For the configuration of the light/sound mode i would like to refer to the manual.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_18 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 28: sound/light index 2

Sound/light that will be played when index 2 has been selected  


##### Overview 

Params 28-45 are the values to set the sound/light (this will be set when index 2)

When the configuration is not this size the frame will be ignored.

For the configuration of the light/sound mode i would like to refer to the manual.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_28_18 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 46: sound/light index 3

Sound/light that will be played when index 3 has been selected  


##### Overview 

Params 45-63 are the values to set the sound/light (this will be set when index 3)

When the configuration is not this size the frame will be ignored.

For the configuration of the light/sound mode i would like to refer to the manual.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_46_18 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 64: sound/light index 4

Sound/light that will be played when index 4 has been selected  


##### Overview 

Params 64-81 are the values to set the sound/light (this will be set when index 4)

When the configuration is not this size the frame will be ignored.

For the configuration of the light/sound mode i would like to refer to the manual.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_64_18 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 82: sound/light index 5

Sound/light that will be played when index 5 has been selected  


##### Overview 

Params 82-99 are the values to set the sound/light (this will be set when index 5)

When the configuration is not this size the frame will be ignored.

For the configuration of the light/sound mode i would like to refer to the manual.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_82_18 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 100: sound/light index 6

Sound/light that will be played when index 6 has been selected  


##### Overview 

Params 100-117 are the values to set the sound/light (this will be set when index 6)

When the configuration is not this size the frame will be ignored.

For the configuration of the light/sound mode i would like to refer to the manual.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_100_18 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 1: Association group 1

Changes the LED on the device  


##### Overview 

When the device receives an binary switch/ basic report, this will update the LED


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Association group 2

The alarm sound reports it status to the associated devices  


##### Overview 

\- In case the device gets unplugged this shall send Alarm report (code 3, Triggered).

\- When the device is connected to the power, this shall send an Alarm report (code 3, off).

\- When the device is truned of by clicking on the button, this shall send a Switch binary (off).

\- When the device gets unplugged the standard "power offline" sound is on, the device will send a Switch binary report (on).

When the Device is connected to a powersupply, the device will say it has connection to the associated devices in group 2. when the connection is succesful the led will be on for 1 second. If the device cannot make a connection the led will blink 6 times. If the led doesn't go on there is no device in this association group.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/443).
