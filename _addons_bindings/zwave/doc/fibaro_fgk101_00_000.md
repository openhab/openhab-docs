---
layout: documentation
title: FGK101 - ZWave
---

{% include base.html %}

# FGK101 Door Opening Sensor

This describes the Z-Wave device *FGK101*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgk101_00_000```. 

Door Opening Sensor  


### Inclusion Information 

**Prepare the sensor:**

1.  Open the sensor with a small screwdriver (be careful)
2.  Remove the paper between the battery an the contact to activate the sensor.
3.  Close the sensor (be sure that it is closed correctly. The sensor must not act like a button if you push the casing. This sometimes happens. It is important to close the device correctly.)

**Include the sensor in the network:**

1.  Start HABmin.
2.  Navigate to Configuration > Bindings > select the ZWAVE Binding > select the devices tab on the right
3.  You should see at least your ZWAVE-Controller in the list of devices.
4.  Hit "include" to start the 30 sec include mode
5.  Hit the button on the back of the sensor 3 times in a short row.
6.  The device starts to blink in blue. If it stops repeat step 5 until the 30 sec inclusion is over. Keep the sensor not to close and not too far from the controller (between 30 cm and 100 cm)
7.  Hit "reload properties" in HABmin.
8.  The new device should appear in the list (grey with no name)
9.  If not, hit reload in your browser and navigate back to the device list.
10. The new device should appear in the list (grey with no name)
11. If not, restart your openHAB server, hit reload in your browser and navigate back to the device list.
12. The new device should appear in the list (grey with no name)
13. If not, repeat from step 4 until the device appears (This should happen rarely. I once needed two tries. Iadded 10 devices all together.)
14. Hit the button on the back of the sensor 3 times in a short row.
15. The device starts to blink in blue. Keep the sensor not to close and not too far from the controller (between 30 cm and 100 cm)
16. Hit "reload properties" in HABmin.
17. Repeat steps 14 - 16 several times. The device in the list will first show up a name, then turn to yellow and then to green.
18. Congratulations, you fully added the sensor and it should work correctly now.

  


### Wakeup Information 

The default wake-up interval will drain the battery in a few weeks to months. It's advised to set a minimum wake-up interval of 3 hours to 24 hours after the device is configured correctly and a node.xml file has been created for the device.


## Channels
The following table summarises the channels available for the FGK101 Door Opening Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Door Sensor | sensor_door | sensor_door | Door | Contact |
|  | battery-level | system.battery-level |  |  |
| Alarm (water) | alarm_flood | alarm_flood | Door | Switch |
| Alarm (CO) | alarm_co | alarm_co | Door | Switch |
| Alarm (smoke) | alarm_smoke | alarm_smoke | Door | Switch |
| Alarm (CO2) | alarm_co2 | alarm_co2 | Door | Switch |
| Alarm (general) | alarm_general | alarm_general | Door | Switch |
| Alarm (heat) | alarm_heat | alarm_heat |  | Switch |
| Temperature Sensor | sensor_temperature2 | sensor_temperature | Temperature | Number |


### Temperature Sensor

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the FGK101 Door Opening Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: IN1 Alarm Cancellation Delay | Additional delay after an alarm from input IN1 has ceased. |
| 2: Status change signalled by LED |  |
| 3: Type of input no. 1 | Type of IN input |
| 5: Type of transmitted control frame for association | Type of transmitted control frame for association group 1 |
| 7: Forced Level of Dimming group 1 | Parameter for dimming/opening blinds |
| 9: Enable/Disable transmission of frame cancelling alarm | Enable/Disable transmission of frame cancelling alarm |
| 12: Sensitivity to temperature changes | Sensitivity to temperature changes |
| 13: Transmitting the alarm or control frame broadcast | Enabling/Disabling broadcast alarm for IN and TMP |
| 14: Scene activation | Enable/Disable scene functionality |
| 1: Input IN1 |  |
| 2: TMP Button |  |
| 3: Condition |  |


#### 1: IN1 Alarm Cancellation Delay

Additional delay after an alarm from input IN1 has ceased.  


##### Overview 

The parameter allows you to specify additional time, after which the input no. 1 alarm is cancelled once its violation has ceased.    


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 2: Status change signalled by LED


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | LED turned Off (0) |
|  | LED turned On (1) |


#### 3: Type of input no. 1

Type of IN input  


##### Overview 

Default = 0- INPUT\_NC (Normally closed)

Available parameter settings

0 - INPUT\_NC (Normally closed)

1 - INPUT\_NO (Normally open) 

2 - INPUT\_MONOSTABLE

3 - INPUT\_BISTABLE


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Normally Open (0) |
|  | Normally Closed (1) |
|  | Monostable (2) |
|  | Bistable (3) |


#### 5: Type of transmitted control frame for association

Type of transmitted control frame for association group 1  


##### Overview 

Type of transmitted control frame for association group 1, activated via input IN1. The parameter allows to specify the type of alarm frame or to force transmission of control commands (BASIC\_SET)

Default value = 255 - BASIC SET

Available parameter settings

1 - ALARM SMOKE frame

2 - ALARM CO frame

3 - ALARM CO2 frame

4 - ALARM HEAT frame

5 - ALARM WATER frame

255 Control frame BASIC\_SET


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALARM GENERIC (0) |
|  | ALARM SMOKE (1) |
|  | ALARM CO (2) |
|  | ALARM CO2 (3) |
|  | ALARM HEAT (4) |
|  | ALARM WATER (5) |
|  | BASIC_SET (255) |


#### 7: Forced Level of Dimming group 1

Parameter for dimming/opening blinds  


##### Overview 

Value of the parameter specifying the forced level of dimming/opening roller blinds when “switch on”/”open” commands are sent to devices from association group no.1. In case of alarm frames an alarm priority is specified. Default value: 255 Possible parameter settings: (1 – 99) and 255 Value of 255 makes it possible to activate a device. In case of the Dimmer module it means activating the device and setting it to the previously stored condition, e.g. when Dimmer is set to 30%, deactivated and then reactivated using 255 commend, it will be automatically set to the previous condition i.e. 30%


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 255 |


#### 9: Enable/Disable transmission of frame cancelling alarm

Enable/Disable transmission of frame cancelling alarm  


##### Overview 

Deactivating transmission of the alarm cancelling frame or the control frame deactivating the device (Basic). It allows for disabling the function of deactivating the device and cancelling alarms for devices associated with IN input. Default value: 0

Available parameter settings: 0 – for association group no. 1 information is sent 1 – for association group no.

1 information is not sent.

Parameter size: 1 \[byte\].


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Groups 1 and 2 sent (0) |
|  | Group 1 sent, Group 2 not sent. (1) |
|  | Group 2 sent, Group 1 not sent. (2) |


#### 12: Sensitivity to temperature changes

Sensitivity to temperature changes  


##### Overview 

Sensitivity to temperature changes. The maximum acceptable difference between the last reported temperature and the current temperature read from the sensor. If the temperatures differ by the set value or more, a report with the current temperature value is sent to the device assigned to association group no. 3.

Default value: 8 \[0,5o C\]

Available parameter settings: 0 – 255 \[0o C to 16o C\] \[32o F – 60,8o F\] To set an appropriate parameter value use the following formula: x = delta T x 16 - for Celsius x = delta T x 80 / 9 - for Fahrenheit x = parameter value delta T – maximum acceptable temperature gradient in Celsius or Fahrenheit If the value is set to 0: - if the wake-up interval is set to 255 seconds, temperature report will be sent according to the interval, - if the wake-up interval is set to over 255, temperature report will be sent each ca. 4 minutes. Parameter size: 1 \[byte\].


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 8 |


#### 13: Transmitting the alarm or control frame broadcast

Enabling/Disabling broadcast alarm for IN and TMP  


##### Overview 

Sending an alarm or control frame (for IN input, depending on parameter no.5 value), and TMP button alarm frame. The frame is sent in “broadcast” mode, i.e. to all devices within range - information sent in this mode is not repeated by the mesh network.

Default value: 0

Available parameter settings: 0 – IN and TMP Broadcast mode inactive,

1 – IN broadcast mode active, TMP broadcast mode inactive

2 – IN broadcast mode inactive, TMP broadcast mode active

3 – IN and TMP broadcast mode active

Parameter size: 1 \[byte\].


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | IN and TMP Broadcast mode inactive (0) |
|  | IN broadcast mode active, TMP broadcast mode inactive (1) |
|  | IN broadcast mode inactive, TMP broadcast mode active (2) |
|  | IN and TMP broadcast mode active (3) |


#### 14: Scene activation

Enable/Disable scene functionality  


##### Overview 

Scene activation functionality.

Default value: 0

Available parameter settings:

0 - functionality deactivated

1 - functionality activated The device offers the possibility of sending commands compatible with Command class scene activation. Information is sent to devices assigned to association group no. 3 Controllers such as the Home Center 2 are able to interpret such commands and based on these commands activate scenes, to which specific scene IDs have been assigned. The user may expand the functionality of a button connected to IN input by distinguishing the sequence of it being pushed. For example: double click would trigger the “goodnight” scene and triple click would trigger the “morning” scene. To fully use the possibilities offered by the parameter no.14 it is recommended to use a momentary or a toggle switch (parameter no.3). Scene ID is determined in the following manner: IN input: Switch from “off” to “on” ID10 Switch from “on” to “off” ID11 Remaining IDs are recognized correctly if the value of parameter no.3 was set to 2 Holding down ID12 Releasing ID13 Double click ID14 Triple click ID15 Parameter size: 1 \[byte\].


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disabled (0) |
|  | Enabled (1) |


#### 1: Input IN1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: TMP Button


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Condition


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/125).
