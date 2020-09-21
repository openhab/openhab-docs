---
id: mongodb
label: MongoDB
title: MongoDB - Persistence Services
type: persistence
description: "This service allows you to persist state updates using the MongoDB database."
since: 3x
logo: images/addons/mongodb.png
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# MongoDB Persistence

This service allows you to persist state updates using the MongoDB database.
It supports writing information to a MongoDB document store, as well as querying from it.

## Configuration

This service can be configured in the file `services/mongodb.cfg`.

| Property   | Default | Required | Description                                                                  |
| ---------- | ------- | :------: | ---------------------------------------------------------------------------- |
| url        |         |   Yes    | connection URL to address MongoDB.  For example, `mongodb://localhost:27017` |
| database   |         |   Yes    | database name                                                                |
| collection |         |   Yes    | collection name                                                              |

All item and event related configuration is done in the file `persistence/mongodb.persist`.
