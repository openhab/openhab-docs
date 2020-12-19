---
layout: developersguide
title: Configuration Descriptions
---

{% include base.html %}

# Configuration Descriptions

Specific services or bindings usually require a configuration to be operational in a meaningful way.
To visualize or validate concrete configuration properties, configuration descriptions should be provided.
All available configuration descriptions are accessible through the `org.openhab.core.config.core.ConfigDescriptionRegistry` service.

Although configuration descriptions are usually specified in a declarative way (as described in this section), they can also be provided as `org.openhab.core.config.core.ConfigDescriptionProvider`.
Any `ConfigDescriptionProvider`s must be registered as service at the *OSGi* service registry.
The full Java API for configuration descriptions can be found in the Java package `org.openhab.core.config.core`.
In addition to this there is a `org.openhab.core.config.core.validation.ConfigDescriptionValidator` that can be used to validate a set of configuration parameters against their declarations in the configuration description before the actual configuration is updated with the new configuration parameters.

Configuration descriptions must be placed as XML file(s) (with the ending `.xml`) in the bundle's folder `/OH-INF/config/`.

## Formatting Labels

The label and descriptions for things, channels and config descriptions should follow the following format.
The label should be short so that for most UIs it does not spread across multiple lines.
The description can contain longer text to describe the thing in more detail.
Limited use of HTML tags is permitted to enhance the description - if a long description is provided, the first line should be kept short and a line break (```<br>```) should be placed at the end of the line to allow UIs to display a short description in limited space.

Configuration options should be kept short so that they are displayable on a single line in most UIs.
If you want to provide a longer description of the options provided by a particular parameter, then this should be placed into the ```<description>``` of the parameter to keep the option label short.
The description can include limited HTML to enhance the display of this information.

The following HTML tags are allowed -: ```<b>, <br>, <em>, <h1>, <h2>, <h3>, <h4>, <h5>, <h6>, <i>, <p>, <small>, <strong>, <sub>, <sup>, <ul>, <ol>, <li>```.
These must be inside the XML escape sequence - eg.
```<description><![CDATA[ HTML marked up text here ]]></description>```.

## XML Structure for Configuration Descriptions
```xml
<?xml version="1.0" encoding="UTF-8"?>
<config-description:config-descriptions
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:config-description="https://openhab.org/schemas/config-description/v1.0.0"
    xsi:schemaLocation="https://openhab.org/schemas/config-description/v1.0.0
        https://openhab.org/schemas/config-description-1.0.0.xsd">

  <config-description uri="{binding|thing-type|channel-type|any_other}:bindingID:...">
    <parameter-group name="String">
      <label>String</label>
      <description>String</description>
      <context>String</context>
      <advanced>{true|false}</advanced>
    </parameter-group>

    <parameter name="String" type="{text|integer|decimal|boolean}" min="Decimal" max="Decimal" step="Decimal" pattern="String" required="{true|false}" readOnly="{true|false}" multiple="{true|false}" groupName="String" unit="A|cd|K|kg|m|mol|s|g|rad|sr|Hz|N|Pa|J|W|C|V|F|Ω|S|Wb|T|H|Cel|lm|lx|Bq|Gy|Sv|kat|m/s2|m2v|m3|kph|%|l|ms|min|h|d|week|y">
      <context>{network-address|serial-port|password|password-create|color|date|datetime|email|month|week|dayOfWeek|time|tel|url|item|thing|group|tag|service|channel|rule|location}</context>
      <required>{true|false}</required>
      <default>String</default>
      <label>String</label>
      <description>String</description>
      <unitLabel>String</unitLabel>
      <options>
        <option value="String">String</option>
      </options>
      <filter>
        <criteria name="String">String</criteria>
      </filter>
    </parameter>
  </config-description>

  <config-description uri="{binding|thing-type|channel-type|any_other}:bindingID:...">
    ...
  </config-description>
...
</config-description:config-descriptions>
```

<table>
  <tr><td><b>Property</b></td><td><b>Description</b></td></tr>
  <tr><td>config-description.uri</td><td>The URI of this description within the ConfigDescriptionRegistry (mandatory).</td></tr>
  <tr><td>parameter</td><td>The description of a concrete configuration parameter (optional).</td></tr>
  <tr><td>parameter.name</td><td>The name of the configuration parameter (mandatory).</td></tr>
  <tr><td>parameter.type</td><td>The data type of the configuration parameter (mandatory).</td></tr>
  <tr><td>parameter.min</td><td>The minimal value for numeric types, or the minimal length of strings. Note that the value of any options may be outside of this value (optional).</td></tr>
  <tr><td>parameter.max</td><td>The maximum value for numeric types, or the maximum length of strings. Note that the value of any options may be outside of this value (optional).</td></tr>  
  <tr><td>parameter.step</td><td>The value granularity for a numeric value (optional).</td></tr>
  <tr><td>parameter.pattern</td><td>The regular expression for a text type (optional).</td></tr>
  <tr><td>parameter.required</td><td>Specifies whether the value is required (optional).</td></tr>
  <tr><td>parameter.readOnly</td><td>Specifies whether the value is read-only (optional).</td></tr>
  <tr><td>parameter.multiple</td><td>Specifies whether multiple selections of options are allowed (optional).</td></tr>
  <tr><td>parameter.groupName</td><td>Sets a group name for this parameter (optional).</td></tr>
  <tr><td>parameter.unit</td><td>Specifies the unit of measurements. The unit declaration in the parameter definition shown above contains the set of valid units. The unit must only be set if the type of the parameter is either integer or decimal (optional).</td></tr>
  <tr><td>advanced</td><td>Specifies that this is an advanced parameter. Advanced parameters may be hidden by a UI (optional).</td></tr>
  <tr><td>verify</td><td>Specifies that this is parameter requires a verification stage with the user before sending. Parameters flagged with *verify=true* could be considered dangerous and should be protected from accidental use by a UI - e.g. by adding an "Are you sure" prompt (optional).</td></tr>
  <tr><td>context</td><td>The context of the configuration parameter (optional).</td></tr>
  <tr><td>required</td><td>The flag indicating if the configuration parameter has to be set or not (deprecated, optional, default: false).</td></tr>
  <tr><td>default</td><td>The default value of the configuration parameter (optional). If `multiple` is true you can define a list of default values, separating them by a comma (`,`).</td></tr>
  <tr><td>label</td><td>A human-readable label for the configuration parameter (optional).</td></tr>
  <tr><td>description</td><td>A human-readable description for the configuration parameter (optional).</td></tr>
  <tr><td>unitLabel</td><td>The unit label represents a human-readable label for the unit. It can also be used to provide unit labels for natural language units as iterations, runs, etc. The unit label must only be set if the type of the parameter is either integer or decimal (optional).</td></tr>
  <tr><td>option</td><td>The element definition of a static selection list (optional).</td></tr>
  <tr><td>option.value</td><td>The value of the selection list element. Note that the value may be outside of the range specified in the min/max if this is specified.</td></tr>
  <tr><td>multipleLimit</td><td>If `multiple` is true, sets the maximum number of options that can be selected (optional).</td></tr>
  <tr><td>limitToOptions</td><td>If true (default) will only allow the user to select items in the options list. If false, will allow the user to enter other text (optional).</td></tr>
  <tr><td>criteria</td><td>The filter criteria for values of a dynamic selection list (optional).</td></tr>  
  <tr><td>criteria.name</td><td>The name of the context related filter.</td></tr>  
</table>

### Supported Contexts

Context is used to provide some semantic details about the parameter.
The UIs use it to render different kind of input widgets.
The following contexts require a specific format of the content:

<table><tr><th>Name</th><th>Type</th><th>Format</th><th>Sample implementation</th></tr>
  <tr><td>network-address</td><td>text</td><td>IPv4,IPv6, domain name</td><td><code>&lt;input type="text"/></code></td></tr>
  <tr><td>serial-port</td><td>text</td><td>Serial port name, e.g. COM1</td><td>custom input field</td></tr>
  <tr><td>password</td><td>text</td><td>alphanumeric characters</td><td><code>&lt;input type="password"/></code></td></tr>
  <tr><td>password-create</td><td>text</td><td>alphanumeric characters</td><td>custom password input</td></tr>
  <tr><td>color</td><td>text</td><td>#000000 - #ffffff (hex color)</td><td><code>&lt;input type="color"/></code></td></tr>
  <tr><td>date</td><td>text</td><td>YYYY-MM-DD</td><td><code>&lt;input type="date"/></code></td></tr>
  <tr><td>datetime</td><td>text</td><td>YYYY-MM-DD hh:mm</td><td>custom input field</td></tr>
  <tr><td>email</td><td>text</td><td>username@domain.com</td><td><code>&lt;input type="email"/></code></td></tr>
  <tr><td>month</td><td>text</td><td>month of year</td><td>custom input field</td></tr>
  <tr><td>week</td><td>integer</td><td>week of year</td><td>custom input field</td></tr>
  <tr><td>dayOfWeek</td><td>text</td><td>MON, TUE, WED, THU, FRI, SAT, SUN <br></td><td>custom input field</td></tr>
  <tr><td>time</td><td>text/integer</td><td>hh:mm:ss/milliseconds since epoch</td><td><code>&lt;input type="time"/></code></td></tr>
  <tr><td>telephone</td><td>text</td><td>telephone number</td><td>custom input field</td></tr>
  <tr><td>url</td><td>text</td><td>web url</td><td><code>&lt;input type="url"/></code></td></tr>
  <tr><td>item</td><td>text</td><td>Item name</td><td>custom input field</td></tr>
  <tr><td>thing</td><td>text</td><td>UID of a thing</td><td>custom input field</td></tr>
  <tr><td>group</td><td>text</td><td>group name to which this parameter belongs</td><td></td></tr>
  <tr><td>tag</td><td>text</td><td>tag name</td><td>custom input field</td></tr>
  <tr><td>service</td><td>text</td><td>service name</td><td>custom input field</td></tr>
  <tr><td>channel</td><td>text</td><td>UID of a channel<br></td><td>custom input field</td></tr>
  <tr><td>rule</td><td>text</td><td>UID of a rule<br></td><td>custom input field</td></tr>
  <tr><td>location</td><td>text</td><td>latitude,longitude[,altitude]<br></td><td>custom input field</td></tr>
</table>

Further, the <strong>item</strong> context can contain criteria to filter the list of items. For example:

```xml
<filter>
  <criteria name="type">Switch,Dimmer</criteria>
  <criteria name="tag">Light,Heating</criteria>
</filter>
```

In the case of above filter only those items will be shown that satisfy the filter's conditions.
The above filter is evaluated as follows: 

```
(type=Switch OR type=Dimmer) AND (tag=Light OR tag=Heating) 

```
Similarly, the <strong>Channel</strong> context can contain criteria to filter channels based on <strong>kind</strong> field.
The value of <strong>kind</strong> can either be STATE or TRIGGER.
For example:

```xml
<filter>
  <criteria name="kind">STATE|TRIGGER</criteria>
</filter>
```

Groups allow parameters to be grouped together into logical blocks so that the user can find the parameters they are looking for.
A parameter can be placed into a group so that the UI knows how to display the information.
<table>
  <tr><td><b>Property</b></td><td><b>Description</b></td></tr>
  <tr><td>group.name</td><td>The group name - this is used to link the parameters into the group, along with the groupName option in the parameter (mandatory).</td></tr>
  <tr><td>label</td><td>The human-readable label of the group. (mandatory).</td></tr>
  <tr><td>description</td><td>The description of the group. (optional).</td></tr>
  <tr><td>context</td><td>Sets a context tag for the group. The context may be used in the UI to provide some feedback on the type of parameters in this group (optional).</td></tr>
  <tr><td>advanced</td><td>Specifies that this is an advanced group. The UI may hide this group from the user (optional).</td></tr>
</table>

The full XML schema for configuration descriptions is specified in the [openHAB config description XSD](https://openhab.org/schemas/config-description-1.0.0.xsd) file.

**Hints:**

- Although the attribute `uri` is optional, it *must* be specified in configuration description files.
Only for embedded configuration descriptions in documents for binding definitions and `Thing` type descriptions, the attribute is optional.

## Example

The following code gives an example for one configuration description.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<config-description:config-description uri="thing-type:my-great-binding:my-bridge-name"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:config-description="https://openhab.org/schemas/config-description/v1.0.0"
    xsi:schemaLocation="https://openhab.org/schemas/config-description/v1.0.0
        https://openhab.org/schemas/config-description-1.0.0.xsd">

  <parameter-group name="connection">
    <label>Connection</label>
    <description>Connection settings.</description>
  </parameter-group>

  <parameter-group name="authentication">
    <label>Authentication</label>
    <description>Authentication settings.</description>
  </parameter-group>

  <parameter name="ipAddress" type="text" required="true" groupName="connection">
    <context>network-address</context>
    <label>Network Address</label>
    <description>Network address of the device.</description>
  </parameter>

  <parameter name="port" type="integer" min="0" max="65535" multiple="true" groupName="connection">
    <label>Port</label>
    <default>80,443,8080</default>
  </parameter>

  <parameter name="userName" type="text" required="true" groupName="authentication">
    <label>User Name</label>
  </parameter>

  <parameter name="password" type="text" required="false" groupName="authentication">
    <context>password</context>
  </parameter>

</config-description:config-description>
```
