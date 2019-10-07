---
layout: documentation
title: iPlugDim - ZWave
---

{% include base.html %}

# iPlugDim Wall Plug with dimming function
This describes the Z-Wave device *iPlugDim*, manufactured by *Wintop* with the thing type UID of ```wintop_iplugdim_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![iPlugDim product image](https://www.cd-jackson.com/zwave_device_uploads/698/698_default.jpg)


The iPlugDim supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

  * The iPlugDim can be remotely controlled.
  * The iPlugDim can be controlled by the push button on the front of the device.
  * The iPlugDim ’s indicator light will indicate the status of the switch (ON or OFF).
  * The iPlugDim can make a dimming function of the load.

Press and release the push button of the iPlugDim to switch on/off the load of socket, press and hold the push button to dim the load of the socket.

**Indication modes  
** 

The indicator gives various statuses of the device as follows:

  1. Ready for learn mode: Indicator light blinks every second.
  2. Learn in progress (add): Indicator light blinks 2 times every second.
  3. Learn in progress (remove): Indicator light blinks 3 times every second.
  4. Learn mode success: Indicator light is on for second.
  5. Learn mode failed: Indicator light blinks 8 times fast.

### Inclusion Information

  1. Make sure your Z‐Wave controller is in the right operation mode (include or exclude).

  2. Press and hold the push button for 4 seconds and release to start the inclusion or exclusion process
    
    (indication mode: Ready for learn mode).

  3. (The product will start NWI automatically after unsuccessful normal inclusion) 

### Exclusion Information

Press and hold the push button for 4 seconds and release to start the inclusion or exclusion process

## Channels

The following table summarises the channels available for the iPlugDim -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The following table provides a summary of the 1 configuration parameters available in the iPlugDim.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Set to Default | Set to Default |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Set to Default

Set to Default

The following option values may be configured, in addition to values in the range 0 to 255 -:

| Value  | Description |
|--------|-------------|
| 1 | Set all config values to default values |

The manufacturer defined default value is ```85```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.

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
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [iPlugDim Manual](https://www.cd-jackson.com/zwave_device_uploads/698/iplugdim.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/698).
