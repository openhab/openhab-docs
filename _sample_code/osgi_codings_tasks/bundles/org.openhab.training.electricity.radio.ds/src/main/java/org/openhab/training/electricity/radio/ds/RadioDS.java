/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.radio.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.openhab.training.electricity.consumer.ElectricityConsumer;
import org.openhab.training.electricity.homenetwork.ds.HomeElectricityNetworkDS;
import org.openhab.training.electricity.provider.ElectricityProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A representation of radio which is an {@link ElectricityConsumer} and has a
 * specific consumption. It runs only if there is a
 * {@link HomeElectricityNetworkDS} service available.
 * <p>
 * The code is very similar to the {@link BasicRadio}'s code but here we are
 * using the Declarative Services functionality instead of BundleActivator.
 * Besides, this radio representation does not need a bundle restart in order to
 * continue the broadcasting.
 *
 * @author Kiril Atanasov - Initial contribution
 */
public class RadioDS implements ElectricityConsumer {

	/** Used to display messages on the console */
	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	/** The currently used {@link ElectricityProvider} */
	protected ElectricityProvider currentElectricityProvider;

	/** The energy consumption of the radio */
	protected final int RADIO_CONSUMPTION = 5;

	/**
	 * The time (in seconds) the Radio will wait before trying to use a provider
	 */
	protected final int BROADCAST_PERIOD = 5;

	/** Used to run only one Thread at a time. */
	protected final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

	/** All available {@link ElectricityProvider}s */
	List<ElectricityProvider> availableProviders = new ArrayList<ElectricityProvider>();

	/**
	 * A Thread used for the broadcasting. It prints messages depending on the
	 * {@link #currentElectricityProvider}'s status.
	 */
	protected Runnable broadcastingAction = new Runnable() {

		@Override
		public void run() {
			if (currentElectricityProvider != null) {
				if (currentElectricityProvider.provide(RADIO_CONSUMPTION)) {
					consume();
				} else {
					logger.info("{} is depleted", currentElectricityProvider);
					handleExternalProvidersLack();
				}
			} else {
				logger.info("There are no available providers.");
				handleExternalProvidersLack();
			}
		}
	};

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

	private void setCurrentElectricityProviderAtStart() {
		if (!getAllAvailableProviders().isEmpty()) {
			currentElectricityProvider = availableProviders.get(0);
		} else {
			logger.info("There are no available providers.");
		}
	}

	/**
	 * A method which is called every time when an {@link ElectricityProvider}
	 * is registered as a service. In order to work as expected it should be
	 * defined in the *.xml file
	 */
	public void addProvider(ElectricityProvider provider) {
		/*
		 * We use only the HomeElectricityNetworkDS bundle as a provider. Keep
		 * in mind that if you want to use both the HomeElectricityNetwork and
		 * HomeElectricityNetworkDS bundles, you should stop them both in order
		 * to stop the radio broadcasting.
		 */
		logger.info("A {} provider is found.", provider);
		if (provider instanceof HomeElectricityNetworkDS) {
			availableProviders.add(provider);
			setCurrentProvider(provider);
		}
	}

	/**
	 * A method which is called every time when an {@link ElectricityProvider}
	 * service is unregistered. In order to work as expected it should be
	 * defined in the *.xml file
	 */
	public void removeProvider(ElectricityProvider provider) {
		logger.info("A {} provider is removed.", provider);
		getAllAvailableProviders().remove(provider);
		if (getAllAvailableProviders().size() == 0) {
			handleExternalProvidersLack();
		}
	}

	@Override
	public void setCurrentProvider(ElectricityProvider electricityProvider) {
		if (currentElectricityProvider == null) {
			currentElectricityProvider = electricityProvider;
		}
	}

	@Override
	public List<ElectricityProvider> getAllAvailableProviders() {
		return availableProviders;
	}

	@Override
	public ElectricityProvider getCurrentElectricityProvider() {
		return this.currentElectricityProvider;
	}

	@Override
	public void handleExternalProvidersLack() {
		stopConsuming();
		logger.info("The RadioDS broadcasting was stopped.");
		logger.info("When a Home electricity network DS is found again the broadcasting will continue.");
	}

	public String toString() {
		return "Radio DS";
	}
}
