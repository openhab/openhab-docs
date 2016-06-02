---
layout: documentation
---

{% include base.html %}

# Installation on Linux through APT

1.  Install prerequisites 

1.  Add the openHAB Bintray Repositories key to the apt-keyring

    - with wget:

    ```
    wget -qO - 'https://bintray.com/user/downloadSubjectPublicKey?username=openhab' | sudo apt-key add -
    ```

    - or with curl:

    ```
    curl 'https://bintray.com/user/downloadSubjectPublicKey?username=openhab' | sudo apt-key add -
    ```

1.  Add openHAB apt repository to the apt sources list (Note: the current openhab.list file will be overwritten)

    - To install a beta releases use:

    ```
    echo 'deb http://dl.bintray.com/openhab/apt-repo2 testing main' | sudo tee /etc/apt/sources.list.d/openhab.list
    ```

    - For stable releases use:

    ```
    echo 'deb http://dl.bintray.com/openhab/apt-repo2 stable main' | sudo tee /etc/apt/sources.list.d/openhab.list
    ```

1.  Resynchronize the package index

    ```
    sudo apt-get update
    ```

1.  Install openHAB

    - Either use the offline distribution which is full blown and comes with all addons. Additional addons will be 
    installed an request from your local disk.

    ```
    sudo apt-get install openhab2-offline
    ```

    - Or the online distribution which will install additional addons on request from the internet.

    ```
    sudo apt-get install openhab2-online
    ```

1.  Start openHAB - manually

    - Init based on sysVinit (e.g. Debian 7 / Ubuntu 14.x and earlier)

    ```
    sudo /etc/init.d/openhab2 start
    sudo /etc/init.d/openhab2 status
    ```

    - Init based on systemd (e.g. Debian 8 / Ubuntu 15.x and newer)

    ```
    sudo systemctl start openhab2
    ```

1. Start openHAB - at system startup

    - Init based on sysVinit (e.g. Debian 7 / Ubuntu 14.x and earlier)

    ```
    sudo update-rc.d openhab2 defaults
    ```

    - or using Init based on systemd (e.g. Debian 8 / Ubuntu 15.x and newer)

    ```
    sudo systemctl daemon-reload
    sudo systemctl enable openhab2
    ```


# To Upgrade

Note: changed configuration files will be retained even on upgrades.

```
sudo apt-get update
sudo apt-get upgrade
```

# File Locations

| service configuration | `/etc/default/openhab2` |
| site configuration | `/etc/openhab2` |
| log files |  `/var/log/openhab2` |
| userdata like rrd4j databases | `/var/lib/openhab2` and subdirectories |
| openHAB application |  `/usr/share/openhab2` |


# Advanced Setup - Apt Repository Distributions

* stable

    The latest stable openHAB release will be installed.

* testing

    The latest release candidate of openHAB will be installed.

* version based distribution names (2.0.0.b3, 2.0.0, ...)

    All Releases are available as with a distribution name corresponding to the version name.
    If you want to stick your installation to a specific version use one of these distribution names.
    The installation will only be upgraded if you change the sources.list to another version.
    Therefore `apt-get update && apt-get upgrade` can be safely used for the other Linux software.

    Examples:

    ```
    echo "deb https://dl.bintray.com/openhab/apt-repo2 2.0.0.b3 main" | sudo tee -a /etc/apt/sources.list
    echo "deb https://dl.bintray.com/openhab/apt-repo 2.0.0 main" | sudo tee -a /etc/apt/sources.list
    ```

