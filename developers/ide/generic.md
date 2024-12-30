---
layout: developersguide
title: Generic IDEs hints
---

# Generic setup for your IDE

## The demo project with Maven

It can be particularly useful, regardless of the IDE, to be able to launch a development instance of openHAB.
This is the purpose of the `org.openhab.demo.app` project, which can be found in the `openhab-distro` repository.

To do this, you need to clone the [openhab distro repository](https://www.github.com/openhab/openhab-distro)

To launch the demo project, Eclipse [has its bnd plugin](./eclipse.html#working-with-add-ons).
However, it can sometimes be particularly slow. Maven is therefore a completely viable alternative (and the only option
available for other IDEs).
Using the demo project through Maven will allow you to run an openHAB instance that uses the artifacts present in your
local Maven repository (and downloads them beforehand if they are not already present).

This means that if you develop an add-on (or even a `openhab-core` module), once you have built and installed it, it
will be available in your local repository and the demo project will be able to use your development.

### Build project

::: warning
Make sure you meet the prerequisites like the Java and Maven version. As of openHAB 5.x Java 21.x is required and at least mvn 3.8.6.
:::

Use Maven to build the projects you want to develop for. It is important to use the `mvn install` option to copy the artifact in your local repository.

### Preparation

There are two files to take care of:

- `/openhab-distro/launch/app/pom.xml` must contain the artifact you are developing in the dependencies section (search for "uncomment this and add the name of your binding that you want to work on")

- `/openhab-distro/launch/app/app.bndrun` will list the modules needed by the OSGi runtime. You also have to add your add-on in the `runrequires` section (e.g. `bnd.identity;id='org.openhab.binding.YOURBINDINGNAME'` and don't forget to add the `\` to the previous line if you adding it to the end of the list)

After editing this two files, use this maven command from the `/openhab-distro/launch/app/` directory:

`mvn bnd-resolver:resolve`

This will ask the bnd plugin to 'resolve' the dependencies (i.e. to calculate which bundles to run in the OSGi runtime) and update
 the `runbundles` section of the `app.bndrun` file accordingly.
Each time you add a dependency or change the version, you HAVE to run a resolve task.

::: warning
The `pom.xml` file is versioned. The version fields present in the file must match the modules
you are developing. For example, if you are developing a module for `openhab-core` and it is deployed as version
5.0.0-SNAPSHOT in your local repository, you must use this same 5.0.0-SNAPSHOT version in the version field of the
`org.openhab.demo.app` artifact. Similarly, for add-on development, ensure that the version field of your add-on in the
pom.xml file matches the version you are currently developing. If you use incorrect versions, you will not understand
why your changes are not being taken into account
:::

### Launching and debugging

Go to the directory `/openhab-distro/launch/app`

To launch the demo app, using the content of the `app.bndrun` file:

`mvn bnd-run:run`

You can now open the app in your browser via [http://localhost:8080/](http://localhost:8080/).

To launch in debug mode:

`mvn -D-runjdb=10001 package bnd-run:run`

Wait for the process to pause and show the log `Listening for transport...` then attach your IDE to the remote debugging
session (here, on port 10001). The openHAB demo project startup process will then resume and you will be able to
open it in your browser.

Each modification of your code requires rebuilding your add-on with `mvn clean install` so that it is
deployed in your local repository and accessible for the next execution.
