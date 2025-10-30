---
layout: documentation
title: Wave Shutter - ZWave
---

{% include base.html %}

# Wave Shutter Z-WaveTM shutter control with power measurement, 10 A per channel
This describes the Z-Wave device *Wave Shutter*, manufactured by *Shelly* with the thing type UID of ```shelly_waveshutter_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![Wave Shutter product image](https://opensmarthouse.org/zwavedatabase/1585/image/)


The Wave Shutter supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Automate and remotely control the position of roller shutters, blinds, windows, awnings, pool covers, and other devices powered by bi-directional AC motors.

  * Control the tilt position (angle) of the venetian blind slats
  * Supports push-buttons/momentary switches, and toggle switches
  * Power metering
  * Extremely low power consumption: < 0.3 W
  * Z-Wave frequency band: 868.4 MHz (CEPT countries)
  * Latest technology: Z-Wave 800 Series
  * Automatic set-up with SmartStart
  * Security 2 Authenticated for the highest level of security
  * Over-the-air firmware updates
  * Works with Z-Wave-certified gateways and over 4,000 Z-Wave devices

*A gateway (smart hub) is not included. A gateway (smart hub) is required for the configuration of the device.

### Inclusion Information

Adding the Device to a Z-Wave™ network (inclusion)

SmartStart adding (inclusion):

SmartStart enabled products can be added into a Z-Wave™ network by scanning the Z-Wave™ QR Code present on the Device with a gateway providing SmartStart inclusion. No further action is re-quired, and the SmartStart device will be added automatically with-in 10 minutes of being switched on in the network vicinity.

  1. With the gateway application scan the QR code on the Device label and add the Security 2 (S2) Device Specific Key (DSK) to the provisioning list in the gateway.
  2. Connect the Device to a power supply.
  3. Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave™ network.
  4. Adding will be initiated automatically within a few seconds after connecting the Device to a power supply, and the Device will be added to a Z-Wave™ network automatically.
  5. The blue LED will be blinking in Mode 2 during the adding process.
  6. The green LED will be blinking in Mode 1 if the Device is success-fully added to a Z-Wave™ network.

Adding (inclusion) with a switch/push-button:

  1. Connect the Device to a power supply.
  2. Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave™ network.
  3. Enable add/remove mode on the gateway.
  4. Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2, etc.) 3 times within 3 seconds (this procedure puts the Device in Learn mode**). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.
  5. The blue LED will be blinking in Mode 2 during the adding process.
  6. The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave™ network.

**Learn mode state allows the Device to receive network information from the gateway.

Adding (inclusion) with the S button:

  1. Connect the Device to a power supply.
  2. Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave™ network.
  3. Enable addi/remove mode on the gateway.
  4. To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.
  5. Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the Learn mode.
  6. The blue LED will be blinking in Mode 2 during the adding process.
  7. The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave™ network.

Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

### Exclusion Information

Removing the Device from a Z-Wave™ network (exclusion)

Note! The Device will be removed from your Z-wave™ network, but any custom configuration parameters will not be erased.

Removing (exclusion) with a switch/push-button:

  1. Connect the Device to a power supply.
  2. Check if the green LED is blinking in Mode 1. If so, the Device is added to a Z-Wave™ network.
  3. Enable add/remove mode on the gateway.
  4. Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2, etc.) 3 times within 3 seconds (this procedure puts the Device in Learn mode**). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.
  5. The blue LED will be blinking in Mode 2 during the removing process.
  6. The blue LED will be blinking in Mode 1 if the Device is successfully removed from a Z-Wave™ network.

Removing (exclusion) with the S button:

  1. Connect the Device to a power supply.
  2. Check if the green LED is blinking in Mode 1. If so, the Device is added to a Z-Wave™ network.
  3. Enable add/remove mode on the gateway.
  4. To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns Solid blue.
  5. Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the Learn mode.
  6. The blue LED will be blinking in Mode 2 during the removing process.
  7. The blue LED will be blinking in Mode 1 if the Device is successfully removed from a Z-Wave™ network.

Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

### General Usage Information

Factory reset

After Factory reset, all custom parameters and stored values (kWh, associations, routings, etc.) will return to their default state. HOME ID and NODE ID assigned to the Device will be deleted. Use this reset procedure only when the gateway is missing or otherwise inoperable.

Factory reset with a switch/push-button:

Note! Factory reset with the switch/push-button is only possible within the first minute after the Device is connected to a power supply.

  1. Connect the Device to a power supply.
  2. Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2, etc.) 5 times within 3 seconds. The Device must receive on/off signal 5 times, which means pressing the push-button 5 times, or toggling the switch on and off 5 times.
  3. During factory reset, the LED will turn solid green for about 1s, then the blue and red LED will start blinking in Mode 3 for approx. 2s.
  4. The blue LED will be blinking in Mode 1 if the Factory reset is successful.

Factory reset with the S button:

Note! Factory reset with the S button is possible anytime.

  1. To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns Solid blue.
  2. Press the S button multiple times until the LED turns Solid red.
  3. Press and hold (> 2s) S button on the Device until the red LED starts blinking in Mode 3. Releasing the S button will start the factory reset.
  4. During factory reset, the LED will turn solid green for about 1s, then the blue and red LED will start blinking in Mode 3 for approx. 2s.
  5. The blue LED will be blinking in Mode 1 if the factory reset is successful.

## Channels

The following table summarises the channels available for the Wave Shutter -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Shutter Position | blinds_control | blinds_control | Blinds | Rollershutter | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Alarm (heat) | alarm_heat | alarm_heat | temperature_hot | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Alarm (system) | alarm_system | alarm_system |  | Switch | 
| Blinds Control | blinds_control1 | blinds_control | Blinds | Rollershutter | 
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number | 
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number | 
| Alarm (heat) 1 | alarm_heat1 | alarm_heat | temperature_hot | Switch | 
| Alarm (power) 1 | alarm_power1 | alarm_power | Energy | Switch | 
| Alarm (system) 1 | alarm_system1 | alarm_system |  | Switch | 
| Lamella Position | blinds_control2 | blinds_control | Blinds | Rollershutter | 
| Electric meter (kWh) 2 | meter_kwh2 | meter_kwh | Energy | Number | 
| Electric meter (watts) 2 | meter_watts2 | meter_watts | Energy | Number | 
| Alarm (heat) 2 | alarm_heat2 | alarm_heat | temperature_hot | Switch | 
| Alarm (power) 2 | alarm_power2 | alarm_power | Energy | Switch | 
| Alarm (system) 2 | alarm_system2 | alarm_system |  | Switch | 

### Shutter Position
Sets the blinds shutter position.

Provides start / stop control of blinds.

The ```blinds_control``` channel is of type ```blinds_control``` and supports the ```Rollershutter``` item and is in the ```Blinds``` category.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```temperature_hot``` category. This is a read only channel so will only be updated following state changes from the device.

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

### Alarm (system)
Indicates if a system alarm is triggered.

The ```alarm_system``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Blinds Control
Provides start / stop control of blinds.

Provides start / stop control of blinds.

The ```blinds_control1``` channel is of type ```blinds_control``` and supports the ```Rollershutter``` item and is in the ```Blinds``` category.

### Electric meter (kWh) 1
Indicates the energy consumption (kWh).

The ```meter_kwh1``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 1
Indicates the instantaneous power consumption.

The ```meter_watts1``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (heat) 1
Indicates if a heat alarm is triggered.

The ```alarm_heat1``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```temperature_hot``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (power) 1
Indicates if a power alarm is triggered.

The ```alarm_power1``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (system) 1
Indicates if a system alarm is triggered.

The ```alarm_system1``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Lamella Position
Sets the blinds lamella position.

Provides start / stop control of blinds.

The ```blinds_control2``` channel is of type ```blinds_control``` and supports the ```Rollershutter``` item and is in the ```Blinds``` category.

### Electric meter (kWh) 2
Indicates the energy consumption (kWh).

The ```meter_kwh2``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 2
Indicates the instantaneous power consumption.

The ```meter_watts2``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (heat) 2
Indicates if a heat alarm is triggered.

The ```alarm_heat2``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```temperature_hot``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (power) 2
Indicates if a power alarm is triggered.

The ```alarm_power2``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (system) 2
Indicates if a system alarm is triggered.

The ```alarm_system2``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 14 configuration parameters available in the Wave Shutter.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Push-button (momentary) / bistable (toggle switch) selection | This parameter defines how the Device should treat the switch (which type) connected to the SW (SW1) terminal. |
| 3 | Inputs orientation | This parameter allows to reverse the operation of switches connected to SW1 and SW2 inputs without changing the wiring. |
| 5 | Output orientation | This parameter allows to reverse the operation of O1 and O2 without changing the wiring (in case of invalid motor connection) to ensure proper operation. |
| 40 | Power Consumption Reporting | Choose by how much the power (W) consumption needs to increase or decrease to be reported. Values correspond to percentages, so if 50 is set (by default), the Device will report any power consumption changes of 50 % or more, compared to the last reading. |
| 71 | Operating modes | Choose between the two operating modes. In shutter mode, you can select up/down/stop. In venetian mode, an additional widget/endpoint is displayed in the UI interface, which you can use to control the tilt position of the slats. |
| 72 | Venetian blind slats turning time | Set the time required for the slats to make a full turn (180 degrees). ⓘ NOTE: Make sure that working mode is set to venetian (Par. No. 71 =1) |
| 73 | Slats position after moving | This parameter is used to enable/disable the slats to return to the previously set position, after being activated via the gateway, push-button operation or when the lower limit switch is reached. |
| 74 | Up time | This parameter determines the time it takes for the roller blind to reach the top. For modes with positioning, the value is set automatically during calibration, otherwise, it must be set manually. |
| 75 | Down time | This parameter determines the time it takes for the roller blind to reach the bottom. For modes with positioning, the value is set automatically during calibration, otherwise, it must be set manually. |
| 76 | Motor operation detection | Define the power consumption threshold at the end positions. Based on this value, the Device will know that the shutters reached the limit switches. |
| 78 | Forced shutter calibration | By setting this parameter to value 1 the Device will start executing force calibration procedure. The parameter also reports the calibration status by sending the get parameter value command. NOTE: Check chapter Functionality with calibration details NO |
| 80 | Motor stop delay after limit switch detection | This parameter defines the delay time for the motor to turn off, after reaching the limit switch. |
| 85 | Power consumption max delay time | Define the maximum time before the power consumption of the motor is read from the Device, after one of the relays is switched on. If there is no power consumption during the set time (motor is not connected, damaged or requires longer time to start, moto |
| 91 | Max. Motor moving time | When the shutter is not calibrated (or the motor is not equipped with a limit switch), this parameter defines the movement time of the motor. |

### Parameter 1: Push-button (momentary) / bistable (toggle switch) selection

This parameter defines how the Device should treat the switch (which type) connected to the SW (SW1) terminal.
Values & descriptions:

0 - momentary switch (push button),

1 - toggle switch (contact closed - ON / contact opened - OFF),

2 - toggle switch (Device changes status when switch changes status)

NOTE: When set = 2, 1x click on SW1 up - 1x click on SW1 stop - 1x click down
The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | momentary switch (push button) |
| 1 | toggle switch (contact closed - ON / contact opened - OFF) |
| 2 | toggle switch (Device changes status when switch changes status) |

The manufacturer defined default value is ```2``` (toggle switch (Device changes status when switch changes status)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 3: Inputs orientation

This parameter allows to reverse the operation of switches connected to SW1 and SW2 inputs without changing the wiring.
Values & descriptions:

0 - default (SW1 - O1, I2 - O2)

1 - reversed (SW1 - O2, I2 - O1)
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | default (SW1 - O1, I2 - O2) |
| 1 | reversed (SW1 - O2, I2 - O1) |

The manufacturer defined default value is ```0``` (default (SW1 - O1, I2 - O2)).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 5: Output orientation

This parameter allows to reverse the operation of O1 and O2 without changing the wiring (in case of invalid motor connection) to ensure proper operation.
Values & descriptions:

0 - default (O1 - UP, O2 - DOWN)

1 - reversed (O1 - DOWN, O2 - UP)
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | default (O1 - UP, O2 - DOWN) |
| 1 | reversed (O1 - DOWN, O2 - UP) |

The manufacturer defined default value is ```0``` (default (O1 - UP, O2 - DOWN)).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 40: Power Consumption Reporting

Choose by how much the power (W) consumption needs to increase or decrease to be reported. Values correspond to percentages, so if 50 is set (by default), the Device will report any power consumption changes of 50 % or more, compared to the last reading.
Values & descriptions:

0 - Power consumption reporting disabled

1 - 100 = 1 % - 100 % Power consumption reporting enabled. New value is reported only when the power consumption in real time changes by more than the percentage value set in this parameter, compared to the previous power consumption reading, starting at 1 % (the lowest value possible).

NOTE: Power consumption needs to increase or decrease by at least 1 Watt to be reported, REGARDLESS of the percentage set in this parameter.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 71: Operating modes

Choose between the two operating modes. In shutter mode, you can select up/down/stop. In venetian mode, an additional widget/endpoint is displayed in the UI interface, which you can use to control the tilt position of the slats.
Values & descriptions:

0 - Shutter mode

1 - Venetian mode with (up/down and slats rotation)

2 – Manual time set (No end switches)

NOTE: If the motor is not equipped with end switches set value to 2 and set the traveling time (Parameter No. 74 & 75).
The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | Shutter mode |
| 1 | Venetian mode with (up/down and slats rotation) |
| 2 | Manual time set (No end switches) |

The manufacturer defined default value is ```0``` (Shutter mode).

This parameter has the configuration ID ```config_71_1``` and is of type ```INTEGER```.


### Parameter 72: Venetian blind slats turning time

Set the time required for the slats to make a full turn (180 degrees). ⓘ NOTE: Make sure that working mode is set to venetian (Par. No. 71 =1)
Values & descriptions:

0 - turning time disabled

1 - 32767 = 0.01 seconds – 327.67 seconds

NOTE: If the set time is too long and a full turn was already performed, the device will start moving up or down for the remaining time. In this case, shorten the turning time.
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```150```.

This parameter has the configuration ID ```config_72_2``` and is of type ```INTEGER```.


### Parameter 73: Slats position after moving

This parameter is used to enable/disable the slats to return to the previously set position, after being activated via the gateway, push-button operation or when the lower limit switch is reached.
Values & their descriptions:

0 - disable

1 - enable

NOTE: Make sure that working mode is set to venetian (Par. No. 71=1)
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | disable |
| 1 | enable |

The manufacturer defined default value is ```1``` (enable).

This parameter has the configuration ID ```config_73_1``` and is of type ```INTEGER```.


### Parameter 74: Up time

This parameter determines the time it takes for the roller blind to reach the top. For modes with positioning, the value is set automatically during calibration, otherwise, it must be set manually.
1 - 65535 (0.01 - 655.35s, every 0.01s) - movement time
Values in the range 1 to 65535 may be set.

The manufacturer defined default value is ```6000```.

This parameter has the configuration ID ```config_74_2``` and is of type ```INTEGER```.


### Parameter 75: Down time

This parameter determines the time it takes for the roller blind to reach the bottom. For modes with positioning, the value is set automatically during calibration, otherwise, it must be set manually.
1 - 65535 (0.01 - 655.35s, every 0.01s) - movement time
Values in the range 1 to 65535 may be set.

The manufacturer defined default value is ```6000```.

This parameter has the configuration ID ```config_75_2``` and is of type ```INTEGER```.


### Parameter 76: Motor operation detection

Define the power consumption threshold at the end positions. Based on this value, the Device will know that the shutters reached the limit switches.
Values & their descriptions:

0 - Disabled: reaching a limit switch will not be detected

1 - Auto power calibration

2 - 2-255 (2-255W) - report interval

NOTE: For correct auto power calibration the shutter calibration must be performed!
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_76_1``` and is of type ```INTEGER```.


### Parameter 78: Forced shutter calibration

By setting this parameter to value 1 the Device will start executing force calibration procedure. The parameter also reports the calibration status by sending the get parameter value command. NOTE: Check chapter Functionality with calibration details NO
Values & their descriptions:

1 - start calibration

2 - device is calibrated (read only)

3 - device is not calibrated (read only)

4 - calibration error (read only)
The following option values may be configured, in addition to values in the range 1 to 4 -:

| Value  | Description |
|--------|-------------|
| 1 | start calibration |
| 2 | device is calibrated (read only) |
| 3 | device is not calibrated (read only) |
| 4 | calibration error (read only) |

The manufacturer defined default value is ```3``` (device is not calibrated (read only)).

This parameter has the configuration ID ```config_78_1``` and is of type ```INTEGER```.


### Parameter 80: Motor stop delay after limit switch detection

This parameter defines the delay time for the motor to turn off, after reaching the limit switch.
Values & their descriptions:

Default value 10 = (1s)

0-255 (0-25.5s) - time
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_80_1``` and is of type ```INTEGER```.


### Parameter 85: Power consumption max delay time

Define the maximum time before the power consumption of the motor is read from the Device, after one of the relays is switched on. If there is no power consumption during the set time (motor is not connected, damaged or requires longer time to start, moto
Values & descriptions:

0 = time is set automatically

3 - 50 = 0.3seconds – 5seconds (100ms resolution)
Values in the range 0 to 50 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_85_1``` and is of type ```INTEGER```.


### Parameter 91: Max. Motor moving time

When the shutter is not calibrated (or the motor is not equipped with a limit switch), this parameter defines the movement time of the motor.
Values & descriptions:

value = 1 - 32000s

value = 65000 = unlimited time
Values in the range 1 to 65000 may be set.

The manufacturer defined default value is ```120```.

This parameter has the configuration ID ```config_91_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Wave Shutter supports 7 association groups.

### Group 1: Association Group 1 - Lifeline

Association group 1 – “Lifeline Group” reports the status of the Device status and allows to assign only one device (gateway by default); only 1 node is allowed. The following command classes are supported
Association Group 1 - Lifeline

1. DEVICE\_RESET\_LOCALLY_NOTIFICATION : triggered upon request

2. SWITCH\_BINARY\_REPORT : status change report for all outputs O (O, O1, O2, …) - common

3. NOTIFICATION_REPORT : triggered on Overheat

4. NOTIFICATION_REPORT : triggered on Over-load detected sum of all outputs O (O1+O2+…)

5. METER_REPORT : triggered according to Configuration parameters

Association group 1 supports 2 nodes.

### Group 2: Association Group 2

It is assigned to switch connected to the SW 1or SW1 terminal (uses Switch Multilevel command class). Triggered by SW 1 or SW2 valid for Shutter mode.
Supports the following command classes:

1. SWITCH\_MULTILEVEL\_START\_LEVEL\_CHANGE : initiate a transition to a new level (increase or decrease light intensity in case of dimmer, or move shutter up or down, …)

2. SWITCH\_MULTILEVEL\_STOP\_LEVEL\_CHANGE : stop an ongoing transition (stop increase or decrease light intensity in case of dimmer, or stop moving shutter up or down, …)

It is recommended to use push buttons for this association.

Association group 2 supports 9 nodes.

### Group 3: Association Group 3

It is assigned to switch connected to the SW (SW1) terminal (uses Switch Multilevel command class). Triggered by SW 1 or SW2 valid for Venetian mode
Supports the following command classes:

1. SWITCH\_MULTILEVEL\_START\_LEVEL\_CHANGE : initiate a transition to a new level (increase or decrease light intensity in case of dimmer, or move shutter up or down, …)

2. SWITCH\_MULTILEVEL\_STOP\_LEVEL\_CHANGE : stop an ongoing transition (stop increase or decrease light intensity in case of dimmer, or stop moving shutter up or down, …)

It is recommended to use push buttons for this association.

Association group 3 supports 9 nodes.

### Group 4: Association Group 4

When blinds are moving up, Shutter will send Basic set ON command to associated device and associated device will turn ON. When blinds are moving down, Flush Shutter will send Basic set OFF command to associated device and the device will turn OFF. Trigg
Supports the following command classes:

BASIC_SET : set On / Off state at the associated device

Association group 4 supports 16 nodes.

### Group 5: Association Group 5

When blinds reach upper position, Shutter will send Basic set OFF command to associated device and the device will turn OFF. When blinds reach down position Flush Shutter will send Basic set ON command to associated device and the device will turn ON. Tri
Supports the following command classes:

BASIC_SET : set On / Off state at the associated device

Association group 5 supports 16 nodes.

### Group 6: Association Group 6

It is assigned to switch connected to the SW 1or SW1 terminal (uses Switch Multilevel command class). Triggered by SW 1 or SW2 valid for Shutter mode.
Supports the following command classes:

1. SWITCH\_MULTILEVEL\_START\_LEVEL\_CHANGE : initiate a transition to a new level (increase or decrease light intensity in case of dimmer, or move shutter up or down, …)

2. SWITCH\_MULTILEVEL\_STOP\_LEVEL\_CHANGE : stop an ongoing transition (stop increase or decrease light intensity in case of dimmer, or stop moving shutter up or down, …)

It is recommended to use push buttons for this association.

Association group 6 supports 9 nodes.

### Group 7: Association Group 7

It is assigned to switch connected to the SW (SW1) terminal (uses Switch Multilevel command class). Triggered by SW 1 or SW2 valid for Venetian mode
Supports the following command classes:

1. SWITCH\_MULTILEVEL\_START\_LEVEL\_CHANGE : initiate a transition to a new level (increase or decrease light intensity in case of dimmer, or move shutter up or down, …)

2. SWITCH\_MULTILEVEL\_STOP\_LEVEL\_CHANGE : stop an ongoing transition (stop increase or decrease light intensity in case of dimmer, or stop moving shutter up or down, …)

It is recommended to use push buttons for this association.

Association group 7 supports 9 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_2_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |

### Documentation Links

* [Device manual](https://opensmarthouse.org/zwavedatabase/1585/reference/Wave_Shutter_user_guide_multilang_print_V3.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1585).
