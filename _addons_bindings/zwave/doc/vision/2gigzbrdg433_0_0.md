---
layout: documentation
title: Z-BRDG-433 - ZWave
---

{% include base.html %}

# Z-BRDG-433 Plug in Z-Wave to 433Mhz bridge plus lamp dimmer
This describes the Z-Wave device *Z-BRDG-433*, manufactured by *[Vision Security](http://www.visionsecurity.com.tw/)* with the thing type UID of ```vision_2gigzbrdg433_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![Z-BRDG-433 product image](https://www.cd-jackson.com/zwave_device_uploads/978/978_default.jpg)


The Z-BRDG-433 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

This GoControl (formerly 2GIG) Plug-in Lamp Module is integrates with other Z-Wave products. It can also act as a wireless repeater to ensure that commands intended for another device in the network are received (useful when a device would otherwise be out of radio range).

  * One-controlled outlet for control and dimming of lamps (Z-Wave hub required)
  * Works with many Z-Wave controllers, including SmartThings, WINK, FIBARO Home Center, Vera, and many more!
  * For indoor use only
  * May be packaged referencing 2GIG Energy Bridge; device sold as a Z-Wave lamp dimmer only

**SPECIFICATIONS**

  * Signal (Frequency): 908.42 MHz
  * Maximum Load (Incandescent): 300W maximum, 120 VAC
  * Range: Up to 100 feet between the wireless controller and/or the closest Z-Wave device
  * 120 VAC, 60 H

### Inclusion Information

When the device is unpaired, press the button on the front till the relay inside clicks to put it into Zwave pairing mode.

### Exclusion Information

At this time I have no idea how to exclude this device, If I figure it out I will update this.

### General Usage Information

Works as a plug in lamp dimmer for a 2 wire lamp.

Requires to plugged into a grounded outlet.

Also acts as a Zwave to 433Mhz bridge for connection to various energy monitoring devices

Sold as 2GIG, Vision Security, Norteck Security, and Go Control as far as I can see.

Seems to be intended for installers as finding information on it's use with Zwave is quite difficult.

## Channels

The following table summarises the channels available for the Z-BRDG-433 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The device has no configuration parameters defined.

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
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_METER_V2| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_PROTECTION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Manual for 2GIG version of this](https://www.cd-jackson.com/zwave_device_uploads/978/2GIG-Z-BRDG-433-Manual.pdf)
* [Sell sheet for 2GIG version](https://www.cd-jackson.com/zwave_device_uploads/978/NPA-Energy-Bridge-1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/978).
