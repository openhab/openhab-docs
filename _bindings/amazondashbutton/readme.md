---
id: amazondashbutton
label: Amazon Dash Button
title: Amazon Dash Button - Bindings
type: binding
description: "The [Amazon Dash Button](https://www.amazon.com/Dash-Buttons/b?node=10667898011) is a cheap and small Wi-Fi connected device to order products from Amazon with the simple press of a button."
since: 2x
logo: images/addons/amazondashbutton.png
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# Amazon Dash Button Binding

The [Amazon Dash Button](https://www.amazon.com/Dash-Buttons/b?node=10667898011) is a cheap and small Wi-Fi connected device to order products from Amazon with the simple press of a button.
This Binding allows to integrate Dash Buttons into your home automation setup.

The Binding code is inspired by [hortinstein/node-dash-button](https://github.com/hortinstein/node-dash-button).

**Warning:**
The Dash Button will try to contact the Amazon servers every time the button is pressed.
This might not be in line with your privacy preferences but can be prevented.
Please refer to the ["Preventing Communication with Amazon Servers"](#no-phonehome) section for details.

## Prerequisites

The Binding uses [Pcap4J](https://www.pcap4j.org/) in order to capture `ARP` and `BOOTP` requests send by the Amazon Dash Button.
Buttons will hence only be usable within the same network as your openHAB instance.

Start with installing libpcap (for Mac/Linux/UNIX) or WinPcap (for Windows) on your computer.
They are native libraries that power the core functionalities of Pcap4J.

**Note:**
Pcap4J needs administrator/root privileges.
Instructions for Debian/Ubuntu are given below.

### Installing libpcap on Debian/Ubuntu

Installing [libpcap](http://www.tcpdump.org/) should be as simple as:

```shell
sudo apt-get install libpcap-dev
```

You can run Pcap4J with a non-root openHAB user by granting capabilities `CAP_NET_RAW` and `CAP_NET_ADMIN`
to the openHAB java environment by the following command: 

```shell
sudo setcap cap_net_raw,cap_net_admin=eip $(realpath /usr/bin/java)
```

Be aware of other capabilities which were previously set by setcap.
**These capabilities will be overwritten!**
You can see which capabilities have already been set with the command:

```shell
sudo getcap $(realpath /usr/bin/java)
```

If you need mulitple capabilities (like "cap_net_bind_service" for the Network binding), you have to add them like this:

```shell
sudo setcap 'cap_net_raw,cap_net_admin=+eip cap_net_bind_service=+ep' $(realpath /usr/bin/java)
```

### Installing WinPcap on Windows

On a Windows system there are two options to go with.

1. The preferred solution is [WinPcap](https://www.winpcap.org) if your network interface is supported.
2. An alternative option is [npcap](https://github.com/nmap/npcap) with the settings "WinPcap 4.1.3 compatibility" and "Raw 802.11 Packet Capture"

### Installing libpcap on Other Operating Systems

The installation methods might differ.
A few known operating systems are:

| Operating System | Command                     |
|:-----------------|:----------------------------|
| CentOS           | `yum install libpcap-devel` |
| Mac              | `brew install libpcap`      |

## Setup Dash Button

Setting up your Dash Button is as simple as following the instructions provided by [Amazon](https://www.amazon.com/Dash-Buttons/b?node=10667898011) **EXCEPT FOR THE LAST STEP**.
Follow the instructions to set up the Dash Button in their mobile app.
When you get to the step where it asks you to pick which product you want to map it to, just quit the setup process.

{: #no-phonehome}
## Preventing Communication with Amazon Servers

Every time a Dash Button is pressed a request will be sent to the Amazon servers.
If no product was configured for the Button, a notification will be presented by the Amazon app on your smartphone.

To prevent the Dash Button from contacting the Amazon Servers, block Internet access for the device.
Please refer to the documentation of your network's router for details.
If your network doesn't provide that option, you can at least deal with the notifications by either uninstalling the Amazon app or disabling notifications for it (possible on most smartphone OSs).

It has shown that blocking the Dash Button communication with the Amazon servers will provoke reconnection attempts.
This increased amount of communication causes a reduced overall battery life.
The built-in AAA battery can be easily replaced. 

Preventing the communication with the Amazon servers or the Amazon app is **not** necessary to integrate the Dash Button in openHAB.

## Supported Things

There is one supported Thing, the "Amazon Dash Button". 

## Discovery

Background discovery is not supported as it is not possible to distinguish between a Dash Button and other Amazon devices like the Kindle, a Fire TV or an Echo speaker.

You can start the discovery process for Dash Button devices manually.
While openHAB is in the scanning process, press the button on the Dash to be recognized and added to your Inbox.

**Caution:**
You have to be aware that other Amazon devices might pop up in your Inbox if they send an `ARP` request while scanning for Dash Buttons.
You can ignore these devices in your Inbox.

## Thing Configuration

### Amazon Dash Button

* **MAC address:** The MAC address of the Amazon Dash Button
* **Network interface:** The network interface which receives the packets of the Amazon Dash Button
* **Packet processing interval:** Often a single button press is recognized multiple times. You can specify how long any further detected button pressed should be ignored after one click is handled (in ms).

## Channels

* **Press:** Trigger channel for recognizing presses on the Amazon Dash Button. You do not have to link this channel to an item. Just reference the channel in your .rules-file like documented in the "Example Usage" section.

## Example Usage

```
rule "Dash button pressed"
    when
        Channel "amazondashbutton:dashbutton:ac63bexxxxxx:press" triggered
    then
        println("The Dash button has been pressed")
end
```
