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
import org.openhab.training.electricity.homenetwork.HomeElectricityNetwork;
import org.openhab.training.electricity.provider.ElectricityProvider;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A representation of basic radio which is an {@link ElectricityConsumer} and
 * has a specific consumption. It runs only if there is a
 * {@link HomeElectricityNetwork} service available.
 * <p>
 * As a regular java class, it can implement {@link ElectricityConsumer} and
 * {@link BundleActivator} at the same time but we prefer to create a separate
 * {@link BasicRadioActivator} class. In that way the code logic would be easier to
 * follow.
 * 
 * @author Kiril Atanasov - Initial contribution
 */
public class BasicRadio implements ElectricityConsumer {

	/** Used to display messages on the console */
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	/** The currently used {@link ElectricityProvider} */
	protected ElectricityProvider currentElectricityProvider;

	/** The energy consumption of the radio */
	protected final int RADIO_CONSUMPTION = 5;

	/**
	 * The amount of time(in seconds) the BasicRadio will wait before trying to
	 * print another message.
	 */
	protected final int BROADCAST_PERIOD = 5;

	/**
	 * Used to run only one Thread at a time.
	 */
	protected ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

	/** All available {@link ElectricityProvider}s */
	List<ElectricityProvider> availableProviders;

	/**
	 * A Thread used for the broadcasting. It prints messages depending on the
	 * {@link #currentElectricityProvider}'s status.
	 */
	protected Runnable broadcastingAction = new Runnable() {

		@Override
		public void run() {
			if (getAllAvailableProviders().contains(currentElectricityProvider)) {
				consume();
			} else {
				logger.info("{} is no longer available.", currentElectricityProvider);
				handleExternalProvidersLack();
			}
		}
	};

	/**
	 * {@inheritDoc}
	 * <p>
	 * Sets the {@link #currentElectricityProvider} if missing.
	 */
	@Override
	public void startConsuming() {
		setCurrentElectricityProviderAtStart();
		scheduler.scheduleAtFixedRate(broadcastingAction, 0L, BROADCAST_PERIOD, TimeUnit.SECONDS);
	}
	
	@Override
	public void consume() {
		logger.info("runs on {}", currentElectricityProvider);		
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * Keep in mind that stopping the broadcasting does not change the bundle's
	 * status
	 */
	@Override
	public void stopConsuming() {
		/*
		 * It is important to stop the scheduler. Otherwise it will continue
		 * displaying messages after we stop the bundle.
		 */
		scheduler.shutdown();
	}

	@Override
	public void setCurrentProvider(ElectricityProvider electricityProvider) {
		currentElectricityProvider = electricityProvider;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<ElectricityProvider> getAllAvailableProviders() {
		/*
		 * Since the {@link ElectricityProvider}'s behavior is basically dynamic
		 * (they can be registered as services and unregistered at any time), we
		 * check the registry and create a new list of available providers every
		 * time before starting the broadcasting
		 * 
		 */
		availableProviders = new ArrayList<>();

		/*
		 * Since this method is not in an activator, we will get the
		 * BundleContext through FrameworkUtil
		 */
		BundleContext bundleContext = FrameworkUtil.getBundle(this.getClass()).getBundleContext();

		try {
			/*
			 * Get all ServiceReference objects of the registered
			 * ElectricityProvider services
			 */
			ServiceReference[] references = bundleContext.getServiceReferences(ElectricityProvider.class.getName(),
					null);

			if (references != null) {
				for (int i = 0; i < references.length; i++) {
					// get each service through its reference
					ElectricityProvider provider = (ElectricityProvider) bundleContext.getService(references[i]);

					// only the Home electricity network should be considered
					if (provider instanceof HomeElectricityNetwork) {
						availableProviders.add(provider);
					}
				}
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

	@Override
	public void handleExternalProvidersLack() {
		stopConsuming();
		logger.info("The BasicRadio broadcasting was stopped.");
		logger.info(
				"You need to find a Home electricity network and restart the radio bundle in order to continue the broadcasting.");
	}

	/**
	 * Sets the {@link #currentElectricityProvider} when the radio is started.
	 */
	private void setCurrentElectricityProviderAtStart() {
		if (!getAllAvailableProviders().isEmpty()) {
			currentElectricityProvider = availableProviders.get(0);
		} else {
			logger.error("There are no available providers.");
		}
	}
}
