---
layout: documentation
title: Logging
---

{% include base.html %}

# Logging in openHAB

This article describes the logging functionality in openHAB 2.
This includes how to access logging information and configure logging for user-defined rules.

There are two ways to check log entries:

1. Through files stored on the **file system**
2. During runtime in the **Karaf Console**

## File System

Log files are written to either `userdata/log` (manual setup) or `/var/log/openhab2` (apt/deb-based setup) and can be accessed using standard OS tools for text files. The default installation of openHAB generates two log files:

- `events.log`
- `openhab.log`

## Karaf Console

The [Karaf console](console.html) allows to monitor the log in real-time.

The log shell comes with the following commands:

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

For example, the following command enables the real-time monitoring of the default log:

```
openhab> log:tail
20:38:00.031 [DEBUG] [sistence.rrd4j.internal.RRD4jService] - Stored 'Temperature_FF_Child' with state '19.1' in rrd4j database
20:38:00.032 [DEBUG] [sistence.rrd4j.internal.RRD4jService] - Stored 'Temperature_FF_Bed' with state '19.5' in rrd4j database
20:38:20.463 [DEBUG] [thome.io.rest.core.item.ItemResource] - Received HTTP POST request at 'items/Light_FF_Bath_Ceiling' with value 'ON'.
20:38:21.444 [DEBUG] [thome.io.rest.core.item.ItemResource] - Received HTTP POST request at 'items/Light_FF_Bath_Mirror' with value 'ON'.
```

A useful functionality is that filters can be applied:

```
openhab> log:tail org.eclipse.smarthome.io.rest.core.item.ItemResource
20:36:52.879 [DEBUG] [thome.io.rest.core.item.ItemResource] - Received HTTP POST request at 'items/Light_FF_Bath_Ceiling' with value 'ON'.
20:36:53.545 [DEBUG] [thome.io.rest.core.item.ItemResource] - Received HTTP POST request at 'items/Light_FF_Bath_Ceiling' with value 'OFF'.
```

Please see the [Karaf documentation](http://karaf.apache.org/manual/latest/#_commands_2) for more examples and details.

## Config File

The config file for logging is `org.ops4j.pax.logging.cfg` located in the `userdata/etc` folder (manual setup) or in `/var/lib/openhab2/etc` (apt/deb-based setup).

## Defining what to log

By default, openHAB comes with logging enabled for several standard packages.
In order to enable logging for additional packages, you need to define what should be logged and in which detail.

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

Following example sets the logging for the Z-Wave binding to **DEBUG**

```text
log:set DEBUG org.openhab.binding.zwave
```

Note that the log levels set using the `log:set` commands are persistent and will be applied upon restart.
To modify the stored log levels, use the console or edit the [configuration file](#config-file).

## Create Log Entries in Rules

There are times, especially when troubleshooting rules, when it can be helpful to write information and variable or Item State values to the log.

For each log level there is an corresponding command for creating log entries.
You may use these log levels to filter or better differentiate the generated logging output.
The logging commands require two parameters: the subpackage, in the examples below `heating-control.rules`, and the text which should appear in the log:

```java
logError("heating-control.rules", "This is a log entry of type Error!")
logWarn("heating-control.rules", "This is a log entry of type Warn!")
logInfo("heating-control.rules", "This is a log entry of type Info!")
logDebug("heating-control.rules", "This is a log entry of type Debug!")
```

The main package of all script/rules based log entries is predefined as `org.eclipse.smarthome.model.script`.
The chosen subpackage is appended to the end of the main package.
It can be useful for filtering or package-based log level settings.

Examples for typical logging lines found in rules:

```text
logInfo("heating-control.rules", "Heating mode set to normal")
logError("heating-control.rules", "Heating control failed while in mode " + Heating_Mode.state)
logDebug("heating-control.rules", "Bedroom: Temperature: %1$.1f°C, Mode %2$s", Bedroom_Temp.state, Bedroom_Heater_Mode.state)
```

An example output of the last log statement above is:

```
2016-06-04 16:28:39.482 [DEBUG] [.e.model.script.heating-control.rules] Bedroom: Temperature 21.3°C, Mode NORMAL
```

Note that, in the last example above, inclusion and formatting of values is done using [Java Formatter String Syntax](https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html).

## Logging into Separate File

Per default all log entries are saved in the file `openhab.log` and event specific entries are saved in `events.log`.
Additional files can be defined in order to write specifics logs to a separate place.

In order to create a new log file following two areas needs to be added to the [configuration file](#config-file):

**New logger:**

```java
# ZWave Logger
log4j2.logger.ZWave.name = org.openhab.binding.zwave
log4j2.logger.ZWave.level = INFO
log4j2.logger.ZWave.additivity = false
log4j2.logger.ZWave.appenderRefs = ZWave
log4j2.logger.ZWave.appenderRef.ZWave.ref = ZWAVE
```

**New file appender:**

```java
# ZWave File Appender - ZWave.log
log4j2.appender.ZWave.name = ZWAVE
log4j2.appender.ZWave.type = RollingRandomAccessFile
log4j2.appender.ZWave.fileName = ${openhab.logdir}/ZWave.log
log4j2.appender.ZWave.filePattern = ${openhab.logdir}/ZWave.log.%i
log4j2.appender.ZWave.immediateFlush = true
log4j2.appender.ZWave.append = true
log4j2.appender.ZWave.layout.type = PatternLayout
log4j2.appender.ZWave.layout.pattern = %d{yyyy-MM-dd HH:mm:ss.SSS} [%-5.5p] [%-36.36c] - %m%n
log4j2.appender.ZWave.policies.type = Policies
log4j2.appender.ZWave.policies.size.type = SizeBasedTriggeringPolicy
log4j2.appender.ZWave.policies.size.size = 10MB
log4j2.appender.ZWave.strategy.type = DefaultRolloverStrategy
log4j2.appender.ZWave.strategy.max = 10
```
