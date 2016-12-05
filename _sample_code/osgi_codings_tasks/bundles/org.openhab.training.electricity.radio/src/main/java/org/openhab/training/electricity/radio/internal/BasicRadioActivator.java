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
 * A class used to customize the starting and stopping of our bundle. When the
 * bundle is started and stopped, the start and stop methods of the
 * BundleActivator interface are called.
 * 
 * @author Kiril Atanasov - Initial contribution
 */
public class BasicRadioActivator implements BundleActivator {

	/**
	 * An object which is returned by the Framework when the bundle is
	 * successfully registered as service.
	 * <p>
	 * It will be used in the {@link #stop(BundleContext)} method to unregister
	 * this bundle.
	 */
	private ServiceRegistration<ElectricityConsumer> basicRadioServiceRegistration;

	/**
	 * An instance of the {@link BasicRadio} class which will be registered as
	 * service
	 */
	private BasicRadio basicRadioService;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void start(BundleContext context) throws Exception {
		// register the BasicRadio class as a service
		basicRadioServiceRegistration = (ServiceRegistration<ElectricityConsumer>) context
				.registerService(ElectricityConsumer.class.getName(), new BasicRadio(), null);
		// getting the registered service from the registry
		ServiceReference basicRadioServiceReference = basicRadioServiceRegistration.getReference();
		basicRadioService = (BasicRadio) context.getService(basicRadioServiceReference);
		// start the radio
		basicRadioService.startConsuming();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// stop the radio broadcasting
		basicRadioService.stopConsuming();
		// remove the service from the registry
		basicRadioServiceRegistration.unregister();
	}
}
