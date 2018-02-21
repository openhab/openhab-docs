---
id: telegram
label: Telegram
title: Telegram - Actions
type: action
description: "The Telegram Action service allows sending formatted messages to Telegram clients ([https://telegram.org](https://telegram.org)), by using the Telegram Bot API."
source: https://github.com/openhab/openhab1-addons/blob/master/bundles/action/org.openhab.action.telegram/README.md
since: 1x
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# Telegram Actions

The Telegram Action service allows sending formatted messages to Telegram clients ([https://telegram.org](https://telegram.org)), by using the Telegram Bot API.

## Prerequisites

As described in the Telegram Bot API, this is the manual procedure needed in order to get the necessary information.

1. Create the Bot and get the Token

- On a Telegram client open a chat with BotFather.
- write `/newbot` to BotFather, fill all the needed information, write down the token. This is the authentication token needed.

2. Create the destination chat and get the chatId

- Open a new chat with your new Bot and post a message on the chat
- Open a browser and invoke `https://api.telegram.org/bot<token>/getUpdates` (where `<token>` is the authentication token previously obtained)
- Look at the JSON result and write down the value of `result[0].message.chat.id`. That is the chatId.

## Configuration

The action can be configured in `services/telegram.cfg`.

| Property            | Default | Required | Description                           |
|---------------------|---------|:--------:|---------------------------------------|
| bots                |         | Yes      | Comma-separated list of `<bot-name>`s |
| `<bot name>.chatId` |         | Yes      | chat id                               |
| `<bot name>.token`  |         | Yes      | authentication token                  |

### Configuration example

```text
bots=bot1,bot2

bot1.chatId=22334455
bot1.token=xxxxxxxxxxx

bot2.chatId=654321
bot2.token=yyyyyyyyyyy
```

It this example two bots can be used (`bot1` and `bot2`).

## Examples

### Send a text message to telegram chat

telegram.rules

```java
rule "Send telegram with Fixed Message"
when
   Item Foo changed
then
   sendTelegram("bot1", "item Foo changed")
end
```

### Send a text message with a formatted message

telegram.rules

```java
rule "Send telegram with Formatted Message"
when
   Item Foo changed
then
   sendTelegram("bot1", "item Foo changed to %s and number is %.1f", Foo.state.toString, 23.56)
end
```

### Send an image to telegram chat

telegram.rules

```java
rule "Send telegram with image and caption from image accessible by url"
when
    Item Light_GF_Living_Table changed
then
    sendTelegramPhoto("bot1", "http://www.openhab.org/assets/images/openhab-logo-top.png",
        "sent from openHAB")
end
```

telegram.rules

```java
rule "Send telegram with image without caption from image accessible by url"
when
    Item Light_GF_Living_Table changed
then
    sendTelegramPhoto("bot1", "http://www.openhab.org/assets/images/openhab-logo-top.png",
        null)
end
```

In case your image is behind an authenticated web server (locked by username and password) you can pass the credentials as additional parameters to the extended `sendTelegramPhoto` method.

telegram.rules

```java
rule "Send telegram with image without caption from image accessible by url"
when
    Item Light_GF_Living_Table changed
then
    sendTelegramPhoto("bot1", "http://www.openhab.org/assets/images/openhab-logo-top.png",
        null, "username", "password")
end
```

Do not use username/password in url like in this example `http://<username>:<password>@server/image.png`; pass the credentials to the `sendTelegramPhoto` method instead.

`http` and `https` are the only protocols allowed.

In case you want to send a base64 jpeg or png image.

telegram.rules

```java
rule "Send telegram with base64 image and caption"
when
    Item Light_GF_Living_Table changed
then
    var String base64Image = "data:image/jpeg;base64, LzlqLzRBQ..."
    sendTelegramPhoto("bot1", base64Image, "sent from Openhab")
end
```

