---
layout: documentation
title: ZIP-PAB01 - ZWave
---

{% include base.html %}

# ZIP-PAB01 Micro Module Energy Meter
This describes the Z-Wave device *ZIP-PAB01*, manufactured by *[Zipato](http://www.zipato.com/)* with the thing type UID of ```zipato_zippab01_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZIP-PAB01 product image](https://www.cd-jackson.com/zwave_device_uploads/899/899_default.jpg)


The ZIP-PAB01 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

  * Slim, compact remote Z-Wave module measures power parameters of connected device
  * Dual power meter function
  * Instant power wattage and
  * Accumulated power consumption KWh report
  * Amper meter clamp included in the box
  * Maximum current measure 60A
  * Higher output power enhances communication range(+2.5dBm output power compared to -2.5dBm 300 series)
  * New Z-Wave 500 series chip supports multichannel operation and higher data rates (9.6/40/100kbps)
  * Very low power power consumption
  * Over-the-air firmware update Easy installation

### Inclusion Information

In the front casing, there is an On/Off button with LED indicator which is used to carry out inclusion, exclusion, reset or association. After being excluded, its LED flashes on and off alternately and repeatedly at 2-second intervals. It implies that it has not been assigned a node ID and cannot work with Z-Wave enabled devices.

**AUTO INCLUSION**

The function of auto inclusion will be executed as long as the Micromodule does not have Node ID and is plugged into a wall outlet. When first power is applied, its LED flashes on and off alternately and repeatedly at 0.5 second intervals. It implies that it is in learning mode now.

Note: Auto inclusion timeout lasts 2 minutes during which the node information of explorer frame will be emitted once per every 5 seconds. Unlike “inclusion” function as shown in the table below, auto inclusion doesn’t require pressing on/off buttons on the switch.

### Exclusion Information

Pressing On/Off (Include) button three times within 2 seconds will enter exclusion mode.

## Channels

The following table summarises the channels available for the ZIP-PAB01 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 
| Electric meter (power factor) | meter_powerfactor | meter_powerfactor | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (volts) 1 | meter_voltage1 | meter_voltage | Energy | Number | 
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number | 
| Electric meter (amps) 1 | meter_current1 | meter_current | Energy | Number | 
| Electric meter (power factor) 1 | meter_powerfactor1 | meter_powerfactor | Energy | Number | 
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number | 
| Electric meter (volts) 2 | meter_voltage2 | meter_voltage | Energy | Number | 
| Electric meter (kWh) 2 | meter_kwh2 | meter_kwh | Energy | Number | 
| Electric meter (amps) 2 | meter_current2 | meter_current | Energy | Number | 
| Electric meter (power factor) 2 | meter_powerfactor2 | meter_powerfactor | Energy | Number | 
| Electric meter (watts) 2 | meter_watts2 | meter_watts | Energy | Number | 
| Electric meter (volts) 3 | meter_voltage3 | meter_voltage | Energy | Number | 
| Electric meter (kWh) 3 | meter_kwh3 | meter_kwh | Energy | Number | 
| Electric meter (amps) 3 | meter_current3 | meter_current | Energy | Number | 
| Electric meter (power factor) 3 | meter_powerfactor3 | meter_powerfactor | Energy | Number | 
| Electric meter (watts) 3 | meter_watts3 | meter_watts | Energy | Number | 

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps)
Indicates the instantaneous current consumption.

The ```meter_current``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (power factor)
Indicates the instantaneous power factor.

The ```meter_powerfactor``` channel is of type ```meter_powerfactor``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts) 1
Indicates the instantaneous voltage.

The ```meter_voltage1``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh) 1
Indicates the energy consumption (kWh).

The ```meter_kwh1``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps) 1
Indicates the instantaneous current consumption.

The ```meter_current1``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (power factor) 1
Indicates the instantaneous power factor.

The ```meter_powerfactor1``` channel is of type ```meter_powerfactor``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 1
Indicates the instantaneous power consumption.

The ```meter_watts1``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts) 2
Indicates the instantaneous voltage.

The ```meter_voltage2``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh) 2
Indicates the energy consumption (kWh).

The ```meter_kwh2``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps) 2
Indicates the instantaneous current consumption.

The ```meter_current2``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (power factor) 2
Indicates the instantaneous power factor.

The ```meter_powerfactor2``` channel is of type ```meter_powerfactor``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 2
Indicates the instantaneous power consumption.

The ```meter_watts2``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts) 3
Indicates the instantaneous voltage.

The ```meter_voltage3``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh) 3
Indicates the energy consumption (kWh).

The ```meter_kwh3``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps) 3
Indicates the instantaneous current consumption.

The ```meter_current3``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (power factor) 3
Indicates the instantaneous power factor.

The ```meter_powerfactor3``` channel is of type ```meter_powerfactor``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 3
Indicates the instantaneous power consumption.

The ```meter_watts3``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 3 configuration parameters available in the ZIP-PAB01.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Power meter report period | Power meter report period, in 5 seconds unit. 720 -> 1 hour |
| 2 | Energy meter report period | The accumulated power consumption report period |
| 3 | Selected default endpoint | 1 => CT1 and CT2, 2 => CT1, 3 => CT2 |

### Parameter 1: Power meter report period

Power meter report period, in 5 seconds unit. 720 -> 1 hour
If the setting is configured for 1 hour (set value 720), the module will report its instant power consumption every 1 hour to the node of the corresponding group. The maximum interval to report its instant power consumption is 45h (5s * 32767 / 3600 = 45h)
Values in the range 1 to 32767 may be set.

The manufacturer defined default value is ```720```.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: Energy meter report period

The accumulated power consumption report period
If the setting is configured for 1 hour (set value 720), the module will report its accumulated power consumption every 1 hour to the node of the corresponding group. The maximum interval to report its accumulated power consumption is 45h (5s * 32767 / 3600 = 45h)
Values in the range 1 to 32767 may be set.

The manufacturer defined default value is ```720```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Selected default endpoint

1 => CT1 and CT2, 2 => CT1, 3 => CT2
If Controller does not use Multi Channel command class to access the endpoint of the module, you may configure the endpoint that will react to the Basic Command Class, Binary Switch command class or Meter command class V3.
Values in the range 1 to 3 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZIP-PAB01 supports 3 association groups.

### Group 1: CT1 and CT2

Sum of CT1 and CT2
Sum of :

  * Instant power consumption from CT1 and CT2 (W)
  * Accumulated power consumption from CT1 and CT2 (kWh)

Association group 1 supports 1 node.

### Group 2: CT1

Data from CT1
  * Instant power consumption from CT1 (W)
  * Accumulated power consumption from CT1 (kWh)

Association group 2 supports 1 node.

### Group 3: CT2

Data from CT2
  1. Instant power consumption from CT2 (W)
  2. Accumulated power consumption from CT2 (kWh)

Association group 3 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_CRC_16_ENCAP_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
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

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/899/ZIP-PAB01.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/899).
