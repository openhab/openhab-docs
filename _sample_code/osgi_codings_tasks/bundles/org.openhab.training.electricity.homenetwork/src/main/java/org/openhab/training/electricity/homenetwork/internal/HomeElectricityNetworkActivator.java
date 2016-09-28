/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.homenetwork.internal;

import org.openhab.training.electricity.homenetwork.HomeElectricityNetwork;
import org.openhab.training.electricity.provider.ElectricityProvider;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

/**
 * HomeElectricityNetworkActivator starts the {@link HomeElectricityNetwork}
 * bundle.
 * 
 * @author Kiril Atanasov - Initial contribution
 */
public class HomeElectricityNetworkActivator implements BundleActivator {

    /** is used to unregister the service, when it is stopped */
    private ServiceRegistration<?> registration;

    /**
     * {@inheritDoc}
     * <p>
     * Registers the {@link HomeElectricityNetwork} service.
     */
    @Override
    public void start(BundleContext context) throws Exception {
        registration = context.registerService(ElectricityProvider.class.getName(), new HomeElectricityNetwork(), null);
    }

    /**
     * {@inheritDoc}
     * <p>
     * Unregisters the {@link HomeElectricityNetwork} service.
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        registration.unregister();
    }

}
