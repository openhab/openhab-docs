---
layout: documentation
title: macOS
---

{% include base.html %}

# Installation on macOS

This page is structured as follows:

{::options toc_levels="2..4"/}

- TOC
{:toc}

If you're unfamiliar with using the macOS terminal, then feel free to follow the many guides on the internet. For example:

[Macworld: How to use Terminal on mac](https://www.macworld.co.uk/feature/mac-software/how-use-terminal-on-mac-3608274/)

## Installation

openHAB is packaged as a platform independent `zip` archive. Installation is as simple as unziping it into a unique folder.
First, make sure that your system meets the [prerequisites](index.html#prerequisites).
When you are running macOS BigSur or higher, make sure
that you select the right platform depending on your hardware (x86 or ARM 64-bit). 

You have the choice to use the current stable version or the latest snapshot build:

-   **Stable**

    The stable builds have undergone testing, it is the recommended version to download.
    Download the latest `openhab-3.x.x.zip` [here](https://www.openhab.org/download/).

-   **Snapshot (Unstable)**

    Snapshots are built daily, and contain the latest changes to openHAB's source code.
    These changes haven't undergone the same amount of testing as the stable releases, so only use them if you **need** a new feature.
    Download the latest `openhab-3.x.x-SNAPSHOT.zip` [here](https://www.openhab.org/download/).

The following instructions are performed in a terminal window. At first launch of the terminal, you will be inside your home directory.

Choose a folder name to host your install. Be aware that the path to this folder **must not contain any spaces**.
The path chosen here is `openhab`.

```shell
mkdir ~/openhab
cd ~/openhab
```

Next, unzip the file downloaded earlier.
Assuming that you have downloaded the **stable** build to your download folder, the command will be:

```shell
unzip ~/Downloads/openhab-3.x.x.zip -d .
```

Check that the zip extraction was successful by using the `ls` command in order to check the contents of the folder.

```shell
user:openhab $ ls
LICENSE.TXT  conf     start.bat  start_debug.bat  userdata
addons       runtime  start.sh   start_debug.sh
```

If you see something similar to the above, then you're all set to launch openHAB for the first time.

## Launching openHAB

From inside openHAB's root directory (e.g. `~/openhab/), run openHAB's startup script by using the following command.

```shell
./start.sh
```

The first run may take a while to process, wait until the "`openhab>`" prompt appears, for example:

```shell
$ ./start.sh
Launching the openHAB runtime...

                           _   _     _     ____  
   ___   ___   ___   ___  | | | |   / \   | __ ) 
  / _ \ / _ \ / _ \ / _ \ | |_| |  / _ \  |  _ \ 
 | (_) | (_) |  __/| | | ||  _  | / ___ \ | |_) )
  \___/|  __/ \___/|_| |_||_| |_|/_/   \_\|____/ 
       |_|       3.0.0 - Release Build

Use '<tab>' for a list of available commands
and '[cmd] --help' for help on a specific command.
To exit, use '<ctrl-d>' or 'logout'.


openhab>
```

Without closing the terminal, open your favorite web browser and type the following URL: [http://localhost:8080](http://localhost:8080), you should see the openHAB welcome screen, and you're all set to [using openHAB]({{base}}/tutorials/first_steps.html). 
If you installed openHAB on a different device, replace localhost with the IP address of the device.

## Updating openHAB

openHAB can use a script to update to any other version, or from stable to snapshot and visa-versa.

### Versions 2.1.0 and Above

From version 2.1.0, openHAB is distributed with the update script included.
This script should be called from within openHAB's root directory.
Assuming the openHAB directory is in `~/openhab`, simply run the following commands to update to the next major version of openHAB:

```shell
cd ~/openhab
sudo runtime/bin/update
```

You can also specify any version as a parameter.
For example, to switch back to 2.5.11:

```shell
sudo runtime/bin/update 2.5.11
```

You may also change to openHAB's more frequent, but less stable snapshot builds.
Just append "-SNAPSHOT" to the target version, e.g.:

```shell
sudo runtime/bin/update 2.5.12-SNAPSHOT
```

### Older Versions

If you're using a version earlier than 2.1.0, then you can use the following commands in Terminal to download the script and run it.
Assuming the openHAB directory is in `~/openhab` simply run the following commands to update to the next major version of openHAB:

```shell
cd ~/openhab
sudo sh -c "$(curl -fsSL https://raw.githubusercontent.com/openhab/openhab-distro/master/distributions/openhab/src/main/resources/bin/update)" -- 2.1.0
```

## Backup and Restore

To make a backup of your openHAB system, you need to retain your configuration and userdata files.
As of version 2.2.0, you can use openHAB's scripts for storing your configuration in a zip file. From the terminal:
By default, the script saves the zip file in `/var/lib/openhab/backups` for automatic installs and `openhab/backups` for manual installs.
You can change the default path by setting the $OPENHAB_BACKUPS environment variable.

```shell
sudo $OPENHAB_RUNTIME/bin/backup
## OR ##
sudo $OPENHAB_RUNTIME/bin/backup /path/to/backups/folder/myBackup.zip
```

To restore from these generated files:

```shell
cd $OPENHAB_HOME

sudo $OPENHAB_RUNTIME/bin/restore $OPENHAB_BACKUPS/myBackup.zip
```

If you're unsure how to use the above files, just use `--help` or `-h`:

```shell
$OPENHAB_RUNTIME/bin/backup --help
```
