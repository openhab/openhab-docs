/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.tv;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.openhab.training.electricity.battery.Battery;
import org.openhab.training.electricity.consumer.ElectricityConsumer;
import org.openhab.training.electricity.dynamicconsumer.DynamicConsumer;
import org.openhab.training.electricity.homenetwork.HomeElectricityNetwork;
import org.openhab.training.electricity.provider.ElectricityProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The class {@link TV} can use two types of {@link ElectricityProvider}s
 * -{@link HomeElectricityNetwork} and {@link Battery}, but only one of them at
 * a time. The {@link HomeElectricityNetwork} is with priority. If there is no
 * {@link ElectricityProvider} or the available {@link ElectricityProvider}(s)
 * can't provide enough charge, the {@link TV} waits(doesn't print anything),
 * but it is active - if a provider, which could supply enough energy is added
 * the TV starts broadcasting.
 * <p>
 * Due to the specifics of the {@link ElectricityProvider} interface all the
 * available {@link ElectricityProvider}s will be divided into two groups:
 * <ul>
 * <li>{@link #usableProviders} is where all the new providers will be put, the
 * {@link TV} will use them until they are depleted, after which they will be
 * moved to the other group.</li>
 * <li>{@link #depletedProviders} is where all the providers that can't provide
 * enough power to run the {@link TV} are.</li>
 * </ul>
 * This separation into two groups is made, so that the {@link TV} can keep
 * track of which providers are usable and which are depleted. This is very
 * important when choosing which {@link ElectricityProvider} to use.
 * <p>
 * In {@link #usableProviders} the {@link ElectricityProvider}s will be ordered
 * based on their rating. Their rating will be determined in the
 * {@link ProvidersComparatorForTV#getRating(ElectricityProvider)}, based on the
 * type of the {@link ElectricityProvider}. If one provider has higher rating
 * than another, it must be used before the second.
 * 
 * @author Kiril Atanasov - Initial contribution
 * @author Elena Miovska - sorting the {@link ElectricityProvider}s based on
 *         their type, and picking the {@link #currentElectricityProvider} among
 *         them.
 */
public class TV implements ElectricityConsumer, DynamicConsumer {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * Holds all the {@link ElectricityProvider}s the TV can use. They will be
     * ordered according to the criteria specified in
     * {@link ProvidersComparatorForTV}.
     */
    protected PriorityQueue<ElectricityProvider> usableProviders = new PriorityQueue<>(new ProvidersComparatorForTV());

    /** A list of the depleted {@link ElectricityProvider}s */
    protected List<ElectricityProvider> depletedProviders = new ArrayList<>();

    /**
     * The {@link ElectricityProvider} that the TV uses at the moment, the one
     * it will try to utilize.
     */
    protected ElectricityProvider currentElectricityProvider;

    /** The power consumption of the TV */
    protected final int TV_CONSUMPTION = 10;

    /** The time (in seconds) the TV waits before trying to use a provider */
    protected final int BROADCASTING_PERIOD = 5;

    /**
     * {@inheritDoc}
     * <p>
     * After the {@link ElectricityProvider} has been added we check if the
     * {@link #currentElectricityProvider} should be changed.
     */
    @Override
    public synchronized void providerAdded(ElectricityProvider electricityProvider) {
        usableProviders.add(electricityProvider);
        if (shouldTheCurrentProviderBeChanged(electricityProvider)) {
            setCurrentProvider();
        }
    }

    /**
     * Determines if the {@link #currentElectricityProvider} should be changed,
     * when adding a new {@link ElectricityProvider}.
     * 
     * @param electricityProvider
     *            the {@link ElectricityProvider} that has been added.
     * @return true if {@link #currentElectricityProvider} should be changed,
     *         false otherwise.
     */
    private boolean shouldTheCurrentProviderBeChanged(ElectricityProvider electricityProvider) {
        return currentElectricityProvider == null || ProvidersComparatorForTV
                .isTheSecondProviderWithHigherPriority(currentElectricityProvider, electricityProvider);
    }

    /**
     * {@inheritDoc}
     * <p>
     * If the electricityProvider, which is being removed is also the
     * {@link #currentElectricityProvider} then the
     * {@link #currentElectricityProvider} is set to {@code null}.
     * 
     * @param electricityProvider
     *            the {@link ElectricityProvider} service which has been removed
     */
    @Override
    public synchronized void providerRemoved(ElectricityProvider electricityProvider) {
        if (usableProviders.contains(electricityProvider)) {
            usableProviders.remove(electricityProvider);
        } else {
            depletedProviders.remove(electricityProvider);
        }

        if (currentElectricityProvider == electricityProvider) {
            removeCurrentElectricityProvider();
        }
    }

    /**
     * Changes the {@link #currentElectricityProvider} to another
     * {@link #currentElectricityProvider}.
     */
    protected void removeCurrentElectricityProvider() {
        logger.info("provider {} is no longer available. ", currentElectricityProvider.toString());
        setCurrentProvider();
    }

    /**
     * The {@link #currentElectricityProvider} is set to be the head of the
     * {@link #usableProviders} or {@code null} if there are no usable
     * providers.
     */
    public void setCurrentProvider() {
        setCurrentProvider(usableProviders.peek());
    }

    @Override
    public void setCurrentProvider(ElectricityProvider electricityProvider) {
        currentElectricityProvider = electricityProvider;
    }

    /**
     * {@inheritDoc}
     * <p>
     * The TV starts the scheduler. The scheduler starts running and will run
     * until given the shutdownNow() command.
     */
    @Override
    public void start() {
        scheduler.scheduleAtFixedRate(broadcastingAction, 0, BROADCASTING_PERIOD, TimeUnit.SECONDS);
    }

    /**
     * {@inheritDoc}
     * <p>
     * The TV invokes the {@link #scheduler}'s stop method, otherwise the
     * {@link #scheduler} will continue running even after the {@link TV} bundle
     * is stopped.
     */
    @Override
    public void stop() {
        scheduler.shutdownNow();
    }

    @Override
    public List<ElectricityProvider> getAllAvailableProviders() {
        return new ArrayList<ElectricityProvider>(usableProviders);
    }

    /**
     * It is not advised to start a Thread on its own. That's why we are using a
     * ScheduledExecutorService. It will be able to run only one Thread at a
     * time.
     */
    protected final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

    /**
     * {@link #broadcastingAction} checks if there are any
     * {@link ElectricityProvider}s in {@link #usableProviders}. If so this
     * means the {@link TV} could be able to broadcast. If an
     * {@link ElectricityProvider} gets depleted it is moved to the
     * {@link #depletedProviders} and a message is being displayed.
     */
    protected Runnable broadcastingAction = new Runnable() {

        @Override
        public void run() {
            synchronized (TV.this) {
                if (!usableProviders.isEmpty()) {
                    if (currentElectricityProvider.provide(TV_CONSUMPTION)) {
                        actWhenPowered();
                    } else {
                        actWhenNotPowered();
                        moveProviderFromUsableToDepleted(currentElectricityProvider);
                    }
                }
            }
        }
    };

    /** What will the {@link TV} do when it has enough power. */
    protected void actWhenPowered() {
        // Displaying a message which provider is in use.
        logger.info("broadcasting on {}", currentElectricityProvider.getClass().getName());
    }

    /**
     * What will the {@link TV} do when it has {@link ElectricityProvider} but
     * not enough power.
     */
    protected void actWhenNotPowered() {
        // Displaying a message that the provider in use has been depleted.
        logger.info("provider {} is depleted. ", currentElectricityProvider.toString());

    }

    /**
     * Moves an {@link ElectricityProvider} from {@link #usableProviders} to
     * {@link #depletedProviders}. If the {@link #usableProviders} is empty it
     * displays a notification message.
     * 
     * @param electricityProvider
     *            the {@link ElectricityProvider} that must be moved.
     */
    protected void moveProviderFromUsableToDepleted(ElectricityProvider electricityProvider) {
        usableProviders.remove(electricityProvider);
        depletedProviders.add(electricityProvider);
        if (usableProviders.isEmpty()) {
            logger.info("There are no more usable providers");
        } else {
            setCurrentProvider();
        }
    }

    @Override
    public ElectricityProvider getCurrentElectricityProvider() {
        return this.currentElectricityProvider;
    }
}

/**
 * This class will implement the logic by which the {@link ElectricityProvider}s
 * will be arranged in {@link #usableProviders}.
 */
class ProvidersComparatorForTV implements Comparator<ElectricityProvider> {

    @Override
    public int compare(ElectricityProvider first, ElectricityProvider second) {
        return getRating(second) - getRating(first);
    }

    public static boolean isTheSecondProviderWithHigherPriority(ElectricityProvider first, ElectricityProvider second) {
        return getRating(first) - getRating(second) < 0;
    }

    public static int getRating(ElectricityProvider electricityProvider) {
        switch (electricityProvider.getType()) {
        case HOME_NETWORK:
            return 1000;
        case BATTERY:
            return 500;
        default:
            return 0;
        }
    }
}
