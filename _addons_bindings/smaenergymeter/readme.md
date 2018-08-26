---
id: smaenergymeter
label: SMA Energy Meter
title: SMA Energy Meter - Bindings
type: binding
description: "This Binding is used to display the measured values of a SMA Energy Meter device."
since: 2x
logo: images/addons/smaenergymeter.png
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# SMA Energy Meter Binding

This Binding is used to display the measured values of a SMA Energy Meter device.
It shows purchased and grid feed-in power and energy.

## Supported Things

This Binding supports SMA Energy Meter devices.

## Discovery

The Energy Meter is discovered by receiving data on the default multicast IP address.

## Binding Configuration

No binding configuration required.

## Thing Configuration

Usually no manual configuration is required, as the multicast IP address and the port remain on their factory set values.
Optionally, a refresh interval (in seconds) can be defined.

## Channels

-   **powerIn** Purchased power &lsqb;W&rsqb;
-   **powerOut** Grid feed-in power &lsqb;W&rsqb;
-   **energyIn** Purchased energy &lsqb;kWh&rsqb;
-   **energyOut** Grid feed-in energy &lsqb;kWh&rsqb;

## Full example

N/A
