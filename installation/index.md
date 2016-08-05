---
layout: documentation
title: Installation
---

{% include base.html %}

# Installation

openHAB 2 is based on the Eclipse SmartHome framework and is fully written in Java.
As such, it is only depending on a [Java Development Kit](http://java.com/de/download/manual.jsp), which is available for many platforms.
openHAB can be executed on different versions of **MacOS**, **Windows** or many different variants of **Linux** (Ubuntu, Raspbian, ...).

## Prerequisites

Make sure that you have an up to date version of the [Oracle Java Development Kit](http://java.com/de/download/manual.jsp) on your host system installed.
Oracle Java Version 8 is recommended for openHAB.

A famous alternative to Oracle Java is the OpenJDK.
Note that openHAB may be unstable and slower executed by OpenJDK, it is therefor **recommended** to switch to Oracle Java if possible.

Check your current Java version by opening a console and typing "java -version":

```
console$ java -version
java version "1.8.0 73"
Java(TM) SE Runtime Environment (build 1.8.0_73-b02)
Java HotSpot(TM) 64-Bit Server VM (build 25.73-b02, mixed mode)
```

## Setup variants

Before you can start, there are three decisions to make:

1. openHAB 2 is available as a plattform independent archive file or through a package repository for Linux systems.
Because of automatic updates, installation through a package repository is recommended.

2. You can use the latest official release or a snapshot containing all current changes.
Because openHAB 2 is still under heavy development, it is recommended for experienced users to use the latest snapshot.

3. The distribution is available in two flavors:
  * offline: This package contains all available add-ons and allows installing them locally, i.e. completely offline.
  * online: This package only contains the core runtime and downloads any add-on from a remote repository.

## Installation

Please follow the instructions in the installation article matching your platform. 







<!-- That shouldn't be here

You will find the following folders:

 - `conf`: This contains all your user specific configuration files.
 - `runtime`: This contains the openHAB binaries, there should normally be no need to touch anything in here - the whole folder can be considered to be read-only.
 - `userdata`: Here you will find all the data that is generated during runtime: log files, database files, etc. In theory this should be the only folder where openHAB needs write permission on.
 - `addons`: Here you can drop add-ons (or any other OSGi bundles) that you want to be deployed in your instance. These can be add-ons for openHAB 1.x and 2.x likewise. Note that all "normal" add-ons are already included in the openHAB distribution and all you need is to name them in your 'addons.cfg' file (see below). Hence the `addons` folder is mainly useful if you have received jars from other sources and want to install and test them. Please note that removing a file from this folder will not uninstall the add-on. To uninstall it, you will have to use the console command bundle:uninstall.
 
## Choosing a Base Package and Add-ons to be Installed 

If you do not do any changes to the distribution, it will by default install a standard package, which comes with the most common UIs.

If you are starting and want the demo package, which consists out of demo configuration files (for items, sitemaps, etc.) and a selection of add-ons and UIs, you should directly edit the file 'conf/services/addons.cfg'.
It allows you to choose a base package and any add-on that you might want to install. Note that all required dependencies (e.g. io.transport bundles) will automatically be installed, so you do not need to worry about this anymore. You also do not have to get hold of the jar file yourself as the openHAB distribution either includes it already locally (offline distro) or knows from where to download it (online distro).

```
# The base installation package of this openHAB instance (default is "standard")
# Valid options:
#   - minimal  : Installation only with dashboard, but no UIs or other addons
#   - standard : Typical installation with all standards UIs
#   - demo     : A demo setup which includes UIs, a few bindings, config files etc.
package = standard

# A comma-separated list of bindings to install (e.g. "sonos,knx,zwave")
binding = knx,sonos,http

# A comma-separated list of UIs to install (e.g. "basic,paper")
ui = paper,basic

# A comma-separated list of persistence services to install (e.g. "rrd4j,jpa")
persistence = rrd4j

# A comma-separated list of actions to install (e.g. "mail,pushover")
action =

# A comma-separated list of transformation services to install (e.g. "map,jsonpath")
transformation = map

# A comma-separated list of voice services to install (e.g. "marytts,freetts")
voice =

# A comma-separated list of miscellaneous services to install (e.g. "myopenhab")
misc = myopenhab
```  

Many add-ons require some configuration. In openHAB 1.x, this was done in the central `openhab.cfg` file. In openHAB 2.x this has changed to separate files in the folder `conf/services`, e.g. the add-on 'acme' is configured in the file `conf/services/acme.cfg`.
 
Likewise, the syntax in the configuration files has changed to not require the namespace anymore, i.e. instead of

```
acme:host=192.168.0.2
```

in `openhab.cfg` you would now simply enter

```
host=192.168.0.2
```

in the `acme.cfg` file.

If an add-on provides configuration options, the according cfg file will be automatically created in `conf/services`, when installing the add-on (as long as the `conf` folder is writable for openHAB).

## Configuring which HTTP(s) ports to use

The Jetty webserver in openHAB has been preconfigured to use ports 8080 (http) and 8443 (https). You can change these default ports by specifying the environment variables OPENHAB_HTTP_PORT and OPENHAB_HTTPS_PORT.

For example:

```
export OPENHAB_HTTP_PORT=8011
export OPENHAB_HTTPS_PORT=8444
```

## Configuring additional JVM options

In a standard setup, you don't need to configure JVM arguments. There may however be cases where bindings require additional JVM settings, for example to use non standard serial ports.
When additional JVM arguments are needed, these can be set using the ```EXTRA_JAVA_OPTS``` environment variable.

For example:

```
export EXTRA_JAVA_OPTS=-Dgnu.io.rxtx.SerialPorts=/dev/ttyAMA0
``` 

## Starting the Runtime

Once you have configured your runtime, you can simply start openHAB by calling `start.sh` resp. `start.bat` on Windows. Point your browser to ```http://<hostname>:8080``` (allow the runtime some time to start before the HTTP server is available, especially on the very first start) and you will be welcomed by the openHAB Dashboard.

Logfiles are written to `userdata/logs`, so please check these in case of any problem.

## Using the Shell

openHAB uses Apache Karaf and thus comes with a very powerful shell for managing the installation. Please check the [Karaf command reference](http://karaf.apache.org/manual/latest/commands/commands.html) for details. Useful commands e.g. include:

 - `log:tail`: Show the live logging output, end it by pressing ctrl+c.
 - `log:exception-display`: Show the last exception of the log file.
 - `log:set DEBUG org.openhab.binding.sonos`: Enables debug logging for a certain binding.
 - `feature:list`: Lists all features available and shows there status. openHAB add-ons are made available as such Karaf features.
 - `feature:install openhab-binding-knx`: Installs a certain add-on (here KNX). 
 - `bundle:list -s`: Lists all installed bundles with their symbolic name.
 - `logout`: Shuts down openHAB.
 
## Registering openHAB as a System Service in the OS

Karaf provides the possibility to be automatically started on system startup as a service. As different mechanisms are required for the different operating systems, Karaf detects your OS and generates the required files. 

This capability is currently not available for ARM based devices (e.g. Raspberry Pi 1 and 2) but further below shows the manual steps needed. On Linux systems, you can use the command ```arch``` to show which CPU architecture is being used.

To install openHAB as a service, call

```
openhab:install-service 
```

in the shell and make sure that the folder `<openhab root folder>/runtime/karaf` is writable (only required at this time, you can make it read-only again afterwards).
The files are then generated for you and a short guide is displayed on what further actions you need to take to register it as a system service.

### Raspberry Pi

If you're running Raspbian Jessie and have systemd installed the following steps will allow you to register openHAB as a service so that it runs at startup and automatically restarts if openHAB crashes.

 1. Make sure openHAB is installed somewhere, for the purpose of this guide it's installed in /opt/openhab2.
 2. Create the following file called "openhab.service" in /lib/systemd/system/ replacing the username with whichever user runs openHAB on your setup.
 
```
[Unit]
Description=Starts and stops the openHAB Home Automation Bus
Documentation=http://www.openhab.org
Wants=network-online.target
After=network-online.target

[Service]
Type=simple
GuessMainPID=yes
User=**enter your openhab username here**
ExecStart=/opt/openhab2/start.sh
ExecStop=kill -SIGINT $MAINPID
Restart=on-failure
WorkingDirectory=/opt/openhab2

[Install]
WantedBy=multi-user.target
```
 
 3. Run the following commands to enable the service, start the service and check the status of the service respectively.
 
```
sudo systemctl enable openhab
sudo systemctl start openhab
sudo systemctl status openhab
```

 4. Assuming all looks good when you checked the status of the service, i.e. you see something like the below on your command line, then it should now be setup to run as a service.

```
 openhab.service - Starts and stops the openHAB Home Automation Bus
   Loaded: loaded (/etc/systemd/system/openhab.service; enabled)
   Active: active (running) since Thu 2016-01-14 01:16:00 GMT; 18h ago
     Docs: http://www.openhab.org
```
 
 5. If you need to stop openHAB use the following command.
  
```
 sudo systemctl stop openhab
```
 
 6. If you need to disable the service so that it doesn't run at startup use the following command.
 
```
 sudo systemctl disable openhab
```
 
-->