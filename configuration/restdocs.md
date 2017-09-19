---
layout: documentation
title: openHAB REST API
---

{% include base.html %}

# openHAB REST API

The REST API gives the ability to access a wide range of information associated with a running openHAB installation, and the ability to invoke changes to the openHAB installation. 
The REST API provides an interface that may only be accessed programmatically.
The information available from the API includes Items and their State, installed bindings, sitemap information, and much more. 
The information exchange takes place through HTTP and the API provides a defined protocoll for information exchange among different computer systems. 
However, from a technical perspective it is very easy to use. 
Be aware that the REST API is not automatically installed in openHAB. 
After the REST API documentation add-on is installed, it is accessible through the openHAB dashboard. 
Access the REST API by connecting any browser to: http://123.456.789.000/8080/doc/index.html (with 123.456.789.000 being the ip address of the computer that runs openHAB). 
Access over the Internet to the REST API is possible but this represents a significant security risk, and users are encouraged to ensure safe and secure connections. 
Some ways this can be achieved include using [myopenHAB cloud services](http://docs.openhab.org/installation/security.html#myopenhab-cloud-service), a [reverse proxy server](http://docs.openhab.org/installation/security.html#nginx-reverse-proxy), or a VPN.

Some tasks that can be accomplished by using the REST API include:

- Using third party software on cell phones, such as tasker to [open your garage door](https://community.openhab.org/t/triggering-items-using-openhab-2s-rest-api-from-tasker/14027)
- Interacting with openHAB via other programs; several computer languages offer libraries to easily access REST APIs generally, including openHAB’s REST API
- Accessing of information from devices that support http communication
- Updating Item States through external devices that are capable of sending http commands (for example, certain motion detectors or surveillance cameras)

The REST API is very intuitives and excellently documented and it would vastly exceed this space to present all possible example, nevertheless, here an example to switch an item of the Switch Type (such as a lamp) on and off.
- Switching ```My_Item``` OFF: ```curl -X POST --header "Content-Type: text/plain" --header "Accept: application/json" -d "OFF" "http://123.456.789.000:8080/rest/items/My_Item"``` 
- Switching ```My_Item``` ON: ```curl -X POST --header "Content-Type: text/plain" --header "Accept: application/json" -d "ON" "http://123.456.789.000:8080/rest/items/My_Item"``` 

with ```123.456.789.000``` the ip address of the computer that runs openHAB.  

One final remark - when openHAB’s REST API is accessed from another domain, the following error may be encountered: [No 'Access-Control-Allow-Origin' header is present on the requested resource](https://community.openhab.org/t/cors-problem-at-rest-api/3712/10). 
In this case, it may be necessary to add the line org.eclipse.smarthome.cors:enable=true in the file services/runtime.cfg.
