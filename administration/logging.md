---
layout: documentation
title: Logging
---

{% include base.html %}

# Logging in openHAB

This article describes the logging functionality in openHAB 2.
Ths includes how to access logging information and configure logging for user-defined rules.

There are two ways to check log entries:

1. Through files stored on the **file system**
2. During runtime in the **Karaf Console**

## File System

Log files are written to either `userdata/log` (manual setup) or `/var/log/openhab2` (apt/deb-based setup) and can be accessed using standard OS tools for text files. The default installation of openHAB generates two log files:

- `events.log`
- `openhab.log`

## Karaf Console

The [Karaf console](console.html) allows to monitor the log in realtime.

The log shell comes with the following commands:

- `log:clear`: clear the log
- `log:display`: display the last log entries
- `log:exception-display`: display the last exception from the log
- `log:get`: show the log levels
- `log:set`: set the log levels
- `log:tail`: continuous display of the log entries

For example, following command enables the realtime monitoring of the default log:

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

In order to see the messages, logging needs to activated defining what should be logged and in which detail. This can be done in Karaf using the following console command:

```text
log:set LEVEL package.subpackage
```

The **what** is defined by `package.subpackage` and is in most cases a binding (like `org.openhab.binding.zwave`)

The **detail** of logging is defined by one of the following levels:

1. DEFAULT
2. OFF
3. ERROR
4. WARN
5. INFO
6. DEBUG
7. TRACE

The levels build a hierarchy with **ERROR** logging critical messages only and **DEBUG** logging nearly everything. **DEBUG** combineds all logs from levels 3 to 6, while **TRACE** adds further messages in addition to what **DEBUG** displays.
Setting the log level to **DEFAULT** will log to the level defined in the package.subpackage (in most cases a binding).

Following example sets the logging for the Z-Wave binding to **DEBUG**

```text
log:set DEBUG org.openhab.binding.zwave
```

Note that the log levels set using the `log:set` commands are not persistent and will be lost upon restart. To configure those in a persistent way, the commands have to be added to the [configuration file](#config-file).

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

Per default all log entries are saved in the file `openhab.log` and event specific entries are saved in `events.log`. Additional files can be defined in order to write specifics logs to a separate place.

In order to create a new log file following two areas needs to be added to the [configuration file](#config-file):

**New logger:**

```java
# Logger - Demo.log
log4j.logger.org.eclipse.smarthome.model.script.Demo = DEBUG, Demo
```

**New file appender:**

```java
# File appender - Demo.log
log4j.appender.Demo=org.apache.log4j.RollingFileAppender
log4j.appender.Demo.layout=org.apache.log4j.PatternLayout
log4j.appender.Demo.layout.ConversionPattern=%d{yyyy-MM-dd HH:mm:ss.SSS} [%-5.5p] [%-36.36c] - %m%n
log4j.appender.Demo.file=${openhab.logdir}/Demo.log
log4j.appender.Demo.append=true
log4j.appender.Demo.maxFileSize=10MB
log4j.appender.Demo.maxBackupIndex=10
```
