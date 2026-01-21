---
layout: documentation
title: openHAB on OpenBSD
---

# openHAB on OpenBSD

The following instructions will guide you through the process of setting up openHAB on OpenBSD.

All instructions can be executed in a terminal or remotely via SSH connection.

## Installation

openHAB is installed as a prebuild package on OpenBSD.

```shell
# pkg_add openhab
```

When you choose to install an add-on, openHAB will download it from the internet on request.
If you plan on disconnecting your machine from the internet, then you will want to also install the add-ons package.

```shell
# pkg_add openhab-addons
```

#### Start openHAB automatically

If everything went well, you can start openHAB and register it to be automatically executed at system startup.

```shell
# rcctl start openhab
# rcctl check openhab
# rcctl enable openhab
```

The first start may take **up to 15 minutes**, this is a good time to reward yourself with hot coffee or a freshly brewed tea!

You should be able to reach the openHAB Dashboard at `http://localhost:8080` at this point.

#### Uninstall

To uninstall openHAB and get rid of all related files managed by the package manager, make a backup, then uninstall openHAB and remove the repository:

```shell
# doas pkg_delete openhab
```

### File Locations

|                               | Repository Installation
| :---------------------------: | -----------------------------------
|      openHAB application      | `/usr/local/libexec/openhab`
|    Additional add-on files    | `/usr/local/libexec/openhab/addons`
|      Site configuration       | `/etc/openhab`
|           Log files           | `/var/log/openhab`
| Userdata like rrd4j databases | `/var/db/openhab`
|        Backups folder         | `/var/db/openhab/backups`
|     Service configuration     | `/etc/rc.d/openhab`

## Viewing Log Messages

You can learn more about openHAB and how it works by looking at your log files.
These will tell you everything you might need to know.
Execute the following command in one session or have both files separated in sessions side by side:

```shell
# tail -f /var/log/openhab/openhab.log -f /var/log/openhab/events.log
```
