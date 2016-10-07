/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.battery;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.openhab.training.electricity.provider.ElectricityProvider;

/**
 * The class {@link BatteryActivator} activates this bundle.
 * 
 * @author Kiril Atanasov - Initial contribution
 */
public class BatteryActivator implements BundleActivator {

    private ServiceRegistration<Battery> batteryServiceRegistration;

    @SuppressWarnings("unchecked")
    @Override
    public void start(BundleContext context) throws Exception {
        batteryServiceRegistration = (ServiceRegistration<Battery>) context
                .registerService(ElectricityProvider.class.getName(), new Battery(), null);
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        batteryServiceRegistration.unregister();
    }
}
