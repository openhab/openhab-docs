---
layout: documentation
title: NAS-WR01ZE - ZWave
---

{% include base.html %}

# NAS-WR01ZE Metered Wall Plug Switch
This describes the Z-Wave device *NAS-WR01ZE*, manufactured by *[Shenzhen Neo Electronics Co., Ltd](http://www.szneo.com/)* with the thing type UID of ```shenzhen_powerplug_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![NAS-WR01ZE product image](https://www.cd-jackson.com/zwave_device_uploads/397/397_default.jpg)


The NAS-WR01ZE supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

This Plug provides line voltage, current load, power consumption and energy

consumption measuring.

**Voltage** – The Supply Power Voltage For Plug.

**Current** – The Current for the Electric Device Connect to Plug Consumption.

**Power** – Power Consumed by an Electric Device in an instant, unit: Watt (W).

**Energy** – Energy Consumed by an Electric Device through a Time Period. Most

commonly measured in Kilowatt-hours (kWh). One kilowatt-hour is Equal to One

Kilowatt of Power Consumed over a Period of One Hour, 1kWh = 1000Wh.0Wh.

### Inclusion Information

1\. Make sure the sensor is powered.

2\. Set Z‐Wave controller or Z‐Wave gateway into inclusion mode (Refer to the controller or

gateway operating manual)

3\. Press the button three times within 1.5 second, the device will enter inclusion mode. And the

LED will flash on and off with green alternately five times within 2 seconds.

### Exclusion Information

1\. Make sure the sensor is powered.

2\. Set Z‐Wave controller or Z‐Wave gateway into exclusion mode (Refer to the controller or

gateway operating manual)

3\. Press the button three times within 1.5 second, the device will enter exclusion mode. And

the LED will flash on and off with yellow alternately five times within 2 seconds.

## Channels

The following table summarises the channels available for the NAS-WR01ZE -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Electric meter (amps) | meter_current | Energy | Number | 
| Electric meter (kWh) | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | Energy | Number | 
| Electric meter (volts) | meter_voltage | Energy | Number | 
| Alarm (power) | alarm_power | Door | Switch | 

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (amps)

Indicates the instantaneous current consumption.

The ```meter_current``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)

Indicates the energy consumption (kWh).

The ```meter_kwh``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)

Indicates the instantaneous power consumption.

The ```meter_watts``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts)

Indicates the instantaneous voltage.

The ```meter_voltage``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (power)

Indicates if a power alarm is triggered.

The ```alarm_power``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 10 configuration parameters available in the NAS-WR01ZE.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Meter Report Enable | This parameter defines Disable/Enable meter report measure data to controller. |
| 2 | Meter Report Interval | Interval time reporting data to controller |
| 3 | Maxium over-load current | maximum current the plug can provide to load |
| 4 | Maximum alarm current | Max current for over-current notification |
| 5 | LED enable | This parameter defines the LED indication Function ON/OFF. |
| 6 | Power Report Threshold | Power consumed change to be reported |
| 7 | Remember Relay ON/OFF status after power failure. | Plug state after power-on |
| 8 | Plug Time switch Function | Timer plug OFF after time period |
| 9 | Time switch Period | Delay time after the plug is switched off |
| 10 | Button On/Off Enable | Enable/Disable top button function |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Meter Report Enable

This parameter defines Disable/Enable meter report measure data to controller.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable Report |
| 1 | Enable Report |

The manufacturer defined default value is ```1``` (Enable Report).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Meter Report Interval

Interval time reporting data to controller
This parameter defines interval time (in seconds) that Meter report data to main controller.
Values in the range 1 to 65535 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Maxium over-load current

maximum current the plug can provide to load
This parameter defines maximum current the plug can provide to load that be connected to plug. If the current consumed by load greater than maximum current, the plug will cut off power and send alarm.

send Alarm NOTIFICATION\_EVENT\_POWER\_MANAGEMENT\_OVER\_LOAD\_DETECTED to associated

devices in lifeline. Red Led will blink every seconds until current is normal (less than Parameter

\#3). You must remove the loader and turn on the Plug (press the button once) to enable current

monitor and clear NOTIFICATION ALARM.

This parameter value must be great than #4. If user set this parameter to default by Configure CC,

the parameter #4 will be set to default value.
Values in the range 1 to 16 may be set.

The manufacturer defined default value is ```13```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Maximum alarm current

Max current for over-current notification
Defines maximum current, if the current plug provide to load great than this parameter, the plug will send over-current notification to main controller and the LED will be turn RED, but plug cannot cut-off power. Value must be less than parameter 3#.
Values in the range 1 to 15 may be set.

The manufacturer defined default value is ```12```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: LED enable

This parameter defines the LED indication Function ON/OFF.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable LED indication Function |
| 1 | Enable LED indication Function |

The manufacturer defined default value is ```1``` (Enable LED indication Function).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Power Report Threshold

Power consumed change to be reported
How much the power consumed must change to be reported. If the rate of power consumed change ratio is greater than this parameter, the plug will report the results, voltage, current, power and energy.
Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Remember Relay ON/OFF status after power failure.

Plug state after power-on
 Define how will the Plug react after the power supply is back on. 0 = will be off after the power supply is reconnected. Others = remember relay status
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Don’t remember relay state |
| 1 | Remember the Relay Status. |

The manufacturer defined default value is ```1``` (Remember the Relay Status.).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Plug Time switch Function

Timer plug OFF after time period
Defines if the timer function is enabled/disabled to switch the Plug OFF after the time period, which is defined in parameter 9#.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Time switch Disable |
| 1 | Time switch Enable |

The manufacturer defined default value is ```0``` (Time switch Disable).

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Time switch Period

Delay time after the plug is switched off
This parameter defines the time after the plug is switched off. If Parameter 8# is set to ‘1’, and relay is turn ON, the relay will be turn OFF after delay this parameter.
Values in the range 1 to 65535 may be set.

The manufacturer defined default value is ```150```.

This parameter has the configuration ID ```config_9_2``` and is of type ```INTEGER```.


### Parameter 10: Button On/Off Enable

Enable/Disable top button function
If this parameter is set to ‘1’, users can turn on and off the wall plug by pressing the button on the top of the wall plug.If this parameter is set to ‘0’, the wall plug cannot be turned on and off by pressing the button.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable Button |
| 1 | Enable Button |

The manufacturer defined default value is ```1``` (Enable Button).

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

The NAS-WR01ZE supports 3 association groups.

### Group 1: Group 1

is assigned to Plugs status - On/Off. Allows for receiving control command from trigger devices whenever the Plug is turned On or Off.
This group supports 1 nodes.

### Group 2: Group 2

Sending control commands to associated devices. If current load is over the max current defined in parameter #3, the Plug will send a BASIC\_SET (0xFF) to associated devices. When current load is normal, plug will send a BASIC\_SET (0x00).
This group supports 5 nodes.

### Group 3: Group 3

Send Notification to associated devices.
This group supports 5 nodes.

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
| COMMAND_CLASS_ALARM_V3| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Instruction Manual Power Plug](https://www.cd-jackson.com/zwave_device_uploads/397/Manual-for-Power-plug-Z-wave-Neo.pdf)
* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/397/Smart-Plug-User-Guide--EU-.pdf)
* [User Manual 23.09.2016](https://www.cd-jackson.com/zwave_device_uploads/397/Smart-Plug-User-Guide--EU-.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/397).
