/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.radio.internal;

import org.openhab.training.electricity.consumer.ElectricityConsumer;
import org.openhab.training.electricity.radio.BasicRadio;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

/**
 * The {@link BasicRadioActivator} class is responsible to activate this module.
 * 
 * This module registers the {@link BasicRadio} Service and sets its
 * currentElectricityProvider
 *
 * @author Kiril Atanasov - Initial contribution
 */
public class BasicRadioActivator implements BundleActivator {

    /**
     * {@link #basicRadioServiceRegistration} is used to unregister the service
     * when the bundle is stopped
     */
    private ServiceRegistration<ElectricityConsumer> basicRadioServiceRegistration;

    private BasicRadio basicRadioService;

    @SuppressWarnings("unchecked")
    @Override
    public void start(BundleContext context) throws Exception {

        /*
         * registering BasicRadio as a service and saving the service
         * registration in basicRadioServiceRegistration
         */
        basicRadioServiceRegistration = (ServiceRegistration<ElectricityConsumer>) context
                .registerService(ElectricityConsumer.class.getName(), new BasicRadio(), null);

        /*
         * getting a reference to the service using the ServiceRegistration
         * object
         */
        @SuppressWarnings("rawtypes")
        ServiceReference basicRadioServiceReference = basicRadioServiceRegistration.getReference();

        // getting the service using the service reference
        basicRadioService = (BasicRadio) context.getService(basicRadioServiceReference);

        // starting the BasicRadio
        basicRadioService.start();

    }

    /**
     * {@inheritDoc}
     * <p>
     * Stops the basicRadioService from broadcasting. Unregisters the
     * basicRadioServiceRegistration
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        basicRadioService.stop();
        basicRadioServiceRegistration.unregister();
    }

}
