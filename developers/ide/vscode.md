---
layout: developersguide
title: Visual Studio Code
---

# VSCode

The following shows the steps for a Win10 system but should be similar for OSX/Linux.  Please note that you must double up on backward slashes on a windows system (`c:\\something`).  On linux/osx, simply use a forward slash (`\etc\something`) .

## Pre-requesites

1. Must have Visual Studio Code (VSCode) installed
2. Java 8+ SDK (not the JRE) installed and either JAVA_HOME or JDK_HOME pointing to it
3. Base development directory (example: `c:\users\me\development`).  The `%BASE%` references below will be to this directory.
4. Maven installed and the `mvn` command is in your path (open a console and type `mvn -version` to verify)
5. openHAB 2.5+ is already installed

## References

1. [Addon development thread](https://community.openhab.org/t/addon-development/73935/19)
2. [VSCode with Java](https://code.visualstudio.com/docs/languages/java)
3. [VSCode with Java debugging](https://code.visualstudio.com/docs/java/java-debugging)
4. [openHAB Migration to BND](https://github.com/maggu2810/openhab-dev-doc/blob/master/maven-bnd.md)

## Steps

1. Install Java Extension Pack for VSCode (https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
   
2. Clone the addons (https://github.com/openhab/openhab2-addons.git or your own fork) to %BASE%\openhab2-addons
   
3. Ensure the bundle builds correctly (natively with maven)
   1. Open console to `%BASE%\openhab2-addons\bundles\org.openhab.binding.sony` (or pick any other bundle)
   2. `mvn clean install -DskipChecks` in the console to build the bundle
   3. Should produce a jar file in the 'target' directory (example: `%BASE%\openhab2-addons\bundles\org.openhab.binding.sony\target\org.openhab.binding.sony-2.5.0-SNAPSHOT.jar`)
   
4. Open VSCode and then open the folder of the bundle (example: `%BASE%\openhab2-addons\bundles\org.openhab.binding.sony`)
   
5. Create a ".vscode" directory under the bundle (example: `%BASE%\openhab2-addons\bundles\org.openhab.binding.sony\.vscode`)   
    ![define .vscode](images/ide_setup_vscode_folder.png)

6. Download [tasks.json](examples/vscode/tasks.json) to the .vscode directory (example: `%BASE%\openhab2-addons\bundles\org.openhab.binding.sony\.vscode\tasks.json`)
    ![define tasks.json](images/ide_setup_vscode_folder_tasks.png)
   
7. Edit tasks.json and ...
   
    ![tasks.json changes](images/ide_setup_vscode_tasks.png)
   1. Set `openhab_*` to the directories for your openHAB installation (note you need to double up on forward slashes for windows)
   2. Set `dist` to the name of the JAR file maven is producing in the target directory
   3. Save and close tasks.json
   
8. Stop any openHAB instance (if it's running).
   
9.  Start the openHAB instance with the debug option - `start.bat debug` from a console in the openHAB home directory.  You should see the following line printed somewhere in the karaf console:
	`Listening for transport dt_socket at address: xxxx` (where xxxx should be 5005)

10. Download [launch.json](examples/vscode/launch.json) to the .vscode directory  (example: `%BASE%\openhab2-addons\bundles\org.openhab.binding.sony\.vscode\launch.json`)

    ![define launch.json](images/ide_setup_vscode_folder_launch.png)

11. Edit launch.json and ...
    
    ![launch.json changes](images/ide_setup_vscode_launch.png)
    1. Set the `port` to xxxx (from step 8).  This can be skipped if xxxx was 5005 from step 8.
    2. Set the `hostName` to the hostname running openHAB.  This can be skipped if running locally (localhost)
    3. Save and close launch.json

12. Verify it's working - press F5 (or bring up debug in VSCode and choose the "Debug (Attach) - openHAB" configuration).  The VSCode terminal should show the following:
    1. The maven compile occuring
    2. Copying the resulting JAR to the openHAB addons directory
    3. Connecting to the openHAB instance (the debug call stack should show a bunch of openHAB type threads running)
   
You can now make changes, set breakpoints, etc.  Repeat 4-11 for each bundle you want to debug.

## Notes

1. May take openHAB a few seconds to realize there is a new addon and to reinitilize it after it's been copied.  Be a bit patient.
2. You must run `mvn clean install -DskipChecks` ONCE on the bundle BEFORE using tasks.json
   
## Tasks

The [tasks.json](examples/vscode/tasks.json) defines the following tasks that you may use withing VSCode (`CTRL-SHIFT-P > Tasks: Run Task`):

1. **Start openHAB (Debug)** - this task will start a new instance of openHAB in debug mode (allowing VSCode to connect to it).  Please shut down any other instances of openHAB prior to running this (see next task).  Formally, this will call `start.bat debug` (or `start.sh debug` on osx/linux) in the `openhab_home` directory.
2. **Stop openHAB** - this task will stop any running instance.  Please note this will stop an instance started outside of VSCode as well on the same machine.  Formally, this will call `stop.bat` (or `stop.sh` on osx/linux) in the `openhab_runtime\\bin` directory.
3. **mvn Compile (w/Checks)** - this task will run a maven compile with code checks.  Formally, will run `mvn -o clean install`
4. **mvn Compile (No Checks)** - this task will run a maven compile skipping code checks.  Formally, will run `mvn -o clean install -DskipChecks`
5. **Copy Distribution to Addons** - this task will run the 'mvn Compile (No Checks)' task and then copy the resulting target file (as defined by `dist`) to your openHAB addons directory (defined by `openhab_addons`)
6. **Build** - this is an alias for `Copy Distribution to Addons` task.


	