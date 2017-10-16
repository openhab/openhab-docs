---
id: mcp23017
label: MCP23017
title: MCP23017 - Bindings
type: binding
description: "This binding provides native access for MCP23017 16 bit bidirectional I/O expander on I2C bus. Please consider datasheet for IC for future information."
source: https://github.com/openhab/openhab1-addons/blob/master/bundles/binding/org.openhab.binding.mcp23017/README.md
since: 1x
install: manual
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# MCP23017 Binding 

This binding provides native access for MCP23017 16 bit bidirectional I/O expander on I2C bus. Please consider datasheet for IC for future information.

This binding works nicely with openHAB 1.8.3 and 2.0.0 runtimes.

## Binding Configuration

No special configuration is needed.

## Item Configuration

Since MCP23017 is digital IO expander on I2C bus, only two types of items are supported:

* `Contact` for pins that used as digital input and 
* `Switch` for digital output. Find the example below.

```
Contact Test1 "Test 1" (Tests) { mcp23017="{ address:21, pin:'A0', mode:'DIGITAL_INPUT'}" }
```

configures pin 0 at bank A (GPA0 on datasheet) as input of the IC on address 0x20

```
Switch Test2 "Test 2" (Tests) { mcp23017="{ address:21, pin:'B1', mode:'DIGITAL_OUTPUT', defaultState:'LOW'}" }
```

configures pin 1 at bank B (GPB1 on datasheet) as output of the IC on adress 0x21