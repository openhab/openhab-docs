---
layout: documentation
title: TRV-1ZW - ZWave
---

{% include base.html %}

# TRV-1ZW Thermostatic Radiator Valve
This describes the Z-Wave device *TRV-1ZW*, manufactured by *Climax Technology, Ltd.* with the thing type UID of ```climax_trv1zw_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![TRV-1ZW product image](https://opensmarthouse.org/zwavedatabase/1482/image/)


The TRV-1ZW supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

TRV-1ZW is a Z-Wave Radiator Valve is designed to control the surrounding temperature by controlling the flow of hot water of radiators in the Z-Wave network, i.e. indoor room temperatures.

### Inclusion Information

  1. Remove the Radiator Valve back cover and insert 2 AA Alkaline batteries to power up the Radiator Valve, LCD will display InS and icon will flash to indicate Radiator Valve’s motor is working.
  2. Put Z-Wave control panel into Inclusion mode (please refer to the Z-Wave control panel manual).
  3. Within 1.5 seconds, press the Boost Button 3 times
  4. Refer to operation manual of the Z-Wave gateway or control panel to complete the adding process.
  5. If the device has already been added (included) into another Z-Wave Gateway/Control Panel, or if the device is unable to be added into the current Z-Wave Gateway/Control Panel, try removing it first (see Removing Device).
  6. When the motor stops working and icon changes to steady on, attach the Valve cap to the pipe. 
  7. Rotating the Valve cap clockwise to tighten the Radiator Valve.
  8. Press the Auto/Manual button, LCD displays AdA and valve motor starts working again, the icon will flash. The device motor is measuring the distance to adjust the current temperature. 
  9. When the valve motor stops, the system will enter Manual mode with LCD displaying the default set temperature 18.5°C, the installation is now complete.
 10. After joining Z-Wave network and completing installation, the Z-Wave connection icon will appear on LCD display.
 11. If Radiator Valve loses connection to current Z-Wave network, the Z-Wave connection icon will disappear. Please check Z-Wave network condition and Radiator Valve signal range to correct the situation.

### Exclusion Information

  1. Put the Z-Wave gateway or control panel into Exclusion mode (please refer to the Z-Wave or control panel manual).
  2. Within 1.5 seconds, press Boost Button 3 times and device will be removed from Z-Wave network.

### General Usage Information

Press and hold the Boost Button for 10 seconds to factory reset.

## Channels

The following table summarises the channels available for the TRV-1ZW -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 

### Thermostat mode
Sets the thermostat.

The ```thermostat_mode``` channel is of type ```thermostat_mode``` and supports the ```Number``` item and is in the ```Temperature``` category.
The following state translation is provided for this channel to the ```Number``` item type -:

| Value | Label     |
|-------|-----------|
| 0 | Off |
| 1 | Heat |
| 2 | Cool |
| 3 | Auto |
| 4 | Aux Heat |
| 5 | Resume |
| 6 | Fan Only |
| 7 | Furnace |
| 8 | Dry Air |
| 9 | Moist Air |
| 10 | Auto Changeover |
| 11 | Heat Economy |
| 12 | Cool Economy |
| 13 | Away |



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The TRV-1ZW supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Group 1 for “LifeLine”
Battery Report CC

Device Reset Locally CC (COMMAND\_CLASS\_DEVICE\_RESET\_LOCALLY)

Thermostat mode CC

Thermostat Setpoint CC

Sensor Multilevel CC

Association group 1 supports 3 nodes.

### Group 2: Thermostat Operating State

Group 1 for “Thermostat Operating State”
Thermostat Operating State CC

Association group 2 supports 3 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |

### Documentation Links

* [TRV-1ZW_(OTA)_20210730.pdf](https://opensmarthouse.org/zwavedatabase/1482/reference/TRV-1ZW_OTA_20210730.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1482).
