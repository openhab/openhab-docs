---
layout: documentation
title: Apache Reverse Proxy
---

These are the steps required to use [**Apache 2.4**](https://www.apache.org/), a HTTP server, although you can use [**NGINX**](reverse-proxy-nginx) server or any other HTTP server which supports reverse proxying. If you are familiar with Apache/basic reverse proxy config and are only interested in OpenHAB specific caveats/directives skip to [OpenHAB settings](#openhab-specific-settings)

[[toc]]

# Installation

Apache runs as a service in most Linux distributions, installation should be as simple as:

```shell
sudo apt-get update && sudo apt-get install apache2
sudo service apache2 start
```

for Ubuntu/Debian based Linux, or

```shell
sudo yum install httpd
sudo systemctl enable httpd
sudo systemctl start httpd
```

for Fedora/CentOS/Red Hat Enterprise

Once installed, you can test to see if the service is running correctly by going to `http://mydomain_or_myip`, you should see the apache2 default page.

# Basic Configuration

::: warning Security Warning
It is not recommended to expose solely the configuration below to the internet.
:::

Apache runs based on configuration files.
The location of the default setup is typically `/etc/apache2/sites-available/000-default.conf`. To allow Apache to proxy openHAB, you need to edit or replace this file. Common practice is to use the domain name of the website it serves, appended with ".conf" - for example, "mydomain.conf"

The configuration below assumes that you run the reverse proxy on the same machine as your openHAB runtime.
If this doesn't fit for you, you just have to replace `localhost` with your openHAB instance hostname or ip. Remember to replace `mydomain` with your actual domain.

```xml
<VirtualHost *:80>
    ServerName mydomain

    <Location />
        ProxyPass "http://localhost/"
        ProxyPassReverse "http://localhost/"
    </Location>

    ErrorLog ${APACHE_LOG_DIR}/mydomain-error.log
    CustomLog ${APACHE_LOG_DIR}/mydomain-access.log combined
</VirtualHost>
```

The command `apachectl configtest` can be used to verify any config you write. To enable your new website `a2ensite <config file name>`. Once enabled, you will not have to enable your website again. Configuration can be reloaded with `systemctl reload apache2`. Please make sure to reload and clear browser cookies after every change.

# Authentication

Authentication is recommended for additional security. There are many ways to authenticate to a proxy, but basic auth is sufficient **as long as it is over https**. Note the below documentation about [OpenHAB specific auth headers](#authentication-headers).

## Adding or Removing users

To add  users to your reverse proxy, you must use following command. Use the `-c` modifier only for your first user. It will create a new password file. **Do not** use the `-c` modifier again as this will remove all previously created users. Don't forget to change _username_ to something meaningful!

```shell
sudo htpasswd -c /etc/apache2/.htpasswd username
```

```shell
sudo htpasswd /etc/apache2/.htpasswd username
```

and to delete an existing user:

```shell
sudo htpasswd -D /etc/apache2/.htpasswd username
```

## Basic Auth

The below directives set the auth type to basic, set the auth name, point to our credentials file, and require a user to be authenticated before allowing them to access OpenHAB

```xml
<Location />
    AuthType Basic
    AuthName "Proxy Auth"
    AuthUserFile /etc/apache2/.htpasswd
    Require valid-user
</Location>
```

# Encryption/HTTPS

In the interest of not duplicating documentation, please see the [nginx encryption documentation](reverse-proxy-nginx#enabling-https) for certificate generation options. The certificate directives for Apache are:

```xml
SSLEngine on
SSLCertificateFile /path/to/cert
SSLCertificateKeyFile /path/to/key
```

For more details, read the [apache mod_ssl docs](https://httpd.apache.org/docs/2.4/mod/mod_ssl.html#sslcertificatefile)

# OpenHAB Specific Settings

These settings are required due to the quirks and features of proxies and/or OpenHAB.

## Authentication Headers

If you use authentication with your reverse proxy, the following two directives are necessary in OpenHAB 3.0 and later.

`Header set Set-Cookie "X-OPENHAB-AUTH-HEADER=1"`

This ensures that OpenHAB uses an alternative auth header, so it does not conflict with your proxy authentication credentials.

`RequestHeader unset Authorization`

This ensures that your proxy does not send your proxy authentication credentials  to OpenHAB, interfering with login (and potentially sending them in plain text across a network).

# Putting it All Together

Below is a minimal configuration for a reverse proxy that listens for https requests only, uses basic auth, and proxies to 8080 (default OpenHAB http port).

```xml
<VirtualHost *:443>
    ServerName mydomain
    SSLEngine on
    SSLCertificateFile /path/to/cert
    SSLCertificateKeyFile /path/to/key

    Header set Set-Cookie "X-OPENHAB-AUTH-HEADER=1"
    RequestHeader unset Authorization

    <Location />
        ProxyPass "http://localhost:8080/"
        ProxyPassReverse "http://localhost:8080/"
        AuthType Basic
        AuthName "Proxy Auth"
        AuthUserFile /etc/apache2/.htpasswd
        Require valid-user
    </Location>

    ErrorLog ${APACHE_LOG_DIR}/mydomain-error.log
    CustomLog ${APACHE_LOG_DIR}/mydomain-access.log combined
</VirtualHost>
```
