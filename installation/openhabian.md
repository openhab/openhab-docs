---
layout: documentation
title: openHABian
source: https://github.com/openhab/openhabian/blob/master/docs/openhabian.md
---

{% include base.html %}

<!-- Attention authors: Do not edit directly. Please add your changes to the source repository -->

::: tip TL;DR
Jump to [install instructions](#raspberry-pi-prepackaged-sd-card-image). But read the full docs before you ask for help !
:::

# openHABian - Hassle-free openHAB Setup
The Raspberry Pi and other small single-board computers are quite famous platforms for openHAB.
However, setting up a fully working Linux system with all recommended packages and openHAB recommendations is a **boring task**, takes a lot of time and **Linux newcomers** shouldn't need to worry about technical details like these.

<p style="text-align: center; font-size: 1.2em; font-style: italic;"><q>A home automation enthusiast doesn't have to be a Linux enthusiast!</q></p>

openHABian aims to provide a **self-configuring** Linux system setup specific to the needs of every openHAB user.
It provides:

*   complete **SD-card images pre-configured with openHAB** for the Raspberry Pi line of SBCs 
*   The openHABian configuration tool to set up and configure openHAB and many related things on any Debian based system

#### Table of Contents
{::options toc_levels="2..3"/}
-   TOC
{:toc}

## Features
Out of the box, the openHABian image provides

-   Hassle-free setup without a display or keyboard, connected via Ethernet or [WiFi](#wifi-based-setup-notes)
-   the latest stable version of openHAB
-   Zulu Embedded OpenJDK Java 8, 11 or AdoptOpenJDK
-   [openHABian Configuration Tool](#openhabian-configuration-tool) including updater functionality
-   web based openHAB Log Viewer (based on [frontail](https://github.com/mthenw/frontail))
-   Samba file sharing [pre-configured to use shares](https://www.openhab.org/docs/installation/linux.html#mounting-locally)
-   Useful Linux packages pre-installed, including `vim, mc, screen, htop, ...`
-   Login information screen, powered by [FireMotD](https://github.com/OutsideIT/FireMotD)
-   Customized Bash shell experience, settings and openHAB syntax highlighting for [vim](https://github.com/cyberkov/openhab-vim) and [nano](https://github.com/airix1/openhabnano)
-   [Mosquitto](https://mosquitto.org) MQTT broker
-   the [InfluxDB](https://www.influxdata.com/) database to store home automation data and [Grafana](https://grafana.com/) to visualize it
-   FIND, the [Framework for Internal Navigation and Discovery](https://www.internalpositioning.com/)
-   [Tailscale](https://tailscale.com/blog/how-tailscale-works/) VPN and [WireGuard](https://www.wireguard.com/) for remote VPN access

The included **openHABian Configuration Tool** [`openhabian-config`](#openhabian-configuration-tool) provides the following optional settings and components:

![openHABian-config menu](images/openHABian-config.png)

-   Switch openHAB versions 2 vs 3 and select the latest *Release*, *Milestone* or *Snapshot* [*unstable/SNAPSHOT* build](https://www.openhab.org/docs/installation/linux.html#changing-versions) version
-   Install and Setup a [reverse proxy](security.html##running-openhab-behind-a-reverse-proxy) with password authentication and/or HTTPS access (incl. [Let's Encrypt](https://letsencrypt.org) certificate) for self-controlled remote access
-   manually set up a WiFi connection
-   Setup [Backup](#availability-and-backup) for your system
-   Easily install and preconfigure [Optional Components](#optional-components) of your choice
-   configure Raspberry Pi specific functions
    -   Prepare the serial port for the use with extension boards like RaZberry, Enocean Pi, ...
    -   Use ZRAM to mitigate SD card wearout due to excessive writes
    -   Move the system partition to an external USB stick or drive
... and much more

## Hardware

### Hardware recommendation
Let's put this first: our current recommendation is to get a RPi 4 with 2 or 4 GB,
a 3 A power supply and a 16 GB SD card.
Also get another 32 GB or larger SD card and a USB card reader to make use of the
["auto backup" feature](docs/openhabian.md#Auto-Backup).

::: warning ATTENTION
Avoid getting the 8 GB model of RPi 4. 8 GB are a waste of money and it has issues,
you must [disable ZRAM](https://github.com/openhab/openhabian/blob/master/docs/openhabian.md#disable-zram) or use the 64bit image (untested).
:::

### Hardware and OS support
As of openHABian version 1.6 and later, all Raspberry Pi models are supported as
hardware. Anything x86 based may work or not. Anything else ARM based such as ODroids,
OrangePis and the like may work or not. NAS servers such as QNAP and Synology
boxes will not work. Support for PINEA64 was dropped in this current release.<br>
We strongly recommend that users choose Raspberry Pi 2, 3 or 4 systems to have
1 GB of RAM or more. RPi 1 and 0/0W only have a single CPU core and 512 MB.
This can be sufficient to run a smallish openHAB setup, but it will
not be enough to run a full-blown system with many bindings and memory consuming
openHABian features/components such as ZRAM, InfluxDB or Grafana.
We do not actively prohibit installation on any hardware, including unsupported
systems, but we might skip or deny to install specific extensions such as those
memory hungry applications named above.

Supporting hardware means testing every single patch and every release. There
are simply too many combinations of SBCs, peripherals and OS flavors that
maintainers do not have available, or, even if they did, the time to spend on
the testing efforts that is required to make openHABian a reliable system.
Let's make sure you understand the implications of these statements: it means
that to run on hardware other than RPi 2/3/4 or (bare metal i.e. not virtualized)
x86 may work but this is **not** supported.

It may work to install and run openHABian on unsupported hardware. If it does
not, you are welcome to find out what's missing and contribute it back to
the community with a Pull Request. It is sometimes simple things like a naming
string. We'll be happy to include that in openHABian so you can use your box
with openHABian unless there's a valid reason to change or remove it.
However, that does not make your box a "supported" one as we don't have it
available for our further development and testing. So there remains a risk that
future openHABian releases will fail to work on your SBC because we changed a
thing that broke support for your HW - unintentionally so however inevitable.

For ARM hardware that we don't support, you can try any of the [fake hardware parameters](openhabian.md/#fake-hardware-mode)
to 'simulate' RPi hardware and Raspi OS. If that still doesn't work for
you, give [Ubuntu](https://ubuntu.com/download/iot) or [ARMbian](https://www.armbian.com/) a try.

Going beyond what the RPi image provides, as a manually installed set of
scripts, we support running openHABian on x86 hardware on generic Debian.
On ARM, we only support Raspberry Pi OS.
These are what we develop and test openHABian against.
We do **not** actively **support Ubuntu** so no promises but we provide code
"as-is" that is known to run on there. Several optional components though,
such as WireGuard or Homegear, are known to expose problems.

We expect you to use the current stable distribution, 'buster' for Raspberry
Pi OS (ARM) and Debian (x86) and 'focal' for Ubuntu (x86) this is.
To install openHABian on anything older or newer may work or not. If you
encounter issues, you may need to upgrade first or to live with the consequences
of running an OS on the edge of software development.

Either way, please note that you're on your own when it comes to configuring and
installing the HW with the proper OS yourself.

### 64 bit ?
RPi3 and 4 have a 64 bit processor and you may want to run openHAB in 64 bit.
We provide a 64bit version of the image but it is unsupported so use it at your
own risk. Please don't ask for support if it does not work for you.
It's just provided as-is.
Be aware that to run in 64 bit has a major drawback: increased memory usage.
That is not a good idea on a heavily memory constrained platform like a RPi.
Also remember openHABian makes use of Raspberry Pi OS which as per today still
is a 32 bit OS.
We are closely observing development and will adapt openHABian once it will
reliably work on 64 bit.<br/>

On x86 hardware, 64 bit is the standard.

## Raspberry Pi prepackaged SD card image
**Flash, plug, wait, enjoy:**
The provided image is based on the [Raspberry Pi OS Lite](https://www.raspberrypi.org/software/operating-systems/#raspberry-pi-os-32-bit) (previously called Raspbian) standard system.
On first boot, the system will set up openHAB and the mentioned settings and tools.
All packages will be downloaded in their newest version and configured to work without further modifications.
The whole process will take a few minutes, then openHAB and all other needed tools to get started will be ready to use without further configuration steps.
openHABian is designed as a headless system, you will not need a display or a keyboard.

::: warning
Make sure to follow these instructions and especially set the correct clonebranch, otherwise you will end up with an openHAB 3 installation instead of openHAB 2
:::

**Setup:**

-   [Download the latest "openHABian" SD card image file](https://github.com/openhab/openhabian/releases) (Note: the file is *xz* compressed)
-   Write the image to your SD card (e.g. with [Etcher](https://www.balena.io/etcher/) or official [Raspberry Pi Imager](https://www.raspberrypi.org/software/), both able to directly work with *xz* files
-   Add `clonebranch=stable` to your [openhabian.conf](#openhabian-conf) file like described in the corresponding chapter
-   Insert the SD card into your Raspberry Pi, connect Ethernet ([WiFi also supported](#wifi-based-setup-notes)) and power on.
-   Wait approximately **15-45 minutes** for openHABian to do its magic. <br>(You can check the progress in your web-browser [here](http://openhabiandevice).)
-   Enjoy!

-   The device will be accessible by its IP or via the local DNS name `openhabiandevice` (or whatever you changed 'hostname' in `openhabian.conf` to)
-   Connect to the openHAB UI at [http://openhabiandevice:8080](http://openhabiandevice:8080)
-   [Connect to the Samba network shares](https://www.openhab.org/docs/installation/linux.html#mounting-locally) with username `openhabian` and password `openhabian`
-   Connect to the openHAB Log Viewer (frontail): [http://openhabiandevice:9001](http://openhabiandevice:9001)
-   If you encounter any setup problem, [please continue here](#successful)

You can stop reading now, openHABian has installed and configured your openHAB system and you can start to use it right away.
If you want to get in touch with the system or want to install one of the previously mentioned optional features, come back here later.

Ready for more?
[Connect to your Raspberry Pi SSH console](https://www.raspberrypi.org/documentation/remote-access/ssh/windows.md) using the username `openhabian` and password `openhabian`.
You will see the following welcome screen:

![openHABian login screen](images/openHABian-SSH-MotD.png)

➜ Continue at the ["openHABian Configuration Tool"](#openhabian-configuration-tool) chapter below!

<a id="manual-setup"></a>
### Other Linux Systems (add openHABian just like any other software)
Going beyond what the RPi image provides, you can also openHABian on x86 hardware on top of any existing Debian installation.
Please note that the unattended install is tailored to work for Raspberries. We cannot test HW/OS combos beyond RPis upfront so there is no promise for this work.
See the [Hardware and OS section](#hardware-and-os-support) for details on supported hardware and OSs before you proceed.
Note that although the core parts of openHABian were reported to work on there, Ubuntu is not supported and untested.
If you try and fail, please help and drop us a note on Github with debug log enabled, see [DEBUG guide](openhabian-DEBUG.md).
***

Start with a fresh installation of your operating system, login and run

```shell
# start shell as root user
sudo bash
```

then start installation

```shell
# install git - you can skip this if it's already installed
apt-get update
apt-get install git

# download, link and create config file
git clone -b openHAB3 https://github.com/openhab/openhabian.git /opt/openhabian
ln -s /opt/openhabian/openhabian-setup.sh /usr/local/bin/openhabian-config
cp /opt/openhabian/openhabian.conf.dist /etc/openhabian.conf
```
Edit `/etc/openhabian.conf` to match your needs, then finally use

```shell
openhabian-config unattended
```
to install.

#### Interactive install on generic x86 Linux
We strongly recommend you to use the automated install but you actually *can* walk through the interactive tool.
Start `openhabian-config`.
Get the bare minimum you will *need* installed by selecting menu option 03.
To install the recommended components that automated install will get in one go select menu options 33, 32, 31, 11, 12, 15, Zulu 11 OpenJDK 64-bit (in menu 4X), 13, 16, 14, 21, 38, 53, 52.
We try to make install options independent of each other but there may be dependencies we are not aware of left so any other order may or may not work.

➜ Continue at the ["openHABian Configuration Tool"](#openhabian-configuration-tool) chapter below

## openHABian Configuration Tool
The following instructions are developed for a Raspberry Pi but should be applicable to all hardware / all openHABian environments.
Once connected to the command line console of your system, please execute the openHABian configuration tool by typing the following command:

(Hint: sudo executes a command with elevated rights and will hence ask for your password: `openhabian`).

```shell
sudo openhabian-config
```

![openHABian-config menu](images/openHABian-config.png)

The configuration tool is the heart of openHABian.
It is not only a menu with a set of options, it's also used in a special unattended mode to automate the setup run, either as part of the RPi image or in a manual install run.

⌨ - A quick note on menu navigation.
Use the cursor keys to navigate, <kbd>Enter</kbd> to execute, <kbd>Space</kbd> to select and <kbd>Tab</kbd> to jump to the actions on the bottom of the screen. Press <kbd>Esc</kbd> twice to exit the configuration tool.

### Linux Hints
Many helpful articles can be found on the internet, for example:

-   "Learn the ways of Linux-fu, for free" interactively with exercises at [linuxjourney.com](https://linuxjourney.com).
-   The official Raspberry Pi help articles over at [raspberrypi.org](https://www.raspberrypi.org/help)
-   "Now what?", Tutorial on the Command line console at [LinuxCommand.org](http://linuxcommand.org/index.php)

*The good news:* openHABian helps you to stay away from Linux - *The bad news:* not for long...

Regardless of if you want to copy some files or are on the search for a solution to a problem, sooner or later you'll have to know some Linux.
Take a few minutes to study the above Tutorials and get to know the most basic commands and tools to be able to navigate on your Linux system, edit configurations, check the system state or look at log files.
It's not complicated and something that doesn't hurt on one's résumé.

### First steps with openHAB
After your first setup of openHABian is successful and you are able to access the openHAB dashboard, you should dig into the possibilites.
Install [Bindings](https://www.openhab.org/addons/), discover your devices, and [configure your smart home](https://www.openhab.org/docs/configuration/).
You might want to start defining [Items](https://www.openhab.org/docs/configuration/items.html), [Sitemap](https://www.openhab.org/docs/configuration/sitemaps.html) and [HABPanel](https://www.openhab.org/docs/configuration/habpanel.html) dashboard for your home, but these are just some first hints.
Be sure to read up on the [Configuration](https://www.openhab.org/docs/configuration/) section of the documentation pages to learn more.

### Further configuration steps
openHABian is supposed to provide a ready-to-use openHAB base system.
There are a few things, however, we need you to decide and act on right now at the beginning:

-   **Delayed Rules loading** openHAB startup times can be annoyingly long. There's an optimization available that *delays* loading the rules. It quickly renames rules forth and back after 2 minutes, *effectively speeding up* openHAB startup. This is setup by default, you can disable this via \[menu option: 44\].
-   **Timezone:** The time zone of your openHABian system will be determined based on your internet connection. In some cases you might have to adjust that setting.
-   **Language:** The `locale` setting of the openHABian base system is set to "en_US.UTF-8". While this setting will not do any harm, you might prefer e.g. console errors in German or Spanish. Change the locale settings accordingly. Be aware, that error solving might be easier when using the English error messages as search phrases.
-   **Passwords:** Relying on default passwords is a security concern you should care about! The openHABian system is preconfigured with a few passwords you should change to ensure the security of your system. This is especially important if your system is accessible from outside your private subnet.

All of these settings can be changed via the openHABian configuration tool.

Here are the passwords in question with their respective default "username:password" values.
They can be changed from openHABian menu.

### Passwords
-   User password needed for SSH or sudo (e.g. "openhabian:openhabian")
-   Samba share password (e.g. "openhabian:openhabian")
-   openHAB remote console (e.g. "openhab:habopen")
-   Amanda backup password (no default, applied when installing)
-   Nginx reverse proxy login (no default, applied when installing) *For manual configuration see [here](https://www.openhab.org/docs/installation/security.html#adding-or-removing-users).*
-   InfluxDB (No password set by default)
-   Grafana visualization ("admin:admin")

## Availability and Backup
openHAB is designed to reliably run 24 hours a day, seven days a week - and so should be your server.
This is the right time to prepare your system for disasters such as getting hit by the SD card wearout/corruption problem which is quite common among users of single board computers such as Raspberry Pis. openHABian has a number of features built in to enhance resilience:

1.  the ZRAM feature moves write intensive parts of openHABian into RAM to mitigate the risk of SD card corruption. See [community thread](https://community.openhab.org/t/zram-status/80996) for more up to date information.
WARNING: power failure will result in some data to get lost (albeit the system should continue to run). Get an UPS.
ZRAM is enabled by default for swap, logs and persistence data. You can toggle use in \[menu option 38\].
2.  Move the root filesystem to USB-attached memory. WARNING: USB sticks are as susceptible to flash wearout as SD cards are, making ZRAM the better choice for a standard Pi to run off its internal SD card. But you can use this option to migrate your system to a safe medium such as an SSD or HDD. \[menu option 37\]
3.  Use the openHAB integrated [openhab-cli tool](https://community.openhab.org/t/recommended-way-to-backup-restore-oh2-configurations-and-things/7193/82) to interactively backup/restore your openHAB **config** \[menu option 50/51\].
4.  Use [Amanda Network Backup](http://www.amanda.org/) for full system backups, documentation [here](https://github.com/openhab/openhabian/blob/master/docs/openhabian-amanda.md). \[menu option 52\]

Standard openHABian install enables ZRAM by default (#1). Once you attach a *safe* external medium to your system (such as an SSD), you can disable ZRAM (#1) and move the system over using menu options 37 (#2).
Finally, we strongly suggest you install Amanda (#4) right after you finish your setup. Amanda is to take care to backup the whole system to be able to quickly restore it when in need.
This is not done by default because it requires a number of user inputs, but you should not skip it for your own safety !

`Delayed rules load` will be enabled by default in openHAB 2 but disabled in openHAB 3 (which has a new startlevel system).
This function will rename the rules files so they get ignored by the starting openHAB instance, then after 2 minutes they're renamed back. You can toggle to use this feature in menu option 44.

## Setup notes

### On openHAB3
Starting with its general release, openHABian will install **openHAB 3** by default.
There's some big changes also to openHABian such as to install Java 11 and to use changed file and directory names.
Most directory names `... /openhab2/ ...` will become `... /openhab/ ...` (NOTE: not `openhab3`) plus there's changes in a number of places, often subtle ones like the name of Samba export shares to change.
As openHABian users will be running openHAB 2.X by the time 3.0 gets released, `openhabian-config` offers to migrate the openHABian environment and install openHAB3 for you.
Menu option 42 will do the upgrade. Be aware that it isn't the universal answer to all your migration needs - there is ONLY an openHAB upgrade path. You cannot downgrade from OH3 to OH2.

::: warning No downgrades
Take an openHAB config backup BEFORE you upgrade from openHAB v2 to v3. You should also take a system level backup !
:::
Menu option 42 can also do the downgrade and change the environment back to match openHAB 2 **BUT** it'll ONLY exchange the binary packages. There is no migration to change your configuration back to a OH2 compatible one. So it is essential that you take a backup before you upgrade. You will have to restore your setup from that backup after a downgrade using menu option 51 or by manually using `openhab-cli restore <archive file>`.
Note option 42 will also not downgrade Java. openHAB 2 however is known to run with Zulu Java 11 as well.

### `openhabian.conf`
You can actually set a number of parameters _before_ you run an unattended installation. This applies to the RPi image on an SD card as well as to a manual installation.
You can also try with a different set of parameters if your initial attempt fails:

-   Flash the system image to your micro SD card as described, do not remove the SD card yet
-   Access the first SD card partition. It's a vfat/FAT-32 (Windows) filesystem so just use the file explorer of your client PC.
-   Open the file `openhabian.conf` in a text editor
-   Uncomment and complete the lines to contain the parameters you want to set
-   Save, unmount/eject, remove and insert into the RPi and boot it
-   Continue with the instructions for your hardware

Mind the comments for each configuration parameter. Browse the next documentation section for more explanations.

#### Administration user
Raspberry Pi OS images include a Linux user (`pi`) that you can use for openHAB administration.
openHABian renames the user to what you specify in the `username` parameter and assigns the `userpw` password first, then it proceeds and makes various settings that are either useful (such as some aliases) or required to run openHAB.
You can also make use of this if you don't use the image but unattended installation on non-RPi hardware, openHABian will then _create_ that user for you if it does not yet exist.

#### admin key
Make the `adminkeyurl` point to an URL to contain a public SSH key. This will be included with your administration
user's `.ssh/authorized_keys` and the openHAB console so the admin user (yourself, usually) can login after installation.

#### WiFi based setup notes
If you own a RPi3, RPi3+, RPi4, a RPi0W or any other model with a compatible WiFi dongle you can set up and use openHABian via WiFi only.
For the WiFi based setup to work, you'll need to make your SSID and password known to the system before the first boot.
So in addition to the setup instructions given above, uncomment and complete the lines reading `wifi_ssid=""` and `wifi_psk=""` in `openhabian.conf`.

#### WiFi Hotspot
Whenever the WiFi interface wlan0 exists but does not have connectivity, openHABian will launch a **Hotspot**.
When you use your mobile phone to scan for WiFi networks, you should be seeing a new network called `openHABian-<n>`.
Connecting will work without a password. Once connected, open your browser and point it at `http://raspberrypi.local` or `http://comitup-<n>`.
This may or may not work for your mobile browser as it requires Bonjour/ZeroConf abilities. If you cannot connect to this address, go to `http://10.41.0.1`.
On that page you can select the SSID of the network you want to connect your system to. Provide the password and press the button.
Note that as soon as you do, the wlan0 IP address changes so your mobile browser will not be able to provide you any feedback if that worked out.
Try to ping the new system's hostname (default is `openHABianDevice`) or check DHCP on your router if your openHABian system appeared there.
For more information on this feature see [comitup-cli](https://davesteele.github.io/comitup/).
You can use `sudo comitup-cli` inside openHABian to change networks and eventually remove network credentials.
Note the hotspot may not only become available during installation: it will remain on standby and will show up again every time your `wlan0` interface is losing connectivity.
The hotspot feature is known to work on RPi 0W, 3 and 4 but is known to often expose problems with WiFi USB adapters.

#### Disable ZRAM
ZRAM is activated by default on fresh installations on ARM hardware except on a 8GB RPi4 as that is known to be incompatible at the time of writing, leading to kernel crashes.
If you want to disable ZRAM for a different reason, use `zraminstall=disable` in `openhabian.conf` to install without.

#### Debug mode
See [Troubleshooting](#troubleshooting) section if you run into trouble installing. If you want to turn on debug mode,
edit `openhabian.conf` and set the `debugmode=` parameter to either `off`, `on` or `maximum`.
Mind you that if you intend to open an issue, we need you to provide the output of `debugmode=maximum` so if you're in interactive mode, set your terminal to record output.

#### Auto-backup
You might want to setup openHABian to automatically backup and mirror your internal SD card to an external unit.
We suggest to use another SD card in an external card writer device so that in case your internal SD card fails,
you can switch SD cards to get the system back up running fast.
Note most "16GB" cards are not _exactly_ 16 GB and your new one mustn't have less bytes than the old one so
openHABian enforces the second card to have at least twice the size of your internal card.
We make use of that extra space as storage for the backup system.

To setup right at installation time:
Define `backupdrive=/dev/sdX` (replace X with the proper character) to enable this functionality right during unattended installation.
Eventually change `storagedir=/storage` to any other name.
The first attached disk type device is usually called `/dev/sda`.
openHABian will create partitions 1 and 2 to be mirrors of your internal card and will assign the remaining space
to a storage partition.
Full mirroring will take place semiannually and for the 2nd partition (Linux root), changes will be synced once a week.
See `systemctl list-timers`, timers are defined in `/etc/systemd/system/sd*.timer`.
The unattended install routine will also setup Amanda to take daily backups and store them to that third partition.
Use `storagecapacity=xxx` to override how much space to consume at most for Amanda backup storage (in MB).
If you choose to skip this during system installation, you can still setup both, mirroring and Amanda, at
any later time using the 5X menu options.

Menu 5X provides interactive access to the aforementioned functions:
`53 Setup SD monitoring` prepares the partitions on an SD card and sets up timers to execute both, a full mirroring
and complementary rsync 'diff' runs in a backup schedule.
`54 Raw copy SD` is a one-time raw copy (mirror) run.
`55 Sync SD` proagates (syncs) differences from your main SD card to your external card.

Should you need to switch over to your backup card, get a another new SD card to match the size of the broken card and use menu option 54 to copy your active backup card back to the new one and switch cards back as soon as possible.

#### Tailscale VPN network
Tailscale is a management toolset to establish a WireGuard based VPN between multiple systems if you want
to connect to openHAB(ian) instances outside your LAN over Internet.
It'll take care to detect and open ports when you and your peers are located behind firewalls.
[Download the client](https://tailscale.com/download) and eventually get the Solo service plan from Tailscale,
that's free for private use. This free service will automatically be selected when you fire up your first VPN node.
The Windows client has a link to the admin console where you can create pre-auth one-time keys. These you can put
as the `preauthkey` into `openhabian.conf` to automatically deploy remote openHABian nodes (unattended install)
and have them join the VPN.

#### IPv6 notes
You might encounter problems when you make use of IPv6 on some networks and systems. openHABian installation may stop or hang forever.
In that case *or if you are sure that you do not need IPv6 on your openHABian server*, you can disable IPv6.
Follow the instructions in the previous section and insert a line into `openhabian.conf` reading `ipv6=disable`.

#### Fake hardware mode
If to install openHABian fails because you have a non-supported hardware or run an unsupported OS release, you can "fake" your hardware and OS to make openHABian behave as if you did own that HW/OS.
In `openhabian.conf`, uncomment and complete the lines reading `hw=`, `hwarch=` and/or `osrelease=` with the hw and os versions you want to attempt installation with.

## Optional Components
openHABian comes with a number of additional routines to quickly install and set up home automation related software.
You'll find all of these in the [openHABian Configuration Tool](#openhabian-configuration-tool)

-   [Frontail](https://github.com/mthenw/frontail) - openHAB Log Viewer accessible from [http://openhab:9001](http://openhab:9001)
-   [InfluxDB and Grafana](https://community.openhab.org/t/influxdb-grafana-persistence-and-graphing/13761/1) - persistence and graphing available from [http://openhab:3000](http://openhab:3000)
-   [Eclipse Mosquitto](http://mosquitto.org) - Open Source MQTT v3.1/v3.1.1 Broker
-   [Node-RED](https://nodered.org) - "Flow-based programming for the Internet of Things". Access at [http://openhab:1880](http://openhab:1880).
-   [Homegear](https://www.homegear.eu/index.php/Main_Page) - Homematic control unit emulation
-   [KNXd](http://michlstechblog.info/blog/raspberry-pi-eibknx-ip-gateway-and-router-with-knxd) - KNX daemon running at `224.0.23.12:3671/UDP`
-   [OWServer](http://owfs.org/index.php?page=owserver_protocol) - 1wire control system
-   [FIND](https://www.internalpositioning.com/) - the Framework for Internal Navigation and Discovery
-   Mi Flora MQTT demon
-   Tellstick core

## Troubleshooting
If you're having problems to get openHABian to install properly, check out the [debug guide](openhabian-DEBUG.md). It's also available on your system as `/opt/openhabian/docs/openhabian-DEBUG.md`.
Do not hesitate to ask for help on the [openHABian community forum](https://community.openhab.org/) when the debug guide doesn't help.
Remember to [mind the rules](https://community.openhab.org/t/how-to-ask-a-good-question-help-us-help-you/58396) please.

If you want to get involved, you found a bug, or just want to see what's planned for the future, visit us on GitHub:

-   [https://github.com/openhab/openhabian/](https://github.com/openhab/openhabian/)

<a id="changelog"></a>
### Where can I find a changelog for openHABian?
Official announcements are co-located with the download links [here](https://github.com/openhab/openhabian/releases).
If you want to stay in touch with all the latest code changes under the hood, see [commit history](https://github.com/openhab/openhabian/commits/master) for openHABian.
You'll also see commits "fly by" when executing the "Update" function within the openHABian Configuration Tool.

<a id="successful"></a>
### Did my Installation succeed? What to do in case of a problem?
Don't panic ;-)
openHABian setup will take 15 up to 45 minutes to complete all steps, depending on your device's performance and a number of external factors such as your internet connection.

Watch the progress on the console or the web interface at https://<yourip>/ or <http://openhabiandevice/> if that name has become available.
Double-check the IP address and name with your router while you wait.
If there is absolutely no output for more than 10 minutes, your installation has failed in the first initialization phase. There probably is a problem
with the way your router or local network are setup.
Read on in the [Troubleshooting](#troubleshooting) section or move on to the [DEBUG guide](openhabian-DEBUG.md).
You can set `debugmode=on` (or even = `maximum`) right on first install, too, to get to see what openHABian is doing.

After a few minutes of boot up time, you can [connect to the SSH console](https://www.raspberrypi.org/documentation/remote-access/ssh/windows.md) of your device.
During the setup process you'll be redirected to the live progress report of the setup (you can Ctrl-C to get into the shell).
The report can also be checked for errors at any time, see `/boot/first-boot.log`

The progress of a successful installation will look like this:

![openHABian installation log](images/openHABian-install-log.png)

Wait till the log tells you that the setup was "successful", then reconnect to the device.

#### SSH Login Screen
If the installation was **successful** you will see the normal login screen as shown in the first screenshot.
If the installation was **not successful** you will see a warning and further instructions as shown in the second screenshot.

<div class="row">
  <div class="col s12 m5"><img src="images/openHABian-SSH-MotD.png" alt="openHABian installation successful" title="openHABian installation successful"></div>
  <div class="col s12 m5 offset-m2"><img src="images/openHABian-install-failed.png" alt="openHABian installation failed warning and instructions" title="openHABian installation failed warning and instructions"></div>
</div>

#### openHAB Dashboard
After the installation of openHABian was successful, you should be able to access the openHAB dashboard:

-   Raspberry Pi image setup: [http://openhab:8080](http://openhab:8080)
-   In any case: [http://your-device-hostname:8080](http://your-device-hostname:8080) or [http://192.168.0.2:8080](http://192.168.0.2:8080) (replace name/IP with yours)

#### What's next?
If you are not able to access your system via the openHAB dashboard or SSH after more than one hour, chances are high that your hardware setup is the problem. Consult the [debug guide](openhabian-DEBUG.md) and move on from there.

<a id="switch-openhab-branch"></a>
#### Can I switch openHAB 2 and 3 via openHABian branches ?
openHABian installs the latest stable build of openHAB.
The standard openHABian `stable` and `master` branches will install openHAB version 2 and the `openHAB3` branch will install the new openHAB version 3.
You can migrate between versions by selecting the corresponding 4X menu option. That should also result in an openHABian branch change.
If you want to choose from stable, snapshot or milestone releases, please do so via `openhabian-config` tool (also menu 4X).
Note this will **not** result in any openHABian branch change.
Switching from stable to newer development releases might introduce changes and incompatibilities, so please be sure to make a full openHAB backup first!
Check the Linux installation article for all needed details: [Linux: Changing Versions](linux.html#changing-versions)

<a id="headache"></a>
#### Where is the graphical user interface?
I've just installed openHABian and now I'm confused.
No fancy login screen, no windows, no mouse support. What did I get into?

You are not the first one to get confused about the **intended use case of openHABian**.
Maybe it helps to not think of the RPi as a PC as we know it.
An RPi is not (well, not *necessarily*) to be used with a keyboard and display.
Its intended use case is to sit in a corner and provide a service reliably 24 hours a day, 7 days a week.
You already own a **powerful PC or Mac** to work on.
It would be a shame to have a powerful computer at your fingertips and then have to **restrict yourself** to a very limited graphical frontend on another device, wouldn't you agree?

What we actually want openHABian to be is a **dedicated, headless system** to **reliably run openHAB** and to **expose all interfaces** needed to interact and configure it (MainUI, HABPanel, openHAB LogViewer, Samba Network Shares, openHABian Configuration Tool, SSH, you-name-it).
If you know how to work with these interfaces, you are set for a way better experience than the alternatives.
The main challenge is to **get used to the Linux command line**, not even a GUI (like Pixel, see below) will relieve you from that in the long run.
If you are not willing to teach yourself a few fundamental Linux skills you will not become happy with any Linux system and should resort to a e.g. Windows machine.
However as you are willing to tinker with smart home technology, I'm sure you are ready to **teach yourself new stuff** and expand your experience.

<a id="faq-other-platforms"></a>
#### Can I use openHABian on ...?
See the [README](https://github.com/openhab/openhabian/blob/master/README.md#hardware-and-os-support) for a list of supported HW and OS.
openHABian is developed for Debian based systems.
If your operating system is based on these or if your hardware supports one, your chances are high openHABian can be used.
Check out the [Manual Setup](#manual-setup) instructions for guidance and consult the [debug guide](openhabian-DEBUG.md) if you run into problems.
Do not hesitate to ask for help on the [openHABian community forum](https://community.openhab.org/) !
