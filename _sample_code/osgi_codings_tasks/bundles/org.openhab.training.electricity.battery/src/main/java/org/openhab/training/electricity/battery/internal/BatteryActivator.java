/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.battery.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.openhab.training.electricity.battery.Battery;
import org.openhab.training.electricity.provider.ElectricityProvider;

/**
 * A class used to customize the starting and stopping of our bundle. When the
 * bundle is started and stopped, the start and stop methods of the
 * BundleActivator interface are called.
 * 
 * @author Kiril Atanasov - Initial contribution
 */

@SuppressWarnings("unchecked")
public class BatteryActivator implements BundleActivator {
	
	/**
	 * An object which is returned by the Framework when the bundle is
	 * successfully registered as a service.
	 * <p>
	 * It will be used in the {@link #stop(BundleContext)} method to unregister
	 * this bundle.
	 */
	private ServiceRegistration<Battery> batteryServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {
		// register the service
		batteryServiceRegistration = (ServiceRegistration<Battery>) context
				.registerService(ElectricityProvider.class.getName(), new Battery(), null);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// remove the service from the registry
		batteryServiceRegistration.unregister();
	}
}
