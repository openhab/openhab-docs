---
layout: documentation
title: PAD02 - ZWave
---

{% include base.html %}

# PAD02 Dimmer Socket

This describes the Z-Wave device *PAD02*, manufactured by *Philio Technology Corp* with the thing type UID of ```philio_pad02_00_000```. 

Dimmer Socket  


## Overview 

PAD02 is an E27(EU)/ E26(US) Edison screw based lamp socket, which provides electrical connection to the E14(EU)/ E12(US) Edison screw based lamps and  support it in the lighting fixture. The use of socket allows lamps to be safely and  conveniently replaced. You can On/Off the light by pressing the button briefly,  or a long pressing to control the brightness of dimmable lightbulb. This dimmer is a transceiver which is a security enabled device which based on  Z-Wave Plus technology, and it is fully compatible with any Z-WaveTM enabled  network. Since PAD02 supports Security Command Class, it can learn with  Secured controller. Its functionality and supported command classes is identical when included as a secure and non-secure device.

**LED Indication**

To distinguish what mode the switch is in, view from the LED for identification. 

Normal -  Whenever we switch On and off of the PAD02 by On/Off button or RF command, the LED will lights up when switch on; whereas LED off when switch off.

No node ID - Under normal operation, when the Switch has not been allocated a node ID, the LED flashes on and off alternately at 2-second intervals. By pressing On/Off button, it will stop flashing temporarily.

Learning - When PAD02 is in learning mode, LED flashes on and off alternately and repeatedly at 0.5 second intervals. 

  


### Inclusion Information 

In the front casing, there is an on/off button with LED indicator below which is used to switch on and off or carries out inclusion, exclusion, reset or association. When first power applied, its LED flashes on and off alternately and repeatedly at 0.5 second intervals. It implies that it has not been assigned a node ID and start auto inclusion. 

**Auto Inclusion**

The function of auto inclusion will be executed as long as the dimmer does not have Node ID and just connect the switch to main power. Note: Auto inclusion timeout is 2 minute during which the node information of explorer frame will be emitted once every several seconds. Unlike “inclusion” function as shown in the table below, the execution of auto inclusion is free from pressing the On/Off button on the dimmer. 

**Inclusion procedure**

1. Put your Z-Wave controller into inclusion mode by following the instructions provided by the controller manufacturer. 

2.  Pressing Include button of PAD02 three times within 2 seconds will enter inclusion mode. 

Note: One press one flash LED 

  


### Exclusion Information 

1. Put your Z-Wave controller into exclusion mode by following the instructions provided by the controller manufacturer. 

2. Pressing Include button of PAD02 three times within 2 seconds will enter exclusion mode. 

Note: One press one flash LED.

Result: Node ID has been excluded. 0.5s On, 0.5s Off (Enter auto inclusion).


## Channels
The following table summarises the channels available for the PAD02 Dimmer Socket.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Scene Number | scene_number | scene_number |  | Number |
| Alarm | alarm_general | alarm_general | Door | Switch |


### Dimmer

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the PAD02 Dimmer Socket.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Mode of Switch Off function | Switch button mode (enabled/disabled). |
| 2: LED indication mode | LED mode: 1 is show switch state. 2 is night mode (opposite). |
| 3: Auto off timer | Automatic OFF after given time. |
| 4: RF off command mode | How to interpret OFF command. |
| 1: Group 1 | Where to send ALARM\_REPORT and DEVICE\_RESET\_LOCALLY\_NOTIFICATION |


#### 1: Mode of Switch Off function

Switch button mode (enabled/disabled).  


##### Overview 

When the mode of switch On/Off is set to 0, any command of switch off will be disabled and the On/Off function of include button will be disabled.

The default setting is enable mode.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disabled (0) |
|  | Enabled (1) |


#### 2: LED indication mode

LED mode: 1 is show switch state. 2 is night mode (opposite).  


##### Overview 

LED indication mode :

1 Show Switch State:When switch is on, LED is on. When switch is off, LED is off. This is default setting.

2 Show Night mode:When switch is on, LED is off. When switch is off, LED is on.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Show current switch state (1) |
|  | Night mode (opposite) (2) |


#### 3: Auto off timer

Automatic OFF after given time.  


##### Overview 

Whenever DEVICE switches to on, the auto off timer begin to count down. After the timer decrease to zero, it will switch to off automatically. However if Auto off timer is set as 0, the auto off function will be disabled. The default setting is 0 (function disabled).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 0 |


#### 4: RF off command mode

How to interpret OFF command.  


##### Overview 

Whenever a switch off command, BASIC\_SET 、BINARY\_SWITCH\_SET 、SWITCH\_ALL\_OFF, is received, it could be interpreted as 4 variety of commands:

0: Switch Off:It switches to OFF state. This is default setting.

1: Ignore:The switch off command will be ignored.

2: Switch Toggle:It switches to the inverse of current state.

3: Switch On:It switches to ON state.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Switch off (0) |
|  | Ignore (1) |
|  | Toggle Switch (2) |
|  | Switch On (3) |


#### 1: Group 1

Where to send ALARM\_REPORT and DEVICE\_RESET\_LOCALLY\_NOTIFICATION  


##### Overview 

The dimmer can be set to send reports to associated Z-Wave devices. It supports one association group with one node support for Grouping 1. For group 1, the dimmer will report ALARM\_REPORT and DEVICE\_RESET\_LOCALLY\_NOTIFICATION.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/579).
