---
layout: documentation
title: HEATIT Z-RELAY - ZWave
---

{% include base.html %}

# HEATIT Z-RELAY Multipurpose relay
This describes the Z-Wave device *HEATIT Z-RELAY*, manufactured by *ThermoFloor* with the thing type UID of ```thermofloor_heatitzrelay_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![HEATIT Z-RELAY product image](https://www.cd-jackson.com/zwave_device_uploads/898/898_default.jpg)


The HEATIT Z-RELAY supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Heatit Z-Relay is a Z-Wave module in a water-resistant housing equipped with 10 x membrane cable entries. 

The Heatit Z-Relay is equipped with 1 relay output and 3 multi-purpose inputs, and a Z-Wave radio for interfacing to the wireless Z-Wave network. The module must be power supplied from a 230V AC mains connection. 

This heavy-duty relay can be freely controlled from the Z-Wave network, and can be used for several purposes, e.g. control of valve actuators, stoves etc. 

Two of the Heatit Z-Relay inputs can be configured to function as either digital inputs or as analogue inputs for interfacing simple NTC temperature sensors. When the inputs are used as digital inputs, they can be connected to potential free contacts, open-collector outputs, and will be able to control other Z-Wave devices when the status of the inputs sent to other Z-Wave devices on the Z-Wave network. The last input can be used as either digital input or be used to be connected to a flood detector. 

It is possible to configure the level- and the indication of the status indicator LED on the modules circuit board.

### Inclusion Information

On delivery, the device does not belong to any Z-Wave network. The device needs to be added to an existing wireless network to communicate with the devices of this network. Devices can also be removed from a network. Both add and remove process are initiated by the primary controller of the Z-Wave network. This controller will be turned into a mode for adding or removing devices. Please refer to your primary controller’s manual on how to turn your controller into add or remove mode. Only if the primary controller is in add or remove mode, this device can be added or removed from the network. When the device is removed from the network, it will set the device back to factory default. 

If the device already belongs to a network, follow the remove process before adding it in your network. Otherwise, the adding of this device will fail. Place your primary controller in Adding Mode by following the manufacturer’s instructions, then activate the add mode on the device by clicking the inclusion button in the module. The Adding Mode is indicated by status LED is blinking until a timeout occurs after 10 seconds or if the module has been added to the Z-Wave network.  

### Exclusion Information

The device is removed in the same manner, when the controller is put into Removing Mode. 

### General Usage Information

1. Inputs

1.1.   Temperature inputs

Input 1 and 2 can be used as temperature inputs by connecting NTC sensors the inputs, the type of NTC sensor can be configured by means of configuration parameter 3 and 4. 

A temperature offset can be configured for each of the inputs by means of configuration parameter 5 and 6. 

1.2.   Flood sensor input

Input 3 is a flood sensor input where it is possible to connect a simple flood sensor.

The flood sensor can be left lying on the floor (on an electrically insulating surface), or attached to the floor or to a wall. Designed for flood detection, senses water and other electrically conductive liquids. The sensitivity of the sensor can be configured by means of configuration parameter 14. 

It is possible for the flood input directly to be able to control the SRM relay output, either to turn the relay output ON or OFF when flood is detected, or when no flood is detected, see configuration parameter 12 and 13.

2. Relay Output

The relay output is a high power “normally open” (NO) contact, that can be used for several purposes. 

It is possible to control the relay from the Z-Wave network, or it can be controlled by the flood sensor input. 

The Heatit Z-Relay monitors the current used by the load connected to the relay output. The energy that the load consumes is calculated by means of the measured current and the voltage entered in configuration parameter 15. Energy data is sent to the controller through the Z-Wave network. These data values that the controller is able to receive are; current (A), power (Watt) and the energy consumed over time (kWh).

## Channels

The following table summarises the channels available for the HEATIT Z-RELAY -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Electric meter (amps) 1 | meter_current1 | meter_current | Energy | Number | 
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number | 
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number | 
| Sensor (temperature) 2 | sensor_temperature2 | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (temperature) 3 | sensor_temperature3 | sensor_temperature | Temperature | Number:Temperature | 
| Alarm 4 | alarm_general4 | alarm_general | Alarm | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (amps)
Indicates the instantaneous current consumption.

The ```meter_current``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Switch 1
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (amps) 1
Indicates the instantaneous current consumption.

The ```meter_current1``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh) 1
Indicates the energy consumption (kWh).

The ```meter_kwh1``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 1
Indicates the instantaneous power consumption.

The ```meter_watts1``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (temperature) 2
Indicates the current temperature.

The ```sensor_temperature2``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (temperature) 3
Indicates the current temperature.

The ```sensor_temperature3``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Alarm 4
Indicates if an alarm is triggered.

The ```alarm_general4``` channel is of type ```alarm_general``` and supports the ```Switch``` item and is in the ```Alarm``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 18 configuration parameters available in the HEATIT Z-RELAY.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Status LED. | Configuration of the status LED. |
| 2 | Status LED brightness level. | Configure the percentage of light in the status LED, when the LED is turned on |
| 3 | Thermistor type for input 1. | Configures the thermistor type connected to input 1. |
| 4 | Thermistor type for input 2.  | Configures the thermistor type connected to input 2. VALUE DESCRIPTION |
| 5 | Temperature offset on input 1.  | Configures a temperature offset, input 1. |
| 6 | Temperature offset on input 2. | Configures a temperature offset, input 2. |
| 7 |  Time interval for reports sent about input 1.  | Configures the time interval between when sensor reports, input 1. |
| 8 | Time interval for reports sent about input 2.  | Configures the time interval between when sensor reports, input 2. |
| 9 | Time interval input 3 reports. | Configures time interval for notification reports, flood input 3. |
| 10 | Time interval between meter reports. | Time interval between meter reports. |
| 11 | Flood steady timer | Input 3 steady time. |
| 12 | Auto relay on. | Configures internal states that will cause the relay to be turned on. |
| 13 | Auto relay off. | Configures internal states that will cause the relay to be turned off. |
| 14 | Flood detection threshold.  | Configures the threshold for input 3 that will cause a flood to be detected. |
| 15 | Voltage. | Voltage value used for power calculation. |
| 16 | Ampere | NOT USED |
| 17 | Digital value per ampere. | DO NOT CHANGE THIS VALUE, UNLESS INSTRUCTED TO. |
| 18 | Size of load connected on the relay output.  | Actual load in Watt. |

### Parameter 1: Status LED.

Configuration of the status LED.
0 = LED turned off. 

1 = LED turned on. (Default) 

2 = LED flashing at 1 second intervals (½ Hz). 

3 = LED flashing at ½ second interval (1 Hz).
Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Status LED brightness level.

Configure the percentage of light in the status LED, when the LED is turned on
0 - 100 = Specifies the brightness level of the LED when it is on. Default is 50.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Thermistor type for input 1.

Configures the thermistor type connected to input 1.
0 = Input disabled. (Default). 

1 = 10K NTC (TEWA PART NUMBER: TT02-10KC3-93D-3000R-TPH) 
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Thermistor type for input 2. 

Configures the thermistor type connected to input 2. VALUE DESCRIPTION
0 = Input disabled. (Default). 

1 = 10K NTC (TEWA PART NUMBER: TT02-10KC3-93D-3000R-TPH) 
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Temperature offset on input 1. 

Configures a temperature offset, input 1.
Configures a temperature offset that can be added to the measured temperature in order to get a more accurate measurement from the thermistor on input 1.

-40  40 =  -4,0 – 4,0°C. Value is added to the temperature measurement. (Default is 0). 
Values in the range -40 to 40 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Temperature offset on input 2.

Configures a temperature offset, input 2.
Configures a temperature offset that can be added to the measured temperature in order to get a more accurate measurement from the thermistor on input 2. 

-40  40 =  -4,0 – 4,0°C. Value is added to the temperature measurement. (Default is 0).
Values in the range -40 to 40 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7:  Time interval for reports sent about input 1. 

Configures the time interval between when sensor reports, input 1.
Configures the time interval between when sensor reports are transmitted for input 1. 

0 – 8,640 = 0 – 864 seconds. Default value is 6 (60 seconds) which will cause a report to be sent every minute. 
Values in the range 0 to 8640 may be set.

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_7_2``` and is of type ```INTEGER```.


### Parameter 8: Time interval for reports sent about input 2. 

Configures the time interval between when sensor reports, input 2.
Configures the time interval between when sensor reports are transmitted for input 2.

0 – 8,640 = 0 – 864 seconds. Default value is 6 (60 seconds) which will cause a report to be sent every minute.  
Values in the range 0 to 8640 may be set.

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_8_2``` and is of type ```INTEGER```.


### Parameter 9: Time interval input 3 reports.

Configures time interval for notification reports, flood input 3.
Configures the time interval between when notification reports for flood input 3.

0 – 8,640 = 0 – 864 seconds. Default value is 2 (20 seconds) which will cause reports to be sent every 20 seconds.
Values in the range 0 to 8640 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_9_2``` and is of type ```INTEGER```.


### Parameter 10: Time interval between meter reports.

Time interval between meter reports.
Configures the time interval between when meter reports for reporting the energy (kWh) consumed by the load connected to the relay output. 

0 – 8,640 = 0 – 864 seconds. Default value is 90 (900 seconds) which will cause reports to be sent every 15 minute.
Values in the range 0 to 8640 may be set.

The manufacturer defined default value is ```90```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Flood steady timer

Input 3 steady time.
Configures the time that the flood input (input 3) has to be steady before the state is accepted as a valid state. 

0 – 60 = 0 – 60 seconds. Default value is 6 (6 seconds) before a state is accepted as valid. 
Values in the range 0 to 60 may be set.

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Auto relay on.

Configures internal states that will cause the relay to be turned on.
0 = Relay is not turned on automatically. 

1 = The relay is turned on when a flood is detected. (Default) 

2 = The relay is turned off when no flood is detected.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Auto relay off.

Configures internal states that will cause the relay to be turned off.
0 = Relay is not turned off automatically. 

1 = The relay is turned off when a flood is detected. 

2 = The relay is turned off when no flood is detected. (Default)
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Flood detection threshold. 

Configures the threshold for input 3 that will cause a flood to be detected.
0 - 4095 = Low value means a low detection threshold, high value will cause the input to be more sensitive. Default value is 2048.
Values in the range 0 to 4095 may be set.

The manufacturer defined default value is ```2048```.

This parameter has the configuration ID ```config_14_2``` and is of type ```INTEGER```.


### Parameter 15: Voltage.

Voltage value used for power calculation.
Configures the value used for power calculation, as only the current for the load on the relay output is measured.

0 – 250  = 0 – 250 Volt. Default value is 220.
Values in the range 0 to 250 may be set.

The manufacturer defined default value is ```220```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 16: Ampere

NOT USED
0 - 255 = Default value is 0.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 17: Digital value per ampere.

DO NOT CHANGE THIS VALUE, UNLESS INSTRUCTED TO.
0 - 255 = 0 – 255. Default value is 81 which is corresponds to the current sensor ACS722LLCTR-20AB.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```81```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Size of load connected on the relay output. 

Actual load in Watt.
Configures a constant value that will be used in power metering when this value is different from 0.  This value specifies the actual load in Watt used for power metering. 

0 – 6000 = 0 – 6000 Watt. Default value is 0.
Values in the range 0 to 6000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_18_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The HEATIT Z-RELAY supports 6 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline group for the entire module. Sends Basic Report On / Off when the relay is turned on or off. Sends Meter Report with energy data for the load connected to the relay output.

Association group 1 supports 1 node.

### Group 2: Sensor Multilevel Report Input 1

Sends Sensor Multilevel Report for input 1. Nodes in this group will receive information of the current temperature measured by the NTC connected to input 1.

Association group 2 supports 5 nodes.

### Group 3: Sensor Multilevel Report for Input 2

Sends Sensor Multilevel Report for input 2. Nodes in this group will receive information of the current temperature measured by the NTC connected to input 2.

Association group 3 supports 5 nodes.

### Group 4: Basic Report On / Off

Nodes in this group receives Basic Report On / Off when the flood sensor detects a flood. Normally used for visualization in the Controller.

Association group 4 supports 5 nodes.

### Group 5: Basic Set On / Off

Nodes in this group receives Basic Set On / Off when the flood sensor detects a flood.

Association group 5 supports 5 nodes.

### Group 6: Notification Report

Nodes in this group receives Notification Report when the flood sensor detects a flood. The notification events reported are: ”Water leak detected ”0x02 and ”ldle” 0x00.

Association group 6 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |

### Documentation Links

* [Heatit Z-Relay](https://www.cd-jackson.com/zwave_device_uploads/898/manual-heatit-z-relay--2-.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/898).
