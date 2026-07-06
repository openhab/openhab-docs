---
layout: documentation
title: NAS-DS07Z - ZWave
---

{% include base.html %}

# NAS-DS07Z The NEO Coolcam Door/Window Sensor V2
This describes the Z-Wave device *NAS-DS07Z*, manufactured by *[Shenzhen Neo Electronics Co., Ltd](http://www.szneo.com/)* with the thing type UID of ```shenzhen_nas-ds07z_00_000```.

The device is in the category of *Door*, defining Door sensors.

![NAS-DS07Z product image](https://opensmarthouse.org/zwavedatabase/1503/image/)


The NAS-DS07Z supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

**Door/Window Sensor**

_Overview_

The NEO Coolcam Door/Window Sensor provides information whether a door or window is opened or closed. It also provides temperature and humidity information.

The battery operated or USB powered sensor consists of the main unit and a magnetic element. The main unit should be installed on the frame and the magnetic element is placed on the door or window.

**Technical parameters:**

  * Power: CR14250 x1
  * Standby current: 8uA
  * Battery life: 2 years
  * Radio Protocol: Z-wave
  * Radio Frequency: 868.4MHz EU; 908.4MHz US; 921.4MHz ANZ; 869.2MHz RU
  * Wireless distance：50m
  * Operation temperature: 0-40℃
  * Storage temperature: 0-70℃
  * Size: 
  * Contact sensor main body (L x W x H): 82mmx27mmx23mm 
  * Contact sensor deputy body (L x W x H): 50mmx13mmx16mm

**Tips:  
** 

  * **3x click will wake the device.**
  * **If device is not reporting, keep the device awake while heal.**

### Inclusion Information

**Inclusion Information**

  * Remove the sensor cover.
  * Make sure the sensor is USB powered.
  * Set Z‐Wave controller or Z‐Wave gateway into inclusion mode (Refer to the controller or gateway operating manual)
  * Press the button for 5 seconds, until the led turns white, then release before the led turns off, the device will enter inclusion mode. And the blue LED will flash on and off alternately until inclusion succesfull.

### Exclusion Information

**Exclusion Information**

  * Remove the device cover.
  * Make sure the sensor is powered.
  * Set Z‐Wave controller or Z‐Wave gateway into exclusion mode (Refer to the controller or gateway operating manual)
  * Press the button three times within 1.5 second, the device will enter exclusion mode. And the blue LED will flash on and off alternately until exclusion succesfull.

### General Usage Information

When starting the device, if only battery powered it will turn into Low PowerMode. When on DC supply it wil turn into an Always On Slave. Which role is decided on inclusion.

## Channels

The following table summarises the channels available for the NAS-DS07Z -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number | 
| Alarm (access) | alarm_access | alarm_access | Door | Switch | 
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 

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

### Sensor (relative humidity)
Indicates the current relative humidity.

The ```sensor_relhumidity``` channel is of type ```sensor_relhumidity``` and supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (access)
Indicates if the access control alarm is triggered.

The ```alarm_access``` channel is of type ```alarm_access``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (burglar)
Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel is of type ```alarm_burglar``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 9 configuration parameters available in the NAS-DS07Z.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Led Indicated Disable | Led Indicated Disable |
| 2 | Binary Sensor Report Enable | Binary Sensor Report Enabe/Disable |
| 3 | Temperature Offset Value | The current measuring temperature value can be add and minus a value by this setting |
| 4 | 4: Humidity Offset Value | The current measuring humidity value can be add and minus a value by this setting. |
| 5 | 5: Temperature D-Value Setting | This configuration sets the changed value of the temperature. When the difference from the last report exceeds this setting value, the device will report current temperature value to Z-Wave Hubs. |
| 6 | 6: Humidity D-Value Setting | This configuration sets the changed value of the humidity. When the difference from the last report exceeds this setting value, the device will report current humidity value to Z-Wave Hubs. |
| 7 | 7: Basic Set Value | This configuration sets the level for device sending BASIC_SET to nodes that associated in group 2 when device detects a door/window opened event. |
| 8 | 8: Basic Set Off Delay Time | This configuration sets the time delay for device sending BASIC_SET = 0x00 to nodes that associated in group 2 when device detects a door/window closed event. |
| 9 | 9: Sensor Measuring Interval | This parameter is configured the time interval for sensor measuring interval time. |

### Parameter 1: Led Indicated Disable

Led Indicated Disable
This configuration sets to '0' will disable the Led indicating when device detects a door/window opened or closed event.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_1_1_00000001``` and is of type ```INTEGER```.


### Parameter 2: Binary Sensor Report Enable

Binary Sensor Report Enabe/Disable
This configuration sets to '1' will enable SENSOR\_BINARY\_REPORT when device detects a door/window opened or closed event.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | send event OFF |
| 1 | send event ON |

The manufacturer defined default value is ```0``` (send event OFF).

This parameter has the configuration ID ```config_2_1_00000001``` and is of type ```INTEGER```.


### Parameter 3: Temperature Offset Value

The current measuring temperature value can be add and minus a value by this setting
Temperature Offset Value = [Value] × 0.1 Degree Celsius / Fahrenheit (US).This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range -120 to 120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1_00000001``` and is of type ```INTEGER```.


### Parameter 4: 4: Humidity Offset Value

The current measuring humidity value can be add and minus a value by this setting.
Humidity Offset Value = [Value] × 0.1 RH%.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range -120 to 120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_1_00000001``` and is of type ```INTEGER```.


### Parameter 5: 5: Temperature D-Value Setting

This configuration sets the changed value of the temperature. When the difference from the last report exceeds this setting value, the device will report current temperature value to Z-Wave Hubs.
The D-Value = [Value] × 0.1 Degree Celsius / Fahrenheit (US).This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_5_1_00000001``` and is of type ```INTEGER```.


### Parameter 6: 6: Humidity D-Value Setting

This configuration sets the changed value of the humidity. When the difference from the last report exceeds this setting value, the device will report current humidity value to Z-Wave Hubs.
The D- Value = [Value] × 0.1 RH%.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_6_1_00000001``` and is of type ```INTEGER```.


### Parameter 7: 7: Basic Set Value

This configuration sets the level for device sending BASIC_SET to nodes that associated in group 2 when device detects a door/window opened event.
[0] – Off, BASIC\_SET = 0x00, all nodes associated in group 2 will be off. [1 … 99] –On. BASIC\_SET = [Setting Value]. [100] – On, BASIC_SET = 0xFF.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_7_1_00000001``` and is of type ```INTEGER```.


### Parameter 8: 8: Basic Set Off Delay Time

This configuration sets the time delay for device sending BASIC_SET = 0x00 to nodes that associated in group 2 when device detects a door/window closed event.
[0] – No time delay.  
[1 … 30000] – Time delay countThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 30000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_2_00000001``` and is of type ```INTEGER```.


### Parameter 9: 9: Sensor Measuring Interval

This parameter is configured the time interval for sensor measuring interval time.
This value is larger, the sensor values updates slowly. ‘  
0’ – Sensor Measuring Disable.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 30000 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_9_2_00000001``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The NAS-DS07Z supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
is lifeline group; all nodes which associated in this group will receive the messages sent by device through lifeline.
COMMAND\_CLASS\_NOTIFICATION  
NOTIFICATION_REPORT  
COMMAND\_CLASS\_SENSOR_MULTILEVEL  
SENSOR\_MULTILEVEL\_REPORT  
COMMAND\_CLASS\_SENSOR_BINARY  
SENSOR\_BINARY\_REPORT  
COMMAND\_CLASS\_BATTERY¹  
BATTERY_REPORT¹  
COMMAND\_CLASS\_INDICATOR  
INDICATOR_REPORT  
COMMAND\_CLASS\_DEVICE\_RESET\_LOCALLY  
DEVICE\_RESET\_LOCALLY_NOTIFICATION

Notice 1: {COMMAND\_CLASS\_BATTERY, BATTERY_REPORT} is valid only when included with LPM. Please see Page 9 for detail.

Association group 1 supports 5 nodes.

### Group 2: Controlling group

is controlling group, all nodes associated in this group will be controlled through BASIC_SET command by the device when device detects a door/window opened or closed event.
COMMAND\_CLASS\_BASIC BASIC_SET

Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
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

* [Neo Coolcam DS07Z Manual](https://opensmarthouse.org/zwavedatabase/1503/reference/NEO_DS07Z_download_1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1503).
