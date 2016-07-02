---
layout: documentation
---

{% include base.html %}

# Karaf console

The Karaf console offers the option to:

* monitor the [log](logging.html#karaf-console) in realtime
* manage [bundles](bundles.html)

# Accessing the console

Accessing the Karaf console depends on the start mode of openHAB. The manually start using shell/batch script ends directly in the Karaf console.

If openHAB runs a service, the console can be accessed using ssh to the openHAB host on port 8101. The default Username/Password is **openhab/habopen**.

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

_Help_ is listing all available commands:

```
openhab> help
...
```

or describes a specific subsystem/command:

```
openhab> help bundle
...

openhab> help bundle:stop
...
```

The Karaf session is ended by using the logout command:

```
openhab> logout
```

By default due to security reasons openhab binds it's shell to localhost. If you are using local network or you are fully aware of all risks of exposing your system to public network you can change bind address in **org.apache.karaf.shell.cfg** config file. It can be found in the **runtime/karaf/etc/** folder (in case openHAB was installed via apt, the full path is: /usr/share/openhab2/runtime/karaf/etc/), replace line:

```
sshHost=127.0.0.1
```
to contain IP address you want to bind or 0.0.0.0 if you would like to bind to all available network interfaces:

```
sshHost=0.0.0.0
```

Please check the [Karaf reference](http://karaf.apache.org/manual/latest/) for details.
