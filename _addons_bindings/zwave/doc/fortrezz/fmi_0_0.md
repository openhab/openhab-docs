---
layout: documentation
title: FMI - ZWave
---

{% include base.html %}

# FMI Flow Meter
This describes the Z-Wave device *FMI*, manufactured by *FortrezZ LLC* with the thing type UID of ```fortrezz_fmi_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![FMI product image](https://www.cd-jackson.com/zwave_device_uploads/934/934_default.jpg)


The FMI supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

With Flow meter, you have the power to automate, manage water consumption, and detect leaks in your home or building.

This is an integral part to a complete water management solution.  Flow Meter tracks water usage and reports gallons used.  Track your households water usage and drill into reports to find out where your peak consumption is and make changes to reduce your water bills.

Flow meter tells you if water is flowing or if it’s off.  It knows if the flow is small, like a running toilet, or if it’s large, like a garden hose left on.

Flow meter can detect leaks or fixtures left on.  It tracks usage and allows you create smart triggers using your Z-wave home automation system.  To add to it’s capabilities, flow meter checks the temperature in the nearby surrounds to detect for freezing conditions and sends temperature alerts.

There’s also a backup battery, just in case power is interrupted.  You won’t have to worry about lost data or lack of leak monitoring.  Plumbed on the water main, flow meter is sure to be a valuable part of your total home automation & leak prevention system.

### Inclusion Information

  1. Set up  the  inclusion  mode  at  the  controller;
  2. Press  the  switch  once  and  the  controller  will indicate the unit has been included in the network.  Also, the LED will blink when the inclusion completes. 

### Exclusion Information

  1. Set up the exclusion mode at the controller;
  2. Briefly press the switch once and then release.  The controller will indicate the unit has been removed from the network.  The LED will blink when the exclusion completes.

## Channels

The following table summarises the channels available for the FMI -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (general) | sensor_general | sensor_general |  | Number | 
| Water meter (amps) | meter_water_gallons | meter_water_gallons | Water | Number | 
| Alarm (heat) | alarm_heat | alarm_heat | Fire | Switch | 
| Alarm (flood) | alarm_flood | alarm_flood | Water | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

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

### Sensor (general)


The ```sensor_general``` channel is of type ```sensor_general``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Water meter (amps)
Indicates the instantaneous water consumption.

The ```meter_water_gallons``` channel is of type ```meter_water_gallons``` and supports the ```Number``` item and is in the ```Water``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```Fire``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (flood)
Indicates if the flood alarm is triggered.

The ```alarm_flood``` channel is of type ```alarm_flood``` and supports the ```Switch``` item and is in the ```Water``` category. This is a read only channel so will only be updated following state changes from the device.

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

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 6 configuration parameters available in the FMI.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Temperature Low Threshold | Temperature Low Threshold |
| 2 | Temperature High Threshold | Temperature High Threshold |
| 3 | Meter Count | Meter Count |
| 4 | Meter Report Interval | Meter Report Interval |
| 5 | Meter Leak Threshold | Meter Leak Threshold |
| 6 | Notification Commands MLS | Toggle Commands or MLS |

### Parameter 1: Temperature Low Threshold

Temperature Low Threshold

Values in the range -10 to 69 may be set.

The manufacturer defined default value is ```4```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Temperature High Threshold

Temperature High Threshold

Values in the range -9 to 70 may be set.

The manufacturer defined default value is ```70```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Meter Count

Meter Count
Count rolls over at 99,999,999
Values in the range 0 to 99999999 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_4``` and is of type ```INTEGER```.


### Parameter 4: Meter Report Interval

Meter Report Interval
Meter Report Interval, **while liquid flow is detected**.  If 0 is set, then no continuous reporting during liquid flow.  Note:  Report is sent every 10 hours whether or not flow is detected.

Default is 6, which is 60 seconds.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Meter Leak Threshold

Meter Leak Threshold
Meter Leak Threshold.  Set the threshold count for reporting Flow vs High Flow.  Default is set to 50 (5 gallons).

Flow above 5 gallons/min sends (Above Threshold / 255)

Flow below 5 gallons/min sends (Below Threshold / 128)

Note: If MLS enabled, Value of 0 = No flow detected (during interval)
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_5_2``` and is of type ```INTEGER```.


### Parameter 6: Notification Commands MLS

Toggle Commands or MLS
Notification Commands vs Multi-Level Sensor Toggle.

Notifications set as default - Value "0"

To enable MLS - Value set to any number except 0
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The FMI supports 4 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline
The controller should automatically set up this association.

  * Device Reset Locally (via 3 quick presses of the program switch)
  * Multilevel Sensor Temperature Report
  * Meter Pulse Report (flow count)
  * Notifications 
      * Under temperature detected
      * Over temperature detected
      * Power (Voltage Drop/Droop)

Association group 1 supports 5 nodes.

### Group 2: High Temperature

Basic Set Command with value = 0xFF is sent to the associated nodes to indicate that a Temperature High condition has been detected.  When the temperature is back in the normal range, one additional report with value = 0x00 is sent.

Association group 2 supports 5 nodes.

### Group 3: Low Temperature

Basic Set Command with value = 0xFF is sent to the associated nodes to indicate that a Temperature Low condition has been detected.  When the temperature is back in the normal range, one additional report with value = 0x00 is sent.

Association group 3 supports 5 nodes.

### Group 4: Flow Detected

Basic Set Command with value = 0xFF is sent when the meter count is incremented (i.e., flow has started).

Do not set associations for this group if water flow is expected.  When flow is not expected (for example, at a vacant vacation home), this association group can be set to perform various tasks such as commanding a water valve to open in order to stop the flow of water and/or commanding a siren/strobe unit to activate.  Since the Basic Set Command (value 0xFF) is sent every 30 seconds while the water is flowing; this commanding should be turned off by removing the associations in this group if water flow is normally expected.

Note that no command is ever sent with a value of 0x00 because the FMI cannot know if or when conditions have returned to normal.

Association group 4 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V8| |
| COMMAND_CLASS_METER_V2| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V7| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Flow Meter Technical Manual](https://www.cd-jackson.com/zwave_device_uploads/934/Flow-Meter-Technical-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/934).
