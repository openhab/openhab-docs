---
layout: documentation
title: Securing Communication and Access
---

# Securing access to openHAB

openHAB has mainly two ways to be accessed:

1. Through the command line console, which is done through SSH and thus always authenticated and encrypted. You will find all details about this in the [Console documentation](/docs/administration/console.html).
1. Through HTTP(S), which we will look at in the following.

[[toc]]

## Encrypted Communication

### Webserver Ports

openHAB has a built-in webserver, which listens on port 8080 for HTTP and 8443 for HTTPS requests.
In general, it is advised to use HTTPS in perefence to HTTP.

The default ports 8080 and 8443 can be changed by setting the environment variables `OPENHAB_HTTP_PORT` resp. `OPENHAB_HTTPS_PORT`prior to running openHAB for the first time.
In an apt installation, you would best do this in the file `/etc/default/openhab`.

::: warning Security Warning
It is vitally important that you MUST NOT directly expose your openHAB instance to the Internet (e.g. by opening a port in your firewall)!
:::

### SSL Certificates

On the very first start, openHAB generates a personal (self-signed, 256-bit ECC) SSL certificate and stores it in the Jetty keystore (in `$OPENHAB_USERDATA/etc/keystore`).
This process makes sure that every installation has an individual certificate, so that nobody else can falsely mimic your server.
Note that on slow hardware, this certificate generation can take up to several minutes, so be patient on a first start - it is all for your own security.

If you wish, you can import your own certificate into this keystore.
Please ensure that you remove the old certificate and give the new certificate the same alias as the old one (otherwise, the App might still be presented the old certificate).

You can also use certificates to authenticate, when using a reverse proxy.
Have a lok at the [community forum](https://community.openhab.org/t/using-nginx-reverse-proxy-for-client-certificate-authentication-start-discussion/43064) for further information.

## Authentication and Access Control

openHAB does support restricting access through HTTP(S) for certain users.
See the page on [Role Based Access](../tutorial/pages_intro.html#role-based-access)

If you want to limit access to only certain network interfaces, you can do so by setting the environment variable `OPENHAB_HTTP_ADDRESS`.
Setting it to

```conf
OPENHAB_HTTP_ADDRESS=127.0.0.1
```

will e.g. only allow requests through the local loopback interface.

## Options for Secure Remote Access

Clearly, having remote access to your openHAB instance is something most users would not want to miss.
There are different options to do so.

### VPN Connection

The most secure option is probably to create a VPN connection to your home network.
Doing so will allow you to access your openHAB instance in the same way as if you were at home.
There are many different solutions for VPN, so we cannot give any specific advice here, what to use and how to set in up.

### myopenHAB Cloud Service

You can use an [openHAB Cloud](https://github.com/openhab/openhab-cloud/blob/main/README.md) instance to which openHAB  creates a tunnel connection and which forwards all requests through this tunnel.
openHAB will see these incoming requests as originating from the local loopback interface.

The simplest way to get hold of such an openHAB Cloud is to register an account at [myopenHAB.org](https://www.myopenhab.org/), which is operated by the [openHAB Foundation](https://www.openhabfoundation.org/).

### Run your own openHAB Cloud Service

Since openHAB is open source, the myopenHAB Cloud Service is also open source.
This allows you to run your own  openHAB cloud.
There is support to run in a Docker container or on Amazon We Services (AWS).
For more information see [openHAB Cloud on GitHub](https://github.com/openhab/openhab-cloud)

### Running openHAB Behind a Reverse Proxy

A reverse proxy simply directs client requests to the appropriate server.
This means you can proxy connections to `http://mydomain_or_myip` to your openHAB runtime.
You just have to **replace _mydomain_or_myip_** with either an **internal or external IP** (e.g. xx.xx.xx.xx) or a **domain** if you own one that links to the external IP of openHAB (e.g. openhab.mydomain.tld).

Running openHAB behind a reverse proxy allows you to access your openHAB runtime via port 80 (HTTP) and 443 (HTTPS).
It also provides you a simple way of **protecting your server** with authentication and secure certificates.

The good news is that [openHABian](openhabian) already offers the possibility to activate a preconfigured NGINX reverse proxy, which includes setting up authentication and a valid [Let's Encrypt](https://letsencrypt.org) certificate.

Read the more on page [Running openHAB Behind a Reverse Proxy using NGINX](reverse-proxy.html) about how to configure NGINX.

::: warning Security Warning
It is vitally important that you MUST NOT directly expose your openHAB instance to the Internet (e.g. by opening a port in your firewall)!
:::
