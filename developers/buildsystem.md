---
layout: developersguide
title: Build System
---

{% include base.html %}

# Build System

The buildsystem is based on maven.
A very common tool for Java development.
Maven is a convention centric, declarative system that is extensible via addional plugins.
That means if you stick 100% to mavens idea of a java project, your buildsystem instruction file is not longer than 10 lines.

openHAB has a few extra requirements and we use about 10 additional plugins,
ranging from OSGi specific ones (bnd) to publish and testing plugins.

This section talks about some common buildsystem related topics and also some quirks that you will encounter.

## Adding Dependencies

Generally all dependencies should be available on JCenter.

** External dependency **

In most cases they should be referenced in the project POM with scope `compile`:

```
  <dependencies>
    <dependency>
      <groupId>foo.bar</groupId>
      <artifactId>baz</artifactId>
      <version>1.0.0</version>
      <scope>compile</scope>
    </dependency>
  </dependencies>
```

These depenencies are embedded in the resulting bundle automatically.

There are two exceptions: 

1) Dependencies to other openHAB bundles (e.g. `org.openhab.addons.bundles/org.openhab.binding.bluetooth/2.5.0-SNAPSHOT` or `org.openhab.addons.bundles/org.openhab.transform.map/2.5.0-SNAPSHOT`).
2) Bundles that are used by more than one binding (e.g. Netty-bundles like `io.netty/netty-common/4.1.34.Final`).

Dependencies on other openHAB bundles should have the scope `provided`.
To ensure that they are available at runtime they also need to be added to the `feature.xml`:

```
  <bundle dependency="true">mvn:org.openhab.addons.bundles/org.openhab.binding.bluetooth/2.5.0-SNAPSHOT</bundle>
```

Bundles that are used in more than one binding should use the same version that is already present. 
You need to exclude those bundles from embedding by adding an exclusion to the `pom.xml`:

```
  <properties>
    <dep.noembedding>netty-common</dep.noembedding>
  </properties>
```

It is also necessary to add them to the `feature.xml`(see above).
If the version that is used in other openHAB bundles is incompatible with your library, check if you can use a different version of your library.
In case this is not possible, please ask if an exception can be made and a different version can be bundled within your binding.
Technically you just need to omit the exclusion-statement above.
If you only depend on shared bundles you can also omit the exclusion statement and add a `noEmbedDependencies.profile` file in the root directory of your binding.

** Internal dependency **

In two cases libraries can be added to the `/lib` directory only if the bundle is not available for download.
The build system automatically picks up all JAR files in `/lib` and embeds them in the new bundle.
In this case they must not be added to the feature.

If the bundles manifest is not properly exporting all needed packages, you can import them manually by adding 

```
  <properties>
    <bnd.importpackage>foo.bar.*,foo.baz.*</bnd.importpackage>
  </properties>
```

to the POM.

If the imported packages need to be exposed to other bundles (e.g. case 2 above), this has to be done manually by adding

```
  <properties>
    <bnd.exportpackage>foo.bar.*;version="1.0.0"</bnd.exportpackage>
  </properties>
```

to the POM.
If `version="1.0.0"` is not set, the packages are exported with the same version as the main bundle.
Optional parameters available for importing/exporting packages (e.g. `foo.bar.*;resolution:="optional"`) are available, too.
Packages can be excluded from import/export by prepending `!` in front of the name (e.g. `<bnd.importpackage>!foo.bar.*</bnd.importpackage>` would prevent all packages starting with foo.bar from being imported). 
