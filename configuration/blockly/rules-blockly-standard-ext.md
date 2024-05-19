---
layout: documentation
title: Rules Blockly - openHAB Extensions to the Standard
---
<!-- markdownlint-disable MD036 -->

# openHAB Extensions to the Standard

[return to Blockly Reference](index.html#openhab-extensions-to-the-standard)

## Introduction

This section explains only the blocks that have been added to the standard blocks by openHAB


## Logic

One of the most commonly used standard blocks are conditions blocks.
More about conditions can be viewed at ![youtube](../images/blockly/youtube-logo-small.png) [How to use IF and ELSE](https://youtu.be/hSRfooBKn9A?t=445).

A specific block that was added by openHAB is the **UNDEFINED**-Block which allows better comparison of undefined values.

Here is an example on how to use it:

![quantity-math-operations](../images/blockly/blockly-logic-undefined.png)

## Math

The Math section mainly consists of standard Blockly blocks.
Two new math blocks were added for bitwise operations:

### Quantity Type support

Blockly allows to use Quantity types to do its math operations.
This means that Quantity States can directly be used as an input for math operation blocks.

Here are some examples for math operations with unit-accompanied values:

![quantity-math-operations](../images/blockly/blockly-math-quantity-operations.png)

Note that there is a special case on min/max if the inputs are not of equal type.
In this case an error will be shown to the user:

![quantity-math-operations](../images/blockly/blockly-math-quantity-operations-failure.png)

### Bitwise operators

_Function:_ The block allows to compute the following operations with two quantities:

- bitwise and &
- bitwise or |
- bitwise xor ^
- bitwise left shift <<
- bitwise right shift >>
- bitwise unary right shift >>>

![blockly-bitwise-operators](../images/blockly/blockly-bitwise-operators.png)

### Bitwise invert

_Function:_ The bitwise NOT (~) operator inverts the bits of its operand.

![blockly-bitwise-not.png](../images/blockly/blockly-bitwise-not.png)

### Rounding

The standard block has been extended to provide a rounding function with the ability to set the number of decimal places:

![math-round](../images/blockly/blockly-math-round.png)

### Parse Number

This blocks takes a String floating point number representation and converts it into a Number type block.

![blockly-math-parse-number.png](../images/blockly/blockly-math-parse-number.png)

## Text

The Text section is the general section that allows text or string manipulation

More about that topic can be viewed at ![youtube](../images/blockly/youtube-logo-small.png) [Working with Text-Blocks](https://youtu.be/EdllUlJ7p6k?t=975).

### CRLF

CRLF stands for carriage-return / line-feed which is a technical term for adding a new line in a string

![crlf](../images/blockly/blockly-text-overview.png)

_Function:_ return a newline character to be added to a string.

**Example:**

![crlf](../images/blockly/blockly-text-crlf-example.png)

### Text Replace

![text-replace](../images/blockly/blockly-text-replace.png)

_Function:_ Allows to replace something that is defined by the _pattern_ in the _origin_-text with what is provided in _replacement_.
Note that the pattern can be just a text or also regex expression.

**Example:**

![text-replace example](../images/blockly/blockly-text-replace-example.png)

## Colors

More about that topic can be viewed at ![youtube](../images/blockly/youtube-logo-small.png) [Using Color-Blocks and HSB-Conversion](https://youtu.be/EdllUlJ7p6k?t=1366)

The Colors section simplifies the selection of  Color Values.
Technically these color RGB values are provided as a hexadecimal combination of the three values for red, green and blue (hence RGB).
Each of the individual colors can range from 0 - 255 or 0-FF (hexadecimal).
A color of r=255, g=255, b=255 would therefore result into #ffffff preceded by a # which identifies it as a hexadecimal number.

![colors-overview](../images/blockly/blockly-colors-overview.png)

Note that typically RGB values are not used within openHAB for color states but instead the Color-Type expects a HSB Type.
See the special hsb-conversion block below.

Blockly supports the following use cases:

- pick a color to return the value as an RGB type
- chose a random color as RGB type
- define an RGB color based on red, green and blue.
- blend two colors with a ratio - this block can be used to dynamically transition from one color to the other by applying the ratio as a computed value in a rule.
- calculate the HSB value of the RGB value
- get hue, saturation or brightness from a HSB Type Color Status of an Item

### Color Picker

![color-picker](../images/blockly/blockly-colors-picker.png)

_Function:_ Lets the user pick from a (limited) set of colors and returns a the hexadecimal number (in the above case the value = #33cc00.

### Random Color

![get-random-color](../images/blockly/blockly-colors-random.png)

_Function:_ Returns a random color as a hexcode

### Create RGB color

![create-rgb-color](../images/blockly/blockly-color-create-rgb.png)

_Function:_ Returns a color by mixing the given values in a range from 0 - 255 for reg, green and blue as a hexcode

### Blend two colors

![blend-two-colors](../images/blockly/blockly-colors-blend.png)

_Function:_ Blends two colors chosen via a color picker into one color by the given ratio.

:::tip

this could be used for example with a loop that changes the ratio from 0 to 1 to blend the first color into a second

:::

### Create HSB-color from RGB color (openHAB)

![get-hsb-of](../images/blockly/blockly-colors-hsbof.png)

HSB stands for hue-saturation-brightness which is a different way of describing a color.
An RGB color can therefore be converted equally into an HSB-color.

_Function:_ This a special openHAB block that converts a hexadecimal color code from one of the above blocks into a String that is required when sending a color command to any item that accepts a color.

- use that block and connect one of the above blocks into that one to be able to retrieve the HSB value of that block.

HSB stands for hue-saturation-brightness which is a different way of describing a color.
An RGB color can therefore be converted equally into an HSB-color.

_Function:_ This a special openHAB block that converts a hexadecimal color code from one of the above blocks into a String that is required when sending a color command to any item that accepts a color.

- use that block and connect one of the above blocks into that one to be able to retrieve the HSB value of that block.

Example

![get-hsb-of-example](../images/blockly/blockly-colors-hsbof-example.png)

### Retrieve indidivual HSB values from an Item state

This block allows to retrieve the individual values of an Item’s HSB color state by returning

- Hue,
- Saturation,
- or Brightness

![blockly-colors-hsb.png](../images/blockly/blockly-colors-hsb.png)

## Lists

![lists-overview](../images/blockly/blockly-lists-dictionary-overview.png)
![lists-overview-concat](../images/blockly/blockly-lists-concatenate.png)

![blockly-map-for-each](../images/blockly/blockly-map-for-each.png)

### Dictionary for managing key / value pairs

The dictionary is a holder for key value pairs that can be passed along as one.
Add or remove new key value pairs by clicking on the cog icon to open the popup of the dictionary block (finally click on the cog again to close the popup).
Then drag the key block on the upper left into the key/value bracket on the right like depicted below:

![dictionary](../images/blockly/blockly-lists-dictionary.png)

Rename the keys as required and then add any value block type to the related key:

**Example:**

![dictionary-example](../images/blockly/blockly-lists-dictionary-example.png)

### get value of key from dictionary

![dictionary-getkey](../images/blockly/blockly-lists-dictionary-getkey.png)

_Function:_ Retrieves the value of the key in the given directory

**Example:**

![dictionary-getkey-example](../images/blockly/blockly-lists-dictionary-getkey-example.png)

### Loop over a dictionary

This block can be found in the Loops section and is a dedicated block that allows to iterate over the elements of a dictionary.
The loop provides the value into the variable that was choosen in the drop down.
See the examples below how the loop can be used.

![map-for-each](../images/blockly/blockly-map-for-each.png)

Either the dictionary itself can be provided directly or via a variable.

![dictionary-foreach-example](../images/blockly/blockly-map-foreach-example.png)

### Concatenate lists

![lists-overview-concat](../images/blockly/blockly-lists-concatenate.png)

_Function:_ adds the second list to the first list and returns a new list

Example:

![lists-overview-concat](../images/blockly/blockly-lists-concatenate-example.png)

## Loops

Even though there a no specialized openHAB blocks provided, loops are used rather often.
Therefore there is a good introduction to loops available which can be viewed at ![youtube](../images/blockly/youtube-logo-small.png) [Loops in Blockly](https://youtu.be/EdllUlJ7p6k?t=1947)

## Functions

A more advanced feature for reusable blockly code is _functions_.
More about that topic can be viewed at ![youtube](../images/blockly/youtube-logo-small.png) [Functions](https://youtu.be/hSRfooBKn9A?t=60) and [Parameters](https://youtu.be/hSRfooBKn9A?t=170).

## Return to Blockly Reference

[return to Blockly Reference](index.html#openhab-extensions-to-the-standard)
