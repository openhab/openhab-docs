---
layout: documentation
title: Docker
---

{% include base.html %}

# openHAB 2 inside a Docker Container

Docker is the most popular among a collection of tools that provide containerization.
Containerization allows one to run a server in its own isolated environment without the overhead of running a full virtual machine.

This page is structured as follows:

{::options toc_levels="2..4"/}

- TOC
{:toc}

## Why Docker?

There are several reasons one would want to run openHAB in a Docker container.
These include:

- easily test out different versions
- run multiple instances side by side
- easily map the OH ports to other ports without modifying configs
- isolate OH from the rest of your server environment (e.g. configure the container's networking so the only way it can be accessed is through a reverse proxy)
- orchestration and automated deployment of OH and related servers

However, this flexibility comes at a cost.
For example, because openHAB is running in its own container with only enough installed to run openHAB, the Exec binding is very likely to be useless to you because the container will not have access to the programs and files you need.

## About the openHAB installed in the Image

Inside the Docker Image, openHAB is installed to `/openhab`.
The install is a manual installation so all of the files are located here.
This is also set as the home directory of the `openhab` user.

The Image has a very minimal installation of Linux with no services running and just enough installed to allow openHAB to run.

At the time of this writing, the official image uses the latest snapshot version of openHAB 2.

## Installation through Docker

### Obtaining the Official image from DockerHub

[Docker Hub](https://hub.docker.com/r/openhab/openhab/) has the basic information necessary to acquire and run the Docker image.
Please review those instructions before continuing to select the correct image for your machine and download the image.

### Create the openhab user

Just because one is running in an isolated container does not mean running as root is recommended.
So first create an `openhab` user configured to be a system user with no home and no shell.
This can be done on Ubuntu and Raspbian with the command:

```bash
sudo useradd -r -s /sbin/nologin openhab
```

Add your regular user to the `openhab` group.

```bash
usermod -a -G openhab <user>
```

### Create the openHAB conf, userdata, and addon directories

These directories will be mounted into the running Docker container and are where the configurations and persistence data will be stored.
Note that the software running inside a Docker container cannot follow the symbolic links located in a mounted volume.
Make sure the `openhab` user owns these directories.

```bash
mkdir /opt/openhab
mkdir /opt/openhab/conf
mkdir /opt/openhab/userdata
mkdir /opt/openhab/addons
chown -R openhab:openhab /opt/openhab
```

### Running the Container as a Service Managed by Docker

Note, always review the README on [Docker Hub](https://hub.docker.com/r/openhab/openhab/) for the most up to date set of recommended arguments and environment variables.
Services can be run an maintained on a Linux machine one of two ways, using Docker or using the system's built in service management (e.g. systemd).
If using docker to manage the service, run the following command:

```bash
docker run \
        --name openhab \
        --net=host \
        -v /etc/localtime:/etc/localtime:ro \
        -v /etc/timezone:/etc/timezone:ro \
        -v /opt/openhab/conf:/openhab/conf \
        -v /opt/openhab/userdata:/openhab/userdata \
        -v /opt/openhab/addons:/openhab/addons \
        -d \
        -e USER_ID=<uid> \
        -e GROUP_ID=<gid> \
        --restart=always \
        openhab/openhab:<version>-<distribution>
```

Where

- `<uid>` is the user ID number for the `openhab` user which you can obtain using the command `id openhab`,
- `<gid>` is the group ID number for the `openhab` user,
- `<version>` is the version of openHAB,
- `<distribution>` is the base system (debian or alpine).

It is important that the ID number is passed in.
The ID for the `openhab` user inside the container will not match the ID of the user on your host system and file permissions may be a bit odd (e.g. why does www-data own my openHAB config files?).

See below for an explanation of the fields passed to Docker and potential additional fields.

Once it successfully runs (it should be listed with a CREATED time that does not include "restarting" when running `docker ps`):

- To stop the service run `docker stop openhab`
- To restart the service run `docker restart openhab`
- To start the service run `docker start openhab`

To change the runtime parameters stop the container then execute the long command above with the new parameters.

### Running the Container as a Service Controlled by Systemd

Note, always review the README on [Docker Hub](https://hub.docker.com/r/openhab/openhab/) for the most up to date set of recommended arguments and environment variables.
If running on a Systemd based Linux distro (Ubuntu 16.04 to be specific).
The following openhab2.service file will start a new openHAB 2 container every time it starts the service and destroy that container when the service stops.
What that means is any data that you want to preserve between restarts of openHAB 2 (e.g. configuration, databases, etc.) must be mounted from your host file system into the container.

Creating a new container on every run greatly simplifies the upgrade and update process.
It also ensures that you start with a fresh install every time you run which can avoid some problems.

```bash
[Unit]
Description=openHAB 2
Requires=docker.service
After=docker.service

[Service]
Restart=always
ExecStart=/usr/bin/docker run --name=%n --net=host \
  -v /etc/localtime:/etc/localtime:ro \
  -v /etc/timezone:/etc/timezone:ro \
  -v /opt/openhab/conf:/openhab/conf \
  -v /opt/openhab/userdata:/openhab/userdata \
  -v /opt/openhab/addons:/openhab/addons \
  -v /opt/openhab/.java:/openhab/.java \
  --device=/dev/ttyUSB0 \
  -e USER_ID=<uid_of_openhab> \
  -e GROUP_ID=<gid_of_openhab> \
  openhab/openhab:<version>-<distribution>
ExecStop=/usr/bin/docker stop -t 2 %n ; /usr/bin/docker rm -f %n

[Install]
WantedBy=multi-user.target
```

Where `<uid>` is the user ID number for the `openhab` user which you can obtain using the command `id openhab`, `<version>` is the version of openHAB and `<distribution>` is the base system (debian or alpine).
It is important that the ID number is passed in.
The ID for the `openhab` user inside the container will not match the ID of the user on your host system and file permissions may be a bit odd (e.g. why does www-data own my openHAB config files?).

Place this openhab2.service file into `/etc/systemd/system`.

Then run `sudo systemctl enable openhab2.service`.

Finally run `sudo systemctl start openhab2.service` to start openHAB running.

## Explanation of Arguments Passed to Docker

Note, always review the README on [Docker Hub](https://hub.docker.com/r/openhab/openhab/) for the most up to date set of recommended arguments and environment variables.
- `/usr/bin/docker run` : create a new container from the passed in Image (last argument)
- `--name=openhab` : give the container a human remember able name
- `--net=host` : by default Docker will place a container into its own network stack. However, openHAB 2 requires UPnP discovery so this parameter makes the Docker container use the host's network stack.
- `-v /etc/localtime:/etc/localtime:ro` : ties the time of the container to the host's time, read only so the container cannot change the host's time
- `-v /etc/timezone:/etc/timezone:ro` : ties the timezone of the container to the host's time zone, read only so the container cannot change the host's time zone
- `-v /opt/openhab/conf:/openhab/conf` : location of the conf folder for openHAB configurations (*Note:* you must create these folders on the host before running the container)
- `-v /opt/openhab/userdata:/openhab/userdata` : location for logs, cache, persistence databases, etc.
- `-v /opt/openhab/addons:/openhab/addons` : only needed if installing addons unavailable via PaperUI or the Karaf Console
- `-v /opt/openhab/.java:/openhab/.java` : needed by the Nest 1.x binding (and others?), location of the security token
- `--device=/dev/ttyUSB0` : location of my zwave controller, change and/or add more --device tags to pass all your devices needed by openHAB to the container
- `--restart=always` : if the container crashes or the system reboots the container is restarted
- `openhab/openhab:<version>-<distribution>` : name of the Docker Image
- `start_debug.sh` : You can start the container with the command ``docker run -it openhab/openhab:<version>-<distribution> ./start_debug.sh`` to get into the debug shell. You might need to mount additional volumes and parameters as described above.

## Environment Variables

- `EXTRA_JAVA_OPTS`=""
- `LC_ALL`=en_US.UTF-8
- `LANG`=en_US.UTF-8
- `LANGUAGE`=en_US.UTF-8
- `OPENHAB_HTTP_PORT`=8080
- `OPENHAB_HTTPS_PORT`=8443
- `USER_ID`=9001
- `GROUP_ID`=9001
- `CRYPTO_POLICY`=limited

By default the openHAB user in the container is running with:

- `uid=9001(openhab) gid=9001(openhab) groups=9001(openhab)`

## Updating the Image

Stop the container:

`docker stop openhab` or `sudo systemctl stop openhab`

Delete the container:

`docker rm openhab`

Pull down the latest image:

```bash
docker pull openhab/openhab:<version>-<distribution>
```

where `<version>` is the version of openHAB and `<distribution>` is the base system (debian or alpine).

Restart the container using the full command above.

The Docker image will automatically perform an upgrade on your mapped in userdata folder whenever it detects that your userdata version and the image's version differ.
It determines the versions are different by comparing userdata/etc/version.properties.
Any changes between the two files will trigger and upgrade.

The upgrade process first creates a backup of the entire mapped in userdata folder (skipping the backup folder) and places it as a dated tar file into userdata/backup.
It then performs all the same steps that the upgrade script and which are performed by an apt-get/yum upgrade.

## Troubleshooting

### USB sticks

If you want use an USB stick (for example for Z-Wave network), then it will be not available for the dockerized system by default.
In Docker openHAB is running in name of `openhab`, a restricted user.
The stick will work if you run the following command right after docker image is started.

```bash
docker exec \
    -d \
    openhab \
    /bin/chmod o+rw /dev/ttyACM0
```


This command changes permissions of the specific device as expected (readable and writable for everyone).

::: tip Note
The device path (`/dev/ttyACM0`) or container name (`openhab`) could be different in your system, command can be modified accordingly.
:::
