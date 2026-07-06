---
layout: documentation
title: Heatit Z-HAN2 - ZWave
---

{% include base.html %}

# Heatit Z-HAN2 Z-Wave HAN sensor for AMS meters (smart meters).
This describes the Z-Wave device *Heatit Z-HAN2*, manufactured by *ThermoFloor* with the thing type UID of ```thermofloor_heatitzhan2_00_000```.

The device is in the category of *Battery*, defining Batteries, Energy Storages.

![Heatit Z-HAN2 product image](https://opensmarthouse.org/zwavedatabase/1649/image/)


The Heatit Z-HAN2 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Heatit Z-HAN2 is a Z-Wave HAN sensor for AMS meters (smart meters). Heatit Z-HAN2 works with HAN ports.

The Heatit Z-HAN 2 is equipped with an RJ45 port for connecting the AMS meter. The Heatit Z-HAN2 can be powered through the RJ45 port by most AMS meters, but also has a 5V micro USB input for external power supply.  
**  
Features:**

  * Z-Wave HAN sensor
  * RJ45 and Micro-USB
  * Active power metering
  * SmartStart
  * Firmware Update (OTA)
  * Temperature sensor
  * Supports encryption mode S0, S2 Authenticated Class,
  * S2 Unauthenticated Class

**Technical data:**  


  * IOT Protocol: Z-Wave - 868.4 MHz (EU)
  * Voltage: 5V DC (Micro-USB)
  * Protection grade (IP): IP20
  * Ambient humidity (RH non-condensing %): 10-85
  * Declarations: RoHS, Reach
  * International standard: CE, Z-Wave Plus
  * Signal range radio frequency (max no. meters): 40
  * IOT Chip type: Z-Wave 800 chip
  * Z-Wave encryption mode: S0, S2 Authenticated Class, S2 Unauthenticated Class, AES-128 encryption

### Inclusion Information

**Quick start:**  


  1. Contact your energy company to activate your HAN-port.
  2. Connect power to the Z-HAN2 with a micro USB cable.
  3. Set the primary controller to add mode (security/non-security).
  4. Press the reset button 3 times in a rapid sequence. Heatit Z-HAN2 is now included in your Z-Wave network.
  5. Open your main fuse box.
  6. Plug the RJ45 cable into the energy meter and the Z-HAN2.

### Exclusion Information

When the device is removed from the network, it will NOT revert to factory settings. An always listening node must be powered continuously and reside in a fixed position in the installation to secure the routing table. Adding the device within a 2 meters range from the gateway can minimize faults during the Interview process.  
  
**Removing via primary controller/gateway:**  


  
Add/remove mode is indicated on the device by a blinking green LED. It indicates this for 90 seconds until a timeout occurs, or until the module has been added to/removed from the network. Configuration mode can also be cancelled by performing the same procedure used for starting Configuration mode.  
  
To start the configuration process, press the reset button 3 times in rapid sequence. The LED will light up in solid green for 3 seconds if add/remove is successful. The device is now ready for use with default settings. NB! When the device is removed from the gateway, the parameters are not reset. To reset the parameters, see ”Factory reset”.  
**  
Removing via factory reset:**  
  
Press and hold the configuration button. After 3 seconds the LED will start to blink green. After 20 seconds the LED will start blinking green rapidly. You may now release the button. If reset was successful, the LED will light up in solid green for 3 seconds_._ _Please use this procedure only when the network primary controller is missing or otherwise inoperable._

### General Usage Information



## Channels

The following table summarises the channels available for the Heatit Z-HAN2 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (kVAh) | meter_kvah | meter_kvah | Energy | Number | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Electric meter (amps)
Indicates the instantaneous current consumption.

The ```meter_current``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kVAh)
Indicates the energy consumption (kVAh).

The ```meter_kvah``` channel is of type ```meter_kvah``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 11 configuration parameters available in the Heatit Z-HAN2.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Meter report hysteresis for W |  |
| 2 | Meter report hysteresis for V |  |
| 3 | Meter report hysteresis for A |  |
| 4 | Meter report interval for W |  |
| 5 | Meter report interval for V and A |  |
| 6 | Temperature report interval |  |
| 7 | Temperature report hysteresis | This parameter has 0.5 °C increments |
| 8 | Sensor calibration | To set a negative value, use 256 and subtract the desired value. |
| 9 | Serial | This parameter is read only. |
| 10 | Number | This parameter is read only. |
| 11 | Scaling factor |  |

### Parameter 1: Meter report hysteresis for W



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |

The manufacturer defined default value is ```200```.

This parameter has the configuration ID ```config_1_4``` and is of type ```INTEGER```.


### Parameter 2: Meter report hysteresis for V



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Meter report hysteresis for A



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_3_2``` and is of type ```INTEGER```.


### Parameter 4: Meter report interval for W



Values in the range 10 to 65535 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_4_2``` and is of type ```INTEGER```.


### Parameter 5: Meter report interval for V and A



Values in the range 10 to 65535 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_5_2``` and is of type ```INTEGER```.


### Parameter 6: Temperature report interval



Values in the range 30 to 65535 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.


### Parameter 7: Temperature report hysteresis

This parameter has 0.5 °C increments

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Sensor calibration

To set a negative value, use 256 and subtract the desired value.

Values in the range -60 to 60 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Serial

This parameter is read only.
First half of the meter point serial number.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_9_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 10: Number

This parameter is read only.
Last half of the meter point serial number.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_10_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 11: Scaling factor


Allows for multiplication of the meter value in case of use with large electrical systems.
Values in the range 0 to 1000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Heatit Z-HAN2 supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

### Group 2: Meter Report


Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V10| |
| COMMAND_CLASS_METER_V3| |
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

* [manual](https://opensmarthouse.org/zwavedatabase/1649/reference/Heatit_Z-HAN2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1649).
