---
layout: documentation
title: Persistence
---

# Persistence

openHAB can store data over time; this is known as persistence.
The data may be retrieved at a later time, for example to restore your system after startup, or to prepare graphs for display on a UI.

openHAB ships with the [rrd4j persistence service](addons/persistence/rrd4j/) installed by default, which persists every Item on every state change and at least once a minute. Additionally, it restores the last stored value at system startup. To change this behaviour see [Persistence Configuration](#persistence-configuration).

openHAB persists Item states in a database, and most popular databases are supported.
You may have more than one persistence add-on loaded, and each of these may be configured independently.

A complete list of supported persistence add-ons may be found in the [persistence](/addons/#persistence) section of the on-line openHAB documentation.

Please refer to the [available persistence service add-on](/addons/#persistence) documentation for your selected persistence add-on for configuration instructions.

## Default Persistence Service

You should configure a default persistence service even if you have only one persistence add-on installed.
The default persistence service is used to provide data for the UI charting features and rules (you may choose to use another persistence service in either of these, configured on a case-by-case basis).

To select a default persistence service via UI, refer to the [Main UI docs]({{base}}/mainui/settings/persistence.html).

## Persistence Configuration

The information below allows you to determine which Item states are persisted, when they are persisted, and where they are stored.

Persistence Strategies are configured:

- in a file named `<persistenceservice>.persist` (fill-in your persistence add-on name, e.g. `rrd4j.persist`), stored in `$OPENHAB_CONF/persistence`.
- from the UI, refer to the [Main UI docs]({{base}}/mainui/settings/persistence.html).

As usual, it is possible to combine both types of configuration, i.e. use the UI for one and a file for another persistence service.
It is not possible to configure the same persistence service via UI and file.

### Persistence Triggers

The persistence of an Item's state may be triggered when that Item changes state or when the Item is updated (even if its state did not change).
Persistence may also be triggered by a time-related event (see Cron Persistence Triggers below).

### Strategies

This section allows you to name and define one or more `Strategies`.
The syntax is as follows:

```java
Strategies {
  <strategyName1> : "cronexpression1"
  <strategyName2> : "cronexpression2"
  ...
}
```

#### Predefined Strategies

The following strategies are defined internally and may be used in place of `strategyName` above:

- `everyChange`: persist the Item state whenever its state has changed
- `everyUpdate`: persist the Item state whenever its state has been updated, even if it did not change
- `restoreOnStartup`: load and initialize the last persisted state of the Item on openHAB startup (if the Item state is undefined (`UNDEF`)).
- `forecast`: check for persisted states with timestamps in the future and restore these states at the given time

It is recommended to use different items for forecasted (i.e. future) values and historic data.
As a result mixing `forecast` strategy with other strategies is not recommended (except `restoreOnStartup`).

#### Cron Persistence Triggers

openHAB uses [Quartz](https://www.quartz-scheduler.org/documentation) for time-related cron events.
See the [Rules article]({{base}}/configuration/rules-dsl.html#time-based-triggers) for more information.

### Filters

This (optional) section allows you to name and define one or more `Filters`.
The syntax is as follows:

```java
Filters {
  <filterName1> : <filter definition>
  <filterName2> : <filter definition>
  ...
}
```

Each filter definition starts with a unique identifier that identifies the filter type.

#### Equals Filter `=` / Not Equals Filter (`!`)

The equals (not equals) filter allows to persist only a given set of values (or exclude them).
It can be used with every item type.
The values need to be exactly the string representation of the state.
One or more values can be given, separated by a comma `,`.

```java
Filters {
  exactlySomeState : = "ARMED", "UNARMED"
  notTheseStates : ! "UNDEF", "NULL"
}
```

#### Threshold Filter (`>`)

The threshold filter allows to discard values that are close to the last persisted value.
It can only be used with `Number` items and has two modes: "relative" and "absolute".

In "relative" mode the threshold is calculated as percentage of the last persisted value.
This mode is selected by a `%` character and a decimal value (e.g. `> % 10` for "at least 10% deviation").

In "absolute" mode the threshold is calculated by absolute difference to the last persisted value.
This mode is selected by a decimal value with optional unit (e.g. `> 5 mA` for "at least 5 mA deviation").
For plain `Number` items the unit can be omitted.

```java
Filters {
  fiveMilliAmps : > 5 mA
  tenPercent : > % 10
}
```

#### Include Filter (`[]`) / Exclude Filter (`][`)

The include (exclude) filter allows to define a range for accepted (rejected) values.
It can only be used with `Number` items.

The range is defined by to decimal values.
The boundaries are always considered to be part (not part) of the defined range (i.e. a lower boundary of `5` considers a value of `5` to be inside the range for an include filter and outside of the range for exclude filters).
In case of dimensional items (e.g `Number:Temperature`) a unit MUST be provided.

```java
Filters {
  fromFiveToTenKelvin : [] 5 10 K
  notBetweenSevenAndNine : ][ 7 9
}
```

#### Time Filter (`T`)

The time filter allows to discard values that arrive within the given time after a previous value (e.g. when using the `everyUpdate` strategy).
It can be used with every item type.
The filter definition consists of an integer value followed by a unit.
The allowed units are `s` (seconds), `m` (minutes), `h` hours and `d` days.
Composed values (`1 m 30 s`) are not possible and need to be expressed by a single value (`90 s`).

```java
Filters {
  thirtySeconds : T 30 s
}
```

### Items

This section defines which items should be persisted with which strategy and filters.
The syntax is as follows:

```java
Items {
    <itemlist1> [-> "<alias1>"] : [strategy = <strategy1>, <strategy2>, ...] [filter = <filter1>, <filter2>, ...]
    <itemlist2> [-> "<alias2>"] : [strategy = <strategyX>, <strategyY>, ...]
    ...

}
```

where `<itemlist>` is a comma-separated list consisting of one or more of the following options:

- `*` - this line should apply to all items in the system
- `<itemName>` a single Item identified by its name. This Item can be a group Item.  But note that only the group value will be persisted.  The value of the individual group members will not be persisted using this option.
- `<groupName>*` - all members of this group will be persisted, but not the group itself.
  Optionally, an alias may be provided if the persistence service requires special names (e.g. a table to be used in a database, a feed id for an IoT service, etc.)
  Note that `*` is NOT a wildcard match character in this context.

The entries are additive.
This means if one Item appears in more than one `<itemlist>` either directly or indirectly (e.g. `*` which includes all Items or as a member of a Group used in `<groupName>*`), all the strategies strategies listed on all those lines apply to that Item.

Below you will find a complete example persistence configuration file:

```java
// persistence strategies have a name and definition and are referred to in the "Items" section
Strategies {
        everyHour : "0 0 * * * ?"
        everyDay  : "0 0 0 * * ?"
}

Filters {
        fivepercent : > % 5
        atMostOnceAMinute : T 1 m
  }
/*
 * Each line in this section defines for which Item(s) which strategy(ies) should be applied.
 * You can list single items, use "*" for all items or "groupitem*" for all members of a group
 * Item (excl. the group Item itself).
 */
Items {
        // persist the Item state of Heating_Mode and Notifications_Active on every change and restore them from the db at startup
        Heating_Mode, Notifications_Active: strategy = everyChange, restoreOnStartup

        // additionally, persist all temperature and weather values every hour
        Temperature*, Weather* : strategy = everyHour
}
```

## Restoring Item States on Restart

When restarting your openHAB installation you may find there are times when your logs indicate some Items have the state `NULL`.
This is because, by default, Item states are not persisted when openHAB restarts - even if you have installed a persistence add-on.
In order for items to be persisted across openHAB restarts, you must define a `restoreOnStartup` strategy for your items.
Then whatever state they were in before the restart will be restored automatically.
The following example persists two items on every change and restores them at startup:

```java
Strategies {
        everyHour : "0 0 * * * ?"
        everyDay  : "0 0 0 * * ?"
}

Items {
  item1, item2 : strategy = everyChange, restoreOnStartup
}
```

It is usually not necessary to restore all Items since there is a good chance that they are no longer accurate (switches may have been toggled, sensor values are likely to have changed), and the restoration may result in unwanted rule actions.

## Persistence Extensions in Scripts and Rules

To make use of persisted states inside scripts and rules, a few useful extensions have been defined on items.
Note that these extensions are only available to be applied to Items.
They are not generally available for use in Scripts or Rules.

Example:

The statement

`Temperature.historicState(now.minusDays(1))`

will return the state of the Item "Temperature" from 24 hours ago.
You can easily imagine that you can implement very powerful rules using this feature.

Here is the full list of available persistence extensions:

| Persistence Extension                                   | Description                                                                                                                                                                |
|---------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `<item>.persist`                                        | Persists the current State of the Item                                                                                                                                     |
| `<item>.lastUpdate`                                     | Returns the last timestamp a given Item was persisted                                                                                                                      |
| `<item>.historicState(ZonedDateTime)`                   | Retrieves the State of an Item at a certain point in time (returns HistoricItem)                                                                                           |
| `<item>.changedSince(ZonedDateTime)`                    | Checks if the State of the Item has (ever) changed since a certain point in time                                                                                           |
| `<item>.changedBetween(ZonedDateTime, ZonedDateTime)`   | Checks if the State of the Item has (ever) changed between certain points in time                                                                                          |
| `<item>.updatedSince(ZonedDateTime)`                    | Checks if the state of the Item has been updated since a certain point in time                                                                                             |
| `<item>.updatedBetween(ZonedDateTime, ZonedDateTime)`   | Checks if the state of the Item has been updated between certain points in time                                                                                            |
| `<item>.maximumSince(ZonedDateTime)`                    | Gets the maximum value of the State of a persisted Item since a certain point in time (returns HistoricItem)                                                               |
| `<item>.maximumBetween(ZonedDateTime, ZonedDateTime)`   | Gets the maximum value of the State of a persisted Item between certain points in time (returns HistoricItem)                                                              |
| `<item>.minimumSince(ZonedDateTime)`                    | Gets the minimum value of the State of a persisted Item since a certain point in time (returns HistoricItem)                                                               |
| `<item>.minimumBetween(ZonedDateTime, ZonedDateTime)`   | Gets the minimum value of the State of a persisted Item between certain points in time (returns HistoricItem)                                                              |
| `<item>.averageSince(ZonedDateTime)`                    | Gets the average value of the State of a persisted Item since a certain point in time. This method uses a time-weighted average calculation (see example below)            |
| `<item>.averageBetween(ZonedDateTime, ZonedDateTime)`   | Gets the average value of the State of a persisted Item betwen certain points in time. This method uses a time-weighted average calculation (see example below)            |
| `<item>.deltaSince(ZonedDateTime)`                      | Gets the difference in value of the State of a given Item since a certain point in time                                                                                    |
| `<item>.deltaBetween(ZonedDateTime, ZonedDateTime)`     | Gets the difference in value of the State of a given Item between certain points in time                                                                                   |
| `<item>.evolutionRate(ZonedDateTime)`                   | Gets the evolution rate of the state of a given Item since a certain point in time (returns DecimalType)                                                                   |
| `<item>.evolutionRate(ZonedDateTime, ZonedDateTime)`    | Gets the evolution rate of the state of a given Item between certain points in time (returns DecimalType)                                                                  |
| `<item>.deviationSince(ZonedDateTime)`                  | Gets the standard deviation of the state of the given Item since a certain point in time (returns DecimalType)                                                             |
| `<item>.deviationBetween(ZonedDateTime, ZonedDateTime)` | Gets the standard deviation of the state of the given Item between certain points in time (returns DecimalType)                                                            |
| `<item>.varianceSince(ZonedDateTime)`                   | Gets the variance of the state of the given Item since a certain point in time (returns DecimalType)                                                                       |
| `<item>.varianceBetween(ZonedDateTime, ZonedDateTime)`  | Gets the variance of the state of the given Item between certain point sin time (returns DecimalType)                                                                      |
| `<item>.previousState()`                                | Gets the previous State of a persisted Item (returns HistoricItem)                                                                                                         |
| `<item>.previousState(true)`                            | Gets the previous State of a persisted Item, skips Items with equal State values and searches the first Item with State not equal the current State (returns HistoricItem) |
| `<item>.sumSince(ZonedDateTime)`                        | Gets the sum of the previous States of a persisted Item since a certain point in time                                                                                      |
| `<item>.sumBetween(ZonedDateTime, ZonedDateTime)`       | Gets the sum of the previous States of a persisted Item between certain points in time                                                                                     |

These extensions use the [default persistence service](#default-persistence-service).
You may specify a different persistence service by appending a String as an optional additional parameter at the end of the extension.

### Examples

To persist an Item called `Lights` in an rrd4j database, you would enter the following:
`Lights.persist("rrd4j")`

To get the average temperature over the last 5 minutes from the Item called `Temperature` in the influxdb persistence service, you would use:
`Temperature.averageSince(now.minusMinutes(5), "influxdb")`

The most useful methods of the HistoricItem object returned by some queries, are `.state` and `.getTimestamp`

#### Time-weighted averages

Time-weighted averages take into consideration not only the numerical levels of a particular variable, but also the amount of time spent on it.
For instance, if you are measuring the temperature in a room - acknowledging the differences in the amounts of time until it changes.
A brief example:
18 °C for 13 hours a day, 21 °C for 7 hours a day, and 16.5 °C for 4 hours a day, you would obtain 18 °C x 13 h, 21 °C x 7 h and 16.5 °C x 4 h (234, 147, and 66, respectively).
Sum the values that you obtained.
In this case, 447 °C hours.
Add together the time weights to get the total weight.
In our example, the total weight is 13 h + 7 h + 4 h = 24 h.
Divide the value in Step 2 by the total weights in Step 3, to get an average of 447 °C hours / 24 h = 18.625 °C.

### Date and Time Extensions

A number of date and time calculations have been made available in openHAB through `ZonedDateTime`.
This makes it very easy to perform actions based upon time.
Here are some examples:

```java
Lights.changedSince(now.minusMinutes(2).minusSeconds(30))
Temperature.maximumSince(now.truncatedTo(ChronoUnit.DAYS))
Temperature.minimumSince(parse("2012-01-01"))
PowerMeter.historicState(now.truncatedTo(ChronoUnit.DAYS).withDayOfMonth(1))
```

The "now" variable can be used for relative time expressions, while "parse()" can define absolute dates and times.

## Startup Behavior

Persistence services and the Rule engine are started in parallel.
Because of this, it is possible that, during an openHAB startup, Rules will execute before Item states used by those Rules have been restored.
(In this case, those unrestored Items have an "undefined" state when the Rule is executed.)
Therefore, Rules that rely on persisted Item states may not work correctly on a consistent basis.

### Workaround 1

A workaround which helps in some cases is to create an Item e.g. "delayed_start" that is set to "OFF" at startup and to "ON" some time later (when it can be assumed that persistence has restored all items).
You can then write a Rule that restores Items from your persistence service after the delay has completed.
The time of the delay must be determined by experimentation.
How long you need to wait before changing your "delayed_start" Item from "OFF" to "ON" depends upon the size of your home automation project and the performance of your platform.

<!-- TODO: Need a code example for Workaround 1. -->

### Workaround 2

Create `$OPENHAB_CONF/rules/refresh.rules` with the following content (This rule runs only once when openHAB starts):

```sh
var boolean reloadOnce = true
rule "Refresh rules after persistence service has started"
  when System started
then
  if(reloadOnce)
    executeCommandLine("$OPENHAB_CONF/rules/rules_refresh.sh")
  else
    println("reloadOnce is false")
  reloadOnce = false
end
```

Create a refresh script `$OPENHAB_CONF/rules/rules_refresh.sh` and make it executable (`chmod +x $OPENHAB_CONF/rules/rules_refresh.sh`):

```sh
#!/bin/bash
#This script is called by openHAB after the persistence service has started
sleep 5
find "$OPENHAB_CONF/rules" -type f -name '*.rules' -not -name refresh.rules | xargs touch
```

The script waits for five seconds and then touches all `*.rules` files (except `refresh.rules`).
This causes openHAB to reload all rules (openHAB automatically reloads rules when their creation date/time changes).
Other rules files may be added on new lines.
Note - you will have to experiment to find the appropriate sleep value for your specific system.
