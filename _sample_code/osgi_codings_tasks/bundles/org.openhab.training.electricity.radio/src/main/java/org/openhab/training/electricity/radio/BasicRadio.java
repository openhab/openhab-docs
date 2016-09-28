/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.radio;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.openhab.training.electricity.consumer.ElectricityConsumer;
import org.openhab.training.electricity.provider.ElectricityProvider;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The class {@link BasicRadio} uses power from an {@link ElectricityProvider}
 * and when the {@link ElectricityProvider} can provide enough power the
 * {@link BasicRadio} is broadcasting.
 * 
 * @author Kiril Atanasov - Initial contribution
 */
public class BasicRadio implements ElectricityConsumer {

    /** {@link #logger} is used for logging */
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    /** The {@link ElectricityProvider} that the class is going to use */
    protected ElectricityProvider currentElectricityProvider;

    /** The energy consumption of the radio */
    protected final int RADIO_CONSUMPTION = 5;

    /**
     * The amount of time(in seconds) the Radio will wait before trying to print
     * another message.
     */
    private final int BROADCAST_PERIOD = 5;

    /**
     * It is not advised to start a Thread on its own. That's why we are using a
     * ScheduledExecutorService. It will be able to run only one Thread at a
     * time.
     */
    private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

    /**
     * First there is a check if there is an available
     * {@link ElectricityProvider}. If that is the case the available provider
     * is set as {@link #currentElectricityProvider}
     * <p>
     * This runnable object prints a message only if there is an
     * {@link #currentElectricityProvider}, which can provide it with enough
     * power otherwise it stops.
     */
    protected Runnable broadcastingAction = new Runnable() {

        @Override
        public void run() {
            if (istheCurrentElectricityProviderAvailable()) {
                String currentProviderName = currentElectricityProvider.toString();
                if (currentElectricityProvider.provide(RADIO_CONSUMPTION)) {
                    logger.info("runs on {}", currentProviderName);
                } else {
                    logger.info("{} is depleted.", currentProviderName);
                    stop();
                }
            } else {
                String missingCurrentProvider = currentElectricityProvider.toString();
                logger.info("{} is no longer available.", missingCurrentProvider);
                stop();
            }
        }
    };

    /**
     * {@inheritDoc}
     * <p>
     * Sets the {@link #currentElectricityProvider} if missing.
     */
    @Override
    public void start() {
        logger.info("starts");
        setCurrentElectricityProviderAtStart();
        scheduler.scheduleAtFixedRate(broadcastingAction, 0L, BROADCAST_PERIOD, TimeUnit.SECONDS);
    }

    /**
     * {@inheritDoc}
     * <p>
     * "It is important to stop the scheduler. Otherwise it will continue
     * displaying messages after we stop the bundle.
     */
    @Override
    public void stop() {
        scheduler.shutdown();
        logger.info("stops. You must restart the bundle.");
    }

    @Override
    public void setCurrentProvider(ElectricityProvider electricityProvider) {
        currentElectricityProvider = electricityProvider;
    }

    /**
     * {@inheritDoc}
     * <p>
     * Getting a list with all the available services using the
     * {@link ElectricityProvider} interface.
     */
    @Override
    public List<ElectricityProvider> getAllAvailableProviders() {

        // The list where we are going to keep the results
        List<ElectricityProvider> availableProviders = new ArrayList<>();

        /*
         * Since this method is not in an activator, we will get the
         * BundleContext through FrameworkUtil
         */
        BundleContext bundleContext = FrameworkUtil.getBundle(this.getClass()).getBundleContext();

        try {
            @SuppressWarnings("unchecked")
            ServiceReference<ElectricityProvider>[] electricityProvidersServiceReferences = 
                (ServiceReference<ElectricityProvider>[]) bundleContext
                    .getServiceReferences(ElectricityProvider.class.getName(), null);
            /*
             * if there are no service references
             * electricityProvidersServiceReferences will be null, which could
             * lead to problems, that's why there is a check in the for loop.
             */
            for (int i = 0; electricityProvidersServiceReferences != null
                    && i < electricityProvidersServiceReferences.length; i++) {
                // we are getting the services from the bundleContext
                ElectricityProvider provider = bundleContext
                        .getService(electricityProvidersServiceReferences[i]);
                availableProviders.add(provider);
            }
        } catch (InvalidSyntaxException e) {
            logger.error("Error occured while extracting the available providers.", e);
        }

        return availableProviders;
    }

    @Override
    public ElectricityProvider getCurrentElectricityProvider() {
        return this.currentElectricityProvider;
    }

    /** Checks if the {@link #currentElectricityProvider} is still available. */
    private boolean istheCurrentElectricityProviderAvailable() {
        if (!getAllAvailableProviders().contains(currentElectricityProvider)) {
            return false;
        } else {
            return true;
        }
    }

    /** sets the {@link #currentElectricityProvider} only if its missing. */
    private void setCurrentElectricityProviderAtStart() {
        List<ElectricityProvider> availableProviders = getAllAvailableProviders();
        if (!availableProviders.isEmpty()) {
            currentElectricityProvider = availableProviders.get(0);
        } else {
            logger.error("There are no available providers.");
        }
    }

}
