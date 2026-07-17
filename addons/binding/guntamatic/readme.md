---
id: guntamatic
label: Guntamatic
title: Guntamatic - Bindings
type: binding
description: '"The Guntamatic Binding can be used to monitor and control [Guntamatic
  Heating Systems](https://www.guntamatic.com/en/)."'
logo: images/addons/guntamatic.png
install: manual
source: https://github.com/openhab/openhab-addons/blob/main/bundles/org.openhab.binding.guntamatic/README.md
meta:
  - property: og:title
    content: "Guntamatic - Bindings"
  - property: og:description
    content: '"The Guntamatic Binding can be used to monitor and control Guntamatic
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

# Guntamatic Binding

<AddonLogo />

The Guntamatic Binding can be used to monitor and control [Guntamatic Heating Systems](https://www.guntamatic.com/en/).

## Supported Things

The Guntamatic Binding was developed and tested using Guntamatic Biostar 15kW Pellets Heating System, running Firmware 3.3d.
It should work for all other Guntamatic Heating Systems as well, that support the same web interface (Pellets, WoodChips, EnergyGrain as well as Log Heating Systems).

## Things

Guntamatic Heating Systems supported as Thing Types:

| Name      | Thing Type ID | Heating System Type  | Binding Development Status                       |
| --------- | ------------- | -------------------- | ------------------------------------------------ |
| Biostar   | `biostar`     | Pellets              | tested via 15kW, firmware 3.3d, German & English |
| Biosmart  | `biosmart`    | Logs                 | tested via 22kW, firmware 3.2f, German           |
| Powerchip | `powerchip`   | WoodChips            | tested via 100kW, firmware 3.2d, French          |
| Powercorn | `powercorn`   | EnergyGrain          | untested (no user feedback)                      |
| Biocom    | `biocom`      | Pellets              | untested (no user feedback)                      |
| Pro       | `pro`         | Pellets or WoodChips | untested (no user feedback)                      |
| Therm     | `therm`       | Pellets              | untested (no user feedback)                      |
| Generic   | `generic`     | -                    | use, if none from above                          |

### Thing Configuration

| Parameter         | Description                                                                                                                                                                                                     | Default        |
| ----------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------- |
| `hostname`        | Hostname or IP address of the Guntamatic Heating System                                                                                                                                                         |                |
| `key`             | Optional, but required to read protected parameters and to control the Guntamatic Heating System.<br/>The key needs to be requested from Guntamatic support, e.g. via <https://www.guntamatic.com/en/contact/>. |                |
| `refreshInterval` | Interval the Guntamatic Heating System is polled in seconds                                                                                                                                                     | `60`           |
| `encoding`        | Code page used by the Guntamatic Heating System                                                                                                                                                                 | `windows-1252` |

### Properties

| Property          | Description                                    | Supported                                         |
| ----------------- | ---------------------------------------------- | ------------------------------------------------- |
| `extraWwHeat`     | Parameter used by `extra-ww-heat` channels     | all                                               |
| `boilerApproval`  | Parameter used by `boiler-approval` channel    | Biostar, Powerchip, Powercorn, Biocom, Pro, Therm |
| `heatCircProgram` | Parameter used by `heat-circ-program` channels | all                                               |
| `program`         | Parameter used by `program` channel            | all                                               |
| `wwHeat`          | Parameter used by `ww-heat` channels           | all                                               |

## Channels

### Control Channels

The Guntamatic Heating System can be controlled using the following channels:

| Channel               | Description                                                                     | Type     | Unit | Security Access Level | ReadOnly | Advanced |
| --------------------- | ------------------------------------------------------------------------------- | -------- | :--: | :-------------------: | :------: | :------: |
| `boiler-approval`     | Set Boiler Approval (`AUTO`, `OFF`, `ON`)<sup id="a1">[1](#f1)</sup>)           | `String` |      |        🔐 W1         |   R/W    |   true   |
| `program`             | Set Program (`OFF`, `NORMAL`, `WARMWATER`, `MANUAL`<sup id="a2">[2](#f2)</sup>) | `String` |      |        🔐 W1         |   R/W    |  false   |
| `heat-circ-program-0` | Set Heat Circuit 0 Program (`OFF`, `NORMAL`, `HEAT`, `LOWER`)                   | `String` |      |        🔐 W1         |   R/W    |   true   |
| `heat-circ-program-1` | Set Heat Circuit 1 Program (`OFF`, `NORMAL`, `HEAT`, `LOWER`)                   | `String` |      |        🔐 W1         |   R/W    |   true   |
| `heat-circ-program-2` | Set Heat Circuit 2 Program (`OFF`, `NORMAL`, `HEAT`, `LOWER`)                   | `String` |      |        🔐 W1         |   R/W    |   true   |
| `heat-circ-program-3` | Set Heat Circuit 3 Program (`OFF`, `NORMAL`, `HEAT`, `LOWER`)                   | `String` |      |        🔐 W1         |   R/W    |   true   |
| `heat-circ-program-4` | Set Heat Circuit 4 Program (`OFF`, `NORMAL`, `HEAT`, `LOWER`)                   | `String` |      |        🔐 W1         |   R/W    |   true   |
| `heat-circ-program-5` | Set Heat Circuit 5 Program (`OFF`, `NORMAL`, `HEAT`, `LOWER`)                   | `String` |      |        🔐 W1         |   R/W    |   true   |
| `heat-circ-program-6` | Set Heat Circuit 6 Program (`OFF`, `NORMAL`, `HEAT`, `LOWER`)                   | `String` |      |        🔐 W1         |   R/W    |   true   |
| `heat-circ-program-7` | Set Heat Circuit 7 Program (`OFF`, `NORMAL`, `HEAT`, `LOWER`)                   | `String` |      |        🔐 W1         |   R/W    |   true   |
| `heat-circ-program-8` | Set Heat Circuit 8 Program (`OFF`, `NORMAL`, `HEAT`, `LOWER`)                   | `String` |      |        🔐 W1         |   R/W    |   true   |
| `ww-heat-0`           | Trigger Warm Water Circuit 0 (`RECHARGE`)                                       | `String` |      |        🔐 W1         |   R/W    |   true   |
| `ww-heat-1`           | Trigger Warm Water Circuit 1 (`RECHARGE`)                                       | `String` |      |        🔐 W1         |   R/W    |   true   |
| `ww-heat-2`           | Trigger Warm Water Circuit 2 (`RECHARGE`)                                       | `String` |      |        🔐 W1         |   R/W    |   true   |
| `extra-ww-heat-0`     | Trigger Extra Warm Water Circuit 0 (`RECHARGE`)                                 | `String` |      |        🔐 W1         |   R/W    |   true   |
| `extra-ww-heat-1`     | Trigger Extra Warm Water Circuit 1 (`RECHARGE`)                                 | `String` |      |        🔐 W1         |   R/W    |   true   |
| `extra-ww-heat-2`     | Trigger Extra Warm Water Circuit 2 (`RECHARGE`)                                 | `String` |      |        🔐 W1         |   R/W    |   true   |

- <b id="f1">1)</b> ... Channel is supported by Biostar, Powerchip, Powercorn, Biocom, Pro as well as Therm only [↩](#a1)
- <b id="f2">2)</b> ... `MANUAL` is supported by Biostar, Powerchip, Powercorn, Biocom, Pro as well as Therm only [↩](#a2)

#### Response of Control Channels

- `{"ack":"confirmation message"}` ... in case of success
- `{"err":"error message"}`        ... in case of error

The reaction of the Guntamatic Heating System can be monitored via the corresponding data channel. E.g. `program-hc-1` if you triggered `heat-circ-program-1`. The data channel gets updated with the next cyclic update (according to the `refreshInterval` configuration).

### Status Channels

The Binding dynamically generates Channels, derived from the data provided from the actual Guntamatic Heating System.

Example list of Channels using a Guntamatic Biostar 15kW Pellets Heating System running firmware 3.2d and Guntamatic System Language configured to English:

| Channel                    | Description            | Type                   | Unit | Security Access Level | ReadOnly | Advanced |
|----------------------------|------------------------|------------------------|-:--:-|-:-------------------:-|-:------:-|-:------:-|
| `000-running`              | Running                | `String`               |      | 🔓 W0                 | R/O      | false    |
| `001-outside-temp`         | Outside Temp.          | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `002-blr-target-temp`      | Blr.Target Temp        | `Number:Temperature`   | `°C` | 🔐 W1                 | R/O      | false    |
| `003-boiler-temperature`   | Boiler Temperature     | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `004-flue-gas-utilisation` | Flue gas utilisation   | `Number:Dimensionless` | `%`  | 🔐 W1                 | R/O      | false    |
| `005-output`               | Output                 | `Number:Dimensionless` | `%`  | 🔓 W0                 | R/O      | false    |
| `006-return-temp`          | Return temp            | `Number:Temperature`   | `°C` | 🔐 W1                 | R/O      | false    |
| `007-co2-target`           | CO2 Target             | `Number:Dimensionless` | `%`  | 🔐 W1                 | R/O      | false    |
| `008-co2-content`          | CO2 Content            | `Number:Dimensionless` | `%`  | 🔓 W0                 | R/O      | false    |
| `009-return-temp-target`   | Return temp target     | `Number:Temperature`   | `°C` | 🔐 W1                 | R/O      | false    |
| `010-status-code`          | Status code            | `Number`               |      | 🔐 W1                 | R/O      | false    |
| `011-efficiency`           | Efficiency             | `Number:Dimensionless` | `%`  | 🔐 W1                 | R/O      | false    |
| `012-output`               | Output                 | `Number:Dimensionless` | `%`  | 🔐 W1                 | R/O      | false    |
| `013-extractor-system`     | Extractor System       | `Number:Dimensionless` | `%`  | 🔓 W0                 | R/O      | false    |
| `014-feed-turbine`         | Feed Turbine           | `String`               |      | 🔐 W1                 | R/O      | false    |
| `015-discharge-motor`      | Discharge motor        | `Number:Dimensionless` | `%`  | 🔓 W0                 | R/O      | false    |
| `016-g1-target`            | G1 Target              | `Number:Dimensionless` | `%`  | 🔓 W0                 | R/O      | false    |
| `017-buffer-top`           | Buffer Top             | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `018-buffer-mid`           | Buffer Mid             | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `019-buffer-btm`           | Buffer Btm             | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `020-pump-hp0`             | Pump HP0               | `Switch`               |      | 🔓 W0                 | R/O      | false    |
| `021-dhw-0`                | DHW 0                  | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `022-b-dhw-0`              | B DHW 0                | `Switch`               |      | 🔓 W0                 | R/O      | false    |
| `023-dhw-1`                | DHW 1                  | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `024-b-dhw-1`              | B DHW 1                | `Switch`               |      | 🔓 W0                 | R/O      | false    |
| `025-dhw-2`                | DHW 2                  | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `026-b-dhw-2`              | B DHW 2                | `Switch`               |      | 🔓 W0                 | R/O      | false    |
| `027-room-temp-hc-0`       | Room Temp:HC 0         | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `028-heat-circ-0`          | Heat Circ. 0           | `Switch`               |      | 🔓 W0                 | R/O      | false    |
| `029-room-temp-hc-1`       | Room Temp:HC 1         | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `030-flow-target-1`        | Flow Target 1          | `Number:Temperature`   | `°C` | 🔐 W1                 | R/O      | false    |
| `031-flow-is-1`            | Flow is 1              | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `032-mixer-1`              | Mixer 1                | `String`               |      | 🔐 W1                 | R/O      | false    |
| `033-heat-circ-1`          | Heat Circ. 1           | `Switch`               |      | 🔐 W1                 | R/O      | false    |
| `034-room-temp-hc-2`       | Room Temp:HC 2         | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `035-flow-target-2`        | Flow Target 2          | `Number:Temperature`   | `°C` | 🔐 W1                 | R/O      | false    |
| `036-flow-is-2`            | Flow is 2              | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `037-mixer-2`              | Mixer 2                | `String`               |      | 🔐 W1                 | R/O      | false    |
| `038-heat-circ-2`          | Heat Circ. 2           | `Switch`               |      | 🔓 W0                 | R/O      | false    |
| `039-room-temp-hc-3`       | Room Temp:HC 3         | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `040-heat-circ-3`          | Heat Circ. 3           | `Switch`               |      | 🔓 W0                 | R/O      | false    |
| `041-room-temp-hc-4`       | Room Temp:HC 4         | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `042-flow-target-4`        | Flow Target 4          | `Number:Temperature`   | `°C` | 🔐 W1                 | R/O      | false    |
| `043-flow-is-4`            | Flow is 4              | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `044-mixer-4`              | Mixer 4                | `String`               |      | 🔐 W1                 | R/O      | false    |
| `045-heat-circ-4`          | Heat Circ. 4           | `Switch`               |      | 🔓 W0                 | R/O      | false    |
| `046-room-temp-hc-5`       | Room Temp:HC 5         | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `047-flow-target-5`        | Flow Target 5          | `Number:Temperature`   | `°C` | 🔐 W1                 | R/O      | false    |
| `048-flow-is-5`            | Flow is 5              | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `049-mixer-5`              | Mixer 5                | `String`               |      | 🔐 W1                 | R/O      | false    |
| `050-heat-circ-5`          | Heat Circ. 5           | `Switch`               |      | 🔓 W0                 | R/O      | false    |
| `051-room-temp-hc-6`       | Room Temp:HC 6         | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `052-heat-circ-6`          | Heat Circ. 6           | `Switch`               |      | 🔓 W0                 | R/O      | false    |
| `053-room-temp-hc-7`       | Room Temp:HC 7         | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `054-flow-target-7`        | Flow Target 7          | `Number:Temperature`   | `°C` | 🔐 W1                 | R/O      | false    |
| `055-flow-is-7`            | Flow is 7              | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `056-mixer-7`              | Mixer 7                | `String`               |      | 🔐 W1                 | R/O      | false    |
| `057-heat-circ-7`          | Heat Circ. 7           | `Switch`               |      | 🔓 W0                 | R/O      | false    |
| `058-room-temp-hc-8`       | Room Temp:HC 8         | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `059-flow-target-8`        | Flow Target 8          | `Number:Temperature`   | `°C` | 🔐 W1                 | R/O      | false    |
| `060-flow-is-8`            | Flow is 8              | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `061-mixer-8`              | Mixer 8                | `String`               |      | 🔐 W1                 | R/O      | false    |
| `062-heat-circ-8`          | Heat Circ. 8           | `Switch`               |      | 🔓 W0                 | R/O      | false    |
| `065-fuel-level`           | Fuel Level             | `String`               |      | 🔐 W1                 | R/O      | false    |
| `066-stb`                  | STB                    | `String`               |      | 🔐 W1                 | R/O      | false    |
| `067-tks`                  | TKS                    | `String`               |      | 🔐 W1                 | R/O      | false    |
| `068-boiler-approval`      | Boiler approval        | `Switch`               |      | 🔐 W1                 | R/O      | false    |
| `069-programme`            | Programme              | `String`               |      | 🔓 W0                 | R/O      | false    |
| `070-program-hc0`          | Program HC0            | `String`               |      | 🔓 W0                 | R/O      | false    |
| `071-program-hc1`          | Program HC1            | `String`               |      | 🔓 W0                 | R/O      | false    |
| `072-program-hc2`          | Program HC2            | `String`               |      | 🔓 W0                 | R/O      | false    |
| `073-program-hc3`          | Program HC3            | `String`               |      | 🔓 W0                 | R/O      | false    |
| `074-program-hc4`          | Program HC4            | `String`               |      | 🔓 W0                 | R/O      | false    |
| `075-program-hc5`          | Program HC5            | `String`               |      | 🔓 W0                 | R/O      | false    |
| `076-program-hc6`          | Program HC6            | `String`               |      | 🔓 W0                 | R/O      | false    |
| `077-program-hc7`          | Program HC7            | `String`               |      | 🔓 W0                 | R/O      | false    |
| `078-program-hc8`          | Program HC8            | `String`               |      | 🔓 W0                 | R/O      | false    |
| `079-interruption-0`       | Interruption 0         | `String`               |      | 🔓 W0                 | R/O      | false    |
| `080-interruption-1`       | Interruption 1         | `String`               |      | 🔓 W0                 | R/O      | false    |
| `081-serial`               | Serial                 | `Number`               |      | 🔓 W0                 | R/O      | false    |
| `082-version`              | Version                | `String`               |      | 🔓 W0                 | R/O      | false    |
| `083-running-time`         | Running Time           | `Number:Time`          | `h`  | 🔓 W0                 | R/O      | false    |
| `084-service-hrs`          | Service Hrs            | `Number:Time`          | `d`  | 🔓 W0                 | R/O      | false    |
| `085-empty-ash-in`         | Empty ash in           | `Number:Time`          | `h`  | 🔓 W0                 | R/O      | false    |
| `086-flow-is-0`            | Flow is 0              | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `087-flow-is-3`            | Flow is 3              | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `088-flow-is-6`            | Flow is 6              | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `089-fuel-counter`         | Fuel counter           | `Number:Volume`        | `m³` | 🔐 W1                 | R/O      | false    |
| `090-buffer-load`          | Buffer load.           | `Number:Dimensionless` | `%`  | 🔓 W0                 | R/O      | false    |
| `091-buffer-top-0`         | Buffer Top 0           | `Number:Temperature`   | `°C` | 🔐 W1                 | R/O      | false    |
| `092-buffer-btm-0`         | Buffer Btm 0           | `Number:Temperature`   | `°C` | 🔐 W1                 | R/O      | false    |
| `093-buffer-top-1`         | Buffer Top 1           | `Number:Temperature`   | `°C` | 🔐 W1                 | R/O      | false    |
| `094-buffer-btm-1`         | Buffer Btm 1           | `Number:Temperature`   | `°C` | 🔐 W1                 | R/O      | false    |
| `095-buffer-top-2`         | Buffer Top 2           | `Number:Temperature`   | `°C` | 🔐 W1                 | R/O      | false    |
| `096-buffer-btm-2`         | Buffer Btm 2           | `Number:Temperature`   | `°C` | 🔐 W1                 | R/O      | false    |
| `097-b-extra-ww-0`         | B extra-WW. 0          | `Switch`               |      | 🔐 W1                 | R/O      | false    |
| `098-b-extra-ww-1`         | B extra-WW. 1          | `Switch`               |      | 🔐 W1                 | R/O      | false    |
| `099-b-extra-ww-2`         | B extra-WW. 2          | `Switch`               |      | 🔐 W1                 | R/O      | false    |
| `100-auxiliary-pump-0`     | Auxiliary pump 0       | `Switch`               |      | 🔐 W1                 | R/O      | false    |
| `101-auxiliary-pump-1`     | Auxiliary pump 1       | `Switch`               |      | 🔐 W1                 | R/O      | false    |
| `102-auxiliary-pump-2`     | Auxiliary pump 2       | `Switch`               |      | 🔐 W1                 | R/O      | false    |
| `104-boilers-condition-no` | Boiler's condition no. | `String`               |      | 🔐 W1                 | R/O      | false    |
| `108-buffer-t5`            | Buffer T5              | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `109-buffer-t6`            | Buffer T6              | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `110-buffer-t7`            | Buffer T7              | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `111-extra-ww-0`           | Extra-WW. 0            | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `112-extra-ww-1`           | Extra-WW. 1            | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `113-extra-ww-2`           | Extra-WW. 2            | `Number:Temperature`   | `°C` | 🔓 W0                 | R/O      | false    |
| `114-grate`                | Grate                  | `Number:Dimensionless` | `%`  | 🔓 W0                 | R/O      | false    |

#### Security Access Levels

- 🔓 W0 ... Open
- 🔐 W1 ... End Customer Key
- 🔒 W2 ... Service Partner

## Full Example

### Thing File

```java
Thing   guntamatic:biostar:mybiostar   "Guntamatic Biostar"    [ hostname="192.168.1.100", key="0123456789ABCDEF0123456789ABCDEF0123", refreshInterval=60, encoding="windows-1252" ]
```

### Item File

```java
String               Biostar_ControlProgram          "Control Program"                    { channel="guntamatic:biostar:mybiostar:control#program" }

String               Biostar_Running                 "Running"                            { channel="guntamatic:biostar:mybiostar:status#000-running" }
Number:Temperature   Biostar_OutsideTemp             "Outside Temp."                      { channel="guntamatic:biostar:mybiostar:status#001-outside-temp" }
Number:Temperature   Biostar_BlrTargetTemp           "Blr.Target Temp"                    { channel="guntamatic:biostar:mybiostar:status#002-blr-target-temp" }
Number:Temperature   Biostar_BoilerTemperature       "Boiler Temperature"                 { channel="guntamatic:biostar:mybiostar:status#003-boiler-temperature" }
Number:Dimensionless Biostar_FlueGasUtilisation      "Flue gas utilisation"               { channel="guntamatic:biostar:mybiostar:status#004-flue-gas-utilisation" }
Number:Dimensionless Biostar_Output                  "Output"                             { channel="guntamatic:biostar:mybiostar:status#005-output" }
Number:Temperature   Biostar_ReturnTemp              "Return temp"                        { channel="guntamatic:biostar:mybiostar:status#006-return-temp" }
Number:Dimensionless Biostar_Co2Target               "CO2 Target"                         { channel="guntamatic:biostar:mybiostar:status#007-co2-target" }
Number:Dimensionless Biostar_Co2Content              "CO2 Content"                        { channel="guntamatic:biostar:mybiostar:status#008-co2-content" }
Number:Temperature   Biostar_ReturnTempTarget        "Return temp target"                 { channel="guntamatic:biostar:mybiostar:status#009-return-temp-target" }
Number               Biostar_StatusCode              "Status code"                        { channel="guntamatic:biostar:mybiostar:status#010-status-code" }
Number:Dimensionless Biostar_Efficiency              "Efficiency"                         { channel="guntamatic:biostar:mybiostar:status#011-efficiency" }
Number:Dimensionless Biostar_Output2                 "Output"                             { channel="guntamatic:biostar:mybiostar:status#012-output" }
Number:Dimensionless Biostar_ExtractorSystem         "Extractor System"                   { channel="guntamatic:biostar:mybiostar:status#013-extractor-system" }
String               Biostar_FeedTurbine             "Feed Turbine"                       { channel="guntamatic:biostar:mybiostar:status#014-feed-turbine" }
Number:Dimensionless Biostar_DischargeMotor          "Discharge motor"                    { channel="guntamatic:biostar:mybiostar:status#015-discharge-motor" }
Number:Dimensionless Biostar_G1Target                "G1 Target"                          { channel="guntamatic:biostar:mybiostar:status#016-g1-target" }
Number:Temperature   Biostar_BufferTop               "Buffer Top"                         { channel="guntamatic:biostar:mybiostar:status#017-buffer-top" }
Number:Temperature   Biostar_BufferMid               "Buffer Mid"                         { channel="guntamatic:biostar:mybiostar:status#018-buffer-mid" }
Number:Temperature   Biostar_BufferBtm               "Buffer Btm"                         { channel="guntamatic:biostar:mybiostar:status#019-buffer-btm" }
Switch               Biostar_PumpHp0                 "Pump HP0"                           { channel="guntamatic:biostar:mybiostar:status#020-pump-hp0" }
Number:Temperature   Biostar_Dhw0                    "DHW 0"                              { channel="guntamatic:biostar:mybiostar:status#021-dhw-0" }
Switch               Biostar_BDhw0                   "B DHW 0"                            { channel="guntamatic:biostar:mybiostar:status#022-b-dhw-0" }
Number:Temperature   Biostar_Dhw1                    "DHW 1"                              { channel="guntamatic:biostar:mybiostar:status#023-dhw-1" }
Switch               Biostar_BDhw1                   "B DHW 1"                            { channel="guntamatic:biostar:mybiostar:status#024-b-dhw-1" }
Number:Temperature   Biostar_Dhw2                    "DHW 2"                              { channel="guntamatic:biostar:mybiostar:status#025-dhw-2" }
Switch               Biostar_BDhw2                   "B DHW 2"                            { channel="guntamatic:biostar:mybiostar:status#026-b-dhw-2" }
Number:Temperature   Biostar_RoomTempHc0             "Room Temp:HC 0"                     { channel="guntamatic:biostar:mybiostar:status#027-room-temp-hc-0" }
Switch               Biostar_HeatCirc0               "Heat Circ. 0"                       { channel="guntamatic:biostar:mybiostar:status#028-heat-circ-0" }
Number:Temperature   Biostar_RoomTempHc1             "Room Temp:HC 1"                     { channel="guntamatic:biostar:mybiostar:status#029-room-temp-hc-1" }
Number:Temperature   Biostar_FlowTarget1             "Flow Target 1"                      { channel="guntamatic:biostar:mybiostar:status#030-flow-target-1" }
Number:Temperature   Biostar_FlowIs1                 "Flow is 1"                          { channel="guntamatic:biostar:mybiostar:status#031-flow-is-1" }
String               Biostar_Mixer1                  "Mixer 1"                            { channel="guntamatic:biostar:mybiostar:status#032-mixer-1" }
Switch               Biostar_HeatCirc1               "Heat Circ. 1"                       { channel="guntamatic:biostar:mybiostar:status#033-heat-circ-1" }
Number:Temperature   Biostar_RoomTempHc2             "Room Temp:HC 2"                     { channel="guntamatic:biostar:mybiostar:status#034-room-temp-hc-2" }
Number:Temperature   Biostar_FlowTarget2             "Flow Target 2"                      { channel="guntamatic:biostar:mybiostar:status#035-flow-target-2" }
Number:Temperature   Biostar_FlowIs2                 "Flow is 2"                          { channel="guntamatic:biostar:mybiostar:status#036-flow-is-2" }
String               Biostar_Mixer2                  "Mixer 2"                            { channel="guntamatic:biostar:mybiostar:status#037-mixer-2" }
Switch               Biostar_HeatCirc2               "Heat Circ. 2"                       { channel="guntamatic:biostar:mybiostar:status#038-heat-circ-2" }
Number:Temperature   Biostar_RoomTempHc3             "Room Temp:HC 3"                     { channel="guntamatic:biostar:mybiostar:status#039-room-temp-hc-3" }
Switch               Biostar_HeatCirc3               "Heat Circ. 3"                       { channel="guntamatic:biostar:mybiostar:status#040-heat-circ-3" }
Number:Temperature   Biostar_RoomTempHc4             "Room Temp:HC 4"                     { channel="guntamatic:biostar:mybiostar:status#041-room-temp-hc-4" }
Number:Temperature   Biostar_FlowTarget4             "Flow Target 4"                      { channel="guntamatic:biostar:mybiostar:status#042-flow-target-4" }
Number:Temperature   Biostar_FlowIs4                 "Flow is 4"                          { channel="guntamatic:biostar:mybiostar:status#043-flow-is-4" }
String               Biostar_Mixer4                  "Mixer 4"                            { channel="guntamatic:biostar:mybiostar:status#044-mixer-4" }
Switch               Biostar_HeatCirc4               "Heat Circ. 4"                       { channel="guntamatic:biostar:mybiostar:status#045-heat-circ-4" }
Number:Temperature   Biostar_RoomTempHc5             "Room Temp:HC 5"                     { channel="guntamatic:biostar:mybiostar:status#046-room-temp-hc-5" }
Number:Temperature   Biostar_FlowTarget5             "Flow Target 5"                      { channel="guntamatic:biostar:mybiostar:status#047-flow-target-5" }
Number:Temperature   Biostar_FlowIs5                 "Flow is 5"                          { channel="guntamatic:biostar:mybiostar:status#048-flow-is-5" }
String               Biostar_Mixer5                  "Mixer 5"                            { channel="guntamatic:biostar:mybiostar:status#049-mixer-5" }
Switch               Biostar_HeatCirc5               "Heat Circ. 5"                       { channel="guntamatic:biostar:mybiostar:status#050-heat-circ-5" }
Number:Temperature   Biostar_RoomTempHc6             "Room Temp:HC 6"                     { channel="guntamatic:biostar:mybiostar:status#051-room-temp-hc-6" }
Switch               Biostar_HeatCirc6               "Heat Circ. 6"                       { channel="guntamatic:biostar:mybiostar:status#052-heat-circ-6" }
Number:Temperature   Biostar_RoomTempHc7             "Room Temp:HC 7"                     { channel="guntamatic:biostar:mybiostar:status#053-room-temp-hc-7" }
Number:Temperature   Biostar_FlowTarget7             "Flow Target 7"                      { channel="guntamatic:biostar:mybiostar:status#054-flow-target-7" }
Number:Temperature   Biostar_FlowIs7                 "Flow is 7"                          { channel="guntamatic:biostar:mybiostar:status#055-flow-is-7" }
String               Biostar_Mixer7                  "Mixer 7"                            { channel="guntamatic:biostar:mybiostar:status#056-mixer-7" }
Switch               Biostar_HeatCirc7               "Heat Circ. 7"                       { channel="guntamatic:biostar:mybiostar:status#057-heat-circ-7" }
Number:Temperature   Biostar_RoomTempHc8             "Room Temp:HC 8"                     { channel="guntamatic:biostar:mybiostar:status#058-room-temp-hc-8" }
Number:Temperature   Biostar_FlowTarget8             "Flow Target 8"                      { channel="guntamatic:biostar:mybiostar:status#059-flow-target-8" }
Number:Temperature   Biostar_FlowIs8                 "Flow is 8"                          { channel="guntamatic:biostar:mybiostar:status#060-flow-is-8" }
String               Biostar_Mixer8                  "Mixer 8"                            { channel="guntamatic:biostar:mybiostar:status#061-mixer-8" }
Switch               Biostar_HeatCirc8               "Heat Circ. 8"                       { channel="guntamatic:biostar:mybiostar:status#062-heat-circ-8" }
String               Biostar_FuelLevel               "Fuel Level"                         { channel="guntamatic:biostar:mybiostar:status#065-fuel-level" }
String               Biostar_Stb                     "STB"                                { channel="guntamatic:biostar:mybiostar:status#066-stb" }
String               Biostar_Tks                     "TKS"                                { channel="guntamatic:biostar:mybiostar:status#067-tks" }
Switch               Biostar_BoilerApproval          "Boiler approval"                    { channel="guntamatic:biostar:mybiostar:status#068-boiler-approval" }
String               Biostar_Programme               "Programme"                          { channel="guntamatic:biostar:mybiostar:status#069-programme" }
String               Biostar_ProgramHc0              "Program HC0"                        { channel="guntamatic:biostar:mybiostar:status#070-program-hc0" }
String               Biostar_ProgramHc1              "Program HC1"                        { channel="guntamatic:biostar:mybiostar:status#071-program-hc1" }
String               Biostar_ProgramHc2              "Program HC2"                        { channel="guntamatic:biostar:mybiostar:status#072-program-hc2" }
String               Biostar_ProgramHc3              "Program HC3"                        { channel="guntamatic:biostar:mybiostar:status#073-program-hc3" }
String               Biostar_ProgramHc4              "Program HC4"                        { channel="guntamatic:biostar:mybiostar:status#074-program-hc4" }
String               Biostar_ProgramHc5              "Program HC5"                        { channel="guntamatic:biostar:mybiostar:status#075-program-hc5" }
String               Biostar_ProgramHc6              "Program HC6"                        { channel="guntamatic:biostar:mybiostar:status#076-program-hc6" }
String               Biostar_ProgramHc7              "Program HC7"                        { channel="guntamatic:biostar:mybiostar:status#077-program-hc7" }
String               Biostar_ProgramHc8              "Program HC8"                        { channel="guntamatic:biostar:mybiostar:status#078-program-hc8" }
String               Biostar_Interruption0           "Interruption 0"                     { channel="guntamatic:biostar:mybiostar:status#079-interruption-0" }
String               Biostar_Interruption1           "Interruption 1"                     { channel="guntamatic:biostar:mybiostar:status#080-interruption-1" }
Number               Biostar_Serial                  "Serial"                             { channel="guntamatic:biostar:mybiostar:status#081-serial" }
String               Biostar_Version                 "Version"                            { channel="guntamatic:biostar:mybiostar:status#082-version" }
Number:Time          Biostar_RunningTime             "Running Time"                       { channel="guntamatic:biostar:mybiostar:status#083-running-time" }
Number:Time          Biostar_ServiceHrs              "Service Hrs"                        { channel="guntamatic:biostar:mybiostar:status#084-service-hrs" }
Number:Time          Biostar_EmptyAshIn              "Empty ash in"                       { channel="guntamatic:biostar:mybiostar:status#085-empty-ash-in" }
Number:Temperature   Biostar_FlowIs0                 "Flow is 0"                          { channel="guntamatic:biostar:mybiostar:status#086-flow-is-0" }
Number:Temperature   Biostar_FlowIs3                 "Flow is 3"                          { channel="guntamatic:biostar:mybiostar:status#087-flow-is-3" }
Number:Temperature   Biostar_FlowIs6                 "Flow is 6"                          { channel="guntamatic:biostar:mybiostar:status#088-flow-is-6" }
Number:Volume        Biostar_FuelCounter             "Fuel counter"                       { channel="guntamatic:biostar:mybiostar:status#089-fuel-counter" }
Number:Dimensionless Biostar_BufferLoad              "Buffer load."                       { channel="guntamatic:biostar:mybiostar:status#090-buffer-load" }
Number:Temperature   Biostar_BufferTop0              "Buffer Top 0"                       { channel="guntamatic:biostar:mybiostar:status#091-buffer-top-0" }
Number:Temperature   Biostar_BufferBtm0              "Buffer Btm 0"                       { channel="guntamatic:biostar:mybiostar:status#092-buffer-btm-0" }
Number:Temperature   Biostar_BufferTop1              "Buffer Top 1"                       { channel="guntamatic:biostar:mybiostar:status#093-buffer-top-1" }
Number:Temperature   Biostar_BufferBtm1              "Buffer Btm 1"                       { channel="guntamatic:biostar:mybiostar:status#094-buffer-btm-1" }
Number:Temperature   Biostar_BufferTop2              "Buffer Top 2"                       { channel="guntamatic:biostar:mybiostar:status#095-buffer-top-2" }
Number:Temperature   Biostar_BufferBtm2              "Buffer Btm 2"                       { channel="guntamatic:biostar:mybiostar:status#096-buffer-btm-2" }
Switch               Biostar_BExtraWw0               "B extra-WW. 0"                      { channel="guntamatic:biostar:mybiostar:status#097-b-extra-ww-0" }
Switch               Biostar_BExtraWw1               "B extra-WW. 1"                      { channel="guntamatic:biostar:mybiostar:status#098-b-extra-ww-1" }
Switch               Biostar_BExtraWw2               "B extra-WW. 2"                      { channel="guntamatic:biostar:mybiostar:status#099-b-extra-ww-2" }
Switch               Biostar_AuxiliaryPump0          "Auxiliary pump 0"                   { channel="guntamatic:biostar:mybiostar:status#100-auxiliary-pump-0" }
Switch               Biostar_AuxiliaryPump1          "Auxiliary pump 1"                   { channel="guntamatic:biostar:mybiostar:status#101-auxiliary-pump-1" }
Switch               Biostar_AuxiliaryPump2          "Auxiliary pump 2"                   { channel="guntamatic:biostar:mybiostar:status#102-auxiliary-pump-2" }
String               Biostar_BoilersConditionNo      "Boiler's condition no."             { channel="guntamatic:biostar:mybiostar:status#104-boilers-condition-no" }
Number:Temperature   Biostar_BufferT5                "Buffer T5"                          { channel="guntamatic:biostar:mybiostar:status#108-buffer-t5" }
Number:Temperature   Biostar_BufferT6                "Buffer T6"                          { channel="guntamatic:biostar:mybiostar:status#109-buffer-t6" }
Number:Temperature   Biostar_BufferT7                "Buffer T7"                          { channel="guntamatic:biostar:mybiostar:status#110-buffer-t7" }
Number:Temperature   Biostar_ExtraWw0                "Extra-WW. 0"                        { channel="guntamatic:biostar:mybiostar:status#111-extra-ww-0" }
Number:Temperature   Biostar_ExtraWw1                "Extra-WW. 1"                        { channel="guntamatic:biostar:mybiostar:status#112-extra-ww-1" }
Number:Temperature   Biostar_ExtraWw2                "Extra-WW. 2"                        { channel="guntamatic:biostar:mybiostar:status#113-extra-ww-2" }
Number:Dimensionless Biostar_Grate                   "Grate"                              { channel="guntamatic:biostar:mybiostar:status#114-grate" }
```

### Rule

```java
rule "Example Guntamatic Rule"
when
    Item Season changed
then
    if ( (Season.state != NULL) && (Season.state != UNDEF) )
    {
        if ( Season.state.toString == "WINTER" )
        {
            Biostar_ControlProgram.sendCommand("NORMAL")
        }
        else
        {
            Biostar_ControlProgram.sendCommand("OFF")
        }
    }
end
```

## Your feedback is required

The Guntamatic Binding was developed and tested using Guntamatic Biostar 15kW Pellets Heating System, running Firmware 3.3d.
Please provide feedback (👍 as well as 👎) when using the Binding for other Guntamatic Heating Systems.

Forum topic for feedback:

- [openHAB community #128451](https://community.openhab.org/t/guntamatic-new-binding-for-guntamatic-heating-systems-biostar-powerchip-powercorn-biocom-pro-therm/128451 "openHAB community #128451")


<EditPageLink/>
