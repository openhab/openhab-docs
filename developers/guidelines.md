---
layout: developersguide
title: Coding Guidelines
---

{% include base.html %}

# Coding Guidelines
{:.no_toc}

The following guidelines apply to all (Java) code of the openHAB project.
They must be followed to ensure a consistent code base for easy readability and maintainability.
Exceptions can certainly be made, but they should be discussed and approved by a project maintainer upfront.

Note that this list also serves as a checklist for code reviews on pull requests.
To speed up the contribution process, we therefore advice to go through this checklist yourself before creating a pull request.

If you are just keen on binding development, you may skip this document first and come back later.

{::options toc_levels="2,3"/}
* TOC
{:toc}

## A. Directory and File Layout

The structure of a binding follows the structure of a typical OSGi bundle project.

```
|- src/main
|------- feature
|---------- feature.xml   Your OSGI feature file
|------- java             Your Java code
|---------- org/openhab/[...]
|- src/main/resources/ESH-INF
|---- binding
|------- binding.xml      Binding name, description, author and other meta data
|-----config              Configuration description files when not in things files
|------- *.xml
|---- i18n                Your localized binding texts
|------- *_<local>.properties
|---- thing               One or more xml files with thing descriptions
|------- *.xml
|- src/test
|------- java             It's easy to write unit tests and fellow developers will thank you
|---------- org/openhab/[...]
|------- resources        Any resource files used in your unit tests, like test data
|---------- [...]
|- NOTICE                 License information
|                         3rd party content has to be given in the NOTICE file
|- pom.xml                Build system file: Describe your dependencies here
|- README.md              The file describing your binding
```

* Every Java file must have a license header. You can run ```mvn license:format``` on the root of the repo to automatically add missing headers.

## B. Code formatting

In order to keep the code layout consistent, code formatting rules have been defined.
Rules are enforced as part of the build process using [Spotless Maven Plugin] (https://github.com/diffplug/spotless).

To check if your code is following the code style run `mvn spotless:check`
To reformat you code run `mvn spotless:apply`

Code styles files are located in here: https://github.com/openhab/openhab-core/tree/master/tools/codestyle/src/main/resources

### Java Code

The rules are defined using the Eclipse Java Formatter definitions. There are plugins available for several IDEs that support these definitons.

* Official OpenHAB Eclipse IDE [IDE setup](ide.html) is preconfigured
* Eclipse standalone installation
  - You can manually import [openhab_codestyle.xml](https://raw.githubusercontent.com/openhab/openhab-core/master/tools/codestyle/src/main/resources/openhab_codestyle.xml) via `Eclipse Preferences -> Java -> Code Style -> Formatter` and [openhab.importorder](https://raw.githubusercontent.com/openhab/openhab-core/master/tools/codestyle/src/main/resources/openhab.importorder) via `Eclipse Preferences -> Java -> Code Style -> Organize Imports`
* IntelliJ using plugin https://plugins.jetbrains.com/plugin/6546-eclipse-code-formatter
  - Same files as for the Eclipse standalone installation

### XML files

* Maven `pom.xml` files shall have 2 space indentation
* Other `xml` files shall have 1 tab indentation
* Line length shall be 120 characters

## C. Java Coding Style

* The [Java naming conventions](http://java.about.com/od/javasyntax/a/nameconventions.htm) should be used for source files.
* Generics must be used where applicable. See example below:

```java
public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2){
		return g1.get().equals(g2.get());
}
```

* Code MUST not show any warnings.
  Warnings that cannot be circumvented should be suppressed by using the `@SuppressWarnings` annotation.
* Your classes are generally organised within an internal package

```
org.openhab.binding.coolbinding.internal
org.openhab.binding.coolbinding.internal.handler
org.openhab.binding.coolbinding.internal.discovery
```

Remember that classes that are meant to be used by scripts or other bindings must be non internal.

* Every class, except data-transfer-objects (DTO), must be annotated with `@NonNullByDefault`.
  For details see [Null annotation](#null-annotations).
* OSGi Declarative Services annotations are to be used

```java
@Component(service=MyCoolService.class)
public class MyCoolService {
   @Reference
   private @NonNullByDefault({}) ItemRegistry itemRegistry;
}
```

## D. Documentation

JavaDoc is required to describe the purpose and usage of every:

* class,
* interface,
* enumeration (except inner classes and enums),
* constant, field and method with visibility of default, protected or public.

An @author tag is required within the JavaDoc for every author who made a substantial contribution to the file.
New @author tags should be placed below the older ones.
Data-transfer-objects (DTOs map from Json/XML to Java classes) do not require JavaDoc.

## E. Language Levels and Libraries

1. openHAB generally targets the long time supported Java 8 and Java 11 releases with the following restrictions:
 * To allow optimized runtimes, the set of Java packages to be used is further restricted to [Compact Profile 2](http://www.oracle.com/technetwork/java/embedded/resources/tech/compact-profiles-overview-2157132.html)
2. The [OSGi R6](http://www.osgi.org/Download/Release6) release with OSGI Compendium R7 is targeted, and newer features should not be used.
3. slf4j is used for logging.

You might also have the need to use other libraries for specific use cases like XML processing, networking etc.
See [Default libraries](#default-libraries) for more details.

## F. Runtime Behavior

1. Overridden methods from abstract classes or interfaces are expected to return fast unless otherwise stated in their JavaDoc. Expensive operations should therefore rather be scheduled as a job.
1. Creation of threads must be avoided. Instead, resort into using existing schedulers which use pre-configured thread pools. If there is no suitable scheduler available, start a discussion in the forum about it rather than creating a thread by yourself. For periodically executed jobs that do not require a fixed rate [scheduleWithFixedDelay](http://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ScheduledExecutorService.html#scheduleWithFixedDelay(java.lang.Runnable,%20long,%20long,%20java.util.concurrent.TimeUnit)) should be preferred over [scheduleAtFixedRate](http://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ScheduledExecutorService.html#scheduleAtFixedRate(java.lang.Runnable,%20long,%20long,%20java.util.concurrent.TimeUnit)).
1. Bundles need to cleanly start and stop without throwing exceptions or malfunctioning. This can be tested by manually starting and stopping the bundle from the console (```stop <bundle-id>``` resp. ```start <bundle-id>```).
1. Bundles must not require any substantial CPU time. Test this e.g. using "top" or VisualVM and compare CPU utilization with your bundle stopped vs. started.

## G. Logging

This section explains some logging usage patterns.
The logger that is used allows logging at multiple severity levels (trace, info, debug, warn, error).
Most of the time, a level of `warn` or `debug` will be used.
Please remember that every logging statement adds to code size and runtime cost.

* Loggers should be [non-static](http://slf4j.org/faq.html#declared_static), `final` when ever possible and have the name `logger`.

```java
class MyCoolClass {
   private final Logger logger = LoggerFactory.getLogger(MyCoolClass.class);
}
```

* Parametrized logging must be used (instead of string concatenation).

```java
void myFun() {
  String someValue = "abc";
  int someInt = 12;

  logger.log("Current value is {} and int is {}", someValue, someInt);
}
```

* Exceptions with stacktraces in the log are considered to be bugs in your binding that should be reported and fixed.
If you add an exception as a last parameter to the logging, the stack trace will be printed.
Configuration errors by users should only print log messages about what's wrong. In that case you would use `e.getMessage()`.

```java
void myFun() {
  try {
    doSomething();
  } catch (IOException e) {
    logger.warn("Explain what went wrong and how to avoid it. You can have arguments {}.", someVariable, e);  
  }
}
```

* Logging is not a replacement for using the debugger.

```java
void myFun() {
  logger.trace("Enter myfun"); // DONT, DONT, really DONT do that
  doSomething();
  logger.trace("Leave myfun"); // DONT, DONT, really DONT do that
}
```

* Logging is not a replacement to use respective `update*` methods of the framework

```java
void myFun() {
  logger.debug("And now the thing goes online"); // DONT, DONT, really DONT do that
  updateState(ThingState.ONLINE);
}
```

Logging levels should focus on the system itself and describe its state.
As every bundle is only one out of many, logging should be done very scarce.
It should be up to the user to increase the logging level for specific bundles, packages or classes if necessary.
This means in detail:

* `error` logging should only be used
  - to inform the user that something is tremendously wrong in his setup, the system cannot function normally anymore, and there is a need for immediate action.
  - in case some code fails irrecoverably and the user should report it as a severe bug.

* `warn` logging should only be used
  - to inform the user that something seems to be wrong in his overall setup, but the system can nonetheless function as normal,
  - in recoverable situations when a section of code that is not accessed under normal operating conditions is reached.

* `info` logging should be used sparsely.
  e.g. a newly started component or a user file that has been loaded.

* `debug` logging should be used for detailed logging
  - to give the user debug information in cases of unexpected behavior.
  - to log exceptions in case of temporary problems, like connection problems.
    In case of such exceptions this should be reflected in an updated state of the binding.

* `trace` logging should be used for verbose debug logging.
   For example printing output values that can be large, but can help when debugging changed external apis.

In general bindings should NOT log to error/warn if e.g. connections are dropped -
this is considered to be an external problem and from a system perspective to be a normal and expected situation.
The correct way to inform users about such events is to update the Thing status accordingl

Note that all events (including Thing status events) are anyhow already logged.

## H. Other code attributions

If you copy code from somewhere make sure that the license is compatible to the Eclipse License version 2.
This includes the Apache license, the Eclipse license v1, the MIT and BSD license.

You may also use Stackoverflow snippets, because they are automatically MIT licensed.

Please make sure to not remove author attributions or modify the license header in code files that you have copied.
Add the filename, author and license to the NOTICE file of your addon (except for short snippets, eg from Stackoverflow etc).

## I. Guideline details

This sections provides some background and more detailed information about parts of the guideline.

### Static Code Analysis

The openHAB Maven build includes [tooling for static code analysis](https://github.com/openhab/static-code-analysis) that will validate your code against the Coding Guidelines and some additional best practices.
Information about the checks can be found [here](https://github.com/openhab/static-code-analysis/blob/master/docs/included-checks.md).

The tool will generate an individual report for each bundle that you can find in `path/to/bundle/target/code-analysis/report.html` file and a report for the whole build that contains links to the individual reports in the `target/summary_report.html`.
The tool categorizes the found issues by priority: 1(error),2(warning) or 3(info).
If any error is found within your code the Maven build will end with failure.

You will receive detailed information (path to the file, line and message) listing all problems with Priority 1 and 2 on the console.

### Null Annotations

[Null annotations](https://wiki.eclipse.org/JDT_Core/Null_Analysis) are used from the Eclipse JDT project.

Those annotations help the compiler and our static code analyser to figure out if a potential null pointer access would happen in your code.

Classes (except data transfer objects (DTO)) must be annotated with `@NonNullByDefault`:

```java
@NonNullByDefault
public class MyClass(){}
```

This forces you to think about every field in your class if it can be null at any point, or should rather be default initialized.
If you have fields that are neither marked as nullable, nor are initialized, the code will not compile.

Fields that can be null are to be annotated like this:

```java
private @Nullable MyType myField;
```

The compiler will force you to check if `myField` is null, before using it:

```java
private void myFunction() {
  final MyType myField = this.myField; // You need a local copy of the field for thread safety.
  if (myField != null) {
    myField.soSomething();
  }
}
```

Methods should be annotated as follows:

```java
private @Nullable MyReturnType myMethod(){};
```

If you reference an OSGi service, OSGi will already make sure that the field is non-null.
The compiler doesn't know about that fact though.
You must therefore disable null-checks for such references:

```java
@Reference
private @NonNullByDefault({}) MyService injectedService;
```

### Default Libraries

In order to not have every binding use a different library, the following packages are available by default:

For XML Processing

* com.thoughtworks.xstream
* com.thoughtworks.xstream.annotations
* com.thoughtworks.xstream.converters
* com.thoughtworks.xstream.io
* com.thoughtworks.xstream.io.xml

For JSON Processing

* com.google.gson.*

For HTTP Operations

* org.eclipse.jetty.client.*
* org.eclipse.jetty.client.api.*
* org.eclipse.jetty.http.*
* org.eclipse.jetty.util.*

Note: HttpClient instances should be obtained by the handler factory through the HttpClientFactory service and unless there are specific configuration requirements, the shared instance should be used.

For Web Socket Operations

* org.eclipse.jetty.websocket.client
* org.eclipse.jetty.websocket.api

Note: WebSocketClient instances should be obtained by the handler factory through the WebSocketClientFactory service and unless there are specific configuration requirements, the shared instance should be used.

Additionally these libraries are allowed

* Apache Commons IO
* Apache Commons Lang
