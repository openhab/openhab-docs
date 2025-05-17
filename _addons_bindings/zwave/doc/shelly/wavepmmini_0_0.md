---
layout: documentation
title: Wave PM Mini - ZWave
---

{% include base.html %}

# Wave PM Mini Z-Wave smart power meter, 1 channel 16 A
This describes the Z-Wave device *Wave PM Mini*, manufactured by *Shelly* with the thing type UID of ```shelly_wavepmmini_00_000```.

The device is in the category of *Battery*, defining Batteries, Energy Storages.

![Wave PM Mini product image](https://opensmarthouse.org/zwavedatabase/1638/image/)


The Wave PM Mini supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Device is a small form factor smart power meter, which allows remote monitoring of an electric appliance's power consumption with a load of up to 16 A.

### Inclusion Information

  1. Connect the Device to a power supply.
  2. Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.
  3. Enable add/remove mode on the gateway.
  4. To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.
  5. Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the Learn mode.
  6. The blue LED will be blinking in Mode 2 during the adding process.
  7. The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

### Exclusion Information

  1. Connect the Device to a power supply.
  2. Check if the green LED is blinking in Mode 1. If so, the Device is added to a Z-Wave® network.
  3. Enable add/remove mode on the gateway.
  4. To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.
  5. Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the LEARN MODE.
  6. The blue LED will be blinking in Mode 2 during the removing process.
  7. The blue LED will be blinking in Mode 1 if the Device is successfully removed from a Z-Wave® network.

Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

### General Usage Information



## Channels

The following table summarises the channels available for the Wave PM Mini -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Reset the total power consumption | meter_reset | meter_reset | Energy | Switch | 
| Alarm (heat) | alarm_heat | alarm_heat | Fire | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Reset the total power consumption
Reset the meter.

The ```meter_reset``` channel is of type ```meter_reset``` and supports the ```Switch``` item and is in the ```Energy``` category.

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```Fire``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 6 configuration parameters available in the Wave PM Mini.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 36 | O (O1) Power report on change | Minimum change in consumed power that will result in sending a new report to the gateway. |
| 39 | Minimum time between reports (O) O1 | Minimum time that must elapse before a new power report on O (O1) is sent to the gateway. |
| 120 | Factory Reset | Reset to factory default settings and removed from the Z-Wave network |
| 201 | Serial Number 1 | Part of device’s serial number. |
| 202 | Serial Number 2 | Part of device’s serial number. |
| 203 | Serial Number 3 | Part of device’s serial number. |

### Parameter 36: O (O1) Power report on change

Minimum change in consumed power that will result in sending a new report to the gateway.
0 - reports are disabled  
1-100 (1-100%) - change in power

NOTE: Regardless of the power consumption change in percentage, the report will not be sent more frequently than defined by Parameter No. 39.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_36_1``` and is of type ```INTEGER```.


### Parameter 39: Minimum time between reports (O) O1

Minimum time that must elapse before a new power report on O (O1) is sent to the gateway.
0 - reports are disabled  
1-120 (1-120s) - report interval

NOTE: This Parameter is in relation to Parameter No. 36.  


NOTE: Setting the value to less than 30s can cause the Z-Wave network congestion state (slow Device response and decreased network stability).
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_39_1``` and is of type ```INTEGER```.


### Parameter 120: Factory Reset

Reset to factory default settings and removed from the Z-Wave network
0 - Don’t do Factory reset  
1 - Do the Factory resetThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_120_1``` and is of type ```INTEGER```.


### Parameter 201: Serial Number 1

Part of device’s serial number.
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_201_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 202: Serial Number 2

Part of device’s serial number.
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_202_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 203: Serial Number 3

Part of device’s serial number.
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_203_4``` and is of type ```INTEGER```.
This is a read only parameter.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The device does not support associations.
## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_METER_V3| |
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

* [Shelly Wave PM Mini user guide](https://opensmarthouse.org/zwavedatabase/1638/reference/Wave_PM_mini_user_guide_multilang_2023_print_v2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1638).
