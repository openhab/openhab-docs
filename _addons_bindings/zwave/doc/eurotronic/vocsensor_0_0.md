---
layout: documentation
title: VOC-SENSOR - ZWave
---

{% include base.html %}

# VOC-SENSOR Air Quality Sensor
This describes the Z-Wave device *VOC-SENSOR*, manufactured by *Eurotronics* with the thing type UID of ```eurotronic_vocsensor_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![VOC-SENSOR product image](https://www.cd-jackson.com/zwave_device_uploads/1240/1240_default.jpg)


The VOC-SENSOR supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Z-Wave sensor in an ultra slim design housing provides comprehensive information on indoor air quality.

Based on these information it is possible to always ensure a healthy living climate.

• Ultra-flat design housing

• Use of high-precision, Swiss sensor technology

• Multicolor LED for signalling ventilation recommendations

• Returns the following values:

- VOC value (volatile organic compounds) in ppm

- CO2 value (as CO2 equivalent) in ppm

- Temperature (°C) and humidity (%)

- Dew point (°C)

• Supports Z-Wave Plus S2 security (encryption)

• Z-Wave repeater function

• Operation with plug-in power supply unit

### Inclusion Information

Press the back button three times within 1 second.

While the inclusion is active, the LED is blinking green. If the inclusion was successful the green LED will light up for 5 seconds. Otherwise the red led will light up for 5 seconds to indicate failure.

### Exclusion Information

Press the back button three times within 1 second.

While the exclusion is active, the LED is blinking green. If the exclusion was successful the green LED will light up for 5 seconds. Otherwise the red led will light up for 5 seconds to indicate failure.

### General Usage Information

On factory default the device does not belong to any Z-Wave network Air Quality Sensor Z-Wave Plus needs to be added to an existing wireless network to communicate with the devices of this network.

This process is called Inclusion.

Air Quality Sensor Z-Wave Plus can also be removed from a network.

This process is called Exclusion.

Both processes are initiated by the primary controller of the Z-Wave network.

This controller is turned into exclusion respective inclusion mode.

Please consult the manual of your Z-Wave Controller how to activate Inclusion or Exclusion mode.

If Air Quality Sensor Z-Wave Plus has been added to a network, it has to be removed prior to be added to another wireless network.

## Channels

The following table summarises the channels available for the VOC-SENSOR -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number | 
| Sensor (VOLATILE_ORGANIC_COMPOUND) | sensor_voc | sensor_voc |  |  | 
| Sensor (CO2) | sensor_co2 | sensor_co2 | CarbonDioxide | Number | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (dew point) | sensor_dewpoint | sensor_dewpoint | Temperature | Number | 
| Alarm (HOME_HEALTH) | alarm_general | alarm_general | Alarm | Switch | 

### Sensor (relative humidity)
Indicates the current relative humidity.

The ```sensor_relhumidity``` channel is of type ```sensor_relhumidity``` and supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (VOLATILE_ORGANIC_COMPOUND)
Air Quality Sensor Z-Wave Plus measures the VOC concentration and automatically reports sensor readings to associated devices.

Per default the reporting threshold is ±500ppb.

This parameter can be altered via configuration command class.  
Sensor type: „Volatile Organic Compound level“  
Scale: Parts/million (ppm)  
Precision: 3

Channel type information on this channel is not found.

### Sensor (CO2)
Indicates the CO2 level.

The ```sensor_co2``` channel is of type ```sensor_co2``` and supports the ```Number``` item and is in the ```CarbonDioxide``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (dew point)
Indicates the dewpoint.

The ```sensor_dewpoint``` channel is of type ```sensor_dewpoint``` and supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (HOME_HEALTH)
Home Health  
Air pollution level has changed  
Pollution level  
0x01: Clean  
0x02: Slightly polluted  
0x03: Moderately polluted  
0x04: Highly polluted

Indicates if an alarm is triggered.

The ```alarm_general``` channel is of type ```alarm_general``` and supports the ```Switch``` item and is in the ```Alarm``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 8 configuration parameters available in the VOC-SENSOR.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Temperature on-change reporting | Temperature on-change reporting |
| 2 | Humidity on-change reporting | Humidity on-change reporting |
| 3 | Unit Temperature | Unit for Temperature (Celsius or Fahrenheit) |
| 4 | Resolution Temperature | Resolution for Temperature |
| 5 | Resolution Humidity | Resolution Humidity |
| 6 | VOC on-change reporting | VOC on-change reporting |
| 7 | CO2eq on-change reporting | CO2eq on-change reporting |
| 8 | Air quality indication via LED | Air quality indication via LED |

### Parameter 1: Temperature on-change reporting

Temperature on-change reporting
0x00 No on-change reporting (only time-based reports).

0x01 - 0x32 report if temperature changed by delta = 0,1°C - 5,0°C
The following option values may be configured, in addition to values in the range 0 to 50 -:

| Value  | Description |
|--------|-------------|
| 0 | No on-change reporting |

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Humidity on-change reporting

Humidity on-change reporting
0x00 No on-change reporting (only time-based reports)

0x01 - 0x0A report if humidity changed by delta = 1% ...10%
The following option values may be configured, in addition to values in the range 0 to 10 -:

| Value  | Description |
|--------|-------------|
| 0 | No on change reporting |

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Unit Temperature

Unit for Temperature (Celsius or Fahrenheit)
0x00 Temperature reports in Celsius 

0x01 Temperature reports in Fahrenheit
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Celsius |
| 1 | Fahrenheit |

The manufacturer defined default value is ```0``` (Celsius).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Resolution Temperature

Resolution for Temperature
0x00 No resolution (example 22°C)

0x01 1/10 resolution (example 22.3°C)

0x02 1/100 resolution (example 22.35°C)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No resolution |
| 1 | 1/10 resolution |
| 2 | 1/100 resolution |

The manufacturer defined default value is ```1``` (1/10 resolution).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Resolution Humidity

Resolution Humidity
0x00 No resolution (example 33%)

0x01 1/10 resolution (example 33.4%)

0x02 1/100 resolution (example 33.45%)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No resolution |
| 1 | 1/10 resolution |
| 2 | 1/100 resolution |

The manufacturer defined default value is ```0``` (No resolution).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: VOC on-change reporting

VOC on-change reporting
0x00 No on-change reporting (only time-based reports)

0x01 - 0x0A report if VOC reading changed by 100ppb - 1000ppb
Values in the range 0 to 10 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: CO2eq on-change reporting

CO2eq on-change reporting
0x00 No on-change reporting (only time-based reports)

0x01 - 0x0A report if CO2eq reading changed by 100ppm - 1000ppm
Values in the range 0 to 10 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Air quality indication via LED

Air quality indication via LED
0x00 No air quality indication via LEDs

0x01 Indicate measured air quality via LEDs
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The VOC-SENSOR supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Air Quality Sensor Z-Wave Plus can be associated with other devices.
Commands:

DEVICE\_RESET\_LOCALLY\_NOTIFICATION,NOTIFICATION\_REPORT,SENSOR\_MULTILEVEL\_REPORT

Association group 1 supports 1 node.

### Group 2: Temperature

Air Quality Sensor Z-Wave Plus can be associated with other devices.
Command: SENSOR\_MULTILEVEL\_REPORT

Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V10| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Installation and Operation Guide](https://www.cd-jackson.com/zwave_device_uploads/1240/Eurotronic-LGS-Z-Wave-Plus-BDA-web-EN-1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1240).
