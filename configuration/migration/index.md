---
layout: documentation
title: Migration to openHAB 3
description: Description of Beaking Changes and needed steps for a proper Migration to openHAB 3
---

# Migrating from openHAB 2 to openHAB 3

There are different approaches to get your openHAB 2 Environment upgraded to openHAB 3.
You could start with a fresh isntall and migrate your environment step-by-step or you can upgrade your rinnung environment and change your configuration where needed.

Since this is a major version release you have to pay attention to some `Breaking Changes` that may affect your environment too.
You can find a general note on the `Breaking Changes` here:
https://github.com/openhab/openhab-distro/wiki/Breaking-Changes-in-openHAB-3

Please read them carefully and check if you are affected by some of the changes, like the changes to some rules namespaces and the handling of time functions.

Below you can find some general informations for the technical upgrade process to openHAB 3.
Please be aware of possible changes needed for your specific environment in case of the breaking changes after upgrading.

## Upgrade Process for different instalaltion variants

### openHABian

If you are working with an [openHABian](https://www.openhab.org/docs/installation/openhabian.html) setup, the upgrade is quite easy. Regardless of if you are currently using the openHAB 2.5 stable release or one of the latest 3.0.0 SNAPSHOT or milestone builds, switching to openHAB 3.0.0 stable is done in just a few steps:

1. Connect to the SSH command line and execute: `sudo openhabian-config`
2. When being asked, answer that you want to update.
3. Select the menu entry"03 - Install openHAB" option.

### Package-based Installations

Since the openHAB 2 Linux `openhab2*` packages used folder names like `/etc/openhab2` we used this opportunity to remove the version out of anything the packages provides, including the name of the package itself. Some files such as `openhab-cli` didn't use any version in the naming at all, and therefore haven't moved anywhere.

Unfortunately, it means that in terms of openHAB 2 and openHAB 3, you cannot install both at the same time and openHAB 2 will not automatically update to openHAB 3, but if you use the commands to install openHAB 3 whilst openHAB 2 is installed, then the configs will copy across automatically.

#### Backup first

If you've got an existing openHAB 2 installation, back it up before you do anything. `openhab-cli backup [filepath]/[filename].zip` will create a zip file which can be used to restore the same version of openHAB later using `openhab-cli restore [filepath]/[filename].zip`. Put the file somewhere not related to openHAB, such as your own home directory (e.g. `/home/pi/`). You should probably do your usual OS backup too to make sure you can get back to where you left off.

#### Prerequisites

openHAB 3 requires Java 11. Most modern Linux OS have an `openjdk-11-jdk` package available for you to install but alternative solutions such as [Zulu's OpenJDK](https://www.azul.com/downloads/zulu-community/?version=java-11-lts&package=jdk) (which openHABian can install for you) are available and these may run faster on 32-bit armhf platforms such as the Raspberry Pi.

You must also be on the relevant repository for openHAB, this hasn't changed for openHAB 3.x so the [same instructions for moving to it](https://www.openhab.org/docs/installation/linux.html#package-repository-installation) are still valid.

For DEB based installers (apt), your `.list` file should contain the line:

```
deb https://dl.bintray.com/openhab/apt-repo2 stable main
```

For RPM based installers (yum), your `.repo` file should contain:

```
[openHAB-Stable]
name=openHAB Stable
baseurl=https://dl.bintray.com/openhab/rpm-repo2/stable
gpgcheck=1
gpgkey=https://bintray.com/user/downloadSubjectPublicKey?username=openhab
enabled=1
```

#### Upgrading

If the install of openHAB 3 detects an existing openHAB 2 install, then it will copy the configurations  across and update using those files. There are several major differences between openHAB 2 and 3 which may mean that this will cause issues, let us know if you experience anything strange.

After a successful update, you can use commands like `sudo systemctl start openhab` (notice no 2 at the end) immediately, but `openhab-cli` will complain of path errors until you restart your shell session (e.g. by logging out and in).

With `openhab2` still installed:

##### APT (Debian / Ubuntu and derivatives)

```
sudo apt update
sudo apt install openhab
```

The system will ask you if you want to remove `openhab2` as part of this, and you should respond with "y". After the install continues it will warn you that several of your configuration files have newer versions, mostly your answer to these should be **yes** to install the maintainer's versions, take a note of which files these are as the installer will save them in the same location as ".old" files if you want to copy something specific across.

You can get rid of openHAB2 leftover configuration files by using the `sudo apt purge openhab2` command, but this also gets rid of the `openhab` user, to fix this issue you should follow this with:

```
sudo apt install --reinstall openhab
sudo openhab-cli reset-ownership
```

##### DNF (RedHat, CentOS, Fedora, etc.)

```
sudo dnf --allowerasing install openhab
```

DNF does not replace configuration files for you by default, have a look at the `/var/lib/openhab/` directory and replace any older files with their `.rpmnew` variant.

##### YUM (Older RedHat, CentOS, Fedora, etc.)

The equivalent command should be:
```
sudo yum swap openhab2 openhab
```

YUM does not replace configuration files for you by default, have a look at the `/var/lib/openhab/` directory and replace any older files with their `.rpmnew` variant (particularly reccomended for the `/var/lib/openhab/etc` directory).

Check to see what packages are installed/removed. These should only be openHAB related.

#### Fresh installation if you have openHAB 2.x installed already

A fresh installation will make sure you're clear of any current incompatibilities caused by the upgrade process.

With your backup file **clear of any openHAB** path (if it's in `/var/lib/openhab2`, move it  out the way first), you can use the following commands to get rid of all files related to OH2 and then install OH3. If this is a system without openHAB 2, then just use the `update` and `install` commands.

After a successful install, you can use commands like `sudo systemctl start openhab` (notice no `2` at the end) immediately, but if `openhab2` was previously installed then `openhab-cli` will complain of path errors until you restart your shell session (e.g. by logging out and in).

##### APT (Debian / Ubuntu and derivatives)

```sh
sudo apt purge openhab2
sudo apt update
sudo apt install openhab
```

##### YUM or DNF (RedHat, CentOS, Fedora, etc)

```sh
sudo dnf remove openhab2
sudo dnf install openhab
```
Replace "dnf" with "yum" for older Red Hat based OSes.
<a name="manual-installations">

### Manual Installations

Note that openHAB 3 now requires a Java 11 runtime, so please make sure to [install such a JVM](https://next.openhab.org/docs/installation/#prerequisites) before continuing.

Official update scripts are available that let you update your 2.x installation to version 3.0:

#### Linux/MacOS

1. Change to your openHAB root directory (e.g. `cd /opt/openhab`)
2. Create a backup by calling `sudo ./runtime/bin/backup`.
2. Run the update command:

  ```
  sudo ./runtime/bin/update 3.0.0
  ```

#### Windows

1. Make a backup of your openHAB installation folder.
2. Run PowerShell as an administrator and change to your openHAB root directory (e.g. `cd C:\openHAB`)
3. Run the update command:

  ```
. .\runtime\bin\update.ps1
Update-openHAB -OHVersion 3.0.0
  ```
