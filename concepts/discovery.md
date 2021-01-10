---
layout: documentation
title: Thing Discovery
---

{% include base.html %}

# Thing Discovery

Many devices, technologies and systems can be automatically discovered on the network or browsed through some API. It therefore makes a lot of sense to use these features for a smart home solution.

openHAB bindings therefore implement _Discovery Services_ for Things, which provide _Discovery Results_. All _Discovery Results_ are regarded as suggestions to the user and are put into the _inbox_.

## Background Discovery

Some discovery services support automatic discovery in the background, while for others a scan needs to be triggered manually.
Services that support background discovery usually have it enabled by default.
It is possible to override this setting and deactivate background discovery for individual services by setting `discovery.<serviceid>:background=false`, where `serviceid` is usually identical to a binding id, e.g. the LIFX background discovery can be disabled through `discovery.lifx:background=false`.

## Inbox

The inbox holds a list of all discovered Things (`DiscoveryResult`) from all active discovery services.
A discovery result represents a discovered Thing of a specific Thing type, that could be instantiated as a Thing.
The result usually contains properties that identify the discovered Things further like IP address or a serial number.
Each discovery result also has a timestamp when it was added to or updated in the inbox and it may also contain a time to live, indicating the time after which it is be automatically removed from the inbox.

Discovery results can either be ignored or approved, where in the latter case a Thing is created for them and they become available in the application.
If an entry is ignored, it will be hidden in the inbox without creating a Thing for it.

openHAB offers a service to automatically ignore duplicate discovery results in the inbox whenever, a) a Thing has been created manually, that represents the same Thing as the respective discovery result would create, or b) whenever a Thing has been discovered separately by two alternate discovery services.
Such duplicate Things are identified as either Things with the same Thing UID, or Things with an identical `representation property`.
For a manually created Thing, its representation property is either a `property` or a `configuration parameter` of the Thing.
This auto-ignore service is enabled by default but can be disabled by setting `org.openhab.inbox:autoIgnore=false`.

### Auto Approve

If the manual acceptance of discovery results by the user is not desired, it is possible to turn on the auto-approval feature of the inbox.
In this case, every new entry gets automatically approved immediately (unless it has been marked as ignored as a duplicate).

The auto approval can be enabled by the setting `org.openhab.inbox:autoApprove=true`; the default is false.
