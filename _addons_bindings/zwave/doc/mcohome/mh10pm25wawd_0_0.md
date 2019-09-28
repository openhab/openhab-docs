---
layout: documentation
title: MH10-PM2.5-WA/WD - ZWave
---

{% include base.html %}

# MH10-PM2.5-WA/WD PM2.5 Monitor (Zwave Plus)
This describes the Z-Wave device *MH10-PM2.5-WA/WD*, manufactured by *[McoHome Technology Co., Ltd](http://www.mcohome.com/)* with the thing type UID of ```mcohome_mh10pm25wawd_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![MH10-PM2.5-WA/WD product image](https://www.cd-jackson.com/zwave_device_uploads/1056/1056_default.png)


The MH10-PM2.5-WA/WD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

MCOHome PM2.5 Monitor is an air quality detector which compatible with Z-Wave Plus technology, it is mainly used to monitor PM2.5 concentration in industrial, agricultural, and residence environment, while monitoring the indoor temperature and humidity. Device can be included into any Z-Wave network, and is compatible with any other Z-Wave certified devices.

### Inclusion Information

The unlabelled buttons on the left edge of the device are S1, S2 and S3, starting from the top.

Activate Inclusion/Exclusion mode in your Z-Wave controller.

With the device powered on, long press S1 & S3 simultaneously to enter Inclusion/Exclusion mode.

  * If device is not included into a Z-Wave network before, “\- - -” will display on the screen.
  * Then press S1 once, “\- - -” will flash and the device enters into learning mode to get a node ID.

If inclusion is successful, a node ID will display on the screen. If not, “\- - -” will stop flashing after 20 seconds.

Note: If display is flashing, you can abort the operation by long pressing S1+S3. If display is not flashing, press S2 once to return to normal operation.

### Exclusion Information

The unlabelled buttons on the left edge of the device are S1, S2 and S3, starting from the top.

Activate Inclusion/Exclusion mode in your Z-Wave controller.

With the device powered on, long press S1 & S3 simultaneously to enter Inclusion/Exclusion mode.

  * If a node ID is displayed, it means the device is already in a Z-Wave network.
  * Press S1 once can remove it from the network. “\- - -” displays.
  * Press S2 once can return to normal work

Note: If display is flashing, you can abort the operation by long pressing S1+S3. If display is not flashing, press S2 once to return to normal operation.

### General Usage Information

Installation & Wiring

Location:  
Device is suggested to be installed indoor, a place with around 1.5m height above the floor where represents the average PM2.5 concentration. It should be away from direct sunlight, any cover, or any heat source, to avoid false signal for detection.  
  
Notice!  
Device must be wall-mounted vertically. Do not lay it flat or upside down while working.  
Do not mounted it in a wind gap, or cover its bottom, which may affect the detected data.

## Channels

The following table summarises the channels available for the MH10-PM2.5-WA/WD -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (PARTICULATE_MATTER) | sensor_particulate | sensor_particulate |  | Number | 
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number | 

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (PARTICULATE_MATTER)
Indicates the level of particulate matter.

The ```sensor_particulate``` channel is of type ```sensor_particulate``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Sensor (relative humidity)
Indicates the current relative humidity.

The ```sensor_relhumidity``` channel is of type ```sensor_relhumidity``` and supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 4 configuration parameters available in the MH10-PM2.5-WA/WD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 2 | PM2.5 report interval | =0 report disabled, ≥10 report when change ≥n*0.1μg/m³ |
| 3 | Temperature Report Interval | =0 report disabled, ≥10 report when change ≥n*0.1μg/m³ |
| 4 | Humidity Report Interval | =0 report disabled, ≥10 report when change ≥n*0.1μg/m³ |
| 255 | Factory Setting | 85 (0x55) to restore factory setting |

### Parameter 2: PM2.5 report interval

=0 report disabled, ≥10 report when change ≥n*0.1μg/m³

The following option values may be configured, in addition to values in the range 0 to 255 -:

| Value  | Description |
|--------|-------------|
| 0 | Report Disabled |
| 10 | Report every whole 1μg/m³ change (default) |

The manufacturer defined default value is ```10``` (Report every whole 1μg/m³ change (default)).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Temperature Report Interval

=0 report disabled, ≥10 report when change ≥n*0.1μg/m³

The following option values may be configured, in addition to values in the range 0 to 255 -:

| Value  | Description |
|--------|-------------|
| 0 | Report Disabled |
| 1 | Report if changed 0.5℃ |

The manufacturer defined default value is ```1``` (Report if changed 0.5℃).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Humidity Report Interval

=0 report disabled, ≥10 report when change ≥n*0.1μg/m³

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 255: Factory Setting

85 (0x55) to restore factory setting
Parameters will be set back to default values, association groups deleted.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Normal Operation |
| 85 | Reset to factory settings |

The manufacturer defined default value is ```0``` (Normal Operation).

This parameter has the configuration ID ```config_255_1_wo``` and is of type ```INTEGER```.
This is a write only parameter.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The MH10-PM2.5-WA/WD supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/1056/MH10-PM2-5-UM-Zwave-Plus.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1056).
