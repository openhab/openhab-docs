---
layout: documentation
title: NZW30T - ZWave
---

{% include base.html %}

# NZW30T Inovelli In-Wall Switch (On/Off) Scene Enabled

This describes the Z-Wave device *NZW30T*, manufactured by *Willis Electric Co., Ltd.* with the thing type UID of ```willis_nzw30t_00_000```. 

Inovelli In-Wall Switch (On/Off) Scene Enabled  


## Overview 

Basic On/Off switch that is "Scene Enabled." Normal usage: short press up or down turns the switch on or off respectively, but longer presses up or down activate scenes on SmartThings. In smart things, "when pushed" relates to pushing the switch up and "when held" relates to pushing the switch down.

  


### Inclusion Information 

Device will automatically enter into inclusion mode when power is first provided to the device for 30 seconds (that is, will stay in inclusion mode for 30 seconds). When power is already present, you can return the switch to inclusion mode by pressing up on the switch 6 times in rapid succession (within 2 seconds).

To include your device with the power already on, here’s what you need to do:

 *  Put your HUB/Controller into inclusion mode
 *  Press the UP button on your switch 6x rapidly (in a second or so)
 *  If your device is not included after this, try again, it took a few tries to get it for me.

  


### Exclusion Information 

To remove your device, here’s what you need to do:

 *  Put your HUB/Controller into exclusion mode
 *  Press the UP button on your switch 6x rapidly (in a second or so)
 *  Hopefully your device has been removed

  


### Wakeup Information 

N/A


## Channels
The following table summarises the channels available for the NZW30T Inovelli In-Wall Switch (On/Off) Scene Enabled.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Scene Number | scene_number | scene_number |  | Number |


### Device Configuration
The following table provides a summary of the configuration parameters available in the NZW30T Inovelli In-Wall Switch (On/Off) Scene Enabled.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 4: Invert | Change the top of the switch to OFF and the bottom of the switch to ON. |
| 5: Countdown | Countdown to shutoff |


#### 4: Invert

Change the top of the switch to OFF and the bottom of the switch to ON.  


##### Overview 

Invert|Default = Top/On, Bottom/Off

\-- Parameter = 4, size = 1 byte, value = 00, Up = On, Down = Off

\-- Parameter = 4, size = 1 byte, value = 01, Up = Off, Down = On


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Default (0) |
|  | Inverted (1) |


#### 5: Countdown

Countdown to shutoff  


##### Overview 

Sets switch to have a countdown to shutoff. A value of 0 disables the countdown entirely.

From Manual:

Countdown|Default = No Timer

\-- Parameter = 5, size = 2 bytes, value = xx xx

\-- Value = 00 (Default) = No Timer

\-- (0x00---x8000)(range = 0-32768 Seconds)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_2 |
| Data Type        | INTEGER |
| Range | 0 to 32768 |
| Default Value | 0 |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/785).
