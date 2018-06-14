---
layout: documentation
title: ZMNHZD - ZWave
---

{% include base.html %}

# ZMNHZD Multifunctional Weather Station
This describes the Z-Wave device *ZMNHZD*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhzd_00_000```.

The ZMNHZD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/364) to improve the documentation.

## Channels

The following table summarises the channels available for the ZMNHZD -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Sensor (velocity) | sensor_velocity |  | Number | 
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
| Sensor (relative humidity) | sensor_relhumidity | Humidity | Number | 
| Sensor (direction) | sensor_direction |  | Number | 
| Sensor (rain rate) | sensor_rainrate | Humidity | Number | 
| Battery Level | battery-level | Battery | Number |
| Thermo/ Hygro Sensor Ch1 – Temperature | sensor_temperature1 | Temperature | Number | 
| Battery Level | battery-level | Battery | Number |
| Wind Gauge – Direction | sensor_direction2 |  | Number | 
| Battery Level | battery-level | Battery | Number |
| Wind Gauge – Velocity | sensor_velocity3 |  | Number | 
| Battery Level | battery-level | Battery | Number |
| Wind Gauge – Wind gust | sensor_velocity4 |  | Number | 
| Battery Level | battery-level | Battery | Number |
|  Wind Gauge – Temperature | sensor_temperature5 | Temperature | Number | 
| Battery Level | battery-level | Battery | Number |
| Wind Gauge – Wind Chill | sensor_temperature6 | Temperature | Number | 
| Battery Level | battery-level | Battery | Number |
|  Rain Sensor | sensor_rainrate7 | Humidity | Number | 
| Battery Level | battery-level | Battery | Number |
|  Thermo/ Hygro Sensor Ch1 – Humidity | sensor_relhumidity8 | Humidity | Number | 
| Battery Level | battery-level | Battery | Number |
| Thermo/ Hygro Sensor Ch2 – Temperature | sensor_temperature9 | Temperature | Number | 
| Battery Level | battery-level | Battery | Number |
|  Thermo/ Hygro Sensor Ch2 – Humidity  | sensor_relhumidity10 | Humidity | Number | 
| Battery Level | battery-level | Battery | Number |

### Sensor (velocity)

Indicates the current velocity.

The ```sensor_velocity``` channel supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Sensor (temperature)

Indicates the current temperature.

The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (relative humidity)

Indicates the current relative humidity.

The ```sensor_relhumidity``` channel supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (direction)

Indicates the direction.

The ```sensor_direction``` channel supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Sensor (rain rate)

Indicates the current relative humidity.

The ```sensor_rainrate``` channel supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level``` channel supports the ```Number``` item and is in the ```Battery``` category.

### Thermo/ Hygro Sensor Ch1 – Temperature

Endpoint 1 receives Temperature data from Thermo/ Hygro Sensor on Channel 1. It is capable of receiving data in range of -199.0 °C and 199.0 °C. However, the operating temperature of the 433 MHz sensor is from -10 °C to 60 °C

Indicates the current temperature.

The ```sensor_temperature1``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level1``` channel supports the ```Number``` item and is in the ```Battery``` category.

### Wind Gauge – Direction

Endpoint 2 receives Direction data from Wind Gauge. The data is in range of 0.0° to 360.0°.

Indicates the direction.

The ```sensor_direction2``` channel supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level2``` channel supports the ```Number``` item and is in the ```Battery``` category.

### Wind Gauge – Velocity

Endpoint 3 receives wind speed data from Wind Gauge. It is capable of receiving data in range of 0.00 m/s to 88.00 m/s.

Indicates the current velocity.

The ```sensor_velocity3``` channel supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level3``` channel supports the ```Number``` item and is in the ```Battery``` category.

### Wind Gauge – Wind gust

Endpoint 4 receives wind speed data from Wind Gauge. It is capable of receiving data in range of 0.00 m/s to 88.00 m/s.

Indicates the current velocity.

The ```sensor_velocity4``` channel supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level4``` channel supports the ```Number``` item and is in the ```Battery``` category.

###  Wind Gauge – Temperature

Endpoint 5 receives Temperature data from Wind Gauge. It is capable of receiving data in range of -199.0 °C and 199.0 °C. However, the operating temperature of the sensor is from -10 °C to 60 °C

Indicates the current temperature.

The ```sensor_temperature5``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level5``` channel supports the ```Number``` item and is in the ```Battery``` category.

### Wind Gauge – Wind Chill

Endpoint 6 receives Temperature data from Wind Gauge. It is capable of receiving data in range of -199.0 °C and 199.0 °C. However, the operating temperature of the sensor is from -10 °C to 60 °C

Indicates the current temperature.

The ```sensor_temperature6``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level6``` channel supports the ```Number``` item and is in the ```Battery``` category.

###  Rain Sensor

Endpoint 7 receives and calculates rain rate. The rain rate is in range of 0.00 mm/h and 300.00 mm/h

Indicates the current relative humidity.

The ```sensor_rainrate7``` channel supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level7``` channel supports the ```Number``` item and is in the ```Battery``` category.

###  Thermo/ Hygro Sensor Ch1 – Humidity

Endpoint 8 receives Humidity data from Thermo/ Hygro Sensor on Channel 1. The data is in range of 0% and 100%

Indicates the current relative humidity.

The ```sensor_relhumidity8``` channel supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level8``` channel supports the ```Number``` item and is in the ```Battery``` category.

### Thermo/ Hygro Sensor Ch2 – Temperature

Endpoint 9 receives Temperature data from Thermo/ Hygro Sensor on Channel 2. It is capable of receiving data in range of -199.0 °C and 199.0 °C. However, the operating temperature of the sensor is from -10 °C to 60 °C.

Indicates the current temperature.

The ```sensor_temperature9``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level9``` channel supports the ```Number``` item and is in the ```Battery``` category.

###  Thermo/ Hygro Sensor Ch2 – Humidity 

Endpoint 10 receives Humidity data from Thermo/ Hygro Sensor on Channel 2. The data is in range of 0% and 100%.

Indicates the current relative humidity.

The ```sensor_relhumidity10``` channel supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level10``` channel supports the ```Number``` item and is in the ```Battery``` category.



## Device Configuration

The following table provides a summary of the 16 configuration parameters available in the ZMNHZD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Wind Gauge | Wind Gauge, Wind Gust Top Value |
| 2 | Rain Gauge | Rain Rate top value |
| 3 | Wind Gauge | Wind Gust |
| 4 | Rain Gauge | Rain Rate |
| 5 | End Point 1 | Unsolicited report |
| 6 | End Point 2 | Unsolicited report |
| 7 | End Point 3 | Unsolicited report |
| 8 | End Point 4 | Unsolicited report |
| 9 | End Point 5 | Unsolicited report |
| 10 | End Point 6 | Unsolicited report |
| 11 | End Point 7 | Unsolicited report |
| 12 | End Point 8 | Unsolicited report |
| 13 | End Point 9 | Unsolicited report |
| 14 | End Point 10 | Unsolicited report |
| 15 | Random ID enable | enables/disables random ID |
| 250 | Unsecure / Secure Inclusion  | Unsecure / Secure Inclusion |

### Parameter 1: Wind Gauge

Wind Gauge, Wind Gust Top Value
Wind Gauge, Wind Gust Top Value, if the Wind Gust is Higher than the Parameter Value, a device triggers an Association
Values in the range 0 to 8800 may be set.

The manufacturer defined default value is ```1000```.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: Rain Gauge

Rain Rate top value
If the sensor Rain Rate is higher than the parameter value, a device triggers a association.
Values in the range 0 to 30000 may be set.

The manufacturer defined default value is ```200```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Wind Gauge

Wind Gust
0 - if the wind gauge is higher than the parameter No. 1 value, then a device sends basic set = 0x00

1 - if the wind gauge is higher than the parameter No. 1 value, then a device sends basic set =0xff
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Rain Gauge

Rain Rate
0 - if the rain amount is higher than the parameter No. 2 value, then a device sends basic set = 0x00

1 - if the rain amount is higher than the parameter No. 2 value, then a device sends basic set =0xff
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: End Point 1

Unsolicited report
0 - Unsolicited report disabled

1 - Unsolicited report enabled
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: End Point 2

Unsolicited report
0 - Unsolicited report disabled

1 - Unsolicited report enabled
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: End Point 3

Unsolicited report
0 - Unsolicited report disabled

1 - Unsolicited report enabled
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: End Point 4

Unsolicited report
0 - Unsolicited report disabled

1 - Unsolicited report enabled
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: End Point 5

Unsolicited report
0 - Unsolicited report disabled

1 - Unsolicited report enabled
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: End Point 6

Unsolicited report
0 - Unsolicited report disabled

1 - Unsolicited report enabled
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: End Point 7

Unsolicited report
0 - Unsolicited report disabled

1 - Unsolicited report enabled
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: End Point 8

Unsolicited report
0 - Unsolicited report disabled

1 - Unsolicited report enabled
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: End Point 9

Unsolicited report
0 - Unsolicited report disabled

1 - Unsolicited report enabled
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: End Point 10

Unsolicited report
0 - Unsolicited report disabled

1 - Unsolicited report enabled
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Random ID enable

enables/disables random ID
If Random ID is disabled, the Weather Station USB Key can receive data from multiple 433 MHz Sensors on the same Channel. If the Random ID is enabled, the USB Key can receive data from only one sensor on the same channel. If the USB Key does not receive a data from a sensor on a specific channel for more than 2.5 hours, it clears the Random ID of the device and waits for a new ID. If you replace the batteries in the modules, the Random ID will change. If you want that the USB Key accept a module immediately, set the Parameter No. 15 to “0” and in the next step again to “1”.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 250: Unsecure / Secure Inclusion 

Unsecure / Secure Inclusion
- default Value 0
- 0 – Unsecure Inclusion
- 1 – Secure Inclusion

The Weather Station Key supports both, the secure and unsecure inclusion. Even if the controller does not support security command classes, the Key could be included as unsecure and keep all the functionality. By default, the Key includes as unsecure. To include the Key as secure follow the procedure:

1. Include the Key into the controller
2. Set the parameter 250 to the value “1”
3. Enable add/remove mode on main controller,
4. Hold service button S between 1.5 and 4 seconds to exclude the module
5. If the exclusion of the module was successful, the LED on the module starts blinking
6. Unplug the module out of the power supply
7. enable add/remove mode on main controller
8. Plug the module into the power supply to star autoinclusion
9. Now the module should be included as secure

The same procedure is to include the module as unsecure
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_250_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZMNHZD supports 3 association groups.

### Group 1: Lifeline group

reserved for the communication with the main controller
This group supports 1 nodes.

### Group 2: Basic on/off

triggered when the wind gust of the wind gauge exceed the configuration parameter 1 value
This group supports 16 nodes.

### Group 3: Basic on/off

triggered when the rain rate exceed the configuration parameter 2 value
This group supports 16 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 5

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 6

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 7

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 8

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 9

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 10

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Multifunctional Weather Station - ZMNHZD1](https://www.cd-jackson.com/zwave_device_uploads/364/qubino-ZMNHZD1-V1-1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/364).
