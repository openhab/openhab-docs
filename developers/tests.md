---
layout: developersguide
title: Writing tests
---

# Tests

There are two approaches for testing:
Unit tests and integration tests.

Integration tests start up parts of the openHAB framework and the test is performed with real OSGi services.
Tests of this kind should be used rarely as they increase the overall test runtime considerably.
But it usually makes sense to have at least one integration test for a complex extension,
to make sure everything (all your OSGi services) start up correctly.

## Unit tests

Each class inside the `src/test` folder will have all public methods with a `@Test` annotation  automatically executed as a test.
Inside the class one can refer to all classes from the host bundle and all imported classes.

The following code snippet shows a simple JUnit test which tests the `toString` conversation of a PercentType.

```java
public class PercentTypeTest {
    @Test
    public void DoubleValue() {
        PercentType pt = new PercentType("0.0001");
        assertEquals("0.0001", pt.toString());
    }
}
```

Using the [hamcrest matcher library](http://hamcrest.org/JavaHamcrest/) is a good way to write expressive assertions.
In contrast to the original assertion statements from JUnit the hamcrest matcher library allows to define the assertion in a more natural order:

```java
PercentType pt = new PercentType("0.0001");
assertThat(pt.toString(), is(equalTo("0.0001")));
```

### Mockito

In order to keep tests as focused as possible we use the mocking framework [<https://github.com/mockito/mockito> Mockito].
Mockito lets us verify interactions between supporting classes and the unit under test and additionally supports stubbing of method calls for these classes.
Please read the very short but expressive introduction on the [<https://site.mockito.org/> Mockito homepage] in addition to this small example:

```java
public class MyBindingHandlerTest {

    private ThingHandler handler;

    private @Mock ThingHandlerCallback callback;
    private @Mock Thing thing;

    @Before
    public void setUp() {
        initMocks(this);
        handler = new MyBindingHandler(thing);
        handler.setCallback(callback);
    }

    @After
    public void tearDown() {
        // Free any resources, like open database connections, files etc.
        handler.dispose();
    }

    @Test
    public void initializeShouldCallTheCallback() {
        // we expect the handler#initialize method to call the callback during execution and
        // pass it the thing and a ThingStatusInfo object containing the ThingStatus of the thing.
        handler.initialize();

        // verify the interaction with the callback.
        // Check that the ThingStatusInfo given as second parameter to the callback was build with the ONLINE status:
        verify(callback).statusUpdated(eq(thing), argThat(arg -> arg.getStatus().equals(ThingStatus.ONLINE)));
    }

}
```

### Assertions

Here is small example on when to use Hamcrest or JUnit assertions.
In general Hamcrest should be favoured over JUnit as for the more advanced and detailed error output:

```java
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.core.StringContains.containsString;
...
@Test
public void assertionsToBeUsed() {
    // use JUnit assertions for very basic checks:
    assertNotNull(new Object());
    assertNull(null);

    boolean booleanValue = true;
    assertTrue(booleanValue); // test boolean values only, no conditions or constraints

    // use Hamcrest assertions for everything else:
    assertThat("myString", is("myString"));
    assertThat("myString", is(instanceOf(String.class)));
    assertThat("myString", containsString("yS"));
    assertThat(Arrays.asList("one", "two"), hasItem("two"));
    assertThat(Arrays.asList("one", "two"), hasSize(2));

    // also valuable for null/boolean checks as the error output is advanced:
    assertThat(null, is(nullValue()));
    assertThat(new Object(), is(not(nullValue())));
    assertThat(true, is(not(false)));
}
```

## Integration tests

Some components of openHAB are heavily bound to the OSGi runtime,
because they use OSGi core services like the `EventAdmin` or the `ConfigurationAdmin` or the `ItemRegistry`
That makes it hard to test those components outside of the OSGi container.

Integration tests allow to run test classes that extend `JavaOSGiTest` inside an OSGi runtime.
They reside as separate bundles in the `itests/` directory.
A .bndrun file must be provided with your integration test to configure the runtime.

Those kind of tests should be used sparingly as the setup is more complex and introduces execution overhead.
Most situations can be tested using mocks (see [Mockito](#mockito)) and unit tests.

From maven one can execute the test with `mvn install` command from the folder of the test fragment bundle.

### Example

The base class `JavaOSGiTest` sets up a bundle context and has convenience methods for registering mocks as OSGi services and the retrieval of registered OSGi services.
Public methods with a @Test annotation will automatically be executed as OSGi tests, as long as the class-name ends with `Test`.
The following JUnit/Mockito test class shows how to test the `ItemRegistry` by providing a mocked `ItemProvider`.

```java
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.openhab.core.items.Item;
import org.openhab.core.items.ItemProvider;
import org.openhab.core.items.ItemRegistry;
import org.openhab.core.library.items.SwitchItem;
import org.openhab.test.java.JavaOSGiTest;

import com.google.common.collect.Lists;

public class JavaItemRegistryOSGiTest extends JavaOSGiTest {

    private static String ITEM_NAME = "switchItem";
    private ItemRegistry itemRegistry;

    private @Mock ItemProvider itemProvider;

    @Before
    public void setUp() {
        initMocks(this);
        itemRegistry = getService(ItemRegistry.class);
        when(itemProvider.getAll()).thenReturn(Lists.newArrayList(new SwitchItem(ITEM_NAME)));
    }

    @Test
    public void getItemsShouldReturnItemsFromRegisteredItemProvider() {
        assertThat(itemRegistry.getItems(), hasSize(0));

        registerService(itemProvider);

        List<Item> items = new ArrayList<>(itemRegistry.getItems());
        assertThat(items, hasSize(1));
        assertThat(items.get(0).getName(), is(equalTo(ITEM_NAME)));

        unregisterService(itemProvider);

        assertThat(itemRegistry.getItems(), hasSize(0));
    }
}
```

In the `setUp` method all mocks (annotated with @Mock) are created.
This is `itemProvider` for this test.
Then the `ItemRegistry` OSGi service is retrieved through the method `getService` from the base class `OSGiTest` and assigned to a private variable.
Then the `ItemProvider` mock is configured to return a list with one SwitchItem when `itemProvider#getAll` gets called.
The test method first checks that the registry delivers no items by default.
Afterwards it registers the mocked `ItemProvider` as OSGi service with the method `registerService` and checks if the `ItemRegistry` returns one item now.
At the end the mock is unregistered again.

## Common errors

### Failed to execute goal org.eclipse.tycho:tycho-surefire-plugin:XXX:test (default-test) on project XXX: No tests found

Maven might report this error when building your project, it means that the maven surefire plugin cannot find any tests to execute, please check the following details:

- Did you add any test classes with a class-name which ends with `Test` (singular)
- Did you annotate any methods with `@Test`
