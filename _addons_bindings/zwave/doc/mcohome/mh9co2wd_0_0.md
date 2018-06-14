---
layout: documentation
title: MH9-CO2-WD - ZWave
---

{% include base.html %}

# MH9-CO2-WD CO2 Monitor Air quality detector
This describes the Z-Wave device *MH9-CO2-WD*, manufactured by *[McoHome Technology Co., Ltd](http://www.mcohome.com/)* with the thing type UID of ```mcohome_mh9co2wd_00_000```.

![MH9-CO2-WD product image](https://www.cd-jackson.com/zwave_device_uploads/455/455_default.png)


The MH9-CO2-WD does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour. The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Overview

MCOHome CO2 Monitor is an air quality detector which compatible with Z-Wave technology.

It is mainly used to monitor CO2 concentration in industrial, agricultural, and residence environment, while monitoring the indoor temperature, humidity and VOC (optional) air quality.

Device can be included into any Z-Wave network, and is compatible with any other Z-Wave certified devices.

**Specification**

- Power Supply：DC12V
- CO2 display range: 0-2000ppm
- Default threshold:1000ppm (adjustable)
- Temperature range：-9.0～50 ℃
- Humidity range: 0%～99%RH
- Installation: Wall-mounted (Vertical)
- Work environment:-10~+8℃ 0-90%RH (Non-condensation)
- Dimension：90\* 130\*28mm
- Hole Pitch：60mm or 82m
- Housing: Tempered glass+ PC Alloy

**Command Class supported by the device**

- COMMAND\_CLASS\_BASIC
- COMMAND\_CLASS\_SENSOR\_MULTILEVEL\_V5
- COMMAND\_CLASS\_CONFIGURATION
- COMMAND\_CLASS\_NOTIFICATION
- COMMAND\_CLASS\_ASSOCIATION
- COMMAND\_CLASS\_MANUFACTURER\_SPECIFIC
- COMMAND\_CLASS\_VERSION

### Inclusion Information

Activate Inclusion/Exclusion mode in the gateway.

When device is powered on, long press K2 can enter interface for inclusion or exclusion of Z-Wave network.

If device has not been included into any Z-Wave network before, “- - -”will display on the screen.

Then press K2 once, “- - -” flashing and device enters into learning mode to get a node ID. If inclusion is success, a node ID will display on the screen. If not, “- - -” will stop flashing in 20 sec.

### Exclusion Information

Activate Inclusion/Exclusion mode in the gateway.

When device is powered on, long press K2 can enter interface for inclusion or exclusion of Z-Wave network.

If a node ID displays, it means the device is already in a Z-Wave network.

To press K2 once can remove it from the network. “- - -” displays and press K1 once can return to normal work.

## Channels

The following table summarises the channels available for the MH9-CO2-WD -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
| Sensor (relative humidity) | sensor_relhumidity | Humidity | Number | 
| Sensor (CO2) | sensor_co2 |  | Number | 
| Alarm (CO2) | alarm_co2 | Door | Switch | 
| Alarm (general) | alarm_general | Door | Switch | 

### Sensor (temperature)

Indicates the current temperature.

The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (relative humidity)

Indicates the current relative humidity.

The ```sensor_relhumidity``` channel supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (CO2)

Indicates the CO2 level.

The ```sensor_co2``` channel supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Alarm (CO2)

Indicates if the carbon dioxide alarm is triggered.

The ```alarm_co2``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Alarm (general)

Indicates if an alarm is triggered.

The ```alarm_general``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 1 configuration parameters available in the MH9-CO2-WD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Notification Threshold | CO2 Notification Threshold |

### Parameter 1: Notification Threshold

CO2 Notification Threshold
Sets the CO2 notification threshold for association group 1.

When the detected CO2 value is higher than the setting value, the device will send a (CO2 Detected Event) report to the Group 1. And this report will keep sending every 30 sec until the detected value is lower than the setting value.
Values in the range 1 to 2000 may be set.

The manufacturer defined default value is ```1000```.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The MH9-CO2-WD supports 2 association groups.

### Group 1: Notification

sends report ever 30s when CO2 value above threshold
This group supports 5 nodes.

### Group 2: Gateway report

CO2, Temperature and Humidity is reported when changed
This group supports 1 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V4| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_SENSOR_CONFIGURATION_V1| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/455/McoHomeCO2Monitor.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/455).
