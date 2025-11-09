---
layout: documentation
title: Units Of Measurement
---

# Units Of Measurement

To express measured values in a scientific correct unit the framework supports units of measurement.
By using quantified decimal values in state updates and commands, the framework is able to automatically convert values to a desired unit which may be defined by the system locale or on a per-use-basis.

[[toc]]

## QuantityType

Bindings use the `QuantityType` to post updates of sensor data with a quantifying unit.
This way the framework and/or the user is able to convert the quantified value to other matching units:

A weather binding which reads temperature values in °C would use the `QuantityType` to indicate the unit as °C.
The framework is then able to convert the values to either °F or Kelvin according to the configuration of the system.
The default conversion the framework will use is locale-based:
The framework tries to convert a `QuantityType` to the default unit of the configured locale.
This is the imperial system for the United States (locale US) and Liberia (language tag "en-LR").
The metric system with SI units is used for the rest of the world.
This conversion will convert the given `QuantityType` into a default unit for the specific dimension of the type.
This is:

| Dimension                | default unit metric               | default unit imperial             |
|--------------------------|-----------------------------------|-----------------------------------|
| Acceleration             | Meter per square second (m/s²)    | Meter per square second (m/s²)    |
| Amount of Substance      | Mole (mol)                        | Mole (mol)                        |
| Angle                    | Degree (°)                        | Degree (°)                        |
| Area                     | Square Meter (m²)                 | Square foot (ft²)                 |
| Areal Density            | Dobson unit (DU)                  | Dobson unit (DU)                  |
| Catalytic Activity       | Katal (kat)                       | Katal (kat)                       |
| Currency                 | User Defined Currency (DEF)       | User Defined Currency (DEF)       |
| Data Amount              | Byte (B)                          | Byte (B)                          |
| Data Transfer Rate       | Megabit per second (Mbit/s)       | Megabit per second (Mbit/s)       |
| Density                  | Kilogram per cubic meter (kg/m³)  | Kilogram per cubic meter (kg/m³)  |
| Dimensionless            | Abstract unit one (one)           | Abstract unit one (one)           |
| Electric Capacitance     | Farad (F)                         | Farad (F)                         |
| Electric Charge          | Coulomb (C)                       | Coulomb (C)                       |
| Electric Conductance     | Siemens (S)                       | Siemens (S)                       |
| Electric Conductivity    | Siemens per meter (S/m)           | Siemens per meter (S/m)           |
| Electric Current         | Ampere (A)                        | Ampere (A)                        |
| Electric Inductance      | Henry (H)                         | Henry (H)                         |
| Electric Potential       | Volt (V)                          | Volt (V)                          |
| Electric Resistance      | Ohm (Ω)                           | Ohm (Ω)                           |
| Emission Intensity       | Gram per kilowatt hour (g/kWh)    | Gram per kilowatt hour (g/kWh)    |
| Energy                   | Kilowatt hour (kWh)               | Kilowatt hour (kWh)               |
| EnergyPrice              | Price per kilowatt hour (DEF/kWh) | Price per kilowatt hour (DEF/kWh) |
| Force                    | Newton (N)                        | Newton (N)                        |
| Frequency                | Hertz (Hz)                        | Hertz (Hz)                        |
| Illuminance              | Lux (lx)                          | Lux (lx)                          |
| Intensity                | Irradiance (W/m²)                 | Irradiance (W/m²)                 |
| Length                   | Meter (m)                         | Inch (in)                         |
| Luminous Flux            | Lumen (lm)                        | Lumen (lm)                        |
| Luminous Intensity       | Candela (cd)                      | Candela (cd)                      |
| Magnetic Flux            | Weber (Wb)                        | Weber (Wb)                        |
| Magnetic Flux Density    | Tesla (T)                         | Tesla (T)                         |
| Mass                     | Kilogram (kg)                     | Pound (lb)                        |
| Power                    | Watt (W)                          | Watt (W)                          |
| Pressure                 | Hectopascal (hPa)                 | Inch of mercury (inHg)            |
| Radiant Exposure         | Joule per square meter (J/m²)     | Joule per square meter (J/m²)     |
| Radiation Absorbed Dose  | Gray (Gy)                         | Gray (Gy)                         |
| Radiation Effective Dose | Sievert (Sv)                      | Sievert (Sv)                      |
| Radioactivity            | Becquerel (Bq)                    | Becquerel (Bq)                    |
| Solid Angle              | Steradian (sr)                    | Steradian (sr)                    |
| Speed                    | Kilometers per hour (km/h)        | Miles per hour (mph)              |
| Temperature              | Celsius (°C)                      | Fahrenheit (°F)                   |
| Time                     | Seconds (s)                       | Seconds (s)                       |
| Volume                   | Cubic Meter (m³)                  | US Gallon (gal)                   |
| VolumePrice              | Price per litre (DEF/l)           | Price per litre (DEF/l)           |
| Volumetric Flow Rate     | Liter per minute (l/min)          | US Gallon per minute (gal/min)    |

In some cases the system default unit may not be the most useful unit for a given quantity.
For measuring precipitation km/h would be a quite uncommon unit, while mm/h would be the expected unit.
You can set the `unit` metadata to a different unit to change the item's unit:

```shell
Number:Speed "Rainfall" { unit="mm/h" }
```

This unit is then also used for persistence.
Setting the `unit` metadata to `kW` would persist 5.0 for a value of 5.0 kW (while 5000 would be persisted without because the system default is W).
Attention: Changing the unit of an item may corrupt your already persisted data, no automatic conversion takes place.

The unit of the item is independent of the state description.
The state description is used for display purposes only, it can contain any compatible unit and will not affect what is persisted or used in events.

## Number item with dimension and DecimalType

A `DecimalType` state update or command to a `Number` item that contains a dimension is considered to have the item's unit.
So updating a `Number:Length` item with `5.0` will set the item's state to 5 m or 5 in. (depending on your locale).
In case you set a different unit (see above, e.g. `km`) that is taken and the item will set it's state to 5 km.

## Number item without dimension and QuantityType

A `QuantityType` state update or command to a non-dimensional `Number` item will result in a state update that consists of the numeric part only.
So updating a `Number` item with `5.0 kW` will set the item's state to 5.0, updating the same item with `5.0 W` will also set the item's state to 5.0.
Linking dimension channels to non-dimensional items is therefore discouraged and will not be permitted in future versions of openHAB.

### Defining ChannelTypes

In order to match `NumberItems` and Channels and define a default state description with unit placeholder the Channel also has to provide an Item type which includes the dimension information:

```xml
<channel-type id="temperature">
    <item-type>Number:Temperature</item-type>
    <label>Temperature</label>
    <description>Current temperature</description>
    <state readOnly="true" pattern="%.1f %unit%" />
</channel-type>
```

The state description pattern "%.1f %unit%" describes the value format as floating point with one decimal place and also the special placeholder for the unit.

## Implementing UoM

When creating QuantityType states the framework offers some useful packages and classes:
The `org.openhab.core.library.unit` package contains the classes `SIUnits`, `ImperialUnits` and `Units` which provide units unique to either of the measurement systems and common units used in both systems.

The `MetricPrefix` class provides prefixes like MILLI, CENTI, HECTO, etc. and the `BinaryPrefix` class provides prefixes like KIBI, MEBI, etc. both of which are wrappers to create derived units.

The `org.openhab.core.library.dimension` and `javax.measure.quantity` packages provide interfaces which are used to type the generic QuantityType and units.

## List of Units

All units which are currently supported by default are listed in the tables below.

### Imperial (base unit symbols):

| Type               | Unit                   | Symbol  |
|--------------------|------------------------|---------|
| Density            | Grain per cubic foot   | gr/ft³  |
| Length             | Inch                   | in      |
| Length             | Foot                   | ft      |
| Length             | Yard                   | yd      |
| Length             | Chain                  | ch      |
| Length             | Furlong                | fur     |
| Length             | Mile                   | mi      |
| Length             | League                 | lea     |
| Mass               | Grain                  | gr      |
| Pressure           | Inch of Mercury        | inHg    |
| Pressure           | Pound per square inch  | psi     |
| Speed              | Miles per Hour         | mph     |
| Temperature        | Fahrenheit             | °F      |
| Volume             | Gallon (US)            | gal     |
| VolumetricFlowRate | Gallon (US) per minute | gal/min |

### SI (base unit symbols):

| Type                      | Unit                             | Symbol |
|---------------------------|----------------------------------|--------|
| Acceleration              | Metre per Second squared         | m/s²   |
| Acceleration              | Standard Gravity                 | ɡₙ     |
| AmountOfSubstance         | Mole                             | mol    |
| AmountOfSubstance         | Deutscher Härtegrad              | °dH    |
| Angle                     | Radian                           | rad    |
| Angle                     | Degree                           | °      |
| Angle                     | Minute Angle                     | '      |
| Angle                     | Second Angle                     | ''     |
| Area                      | Square Metre                     | m²     |
| ArealDensity              | Dobson Unit                      | DU     |
| CatalyticActivity         | Katal                            | kat    |
| DataAmount                | Bit                              | bit    |
| DataAmount                | Byte                             | B      |
| DataAmount                | Octet                            | o      |
| DataTransferRate          | Bit per Second                   | bit/s  |
| Density                   | Gram per cubic Metre             | g/m³   |
| Dimensionless             | Percent                          | %      |
| Dimensionless             | Parts per Million                | ppm    |
| Dimensionless             | Decibel                          | dB     |
| ElectricPotential         | Volt                             | V      |
| ElectricCapacitance       | Farad                            | F      |
| ElectricCharge            | Coulomb                          | C      |
| ElectricCharge            | Ampere Hour                      | Ah     |
| ElectricConductance       | Siemens                          | S      |
| ElectricConductivity      | Siemens per Metre                | S/m    |
| ElectricCurrent           | Ampere                           | A      |
| ElectricInductance        | Henry                            | H      |
| ElectricResistance        | Ohm                              | Ω      |
| Energy                    | Joule                            | J      |
| Energy                    | Watt Second                      | Ws     |
| Energy                    | Watt Hour                        | Wh     |
| Energy                    | Volt-Ampere Hour                 | VAh    |
| Energy                    | Volt-Ampere Reactive Hour        | varh   |
| Energy                    | Calorie                          | cal    |
| Force                     | Newton                           | N      |
| Frequency                 | Hertz                            | Hz     |
| Frequency                 | Revolutions per minute           | rpm    |
| Illuminance               | Lux                              | lx     |
| Intensity                 | Irradiance                       | W/m²   |
| Intensity                 | Microwatt per square Centimeter  | µW/cm² |
| Length                    | Metre                            | m      |
| LuminousFlux              | Lumen                            | lm     |
| LuminousIntensity         | Candela                          | cd     |
| MagneticFlux              | Weber                            | Wb     |
| MagneticFluxDensity       | Tesla                            | T      |
| Mass                      | Gram                             | g      |
| Power                     | Watt                             | W      |
| Power                     | Volt-Ampere                      | VA     |
| Power                     | Volt-Ampere Reactive             | var    |
| Power                     | Decibel-Milliwatts               | dBm    |
| Pressure                  | Pascal                           | Pa     |
| Pressure                  | Hectopascal                      | hPa    |
| Pressure                  | Millimetre of Mercury            | mmHg   |
| Pressure                  | Bar                              | bar    |
| Radioactivity             | Becquerel                        | Bq     |
| RadiantExposure           | Joule per square meter           | J/m²   |
| RadiationDoseAbsorbed     | Gray                             | Gy     |
| RadiationDoseEffective    | Sievert                          | Sv     |
| RadiationSpecificActivity | Curie                            | Ci     |
| SolidAngle                | Steradian                        | sr     |
| Speed                     | Metre per Second                 | m/s    |
| Speed                     | Knot                             | kn     |
| Temperature               | Kelvin                           | K      |
| Temperature               | Celsius                          | °C     |
| Temperature[^](#mired-footnote) | Mired or Mirek             | MK⁻¹   |
| Time                      | Second                           | s      |
| Time                      | Minute                           | min    |
| Time                      | Hour                             | h      |
| Time                      | Day                              | d      |
| Time                      | Week                             | week   |
| Time                      | Year                             | y      |
| Volume                    | Litre                            | l      |
| Volume                    | Cubic Metre                      | m³     |
| VolumetricFlowRate        | Litre per Minute                 | l/min  |
| VolumetricFlowRate        | Cubic Metre per Second           | m³/s   |
| VolumetricFlowRate        | Cubic Metre per Minute           | m³/min |
| VolumetricFlowRate        | Cubic Metre per Hour             | m³/h   |
| VolumetricFlowRate        | Cubic Metre per Day              | m³/d   |

<a name="mired-footnote">^</a>: This unit is used to indicate the color temperature of lights.
The name 'mired' is a colloquial name for 'micro reciprocal degree'.
The official SI unit symbol is 'MK⁻¹', but the alias unit symbol 'mired' is also permitted.
The unit is also known as 'micro reciprocal Kelvin', so a second alias unit symbol 'mirek' is permitted too.
Technically, mireds are the reciprocal of Temperature, but QuantityType and NumberItem will transparently convert between mireds and Kelvin.
This technicality might be a problem if you are using mireds in rules.
Be sure to use the `toInvertibleUnit` method on QuantityType, rather than `toUnit`.

### Currency:

| Type        | Unit                    | Symbol  |
|-------------|-------------------------|---------|
| Currency    | User Defined Currency   | DEF     |
| EnergyPrice | Price per kilowatt hour | DEF/kWh |
| VolumePrice | Price per litre         | DEF/l   |
| VolumePrice | Price per cubic meter   | DEF/m³  |
| VolumePrice | Price per gallon (US)   | DEF/gal |

Currently the support for currencies is pretty basic and just one currency is supported.
In the future there is a plan to support additional providers with connections to exchanges where values can be converted between currencies using the current exchange rates.

This means that you have to configure a provider to start.
Otherwise your Items will just appear to have unit `DEF`.

There are two providers supported right now.
The `FixedCurrencyProvider` will let you just define what currency you want to use everywhere.
The `LocaleBasedCurrencyProvider` will use your regional settings to determine the default currency.
The units follow ISO 4217 three letter designations (e.g. `USD`, `EUR`, etc.).

### Metric Prefixes:

| Name  | Symbol | Factor |
|-------|--------|--------|
| Yotta | Y      | 10²⁴   |
| Zetta | Z      | 10²¹   |
| Exa   | E      | 10¹⁸   |
| Peta  | P      | 10¹⁵   |
| Tera  | T      | 10¹²   |
| Giga  | G      | 10⁹    |
| Mega  | M      | 10⁶    |
| Kilo  | k      | 10³    |
| Hecto | h      | 10²    |
| Deca  | da     | 10     |
| Deci  | d      | 10⁻¹   |
| Centi | c      | 10⁻²   |
| Milli | m      | 10⁻³   |
| Micro | µ      | 10⁻⁶   |
| Nano  | n      | 10⁻⁹   |
| Pico  | p      | 10⁻¹²  |
| Femto | f      | 10⁻¹⁵  |
| Atto  | a      | 10⁻¹⁸  |
| Zepto | z      | 10⁻²¹  |
| Yocto | y      | 10⁻²⁴  |

### Binary Prefixes:

| Name | Symbol | Factor |
| ---- | ------ | ------ |
| Kibi | ki     | 2¹⁰    |
| Mebi | Mi     | 2²⁰    |
| Gibi | Gi     | 2³⁰    |
| Tebi | Ti     | 2⁴⁰    |
| Pebi | Pi     | 2⁵⁰    |
| Exbi | Ei     | 2⁶⁰    |
| Zebi | Zi     | 2⁷⁰    |
| Yobi | Yi     | 2⁸⁰    |

To use the prefixes simply add the prefix to the unit symbol - for example:

- milliAmpere - `mA`
- centiMetre - `cm`
- kiloWatt - `kW`
- KibiByte - `kiB`
