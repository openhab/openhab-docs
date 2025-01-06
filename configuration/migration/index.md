---
layout: documentation
title: Migration from openHAB 2
description: Description of Breaking Changes and needed steps for a proper Migration from openHAB 2
---

# Migrating from openHAB 2

There are different approaches to get your openHAB 2 Environment upgraded.
You could start with a fresh install and migrate your environment step-by-step or you can upgrade your running environment and change your configuration where needed.

Since this is a major version release you have to pay attention to some **Breaking Changes** that may affect your environment, too.
<https://github.com/openhab/openhab-distro/releases/tag/3.0.0#breaking-changes-that-require-manual-interaction-after-the-upgrade>

Please read them carefully and check if you are affected by some of the changes, like the changes to some rules namespaces and the handling of time functions.

Below you can find some general information for the technical upgrade process from openHAB 2.
Please be aware of possible changes needed for your specific environment in case of the breaking changes after upgrading.

## Upgrade Process for different installation variants

### openHABian

If you are working with an [openHABian](https://www.openhab.org/docs/installation/openhabian.html) setup, the upgrade is quite easy. Regardless of if you are currently using the openHAB 2.5 stable release or one of the latest 3.0.0 SNAPSHOT or milestone builds, switching to openHAB x.0.0 stable is done in just a few steps:

1. Connect to the SSH command line and run `sudo openhabian-config`
1. When being asked to update openHABian, answer yes. Do not change the branch, it should read `stable` if you are on 2.X and `openHAB3` or `main` if on 3.X.
1. Select the menu entry "03 - Install openHAB" option.

### Package-based Installations

Since the openHAB 2 Linux `openhab2*` packages used folder names like `/etc/openhab2` we used this opportunity to remove the version out of anything the packages provides, including the name of the package itself.
Some files such as `openhab-cli` didn't use any version in the naming at all, and therefore haven't moved anywhere.

Unfortunately, it means that in terms of openHAB 2 and newer openHAB versions, you cannot install both at the same time and openHAB 2 will not automatically update, but if you use the commands to install newer openHAB versions whilst openHAB 2 is installed, then the configs will copy across automatically.
Please be aware that system configuration done for openHAB 2 is not copied across automatically.
E.g. if you have changed /etc/default/openhab2, similar changes in /etc/default/openhab might be required.

#### Backup first

If you've got an existing openHAB 2 installation, back it up before you do anything. `openhab-cli backup [filepath]/[filename].zip` will create a zip file which can be used to restore the same version of openHAB later using `openhab-cli restore [filepath]/[filename].zip`.
Put the file somewhere not related to openHAB, such as your own home directory (e.g. `/home/pi/`).
You should probably do your usual OS backup too to make sure you can get back to where you left off.

#### Prerequisites

openHAB (since version 4) requires Java 17. Most modern Linux OS have an `openjdk-17-jdk` package available for you to install but alternative solutions such as [Zulu's OpenJDK](https://www.azul.com/downloads/zulu-community/?version=java-17-lts&package=jdk) (which openHABian can install for you) are available and these may run faster on 32-bit armhf platforms such as the Raspberry Pi.

openHAB 5 development requires Java 21.

You must also be on the relevant repository for openHAB, this hasn't changed for openHAB 4.x so the [same instructions for moving to it](https://www.openhab.org/docs/installation/linux.html#package-repository-installation) are still valid.

For DEB based installers (apt), your `.list` file should contain the line:

```shell
deb https://openhab.jfrog.io/artifactory/openhab-linuxpkg stable main
```

For RPM based installers (yum/dnf), your `.repo` file should contain:

```shell
[openHAB-Stable]
name=openHAB Stable
baseurl=https://openhab.jfrog.io/artifactory/openhab-linuxpkg-rpm/stable
gpgcheck=1
gpgkey=https://openhab.jfrog.io/artifactory/api/gpg/key/public
enabled=1
```

#### Upgrading

If the install of openHAB detects an existing openHAB 2 install, then it will copy the configurations  across and update using those files. There are several major differences between openHAB 2 and 3 which may mean that this will cause issues, let us know if you experience anything strange.

After a successful update, you can use commands like `sudo systemctl start openhab` (notice no 2 at the end) immediately, but `openhab-cli` will complain of path errors until you restart your shell session (e.g. by logging out and in).

With `openhab2` still installed:

##### APT (Debian / Ubuntu and derivatives)

```shell
sudo apt update
sudo apt install openhab
```

The system will ask you if you want to remove `openhab2` as part of this, and you should respond with "y". After the install continues it will warn you that several of your configuration files have newer versions, mostly your answer to these should be **yes** to install the maintainer's versions, take a note of which files these are as the installer will save them in the same location as ".old" files if you want to copy something specific across.

You can get rid of openHAB2 leftover configuration files by using the `sudo apt purge openhab2` command, but this also gets rid of the `openhab` user, to fix this issue you should follow this with:

```shell
sudo apt install --reinstall openhab
sudo openhab-cli reset-ownership
```

##### DNF (RedHat, CentOS, Fedora, etc.)

```shell
sudo dnf --allowerasing install openhab
```

DNF does not replace configuration files for you by default, have a look at the `/var/lib/openhab/` directory and replace any older files with their `.rpmnew` variant.

##### YUM (Older RedHat, CentOS, Fedora, etc.)

The equivalent command should be:

```shell
sudo yum swap openhab2 openhab
```

YUM does not replace configuration files for you by default, have a look at the `/var/lib/openhab/` directory and replace any older files with their `.rpmnew` variant (particularly reccomended for the `/var/lib/openhab/etc` directory).

Check to see what packages are installed/removed. These should only be openHAB related.

#### Fresh installation if you have openHAB 2.x installed already

A fresh installation will make sure you're clear of any current incompatibilities caused by the upgrade process.

With your backup file **clear of any openHAB** path (if it's in `/var/lib/openhab2`, move it  out the way first), you can use the following commands to get rid of all files related to OH2 and then install OH3. If this is a system without openHAB 2, then just use the `update` and `install` commands.

After a successful install, you can use commands like `sudo systemctl start openhab` (notice no `2` at the end) immediately, but if `openhab2` was previously installed then `openhab-cli` will complain of path errors until you restart your shell session (e.g. by logging out and in).

##### APT (Debian / Ubuntu and derivatives)

```shell
sudo apt purge openhab2
sudo apt update
sudo apt install openhab
```

##### YUM or DNF (RedHat, CentOS, Fedora, etc)

```shell
sudo dnf remove openhab2
sudo dnf install openhab
```

Replace "dnf" with "yum" for older Red Hat based OSes.

### Manual Installations

Note that openHAB (since version 4) now requires a Java 17 runtime, so please make sure to [install such a JVM](https://next.openhab.org/docs/installation/#prerequisites) before continuing.

Official update scripts are available that let you update your 2.x installation to version 3.0:

#### Linux/macOS

1. Change to your openHAB root directory (e.g. `cd /opt/openhab`)
1. Create a backup by calling `sudo ./runtime/bin/backup`.
1. Run the update command:

  ```shell
  sudo ./runtime/bin/update 3.0.0
  ```

#### Windows

1. Make a backup of your openHAB installation folder.
1. Run PowerShell as an administrator and change to your openHAB root directory (e.g. `cd C:\openHAB`)
1. Run the update command:

  ```shell
  . .\runtime\bin\update.ps1
  Update-openHAB -OHVersion 3.0.0
  ```
