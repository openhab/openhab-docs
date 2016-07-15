---
layout: documentation
---

{% include base.html %}

# Installing the designer

The Designer is an eclipse-based IDE allowing to edit text configuration file.

## Installation

* the latest version is available for download here: [Eclipse SmartHome Designer Downloads](https://github.com/eclipse/smarthome/blob/master/docs/documentation/community/downloads.md#designer-builds)
* get the designer for your plattform (Windows/OSX/Linux)
* as the SmartHome Designer is still in development, consider selecting the nightly snapshots build

![](images/smarthone-designer-05.png)

* navigate to the `openHAB` folder we created during the openHAB installation
* create a new folder called `extra`
* move the downloaded file (e.g. `eclipsesmarthome-incubation-0.9.0-SNAPSHOT-designer.zip`) inside the created folder

## First launch of the designer

At the first launch only, we need to tell to the designer where are the configuration file.

To do so:

* go to the `extra` folder we created just before;
* double-click on the `Eclipse SmartHome Designer` icon
* when the launch of the designer is completed, the following window appears:

![](images/smarthone-designer-10.png)

At this stage, the configuration window is empty as the designer does not know where are the configuration files.

To tell it where are these files:

* click on the small `folder` icon at the top right of the configuration window,
* a file browser pops up,
* navigate to the `openHAB` folder we have created when installing openHAB,
* double-click on the `conf` folder,

![](images/smarthone-designer-15.png)

* click on the button `Open`,
* the `Configuration` windows now lists the different configuration folders:

![](images/smarthone-designer-20.png)






