---
layout: documentation
title: DRY - ZWave
---

{% include base.html %}

# DRY Widom Smart Dry contact
This describes the Z-Wave device *DRY*, manufactured by *wiDom* with the thing type UID of ```widom_dry_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![DRY product image](https://www.cd-jackson.com/zwave_device_uploads/996/996_default.jpg)


The DRY supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

WiDom Smart Dry Contact Switch can turn ON and OFF equipments with an independent power supply, such as solenoid valves (e.g. gas, water and irrigation), power operated valves etc. 

WiDom Smart Dry Contact Switch is very easy to install and works with both momentary and toggle switches. 

The device is equipped with contact protection technology (Zero Crossing) which reduces the electrical stress on the relay contacts and ensures a longer life. The open / closed switching of the device always occur when the instantaneous value of voltage is 0. 

It operates in any Z-Wave network with other Z-Wave/Z-Wave Plus certified devices and controllers from any other manufacturer. As a constantly powered node, WiDom Smart Double Switch will act as repeater regardless of the vendor in order to increase the reliability of the network.

### Inclusion Information

WiDom Smart Dry Contact Switch is compatible with all Z-Wave/Z-Wave Plus certified controllers. The device supports both the Network Wide Inclusion mechanism (which offers the ability to be included in a network, even if the device is not directly connected to the controller) and Normal Inclusion. By default, the inclusion procedure starts in Normal Inclusion mode and after a short time out the procedure continues in Network Wide Inclusion mode that lasts for about 20 Seconds.

Before including the device the LED status indicator is solid RED. The procedure of inclusion is activated by clicking Add in the inclusion interface and by pressing any sequence of click on the integrated button. As soon as the inclusion procedure initiates the LED indicator starts a sequence of GREEN-BLUE blinks. The device is included in the network when the LED status is OFF and the interview is completed. 

### Exclusion Information

Only a controller can remove the device from the network. After activating the exclusion function by the controller, the device can be removed by setting it in Learning Mode. As soon as the exclusion initiates, the LED indicator starts a sequence of RED-BLUE blinks. The device is excluded from the network when the LED status indicator is solid RED and the App_status in the interface is OK. 

## Channels

The following table summarises the channels available for the DRY -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The following table provides a summary of the 12 configuration parameters available in the DRY.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Numbers of clicks to control the load | Defines which sequences of clicks control the load |
| 4 | Value used for devices belonging to Group 2 | Value sent when the external switch receives 1 Click |
| 5 |  Value used for devices belonging to Group 3 | Value sent wen the external switch receives 2 Clicks |
| 6 |  Value used for devices belonging to Group 4 | Value sent when external switch receives 3 Clicks |
| 10 | Timer to switch OFF the Relay | Defines the time after which the relay is switched OFF |
| 11 | Timer to switch ON the Relay | Defines the time after which the relay is switched ON |
| 15 | Timer scale | Defines the time unit used for parameters No.10 and No.11. |
| 20 | One Click Scene Activation Set | Defines the Scene Activation Set value sent to the Lifeline group with 1 Click |
| 21 | Two Clicks Scene Activation Set  | Defines the Scene Activation Set value sent to the Lifeline group with 2 Clicks |
| 22 | Three Clicks Scene Activation Set | Defines the Scene Activation Set value sent to the Lifeline group with 3 Clicks |
| 60 | Start-up Status | Defines the status of the device following a restart |
| 62 | Type of external switch | Defines the type of external switch connected to the device |

### Parameter 1: Numbers of clicks to control the load

Defines which sequences of clicks control the load

Values in the range 0 to 7 may be set.

The manufacturer defined default value is ```7```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 4: Value used for devices belonging to Group 2

Value sent when the external switch receives 1 Click

Values in the range -1 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5:  Value used for devices belonging to Group 3

Value sent wen the external switch receives 2 Clicks
 Value used for devices belonging to Group 3 when the external switch receives 2 Clicks
Values in the range -1 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6:  Value used for devices belonging to Group 4

Value sent when external switch receives 3 Clicks
 Value used for devices belonging to Group 4 when external switch receives 3 Clicks
Values in the range -1 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 10: Timer to switch OFF the Relay

Defines the time after which the relay is switched OFF

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Timer to switch ON the Relay

Defines the time after which the relay is switched ON

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 15: Timer scale

Defines the time unit used for parameters No.10 and No.11.

Values in the range 1 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_15_2_wo``` and is of type ```INTEGER```.
This is a write only parameter.


### Parameter 20: One Click Scene Activation Set

Defines the Scene Activation Set value sent to the Lifeline group with 1 Click
Defines the Scene Activation Set value sent to the Lifeline group with 1 Click on the external switch
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_20_2``` and is of type ```INTEGER```.


### Parameter 21: Two Clicks Scene Activation Set 

Defines the Scene Activation Set value sent to the Lifeline group with 2 Clicks
Defines the Scene Activation Set value sent to the Lifeline group with 2 Clicks on the external switch
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_21_2``` and is of type ```INTEGER```.


### Parameter 22: Three Clicks Scene Activation Set

Defines the Scene Activation Set value sent to the Lifeline group with 3 Clicks
Defines the Scene Activation Set value sent to the Lifeline group with 3 Clicks on the external switch
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_22_2``` and is of type ```INTEGER```.


### Parameter 60: Start-up Status

Defines the status of the device following a restart

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | On |
| 2 | Off |
| 3 | PREVIOUS STATUS |

The manufacturer defined default value is ```3``` (PREVIOUS STATUS).

This parameter has the configuration ID ```config_60_1``` and is of type ```INTEGER```.


### Parameter 62: Type of external switch

Defines the type of external switch connected to the device

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | IGNORE |
| 1 | BUTTON |
| 2 | SWITCH |

The manufacturer defined default value is ```1``` (BUTTON).

This parameter has the configuration ID ```config_62_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The DRY supports 4 association groups.

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
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V1| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/996/Widom-Dry-Contact-EN.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/996).
