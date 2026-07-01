---
layout: documentation
title: Standard Conditions
---

# Standard Conditions

This page describes the standard conditions for [rules](./rules.md).

OpenHAB comes with a set of standard conditions.
These are built-in mechanisms that decide if a rule should be executed when triggered.

## Conditions Structure

The standard conditions are fundamentally Java classes that implement the required logic.
We identify these conditions using a code called the condition type.
These codes are used as titles for the sections below.
To tell the condition implementation what to evaluate, conditions can have configuration parameters with predefined names.
These configuration parameters and a brief description of what values they expect are listed in the following sections.

### `ephemeris.DaysetCondition`

This condition checks if the current day is in the configured `dayset`.

| Parameter  | Description                                                                             |
|------------|-----------------------------------------------------------------------------------------|
| `dayset`   | The name of a `dayset` from the ephemeris settings.                                     |
| `[offset]` | The number of days to add to or subtract from the current day (values can be negative). |

### `ephemeris.WeekdayCondition`

This condition verifies that the current day is a weekday.

| Parameter  | Description                                                                             |
|------------|-----------------------------------------------------------------------------------------|
| `[offset]` | The number of days to add to or subtract from the current day (values can be negative). |

### `ephemeris.WeekendCondition`

This condition verifies that the current day is in a weekend.

| Parameter  | Description                                                                             |
|------------|-----------------------------------------------------------------------------------------|
| `[offset]` | The number of days to add to or subtract from the current day (values can be negative). |

### `ephemeris.HolidayCondition`

This condition verifies that the current day is a holiday.

| Parameter  | Description                                                                             |
|------------|-----------------------------------------------------------------------------------------|
| `[offset]` | The number of days to add to or subtract from the current day (values can be negative). |

### `ephemeris.NotHolidayCondition`

This condition verifies that the current day isn't a holiday.

| Parameter  | Description                                                                             |
|------------|-----------------------------------------------------------------------------------------|
| `[offset]` | The number of days to add to or subtract from the current day (values can be negative). |

### `timer.DayOfWeekCondition`

This condition checks the current day of the week against a specified list of days.

| Parameter | Description                                                                                                                             |
|-----------|-----------------------------------------------------------------------------------------------------------------------------------------|
| `days`    | A set of days to check against. The days are specified with the following strings: `MON`, `TUE`, `WED`, `THU`, `FRI`, `SAT`, and `SUN`. |

### `timer.IntervalCondition`

This condition verifies that a minimum interval has elapsed since the last time the condition was met.

| Parameter     | Description                                                             |
|---------------|-------------------------------------------------------------------------|
| `minInterval` | The minimum number of milliseconds since the last satisfied evaluation. |

### `core.ItemStateCondition`

This condition verifies that the `State` of the specified `Item` fulfills the requirements.

| Parameter     | Description                                                             |
|---------------|-------------------------------------------------------------------------|
| `itemName`    | The name of the `Item`.                                                 |
| `operator`    | The evaluation operator, one of `=`, `!=`, `<`, `<=`, `>`, and `>=`.    |
| `state`       | The `State` to compare with.                                            |

### `script.ScriptCondition`

This condition verifies that the provided script returns `true`.

| Parameter | Description                                                             |
|-----------|-------------------------------------------------------------------------|
| `type`    | The code/MIME-type for the scripting language.                          |
| `script`  | The script content in the specified scripting language.                 |

### `core.ThingStatusCondition`

This condition verifies that the status of the specified `Thing` fulfills the requirements.

| Parameter  | Description                                                             |
|------------|-------------------------------------------------------------------------|
| `thingUID` | The UID of the `Thing`.                                                 |
| `operator` | The evaluation operator, either `=` or `!=`.                            |
| `status`   | The status to compare with.                                             |

### `core.TimeOfDayCondition`

This condition verifies that the clock is within the specified time window.

| Parameter   | Description                                                              |
|-------------|--------------------------------------------------------------------------|
| `startTime` | The start of the time window.                                            |
| `endTime`   | The end of the time window.                                              |
