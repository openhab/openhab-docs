---
layout: documentation
title: PSP05 - ZWave
---

{% include base.html %}

# PSP05 Motion Sensor

This describes the Z-Wave device *PSP05*, manufactured by *Philio Technology Corp* with the thing type UID of ```philio_psp05_00_000```. 

Motion Sensor


## Channels
The following table summarises the channels available for the PSP05 Motion Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the PSP05 Motion Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 3: PIR Sensitivity | Adjust the PIR Sensitivity |
| 7: Motion OFF Reporting | Sends notification when motion has completed. |
| 7: Notification Type | Method used to send notifications on motion |
| 7: Send Multi CC in auto report | Send Multi CC in auto report |
| 7: Send Battery Report when Triggered | Whether or not a battery status report should be sent when triggered |
| 8: Re-detection interval | Multiples of 8 seconds to wait before re-detection |
| 9: Turn off light time | Time to wait after lighting has been turned on before turning off again |
| 10: Batery level reporting interval | How frequently battery status should be reported |
| 20: Tick Interval | Interval time for sending reports |


#### 3: PIR Sensitivity

Adjust the PIR Sensitivity  


##### Overview 

This setting sets the sensitivity of the PIR (motion) sensor. A setting of 0 (zero) will disable the sensor, with 99 being the highest level of sensitivity. The default sensitivity setting is 80.

The higher the sensitivity, the greater the range of detection (things farther away will trigger the sensor). However, this may also result in things that are nearer triggering the sensor too frequently.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 99 |
| Default Value | 80 |


#### 7: Motion OFF Reporting

Sends notification when motion has completed.  


##### Overview 

Sends notification when motion has completed.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1_00000010 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Don&#x27;t Send Report (0) |
|  | Send Report (1) |


#### 7: Notification Type

Method used to send notifications on motion  


##### Overview 

Indicates method used to send notifications in the event of motion being triggered. Either Binary Sensor or Notification


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1_00001000 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Report Notification (0) |
|  | Binary Sensor (1) |


#### 7: Send Multi CC in auto report

Send Multi CC in auto report  


##### Overview 

Investigation required to determine purpose of this.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1_00010000 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (1) |


#### 7: Send Battery Report when Triggered

Whether or not a battery status report should be sent when triggered


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1_00100000 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Enable (0) |
|  | Disable (1) |


#### 8: Re-detection interval

Multiples of 8 seconds to wait before re-detection  


##### Overview 

By default, the sensor will wait 24 seconds (3 x 8) after detecting motion before it will send a further detection report. This value can be increased to a maximum of 127 (which is 127 \* 8), meaning the re-detection interval will be 1,016 seconds (~17 minutes). The minimum value is 1 (1 \* 8), meaning a re-detection interval of 8 seconds.

The default is a value of 3, meaning a re-detection interval of 24 seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 1 to 127 |
| Default Value | 3 |


#### 9: Turn off light time

Time to wait after lighting has been turned on before turning off again  


##### Overview 

Number of seconds (in multiples of 8) to wait before turning off lights that were turned on as a result of motion occurring. A default value of 4 means (4 x 8) 32 seconds later, lights will be turned off.

This setting should only be used when you are using association groups to control lighting events. If you are controlling on/off events as a result of motion through independent rules, this setting is irrelevant.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 4 |


#### 10: Batery level reporting interval

How frequently battery status should be reported  


##### Overview 

The frequency (in multiples of 'Tick Time') that the device should send battery status reports. If set to 0, battery status reports are not sent.

The default 'tick time' (see other parameter settings) is 30, meaning 30 minutes. The default value of this parameter is 12, meaning that a battery report will be sent every 6 hours (12 \* 30 minutes).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 12 |


#### 20: Tick Interval

Interval time for sending reports  


##### Overview 

This setting is used by the battery reporting interval setting. This setting defines the 'tick interval' or the number of time blocks to wait between sending reports. The default value of 30 means that a tick interval is 30 minutes.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 30 |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/600).
