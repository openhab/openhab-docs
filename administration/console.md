---
layout: documentation
title: The Console
---

# The Console

The console offers the ability to:

- Monitor the [log](logging.html#karaf-console) in realtime
- Manage [bundles](bundles.html)
- Execute [runtime commands](runtime.html)

## Accessing the Console

The method used to access the console depends on how openHAB was started.

- When started in interactive mode using the provided command line scripts (e.g. `start.sh` or `start.bat`), openHAB naturally transitions directly to the console prompt.
- When started as a service (i.e. when openHAB is running as a background process), access to the console is given by running the `$OPENHAB_RUNTIME/bin/client` (`client.bat` for Windows) script or by [connecting via SSH](#connecting-via-ssh).
  Linux package based installations can also use the command `openhab-cli console`.

The default username/password is **openhab:habopen**, so enter `habopen` at the password prompt.

### Connecting via SSH

The console can also be reached via a secure shell ([SSH](https://en.wikipedia.org/wiki/Secure_Shell)) connection.

To reach the console using SSH, use the following command to connect to the localhost interface on TCP port 8101:

```shell
ssh -p 8101 openhab@localhost
```

::: tip Note
By default, connections are only allowed from localhost, i.e. only from the machine running openHAB.
Connections are intentionally not allowed from remote hosts due to security concerns.
To change this, see [Bind Console to All Interfaces](#bind-console-to-all-interfaces).
:::

A security warning is expected upon the first connection:

```text
The authenticity of host '[localhost]:8101 ([127.0.0.1]:8101)' can't be established.
RSA key fingerprint is SHA256:XjQxBPit+K5m3HuSsEUI/842NTCxLTu3EMGGBuQKNVg.
Are you sure you want to continue connecting (yes/no)?
```

Enter `yes` to proceed.

```text
Warning: Permanently added '[localhost]:8101' (RSA) to the list of known hosts.
Password authentication
Password:
```

The default username/password is **openhab:habopen**, so enter `habopen` at the password prompt.

The first successful connection triggers generation of the Karaf remote console key and will take a few seconds longer than subsequent attempts.

::: tip Note
On slower systems, such as Raspberry Pi or Pine64, this first SSH connection may even time out.
If this happened, simply try connecting again until successful.
:::

## Using the Console

After successful connection and authentication, the console will appear:

```text
                           _   _     _     ____
   ___   ___   ___   ___  | | | |   / \   | __ )
  / _ \ / _ \ / _ \ / _ \ | |_| |  / _ \  |  _ \
 | (_) | (_) |  __/| | | ||  _  | / ___ \ | |_) )
  \___/|  __/ \___/|_| |_||_| |_|/_/   \_\|____/
       |_|       4.2.0 - Release Build

Use '<tab>' for a list of available commands
and '[cmd] --help' for help on a specific command.
To exit, use '<ctrl-d>' or 'logout'.

openhab>
```

The command `help` lists all available commands or describes a specific subsystem/command:

```text
openhab> help
...
openhab> help bundle
...
openhab> help bundle:stop
...
```

The console also supports auto-completion during input.
Auto-completion proposes possible commands based on the current input and is triggered by a &lt;TAB&gt; press on your keyboard.
So for example entering "_bund_" and pressing the &lt;TAB&gt; key will first extend to the only viable candidate "bundle", a subsequent &lt;TAB&gt; press will result in:

```text
openhab> bundle
bundle                   bundle:capabilities      bundle:classes           bundle:diag              bundle:dynamic-import
bundle:find-class        bundle:headers           bundle:id                bundle:info              bundle:install
bundle:list              bundle:load-test         bundle:refresh           bundle:requirements      bundle:resolve
bundle:restart           bundle:services          bundle:start             bundle:start-level       bundle:stop
bundle:tree-show         bundle:uninstall         bundle:update            bundle:watch
```

Another useful feature is the combination of the `|` (pipe) and `grep` functionality, which can be used to filter output:

```text
openhab> bundle:list | grep openHAB
135 │ Active │ 80 │ 4.2.0 │ openHAB Core :: Bundles :: Core
136 │ Active │ 80 │ 4.2.0 │ openHAB Core :: Bundles :: Add-on XML
137 │ Active │ 80 │ 4.2.0 │ openHAB Core :: Bundles :: Audio
138 │ Active │ 80 │ 4.2.0 │ openHAB Core :: Bundles :: Automation
139 │ Active │ 80 │ 4.2.0 │ openHAB Core :: Bundles :: Automation Media Modules
...
```

The session is ended by using the logout command (or by pressing ctrl-d):

```text
openhab> logout
```

Learn about all of the available commands by using the `help` command.

## Modifying the Console Settings

Changing the console password, interface, and port is described here.

### Console Settings Files and Directories

The pertinent files controlling console settings are stored under `$OPENHAB_USERDATA/etc/`:

| File                         | Purpose                                |
| ---------------------------- | -------------------------------------- |
| `org.apache.karaf.shell.cfg` | Controls most console settings         |
| `users.properties`           | Stores the list of users and passwords |
| `keys.properties`            | Stores the list of users and ssh keys  |

The exact locations of these files will vary based on your platform and installation method, e.g. `/var/lib/openhab/etc/` or `openhab/userdata/etc/`.

Be aware that these files may get overwritten when upgrading openHAB.
You can customize any of the console settings from `org.apache.karaf.shell.cfg` by adding the relevant entries inside the `runtime.cfg` file which can be found in the `$OPENHAB_CONF/services` directory, e.g. `/etc/openhab/services/runtime.cfg`.
When adding your custom settings into `runtime.cfg`, prefix the configuration key with `org.apache.karaf.shell:`. See the examples in the sections below.

:::tip Note
The users and passwords here are not to be confused with the web UI login.
The users listed in the above files are for logging into the console.

To manage web UI users, use `openhab:users` console command.
:::

### Changing the Password

The password is stored in the file `users.properties`, located in the `etc` directory as [mentioned above](#console-settings-files-and-directories).
By default, the line with the password contains the text `openhab =`, followed by the current password (e.g. `habopen`) or a password hash (e.g. `{CRYPT}4AE1A0FD...{CRYPT}`).

To change the authentication password edit the file manually, replacing the password or password hash (including `{CRYPT}`) with your new password in clear text.
Alternately, run the following Linux shell command, which will perform the replacement for you.
Substitute `securePassword` with your desired password.

```shell
sudo sed -i -e "s/openhab = .*,/openhab = securePassword,/g" /var/lib/openhab/etc/users.properties
```

Depending on your system, you may have to [change the directory](#console-settings-files-and-directories) at the end of the command.
Please restart openHAB for the changes to take effect. The clear text password will be replaced by a unique cryptographic password hash.

### Bind Console to All Interfaces

The `sshHost` entry controls the interface address to bind to.
`sshHost = 127.0.0.1` (localhost) is the default due to obvious security reasons.
If you are on a secure network or you are fully aware of all of the risks of exposing your system to the public, you can change the bind address.
Replace the `sshHost` IP `127.0.0.1` by `0.0.0.0` to bind to all available network interfaces.
Please be aware that the console will now be accessible from any device that can reach this host and it is only secured by the password defined in `users.properties` (same path).
You should therefore [change the password](#changing-the-password)!
Depending on your network configuration the console may also be exposed to the public internet, so check your routing and firewall configuration.

To enable binding to all interfaces, uncomment the line

```#org.apache.karaf.shell:sshHost = 0.0.0.0```

in `services/runtime.cfg`.

### Change the Port Number

The `sshPort` entry controls the port number.
`sshPort = 8101` is the default.

To change it, add the following line to the `runtime.cfg` file inside `$OPENHAB_CONF/services` directory.

```shell
org.apache.karaf.shell:sshPort = 1234
```

Substitute `1234` with your desired port number.

### Using Key-Based Authentication

The Karaf console can also accept key-based authentication to enable passwordless login.
The list of users with their associated key is stored in the `keys.properties` file inside the `$OPENHAB_USERDATA/etc/` directory.
The format of this file is: `[username]=[key],_g_:admingroup`.

To set up passwordless login, create your ssh key-pair if you haven't got one, e.g. using ssh-keygen, or PuTTYgen.
Then add the public key into the `keys.properties` file.

For example, to allow user `openhab` to login with key-based authentication:

```shell
openhab=AAAAB3NzaC1yc2EAAAADAQABAAAAgQC49lufVEVq9uCzLeCdP84ubVZioQl2NRjjBZiil7vvRZzEuFBP8gnkc+6SHsDibH858gcfYg5dHrpW0yfFV6FUi0CSB3hrSisI2LDXcB8gxvVRKqL0nM9ITqesNiDfUPP1UL00+N4sqTGIjwaBmo5c6bpfxJE9C59VQBL412t9tQ==,_g_:admingroup
```

The username `openhab` above is not a special username.
It can be anything that you prefer.
Multiple login/keys can be added into this file.

Note that this does not automatically disable the password-based login.
For security reasons, be sure to [change the default password](#changing-the-password), or remove the user from password login if your host is publicly accessible.

## More Information

Please check the [Apache Karaf reference](https://karaf.apache.org/manual/latest/) for more details.
