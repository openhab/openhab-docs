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

Coordinators need to be installed manually and the serial port and baud rate must be set. These are set to match the configuration that the dongle is in. Should you wish to use a different baud rate than the default speed of the device, you must change the configuration of the dongle using some other, and then configure the binding to match your change. If in doubt, you should leave the settings at their default values which should work in most cases.

#### Coordinator Configuration

##### Link Key (zigbee_linkkey)

The key is defined as 16 hexadecimal values. If not defined, this will default to the well known ZigBee HA link key which is required for ZigBee HA 1.2 devices. Do not alter this key if using with a ZigBee HA 1.2 network unless you fully understand the impact.

If defined with the word ```INSTALLCODE:``` before the key, this will create a link key from an install code which may be shorter than 16 bytes.

eg ```5A 69 67 42 65 65 41 6C 6C 69 61 6E 63 65 30 39```
eg ```INSTALLCODE:00 11 22 33 44 55 66 77```

##### Network Key (zigbee_networkkey)

The key is defined as 16 hexadecimal values. If not defined, a random key will be created.

#### Supported Coordinators

The following coordinators are known to be supported.

| Name and Link              | Coordinator | Comment                       |
|----------------------------|-------------|-------------------------------|
|[Texas Instruments CC2531EMK](http://www.ti.com/tool/cc2531emk)|[CC2531](#cc2531-coordinator)|Needs extra hardware and correct firmware (might be hard to find) for flashing.<br>There are also cheap copies of the CC2531 Stick available on eBay, Aliexpress, etc. like [this](https://de.aliexpress.com/item/Drahtlose-Zigbee-CC2531-Sniffer-software-protokoll-analyse-Bareboard-Paket-Protokoll-Analyzer-Modul-Usb-schnittstelle-Dongle-Erfassen/32852226435.html) and a module to flash the firmware like [this](https://de.aliexpress.com/item/SmartRF04EB-CC1110-CC2530-ZigBee-Module-USB-Downloader-Emulator-MCU-M100/32673666126.html)<br>Also CC2530, CC2538 or CC2650 may work with the correct firmware but are not suggested|
|[Bitron Video ZigBee USB Funkstick](http://www.bitronvideo.eu/index.php/produkte/smart-home-produkte/zb-funkstick/)|[Ember](#ember-ezsp-ncp-coordinator)| |
|[Cortet EM358 USB Stick](https://www.cortet.com/iot-hardware/cortet-usb-sticks/em358-usb-stick)|[Ember](#ember-ezsp-ncp-coordinator)| Use baud rate 57600 and software flow control. |
|[Nortek Security & Control HUSBZB-1](https://nortekcontrol.com/products/2gig/husbzb-1-gocontrol-quickstick-combo/)|[Ember](#ember-ezsp-ncp-coordinator)|Stick contains both Z-Wave and ZigBee. Use baud rate 57600 and software flow control. |
|[Telegesis ETRX357USB ZigBee® USB Stick](https://www.silabs.com/products/wireless/mesh-networking/telegesis-modules-gateways/etrx3-zigbee-usb-sticks)|[Telegesis](#telegesis-etrx3)| |
|[QIVICON ZigBee-Funkstick](https://www.qivicon.com/de/produkte/produktinformationen/zigbee-funkstick/)|[Telegesis](#telegesis-etrx3)|Only working on Linux devices|
|[Digi XStick](https://www.digi.com/products/xbee-rf-solutions/boxed-rf-modems-adapters/xstick)|[XBee](#digi-xbee-x-stick)| |

#### CC2531 Coordinator

This is the Texas Instruments ZNP stack. The thing type is ```coordinator_cc2531```.

##### CC2531 - Firmware

The CC2531 USB dongle must be flashed with the correct firmware in order to work with this binding.
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

Note that there are generally two versions of the Ember NCP firmware in use. One operates at a baud rate of 115200 with RTS/CTS flow control (i.e. hardware flow control), the other operates at a baud rate of 57600, and XON/XOFF flow control (i.e. software flow control). If you are programming your own stick (e.g. the CEL stick) then it should be advisable to use the hardware flow control version - many commercial sticks seem to use the lower speed and software flow control (e.g. Bitron and Nortek HUSBZB-1).

If the usb dongle is not recognized, it might be necessary to make the dongle's device id known to the CP240x driver by Silicon Labs:

- Find the device id (as listed by the command ```lsusb```). For the Bitron Funkstick that might be 10c4 8b34. 
- Unplug the device
- Enter the following commands (replace the id 10c4 8b34 with the one listed by  ```lsusb```):
```
sudo -s
modprobe cp210x
echo 10c4 8b34 > /sys/bus/usb-serial/drivers/cp210x/new_id
```
- Plug in the dongle. It should now be recognized properly as ttyUSBx.

#### Telegesis ETRX3

The thing type is ```coordinator_telegesis```.

#### Digi XBee X-Stick

The thing type is ```coordinator_xbee```. Other XBee S2C devices should also be supported.

### Devices

The following devices have been tested with the binding

| Device                     | Description                                       |
|----------------------------|---------------------------------------------------|
| Busch-Jaeger 6711 U        | Relay Insert                                      |
| Busch-Jaeger 6715 U        | LED-Dimmer Insert                                 |
| Busch-Jaeger 6735          | Control Element (1-channel)                       |
| Busch-Jaeger 6735/01       | Control Element (1-channel, battery-operated)     |
| Busch-Jaeger 6736          | Control Element (2-channel)                       |
| GE Bulbs                   |                                                   |
| Hue Bulbs                  | Color LED Bulb                                    |
| Hue Motion Sensor          | Motion and Luminance sensor                       |
| Innr Bulbs                 | *note1*                                           |
| Osram Bulbs                |                                                   |
| Osram Motion Sensor        | Osram Smart+ Motion Sensor                        |
| SmartThings Plug           | Metered Plug                                      |
| SmartThings Motion Sensor  | CentraLite 3325-S Motion and Temperature sensor   |
| SmartThings Contact Sensor | Contact and Temperature sensor                    |
| Tradfri Bulbs              |                                                   |
| Tradfri Motion Sensor      |                                                   |
| Trust Bulbs                | *note1*                                           |
| Ubisys modules             | D1 Dimmer, S1/S2 Switch modules                   |

Note 1: Some bulbs may not work with the Telegesis dongle.

## Discovery

Once the binding is installed, and an adapter is added, it automatically reads all devices that are set up on the ZigBee controller and puts them in the Inbox. When the binding is put into discovery mode via the user interface, the network will have join enabled for 60 seconds.

The binding will store the list of devices that have joined the network locally between restarts to allow them to be found again later. A ZigBee coordinator does not store a list of known devices, so rediscovery of devices following a restart may not be seemless if the dongle is moved to another system.

When a ZigBee device restarts (e.g. a bulb is powered on), it will send an announcement to advise the coordinator that it is on the network and this will allow the binding to rediscover devices that have become lost. Battery devices often have a button that may also perform this function.

### Install Codes

Note: Currently only Ember coordinators support Zigbee 3, it does not look like the Telegesis coordinators will receive an update to support it.

ZigBee 3 requires that devices use an install code to securely join the network. This must be added
to the binding before the discovery starts. Install codes should be printed on the box the device came
in, or possibly on the device itself. Note that there is no standard format for how these codes may be
displayed on the device or its packaging. You may need to use a QR reader to read the code - again these
are not standard in their format, although you should be able to find the address and install code in the
displayed text.

The install code must be entered into the coordinator settings before starting the discovery process.
The format is ```IEEE Address:Install Code``` in the following format -:

```
AAAAAAAAAAAAAAAA:CCCC-CCCC-CCCC-CCCC-CCCC-CCCC-CCCC-CCCC-DDDD
```

ZigBee 3 requires the install code to be 16 bytes long (8 blocks of characters) but some older systems using
this method may use less bytes, but it should still be formatted as 2, 4, or 8 groups of 4 values. 
Note that the last four characters in the install code are the checksum and may be provided separately.

## Leave

When a thing is deleted, the binding will attempt to remove the device from the network by sending the *leave* command on the network. 

## Thing Configuration

The binding will attempt to automatically detect new devices, giving them a type based on the information they report, and will read their supported clusters to define the supported channels. 

### Thing Types

Currently all ZigBee things have the same thing type of ```zigbee_device```.

### Channel Types

A set of channels will be created depending on what clusters and endpoints a device supports. Channels are loosely linked to clusters in that for the majority of channels, a single cluster is used. However, some channels may utilise more than one cluster to provide the required functionality.

The following channels are supported -:

| Channel UID | ZigBee Cluster | Type     |Description                  |
|-------------|----------------|----------|-----------------------------|
| battery-level | ```POWER_CONFIGURATION``` (0x0001) | Number |   |
| battery_voltage | ```POWER_CONFIGURATION``` (0x0001) | Number:ElectricPotential |   |
| color_color | ```COLOR_CONTROL``` (0x0300) | Color |   |
| color_temperature | ```COLOR_CONTROL``` (0x0300) | Dimmer |   |
| electrical_activepower | ```ELECTRICAL_MEASUREMENT``` (0x0B04) | Number:Power |   |
| electrical_rmscurrent | ```ELECTRICAL_MEASUREMENT``` (0x0B04)  | Number:ElectricCurrent |   |
| electrical_rmsvoltage | ```ELECTRICAL_MEASUREMENT``` (0x0B04)  | Number:ElectricPotential |   |
| ias_codetector | ```IAS_ZONE``` (0x0500)  | Switch |   |
| ias_contactportal1 | ```IAS_ZONE``` (0x0500) | Switch |  |
| ias_fire | ```IAS_ZONE``` (0x0500)  | Switch |   |
| ias_motionintrusion | ```IAS_ZONE``` (0x0500) | Switch |  |
| ias_motionpresence | ```IAS_ZONE``` (0x0500) | Switch |  |
| ias_standard_system | ```IAS_ZONE``` (0x0500) | Switch |  |
| ias_water | ```IAS_ZONE``` (0x0500) | Switch |  |
| ias_tamper | ```IAS_ZONE``` (0x0500) | Switch |  |
| measurement_illuminance | ```ILLUMINANCE_MEASUREMENT``` (0x0400) | Number |   |
| measurement_pressure | ```PRESSURE_MEASUREMENT``` (0x0403) | Number:Pressure |   |
| measurement_relativehumidity | ```RELATIVE_HUMIDITY_MEASUREMENT``` (0x0405) | Number |   |
| measurement_temperature | ```TEMPERATURE_MEASUREMENT``` (0x0402) | Number:Temperature |   |
| sensor_occupancy | ```OCCUPANCY_SENSING``` (0x0406) | Switch  |  |
| switch_dimmer | ```LEVEL_CONTROL``` (0x0008) | Dimmer |   |
| switch_onoff | ```ON_OFF``` (0x0006) | Switch  |


### Updates

The binding will attempt to configure a connection with the device to receive automatic and instantaneous reports when the device status changes. Should this configuration fail, the binding will resort to using a fast polling (note that "fast" is approximately 30 seconds at this time). 


## When things don't appear to be working

When things don't appear to be working as expected you should check the logs to try and find what is happening. Debug logging can be enabled with the following Karaf commands -:

```
log:set debug org.openhab.binding.zigbee
log:set debug com.zsmartsystems.zigbee
log:set info com.zsmartsystems.zigbee.dongle.ember.internal.ash
```

This will log data into the standard openhab.log file. There is an [online log viewer](https://www.cd-jackson.com/index.php/openhab/zigbee-log-viewer) available for viewing the logs.

Note that logs can only show what is happening at a high level - it can't show all data exchanges between the device and the coordinator - just what the coordinator sends to the binding. For this reason it can be difficult to debug issues where devices are not joining the network, or other low level issues need resolving. In such cases a network sniffer log is required, which requires additional hardware and software.
