---
id: zigbee
label: ZigBee
title: ZigBee - Bindings
type: binding
description: "The ZigBee binding supports an interface to a wireless ZigBee home automation network."
since: 2x
logo: images/addons/zigbee.png
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# ZigBee Binding

The ZigBee binding supports an interface to a wireless ZigBee home automation network. 

## Supported Things

### ZigBee TI2531 Coordinator

Before the binding can be used, a coordinator must be added. This needs to be done manually and the serial port must be set.

## Discovery

Once the binding is authorized, and an adapter is added, it automatically reads all devices that are set up on the ZigBee controller and puts them in the Inbox.

## Thing Configuration

The binding will attempt to automatically detect new devices, and will read their supported clusters upon startup. A set of channels will then be created depending on what clusters and endpoints a device supports.

## TI2531 - Firmware

The TI2531 USB dongle must be flashed with the correct firmware in order to work with this binding.
The file can be downloaded from TI website archives (http://www.ti.com/tool/z-stack-archive) as part
of the `Z-STACK-HOME v.1.2.2a` package.
The file name is `CC2531ZNP-Pro-Secure_Standard.hex` and its sha256 is `3cc5dc571ef0f49e3f42c6c2ca076d6f8fef33a945c71e6f951b839ba0599d3c`.

### Flashing on Linux

It's possible to flash the dongle using Linux, using `cc-tool` (https://github.com/dashesy/cc-tool.git).
The software has been tested and confirmed working on Ubuntu 16.10 and 17.04.
The required dependencies can be installed with `sudo apt install build-essential libusb-1.0-0-dev libboost-all-dev`,
and the binary compiled with `./configure && make`. Do not forget to install the `udev` rules, as described at https://github.com/dashesy/cc-tool/blob/master/README , or the software might not be able to access the USB programmer.

The firmware can be flashed with `./cc-tool -e -w CC2531ZNP-Pro-Secure_Standard.hex -v r`. Change the path to the firmware accordingly.
