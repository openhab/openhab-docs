---
layout: documentation
title: NGINX Reverse Proxy
---

{% include base.html %}

# Running openHAB Behind a Reverse Proxy
A reverse proxy simply directs client requests to the appropriate server. This means you can proxy connections to *http://openhab.mydomain.tld* to your openHAB runtime. You just have to **replace *openhab.mydomain.tld* with your host name**.

Running openHAB behind a reverse proxy allows you to access your openHAB runtime via port 80 (HTTP) and 443 (HTTPS). It also provides you a simple way of **protecting your server** with secure certificates and authentication.

This page is structured as follows: 

{::options toc_levels="2..4"/}

* TOC
{:toc}

## Setting up NGINX to Run openHAB from a Subdomain

These are the steps required to use **NGINX**, a lightweight HTTP server, although you can use **Apache HTTP** server or any other HTTP server which supports reverse proxying.

### Installation

NGINX runs as a service in most Linux distributions, installation should be as simple as:

```shell
sudo apt-get update && sudo apt-get install nginx
```

Once installed, you can test to see if the service is running correctly by going to *http://openhab.mydomain.tld*, you should see the default "Welcome to nginx" page. If you don't, you may need to check your firewall or ports and check if port 80 is not blocked and that services can use it.

### Basic Configuration

NGINX configures the server when it starts up based on configuration files. The location of the default setup is `/etc/nginx/sites-enabled/default`. To allow NGINX to proxy openHAB, you need to change this file (make a backup of it in a different folder first).

The recommended configuration below assumes that you run the reverse proxy on the same machine as your openHAB runtime. If this doesn't fit for you, you just have to replace `proxy_pass http://localhost:8080/` by your openHAB runtime hostname (such as *http://youropenhabhostname:8080/*).

```
server {
	listen                          80;
	server_name                     openhab.mydomain.tld;

	location / {
		proxy_pass                            http://localhost:8080/;
		proxy_buffering                       off;
		proxy_set_header Host                 $http_host;
		proxy_set_header X-Real-IP            $remote_addr;
		proxy_set_header X-Forwarded-For      $proxy_add_x_forwarded_for;
		proxy_set_header X-Forwarded-Proto    $scheme;
	}
}
```

After saving over the file but **before you commit** the changes to our server, you should **test** to see if our changes contain any errors; this is done with the command:

```shell
sudo nginx -t
```

If you see that the test is successful, you can restart the NGINX service with... 

```shell
sudo service nginx restart
```

...and then go to *http://openhab.mydomain.tld* to see your openHAB server.

## Authentication with NGINX

For further security, you may wish to ask for a **username and password** before users have access to openHAB. This is fairly simple in NGINX once you have the reverse proxy setup, you just need to provide the server with a basic authentication user file.

**Note:** There is currently an issue with Proxy Authentication and HABmin when using some browsers. If you require HABmin, consider connecting locally or using Safari for now.

### Creating the First User

You will be using *htpasswd* to generate a username/password file, this utility can be found in the apache2-utils package:

```shell
sudo apt-get install apache2-utils
```

To generate a file that NGINX can use you use the following command, don't forget to change *username* to something meaningful!

```shell
sudo htpasswd -c /etc/nginx/.htpasswd username
```

You will receive a prompt to create a password for this username, once finished the file will be created. You're then free to reference the file to NGINX.

### Referencing the File in the NGINX Configuration

Now the configuration file (`/etc/nginx/sites-enabled/default`) needs to be edited to use this password. Open the configuration file and **add** the following lines underneath the proxy_* settings:

```
		auth_basic                            "Username and Password Required";
		auth_basic_user_file                  /etc/nginx/.htpasswd;
```

Once done, **test and restart your NGINX service** and authentication should now be enabled on your server!

### Adding or Removing users

To add new users to your site, you must use following command, **do not** use the `-c` modifier again as this will remove all previously created users:

```shell
sudo htpasswd /etc/nginx/.htpasswd username
```

and to delete an existing user:

```shell
sudo htpasswd -D /etc/nginx/.htpasswd username
```

Once again, any changes you make to these files **must be followed with restarting the NGINX service** otherwise no changes will be made.

## Adding HTTPS Support with Let's Encrypt

Encrypting the communication between client and the server is important because it protects against eavesdropping and possible forgery. Assuming you have the above setup, use certbot to issue Let's Encrypt certificates. Generating valid HTTPS certificates requires a valid domain name, so you may want to set one up (there are free options available) before attempting any of these steps.

### Setting up the NGINX Proxy Server to Handle the Certificate Generation Procedure

Let's Encrypt needs to validate that the server has control of the domain, the most simple way of doing this is using a **webroot plugin** to place a file on the server, and then access it using a specific url: */.well-known/acme-challenge*. Since the proxy only forwards traffic to the openHAB server, the server needs to be told to handle requests at this address differently.

First, **create a directory** that Certbot can be given access to: 

```shell
sudo mkdir -p /var/www/openhab.mydomain.tld
```

Next add the new location parameter to your NGINX config, this should be **placed above the last brace** in the server setting:

```
	location /.well-known/acme-challenge/ {
		root                            /var/www/openhab.mydomain.tld;
	}
```

### Using Certbot

Certbot is a tool which simplifies the process of obtaining secure certificates. The tool may not be packaged for some Linux distributions so installation instructions may vary, check out [their website](https://certbot.eff.org/) and follow the instructions **using the webroot mode**. Don't forget to change the example domain to your own! An example of a valid certbot command (in this case for Debian Jessie) would be:

```shell
sudo certbot certonly --webroot -w /var/www/openhab.mydomain.tld -d openhab.mydomain.tld
```

### Adding the Certificates to Your Proxy Server

The certificate and key should have been placed in `/etc/letsencrypt/live/openhab.mydomain.tld`. NGINX needs to be told where these files are and then enable the reverse proxy to direct HTTPS traffic, using Strict Transport Security to prevent man-in-the-middle attacks. In the NGINX configuration, place the following underneath your server_name variable:

```
	ssl_certificate                 /etc/letsencrypt/live/openhab.mydomain.tld/fullchain.pem;
	ssl_certificate_key             /etc/letsencrypt/live/openhab.mydomain.tld/privkey.pem;
	add_header                      Strict-Transport-Security "max-age=31536000"; 
```

Also, make sure you change the port to listen in on HTTPS traffic.

```
	listen                          443 ssl;
```

After restarting NGINX service, you will be using a valid HTTPS certificate, you can check by going to https://openhab.mydomain.tld and confirming with your browser that you have a valid certificate. **These certificates expire within a few months** so it is important to run the updater in a cron expression (and also restart NGINX) as explained in the Certbot setup instructions. If you want to keep hold of a HTTP server for some reason, just add ```listen 80;``` 

### Redirecting HTTP Traffic to HTTPS

You may want to redirect all HTTP traffic to HTTPS, you can do this by adding the following to the NGINX configuration. This will essentially replace the HTTP url with the HTTPS version!

```
server {
	listen                          80;
	server_name                     openhab.mydomain.tld;
	return 301                      https://$server_name$request_uri;
}
```

## Putting it All Together

After following all the steps on this page, you *should* have a NGINX server configutration that looks like this:

```
server {
	listen                          80;
	server_name                     openhab.mydomain.tld;
	return 301                      https://$server_name$request_uri;
}
server {
	listen                          443 ssl;
	server_name                     openhab.mydomain.tld;
		
	ssl_certificate                 /etc/letsencrypt/live/openhab.mydomain.tld/fullchain.pem;
	ssl_certificate_key             /etc/letsencrypt/live/openhab.mydomain.tld/privkey.pem;
	add_header                      Strict-Transport-Security "max-age=31536000"; 

	location / {
		proxy_pass                              http://localhost:8080/;
		proxy_buffering                         off;
		proxy_set_header Host                   $http_host;
		proxy_set_header X-Real-IP              $remote_addr;
		proxy_set_header X-Forwarded-For        $proxy_add_x_forwarded_for;
		proxy_set_header X-Forwarded-Proto      $scheme;
		auth_basic                              "Username and Password Required";
		auth_basic_user_file                    /etc/nginx/.htpasswd;
	}

	location /.well-known/acme-challenge/ {
		root                                    /var/www/openhab.mydomain.tld;
	}
}
```