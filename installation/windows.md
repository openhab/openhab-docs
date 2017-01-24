---
layout: documentation
title: Windows
---

{% include base.html %}

# openHAB 2 on Windows

The following instructions will guide you through the process of setting up openHAB 2.

## Prerequisites

First, be sure to check that your system has the necessary [prerequisites]({{base}}/installation/index.html#prerequisites).

Add the JAVA_HOME System Environment Variable in Windows: Navigate to
`Control Panel\System and Security\System\Advanced system settings\Environment variables\System variables` and create a New System Variable based on your Java installation directory:

![JAVA_HOME](http://imageshack.com/a/img921/5017/HZjFl6.png)

The directory that openHAB is installed to must **contain no spaces**.
On this page, we will be using `C:\openHAB2` as an example.

## Installation

The openHAB runtime is distributed using a platform-independent zip file. 
To install it, follow these simple steps:

1. Choose between the Stable Version [ ![Download](https://api.bintray.com/packages/openhab/mvn/openhab-distro/images/download.svg) ](https://bintray.com/openhab/mvn/download_file?file_path=org%2Fopenhab%2Fdistro%2Fopenhab%2F2.0.0%2Fopenhab-2.0.0.zip) or the latest Snapshot Version [ ![Download](https://api.bintray.com/packages/openhab/mvn/openhab-distro/images/download.svg?version=2.1.0) ](https://openhab.ci.cloudbees.com/job/openHAB-Distribution/lastSuccessfulBuild/artifact/distributions/openhab/target/openhab-2.1.0-SNAPSHOT.zip) of openHAB2.

2. Unzip the file in your chosen directory (e.g. `C:\openHAB2`)

![openHAB 2 Folders](http://imageshack.com/a/img924/8420/QHo9LU.png)

3. Start the server: Launch the runtime by executing the script `C:\openHAB2\start.bat` and wait a while for it to start and complete.

![Karaf_Windows](http://imageshack.com/a/img921/5466/TOJADy.png)

4. Point your browser to `http://localhost:8080`. You should be looking at the openHAB [package selection page]({{base}}/configuration/packages.html). 
   When you've selected an appropriate package, this page will contain the [UI]({{base}}/addons/uis.html) selection screen.

## Folder Structure

Assuming a successful install, you will now have various folders inside `C:\openhab`:

| Folder Path | Description                             
|:----------- |:-----------
| addons      | For adding new add-ons such as bindings
| conf        | For textual configuration of openHAB
| runtime     | Contains all the system files for openHAB
| userdata    | Contains UI set configurations and settings for openHAB

## Backup

Make sure that you make regular backups of the **conf** and **userdata** folders, you can zip and unzip these folders too and from openHAB installations (even across most versions). 
When you have a setup that you are happy with, it would be a good idea to make a backup of the whole `C:\openHAB2` folder. Which can be used any time after a failure.

## Updating the openHAB Runtime

There is currently no automatic update script for Windows. To update manually, download a later version of the openHAB distribution zip file and follow these steps:

1. Stop the openHAB process if it is currently running.
2. Backup openHAB as described above.
3. Delete the following files from your existing install:
 - `userdata\etc\all.policy`
 - `userdata\etc\branding.properties`
 - `userdata\etc\branding-ssh.properties`
 - `userdata\etc\config.properties`
 - `userdata\etc\distribution.info`
 - `userdata\etc\jre.properties`
 - `userdata\etc\profile.cfg`
 - `userdata\etc\startup.properties`
 - Any file in `userdata\etc` that starts with `org.apache.karaf`
 - The `userdata\cache` folder
 - The `userdata\tmp` folder
4. Copy and paste the new `userdata` folder over your existing install, when prompted **do not overwrite existing files**.
5. Copy and paste the new `runtime` folder over your existing install, when prompted **overwrite all existing files**

## Starting openHAB as a service

In the Installation section, we used the `C:\openHAB2\start.bat` script to start openHAB 2.
Instead of using this startup script, you can integrate openHAB 2 directly in your operating system as a native Windows Service service.

Service Installation Steps:

1. Start openHAB 2 using the `C:\openhab\start.bat` script and wait for it to load, giving you the `openhab>` prompt.

2. openhab> `feature:install service-wrapper`.

3. openhab> `wrapper:install --name "openHAB2" --display "openHAB2" --description "openHAB 2 Service"`.
![Wrapper Install](http://imageshack.com/a/img921/6968/DeSTew.png)

IMPORTANT: Edit now your `C:\openHAB2\userdata\etc\openHAB2-wrapper.conf` file and modify the following line:
`wrapper.java.classpath.1=%KARAF_HOME%/lib/boot/*.jar` (the default classpath is wrong as it is set to %KARAF_BASE%... change it to %KARAF_HOME%)

4. Open up a new command prompt as an Administrator ! and issue the following command:
`C:\openHAB2\userdata\bin\openHAB2-service.bat install`

![Install Service](http://imageshack.com/a/img923/6505/xEWhcv.png)

Check the service by running `services.msc` in a command prompt:

![Win Services](http://imageshack.com/a/img923/2203/qbqwBD.png)

5. All done!  The openHAB2 service is installed and it will come up every time you reboot your windows system.

To manually manage your openHAB2 service from a command prompt: To start the openHAB2 Service: `net start openHAB2`. To stop the openHAB2 Service: `net stop openHAB2`

{% include contribution-wanted.html %}
