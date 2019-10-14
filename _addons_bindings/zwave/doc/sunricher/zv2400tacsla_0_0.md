---
layout: documentation
title: ZV2400TAC-SL-A - ZWave
---

{% include base.html %}

# ZV2400TAC-SL-A Knob Smart Dimmer
This describes the Z-Wave device *ZV2400TAC-SL-A*, manufactured by *[Sunricher](www.sunricher.com)* with the thing type UID of ```sunricher_zv2400tacsla_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZV2400TAC-SL-A product image](https://www.cd-jackson.com/zwave_device_uploads/1116/1116_default.jpg)


The ZV2400TAC-SL-A supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The knob smart dimmer is a Z-Wave device designed to work with various types of light sources. It may be connected to two-wire or three-wire configuration so it can operate with or without neutral lead. The dimmer can switch or dim connected light source either through Z-Wave devices or through the rotary knob directly. The smart dimmer is equipped with an algorithm of smart light source detection which makes configuration easier and ensures high compatibility of the device. It may be used as a switch with non-dimmable light sources (in 3- wire connection). The dimmer can be included and operated in any Z-Wave network with other Z-Wave certified devices from other manufacturers and/or other applications. All non-battery operated nodes within the network will act as repeaters regardless of vendor to increase reliability of the network. The encryption mode that the dimmer supports is S2 Unauthenticated. When the dimmer is being included into a Z-Wave network, you can use your primary controller/gateway to enable encryption mode or disable encryption. (The primary controller/gateway shall support encryption mode configuration). The dimmer supports OTA and can update firmware wirelessly.

### Inclusion Information

There are two methods to set the dimmer into inclusion mode:

  1. Repower on the dimmer, it will be set into inclusion mode automatically, and waiting to be included.
  2. Triple press reset button on the dimmer, it will set the dimmer into inclusion mode. The connected light will stay solid on for 3 seconds to indicate successful inclusion.

### Exclusion Information

There are two exclusion methods:

Method 1: Exclusion from the primary controller/gateway as follows:

  1. Set the primary controller/gateway into exclusion mode (Please refer to your primary controllers manual on how to set your controller into exclusion).
  2. Triple press reset button, the dimmer will be set to exclusion mode, and waiting to be excluded, then the dimmer will be excluded from the network.

Method 2: Factory reset the dimmer will force it to be excluded from a network. (please refer to the part “Factory Reset” of this manual) Note: Factory reset is not recommended for exclusion, please use this procedure only if the primary controller/gateway is missing or otherwise inoperable.

## Channels

The following table summarises the channels available for the ZV2400TAC-SL-A -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Scene Number | scene_number | scene_number |  | Number | 
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Alarm (system) | alarm_system | alarm_system |  | Switch | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Electric meter (amps)
Indicates the instantaneous current consumption.

The ```meter_current``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (system)
Indicates if a system alarm is triggered.

The ```alarm_system``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 17 configuration parameters available in the ZV2400TAC-SL-A.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 2 | State before power failure | Saving load state before power failure |
| 3 |  Send Basic report | send the basic report to the Lifeline when the load state changed |
| 4 | Default fade time  | Default fade time |
| 5 | Minimum brightness value | Setting minimum brightness value |
| 6 | Maximum brightness value | Setting maximum brightness value |
| 7 | MOSFET driving type | Choose MOSFET driving type |
| 9 | Added to and removed from a network | Added to and removed from a network |
| 10 | Detect load | Enable/disable to detect load |
| 11 | Wiring type | Wiring type |
| 12 | Load type | Load type |
| 13 | Over current protection | Enable/disable over current protection |
| 14 |  Threshold, unit is W | Threshold, unit is W |
| 15 | Threshold, unit is % | Threshold, unit is % |
| 21 | Power metering time cycle | Power metering time cycle |
| 22 | Energy metering time cycle | Energy metering time cycle |
| 23 | Voltage metering time cycle | Voltage metering time cycle |
| 24 | Current metering time cycle | Current metering time cycle |

### Parameter 2: State before power failure

Saving load state before power failure
Info: Saving load state before power failure

0 － shutoff load

1 － turn on load

2 － save load state before power failure
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | shutoff load |
| 1 | turn on load |
| 2 | save load state before power failure |

The manufacturer defined default value is ```2``` (save load state before power failure).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3:  Send Basic report

send the basic report to the Lifeline when the load state changed
Info: Enable/disable to send the basic report to the Lifeline when the load state changed （When value set as 1, re-power on the dimmer, it will send Basic report automatically） 
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable to send Basic report |
| 1 | Enable to send Basic report |

The manufacturer defined default value is ```1``` (Enable to send Basic report).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Default fade time 

Default fade time
Default fade time (unit is second, this value has the same function as Duration of Multilevel)

Valid value: 0~0xFF 
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Instantly |
| 1 | from 1 to 127 seconds |
| 80 | 1 to 127 minutes |
| 255 | Factory default duration. (3 second) |

The manufacturer defined default value is ```0``` (Instantly).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Minimum brightness value

Setting minimum brightness value
Valid value: 0~50, the bigger the value is, the higher the load’s minimum brightness is 
Values in the range 0 to 50 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Maximum brightness value

Setting maximum brightness value
Setting maximum brightness value Valid value: 0~100
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: MOSFET driving type

Choose MOSFET driving type
Choose MOSFET driving type 

0 – trailing edge

1 – leading edge
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | trailing edge |
| 1 | leading edge |

The manufacturer defined default value is ```0``` ( trailing edge).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 9: Added to and removed from a network

Added to and removed from a network
Added to and removed from a network through external switch (when enables this function, triple press the external switch within 1.5 seconds to be added to or removed from a network)

0 - disable

1 - enable
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | disable |
| 1 | enable |

The manufacturer defined default value is ```1``` (enable).

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Detect load

Enable/disable to detect load
Enable/disable to detect load after re-power on (detect load type, minimum brightness, maximum brightness)

0 - disable

1 - enable to detect every time after re-power on

2 - enable to detect only after first re-power on Note: When the device does not belong to any network, load detection will be enabled every time after re-power on. When the device has already been added to a network, load detection will be disabled.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | disable |
| 1 | enable |
| 2 | enable to detect only after first re-power |

The manufacturer defined default value is ```0``` (disable).

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Wiring type

Wiring type
Wiring type

0 - unknown

1 - 2 Wire With No Neutral

2 - 3 Wire With Neutral
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 12: Load type

Load type
Load type

0 - unknown

1 - resistive

2 - inductive

3 - capacitive
Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 13: Over current protection

Enable/disable over current protection
Enable/disable over current protection (over 1.5A for 20 seconds continuously)

0 – disable

1 – enable
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | disable |
| 1 | enable |

The manufacturer defined default value is ```1``` (enable).

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14:  Threshold, unit is W

Threshold, unit is W
Power automatic report absolute threshold, unit is W When power changes above the absolute threshold, immediately report current power value
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_14_2``` and is of type ```INTEGER```.


### Parameter 15: Threshold, unit is %

Threshold, unit is %
Power automatic report percentage threshold, unit is % When power changes above the percentage threshold, immediately report current power value
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 21: Power metering time cycle

Power metering time cycle
Power metering automatic report time cycle, unit is second Valid time cycle value: 5~2678400, when set as 0, report function disabled 
Values in the range 0 to 2678400 may be set.

The manufacturer defined default value is ```600```.

This parameter has the configuration ID ```config_21_4``` and is of type ```INTEGER```.


### Parameter 22: Energy metering time cycle

Energy metering time cycle
Energy metering automatic report time cycle, unit is second Valid time cycle value: 5~2678400, when set as 0, report function disabled 
Values in the range 0 to 2678400 may be set.

The manufacturer defined default value is ```1800```.

This parameter has the configuration ID ```config_22_4``` and is of type ```INTEGER```.


### Parameter 23: Voltage metering time cycle

Voltage metering time cycle
Voltage metering automatic report time cycle, unit is second Valid time cycle value: 5~2678400, when set as 0, report function disabled 
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_23_4``` and is of type ```INTEGER```.


### Parameter 24: Current metering time cycle

Current metering time cycle
Current metering automatic report time cycle, unit is second Valid time cycle value: 5~2678400, when set as 0, report function disabled 
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_24_4``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZV2400TAC-SL-A supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
1. When press and hold down “Reset” button for 10S to reset the dimmer, send "Device Reset Locally Notification CC" to associated devices of this group to report factory reset information.

2. When load state changes, send "Basic Report CC" to associated devices of this group.

3. When a load over current is detected, send "Over-current detected" to Lifeline.

4. When a mains voltage drop is detected, send "Voltage drop/drift" to Lifeline.

5. When over temperature is detected, send “Emergency shutoff status" to Lifeline.

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Installation and operation manual](https://www.cd-jackson.com/zwave_device_uploads/1116/sunricher-SR-ZV2400TAC-SL-A.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1116).
