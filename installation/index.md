---
layout: documentation
title: Installation Overview
---

{% include base.html %}

# Installation Overview

openHAB 2 is based on the Eclipse SmartHome framework and is fully written in Java.
As such, it only depends on a [Java Development Kit](http://java.com/de/download/manual.jsp), which is available for many platforms.
openHAB can be executed on different versions of **Mac OS X** and **Windows** and many different variants of **Linux** (Ubuntu, Raspbian, ...).

Please be aware of the fact, that openHAB 2 is based on a new core and introduces new concepts.
Therefore, tutorials and help you may find on the internet for openHAB 1 **might** be outdated!

## Platform Recommendations

1. You are **new to openHAB 2** and want to give it a try? You are in luck:
  - Set up openHAB 2 on your local PC or Mac in just a few steps.

2. You gained some experience and want to use openHAB to seriously control your home?
  Typical hardware and software requirements are:
    - **24/7 availability:** A dedicated system connected by Ethernet and running continuously.
    - **Energy and space efficient:** A device capable of performing the task at hand without being exaggerated
    - **Extendibility:** Your system should be capable of running additional software like an MQTT broker or a persistence and graphing software.
    - **Peripherals:** Depending on your home automation hardware, you will need additional peripheral devices such as a WiFi interface or a special USB radio module.

  Many devices are suited to host a continuous installation of openHAB 2.
  The [Raspberry Pi](rasppi.html) as a minimal sufficient device is quite popular, experiences with many other devices can be found in the [community forum hardware section](https://community.openhab.org/c/hardware/server).

## Prerequisites

Make sure that you have an up to date version of the [Oracle Java Development Kit](http://java.com/de/download/manual.jsp) on your host system installed.
A famous choice is OpenJDK, however, Oracle Java Version 8 is recommended for openHAB.
openHAB may be unstable and slower executed by OpenJDK.

> Oracle Java offers significant performance advantages over OpenJDK on ARM platforms, and will expand the range of Java applications that run well [on the Raspberry Pi].

Check your current Java version by opening a console and typing "java -version":

```text
java version "1.8.0 73"
Java(TM) SE Runtime Environment (build 1.8.0_73-b02)
Java HotSpot(TM) 64-Bit Server VM (build 25.73-b02, mixed mode)
```

If your output differs, please install Oracle Java 8.

## Setup variants

Before you can start, three decisions have to be made:

1. openHAB 2 is available as a platform independent archive file or through a package repository:
  - **Manual setup:** Download and extract a platform independent zip archive: [Mac OS X](macosx.html), [Windows](windows.html), [Linux](linux.html#manual-installation)
  - **Package setup:** Install though a package repository, including automatic updates.
    This option is only available for Debian or Ubuntu derivatives and the recommended choice: [Linux (apt/deb)](linux.html#package-repository-installation)

2. Stable release or cutting edge:
  - **Stable:** Use the latest official release ([hosted on Bintray](https://bintray.com/openhab/mvn/openhab-distro)).
  - **Snapshot:** Benefit from the latest changes in the daily created snapshot ([hosted on CloudBees](https://openhab.ci.cloudbees.com/job/openHAB-Distribution)).

  Because openHAB 2 is still under heavy development, it is recommended for experienced users to use the latest snapshot.

3. The distribution is available in two flavors:
  - **Offline:** This package contains all available add-ons and allows installing them locally, i.e. completely offline.
  - **Online:** This package only contains the core runtime and downloads any add-on from a remote repository.

  We currently recommend to use the "offline" version and to update regularly.

## Installation

Please follow the instructions in the installation article matching your platform.

## Additional Steps

After you got openHAB 2 set up and running, there are a few additional setup steps you should consider:

* Configure a network share on your openHAB host device and mount it locally: [Linux Samba Share](linux.html#network-sharing), Windows file sharing, ...
* Install the [Eclipse SmartHome Designer](designer.html) on your local machine, to manage your (remote) configuration files.
  The designer comes with built-in support for the openHAB syntax and elements.

## Getting started

With the openHAB 2 distribution up and running, you should now continue with
the [Demo Tutorial](http://docs.openhab.org/tutorials/demo.html),
the [Beginner Tutorial](http://docs.openhab.org/tutorials/beginner)
or by working on your own configuration.

## Help

The very active [openHAB Community Forum](https://community.openhab.org) provides many more details and hints.
If you run into any problems, use the search function or open a new thread with your detailed question.



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

-->
