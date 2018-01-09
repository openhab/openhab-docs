---
id: max
label: MAX!
title: MAX! - Bindings
type: binding
description: "This is the binding for the [eQ-3 MAX! Home Solution](http://www.eq-3.de/)."
since: 2x
logo: images/addons/max.png
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# MAX! Binding

This is the binding for the [eQ-3 MAX! Home Solution](http://www.eq-3.de/).
This binding allows you to integrate, view and control the MAX! Thermostats in the openHAB environment

## Supported Things

This binding support 6 different things types

| Thing          | Type   | Description                                                                                                        |
|----------------|--------|--------------------------------------------------------------------------------------------------------------------|
| bridge         | Bridge | This is the MAX! Cube LAN gateway.                                                                                 |
| thermostat     | Thing  | This is for the MAX! Heating Thermostat. This is also used for the powerplug switch "Zwischenstecker-Schaltaktor". |
| thermostatplus | Thing  | This is for the MAX! Heating Thermostat+. This is the type that can hold the program by itself.                    |
| wallthermostat | Thing  | MAX! Wall Thermostat.                                                                                              |
| ecoswitch      | Thing  | MAX! Ecoswitch.                                                                                                    |
| shuttercontact | Thing  | MAX! Shuttercontact / Window Contact.                                                                              |


Generally one does not have to worry about the thing types as they are automatically defined.
If for any reason you need to manually define the Things and you are not exactly sure what type of thermostat you have, you can choose `thermostat` for both the thermostat and thermostat+, this will not affect their working.

## Discovery

The discovery process for the MAX! binding works in 2 steps.
When the binding is started or when manually triggered, the network is queried for the existence of a MAX! Cube LAN gateway.
When the Cube is found, it will become available in the discovery inbox. Periodically the network is queried again for a Cube.

Once the Cube is available in openHAB, all the devices connected to it are discovered and added to the discovery inbox.
No scan is needed to trigger this.

## Binding Configuration

In the openHAB2 version of this binding there are no binding wide settings.
All the configuration settings are now per MAX! Cube, hence in case you have multiple Cubes, they can run with alternative settings.

## Thing Configuration

All the things are identified by their serial number, hence this is mandatory.
The Cube (`bridge` thing) also requires the IP address to be defined.
All other configuration is optional.

Note that several configuration options are automatically populated.
Later versions of the binding may allow you to update this information.
These properties can be found in the `Device Settings` section of parameters.


## Channels

Depending on the thing it supports different Channels

| Channel Type ID | Item Type | Description                                                                                                                                                                                                                                               | Available on thing                                                    |
|-----------------|-----------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------|
| mode            | String    | This channel indicates the mode of a thermostat (AUTOMATIC/MANUAL/BOOST/VACATION).                                                                                                                                                                        | thermostat, thermostatplus, wallthermostat                            |
| battery_low     | Switch    | This channel indicates if the device battery is low (ON/OFF).                                                                                                                                                                                             | thermostat, thermostatplus, wallthermostat, ecoswitch, shuttercontact |
| set_temp        | Number    | This channel indicates the sets temperature (in °C) of a thermostat.                                                                                                                                                                                      | thermostat, thermostatplus, wallthermostat                            |
| actual_temp     | Number    | This channel indicates the measured temperature (in °C) of a thermostat (see below for more details).                                                                                                                                                     | thermostat, thermostatplus, wallthermostat                            |
| valve           | Number    | This channel indicates the valve opening in %. Note this is an advanced setting, normally not visible.                                                                                                                                                    | thermostat, thermostatplus, wallthermostat                            |
| locked          | Contact   | This channel indicates if the thermostat is locked for adjustments (OPEN/CLOSED). Note this is an advanced setting, normally not visible.                                                                                                                 | thermostat, thermostatplus, wallthermostat                            |
| contact_state   | Contact   | This channel indicates the contact state for a shutterswitch (OPEN/CLOSED).                                                                                                                                                                               | shuttercontact                                                        |
| free_mem        | Number    | This channel indicates the free available memory on the cube to hold send commands. Note this is an advanced setting, normally not visible.                                                                                                               | bridge                                                                |
| duty_cycle      | Number    | This channel indicates the duty cycle (due to regulatory compliance reasons the cube is allowed only to send for a limited time. Duty cycle indicates how much of the available time is consumed) Note this is an advanced setting, normally not visible. | bridge                                                                |

## Full Example

In most cases no Things need to be defined manually.
In case your Cube can't be discovered you need a `max:bridge` definition including the right IP address of the Cube.
Only in exceptional cases you would need to define the thermostats etc.

max.things:

```
Bridge max:bridge:KEQ0565026 [ ipAddress="192.168.3.9", serialNumber="KEQ0565026" ] {
    Thing max:thermostat:KEQ0565026:KEQ0565123 [ serialNumber="KEQ0565123" ]
}
```

max.items:

```
Group gMAX 			"MAX Heating" 	<temperature>	[ "home-group" ]

Switch maxBattery "Battery Low" (gMAX) {channel="max:thermostat:KEQ0565026:KEQ0648949:battery_low"}
String maxMode    "Thermostat Mode Setting" (gMAX) {channel="max:thermostat:KEQ0565026:KEQ0648949:mode"}
Number maxActual  "Actual measured room temperature  [%.1f °C]" (gMAX) {channel="max:thermostat:KEQ0565026:KEQ0648949:actual_temp"}
Number maxSetTemp "Thermostat temperature setpoint [%.1f °C]" (gMAX) {channel="max:thermostat:KEQ0565026:KEQ0648949:set_temp"}
```

demo.sitemap:

```
sitemap demo label="Main Menu"
{
	Frame label="MAX Heating System" {
			Switch  item=maxMode  icon="climate" mappings=[AUTOMATIC=AUTOMATIC, MANUAL=MANUAL, BOOST=BOOST]
			Setpoint item=maxSetTemp minValue=4.5 maxValue=32 step=0.5 icon="temperature"
			Text item=maxActual  icon="temperature"
			Switch  item=maxBattery
		}

}
```

## Actual Temperature Update

Please be aware that the actual temperature measure for thermostats is only updated after the valve moved position or the thermostats mode has changed.
Hence the temperature you see may be hours old.
In that case you can update the temperature by changing the mode, wait approximately 2 minutes and change the mode back.
There is an experimental mode that does this automatically.
This can be enabled by showing the "advanced settings" (e.g. in HABmin UI).
Then the "Actual Temperature Refresh Rate" can be set.
Minimum refresh rate once/10 minutes, recommended 60min to avoid excessive battery drain.


## New Device Inclusion

When clicking the discovery button for MAX! devices manually in the UI, you  will start New Device Inclusion mode for 60seconds.
During this time, holding the _boost_ button on your device will link it to the Cube.

## Device configuration

In the _Configuration Parameters_ section of the device Things you can update some of the device configuration parameters.
Currently the following parameters can be updated:

*   _name_ Name of the thermostat stored in the Cube (also used by the eQ-3 software).

_Cube device configurable parameters_

*   _ntpServer1_ The hostname for NTP Server 1 used by the Cube to get the time
*   _ntpServer2_ The hostname for NTP Server 2 used by the Cube to get the time

## Action Buttons (visible in HABmin)

In the HABmin thing configuration screen, several action buttons are available to trigger special actions on the Cube

*   _Reset Cube Configuration_ resets the MAX! Cube room and device information. Devices will need to be included again! To use this button you need to enable 'Advanced settings'

*   _Restart Cube_ triggers the reboot of a Cube. This can be used if a Cube became unresponsive to commands or no connection can be made. (e.g. if you tried to connect to the Cube with multiple applications at the same time)

On the MAX! devices you can trigger the following action

*   _Delete Device from Cube_ deletes the device from the MAX! Cube. Device will need to be included again! To use this button you need to enable 'Advanced settings'

Note: In Paper UI there are no action buttons.
You can trigger these actions changing from 'No Action' in the dropdown to the action value.
