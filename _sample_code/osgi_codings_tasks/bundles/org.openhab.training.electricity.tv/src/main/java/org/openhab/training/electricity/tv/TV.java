/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.tv;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.openhab.training.electricity.consumer.ElectricityConsumer;
import org.openhab.training.electricity.consumer.dynamic.DynamicConsumer;
import org.openhab.training.electricity.provider.ElectricityProvider;
import org.openhab.training.electricity.tv.internal.TvPowerProviderTracker;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;
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
@SuppressWarnings({ "unchecked", "rawtypes" })
public class TV implements DynamicConsumer, BundleActivator {

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

	/** Used to run only one Thread at a time. */
	protected final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

	/**
	 * An object returned by the Framework when the bundle is successfully
	 * registered as a service.
	 * <p>
	 * It will be used in the {@link #stop(BundleContext)} method to unregister
	 * this bundle.
	 */
	private ServiceRegistration<TV> tvServiceRegistration;

	/**
	 * Used for tracking all {@link ElectricityProvider} services in the
	 * Framework's service registry
	 */
	private ServiceTracker tracker;

	/**
	 * An instance of our ServiceTrackerCustomizer used to customize the service
	 * objects to be tracked
	 */
	private TvPowerProviderTracker providerTracker;

	@Override
	public void start(BundleContext context) throws Exception {

		// register the TV service
		tvServiceRegistration = (ServiceRegistration<TV>) context.registerService(ElectricityConsumer.class.getName(),
				this, null);

		// create a service tracker to monitor ElectricityProvider services
		providerTracker = new TvPowerProviderTracker(context, this);
		tracker = new ServiceTracker(context, ElectricityProvider.class.getName(), providerTracker);

		// we should call its open() method in order to start tracking
		tracker.open();

		// start the TV
		providerTracker.getTV().startConsuming();
	}

	@Override
	public void stop(BundleContext context) throws Exception {

		// stop the TV
		providerTracker.getTV().stopConsuming();

		// stop tracking providers
		tracker.close();

		// remove the TV service from the ServiceRegistry
		tvServiceRegistration.unregister();
	}

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

	@Override
	public ElectricityProvider getCurrentElectricityProvider() {
		return this.currentElectricityProvider;
	}

	@Override
	public void handleExternalProvidersLack() {
		logger.info("There are no more usable providers at the moment.");
		/*
		 * We don't shutdown the scheduler here so the TV would be able to continue
		 * the broadcasting whenever an external provider becomes available.
		 */
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
