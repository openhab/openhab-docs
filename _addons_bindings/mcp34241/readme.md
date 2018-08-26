---
id: mcp3424
label: MCP3424
title: MCP3424 - Bindings
type: binding
description: "This binding provides native access for MCP3424 18-bit delta sigma ADC on I2C bus. Please consider datasheet for IC for future information. The binding should work with MCP3422 and MCP3423 also, but was not tested due to lack of hardware."
source: https://github.com/openhab/openhab1-addons/blob/master/bundles/binding/org.openhab.binding.mcp3424/README.md
since: 1x
install: manual
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# MCP3424 Binding

This binding provides native access for MCP3424 18-bit delta sigma ADC on I2C bus. Please consider datasheet for IC for future information. The binding should work with MCP3422 and MCP3423 also, but was not tested due to lack of hardware.

This binding works nicely with openHAB 1.8.3 and 2.0.0 runtimes.

## Binding Configuration

No special configuration is needed.

## Item Configuration

Since MCP3424 is ADC converter on I2C bus, only two types of items are supported:

* `Number` for raw conversion output and 
* `Dimmer` for conversion output in percent. Percent value is calculated dependent on set resolution. Find the example below.

```
Number Test1 "Test 1" (Tests) { mcp3424="{address:6C, pin:'CH0', gain:1, resolution:12}" }
```

returns the raw conversion result on channel 0 (CH1 on datasheet) of the IC on address 0x6C

```
Dimmer Test2 "Test 2" (Tests) { mcp3424="{address:6C, pin:'CH1', gain:1, resolution:12}" }
```

returns the conversion result in percent on channel 1 (CH2 on datasheet) of the IC on address 0x6C
