/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.tv.events;

import java.util.concurrent.TimeUnit;

import org.openhab.training.electricity.provider.ElectricityProvider;
import org.openhab.training.electricity.tv.ds.TVDS;
import org.openhab.training.utils.sender.TimeEventSender;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

/**
 * A representation of TV which receives and handles events from the
 * {@link TimeEventSender}
 * 
 * As a regular Java class, it extends {@link TVDS} and it inherits the logic of
 * finding providers and consuming energy. Since this class will be used later
 * for working with the rechargable battery, we have added a method which check
 * depleted providers before each attempt to use a provider.
 *
 * @author Kiril Atanasov
 * @author Mihaela Memova
 */
public class TVEvents extends TVDS implements EventHandler {

	@Override
	public void stopConsuming() {
		scheduler.shutdownNow();
		isTVPowered = false;
	}

	@Override
	public void handleEvent(Event receivedEvent) {
		if (isTVPowered()) {
			String receivedTimeStamp = (String) receivedEvent.getProperty(TimeEventSender.TIME_PROPERTY_NAME);
			logger.info("Event was registered at {}. Current provider is {}", receivedTimeStamp,
					currentElectricityProvider);
		} else {
			logger.trace("The TV isn't powered at the moment");
		}
	}

	@Override
	public void consume() {
		isTVPowered = true;
	}

	@Override
	public void startConsuming() {
		scheduler.scheduleAtFixedRate(broadcastingAction, 0, BROADCASTING_PERIOD, TimeUnit.SECONDS);
	}

	/**
	 * A Thread used for the broadcasting. It also takes care of the
	 * {@link ElectricityProvider}s when they get depleted
	 */
	protected Runnable broadcastingAction = new Runnable() {

		@Override
		public synchronized void run() {
			checkDepletedProviders();
			if (!usableProviders.isEmpty()) {
				if (currentElectricityProvider.provide(TV_CONSUMPTION)) {
					consume();
				} else {
					if (isTVPowered()) {
						logger.info("provider {} is depleted. ", currentElectricityProvider);
						moveProviderFromUsableToDepleted(currentElectricityProvider);
					}
				}
			}
		}
	};

	@Override
	public void handleExternalProvidersLack() {
		if (isTVPowered()) {
			logger.info("There are no more usable providers at the moment.");
			isTVPowered = false;
		}
	}

	/*
	 * Check if any of the depleted providers has been recharged, and if it
	 * does, it is moved back to the available providers and the current
	 * provider is set again.
	 */
	protected void checkDepletedProviders() {
		for (int i = 0; i < depletedProviders.size(); i++) {
			ElectricityProvider provider = depletedProviders.get(i);
			if (Integer.parseInt(provider.getEnergy()) > 0) {
				moveProviderFromDepletedToUsable(provider);
				setCurrentProvider();
			}
		}
	}
}
