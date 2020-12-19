---
layout: documentation
title: Transformations
---

{% include base.html %}

# Transformations

Transformations are used to translate data from a cluttered or technical raw value to a processed or human-readable representation.
They are often useful, to **interpret received Item values**, like sensor readings or state variables, and to translate them into a human-readable or better processible format.

**Examples:**

- Translation of a technical Binding output, e.g., "CLOSED" can be translated to the Spanish translation "cerrado"
- Processing of a raw Item value, e.g., Parsing a number from a JSON string, like `{ "temperature": 23.2 }`
- Conversion of sensor readings, e.g., temperature in degree Celsius can be converted to degree Fahrenheit

## Usage

Transformations are applicable in Item and Sitemap element labels and inside DSL rules.
The relevant transformation service needs to be installed via the paperUI before use.
Be aware, that some Transformation services rely on transformation files, while others work by directly providing the transformation logic.
Transformation files need to be placed in the directory `$OPENHAB_CONF/transform`.

1.  Item and Sitemap Labels

     Transformations used in the [state/value part]({{base}}/configuration/items.html#state-transformations) of labels are applied **on the fly**.
     While the **transformed value** will (for example) be visible on a Sitemap, the **original value** is stored in the Item.

    The following example shows a Map transformation (see below) used in the State part of an Item's label.
    The technical state of a Contact Item (e.g. "CLOSED") is translated into a human readable representation in Spanish ("cerrado").

    ```java
    Contact Livingroom_Window        "Window [MAP(window_esp.map):%s]"               {/*Some Binding*/}
    Number  Kitchen_Temperature_C    "Temperature [JSONPATH($.temperature):%.1f °C]" {/*Some Binding*/}
    Number  Livingroom_Temperature_F "Temperature [JS(convert-C-to-F.js):%.1f °F]"   {/*Some Binding*/}

    ```

    Usage of Transformations in the [label parameter of Sitemap elements]({{base}}/configuration/sitemaps.html#element-type-text) works the same way.

1. Rules

    Transformations can also be [used in rules]({{base}}/configuration/rules-dsl.html#transformations) to transform/translate/convert data.
    The following shows three examples:

    ```java
    var condition = transform("MAP", "window_esp.map", "CLOSED")
    var temperature = transform("JSONPATH", "$.temperature", jsonstring)
    var fahrenheit = transform("JS", "convert-C-to-F.js", temperature)
    ```

1. Bindings

    Transformations can sometimes be used in binding add-ons.  For example, transforming an openHAB ON command into "action=powerup" for sending to a device.
    If, and how, this use may be available is described in individual binding documentation.

1. Profiles

    Transformations can be associated with channels, working on data being passed between bindings and Items. See [profile documentation]({{base}}/configuration/items.html#profiles) for more detail.

To keep these examples simple, the contents of the referenced files `window_esp.map` and `convert-C-to-F.js` were left out.
More details regarding this and other Transformation services can be found in the individual transformation articles linked below.

## Available Transformations

Be aware that a transformation service just as any other openHAB add-on needs to be installed prior to first usage.

<table id="transformations-overview" class="bordered addon-table">
  <thead>
    <tr>
      <th data-field="label" width="20%">Name</th>
      <th data-field="description">Description</th>
    </tr>
  </thead>
  <tbody>
    {% for transformation in site.addons_transformations %}
    <tr class="install-{{transformation.install}} since-{{transformation.since}}">
      <td>
        <h4><a href="{{base}}{{transformation.url}}">{% if transformation.logo %}<img class="logo" src="{{base}}/{{transformation.logo}}" title="{{ transformation.label }}" alt="{{ transformation.label }}" />{% else %}{{ transformation.label }}{% endif %}</a></h4>
        <img src="{{base}}/images/tag-install-{{transformation.install}}.svg">
      </td>
      <td>{{ transformation.description | markdownify }}</td>
    </tr>
    {% endfor %}
 </tbody>
</table>
