---
layout: documentation
title: openHAB REST API
---

{% include base.html %}

# openHAB REST API

Through the openHAB [REST API](https://en.wikipedia.org/wiki/REST_API) most aspects of the openHAB system can be accessed by other programs.  
This includes for example the access to all data related to Items, Things and Bindings as well as the capabilities to invoke  actions that change the state of Items. 
Interactions with the REST API are based on http protocol and is suitable to exchange among different computer systems. 
The REST API provides an interface that can only be accessed programmatically.
The information available from the API includes Items and their state, installed bindings, sitemap information, and much more. 
However, from a technical perspective it is very easy to use. 
Be aware that the REST API is not automatically installed in openHAB. 
After the REST API documentation add-on is installed, it is accessible through the openHAB dashboard.
Access over the Internet to the REST API is possible but this represents a significant security risk, and users are encouraged to [ensure safe and secure connections](http://docs.openhab.org/installation/security.html). 

## REST API Examples

- Using third party software on cell phones, such as tasker to [open your garage door](https://community.openhab.org/t/triggering-items-using-openhab-2s-rest-api-from-tasker/14027)
- Interacting with openHAB via other programs; many computer languages can easily make use of REST APIs
- Accessing of information from devices that support http communication
- Updating Item States through external devices that are capable of sending http commands (for example, some motion detectors or surveillance cameras)

The openHAB REST API frontend is very intuitive and excellently documented and it would vastly exceed this space to present all possible examples.
Nevertheless, here is an example that switches an item of the Switch Type (such as a lamp) on and off.
- Switching ```My_Item``` OFF: 

```java
curl -X POST --header "Content-Type: text/plain" --header "Accept: application/json" -d "OFF" "http://ip_openHAB_host:8080/rest/items/My_Item"
``` 

- Switching ```My_Item``` ON: 

```java
curl -X POST --header "Content-Type: text/plain" --header "Accept: application/json" -d "ON" "http://ip_openHAB_host:8080/rest/items/My_Item"
``` 

The commands above have been copied from the REST API documentation for illustration. 
All available commands will be displayed in teh REST API documentation as a response to the button "Try me out" (may require some user input for mandatory fields).  

## Additional Considerations

The REST API also supports server-push, so you can subscribe yourself on change notification for certain resources.

One final remark - when openHAB’s REST API is accessed from another domain, the following error may be encountered: [No 'Access-Control-Allow-Origin' header is present on the requested resource](https://community.openhab.org/t/cors-problem-at-rest-api/3712/10). 
In this case, it may be necessary to add the line org.eclipse.smarthome.cors:enable=true in the file services/runtime.cfg.

