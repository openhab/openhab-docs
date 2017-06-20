/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.tv;

import org.openhab.training.electricity.consumer.ElectricityConsumer;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

/**
 * The class {@link TVActivator} is responsible for the activation of this
 * bundle.
 *
 * @author Kiril Atanasov - Initial contribution
 */
public class TVActivator implements BundleActivator {

    private TvPowerProviderTracker tracker;

    private ServiceRegistration<TV> tvServiceRegistration;

    /**
     * {@inheritDoc}
     * <p>
     * Registers a TV and a TVServiceTracker service.
     */
    @SuppressWarnings("unchecked")
    @Override
    public void start(BundleContext context) throws Exception {
        // A TV instance. We could register a service with it
        TV tv = new TV();

        // Registering the TV Service
        tvServiceRegistration = (ServiceRegistration<TV>) context.registerService(ElectricityConsumer.class.getName(),
                tv, null);

        /*
         * we are linking the reference to an actual {@link TVServiceTracker}
         * object
         */
        tracker = new TvPowerProviderTracker(context, tv);

        tracker.open();

        // The TV is starting to consume power from the providers
        tracker.getTV().startConsuming();

    }

    /**
     * {@inheritDoc}
     * <p>
     * Stops and unregisters the TVServiceTracker service. Unregistering the TV
     * Service.
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        tracker.getTV().stopConsuming();
        tvServiceRegistration.unregister();
        tracker.close();
    }

}
