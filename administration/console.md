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

Please check the [Karaf reference](http://karaf.apache.org/manual/latest/) for details.
