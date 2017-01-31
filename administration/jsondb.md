---
layout: documentation
title: JsonDB Storage
---

{% include base.html %}

# JsonDB Storage
openHAB stores configuration information in JSON (JavaScript Object Notation) formatted (structured) text files located in the `OPENHAB_USERDATA/jsondb/` directory.

## Storage Scope
All configuration information regarding _**Items, Links, and Things**_ which are defined via the User Interfaces (Paper UI, HABmin, REST) or via internal openHAB services.

Note: The JSON DB does NOT store information for manually configured Items, Links, or Things, since these are already stored in files within the `OPENHAB_CONF` sub-directories (e.g. `/etc/openhab2/items/`).

## Storage Purpose
The JSON DB Storage can be used for:
- Backup: Maintains a copy of your configurations in the `OPENHAB_USERDATA/jsondb/backup` directory
- Troubleshooting: Allows the user to interact with the configurations that were automatically generated via the UIs
- Advanced administration: Gives the possibility to manually define configuration parameters within the `*.json` files

## Storage Use
openHAB writes the `*.json` files everytime a change is made via the User Interfaces.
openHAB _**reads only once the `*.json` files at startup**_.  So, if you edit them manually, you should restart openHAB.

The system employs 2 write mechanisms  to improve performance where there are multiple writes in a short time. When the service is closed, all open services are written to disk.  The parameters for the 2 mechanisms can be modified in Paper UI :arrow_right: Configuration :arrow_right: System :arrow_right: Json Storage

1. _Write delay_ (defaults to 500 ms): Sets the time to wait before writing changes to disk. This can reduce the number of writes when many changes are being introduced within a short period, and
2. _Maximum write delay_ (defaults to 30000 ms): Sets the maximum period the service will wait to write data to disk in the event that many changes are happening continually.

The service keeps backups of each table - currently up to 5 backups are maintained. Each time the json file is written, the old file is moved into a backup folder, and old files are removed from the backup folder.

## Storage Location

The JsonDB Storage resides in the `OPENHAB_USERDATA/jsondb/` directory.  The full directory path depends on the installation method:
- Linux Repository Installation: `/var/lib/openhab2/jsondb/`
- Linux Manual Installation: `/opt/openhab2/userdata/jsondb/`
- Windows (Manual) Installation: `C:\openHAB2\userdata\jsondb\`

Within the `OPENHAB_USERDATA/jsondb/` directory, you will find the following files:

| Filename                                                         | _Contents_                              |
|:-----------------------------------------------------------------|:----------------------------------------|
| org.eclipse.smarthome.config.discovery.**DiscoveryResult.json**  | _Results of Paper UI Discovery_         |
| org.eclipse.smarthome.core.items.**Item.json**                   | _Items configurations_                  |
| org.eclipse.smarthome.core.thing.link.**ItemChannelLink.json**   | _Item to Channel Link configurations_   |
| org.eclipse.smarthome.core.thing.link.**ItemThingLink.json**     | _Item to Thing Link configurations_     |
| org.eclipse.smarthome.core.thing.**Thing.json**                  | _Things configurations_                 |


## Example Use
In this example, we will use the Network Binding (2.0) to Search for Things, add a new Thing to openHAB and then modify its parameters to check the information that is stored in the JsonDB.

Step 1. Add new Thing (name: `ISP_Gateway`) from Paper UIs Inbox:
![Add_Thing_Paper_UI](http://imageshack.com/a/img924/8255/jIl6pj.png)

Step 2. Check the contents of the `OPENHAB_USERDATA/jsondb/org.eclipse.smarthome.core.thing.Thing.json` file:
```
root@rpi3:~# more /var/lib/openhab2/jsondb/org.eclipse.smarthome.core.thing.Thing.json
{
  "network:device:172_16_13_254": {
    "class": "org.eclipse.smarthome.core.thing.internal.ThingImpl",
    "value": {
      "label": "ISP_Gateway",
      "channels": [
        {
          "acceptedItemType": "Switch",
          "kind": "STATE",
          "uid": {
            "segments": [
              "network",
              "device",
              "172_16_13_254",
              "online"
            ]
          },
          "channelTypeUID": {
            "segments": [
              "network",
              "online"
            ]
          },
          "configuration": {
            "properties": {}
          },
          "properties": {},
          "defaultTags": []
        },
        {
          "acceptedItemType": "Number",
          "kind": "STATE",
          "uid": {
          "segments": [
              "network",
              "device",
              "172_16_13_254",
              "time"
            ]
          },
          "channelTypeUID": {
            "segments": [
              "network",
              "time"
            ]
          },
          "configuration": {
            "properties": {}
          },
          "properties": {},
          "defaultTags": []
        }
      ],
      "configuration": {
        "properties": {
          "hostname": "172.16.13.254",
          "refresh_interval": 60000,
          "port": 0,
          "dhcplisten": false,
          "retry": 1,
          "timeout": 5000,
          "use_system_ping": false
        }
      },
      "properties": {},
      "uid": {
          "segments": [
          "network",
          "device",
          "172_16_13_254"
        ]
      },
      "thingTypeUID": {
        "segments": [
          "network",
          "device"
        ]
      }
    }
  }
}
```

Step 3. Using Paper UI :arrow_right: Configuration :arrow_right: Things, edit the new `ISP_Gateway` Thing and modify the following parameters:
- Location (from unset to `MyHome`)
- Retry (from 1 to 3)
- Timeout (from 5000 to 10000)
and save:
![Edit_Thing_Paper_UI](http://imageshack.com/a/img922/644/Hf1FNs.png)

Step 4. Check the configuration properties again in the `OPENHAB_USERDATA/jsondb/org.eclipse.smarthome.core.thing.Thing.json` file: 
![New_Json](http://imageshack.com/a/img923/4494/busI1A.png)

{% include contribution-wanted.html %}
