---
layout: documentation
title: ARZ Solar - ZWave
---

{% include base.html %}

# ARZ Solar Roller Shutter
This describes the Z-Wave device *ARZ Solar*, manufactured by *Fakro* with the thing type UID of ```fakro_arzsolar_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![ARZ Solar product image](https://www.cd-jackson.com/zwave_device_uploads/853/853_default.jpg)


The ARZ Solar supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

Roller shutter controlled by a remote control. Solar roller shutter is equipped with a control unit and accumulator. The accumulator is powered by a solar cell placed on the roller shutter. Recommended for places with no access to 230V supply.

### Inclusion Information

Start INCLUDE procedure with the controller of existing network and then press programming button P on the roller shutter being added to the network.

### Exclusion Information

Start EXCLUDE procedure with the controller of existing network and then press programming button P on the roller shutter being added to the network.

## Channels

The following table summarises the channels available for the ARZ Solar -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Battery Level | battery-level | Battery | Number |

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level``` channel supports the ```Number``` item and is in the ```Battery``` category.



## Device Configuration

The device has no configuration parameters configured.

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
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_CONFIGURATION_V0| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [PDF manual](https://www.cd-jackson.com/zwave_device_uploads/853/ARZ-SOLAR-FAKRO-EN.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/853).
