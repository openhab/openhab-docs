---
layout: documentation
title: RFLDM - ZWave
---

{% include base.html %}

# RFLDM ASPIRE RF Plug-In Z-Wave Lamp Dimmer
This describes the Z-Wave device *RFLDM*, manufactured by *Cooper Wiring Devices* with the thing type UID of ```cooper_rfldmdimmer_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![RFLDM product image](https://www.cd-jackson.com/zwave_device_uploads/1130/1130_default.jpg)


The RFLDM supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Plug-in dimmer; 300W. ASPIRE RF Wireless Plug-In Module 15A, 120V/AC grounding receptacle for use with a wide variety of lamps and appliances. Module can be controlled remotely by other RF devices through association of up to 5 devices.

### Inclusion Information

  1. This product may be added to a new or existing Z-Wave network. The device has an amber LED, which will blink when the device is not included in a Z-Wave network. The LED stops blinking when the device is in a network.
  2. To include this device in a Z-Wave network, select the command on your Z Wave controller for inclusion (Install, Add Device, Add Node, Include Device, etc.). Then press the device control switch one time to include it in the network. The LED will stop blinking.

### Exclusion Information

To exclude this device from a Z-Wave network, select the command on your Z-Wave controller for exclusion (Uninstall, Remove Device, Remove Node, Exclude Device, etc.). Then press the device control switch one time to exclude it from the network. The LED will start blinking.

## Channels

The following table summarises the channels available for the RFLDM -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Scene Number | scene_number | scene_number |  | Number | 
| Alarm | alarm_general | alarm_general | Alarm | Switch | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Alarm
Indicates if an alarm is triggered.

The ```alarm_general``` channel is of type ```alarm_general``` and supports the ```Switch``` item and is in the ```Alarm``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 7 configuration parameters available in the RFLDM.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Delayed Off |  |
| 2 | Panic On Time |  |
| 3 | Panic Off Time |  |
| 4 | Basic Set Value | Not available in earlier versions of the device. |
| 5 | Power p State |  |
| 6 | Panic Mode Enable |  |
| 7 | Dimmer Ramp Time |  |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Delayed Off



Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Panic On Time



Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Panic Off Time



Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Basic Set Value

Not available in earlier versions of the device.

Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Power p State



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Off |
| 2 | On |
| 3 | LAST STATE |

The manufacturer defined default value is ```1``` (OFF).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Panic Mode Enable



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 1 | On |

The manufacturer defined default value is ```0``` (OFF).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Dimmer Ramp Time



Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.

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

The RFLDM supports 1 association group.

### Group 1: Group 1


Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V2| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_PROTECTION_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_HAIL_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/1130/B004FW1QAC-Eaton-Aspire-RFLDM-Spec-Sheet.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1130).
