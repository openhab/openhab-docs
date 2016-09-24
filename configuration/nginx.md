---
layout: documentation
title: NGINX Reverse Proxy
---

{% include base.html %}

# Running openHAB Behind a Reverse Proxy
A reverse proxy simply directs client requests to the appropriate server. This means you can proxy connections to *http://mydomain_or_myip* to your openHAB runtime. You just have to **replace *mydomain_or_myip*** with either and **internal or external IP** (e.g. xx.xx.xx.xx) or a **domain** if you own one that links to the external IP of openHAB (e.g. openhab.mydomain.tld).

Running openHAB behind a reverse proxy allows you to access your openHAB runtime via port 80 (HTTP) and 443 (HTTPS). It also provides you a simple way of **protecting your server** with authentication and secure certificates.

This page is structured as follows: 

{::options toc_levels="2..4"/}

* TOC
{:toc}

## Setting up NGINX to Proxy openHAB

These are the steps required to use **NGINX**, a lightweight HTTP server, although you can use **Apache HTTP** server or any other HTTP server which supports reverse proxying.

### Installation

NGINX runs as a service in most Linux distributions, installation should be as simple as:

```shell
sudo apt-get update && sudo apt-get install nginx
```

Once installed, you can test to see if the service is running correctly by going to *http://mydomain_or_myip*, you should see the default "Welcome to nginx" page. If you don't, you may need to check your firewall or ports and check if port 80 (and 443 for HTTPS later) is not blocked and that services can use it.

### Basic Configuration

NGINX configures the server when it starts up based on configuration files. The location of the default setup is `/etc/nginx/sites-enabled/default`. To allow NGINX to proxy openHAB, you need to change this file (make a backup of it in a different folder first).

The recommended configuration below assumes that you run the reverse proxy on the same machine as your openHAB runtime. If this doesn't fit for you, you just have to replace `proxy_pass http://localhost:8080/` by your openHAB runtime hostname (such as *http://youropenhabhostname:8080/*).

```
server {
	listen                          80;
	server_name                     mydomain_or_myip;

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

...and then go to *http://mydomain_or_myip* to see your openHAB server.

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



## Setting up a domain

To generate a trusted certificate, you need to own a domain. To aquire your own domain, you can use one of the following methods:

|Method|Example Links|Note|
|:-|:-:|:-|
|Purchasing a domain name|[GoDaddy](http://www.godaddy.com), [Namecheap](http://www.namecheap.com), [Enom](http://www.enom.com), [Register](http://www.register.com)|You should have an IP adress that doesn't change (i.e. fixed), or changes rarely, and then update the DNS *A record* so that your domain/subdomain to point towards your IP.|
|Obtaining a free domain|[FreeNom](http://www.freenom.com)|Setup is the same as above.|
|Using a "Dynamic DNS" sevice|[No-IP](http://www.noip.com), [Dyn](http://www.www.dyn.com/dns)|Uses a client to automatically update your IP to a domain of you choice, some Dynamic DNS services offer a free domain too.|


## Enabling HTTPS

Encrypting the communication between client and the server is important because it protects against eavesdropping and possible forgery. The following options are available depending if you have a valid domain:

If you have a **valid domain and can change the DNS** to point towards your IP, follow the [instructions for Let's Encrypt](#using-lets-encrypt-to-generate-trusted-certificates)
If you need to use an internal or external IP to connect to openHAB, follow the [instructions for OpenSSL](#using-openssl-to-generate-self-signed-certificates)

- ### Using OpenSSL to Generate Self-Signed Certificates

  OpenSSL is also packaged for most Linux distributions, installing it should be as simple as:

  ```shell
  sudo apt-get install openssl
  ```

  Once complete, you need to create a directory where our certifcates can be placed:

  ```shell
  sudo mkdir -p /etc/ssl/certs
  ```

  Now OpenSSL can be told to generate a 2048 bit long RSA key and a certificate that is valid for a year:

  ```shell
  sudo openssl req -x509 -nodes -days 365 -newkey rsa:2048 -keyout /etc/ssl/openhab.key -out /etc/ssl/openhab.crt
  ```

  You will be prompted for some information which you will need to fill out for the certificate, when it asks for a **Common Name**, you may enter your IP Address:
  Common Name (e.g. server FQDN or YOUR name) []: xx.xx.xx.xx

  **Adding the Certificates to Your Proxy Server**

  The certificate and key should have been placed in `/etc/ssl/`. NGINX needs to be told where these files are and then enable the reverse proxy to direct HTTPS traffic. In the NGINX configuration, place the following underneath your server_name variable:

  ```
  	ssl_certificate                 /etc/ssl/openhab.crt;
  	ssl_certificate_key             /etc/ssl/openhab.key;
  ```

- ### Using Let's Encrypt to Generate Trusted Certificates

  **Skip this step if you have no domain name or have already followed the instructions for OpenSSL**

  Let's Encrypt is a service that allows anyone with a valid domain to automatically generate a trusted certificate, these certificates are usually accepted by a browser without any warnings.

  **Setting up the NGINX Proxy Server to Handle the Certificate Generation Procedure**

  Let's Encrypt needs to validate that the server has control of the domain, the most simple way of doing this is using a **webroot plugin** to place a file on the server, and then access it using a specific url: */.well-known/acme-challenge*. Since the proxy only forwards traffic to the openHAB server, the server needs to be told to handle requests at this address differently.

  First, **create a directory** that Certbot can be given access to: 

  ```shell
  sudo mkdir -p /var/www/mydomain
  ```

  Next add the new location parameter to your NGINX config, this should be **placed above the last brace** in the server setting:

  ```
  	location /.well-known/acme-challenge/ {
  		root                            /var/www/mydomain;
  	}
  ```

  **Using Certbot**

  Certbot is a tool which simplifies the process of obtaining secure certificates. The tool may not be packaged for some Linux distributions so installation instructions may vary, check out [their website](https://certbot.eff.org/) and follow the instructions **using the webroot mode**. Don't forget to change the example domain to your own! An example of a valid certbot command (in this case for Debian Jessie) would be:

  ```shell
  sudo certbot certonly --webroot -w /var/www/mydomain -d mydomain
  ```

  **Adding the Certificates to Your Proxy Server**

  The certificate and key should have been placed in `/etc/letsencrypt/live/mydomain_or_myip`. NGINX needs to be told where these files are and then enable the reverse proxy to direct HTTPS traffic, using Strict Transport Security to prevent man-in-the-middle attacks. In the NGINX configuration, place the following underneath your server_name variable:

  ```
  		ssl_certificate                 /etc/letsencrypt/live/mydomain_or_myip/fullchain.pem;
  		ssl_certificate_key             /etc/letsencrypt/live/mydomain_or_myip/privkey.pem;
  		add_header                      Strict-Transport-Security "max-age=31536000"; 
  ```

### Setting your NGINX Server to listen to the HTTPS port

Regardless of the option you choose, make sure you change the port to listen in on HTTPS traffic.

```
	listen                          443 ssl;
```

After restarting NGINX service, you will be using a valid HTTPS certificate, you can check by going to https://mydomain_or_myip and confirming with your browser that you have a valid certificate. **These certificates expire within a few months** so it is important to run the updater in a cron expression (and also restart NGINX) as explained in the Certbot setup instructions. If you want to keep hold of a HTTP server for some reason, just add ```listen 80;``` 

### Redirecting HTTP Traffic to HTTPS

You may want to redirect all HTTP traffic to HTTPS, you can do this by adding the following to the NGINX configuration. This will essentially replace the HTTP url with the HTTPS version!

```
server {
	listen                          80;
	server_name                     mydomain_or_myip;
	return 301                      https://$server_name$request_uri;
}
```

## Putting it All Together

After following all the steps on this page, you *should* have a NGINX server configutration that looks like this:

```
server {
	listen                          80;
	server_name                     mydomain_or_myip;
	return 301                      https://$server_name$request_uri;
}
server {
	listen                          443 ssl;
	server_name                     mydomain_or_myip;
		
	ssl_certificate                 /etc/letsencrypt/live/mydomain/fullchain.pem; # or /etc/ssl/openhab.crt
	ssl_certificate_key             /etc/letsencrypt/live/mydomain/privkey.pem;   # or /etc/ssl/openhab.key
	add_header                      Strict-Transport-Security "max-age=31536000"; # Remove if using self-signed and are having trouble.

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

	#### When using Let's Encrypt Only ####
	location /.well-known/acme-challenge/ {
		root                                    /var/www/mydomain;
	}
}
```