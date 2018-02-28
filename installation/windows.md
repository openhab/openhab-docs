---
layout: documentation
title: Windows
---

{% include base.html %}

# openHAB 2 on Windows

The following instructions will guide you through the process of setting up openHAB 2.

This page is structured as follows:

{::options toc_levels="2..4"/}

- TOC
{:toc}

## Prerequisites

First, be sure to check that your system has the necessary [prerequisites]({{base}}/installation/index.html#prerequisites).

Add the `JAVA_HOME` System Environment Variable in Windows.
Navigate to:

- Control Panel ➡️ System and Security ➡️ System ➡️ Advanced System Settings ➡️ Environment Variables ➡️ System Variables

Create a New System Variable based on your Java installation directory:

![JAVA_HOME](images/JAVA_HOME.png)

The directory that openHAB is installed to must **contain no spaces**.
On this page, we will be using `C:\openHAB2` as an example.

## Installation

The openHAB runtime is distributed using a platform-independent zip file.
To install it, follow these simple steps:

1.  Choose between the Stable Version [![Download](https://api.bintray.com/packages/openhab/mvn/openhab-distro/images/download.svg)](https://bintray.com/openhab/mvn/download_file?file_path=org%2Fopenhab%2Fdistro%2Fopenhab%2F2.2.0%2Fopenhab-2.2.0.zip) or the latest Snapshot Version [![Download](https://api.bintray.com/packages/openhab/mvn/openhab-distro/images/download.svg?version=2.3.0)](https://openhab.ci.cloudbees.com/job/openHAB-Distribution/lastSuccessfulBuild/artifact/distributions/openhab/target/openhab-2.3.0-SNAPSHOT.zip) of openHAB.

2.  Unzip the file in your chosen directory (e.g. `C:\openHAB2`)

    ![openHAB 2 Folders](images/openHAB_2_Folders.png)

3.  Start the server: Launch the runtime by executing the script `C:\openHAB2\start.bat` and wait a while for it to start and complete.

    ![Karaf_Windows](images/Karaf_Windows.png)

4.  Point your browser to `http://localhost:8080`.
    You should be looking at the openHAB [package selection page]({{base}}/configuration/packages.html).
    When you've selected an appropriate package, this page will contain the [UI]({{base}}/addons/uis.html) selection screen.

### File Locations

Assuming a successful install, you will now have various folders inside `C:\openHAB2`:

|                                  | Windows Installation         |
|:--------------------------------:|:-----------------------------|
| openHAB application              | `C:\openHAB2\runtime`        |
| Additional add-on files          | `C:\openHAB2\addons`         |
| Site configuration               | `C:\openHAB2\conf`           |
| Log files                        | `C:\openHAB2\userdata\logs`  |
| Userdata like rrd4j databases    | `C:\openHAB2\userdata`       |
| Service configuration            | `C:\openHAB2\userdata\etc`   |

## Backup

Make sure that you make regular backups of the **conf** and **userdata** folders, you can zip and unzip these folders too and from openHAB installations (even across most versions).
When you have a setup that you are happy with, it would be a good idea to make a backup of the whole `C:\openHAB2` folder.
Which can be used any time after a failure.

## Updating the openHAB Runtime

There is currently no automatic update script for Windows.
To update manually, download a later version of the openHAB distribution zip file and follow these steps:

1.  Stop the openHAB process if it is currently running.

2.  Backup openHAB as described above.

3.  Delete the following files and folders from your existing install:
    - `userdata\etc\all.policy`
    - `userdata\etc\branding.properties`
    - `userdata\etc\branding-ssh.properties`
    - `userdata\etc\config.properties`
    - `userdata\etc\custom.properties`
    - `userdata\etc\distribution.info`
    - `userdata\etc\jre.properties`
    - `userdata\etc\org.ops4j.pax.url.mvn.cfg`
    - `userdata\etc\profile.cfg`
    - `userdata\etc\startup.properties`
    - `userdata\etc\version.properties`
    - `userdata\etc\system.properties`
    - `userdata\etc\custom.system.properties`
    - Any file in `userdata\etc` that starts with `org.apache.karaf`
    - The `userdata\cache` folder
    - The `userdata\tmp` folder
    - The `runtime` folder

4.  Copy and paste the contents of the zip file over your existing install, when prompted **do not overwrite existing files**

## Starting openHAB as a Service

By installing the openHAB process as a service in Windows, you can:

- Launch it automatically upon system startup
- Run it in the background

**Windows Service Installation Steps**

1.  Complete the [prerequisites](#prerequisites) and regular [installation](#installation) steps, including the package selection

2.  Issue the following two commands in your openHAB console:
    ```shell
    feature:install service-wrapper
    wrapper:install --name "openHAB2" --display "openHAB2" --description "openHAB 2 Service"
    ```

    ![Wrapper Install_Windows](images/Wrapper_Install_Windows.jpg)

3.  Shutdown the openHAB instance by typing `logout` in the currently running console.

4.  Update the newly created `C:\openHAB2\userdata\etc\openHAB2-wrapper.conf` to include all necessary parameters.

    - Copy all the config text from the below section and paste it in your `openHAB2-wrapper.conf`, replacing all existing content.
    - Adapt the first entry (`OPENHAB_HOME`) to match your openHAB installation directory.

    ```conf
    #*******************************************************
    # openHAB2-wrapper.conf for Windows Service Installation
    #*******************************************************

    # openHAB installation dir (Adapt this first setting to your system)
    set.default.OPENHAB_HOME=C:\openHAB2

    # Wrapper Properties
    set.default.OPENHAB_CONF=%OPENHAB_HOME%\conf
    set.default.OPENHAB_RUNTIME=%OPENHAB_HOME%\runtime
    set.default.OPENHAB_USERDATA=%OPENHAB_HOME%\userdata
    set.default.OPENHAB_LOGDIR=%OPENHAB_USERDATA%\logs
    set.default.KARAF_HOME=%OPENHAB_RUNTIME%
    set.default.KARAF_BASE=%OPENHAB_USERDATA%
    set.default.KARAF_DATA=%OPENHAB_USERDATA%
    set.default.KARAF_ETC=%OPENHAB_USERDATA%\etc
    set.default.PATH=%PATH%;%KARAF_BASE%\lib;%KARAF_HOME%\lib

    # Java Application
    wrapper.working.dir=%KARAF_BASE%
    wrapper.java.command=%JAVA_HOME%\bin\java
    wrapper.java.mainclass=org.apache.karaf.wrapper.internal.service.Main
    wrapper.java.classpath.1=%KARAF_HOME%\lib\boot\*.jar
    wrapper.java.classpath.2=%KARAF_DATA%\lib\wrapper\*.jar
    wrapper.java.library.path.1=%KARAF_DATA%\lib\wrapper\

    # Java Parameters
    wrapper.java.additional.1=-Dkaraf.home="%KARAF_HOME%"
    wrapper.java.additional.2=-Dkaraf.base="%KARAF_BASE%"
    wrapper.java.additional.3=-Dkaraf.data="%KARAF_DATA%"
    wrapper.java.additional.4=-Dkaraf.etc="%KARAF_ETC%"
    wrapper.java.additional.5=-Dcom.sun.management.jmxremote
    wrapper.java.additional.6=-Dkaraf.startLocalConsole=false
    wrapper.java.additional.7=-Dkaraf.startRemoteShell=true
    wrapper.java.additional.8=-Djava.endorsed.dirs="%JAVA_HOME%\jre\lib\endorsed;%JAVA_HOME%\lib\endorsed;%KARAF_HOME%\lib\endorsed"
    wrapper.java.additional.9=-Djava.ext.dirs="%JAVA_HOME%\jre\lib\ext;%JAVA_HOME%\lib\ext;%KARAF_HOME%\lib\ext"
    wrapper.java.additional.10=-Dopenhab.home="%OPENHAB_HOME%"
    wrapper.java.additional.11=-Dopenhab.conf="%OPENHAB_HOME%\conf"
    wrapper.java.additional.12=-Dopenhab.runtime="%OPENHAB_HOME%\runtime"
    wrapper.java.additional.13=-Dopenhab.userdata="%OPENHAB_HOME%\userdata"
    wrapper.java.additional.14=-Dopenhab.logdir="%OPENHAB_USERDATA%\logs"
    wrapper.java.additional.15=-Dfelix.cm.dir="%OPENHAB_HOME%\userdata\config"
    wrapper.java.additional.16=-Dorg.osgi.service.http.port=8080
    wrapper.java.additional.17=-Dorg.osgi.service.http.port.secure=8443
    wrapper.java.maxmemory=512

    # Wrapper Logging Properties
    wrapper.console.format=PM
    wrapper.console.loglevel=INFO
    wrapper.logfile=%OPENHAB_USERDATA%\logs\wrapper.log
    wrapper.logfile.format=LPTM
    wrapper.logfile.loglevel=INFO
    wrapper.logfile.maxsize=10m
    wrapper.logfile.maxfiles=5
    wrapper.syslog.loglevel=NONE

    # Wrapper Windows Properties
    wrapper.console.title=openHAB2
    wrapper.ntservice.name=openHAB2
    wrapper.ntservice.displayname=openHAB2
    wrapper.ntservice.description=openHAB 2 Service
    wrapper.ntservice.dependency.1=
    wrapper.ntservice.starttype=AUTO_START
    wrapper.ntservice.interactive=false
    ```

5.  Open an elevated command prompt and type the following commands:

    ```text
    C:\openHAB2\userdata\bin\openHAB2-service.bat install
    net start "openHAB2"
    ```

    ![Admin cmd](images/Admin_CMD.jpg)

    ![Wrapper_Start_Windows](images/Wrapper_Start_Windows.jpg)

6.  Your openHAB Windows service is now installed and running.
    Validate proper operations by:

    -   Browsing to [http://localhost:8080](http://localhost:8080)

    -   Verifying that the Windows Service is running and set to Automatic Startup type.
        Use `services.msc` and find the `openHAB2` service.

        ![Windows Service](images/Windows_Service.jpg)

    -   Logging in with an SSH client to the console (see info below)

### Connecting to the openHAB console

You can connect to openHAB's console using the the `C:\openHAB2\runtime\bin\client.bat` script on the local machine. 
Alternatively, you can use a standard SSH client:

-   Install an SSH client application, e.g., [Putty](https://www.chiark.greenend.org.uk/~sgtatham/putty/latest.html), [KiTTY](http://kitty.9bis.net/) or [Xshell 5](https://www.netsarang.com/products/xsh_overview.html)

-   Setup a session with the following parameters:
    - Host: 127.0.0.1
    - Port: 8101
    - Username: `openhab`
    - Password: `habopen`

![SSH Connection 1](images/SSH_Connection_1.jpg)

![SSH Connection 2](images/SSH_Connection_2.jpg)

![SSH Connection 3](images/SSH_Connection_3.jpg)

![SSH Connection 4](images/SSH_Connection_4.jpg)
