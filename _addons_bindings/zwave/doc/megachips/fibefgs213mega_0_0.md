---
layout: documentation
title: FIBEFGS-213 - ZWave
---

{% include base.html %}

# FIBEFGS-213 FIBARO Single Relais Switch
This describes the Z-Wave device *FIBEFGS-213*, manufactured by *MegaChips* with the thing type UID of ```megachips_fibefgs213mega_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![FIBEFGS-213 product image](https://www.cd-jackson.com/zwave_device_uploads/1085/1085_default.jpg)


The FIBEFGS-213 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

FIBARO Switch 2 is designed to be installed in standard wall switch boxes or anywhere else where it is necessary to control electric devices. FIBARO Switch 2 allows to control connected devices either via the Z-Wave+ network or via a switch connected directly to it and is equipped with active power and energy consumption metering functionality.

### Inclusion Information

Z-Wave device learning mode, allowing to add the device to existing Z-Wave network.  
To add the device to the Z-Wave network:

  1. Place the Switch 2 within the direct range of your Z-Wave controller.
  2. Identify the S1 switch.
  3. Set the main controller in (security/non-security) add mode (see the controller’s manual).
  4. Quickly, three times press the S1 switch.
  5. Wait for the adding process to end.
  6. Successful adding will be confirmed by the Z-Wave controller’s message.

### Exclusion Information

Z-Wave device learning mode, allowing to remove the device from existing Z-Wave network.  
To remove the device from the Z-Wave network:

  1. Place the Switch 2 within the direct range of your Z-Wave controller.
  2. Identify the S1 switch.
  3. Set the main controller in remove mode (see the controller’s manual).
  4. Quickly, three times press the S1 switch.
  5. Wait for the removing process to end.
  6. Successful removing will be confirmed by the Z-Wave controller’s message.

## Channels

The following table summarises the channels available for the FIBEFGS-213 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Scene Number | scene_number | scene_number |  | Number | 
| Alarm | alarm_general | alarm_general | Alarm | Switch | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.
This channel provides the scene, and the event as a decimal value in the form ```<scene>.<event>```. The scene number is set by the device, and the event is as follows -:

| Event ID | Event Description  |
|----------|--------------------|
| 0        | Single key press   |
| 1        | Key released       |
| 2        | Key held down      |
| 3        | Double keypress    |
| 4        | Tripple keypress   |
| 5        | 4 x keypress       |
| 6        | 5 x keypress       |

### Alarm
Indicates if an alarm is triggered.

The ```alarm_general``` channel is of type ```alarm_general``` and supports the ```Switch``` item and is in the ```Alarm``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 29 configuration parameters available in the FIBEFGS-213.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 9 | Restore state after power failure | Restore state after power failure |
| 10 | First channel operating mode | First channel - operating mode |
| 11 | 1st ch. reaction to switch | First channel - reaction to switch for delay/auto ON/OFF modes |
| 12 | time parameter for delay/auto ON/OFF modes | First channel - time parameter for delay/auto ON/OFF modes |
| 13 | 1st ch. pulse time for flashing mode | First channel - pulse time for flashing mode |
| 20 | Switch type | Switch type |
| 21 | Flashing mode - reports | Flashing mode - reports |
| 27 | Associations in Z-Wave network security mode | Associations in Z-Wave network security mode |
| 28 | S1 switch - scenes sent | S1 switch - scenes sent |
| 29 | S2 switch - scenes sent | S2 switch - scenes sent |
| 30 | S1 assocs. sent to 2nd and 3rd group | S1 switch - associations sent to 2nd and 3rd association groups |
| 31 | S1 ON val sent to 2nd and 3rd groups | S1 switch - Switch ON value sent to 2nd and 3rd association groups |
| 32 | S1 OFF val sent to 2nd and 3rd groups | S1 switch - Switch ON value sent to 2nd and 3rd association groups |
| 33 | S1 DblClick val sent to 2nd and 3rd groups | S1 switch - Double Click value sent to 2nd and 3rd association groups |
| 35 | S2 assocs. sent to 4th and 5th group | S2 switch - associations sent to 4th and 5th association groups |
| 36 | S2 switch ON value sent to 4th and 5th ass. groups | S2 switch - Switch ON value sent to 4th and 5th association groups |
| 37 | S2 switch OFF sent to 4th and 5th groups | S2 switch - Switch OFF value sent to 4th and 5th association groups |
| 38 | S2 double click sent to 4th and 5th ass. grps. | S2 switch - Double Click value sent to 4th and 5th association groups |
| 40 | Reaction to General Alarm | Reaction to General Alarm |
| 41 |  Reaction to Flood Alarm | Reaction to Flood Alarm |
| 42 | CO/CO2/Smoke Alarm | Reaction to CO/CO2/Smoke Alarm |
| 43 | Reaction to Heat Alarm | Reaction to Heat Alarm |
| 44 | Flashing alarm duration | Flashing alarm duration |
| 50 | Active power reports | Power level reporting threshold. |
| 51 | Minimal time between power report | Determines minimal time between power reports |
| 53 | Energy reports | Energy level change resulting in sending a new energy report. |
| 58 | Periodic power reports | Determines time interval for periodic power reports |
| 59 | Periodic energy reports | Determines time interval for periodic energy reports |
| 60 | Measuring energy consumed by the device itself | Determines if energy consumed by device should be included |

### Parameter 9: Restore state after power failure

Restore state after power failure
This parameter determines if the device will return to state prior to the power failure after power is restored.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | off after power loss |
| 1 | restore last state |

The manufacturer defined default value is ```1``` (restore last state).

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: First channel operating mode

First channel - operating mode
This parameter allows to choose operating for the 1st channel controlled by the S1 switch.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | standard operation |
| 1 | delay ON |
| 2 | delay OFF |
| 3 | auto ON |
| 4 | auto OFF |
| 5 | flashing mode |

The manufacturer defined default value is ```0``` (standard operation).

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: 1st ch. reaction to switch

First channel - reaction to switch for delay/auto ON/OFF modes
This parameter determines how the device in timed mode reacts to pushing the switch connected to the S1 terminal.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | cancel mode and set target state |
| 1 | no reaction to switch - mode runs until it ends |
| 2 | reset timer - start counting from the beginning |

The manufacturer defined default value is ```0``` (cancel mode and set target state).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: time parameter for delay/auto ON/OFF modes

First channel - time parameter for delay/auto ON/OFF modes
This parameter allows to set time parameter used in timed modes.

Available settings: 0 (0.1s), 1-32000 (1-32000s, 1s step) - time parameter

Default setting: 50 (50s)
Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: 1st ch. pulse time for flashing mode

First channel - pulse time for flashing mode
This parameter allows to set time of switching to opposite state in flashing mode

Available settings: 1-32000 (0.1-3200.0s, 0.1s step) - time parameter

Default setting: 5 (0.5s)
Values in the range 1 to 32000 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_13_2``` and is of type ```INTEGER```.


### Parameter 20: Switch type

Switch type
This parameter defines as what type the device should treat the switch connected to the S1 and S2 terminals
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | momentary switch |
| 1 | toggle switch stable |
| 2 | toggle switch |

The manufacturer defined default value is ```2``` (toggle switch).

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: Flashing mode - reports

Flashing mode - reports

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | the device does not send reports |
| 1 | the device sends reports |

The manufacturer defined default value is ```0``` (the device does not send reports).

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 27: Associations in Z-Wave network security mode

Associations in Z-Wave network security mode
This parameter defines how commands are sent in specified association groups: as secure or non-secure. Parameter is active only in Z-Wave network security mode. This parameter does not apply to 1st „Lifeline” group.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | no group sent as secure |
| 1 | 2nd group sent as secure |
| 2 | 3rd group sent as secure |
| 4 | 4th group sent as secure |
| 8 | 5th group sent as secure |
| 15 | all groups sent as secure |

The manufacturer defined default value is ```15``` (all groups sent as secure).

This parameter has the configuration ID ```config_27_1``` and is of type ```INTEGER```.


### Parameter 28: S1 switch - scenes sent

S1 switch - scenes sent
This parameter determines which actions result in sending scene IDs assigned to them
The following option values may be configured, in addition to values in the range 0 to 15 -:

| Value  | Description |
|--------|-------------|
| 0 | no scenes sent |
| 1 | Key pressed 1 time |
| 2 | Key pressed 2 times |
| 4 | Key pressed 3 times |
| 8 | Key Hold Down and Key Released |

The manufacturer defined default value is ```0``` (no scenes sent).

This parameter has the configuration ID ```config_28_1``` and is of type ```INTEGER```.


### Parameter 29: S2 switch - scenes sent

S2 switch - scenes sent
This parameter determines which actions result in sending scene IDs assigned to them
The following option values may be configured, in addition to values in the range 0 to 15 -:

| Value  | Description |
|--------|-------------|
| 0 | no scenes sent |
| 1 | Key pressed 1 time |
| 2 | Key pressed 2 times |
| 4 | Key pressed 3 times |
| 8 | Key Hold Down and Key Released |

The manufacturer defined default value is ```0``` (no scenes sent).

This parameter has the configuration ID ```config_29_1``` and is of type ```INTEGER```.


### Parameter 30: S1 assocs. sent to 2nd and 3rd group

S1 switch - associations sent to 2nd and 3rd association groups
This parameter determines which actions are ignored when sending commands to devices associated in 2nd and 3rd association group. All actions are active by default.
The following option values may be configured, in addition to values in the range 0 to 15 -:

| Value  | Description |
|--------|-------------|
| 0 | All actions are active by default |
| 1 | ignore turning ON with 1 click of the switch |
| 2 | ignore turning OFF with 1 click of the switch |
| 4 | ignore holding and releasing the switch |
| 8 | ignore double click of the switch |

The manufacturer defined default value is ```0``` (All actions are active by default).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 31: S1 ON val sent to 2nd and 3rd groups

S1 switch - Switch ON value sent to 2nd and 3rd association groups

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_31_2``` and is of type ```INTEGER```.


### Parameter 32: S1 OFF val sent to 2nd and 3rd groups

S1 switch - Switch ON value sent to 2nd and 3rd association groups
This parameter defines value sent with Switch OFF command to devices associated in 2nd and 3rd association group.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_32_2``` and is of type ```INTEGER```.


### Parameter 33: S1 DblClick val sent to 2nd and 3rd groups

S1 switch - Double Click value sent to 2nd and 3rd association groups

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_33_2``` and is of type ```INTEGER```.


### Parameter 35: S2 assocs. sent to 4th and 5th group

S2 switch - associations sent to 4th and 5th association groups
This parameter determines which actions result in sending commands to devices associated in 4th and 5th association group. All actions are active by default.
The following option values may be configured, in addition to values in the range 0 to 15 -:

| Value  | Description |
|--------|-------------|
| 0 | All actions are active by default |
| 1 | ignore turning on with 1 click of the switch |
| 2 | ignore turning off with 1 click of the switch |
| 4 | ignore holding and releasing the switch |
| 8 | ignore double click of the switch |

The manufacturer defined default value is ```0``` (All actions are active by default).

This parameter has the configuration ID ```config_35_1``` and is of type ```INTEGER```.


### Parameter 36: S2 switch ON value sent to 4th and 5th ass. groups

S2 switch - Switch ON value sent to 4th and 5th association groups
This parameter defines value sent with Switch On command to devices associated in 4th and 5th association group. 
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_36_1``` and is of type ```INTEGER```.


### Parameter 37: S2 switch OFF sent to 4th and 5th groups

S2 switch - Switch OFF value sent to 4th and 5th association groups
This parameter defines value sent with Switch OFF command to devices associated in 4th and 5th association group. 
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_37_2``` and is of type ```INTEGER```.


### Parameter 38: S2 double click sent to 4th and 5th ass. grps.

S2 switch - Double Click value sent to 4th and 5th association groups
This parameter defines value sent with Double Click command to devices associated in 4th and 5th association group. 
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_38_2``` and is of type ```INTEGER```.


### Parameter 40: Reaction to General Alarm

Reaction to General Alarm
This parameter determines how the device will react to General Alarm frame. 
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Ignore |
| 1 | Turn ON |
| 2 | Turn OFF |
| 40 | Flash |

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 41:  Reaction to Flood Alarm

Reaction to Flood Alarm
This parameter determines how the device will react to Flood Alarm frame. 
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Ignore |
| 1 | Turn ON |
| 2 | Turn OFF |
| 3 | Flash |

The manufacturer defined default value is ```2``` (Turn OFF).

This parameter has the configuration ID ```config_41_1``` and is of type ```INTEGER```.


### Parameter 42: CO/CO2/Smoke Alarm

Reaction to CO/CO2/Smoke Alarm
This parameter determines how the device will react to CO, CO2 or Smoke frame. 
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Ignore |
| 1 | Turn ON |
| 2 | Turn OFF |
| 3 | Flash |

The manufacturer defined default value is ```3``` (Flash).

This parameter has the configuration ID ```config_42_1``` and is of type ```INTEGER```.


### Parameter 43: Reaction to Heat Alarm

Reaction to Heat Alarm
This parameter determines how the device will react to Heat Alarm frame. 
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Ignore |
| 1 | Turn ON |
| 2 | Turn OFF |
| 3 | Flash |

The manufacturer defined default value is ```1``` (Turn ON).

This parameter has the configuration ID ```config_43_1``` and is of type ```INTEGER```.


### Parameter 44: Flashing alarm duration

Flashing alarm duration
This parameter allows to set duration of flashing alarm mode.  (1-32000s duration, 1s step). The default value (600) represents 10 minutes.
Values in the range 1 to 32000 may be set.

The manufacturer defined default value is ```600```.

This parameter has the configuration ID ```config_44_2``` and is of type ```INTEGER```.


### Parameter 50: Active power reports

Power level reporting threshold.
The parameter defines the power level change that will result in a new power report being sent. The value is a percentage of the previous report. 0 disables the function.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_50_1``` and is of type ```INTEGER```.


### Parameter 51: Minimal time between power report

Determines minimal time between power reports
This  parameter determines minimum time that has to elapse before sending new power report to the main controller. 0 disables the function. 1-120s - report interval in seconds
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_51_1``` and is of type ```INTEGER```.


### Parameter 53: Energy reports

Energy level change resulting in sending a new energy report.
Energy level change which will result in sending a new energy report. Available settings: 1-32000 (0.01 - 320 kWh). 0 disables the function.
Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_53_2``` and is of type ```INTEGER```.


### Parameter 58: Periodic power reports

Determines time interval for periodic power reports
This  parameter  determines  in  what  time  interval  the  periodic  power   reports are sent to the main controller. 0  - periodic reports are disabled, 1-32000  (1-32000s) - report interval
Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```3600```.

This parameter has the configuration ID ```config_58_2``` and is of type ```INTEGER```.


### Parameter 59: Periodic energy reports

Determines time interval for periodic energy reports
This parameter determines in what time interval the periodic energy reports are sent to the main controller. 0  - periodic reports are disabled 1-32000  (1-32000s) - report interval
Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```3600```.

This parameter has the configuration ID ```config_59_2``` and is of type ```INTEGER```.


### Parameter 60: Measuring energy consumed by the device itself

Determines if energy consumed by device should be included
This parameter determines whether energy metering should include  the amount of energy consumed by the device itself. Results are be - ing added to energy reports for first endpoint. 0: Function deactivated 1: Function activated
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Self-measurement inactive |
| 1 | Self-measurement active |

The manufacturer defined default value is ```0``` (Self-measurement inactive).

This parameter has the configuration ID ```config_60_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The FIBEFGS-213 supports 5 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Status
Reports the device status and allows

Association group 1 supports 10 nodes.

### Group 2: Switch 1

Switch 1 On/Off
This is assigned to the switch connected to the S1 terminal (uses Basic command class).

Association group 2 supports 10 nodes.

### Group 3: Dimmer 1

Dimmer for Switch 1

Association group 3 supports 10 nodes.

### Group 4: Switch 2

Switch 2 On/Off
This is assigned to the switch connected to the S2 terminal (uses Basic command class).

Association group 4 supports 10 nodes.

### Group 5: Dimmer 2

Dimmer for Switch 2
This is assigned to the switch connected to the S2 terminal (uses Switch Multilevel command class).

Association group 5 supports 10 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_CRC_16_ENCAP_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V5| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_PROTECTION_V2| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [device manual](https://www.cd-jackson.com/zwave_device_uploads/1085/FGS-2x3-EN-T-v1-2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1085).
