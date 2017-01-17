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
- `log:display-exception`: display the last exception from the log
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
An useful functionality is that also filters can be applied:

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

The **what** is defined by `package.subpackage` and is in most cases a binding (like org.openhab.binding.sonos)

The **detail** of logging is defined by one of the following levels:

0. OFF
1. ERROR
2. WARN
3. INFO
4. DEBUG
5. TRACE

The levels build a hierarchy with **ERROR** logging critical messages only and **DEBUG** logging nearly everything. **DEBUG** combineds all logs from levels 1 to 4, while **TRACE** adds further messages in addition to what **DEBUG** displays.

Following example sets the logging for the Z-Wave binding to **DEBUG**

```text
log:set DEBUG org.openhab.binding.zwave
```

Note that the log levels set using the `log:set` commands are not persistent and will be lost upon restart. To configure those in a persistent way, the commands have to be added to the [configuration file](#config-file).

## Create Log Entries in Rules

It is also possible to create own log entries in rules. This is especially useful for debugging purposes.

For each log level there is an corresponding command for creating log entries. These commands require two parameters: the subpackage (here: `Demo`) and the text which should appear in the log:

```java
logError("Demo","This is a log entry of type Error!")
logWarn("Demo","This is a log entry of type Warn!")
logInfo("Demo","This is a log entry of type Info!")
logDebug("Demo","This is a log entry of type Debug!")
```

In order to see the messages, logging for the message class has to be activated. The main package is predefined (`org.eclipse.smarthome.model.script`) and the subpackage needs to be concatenated:

```text
log:set DEBUG org.eclipse.smarthome.model.script.Demo
```

The output for the above log statement of type **DEBUG** is:

```
2016-06-04 16:28:39.482 [DEBUG] [.eclipse.smarthome.model.script.Demo] - This is a log entry of type DEBUG!
```

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
