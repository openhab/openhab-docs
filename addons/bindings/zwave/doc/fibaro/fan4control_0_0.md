---
layout: documentation
title: Fan4-Control - ZWave
---

{% include base.html %}

# Fan4-Control Fan Coil Thermostat (4-pipe)
This describes the Z-Wave device *Fan4-Control*, manufactured by *[Fibargroup](http://www.fibaro.com/)* with the thing type UID of ```fibaro_fan4control_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![Fan4-Control product image](https://opensmarthouse.org/zwavedatabase/1618/image/)


The Fan4-Control supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Fan4-Control is a Z-Wave enabled thermostat designed specifically for 4-pipe fan coil systems, ensuring optimal indoor temperature control. Compatible with various Nice hubs equipped with Z-Wave technology, such as Yubii Home, Yubii Home Pro, and FIBARO Home Center models. This device enhances energy efficiency and user comfort by allowing detailed control settings through Z-Wave network commands.

### Inclusion Information

To include the Fan4-Control device using the manual method, set your Z-Wave gateway (such as Yubii Home) to inclusion mode and then perform a long press of the "fan speed button" and "temperature up button" on the device to enter adding mode. For SmartStart inclusion, scan the DSK QR code or enter the 5-digit PIN, then power the device. Successful inclusion will be indicated on the device’s display, showing the node number in the Z-Wave network.

### Exclusion Information

To exclude the Fan4-Control device from your Z-Wave network, set your gateway to exclusion mode. Perform a long press of the "fan speed button" and "temperature up button" on the device to initiate the removal mode. The display will show the existing product ID. Press the 'M' button (Mode) to exclude the device from the network; successful exclusion will be confirmed by the display showing "000".

### General Usage Information



## Channels

The following table summarises the channels available for the Fan4-Control -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Setpoint (cooling) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Thermostat fan mode | thermostat_fanmode | thermostat_fanmode |  |  | 
| Thermostat fan state | thermostat_fanstate | thermostat_fanstate |  |  | 

### Sensor (relative humidity)
Indicates the current relative humidity.

The ```sensor_relhumidity``` channel is of type ```sensor_relhumidity``` and supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Setpoint (cooling)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Setpoint (heating)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Thermostat fan mode
Channel type information on this channel is not found.

### Thermostat fan state
Channel type information on this channel is not found.



## Device Configuration

The following table provides a summary of the 15 configuration parameters available in the Fan4-Control.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Temperature Unit | Sets the temperature unit displayed by the device. |
| 2 | Automatic Temperature Value Reporting  | Automatic Temperature Value Reporting |
| 3 | Automatic Humidity Value Reporting | Automatic Humidity Value Reporting |
| 12 | Power Failure Memory | Power Failure Memory |
| 13 | Backlight Brightness | Backlight Brightness |
| 14 | Beep Volume | Beep Volume |
| 21 | Function option for external temperature sensor | Function option for external temperature sensor |
| 22 |  Switch for anti-freeze protection | Switch for anti-freeze protection |
| 23 |  Fan mode option when reaching setting | Fan mode option when indoor temp. reaches to setting temp |
| 24 | Fan Working Mode | Fan Working Mode |
| 25 |  Panel lock | Panel lock |
| 27 | Option For Interval Ventilation Feature | Toggle interval ventilation |
| 28 | Ventilation Duration | Sets duration for interval ventilation |
| 29 | Temperature Hysteresis | Configures temperature hysteresis |
| 255 | Factory Restore | Factory Restore |

### Parameter 1: Temperature Unit

Sets the temperature unit displayed by the device.
Available Settings: 0-1 (0: Celsius, 1: Fahrenheit)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Automatic Temperature Value Reporting 

Automatic Temperature Value Reporting
Automatically report temperature changes to the gateway when variation exceeds a set threshold in Celsius or Fahrenheit.  
Available Settings: 0, 3-255 (0: OFF, 3-255: Threshold for reporting, in 0.1°C or 0.1ºF increments)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Automatic Humidity Value Reporting

Automatic Humidity Value Reporting
Automatically report humidity changes to the gateway when variation exceeds a set threshold.  
Available Settings: 0-99 (0: OFF, 1-99: Threshold for reporting)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_3_0``` and is of type ```INTEGER```.


### Parameter 12: Power Failure Memory

Power Failure Memory
Determines device behavior after power restoration.  
Available Settings: 0-2 (0: Shutdown state, 1: Working interface, 2: Last state before power failure)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Backlight Brightness

Backlight Brightness
Sets the backlight brightness level.  
Available Settings: 1-5 (1: Dim, 2: Low brightness, 3: Medium brightness, 4: High brightness, 5: Always on)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Beep Volume

Beep Volume
Controls the beep volume for button presses.  
Available Settings:  
1: OFF, 2: Low Beep, 3: Medium Beep, 4: High Beep, 5: Standard Beep
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 21: Function option for external temperature sensor

Function option for external temperature sensor
0: External temperature sensor work as high temperature protection detection

1: External temperature sensor work as main control temperature
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22:  Switch for anti-freeze protection

Switch for anti-freeze protection
1: Turn on  
0: Turn off  
Default protection temperature range: (5.0°C - 8.0°C)  
Anti-Freeze feature is available only when heating mode, turn on when temperature decrease to 5.0 °C, turn off when temperature increase to 8.0°C
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_22_1``` and is of type ```INTEGER```.


### Parameter 23:  Fan mode option when reaching setting

Fan mode option when indoor temp. reaches to setting temp
1: Manual fan speed, keep fan speed, valve turned off, Auto fan speed, keep low fan speed  
0: Fan turned off
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.


### Parameter 24: Fan Working Mode

Fan Working Mode
0: Fan works in both cooling and heating mode  
1: Fan works only in cooling mode  
2: Fan works only in heating mode  
3: Fan does not work neither in cooling nor heating mode
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 25:  Panel lock

Panel lock
1:Turn on  
0:Turn off
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 27: Option For Interval Ventilation Feature

Toggle interval ventilation
Enables (1) or disables (0) the interval ventilation feature to maintain air quality.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_27_1``` and is of type ```INTEGER```.


### Parameter 28: Ventilation Duration

Sets duration for interval ventilation
Configures the duration for interval ventilation within a one-hour period, ranging from 1 to 30 minutes.
Values in the range 1 to 30 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_28_1``` and is of type ```INTEGER```.


### Parameter 29: Temperature Hysteresis

Configures temperature hysteresis
Sets the hysteresis level or deadband for temperature control, ensuring the temperature remains within a set range before reactivating heating or cooling.
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```15```.

This parameter has the configuration ID ```config_29_1``` and is of type ```INTEGER```.


### Parameter 255: Factory Restore

Factory Restore
55: write 55 to restore factory setting and turn to shut down interface 

Other Value: invalid     
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```53```.

This parameter has the configuration ID ```config_255_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Fan4-Control supports 1 association group.

### Group 1: Controller Lifeline

Controller Lifeline
Gateway Controller association group

Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_THERMOSTAT_FAN_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_FAN_STATE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Fan4-Control manual](https://opensmarthouse.org/zwavedatabase/1618/reference/IS0919A00EN.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1618).
