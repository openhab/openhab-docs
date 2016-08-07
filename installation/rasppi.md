---
layout: documentation
title: Raspberry Pi
---

{% include base.html %}

# Raspberry Pi

Because of it's low price, it's small form factor and the low energy consumption, the [Raspberry Pi](https://www.raspberrypi.org) is a quite popular platform for openHAB.
Be sure to use a [Raspberry Pi Generation 2](https://en.wikipedia.org/wiki/Raspberry_Pi#Specifications) or newer.

![Raspberry Pi 2 Model B](https://www.raspberrypi.org/wp-content/uploads/2015/02/Pi_2_Model_B.png)

## Introduction

In this article you will find **suggestions** on how to configure a dedicated Raspberry Pi to run as openHAB server.
Your personal preferences and needs may differ!

There’s no pre-configured image for openHAB yet.
Setting up openHAB shouldn't be a problem following the instructions below.

If you are unfamiliar with Linux, SSH and the Linux console or if you want to improve your skills, read up on these important topics.
A lot of helpful articles can be found on the internet, including:

* The [raspberrypi.org help articles](https://www.raspberrypi.org/help).
* Technical in-detail articles at [eLinux.org](http://elinux.org/RPi_Tutorials).
* "Learn the ways of Linux-fu, for free" interactively with exercises at [linuxjourney.com](https://linuxjourney.com/).

## Recommended Setup

You will need:

* Raspberry Pi (Generation 2 or newer), compare your existing device [here](https://en.wikipedia.org/wiki/Raspberry_Pi#Connectors) if you are unsure.
* SD card (8GB or more)
* Power supply
* Ethernet connection

For the beginning, we recommend to [download](https://www.raspberrypi.org/downloads/raspbian) and [install](https://www.raspberrypi.org/documentation/installation/installing-images/README.md) the latest Raspbian SD card image (not the "lite" version).
Get your SD card and network cable plugged in, power up, and connect through the SSH remote console.

Execute the Raspbian configuration menu by running: `sudo raspi-config`

* Expand the file system
* Change your password
* (Change the host name, default: "raspberrypi")
* From the advanced menu, change the memory split to "16"
* Restart

As a good practice, run a full upgrade and install packages you like or need (a set of helpful packages is given as an example):

```
sudo apt-get update
sudo apt-get full-upgrade
sudo apt-get install screen mc vim nano curl wget unzip git htop vfu
```

Install openHAB on Linux. This can be done two ways:

* [Installation on Linux manually](linux.html)
* [Installation on Linux through APT](apt.html) (recommended)

### Permissions

<!-- Note to author: May be moved to linux.html while you are at it -->

Linux file permissions is one of the biggest sources of issues, Linux novices run into.
If you find yourself in a situation, where you have **no write access** to the openHAB configuration or system files, wrong permissions and/or the incorrect use of `sudo` are often the cause.

Train your understanding of Linux permissions at [linuxjourney.com/lesson/file-permissions](https://linuxjourney.com/lesson/file-permissions).

## Network Share

openHAB depends on configuration files and folders with custom content (details in [Configuration](http://docs.openhab.org/configuration/index.html) articles).
Because your openHAB installation is stored on a remote device, being able to easily access and modify these files from your local PC or Mac is important.
The recommended [Eclipse SmartHome Designer](http://docs.openhab.org/installation/designer.html) software does also depend on a mounted share to access the openHAB configuration files.

We will now guide you through the Samba network shares setup process.
Start by installing Samba. Afterwards open it's config file in your favorite editor:

```
sudo apt-get install samba samba-common-bin
sudo nano /etc/samba/smb.conf
```

Change the workgroup name if needed, otherwise uncomment and enable WINS support:

```
wins support = yes
```

Next, add the following lines to the end of the file:

```
[openHAB]
  comment=openHAB2 application
  path=/usr/share/openhab2
  browseable=Yes
  writeable=Yes
  only guest=no
  public=no
  create mask=0777
  directory mask=0777

[openHAB-etc]
  comment=openHAB2 site configuration
  path=/etc/openhab2
  browseable=Yes
  writeable=Yes
  only guest=no
  public=no
  create mask=0777
  directory mask=0777
```
Save and close the samba configuration file.

As you can see, we are creating two shares, one for the openHAB application files, one for the configuration files.
Please take note, that the mentioned paths will differ if you did not install through the package repository.

The shares are configured to be not open for guests or to the public.
Let's create an "openhab" samba user and set his password (e.g. "habopen"):

```
sudo smbpasswd -a openhab
```

Be aware, that creating and later using a specific user will ensure, that [permissions](#permissions) are honored.
Transfer the ownership of all openHAB files to the "openhab" user, making sure you will be able to write them:

```
sudo chown -hR openhab:openhab   /etc/openhab2 /usr/share/openhab2
```

Finally restart Samba:

```
sudo update-rc.d smbd enable
sudo update-rc.d nmbd enable
sudo service smbd restart
```

### Mounting Locally

After setting up and restarting Samba, check your connection to the shared folders and and create permanent mounts.
The shares might not be auto-discovered on your systems network devices page.
You'll have to manually connect:

* **On Mac OS X:** Open Finder -> Go -> Connect to Server: `smb://openhab@raspberrypi.local`
* **On Windows:** Open Windows Explorer -> Address bar: `\\raspberrypi.local` -> Right click a share and assign a drive letter

When asked, authenticate with the username openhab and the chosen password.
Be sure to use the right host name if you changed it to something different than "raspberrypi".
If you are not able to connect, try with the IP of your Raspberry Pi (e.g. `smb://openhab@192.168.0.2` or `\\192.168.0.2`).

If everything went well, you are set and ready to start [configuring](http://docs.openhab.org/configuration/index.html) your openHAB system.

## Viewing the Log Messages

<!-- Note to author: This part may be moved to a different article -->

In order to get more insight on what your openHAB system is doing and to see occurring error messages, it is recommended to always have a look on the openHAB log files. These will tell you everything you might need to know. Execute the following command in one session or have both files separated in sessions side by side:

```
tail -f /var/log/openhab2/openhab.log -f /var/log/openhab2/events.log
```

You could even set up an SSH configuration (in putty or similar) to automatically connect and execute the commands every time you start working on your setup.

With openHAB 2 you can also [use the Karaf console](http://docs.openhab.org/administration/logging.html#karaf-console) to have a colored glance at the logging information.

## Service

The following instructions are only relevant if you did a manual (non-apt) installation!

<!-- Note to author: Please move to linux.html while you are at it ;) -->

Under Raspbian Jessie, the following steps will allow you to register openHAB as a service, so that it runs at startup and automatically restarts if openHAB crashes.

 1. Make sure openHAB is installed somewhere, for the purpose of this guide it's installed in /opt/openhab2.
 2. Create the following file called "openhab.service" in /lib/systemd/system/ replacing the username with whichever user runs openHAB on your setup.
 
```ini
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

```text
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

