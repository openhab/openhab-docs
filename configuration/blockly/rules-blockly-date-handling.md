---
layout: documentation
title: Rules Blockly - Date Handling
---
<!-- markdownlint-disable MD036 -->

# Date Handling

[return to Blockly Reference](index.html#date-handling)

## Introduction

Date blocks are used as input parameters for other blocks.
At the moment some of these blocks are found in the ephemeris section, whilst others are found in the persistence section - they may be equally useful for both.
These blocks are *typed* to assure correct connection to other blocks.

{::options toc_levels="2..4"/}

- TOC
{:toc}

{: #blockly-date-handling-overview}

## Overview of the Date Handling blocks

**Blocks in the ephemeris section**

![ephemeris-dates](../images/blockly/blockly-date-handling-ephemeris.png)

**Blocks in the persistence section**

![persistence-dates](../images/blockly/blockly-date-handling-persistence.png)

## Date Handling Blocks

### today

![today](../images/blockly/blockly-date-today.png)

Type: *DayOffset*

Ephemeris blocks expect a date formatted as the number of days since today.
As a result, this block returns 0.

### today +/- x days

![now-plus-minus-offset](../images/blockly/blockly-date-plus.png)

Type: *DayOffset*

Returns the number of days since today, as configured in the number block.
The number can be positive (offset into the future) or negative (offset into the past).

### date-picker

![date-picker](../images/blockly/blockly-date-picker.png)

Type: *ZonedDateTime*

Returns a date as *ZonedDateTime*.
The date can be selected from a date picker.
The time is set to `00:00:00`.

### Get date

![get-date](../images/blockly/blockly-date-get.png)

Type: *ZonedDateTime*

This block will return the date as *ZonedDateTime* based on a given String.
The String may be one of the following formats

- yyyy-MM-dd
- yyyy-MM-dd HH:mm:ss
- yyyy-MM-dd HH:mm:ss +HH:mm

The input String  may be a variable-block.

### Get Date now with offset

![now-with-offset](../images/blockly/blockly-get-now-offset.png)

Type: *ZonedDateTime*

Returns a date as *ZonedDateTime* with offset relative to the current date *and* time.

The options for the time period base are

- seconds
- minutes
- hours
- days
- months
- years

### Get String representation of date

![date-tostring](../images/blockly/blockly-get-date-string.png)

Type: *String*

Returns the String representation of a given *ZonedDateTime*-block, with or without the time.

### Example

Assuming this block is run at `20:47:36` on `31/01/2022`

![date-text-example](../images/blockly/blockly-date-text-example.png)

The output in the log will be.

```text
2022-01-31
2022-01-31 00:00:00
2022-01-31 20:47:36
```

## Return to Blockly Reference

[return to Blockly Reference](index.html#date-handling)
