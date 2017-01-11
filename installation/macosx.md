---
layout: documentation
title: Mac OS X
---

{% include base.html %}

# Installation on Mac OS X

Warnings
=====

In this chapter, we have chosen to download the latest nighty build, as openHAB 2 is in a beta phase:

Installing openHAB
=========

To do this :

* Go to the following site (it contains the latest version) : [https://openhab.ci.cloudbees.com/job/openHAB-Distribution](https://openhab.ci.cloudbees.com/job/openHAB-Distribution).
* Click on the link: `openhab-2.0.0-SNAPSHOT.zip`, to download it in your "download" folder.
* Open the terminal window.
* Choose a folder name to host your install. The directory will be created in your home folder. Be aware that the path to this folder, and the name of the folder itself, __must not contain any space character__ in order to prevent this classical cause of crash. The name chosen here is `openHAB`.
* Use the `ls` command in order to check that your directory does not exists yet.

```
cal:~ callas$ ls
Desktop			Movies
Documents		Music
Downloads		Pictures
Library			Public
```

* Move the downloaded file. Assuming that you have downloaded the file in your download folder, the command will be:

```
cal:~ admin$ mv Downloads/openhab-2 openhab
```

* Use the "ls" command in order to check that your directory exists now.

```
cal:~ callas$ ls
Desktop			Movies	Public
Documents		Music
Downloads		openhab
Library			Pictures
```

* Move inside the `openhab` folder using the "cd" command.

```
cal:~ callas$ cd openhab/
```

* Use the "ls" command in order to check what is inside.

```
cal:openhab admin$ ls
LICENSE.TXT	conf		start.bat	start_debug.bat	userdata
addons		runtime		start.sh	start_debug.sh
```


Launching openHAB for the first time
====================================

We are going to launch openHAB for the first time, in order to check that our install is successful.

* In the terminal window, type ./start.sh

* Messages are displayed, wait until the "openhab>" prompt appears.

```
cal:openhab admin$ ./start.sh
Launching the openHAB runtime...

                          __  _____    ____      
  ____  ____  ___  ____  / / / /   |  / __ )     
 / __ \/ __ \/ _ \/ __ \/ /_/ / /| | / __  | 
/ /_/ / /_/ /  __/ / / / __  / ___ |/ /_/ /      
\____/ .___/\___/_/ /_/_/ /_/_/  |_/_____/     
    /_/                        2.0.0-SNAPSHOT


Hit '<tab>' for a list of available commands
and '[cmd] --help' for help on a specific command.
Hit '<ctrl-d>' or type 'system:shutdown' or 'logout' to shutdown openHAB.

openhab>
```

* Without closing the terminal, open your favorite web browser and type the following url : http://localhost:8080, you should see the openHab welcome screen.

![](images/Accueil_Openhab_2.png)


> **Which browser should I use?**
>
> Safari is supported by openHAB, but the fact is the browser used by the openHAB developer community - and by the owner of the ZWave plugin - is Google Chrome.
> We recommend then Google Chrome, as openHAB 2 is in a beta phase.
