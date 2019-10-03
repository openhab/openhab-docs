---
layout: documentation
title: NAS-WR01ZE - ZWave
---

{% include base.html %}

# NAS-WR01ZE Wall Plug Switch
This describes the Z-Wave device *NAS-WR01ZE*, manufactured by *[Shenzhen Neo Electronics Co., Ltd](http://www.szneo.com/)* with the thing type UID of ```shenzhen_coolcampwrplug_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![NAS-WR01ZE product image](https://www.cd-jackson.com/zwave_device_uploads/1014/1014_default.jpg)


The NAS-WR01ZE supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

This Plug provides line voltage, current load, power consumption and energy consumption measuring. 

  * Voltage – The Supply Power Voltage For Plug.
  * Current – The Current for the Electric Device Connect to Plug Consumption.
  * Power – Power Consumed by an Electric Device in an instant, unit: Watt (W).
  * Energy – Energy Consumed by an Electric Device through a Time Period. Most commonly measured in Kilowatt-hours (kWh). One kilowatt-hour is Equal to One Kilowatt of Power Consumed over a Period of One Hour, 1kWh = 1000Wh.0Wh. 

### Inclusion Information

  1. Make sure the sensor is powered.
  2. Set Z‐Wave controller or Z‐Wave gateway into inclusion mode (Refer to the controller or gateway operating manual)
  3. Press the button three times within 1.5 second, the device will enter inclusion mode. And the LED will flash on and off with green alternately five times within 2 seconds.

### Exclusion Information

  1. Make sure the sensor is powered.
  2. Set Z‐Wave controller or Z‐Wave gateway into exclusion mode (Refer to the controller or gateway operating manual)
  3. Press the button three times within 1.5 second, the device will enter exclusion mode. And the LED will flash on and off with yellow alternately five times within 2 seconds.

## Channels

The following table summarises the channels available for the NAS-WR01ZE -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Clear Accumulated Energy | meter_reset | meter_reset | Energy | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps)
Indicates the instantaneous current consumption.

The ```meter_current``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Clear Accumulated Energy
Reset the meter.

The ```meter_reset``` channel is of type ```meter_reset``` and supports the ```Switch``` item and is in the ```Energy``` category.

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 11 configuration parameters available in the NAS-WR01ZE.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Relay On/Off State Saved Disable | Relay On/Off State Saved Disable |
| 2 | Button Switch Function Disable | Button Switch Function Disable |
| 3 | LED indication Disable | LED indication Disable |
| 4 | Timer Enable | Timer Enable |
| 5 | Timing Length Setting | Timing Length Setting |
| 6 | Meter reporting function | Meter reporting function |
| 7 | Interval of meter reporting setting | Interval of meter reporting setting |
| 8 | Maximum output current setting | Maximum output current setting |
| 9 | Current Differential Setting | Current Differential Setting |
| 10 | Current Alarm Value | Current Alarm Value |
| 11 | Clear Accumulated Energy | Clear accumulated energy |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Relay On/Off State Saved Disable

Relay On/Off State Saved Disable

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Do not save Relay State |
| 1 | Save Relay State |

The manufacturer defined default value is ```1``` (Save Relay State).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Button Switch Function Disable

Button Switch Function Disable

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Button disabled |
| 1 | Button enabled |

The manufacturer defined default value is ```1``` (Button enabled).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: LED indication Disable

LED indication Disable

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable LED |
| 1 | Enable LED |

The manufacturer defined default value is ```1``` (Enable LED).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Timer Enable

Timer Enable

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Timer Disable |
| 1 | Timer Enable |

The manufacturer defined default value is ```0``` (Timer Disable).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Timing Length Setting

Timing Length Setting

Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```120```.

This parameter has the configuration ID ```config_5_2``` and is of type ```INTEGER```.


### Parameter 6: Meter reporting function

Meter reporting function

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable Meter Report |
| 1 | Enable Meter Report |

The manufacturer defined default value is ```1``` (Enable Meter Report).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Interval of meter reporting setting

Interval of meter reporting setting

Values in the range 30 to 32767 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_7_2``` and is of type ```INTEGER```.


### Parameter 8: Maximum output current setting

Maximum output current setting
The Value must be greather than the alarm value defined in Parameter 10
Values in the range 1 to 16 may be set.

The manufacturer defined default value is ```16```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Current Differential Setting

Current Differential Setting

Values in the range 1 to 1600 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_9_2``` and is of type ```INTEGER```.


### Parameter 10: Current Alarm Value

Current Alarm Value
The Value must be less than the max. output value defined in Parameter 8
Values in the range 1 to 15 may be set.

The manufacturer defined default value is ```13```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Clear Accumulated Energy

Clear accumulated energy
If this parameter is set to '0' or default, the accumulated energy saved in the plug will be cleared by '0'.  
Other values will not change current accumulated energy value.  
This parameter value cannot be saved in NVR mounted in the plug. The accumulated energy consumed will not be changed when the plug is added or removed from the Z-Wave network, but this value will be cleared after resetting the plug to factory default settings.

Note: Users can also send METER_RESET (Meter Command Class) command to clear accumulated energy.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Save accumulated energy |
| 1 | Clear Accumulated Energy |

The manufacturer defined default value is ```0``` (Save accumulated energy).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.

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

The NAS-WR01ZE supports 3 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Assigned to Plugs status - On/Off. Allows for receiving control command from trigger devices whenever the Plug is turned On or Off.
  * NOTIFICATION\_REPORT\_V4
  * METER\_REPORT\_V4
  * SWITCH\_BINARY\_REPORT
  * DEVICE\_RESET\_LOCALLY_NOTIFICATION

Association group 1 supports 1 node.

### Group 2: Group 2

Sending control commands to associated devices. If current load is over the max current defined in parameter #3, the Plug will send a BASIC\_SET (0xFF) to associated devices. When current load is normal, plug will send a BASIC\_SET (0x00).
BASIC_SET

Association group 2 supports 5 nodes.

### Group 3: Group 3

Send Notification to associated devices.
NOTIFICATION\_REPORT\_V4

Association group 3 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/1014/nas-wr01z-S2-SmartPlug-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1014).
