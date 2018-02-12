---
layout: documentation
title: EZMultiPli - ZWave
---

{% include base.html %}

# EZMultiPli Multi Sensor

This describes the Z-Wave device *EZMultiPli*, manufactured by *Express Controls* with the thing type UID of ```homeseer_ezmultipli_00_000```. 

Multi Sensor


## Channels
The following table summarises the channels available for the EZMultiPli Multi Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Sensor (luminance) | sensor_luminance | sensor_luminance | Temperature | Number |
| Color | color_color | color_color |  | Color |
| Alarm | alarm_general | alarm_general | Door | Switch |


### Sensor (temperature)

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the EZMultiPli Multi Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: OnTime | OnTime sets the number of minutes that the lights stay on when motion has not been detecte... |
| 2: OnLevel | OnLevel is the value sent by the Z-Wave BASIC\_SET command to all Association Group 2 node... |
| 3: LiteMin | A Luminance report is sent to the system controller every LiteMin minutes. |
| 4: TempMin | A Temperature report is sent to the controller every TempMin minutes. |
| 5: TempAdj | TempAdj is a twos-complement number that is used to adjust the temperature reading to make... |
| 1: LIFELINE | This group is normally automatically assigned to the Z-Wave system controller when EZMulti... |
| 2: BASIC | This group is used to directly turn lights on or off when motion is detected. |


#### 1: OnTime

OnTime sets the number of minutes that the lights stay on when motion has not been detected.  


##### Overview 

OnTime sets the number of minutes that the lights stay on when motion has not been detected.

A value of 0 is a special mode where the lights are constantly sent a command to turn them on whenever motion is detected. EZMultiPli will NOT turn the lights off in this mode.

Recommended values:

 *  5 min for hallways
 *  20 min for an office environment
 *  60 min for a library, office or other room where someone may be sitting still for a long time


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 10 |


#### 2: OnLevel

OnLevel is the value sent by the Z-Wave BASIC\_SET command to all Association Group 2 nodes when motion is detected.  


##### Overview 

OnLevel is the value sent by the Z-Wave BASIC\_SET command to all Association Group 2 nodes when motion is detected.

A value of 0 will turn the lights off (not recommended). A value between 1 and 99 will set the dim level to between 1% and 99% (99% is full on).

A value of -1 will turn the light “on” which depends on the device but most will set the dim level to the last dim setting.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | -1 to 99 |
| Default Value | -1 |


#### 3: LiteMin

A Luminance report is sent to the system controller every LiteMin minutes.  


##### Overview 

A Luminance report is sent to the system controller every LiteMin minutes.

A value of zero turns this mode off. Luminance values can still be obtained at any time by the home control application in this mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 60 |


#### 4: TempMin

A Temperature report is sent to the controller every TempMin minutes.  


##### Overview 

A Temperature report is sent to the controller every TempMin minutes.

A value of zero turns this mode off. Temperature values can still be obtained at any time by polling the status of the temperature sensor.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 60 |


#### 5: TempAdj

TempAdj is a twos-complement number that is used to adjust the temperature reading to make it more accurate.  


##### Overview 

TempAdj is a twos-complement number that is used to adjust the temperature reading to make it more accurate. The value is in tenths of degree Fahrenheit. The temperature reading can be adjusted by +12.7F to -12.8F. A value of 1 will adjust the temperature reading by +0.1F. A value of -1 will adjust the temperature by -0.1F. A value of 123 will adjust the temperature by +12.3F. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | -127 to 128 |
| Default Value | 0 |


#### 1: LIFELINE

This group is normally automatically assigned to the Z-Wave system controller when EZMultiPli is added to the ZWave network.  


##### Overview 

This group is normally automatically assigned to the Z-Wave system controller when EZMultiPli is added to the ZWave network. All Notification command class reports (motion detection) are sent to the node assigned to this group. Advanced lighting control should be handled by a home control application based on these reports.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: BASIC

This group is used to directly turn lights on or off when motion is detected.  


##### Overview 

This group is used to directly turn lights on or off when motion is detected. Up to four (4) Z-Wave devices can be associated in this group. EZMultiPli will send a BASIC ON command to all devices that are associated in this group. Note that the Z-Wave devices in this group must be within direct range (about 30’) of EZMultiPli. Control of nodes that are further away or blocked by metal or concrete walls should rely on the Z-Wave system controller and the home-control application for reliable operation. Note that including the NodeID of EZMultiPli in this group will control the LED which will come on when motion is detected and goes off when no motion has been detected for OnTime minutes.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/268).
