---
layout: documentation
title: The Console
---

{% include base.html %}

# The Console

The console offers the option to:

* monitor the [log](logging.html#karaf-console) in realtime
* manage [bundles](bundles.html)
* [runtime commands](runtime.html)

## Accessing the Console

Accessing the console depends on how openHAB was started.
* When started in interactive mode using the provided command line scripts, openHAB naturally transitions directly to the console prompt.
* When started as a service (e.g. when installed from our package repository), openHAB is running as a background process.
In both cases the console can be reached via Secure Shell connection (SSH).

To reach the console using SSH, use the following command to connect to the localhost interface, TCP port 8101.

`ssh -p 8101 openhab@localhost`  
(Note that, by default, this will only work from the machine running openHAB.
To change this, see [Bind Console to All Interfaces](bind-console-to-all-interfaces).)

A security warning is expected upon the first connection:

```
The authenticity of host '[localhost]:8101 ([127.0.0.1]:8101)' can't be established.
RSA key fingerprint is SHA256:XjQxBPit+K5m3HuSsEUI/842NTCxLTu3EMGGBuQKNVg.
Are you sure you want to continue connecting (yes/no)?
```

Enter `yes` to proceed.

```
Warning: Permanently added '[localhost]:8101' (RSA) to the list of known hosts.
Password authentication
Password:
```

The default username/password is **openhab/habopen**, so enter `habopen` here.

The first successful connection triggers generation of the Karaf remote console key and will take a few seconds longer than subsequent attempts.
On slower systems, such as Raspberry Pi or Pine64, SSH may even time out.
If this happens, simply try connecting again until successful.

When successful, the console will appear:

```
                          __  _____    ____
  ____  ____  ___  ____  / / / /   |  / __ )
 / __ \/ __ \/ _ \/ __ \/ /_/ / /| | / __  |
/ /_/ / /_/ /  __/ / / / __  / ___ |/ /_/ /
\____/ .___/\___/_/ /_/_/ /_/_/  |_/_____/
    /_/                        2.0.0
                               Release Build

Hit '<tab>' for a list of available commands
and '[cmd] --help' for help on a specific command.
Hit '<ctrl-d>' or type 'system:shutdown' or 'logout' to shutdown openHAB.

openhab> 
```

## Using the Console

**Help** is listing all available commands:

```
openhab> help
```

or describes a specific subsystem/command:

```
openhab> help bundle
...

openhab> help bundle:stop
...
```

The console also supports auto-completion during input.
Auto-completion proposes possible commands based on the current input and is triggered by the **tab** key.
So for example entering _bun_ and pressing the tab key will result in:

```
openhab> bundle
bundle                   bundle:capabilities      bundle:classes           bundle:diag              bundle:dynamic-import
bundle:find-class        bundle:headers           bundle:id                bundle:info              bundle:install
bundle:list              bundle:load-test         bundle:refresh           bundle:requirements      bundle:resolve
bundle:restart           bundle:services          bundle:start             bundle:start-level       bundle:stop
bundle:tree-show         bundle:uninstall         bundle:update            bundle:watch
```

Another useful feature the **\| (pipe)** and **grep** functionality which filters long output lists:

```
openhab> bundle:list | grep openHAB
164 | Active    |  90 | 2.0.0.201607210102    | openHAB Core
165 | Active    |  80 | 2.0.0.201607210102    | openHAB Karaf Integration
195 | Active    |  80 | 2.0.0.201607210102    | openHAB 1.x Compatibility Layer
196 | Active    |  80 | 2.0.0.201607210102    | openHAB REST Documentation
```

The session is ended by using the logout command:

```
openhab> logout
```

## Modifying the Console Settings

Changing the console password, interface, and port is described here.

### Console Settings Files and Directories

The pertinent files controlling console settings are:

| File                       | Purpose                        |
|----------------------------|--------------------------------|
| org.apache.karaf.shell.cfg | Controls most console settings |
| users.properties           | Stores console password        |

The locations of these files will vary based on your platform and installation method.

| Platform / Install Method | Settings File Directory                   |
|---------------------------|-------------------------------------------|
| Linux Package Install     | /var/lib/openhab2/etc/                    |
| Linux Manual Install      | /opt/openhab2/userdata/etc/               |
| Synology NAS              | /volume1/@appstore/openHAB2/userdata/etc/ |

### Change the Password

The password is contained in the **users.properties** file, located in one of the [directories above](#console-settings-files-and-directories).
By default, line with the password contains the text `openhab = `, followed by the current password or password hash.

#### Prior to Logging In

Before logging in to the console for the first time, the default password is stored in cleartext.

`openhab = habopen`, where `habopen` is the password.

To change it, edit the file manually, replacing `habopen` with your new password.
Alternately, run the following Linux shell command, which will perform the replacement for you.
Substitute `securePassword` with your new password.
Depending on your system, you may have to substitute [another directory](#console-settings-files-and-directories) at the end of the command.

`sudo sed -i -e "s/openhab = habopen/openhab = securePassword/g" /var/lib/openhab2/etc/users.properties`

#### After Logging In

While logging in to the console for the first time, a unique cryptographic password hash replaces the previous cleartext password in the file.

```
openhab = {CRYPT}4AE1A0FD056BC0FD8231899EC4B2F9CA06AF0DEC895B2A3B0323F6FBC1C99776{CRYPT}
```

To change it, edit the file manually, replacing everything the `{CRYPT}` markers and everything between them with your new password.
Alternately, run the following Linux shell command, which will perform the replacement for you.
Substitute `securePassword` with your new password.
Depending on your system, you may have to substitute [another directory](#console-settings-files-and-directories) at the end of the command.

```
sed -i "s/openhab = .*,/openhab = securePassword,/g" /var/lib/openhab2/etc/users.properties
```

### Bind Console to All Interfaces

The interface binding configuration is in the **org.apache.karaf.shell.cfg** file, located in one of the [directories above](#console-settings-files-and-directories).
The `sshHost` entry controls the interface address to bind to.
`sshHost = 127.0.0.1` (localhost) is the default due to obvious security reasons.
If you are on a local network or you are fully aware of all risks of exposing your system to the public, you can change the bind address.
Replace the `sshHost` IP `127.0.0.1` by `0.0.0.0` to bind to all available network interfaces.
Please be aware, that the console will now be accessible from all devices and is only secured by the password defined in `users.properties` (same path).
You should thereby [change the password][#change-the-password].

The above can be accomplished by the following Linux shell command.
Depending on your system, you may have to substitute [another directory](#console-settings-files-and-directories) at the end of the command.

```
sudo sed -i -e "s/sshHost = .*/sshHost = 0.0.0.0/g" /var/lib/openhab2/etc/org.apache.karaf.shell.cfg
```

### Change the Port Number

The SSH port configuration is in the **org.apache.karaf.shell.cfg** file, located in one of the [directories above](#console-settings-files-and-directories).
The `sshPort` entry controls the port number.
`sshPort = 8101` is the default, but can be changed to any available port with a text editor.

Alternately, run the following Linux shell command, which will perform the replacement for you.
Substitute `newPort` with your desired port number.
Depending on your system, you may have to substitute [another directory](#console-settings-files-and-directories) at the end of the command.

```
sudo sed -i -e "s/sshPort = .*/sshPort = newPort/g" /var/lib/openhab2/etc/org.apache.karaf.shell.cfg
```

-----

Please check the [Karaf reference](http://karaf.apache.org/manual/latest/) for more details.
