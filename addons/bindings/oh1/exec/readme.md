---
layout: documentation
---

{% include base.html %}

# Exec Binding

If you want to enhance openHAB with a "swiss-army-knife-binding" which executes given commands on the commandline, please place this bundle in the folder `${openhab_home}/addons` and add binding information to your configuration. See the following sections on how to do this. 

The Exec binding could act as the opposite of WoL and sends a shutdown command to the servers. Or switches off WLAN connectivity if a scene "sleeping" is activated.

Note: when using 'ssh' you should use private key authorization since the password cannot be read from commandline. The given user should have the necessary permissions.

There is also a binding specifically for openHAB 2 [here](http://docs.openhab.org/addons/bindings/exec/readme.html).

## Binding Confguration

This binding does not have a configuration.

## Item Configuration

When updating the states of items based on executing a command line (an "in" binding):

```
exec="<[<commandLine to execute>:<refreshintervalinmilliseconds>:(<transformationrule>)]"
```

where:

* `<commandLine to execute>` is the command line to execute.  See [Formatting](#formatting) and [Splitting](#splitting) sections below.
* `<refreshintervalinmilliseconds>` is the frequency at which to repeatedly execute the command line.
* `<transformationrule>` is optional, and can be used to transform the string returned from the command before updating the state of the item.

When executing a command line in response to the item receiving a command (an "out" binding):

```
exec=">[<openHAB-command>:<commandLine to execute>] (>[<openHAB-command>:<commandLine to execute>]) (>[...])"
```

where:

* `<openHAB-command>` is the openHAB command that will trigger the execution of the command line.  Can be `ON`, `OFF`, `INCREASE`, etc., or the special wildcard command '`*`' which is called in cases where no direct match could be found
* `<commandLine to execute>` is the command to execute.  See [Formatting](#formatting) and [Splitting](#splitting) sections below.

Deprecated format (do not use; retained for backward compatibility only):

```
exec="<openHAB-command>:<commandLine to execute>[,<openHAB-command>:<commandLine to execute>][,...]"
```

### Formatting

You can substitute formatted values into the command using the syntax described [here](https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html).

1. the current [date](https://docs.oracle.com/javase/7/docs/api/java/util/Date.html), like `%1$tY-%1$tm-%1$td`.
1. the current command or state, like `%2$s` (out bindings only)
1. the current item name (like `%3$s`).

### Splitting

Sometimes the `<commandLine to execute>` isn't executed properly. In that case, another exec-method can be used. To accomplish this please use the special delimiter `@@` to split command line parameters.

## Examples

```
exec="OFF:ssh user@host shutdown -p now"
exec="OFF:some command, ON:'some other\, more \'complex\' \\command\\ to execute', *:fallback command"
exec=">[ON:/bin/sh@@-c@@echo on >> /tmp/sw_log] >[OFF:/bin/sh@@-c@@echo off >> /tmp/sw_log]"
exec=">[1:open /mp3/gong.mp3] >[2:open /mp3/greeting.mp3] >[*:open /mp3/generic.mp3]"
exec="<[curl -s http://weather.yahooapis.com/forecastrss?w=566473&u=c:60000:XSLT(demo_yahoo_weather.xsl)]"
exec="<[/bin/sh@@-c@@uptime | awk '{ print $10 }':60000:REGEX((.*?))]"
exec="<[execute.bat %1$tY-%1$tm-%1$td %2$s %3$s:60000:REGEX((.*?))]"
exec="<[php ./configurations/scripts/script.php:60000:REGEX((.*?))]"
exec="<[/bin/sh@@-c@@uptime | awk '{ print $10 }':]"
exec="1:open /path/to/my/mp3/gong.mp3, 2:open /path/to/my/mp3/greeting.mp3, *:open /path/to/my/mp3/generic.mp3"
```

### Items

```
Switch Network_NAS	"NAS"	(Network, Status)	{ nh="192.168.1.100", exec="OFF:ssh user@host shutdown -p now"}
```

```
Switch Network_NAS	"NAS"	(Network, Status)	{ nh="192.168.1.100", knx="<2/0/0", exec="OFF:ssh user@host shutdown -p now"}
```

The example above combines three bindings to incorporate the following behavior: query the current state of the NAS with the given IP address. When receiving an OFF command over KNX or the user switches to OFF manually then send the given command line via the exec binding.

