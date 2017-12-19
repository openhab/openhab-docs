---
layout: documentation
title: openHAB REST API
---

{% include base.html %}

# openHAB REST API

Through the openHAB [REST API](https://en.wikipedia.org/wiki/REST_API) most aspects of the openHAB system can be readily accessed by other programs.  
This includes for example, the access to all data related to Items, Things and Bindings as well as the capabilities to invoke actions that can change the state of Items or influence the behavior of other elements of openHAB. 
Interactions with the REST API are based on the http protocol. 
Access over the Internet to the REST API is possible, but this represents a significant security risk. 
Users are encouraged to [ensure safe and secure connections](http://docs.openhab.org/installation/security.html). 
Be aware that the documentation of the REST API may not be automatically installed, but once installed it is accessible through the openHAB dashboard. 

## REST API Examples

- Retrieve openHAB data from external applications
- Inject data and trigger events in openHAB from external applications (for example, some motion detectors or surveillance cameras)
- Inspect openHAB Bindings/Things or Items, learn about current states, parameters or problems
- Interacting with openHAB from other programs; many programming languages and automation tools can easily make use of REST API
- Using third party software on cell phones, such as tasker to [open your garage door](https://community.openhab.org/t/triggering-items-using-openhab-2s-rest-api-from-tasker/14027)

The openHAB REST API is excellently documented with detailled use instructions.
It would vastly exceed this space to present all possible examples.
Nevertheless, here is some examples using [curl](https://en.wikipedia.org/wiki/CURL), a common command line tool available for many platforms:
- Switching ```My_Item``` OFF by issuing an http [POST](https://en.wikipedia.org/wiki/POST_(HTTP)) request: 

```java
curl -X POST --header "Content-Type: text/plain" --header "Accept: application/json" -d "OFF" "http://ip_openHAB_host:8080/rest/items/My_Item"
``` 

- Retrieving a list of all Items and Groups by issuing a GET request: 

```java
curl -X GET --header "Accept: application/json" "http://ip_openHAB_host:8080/rest/items?recursive=false"
``` 

- Retrieving a list of all sitemaps by issuing a GET request:

```java
curl -X GET --header "Accept: application/json" "http://192.168.1.35:8080/rest/sitemaps"
```

The commands above have been copied from the REST API documentation for illustration. 

## REST API documentation

The REST API documentation is available on your openHAB installation as a custom user interface.

You can add it by opening the PaperUI interace, clicking "Add-ons", selecting "Misc". You will see an addon called "REST Documentation" that can be easily installed.

On the welcome screen of openHAB, you will now see a new interface called "REST API" where you can easily see the documentation of the REST API and test it!

All available commands will be displayed in the REST API documentation as a response to the button "Try me out" (may require some user input for mandatory fields).  


## Additional Considerations

The REST API also supports server-push supporting subscriptions on change notification for certain resources.

One final remark - when openHAB’s REST API is accessed from another domain the following error may be encountered: [No 'Access-Control-Allow-Origin' header is present on the requested resource](https://community.openhab.org/t/cors-problem-at-rest-api/3712/10). 
In this case, it may be necessary to add the line org.eclipse.smarthome.cors:enable=true in the file services/runtime.cfg.
