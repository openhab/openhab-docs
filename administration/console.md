---
layout: documentation
title: Karaf Console
---

{% include base.html %}

# Karaf Console

The Karaf console offers the option to:

* monitor the [log](logging.html#karaf-console) in realtime
* manage [bundles](bundles.html)
* [runtime commands](runtime.html)

# Accessing the Console

Accessing the Karaf console depends on the start mode of openHAB. The manually start using shell/batch script ends directly in the Karaf console.

If openHAB runs a service, the console can be accessed using ssh to the openHAB host on port 8101. The default Username/Password is **openhab/habopen**. Be aware, that the first connection attempt may take a few seconds longer.

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

# Using the Console

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

The Karaf session is ended by using the logout command:

```
openhab> logout
```

# Configuring the Console

By default due to security reasons openhab binds its shell to localhost. If you are on a local network or you are fully aware of all risks of exposing your system to the public, you can change the bind address in `org.apache.karaf.shell.cfg` config file. It can be found in the `runtime/etc/` folder (in case openHAB was installed via apt, the full path is: `/usr/share/openhab2/runtime/etc/`), replace the `sshHost` IP "127.0.0.1" by "0.0.0.0" to bind to all available network interfaces.

The above can be accomplished by the following command (you may need to adapt the path):
```
sed -e "s/sshHost = 127.0.0.1/sshHost = 0.0.0.0/g" /usr/share/openhab2/runtime/etc/org.apache.karaf.shell.cfg
```

-----

Please check the [Karaf reference](http://karaf.apache.org/manual/latest/) for more details.
