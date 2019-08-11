---
layout: documentation
title: Energy Switch + - ZWave
---

{% include base.html %}

# Energy Switch + Energy Switch +
This describes the Z-Wave device *Energy Switch +*, manufactured by *[BeNext](http://www.benext.eu/)* with the thing type UID of ```benext_energyswitch_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![Energy Switch + product image](https://www.cd-jackson.com/zwave_device_uploads/445/445_default.png)


The Energy Switch + does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Control and monitor your lightning or any other appliance.

During operation mode it will measure the instance and accumulated energy consumption of the applied appliance.

Easy plug and play.

### Inclusion Information

Press and hold the push button until the indicator light is blinking than release the button

### Exclusion Information

Press and hold the push button until the indicator light is blinking than release the button

### Wakeup Information

The Energy Switch + does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Channels

The following table summarises the channels available for the Energy Switch + -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 9 configuration parameters available in the Energy Switch +.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Set to Default | If value is set to 0XFF (255), device set to default |
| 2 | Amount of decimals | If value is set to 1 the info shall be presented with 1 decimal |
| 3 | Power Limit  | The device will shut down when it reaches an amount higher then defined (W) |
| 4 | Start up with last known socket status | Start up with last known socket status |
| 6 | Auto report % | The value will change when the % is changed. |
| 7 | Auto report Watt | The value will change when the Watt is changed. |
| 8 | Auto report time | The time between 2 of the meter rerport |
| 9 | Relais delay time | The time that needs to pass before the next state change |
| 10 | Led indicator | The state of the Led compared to the relais state |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Set to Default

If value is set to 0XFF (255), device set to default

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Amount of decimals

If value is set to 1 the info shall be presented with 1 decimal
0,1,2,3 amount of decimals. Every Amount higher then 3 shall be printed as 3 decimals.
Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Power Limit 

The device will shut down when it reaches an amount higher then defined (W)
0 = no power limit.

1-4500 are acceptable values and can be used, everything above the 4500 shall be changed to 4500.
Values in the range 0 to 4500 may be set.

The manufacturer defined default value is ```4500```.

This parameter has the configuration ID ```config_3_2``` and is of type ```INTEGER```.


### Parameter 4: Start up with last known socket status

Start up with last known socket status
  * If 0 then the device will always be off, when
  * If 1-255 hen the device will remain the last known state
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 6: Auto report %

The value will change when the % is changed.

Values in the range 10 to 100 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Auto report Watt

The value will change when the Watt is changed.

Values in the range 5 to 255 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Auto report time

The time between 2 of the meter rerport

Values in the range 10 to 255 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Relais delay time

The time that needs to pass before the next state change
Value * 10 miliseconds
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Led indicator

The state of the Led compared to the relais state
0 = Indication Led never off

1 = led ON when relais ON

2 = led On when relais OFF
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.

### Switch All Mode

Set the mode for the switch when receiving SWITCH ALL commands.

The following option values may be configured -:
| Value  | Description |
|--------|-------------|
| 0 | Exclude from All On and All Off groups |
| 1 | Include in All On group |
| 2 | Include in All Off group |
| 255 | Include in All On and All Off groups |

This parameter has the configuration ID ```switchall_mode``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Energy Switch + supports 1 association group.

### Group 1: Report


Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_CRC_16_ENCAP_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_PROTECTION_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/445/energyswitchrs.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/445).
