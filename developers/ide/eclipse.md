---
layout: developersguide
title: Eclipse IDE
---

# Eclipse IDE

**TODO**: We are currently reworking how to setup a perfect development enviroment.
A new step by step guide will appear here soon.

For now follow these steps:

### Eclipse IDE Setup

1. Install the latest "Eclipse IDE for Java Developers", the installer [can be downloaded from the Eclipse web site](https://wiki.eclipse.org/Eclipse_Installer)
1. Launch Eclipse and install Bndtools from the Eclipse Marketplace: Help -> Eclipse Marketplace -> Find "bndtools" -> Install:

   ![bndtools from marketplace](images/ide_setup_eclipse_market.png)
   (Accept License and the Security warning about the software is not signed)

   Restart Eclipse to activate Bndtools.
1. Using `git` from the command line, checkout the openHAB demo application: `git clone --depth=1 https://github.com/maggu2810/openhab-demo`
1. Import the demo application from Eclipse: File -> Import -> Maven -> Existing Maven Projects -> select the root directory of the demo application project -> Finish.

   ![demo import](images/ide_setup_eclipse_import_demo.png)

   Leave Eclipse open and wait for the downloads and build to finish (about 5-10 minutes).
1. Using git from the command line, checkout the `openhab2-addons` repository: `git clone --depth=1 https://github.com/openhab/openhab2-addons`
1. Add the binding that you want to develop (in this guide we use `astro` as an example) to the Eclipse workspace: File -> Import -> Maven -> Existing maven projects -> select the root directory of the binding -> Finish.

   Leave Eclipse open and wait for the downloads and build to finish.

   **WARNING**: if the build continues indefinitely, this a bug in the setup that is already being addressed. Meanwhile, to stop the loop deselect from Eclipse -> Project ->  Build Automatically. Remember to do Project -> Build Project after changes in the binding project

   *NOTE*: You do not need to add all projects to the workspace, just the binding project you want to work on.
1. In Eclipse Package Explorer: look for `app.bndrun` in the `org.openhab.demo.app` project.
   Double click to open `app.bndrun` (takes a few seconds)
1. Under Browse Repos search for your binding (`astro`) and add it to the "Run Requirements" list using drag&drop from the "Browse Repos" list:
    ![Bndtools](images/ide_setup_eclipse_bndtools.png)
1. Click "Resolve": a window with the list of resolved bundles will be shown.
    Click Finish and save the file.

    Now the IDE is ready to start openHAB with a minimum set of the openHAB core bindings, PaperUI and the selected binding
1. Start openHAB from the IDE clicking "Run OSGi" or "Debug OSGi".
   You can check openHAB is running going with your browser to: http://localhost:8080/paperui/
1. Check the chosen binding is active in PaperUI -> Configuration -> Bindings

## Develop a NEW binding with the IDE

To start developing a new binding follow these steps:

1. Close Eclipse
1. From the command line in `openhab2-addons/bundles` directory run:

    `$ ./create_openhab_binding_skeleton.sh  MyNewBinding <Author> <GitHubUsername>`

    to create a skeleton of a new binding `mynewbinding`.
    Accept with `Y` the skeleton configuration.
1. Edit file `openhab2-addons/bom/openhab-addons/pom.xml`
and add your new binding to the list (adapt the artifactid to your binding name!):
    ```
    <dependency>
        <groupId>org.openhab.addons.bundles</groupId>
        <artifactId>org.openhab.binding.mynewbinding</artifactId>
        <version>${project.version}</version>
    </dependency>
    ```
1. From the `openhab2-addons` directory run: ` mvn -DskipChecks -DskipTests clean install` to rebuild the list of bindings in the BOM (Bill Of Material) and make your new binding visible from the demo.app project
1. Now open Eclipse and follow from previous step 6. to import and run/debug your new binding in the Eclipse IDE

Now you can start developing your new binding.

In case the new binding has dependencies to other bundles/libraries see [Adding Dependencies](../buildsystem.html#adding-dependencies) for more information.

