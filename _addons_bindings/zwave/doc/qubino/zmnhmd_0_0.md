---
layout: documentation
title: ZMNHMD - ZWave
---

{% include base.html %}

# ZMNHMD Water meter and leakage detector with valve control
This describes the Z-Wave device *ZMNHMD*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhmd_00_000```.

The device is in the category of *Valve*, defining Valves used to control water or gas. e.g. a flow stop valve..

![ZMNHMD product image](https://opensmarthouse.org/zwavedatabase/1293/image/)


The ZMNHMD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Qubino water meter and leakage detector is very versatile. It can be used in various home applications. You can get the information about consumed water on one side or have the complete protection of your home water system with water metering, flood detection and actuator for opening and closing the valve accordingly. It is perfectly suitable for garden/lawn irrigation, where you can set the manual operation, automatic operation with timer or based on humidity sensor. In case you have two water sources, public distribution system and own water tank, you can decide when, how and which one to use to reduce water costs and water consumption. 

### Inclusion Information

  1. Enable add/remove mode on your Z-Wave gateway (hub).
  2. Connect the device to the power supply.
  3. Make sure the device is within direct range of your Z-Wave gateway (hub).
  4. Push the switch connected to the I1 terminal 3 times within 5 seconds.

OR

Press and hold the S (Service) button between 2 and 6 seconds.

  1. A new single-channel device will appear on your dashboard.
  2. Inclusion with the switch connected to I1 terminal is not limited by time.

### Exclusion Information

  1. Connect the device to the power supply.
  2. Make sure the device is within direct range of your Z-Wave gateway (hub) or use a hand-held Z-Wave remote to perform exclusion.
  3. Enable add/remove mode on your Z-Wave gateway (hub).
  4. Toggle the switch connected to the I1 terminal 3 times within 5 seconds. The device must get ON/OFF signal 3 times.

OR

Press and hold the S (Service) button between 2 and 6 seconds.

  1. Exclusion with the switch connected to I1 terminal is not limited by time.
  2. The device will be removed from your network, but any custom configuration parameters will not be erased.

NOTE1: LEARN MODE state allows the device to receive network information from the controller.

### General Usage Information



## Channels

The following table summarises the channels available for the ZMNHMD -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Water meter (water_cubic_meters) | meter_water_cubic_meters | meter_water_cubic_meters | Water | Number | 
| Alarm (flood) | alarm_flood | alarm_flood | Water | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Water meter (water_cubic_meters)
Indicates the instantaneous water consumption.

The ```meter_water_cubic_meters``` channel is of type ```meter_water_cubic_meters``` and supports the ```Number``` item and is in the ```Water``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (flood)
Indicates if the flood alarm is triggered.

The ```alarm_flood``` channel is of type ```alarm_flood``` and supports the ```Switch``` item and is in the ```Water``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 16 configuration parameters available in the ZMNHMD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Output 1 contact type | Defines the output contact type for Q↑. |
| 2 | Input 2 contact type | Defines how the device reacts if a signal from I2 input is registered. |
| 3 | Input 3 contact type | Defines how the device reacts if a signal from I3 input is registered. |
| 30 | Restore state on power failure | Determines the behaviour of the device after a power cycle/outage has occurred. |
| 48 | Water total consumption value in Liters | Allows the user to set a custom meter value. |
| 50 | number of liters per pulse | This number defines how many liters represent 1 received pulse from the water meter connected to I2. |
| 51 | Number of liters for Slow Leak | This number defines how many minimum liters must be consumed each hour and constantly repeated for the defined time |
| 52 | Water consumption time interval for Slow Leak | Set value means time interval (0 – 24) in hours during which the device checks if water consumption defined in Parameter 51 was consumed to cause the leak alarm. |
| 53 | Number of liters for Medium Leak | This number defines how many minimum liters must be consumed each hour and constantly repeated for the defined time |
| 54 | Water consumption time interval for Medium Leak | Set value means time interval (0 – 24) in hours during which the device checks if water consumption defined in Parameter 53 was consumed to cause the leak alarm. |
| 55 | Number of liters for Fast Leak | This number defines how many minimum liters must be consumed each hour and constantly repeated for the defined time in parameter 56 to cause the leak alarm. |
| 56 | Water consumption time interval for Fast Leak | Set value means time interval (0 – 24) in hours |
| 60 | Enable closing valve according to Slow Leak | This parameter defines what happens with the valve if the leak alarm is triggered |
| 61 | Enable closing valve according to Medium Leak | This parameter defines what happens with the valve if the leak alarm is triggered |
| 62 | Enable closing valve according to Fast Leak | This parameter defines what happens with the valve if the leak alarm is triggered |
| 63 | Enable closing valve according to Hardware Leak | This parameter defines what happens with the valve if the leak alarm is triggered. |

### Parameter 1: Output 1 contact type

Defines the output contact type for Q↑.

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normally open) contact type |
| 1 | NC (normally closed) contact type |

The manufacturer defined default value is ```0``` (NO (normally open) contact type).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Input 2 contact type

Defines how the device reacts if a signal from I2 input is registered.

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normally open) contact type |
| 1 | NC (normally close) contact type |

The manufacturer defined default value is ```0``` (NO (normally open) contact type).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Input 3 contact type

Defines how the device reacts if a signal from I3 input is registered.

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normally open) contact type |
| 1 | NC (normally close) contact type |

The manufacturer defined default value is ```0``` (NO (normally open) contact type).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 30: Restore state on power failure

Determines the behaviour of the device after a power cycle/outage has occurred.

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | enabled (the device will restore state on power failure) |
| 1 | disabled (the device will not restore state on power failure and will |

The manufacturer defined default value is ```0``` (enabled (the device will restore state on power failure)).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 48: Water total consumption value in Liters

Allows the user to set a custom meter value.
With this parameter we can set the current water consumption value in liters. The value is represented with two's complement notation so that it can represent negative values also. Span of the input value is from (-2147483648) to (+2147483647). Its main usage is to set the same value on our device as on physical water meter. If we get the PARAMETER\_48 value with PARAMETER\_GET command we get the last value that was set with this parameter and not the current water consumption value! To get the current consumption value we must send the METER_GET command.
Values in the range -2147483648 to 2147483647 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_48_4``` and is of type ```INTEGER```.


### Parameter 50: number of liters per pulse

This number defines how many liters represent 1 received pulse from the water meter connected to I2.
This number defines how many liters represent 1 received pulse from the water meter connected to I2.
Values in the range 1 to 1000 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_50_2``` and is of type ```INTEGER```.


### Parameter 51: Number of liters for Slow Leak

This number defines how many minimum liters must be consumed each hour and constantly repeated for the defined time
This number defines how many minimum liters must be consumed each hour and constantly repeated for the defined time in parameter 52 to cause the leak alarm. (depends on meter resolution).
Values in the range 1 to 1000 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_51_2``` and is of type ```INTEGER```.


### Parameter 52: Water consumption time interval for Slow Leak

Set value means time interval (0 – 24) in hours during which the device checks if water consumption defined in Parameter 51 was consumed to cause the leak alarm.
Set value means time interval (0 – 24) in hours during which the device checks if water consumption defined in Parameter 51 was consumed to cause the leak alarm.
Values in the range 1 to 24 may be set.

The manufacturer defined default value is ```24```.

This parameter has the configuration ID ```config_52_1``` and is of type ```INTEGER```.


### Parameter 53: Number of liters for Medium Leak

This number defines how many minimum liters must be consumed each hour and constantly repeated for the defined time
This number defines how many minimum liters must be consumed each hour and constantly repeated for the defined time in parameter 54 to cause the leak alarm.
Values in the range 1 to 1000 may be set.

The manufacturer defined default value is ```150```.

This parameter has the configuration ID ```config_53_2``` and is of type ```INTEGER```.


### Parameter 54: Water consumption time interval for Medium Leak

Set value means time interval (0 – 24) in hours during which the device checks if water consumption defined in Parameter 53 was consumed to cause the leak alarm.
Set value means time interval (0 – 24) in hours during which the device checks if water consumption defined in Parameter 53 was consumed to cause the leak alarm.
Values in the range 1 to 24 may be set.

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_54_1``` and is of type ```INTEGER```.


### Parameter 55: Number of liters for Fast Leak

This number defines how many minimum liters must be consumed each hour and constantly repeated for the defined time in parameter 56 to cause the leak alarm.
This number defines how many minimum liters must be consumed each hour and constantly repeated for the defined time in parameter 56 to cause the leak alarm.
Values in the range 1 to 1000 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_55_2``` and is of type ```INTEGER```.


### Parameter 56: Water consumption time interval for Fast Leak

Set value means time interval (0 – 24) in hours
Set value means time interval (0 – 24) in hours
Values in the range 1 to 24 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_56_1``` and is of type ```INTEGER```.


### Parameter 60: Enable closing valve according to Slow Leak

This parameter defines what happens with the valve if the leak alarm is triggered
This parameter defines what happens with the valve if the leak alarm is triggered
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_60_1``` and is of type ```INTEGER```.


### Parameter 61: Enable closing valve according to Medium Leak

This parameter defines what happens with the valve if the leak alarm is triggered
This parameter defines what happens with the valve if the leak alarm is triggered
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_61_1``` and is of type ```INTEGER```.


### Parameter 62: Enable closing valve according to Fast Leak

This parameter defines what happens with the valve if the leak alarm is triggered
This parameter defines what happens with the valve if the leak alarm is triggered
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_62_1``` and is of type ```INTEGER```.


### Parameter 63: Enable closing valve according to Hardware Leak

This parameter defines what happens with the valve if the leak alarm is triggered.
This parameter defines what happens with the valve if the leak alarm is triggered.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_63_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZMNHMD supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
The lifeline group to which all supported unsolicited messages are sent.
Supports the following command classes:

• Device Reset Locally: triggered upon request

• Meter Report: triggered on every 100L change

• Notification Report: triggered on Alarm and when clearing Alarm

• Switch Binary Report: triggered upon request or after valve position is changed.

Association group 1 supports 1 node.

### Group 2: Basic OnOff

Used for on/off control of other devices.
Supports the following command classes:

• Basic set: triggered on valve position change and it is reflecting valve's state.

Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
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
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [draft manual](https://opensmarthouse.org/zwavedatabase/1293/reference/Qubino_Water_meter_and_leakage_manual_draft.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1293).
