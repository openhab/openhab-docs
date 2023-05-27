---
layout: developersguide
title: Add-on Descriptions
---

# Add-on Definitions

Every add-on has to provide meta information such as add-on type, id or name.

Background information: The meta information of all add-ons is accessible through the `org.openhab.core.addon.AddonInfoRegistry` service.

Although add-on definitions are usually specified in a declarative way (as described in this section), they can also be provided as `org.openhab.core.addon.AddonInfo`.
Any `AddonInfo` must be registered as service at the *OSGi* service registry.
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

The full XML schema for add-on definitions is specified in the [Add-on XSD](https://openhab.org/schemas/addon-1.0.0.xsd) file.

**Hints:**

- The attribute `uri` in the section `config-description` is optional, it *should not* be specified in add-on definition files because it's an embedded configuration. If the `uri` is *not* specified, the configuration description is registered as `type:addonID`, otherwise the given `uri` is used.
- If a configuration description is already specified somewhere else and the add-on wants to (re-)use it, a `config-description-ref` should be used instead.
- Normally the service id must not be defined, because it is implicitly set to "type.&lt;addonId&gt;".
  An add-on can register an OSGi service which implements the ManagedService interface and define the service.pid as e.g."binding.hue" to receive the configuration.

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

</addon:addon>
```
