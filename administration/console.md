---
layout: documentation
title: The Console
---

{% include base.html %}

# The Console

The console offers the option to:

* monitor the [log](logging.html#karaf-console) in realtime
* manage [bundles](bundles.html)
* [runtime commands](runtime.html)

## Accessing the Console

Accessing the console depends on the start mode of openHAB. The manually start using shell/batch script ends directly in the console.

If openHAB runs a service, the console can be accessed using ssh to the openHAB host on port 8101. The default username/password is **openhab/habopen**. Be aware, that the first connection attempt may take a few seconds longer.

```
ssh openhab@localhost -p 8101
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

## Using the Console

**Help** is listing all available commands:

```
openhab> help
```

or describes a specific subsystem/command:

```
openhab> help bundle
...

openhab> help bundle:stop
...
```

The console also supports auto-completion during input. Auto-Completion proposes possible commands based on the current input and is triggered by the **tab** key. So for example entering _bun_ and pressing the tab key will result in:

```
openhab> bundle
bundle                   bundle:capabilities      bundle:classes           bundle:diag              bundle:dynamic-import
bundle:find-class        bundle:headers           bundle:id                bundle:info              bundle:install
bundle:list              bundle:load-test         bundle:refresh           bundle:requirements      bundle:resolve
bundle:restart           bundle:services          bundle:start             bundle:start-level       bundle:stop
bundle:tree-show         bundle:uninstall         bundle:update            bundle:watch
```

Another useful feature the **\| (pipe)** and **grep** functionality which filters long output lists:

```
openhab> bundle:list | grep openHAB
164 | Active    |  90 | 2.0.0.201607210102    | openHAB Core
165 | Active    |  80 | 2.0.0.201607210102    | openHAB Karaf Integration
195 | Active    |  80 | 2.0.0.201607210102    | openHAB 1.x Compatibility Layer
196 | Active    |  80 | 2.0.0.201607210102    | openHAB REST Documentation
```

The session is ended by using the logout command:

```
openhab> logout
```

## Bind Console to all Interfaces

By default openHAB binds its shell to localhost only due to obvious security reasons. If you are on a local network or you are fully aware of all risks of exposing your system to the public, you can change the bind address in the configuration file `org.apache.karaf.shell.cfg` under the openHAB `<userdata>/etc` path. Replace the `sshHost` IP "127.0.0.1" by "0.0.0.0" to bind to all available network interfaces. Please be aware, that the console will now be accessible from all devices and is only secured by the password defined in `users.properties` (same path). You should thereby change the default password.

The above can be accomplished by the following Linux shell command (on an apt/deb-based installation, you might need to adapt the path for other installations):

```
sudo sed -i -e "s/sshHost = 127.0.0.1/sshHost = 0.0.0.0/g" /var/lib/openhab2/etc/org.apache.karaf.shell.cfg
sudo sed -i -e "s/openhab = habopen/openhab = securePassword/g" /var/lib/openhab2/etc/users.properties
```

-----

Please check the [Karaf reference](http://karaf.apache.org/manual/latest/) for more details.
