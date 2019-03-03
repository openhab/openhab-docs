---
layout: documentation
title: HE-ZW-THERM-FL2 - ZWave
---

{% include base.html %}

# HE-ZW-THERM-FL2 Wall Heating Thermostat
This describes the Z-Wave device *HE-ZW-THERM-FL2*, manufactured by *Heltun* with the thing type UID of ```heltun_hezwthermfl2_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![HE-ZW-THERM-FL2 product image](https://www.cd-jackson.com/zwave_device_uploads/1023/1023_default.jpg)


The HE-ZW-THERM-FL2 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Heltun Heating Thermostat is built control the heating and mesures not only the room temperature with the build in sensor, but also humidity and the floor temperature if a sensor is attached.

### Inclusion Information

**To include the thermostat in the Z-Wave network**

  1. Go to the “SETTINGS” mode by pressing and holding the settings button for 3 seconds
  2. Go to “Parameter 29 – nEt” of the menu by using the heating button for scrolling up and the “MODE” key for scrolling down in parameters.
  3. In the value position will be seen the current state of the network. It should be ECL. If Inc is indicated, anexclusion must be first performed.
  4. Start the inclusion mode from the gateway
  5. Press “+” key to start inclusion process. Lines will be moving in value position.
  6. The “Inc” should appear in the value position if the inclusion has been successful. The “Err” will appear if the inclusion was not completed.

**Note:** In case the device has been part of the Z-Wave network before and not excluded since, inclusion is not possible. In this case, exclusion must be performed before inclusion. If the thermostat is included in the network, in the bottom right corner of the main screen the  
antenna icon will be displayed with connection lines. If not on the network then it will be displayed without lines.

**Security:** S0, S2 unauthorized and S2 authorized inclusion modes are supported. If you use S2 authorized inclusion mode the security key should be used in inclusion process.

**NOTE:** Be sure to save this key. Without the key it is impossible to perform an inclusion in S2 authorized mode.

### Exclusion Information

**To exclude the thermostat from the Z-Wave network**

  1. Go to “SETTINGS” mode by pressing and holding the settings button for 3 seconds
  2. Go to “Parameter 29 – nEt” of the menu
  3. In the value position the current state of network state will be displayed. It should be “Inc”. if the “ECL” is indicated the device is already excluded.
  4. Start the exclusion from the gateway.
  5. Press the “–” key to start the exclusion process. Lines will be moving in the value position.
  6. The “Ecl” should appear with successful deletion. If the “Err” appear then start the exclusion process again.

## Channels

The following table summarises the channels available for the HE-ZW-THERM-FL2 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (luminance) | sensor_luminance | sensor_luminance |  | Number | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number | 
| Sensor (soil temperature) | sensor_soiltemperature | sensor_temperature | Temperature | Number:Temperature | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Operating State | thermostat_state | thermostat_state | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Clock Time Offset | time_offset | time_offset | Temperature | Number | 

### Sensor (luminance)
Indicates the current light reading.

The ```sensor_luminance``` channel and is of type ```sensor_luminance``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel and is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (relative humidity)
Indicates the current relative humidity.

The ```sensor_relhumidity``` channel and is of type ```sensor_relhumidity``` and supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (soil temperature)
Indicates the current temperature.

The ```sensor_soiltemperature``` channel and is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel and is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel and is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Thermostat mode
Sets the thermostat.

The ```thermostat_mode``` channel and is of type ```thermostat_mode``` and supports the ```Number``` item and is in the ```Temperature``` category.
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

### Operating State
Sets the thermostat operating state.

The ```thermostat_state``` channel and is of type ```thermostat_state``` and supports the ```Number``` item and is in the ```Temperature``` category.
The following state translation is provided for this channel to the ```Number``` item type -:

| Value | Label     |
|-------|-----------|
| 0 | Idle |
| 1 | Heating |
| 2 | Cooling |
| 3 | Fan Only |
| 4 | Pending Heat |
| 5 | Pending Cool |
| 6 | Vent / Economiser |

### Setpoint (heating)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel and is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Clock Time Offset
Provides the current time difference for the devices time.

The ```time_offset``` channel and is of type ```time_offset``` and supports the ```Number``` item and is in the ```Temperature``` category.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The HE-ZW-THERM-FL2 supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Used to connect Z-Wave gateway

Association group 1 supports 10 nodes.

### Group 2: Basic Set command

It sends Basic Set command with value 0 (Off state) when thermostat goes to IDLE mode and sends 255 (ON state) when the thermostat goes to HEATING mode.

Association group 2 supports 10 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V10| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_OPERATING_STATE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_CLOCK_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Heltun Heating Thermostat Manual](https://www.cd-jackson.com/zwave_device_uploads/1023/HELTUN-Heating-Thermostat-Manual-v1-0.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1023).
