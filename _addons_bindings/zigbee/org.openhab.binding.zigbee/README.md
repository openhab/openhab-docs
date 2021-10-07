# ZigBee Binding

The ZigBee binding supports an interface to a wireless ZigBee home automation network and allows ZigBee devices from numerous manufacturers to be used without a system specific gateway.

## Supported Things

### Coordinators

A ZigBee Coordinator is the network controller, and is therefore the heart of the ZigBee network. It also acts as the trust centre to control security access to the network.

#### Configuring a coordinator

Coordinators need to be installed manually and the serial port (`zigbee_port`) and baud rate (`zigbee_baud`) must be set. These are set to match the configuration that the dongle is in. Should you wish to use a different baud rate than the default speed of the device (get default baud rate from the device manual) , you must change the configuration of the dongle using some other, and then configure the binding to match your change. If in doubt, you should leave the settings at their default values which should work in most cases.

If you are running on Linux, then you probably need to add the user 'openhab' to the tty group, and enable `EXTRA_JAVA_OPTS` for the serial port your coordinator uses (see [Linux install guide](https://www.openhab.org/docs/installation/linux.html#privileges-for-common-peripherals)). Additionally for Docker users, you will need to pass the serial port through Docker to openHAB (see [Docker install guide](https://www.openhab.org/docs/installation/docker.html#explanation-of-arguments-passed-to-docker))

##### Configuration via UI (recommended)

After you have installed the binding, you can add a coordinator via the UI, by navigating to **Settings** > **Things** and clicking on the blue `+` button in the bottom right corner. Then choose the coordinator that matches your dongle. Make sure you check the **Show advanced** box, there are some important settings that otherwise stay hidden. Please refer to the sections [Serial port Configuration](#serial-port-configuration) and [Coordinator Configuration](coordinator-configuration) below for information about the settings for a coordinator.

##### Configuration via config file

You can also configure the coordinator via an old style Things file. Things files should be placed in `OPENHAB_CONF/things`. Here are some examples for a coordinator congiguration in a `.things` file.

**minimal example:**

```java
Thing zigbee:coordinator_cc2531:stick1 "Zigbee USB Stick" [zigbee_port="/dev/ttyACM0", zigbee_baud=38400]
```

**extended example:**

```java
Thing zigbee:coordinator_ember:stick "Zigbee USB Stick" [zigbee_port="/dev/ttyUSB-Zigbee", zigbee_baud=57600, zigbee_flowcontrol=2, zigbee_childtimeout=864000, zigbee_concentrator=1, zigbee_meshupdateperiod=86400, zigbee_panid=35637, zigbee_extendedpanid="118E309DE90CC829", zigbee_networkkey="14 c6 a2 c7 fb e0 c3 19 8e 7c 36 30 dc ad a5 96", zigbee_powermode=1, zigbee_txpower=8]
```

_NOTE_: Do not use the values for `zigbee_networkkey`, `zigbee_panid` and `zigbee_extendedpanid` from this example, create random values for your own Zigbee network.

_NOTE_: If you are using thing configuration files, you **MUST** define the following configuration parameters, or the system will not work properly as random values will be used at each restart:

- `zigbee_panid`,
- `zigbee_extendedpanid`,
- `zigbee_networkkey`.

#### Serial port Configuration

If you are using a config file, the serial port needs to be configured as shown in the above example. Below is a list of the relevat settings concerning the serial port.

| Setting               | Allowed values                                                                                                                                                                                                     |
| --------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `zigbee_baud`         | Ember controllers: `38400`, `57600`, `115200` <br/>Telegesis controllers: `19200`, `38400`, `57600`, `115200` <br/>Xbee controllers: `9600`, `57600`, `115200` <br/>CC2531 controllers: `38400`, `57600`, `115200` |
| `zigbee_flowcontrol ` | `0` = None, <br/>`1` = Hardware (CTS/RTS), <br/>`2` = Software (XOn/XOff)                                                                                                                                          |
| `zigbee_port`         | The name of the serial port, e.g. `/dev/ttyUSB1` or `/dev/ttyZigbee` or whatever the port is named on your system                                                                                                  |

#### Coordinator Configuration

Note that not all configuration parameters are available with all coordinators.

##### Link Key (zigbee_linkkey)

The key is defined as 16 hexadecimal values. If not defined, this will default to the well known ZigBee HA link key which is required for ZigBee HA 1.2 devices. Do not alter this key if using with a ZigBee HA 1.2 network unless you fully understand the impact.

If defined with the word `INSTALLCODE:` before the key, this will create a link key from an install code which may be shorter than 16 bytes.

e.g. `5A 69 67 42 65 65 41 6C 6C 69 61 6E 63 65 30 39`
e.g. `INSTALLCODE:00 11 22 33 44 55 66 77`

##### Network Key (zigbee_networkkey)

The key is defined as 16 hexadecimal values. If not defined, a random key will be created.

##### Child Aging (zigbee_childtimeout)

ZigBee routers (and the coordinator) only have room to allow a certain number of devices to join the network via each router - once the child table in a router is full, devices will need to join via another router (assuming the child can communicate via another router). To avoid the child table becoming full of devices that no longer exist, routers will age out children that do not contact them within a specified period of time.

Once a child is removed from the child table of a router, it will be asked to rejoin if it tries to communicate with the parent again. Setting this time too large may mean that the router fills its tables with devices that no longer exist, while setting it too small can mean devices unnecessarily rejoining the network.

Note that ZigBee compliant devices should rejoin the network seamlessly, however some non-compliant devices may not rejoin which may leave them unusable without a manual rejoin.

**Values:** Timeout time in seconds. The table below lists the options that are shown in PaperUI and the equivalent values that can be set in a configuration file:

| Paper UI     | Config file |
| ------------ | ----------- |
| _5 Minutes_  | `320`       |
| _30 Minutes_ | `1800`      |
| _2 Hours_    | `7200`      |
| _12 Hours_   | `43200`     |
| _1 Day_      | `86400`     |
| _2 Days_     | `172800`    |
| _5 Days_     | `432000`    |
| _10 Days_    | `864000`    |
| _2 Weeks_    | `1209600`   |
| _4 Weeks_    | `2419200`   |
| _7 Weeks_    | `4233600`   |

Note that this value should be given as a number in the configuration file, without quotes. Also note that, technically, you are not bound to using the values from the table. But if you use an arbitrary number of seconds, not corresponding to one of the predefined periods, it might not be possible to display the configured value correctly in PaperUI.

##### Concentrator Type (zigbee_concentrator)

The Concentrator is used to improve routing within a ZigBee network, and is especially useful in a network where much of the traffic is sent to or from a central coordinator. If the coordinator has sufficient memory, it can store routing information, thus reducing network traffic.

If supported, the High RAM concentrator should be used.

**Values:**

| Value | Meaning               |
| ----- | --------------------- |
| `0`   | Low RAM concentrator  |
| `1`   | High RAM concentrator |

##### Mesh Update Period (zigbee_meshupdateperiod)

The binding is able to search the network to get a list of what devices can communicate with other devices. This is a useful diagnostic feature as it allows users to see the links between devices, and the quality of these links. However, this can generate considerable traffic, and some battery devices may not poll their parents often enough to provide these updates, and users may consider that it is better to reduce the period, or disable this feature.

**Value:** the update period in seconds. `0` means "never update". In PaperUI, a drop down list is shown, the options from that list are shown in te table below, with their equivalent values that can be put in a config file.

| UI           | Config file |
| ------------ | ----------- |
| _Never_      | `0`         |
| _5 Minutes_  | `300`       |
| _30 Minutes_ | `1800`      |
| _1 Hour_     | `3600`      |
| _6 Hours_    | `21600`     |
| _1 Day_      | `86400`     |
| _1 Week_     | `604800`    |

Please note that, technically, you are not bound to using the values from the table. But if you use an arbitrary number of seconds, not corresponding to one of the predefined periods, it might not be possible to display the configured value correctly in PaperUI.

##### Network Size (zigbee_networksize)

Some coordinators may need to allocate memory to handle each node in the network. This is an integer setting, and should be set to the maximum number of nodes expected to be added to the network. It should be noted that this will consume memory on the coordinator which may impact on other services such as packet buffers, so it is not advised to simply set this to the maximum value.

##### Trust Centre Join Mode

Sets the Trust Centre join/rejoin mode.

| enumeration           | label                        | explanation                                                                                 |
| --------------------- | ---------------------------- | ------------------------------------------------------------------------------------------- |
| `TC_JOIN_DENY`        | Deny all joins.              |                                                                                             |
| `TC_JOIN_SECURE`      | Allow only secure joining.   | Devices should join with the TC Link Key or a Device Specific Link Key via an install code. |
| `TC_JOIN_INSECURE`    | Allow all joins.             |                                                                                             |
| `TC_JOIN_INSTALLCODE` | Only join with install code. | Devices attempting to join with the TC Link Key will be rejected.                           |

#### Supported Coordinators

The following coordinators are known to be supported.

| Name and Link                                                                                                                                         | Coordinator                          | Configuration                                            | Comment                                                                                                                                                                                                                                                                                        |
| ----------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------ | -------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [Texas Instruments CC2531EMK](http://www.ti.com/tool/cc2531emk)                                                                                       | [CC2531](#cc2531-coordinator)        |                                                          | CC2531 is not recommended for more then 15 devices due to its less powerful MCU. Also needs extra [hardware and Z-Stack Home 1.2 firmware flashed](https://www.zigbee2mqtt.io/information/flashing_the_cc2531.html). CC2530 and CC2538 may work too with Z-Stack Home 1.2 compatible firmware. |
| [Bitron Video ZigBee USB Funkstick](http://www.bitronvideo.eu/index.php/produkte/smart-home-produkte/zb-funkstick/)                                   | [Ember](#ember-ezsp-ncp-coordinator) | 57600bps<br>Software&nbsp;flow&nbsp;control<br>High RAM  |                                                                                                                                                                                                                                                                                                |
| [Elelabs ELU013/ELR023](https://elelabs.com/shop/)                                                                                                    | [Ember](#ember-ezsp-ncp-coordinator) | 115200bps<br>Hardware&nbsp;flow&nbsp;control<br>High RAM | Both the stick and the hat can be upgraded without additional hardware, firmware available [here](https://github.com/Elelabs/elelabs-zigbee-ezsp-utility).                                                                                                                                     |
| [Cortet EM358 USB Stick](https://www.cortet.com/iot-hardware/cortet-usb-sticks/em358-usb-stick)                                                       | [Ember](#ember-ezsp-ncp-coordinator) | 57600bps<br>Software&nbsp;flow&nbsp;control<br>High RAM  |                                                                                                                                                                                                                                                                                                |
| [Nortek Security & Control HUSBZB-1](https://nortekcontrol.com/products/2gig/husbzb-1-gocontrol-quickstick-combo/)                                    | [Ember](#ember-ezsp-ncp-coordinator) | 57600bps<br>Software&nbsp;flow&nbsp;control<br>High RAM  | Stick contains both Z-Wave and ZigBee.                                                                                                                                                                                                                                                         |
| [Telegesis ETRX357USB ZigBee® USB Stick](https://www.silabs.com/products/wireless/mesh-networking/telegesis-modules-gateways/etrx3-zigbee-usb-sticks) | [Telegesis](#telegesis-etrx3)        |                                                          |                                                                                                                                                                                                                                                                                                |
| [QIVICON ZigBee-Funkstick](https://www.qivicon.com/de/produkte/produktinformationen/zigbee-funkstick/)                                                | [Telegesis](#telegesis-etrx3)        |                                                          | Only working on Linux devices                                                                                                                                                                                                                                                                  |
| [Digi XStick](https://www.digi.com/products/xbee-rf-solutions/boxed-rf-modems-adapters/xstick)                                                        | [XBee](#digi-xbee-x-stick)           |                                                          |                                                                                                                                                                                                                                                                                                |

#### Ember EZSP NCP Coordinator

The Ember EZSP NCP (Network Co-Processor) supports the Silabs MightyGecko (EFR32MG) and the older EM357/8 dongles with the standard NCP firmware. The thing type is `coordinator_ember`. This dongle type is recommended due to its extensive use within both the community, and commercial systems using this dongle.

Note that there are generally two versions of the Ember NCP firmware in use. One operates at a baud rate of 115200 with RTS/CTS flow control (i.e. hardware flow control), the other operates at a baud rate of 57600, and XON/XOFF flow control (i.e. software flow control). If you are programming your own stick (e.g. the CEL stick) then it should be advisable to use the hardware flow control version - many commercial sticks seem to use the lower speed and software flow control (e.g. Bitron and Nortek HUSBZB-1).

Firmware versions higher than 6.4.0.0 may be required to work with some newer devices (ie those conforming to the Zigbee 3.0 standard). If your dongle has older firmware then devices may appear to join the network, but will not work as they will leave the network if they do not receive updated security information.

If the usb dongle is not recognized, it might be necessary to make the dongle's device id known to the CP240x driver by Silicon Labs:

- Find the device id (as listed by the command `lsusb`). For the Bitron Funkstick that might be 10c4 8b34.
- Unplug the device
- Enter the following commands (replace the id 10c4 8b34 with the one listed by `lsusb`):
  ```
  sudo -s
  modprobe cp210x
  echo 10c4 8b34 > /sys/bus/usb-serial/drivers/cp210x/new_id
  ```
- Plug in the dongle. It should now be recognized properly as ttyUSBx.

##### Upgrading firmware

Dongle firmware can be upgraded using the openHAB console with the `zigbee firmware` command. The firmware file must be specified next. The dongle will be taken offline, put into firmware upgrade mode and then upgraded. You MUST ensure that you have the correct firmware for your dongle as programming the incorrect firmware can render the device inoperable - requiring a programmer to recover.

##### Flashing/Upgrading on Linux

Some Ember EZSP NCP coordinators can be flashed to upgrade the firmware using walthowd/husbzb-firmware (https://github.com/walthowd/husbzb-firmware). It has been tested with the HUSZBZ-1 and Telegesis ETRX357USB and may work with other coordinators. You are responsible to ensure you load the correct firmware for your device - loading the wrong firmware may render your device inoperable.

Review the `husbzb-firmware` readme for detailed instructions. Using docker to upgrade a HUSZBZ-1 is as follows:

- Shutdown openHAB
- `docker run --rm --device=/dev/ttyUSB1:/dev/ttyUSB1 -it walthowd/husbzb-firmware bash`
- `./ncp.py scan`
- Verify output shows which version of firmware the coordinator is running.
  ```
  {"ports": [{"port": "/dev/ttyUSB1", "vid": "10C4", "pid": "8A2A", "deviceType": "zigbee", "stackVersion": "5.4.1-194"}]}
  ```
- `./ncp.py flash -p /dev/ttyUSB1 -f ncp-uart-sw-6.7.8.ebl`
- Wait for the flashing to complete and the coordinator to reboot.
- `./ncp.py scan`
  ```
  {"ports": [{"port": "/dev/ttyUSB1", "vid": "10C4", "pid": "8A2A", "deviceType": "zigbee", "stackVersion": "6.7.8-373"}]}
  ```

#### Digi XBee X-Stick

The thing type is `coordinator_xbee`. Other XBee S2C devices should also be supported.

The XBee must be run with API mode firmware and not the AT firmware.

#### Telegesis ETRX3

The thing type is `coordinator_telegesis`. Note that this dongle may not support all Zigbee 3.0 devices although the firmware may be upgraded to support the standard Ember NCP firmware - see the Ember NCP section above for details.

#### CC2531 Coordinator

**Not Recommended for new systems**

Z-Stack Home 1.2 is the Texas Instruments ZNP stack for Zigbee Home Automation 1.2 networks. The thing type is `coordinator_cc2531`. While this dongle is cheaply available from shops in China, it is no longer supported by the manufacturer and users may experience problems using this dongle with newer Zigbee 3.0 devices. Official firmware from TI doesn't support the updated security required by Zigbee 3.0 and devices may therefore join the network, and then leave again if the security is insufficient. Users will see this as a device in the inbox, and depending on exact timing for the device to leave, the device may be labled correctly, or as an unknown device. Either way it will not respond. Custom firmware created by users may be available on the Internet to work around this issue to allow this stick to be used, or if users are only using older devices, or cheaper Chinese devices, this may still work ok.

##### CC2531 - Firmware

The CC2531 USB dongle must be flashed with Z-Stack Home 1.2 firmware firmware in order to work with this binding. Flashing CC2531 requires extra hardware.
Original firmware can be downloaded from TI website archives (http://www.ti.com/tool/z-stack-archive) as part
of the `Z-STACK-HOME v.1.2.2a` package.
The file name is `CC2531ZNP-Pro-Secure_Standard.hex` and its sha256 is `3cc5dc571ef0f49e3f42c6c2ca076d6f8fef33a945c71e6f951b839ba0599d3c`.

Custom Z-Stack Home 1.2 firmware from [Zigbee2MQTT](https://github.com/Koenkk/Z-Stack-firmware/tree/master/coordinator/Z-Stack_Home_1.2/bin) can also be used, and has been reported working by some users.

##### Flashing on Linux

It's possible to flash the dongle using Linux, using `cc-tool` (https://github.com/dashesy/cc-tool.git).
The required dependencies can be installed with `sudo apt install build-essential libusb-1.0-0-dev libboost-all-dev`, and the binary compiled with `./configure && make`. Do not forget to install the `udev` rules, as described at https://github.com/dashesy/cc-tool/blob/master/README , or the software might not be able to access the USB programmer.

The firmware can be flashed with `./cc-tool -e -w CC2531ZNP-Pro-Secure_Standard.hex -v r`. Change the path to the firmware accordingly.

##### Flashing on Windows

For flashing the dongle using windows you need the [TI Flash Programmer](http://www.ti.com/tool/flash-programmer) (version 1, not version 2) and the Cebal drivers from [this TI site](http://www.ti.com/tool/cc-debugger) (available in section Software).
Extract and install the TI Flash Programmer, connect the CC-Debugger trough USB, and with the dongle using the connector board. In the Windows device manager update the device driver with the Cebal drivers. Now the TI Flash Programmer should show your device. Select the firmware file, flash and verify your dongle firmware.

### Devices

The following devices have been tested by openHAB users with the binding. The absence of a device in this list does not mean it will not work - if the device is a standard ZigBee device similar to ones on this list, then it should work.

| Device                                         | Description                                                  |
| ---------------------------------------------- | ------------------------------------------------------------ |
| Busch-Jaeger 6711 U                            | Relay Insert                                                 |
| Busch-Jaeger 6715 U                            | LED-Dimmer Insert                                            |
| Busch-Jaeger 6735                              | Control Element (1-channel)                                  |
| Busch-Jaeger 6735/01                           | Control Element (1-channel, battery-operated)                |
| Busch-Jaeger 6736                              | Control Element (2-channel)                                  |
| Eurotronic Spirit Thermostat                   | Radiator Thermostat                                          |
| GE Bulbs                                       |                                                              |
| GE Tapt Wall Switch                            | On/Off Switch                                                |
| Hue Bulbs                                      | Color LED Bulb                                               |
| Hue Dimmer                                     | Hue Dimmer Switch Remote _[<sup>[2]</sup>](#note2)_          |
| Hue Motion Sensor                              | Motion and Luminance sensor                                  |
| IKEA Fyrtur Blinds                             | Roller blinds                                                |
| IKEA Tradfri Bulbs                             |                                                              |
| IKEA Tradfri Motion Sensor                     |                                                              |
| IKEA Tradfri Outlet                            |                                                              |
| IKEA Tradfri Repeater                          |                                                              |
| Innr Bulbs                                     | _[<sup>[1]</sup>](#note1)_                                   |
| Innr SP 120                                    | Smart Plug _[<sup>[1]</sup>](#note1)_                        |
| LEDVANCE/Osram Bulbs                           |                                                              |
| Lupus Small Zigbee Temperature Sensor 12314    | Lupus-Electronics Temperature and Humidity sensor            |
| Osram Flex 3P Multicolor                       | Osram Smart+ LED Strip                                       |
| Osram Motion Sensor                            | Osram Smart+ Motion Sensor _[<sup>[1]</sup>](#note1)_        |
| Securifi Peanut Plug                           | Metered Plug                                                 |
| Shenzhen Ksentry Electronics On Off Controller | Relay                                                        |
| SMaBiT (Bitron Video) Magnetic contect         | AV2010/21 /21A /21B /21C                                     |
| SMaBiT (Bitron Video) Motion Sensor            | AV2010/22 /22A /22B                                          |
| SMaBiT (Bitron Video) Wall-mount relay         | AV2010/18 (10A on/off), /16 (2.5A Dimmer)                    |
| SMaBiT (Bitron Video) Smart Plug               | AV2010/25 (16A Metering), 28 (16A on/off), /16 (2.5A Dimmer) |
| SMaBiT (Bitron Video) Remote Control           | AV2010/23                                                    |
| SMaBiT (Bitron Video) Wall button              | AV2010/34                                                    |
| SMaBiT (Bitron Video) Smoke Detector           | AV2010/24 /24A (operation as indoor-siren supported as well) |
| SMaBiT (Bitron Video) Outdoor siren            | AV2010/29 /29A                                               |
| SMaBiT (Bitron Video) Vibration sensor         | AV2010/33                                                    |
| SMaBiT (Bitron Video) Water leak sensor        | AV2010/37 (siren cannot be triggered separately)             |
| SMaBiT (Bitron Video) Thermostat w. relay      | AV2010/32 (only heating mode supported)                      |
| SmartThings Plug                               | Metered Plug                                                 |
| SmartThings Motion Sensor                      | CentraLite 3325-S Motion and Temperature sensor              |
| SmartThings Contact Sensor                     | Contact and Temperature sensor                               |
| Telkonet EcoInsight Thermostat                 | Intelligent HVAC Thermostat                                  |
| Trust Bulbs                                    | _[<sup>[1]</sup> ](#note1)_                                  |
| Ubisys modules                                 | D1 Dimmer, S1/S2 Switch modules                              |
| Xiaomi Aqara Door and Window Sensor            | _[Known issues](#xiaomi-devices)_                            |
| Xiaomi Aqara Temperature and Humidity Sensor   | _[Known issues](#xiaomi-devices)_                            |
| Xiaomi Aqara Human Motion Sensor               | _[<sup>[3]</sup>](#note3)_ _[Known issues](#xiaomi-devices)_ |
| Xiaomi Aqara Wireless Mini Switch              | _[Known issues](#xiaomi-devices)_                            |
| Xiaomi Aqara Wired Wall Switch                 | _[Known issues](#xiaomi-devices)_                            |
| Xiaomi Aqara Wireless Remote Switch            | Double Rocker variant _[Known issues](#xiaomi-devices)_      |

<a name="note1"></a> _Note 1: Some devices may not work with the Telegesis dongle._

<a name="note2"></a> _Note 2: The Hue Dimmer can be integrated but needs additional rule-configuration to work properly. See below for example._

<a name="note3"></a> _Note 3: The illuminance channel value is being reported incorrectly. Transform by 10000\*log10(measuredValue+1) to get the correct illuminance in lux._

## Discovery

Discovery is performed by putting the binding into join mode (by starting an inbox search), and then putting the device into join mode. Generally, it is best to reset the device to do this. Resetting the device ensures that it is no longer joined to a previous network, will ensure it is awake if it is a battery device, and will restart any channel and network search that the device may perform. Consult the manual of the device at hand to see how to reset it, this differs from device to device.

Once the binding is installed, and an adapter is added, it automatically reads all devices that are set up on the ZigBee controller and puts them in the Inbox. When the binding is put into discovery mode via the user interface, the network will have join enabled for 60 seconds. You can put it in discovery mode via the **Scan** button in the user interface. This can be found after you click the blue **+** button in the bottom right corder of the **Things** screen and then select the **ZigBee Binding**.

The binding will store the list of devices that have joined the network locally between restarts to allow them to be found again later. A ZigBee coordinator does not store a list of known devices, so rediscovery of devices following a restart may not be seemless if the dongle is moved to another system.

When a ZigBee device restarts (e.g. a bulb is powered on), it will send an announcement to advise the coordinator that it is on the network and this will allow the binding to rediscover devices that have become lost. Battery devices often have a button that may also perform this function.

### Install Codes

Note: Currently only Ember coordinators support Zigbee 3.0, it does not look like the Telegesis coordinators will receive an update to support it.

ZigBee 3.0 requires that devices use an install code to securely join the network. This must be added
to the binding before the discovery starts. Install codes should be printed on the box the device came
in, or possibly on the device itself. Note that there is no standard format for how these codes may be
displayed on the device or its packaging. You may need to use a QR reader to read the code - again these
are not standard in their format, although you should be able to find the address and install code in the
displayed text.

The install code must be entered into the coordinator settings before starting the discovery process.
The format is `IEEE Address:Install Code` in the following format -:

```
AAAAAAAAAAAAAAAA:CCCC-CCCC-CCCC-CCCC-CCCC-CCCC-CCCC-CCCC-DDDD
```

ZigBee 3.0 requires the install code to be 16 bytes long (8 blocks of characters) but some older systems using
this method may use less bytes, but it should still be formatted as 2, 4, or 8 groups of 4 values.
Note that the last four characters in the install code are the checksum and may be provided separately.

## Leave

When a thing is deleted, the binding will attempt to remove the device from the network by sending the _leave_ command on the network. The binding will put the Thing into the `REMOVING` state and once the leave is confirmed it will be finally `REMOVED`. It is not advised for force remove the Thing as this may cause an incomplete removal, and the device may be immediately added back to the Inbox.

## Thing Configuration

The binding will attempt to automatically detect new devices, giving them a type based on the information they report, and will read their supported clusters to define the supported channels.

### Thing Types

Currently all ZigBee things have the same thing type of `zigbee_device`.

### Channel Types

A set of channels will be created depending on what clusters and endpoints a device supports. Channels are loosely linked to clusters in that for the majority of channels, a single cluster is used. However, some channels may utilise more than one cluster to provide the required functionality.

The following channels are supported -:

| Channel UID                  | ZigBee Cluster                           | Type                     | Description |
| ---------------------------- | ---------------------------------------- | ------------------------ | ----------- |
| battery-level                | `POWER_CONFIGURATION` (0x0001)           | Number                   |             |
| battery_voltage              | `POWER_CONFIGURATION` (0x0001)           | Number:ElectricPotential |             |
| binaryinput                  | `BINARY_INPUT__BASIC` (0x000F)           | Switch                   |             |
| color_color                  | `COLOR_CONTROL` (0x0300)                 | Color                    |             |
| color_temperature            | `COLOR_CONTROL` (0x0300)                 | Dimmer                   |             |
| door_state                   | `DOOR_LOCK` (0x0101)                     | Switch                   |             |
| electrical_activepower       | `ELECTRICAL_MEASUREMENT` (0x0B04)        | Number:Power             |             |
| electrical_rmscurrent        | `ELECTRICAL_MEASUREMENT` (0x0B04)        | Number:ElectricCurrent   |             |
| electrical_rmsvoltage        | `ELECTRICAL_MEASUREMENT` (0x0B04)        | Number:ElectricPotential |             |
| fancontrol                   | `FAN_CONTROL` (0x0202)                   | Number                   |             |
| ias_codetector               | `IAS_ZONE` (0x0500)                      | Switch                   |             |
| ias_contactportal1           | `IAS_ZONE` (0x0500)                      | Switch                   |             |
| ias_fire                     | `IAS_ZONE` (0x0500)                      | Switch                   |             |
| ias_motionintrusion          | `IAS_ZONE` (0x0500)                      | Switch                   |             |
| ias_motionpresence           | `IAS_ZONE` (0x0500)                      | Switch                   |             |
| ias_standard_system          | `IAS_ZONE` (0x0500)                      | Switch                   |             |
| ias_water                    | `IAS_ZONE` (0x0500)                      | Switch                   |             |
| ias_movement                 | `IAS_ZONE` (0x0500)                      | Switch                   |             |
| ias_vibration                | `IAS_ZONE` (0x0500)                      | Switch                   |             |
| ias_tamper                   | `IAS_ZONE` (0x0500)                      | Switch                   |             |
| ias_tamper                   | `IAS_ZONE` (0x0500)                      | Switch                   |             |
| measurement_illuminance      | `ILLUMINANCE_MEASUREMENT` (0x0400)       | Number                   |             |
| measurement_pressure         | `PRESSURE_MEASUREMENT` (0x0403)          | Number:Pressure          |             |
| measurement_relativehumidity | `RELATIVE_HUMIDITY_MEASUREMENT` (0x0405) | Number                   |             |
| measurement_temperature      | `TEMPERATURE_MEASUREMENT` (0x0402)       | Number:Temperature       |             |
| metering_instantdemand       | `METERING` (0x0702)                      | Number                   |             |
| metering_sumdelivered        | `METERING` (0x0702)                      | Number                   |             |
| metering_sumreceived         | `METERING` (0x0702)                      | Number                   |             |
| sensor_occupancy             | `OCCUPANCY_SENSING` (0x0406)             | Switch                   |             |
| switch_dimmer                | `LEVEL_CONTROL` (0x0008)                 | Dimmer                   |             |
| switch_onoff                 | `ON_OFF` (0x0006)                        | Switch                   |             |
| thermostat_localtemp         | `THERMOSTAT` (0x0201)                    | Number                   |             |
| thermostat_occupiedcooling   | `THERMOSTAT` (0x0201)                    | Number                   |             |
| thermostat_occupiedheating   | `THERMOSTAT` (0x0201)                    | Number                   |             |
| thermostat_outdoortemp       | `THERMOSTAT` (0x0201)                    | Number                   |             |
| thermostat_runningmode       | `THERMOSTAT` (0x0201)                    | Number                   |             |
| thermostat_systemmode        | `THERMOSTAT` (0x0201)                    | Number                   |             |
| thermostat_unoccupiedcooling | `THERMOSTAT` (0x0201)                    | Number                   |             |
| thermostat_unoccupiedheating | `THERMOSTAT` (0x0201)                    | Number                   |             |
| warning_device               | `IAS_WD` (0x0502)                        | String                   |             |
| windowcovering_lift          | `WINDOW_COVERING` (0x0102)               | Rollershutter            |             |

### Updates

The binding will attempt to configure a connection with the device to receive automatic and instantaneous reports when the device status changes. Should this configuration fail, the binding will resort to using a fast polling (note that "fast" is approximately 30 seconds at this time).

### Warning devices

For devices implementing the cluster `IAS_WD` (e.g., sirens or, in some cases, smoke detectors), the binding adds a channel of type `warning_device`.
To make the device emit a warning (by siren and/or strobe signal) for a specified time, a command of type `String` must be sent to the channel, where the command encodes the configuration of the warning.
Similarly, to make the device emit a squawk (by siren and/or strobe signal), a command of type `String` must be sent to the channel, where the command encodes the configuration of the squawk.

Examples:

| Command string                                                                   | Effect of the command                                                                                     |
| -------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `type=warning useStrobe=true warningMode=BURGLAR sirenLevel=HIGH duration=PT30S` | Start a warning using both strobe signal and siren (type 'burglar alarm'), with a duration of 30 seconds. |
| `type=warning useStrobe=false warningMode=FIRE sirenLevel=HIGH duration=PT60S`   | Start a warning using only siren (type 'fire alarm'), with a duration of 60 seconds.                      |
| `type=warning useStrobe=false warningMode=STOP sirenLevel=HIGH duration=PT30S`   | If the device is currently emitting a warning, this stops the warning.                                    |
| `type=squawk useStrobe=false squawkMode=ARMED squawkLevel=HIGH`                  | Makes the device emit a 'squawk' signaling 'armed', with high volume.                                     |

The syntax for the command strings is as in the examples above, where the possible values for `type`, `useStrobe`, `warningMode`, `squawkMode`, `sirenLevel`, `squawkLevel`, and `duration` are as follows:

| Command parameter        | Value range                                                                                                                                                                |
| ------------------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| type                     | `warning` and `squawk`                                                                                                                                                     |
| useStrobe                | `true` and `false`                                                                                                                                                         |
| warningMode              | `STOP`, `BURGLAR`, `FIRE`, `EMERGENCY`, `POLICE_PANIC`, `FIRE_PANIC`, `EMERGENCY_PANIC`, any integer value (for devices supporting warning modes not specified in the ZCL) |
| squawkMode               | `ARMED`, `DISARMED`, any integer value (for devices supporting squawk modes not specified in the ZCL)                                                                      |
| sirenLevel / squawkLevel | `LOW`, `MEDIUM`, `HIGH`, `VERY_HIGH`, any integer value (for devices supporting levels not specified in the ZCL)                                                           |
| duration                 | A duration specified in the ISO-8601 duration format                                                                                                                       |

Note that it is possible to dynamically add command descriptions for specific warning/squawk types to a `warning_device` channel by configuring the channel configuration property `zigbee_iaswd_commandOptions`, using String parameters of the form `label=>commandString`, where `label` is the label provided to UIs to render, e.g., buttons for the provided command options (as done, e.g., by PaperUI).
Also note that solutions integrating the binding can add implementations of type `WarningTypeCommandDescriptionProvider` to provide warning/squawk types together with command descriptions for all channels of type `warning_device`.

## Channels triggered event & rules

Some devices like the Philips Hue Dimmer can be discovered and added to openHAB through this binding but will not allow the Items to be created in the UI. These channels are set as Triggers and will generate output in the events.log that looks similar to this:

```
2019-03-08 20:51:18.609 [vent.ChannelTriggeredEvent] - zigbee:philips_rwl021:AAAAAAAA:BBBBBBBBBBBBBBBB:buttonI triggered SHORT_PRESSED
```

To utilize these events, no new Item is required, instead a Rule can be used to directly trigger off of this event.
The Channel that should be used can be copied directly from the UI under the Channels-section of the Thing or can be read from the events.log
See the following example on how to integrate the Channel triggered event for a Hue Dimmer:

```java
rule "Philips Hue ButtonI"
when
    Channel 'zigbee:philips_rwl021:AAAAAAAA:BBBBBBBBBBBBBBBB:buttonI' triggered SHORT_PRESSED
then
    //execute your code here
end
```

## Reporting and Polling

ZigBee has a standard way of configuring how a device sends status reports to the binding - this is called Reporting. Reporting is configured using three pieces of information -:

- Minimum Reporting Period: This is the minimum time between reports that the device will send updates. So, if data is changing regularly, this will prevent the binding receiving a flood of reports.
- Maximum Reporting Period: This is the maximum time between reports that the device will send updates. If the data never changes, then the device will still send an update at this rate. This is important so that the binding knows the device has not failed, so it should not be set too long (normally a couple of hours will be fine).
- Change: This is only applicable for "Analogue" data such as temperature, humidity, power. If the value changes by this amount since the last update, then an update will be sent so long as the minimum reporting period has passed.

Polling may be used by the binding to request data from the device. Polling is normally only used if reporting doesn't work for some reason. This may happen if the reporting table in a device is full - if the binding detects this, it will increase the polling rate.

## When things don't appear to be working

When things don't appear to be working as expected you should check the logs to try and find what is happening. Debug logging can be enabled with the following Karaf commands -:

```
log:set debug org.openhab.binding.zigbee
log:set debug com.zsmartsystems.zigbee
log:set info com.zsmartsystems.zigbee.dongle.ember.internal.ash
```

> Karaf commands can be issued via the openHAB console. On a typical install, you can start this console via `openhab-cli console`. This will start the console with the default user `openhab`, which has `habopen` as default password.

This will log data into the standard `openhab.log` file. There is an [online log viewer](https://opensmarthouse.org/utilities/logviewer/zigbee/) available for viewing the logs.

Note that logs can only show what is happening at a high level - it can't show all data exchanges between the device and the coordinator - just what the coordinator sends to the binding. For this reason it can be difficult to debug issues where devices are not joining the network, or other low level issues need resolving. In such cases a network sniffer log is required, which requires additional hardware and software.

## Known issues

### Xiaomi devices

Xiaomi/Aqara devices are not fully ZigBee compliant, and are known to suffer from multiple problems.

#### Pairing

Pairing may require multiple attempts. The following issues have been observed:

- When trying to pair, the status LED blinks only once, instead of three times. Try again to reset/pair the device (keep the button pressed for > 5 seconds).
- Device attributes and channels are not immediately discovered: be patient. Check again in 1 hour, if nothing is there, delete the device and pair again.

#### Lost connection

These devices have an unusually long, and non-standard, sleep time. Because of this, some routers are not able to properly keep track of them, and the devices lose connection to the network. Router devices from Centralite, General Electrics, Iris, Ledvance/OSRAM/Sylvania, PEQ, Securify, SmartThings are known to not work with Xiaomi/Aqara devices.
Better results can be achieved by using IKEA, Nue/3A Home, _some_ OSRAM/Sylvania, XBee series 2 and 3, and CC2531 with router firmware.

#### External references

[Hubitat forum](https://community.hubitat.com/t/xiaomi-aqara-devices-pairing-keeping-them-connected/623) - Xiaomi/Aqara incompatibilities
