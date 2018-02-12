---
layout: documentation
title: NE-NAS-PD01Z - ZWave
---

{% include base.html %}

# NE-NAS-PD01Z PIR motion sensor and light measurement

This describes the Z-Wave device *NE-NAS-PD01Z*, manufactured by *Zipato* with the thing type UID of ```zipato_nenaspd01z_00_000```. 

PIR motion sensor and light measurement


## Channels
The following table summarises the channels available for the NE-NAS-PD01Z PIR motion sensor and light measurement.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (luminance) | sensor_luminance | sensor_luminance | Temperature | Number |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the NE-NAS-PD01Z PIR motion sensor and light measurement.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Sensitivity level | 8 = Highest sensitivity, 255 = lowest sesitivity |
| 2: ON / OFF Duration | How long should the associated devices have ON status. |
| 3: BASIC SET Level | BASIC SET LEVEL |
| 4: PIR detection ENABLED / DISABLED | Enable og disable the PIR sensor |
| 5: Ambent illumination LUX level | Lux value which determines when the light sensor is activated |
| 6: Re-Trigger Interval | Adjust the interval of being re-triggered |
| 7: Light sensor polling interval | How often should ambient illumination be evaluated |
| 8: LUX level function enable | See overview |
| 9: Ambient illumination report | when lux changes by the number in this setting it is reported |
| 1: Group 1 | lifeline service |
| 2: Group 2 | BASIC\_SET control command group |
| 3: Group 3 | NOTIFICATION\_REPORT\_V4 |
| 4: Group 4 | Sensor Binary Report |


#### 1: Sensitivity level

8 = Highest sensitivity, 255 = lowest sesitivity  


##### Overview 

1. SENSITIVITY LEVEL SETTING

This parameter defines the sensitivity of PIR sensor. It’s recommended to test the sensor with moevements from a farthest end of the coverage area at the first time of use. If movements cannot be detected sensitively, simply adjust the sensitivity level with this parameter. This parameter can be configured with the value of 8 through 255, where 8 means high sensitivity and 255 means low sensitivity. Function: Sensivity Level Setting

Parameter size: 1 byte

Parameter number: 1

Available settings: 8 ~ 255

Default settings: 12


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 8 to 255 |
| Default Value | 12 |


#### 2: ON / OFF Duration

How long should the associated devices have ON status.  


##### Overview 

2. ON / OFF DURATION

This parameter determines how long the associated devices should have ON status. For instace, if this parameter is set to 30 (sec), the PIR sensor will send a BASIC\_SET command to associated device with valu BASIC\_SET level if PIR sensor is triggered and associated device will be turned on 30 seconds begore it’s turned off. This parameter value must be large as Parameter \#. If user set this parameter to default by Configure CC, the parameter \# will be set to default value.

Function: ON / OFF duration setting

Parameter size: 2 byte

Parameter number: 2

Available settings: 5~600 (seconds)

Default setting: 30


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 5 to 600 |
| Default Value | 30 |


#### 3: BASIC SET Level

BASIC SET LEVEL  


##### Overview 

3. BASIC SET LEVEL BASIC\_SET command will be sent when PIR sensor is triggered. The receiver will take it into consideration; for instance, if a lamp module is receiving the BASIC\_SET command of which value is decisive as to how bright of dim level of lamp module shall be.

Function: Basic Set Level

Parameter size: 1 byte

Parameter number: 2

Available settings: 0,1 ~ 99 or 255 0 - OFF, Alarm cancelling or turning device off

1 ~ 99 or 255 - ON (Binary Switch Device)

Dim level (Multilevel Switch Device)

Default setting: 255


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 255 |


#### 4: PIR detection ENABLED / DISABLED

Enable og disable the PIR sensor  


##### Overview 

4. PIR DETECTION FUNCTION ENABLED / DISABLED This parameter can enable or disable the PIR sensor detecting function. Function: Enabled / Disabled PIR function

Parameter size: 1 byte

Parameter number: 4

Available settings: 0 (disable) or 255 (enable)

Default setting: 255 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 5: Ambent illumination LUX level

Lux value which determines when the light sensor is activated  


##### Overview 

5. AMBIENT ILLUMINATION LUX LEVEL This parameter can set Lux value which determines when the light sensor is activated. If the ambient illumination level falls bellow this value and a person moves across or within the detection area, PIR sensor will send Z-Wave ON command (i.e. BASIC\_set (value = parameter 3) to an associated device and activate it.

Function: Lux Level Set

Parameter size: 2 byte

Parameter number: 5

Available settings: 0~1000 (Lux)

Default setting: 100 (Lux)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_2 |
| Data Type        | INTEGER |
| Range | 0 to 1000 |
| Default Value | 100 |


#### 6: Re-Trigger Interval

Adjust the interval of being re-triggered  


##### Overview 

6. RE-TRIGGER INTERVAL SETTING This parameter can be used to adjust the interval of being re-triggered after the PIR sensor has been triggered. This parameter value must be less than Paramater \#2. If user sets this parameter to default by Configure CC, the parameter \#2 will be set to default value.

Function: Re-trigger interval setting

Parameter size: 1 byte

Parameter number: 6

Available settings: 1~8 (s)

Default setting: 8


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 1 to 8 |
| Default Value | 8 |


#### 7: Light sensor polling interval

How often should ambient illumination be evaluated  


##### Overview 

7. LIGHT SENSOR POLLING INTERVAL This parameter can set the light sensor to measure ambient illumination level interval time. NOTE: This value must be less than Wakeup Interval Time!

Function: Light Sensor Polling Interval

Parameter size: 2 byte

Parameter number: 7

Available settings: 60~3600 (seconds)

Default setting: 180 (s)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_2 |
| Data Type        | INTEGER |
| Range | 60 to 3600 |
| Default Value | 180 |


#### 8: LUX level function enable

See overview  


##### Overview 

8. LUX LEVEL FUNCTION ENABLE If this parameter is set to “1” and when Lux level is less than the value defined by parameter \#5, PIR sensor will send a BASIC\_SET command frame (i.e. BASIC\_SET (value = parameter 3) to an associated device and activate it. If Lux level is greater than the value defined by parameter \#5, PIR sensor will not send BASIC\_SET command frame.

Function: Lux Level Enable

Parameter size: 1 byte

Parameter number: 8

Available sttings: 0, 1

Default setting: 0


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 9: Ambient illumination report

when lux changes by the number in this setting it is reported  


##### Overview 

9. AMBIENT ILLUMINATION LUX LEVEL REPORT This parameter defines by how much Lux level must change in Lux to be reported to the main controller.

Function: Lux Level Report

Parameter size: 2 byte

Parameter number: 9

Available settings: 0~1000 (Lux)

Default setting: 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_2 |
| Data Type        | INTEGER |
| Range | 0 to 1000 |
| Default Value | 1 |


#### 1: Group 1

lifeline service  


##### Overview 

**GROUP 1** is lifeline service that is assigned to sensor status - Open/Close. It enables the sensor to send reports and readings to Z-Wave controller or Z-Wave Gateway whenever the sensor is triggered. This group supports: NOTIFICATION\_REPORT\_V4 SENSOR\_BINARY\_REPORT\_V2 SENSOR\_MULTILEVEL\_REPORT\_V7 BATTERY\_REPORT\_DEVICE\_RESET\_LOCALLY\_NOTIFICATION


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2

BASIC\_SET control command group  


##### Overview 

**GROUP 2** allows sending control commands to associated devices such as relay module, lighting, etc. This association group is configured through the advanced parameters no. 2, 3, 5 and 8. This griup supports: BASIC\_SET


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Group 3

NOTIFICATION\_REPORT\_V4  


##### Overview 

**GROUP 3** allows sending notifications to associated devices int his group. This group supports: NOTIFICATION\_REPORT\_V4


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Group 4

Sensor Binary Report  


##### Overview 

**GROUP 4** allows sending sending Sensor Binary Report to associated devices in this group. This group supports: SENSOR\_BINARY\_REPORT\_V2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/735).
