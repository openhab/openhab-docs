---
layout: documentation
title: Rules Blockly - Items & Things
---
<!-- markdownlint-disable MD036 -->

# Units of Measurements

[return to Blockly Reference](index.html#items-and-things)

## Introduction

[Unit of Measurements](docs/concepts/units-of-measurement.html) have been a part of openHAB for a long time already and received some major improvements in particular in openHAB 4.0.
Therefore, to make the usage in blockly easier and allow math computations with measurement units, severals blocks have been added.

Note that these blocks are only available since openHAB 4.0 and are based on JS Scripting / graalJS.

The following example block gives a good idea of what can be done with the Unit of Measurement blocks

![blockly-uom-example](../images/blockly/blockly-uom-example.png)

[[toc]]

## Overview of the Items and Things category

![blockly-uom](../images/blockly/blockly-uom.png)

### Unit of Measurement Blocks

These blocks allow you to add, substract, multiply and divide measurements, which include a [**unit**](docs/concepts/units-of-measurement.html#list-of-units) of measurement which is also called a Quantity Type, as well as comparing values against each other.

## Quantity Block

A _Quantity_ is the combination of a value and a unit of measurement, which means that the blocks require a _Quantity_ as an input and generate a _Quantity_ as an output.
Even though the quantity block looks similar to the standard text block it actually wraps a string into a _Quantity_ type.

_Function:_ The following block takes a string of "10 W" (10 Watts) and converts into a quantity of 10 W which then can be used for computations.
Instead of using a constant string, the block can also take the output of an item or a variable and convert it into a quantity.

![blockly-quantity](../images/blockly/blockly-quantity.png)
![blockly-quantity-temperature-item](../images/blockly/blockly-quantity-temp-item.png)

### Quantity computation

_Function:_ The block allows to compute the following operations with two quantities:

- addition
- substraction
- division
- multiplication

It only takes a [quantity block](#quantity-block) as an input and also returns a quantity as an output

![blockly-quantity-multiplication](../images/blockly/blockly-quantity-multiplication.png)

Amazingly, this multiplication results into the right quantity of 100 W².

### Quantity Comparison

_Function:_ The block allows to compare two quantities with the following operands which will return a boolean as a result.

![blockly-quantity-comparison](../images/blockly/blockly-quantity-comparison.png)

The following shows how it can be used in an if-statement:

![blockly-quantity-comparison-if](../images/blockly/blockly-quantity-comparison-if.png)

### Quantity Conversion

_Function:_ The block provides the conversion from one quantity to another.

![blockly-quantity-conversion](../images/blockly/blockly-quantity-conversion.png)

The result of that operation would be 0.01 kW.

## Return to Blockly Reference

[return to Blockly Reference](index.html#items-and-things)
