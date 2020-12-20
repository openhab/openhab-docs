---
layout: documentation
title: Logging
---

{% include base.html %}

# Logging in openHAB

This article describes the logging functionality in openHAB.
This includes how to access logging information and configure logging for user-defined rules.

There are two ways to check log entries:

1. Through files stored on the **file system**
2. During runtime in the **Karaf Console**

## Filesystem

Log files are written to either `userdata/log` (manual setup) or `/var/log/openhab` (package based setup) and can be accessed using standard OS tools for text files. The default installation of openHAB generates two log files:

- `events.log`
- `openhab.log`

## Console

The [openHAB console](console.html) allows you to monitor the log in real-time.

The log shell provides the following commands:

| Log Command             | Description                                                       |
|-------------------------|-------------------------------------------------------------------|
| `log:clear`             | Clear log entries                                                 |
| `log:display`           | Display the last log entries                                      |
| `log:exception-display` | Displays the last occurred exception from the log                 |
| `log:get`               | Show the currently set log level                                  |
| `log:list`              | List the currently set loggers with their levels                  |
| `log:log`               | Log a message                                                     |
| `log:set`               | Set the log level                                                 |
| `log:tail`              | Continuously display log entries. Use ctrl-c to quit this command |

For example, the following command enables real-time monitoring of the default log:

```
openhab> log:tail
20:38:00.031 [DEBUG] [sistence.rrd4j.internal.RRD4jService] - Stored 'Temperature_FF_Child' with state '19.1' in rrd4j database
20:38:00.032 [DEBUG] [sistence.rrd4j.internal.RRD4jService] - Stored 'Temperature_FF_Bed' with state '19.5' in rrd4j database
20:38:20.463 [DEBUG] [thome.io.rest.core.item.ItemResource] - Received HTTP POST request at 'items/Light_FF_Bath_Ceiling' with value 'ON'.
20:38:21.444 [DEBUG] [thome.io.rest.core.item.ItemResource] - Received HTTP POST request at 'items/Light_FF_Bath_Mirror' with value 'ON'.
```

A useful feature is that filters can be applied:

```
openhab> log:tail org.openhab.io.rest.core.item.ItemResource
20:36:52.879 [DEBUG] [thome.io.rest.core.item.ItemResource] - Received HTTP POST request at 'items/Light_FF_Bath_Ceiling' with value 'ON'.
20:36:53.545 [DEBUG] [thome.io.rest.core.item.ItemResource] - Received HTTP POST request at 'items/Light_FF_Bath_Ceiling' with value 'OFF'.
```

Please see the [Karaf documentation](http://karaf.apache.org/manual/latest/#_commands_2) for more examples and details.

## Config file

The config file for logging is located in the `userdata/etc` folder (manual setup) or in `/var/lib/openhab/etc` (apt/deb-based setup).

::: tip Attention OH2 users
The format and filename to store log settings has changed. It used to be `org.ops4j.pax.logging.cfg` in openHAB 2 and is `log4j2.xml` in openHAB 3.
Do not delete the `.cfg` though, it needs to include the new `.xml`.
:::

## Defining what to log

By default, openHAB comes with logging enabled for several standard packages.
In order to enable logging for additional packages, you need to define what should be logged and at what level of detail.

This can be done in Karaf using the following console command:

```text
log:set LEVEL package.subpackage
```

The **what** is defined by `package.subpackage` and is in most cases a binding (like `org.openhab.binding.zwave`).
The **detail** of logging is defined by one of the following levels:

| Log Level | Log Weight | When it should be used                                                                  |
|-----------|------------|-----------------------------------------------------------------------------------------|
| OFF       | 0          | When no events will be logged                                                           |
| ERROR     | 200        | When an error in the application, possibly recoverable                                  |
| WARN      | 300        | When an event that might possible lead to an error                                      |
| INFO      | 400        | When an event for informational purposes                                                |
| DEBUG     | 500        | When a general debugging event required                                                 |
| TRACE     | 600        | When a fine grained debug message, typically capturing the flow through the application |
| ALL       | MAX        | When all events should be logged                                                        |

The levels build a hierarchy with **ERROR** logging critical messages only and **DEBUG** logging nearly everything.
**DEBUG** combines all logs from weight 100 to 500, while **TRACE** adds further messages in addition to what **DEBUG** displays.
**ALL** includes every log level from weight 100 to 600.
Setting the log level to **DEFAULT** will log to the level defined in the package.subpackage (in most cases a binding).

If the name of `package.subpackage` is not known, the name can be found out in the console:
```text
list -s
```
returns a list of all modules and the last column contains the information about the symbolic name of the bundle:
```text
openhab> list -s
START LEVEL 100 , List Threshold: 50
 ID │ State  │ Lvl │ Version                 │ Symbolic name
────┼────────┼─────┼─────────────────────────┼───────────────────────────────────────────────────────────────────────────────────────────────────────────────────
 19 │ Active │  80 │ 5.3.1.201602281253      │ com.eclipsesource.jaxrs.publisher
 20 │ Active │  80 │ 2.8.2.v20180104-1110    │ com.google.gson
 21 │ Active │  80 │ 18.0.0                  │ com.google.guava
 22 │ Active │  80 │ 27.1.0.jre              │ com.google.guava
 23 │ Active │  80 │ 1.0.1                   │ com.google.guava.failureaccess
 24 │ Active │  80 │ 3.0.0.v201312141243     │ com.google.inject

```
The list can be also filtered with grep. To find out the Z-Wave binding the following command can be used
```Text
openhab> list -s | grep zwave
253 x Active x  80 x 2.5.5                   x org.openhab.binding.zwave

```

The following example sets the logging for the Z-Wave binding to **DEBUG**

```text
log:set DEBUG org.openhab.binding.zwave
```

Note that the log levels set using the `log:set` command are persistent and will be re-applied upon restart.
To modify the stored log levels, use the console or edit the [configuration file](#config-file).

## Create log entries in rules

There are times, especially when troubleshooting rules, when it can be helpful to log information or Item state values.

For each log level there is an corresponding command for creating log entries.
You may use these log levels to filter or better differentiate the generated logging output.
The logging commands require two parameters: the subpackage, in the examples below `heating`, and the text which should appear in the log:

```java
logError("heating", "This is a log entry of type Error!")
logWarn("heating", "Heating control failed while in mode {}", Heating_Mode.state)
logInfo("heating", "Heating mode set to normal")
logDebug("heating", "Bedroom: Temperature: {}, Mode: {}", Bedroom_Temp.state, Bedroom_Heater_Mode.state)
```

The main package of all script/rules based log entries is predefined as `org.openhab.core.model.script`.
The chosen subpackage is appended to the end of the main package.
It can be useful for filtering or package-based log level settings.
For example you can use `log:set info org.openhab.core.model.script` and `log:set info org.openhab.core.model.script.heating` while you work on the heating rules to get debug level output for heating rules and only info level for the rest of your rules files so you don't flood the log with too many entries that are irrelevant at that point in time.

An example output of the last log statement above is:

```
2016-06-04 16:28:39.482 [DEBUG] [org.openhab.core.model.script.heating] Bedroom: Temperature 21.3°C, Mode NORMAL
```

Note that, in the last example above, inclusion and formatting of values is done using [Java Formatter String Syntax](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Formatter.html).

## Log4j configuration and logging into separate files
By default, all log entries are saved in the file `openhab.log` and event-specific entries are saved in `events.log`.
Additional log files can be defined in order to write specifics logs to a separate place.

In order to define custom log patterns, log to network sockets and so on we can prepare a logging configuration in `log4j2.xml`.
There are several things that you might want to change in the configuration:

- The log level for a logger
- The pattern of an appender
- Redirect the log to a text file

### Further Reading

- <http://www.slf4j.org/manual.html>
