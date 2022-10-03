---
layout: documentation
title: Motion sensor S2 - ZWave
---

{% include base.html %}

# Motion sensor S2 Motion, Temperature & Light Sensor NAS_PD02Z
This describes the Z-Wave device *Motion sensor S2*, manufactured by *[Shenzhen Neo Electronics Co., Ltd](http://www.szneo.com/)* with the thing type UID of ```shenzhen_motionsensors2_00_000```.

The device is in the category of *Motion Detector*, defining Motion sensors/detectors.

![Motion sensor S2 product image](https://opensmarthouse.org/zwavedatabase/1511/image/)


The Motion sensor S2 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The Motion sensor S2 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Motion Sensor with illuminance and sometimes a temperature feature

### Inclusion Information

  * Remove the sensor cover.
  * Make sure the sensor is powered.
  * Set Z‐Wave controller or Z‐Wave gateway into inclusion mode (Refer to the controller or gateway operating manual)
  * Press the button three times within 1.5 second, the device will enter inclusion mode. LED light will be blinking with 1s interval until inclusion successful

### Exclusion Information

  * Remove the sensor cover.
  * Make sure the sensor is powered.
  * Set Z‐Wave controller or Z‐Wave gateway into inclusion mode (Refer to the controller or gateway operating manual)
  * Press the button three times within 1.5 second, the device will enter inclusion mode. LED light is blinking 3 times with 0.5s interval.

### Wakeup Information

The Motion sensor S2 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


You can press the button  three times within 1.5 second to wake up the device and send wakeup notification to controller. If press successfully, the LED will blink one time. The minimum wakeup interval is 300s, the maximum wakeup interval is 16,777,200s (about 194 days). Allowable interval among each wakeup interval is 60 second, such as 360, 420, 480…

Note: The default value is 12 hours. This value is longer, the battery life is greater.<

### General Usage Information



## Channels

The following table summarises the channels available for the Motion sensor S2 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Sensor (luminance) | sensor_luminance | sensor_luminance |  | Number | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (luminance)
When the ambient light intensity differential is over 50lux (in default, and decides by configuration No. 11), the device will unsolicited to send a "SENSOR\_MULTILEVEL\_REPORT"to nodes which associated in lifeline.

Indicates the current light reading.

The ```sensor_luminance``` channel is of type ```sensor_luminance``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Sensor (temperature)
When the ambient temperature differential is over 0.5°C (in default, and decides by configuration No. 15), the device will unsolicited to send a "SENSOR\_MULTILEVEL\_REPORT" to nodes which associated in lifeline.

Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 16 configuration parameters available in the Motion sensor S2.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Motion Sensitivity | Sensitivity for motion detection. If this value is larger, the sensitivity is lower, and the distance for motion detecting is closer. |
| 2 | Motion Window Time | Specified time window (4s..16s) in which the amount of pulses will trigger a motion event. Window Time = [Value] * 4s + 4s. |
| 3 | Pulse Count | Amount of pulses during the specified time window which trigger a motion event. Amount of pluses = [Value] + 1. |
| 4 | Motion Blind Time | No motion detected time after a motion event was detected. The device will wait for setting times to ready to next detect. BlinkTime = ([Value] + I) * 0.5S. |
| 5 | Motion Enable | Enables or disablesd motion detection. If "1": Motion detected function is enable. Otherwise is disabled. |
| 6 | Motion Clear Time | Time to clear motion event after a motion event was detected. Time to motion clear, the device will send a clear event report to controller. Unit: Second. |
| 7 | Led Indicate Enable | Led light disable or enable. '1'- Enable Led Blink when device detects a motion event. °0'- Disable led blink. This configuration is not affected in inclusion, exclusion and reset. |
| 8 | Binary Sensor Report Enable | '1'- Enable sensor binary report when device detects a motion event. '0'- Disable sensor binary report when device detects a motion event. |
| 9 | Basic Set Level | Value for BASIC\_SET for nodes associated in Group 2. '100'- BASIC\_SET = 0xFF (ON). '0'- BASIC_SET = 0x00 (OFF). |
| 10 | Sensor Measuring Interval | Time interval for light sensor measurement of ambient light intensity. If this value is larger, the battery life is longer. And the light intensity changed is not obvious. |
| 11 | Light Intensity Differential Report | Value differential between current measured and previous report value. If the differential value larger than the settings, device will report this measured light intensity to controller. |
| 12 | Light Intensity Threshold | If the light intensity current measured is less than the settings, device will considered to be dark at current time. If configuration 13 is set '1' and a motion event is detected, the device will send a BASIC_SET to the nodes that associated in group 2. |
| 13 | Light Intensity Associated Enable | '1'- Enable current light intensity to associate the motion event, if there has a motion event detected and the current light intensity is less than the settings in configuration 12, the device will send a BASIC_SET to nodes associated in group2. |
| 14 | Motion Event Report Once Enable | '1' - The motion detected event will be sent to controller only once until device report motion cleared event. '0'- The motion detected event will be sent to controller when device detects a movement event. |
| 15 | Temperature Differential Report | Value that differential between current measured and previous report value. If the differential value larger than the settings, device will report this measured temperature value to nodes associated in lifeline. DifferentialValue = [Value] x 0.1°C |
| 99 | Light Intensity Offset Calibration | This parameter defines the calibrated scale for ambient light intensity |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Motion Sensitivity

Sensitivity for motion detection. If this value is larger, the sensitivity is lower, and the distance for motion detecting is closer.

Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Motion Window Time

Specified time window (4s..16s) in which the amount of pulses will trigger a motion event. Window Time = [Value] * 4s + 4s.

Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Pulse Count

Amount of pulses during the specified time window which trigger a motion event. Amount of pluses = [Value] + 1.

Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Motion Blind Time

No motion detected time after a motion event was detected. The device will wait for setting times to ready to next detect. BlinkTime = ([Value] + I) * 0.5S.

Values in the range 0 to 15 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Motion Enable

Enables or disablesd motion detection. If "1": Motion detected function is enable. Otherwise is disabled.

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Motion Clear Time

Time to clear motion event after a motion event was detected. Time to motion clear, the device will send a clear event report to controller. Unit: Second.

Values in the range 10 to 3600 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.


### Parameter 7: Led Indicate Enable

Led light disable or enable. '1'- Enable Led Blink when device detects a motion event. °0'- Disable led blink. This configuration is not affected in inclusion, exclusion and reset.

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Binary Sensor Report Enable

'1'- Enable sensor binary report when device detects a motion event. '0'- Disable sensor binary report when device detects a motion event.

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Basic Set Level

Value for BASIC\_SET for nodes associated in Group 2. '100'- BASIC\_SET = 0xFF (ON). '0'- BASIC_SET = 0x00 (OFF).

Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Sensor Measuring Interval

Time interval for light sensor measurement of ambient light intensity. If this value is larger, the battery life is longer. And the light intensity changed is not obvious.

Values in the range 30 to 3600 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Light Intensity Differential Report

Value differential between current measured and previous report value. If the differential value larger than the settings, device will report this measured light intensity to controller.

Values in the range 1 to 127 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Light Intensity Threshold

If the light intensity current measured is less than the settings, device will considered to be dark at current time. If configuration 13 is set '1' and a motion event is detected, the device will send a BASIC_SET to the nodes that associated in group 2.

Values in the range 1 to 127 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Light Intensity Associated Enable

'1'- Enable current light intensity to associate the motion event, if there has a motion event detected and the current light intensity is less than the settings in configuration 12, the device will send a BASIC_SET to nodes associated in group2.
'1'- Enable current light intensity to associate the motion event, if there has a motion event detected and the current light intensity is less than the settings in configuration 12, the device will send a BASIC\_SET to nodes associated in group2. And if the current light intensity is larger than the settings in configuration 12, the device will not send BASIC\_SET to nodes associated in group2.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Motion Event Report Once Enable

'1' - The motion detected event will be sent to controller only once until device report motion cleared event. '0'- The motion detected event will be sent to controller when device detects a movement event.

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Temperature Differential Report

Value that differential between current measured and previous report value. If the differential value larger than the settings, device will report this measured temperature value to nodes associated in lifeline. DifferentialValue = [Value] x 0.1°C

Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 99: Light Intensity Offset Calibration

This parameter defines the calibrated scale for ambient light intensity
This parameter defines the calibrated scale for ambient light intensity. Because the method and position that the sensor mounted and the cover of sensor will bring measurement error, user can get more real light intensity by this parameter setting. User should run the steps as blows for calibrating 

1. Set this parameter value to default(Assumes the sensor has been added in a Z-Wave Network). 

2. Place a digital luxmeter close to sensor and keep the same direction, monitor the light intensity value (Vm) which report to controller and record it. The same time user should record the value (Vs) of Iuxmeter.

3. The scale calibration formula: k = Vm IVS.

4. The value of k is then multiplied by 1000 and rounded to the nearest whole number.

5. Set the value getting in 5) to this parameter, calibrate finished. 

For example, Vm = 300, Vs = 2000, then k = 300 / 2600 = 0.11538

k=0.11538*1000=115.38=115

The parameter should be set to 115.
Values in the range 1 to 65536 may be set.

The manufacturer defined default value is ```1000```.

This parameter has the configuration ID ```config_99_2``` and is of type ```INTEGER```.

### Wakeup Interval

The wakeup interval sets the period at which the device will listen for messages from the controller. This is required for battery devices that sleep most of the time in order to conserve battery life. The device will wake up at this interval and send a message to the controller to tell it that it can accept messages - after a few seconds, it will go back to sleep if there is no further communications. 

This setting is defined in *seconds*. It is advisable not to set this interval too short or it could impact battery life. A period of 1 hour (3600 seconds) is suitable in most instances.

Note that this setting does not affect the devices ability to send sensor data, or notification events.

This parameter has the configuration ID ```wakeup_interval``` and is of type ```INTEGER```.

### Wakeup Node

When sleeping devices wake up, they send a notification to a listening device. Normally, this device is the network controller, and normally the controller will set this automatically to its own address.
In the event that the network contains multiple controllers, it may be necessary to configure this to a node that is not the main controller. This is an advanced setting and should not be changed without a full understanding of the impact.

This parameter has the configuration ID ```wakeup_node``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Motion sensor S2 supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline

Association group 1 supports 1 node.

### Group 2: Basic Set



Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V2| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [NAS-PD02Z manual](https://opensmarthouse.org/zwavedatabase/1511/reference/NAS_PD02Z_-_Manual_osh.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1511).
