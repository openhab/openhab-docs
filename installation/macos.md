---
layout: documentation
title: macOS
---

# Installation on macOS

This page is structured as follows:

[[toc]]

If you're unfamiliar with using the macOS terminal, then feel free to follow the many guides on the internet.

## Manual Installation

openHAB is packaged as a platform independent `zip` archive.
Installation is as simple as unzipping it into a unique folder.

First, make sure that your system meets the [prerequisites](index.html#prerequisites).
When selecting a Java version to install, make sure to select the right platform depending on your hardware (x86 for Intel Macs or ARM 64-bit for M-series Macs).

You have the choice to use the current stable or testing version or the latest snapshot build:

- **Stable Releases**

  The stable builds contain the latest official release with tested features.
  Download the latest `openhab-5.x.x.zip` [here](https://www.openhab.org/download/).

- **Testing Release**

  The beta and release candidate builds come out more frequently, but will contain new features that are currently in the testing phase.

- **Snapshot Release**

  The snapshot build is created [almost daily](https://ci.openhab.org/job/openhab-linuxpkg/), and include the latest changes to the openHAB core and add-ons.
  These changes are often unstable, so you should use this branch only for testing or development purposes.
  Download the latest `openhab-5.x.x-SNAPSHOT.zip` [here](https://www.openhab.org/download/).

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

### Launching openHAB

From inside openHAB's root directory (e.g. `~/openhab/), run openHAB's startup script by using the following command.

```shell
./start.sh
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

Without closing the terminal, open your favorite web browser and type the following URL: `http://localhost:8080`, you should see the openHAB welcome screen, and you're all set to [using openHAB]({{base}}/tutorial/first_steps.html).
If you installed openHAB on a different device, replace localhost with the IP address of the device.

### Updating openHAB

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

### Backup and Restore

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
