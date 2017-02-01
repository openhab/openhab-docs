---
layout: documentation
---

{% include base.html %}

# SMA Energy Meter Binding

This Binding is used to display the measured values of a SMA Energy Meter device. It shows purchased and grid feed-in power and energy.

## Supported Things

This Binding supports SMA Energy Meter devices.

## Discovery

The Energy Meter is discovered by receiving data on the default multicast IP address.

## Binding Configuration

No binding configuration required.

## Thing Configuration

Usually no manual configuration is required, as the multicast IP address and the port remain on their factory set values. Optionally, a refresh interval (in seconds) can be defined.

## Channels

- **powerIn** Purchased power [W]
- **powerOut** Grid feed-in power [W]
- **energyIn** Purchased energy [kWh]
- **energyOut** Grid feed-in energy [kWh]

## Full example
N/A
