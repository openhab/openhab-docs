---
layout: documentation
title: Synology DiskStation
---

:::tip Note

openHAB 4.x series requires Java 17.
Java 21 can be used openHAB 4.x, and is required for openHAB 5.
You will need to provide a working Java installation on your DiskStation.
The sections below are written for Java 11 but the docs are not updated currently, since we have not secured knowledge about how to install Java 17 on the DiskStation.
If you can provide some proper sources and explanation, we are happy to include your contribution into this article.

:::

# Synology DiskStation DSM 7.0 and higher

The [DiskStation by Synology](https://www.synology.com/en-us/dsm) is a famous NAS server solution for your home, allowing the installation of additional packages.
For versions of DSM before 7.0 please refer to the second half of this page.

## Prerequisite - prepare the Synology OS for openHAB

Synology NAS is based on Linux but it has limitations since it is not a full server.
There are some shortcuts you have to take to make it work.
For the use of openHAB you need some preparation steps.
For this create a ssh session into your NAS.
For reference how to do that: I found this [youtube tutorial](https://www.youtube.com/watch?v=BCCIMRbAUp8).
When you are in the secured shell first thing to do is to create the user openhab.

```bash
sudo synouser --add openhab habopen "openhab" 0 "" 0
sudo synogroup --add openhab openhab
```

If you are going to use an USB like a Z-Wave dongle add another group for openhab and change the port access for ttyACM0 if that is the port for your USB device

```bash
sudo synogroup --add dialout openhab
sudo chown root:dialout /dev/ttyACM0
sudo chmod g+rw /dev/ttyACM0
```

Then for installation purposes run the following command:

```bash
sudo id openhab
```

The result will something like

```bash
uid=1032(openhab) gid=100(users) groups=100(users),65537(dialout),65539(openhab)
```

In this case we need the 1032 as the user and the 65537 as the group. Write them down.

## Docker

:::tip Note
DSM 7 does not longer support Java 11 directly.
You either have to run openHAB in a Docker container or have to take care of a properly installed Java 11 runtime on your own.

The following part shows the Docker based installation.
You may also get Java 11 via [community package](https://synocommunity.com/package/java-11-openjdk) and go own with the manual for [older DSM Versions](#older-synology-diskstations-till-dsm-6).
:::

And that also makes the installation easier to maintain.
It works out of the box a bit different then the normal Docker installation as described in de openHAB documentation.
Docker is a containerization platform and is used to run lightweight containers.
These containers require a very little amount of memory and system resources to run.
Synology NAS has official support for Docker.
To use Docker, you need to install the Docker app from the Synology Web GUI.

- Login and open the DiskStation Manager.
- Go to Main Menu → Package Center.
- Search for "Docker" and install.
- Click "Open".
- Go to "Registry", here are all the available Docker images and search for openhab.
- Choose the "openhab/openhab" image and click "Download". Select "latest" since that is the latest stable version of openHAB. The Docker image is added to "Image"
- Go to "Image" and click on the openhab/openhab image and click "Add".

Here comes the part where you really notice the difference between the Synology OS and Linux.

- In the Container Manager, select "Container" and then "Create"
- Select the image (openhab/openhab:latest)
- Fill in a name for the container (eg. "openhab" note: space and some special characters are not allowed).
- Enable the resource limitation, CPU on Med and Memory limit on 2048MB.
You can increase this in the future if you like.
- Click on "Advanced"

:::tip DSM 7.2 Access Zwave USB Stick

- Set `/dev/ttyACM0` permissions inside the openhab container - [OH Docs](docker.html#usb-sticks)

   ```bash
   root@openhab:/openhab# chown openhab:openhab /dev/ttyACM0
   root@openhab:/openhab# chmod o+rw /dev/ttyACM0
   ```

   To preserve the changes on container reboot see [Executing shell scripts before openHAB is started](https://github.com/openhab/openhab-docker#executing-shell-scripts-before-openhab-is-started) article.
:::

### Advanced Settings

- Enable auto-restart

### Port Settings

- No change

### Volume Settings

- Click on "Add Folder" and "Create Folder" under the folder "docker" with the name "openhab".
- Create the folder "addons" in the folder "openhab"
- Create the folder "conf" in the folder "openhab"
- Create the folder "userdata" in the folder "openhab"
- Now map those folders
  - Click on "addons" then click on "Select"
  - Add the mount path "/openhab/addons" in the input field next to /docker/openhab/addons
  - Repeat this step for the "conf" and "userdata" folders

### Environment

- Remove the variables EXTRA_JAVA_OPTS & EXTRA_SHELL_OPTS using the minus buttons
- Update the GROUP_ID to reflect the group created above (eg. 65537)
- Update the USER_ID to reflect the user created above (eg. 1032)

### Capabilities

- If you're wanting to access the Synology device's USB Port(s), enable "Execute container using high privilege".
::: tip Note
This is needed for the host resources like '/dev/ttyACM0' for Z-Wave binding, the TCP stack for Network Binding, etc.
It will run the Docker container as root, the application in the container is still limited.
Several issues are already raised for this at Synology.
:::

:::tip DSM 7.2

- Check [here](https://kb.synology.com/en-nz/DSM/tutorial/What_kind_of_CPU_does_my_NAS_have) what kind of CPU does your Synology NAS have.
- Download the proper USB to UART driver from [here](https://github.com/robertklep/dsm7-usb-serial-drivers/tree/main/modules) to Synology `/lib/modules`.
- Create Synology Boot-up Scheduled Task

   ```bash
   #!/bin/sh
   chmod 760 /var/lock
   insmod /lib/modules/cp210x.ko > /dev/null 2>&1 # cp210x.ko sample
   chown root:dialout /dev/ttyACM0
   chmod g+rw /dev/ttyACM0
   ```

   :warning: This will result in Synology notification, like "Security risks detected on NAS02. Please go to Security Advisor for more information. Details."
:::

### Network

- Select 'host' if you are planning to use the IP stack in bindings or if you are not sure what this does.

### Execution Command

- Nothing to do here

### Links

- Nothing to do here

Click "Next"

### Summary

Here you can check if all changes where set correctly for your openHAB container, enable "Run this container after the wizard is finished" and press "Done".
openHAB is now running on your NAS.
Give it a few minutes to start up.

## Shells

If you select the container running and press "Details" you will see a window with more information on this running container.
One particular menu item you have to check is "Terminal".
In here you see the name of the container left from the black field and if you press that you'll get the Karaf terminal for openHAB.

If you click on "Create' it creates a bash terminal, click on bash and you'll have access to a shell in the container.

By now the container is up and running, goto `http://[your-NAS-ip-or-host-name]:8080` and the welcome to openHAB.
If you use p.e. a Z-Wave dongle on ttyACM0 you can now add the Z-Wave binding. Once openHAB has been configured under the binding Z-Wave add a controller manually and change the port to /dev/ttyACM0. The Z-Wave controller gets online and you will discover the Z-Wave devices. If this is not working, please verify you enabled high privilege.

::: tip Note
The device path (`/dev/ttyACM0`) or container name (`openhab`) could be different in your system, please modify the commands accordingly.
:::

---

# Older Synology DiskStations till DSM 6

The [DiskStation by Synology](https://www.synology.com/en-us/dsm) is a famous NAS server solution for your home, allowing the installation of additional packages.
We are proud to be able to provide an [openHAB Synology package](https://github.com/openhab/openhab-syno-spk).

## Prerequisite - Install Java

Current releases of openHAB require Oracle Java due to the generation of certificates based on [EC](https://en.wikipedia.org/wiki/Elliptic_curve_cryptography) which is not available in free Java implementations.
If you see the following error you are likely using OpenJDK:

```text
java.security.NoSuchAlgorithmException: EC KeyPairGenerator not available
```

The easiest way to install Java is to install the Synology Java8 package from Package Center.
After installation, OpenJDK will be used by default and must be upgraded.
To update Oracle JDK to Java8, click the Install Java / Upgrade Java button and then follow the onscreen instructions.
The filename and format of the uploaded file will be checked before installation.

**Armada 370/XP** systems running DSM 6 require hard float ABI rather than the soft float used on DSM 5.
If there is not a Java8 package in the Package Center, your machine may not be supported by the [Synology package](https://www.synology.com/en-us/dsm/packages/Java8).

The best option for older unsupported Synology models such as **PowerPC** and **ARMv5** is to include the [PC-Loadletter](https://pcloadletter.co.uk/2011/08/23/java-package-for-synology/) Repo.
[Download Java SE](https://www.oracle.com/technetwork/java/embedded/embedded-se/downloads/index.html) [(latest ARMv6)](https://www.oracle.com/technetwork/java/embedded/embedded-se/downloads/javase-embedded-downloads-2209751.html) [(Java Cryptography Extension if required)](https://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html) and put them in the _public_ folder of your NAS.
Then start the installation of Java8 SE.

_Note that it may be necessary to rename the downloaded file to match the name the Loadletter utility expects which may be an older version than what is currently available._

The **Java8 PowerPC** versions are available from [Oracle](https://www.oracle.com/technetwork/java/embedded/embedded-se/downloads/javaseembedded8u6-2406243.html).

## Installation

Download the latest SPK package: [Releases](https://github.com/openhab/openhab-syno-spk/releases)
The SPK is a wrapper to download the latest openHAB release and does not contain openHAB itself.

1. Login and open the DiskStation Manager.
1. Go to Control Panel → User → Advanced → User Home and check 'Enable user home service'
1. Go to Main Menu → Package Center.
1. Click on the Manual Install button.
1. Click "Choose File" and select the previously downloaded openHAB `.spk` file.
1. On the confirmation page: If you would like the package to run immediately after installation, make sure the box next to "Run after Installation" is ticked.
1. Click Apply to start installation.

If your NAS cannot connect to the internet, the installer will tell you to download and place the ZIP file into your NAS public folder.

## Configuration

The location of configuration files by openHAB differs depending on wether or not a shared folder named `public` exists:

- with public share folder: `/volume1/public/openHAB/conf/`
- without public share folder: `/volume1/@appstore/openHAB/conf/`

For certain Synology models the `public` folder is created automatically during the first setup.
The administrator can also create a public shared folder if desired.

Synology does not document which models will automatically create a public folder.
Refer to the Synology knowledge base article on [Shared Folder](https://www.synology.com/en-us/knowledgebase/DSM/help/DSM/AdminCenter/file_share_desc) to learn more.

## Logging

The openHAB log files can be found here:
`/volume1/@appstore/openHAB/userdata/logs/`.

From Version openHAB-2.2.0.006 the SPK generates two log files located at `/var/log/`.

The first log file `openHAB-install.log` will be generated during the installation.
If you can't install the openHAB SPK, please have a look inside the file.

The second log `openHAB-start-stop.log` will be generated by starting and stopping openHAB inside the Package Manager.
