---
layout: documentation
title: NAS-PD07Z - ZWave
---

{% include base.html %}

# NAS-PD07Z NEO Coolcam PIR 5 in 1
This describes the Z-Wave device *NAS-PD07Z*, manufactured by *[Shenzhen Neo Electronics Co., Ltd](http://www.szneo.com/)* with the thing type UID of ```shenzhen_naspd07z_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![NAS-PD07Z product image](https://opensmarthouse.org/zwavedatabase/1428/image/)


The NAS-PD07Z supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

5 in 1 sensor: motion, temperature, humidity, luminance, tamper alarm

### Inclusion Information

  1. Power up the device.
  2. Set Z-Wave Controller into inclusion mode.
  3. Press and hold the button for 5 s until white led light is on, then release the button before led turns off.

Blue led will blink with 1 s interval until inclusion successful.

### Exclusion Information

  1. Power up the device.
  2. Set Z-Wave Controller into exclusion mode.
  3. Press and hold the button for 5 s until white led light is on, then release the button before led turns off.

Blue led will blink with 0.5 s interval until exclusion successful.

### General Usage Information

Factory Reset:

  1. Power up the device.
  2. Press and hold the button for 10 s until pink led light is on, then release the button before led turns off.

## Channels

The following table summarises the channels available for the NAS-PD07Z -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | alarm_motion | alarm_motion | Motion | Switch | 
| Sensor (luminance) | sensor_luminance | sensor_luminance |  | Number | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number | 
| Alarm (tamper) | alarm_tamper | alarm_tamper |  | Switch | 

### Binary Sensor
Indicates if a motion alarm is triggered.

The ```alarm_motion``` channel is of type ```alarm_motion``` and supports the ```Switch``` item and is in the ```Motion``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Sensor (luminance)
Indicates the current light reading.

The ```sensor_luminance``` channel is of type ```sensor_luminance``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (relative humidity)
Indicates the current relative humidity.

The ```sensor_relhumidity``` channel is of type ```sensor_relhumidity``` and supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (tamper)
Indicates if the tamper alarm is triggered.

The ```alarm_tamper``` channel is of type ```alarm_tamper``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 20 configuration parameters available in the NAS-PD07Z.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Led Indicator Enable |  |
| 2 | Motion Enable |  |
| 3 | Motion Alarm Once Enable |  |
| 4 | Luminance Associated Enable |  |
| 5 | Motion Sensitivity |  |
| 6 | Temperature Offset Value |  |
| 7 | Humidity Offset Value |  |
| 8 | Temperature D-Value Setting |  |
| 9 | Humidity D-Value Setting |  |
| 10 | Luminance D-Value Setting |  |
| 11 | Basic Set Level |  |
| 12 | Basic Set Off Delay Time |  |
| 13 | Motion Blind Time |  |
| 14 | ??? Unknown (Luminance Threshold for Associated - Parameter #16?) |  |
| 15 | Sensor Measuring Interval |  |
| 16 | ??? Luminance Threshold for Associated (or Parameter #14?) |  |
| 17 | ??? Unknown |  |
| 18 | Light Intensity Offset Calibration |  |
| 98 | ??? Binary Sensor Report Enable |  |
| 99 | ??? Motion Clear Time |  |

### Parameter 1: Led Indicator Enable


This parameter is configured the Led light on disable or enable. '1' - Enable Led Blink when device detects a motion event. '0' - Disable Led blink. This configuration is not affect inclusion, exclusion and reset. Default: Enable
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```1``` (Enable).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Motion Enable


This parameter is configured the motion detected if enable or not. '0' - Motion detected disable. '1' - Motion detected enable. Default: Enable
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```1``` (Enable).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Motion Alarm Once Enable


This Parameter is configured the motion detected event report one time before motion event cleared. '0' - Motion event alarm will be reported when motion event is detected every time. '1' - Motion event alarm report only once before motion event cleared. Default: Enable
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```1``` (Enable).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Luminance Associated Enable


'1' - Enable current light intensity to associate the motion event, if there has a motion event detected and the current light intensity is less than the settings in Configuraton No. 16, the device will send a BASIC\_SET to nodes associated in Group 2. And if the current light intensity is larger then the setting in Configuration No. 16, the device will not send BASIC\_SET to nodes associated in Group 2. '0' - Light intensity is not associated with motion event. Default: Disable
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```0``` (Disable).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Motion Sensitivity


This parameter is configured the sensitivity that motion detect. This value is larger, the sensitivity is lower, and the distance for motion detecting is closer. Available settings: 0 ... 15. Default: 1
Values in the range 0 to 15 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Temperature Offset Value


The current measuring temperature value can be add and minus a value by this setting. Temperature Offset Value = [Value] x 0.1 Degree Celsius / Fahrenheit (US). Available settings: -120 ... 120. Default: 0
Values in the range -120 to 120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Humidity Offset Value


The current measuring humidity value can be add and minus a value by this setting. Humidity Offset Value = [Value] x 0.1 RH%. Available settings: -120 ... 120. Default: 0
Values in the range -120 to 120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Temperature D-Value Setting


This configuration sets the changed value of the temperature. When the difference from the last report exceeds this setting value, the device will report current temperature value to Z-Wave Hubs. The D-Value = [Value] x 0.1 Degree Celsius / Fahrenheit (US). Available settings: 0 ... 120. Default: 10
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Humidity D-Value Setting


This configuration sets the changed value of the humidity. When the difference from the last report exceeds this setting value, the device will report current humidity value to Z-Wave Hubs. The D-Value = [Value] x 0.1 RH%. Available settings: 0 ... 120. Default: 20
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Luminance D-Value Setting


This configuration sets the changed value of the luminance. When the difference from the last report exceeds this setting value, the device will report current luminance value to Z-Wave Hubs. Unit: Lux. Available settings: 0 ... 120. Default: 50
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Basic Set Level


This parameter is configured the value that BASIC\_SET for nodes that associated in Group 2. '100' - BASIC\_SET = 0xFF (ON). '0' - BASIC_SET = 0x00 (OFF). Available settings: 0 ... 100. Default: 100
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Basic Set Off Delay Time


This parameter is configured the time delay for device sending BASIC\_SET = 0x00 to nodes that associated in Group 2 when device detects a motion event. [0] - Not Send BASIC\_SET = 0x00 Command. [1-30000] - Time delay count. Unit: Second. Available settings: 0 ... 30000. Default: 30
Values in the range 0 to 30000 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: Motion Blind Time


This parameter is configured the time interval between two motion events triggered, during this period the motion detector will not be triggered even there has someone move in front of motion detector. Unit: Second. Available settings: 1 ... 8
Values in the range 1 to 8 may be set.

The manufacturer defined default value is ```8```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: ??? Unknown (Luminance Threshold for Associated - Parameter #16?)


Default: 50
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_14_2``` and is of type ```INTEGER```.


### Parameter 15: Sensor Measuring Interval


This parameter is configured the time interval for light sensor, temperature and humidity sensor measuring. This value is larger, the battery life is longer. And the sensors values changed are not obvious. 0 - All sensors are disabled. Unit: Second. Available settings: 0 - 30000. Default: 180 (on batteries) or 10 (on USB)
Values in the range 0 to 30000 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_15_2``` and is of type ```INTEGER```.


### Parameter 16: ??? Luminance Threshold for Associated (or Parameter #14?)


This parameter is configured the light intensity threshold. When Ambient light intensity is less than this setting, device will consider the current environment is insufficient light. If "Configuration No. 3" is set '1' and a motion event is detected, the device will send a BASIC_SET to the nodes which associated in Group 2. Unit: 1 Lux. Available settings: 0 - 1000. Default: 50
Values in the range 0 to 1000 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_16_2``` and is of type ```INTEGER```.


### Parameter 17: ??? Unknown


Default: 180
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_17_2``` and is of type ```INTEGER```.


### Parameter 18: Light Intensity Offset Calibration


This parameter defines the calibrated scale for ambient light intensity. Because the method and position that the sensor mounted and the cover of sensor will bring measurement error, user can get more real light intensity by this parameter setting. User should run the steps blows for calibrating.

1. Set this parameter value to default (Assumes the sensor has been added in a Z-Wave Network).

2. Place a digital luxmeter close to sensor and keep the same direction, monitor the light intensity values (Vm) which report to controller and record it. The same time user should record the Value (Vs) of luxmeter.

3. The scale calibration formula: k = Vm / Vs.

4. The value of k is then multiplied by 1000 and rounded to the nearest whole number.

5. Set the value getting in 5) to this parameter, calibrate finished.  


For example, Vm = 300, Vs = 2000 [sic], then k = 300 / 2600 = 0.11538

k = 0.11538 * 1000 = 115,38 ~ 115

The parameter should be set to 115.

Available settings: 1 ... 32767. Default: 5320
Values in the range 1 to 32767 may be set.

The manufacturer defined default value is ```5320```.

This parameter has the configuration ID ```config_18_2``` and is of type ```INTEGER```.


### Parameter 98: ??? Binary Sensor Report Enable


'1' - Enable sensor binary report when device detects a motion event. '0' - Disable sensor binary report when device detects a motion event. Default: Disable
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enale |

The manufacturer defined default value is ```0``` (Disable).

This parameter has the configuration ID ```config_98_1``` and is of type ```INTEGER```.


### Parameter 99: ??? Motion Clear Time


This parameter is configured the time to clear motion event after a motion event detected. Time to motion clear, the device will send a clear event report to controller. Unit: Second. Available settings: 0 ... 30000. Default: 30
Values in the range 1 to 30000 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_99_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The NAS-PD07Z supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline


Association group 1 supports 5 nodes.

### Group 2: Basic Set

Basic Set


Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V2| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V10| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
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

* [Manual](https://opensmarthouse.org/zwavedatabase/1428/reference/0258_0010_0720_2.6.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1428).
