---
layout: documentation
title: openHAB 2 on Linux
---

{% include base.html %}

# openHAB 2 on Linux

The following instructions will guide you through the process of setting up openHAB 2 and recommended packages on a Linux system, with the **focus on Debian/Ubuntu** derivatives.
openHAB 2 can be set up and executed on other Linux distributions, the steps may slightly differ.

All instructions can be executed in a terminal or remotely via SSH connection.

This page is structured as follows:

{::options toc_levels="2..4"/}

* TOC
{:toc}

If you are unfamiliar with Linux, SSH and the Linux console or if you want to improve your skills, read up on these important topics.
A lot of helpful articles can be found on the internet, for example:

* "Learn the ways of Linux-fu, for free" interactively with exercises at [linuxjourney.com](https://linuxjourney.com).

Linux file permissions is one of the biggest sources of issues, Linux novices run into.
If you find yourself in a situation, where you have **no write access** to the openHAB configuration or system files wrong permissions and/or the incorrect use of `sudo` are often the cause.
Train your understanding of Linux permissions at [linuxjourney.com/lesson/file-permissions](https://linuxjourney.com/lesson/file-permissions).

**Meeting the Requirements:**
As a first step, please verify, that your system meets the [prerequisites](index.html#prerequisites).

A repository providing the latest Oracle Java 8 revision (above "101") is being maintained by the [Webupd8 Team](https://launchpad.net/~webupd8team/+archive/ubuntu/java).
Follow the provided guides for either a [repository based](http://www.webupd8.org/2012/09/install-oracle-java-8-in-ubuntu-via-ppa.html) or a [PPA based](http://www.webupd8.org/2014/03/how-to-install-oracle-java-8-in-debian.html) installation.
In short these are the commands to execute step-by-step on most systems:

```shell
echo "deb http://ppa.launchpad.net/webupd8team/java/ubuntu xenial main" | sudo tee /etc/apt/sources.list.d/webupd8team-java.list
echo "deb-src http://ppa.launchpad.net/webupd8team/java/ubuntu xenial main" | sudo tee -a /etc/apt/sources.list.d/webupd8team-java.list
sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv-keys EEA14886
sudo apt-get update
sudo apt-get install oracle-java8-installer
sudo apt-get install oracle-java8-set-default
```

## Installation

openHAB 2 can be installed though a package repository or manually from file.
The installation through a provided **package repository** (using `apt` / `apt-get`) is **recommended** for end users.
The manual installation through a platform independent archive file is suited for users who know what they are doing and systems with a non-Debian distribution, not using the apt/deb package system.

### Package Repository Installation

Installation through a package repository is the recommended choice on Debian/Ubuntu derivatives.
Alternatively resort to the [manual installation approach](#manual-installation).

First, add the openHAB 2 Bintray repository key to your package manager:

```shell
wget -qO - 'https://bintray.com/user/downloadSubjectPublicKey?username=openhab' | sudo apt-key add -
```

Then, you can choose between, *Official (Stable)*, *Beta* or *Snapshot* builds:

* **Official Release**

  The stable builds contain the latest official release with tested features.

  Add the **openHAB 2 Stable Repository** to your systems apt sources list:

  ```shell
  echo 'deb http://dl.bintray.com/openhab/apt-repo2 stable main' | sudo tee /etc/apt/sources.list.d/openhab2.list
  ```

* **Beta Release**

  The beta builds come out less frequently, but will contain new features that are currently in the testing phase.

  Add the **openHAB 2 Beta Repository** to your systems apt sources list:

  ```shell
  echo 'deb http://dl.bintray.com/openhab/apt-repo2 testing main' | sudo tee /etc/apt/sources.list.d/openhab2.list
  ```

* **Snapshot Release**

  The snapshot build is created [almost daily](https://bintray.com/openhab/apt-repo2/openhab2#release), and includes the latest changes to the openHAB 2 core and add-ons.
  These changes are often unstable, so you should use this branch only for testing or development purposes.

  The snapshot repository is hosted in openHAB's [JFrog Artifactory instance](https://www.jfrog.com/Artifactory).
  To use it, add the **openHAB 2 Unstable Repository** to your systems apt sources list:

  ```shell
  echo 'deb http://openhab.jfrog.io/openhab/openhab-linuxpkg unstable main' | sudo tee /etc/apt/sources.list.d/openhab2.list
  ```

Next, resynchronize the package index:

```shell
sudo apt-get update
```

Now install openHAB with the following command:

```shell
sudo apt-get install openhab2
```

When you choose to install an add-on, openHAB will download it from the internet on request.
If you plan on disconnecting your machine from the internet, then you will want to also install the add-ons package.

```shell
sudo apt-get install openhab2-addons
```

Optionally, you may in addition install the legacy add-ons package `openhab2-addons-legacy`.
This package contains 1.x bindings, for which there is already a 2.x version available.
This might be useful if you're [coming from openHAB 1.x]({{base}}/tutorials/migration.html) for example.

If everything went well, you can start openHAB and register it to be automatically executed at system startup:

* Linux init systems based on **sysVinit** (e.g. Debian 7, Ubuntu 14.x, Raspbian Wheezy and earlier):

  ```shell
  sudo /etc/init.d/openhab2 start
  sudo /etc/init.d/openhab2 status

  sudo update-rc.d openhab2 defaults
  ```

* Linux init systems based on **systemd** (e.g. Debian 8, Ubuntu 15.x, Raspbian Jessie and newer):

  ```shell
  sudo systemctl start openhab2.service
  sudo systemctl status openhab2.service

  sudo systemctl daemon-reload
  sudo systemctl enable openhab2.service
  ```

The first start may take **up to 15 minutes**, this is a good time to reward yourself with hot coffee or a freshly brewed tea!

You should be able to reach the openHAB 2 portal at [http://openhab-device:8080](http://openhab-device:8080) at this point.
If you're new to openHAB, then you should checkout the [beginner's tutorial]({{base}}/tutorials/beginner/1sttimesetup.html)!

![The openHAB 2 portal page](images/Accueil_Openhab_2.png)

#### Upgrade

To stay up to date with new releases, you should do regular upgrades.
This is especially important if you are working with the latest snapshot as changes and fixes are incorporated constantly.

Your personal configuration will be retained on upgrades.
We still recommend a backup before each upgrade.

Upgrading is as easy as:

```shell
sudo apt-get update
sudo apt-get upgrade
```

#### Changing Versions

You may want to switch to a different repo, or an older (but more stable) version of openHAB.
To do this, simply select the repo as in the [installation instructions above](#package-repository-installation), then find the version by bringing a list of all versions available to install:

```shell
sudo apt-get update
apt-cache showpkg openhab2
```

Once you know which version you want, you can upgrade/downgrade to it by using the `apt-get install=[version]` command, for example:

```shell
sudo apt-get install openhab2=2.0.0-1
```

#### Backup and Restore

To make a backup of your openHAB 2 system, you need to retain your configuration and userdata files.

```shell
# stop openhab instance (here: systemd service)
sudo systemctl stop openhab2.service

# backup current installation with settings
TIMESTAMP=`date +%Y%m%d_%H%M%S`;
mkdir  ~/openhab2-backup-$TIMESTAMP
cp -arv /etc/openhab2 ~/openhab2-backup-$TIMESTAMP/conf
cp -arv /var/lib/openhab2 ~/openhab2-backup-$TIMESTAMP/userdata

# restart openhab instance
sudo systemctl start openhab2.service
```

If you later want to restore settings, just replace them.
Maybe you will need to delete the existing data first.

```shell
# stop openhab instance (here: systemd service)
sudo systemctl stop openhab2.service

# restore data
sudo cp -arv ~/openhab2-backup-20160131_235959/conf/* /etc/openhab2/
sudo cp -arv ~/openhab2-backup-20160131_235959/userdata/* /var/lib/openhab2/

# restart openhab instance
sudo systemctl start openhab2.service
```

#### Uninstall

To uninstall openHAB 2 and get rid of all related files managed by the apt package manager, make a backup, then uninstall openHAB and remove the repository:

```shell
sudo apt-get purge openhab2*
sudo rm /etc/apt/sources.list.d/openhab2.list
```

### Manual Installation

The manual installation/setup is an alternative to the otherwise **recommended** [installation through package repository](#package-repository-installation).

First, create a Linux system user for openHAB.
This user will later serve to execute the openHAB runtime with restricted permissions and can be used by other services like Samba if desired.

```shell
sudo adduser --system --no-create-home --group --disabled-login openhab
```

We are going to download a platform independent archive file and extract it to the path `/opt/openhab2`.
Choose between the latest Beta release or a Snapshot with all incoming contributions, created daily.
As openHAB 2 is still in an evolving state, the snapshot may be the **preferred choice**.

* **Official Release**

  Download and extract the latest offical version of openHAB 2 from [bintray.com/openhab](https://bintray.com/openhab/mvn/openhab-distro/2.0.0) to your host.

  ```shell
  cd /tmp
  wget -O openhab-download.zip https://bintray.com/openhab/mvn/download_file?file_path=org%2Fopenhab%2Fdistro%2Fopenhab%2F2.0.0%2Fopenhab-2.0.0.zip
  sudo unzip openhab-download.zip -d /opt/openhab2
  rm openhab-download.zip
  ```

* **Beta/RC Release**

  Download and extract the desired beta or release client version of openHAB 2 from [bintray.com/openhab](https://bintray.com/openhab/mvn/openhab-distro) to your host.
  We will use `openhab-offline-2.0.0.RC1.zip` as an example:

  ```shell
  cd /tmp
  wget -O openhab-download.zip https://bintray.com/openhab/mvn/download_file?file_path=org%2Fopenhab%2Fdistro%2Fopenhab%2F2.0.0.RC1%2Fopenhab-2.0.0.RC1.zip
  sudo unzip openhab-download.zip -d /opt/openhab2
  rm openhab-download.zip
  ```

* **Snapshot Release**

  Download and extract the latest snapshot version of openHAB 2 as a **zip file** from [openhab.ci.cloudbees.com](https://openhab.ci.cloudbees.com/job/openHAB-Distribution) to your host, for example:

  ```shell
  cd /tmp
  wget https://openhab.ci.cloudbees.com/job/openHAB-Distribution/lastSuccessfulBuild/artifact/distributions/openhab/target/openhab-2.0.0-SNAPSHOT.zip
  sudo unzip openhab-2.0.0-SNAPSHOT.zip -d /opt/openhab2
  rm openhab-2.0.0-SNAPSHOT.zip
  ```

The extracted openHAB files should belong to the earlier created openhab user.
Execute:

```shell
sudo chown -hR openhab:openhab /opt/openhab2
```

Everything is ready for a first test run.
**Execute** openHAB and you should be able to reach the openHAB 2 Portal at [http://openhab-device:8080]() after a few minutes:

```shell
# execute as restricted user openhab:
sudo su -s /bin/bash -c '/opt/openhab2/start.sh' openhab
```

You will see the openHAB Karaf Console in your terminal and can directly interact with it.
Please be aware, that openHAB 2 will need a few minutes so finish the first start, even after the Karaf console is visible.
Let openHAB 2 settle for **around 15 minutes**.
If the portal is not reachable by then, restart once.

![The openHAB 2 portal page](images/Accueil_Openhab_2.png)

An important downside of the above method is, that openHAB will be terminated, as soon as you close your terminal.
To work around that, a quick solution is, to execute openHAB in a detached [screen](https://www.howtoforge.com/linux_screen) terminal.

A cleaner approach is to create a Linux service.

#### Service

The following instructions are intended for a Linux init system based on **systemd** (e.g. Debian 8 / Ubuntu 15.x and newer).
This will allow you to register openHAB as a service, so that it runs at startup and automatically restarts if openHAB crashes.
The service will be running with the privileges of the user "openhab" and expects the openHAB files under `/opt/openhab2`.

Create the file `/lib/systemd/system/openhab2.service` with the following content:

```ini
[Unit]
Description=The openHAB 2 Home Automation Bus Solution
Documentation=http://docs.openhab.org
Wants=network-online.target
After=network-online.target

[Service]
Type=simple
User=openhab
Group=openhab
GuessMainPID=yes
WorkingDirectory=/opt/openhab2
#EnvironmentFile=/etc/default/openhab2
ExecStart=/opt/openhab2/start.sh server
ExecStop=/bin/kill -SIGINT $MAINPID
Restart=on-failure

[Install]
WantedBy=multi-user.target
```

Next, enable the service to be executed on system startup, start the service and retrieve status information:

```shell
# initialize the new service (execute only once)
sudo systemctl daemon-reload
sudo systemctl enable openhab2.service

#start and retrieve status
sudo systemctl start openhab2.service
sudo systemctl status openhab2.service
```

The output of `status` after a successful execution should be similar to:

```text
 openhab2.service - The openHAB 2 Home Automation Bus Solution
   Loaded: loaded (/lib/systemd/system/openhab2.service; enabled)
   Active: active (running) since Thu 2016-08-14 01:16:00 GMT; 18h ago
     Docs: http://docs.openhab.org
```

#### Installing add-ons

When running a manual installation, it is possible to pre-download add-ons or legacy add-ons if you want to install any bindings at a later date without connecting to the internet.
Simply download the kar files (the latest builds can be found [here](https://openhab.ci.cloudbees.com/job/openHAB-Distribution/)) and move them to the `/opt/openhab2/addons` folder.


#### Upgrade, Backup and Restore

To stay up to date with new releases, you should do regular upgrades of your manual installation.
This is especially important if you are working with the latest snapshot as changes and fixes are incorporated [constantly](https://oss.jfrog.org/webapp/#/builds/openHAB-Distribution).

Your personal configuration will be retained on upgrades.
We still recommend a backup before each upgrade.

To upgrade your manual installation, you simply need to replace the openHAB runtime files.
Make sure to first **stop your openHAB instance**.

To make a backup of your openHAB 2 system, you need to retain your configuration and userdata files.

The following shell commands will create a backup, install the newest openHAB 2 version and restore settings:

```shell
# stop openhab instance (here: systemd service)
sudo systemctl stop openhab2.service

# backup current installation with settings
TIMESTAMP=`date +%Y%m%d_%H%M%S`;
sudo mv /opt/openhab2 /opt/openhab2-backup-$TIMESTAMP

# download new version (please replace URL)
cd /tmp
wget https://openhab.ci.cloudbees.com/job/openHAB-Distribution/lastSuccessfulBuild/artifact/distributions/openhab/target/openhab-2.0.0-SNAPSHOT.zip
sudo unzip openhab-2.0.0-SNAPSHOT.zip -d /opt/openhab2
rm openhab-2.0.0-SNAPSHOT.zip

# restore configuration and userdata
sudo cp -arv /opt/openhab2-backup-$TIMESTAMP/conf /opt/openhab2/
sudo cp -arv /opt/openhab2-backup-$TIMESTAMP/userdata /opt/openhab2/

# fix permissions
sudo chown -hR openhab:openhab /opt/openhab2

# restart openhab instance
sudo systemctl start openhab2.service
```

#### Uninstall

To uninstall (or more precisely remove) openHAB 2 after being manually set up, take a backup if needed and then simply stop and deactivate the openHAB service and get rid of all files:

```shell
sudo systemctl stop openhab2.service
sudo systemctl disable openhab2.service
sudo rm -rf /opt/openhab2/
sudo rm /lib/systemd/system/openhab2.service
```

### File Locations

|                                  | Repository Installation      | Manual Installation (according to [guide](#manual-installation)) |
|:--------------------------------:|:---------------------------- |:----------------------------------|
| openHAB application              | `/usr/share/openhab2`        | `/opt/openhab2`                   |
| Additional add-on files          | `/usr/share/openhab2/addons` | `/opt/openhab2/addons`            |
| Site configuration               | `/etc/openhab2`              | `/opt/openhab2/conf`              |
| Log files                        | `/var/log/openhab2`          | `/opt/openhab2/userdata/logs`     |
| Userdata like rrd4j databases    | `/var/lib/openhab2`          | `/opt/openhab2/userdata`          |
| Service configuration            | `/etc/default/openhab2`      | (not preconfigured)               |

## Viewing Log Messages

In order to get more insight on what your openHAB system is doing and to see occurring error messages, it is recommended to always have a look on the openHAB log files.
These will tell you everything you might need to know.
Execute the following command in one session or have both files separated in sessions side by side:

* Package repository based installation:

  ```shell
  tail -f /var/log/openhab2/openhab.log -f /var/log/openhab2/events.log
  ```

* Manual installation:

  ```shell
  tail -f /opt/openhab2/userdata/logs/openhab.log -f /opt/openhab2/userdata/logs/events.log
  ```

You could even set up an SSH configuration (in Putty or similar) to automatically connect and execute the commands every time you start working on your setup.

With openHAB 2 you can also [use the Karaf console]({{base}}/administration/logging.html#karaf-console) to have a colored glance at the logging information.

## Recommended Additional Setup Steps

The following is not directly related to the openHAB installation but rather recommended on a openHAB system.
The need for these and the exact implementation on a specific system might differ from user to user.

### Privileges for Common Peripherals

An openHAB setup will often rely on hardware like a modem, transceiver or adapter to interface with home automation hardware.
Examples are a Z-Wave, Enocean or RXFcom USB Stick or a Raspberry Pi add-on board connected to the serial port on its GPIOs.
In order to allow openHAB to communicate with additional peripherals, it has to be added to corresponding Linux groups.
The following example shows how to add Linux user `openhab` to the often needed groups `dialout` and `tty`.
Additional groups may be needed, depending on your hardware and software setup.

```shell
sudo adduser openhab dialout
sudo adduser openhab tty
```

Additionally it's needed to allow the java environment to access the serial port of the connected peripheral.
Therefore the following setting has to be added/adapted on your system in file `/etc/default/openhab2`:

```shell
EXTRA_JAVA_OPTS="-Dgnu.io.rxtx.SerialPorts=/dev/ttyUSB0:/dev/ttyS0:/dev/ttyS2:/dev/ttyACM0:/dev/ttyAMA0"
```

The shown device handlers are just the most common examples.
Please contact the community forum for more detailed information regarding individual hardware.

### Java Network Permissions

The Java Virtual Machine hosting openHAB is restricted in it's permissions to interact on network level for security reasons.
Some openHAB add-ons, like the Network or AmazonDash bindings, need elevated permissions to work.
If needed, grand these permissions by executing the following command:

```shell
setcap 'cap_net_raw,cap_net_admin=+eip cap_net_bind_service=+ep' $(realpath /usr/bin/java)
```

### Network Sharing

openHAB depends on configuration files and folders with custom content (details in [Configuration]({{base}}/configuration/index.html) articles).
Because your openHAB installation most probably is stored on a remote device, being able to easily access and modify these files from your local PC or Mac is important, therefore setting up a [Samba](https://en.wikipedia.org/wiki/Samba_(software)) network share is **highly recommended**.

The [Eclipse SmartHome Designer]({{base}}/installation/designer.html) software does also depend on a mounted share to access the openHAB configuration files.

We will now guide you through the Samba network shares setup process.
Start by installing Samba.
Afterwards open it's configuration file in your favorite editor:

```shell
sudo apt-get install samba samba-common-bin
sudo vim /etc/samba/smb.conf
```

Change the workgroup name if needed, otherwise uncomment and enable WINS support:

```ini
wins support = yes
```

Next, add the desired share configurations to the end of the file:

<!-- Note to author: Do not name share "openhab". Depending on the host system, a share for the home of user "openhab" will be created.-->

<!-- TODO: Limit to configuration folder??? -->

* Package repository based installation:

  ```ini
  [openHAB2-userdata]
    comment=openHAB2 userdata
    path=/var/lib/openhab2
    browseable=Yes
    writeable=Yes
    only guest=no
    public=no
    create mask=0777
    directory mask=0777

  [openHAB2-conf]
    comment=openHAB2 site configuration
    path=/etc/openhab2
    browseable=Yes
    writeable=Yes
    only guest=no
    public=no
    create mask=0777
    directory mask=0777
  ```

* Manual installation:

  ```ini
  [openHAB-files]
    comment=openHAB2
    path=/opt/openhab2
    browseable=Yes
    writeable=Yes
    only guest=no
    public=no
    create mask=0777
    directory mask=0777
  ```

Save and close the samba configuration file.


The shares are configured to be not open for guests nor to the public.
Let's activate the "openhab" user as a samba user and set his password (e.g. "habopen"):

```shell
sudo smbpasswd -a openhab
```

Be aware, that creating and later using a specific user will ensure, that [permissions](#permissions) are honored.
Make sure, the "openhab" user has ownership and/or write access to the openHAB configuration files.
This can be accomplished by executing:

```shell
sudo chown -hR openhab:openhab /etc/openhab2 /opt/openhab2/conf
```

Finally check the configuration file for correctness and restart Samba to load the new settings:

```shell
testparm

# Linux init systems based on sysVinit
sudo service smbd restart
# Linux init systems based on systemd
sudo systemctl restart smbd.service
```

#### Mounting Locally

After setting up and restarting Samba, check your connection to the shared folder and create a permanent mount.
Check the network devices manager of your local operating system to find and access your openHAB host and share.
These might however not be auto-discovered.
You can also manually connect:

* **On Mac OS X:** Open Finder → Go → Connect to Server: `smb://openhab@openhab-device.local`
* **On Windows:** Open Windows Explorer → Address bar: `\\openhab-device.local` → Right click a share and assign a drive letter

Be sure to use the actual host name instead of `openhab-device`.
When asked, authenticate with the username "openhab" and the chosen password.
If you are not able to connect, try with the IP of your device (e.g. `smb://openhab@192.168.0.2` or `\\192.168.0.2`).

If everything went well, you are set and ready to start [configuring]({{base}}/configuration/index.html) your openHAB system.
