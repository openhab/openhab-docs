---
id: zigbee
label: ZigBee
title: ZigBee - Bindings
type: binding
description: "The ZigBee binding supports an interface to a wireless ZigBee home automation network and allows ZigBee devices from numerous manufacturers to be used without a system specific gateway."
since: 2x
logo: images/addons/zigbee.png
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# ZigBee Binding

The ZigBee binding supports an interface to a wireless ZigBee home automation network and allows ZigBee devices from numerous manufacturers to be used without a system specific gateway.

## Supported Things

### Coordinators

A ZigBee Coordinator is the network controller, and is therefore the heart of the ZigBee network. It also acts as the trust centre to control security access to the network.

Coordinators need to be installed manually and the serial port must be set.

#### TI2531 Coordinator

This is the Texas Instruments ZNP stack. The thing type is ```coordinator_ti2351```.

##### TI2531 - Firmware

The TI2531 USB dongle must be flashed with the correct firmware in order to work with this binding.
The file can be downloaded from TI website archives (http://www.ti.com/tool/z-stack-archive) as part
of the `Z-STACK-HOME v.1.2.2a` package.
The file name is `CC2531ZNP-Pro-Secure_Standard.hex` and its sha256 is `3cc5dc571ef0f49e3f42c6c2ca076d6f8fef33a945c71e6f951b839ba0599d3c`.

##### Flashing on Linux

It's possible to flash the dongle using Linux, using `cc-tool` (https://github.com/dashesy/cc-tool.git).
The software has been tested and confirmed working on Ubuntu 16.10 and 17.04.
The required dependencies can be installed with `sudo apt install build-essential libusb-1.0-0-dev libboost-all-dev`, and the binary compiled with `./configure && make`. Do not forget to install the `udev` rules, as described at https://github.com/dashesy/cc-tool/blob/master/README , or the software might not be able to access the USB programmer.

The firmware can be flashed with `./cc-tool -e -w CC2531ZNP-Pro-Secure_Standard.hex -v r`. Change the path to the firmware accordingly.


#### Ember EZSP NCP Coordinator

The Ember EZSP NCP (Network Co-Processor) supports the Silabs EM358 or MightyGecko dongles with the standard NCP firmware. The thing type is ```coordinator_ember```.

#### Telegesis ETRX3

The thing type is ```coordinator_telegesis```.

### Devices

The following devices have been tested with the binding

| Device                     | Description                    |
|----------------------------|--------------------------------|
| Busch-Jaeger 6711          | Relay Insert                   |
| Hue Bulbs                  | Color LED Bulb                 |
| Hue Motion Sensor          | Motion and Luminance sensor    |
| Osram Bulbs                |                                |
| SmartThings Plug           | Metered Plug                   |
| SmartThings Motion Sensor  | Motion and Temperature sensor  |
| SmartThings Contact Sensor | Contact and Temperature sensor |
| Tradfri Bulbs              |                                |



## Discovery

Once the binding is authorized, and an adapter is added, it automatically reads all devices that are set up on the ZigBee controller and puts them in the Inbox. When the binding is put into discovery mode via the user interface, the network will have join enabled for 60 seconds.


## Thing Configuration

The binding will attempt to automatically detect new devices, giving them a type based on the information they report, and will read their supported clusters to define the supported channels. 

### Thing Types

Currently all ZigBee things have the same thing type of ```zigbee_device```.

### Channel Types

A set of channels will be created depending on what clusters and endpoints a device supports. Channels are loosely linked to clusters in that for the majority of channels, a single cluster is used. However, some channels may utilise more than one cluster to provide the required functionality.

The following channels are supported -:

| Channel UID | ZigBee Cluster | Type     |Description                  |
|-------------|----------------|----------|-----------------------------|
| switch_dimmer | ```LEVEL_CONTROL``` (0x0008) | Dimmer |   |
| switch_onoff | ```ON_OFF``` (0x0006) | Switch  |
| color_color | ```COLOR_CONTROL``` (0x0300) | Color |   |
| color_temperature | ```COLOR_CONTROL``` (0x0300) | Dimmer |   |
| ias_contactportal1 | ```IAS_ZONE``` (0x0500) | Switch |  |
| ias_motionintrusion | ```IAS_ZONE``` (0x0500) | Switch |  |
| ias_motionpresence | ```IAS_ZONE``` (0x0500) | Switch |  |
| measurement_illuminance | ```ILLUMINANCE_MEASUREMENT``` (0x0400) | Number |   |
| measurement_temperature | ```TEMPERATURE_MEASUREMENT``` (0x0402) | Number |   |
| sensor_occupancy   | ```OCCUPANCY_SENSING``` (0x0406) | Switch  |  |


### Updates

The binding will attempt to configure a connection with the device to receive automatic and instantaneous reports when the device status changes. Should this configuration fail, the binding will resort to using a fast polling (note that "fast" is approximately 10 seconds at this time). 


## When things don't appear to be working

When things don't appear to be working as expected you should check the logs to try and find what is happening. Debug logging can be enabled with the following Karaf commands -:

```
log:set debug org.openhab.binding.zigbee
log:set debug com.zsmartsystems.zigbee
```

This will log data into the standard openhab.log file.
