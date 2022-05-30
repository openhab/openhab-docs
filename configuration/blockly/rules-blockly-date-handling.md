---
layout: documentation
title: Rules Blockly - Date Handling
---
<!-- markdownlint-disable MD036 -->

# Date Handling

[return to Blockly Reference](index.html#date-handling)

## Introduction

Date blocks are used as input parameters for other blocks or can be used to create or compare date.
With 3.3.0M6 many blocks were introduced to allow complex tasks with dates

{::options toc_levels="2..4"/}

- TOC
{:toc}

{: #blockly-date-handling-overview}

## Overview of the Date Handling blocks

![dates1](../images/blockly/blockly-date-handling1.png)

![dates2](../images/blockly/blockly-date-handling2.png)

Note: There is *no need* for a special block to set a datetime of an openHAB item.
This can be directly done via the ["send command" / "post command" block](rules-blockly-items-things.html#send-command)

## Date Handling Blocks

### Help

![help](../images/blockly/blockly-date-help.png)

Type: Link to openHAB documentation

This button serves as a link to this documention page

### Get Datetime now

![now-with-offset](../images/blockly/blockly-date-get-now.png)

Type: *ZonedDateTime*

Obtains the current datetime from the system clock in the default timezone as *ZonedDateTime*

### Get Datetime now with offset

![now-with-offset](../images/blockly/blockly-get-now-offset.png)

Type: *ZonedDateTime*

Obtains the current datetime as *ZonedDateTime* with an offset relative to the current date *and* time.

The options for the time period base are

- seconds
- minutes
- hours
- days
- months
- years

### Date-picker

![date-picker](../images/blockly/blockly-date-picker.png)

Type: *ZonedDateTime*

Returns a date as *ZonedDateTime*.
The date can be selected from a date picker.
The time is set to `00:00:00`.

### Get date

![get-date](../images/blockly/blockly-date-get.png)

Type: *ZonedDateTime*

This block will return the date as *ZonedDateTime* based on the given String.
The String may be one of the following formats (since 3.3.0M6 the following formats are supported)

- yyyy-MM-dd
- yyyy-MM-dd HH:mm
- yyyy-MM-dd HH:mm:ss
- yyyy-MM-dd HH:mm:ss +HH:mm
- yyyy-MM-dd HH:mm:ss.SSS
- yyyy-MM-dd HH:mm:ss.SSSSS
- yyyy-MM-dd HH:mm:ss.SSS+HH:mm
- yyyy-MM-dd HH:mm:ss.SSSSSS+HH:mm  (local date time standard output)
- yyyy-MM-dd HH:mm:ss.SS+HHmm (OH standard output format)

The input String may also be provided via variable-block or a date from an item state.
In case parts of the date are not provided due to shorter pattern, the others are set to 0

Tip: if you want to create a datetime with your time zone use the "copy of"-block and overwrite its values

### Datetime with date and time values

![today](../images/blockly/blockly-datetime-with-values.png)

Type: *ZonedDateTime*

Creates a ZonedDateTime by providing all necessary six values

- year of day
- month of day
- day
- hour of time
- minute of time
- second of time

Tip: if you want to create a datetime with your time zone use the "copy of"-block and overwrite its values

### Create Datetime based on a specific date ("Copy Of")

since 3.3.0M6

![date-copy-of-overview](../images/blockly/blockly-date-copy-of-overview.png)

Type: *ZonedDateTime*

This block allows to create a new ZonedDateTime based on a given ZonedDateTime and then either

- overwrites
- adds
- or subtracts

parts (so called temporals) of that datetime:

![date-copy-of-temporal1](../images/blockly/blockly-temporal1.png)![date-copy-of-temporal2](../images/blockly/blockly-temporal2.png)

It is therefore a bit more complex block which is on the other hand very flexible to use.
It consists of the main "copy of"-block and the other two temporal-Blocks that can be added.

The following short video explains how the block can be used

![date-copy-of-tutorial](../images/blockly/blockly-copy-of-tutorial.gif "Copy of Tutorial")

- first drag the main copyOf-Block to the workspace
- choose the datetime you want to base your *new* datetime on and drag it into the position (in the above video the now block is used)
- select if you want to set (overwrite), add or subtract values via the dropdown
- open the settings icon and drag as many "temporal units" into the block as you want to modify later, which will create the "holes" into which you can apply the temporal blocks
- now drag one of the temporal blocks (see description below) in each of these blocks.
Note that these can be mixed
- Select the temporal unit by clicking on the arrow of that blocks which allows you to choose from one of the following
  - year
  - month
  - day
  - hour
  - minute
  - second
  - milli
  - micro
  - nano
  - day of year
- Modify the values of the temporal unit blocks

**The two different temporal unit blocks**

![date-copy-of-temporal1](../images/blockly/blockly-temporal1.png)![date-copy-of-temporal2](../images/blockly/blockly-temporal2.png)

There are two different blocks that can be dragged into the main block which have both advantages and disadvantages.

**The dense and simple temporal block**

![date-copy-of-temporal1](../images/blockly/blockly-temporal1.png)

This is the more dense block which is very suitable to create a "lightweight" block itself like so:

![date-copy-of-temporal11](../images/blockly/blockly-date-temporal1-example1.png)

You can achieve the exact same result with the following but it looks more bulky and bit more complicated:

![date-copy-of-temporal21](../images/blockly/blockly-date-temporal2-example1.png)

**The bulky but powerful temporal block**

![date-copy-of-temporal2](../images/blockly/blockly-temporal2.png)

This block also provides a temporal value to the main block but it contains an additional indirection for the value of the temporal block.
While the first block only takes a constant, this block allows and even requires the value to be provided by another block which in the standard case is a number block.

Using just the number would be the same like providing a constant value but instead, any number-returning block can be used, hence any math operation can be applied like depicted inte following image:

![date-copy-of-temporal22](../images/blockly/blockly-date-temporal2-example2.png)

The main power arrives when using variables, which allows to calculate values that should be applied to the datetime.

In the following two values are retrieved from items, added and assigned to a variable.
This variable is then used as the value to amend the lastUpdatedTime of an item which is posted to the target item to be processed.

![date-copy-of-temporal22](../images/blockly/blockly-date-temporal2-example3.png)

### Datetime from item

since 3.3.0M6

![datetime-from-item](../images/blockly/blockly-datetime-from-item.png)

Type: *ZonedDateTime*

This is a convenience block that retrieves the state of an item (at best of item type datetime) which is then automatically converted to a ZonedDateTime, so it can be easily used as shown in the following example:

![datetime-item-example](../images/blockly/blockly-datetime-from-item-example.png)

### Get String representation of date ("text of")

![date-tostring](../images/blockly/blockly-get-date-string.png)

Type: *String*

Returns the String representation of a given *ZonedDateTime*-block, with or without the time.

since 3.3.0M6: also returns the same datetime format that is used by openHAB itself

**Example**

Assuming this block is run at `20:47:36` on `31/01/2022`

![date-text-example](../images/blockly/blockly-date-text-example.png)

The output in the log will be.

```text
2022-01-31
2022-01-31 00:00:00
2022-01-31 20:47:36
```

### Date Comparison

since 3.3.0M6

![date-comparison](../images/blockly/blockly-date-comparison.png)

Checks if the instant of the first ZonedDateTime is before, after or equal to the second ZonedDateTime.
In the third drop-down list, the accuracy on which the comparison is based can be selected.

Type: *boolean*

Returns true/false based on the comparison

### Date Comparison Between

since 3.3.0M6

![date-comparison-between](../images/blockly/blockly-date-comparison-between.png)

Check if the instant of the first datetime is between the two other datetimes.
The drop-down decides if all components, date only or time only should be used for the comparison.

Type: *boolean*

Returns true/false based on the comparison

### Get part of datetime

since 3.3.0M6

![date-getpartof](../images/blockly/blockly-date-unit-of.png)

Type: *Number*

Returns the selected part of the datetime as a number.

### Get difference between datetimes

since 3.3.0M6

![date-getdifference](../images/blockly/blockly-date-difference.png)

Calculates the amount of time between two datetimes.
The result will be negative if the second object is before the first one.

Type: *Number*

Returns the difference between the two datetimes.

---

### today (ephemeris block)

![today](../images/blockly/blockly-date-today.png)

Type: *DayOffset*

Ephemeris blocks expect a date formatted as the number of days since today.
As a result, this block always returns 0.
Used for Emphemeris blocks only.

### today +/- x days (ephemeris block)

![now-plus-minus-offset](../images/blockly/blockly-date-plus.png)

Type: *DayOffset*

Returns the number of days since today, as configured in the number block.
The number can be positive (offset into the future) or negative (offset into the past).
Used for Emphemeris blocks only.

## Return to Blockly Reference

[return to Blockly Reference](index.html#date-handling)
