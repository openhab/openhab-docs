---
layout: documentation
title: HS-FS100+ Flex - ZWave
---

{% include base.html %}

# HS-FS100+ Flex Flex Sensor
This describes the Z-Wave device *HS-FS100+ Flex*, manufactured by *[HomeSeer Technologies](http://www.homeseer.com/)* with the thing type UID of ```homeseer_hsfs100flex_05_018```.
This version of the device is limited to firmware versions above 5.18

The device is in the category of *Sensor*, defining Device used to measure something.

![HS-FS100+ Flex product image](https://www.cd-jackson.com/zwave_device_uploads/1069/1069_default.jpg)


The HS-FS100+ Flex supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

HS-FS100+ (“Flex Sensor”) is a multi functional module that includes a temperature sensor, controllable buzzer, and a port to connect external light or water sensors.

### Inclusion Information

  1. Attach the included light or water sensor cable. Put your home automation controller into Z-Wave ‘inclusion’ mode.
  2. Press the Z-Wave network button on the front of the unit one time. Wait for the inclusion process to finish. This may take some time.

### Exclusion Information

  1. Put your home automation controller into Z-Wave ‘exclusion’ mode.
  2. Press the Z-Wave network button on the front of the unit one time. Wait for the exclusion process to finish. This may take some time.

## Channels

The following table summarises the channels available for the HS-FS100+ Flex -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Alarm | alarm_general | alarm_general | Alarm | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Alarm
Indicates if an alarm is triggered.

The ```alarm_general``` channel is of type ```alarm_general``` and supports the ```Switch``` item and is in the ```Alarm``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 5 configuration parameters available in the HS-FS100+ Flex.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Light Sensitvity | Light Sensitvity |
| 2 | Water Detecton beep frequency | Water Detecton beep frequency |
| 3 | Temperature reportng interval when on line power | Temperature reportng interval when on line power |
| 4 | Enable Notfcaton Buzzer | Enable Notfcaton Buzzer |
| 5 | Flashing LED detection delay | Flashing LED detection delay |

### Parameter 1: Light Sensitvity

Light Sensitvity
0=high sensitvity  
1=medium sensitvity  
2=low sensitvity
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Water Detecton beep frequency

Water Detecton beep frequency
0=every 10 minutes (approx batery life of 3 months in this mode)  
1=every 5 minutes  
2=every 30 minutes
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Temperature reportng interval when on line power

Temperature reportng interval when on line power
30-255 seconds, default=60
Values in the range 30 to 255 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Enable Notfcaton Buzzer

Enable Notfcaton Buzzer
0 = Disabled  
1 = Enabled (Default)
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Flashing LED detection delay

Flashing LED detection delay
Set delay to avoid continuous notifications when detecting flashing LED’s. Flex Sensor will not send notification until flashing LED status changes.
Values in the range 0 to 20 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The HS-FS100+ Flex supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Flex Sensor supports Group 1 association. Group 1 reports the sensor’s status and battery if running on batteries.

Association group 1 supports 5 nodes.

### Group 2: Basic Set Commands


Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V10| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/1069/FS100Flex-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1069).
