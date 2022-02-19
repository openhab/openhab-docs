---
layout: documentation
title: Rules Blockly - openHAB Extensions to the Standard
---

# openHAB Extensions to the Standard

[return to Blockly Reference](index.html#openhab-extensions-to-the-standard)

## Introduction

This section explains only the blocks that have been added to the standard blocks by openHAB

{::options toc_levels="2..4"/}

- TOC
{:toc}

{: #blockly-standard-extension-overview}

## Colors

The Colors section simplifies the selection of  Color Values.
Technically these color RGB values are provided as a hexadecimal combination of the three values for red, green and blue (hence RGB).
Each of the individual colors can range from 0 - 255 or 0-FF (hexadecimal).
A color of r=255, g=255, b=255 would therefore result into #ffffff preceded by a # which identifies it as a hexadecimal number.

![colors-overview](../images/blockly/blockly-colors-overview.png)

Note that typically RGB values are not used within openHAB for color states but instead the Color-Type expects a HSB Type.
See the special hsb-conversion block below.

### Color Picker

![color-picker](../images/blockly/blockly-colors-picker.png)

*Function:* Lets the user pick from a (limited) set of colors and returns a the hexadecimal number (in the above case the value = #33cc00.

### Random Color

![get-random-color](../images/blockly/blockly-colors-random.png)

*Function:* Returns a random color as a hexcode

### Create RGB color

![create-rgb-color](../images/blockly/blockly-color-create-rgb.png)

*Function:* Returns a color by mixing the given values in a range from 0 - 255 for reg, green and blue as a hexcode

### Blend two colors

![blend-two-colors](../images/blockly/blockly-colors-blend.png)

*Function:* Blends two colors chosen via a color picker into one color by the given ratio.

Tip: this could be used for example with a loop that changes the ratio from 0 to 1 to blend the first color into a second

### Create HSB-color from RGB color (openHAB)

![get-hsb-of](../images/blockly/blockly-colors-hsbof.png)

HSB stands for hue-saturation-brightness which is a different way of describing a color.
An RGB color can therefore be converted equally into an HSB-color.

*Function:* This a special openHAB block that converts a hexadecimal color code from one of the above blocks into a String that is required when sending a color command to any item that accepts a color.

- use that block and connect one of the above blocks into that one to be able to retrieve the HSB value of that block.

HSB stands for hue-saturation-brightness which is a different way of describing a color.
An RGB color can therefore be converted equally into an HSB-color.

*Function:* This a special openHAB block that converts a hexadecimal color code from one of the above blocks into a String that is required when sending a color command to any item that accepts a color.

- use that block and connect one of the above blocks into that one to be able to retrieve the HSB value of that block.

**Example:**

![get-hsb-of-example](../images/blockly/blockly-colors-hsbof-example.png)

## Lists

![lists-overview](../images/blockly/blockly-lists-dictionary-overview.png)

### Dictionary for managing key / value pairs

The dictionary is a holder for key value pairs that can be passed along as one.
Add or remove new key value pairs by clicking on the cog icon to open the popup of the dictionary block (finally click on the cog again to close the popup).
Then drag the key block on the upper left into the key/value bracket on the right like depicted below:

![dictionary](../images/blockly/blockly-lists-dictionary.png)

Rename the keys as required and then add any value block type to the related key:

Example:

![dictionary-example](../images/blockly/blockly-lists-dictionary-example.png)

### get value of key from dictionary

![dictionary-getkey](../images/blockly/blockly-lists-dictionary-getkey.png)

*Function:* Retrieves the value of the key in the given directory

Example:

![dictionary-getkey-example](../images/blockly/blockly-lists-dictionary-getkey-example.png)

## Return to Blockly Reference

[return to Blockly Reference](index.html#openhab-extensions-to-the-standard)
