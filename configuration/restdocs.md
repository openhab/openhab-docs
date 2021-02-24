---
layout: documentation
title: openHAB REST API
---

# openHAB REST API

Through the openHAB [REST API](https://en.wikipedia.org/wiki/REST_API) most aspects of the openHAB system can be readily accessed by other programs.
This includes for example, the access to all data related to Items, Things and Bindings as well as the capabilities to invoke actions that can change the state of Items or influence the behavior of other elements of openHAB.
Interactions with the REST API are based on the http protocol.
Access over the Internet to the REST API is possible, but this represents a significant security risk.
Users are encouraged to [ensure safe and secure connections](/docs/installation/security.html).
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

  ```bash
  curl -X POST --header "Content-Type: text/plain" --header "Accept: application/json" -d "OFF" "http://{openHAB_IP}:8080/rest/items/My_Item"
  ```

- Setting a Contact item  ```My_Item``` to CLOSED by issuing an http PUT request to ```My_Item/state```:

  ```bash
  curl -X PUT --header "Content-Type: text/plain" --header "Accept: application/json" -d "CLOSED" "http://{openHAB_IP}:8080/rest/items/My_Item/state"
  ```

- Retrieving a list of all Items and Groups by issuing a GET request:

  ```bash
  curl -X GET --header "Accept: application/json" "http://{openHAB_IP}:8080/rest/items?recursive=false"
  ```

- Retrieving a list of all sitemaps by issuing a GET request:

  ```bash
  curl -X GET --header "Accept: application/json" "http://{openHAB_IP}:8080/rest/sitemaps"
  ```

- Subscription to events:

  ```bash
  # ThingStatusInfoChangedEvent - The status of a thing changed.
  curl "http://{openHAB_IP}:8080/rest/events?topics=smarthome/things/{thingUID}/statuschanged"

  # ChannelTriggeredEvent - A channel has been triggered.
  curl "http://{openHAB_IP}:8080/rest/events?topics=smarthome/channels/{channelUID}/triggered"
  ```

The commands above have been copied from the REST API documentation for illustration.

## Rest Api Explorer

You can try and validate rest api calles from within the openHAB UI.
Just log in with an admin user, navigate to `Developer Tools -> API Explorer` and start exploring.

## Authentication

Starting with version 3, openHAB supports password protection for sensible contents such as parts of the semantic model.
To access this kind of information, the REST API provides the common mechanism [Basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) and [OAuth authorization](https://en.wikipedia.org/wiki/OAuth).
Both mechanisms can be used out of the box by the most programming languages and frameworks, but with regard to the `curl` examples from above, there are two alternative ways of authenticating yourself:

### With username/password

To the complete command, **add `-u {USER_NAME}`,** then enter your password as prompted.
You can also do this in a single, non-interactive command, in this case **add `-u {USER_NAME}:{PASSWORD}` instead.**

**Note:** This approach uses basic authentication which needs to be enabled in the `org.openhab.restauth` settings (accessible under Main UI > Settings > API Security).

### With an API token

This method is often recommended in order to keep your passwords safe and avoid to store them without encryption in any public places.
To authenticate with an API token, **add `-u '{API_TOKEN}:'` to the commandline.**

You can manage all access tokens in your profile settings in the Main UI.

## Additional Considerations

The REST API also supports server-push supporting subscriptions on change notification for certain resources.
