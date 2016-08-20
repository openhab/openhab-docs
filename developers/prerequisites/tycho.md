---
layout: developersguide
title: Tycho
---

{% include base.html %}

Tycho
=====

Introduction
------------

[Tycho][Tycho] *is a set of [Maven][Maven] plugins and extensions for building Eclipse plugins and OSGi bundles with Maven* as it is described in the [Tycho project homepage][Tycho-home]. Tycho uses the Eclipse components metadata as much as possible (e.g. for plug-ins and bundles it determines the dependencies via the ```MANIFEST.MF```file).

Integrate your bundle with the Tycho build
------------------------------------------
openHAB project is building the bundles with Tycho, so knowledge about how is Tycho functioning can help you to integrate your work with the build.

Let's take a look at the pom.xml that is automatically generated, when you create a binding using the [binding skeleton](../development/bindings.html#creating-a-skeleton):

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://maven.apache.org/POM/4.0.0" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">

  <modelVersion>4.0.0</modelVersion>

  <parent>
    <groupId>org.openhab.binding</groupId>
    <artifactId>pom</artifactId>
    <version>2.0.0-SNAPSHOT</version>
  </parent>

  <groupId>org.openhab.binding</groupId>
  <artifactId>org.openhab.binding.mybinding</artifactId>
  <version>2.0.0-SNAPSHOT</version>

  <name>MyBidning Binding</name>
  <packaging>eclipse-plugin</packaging>

</project>
```
The generated pom file has done almost everything that is needed to integrate your new binding. We will use it as example to show several Tycho requirements in order to build your bundle:

 - the `artifactId` in the pom file must match the `Bundle-Sumbolic-Name` from the `MANIFEST.MF` file;
 - the `version` in the pom file must match the `Bundle-Version` from the `MANIFEST.MF` (Eclipse components use `qualifier` as a suffix, Maven uses `SNAPSHOT`, but Tycho maps these values correctly);
 - include a `packaging` attribute in the pom file. In this example the packaging type is set to `eclipse-plugin` in the pom.xml file. For more information about the packing types that Tycho understands follow the [link](https://wiki.eclipse.org/Tycho/Packaging_Types).

Notice that is also important to have a "link" between the pom file in your bundle and the parent pom (the `parent` element). 

Only one thing must be done more in order to have your bundle included in the openHAB build. You will have to add your binding as a module to the parent pom as well.

Configure Tycho
---------------------------

A Tycho build is configured via the standard Maven configuration files - the pom.xml files. 

The openHAB project is divided into modules. In the pom, located in the root of the repository, there is a configuration of the Tycho plugins, that will be used from all modules. We will just mention a few settings that are applied there:
 
 - Repositories are defined. This will be the place, where Tycho will search for dependencies;
 - Compiler is selected.

If you are developing a new binding, you might want to override these settings or add a new confugiration for some of the Tycho plug-ins. A case when you have to configure Tycho individually for a project is when you want to implement a test plugin. Test plugins are executed with the [tycho-surefire-plugin](https://eclipse.org/tycho/sitedocs/tycho-surefire/tycho-surefire-plugin/test-mojo.html). You can find more information, how to implement a test plugin and configure the `tycho-surefire-plugin` in the [Eclipse SmartHome documentation](http://www.eclipse.org/smarthome/documentation/development/testing.html).

Executing a Tycho build
-----------------------

You can check if all dependencies are resolved with:

`mvn clean verify`

Tycho build is executed just like a standard Maven build. You can use:

`mvn clean install`

You can execute tests with:

`mvn clean integration-test`
 
Tests are executed in a test runtime (based on [OSGi](osgi.html)).

Target platform
----------------

[Target platform](targetplatform.html) is the set of plug-ins which you can use for your development or your build process to resolve the project dependencies.

If you are using a [target definition file](targetplatform.html#target-definition), the file should contain only "Software site" locations (i.e. *location* elements with *type="InstallableUnit"*).

When you execute the build, the bundles that are available (can be used as dependencies) form the **effective content of the target platform**. It consists of the following plug-ins:

- all plug-ins included in the target platform with the Tycho configuration (the configuration is done in the pom files). Multiple approaches exist here, for more details, you can take a look in the [Tycho Target platform documentation](https://wiki.eclipse.org/Tycho/Target_Platform#Which_approach_shall_I_use_for_the_target_platform_of_my_project.3F); 
- other artifacts from the same reactor (the Maven [reactor](https://maven.apache.org/guides/mini/guide-multiple-modules.html), i.e. everything that is built together in the same `mvn` call);
- locally built artifacts in the local Maven repository. Just like in a normal Maven build, a Tycho build uses artifacts that have been built locally and installed into the local Maven repository. They are implicitly added to the target platform.

Dependency resolution troubleshooting
-------------------------------------

If you develop a new bundle, you might have dependencies that can not be resolved from Tycho. In case of dependency resolution failure, Tycho will display an error message on the console. The message might be confusing, so we will take a look at one example:

```
[INFO] Resolving dependencies of MavenProject: com.mycorp:com.mycorp.myplugin:0.1.0-SNAPSHOT @ C:\Source\MyProject\com.mycorp.myplugin\pom.xml
[INFO] {osgi.ws=win32, osgi.os=win32, osgi.arch=x86_64, org.eclipse.update.install.features=true}
[ERROR] Cannot resolve project dependencies:
[ERROR]   Software being installed: com.mycorp.myplugin 0.1.0.qualifier
[ERROR]   Missing requirement: com.mycorp.mylib 0.1.0.qualifier requires 'package org.eclipse.someproject [1.8.2,2.0.0)' but it could not be found
[ERROR]   Cannot satisfy dependency: com.mycorp.myplugin 0.1.0.qualifier depends on: bundle com.mycorp.mylib 0.0.0
```
Source: <https://wiki.eclipse.org/Tycho/Dependency_Resolution_Troubleshooting>

This error message means that a mandatory dependency of the project can not be resolved. This can be either direct or transitive dependency. In case it is transitive you will see one or more rows like (`Cannot satisfy dependency: [artifact] depends on: [dependency]`), which will track the dependencies chain. Important is to note which package (in case of package dependency) or bundle(for plugin dependency) is missing. In this case this is the package `org.eclipse.someproject` with version range [1.8.2,2.0.0).

For more detailed explanation of the error message take a look at - <https://wiki.eclipse.org/Tycho/Dependency_Resolution_Troubleshooting>.

In order to debug Tycho resolution problems run **mvn** with the flags
**-Dtycho.debug.resolver=true** and **-X**.

This will display all the bundles that are available in the target platform for this module. In the displayed list you can search, if the required bundle has a mismatching version or it is missing at all. 

In order to resolve the problem, you will have to include the bundle that is exporting the missing package (or the required bundle) to the effective content of the target platform.

Further Reading
----------
- <https://wiki.eclipse.org/Tycho/Target_Platform>
- <https://wiki.eclipse.org/Tycho/Packaging_Types>
- <https://github.com/FTSRG/cheat-sheets/wiki/Maven-and-Eclipse#tycho>
- <http://www.vogella.com/tutorials/EclipseTycho/article.html>
- <http://www.vogella.com/tutorials/EclipseTargetPlatform/article.html>
- <https://wiki.eclipse.org/PDE/Target_Definitions>  

[target-platform]: http://help.eclipse.org/mars/index.jsp?topic=%2Forg.eclipse.pde.doc.user%2Fconcepts%2Ftarget.htm
[Tycho]: https://eclipse.org/tycho/sitedocs/index.html
[Maven]: https://maven.apache.org/
[Tycho-home]: https://eclipse.org/tycho/