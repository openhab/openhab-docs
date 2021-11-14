---
layout: documentation
title: Synology DiskStation
---

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
sudo synouser --add openhab habopen
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
In this case we need the 1032 as the user and the 65539 as the group. Write them down.

## Docker

DSM 7 does no longer support Java 11 directly and therefor openHAB has to run in a Docker container. 
And that also makes the installation easier to maintain. 
It works out of the box a bit different then the normal Docker installation as described in de openHAB documententation.
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
- On the create container window fill a name for the container (space and some special characters are not allowed). 
- Next enable "Execute container using high privilege". 
::: tip Note 
This is needed for the host resources like '/dev/ttyACM0' for Z-Wave binding, the TCP stack for Network Binding, etc. 
It will run the Docker container as root, the application in the container is still limited. 
Several issues are already raised for this at Synology.
:::
- Enable the resource limitation, CPU on Med and Memory limit on 2048MB. 
You can increase this in the future if you like.
- Click on "Advanced"

### Advanced Settings

- Enable auto-restart

### Volume

- Click on "Add Folder" and "Create Folder" under the folder "docker" with the name "openHAB".
- Create the folder "userdata" in the folder "openHAB" 
- Create the folder "conf" in the folder "openHAB" 
- Create the folder "addons" in the folder "openHAB" 
- Now select "userdata" and click on "Select"
- Change the mount path to "/openhab/userdata" this will connect the Docker containers path "/openhab/userdata" to your Synology's local path "docker/openHAB/userdata" where you can reach it from outside the Docker.
- Click on "Add Folder", select "docker/openHAB/conf", click on select and change the mount path to "/openhab/conf".
- Repeat this for addons.

### Network

- Select 'host' if you are planning to use the IP stack in bindings or if you are not sure what this does.

### Port Settings

- No change

### Links

- Nothing to do here

### Environment

- In the list find the variable "GROUP_ID" and put your previous written down id of the group openhab here, in this tutorial it is 65539.
- In the same list locate "USER_ID" and fill the id of the user openhab, in this tutorial 1032.
- Click on "Apply".

### Summary 

Here you can check if all changes where set correctly for your openHAB container, enable "Run this container after the wizard is finished" and press "Done".
OpenHAB is now running on your NAS. 
Give it a few minutes to start up.

## Shells

If you select the container running and press "Details" you will end up on  a windows where you get more information on this running container. 
One particular menu item you have to check is "Terminal". 
In here you see the name of the container left from the black field and if you press that you'll get the Karaf terminal for OpenHAB.

If you click on "Create' it creates a bash terminal, click on bash and you'll have access to a shell in the container.

By now the container is up and running, goto "http://[your-NAS-ip-or-host-name]:8080" and the welcome to OpenHAB.
If you use p.e. a Z-Wave dongle on ttyACM0 you can now add the Z-Wave binding. Once OpenHAB has been configured under the binding Z-Wave add a controller manually and change the port to /dev/ttyACM0. The Z-Wave controller gets online and you will discover the Z-Wave devices. If this is not working, please verify you enabled high privilege.

::: tip Note
The device path (`/dev/ttyACM0`) or container name (`openhab`) could be different in your system, please modify the commands accordingly.
:::

---

# Older Synology DiskStations till DSM 6

The [DiskStation by Synology](https://www.Synology.com/en-us/dsm) is a famous NAS server solution for your home, allowing the installation of additional packages. 
We are proud to be able to provide an [OpenHAB Synology package](https://github.com/openhab/openhab-syno-spk).

## Prerequisite - Install Java

Current releases of OpenHAB require Oracle Java due to the generation of certificates based on [EC](https://en.wikipedia.org/wiki/Elliptic_curve_cryptography) which is not available in free Java implementations.
If you see the following error you are likely using OpenJDK:

```text
java.security.NoSuchAlgorithmException: EC KeyPairGenerator not available
```

The easiest way to install Java is to install the Synology Java8 package from Package Center.
After installation, OpenJDK will be used by default and must be upgraded.
To update Oracle JDK to Java8, click the Install Java / Upgrade Java button and then follow the onscreen instructions.
The filename and format of the uploaded file will be checked before installation.

**Armada 370/XP** systems running DSM 6 require hard float ABI rather than the soft float used on DSM 5.
If there is not a Java8 package in the Package Center, your machine may not be supported by the [Synology package](https://www.Synology.com/en-us/dsm/packages/Java8).

The best option for older unsupported Synology models such as **PowerPC** and **ARMv5** is to include the [PC-Loadletter](https://pcloadletter.co.uk/2011/08/23/java-package-for-synology/) Repo.
[Download Java SE](https://www.oracle.com/technetwork/java/embedded/embedded-se/downloads/index.html) [(latest ARMv6)](https://www.oracle.com/technetwork/java/embedded/embedded-se/downloads/javase-embedded-downloads-2209751.html) [(Java Cryptography Extension if required)](https://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html) and put them in the *public* folder of your NAS.
Then start the installation of Java8 SE.

*Note that it may be necessary to rename the downloaded file to match the name the Loadletter utility expects which may be an older version than what is currently available.*

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
Refer to the Synology knowlegde base article on [Shared Folder](https://www.synology.com/en-us/knowledgebase/DSM/help/DSM/AdminCenter/file_share_desc) to learn more.

## Logging

The openHAB log files can be found here:
`/volume1/@appstore/openHAB/userdata/logs/`.

From Version openHAB-2.2.0.006 the SPK generates two log files located at `/var/log/`.

The first log file `openHAB-install.log` will be generated during the installation. 
If you can't install the OpenHAB SPK, please have a look inside the file.

The second log `openHAB-start-stop.log` will be generated by starting and stopping openHAB inside the Package Manager.
