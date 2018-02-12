
# FGRM222 Roller Shutter

This describes the Z-Wave device **FGRM222**, manufactured by **Fibargroup** with the thing type UID of ```fibaro_fgrm222_24_024```. 

Roller Shutter  


# Overview #

The device allows for controlling motors of roller blinds, awnings, venetian blinds, gates and others, which are single phase AC powered.

  


## Inclusion Information ##

Fibaro Roller Shutter may be included into the Z-Wave network via the B-button or a push button connected to the S1 terminal. In addition, the module may be included in auto inclusion mode, by simply connecting the power supply.

Automatic Z-Wave network inclusion:

1.  Make sure the power supply is disconnected and a Roller Shutter is located within a direct Z-Wave network’s main controller communication range.
2.  Set the main controller into the learn mode (see main controllers operating manual).
3.  Connect the power supply to include the Roller Shutter in auto inclusion mode. 4) Fibaro Roller Shutter will be automatically detected and included into the Z-Wave network.

To disable the auto inclusion mode, press the B-button briefly, after connecting the module to the power supply.

Manual Z-Wave network inclusion: 

1.  Connect the power supply.
2.  Set the main controller into the learn mode (see main controllers operating manual).
3.  Triple click the B-button or a push button connected to the S1 terminal.
4.  Fibaro Roller Shutter will be detected and included into the Z-Wave network.

  


## Exclusion Information ##

1.  Make sure the module is connected to the power supply.
2.  Set the main controller into the learn mode (see main controllers operating manual).
3.  Triple click the B-button or a push button connected to the S1 terminal.

  


## Wakeup Information ##

device has mains power, doesn't sleep.

## Channels
The following table summarises the channels available for the FGRM222 Roller Shutter.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Blinds Control | blinds_control | blinds_control | Blinds | Rollershutter |
| Scene Number | scene_number | scene_number |  | Number |
| Sensor (power) | sensor_power | sensor_power | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |



### Blinds Control

#### Invert control

Invert the blinds control


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_invert_control |
| Data Type        | BOOLEAN || Default Value | false |
| Options | Yes (true) |
|  | No (false) |




#### Invert percentage value

Invert the blinds percentage value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_invert_percent |
| Data Type        | BOOLEAN || Default Value | false |
| Options | Yes (true) |
|  | No (false) |




#### Step duration

Sets the dim rate speed  
Values from 1 to 127 are defined in seconds, while values from 128 to 254 are defined in minutes.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_duration |
| Data Type        | INTEGER |
| Range | 1 to 254 || Default Value | 255 |
| Options | Device Default (255) |
|  | Change Instantly (0) |






### Device Configuration
The following table provides a summary of the configuration parameters available in the FGRM222 Roller Shutter.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 3: Reports type | value should be set to 1 if the module operates in Venetian Blind mode. |
| 10: Roller Shutter operating modes |  |
| 12: Turning time/ delay time | depending on mode, turning time or delay time |
| 13: Lamellas positioning mode | Parameter influences the lamellas positioning in venetian blind mode |
| 14: Switch type | either Toggle switches or a single, momentary switch. |
| 17: Delay time after S2 | delay till auto turned off or auto gate close |
| 18: Motor operation detection | Power threshold to be interpreted as reaching a limit switch. |
| 22: Motor operation time | Time period for the motor to continue operation. |
| 29: Forced Roller Shutter calibration | set to 1 will enter calibration mode |
| 30: Response to General Alarm |  |
| 31: Response to Water Flood Alarm |  |
| 32: Response to Smoke, CO, CO2 Alarm |  |
| 33: Response to Temperature Alarm |  |
| 35: Managing lamellas in response to alarm | 0 no change, 1 extreme position |
| 40: Power reports | change that needs to occur to trigger the power report |
| 42: Periodic power or energy reports | Time to the next report. Value of 0 means the reports are turned off. |
| 43: Energy reports | Energy threshold to trigger report |
| 44: Self-measurement | if power and energy reports are to sent to the main controller |
| 50: Scenes/ Associations activation | whether scenes or associations are activated by the switch keys |
| 1: Momentary click |  |
| 2: Momentary hold |  |
| 3: Controller Updates |  |




#### 3: Reports type

value should be set to 1 if the module operates in Venetian Blind mode.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Blind position using Z-Wave Command (0) |
|  | Blind position via Fibar Command (1) |






#### 10: Roller Shutter operating modes




| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Roller Blind Mode, without positioning (0) |
|  | Roller Blind Mode, with positioning (1) |
|  | Venetian Blind Mode, with positioning (2) |
|  | Gate Mode, without positioning (3) |
|  | Gate Mode, with positioning (4) |






#### 12: Turning time/ delay time

depending on mode, turning time or delay time  


# Overview #

In Venetian Blind mode (parameter 10 set to 2) the parameter determines time of full turn of the lamellas.

In Gate Mode (parameter 10 set to 3 or 4) the parameter defines the delay time after which an open gate starts closing.Type range


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 150 |






#### 13: Lamellas positioning mode

Parameter influences the lamellas positioning in venetian blind mode  


# Overview #

Parameter influences the lamellas positioning in venetian blind mode (parameter 10 set to 2)

Set slats back to previous position. In Venetian Blind Mode (parameter 10 set to 2) the parameter influences slats positioning in various situations. In any other operating mode the parameter value is irrelevant.  
0 - Slats return to previously set position only in case of the main controller operation.  
1 - Slats return to previously set position in case of the main controller operation, momentary switch operation, or when the limit switch is reached.  
2 - Slats return to previously set position in case of the main controller operation, momentary switch operation, when the limit switch is reached or after receiving a “STOP” control frame (Switch Multilevel Stop).

Default setting: 1 Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | only in case of the main controller operation (0) |
|  | default - controller+switchlimit (1) |
|  | like 1 + STOP control frame (2) |






#### 14: Switch type

either Toggle switches or a single, momentary switch.  


# Overview #

14. Switch type. The parameter settings are relevant for Roller Blind Mode and Venetian Blind Mode (parameter 10 set to 0, 1, 2). 0 - Momentary switches 1 - Toggle switches 2 - Single, momentary switch. (The switch should be connected to S1 terminal) Default setting: 0 Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Momentary switches (0) |
|  | Toggle switches (1) |
|  | Single, momentary switch. (2) |






#### 17: Delay time after S2

delay till auto turned off or auto gate close  


# Overview #

17. In Roller Blind Mode or Venetian Blind mode (parameter 10 set to 0, 1, 2) the parameter determines when the Roller Shutter relays are turned off after reaching a limit switch. In Gate Mode (parameter 10 set to 3 or 4) the parameter determines a time period after which a gate will start closing after a S2 contact has been disconnected. In this mode, time to turn off the Roller Shutter relays after reaching a limit switch is set to 3 seconds and cannot be modified.

Value of 0 means the gate will note close automatically.  
Available settings: 0 - 255 (0,1-25,5s).  
Default setting: 10 (1s).  
Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_17_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 10 |






#### 18: Motor operation detection

Power threshold to be interpreted as reaching a limit switch.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_18_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 10 |






#### 22: Motor operation time

Time period for the motor to continue operation.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_22_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 10 |






#### 29: Forced Roller Shutter calibration

set to 1 will enter calibration mode  


# Overview #

29. Forced Roller Shutter calibration. By modifying the parameters setting from 0 to 1 a Roller Shutter enters the calibration mode. The parameter relevant only if a Roller Shutter is set to work in positioning mode (parameter 10 set to 1, 2 or 4). 1 - Start calibration process Default setting: 0 Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_29_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Deactivated (0) |
|  | Start calibration process (1) |






#### 30: Response to General Alarm




| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | No response to alarm frames (0) |
|  | Open Blind (1) |
|  | Close Blind (2) |






#### 31: Response to Water Flood Alarm




| Property         | Value    |
|------------------|----------|
| Configuration ID | config_31_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No response to alarm frames (0) |
|  | Open Blind (1) |
|  | Close Blind (2) |






#### 32: Response to Smoke, CO, CO2 Alarm




| Property         | Value    |
|------------------|----------|
| Configuration ID | config_32_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | No response to alarm frames (0) |
|  | Open Blind (1) |
|  | Close Blind (2) |






#### 33: Response to Temperature Alarm




| Property         | Value    |
|------------------|----------|
| Configuration ID | config_33_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | No response to alarm frames (0) |
|  | Open Blind (1) |
|  | Close Blind (2) |






#### 35: Managing lamellas in response to alarm

0 no change, 1 extreme position  


# Overview #

35. Managing slats in response to alarm. In Venetian Blind Mode (parameter 10 set to 2), the parameter determines how the slats will react upon alarm detection. In any other modes, the parameter value is not relevant. 0 - Do not change slats position - slats return to the last set position. 1 - Set slats to their extreme position. Default setting: 1 Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_35_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Do not change lamellas position (0) |
|  | Set lamellas to their extreme position (1) |






#### 40: Power reports

change that needs to occur to trigger the power report  


# Overview #

40. Power reports. Power level change that will result in new power value report being sent. The parameter defines a change that needs to occur in order to trigger the report. The value is a percentage of the previous report. Power report threshold available settings: 1-100 (1-100%). Value of 0 means the reports are turned off. Default setting: 10 (10%). Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 10 |






#### 42: Periodic power or energy reports

Time to the next report. Value of 0 means the reports are turned off.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_2 |
| Data Type        | INTEGER |
| Range | 0 to 65534 |
| Default Value | 3600 |






#### 43: Energy reports

Energy threshold to trigger report  


# Overview #

43. Energy reports. Energy level change which will result in new energy value report being sent. The parameter defines a change that needs to occur in order to trigger the report. Energy threshold available settings: 1-254 (0,01 - 2,54kWh). Value of 0 means the reports are turned off. Default setting 10 (0,1kWh). Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_43_1 |
| Data Type        | INTEGER |
| Range | 0 to 254 |
| Default Value | 10 |






#### 44: Self-measurement

if power and energy reports are to sent to the main controller  


# Overview #

44. Self-measurement. A Roller Shutter may include power and energy used by itself in reports sent to the main controller.  
0 - Self-measurement inactive.  
1 - Self-measurement active.  
Default setting: 0  
Parameter size: 1 \[byte\] 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_44_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disabled (0) |
|  | Activated (1) |






#### 50: Scenes/ Associations activation

whether scenes or associations are activated by the switch keys  


# Overview #

SCENES AND ASSOCIATIONS SETTINGS:  
50. Scenes / Associations activation. Parameter determines whether scenes or associations are activated by the switch keys.  
0 - Associations activation  
1 - Scenes activation  
Default setting: 0  
Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_50_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Associations Active (0) |
|  | Scenes Active (1) |






#### 1: Momentary click




| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |






#### 2: Momentary hold




| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |






#### 3: Controller Updates




| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |






---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/413).

