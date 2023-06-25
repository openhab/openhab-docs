---
layout: documentation
title: MWMC7 - ZWave
---

{% include base.html %}

# MWMC7 Meta Wired Motor Controller 7
This describes the Z-Wave device *MWMC7*, manufactured by *wiDom* with the thing type UID of ```widom_mwmc7_00_000```.

The device is in the category of *Battery*, defining Batteries, Energy Storages.

![MWMC7 product image](https://opensmarthouse.org/zwavedatabase/1565/image/)


The MWMC7 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

WiDom Meta Wired Motor Controller is an "in wall device", for the multilevel control of roller shutter motors. It can accurately control the opening and closing of blinds, curtains, shutters, venetian blinds as requested by the user through local commands or remotely using computers, smartphones, tablets. At the same time, it is completely configurable so that it can adapt to the most varied customers’ needs, while being ready for use without needing additional configurations in order to operate. After an initial calibration procedure, thanks to a proprietary algorithm, WiDom Smart Roller Shutter is able to identify the exact position of the roller shutter without using external sensors. During the operation, a continuous and automatic control of the limit switches allows maintaining the calibration. In the absence of a power source, the system runs a self-repositioning procedure that restores calibration. The device is equipped with contact protection technology (Zero Crossing) which reduces the electrical stress on the relay contacts and ensures a longer life. The open / closed switching of the device always occur when the instantaneous value of voltage is 0. 

  


It operates in any Z-Wave network with other Z-Wave/Z-Wave Plus certified devices and controllers from any other manufacturer. As a constantly powered node, WiDom Smart Roller Shutter will act as repeater regardless of the vendor in order to increase the reliability of the network.

### Inclusion Information

Before including the device the LED status indicator is solid RED. The procedure of inclusion is activated by clicking Add in the inclusion interface and by pressing any sequence of click on the integrated button. As soon as the inclusion procedure initiates the LED indicator starts a sequence of GREEN-BLUE blinks. 

### Exclusion Information

The procedure of exclusion can be activated by Removing a node from the Z-Wave network and any click sequence on the integrated button; as soon as the exclusion initiates, the LED indicator starts a sequence of RED-BLUE blinks. The device is excluded from the network when the LED status indicator is solid RED 

### General Usage Information



## Channels

The following table summarises the channels available for the MWMC7 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The following table provides a summary of the 12 configuration parameters available in the MWMC7.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Numbers of clicks to control the local load | Define which sequences of click control the local load |
| 2 | Favorite level for ON position | Favorite level for ON position |
| 3 | Favorite level for OFF position | Favorite level for OFF position |
| 4 | Value for Group 2 with 1 click on  UP button | Value for Group 2 with 1 click on UP button |
| 5 | Value for Group 2 with 1 click on DOWN button | Value for Group 2 with 1 click on DOWN button |
| 6 | Value for Group 3 with 2 clicks on UP button | Value for Group 3 with 2 clicks on UP button |
| 7 | Value for Group 3 with 2 clicks on DOWN button | Value for Group 3 with 2 clicks on DOWN button |
| 8 | Value for Group 4 with 3 clicks on UP button | Value for Group 4 with 3 clicks on UP button |
| 9 | Value for Group 4 with 3 clicks on DOWN button  | Value for Group 4 with 3 clicks on DOWN button |
| 20 | Calibration | Defines the status of the calibration procedure |
| 21 | Motor idle state definition | Motor idle state definition |
| 22 | Limit switch recognition | Limit switch recognition |

### Parameter 1: Numbers of clicks to control the local load

Define which sequences of click control the local load

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | ONE_CLICK |
| 2 | TWO_CLICKS |
| 3 | ONE\_CLICK and TWO\_CLICKS |

The manufacturer defined default value is ```3``` (ONE_CLICK and TWO_CLICKS).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Favorite level for ON position

Favorite level for ON position

Values in the range 50 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Favorite level for OFF position

Favorite level for OFF position

Values in the range 0 to 49 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Value for Group 2 with 1 click on  UP button

Value for Group 2 with 1 click on UP button
Value used for devices belonging to Group 2 when UP button receive 1 Click
Values in the range -1 to 99 may be set.

The manufacturer defined default value is ```-1```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Value for Group 2 with 1 click on DOWN button

Value for Group 2 with 1 click on DOWN button
Value used for devices belonging to Group 2 when DOWN button receive 1 Click 
Values in the range -1 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Value for Group 3 with 2 clicks on UP button

Value for Group 3 with 2 clicks on UP button
Value used for devices belonging to Group 3 when UP button receive 2 Clicks
Values in the range -1 to 99 may be set.

The manufacturer defined default value is ```-1```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Value for Group 3 with 2 clicks on DOWN button

Value for Group 3 with 2 clicks on DOWN button
Value used for devices belonging to Group 3 when DOWN button receive 2 Clicks
Values in the range -1 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Value for Group 4 with 3 clicks on UP button

Value for Group 4 with 3 clicks on UP button
Value used for devices belonging to Group 4 when UP button receive 3 Clicks 
Values in the range -1 to 99 may be set.

The manufacturer defined default value is ```-1```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Value for Group 4 with 3 clicks on DOWN button 

Value for Group 4 with 3 clicks on DOWN button
Value used for devices belonging to Group 4 when DOWN button receive 3 Clicks
Values in the range -1 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 20: Calibration

Defines the status of the calibration procedure
Defines the status of the calibration procedure. By default, as soon as the device has been included, the calibration starts in automatic mode. At the end of the calibration, this parameter is set to 1. Afterwards the calibration can be done again by setting this parameter to 0 (AUTO) or 2 (MANUAL) and clicking on any external button. If the calibration is set in AUTO mode, it will be completed automatically. If the calibration is set in MANUAL mode, a click on any external button is necessary to carry on the next step. During the calibration, the LED indicator blinks repeatedly in BLUE. 
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: Motor idle state definition

Motor idle state definition
Defines the level of power consumption under which the motor is considered steady (stationary) 
Values in the range 0 to 3000 may be set.

The manufacturer defined default value is ```1000```.

This parameter has the configuration ID ```config_21_2``` and is of type ```INTEGER```.


### Parameter 22: Limit switch recognition

Limit switch recognition
The motor has reached the limit switch when its power consumption is lower than PLIMIT (the power defined in parameter No. 21) for an amount of time defined by this parameter. 
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_22_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The MWMC7 supports 4 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 8 nodes.

### Group 2: 1 Click


Association group 2 supports 8 nodes.

### Group 3: 2 Clicks


Association group 3 supports 8 nodes.

### Group 4: 3 Clicks


Association group 4 supports 8 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_WINDOW_COVERING_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Manual](https://opensmarthouse.org/zwavedatabase/1565/reference/A510078_META_WiredMotorController7_EN.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1565).
