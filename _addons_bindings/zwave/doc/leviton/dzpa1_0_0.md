---
layout: documentation
title: DZPA1 - ZWave
---

{% include base.html %}

# DZPA1 Plug-in Appliance Module
This describes the Z-Wave device *DZPA1*, manufactured by *Leviton* with the thing type UID of ```leviton_dzpa1_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![DZPA1 product image](https://www.cd-jackson.com/zwave_device_uploads/305/305_default.jpg)


The DZPA1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/305) to improve the documentation.

## Channels

The following table summarises the channels available for the DZPA1 -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The following table provides a summary of the 9 configuration parameters available in the DZPA1.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 4 | Invert Switch | Invert the ON/OFF Switch State.   
 Setting this parameter to Yes will change the top of the switch to OFF and the bottom to ON.   
 Note: If you invert the switches and also install the product upside down, the load will now be control |
| 5 | Ignore Start-Level (Receiving) | This dimmer will start dimming from its current level. |
| 7 | Night Light | Defines the behavior of the blue LED. Default is Night Light mode where LED is on when switch is off. |
| 7 | On/Off Command Dim Step | Indicates how many levels the dimmer will change for each dimming step. |
| 8 | On/Off Command Dim Rate | This value indicates in 10 millisecond resolution.   
 This sets how often the dim level will change. For example, if you set this parameter to 1, then every 10ms the dim level will change. If you set it to 255, then every 2.55 seconds the |
| 9 | Local Control Dim Step | Indicates how many levels the dimmer will change for each dimming step. |
| 10 | Local Control Dim Rate | This value indicates in 10 millisecond resolution.   
 This sets how often the dim level will change. For example, if you set this parameter to 1, then every 10ms the dim level will change. If you set it to 255, then every 2.55 seconds the |
| 11 | ALL ON/ALL OFF Dim Step | Indicates how many levels the dimmer will change for each dimming step. |
| 12 | ALL ON/ALL OFF Dim Rate | This value indicates in 10 millisecond resolution.   
 This sets how often the dim level will change. For example, if you set this parameter to 1, then every 10ms the dim level will change. If you set it to 255, then every 2.55 seconds the |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 4: Invert Switch

Invert the ON/OFF Switch State.   
 Setting this parameter to Yes will change the top of the switch to OFF and the bottom to ON.   
 Note: If you invert the switches and also install the product upside down, the load will now be control

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No |
| 1 | Yes |

The manufacturer defined default value is ```0``` (No).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Ignore Start-Level (Receiving)

This dimmer will start dimming from its current level.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No |
| 1 | Yes |

The manufacturer defined default value is ```0``` (No).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 7: Night Light

Defines the behavior of the blue LED. Default is Night Light mode where LED is on when switch is off.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | LED always off |
| 254 | LED on when switch is ON |
| 255 | LED on when switch is OFF |

The manufacturer defined default value is ```255``` (LED on when switch is OFF).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 7: On/Off Command Dim Step

Indicates how many levels the dimmer will change for each dimming step.

Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: On/Off Command Dim Rate

This value indicates in 10 millisecond resolution.   
 This sets how often the dim level will change. For example, if you set this parameter to 1, then every 10ms the dim level will change. If you set it to 255, then every 2.55 seconds the

Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Local Control Dim Step

Indicates how many levels the dimmer will change for each dimming step.

Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Local Control Dim Rate

This value indicates in 10 millisecond resolution.   
 This sets how often the dim level will change. For example, if you set this parameter to 1, then every 10ms the dim level will change. If you set it to 255, then every 2.55 seconds the

Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: ALL ON/ALL OFF Dim Step

Indicates how many levels the dimmer will change for each dimming step.

Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: ALL ON/ALL OFF Dim Rate

This value indicates in 10 millisecond resolution.   
 This sets how often the dim level will change. For example, if you set this parameter to 1, then every 10ms the dim level will change. If you set it to 255, then every 2.55 seconds the

Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.

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

The device does not support associations.
## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Product Data sheet](https://www.cd-jackson.com/zwave_device_uploads/305/DZP-plugin-modules-Tsht-BW-v1p1--1-.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/305).
