---
layout: documentation
title: HE-HLS01 - ZWave
---

{% include base.html %}

# HE-HLS01 High Load Switch
This describes the Z-Wave device *HE-HLS01*, manufactured by *Heltun* with the thing type UID of ```heltun_he-hls01_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![HE-HLS01 product image](https://opensmarthouse.org/zwavedatabase/1374/image/)


The HE-HLS01 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The HE-HLS01 High Load Switch with Thermostat Functions fits easily behind outlets making them ‘Impossibly Smart’ with over-the-Internet control and advanced programmability. In addition, built-in Power Consumption System helps to monitor how much energy was used. With included NTC temperature sensor it provides thermostat functions where a local display and controls are not needed. The High Load Switch also adds safety to your home by protecting against overloads, overheat, overvoltage, spark and surge conditions.

### Inclusion Information

  1. Ensure the HE-HLS01 is Powered On and the LED indicator blinks red slowly (i.e. it is excluded).
  2. Start the Inclusion Mode from the gateway/controller.
  3. To start the inclusion process on the HE-HLS01: a) if you want to use the device as a relay (binary switch), double-press the service button on the device (with no more than a one-second interval between presses).b) if you want to use the device as a thermostat, press four times the service button on the device (with no more than a one-second interval between presses).
  4. The LED indicator will blink green quickly.
  5. If the inclusion has been successful, the LED indicator will turn green for three seconds then continue slowly blinking green continuously while the HE-HLS01 is Powered On.
  6. If the inclusion was not successful, the LED indicator will turn red for three seconds then continue slowly blinking red continuously while the HE-HLS01 is Powered On. In that case repeat the inclusion process (2-5) above.

### Exclusion Information

  1. Ensure the HE-HLS01 is Powered On and the LED indicator blinks green slowly (i.e. it is included in a Z-Wave network).
  2. Start the Exclusion Mode from the gateway/controller.
  3. To start the exclusion process on the HE-HLS01, double-press the service button on the device (with no more than a one-second interval between presses).
  4. The LED indicator will blink red quickly.
  5. If the exclusion has been successful, LED indicator will turn red for three seconds then continue slowly blinking red continuously while the HE-HLS01 is Powered On.
  6. If the exclusion was not successful, the LED indicator will turn green for three seconds then continue slowly blinking green continuously while the HE-HLS01 is Powered On. In that case repeat the exclusion process (2-5) above.

### General Usage Information



## Channels

The following table summarises the channels available for the HE-HLS01 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Alarm (heat) | alarm_heat | alarm_heat | Fire | Switch | 
| Alarm (system) | alarm_system | alarm_system |  | Switch | 
| Clock Time Offset | time_offset | time_offset | Time | Number | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```Fire``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (system)
Indicates if a system alarm is triggered.

The ```alarm_system``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Clock Time Offset
Provides the current time difference for the devices time.

The ```time_offset``` channel is of type ```time_offset``` and supports the ```Number``` item and is in the ```Time``` category.



## Device Configuration

The following table provides a summary of the 20 configuration parameters available in the HE-HLS01.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 7 | Relay output mode | Relay output NO or NC mode |
| 10 | Floor Sensor Resistance | External Floor NTC temperature sensor resistance |
| 16 | Temperature Scale Mode | Sets temperature unit (Celsius/Fahrenheit) |
| 17 | Temperature Sensor Calibration | Temperature Sensor Calibration |
| 23 | Auto On/Off | Auto On/Off |
| 24 | Auto Off Timeout | Auto Off Timeout in minutes |
| 25 | Auto On Reconnect Timeout | Auto On Reconnect Timeout |
| 41 | External input: Hold Control Mode | External input: Hold Control Mode |
| 51 | External Input: Click Control Mode | External Input: Click Control Mode |
| 71 | Relay Timer Mode Duration | Relay Timer Mode Duration |
| 139 | Temperature sensor consecutive report interval | Temperature sensor consecutive report interval |
| 141 | Energy Consumption Meter Consecutive Report Interval | Energy Consumption Meter Consecutive Report Interval |
| 142 | Energy Consumption Report Threshold | Consumption difference to send to controller, % |
| 143 | Temperature sensor consecutive report interval | Temperature sensor consecutive report interval |
| 144 | Temperature report threshold | Temperature difference to send to controller, value X 10 |
| 153 | Overheat Protection & Notification | Overheat Protection & Notification |
| 154 | Over-Current Notification | Enable/disable over-current notification |
| 155 | Over-Load Protection & Notification | Over-Load Protection & Notification |
| 156 | Over-Voltage Protection & Notification | Over-Voltage Protection & Notification |
| 157 | Voltage Drop Protection & Notification | Voltage Drop Protection & Notification |

### Parameter 7: Relay output mode

Relay output NO or NC mode

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Normally Open |
| 1 | Normally Closed |

The manufacturer defined default value is ```0``` (Normally Open).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 10: Floor Sensor Resistance

External Floor NTC temperature sensor resistance
If the external floor NTC temperature sensor is used it is necessary to select the correct resistance value in Ohms (Ω) of the sensor. The selection range is 1 to 100 kiloOhms (kΩ). One 10kΩ NTC floor temperature sensor is included in the HE-HLS01 package with a 3-meter connection wire. The factory default value is 10kΩ.
Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 16: Temperature Scale Mode

Sets temperature unit (Celsius/Fahrenheit)
This parameter determines in which unit of measurement (degrees Celsius or Fahrenheit) the device will report the temperature, and also determines the scale that will be interpreted by the configuration parameters. Set the value 0 for Celsius and the value 1 for Fahrenheit.Factory default value is 0 (degrees Celsius).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Celsius |
| 1 | Fahrenheit |

The manufacturer defined default value is ```0``` (Celsius).

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 17: Temperature Sensor Calibration

Temperature Sensor Calibration
This Parameter defines the offset value for floor temperature. If the external floor temperature sensor is not calibrated properly, then manual calibration can be made by adjusting the values up to ±10.0°C (±18°F).This value will be added or subtracted from the floor temperature sensor reading. Through the Z-Wave network the value of this Parameter should be x10 (for Celsius only), e.g. for 1.5°C set the value 15. The factory default value is 0.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range -100 to 100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 23: Auto On/Off

Auto On/Off
If this function is enabled the device will switch Off the relay output when there is no consumption and switch On the output again when the load is reconnected. It is possible to set the delay for Auto Off function (in the Parameter 24) and for Auto On function (in the Parameter 25). To enable Auto On/Off function, setthis Parameter value to 1 and use the value 0 if there is a need to disable the function.The factory default value is 0 (the function is disabled).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.


### Parameter 24: Auto Off Timeout

Auto Off Timeout in minutes
If Auto On/Off function (the Parameter 23) is enabled, it is possible to delay the Auto Off function. The output will be switched Off when there is no consumption for the interval defined in this parameter in minutes. The value of this parameter can be set from 0 to 120 min. Set the parameter value to 0 if there is a need to switch Off the output immediately when consumption drops to 0W.The factory default value is 5 min
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 25: Auto On Reconnect Timeout

Auto On Reconnect Timeout
If Auto On/Off function (the Parameter 23) is enabled, it is possible to delay the Auto On function. When the load is reconnected the relay output will be switched On after the time defined in this parameter in minutes. The value of this parameter can be set from 0 to 120 min. Set the parameter value to 0 if there isa need to switch On the output immediately when the load is reconnected.The factory default value is 0 min.
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 41: External input: Hold Control Mode

External input: Hold Control Mode

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Hold function is disabled |
| 1 | Operate like click (parameter 51) |
| 2 | Momentary switch |
| 3 | Reversed momentary switch |

The manufacturer defined default value is ```2``` (Momentary switch).

This parameter has the configuration ID ```config_41_1``` and is of type ```INTEGER```.


### Parameter 51: External Input: Click Control Mode

External Input: Click Control Mode

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Click function disabled |
| 1 | Toggle switch |
| 2 | Relay switches to ON state only |
| 3 | Relay switches to OFF state only |
| 4 | Timer On>Off mode |
| 5 | Time Off>On mode |

The manufacturer defined default value is ```1``` (Toggle switch).

This parameter has the configuration ID ```config_51_1``` and is of type ```INTEGER```.


### Parameter 71: Relay Timer Mode Duration

Relay Timer Mode Duration
These parameters specify the duration in seconds for the Timer mode (values 4 or 5 in the Parameter 51). Press the button on the switch connected to external input and the relay output goes to ON/OFF for the specified time then changes back to OFF/ON. The time value can be configured from 0 sec to 43200 sec (12 hours). The factory default value is 0.

If the parameter value is set to “0” the relay output will operate as a short contact (duration is about 0.5 sec).
Values in the range 0 to 43200 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_71_2``` and is of type ```INTEGER```.


### Parameter 139: Temperature sensor consecutive report interval

Temperature sensor consecutive report interval
When the device is connected to the Z-Wave gateway (controller), it periodically sends to the gateway reports from its floor temperature, sensor even if there are not changes in the values. This Parameter defines the interval between consecutive reports. The value can be adjusted from 1 min to 120 min. The factory default value is 10 min.
Values in the range 1 to 120 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_139_1``` and is of type ```INTEGER```.


### Parameter 141: Energy Consumption Meter Consecutive Report Interval

Energy Consumption Meter Consecutive Report Interval
When the device is connected to the Z-Wave gateway (controller), it periodically sends to the gateway reports from its energy consumption sensor even if there is no change in the value. This Parameter defines the interval between consecutive reports of real time and cumulative energy consumption data to the gateway. The value can be adjusted from 1 min to 120 min. The factory default value is 10 min.
Values in the range 1 to 120 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_141_1``` and is of type ```INTEGER```.


### Parameter 142: Energy Consumption Report Threshold

Consumption difference to send to controller, %
This Parameter determines the change in the load power resulting in the consumption report being sent to the gateway. From 1% to 50% can be selected. Use the value 0 if there is a need to stop sending the reports. The factory default value is 25
Values in the range 0 to 50 may be set.

The manufacturer defined default value is ```25```.

This parameter has the configuration ID ```config_142_1``` and is of type ```INTEGER```.


### Parameter 143: Temperature sensor consecutive report interval

Temperature sensor consecutive report interval
When the device is connected to the Z-Wave gateway (controller), it periodically sends to the gateway reports from its floor temperature, sensor even if there are not changes in the values. This Parameter defines the interval between consecutive reports. The value can be adjusted from 1 min to 120 min. The factory default value is 10 min.
Values in the range 1 to 120 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_143_1``` and is of type ```INTEGER```.


### Parameter 144: Temperature report threshold

Temperature difference to send to controller, value X 10
This Parameter determines the change in temperature level (in °C or °F) resulting in temperature sensors report being sent to the gateway. The value of this Parameter should be x10 (for °C only), e.g. for 0.4°C use value 4.From 0.1°C (value 1) to 10°C (value 100) and for °F from 1°F -18°F can be selected. Use the value 0 if there is a need to stop sending the reports. The factory default value is 2 (0.2°C).
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_144_1``` and is of type ```INTEGER```.


### Parameter 153: Overheat Protection & Notification

Overheat Protection & Notification
You can define the maximum limit of temperature, reaching which the device will automatically switch Off the load and send “Overheat Detected” notification to the gateway. The value of this parameter can be set from 1 to 120 in °C scale mode or from 34 to 248 in °F scale mode. Usethe value 0 if there is a need to disable this function.The factory default value is 60 in °C scale and 140 in °F scale.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_153_2``` and is of type ```INTEGER```.


### Parameter 154: Over-Current Notification

Enable/disable over-current notification
The maximum load for the device is 16A. If the connected load current exceeds16A the device will automatically switch Off the output and send the “Over-Current Detected” notification to the gateway. To disable sending the notification, set the value of this Parameter to 0. The factory default value is 1 (the notification is enabled).This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (Enabled).

This parameter has the configuration ID ```config_154_1``` and is of type ```INTEGER```.


### Parameter 155: Over-Load Protection & Notification

Over-Load Protection & Notification
You can define the maximum power in Watt for connected load. The device will automatically switchoff the output and send “Over-Load Detected” notification to the gateway if power consumed by the connected load exceeds this limit. The value of this parameter can be set from 100 to4000 in watts. Use the value 0 if there is a need to disable this function.The factory default value is 3500W.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |

The manufacturer defined default value is ```3500```.

This parameter has the configuration ID ```config_155_2``` and is of type ```INTEGER```.


### Parameter 156: Over-Voltage Protection & Notification

Over-Voltage Protection & Notification
The device constantly monitors the voltage of your electricity network. You can define the maximum voltage of network exceeding which the device will automatically switch off the output and send “Over-Voltage Detected” notification to the gateway. The value of this parameter can be set from 120 to 280 in volts. Use the value 0 if there is a needto disable this function.The factory default value is 240V.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |

The manufacturer defined default value is ```240```.

This parameter has the configuration ID ```config_156_2``` and is of type ```INTEGER```.


### Parameter 157: Voltage Drop Protection & Notification

Voltage Drop Protection & Notification
You can define the minimum voltage of your electricity network. If the voltage of the network drops determined level the device will automatically switch off the output and send “Voltage Drop Detected” notification to the gateway. The value of this parameter can be set from 80 to 240 in volts. Use the value 0 if there is a need to disable this function.The factory default value is 200V.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |

The manufacturer defined default value is ```200```.

This parameter has the configuration ID ```config_157_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The HE-HLS01 supports 4 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Used to connect Z-Wave gateway


Association group 1 supports 1 node.

### Group 2: Relay Basic Set

Sends relay state (On/Off)
Group 2 –“Relay Basic Set”:is assigned to the HE-HLS01 relay state. It sends a Basic Set command with value 255 (On) when relay goes to On state and sends 0 (Off) when relay goes to Off state. The group supports five Nodes.

Association group 2 supports 5 nodes.

### Group 3: S1 Basic Set

Sends external input state (On/Off)
Group 3 –“S1 Basic Set”:is assigned to the HE-HLS01 external input state. It sends a Basic Set command with value 255 (On) when external input is shorted and sends 0 (Off) when input is open. The group supports five Nodes.

Association group 3 supports 5 nodes.

### Group 4: Temperature Sensor

Sends external temperature values
Group 4 –“Temperature Sensor”:is assigned to the HE-HLS01 external temperature sensor and sends the sensor value when it changes. The group supports five nodes.

Association group 4 supports 5 nodes.

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
| COMMAND_CLASS_CLOCK_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Manual](https://opensmarthouse.org/zwavedatabase/1374/reference/Manual_Full_English_HE-HLS01_v1.0.0pdf.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1374).
