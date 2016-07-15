---
layout: documentation
---

{% include base.html %}

# Installation on a Raspberry Pi

Here you will find some suggestions on how to configure a dedicated [RaspberryPi](https://www.raspberrypi.org) to run as a openHAB server. Your personal preferences and needs may differ.

There’s no pre-configured image for openHAB, so installation is done the old fashioned way via a command line.

Start with the latest (full) [Raspbian SD image](https://www.raspberrypi.org/downloads/raspbian) (not the “lite” version, these don’t include the Java Virtual Machine). Get your network cable plugged in, then boot up, and navigate through SSH. Run:

```
sudo raspi-config
```

Expand the filesystem; and from the advanced menu, change the memory split to 16. When are done, restart, and as good practice, run a full update

Install openHAB on Linux, see [Installation on Linux through APT](http://docs.openhab.org/installation/apt.html)

Curiously, everything was installed as owned by “root”. We need to fix that with the following commands.

```
sudo chown -hR openhab:openhab /etc/init.d/openhab2
sudo chown -hR openhab:openhab /usr/share/openhab2
```

Next, we’ll install Samba and share the configuration and user folders – this will make it easier to install add-ons and change the sitemap remotely.

```
sudo apt-get install samba samba-common-bin
sudo nano /etc/samba/smb.conf
```

Change the workgroup name if needed, but otherwise enable WINS support:

```
wins support = yes
```

(you’ll need to uncomment the line, and change no to yes)

then add the following to the share definitions section (scroll all the way down to the bottom of the long file):

```
[openHAB]
 comment=openHAB2 application
 path=/usr/share/openhab2
 browseable=Yes
 writeable=Yes
 only guest=no
 create mask=0777
 directory mask=0777
 public=no
 [openHAB-etc]
 comment=openHAB2 site configuration
 path=/etc/openhab2
 browseable=Yes
 writeable=Yes
 only guest=no
 create mask=0777
 directory mask=0777
 public=no
```

Also commented out the Printers section. Made two shares, then the configuration files are actually stored separately to the add-ons.

Save and exit. We finally need to set a Samba password for the openhab user:

```
sudo smbpasswd -a openhab
```

Suggest “openhab” as the password just for ease of use, but it doesn’t really matter.

The method of restarting Samba has changed in the latest Raspian. Here’s the updated instructions:

```
sudo update-rc.d smbd enable
sudo update-rc.d nmbd enable
sudo service smbd restart
```

After restarting Samba (older installs use sudo service samba restart), test you can access the shared drive. It might not be auto-discovered on a Mac; but you can use the Finder -> Go -> Connect to Server and the address

```
smb://openhab@raspberrypi.local
```

Authenticate with username openhab and the chosen password, then open up both the shares to have a look around. Then should even be able to open http://raspberrypi.local:8080/ in the web browser, but then will be met with an error because don´t haven’t create a sitemap yet. That’s normal.


Now would be a good time to learn the command to tail the openHAB log so you can keep an eye on errors.

```
tail -f /var/log/openhab2/openhab.log
```

Keep that running and open in a separate SSH window at all times.

