---
layout: documentation
title: ZMNHQD - ZWave
---

{% include base.html %}

# ZMNHQD Qubino LUXY Smart Light
This describes the Z-Wave device *ZMNHQD*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhqd_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZMNHQD product image](https://www.cd-jackson.com/zwave_device_uploads/1126/1126_default.jpg)


The ZMNHQD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Qubino LUXY Smart Light is ideal for gentle illumination of any room and for visual and sound notifications.

### Inclusion Information

Manual inclusion is triggered by the following procedure: 

  * Full white needs to be active (c-button 2). The user can select it by quickly pressing the c-button2 once.
  * When full white is enabled, press c-button3 and hold it for 5 seconds (while white is glowing, hold c-button3 for 5 seconds).
  * After 5 seconds, the device starts flashing, with the following pattern: green 1 second on, 0.5 second off.
  * Once the device receives a nodeId or after 10 seconds, it stops flashing and turns green. 

### Exclusion Information

Exclusion is triggered by the following procedure:

  * Full white needs to be active (c-button 2).
  * When full white is enabled, press c-button3 and hold it for 5 seconds (while white is glowing hold c-button3 for 5 seconds).
  * After 5 seconds, the device starts flashing with the following pattern: red 1 second on, 0.5 second off. 
  * Once the device loses its nodeId or after 10 seconds, it stops flashing and turns red. 

## Channels

The following table summarises the channels available for the ZMNHQD -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Color Control | color_color | color_color | ColorLight | Color | 
| Color Temperature | color_temperature | color_temperature | ColorLight | Dimmer | 
| Alarm (SIREN) 0 | notification_siren | notification_siren |  | Switch | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Color Control
The color channel allows to control the color of a light.
            It is also possible to dim values and switch the light on and off.

The ```color_color``` channel is of type ```color_color``` and supports the ```Color``` item and is in the ```ColorLight``` category.

### Color Temperature
The color temperature channel allows to set the color
            temperature of a light from 0 (cold) to 100 (warm).

The ```color_temperature``` channel is of type ```color_temperature``` and supports the ```Dimmer``` item and is in the ```ColorLight``` category.

### Alarm (SIREN) 0
Indicates the siren notification has been triggered.

The ```notification_siren``` channel is of type ```notification_siren``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 7 configuration parameters available in the ZMNHQD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Digital input type  | Defines the type of input device connected to digital input. |
| 3 | Turn off alarming |  |
| 5 | Motion sensor memory timer  | Time after which the output triggered by motion sensor is turned off. |
| 10 | Auto-on timer  | Defines the time after which the device is turned to last known state. |
| 11 | Auto-off timer  | Defines the time after which the device is turned to last known state. |
| 30 | Restore state on power failure  | Restore state on power failure |
| 50 | Enable/disable beeper | Enable/disable beeper |

### Parameter 1: Digital input type 

Defines the type of input device connected to digital input.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Push-button |
| 1 | On/Off toggle switch |
| 2 | Motion sensor |
| 3 | Motion sensor with memory |

The manufacturer defined default value is ```1``` (On/Off toggle switch ).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 3: Turn off alarming



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Only by Z-Wave |
| 1 | By capacitive input or Z-Wave command |

The manufacturer defined default value is ```1``` (By capacitive input or Z-Wave command).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 5: Motion sensor memory timer 

Time after which the output triggered by motion sensor is turned off.
0 – 32534 = 0-32534 seconds after which the LED will be turned off.

32535 – never turns off.
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_5_2``` and is of type ```INTEGER```.


### Parameter 10: Auto-on timer 

Defines the time after which the device is turned to last known state.
0 – disabled

30 – 32535 = 30 – 32535 seconds after which the device turns on
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Auto-off timer 

Defines the time after which the device is turned to last known state.
0 – disabled

30 – 32535 = 30 – 32535 seconds after which the device turns off
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 30: Restore state on power failure 

Restore state on power failure
1 – enabled (the device will restore state on power failure)

0 – disabled (the device will not restore state on power failure and will remain off)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (enabled).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 50: Enable/disable beeper

Enable/disable beeper
0 – disabled (the beeper does not work)

1 – enabled (beeper does work).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (Enabled).

This parameter has the configuration ID ```config_50_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZMNHQD supports 4 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Reserved for communication with the gateway (hub) 

Association group 1 supports 1 node.

### Group 2: LEDs on/off

BASIC SET – status change for the LEDs
 

Association group 2 supports 5 nodes.

### Group 3: Change of brightness

SWITCH MULTILEVEL SET – status change for the LEDs

Association group 3 supports 5 nodes.

### Group 4: Change of color

SWITCH COLOR SET – status change for RGB

Association group 4 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| Linked to BASIC|
| COMMAND_CLASS_SWITCH_COLOR_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/1126/Qubino-Luxy-Smart-Light-extended-manual-eng.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1126).
