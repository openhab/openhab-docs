---
layout: documentation
title: Serial port configuration
---

{% include base.html %}

# Serial port configuration

Without correct configuration, binding using serial devices might not be able to open the serial port for communication, and you will see an error message in the logs.

Following section gives serial configuration advice with different platforms.

## Windows

No special configuration is needed, you can use the COM port number (e.g. `COM4`) in the thing configuration.

## Linux

If you can see issues related to opening the serial port with Linux, and you are using **non standard serial ports** (e.g. `/dev/ttyAMA0`) you might have to configure openHAB to detect and access the port correctly:

* Adapt java command line arguments to include `-Dgnu.io.rxtx.SerialPorts=/dev/ttyAMA0` (where `/dev/ttyAMA0` is the serial port). If you have multiple serial ports to configure, separate them with colon (`:`). Depending on openHAB installation method, you should modify `start.sh`, `start_debug.sh`, `start.bat`, or  `start_debug.bat` (standalone/manual installation) or `EXTRA_JAVA_OPTS` in `/etc/default/openhab2` (debian installation)
* Depending on linux distribution, you might need to add the user running openHAB to `dialout` user group. With Debian openHAB installation: `sudo usermod -a -G dialout openhab`. The user will need to logout from all login instances and log back in to see their new group added. If the user added to this group still cannot get permission, rebooting the box to ensure the new group permission is attached to the user is suggested.
* When using more than one USB-Serial converters, it may happen that the `/dev/ttyUSB0` device is named `/dev/ttyUSB1` after a reboot. To prevent this problem, alias names can be assigned to serial devices by adding them to `/etc/udev/rules.d/99-com.rules`. Example:

```bash
SUBSYSTEM=="tty", ATTRS{idVendor}=="0403", ATTRS{idProduct}=="6001", ATTRS{serial}=="AE01F0PD", SYMLINK+="ttyMySensors"
SUBSYSTEM=="tty", ATTRS{idVendor}=="10c4", ATTRS{idProduct}=="ea60", ATTRS{serial}=="0001", SYMLINK+="ttyCulStick"
```

You need to find relevant pieces of information using e.g. `udevadm` command line utility:

```
udevadm info -a -p $(udevadm info -q path -n /dev/ttyACM0)
```

## MacOS

When working with a Mac, it may be necessary to install a driver for the USB-RS232 converter (e.g. [osx-pl2303](http://osx-pl2303.sourceforge.net/) or [pl2303](http://mac.softpedia.com/get/Drivers/PL2303-OS-X-driver.shtml) and create the `/var/lock` folder; see the [rxtx troubleshooting guide](http://rxtx.qbang.org/wiki/index.php/Trouble_shooting#Mac_OS_X_users).
