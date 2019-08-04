---
layout: documentation
title: MH9-CO2-WA - ZWave
---

{% include base.html %}

# MH9-CO2-WA CO2 Monitor Air quality detector
This describes the Z-Wave device *MH9-CO2-WA*, manufactured by *[McoHome Technology Co., Ltd](http://www.mcohome.com/)* with the thing type UID of ```mcohome_mh9co2wa_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![MH9-CO2-WA product image](https://www.cd-jackson.com/zwave_device_uploads/1078/1078_default.png)


The MH9-CO2-WA supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

MCOHome CO2 Monitor is an air quality detector which compatible with Z-Wave technology.

It is mainly used to monitor CO2 concentration in industrial, agricultural, and residence environment, while monitoring the indoor temperature, humidity and VOC (optional) air quality.

Device can be included into any Z-Wave network, and is compatible with any other Z-Wave certified devices.

**Specification**

  * Power Supply：85~260VAC
  * CO2 display range: 0-2000ppm
  * Default threshold:1000ppm (adjustable)
  * Temperature range：-9.0～50 ℃
  * Humidity range: 0%～99%RH
  * Installation: Wall-mounted (Vertical)
  * Work environment:-10~+8℃ 0-90%RH (Non-condensation)
  * Dimension：90\* 130\*28mm
  * Hole Pitch：60mm or 82m
  * Housing: Tempered glass+ PC Alloy

**Command Class supported by the device**

  * COMMAND\_CLASS\_BASIC
  * COMMAND\_CLASS\_SENSOR\_MULTILEVEL\_V5
  * COMMAND\_CLASS\_CONFIGURATION
  * COMMAND\_CLASS\_NOTIFICATION
  * COMMAND\_CLASS\_ASSOCIATION
  * COMMAND\_CLASS\_MANUFACTURER_SPECIFIC
  * COMMAND\_CLASS\_VERSION

### Inclusion Information

Activate Inclusion/Exclusion mode in the gateway.

When device is powered on, long press K2 can enter interface for inclusion or exclusion of Z-Wave network.

If device has not been included into any Z-Wave network before, “\- - -”will display on the screen.

Then press K2 once, “\- - -” flashing and device enters into learning mode to get a node ID. If inclusion is success, a node ID will display on the screen. If not, “\- - -” will stop flashing in 20 sec.

### Exclusion Information

Activate Inclusion/Exclusion mode in the gateway.

When device is powered on, long press K2 can enter interface for inclusion or exclusion of Z-Wave network.

If a node ID displays, it means the device is already in a Z-Wave network.

To press K2 once can remove it from the network. “\- - -” displays and press K1 once can return to normal work.

## Channels

The following table summarises the channels available for the MH9-CO2-WA -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (CO2) | sensor_co2 | sensor_co2 | CarbonDioxide | Number | 
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Alarm (CO2) | alarm_co2 | alarm_co2 | CarbonDioxide | Switch | 

### Sensor (CO2)
Indicates the CO2 level.

The ```sensor_co2``` channel is of type ```sensor_co2``` and supports the ```Number``` item and is in the ```CarbonDioxide``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (relative humidity)
Indicates the current relative humidity.

The ```sensor_relhumidity``` channel is of type ```sensor_relhumidity``` and supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Alarm (CO2)
Indicates if the carbon dioxide alarm is triggered.

The ```alarm_co2``` channel is of type ```alarm_co2``` and supports the ```Switch``` item and is in the ```CarbonDioxide``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 1 configuration parameters available in the MH9-CO2-WA.
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

The MH9-CO2-WA supports 2 association groups.

### Group 1: Notification

sends report ever 30s when CO2 value above threshold
Group 1 is for “Notification” purpose, which can add up to 5 Node ID. Device works in “Push” mode in “Notification Command Class”.

When the detected CO2 value is higher than the setting value, the device will send a (CO2 Detected Event) report to the Group 1. And this report will keep sending every 30 sec until the detected value is lower than the setting value.

Use “Notification Set” can set this unsolicited report; this function is default as “OFF”.

Association group 1 supports 5 nodes.

### Group 2: Gateway report

CO2, Temperature and Humidity is reported when changed
A gateway is suggested to associate with Group 2, which can support only one Node ID. The  
gateway can ask for detected data any time. And the device will report to this associated device  
(gateway) when detected data changes:  
CO2: report when any change ≥50ppm“Multilevel sensor Report (CO2=0x11)”  
Temperature: report when any change≥ 0.5 “Multilevel ℃ sensor Report (Temp=0x01)”  
Humidity: report when any change≥ 2%“Multilevel sensor Report (Humidity=0x05)’

Association group 2 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V4| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SENSOR_CONFIGURATION_V1| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/1078/20180531151046.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1078).
