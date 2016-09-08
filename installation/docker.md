---
layout: documentation
---

{% include base.html %}

# Installation through Docker

## Image Variants
There are Docker images for three architectures and there is an online and offline version for each architecture.
- amd64 : online, offline
- armhf : online, offline
- arm64 : online, offline

To obtain the official Docker image from [Docker Hub](https://hub.docker.com/r/openhab/openhab/) use:

```
docker pull openhab/openhab:<architecture>-<[on|off]line>
```

For example, to pull the amd64 offline image use:

```
docker pull openhab/openhab:amd64-offline
```

If you are unsure about what architecture and version to choose use `openhab/openhab:amd64-online`.

## Usage

**Important** To be able to use UPnP for discovery the container needs to be started with ``--net=host``.

The following will run openHAB in demo mode on the host machine:

```
docker run -it --name openhab --net=host openhab/openhab:amd64-online server
```

**NOTE** Although this is the simplest method to getting openHAB up and running, but it is not the preferred method. To properly run the container, please specify a **host volume** for the ``conf`` and ``userdata`` directory:

```
docker run \
        --name openhab \
        --net=host \
        -v /etc/localtime:/etc/localtime:ro \
        -v /etc/timezone:/etc/timezone:ro \
        -v /opt/openhab/conf:/openhab/conf \
        -v /opt/openhab/userdata:/openhab/userdata \
        -d \
        --restart=always \
        openhab/openhab:amd64-online
```

or with ``docker-compose.yml``

```
---
openhab:
  image: 'openhab/openhab:amd64-online'
  restart: always
  ports:
    - "8080:8080"
    - "8443:8443"
    - "5555:5555"
  net: "host"
  volumes:
    - '/etc/localtime:/etc/localtime:ro'
    - '/etc/timezone:/etc/timezone:ro'
    - '/opt/openhab/userdata:/openhab/userdata'
    - '/opt/openhab/conf:/openhab/conf'
  command: "server"
```

then start with ``docker-compose up -d``

**Accessing the console**

```
docker exec -it openhab console
```

**Debug Mode**

You can start the container with the command ``docker run -it openhab/openhab debug`` to get into the debug shell.

**Environment variables**

*  `OPENHAB_HTTP_PORT`=8080
*  `OPENHAB_HTTPS_PORT`=8443
*  `EXTRA_JAVA_OPTS`

**Parameters**

* `-p 8080` - the port of the webinterface
* `-v /openhab/conf` - openhab configs
* `-v /openhab/userdata` - openhab userdata directory
* `--device=/dev/ttyUSB0` - attach your devices like RFXCOM or Z-Wave Sticks to the container
