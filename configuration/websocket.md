---
layout: documentation
title: openHAB WebSocket API
---

# openHAB WebSocket API

openHAB provides direct access to the [Event Bus](../developer/utils/events.html) through WebSockets.
The WebSocket API allows subscribing to all events (by default) or a sub-set of events which are configurable at runtime via messages.
All messages on the WebSocket connection are JSON encoded text-messages.

## Establishing a connection

WebSockets are available on the same ports as the REST API, usually port 8080 for unsecured (ws-protocol) and port 8443 for secured (wss-protocol) connections.
The connection is established by connecting to `ws[s]://{URL}:{PORT}/ws`.

To prevent unauthorized use of the connection, an access token has to be sent with the initial request.
There are two options to send the access token:

1. Through the `Sec-WebSocket-Protocol` header:<br>
  As browsers cannot add `Authorization` headers to WebSocket requests but can specify WebSocket sub-protocols to send with the request.<br>
  You need to set the `org.openhab.ws.protocol.default` and `org.openhab.ws.accessToken.base64.${BASE64_TOKEN}` sub-protocols, where `${BASE64_TOKEN}` is the Base64 encoded `${TOKEN}` without `=` padding.
  The server will respond with the `org.openhab.ws.protocol.default` sub-protocol (as browsers require the server to select one of the provided sub-protocols).<br>

1. Through the `accessToken` query parameter: `ws[s]://{URL}:{PORT}/ws?accessToken={TOKEN}`.

`${TOKEN}` can be one of these two:

1. An API token: `oh.ohwstest.tz1IDPniKLxc0VU4t9tz4GiAiKmc0ZDdMKxhlD5tfviQStM4oNsywrcrUTktPbBE9YQ3wnMBrCqVEIhg7Q`

1. Basic Auth with base64 encoded `{USER}:{PASSWORD}`: `dXNlcjpwYXNzd29yZA==`

## Using the WebSocket connection

### Receiving events (openHAB -> client)

By default, all events on the event bus will be sent as individual messages.
An overview of the most common events can be found [here](../developer/utils/events.html#the-core-events).
The JSON representation of the event always contains the type, topic and payload of the event.
Optionally a source is present.

```json
{
    "type": "ItemStateEvent",
    "topic": "openhab/items/DTR/state",
    "payload": "{\"type\":\"Quantity\",\"value\":\"5 MB/s\"}"
}
```

### Sending events (client -> openHAB)

Only `ItemStateEvent` and `ItemCommandEvent` are supported for sending to openHAB.

```json
{
    "type": "ItemCommandEvent",
    "topic": "openhab/items/DTR/command",
    "payload": "{\"type\":\"Quantity\",\"value\":\"10 MB/s\"}",
    "eventId": "5",
    "source": "WebSocketTestInstance"
}
```

The `eventId` is optional and stripped before the event is sent to the openHAB event bus.
It is set in the response message in case an error occurred and can therefore be used to identify the erroneous message.

The `source` is also optional.
However, it is recommended to send it along with the message.
Since all events on the event bus are sent over the WebSocket connection, events that are sent by the client are also transmitted.
A [source filter](#filter-by-source-openhabwebsocketfiltersource) can be used to prevent that.

If a message can't be understood by openHAB (e.g. because of a wrong payload encoding or wrong topic), an error message is sent:

```json
{
    "type": "WebSocketEvent",
    "topic": "openhab/websocket/response/failed",
    "payload": "Processing error: Topic does not match event type.",
    "eventId": "17"
}
```

## WebSocket Management

The WebSocket connection is managed through messages with the type `WebSocketEvent`.

### Keeping the connection alive (`openhab/websocket/heartbeat`)

All connections have an idle timeout of 10s to prevent dead connections.
It is recommended that clients send a heartbeat message at a shorter interval (e.g. 5s).

```json
{
    "type": "WebSocketEvent",
    "topic": "openhab/websocket/heartbeat",
    "payload": "PING",
    "source": "WebSocketTestInstance"
}
```

The reception of a heartbeat message is acknowledged with a `PONG`:

```json
{
    "type": "WebSocketEvent",
    "topic": "openhab/websocket/heartbeat",
    "payload": "PONG"
}
```

### Applying filters to events

To prevent unnecessary traffic on the connection filters can be applied to the connection.
Filters only work in the direction from openHAB to the client, i.e. even if events from type `ItemCommandEvent` are not subscribed, they can still be sent by the client.

It is not possible to set filters of the same type sequentially.
A new filter message always overrides the settings before.

The default setting is no filter, i.e. all events from all sources.
It is recommended to at least set a source filter for the client itself to prevent event reflection.

#### Filter by topic (`openhab/websocket/filter/topic`)

Topic filters can be used to include and/or exclude events of a specific topic from the event stream.
They can be applied both inclusive and exclusive, and provide API compatibility with the existing topic filter functionality of the SSE event stream.

Topics usually start with `openhab` and are split into several segments separated by an `/`, e.g. `openhab/items/MyItem/command` to listen to commands to `MyItem`.
You may use `*` as a wildcard for a topic segment.
To exclude a topic, start it with a `!`.

When sending only exclude topics, all events except those excluded are sent.
In other cases, only events of the selected topics are sent, whereas exclude topics can be used to filter out a subset of the selected events.

The payload of the event contains a list of string with the topics:

```json
{
    "type": "WebSocketEvent",
    "topic": "openhab/websocket/filter/topic",
    "payload": "[\"openhab/items/*/command\", \"!openhab/items/MyItem/command\"]",
    "source": "WebSocketTestInstance",
    "eventId": "10"
}
```

This example will only send `ItemCommandEvents` for all Items except `MyItem`.

The reception is acknowledged with the filter that is applied:

```json
{
    "type": "WebSocketEvent",
    "topic": "openhab/websocket/filter/topic",
    "payload": "[\"openhab/items/*/command\", \"!openhab/items/MyItem/command\"]",
    "eventId": "10"
}
```

#### Filter by source (`openhab/websocket/filter/source`)

Source filters can be used to remove events from a specific source from the event stream.
They are exclusive, that means those sources that are part of the filter are removed.
Keep in mind that source is not a mandatory property of events.

The payload of the event contains a list of strings with the source names:

```json
{
    "type": "WebSocketEvent",
    "topic": "openhab/websocket/filter/source",
    "payload": "[\"WebSocketTestInstance\", \"RuleEngineImpl\"]",
    "source": "WebSocketTestInstance",
    "eventId": "10"
}
```

The reception is acknowledged with the filter that is applied:

```json
{
    "type": "WebSocketEvent",
    "topic": "openhab/websocket/filter/source",
    "payload": "[\"WebSocketTestInstance\", \"RuleEngineImpl\"]",
    "eventId": "10"
}
```

#### Filter by type (`openhab/websocket/filter/type`)

Type filters are used to select a specific sub-set of all available events.
They are a inclusive, that means only those event types sent in the filter message are sent.

The payload of the event contains a list of strings with the event names:

```json
{
    "type": "WebSocketEvent",
    "topic": "openhab/websocket/filter/type",
    "payload": "[\"ItemStateEvent\", \"ItemStateChangedEvent\"]",
    "source": "WebSocketTestInstance",
    "eventId": "5"
}
```

The reception is acknowledged with the filter that is applied:

```json
{
    "type": "WebSocketEvent",
    "topic": "openhab/websocket/filter/type",
    "payload": "[\"ItemStateEvent\", \"ItemStateChangedEvent\"]",
    "eventId": "5"
}
```
