---
layout: documentation
title: Windows
---

{% include base.html %}

# openHAB on Windows

The following instructions will guide you through the process of setting up openHAB 2.

## Prerequisites

First, be sure to check that your system has the necessary [prerequisites]({{base}}/installation/index.html#prerequisites).

The directory that openHAB is installed to must **contain no spaces**.
On this page, we will be using `C:\openhab` as an example.

## Installation

The openHAB runtime is distributed using a platform-independent zip file. 
To install it, follow these simple steps:

1. Choose between the [RC (Release client) version](https://bintray.com/openhab/mvn/download_file?file_path=org%2Fopenhab%2Fdistro%2Fopenhab%2F2.0.0.RC1%2Fopenhab-2.0.0.RC1.zip) or the [latest snapshot version](https://openhab.ci.cloudbees.com/job/openHAB-Distribution/lastSuccessfulBuild/artifact/distributions/openhab/target/openhab-2.0.0-SNAPSHOT.zip) of openHAB2.

2. Unzip the file in your chosen directory (e.g. `C:\openhab`)

3. Start the server: Launch the runtime by executing the script `start.bat` and wait a while for it to start and complete.

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
When you have a setup that you are happy with, it would be a good idea to make a backup of the whole `C:\openhab` folder. Which can be used any time after a failure.

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

{% include contribution-wanted.html %}
