---
layout: documentation
title: Synology DiskStation Reverse Proxy
---
[[toc]]

# Synology DiskStation Reverse Proxy

Synology DSM (as of 6.2) has the ability to automatically acquire certificates from Let's Encrypt and renew them every 90 days as required.
The majority of the configuration can be completed through the DSM GUI, but SSH access is required to implement authentication (**authentication is essential for remote access to your openHAB instance**).

Before you continue, make sure you have the below conditions:

- A working installation of openHAB on your DiskStation (see the [Synology Installation Guide](https://www.openhab.org/docs/installation/synology.html/))
- Your own domain you can configure the CAA record for
- Access to your DiskStation by SSH ([How to login to DSM with root permission via SSH/Telnet](https://www.synology.com/en-global/knowledgebase/DSM/tutorial/General_Setup/How_to_login_to_DSM_with_root_permission_via_SSH_Telnet/))
- Ports 80 and 443 forwarded from your router to your DiskStation (make sure you reconfigure the router web UI to a different port first, so you don't lose access!)

Log into the GUI of your DiskStation as administrator, and open the package center.
Install Apache HTTP Server.
This is needed to generate the password files.

Go to Control Panel > Application Portal > Reverse Proxy. We will set up two reverse proxies, one for HTTP and one for HTTPS.
The HTTP one can be disabled later if desired (not at all essential if you will only use the app remotely, and never a browser).

Create two reverse proxies as follows:

| Parameter             | Value                                                      |
| :-------------------- | :--------------------------------------------------------- |
| Description:          | openHAB HTTPS                                              |
| Source Protocol:      | HTTPS                                                      |
| Source Hostname:      | your-hostname.com                                          |
| Source Port:          | 443                                                        |
| Enable HSTS           | Unchecked                                                  |
| Enable HTTP/2         | Unchecked                                                  |
| Enable access control | Unchecked                                                  |
| Destination Protocol: | HTTPS                                                      |
| Destination Hostname: | localhost                                                  |
| Destination Port:     | 8443 (or whichever HTTPS port your openHAB instance is on) |

| Parameter             | Value                                                     |
| :-------------------- | :-------------------------------------------------------- |
| Description:          | openHAB HTTP                                              |
| Source Protocol:      | HTTP                                                      |
| Source Hostname:      | your-hostname.com                                         |
| Source Port:          | 80                                                        |
| Enable HSTS           | Unchecked                                                 |
| Enable HTTP/2         | Unchecked                                                 |
| Enable access control | Unchecked                                                 |
| Destination Protocol: | HTTP                                                      |
| Destination Hostname: | localhost                                                 |
| Destination Port:     | 8080 (or whichever HTTP port your openHAB instance is on) |

Verify that the reverse proxy is working as expected - try <http://your-hostname.com> and <https://your-hostname.com> - you should end up at the openHAB landing page in both cases, but will get a security warning for the https site.

Next, acquire certificates from Let's Encrypt using the GUI in DSM.

Go to Control Panel > Security > Certificate, and click on 'Add'.
Select the option to 'Add a new Certificate'.
Put in a description, something like 'openHAB SSL Cert' (it doesn't matter).
Select 'Get a certificate from Let's Encrypt' and check the box to set it as default.
Click next.
Put in your domain name and email address.
Add a 'Subject Alternative Name' if you want a different topic in the subject line when Let's Encrypt email you about that certificate (not essential).
Click Apply, and wait a few minutes - your certificate is done!

::: tip Note
Sometimes you may receive an error at the end of the certificate wizard - the first time this happens, click on 'cancel and see if you have a certificate anyway.
If the certificate has been generated, you are good to go.
:::

Select the certificate that has just been created, and click on 'Configure'.
Ensure that the new certificate is listed next to your-hostname.com in the table - something like the below.
If it's not selected, update it.

| Services             | Certificate       |
| :------------------- | :---------------- |
| your-hostname.com    | your-hostname.com |
| FTPS                 | synology.com      |
| Cloud Station Server | synology.com      |
| etc etc              | synology.com      |

Once this is done, update the CAA record for your-hostname.com with your registrar (exact process will vary by registrar).
Within an hour or so, you should not receive the security warning for <https://your-hostname.com>.

Next, you must add authentication to the reverse proxy.
There's no GUI way to do this, so we need to create another small NGINX virtual host on the DiskStation.

Log into your DiskStation by SSH.
Use the admin username and password.
Create a .htpasswd file in your openHAB userdata folder (your userdata location may vary, update accordingly):

```shell
htpasswd -c /volume1/openHAB/userdata/.htpasswd username
```

Next, add a very simple NGINX configuration similar to that created [for NGINX](reverse-proxy-nginx), but without the SSL parameters.
DSM comes with vi installed by default, but you may wish to [install nano](https://anto.online/other/how-to-install-nano-on-your-synology-nas/)

```shell
sudo nano /usr/local/etc/nginx/sites-enabled/openHAB-auth
```

```json
# openHAB NGINX config

server {
    listen                          2020; #This is simply an unused port, it can be any number

    server_name                     your_domain.com;

    return 301                      https://$server_name$request_uri;
}

server {
    listen                          7443 ssl; #This is simply an unused port, it can be any number
    server_name                     your_domain.com;

    add_header 'Access-Control-Allow-Origin' '*' always;
    add_header 'Access-Control-Allow_Credentials' 'true' always;
    add_header 'Access-Control-Allow-Headers' 'Authorization,Accept,Origin,DNT,X-CustomHeader,Keep-Alive,User-Agent,X-Requested-With,If-Modified-Since,Cache-Control,Content-Type,Content-Range,Range' always;
    add_header 'Access-Control-Allow-Methods' 'GET,POST,OPTIONS,PUT,DELETE,PATCH' always;
    add_header Set-Cookie X-OPENHAB-AUTH-HEADER=1;

    location / {
        proxy_http_version                      1.1;
        proxy_pass                              https://localhost:8443/; #Update the port number if needed
        proxy_set_header Host                   $http_host;
        proxy_set_header X-Real-IP              $remote_addr;
        proxy_set_header X-Forwarded-For        $proxy_add_x_forwarded_for;
        proxy_set_header X-Forwarded-Proto      $scheme;
        proxy_set_header Upgrade                $http_upgrade;
        proxy_set_header Connection             "Upgrade";
        proxy_set_header Authorization          "";
        satisfy                                 any;
        allow                                   192.168.1.0/24;
        allow                                   127.0.0.1;
        deny                                    all;
        auth_basic                              "Username and Password Required";
        auth_basic_user_file                    /volume1/openHAB/userdata/.htpasswd; #Update with your userdata folder if different
    }

}
```

Once you are done, save the file, restart and test NGINX:

```shell
sudo nginx -s reload && sudo nginx -t
```

The first part of this file redirects any HTTP queries to HTTPS directly.
If you don't get any errors, update the reverse proxy settings in the DSM GUI to point to these new endpoints.
Back in the GUI, go to Control Panel > Application Portal > Reverse Proxy, make the updates below:

| Parameter         | Value                                                     |
| :---------------- | :-------------------------------------------------------- |
| Destination Port: | 7443 (or whatever you set it to in the openHAB-auth file) |

| Parameter         | Value                                                     |
| :---------------- | :-------------------------------------------------------- |
| Destination Port: | 2020 (or whatever you set it to in the openHAB-auth file) |

::: tip Note
We do this 'double' redirect to take advantage of the GUI certificate handling in DSM - this is the equivalent of CertBot for a Linux installation.
:::

Give it a try again - you should now get redirected to `https://your-hostname.com` from `http://your-hostname.com`, and should receive a username and password prompt before you see the openHAB landing page.

If you need to troubleshoot the nginx server, SSH into your DiskStation, and check the NGINX error log:

```shell
sudo tail -f /var/log/nginx/error.log
```

This log will update in real-time, so do whatever it was that you were having issues with again, and you'll see the error.
