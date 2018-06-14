---
layout: documentation
title: Sensoair - ZWave
---

{% include base.html %}

# Sensoair Air quality sensor for indoor use
This describes the Z-Wave device *Sensoair*, manufactured by *[SIEGENIA-AUBI KG](https://www.siegenia.com)* with the thing type UID of ```siegeniaaubi_sensoair_00_000```.

![Sensoair product image](https://www.cd-jackson.com/zwave_device_uploads/451/451_default.jpg)


The Sensoair supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/451) to improve the documentation.

## Channels

The following table summarises the channels available for the Sensoair -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Sensor (CO2) | sensor_co2 |  | Number | 

### Sensor (CO2)

Indicates the CO2 level.

The ```sensor_co2``` channel supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 2 configuration parameters available in the Sensoair.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Device Configuration Value 1 | Configuration of the device operating mode |
| 2 | Interval for unsolicited Sensor Report Mode B | defines how often a Sensor report is sent |

### Parameter 1: Device Configuration Value 1

Configuration of the device operating mode
- bit 0 Unsolicited Multilevel Report Mode A 0 = disabled, 1 = **enabled**
- bit 1 Unsolicited Multilevel Report Mode B 0 = **disabled**, 1 = enabled
- bit 2 Basic Set 0 = disabled, 1 = **enabled**
- bit 3 Broadcast Multilevel Report 0 = disabled, 1 = **enabled**
- bit 7 SENSOAIR LEDs 0 = disabled, 1 = **enabled**

**Unsolicited Multilevel Report Mode A**

SENSOAIR sends an usolicited multilevel report when the CO<sub>2</sub> value  
exceeds one of the following threshold values:  
600 ppm, 800 ppm, 1000 ppm, 1500 ppm, 2000 ppm, 2500 ppm

**Unsolicited Multilevel Report Mode B**

SENSOAIR sends the current CO<sub>2</sub> value (without being requested) in an interval of  
5 - 65000 seconds. The interval can be configured with parameter 2.
Values in the range 0 to 143 may be set.

The manufacturer defined default value is ```141```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Interval for unsolicited Sensor Report Mode B

defines how often a Sensor report is sent
When enabled by parameter 1, SENSOAIR sends the current CO<sub>2</sub> value (without being requested) in an interval of 5 - 65000 seconds. The interval (default setting = 30s) is configured as follows:

Device Configuration Value 1 = MSB (default 0x00)

Device Configuration Value 2 = LSB (default 0x1e)
Values in the range 5 to 65000 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Sensoair supports 1 association group.

### Group 1: Group 1


This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V3| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V0| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_SENSOR_CONFIGURATION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/451/co2-eng.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/451).
