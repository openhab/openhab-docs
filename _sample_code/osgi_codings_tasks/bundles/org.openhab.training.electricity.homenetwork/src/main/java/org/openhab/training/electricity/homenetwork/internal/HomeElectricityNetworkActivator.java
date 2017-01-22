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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A class used to customize the starting and stopping of our bundle. When the
 * bundle is started and stopped, the start and stop methods of the
 * BundleActivator interface are called.
 * 
 * @author Kiril Atanasov - Initial contribution
 */
public class HomeElectricityNetworkActivator implements BundleActivator {

	/** Used to display messages on the console */
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * An object which is returned by the Framework when the bundle is
	 * successfully registered as service.
	 * <p>
	 * It will be used in the {@link #stop(BundleContext)} method to unregister
	 * this bundle.
	 */
	private ServiceRegistration<?> registration;

	/**
	 * {@inheritDoc}
	 * <p>
	 * In this case we use it to register the {@link HomeElectricityNetwork}
	 * service.
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		registration = context.registerService(ElectricityProvider.class.getName(), new HomeElectricityNetwork(), null);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * In this case we use it to unregister the {@link HomeElectricityNetwork}
	 * service.
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		registration.unregister();
	}

}
