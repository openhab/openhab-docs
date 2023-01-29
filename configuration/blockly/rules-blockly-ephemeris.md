---
layout: documentation
title: Rules Blockly - Ephemeris
---
<!-- markdownlint-disable MD036 -->

# Ephemeris

[return to Blockly Reference](index.html#ephemeris)

## Introduction

The ephemeris category provides blocks with calendar functionality.
The blocks can be used to determine what type of day today is, or a number of days before or after today is.
For example, a way to determine if today is a weekend, a bank holiday, someone’s birthday, trash day, etc.

Definition of holidays can be customized through the _ephemeris.cfg_ file.
See the [Ephemeris configuration page](https://www.openhab.org/docs/configuration/actions.html#configuration) for more information.

[[toc]]

## Overview of the Ephemeris blocks

![ephemeris-dates](../images/blockly/blockly-ephemeris.png)

## Ephemeris Blocks

More about that topic can be viewed at ![youtube](../images/blockly/youtube-logo-small.png) [Using Ephemeris information](https://youtu.be/KwhYKy1_qVk?t=1275)

### Holiday, weekend or weekday check

![ephemeris-is](../images/blockly/blockly-ephemeris-is.png)

_Function:_ this block checks if the given date is a holiday, weekday or weekend.

Type: _boolean_ `true` or `false`

**Examples**

![ephemeris-is-example](../images/blockly/blockly-ephemeris-is-example.png)

### Get the holiday name for a particular date

![ephemeris-get-name](../images/blockly/blockly-ephemeris-get-name.png)

_Function:_ Returns the holiday name for the given date.
Will return `null` if no holiday is found for the date.

Type: _String_

### Get the number of days until a specific holiday

![ephemeris-days-until](../images/blockly/blockly-ephemeris-days-until.png)

Function: Return the number of days until the given holiday name, or `-1` if the holiday is not found.

Type: number

Some holidays are already provided by default from openHAB.
Additional holidays must be configured in _ephemeris.cfg_.

## Return to Blockly Reference

[return to Blockly Reference](index.html#ephemeris)
