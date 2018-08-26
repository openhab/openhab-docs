---
id: modbus
label: Modbus
title: Modbus - Bindings
type: binding
description: "This is the binding to access Modbus TCP and serial slaves. RTU, ASCII and BIN variants of Serial Modbus are supported."
since: 2x
logo: images/addons/modbus.png
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# Modbus Binding

This is the binding to access Modbus TCP and serial slaves. RTU, ASCII and BIN variants of Serial Modbus are supported.
Modbus TCP slaves are usually also called as Modbus TCP servers.

The binding can act as

* Modbus TCP Client (that is, as modbus master), querying data from Modbus TCP servers (that is, modbus slaves)
* Modbus serial master, querying data from modbus serial slaves

The Modbus binding polls the slave data with an configurable poll period.
openHAB commands are translated to write requests.

## Main Features

The binding polls (or *reads*) Modbus data using function codes (FC) FC01 (Read coils), FC02 (Read discrete inputs), FC03 (Read multiple holding registers) or FC04 (Read input registers).
This polled data is converted to data suitable for use in openHAB.
Functionality exists to interpret typical number formats (e.g. single precision float).

The binding can also *write* data to Modbus slaves using FC05 (Write single coil), FC06 (Write single holding register), FC15 (Write multiple coils) or FC16 (Write multiple holding registers).

## Caveats And Limitations

Please note the following caveats or limitations

* the binding does *not* act as Modbus slave (e.g. as Modbus TCP server).
* the binding does *not* support Modbus RTU over Modbus TCP, also known as "Modbus over TCP/IP" or "Modbus over TCP" or "Modbus RTU/IP", although normal "Modbus TCP" is supported. However, there is a workaround: you can use a Virtual Serial Port Server, to emulate a COM Port and Bind it with openHAB using Modbus Serial.


## Background Material

Reader of the documentation should understand the basics of Modbus protocol.
Good sources for further information:

* [Wikipedia article](https://en.wikipedia.org/wiki/Modbus): good read on modbus basics and addressing.
* [Simplymodbus.ca](http://www.simplymodbus.ca/): good reference as well as excellent tutorial like explanation of the protocol

Useful tools

* [binaryconvert.com](http://www.binaryconvert.com/): tool to convert numbers between different binary presentations
* [rapidscada.net Modbus parser](http://modbus.rapidscada.net/): tool to parse Modbus requests and responses. Useful for debugging purposes when you want to understand the message sent / received.
* [JSFiddle tool](https://jsfiddle.net/rgypuuxq/) to test JavaScript (JS) transformations interactively

## Supported Things

This binding support 6 different things types

| Thing    | Type   | Description                                                                                                                                                                                                                               |
| -------- | ------ | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `tcp`    | Bridge | Modbus TCP server (Modbus TCP slave)                                                                                                                                                                                                      |
| `serial` | Bridge | Modbus serial slave                                                                                                                                                                                                                       |
| `poller` | Bridge | Thing taking care of polling the data from modbus slaves. One poller corresponds to single Modbus read request (FC01, FC02, FC03, or FC04). Is child of `tcp` or `serial`.                                                                |
| `data`   | Thing  | thing for converting polled data to meaningful numbers. Analogously, is responsible of converting openHAB commands to Modbus write requests. Is child of `poller` (read-only or read-write things) or `tcp`/`serial` (write-only things). |

Typically one defines either `tcp` or `serial` bridge, depending on the variant of Modbus slave.
For each Modbus read request, a `poller` is defined.
Finally, one ore more `data` things are introduced to extract relevant numbers from the raw Modbus data.
For write-only communication, `data` things can be introduced directly as children of `tcp` or `serial` bridges.

## Binding Configuration

Other than the things themselves, there is no binding configuration.

## Serial Port Configuration

Without correct configuration, the binding might not be able to open the serial port for communication, and you will see an error message in the logs.
Following section gives serial configuration advice with different platforms.

### Windows

No special configuration is needed, you can use the COM port number (e.g. `COM4`) in the thing configuration.

### Linux

If you can see issues related to opening the serial port with Linux, and you are using **non standard serial ports** (e.g. `/dev/ttyAMA0`) you might have to configure openHAB to detect and access the port correctly:

* Adapt java command line arguments to include `-Dgnu.io.rxtx.SerialPorts=/dev/ttyAMA0` (where `/dev/ttyAMA0` is the serial port). If you have multiple serial ports to configure, separate them with colon (`:`). Depending on openHAB installation method, you should modify `start.sh`, `start_debug.sh`, `start.bat`, or  `start_debug.bat` (standalone/manual installation) or `EXTRA_JAVA_OPTS` in `/etc/default/openhab2` (debian installation)
* Depending on linux distribution, you might need to add the user running openHAB to `dialout` user group. With Debian openHAB installation: `sudo usermod -a -G dialout openhab`. The user will need to logout from all login instances and log back in to see their new group added. If the user added to this group still cannot get permission, rebooting the box to ensure the new group permission is attached to the user is suggested.
* When using more than one USB-Serial converters, it may happen that the `/dev/ttyUSB0` device is named `/dev/ttyUSB1` after a reboot. To prevent this problem, alias names can be assigned to serial devices by adding them to `/etc/udev/rules.d/99-com.rules`. Example:

```bash
SUBSYSTEM=="tty", ATTRS{idVendor}=="0403", ATTRS{idProduct}=="6001", ATTRS{serial}=="AE01F0PD", SYMLINK+="ttyMySensors"
SUBSYSTEM=="tty", ATTRS{idVendor}=="10c4", ATTRS{idProduct}=="ea60", ATTRS{serial}=="0001", SYMLINK+="ttyCulStick"
```

You need to find relevant pieces of information using e.g. `udevadm` command line utility:

```
udevadm info -a -p $(udevadm info -q path -n /dev/ttyACM0)
```

### MacOS

When working with a Mac, it may be necessary to install a driver for the USB-RS232 converter (e.g. [osx-pl2303](http://osx-pl2303.sourceforge.net/) or [pl2303](http://mac.softpedia.com/get/Drivers/PL2303-OS-X-driver.shtml) and create the `/var/lock` folder; see the [rxtx troubleshooting guide](http://rxtx.qbang.org/wiki/index.php/Trouble_shooting#Mac_OS_X_users).

## Thing Configuration

In the tables below the thing configuration parameters are grouped by thing type.

Things can be configured using Paper UI, or using a `.things` file.
The configuration in this documentation explains the `.things` file, although you can find the same parameters from the Paper UI.

Note that parameter type is very critical when writing `.things` file yourself, since it affects how the parameter value is encoded in the text file.

Some examples:

* `parameter="value"` for `text` parameters
* `parameter=4` for `integer`
* `parameter=true` for `boolean`

Note the differences with quoting.

Required parameters *must* be specified in the `.things` file.
When optional parameters are not specified, they default to the values shown in the table below.

### `tcp` Thing

`tcp` is representing a particular Modbus TCP server (slave).

Basic parameters

| Parameter | Type    | Required | Default if omitted | Description                                                 |
| --------- | ------- | -------- | ------------------ | ----------------------------------------------------------- |
| `host`    | text    |          | `"localhost"`      | IP Address or hostname                                      |
| `port`    | integer |          | `502`              | Port number                                                 |
| `id`      | integer |          | `1`                | Slave id. Also known as station address or unit identifier. |

Advanced parameters

| Parameter                       | Required | Type    | Default if omitted | Description                                                                                                                                                        |
| ------------------------------- | -------- | ------- | ------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `timeBetweenTransactionsMillis` |          | integer | `60`               | How long to delay we must have at minimum between two consecutive MODBUS transactions. In milliseconds.                                                            |
| `timeBetweenReconnectMillis`    |          | integer | `0`                | How long to wait to before trying to establish a new connection after the previous one has been disconnected. In milliseconds.                                     |
| `connectMaxTries`               |          | integer | `1`                | How many times we try to establish the connection. Should be at least 1.                                                                                           |
| `reconnectAfterMillis`          |          | integer | `0`                | The connection is kept open at least the time specified here. Value of zero means that connection is disconnected after every MODBUS transaction. In milliseconds. |
| `connectTimeoutMillis`          |          | integer | `10000`            | The maximum time that is waited when establishing the connection. Value of zero means that system/OS default is respected. In milliseconds.                        |

**Note:** Advanced parameters must be equal to all `tcp` things sharing the same `host` and `port`.

The advanced parameters have conservative defaults, meaning that they should work for most users.
In some cases when extreme performance is required (e.g. poll period below 10 ms), one might want to decrease the delay parameters, especially `timeBetweenTransactionsMillis`. Similarly, with some slower devices on might need to increase the values.

### `serial` Thing

`serial` is representing a particular Modbus serial slave.

Basic parameters

| Parameter | Type    | Required | Default if omitted | Description                                                                                                                                                                                               |     |
| --------- | ------- | -------- | ------------------ | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --- |
| port      | text    | ✓        |                    | Serial port to use, for example `/dev/ttyS0` or `COM1`                                                                                                                                                    |     |
| id        | integer |          | `1`                | Slave id. Also known as station address or unit identifier. See [Wikipedia](https://en.wikipedia.org/wiki/Modbus) and [simplymodbus](http://www.simplymodbus.ca/index.html) articles for more information |     |
| baud      | integer | ✓        |                    | Baud of the connection. Valid values are: `75`, `110`, `300`, `1200`, `2400`, `4800`, `9600`, `19200`, `38400`, `57600`, `115200`.                                                                        |     |
| stopBits  | text    | ✓        |                    | Stop bits. Valid values are: `"1"`, `"1.5"`, `"2"`.                                                                                                                                                       |     |
| parity    | text    | ✓        |                    | Parity. Valid values are: `"none"`, `"even"`, `"odd"`.                                                                                                                                                    |     |
| dataBits  | integer | ✓        |                    | Data bits. Valid values are: `5`, `6`, `7` and `8`.                                                                                                                                                       |     |
| encoding  | text    | ✓        |                    | Encoding. Valid values are: `"ascii"`, `"rtu"`, `"bin"`.                                                                                                                                                  |     |
| echo      | boolean |          | `false`            | Flag for setting the RS485 echo mode. This controls whether we should try to read back whatever we send on the line, before reading the response. Valid values are: `true`, `false`.                      |     |

Advanced parameters

| Parameter                       | Required | Type    | Default if omitted | Description                                                                                                                                |
| ------------------------------- | -------- | ------- | ------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `receiveTimeoutMillis`          |          | integer | `1500`             | Timeout for read operations. In milliseconds.                                                                                              |
| `flowControlIn`                 |          | text    | `"none"`           | Type of flow control for receiving. Valid values are: `"none"`, `"xon/xoff in"`, `"rts/cts in"`.                                           |
| `flowControlOut`                |          | text    | `"none"`           | Type of flow control for sending. Valid values are: `"none"`, `"xon/xoff out"`, `"rts/cts out"`.                                           |
| `timeBetweenTransactionsMillis` |          | integer | `60`               | How long to delay we must have at minimum between two consecutive MODBUS transactions. In milliseconds.                                    |
| `connectMaxTries`               |          | integer | `1`                | How many times we try to establish the connection. Should be at least 1.                                                                   |
| `connectTimeoutMillis`          |          | integer | `10000`            | The maximum time that is waited when establishing the connection. Value of zero means thatsystem/OS default is respected. In milliseconds. |

With the exception of `id` parameters should be equal to all `serial` things sharing the same `port`.

These parameters have conservative defaults, meaning that they should work for most users.
In some cases when extreme performance is required (e.g. poll period below 10ms), one might want to decrease the delay parameters, especially `timeBetweenTransactionsMillis`.
With some slower devices on might need to increase the values.

With low baud rates and/or long read requests (that is, many items polled), there might be need to increase the read timeout `receiveTimeoutMillis` to e.g. `5000` (=5 seconds).

### `poller` Thing

`poller` thing takes care of polling the Modbus serial slave or Modbus TCP server data regularly.

| Parameter     | Type    | Required | Default if omitted | Description                                                                                                                                                                            |
| ------------- | ------- | -------- | ------------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `start`       | integer |          | `0`                | Address of the first register, coil, or discrete input to poll. Input as zero-based index number.                                                                                      |
| `length`      | integer | ✓        | (-)                | Number of registers, coils or discrete inputs to read.                                                                                                                                 |
| `type`        | text    | ✓        | (-)                | Type of modbus items to poll. This matches directly to Modbus request type or function code (FC). Valid values are: `coil` (FC01), `discrete` (FC02), `holding`(FC03), `input` (FC04). |
| `refresh`     | integer |          | `500`              | Poll interval in milliseconds. Use zero to disable automatic polling.                                                                                                                  |
| `maxTries`    | integer |          | `3`                | Maximum tries when reading. <br /><br />Number of tries when reading data, if some of the reading fail. For single try, enter 1.                                                       |
| `cacheMillis` | integer |          | `50`               | Duration for data cache to be valid, in milliseconds. This cache is used only to serve `REFRESH`  commands. Use zero to disable the caching.                                           |

Note: Polling can be manually triggered by sending `REFRESH` command to item bound to channel of `data` thing.
When manually triggering polling, a new poll is executed as soon as possible, and sibling `data` things (i.e. things that share the same `poller` bridge) are updated.
In case the `poller` had just received a data response or an error occurred, a cached response is used instead.
See [Refresh command](#refresh-command) section for more details.

### `data` Thing

`data` is responsible of extracting relevant piece of data (e.g. a number `3.14`) from binary received from the slave.
Similarly, `data` thing is responsible of converting openHAB commands to write requests to the Modbus slave.

| Parameter                                   | Type    | Required | Default if omitted | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| ------------------------------------------- | ------- | -------- | ------------------ | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `readValueType`                             | text    |          | (empty)            | How data is read from modbus. Use empty for write-only things.<br /><br />Bit value type must be used with coils and discrete inputs. With registers all value types are applicable. Valid values are: `"float32"`, `"float32_swap"`, `"int32"`, `"int32_swap"`, `"uint32"`, `"uint32_swap"`, `"int16"`, `"uint16"`, `"int8"`, `"uint8"`, or `"bit"`. See also [Value types on read and write](#value-types-on-read-and-write).                                                                                                                                                                                                                       |
| `readStart`                                 | text    |          | (empty)            | Start address to start reading the value. Use empty for write-only things. <br /><br />Input as zero-based index number, e.g. in place of `400001` (first holding register), use the address `"0"`.  Must be between (poller start) and (poller start + poller length - 1) (inclusive).<br /><br />With registers and value type less than 16 bits, you must use `"X.Y"` format where `Y` specifies the sub-element to read from the 16 bit register:<ul> <li>For example, `"3.1"` would mean pick second bit from register index `3` with bit value type. </li><li>With int8 valuetype, it would pick the high byte of register index `3`.</li></ul> |
| `readTransform`                             | text    |          | `"default"`        | Transformation to apply to polled data, after it has been converted to number using `readValueType`. <br /><br />Use "default" to communicate that no transformation is done and value should be passed as is.<br />Use `"SERVICENAME(ARG)"` to use transformation service `SERVICENAME` with argument `ARG`. <br />Any other value than the above types will be interpreted as static text, in which case the actual content of the polled value is ignored.                                                                                                                                                                                         |
| `writeValueType`                            | text    |          | (empty)            | How data is written to modbus. Only applicable to registers. Valid values are: `float32`, `float32_swap`, `int32`, `int32_swap`, `int16`. See also [Value types on read and write](#value-types-on-read-and-write).                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| `writeStart`                                | text    |          | (empty)            | Start address of the first holding register or coil in the write. Use empty for read-only things. <br />Use zero based address, e.g. in place of 400001 (first holding register), use the address 0. This address is passed to data frame as is.                                                                                                                                                                                                                                                                                                                                                                                                      |
| `writeType`                                 | text    |          | (empty)            | Type of data to write. Use empty for read-only things. Valid values: `"coil"` or `"holding"`.<br /><br /> Coil uses function code (FC) FC05 or FC15. Holding register uses FC06 or FC16. See `writeMultipleEvenWithSingleRegisterOrCoil` parameter.                                                                                                                                                                                                                                                                                                                                                                                                   |
| `writeTransform`                            | text    |          | `"default"`        | Transformation to apply to received commands.<br /><br />Use `"default"` to communicate that no transformation is done and value should be passed as is.    <br />Use `"SERVICENAME(ARG)"` to use transformation service `SERVICENAME` with argument `ARG`.    <br />Any other value than the above types will be interpreted as static text, in which case the actual content of the command value is ignored.                                                                                                                                                                                                                                       |
| `writeMultipleEvenWithSingleRegisterOrCoil` | boolean |          | `false`            | Whether single register / coil of data is written using FC16 ("Write Multiple Holding Registers") / FC15 ("Write Multiple Coils"), respectively. <br /><br />If false, FC06 ("Write single holding register") / FC05 ("Write single coil") are used with single register and single coil, respectively.                                                                                                                                                                                                                                                                                                                                               |
| `writeMaxTries`                             | integer |          | `3`                | Maximum tries when writing <br /><br />Number of tries when writing data, if some of the writes fail. For single try, enter `1`.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |


## Channels

Only the `data` thing has channels.
It has several "data channels", serving the polled data in different formats, and for accepting openHAB commands from different item types.

Please note that transformations might be *necessary* in order to update some data channels, or to convert some openHAB commands to suitable Modbus data.
See [Transformations](#transformations) for more details.

| Channel Type ID | Item Type       | Description                         |
| --------------- | --------------- | ----------------------------------- |
| `number`        | `Number`        | Data as number                      |
| `switch`        | `Switch`        | Data as switch (`ON` / `OFF`)       |
| `contact`       | `Contact `      | Data as contact (`OPEN` / `CLOSED`) |
| `dimmer`        | `Dimmer`        | Data as dimmer                      |
| `datetime`      | `DateTime`      | Data as a date time                 |
| `string`        | `String`        | Data as string                      |
| `rollershutter` | `Rollershutter` | Data as roller shutter              |

You can send a `REFRESH` command to items linked to any of the above channels to ask binding to explicitly poll new data from the Modbus slave.
See [Refresh command](#refresh-command) section for more details.

Furthermore, there are additional channels that are useful for diagnostics:

| Channel Type ID    | Item Type  | Description           |
| ------------------ | ---------- | --------------------- |
| `lastReadSuccess`  | `DateTime` | Last successful read  |
| `lastReadError`    | `DateTime` | Last erroring read    |
| `lastWriteSuccess` | `DateTime` | Last successful write |
| `lastWriteError`   | `DateTime` | Last erroring write   |

## Item configuration

Items are configured the typical way, using `channel` to bind the item to a particular channel.

For example, in the following example, item `Temperature_Modbus_Livingroom` is bound to channel `number` of thing `modbus:data:siemensplc:holding:livingroom_temperature`.

```bash
Number  Temperature_Modbus_Livingroom                       "Temperature Living room [%.1f °C]"           <temperature>   { channel="modbus:data:siemensplc:holding:livingroom_temperature:number" }
```

Make sure you bind item to a channel that is compatible, or use transformations to make it compatible. See [Transformations](#transformations) section for more information on transformation.

### `autoupdate` parameter with items

Please note that Modbus protocol is polling, and commands in openHAB might take some time to propagate. This might produce some transient effects with item values when parameters are changed.

By default, openHAB has `autoupdate` enabled. This means that item _state_ is updated according to received commands. In some situations this might have unexpected side effects with polling bindings such as Modbus - see example below.

Typically, you see something like this

```java
1 [ome.event.ItemCommandEvent] - Item 'Kitchen_Bar_Table_Light' received command ON
2 [vent.ItemStateChangedEvent] - Kitchen_Bar_Table_Light changed from OFF to ON
3 [vent.ItemStateChangedEvent] - Kitchen_Bar_Table_Light changed from ON to OFF
4 [vent.ItemStateChangedEvent] - Kitchen_Bar_Table_Light changed from OFF to ON
```

Let's go through it step by step


```java
// openHAB UI switch changed command is sent
1 [ome.event.ItemCommandEvent] - Item 'Kitchen_Bar_Table_Light' received command ON
// openHAB immediately updates the item state to match the command
2 [vent.ItemStateChangedEvent] - Kitchen_Bar_Table_Light changed from OFF to ON
// modbus binding poll completes (old value)
3 [vent.ItemStateChangedEvent] - Kitchen_Bar_Table_Light changed from ON to OFF
// (the binding writes the command over Modbus to the slave)
// modbus binding poll completes (updated value)
4 [vent.ItemStateChangedEvent] - Kitchen_Bar_Table_Light changed from OFF to ON
```

To prevent this "state fluctuation" (`OFF` -> `ON` -> `OFF` -> `ON`), some people prefer like to disable `autoupdate` with polling bindings. With `autoupdate` disabled, one would get

```java
// openHAB UI switch changed command is sent
1 [ome.event.ItemCommandEvent] - Item 'Kitchen_Bar_Table_Light' received command ON
// modbus binding poll completes (STILL the old value) -- UI not updated, still showing OFF
// (the binding writes the command over Modbus to the slave)
// modbus binding poll completes (updated value)
4 [vent.ItemStateChangedEvent] - Kitchen_Bar_Table_Light changed from OFF to ON
```

Item state has no "fluctuation", it updates from `OFF` to `ON`.

To summarize (credits to [rossko57's community post](https://community.openhab.org/t/rule-to-postupdate-an-item-works-but-item-falls-back-after-some-seconds/19986/2?u=ssalonen)):

* `autoupdate=false`: monitor the _actual_ state of device
* `autoupdate=true`: allows more faster display of the _expected_ state in a sitemap

You can disable `autoupdate` as follows:

```bash
Number  Temperature_Modbus_Livingroom                       "Temperature Living room [%.1f °C]"           <temperature>   { channel="modbus:data:siemensplc:holding:livingroom_temperature:number", autoupdate="false" }
```

Main documentation on `autoupdate` in [Items section of openHAB docs](https://www.openhab.org/docs/configuration/items.html#item-definition-and-syntax). 


## Details

### Comment On Addressing

[Modbus Wikipedia article](https://en.wikipedia.org/wiki/Modbus#Coil.2C_discrete_input.2C_input_register.2C_holding_register_numbers_and_addresses) summarizes this excellently:

> In the traditional standard, [entity] numbers for those entities start with a digit, followed by a number of four digits in range 1–9,999:

> * coils numbers start with a zero and then span from 00001 to 09999
> * discrete input numbers start with a one and then span from 10001 to 19999
> * input register numbers start with a three and then span from 30001 to 39999
> * holding register numbers start with a four and then span from 40001 to 49999
>
> This translates into [entity] addresses between 0 and 9,998 in data frames.

The openHAB modbus binding uses data frame entity addresses when referring to modbus entities.
That is, the entity address configured in modbus binding is passed to modbus protocol frame as-is.
For example, Modbus `poller` thing with `start=3`, `length=2` and `type=holding` will read modbus entities with the following numbers 40004 and 40005.

### Value Types On Read And Write

This section explains the detailed descriptions of different value types on read and write.
Note that value types less than 16 bits are not supported on write (see [poller thing](#poller-thing) documentation for details).

See [Full examples](#full-examples) section for practical examples.

#### `bit`:

- a single bit is read from the registers
- address is given as `X.Y`, where `Y` is between 0...15 (inclusive), representing bit of the register `X`
- index `Y=0` refers to the least significant bit
- index `Y=1` refers to the second least significant bit, etc.

#### `int8`:

- a byte (8 bits) from the registers is interpreted as signed integer
- address is given as `X.Y`, where `Y` is between 0...1 (inclusive), representing byte of the register `X`
- index `Y=0` refers to low byte
- index `Y=1` refers to high byte
- it is assumed that each high and low byte is encoded in most significant bit first order

#### `uint8`:

- same as `int8` except values are interpreted as unsigned integers

#### `int16`:

- register with index is interpreted as 16 bit signed integer.
- it is assumed that register is encoded in most significant bit first order

#### `uint16`:

- same as `int16` except values are interpreted as unsigned integers

#### `int32`:

- registers `index` and `(index + 1)` are interpreted as signed 32bit integer
- it assumed that the first register contains the most significant 16 bits
- it is assumed that each register is encoded in most significant bit first order

#### `uint32`:

- same as `int32` except values are interpreted as unsigned integers

#### `float32`:

- registers `index` and `(index + 1)` are interpreted as signed 32bit floating point number
- it assumed that the first register contains the most significant 16 bits
- it is assumed that each register is encoded in most significant bit first order

The MODBUS specification defines each 16bit word to be encoded as Big Endian,
but there is no specification on the order of those words within 32bit or larger data types.
The net result is that when you have a master and slave that operate with the same
Endian mode things work fine, but add a device with a different Endian mode and it is
very hard to correct. To resolve this the binding supports a second set of valuetypes
that have the words swapped.

If you get strange values using the `int32`, `uint32` or `float32` valuetypes then just try the `int32_swap`, `uint32_swap` or `float32_swap` valuetype, depending upon what your data type is.

#### `int32_swap`:

- registers `index` and `(index + 1)` are interpreted as signed 32bit integer
- it assumed that the first register contains the least significant 16 bits
- it is assumed that each register is encoded in most significant bit first order (Big Endian)

#### `uint32_swap`:

- same as `int32_swap` except values are interpreted as unsigned integers

#### `float32_swap`:

- registers `index` and `(index + 1)` are interpreted as signed 32bit floating point number
- it assumed that the first register contains the least significant 16 bits
- it is assumed that each register is encoded in most significant bit first order (Big Endian)


### REFRESH Command

`REFRESH` command to item bound to any [data channel](#channels) makes `poller` thing to poll new from the Modbus slave.
All data channels of children `data` things are refreshed per the normal logic.

`REFRESH` can be useful tool if you like to refresh only on demand (`poller` has refresh disabled, i.e. `refresh=0`), or have custom logic of refreshing only in some special cases.

Note that poller has `cacheMillis` parameter to re-use previously received data, and thus avoid polling the Modbus slave too much.
This parameter is specifically limiting the flood of requests that come when openHAB itself is calling `REFRESH` for new things.

### Read Steps

Every time data is read by the binding, these steps are taken to convert the raw binary data to actual item `State` in openHAB:

1. Poll the data from Modbus slave.
Data received is stored in list of bits (discrete inputs and coils), or in list of registers (input registers and holding registers)
1. Extract a single number from the polled data, using specified location `readStart` and number "value type" `readValueType`.
As an example, we can tell the binding to extract 32-bit float (`readValueType="float32"`) from register index `readStart="105"`.
1. Number is converted to string (e.g. `"3.14"`) and passed as input to the transformation.
Note that in case `readTransform="default"`, a default transformation provided by the binding is used. See [Transformations](#transformations) section for more details.
1. For each [data channel](#channels), we try to convert the transformation output of previous step to a State type (e.g. `ON`/`OFF`, or `DecimalType`) accepted by the channel. If all the conversions fail (e.g. trying to convert `ON` to a number), the data channel is not updated.

In case of read errors, all data channels are left unchanged, and `lastReadError` channel is updated with current time. Examples of errors include connection errors, IO errors on read, and explicit exception responses from the slave.

### Write Steps

#### Basic Case

Commands passed to openHAB items that are bound to a [data channel](#channels) are most often processed according to following steps:

1. Command is sent to openHAB item, that is bound to a [data channel](#channels).
Command must be such that it is accepted by the item in the first place
1. Command is converted to string (e.g. `"3.14"`) and passed to the transformation.
Note that in case `readTransform="default"`, a default transformation provided by the binding is used. See [Transformations](#transformations) section for more details.
3. We try to convert transformation output to number (`DecimalType`), `OPEN`/`CLOSED` (`OpenClosedType`), and `ON`/`OFF` (`OnOffType`); in this order. First successful conversion is stored.
For example, `"3.14"` would convert to number (`DecimalType`), while `"CLOSED"` would convert to `CLOSED` (of `OpenClosedType`).'
In case all conversions fail, the command is discarded and nothing is written to the Modbus slave.
5. Next step depends on the `writeType`:
   * `writeType="coil"`: the command from the transformation is converted to boolean. Non-zero numbers, `ON`, and `OPEN` are considered `true`; and rest as `false`.
   * `writeType="holding"`: First, the command from the transformation is converted `1`/`0` number in case of `OPEN`/`ON` or `CLOSED`/`OFF`. The number is converted to one or more registers using `writeValueType`. For example, number `3.14` would be converted to two registers when `writeValueType="float32"`: [0x4048, 0xF5C3].
6. Boolean (`writeType="coil"`) or registers (`writeType="holding"`) are written to the Modbus slave using `FC05`, `FC06`, `FC15`, or `FC16`, depending on the value of `writeMultipleEvenWithSingleRegisterOrCoil`. Write address is specified by `writeStart`.

#### Advanced Write Using JSON

There are some more advanced use cases which need more control how the command is converted to set of bits or requests.
Due to this reason, one can return a special [JSON](https://en.wikipedia.org/wiki/JSON) output from the transformation (step 3).
The JSON directly specifies the write requests to send to Modbus slave. In this case, steps 4. and 5. are skipped.

For example, if the transformation returns the following JSON

```json
[
    {
        "functionCode": 16,
        "address": 5412,
        "value": [1, 0, 5]
    },
    {
        "functionCode": 6,
        "address": 555,
        "value": [3],
        "maxTries": 10
    }
]
```

Two write requests would be sent to the Modbus slave

1. FC16 (write multiple holding register), with start address 5412, having three registers of data (1, 0, and 5).
2. FC06 (write single holding register), with start address 555, and single register of data (3). Write is tried maximum of 10 times in case some of the writes fail.

The JSON transformation output can be useful when you need full control how the write goes, for example in case where the write address depends on the incoming command.
Actually, you can omit specifying `writeStart`, `writeValueType` and `writeType` with JSON transformation output altogether.

Empty JSON array (`[]`) can be used to suppress all writes.

Explanation for the different properties of the JSON object in the array.

| Key name       | Value type            | Required | Default if omitted | Description                                                                                                                                                                                                                                      |
| -------------- | --------------------- | -------- | ------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `functionCode` | number                | ✓        | (-)                | Modbus function code to use with write. Use one of `5`, `6`, `15` or `16`.                                                                                                                                                                       |
| `address`      | number                | ✓        | (-)                | Start address of the first holding register or coil in the write. Use empty for read-only things. <br />Use zero based address, e.g. in place of 400001 (first holding register), use the address 0. This address is passed to data frame as is. |
| `value`        | JSON array of numbers | ✓        | (-)                | Array of coil or register values. Encode coil values as `0` or `1`.                                                                                                                                                                              |
| `maxTries`     | number                |          | 3                  | Number of tries when writing data, in case some of the writes fail. Should be at least 1.                                                                                                                                                        |

### Transformations

Transformations serve two purpose

* `readTransform`: doing preprocessing transformations to read binary data and to make it more usable in openHAB
* `writeTransform`: doing preprocessing to openHAB commands before writing them to Modbus slave

Note that transformation is only one part of the overall process how polled data is converted to openHAB state, or how commands are converted to Modbus writes.
Consult [Read steps](#read-steps) and [Write steps](#write-steps) for more details.
Specifically, note that you might not need transformations at all in some uses cases.

Please also note that you should install relevant transformations, as necessary. For example, `openhab-transformation-javascript` feature provides the javascript (`JS`) transformation.

#### Transform On Read

**`readTransform`** can be used to transform the polled data, after a number is extracted from the polled data using `readValueType` and `readStart` (consult [Read steps](#read-steps)).

There are three different format to specify the configuration:

1. String `"default"`, in which case the default transformation is used. The default is to convert non-zero numbers to `ON`/`OPEN`, and zero numbers to `OFF`/`CLOSED`, respectively. If the item linked to the data channel does not accept these states, the number is converted to best-effort-basis to the states accepted by the item. For example, the extracted number is passed as-is for `Number` items, while `ON`/`OFF` would be used with `DimmerItem`.
1. `"SERVICENAME(ARG)"` for calling a transformation service. The transformation receives the extracted number as input. This is useful for example scaling (divide by x) the polled data before it is used in openHAB. See examples for more details.
1. Any other value is interpreted as static text, in which case the actual content of the polled value is ignored. Transformation result is always the same. The transformation output is converted to best-effort-basis to the states accepted by the item.

Consult [background documentation on items](http://docs.openhab.org/concepts/items.html) to understand accepted data types (state) by each item.

#### Transform On Write

**`writeTransform`** can be used to transform the openHAB command before it is converted to actual binary data (see [Write steps](#write-steps)).

There are three different format to specify the configuration:

1. String `"default"`, in which case the default transformation is used. The default is to do no conversion to the command.
2. `"SERVICENAME(ARG)"` for calling a transformation service. The transformation receives the command as input. This is useful for example scaling ("multiply by x") commands before the data is written to Modbus. See examples for more details.
3. Any other value is interpreted as static text, in which case the actual command is ignored. Transformation result is always the same.

#### Transformation Example: Scaling

Typical use case for transformations is scaling of numbers.
The data in Modbus slaves is quite commonly encoded as integers, and thus scaling is necessary to convert them to useful float numbers.

`transform/multiply10.js`:

```javascript
// Wrap everything in a function (no global variable pollution)
// variable "input" contains data passed by openhab
(function(inputData) {
    // on read: the polled number as string
    // on write: openHAB command as string
    var MULTIPLY_BY = 10;
    return Math.round(parseFloat(inputData, 10) * MULTIPLY_BY);
})(input)
```

`transform/divide10.js`:

```javascript
// Wrap everything in a function (no global variable pollution)
// variable "input" contains data passed by openhab
(function(inputData) {
    // on read: the polled number as string
    // on write: openHAB command as string
    var DIVIDE_BY = 10;
    return parseFloat(inputData) / DIVIDE_BY;
})(input)
```

See [Scaling example](#scaling-example) for full example with things, items and a sitemap.

#### Example: Inverting Binary Data On Read And Write

This example transformation is able to invert "boolean" input.
In this case, boolean input is considered to be either number `0`/`1`, `ON`/`OFF`, or `OPEN`/`CLOSED`.

```javascript
// function to invert Modbus binary states
// variable "input" contains data passed by OpenHAB binding
(function(inputData) {
    var out = inputData ;      // allow Undefined to pass through
    if (inputData == '1' || inputData == 'ON' || inputData == 'OPEN') {
        out = '0' ;
    } else if (inputData == '0' || inputData == 'OFF' || inputData == 'CLOSED') {
        out = '1' ;
    }
    return out ;      // return a string
})(input)
```

## Full Examples

Things can be configured via the Paper UI, or using a `things` file like here.

### Basic Example

This example reads different kind of Modbus items from the slave.

Please refer to the comments for more explanations.

`things/modbus_ex1.things`:

```xtend
Bridge modbus:tcp:localhostTCP [ host="127.0.0.1", port=502, id=2 ] {

    // read-write for coils. Reading 4 coils, with index 4, and 5.
    // These correspond to input register numbers 000005, and 000005
    Bridge poller coils [ start=4, length=2, refresh=1000, type="coil" ] {
        // Note the zero based indexing: first coil is index 0.
        Thing data do4 [ readStart="4", readValueType="bit", writeStart="4", writeValueType="bit", writeType="coil" ]
        Thing data do5 [ readStart="5", readValueType="bit", writeStart="5", writeValueType="bit", writeType="coil" ]
    }
    // read-write for holding registers. Reading 4 registers, with index 1500, 1501, 1502, 1503.
    // These correspond to holding register numbers 401501, 401502, 401503, 401504.
    Bridge poller holding [ start=1500, length=4, refresh=1000, type="holding" ] {
        Thing data holding1500 [ readStart="1500", readValueType="float32", writeStart="1500", writeValueType="float32", writeType="holding" ]
        Thing data holding1502 [ readStart="1502", readValueType="float32", writeStart="1502", writeValueType="float32", writeType="holding" ]
    }
    // read-only for input registers. Reading 4 registers, with index 1500, 1501, 1502, 1503.
    // These correspond to input register numbers 301501, 301502, 301503, 301504.
    Bridge poller inputRegisters [ start=1500, length=4, refresh=1000, type="input" ] {
        Thing data input1500 [ readStart="1500", readValueType="float32" ]
        Thing data input1502 [ readStart="1502", readValueType="float32" ]

        // Extract high or low byte of the 16-bit register as unsigned 8-bit integer (uint8)
        Thing data input1502lo [ readStart="1502.0", readValueType="uint8" ]
        Thing data input1502hi [ readStart="1502.1", readValueType="uint8" ]

        // Extract individual bits of the 16-bit register
        // bit 0 is the least significant bit, and bit 15 is the most significant bit
        Thing data input1502bit0 [ readStart="1502.0", readValueType="bit" ]
        Thing data input1502bit1 [ readStart="1502.1", readValueType="bit" ]
        Thing data input1502bit2 [ readStart="1502.2", readValueType="bit" ]
    }

    // read-only for discrete inputs. Reading 4 discrete inputs, with index 1200, 1201, 1202, 1203.
    // These correspond to input register numbers 101201, 101202, 101203, 101204.
    Bridge poller discreteInputs [ start=1200, length=4, refresh=1000, type="discrete" ] {
        Thing data di1200 [ readStart="1200", readValueType="bit" ]
        Thing data di1201 [ readStart="1201", readValueType="bit" ]
    }

    // Write-only entry: thing is child of tcp directly. No readStart etc. need to be defined.
    // Note that the openHAB state might differ from the physical slave since it is not refreshed at all
    Thing data holding5write [ writeStart="5", writeValueType="int16", writeType="holding" ]
}
```

`items/modbus_ex1.items`:

```xtend
Switch DO4            "Digital Output index 4 [%d]"    { channel="modbus:data:localhostTCP:coils:do4:switch" }
Switch DO5            "Digital Output index 5 [%d]"    { channel="modbus:data:localhostTCP:coils:do5:switch" }

Contact DI1200            "Digital Input index 1200 [%d]"    { channel="modbus:data:localhostTCP:discreteInputs:di1200:contact" }
Contact DI1201            "Digital Input index 1201 [%d]"    { channel="modbus:data:localhostTCP:discreteInputs:di1201:contact" }

Number Input1500Float32            "Input registers 1500-1501 as float32 [%.1f]"    { channel="modbus:data:localhostTCP:inputRegisters:input1500:number" }
Number Input1502Float32            "Input registers 1502-1503 as float32 [%.1f]"    { channel="modbus:data:localhostTCP:inputRegisters:input1502:number" }

DateTime Input1502Float32LastOKRead            "Input registers 1502-1503 last read [%1$tA, %1$td.%1$tm.%1$tY %1$tH:%1$tM:%1$tS]"    { channel="modbus:data:localhostTCP:inputRegisters:input1502:lastReadSuccess" }
DateTime Input1502Float32LastBadRead            "Input registers 1502-1503 last read [%1$tA, %1$td.%1$tm.%1$tY %1$tH:%1$tM:%1$tS]"    { channel="modbus:data:localhostTCP:inputRegisters:input1502:lastReadError" }

Number Holding5writeonly            "Holding index 5 [%.1f]"    { channel="modbus:data:localhostTCP:holding5write:number" }
```

`sitemaps/modbus_ex1.sitemap`:

```xtend
sitemap modbus_ex1 label="modbus_ex1"
{
    Frame {
        Switch item=DO4
        Switch item=DO5
        Setpoint item=Holding5writeonly minValue=0 maxValue=100 step=20

        Default item=DI1200
        Default item=DI1201

        Default item=Input1500Float32
        Default item=Input1502Float32

        Default item=Input1500Float32LastOKRead
        Default item=Input1500Float32LastBadRead

    }
}
```

### Writing To Different Address And Type Than Read

This updates the item from discrete input index 4, and writes commands to coil 5.
This can be useful when the discrete input is the measurement (e.g. "is valve open?"), and the command is the control (e.g. "open/close valve").

The sitemap shows the current coil status.
It also has switches to set/reset coil status, for debugging purposes.
Toggling these switches always have the same effect: either setting or resetting the bit.

`things/modbus_ex2.things`:

```xtend
Bridge modbus:tcp:localhostTCPex2 [ host="127.0.0.1", port=502 ] {

    Bridge poller items [ start=4, length=2, refresh=1000, type="discrete" ] {
        // read from index 4, write to coil 5
        Thing data readDiscrete4WriteCoil5 [ readStart="4", readValueType="bit", writeStart="5", writeValueType="bit", writeType="coil" ]
        Thing data resetCoil5 [ writeTransform="0", writeStart="5", writeValueType="bit", writeType="coil" ]
        Thing data setCoil5 [ writeTransform="1", writeStart="5", writeValueType="bit", writeType="coil" ]
    }

    Bridge poller coils [ start=5, length=1, refresh=500, type="coil" ] {
        Thing data index5 [ readStart="5", readValueType="bit" ]
    }
}
```

`items/modbus_ex2.items`:

```xtend
Switch ReadDI4WriteDO5            "Coil 4/5 mix [%d]"    { channel="modbus:data:localhostTCPex2:items:readDiscrete4WriteCoil5:switch" }
Switch ResetDO5            "Flip to turn Coil 5 OFF [%d]"    { channel="modbus:data:localhostTCPex2:items:resetCoil5:switch" }
Switch SetDO5            "Flip to turn Coil 5 ON [%d]"    { channel="modbus:data:localhostTCPex2:items:setCoil5:switch" }
Contact Coil5            "Coil 5 [%d]"    { channel="modbus:data:localhostTCPex2:coils:index5:contact" }

```

`sitemaps/modbus_ex2.sitemap`:

```xtend
sitemap modbus_ex2 label="modbus_ex2"
{
    Frame {
        Switch item=ReadDI4WriteDO5
        Switch item=ResetDO5
        Switch item=SetDO5
        Text item=Coil5
    }
}
```

### Scaling Example

This example divides value on read, and multiplies them on write.

`things/modbus_ex_scaling.things`:

```xtend
Bridge modbus:tcp:localhostTCP3 [ host="127.0.0.1", port=502 ] {
    Bridge poller holdingPoller [ start=5, length=1, refresh=5000, type="holding" ] {
        Thing data holding5Scaled [ readStart="5", readValueType="int16", readTransform="JS(divide10.js)", writeStart="5", writeValueType="int16", writeType="holding", writeTransform="JS(multiply10.js)" ]
    }
}
```

`items/modbus_ex_scaling.items`:

```xtend
Number Holding5Scaled            "Holding index 5 scaled [%.1f]"   { channel="modbus:data:localhostTCP3:holdingPoller:holding5Scaled:number" }
```

`sitemaps/modbus_ex_scaling.sitemap`:

```xtend
sitemap modbus_ex_scaling label="modbus_ex_scaling"
{
    Frame {
        Text item=Holding5Scaled
        Setpoint item=Holding5Scaled minValue=0 maxValue=100 step=20
    }
}
```

See [transformation example](#transformation-example-scaling) for the `divide10.js` and `multiply10.js`.

### Rollershutter Example

#### Rollershutter

This is an example how different Rollershutter commands can be written to Modbus.

Roller shutter position is read from register 0, `UP`/`DOWN` commands are written to register 1, and `MOVE`/`STOP` commands are written to register 2.

The logic of processing commands are summarized in the table

| Command | Number written to Modbus slave | Register index |
| ------- | ------------------------------ | -------------- |
| `UP`    | `1`                            | 1              |
| `DOWN`  | `-1`                           | 1              |
| `MOVE`  | `1`                            | 2              |
| `STOP`  | `0`                            | 2              |


`things/modbus_ex_rollershutter.things`:

```xtend
Bridge modbus:tcp:localhostTCPRollerShutter [ host="127.0.0.1", port=502 ] {
    Bridge poller holding [ start=0, length=3, refresh=1000, type="holding" ] {
        // Since we are using advanced transformation outputting JSON,
        // other write parameters (writeValueType, writeStart, writeType) can be omitted
        Thing data rollershutterData [ readStart="0", readValueType="int16", writeTransform="JS(rollershutter.js)" ]

        // For diagnostics
        Thing data rollershutterDebug0 [ readStart="0", readValueType="int16", writeStart="0", writeValueType="int16", writeType="holding" ]
        Thing data rollershutterDebug1 [ readStart="1", readValueType="int16" ]
        Thing data rollershutterDebug2 [ readStart="2", readValueType="int16" ]
    }
}
```

`items/modbus_ex_rollershutter.items`:

```xtend
// We disable auto-update to make sure that rollershutter position is updated from the slave, not "automatically" via commands
Rollershutter RollershutterItem "Roller shutter position [%.1f]" <temperature> { autoupdate="false", channel="modbus:data:localhostTCPRollerShutter:holding:rollershutterData:rollershutter" }

// For diagnostics
Number RollershutterItemDebug0 "Roller shutter Debug 0 [%d]" <temperature> { channel="modbus:data:localhostTCPRollerShutter:holding:rollershutterDebug0:number" }
Number RollershutterItemDebug1 "Roller shutter Debug 1 [%d]" <temperature> { channel="modbus:data:localhostTCPRollerShutter:holding:rollershutterDebug1:number" }
Number RollershutterItemDebug2 "Roller shutter Debug 2 [%d]" <temperature> { channel="modbus:data:localhostTCPRollerShutter:holding:rollershutterDebug2:number" }
```

`sitemaps/modbus_ex_rollershutter.sitemap`:

```xtend
sitemap modbus_ex_rollershutter label="modbus_ex_rollershutter" {
    Switch item=RollershutterItem label="Roller shutter [(%d)]" mappings=[UP="up", STOP="X", DOWN="down", MOVE="move"]

    // For diagnostics
    Setpoint item=RollershutterItemDebug0 minValue=0 maxValue=100 step=20
    Text item=RollershutterItemDebug0
    Text item=RollershutterItemDebug1
    Text item=RollershutterItemDebug2
}
```

`transform/rollershutter.js`:

```javascript
// Wrap everything in a function
// variable "input" contains data passed by openhab
(function(cmd) {
    var cmdToValue = {"UP": 1,  "DOWN": -1, "MOVE": 1, "STOP": 0};
    var cmdToAddress = {"UP": 1, "DOWN": 1, "MOVE": 2, "STOP": 2};

    var value = cmdToValue[cmd];
    var address = cmdToAddress[cmd];
    if(value === undefined || address === undefined) {
        // unknown command, do not write anything
        return "[]";
    } else {
        return (
            "["
              + "{\"functionCode\": 6, \"address\":" + address.toString() + ", \"value\": [" + value +  "] }"
            + "]"
        );
    }
})(input)
```

### Eager Updates Using REFRESH

In many cases fast enough poll interval is pretty long, e.g. 1 second.
This is problematic in cases when faster updates are wanted based on events in openHAB.

For example, in some cases it is useful to update faster when a command is sent to some specific items.

Simple solution is just increase the poll period with the associated performance penalties and possible burden to the slave device.

It is also possible to use `REFRESH` command to ask the binding to update more frequently for a short while.

`rules/fast_refresh.rules`:

```javascript
import org.eclipse.xtext.xbase.lib.Procedures
import org.eclipse.smarthome.core.types.RefreshType

val Procedures$Procedure0 refreshData = [ |
    // Refresh SetTemperature. In fact, all data things in the same poller are refreshed
    SetTemperature.sendCommand(RefreshType.REFRESH)
    return null
]

rule "Refresh modbus data quickly after changing settings"
when
    Item VacationMode received command or
    Item HeatingEnabled received command
then
    if (receivedCommand != RefreshType.REFRESH) {
        // Update more frequently for a short while, to get
        // refereshed data after the newly received command
        refreshData()
        createTimer(now.plus(100), refreshData)
        createTimer(now.plus(200), refreshData)
        createTimer(now.plus(300), refreshData)
        createTimer(now.plus(500), refreshData)
    }
end
```

Please be aware that `REFRESH` commands are "throttled" (to be exact, responses are cached) with `poller` parameter `cacheMillis`.

## Changes From Modbus 1.x Binding

The older Modbus binding is quite different to the new binding.
Major difference is the thing structure introduced in new openHAB2 binding which allows configuration uisng the PaperUI.

Unfortunately there is no conversion tool to convert old configurations to new thing structure.

Due to the introduction of things, the configuration was bound to be backwards incompatible.
This offered opportunity to simplify some aspects of configuration.
The major differences are configuration logic are:

### Absolute Addresses Instead Of Relative

The new Modbus binding uses *absolute* addresses.
This means that all parameters referring to addresses of input registers, holding registers, discrete inputs or coils are *entity addresses*.
This means that the addresses start from zero (first entity), and can go up to 65 535. See [Wikipedia explanation](https://en.wikipedia.org/wiki/Modbus#Coil.2C_discrete_input.2C_input_register.2C_holding_register_numbers_and_addresses) for more information.

Previous binding sometimes used absolute addresses (`modbus.cfg`), sometimes relative to polled data (items configuration).

### Register And Bit Addressing

Now 32 bit value types refer start register address. For example `valueType="int32"` with `start="3"` refers to 32 bit integer in registers `3` and `4`.

The old binding could not handle this case at all since it was assumed that the values were addressed differently.
Read index of `3` would refer to 32 bit integer in registers `3*2=6` and `3*2+1=7`.
It was not possible to refer to 32 bit type starting at odd index.

It is still not possible to read 32 bit value type starting "middle" of register.
However, if such need arises the addressing syntax is extensible to covert these cases.

Bits, and other <16 bit value types, inside registers are addressed using `start="X.Y"` convention.
This is more explicit notation hopefully reduces the risk of misinterpretation.

### Polling Details

The new binding polls data in parallel which means that errors with one slave do not necessarily slow down polling with some other slave.

Furthermore, once can disable polling altogether and trigger polling on-demand using `REFRESH`.

### Transformation Changes

With the new binding the transformations get slightly different input. In polling, the transformation always receives number as input (see [Read steps](#read-steps)).
Old binding had converted the input based on item type.

### Trigger Removed

The old binding had `trigger` parameter in item configuration to react only to some openHAB commands, or to some polled states.
There is no trigger anymore but one can use transformations to accomplish the same thing. See [Transformations](#transformations) for examples.

### Support For 32 Bit Value Types In Writing

The new binding supports 32 bit values types when writing.

## Troubleshooting

### Thing Status

Check thing status for errors in configuration or communication.

### Enable Verbose Logging

Enable `DEBUG` or `TRACE` (even more verbose) logging for the loggers named:

* `org.openhab.binding.modbus`
* `org.openhab.io.transport.modbus`
* `net.wimpi.modbus`

Consult [openHAB2 logging documentation](http://docs.openhab.org/administration/logging.html#defining-what-to-log) for more information.

## For Developers

### Testing Serial Implementation

You can use test serial slaves without any hardware on linux using these steps:

1. Set-up virtual null modem emulator using [tty0tty](https://github.com/freemed/tty0tty)
2. Download [diagslave](http://www.modbusdriver.com/diagslave.html) and start modbus serial slave up using this command:

```
./diagslave -m rtu -a 1 -b 38400 -d 8 -s 1 -p none -4 10 /dev/pts/7
```

3. Configure openHAB's modbus slave to connect to `/dev/pts/8`:

```
xxx.connection=/dev/pts/8:38400:8:none:1:rtu
```

4. Modify `start.sh` or `start_debug.sh` to include the unconventional port name by adding the following argument to `java`:

```
-Dgnu.io.rxtx.SerialPorts=/dev/pts/8
```

Naturally this is not the same thing as the real thing but helps to identify simple issues.

### Testing TCP Implementation

1. Download [diagslave](http://www.modbusdriver.com/diagslave.html) and start modbus tcp server (slave) using this command:

```
./diagslave -m tcp -a 1 -p 55502
```

2. Configure openHAB's modbus slave to connect to `127.0.0.1:55502`:

```
tcp.slave1.connection=127.0.0.1:55502
```

### Writing Data

See this [community post](https://community.openhab.org/t/something-is-rounding-my-float-values-in-sitemap/13704/32?u=ssalonen) explaining how `pollmb` and `diagslave` can be used to debug modbus communication.

You can also use `modpoll` to write data:


```bash
# write value=5 to holding register 40001 (index=0 in the binding)
./modpoll -m tcp -a 1 -r 1 -t4 -p 502 127.0.0.1 5
# set coil 00001 (index=0 in the binding) to TRUE
./modpoll -m tcp -a 1 -r 1 -t0 -p 502 127.0.0.1 1
# write float32
./modpoll -m tcp -a 1 -r 1 -t4:float -p 502 127.0.0.1 3.14
```
