---
layout: documentation
title: P1-dongle - ZWave
---

{% include base.html %}

# P1-dongle P1-dongle
This describes the Z-Wave device *P1-dongle*, manufactured by *[BeNext](http://www.benext.eu/)* with the thing type UID of ```benext_p1dongle_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![P1-dongle product image](https://www.cd-jackson.com/zwave_device_uploads/340/340_default.png)


The P1-dongle supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The P1-dongle sends smart meter data wirelessly to your controller, helping you get insight of your consumption and things like the overall yield of your solar panels. The P1-dongle can connect to smart meters that support DSMR (Dutch Smart Meter Reader Protocol) eg. all smart meters with a P1-connector.

LED Status Information

  * Ready to install: LED pulse once per second
  * Including: LED pulse twice per second
  * Excluding: LED pulse three times per 1.5 second
  * Include Successful: LED on for one second
  * Ready and operating in a Z-Wave network: LED continuously on
  * No ready and not included in a Z-Wave network: LED pulse once per second

### Inclusion Information

  * Put you controller in inclusion mode
  * Connect the P1 Dongle to your Smart Meter (use a power source when needed)
  * The P1 Dongle will switch to Network Wide Inclusion automatically

Use the button to switch the P1 Dongle to Inclusion (LED pulse twice per second) or Exclusion / Reset (LED pulse three times per 1.5 second) mode

### Exclusion Information

  * Put your controller and the P1 Dongle in exclusion mode (LED pulse three times per 1.5 second)
  * The dongle will exclude from it's former network and reset to node ID zero 
  * If the P1 Dongle wasn't included in a network before, this procedure will act as a node reset

Use the button to switch the P1 Dongle to Inclusion (LED pulse twice per second) or Exclusion / Reset (LED pulse three times per 1.5 second) mode

## Channels

The following table summarises the channels available for the P1-dongle -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number | 
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number | 
| Electric meter (kWh) 2 | meter_kwh2 | meter_kwh | Energy | Number | 
| Electric meter (watts) 2 | meter_watts2 | meter_watts | Energy | Number | 
| Gas meter (G_Cubic_Meters) 3 | meter_gas_cubic_meters3 | meter_gas_cubic_meters | Energy | Number | 

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh) 1
Indicates the energy consumption (kWh).

The ```meter_kwh1``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 1
Indicates the instantaneous power consumption.

The ```meter_watts1``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh) 2
Indicates the energy consumption (kWh).

The ```meter_kwh2``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 2
Indicates the instantaneous power consumption.

The ```meter_watts2``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Gas meter (G_Cubic_Meters) 3
Indicates the gas use in cubic meters.

The ```meter_gas_cubic_meters3``` channel is of type ```meter_gas_cubic_meters``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 1 configuration parameters available in the P1-dongle.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 4 | Baud Rate | Baud rate: the rate the device sends data between the smart meter and z-wave |

### Parameter 4: Baud Rate

Baud rate: the rate the device sends data between the smart meter and z-wave
Set BAUD rate value * 100.
Values in the range 0 to 40000 may be set.

The manufacturer defined default value is ```1152```.

This parameter has the configuration ID ```config_4_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The P1-dongle supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_CRC_16_ENCAP_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_METER_V3| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_METER_V3| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_METER_V3| |

### Documentation Links

* [Manual (NL)](https://www.cd-jackson.com/zwave_device_uploads/340/P1-dongle-nl.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/340).
