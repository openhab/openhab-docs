/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.tv.ds;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.openhab.training.electricity.consumer.dynamic.DynamicConsumer;
import org.openhab.training.electricity.provider.ElectricityProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A representation of {@link DynamicConsumer} which can use two types of
 * {@link ElectricityProvider}s - {@link HomeElectricityNetwork} and
 * {@link Battery}, but only one of them at a time.
 * <p>
 * The TV keeps track of its {@link` ElectricityProvider}s by using two lists -
 * {@link #usableProviders} and {@link #depletedProviders}. Which of the usable
 * providers will be used depends on their rating.
 * <p>
 * 
 * @author Kiril Atanasov - Initial contribution
 * @author Elena Miovska - sorting the {@link ElectricityProvider}s based on
 *         their type, and picking the {@link #currentElectricityProvider} among
 *         them.
 */
public class TVDS implements DynamicConsumer {

	/** Used to display messages on the console */
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * All the {@link ElectricityProvider}s the TV can use ordered by its
	 * priority in descending order.
	 */
	protected PriorityQueue<ElectricityProvider> usableProviders = new PriorityQueue<>(new ProvidersComparatorForTV());

	/** All depleted {@link ElectricityProvider}s */
	protected List<ElectricityProvider> depletedProviders = new ArrayList<>();

	/** The currently used {@link ElectricityProvider} */
	protected ElectricityProvider currentElectricityProvider;

	/** The power consumption of the TV */
	protected final int TV_CONSUMPTION = 10;

	/** The time (in seconds) the TV waits before trying to use a provider */
	protected final int BROADCASTING_PERIOD = 5;

	/** Indicates whether the TV is powered by a provider */
	protected boolean isTVPowered;

	/** Used to run only one Thread at a time. */
	protected final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

	/**
	 * {@inheritDoc}
	 * <p>
	 * After the {@link ElectricityProvider} has been added we check if the
	 * {@link #currentElectricityProvider} should be changed.
	 */
	@Override
	public synchronized void providerAdded(ElectricityProvider electricityProvider) {
		usableProviders.add(electricityProvider);
		if (shouldTheCurrentProviderBeChanged(electricityProvider)) {
			setCurrentProvider();
		}
	}

	/**
	 * Determines if the {@link #currentElectricityProvider} should be changed,
	 * when adding a new {@link ElectricityProvider}.
	 * 
	 * @param electricityProvider
	 *            the {@link ElectricityProvider} that has been added.
	 */
	private boolean shouldTheCurrentProviderBeChanged(ElectricityProvider electricityProvider) {
		if (currentElectricityProvider == null
				|| electricityProvider.getType().getRating() > currentElectricityProvider.getType().getRating()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public synchronized void providerRemoved(ElectricityProvider electricityProvider) {
		if (usableProviders.contains(electricityProvider)) {
			usableProviders.remove(electricityProvider);
		} else {
			depletedProviders.remove(electricityProvider);
		}
		if (currentElectricityProvider == electricityProvider) {
			removeCurrentElectricityProvider();
		}
	}

	/**
	 * Removes the {@link #currentElectricityProvider} and sets a new one
	 */
	protected void removeCurrentElectricityProvider() {
		logger.info("provider {} is no longer available. ", currentElectricityProvider.toString());
		setCurrentProvider();
	}

	/**
	 * Sets the {@link #currentElectricityProvider}
	 * <p>
	 * Notice that it would be set to {@code null} if there are no usable
	 * providers.
	 */
	public void setCurrentProvider() {
		setCurrentProvider(usableProviders.peek());
	}

	@Override
	public void setCurrentProvider(ElectricityProvider electricityProvider) {
		currentElectricityProvider = electricityProvider;
	}

	@Override
	public void startConsuming() {
		scheduler.scheduleAtFixedRate(broadcastingAction, 0, BROADCASTING_PERIOD, TimeUnit.SECONDS);
	}

	/**
	 * A Thread used for the broadcasting. It also takes care of the
	 * {@link ElectricityProvider}s when they gets depleted
	 */
	protected Runnable broadcastingAction = new Runnable() {

		@Override
		public synchronized void run() {
			if (!usableProviders.isEmpty()) {
				if (currentElectricityProvider.provide(TV_CONSUMPTION)) {
					consume();
				} else {
					logger.info("provider {} is depleted. ", currentElectricityProvider);
					moveProviderFromUsableToDepleted(currentElectricityProvider);
				}
			}
		}
	};

	@Override
	public void consume() {
		logger.info("broadcasting on {}", currentElectricityProvider);
		isTVPowered = true;
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * Keep in mind that stopping the consumer does not change the bundle's
	 * status
	 */
	@Override
	public void stopConsuming() {
		// shutdown the scheduler in order to stop the messages
		scheduler.shutdownNow();
	}

	@Override
	public List<ElectricityProvider> getAllAvailableProviders() {
		return new ArrayList<ElectricityProvider>(usableProviders);
	}

	/**
	 * Moves the given {@link ElectricityProvider} from {@link #usableProviders}
	 * to {@link #depletedProviders}.
	 */
	protected void moveProviderFromUsableToDepleted(ElectricityProvider electricityProvider) {
		usableProviders.remove(electricityProvider);
		depletedProviders.add(electricityProvider);
		if (usableProviders.isEmpty()) {
			handleExternalProvidersLack();
		} else {
			setCurrentProvider();
		}
	}

	protected void moveProviderFromDepletedToUsable(ElectricityProvider electricityProvider) {
		depletedProviders.remove(electricityProvider);
		usableProviders.add(electricityProvider);
	}

	@Override
	public ElectricityProvider getCurrentElectricityProvider() {
		return this.currentElectricityProvider;
	}

	@Override
	public void handleExternalProvidersLack() {
		logger.info("There are no more usable providers at the moment.");
		/*
		 * We don't shutdown the scheduler here so the TV would be able to
		 * continue the broadcasting whenever an external provider becomes
		 * available.
		 */
	}
	
	public boolean isTVPowered() {
		return isTVPowered;
	}

	/**
	 * Implements the logic by which the {@link ElectricityProvider}s are
	 * compared.
	 */
	class ProvidersComparatorForTV implements Comparator<ElectricityProvider> {

		@Override
		public int compare(ElectricityProvider first, ElectricityProvider second) {
			/*
			 * We want to sort the providers based on their rating in descending
			 * order
			 */
			return second.getType().getRating() - first.getType().getRating();
		}
	}
}
