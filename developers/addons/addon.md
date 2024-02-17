---
layout: developersguide
title: Add-on Descriptions
---

# Add-on Definitions

Every add-on has to provide meta information such as add-on type, id or name.

Background information: The meta information of all add-ons is accessible through the `org.openhab.core.addon.AddonInfoRegistry` service.

Although add-on definitions are usually specified in a declarative way (as described in this section), they can also be provided as `org.openhab.core.addon.AddonInfo`.
Any `AddonInfo` must be registered as service at the _OSGi_ service registry.
The full Java API for addon definitions can be found in the Java package `org.openhab.core.addon`.

For the declarative way, you add your add-on information in form of an `addon.xml` file to the bundle's folder `/src/main/resources/OH-INF/addon/`.
If the add-on consists of more than one bundle, only one `addon.xml` is allowed (in the main-bundle).

## XML Structure for Add-on Definitions

```xml
<?xml version="1.0" encoding="UTF-8"?>
<addon:addon id="addonID"
    xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance"
    xmlns:addon="https://openhab.org/schemas/addon/v1.0.0"
    xsi:schemaLocation="https://openhab.org/schemas/addon/v1.0.0
        https://openhab.org/schemas/addon-1.0.0.xsd">

  <type>String</type>
  <name>String</name>
  <description>String</description>

  <service-id>String</service-id>

  <config-description>
    ...
  </config-description>
  OR
  <config-description-ref uri="{addon|thing-type|channel-type|any_other}:addonID:..." />

  <discovery-methods>
    ...
  </discovery-methods>

</addon:addon>
```

| Property                   | Description                                                                                                                                                                                                                                                                                                                                                          |           |
| -------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------- |
| addon.id                   | An identifier for the add-on                                                                                                                                                                                                                                                                                                                                         | mandatory |
| type                       | Either `automation`, `binding`, `misc`, `persistence`, `transform`, `ui` or `voice`                                                                                                                                                                                                                                                                                  | mandatory |
| name                       | A human-readable name for the add-on                                                                                                                                                                                                                                                                                                                                 | mandatory |
| description                | A human-readable description for the add-on                                                                                                                                                                                                                                                                                                                          | optional  |
| connection                 | `none` for add-ons that have no interactions with external systems at all, `local` for add-ons that only interact locally without internet access, `hybrid` for add-ons that interact locally without internet access, but can optionally use a cloud connection for extended functionality (such as discovery), `cloud` for add-ons that require a cloud connection | optional  |
| countries                  | List of two-letter ISO country codes (ISO 3166-1 alpha-2) that are supported (all countries if empty). Must be in lowercase                                                                                                                                                                                                                                          | optional  |
| service-id                 | The ID (service.pid or component.name) of the main binding service, which can be configured through OSGi configuration admin service. Should only be used in combination with a config description definition                                                                                                                                                        | optional  |
| config-description         | The configuration description for the binding within the ConfigDescriptionRegistry (cf. [Configuration Description](config-xml.html))                                                                                                                                                                                                                                | optional  |
| config-description-ref     | The reference to a configuration description for the binding within the ConfigDescriptionRegistry                                                                                                                                                                                                                                                                    | optional  |
| config-description-ref.uri | The URI of the configuration description for the binding within the ConfigDescriptionRegistry                                                                                                                                                                                                                                                                        | mandatory |
| discovery-methods          | A set of xml elements that describe how the system can scan the network to discover present devices                                                                                                                                                                                                                                                                  | optional  |

The full XML schema for add-on definitions is specified in the [Add-on XSD](https://openhab.org/schemas/addon-1.0.0.xsd) file.

**Hints:**

- The attribute `uri` in the section `config-description` is optional, it _should not_ be specified in add-on definition files because it's an embedded configuration. If the `uri` is _not_ specified, the configuration description is registered as `type:addonID`, otherwise the given `uri` is used.
- If a configuration description is already specified somewhere else and the add-on wants to (re-)use it, a `config-description-ref` should be used instead.
- Normally the service id must not be defined, because it is implicitly set to "type.&lt;addonId&gt;".
  An add-on can register an OSGi service which implements the ManagedService interface and define the service.pid as e.g."binding.hue" to receive the configuration.

### Discovery Methods

The system can scan the network for present devices to determine if it should suggest to install specific addons during setup.
Optionally, if you want the system to scan the user's network for your addon then you need to include additional `discovery-method` fields.

| XML Element Name       | Description                                                                   | Instances                                          |
|------------------------|-------------------------------------------------------------------------------|----------------------------------------------------|
| `discovery-methods`    | Wrapper for `discovery-method` elements (see below).                          | Zero or one instances per file.                    |
| `discovery-method`     | Complex XML element describing an addon discovery method.                     | Zero or more instances per file.                   |
| `service-type`         | The type of discovery service (see table below).                              | Mandatory one per `discovery-method`.              |
| `discovery-parameters` | Wrapper for `discovery-parameter` elements (see below).                       | Zero or one instances per `discovery-method`.      |
| `discovery-parameter`  | A parameter name and value used for settings of the add-on finder process.    | Zero or more instances per `discovery-parameters`. |
| `name`                 | A settings parameter name.                                                    | Mandatory one instance per `discovery-parameter`.  |
| `value`                | A settings parameter value.                                                   | Mandatory one instance per `discovery-parameter`.  |
| `match-properties`     | Wrapper for `match-property` elements (see below).                            | Zero or one instances per `discovery-method`.      |
| `match-property`       | A property name and regular expression used for matching discovery findings.  | Zero or more instances per `match-properties`.     |
| `name`                 | A property name to search for.                                                | Mandatory one instance per `match-property`.       |
| `regex`                | A regular expression (or plain string) that needs to match the property name. | Mandatory one instance per `match-property`.       |

| Service Type | Description                                                                                |
|--------------|--------------------------------------------------------------------------------------------|
| `ip`         | Service to discover add-ons by scanning for devices via a UDP 'ping' broadcast on the LAN. |
| `mdns`       | Service to discover add-ons by scanning for devices using the mDNS discovery service.      |
| `processs`   | Service to discover add-ons by checking processes running on the PC.                       |
| `upnp`       | Service to discover add-ons by scanning for devices using the UPnP discovery service.      |
| `usb`        | Service to discover add-ons by scanning for USB devices attached to the PC.                |

Notes:

- A `discovery-method` may contain multiple `match-property` entries, and in such a case **all** entries must match i.e. it a logical `AND` function is applied.
- If you want to apply a logical `OR` function you can define a second separate `discovery-method` containing the respective `match-property` entry.
- Different add-on discovery finders may need different `discovery-parameters`. Check the JavaDoc of the respective 'org.openhab.core.config.discovery.addon.*' finder class on GitHub. Or see the `mdns` example below.
- The `match-property` has different allowed values for its `name` element depending on the discovery `service-type`, as shown in the table below.

| Service Type | Allowed `match-property` `name` values                                                                                                       |
|--------------|----------------------------------------------------------------------------------------------------------------------------------------------|
| `ip`         | "response".                                                                                                                                  |
| `mdns`       | Frequently used properties are "name", and "application". But mDNS permits any property name depending on the service concerned.             |
| `process`    | "command", "commandLine".                                                                                                                    |
| `upnp`       | "deviceType", "manufacturer", "manufacturerURI", "modelName", "modelNumber", "modelDescription", "modelURI", "serialNumber", "friendlyName". |
| `usb`        | "product", "manufacturer", "chipId", "remote".                                                                                               |

## Example

The following code gives an example for an add-on definition used in bindings.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<addon:addon id="bindingID"
    xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance"
    xmlns:addon="https://openhab.org/schemas/addon/v1.0.0"
    xsi:schemaLocation="https://openhab.org/schemas/addon/v1.0.0
        https://openhab.org/schemas/addon-1.0.0.xsd">

  <type>binding</type>
  <name>hue Binding</name>
  <description>The hue Binding integrates the Philips hue system. It allows to control hue bulbs.</description>

  <connection>local</connection>

  <discovery-methods>
    <discovery-method>
      <serviceType>mdns</serviceType>
      <discovery-parameters>
        <discovery-parameter>
          <name>mdnsServiceType</name>
          <value>_hue._tcp.local.</value>
        </discovery-parameter>
      </discovery-parameters>
    </discovery-method>
    <discovery-method>
      <service-type>upnp</service-type>
      </match-properties>
        <match-property>
          <name>modelName</name>
          <regex>Philips hue bridge</regex>
        </match-property>
      </match-properties>
    </discovery-method>
  </discovery-methods>

</addon:addon>
```
