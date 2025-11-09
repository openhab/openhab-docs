---
layout: documentation
title: openHAB on macOS
---

# openHAB on macOS

The following instructions will guide you through the process of setting up openHAB and recommended packages for both .DEB (Ubuntu, Debian etc.) and .RPM (RedHat, CentOS, Fedora etc.) Linux systems.

All instructions can be executed in a terminal or remotely via SSH connection.

This page is structured as follows:

[[toc]]

If you're unfamiliar with using the macOS terminal or SSH or if you want to improve your skills, read up on these important topics.
A lot of helpful articles can be found on the internet, for example:

- [macOS Terminal Essential Commands Guide for Beginners](https://osxhub.com/macos-terminal-essential-commands-guide-for-beginners/)

## Meeting the Requirements

As a first step, please verify that your Mac is running an up-to-date **64-bit** macOS.

::: tip
Use the terminal to check the architecture of your Mac:

```shell
uname -m
```

`x86_64` means that you're running a 64-bit macOS on an Intel CPU.
`arm64` means that you're running a 64-bit macOS on an Apple Silicon CPU (aka M-series Macs).

:::

## Installation

openHAB can be installed through

- a Homebrew package
- manually from file.

Installing using the provided Homebrew package is the recommended choice.
The manual installation through the platform independent archive file is only recommended for users who know that they need this and know what they are doing.

### Package Installation

Installation through the Homebrew package is the recommended choice,
as the package installation takes care of almost all the required steps automatically and even included a service to start openHAB automatically.

First, you need to install the [Homebrew package manager](https://brew.sh/).
Please refer to the [Homebrew website](https://brew.sh) for installation instructions.

After installing Homebrew, you need to add the [openHAB _tap_](https://github.com/openhab/homebrew-openhab) to the Homebrew package manager.
A _tap_ is a third-party repository of formulae for the Homebrew package manager.
Packages in Homebrew are also called _formulae_.

```shell
brew tap openhab/openhab
```

Choose between the latest stable or milestone release:

- **Stable Releases**
  The stable builds contain the latest official release and have been tested thoroughly.

  ```shell
  brew install openhab
  ```

- **Milestone Release**
  Milestone releases are betas and release candidates and come out more frequently than stable releases, but will contain new features that are currently in the testing phase.
  ```shell
  brew install openhab-milestone
  ```

::: tip Note
Installing any openHAB package will automatically install the latest OpenJDK 21 build from Homebrew as well.

Also included is the `openhab-cli` tool (as known from the Linux packages), which provides easy access to the console, backup and restore functionality etc.
Running `openhab-cli` in the terminal will list all available commands.
:::

When you choose to install an add-on, openHAB will download it from the internet on request.
If you plan on disconnecting your machine from the internet, then you will want to also install the add-ons `KAR` archive file.

Follow the instructions provided by Homebrew to install the add-ons `KAR`.

```shell
brew info openhab
# OR #
brew info openhab-milestone
```

This will output a bunch of text, including the following instructions:

```text
To install the add-ons KAR for offline use:
  curl -L --output-dir /opt/homebrew/opt/openhab-milestone/libexec/addons -o openhab-addons-5.1.0.M2.kar https://openhab.jfrog.io/artifactory/libs-milestone-local/org/openhab/distro/openhab-addons/5.1.0.M2/openhab-addons-5.1.0.M2.kar
To verify its checksum:
  echo "39009119897f4b6e997c85e323aea9f7af3ee7a4e1f9df82ef0bc6d9b417abd1 /opt/homebrew/opt/openhab-milestone/libexec/addons/openhab-addons-5.1.0.M2.kar" | sha256sum -c -
```

#### Preventing automatic upgrade of openHAB

To prevent unexpected breakage by accidentally updating openHAB, it's recommended to only manually upgrade to the newest version.
This can be achieved by pinning the openHAB package version .

```shell
brew pin openhab
# OR #
brew pin openhab-milestone
```

To enable automatic upgrade of openHAB again, remove the pinning.

```shell
brew unpin openhab
# OR #
brew unpin openhab-milestone
```

It is also possible to list all pinned packages.

```shell
brew list --pinned
```

::: warning
The OpenJDK package version should be pinned as well, because after an OpenJDK upgrade, the _Local Network Access_ permission needs to be granted again through _Settings -> Privacy & Security -> Local Network_.

```shell
brew pin openjdk@21
```

The permission can only be granted in the GUI, not via the terminal, so be ready to access the GUI to grant the permission again after upgrading the OpenJDK package.
If the permission is not granted, openHAB will not be able to connect to your local network!
:::

#### Launching openHAB

Type the name of installed package (i.e. `openhab` or `openhab-milestone`) in the terminal to start openHAB.

```shell
openhab
# OR #
openhab-milestone
```

The first run may take a while to process, wait until the `openhab>` prompt appears, for example:

```shell
$ ./start.sh
Launching the openHAB runtime...

                           _   _     _     ____
   ___   ___   ___   ___  | | | |   / \   | __ )
  / _ \ / _ \ / _ \ / _ \ | |_| |  / _ \  |  _ \
 | (_) | (_) |  __/| | | ||  _  | / ___ \ | |_) )
  \___/|  __/ \___/|_| |_||_| |_|/_/   \_\|____/
       |_|       5.0.0 - Release Build

Use '<tab>' for a list of available commands
and '[cmd] --help' for help on a specific command.
To exit, use '<ctrl-d>' or 'logout'.


openhab>
```

#### Installing a specific version

Homebrew, unfortunately, does not support having multiple versions of the same package natively, but anyway, we've made it possible to install older versions of openHAB.
Our CI servers automatically tag the stable package versions with the release number, so you can use the following Git command to have Homebrew install a specific stable version.

```shell
git -C $(brew --prefix)/Homebrew/Library/Taps/openhab/homebrew-openhab checkout v5.0 Formula/openhab.rb
```

The above command will check out the `v5.0` tagged version of the `openhab` package, thus installing the latest openHAB `v5.0.x` release.

To revert to the latest stable version, you can use the following command.

```shell
git -C $(brew --prefix)/Homebrew/Library/Taps/openhab/homebrew-openhab checkout main && git -C $(brew --prefix)/Homebrew/Library/Taps/openhab/homebrew-openhab pull
```

#### Running as a service

The easiest way of running openHAB is to run it as a Homebrew service.
This automatically starts openHAB on login of your user account.

```shell
brew services start openhab
# OR #
brew services start openhab-milestone
```

The following commands help managing the service:

- stop the service: `brew services stop ...`
- restart the service: `brew services restart ...`
- check the status of the service: `brew services info ...`

#### Updating openHAB

openHAB can easily be updated through Homebrew.
First, the package version needs to be unpinned, so that Homebrew can update the package.

```shell
brew unpin openjdk@21

brew unpin openhab
# OR #
brew unpin openhab-milestone
```

Next, the package can be updated.

```shell
brew upgrade
```

#### Backup and Restore

Backup and restore of openHAB can be performed through the `openhab-cli` tool.

```shell
openhab-cli backup /path/to/backup.zip
openhab-cli restore /path/to/backup.zip
```

### Manual Installation

The manual installation/setup is an alternative to the otherwise **recommended** [installation through package](#package-installation).

First, install a **Java 21** JVM platform first.
Please refer to the [Installation Prerequisites](index.html#prerequisites).
When selecting a Java version to install, make sure to select the right platform depending on your hardware (x86 for Intel Macs or ARM 64-bit for M-series Macs).

Second, we are going to download a platform independent `zip` archive file.
Choose between the latest stable release, milestone (testing release) or snapshot build:

- **Stable Releases**
  The stable builds contain the latest official release and have been tested thoroughly.
  Download the latest `openhab-5.x.x.zip` from [our downloadpage](https://www.openhab.org/download/).

- **Milestone Release**
  Milestone releases are betas and release candidates and come out more frequently than stable releases, but will contain new features that are currently in the testing phase.
  If available, the latest `openhab-5.x.x.Mx.zip` can be downloaded from [our downloadpage](https://www.openhab.org/download/).

- **Snapshot Release**
  The snapshot build is created [almost daily](https://ci.openhab.org/job/openHAB-Distribution/), and include the latest changes to openHAB.
  These changes are often unstable, so you should use this branch only for testing or development purposes.
  Download the latest `openhab-5.x.x-SNAPSHOT.zip` from [our downloadpage](https://www.openhab.org/download/).

The following instructions are performed in a terminal window.
At the first launch of the terminal, you will be inside your home directory.

Choose a folder name to host your installation.
Be aware that the path to this folder name **must not contain any spaces**.
The path chosen here is `openhab`.

```shell
mkdir ~/openhab
cd ~/openhab
```

Next, unzip the file downloaded earlier.
Assuming that you have downloaded a **stable release** build to your download folder, the command will be:

```shell
unzip ~/Downloads/openhab-5.x.x.zip -d .
```

Check that the zip extraction was successful by using the `ls` command to check the contents of the folder.

```shell
user:openhab $ ls
LICENSE.TXT  conf     start.bat  start_debug.bat  userdata
addons       runtime  start.sh   start_debug.sh
```

If you see something similar to the above, then you're all set to launch openHAB for the first time.

#### Launching openHAB

From inside openHAB's root directory (e.g. `~/openhab/), run openHAB's startup script by using the following command.

```shell
./start.sh
```

The first run may take a while to process, wait until the `openhab>` prompt appears.
See [Package Install: Launching openHAB](#launching-openhab) for an example.

Without closing the terminal, open your favorite web browser and type the following URL: `http://localhost:8080`, you should see the openHAB welcome screen, and you're all set to [using openHAB]({{base}}/tutorial/first_steps.html).
If you installed openHAB on a different device, replace localhost with the IP address of the device.

#### Updating openHAB

openHAB is distributed with a script to update to any other version, or from stable to snapshot and visa-versa.

This script should be called from within openHAB's root directory.
Assuming the openHAB directory is in `~/openhab`, run the following commands to update to the next major version of openHAB:

```shell
cd ~/openhab
sudo runtime/bin/update
```

You can also specify any version as a parameter.
For example, to switch back to 4.3.0:

```shell
sudo runtime/bin/update 4.3.0
```

You may also change to openHAB's more frequent, but less stable snapshot builds.
Append `-SNAPSHOT` to the target version, e.g.:

```shell
sudo runtime/bin/update 5.0.0-SNAPSHOT
```

#### Backup and Restore

To make a backup of your openHAB system, you need to retain your configuration and userdata files.
You can run openHAB's backup script from the terminal to store your configuration in a zip file.

Assuming the openHAB directory is in `~/openhab`, the backup script saves the zip file to `~/openhab/backups`.
You can change the default path by setting the `$OPENHAB_BACKUPS` environment variable.

```shell
sudo $OPENHAB_RUNTIME/bin/backup
## OR ##
sudo $OPENHAB_RUNTIME/bin/backup /path/to/backups/folder/myBackup.zip
```

To restore from a zip file:

```shell
cd $OPENHAB_HOME

sudo $OPENHAB_RUNTIME/bin/restore $OPENHAB_BACKUPS/myBackup.zip
```

If you're unsure how to use the above files, just use `--help` or `-h`:

```shell
$OPENHAB_RUNTIME/bin/backup --help
```
