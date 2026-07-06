---
layout: documentation
title: ROB_100-017-0 - ZWave
---

{% include base.html %}

# ROB_100-017-0 ROBB Smart Wallplug 3680Watt
This describes the Z-Wave device *ROB_100-017-0*, manufactured by *[Sunricher](www.sunricher.com)* with the thing type UID of ```sunricher_veggplug2_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![ROB_100-017-0 product image](https://opensmarthouse.org/zwavedatabase/1339/image/)


The ROB_100-017-0 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Zwave Smart Plug. The Device supports metering functions (voltage, current, energy consumption and power). It also supports thermostat's Heat mode, Energy Heat mode, OFF mode. The device cannot act as as network controller (primary or secondary) and wil allways need a Z-Wave network controller to be included into a Z-Wave network.

### Inclusion Information

  1. Set the primary controller into inclusion mode (Please refer to your primary controllers manual on how to turn your controller into inclusion).
  2. Power on the smart plug, make sure it does not belong to any Z-Wave network. There are two methods to set the smart plug into inclusion mode:
  3. Repower the smart plug, it will be set into inclusion mode automatically, and wait to be included.

b) Triple press the action button on the smart plug, it will set the plug into inclusion mode. The LED indicator will flash white fast then stay solid white for 3 seconds to indicate successful inclusion. lf there is no Z-Wave network available, the LED indicator will flash white fast for 30 seconds and the plug will quit inclusion mode automatically.

  


(Note: When using S2 encryption mode to include the device, an encrypted key will need to be generated. The LED indicator may not flash, please wait and do not unplug the device.)

### Exclusion Information

There are two exclusion methods:

Method l : Exclusion from the primary controller as follows:

  1. Set the primary controller into exclusion mode (Please refer to your primary controllers manual on howto set your controller into exclusion).
  2. Triple press the action button, the smart plug will be set to exclusion mode, the LED indicator will flash white fast and then flash white slowly 3 times to indicate successful exclusion. lf exclusion fails, the LED indicator will flash fast for 30 seconds and the plug will quit exclusion mode automatically.

There are 3 methods for the smart plug to exit out of “exclusion mode". Once it exits “exclusion mode", the LED light will stop the fast fade-in and fade-out. 

  1. Automatically exits after successful exclusion.
  2. Exits after 6 second timeout.
  3. Repowering on the smart plug.

  


Method 2: A "Factory reset" of the smart plug will force the device to be excluded from a network (please refer to the part “Factory Reset” of this manual).

(Note: A "Factory reset" is not recommended for exclusion. Please use this procedure only if the primary controller is missing or otherwise inoperable.)

  


Factory Reset:

Press and hold the action button for over 10 seconds, the LED indicator should stay solid white for 3 seconds to indicate successfull factory reset. Release the action button, the smart plug will restart automatically. If the LED indicator ﬂashes yellow slowly, the device was not included to any network in the first place.

### General Usage Information



## Channels

The following table summarises the channels available for the ROB_100-017-0 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Scene Number | scene_number | scene_number |  | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps)
Indicates the instantaneous current consumption.

The ```meter_current``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 13 configuration parameters available in the ROB_100-017-0.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 7 | Device operating mode | Defines operating modes: either "switch mode" or "thermostat mode". |
| 8 | Report state changes while in thermostat mode | Whether to report setpoint and mode changes. |
| 9 | Temperature compensation value | Temperature compensation in 0.1 °Celsius per unit point. |
| 10 | Over temperature protection | Temperature setpoint for automatic relay shutoff, or "0" to disable. |
| 11 | Temperature change reporting threshold | Temperature change in degrees Celsius at wich to report a temperature change to the gateway. |
| 12 | Periodic temperature reporting interval | Sets the interval (in seconds) for temperature reporting. |
| 13 | Power change threshold | Report power changes over or under the threshold value (W). |
| 14 | Voltage change absolute threshold | Report voltage changes over or under the threshold value (V). |
| 15 | Current change absolute threshold | Report current changes over or under the threshold value (A). |
| 17 | Time interval for energy reporting | Time interval in seconds to report voltage, current, power and energy consumption values. |
| 18 | Device state after a power reset | The state to which the wallplug should be set after a powerfailure. |
| 19 | Report state changes while in switch mode | Whether to report mode changes, power resetting or factory resets. |
| 20 | Current protection | Set the threshold for current protection (in Ampère), or disable. |

### Parameter 7: Device operating mode

Defines operating modes: either "switch mode" or "thermostat mode".
Switch mode enables the control of the relay output directly by basic set or binary set.

Thermostat mode will control the relay output automatically according to the temperature value set.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_0``` and is of type ```INTEGER```.


### Parameter 8: Report state changes while in thermostat mode

Whether to report setpoint and mode changes.
When configured as thermostat mode: if thermostat setpoint or mode changes, whether te report actively.

0 - do not report.

1 - report actively.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_0``` and is of type ```INTEGER```.


### Parameter 9: Temperature compensation value

Temperature compensation in 0.1 °Celsius per unit point.
Sets the temperature compensation to none: 0.

Sets the temperature compensation to a defined value in 0.1 °Celsius. For example a value of -5 will compensate by -0.5 °Celsius.
Values in the range -50 to 50 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_9_0``` and is of type ```INTEGER```.


### Parameter 10: Over temperature protection

Temperature setpoint for automatic relay shutoff, or "0" to disable.
Whether to enable over temperature protection. When temperature achieves the set value, the relay output will be forced to off.  


0: disable over temperature protection .  


30 - 60: set a threshold, unit is 1 Celcius degree.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 50 may be set.

The manufacturer defined default value is ```36```.

This parameter has the configuration ID ```config_10_0``` and is of type ```INTEGER```.


### Parameter 11: Temperature change reporting threshold

Temperature change in degrees Celsius at wich to report a temperature change to the gateway.
Temperature change report threshold. Report to the gateway when change value is lower or higher than the threshold  


0: disable reporting.

2 - 50: set a threshold‚ unit is 0.1 °Celsius.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_11_0``` and is of type ```INTEGER```.


### Parameter 12: Periodic temperature reporting interval

Sets the interval (in seconds) for temperature reporting.
Time interval for periodical temperature report. Unit is seconds.  


0: disable reporting.

10 - 65535 time interval for periodical temperature report.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 10 to 65535 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_12_0``` and is of type ```INTEGER```.


### Parameter 13: Power change threshold

Report power changes over or under the threshold value (W).
Power change absolute threshold. Unit is W. Report when power change value lower or higher than the threshold.  


Value:

0: disable reporting.

1 - 255: absolute threshold.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_13_0``` and is of type ```INTEGER```.


### Parameter 14: Voltage change absolute threshold

Report voltage changes over or under the threshold value (V).
Voltage change absolute threshold. Unit is V. Report when voltage change value lower or higher than the threshold.  


Value:

0: disable reporting.

1 - 255: absolute threshold.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_14_0``` and is of type ```INTEGER```.


### Parameter 15: Current change absolute threshold

Report current changes over or under the threshold value (A).
Current change absolute threshold. Unit is 0‚1A. Report when current change value lower or higher than the threshold.

Value:

0: disable reporting

1 - 255: absolute threshold
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_15_0``` and is of type ```INTEGER```.


### Parameter 17: Time interval for energy reporting

Time interval in seconds to report voltage, current, power and energy consumption values.
Time interval for periodically active report of voltage value, current value, power value, energy consumption, unit is seconds.

60-2678400 (31 days)‚unit is S, it stands for time interval of 60s to 2678400s.
Values in the range 60 to 2678400 may be set.

The manufacturer defined default value is ```600```.

This parameter has the configuration ID ```config_17_0``` and is of type ```INTEGER```.


### Parameter 18: Device state after a power reset

The state to which the wallplug should be set after a powerfailure.
Device state after a power reset.

Switch Mode:

00: turn off relay

01: turn on relay

02: save relay state before power reset  


Thermostat mode:

00: HVAC OFF

01: HVAC ON

02: save HVAC state before power reset
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_18_0``` and is of type ```INTEGER```.


### Parameter 19: Report state changes while in switch mode

Whether to report mode changes, power resetting or factory resets.
Enable/disable to send SWITCH\_BINARY\_REPORT to the Lifeline when the plug state changes while in "Switch mode", reset power of the plug and factory reset the plug  


0: disable to send  


1: enable to send
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_19_0``` and is of type ```INTEGER```.


### Parameter 20: Current protection

Set the threshold for current protection (in Ampère), or disable.
Enable/disable current protection threshold function  


0: disable current protection.  


10 - 16: threshold in Ampère.
The following option values may be configured, in addition to values in the range 0 to 16 -:

| Value  | Description |
|--------|-------------|
| 0 | disable current protection |
| 10 |  |
| 11 |  |
| 12 |  |
| 13 |  |
| 14 |  |
| 15 |  |
| 16 |  |

The manufacturer defined default value is ```0``` (disable current protection).

This parameter has the configuration ID ```config_20_0``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ROB_100-017-0 supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
1. Smart plug Factory Reset, send Command Class "Device Reset Locally Notification CC" to associated devices of this group to report factory reset information when factory reset the smart plug.

2. Smart plug over current, over temperature, send Command Class "NOTIFICATION\_REPORT\_CC“ to associated devices of this group to report overload information.

3. When smart plug state changes, send Command Class “SWITCH\_BINARY\_REPORT CC" to associated devices of this group to report state information.

4. METER_REPORT.

5. Send "SENSOR\_MULTILEVEL\_REPORT" to report temperature.

6. Report when thermostat setpoint er mode changes.

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
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
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [User manual](https://opensmarthouse.org/zwavedatabase/1339/reference/RobbShop-SmartPlug_ROB_100-017-0-0.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1339).
