---
layout: documentation
title: BVSZWE01 - ZWave
---

{% include base.html %}

# BVSZWE01 Ball Valve Servo
This describes the Z-Wave device *BVSZWE01*, manufactured by *Ubitech* with the thing type UID of ```ubitech_bvszwe01_00_000```.

The device is in the category of *Valve*, defining Valves used to control water or gas. e.g. a flow stop valve..

![BVSZWE01 product image](https://opensmarthouse.org/zwavedatabase/1520/image/)


The BVSZWE01 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The BVS (Ball Valve Servo) is a motor to retrofit existing and installed ball valves into smart water controlling devices. Its wireless communication capabilities are compatible with several industry standards (Lora, Z-Wave, ULE) for easy integration into existing networks. The motor is powered by a 12 V external power supply or - optional – a battery block.

The variable clamps allow mounting even in complex pipe installations. The patented motor coupling ensures easy installation and precise long-term operation. The device can operate in difficult environmental conditions, even submerged under water and allows to directly connect one additional local water sensor pad by cable. 

### Inclusion Information

When using Smart start just scan the QR code on your device.

When using classical Z-Wave inclusion, triple click the button. Success is indicated by a green LED blinking for one second plus two short beeps by the buzzer.

### Exclusion Information

Triple click the button. Success is indicated by a green LED blinking for one second plus two short beeps by the buzzer.

### General Usage Information



## Channels

The following table summarises the channels available for the BVSZWE01 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Alarm (heat) | alarm_heat | alarm_heat | Fire | Switch | 
| Alarm (flood) | alarm_flood | alarm_flood | Water | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

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



## Device Configuration

The following table provides a summary of the 22 configuration parameters available in the BVSZWE01.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 17 | Water Valve Report Value | This parameter defines how the water valve position is reported. |
| 18 | Command Sent into Association Group 2 on ON | Defines what BASIC command Value to send into Association Group 2 |
| 19 | Command Sent into Association Group 2 on OFF | Defines what BASIC command Value to send into Association Group 2 |
| 33 | Temperature Sensor Report | Defines if and how a temperature value is reported. |
| 34 | Temperature Sensor Report Threshold | Defines the change in temperature value to cause unsolicited sending of an report. |
| 35 | Temperature Sensor Report Offset | Defines a temperature offset for the reported temperature. This parameter can be used to compensate for certain temperature deviations. |
| 36 | Temperature Overheat Trigger | Sets the temperature to trigger and overheat alarm and |
| 37 | Temperature Overhead Reset Trigger Value | Sets the temperature to reset the overheat alarm and |
| 38 | Temperature Overhead Action Value | Defines what BASIC command Value to send into Association Group 4 |
| 39 | Temperature Overhead Action Reset Value | Defines what BASIC command Value to send into Association Group 4 |
| 40 | Freeze Trigger Value | Sets the temperature threshold to cause a freeze alarm |
| 41 | Freeze Trigger Reset Value | Sets the temperature threshold to reset a freeze alarm |
| 42 | Freeze Valve Action | This parameter defines If detected freezing shall close the valve |
| 43 | Freeze Association Action Command | Defines what BASIC command Value to send into Association Group 5 |
| 44 | Freeze Association Reset Command | Defines what BASIC command Value to send into Association Group 5 |
| 49 | Leak Detection Command Value | Defines what BASIC command Value to send into Association Group 3 |
| 50 | Leak Detection Reset Command Value | Defines what BASIC command Value to send into Association Group 3 |
| 51 | Water Leak Detection Valve Control | Defines if the valve shall be closed when a water leak alarm accurs |
| 65 | Buzzer enable | Defines if built-in buzzer shall be active |
| 66 | LED Brightness Level | Defines the brightness level of LED in % |
| 67 | Touch Sensor Key Lock | Defines if touch button is active |
| 81 | Notifications | Defines which notifications are active |

### Parameter 17: Water Valve Report Value

This parameter defines how the water valve position is reported.
0 Normal

1 Reversed
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Command Sent into Association Group 2 on ON

Defines what BASIC command Value to send into Association Group 2
0 Disabled

1 Enabled Basic On (0xff)

2 Enabled, Basic Off (0x00)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_18_0``` and is of type ```INTEGER```.


### Parameter 19: Command Sent into Association Group 2 on OFF

Defines what BASIC command Value to send into Association Group 2
0 Disabled

1 Enabled Basic On (0xff)

2 Enabled, Basic Off (0x00)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_19_0``` and is of type ```INTEGER```.


### Parameter 33: Temperature Sensor Report

Defines if and how a temperature value is reported.
0 Disabled

1 Report in Celsius

2 Report in Fahrenheit
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_33_1``` and is of type ```INTEGER```.


### Parameter 34: Temperature Sensor Report Threshold

Defines the change in temperature value to cause unsolicited sending of an report.
0x00-0xff Value in Celsius (Example: 0x02 = 2 C)

0x100-0x1ff Value in Fahrenheit (Example: 0x102 = 2 F)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_34_2``` and is of type ```INTEGER```.


### Parameter 35: Temperature Sensor Report Offset

Defines a temperature offset for the reported temperature. This parameter can be used to compensate for certain temperature deviations.
0x00-0xff Positive Deviation in Celsius (e.g. 0x02 = +2 C)

0x1000-0x10ff Negative Deviation in Celsius (e.g. 0x02 = -2 C)

0x0100-0x01ff Positive Deviation in Fahrenheit (e.g. 0x02 = +2 F)

0x1100-0x11ff Negative Deviation in Fahrenheit (e.g. 0x02 = -2 F)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_35_2``` and is of type ```INTEGER```.


### Parameter 36: Temperature Overheat Trigger

Sets the temperature to trigger and overheat alarm and
0x00-0xff Value in Celsius (example: 0x02 = 2 C)

0x100-0x1ff Value in Fahrenheit (Example: 0x102 = 2 F)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```40```.

This parameter has the configuration ID ```config_36_2``` and is of type ```INTEGER```.


### Parameter 37: Temperature Overhead Reset Trigger Value

Sets the temperature to reset the overheat alarm and
0x00-0xff Value in Celsius (Example: 0x02 = 2 C)

0x100-0x1ff Value in Fahrenheit (Example: 0x102 = 2 F)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```40```.

This parameter has the configuration ID ```config_37_2``` and is of type ```INTEGER```.


### Parameter 38: Temperature Overhead Action Value

Defines what BASIC command Value to send into Association Group 4
0 Disabled

1 Enabled Basic On (0xff)

2 Enabled, Basic Off (0x00)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_38_1``` and is of type ```INTEGER```.


### Parameter 39: Temperature Overhead Action Reset Value

Defines what BASIC command Value to send into Association Group 4
0 Disabled

1 Enabled Basic On (0xff)

2 Enabled, Basic Off (0x00)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_39_1``` and is of type ```INTEGER```.


### Parameter 40: Freeze Trigger Value

Sets the temperature threshold to cause a freeze alarm
0x00-0xff Value in Celsius (Example: 0x02 = 2 C)

0x100-0x1ff Value in Fahrenheit (Example: 0x102 = 2 F)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_40_2``` and is of type ```INTEGER```.


### Parameter 41: Freeze Trigger Reset Value

Sets the temperature threshold to reset a freeze alarm
0x00-0xff Value in Celsius (Example: 0x02 = 2 C)

0x100-0x1ff Value in Fahrenheit (Example: 0x102 = 2 F)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```40```.

This parameter has the configuration ID ```config_41_2``` and is of type ```INTEGER```.


### Parameter 42: Freeze Valve Action

This parameter defines If detected freezing shall close the valve
0 Disabled

1 Enabled
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_42_1``` and is of type ```INTEGER```.


### Parameter 43: Freeze Association Action Command

Defines what BASIC command Value to send into Association Group 5
0 Disabled

1 Enabled Basic On (0xff)

2 Enabled, Basic Off (0x00)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_43_1``` and is of type ```INTEGER```.


### Parameter 44: Freeze Association Reset Command

Defines what BASIC command Value to send into Association Group 5
0 Disabled

1 Enabled Basic On (0xff)

2 Enabled, Basic Off (0x00)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_44_1``` and is of type ```INTEGER```.


### Parameter 49: Leak Detection Command Value

Defines what BASIC command Value to send into Association Group 3
0 Disabled

1 Enabled Basic On (0xff)

2 Enabled, Basic Off (0x00)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_49_1``` and is of type ```INTEGER```.


### Parameter 50: Leak Detection Reset Command Value

Defines what BASIC command Value to send into Association Group 3
0 Disabled

1 Enabled Basic On (0xff)

2 Enabled, Basic Off (0x00)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_50_1``` and is of type ```INTEGER```.


### Parameter 51: Water Leak Detection Valve Control

Defines if the valve shall be closed when a water leak alarm accurs
0 Disabled

1 Enabled
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_51_1``` and is of type ```INTEGER```.


### Parameter 65: Buzzer enable

Defines if built-in buzzer shall be active
0 Disabled

1 Enabled
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_65_1``` and is of type ```INTEGER```.


### Parameter 66: LED Brightness Level

Defines the brightness level of LED in %
0-100 Brightness level
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_66_1``` and is of type ```INTEGER```.


### Parameter 67: Touch Sensor Key Lock

Defines if touch button is active
0 Disabled

1 Enabled
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_67_1``` and is of type ```INTEGER```.


### Parameter 81: Notifications

Defines which notifications are active
0 Water Valve Report

1 Overheat Report

2 Freeze Report

3 Water Leak
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_81_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The BVSZWE01 supports 5 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline. All alarms that shall be sent to the gateway

Association group 1 supports 5 nodes.

### Group 2: Switch on operate

Switch Devices when Water Valve is operated (either local or by sensor o by wireless command)

Association group 2 supports 5 nodes.

### Group 3: Switch on leak

Switch Devices when water leak was detected

Association group 3 supports 5 nodes.

### Group 4: Switch on temperature too high

Switch Devices when temperature raise above threshold

Association group 4 supports 5 nodes.

### Group 5: Switch on temperature too low

Switch Devices when temperature falls below threshold

Association group 5 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V10| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |

### Documentation Links

* [BVSZWE_Manual](https://opensmarthouse.org/zwavedatabase/1520/reference/BVSZWE_Manual_EN.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1520).
