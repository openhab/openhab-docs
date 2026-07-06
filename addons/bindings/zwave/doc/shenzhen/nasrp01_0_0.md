---
layout: documentation
title: NAS-RP01 - ZWave
---

{% include base.html %}

# NAS-RP01 Neo Coolcam Repeater
This describes the Z-Wave device *NAS-RP01*, manufactured by *[Shenzhen Neo Electronics Co., Ltd](http://www.szneo.com/)* with the thing type UID of ```shenzhen_nasrp01_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![NAS-RP01 product image](https://opensmarthouse.org/zwavedatabase/1544/image/)


The NAS-RP01 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Neo Coolcam repeater is a Z-Wave mesh network repeater which can extend the range of communication between Z-Wave products and assist other devices to reach each other in your Z-Wave network.

The Range Extender can also communicate securely via AES 128 wireless Z-Wave commands.

### Inclusion Information

Turn the primary controller of Z-Wave network into inclusion mode, press the Z-Wave button on the repeater for 5 seconds until green led is on, then release the button before the green led is turned off.

### Exclusion Information

Turn the primary controller of Z-Wave network into exclusion mode, press the Z-Wave Button on the repeater for 5 seconds until green led is on, then release the button before the green led is turned off.

### General Usage Information

Factory reset - hold button for 10s until red LED is on, then release button before LED turn off.

Product test - press and hold button, power up the device. It will enter factory product test mode

Send NIF - Press and hold button for 5s until green LED is on, then release button before green LED turns off

## Channels

The following table summarises the channels available for the NAS-RP01 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number | 

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (relative humidity)
Indicates the current relative humidity.

The ```sensor_relhumidity``` channel is of type ```sensor_relhumidity``` and supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 12 configuration parameters available in the NAS-RP01.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Measuring LED indication | LED blinks red or not during measure |
| 2 | OTA LED Disable | LED blink during OTA update |
| 3 | Temperature Offset Value | Temperature offset calibration |
| 4 | Humidity Offset Value | Humidity offset calibration |
| 5 | Temperature D-Value Setting | Report temperature difference |
| 6 | Humidity D-Value Setting | Report humidity difference |
| 7 | Low Temperature Alarm | Low Temperature alarm report |
| 8 | High Temperature Alarm | High Temperature alarm report |
| 9 | Low Humidity Alarm | Low Humidity alarm report |
| 10 | High Humidity Alarm | High Humidity alarm report |
| 11 | Sensor Measuring Interval | Time measuring interval |
| 12 | Heartbeat Time | Heartbeat time |

### Parameter 1: Measuring LED indication

LED blinks red or not during measure
"0" - No LED blink, "1" - LED blinks red
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | No LED blink |
| 1 | LED blinks red |

The manufacturer defined default value is ```1``` (LED blinks red).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: OTA LED Disable

LED blink during OTA update
"0" No LED blink, "1" - LED blinks yellow
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | No LED blink |
| 1 | LED blinks yellow |

The manufacturer defined default value is ```1``` (LED blinks yellow).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Temperature Offset Value

Temperature offset calibration
Temperature Offset Value = [Value] x 0.1 Degrees C or F
Values in the range -120 to 120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Humidity Offset Value

Humidity offset calibration
Humidity Offset Value = [Value] x 0.1 RH%
Values in the range -120 to 120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Temperature D-Value Setting

Report temperature difference
D Value = [Value] x 0.1 Degrees C or F
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Humidity D-Value Setting

Report humidity difference
Humidity D Value = [Value] x 0.1 RH%
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Low Temperature Alarm

Low Temperature alarm report
Temperature Value = [Value] x 0.1 Degrees C or F
Values in the range -200 to 600 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_7_2``` and is of type ```INTEGER```.


### Parameter 8: High Temperature Alarm

High Temperature alarm report
Temperature Value = [Value] x 0.1 Degrees C
Values in the range -200 to 600 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_8_2``` and is of type ```INTEGER```.


### Parameter 9: Low Humidity Alarm

Low Humidity alarm report
Humidity Value = [Value] x 0.1 RH%
Values in the range 200 to 850 may be set.

The manufacturer defined default value is ```400```.

This parameter has the configuration ID ```config_9_2``` and is of type ```INTEGER```.


### Parameter 10: High Humidity Alarm

High Humidity alarm report
Humidity Value = [Value] x 0.1 RH%
Values in the range 200 to 850 may be set.

The manufacturer defined default value is ```400```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Sensor Measuring Interval

Time measuring interval
"0" Sensor Measuring Disabled
Values in the range 0 to 30000 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Heartbeat Time

Heartbeat time
Report to controller ignoring sensor D-values. "0" - Heartbeat Time Disable
Values in the range 0 to 30000 may be set.

The manufacturer defined default value is ```3600```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The NAS-RP01 supports 5 association groups.

### Group 1: Group 1

Lifeline
All nodes which associated in group 1 will receive the messages sent by device through lifeline.

Association group 1 supports 5 nodes.

### Group 2: Group 2

Group 2
Low Temperature Alarm Association, BASIC\_SET = 0xFF when triggered, BASIC\_SET = 0x00 when restored

Association group 2 supports 5 nodes.

### Group 3: Group 3

Group 3
High Temperature Alarm Association, BASIC\_SET = 0xFF when triggered, BASIC\_SET = 0x00 when restored

Association group 3 supports 5 nodes.

### Group 4: Group 4

Group 4
Low Humidity Alarm Association, BASIC\_SET = 0xFF when triggered, BASIC\_SET = 0x00 when restored

Association group 4 supports 5 nodes.

### Group 5: Group 5

Group 5
High Humidity Alarm Association, BASIC\_SET = 0xFF when triggered, BASIC\_SET = 0x00 when restored

Association group 5 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V10| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [RP01manualphoto1.pdf](https://opensmarthouse.org/zwavedatabase/1544/reference/IMG_0153.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1544).
