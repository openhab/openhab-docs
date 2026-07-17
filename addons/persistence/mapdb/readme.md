---
id: mapdb
label: MapDB Persistence
title: MapDB Persistence - Persistence Services
type: persistence
description: The [MapDB](https://mapdb.org/) persistence service is based on a simple key-value store that only saves the last value.
logo: images/addons/mapdb.svg
install: manual
source: https://github.com/openhab/openhab-addons/blob/main/bundles/org.openhab.persistence.mapdb/README.md
meta:
  - property: og:title
    content: "MapDB Persistence - Persistence Services"
  - property: og:description
    content: The MapDB persistence service is based on a simple key-value store that only saves the last value.
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

# MapDB Persistence

<AddonLogo />

The [MapDB](https://mapdb.org/) persistence service is based on a simple key-value store that only saves the last value.
MapDB is useful for restoring items that have the `restoreOnStartup` strategy because other persistence options have some drawbacks if only the last value is needed on restarts.

Some disadvantages of other persistence services compared to MapDB are that they:

- grow in time
- require complex installs (`influxdb`, `jdbc`, `jpa`)
- `rrd4j` cannot store all item types (only numeric types)

It is only possible to query the last value and not other historic values because the MapDB persistence service can only store one value per item.


<EditPageLink/>
