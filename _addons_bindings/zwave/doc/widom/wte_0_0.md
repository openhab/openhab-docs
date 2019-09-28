---
layout: documentation
title: WTE - ZWave
---

{% include base.html %}

# WTE Widom Smart Dimmer
This describes the Z-Wave device *WTE*, manufactured by *wiDom* with the thing type UID of ```widom_wte_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![WTE product image](https://www.cd-jackson.com/zwave_device_uploads/995/995_default.png)


The WTE supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

WiDom Smart TE Dimmer is an "in-wall device" that controls the luminosity level and/or fan speed. A universal device that controls the light intensity of all types of dimmable lights, including LED lamps and energy-saving lamps. The Smart TE Dimmer includes the ON / OFF control option of non-dimmable loads. 

WiDom Smart TE Dimmer is very easy to install and works with both momentary and toggle switches.  

It operates in any Z-Wave network with other Z-Wave/Z-Wave Plus certified devices and controllers from any other manufacturer. As a constantly powered node, WiDom Smart TE Dimmer will act as repeater regardless of the vendor in order to increase the reliability of the network.

### Inclusion Information

WiDom Smart TE Dimmer is compatible with all Z-Wave/Z-Wave Plus certified controllers. The device supports both the Network Wide Inclusion mechanism (which offers the ability to be included in a network, even if the device is not directly connected to the controller) and Normal Inclusion. By default, the inclusion procedure starts in Normal Inclusion mode and after a short timeout the procedure continues in Network Wide Inclusion mode that lasts for about 20 Seconds.

Before including the device the LED status indicator is solid RED. The procedure of inclusion is activated by clicking Add in the inclusion interface and by pressing any sequence of click on the integrated button. As soon as the inclusion procedure initiates the LED indicator starts a sequence of GREEN-BLUE blinks. The device is included in the network when the LED status is OFF and the interview is completed.

### Exclusion Information

Only a controller can remove the device from the network. After activating the exclusion function by the controller, the device can be removed by setting it in Learning Mode. If you are using the WiDom Multi Sensor Room Controller, the procedure of exclusion can be activated by Removing a node from the Z-Wave network and any click sequence on the integrated button; as soon as the exclusion initiates, the LED indicator starts a sequence of RED-BLUE blinks. The device is excluded from the network when the LED status indicator is solid RED and the App_status in the interface is OK. 

## Channels

The following table summarises the channels available for the WTE -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Meter (KWh) | meter_kwh | meter_kwh | Energy | Number | 
| Meter Reset | meter_reset | meter_reset | Energy | Switch | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Meter (KWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Meter Reset
Reset the meter.

The ```meter_reset``` channel is of type ```meter_reset``` and supports the ```Switch``` item and is in the ```Energy``` category.



## Device Configuration

The following table provides a summary of the 8 configuration parameters available in the WTE.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Start-up status | Defines the status of the device, in term of light level, following a restart. |
| 2 | Fade On Time | Defines the time spent to switch the load from complete OFF to complete ON |
| 3 | Fade Off Time | Defines the time spent to switch the load from complete ON to complete OFF |
| 4 | Local Dimming Time | Defines the time spent to switch the controlled load |
| 10 | Minimum Light Level | Defines which light level will correspond to 1% in the range between 1 and 98% |
| 11 | Maximum Light Level | Defines which light level will correspond to 99% in the range between 2 and 99% |
| 20 | Dimmable Load | Define if the connected loads are dimmable or not |
| 62 | Type of external switch | Defines the type of external switch connected to the device |

### Parameter 1: Start-up status

Defines the status of the device, in term of light level, following a restart.

Values in the range -1 to 99 may be set.

The manufacturer defined default value is ```-1```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Fade On Time

Defines the time spent to switch the load from complete OFF to complete ON

Values in the range -126 to 127 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Fade Off Time

Defines the time spent to switch the load from complete ON to complete OFF

Values in the range -126 to 127 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Local Dimming Time

Defines the time spent to switch the controlled load
Defines the time spent to switch the controlled load when the external switch is hold down
Values in the range 0 to 60 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 10: Minimum Light Level

Defines which light level will correspond to 1% in the range between 1 and 98%

Values in the range 1 to 98 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Maximum Light Level

Defines which light level will correspond to 99% in the range between 2 and 99%

Values in the range 2 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 20: Dimmable Load

Define if the connected loads are dimmable or not

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NON\_DIMMABLE\_LOAD |
| 1 | DIMMABLE LOAD |

The manufacturer defined default value is ```1``` (DIMMABLE LOAD).

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 62: Type of external switch

Defines the type of external switch connected to the device

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | IGNORE |
| 1 | BUTTON |
| 2 | SWITCH |

The manufacturer defined default value is ```1``` (BUTTON ).

This parameter has the configuration ID ```config_62_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The WTE supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 8 nodes.

### Group 2: Dimming

The 2nd association group allows to propagate the status of the controller device to its associated devices. The devices of the 2nd association group will receive a “Start level change” command by pressing the external switch of the dimmer (controller device), and a “Stop level change” command when the switch is released.  The “Start level change” also sets the dimming duration and start level for the controlled devices by propagating its local diming time and its current value. 

Association group 2 supports 8 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_METER_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V1| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/995/Widom-Smart-Dimmer-EN.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/995).
