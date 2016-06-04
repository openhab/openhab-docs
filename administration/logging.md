---
layout: documentation
---

{% include base.html %}

# Logging Features

- Looking at the log
- Defining the log
- Logging in rules

## Looking at the log

There are two ways to check log entries:

1. In the log file stored in the **file system**
2. During runtime in the **Karaf console**

### File System

Log files are written to the directory `userdata/logs` an can be accessed using standard OS tools for text files. The default installation of openHAB generates two log files:

- events.log
- openhab.log

### Karaf console

The Karaf console offers the option to monitor the log in realtime.

If openHAB runs a service, the console can be accessed using ssh to the openHAB host on port 8101. The default Username/Password is **karaf/karaf**.

```
ssh karaf@localhost -p 8101
Password authentication
Password:

                          __  _____    ____      
  ____  ____  ___  ____  / / / /   |  / __ )     
 / __ \/ __ \/ _ \/ __ \/ /_/ / /| | / __  |
/ /_/ / /_/ /  __/ / / / __  / ___ |/ /_/ /      
\____/ .___/\___/_/ /_/_/ /_/_/  |_/_____/     
    /_/                        2.0.0-SNAPSHOT

Hit '<tab>' for a list of available commands
and '[cmd] --help' for help on a specific command.
Hit '<ctrl-d>' or type 'system:shutdown' or 'logout' to shutdown openHAB.

openhab>
```

Useful commands regarding logging:

- `log:tail`: Show the live logging output, end it by pressing ctrl+c.
- `log:exception-display`: Show the last exception of the log file.
- `log:display org.openhab.binding.zwave`: Show log entries from the zwave binding only.

Please check the [Karaf reference](http://karaf.apache.org/manual/latest/) for details.

## Defining the log

In order to see the messages, logging needs to activated defining what should be logged and in which detail. This can be done in Karaf using the following console command:

```
log:set LEVEL package.subpackage
```

The **what** is defined by package.subpackage and is in most cases a binding (like org.openhab.binding.sonos)

The **detail** of logging is defined by one of the following levels:

1. Error
2. Warn
3. Info
4. Debug

The levels built a hierarchy with **Error** on the top and **Debug** on the bottom. So when setting the log level to **Debug**, all logs from levels 1-4 are shown.

Following example sets the logging for the SONOS binding to **Debug**

```
log:set DEBUG org.openhab.binding.sonos
```

## Logging in rules

It is also possible to create log entries during rule execution. This is especially useful for debugging purposes.

For each log level there is an corresponding command for creating log entries. These commands require two parameters: the subpackage (here: **Test**) and the text which should appear in the log:

```
logError("Test","This is a log entry of type Error!")
logWarn("Test","This is a log entry of type Warn!")
logInfo("Test","This is a log entry of type Info!")
logDebug("Test","This is a log entry of type Debug!")
```

In order to see the messages, logging for the message class has to be activated. The main package is predefined (org.eclipse.smarthome.model.script) and the subpackage needs to be concatenated:

```
log:set DEBUG org.eclipse.smarthome.model.script.Test
```

The output for the above log statement of type **Debug** is:

```
2016-06-04 16:28:39.482 [DEBUG] [.eclipse.smarthome.model.script.Test] - This is a log entry of type DEBUG!
```
