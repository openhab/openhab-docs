# HABPanel

HABPanel is a lightweight dashboard interface for openHAB.

It notably features an embedded dashboard designer allowing to build interfaces easily right on the target device.

## Configuration

Unlike Basic UI and other interfaces, HABPanel doesn't use pre-configured sitemaps.

It can however store all its configuration (called panel configurations, including sets of dashboards, custom widgets definitions, and other settings)
on the server as openHAB 2 service configuration variables.

You can access this server-side configuration in Paper UI, _Configuration > Services > UI > HABPanel_.
From there, you can also lock down the embedded editing features globally to prevent accidental changes by end users.
You can also specify the name of a known panel configuration to load immediately when starting to configure a brand new HABPanel instance;
otherwise, the local browser's storage will be used only until you save a new panel configuration as detailed below.

## Getting started

- When accessing HABPanel for the first time on a new browser or device, you should be presented with a rather empty screen - follow the tutorial and begin by clicking (or tapping) on the top-right corner icon.
- You're now in edit mode, a link (_"Add new dashboard"_) appeared, as well as an _"Advanced settings"_ link.
- If you previously used HABPanel and stored some panel configurations on the server, go to _"Advanced settings"_ and click on your previous configuration - it will be instantly brought back. Or, create your first dashboard: click/tap on the _"Add new dashboard"_ link and give it a name.
- Click/tap on the dashboard tile to enter the dashboard editor
- Add your first widget: select the _"Add Widget"_ menu and choose a widget type (let's say Dummy - a simple widget displaying an item's state)
- Move the widget by drag-and-drop and resize it with the white chevron - it appears when you click on the widget
- Hit on the three dots in the widget top-right corner to bring up its context menu and choose _"Edit..."_
- Adjust some settings (name, openHAB item etc.) and confirm your changes
- Save your configuration by clicking/tapping the _Save_ button
- Click/tap _Run_ to see your dashboard in action - use your browser's back button or the arrow to go back to the drawing board
- Once you're happy with your set of dashboards, go back to _"Advanced settings"_ then click/tap on _"Save the current configuration to a new panel configuration"_; this will store it on the openHAB 2 server as described above, and make it available for reuse.

## Screenshots

![](doc/images/habpanel_screenshot0.png)

![](doc/images/habpanel_screenshot1.png)

![](doc/images/habpanel_screenshot2.png)

![](doc/images/habpanel_screenshot3.png)

![](doc/images/habpanel_screenshot4.png)

![](doc/images/habpanel_screenshot5.png)

![](doc/images/habpanel_screenshot6.png)
