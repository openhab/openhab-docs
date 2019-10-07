---
layout: documentation
title: ZMNHZD - ZWave
---

{% include base.html %}

# ZMNHZD Multifunctional Weather Station
This describes the Z-Wave device *ZMNHZD*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhzd_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![ZMNHZD product image](https://www.cd-jackson.com/zwave_device_uploads/364/364_default.jpg)


The ZMNHZD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Weather Station is used for measuring temperature, humidity, wind & rain properties and sending the measurement values to your Z-Wave network.The Weather Station can measure 10 different values: two sets of temperature/humidity sensors, wing gauge with 5 sensors (direction, velocity, wind gust, temperature and wind chill) and a rain sensor. With the use of the included Weather Station USB KEY all 10 values (end points) are sent and rendered in your home Z-Wave network. Qubino Weather Station Key is used for receiving Wireless data packages (from Thermo/ Hygro Sensor Ch1, Thermo/ Hygro Sensor Ch2, Rain Gauge, Wind Gauge) and sends it to the Z-Wave Controller. The Key is designed to be plugged into the USB Power Adapter. Module receives data for Temperature, Wind Chill, Velocity, Wind Gust, Wind Direction, Humidity, Rain Rate and Battery Level for each Sensor. It is designed to act as repeater in order to improve range and stability of Z-wave network.

Remote Weather Sensors The remote weather sensors include a thermo-hygrometer, anemometer (wind sensor) and rain sensor. All data collected by the sensors are transmitted to the Weather Station Key by wireless RF, with a range up to 100 meters (open area). The Weather station Key supports a maximum of 2 thermo-hygrometers, allowing 2 channels of temperature/humidity display (Ch1 and Ch2)

### Inclusion Information

Connect module to USB Power Supply auto-inclusion (works for about 5 seconds after connected to power supply) or enable add/remove mode on main controller hold service button S between 1.5 and 4 seconds

NOTE: For auto-inclusion procedure, first set main controller into inclusion mode and then connect module to USB power supply.

### Exclusion Information

Connect module to power supply enable add/remove mode on main controller, hold service button S between 4 seconds and 8 seconds By this function, all parameters of the module are set to default values and own ID is deleted.

If service button S hold more than 1.5 and less than 4 seconds module is excluded, but configuration parameters are not set to default values.

## Channels

The following table summarises the channels available for the ZMNHZD -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (velocity) | sensor_velocity | sensor_velocity |  | Number | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number | 
| Sensor (direction) | sensor_direction | sensor_direction |  | Number | 
| Sensor (rain rate) | sensor_rainrate | sensor_rainrate | Humidity | Number | 
| Battery Level | battery-level | system.battery_level | Battery | Number |
| Thermo/ Hygro Sensor Ch1 – Temperature | sensor_temperature1 | sensor_temperature | Temperature | Number:Temperature | 
| Battery Level | battery-level | system.battery_level | Battery | Number |
| Wind Gauge – Direction | sensor_direction2 | sensor_direction |  | Number | 
| Battery Level | battery-level | system.battery_level | Battery | Number |
| Wind Gauge – Velocity | sensor_velocity3 | sensor_velocity |  | Number | 
| Battery Level | battery-level | system.battery_level | Battery | Number |
| Wind Gauge – Wind gust | sensor_velocity4 | sensor_velocity |  | Number | 
| Battery Level | battery-level | system.battery_level | Battery | Number |
|  Wind Gauge – Temperature | sensor_temperature5 | sensor_temperature | Temperature | Number:Temperature | 
| Battery Level | battery-level | system.battery_level | Battery | Number |
| Wind Gauge – Wind Chill | sensor_temperature6 | sensor_temperature | Temperature | Number:Temperature | 
| Battery Level | battery-level | system.battery_level | Battery | Number |
|  Rain Sensor | sensor_rainrate7 | sensor_rainrate | Humidity | Number | 
| Battery Level | battery-level | system.battery_level | Battery | Number |
|  Thermo/ Hygro Sensor Ch1 – Humidity | sensor_relhumidity8 | sensor_relhumidity | Humidity | Number | 
| Battery Level | battery-level | system.battery_level | Battery | Number |
| Thermo/ Hygro Sensor Ch2 – Temperature | sensor_temperature9 | sensor_temperature | Temperature | Number:Temperature | 
| Battery Level | battery-level | system.battery_level | Battery | Number |
|  Thermo/ Hygro Sensor Ch2 – Humidity  | sensor_relhumidity10 | sensor_relhumidity | Humidity | Number | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Sensor (velocity)
Indicates the current velocity.

The ```sensor_velocity``` channel is of type ```sensor_velocity``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (relative humidity)
Indicates the current relative humidity.

The ```sensor_relhumidity``` channel is of type ```sensor_relhumidity``` and supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (direction)
Indicates the direction.

The ```sensor_direction``` channel is of type ```sensor_direction``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Sensor (rain rate)
Indicates the current relative humidity.

The ```sensor_rainrate``` channel is of type ```sensor_rainrate``` and supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.
### Thermo/ Hygro Sensor Ch1 – Temperature
Endpoint 1 receives Temperature data from Thermo/ Hygro Sensor on Channel 1. It is capable of receiving data in range of -199.0 °C and 199.0 °C. However, the operating temperature of the 433 MHz sensor is from -10 °C to 60 °C

Indicates the current temperature.

The ```sensor_temperature1``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level1``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.
### Wind Gauge – Direction
Endpoint 2 receives Direction data from Wind Gauge. The data is in range of 0.0° to 360.0°.

Indicates the direction.

The ```sensor_direction2``` channel is of type ```sensor_direction``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level2``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.
### Wind Gauge – Velocity
Endpoint 3 receives wind speed data from Wind Gauge. It is capable of receiving data in range of 0.00 m/s to 88.00 m/s. 

Indicates the current velocity.

The ```sensor_velocity3``` channel is of type ```sensor_velocity``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level3``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.
### Wind Gauge – Wind gust
Endpoint 4 receives wind speed data from Wind Gauge. It is capable of receiving data in range of 0.00 m/s to 88.00 m/s. 

Indicates the current velocity.

The ```sensor_velocity4``` channel is of type ```sensor_velocity``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level4``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.
###  Wind Gauge – Temperature
Endpoint 5 receives Temperature data from Wind Gauge. It is capable of receiving data in range of -199.0 °C and 199.0 °C. However, the operating temperature of the sensor is from -10 °C to 60 °C

Indicates the current temperature.

The ```sensor_temperature5``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level5``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.
### Wind Gauge – Wind Chill
Endpoint 6 receives Temperature data from Wind Gauge. It is capable of receiving data in range of -199.0 °C and 199.0 °C. However, the operating temperature of the sensor is from -10 °C to 60 °C

Indicates the current temperature.

The ```sensor_temperature6``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level6``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.
###  Rain Sensor
Endpoint 7 receives and calculates rain rate. The rain rate is in range of 0.00 mm/h and 300.00 mm/h

Indicates the current relative humidity.

The ```sensor_rainrate7``` channel is of type ```sensor_rainrate``` and supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level7``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.
###  Thermo/ Hygro Sensor Ch1 – Humidity
Endpoint 8 receives Humidity data from Thermo/ Hygro Sensor on Channel 1. The data is in range of 0% and 100%

Indicates the current relative humidity.

The ```sensor_relhumidity8``` channel is of type ```sensor_relhumidity``` and supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level8``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.
### Thermo/ Hygro Sensor Ch2 – Temperature
Endpoint 9 receives Temperature data from Thermo/ Hygro Sensor on Channel 2. It is capable of receiving data in range of -199.0 °C and 199.0 °C. However, the operating temperature of the sensor is from -10 °C to 60 °C.

Indicates the current temperature.

The ```sensor_temperature9``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level9``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.
###  Thermo/ Hygro Sensor Ch2 – Humidity 
Endpoint 10 receives Humidity data from Thermo/ Hygro Sensor on Channel 2. The data is in range of 0% and 100%.

Indicates the current relative humidity.

The ```sensor_relhumidity10``` channel is of type ```sensor_relhumidity``` and supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level10``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 16 configuration parameters available in the ZMNHZD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Wind Gauge - Gust Top Value | Wind Gauge, Wind Gust Top Value |
| 2 | Rain Gauge - Rate top value | Rain Rate top value |
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

### Parameter 1: Wind Gauge - Gust Top Value

Wind Gauge, Wind Gust Top Value
Wind Gauge, Wind Gust Top Value, if the Wind Gust is Higher than the Parameter Value, a device triggers an Association
Values in the range 0 to 8800 may be set.

The manufacturer defined default value is ```1000```.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: Rain Gauge - Rate top value

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
  * default Value 0
  * 0 – Unsecure Inclusion
  * 1 – Secure Inclusion

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

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Reserved for the communication with the main controller

Association group 1 supports 1 node.

### Group 2: Basic on/off - wind

triggered when the wind gust of the wind gauge exceed the configuration parameter 1 value

Association group 2 supports 16 nodes.

### Group 3: Basic on/off - rain

triggered when the rain rate exceed the configuration parameter 2 value

Association group 3 supports 16 nodes.

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
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 5

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 6

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 7

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 8

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 9

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 10

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Multifunctional Weather Station - ZMNHZD1](https://www.cd-jackson.com/zwave_device_uploads/364/qubino-ZMNHZD1-V1-1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/364).
