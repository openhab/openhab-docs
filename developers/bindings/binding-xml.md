---
layout: developersguide
title: Binding Descriptions
---

## Binding Definitions

Every binding has to provide meta information such as binding id or name.

Background information: The meta information of all bindings is accessible through the `org.openhab.core.binding.BindingInfoRegistry` service.

Although binding definitions are usually specified in a declarative way (as described in this section),
they can also be provided as `org.openhab.core.binding.BindingInfo`.
Any `BindingInfo` must be registered as service at the *OSGi* service registry.
The full Java API for binding definitions can be found in the Java package `org.openhab.core.binding`.

For the declarative way, you add your binding information in form of a `binding.xml` file to the bundle's folder `/src/main/resources/OH-INF/binding/binding.xml`.


### XML Structure for Binding Definitions

```xml
<?xml version="1.0" encoding="UTF-8"?>
<binding:binding id="bindingID"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:binding="https://openhab.org/schemas/binding/v1.0.0"
    xsi:schemaLocation="https://openhab.org/schemas/binding/v1.0.0
        https://openhab.org/schemas/binding-1.0.0.xsd">

  <name>String</name>
  <description>String</description>
  <author>String</author>

  <config-description>
    ...
  </config-description>
  OR
  <config-description-ref uri="{binding|thing-type|channel-type|any_other}:bindingID:..." />

</binding:binding>
```

| Property                   | Description                                  | |
|----------------------------|----------------------------------------------|-----|
| binding.id                 | An identifier for the binding                | mandatory |
| name                       | A human-readable name for the binding        | mandatory |
| description                | A human-readable description for the binding | optional  |
| author                     | The author of the binding                    | optional  |
| service-id                 | The ID (service.pid or component.name) of the main binding service, which can be configured through OSGi configuration admin service. Should only be used in combination with a config description definition | optional |
| config-description         | The configuration description for the binding within the ConfigDescriptionRegistry | optional |
| config-description-ref     | The reference to a configuration description for the binding within the ConfigDescriptionRegistry | optional |
| config-description-ref.uri | The URI of the configuration description for the binding within the ConfigDescriptionRegistry | mandatory |


The full XML schema for binding definitions is specified in the [Binding XSD](https://openhab.org/schemas/binding-1.0.0.xsd) file.

**Hints:**

- The attribute `uri` in the section `config-description` is optional, it *should not* be specified in binding definition files because it's an embedded configuration. If the `uri` is *not* specified, the configuration description is registered as `binding:bindingID`, otherwise the given `uri` is used.
- If a configuration description is already specified somewhere else and the binding wants to (re-)use it, a `config-description-ref` should be used instead.
- Normally the service id must not be defined, because it is implicitly set to "binding.&lt;binding.id&gt;".
A binding can register an OSGi service which implements the ManagedService interface and define the service.pid as e.g."binding.hue" to receive the configuration.


### Example

The following code gives an example for a binding definition.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<binding:binding id="bindingID"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:binding="https://openhab.org/schemas/binding/v1.0.0"
    xsi:schemaLocation="https://openhab.org/schemas/binding/v1.0.0
        https://openhab.org/schemas/binding-1.0.0.xsd">

  <name>hue Binding</name>
  <description>The hue Binding integrates the Philips hue system. It allows to control hue bulbs.</description>
  <author>ACME</author>

</binding:binding>
```
