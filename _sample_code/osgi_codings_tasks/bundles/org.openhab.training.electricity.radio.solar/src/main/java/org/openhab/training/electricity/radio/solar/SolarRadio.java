/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.radio.solar;

import java.util.concurrent.TimeUnit;

import org.openhab.training.electricity.provider.ElectricityProvider;
import org.openhab.training.electricity.provider.ElectricityProviderType;
import org.openhab.training.electricity.radio.ds.RadioDS;

/**
 * A representation of radio that does not need a Home electricity network to
 * work, but will use one if available.
 * <p>
 * As a regular java class, it extends {@link RadioDS}. So in order to work as
 * expected, the solar radio needs the org.openhab.electricity.radio.ds bundle
 * to be active. But we don't want to start the {@link RadioDS}'s broadcasting.
 * In that case we have several options:
 * <ul>
 * <li>in the RuntimeConfiguration to set the auto-start property of
 * SolarRadio to true, and the auto-start properties of all other bundles to
 * false.</li>
 * <li>to add Bundle-ActivationPolicy: lazy to this bundle's MANIFEST.MF file.
 * In that case when SolarRadio is activated, {@link RadioDS} will also be
 * activated. Then we can stop the org.openhab.electricity.radio.ds bundle
 * manually.</li>
 * <li>in the RuntimeConfiguration to set the auto-start property of all bundles
 * to false. Then the org.openhab.electricity.radio.solar bundle can be started
 * manually
 * </ul>
 * For this implementation we have chosen the first option. For more information
 * about the Bundle-ActivationPolicy see:
 * <a href="https://wiki.eclipse.org/Lazy_Start_Bundles">Lazy Start Bundles</a>
 *<p>
 * Note that only the removeProvider() method is overridden.
 * 
 * @author Kiril Atanasov - Initial Contribution
 */
public class SolarRadio extends RadioDS {

	/**
	 * The {@link SolarSource} which is used when there are no other electricity
	 * providers available.
	 */
	protected SolarSource solar = new SolarSource();

	@Override
	public void setCurrentProvider(ElectricityProvider electricityProvider) {
		if (electricityProvider != null) {
			currentElectricityProvider = electricityProvider;
		} else {
			currentElectricityProvider = solar;
		}
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * Switches to the internal power source if the currently used provider
	 * became unavailable
	 */
	@Override
	public void removeProvider(ElectricityProvider provider) {
		if (currentElectricityProvider == provider) {
			currentElectricityProvider = solar;
		}
	}

	@Override
	public void startConsuming() {
		setCurrentElectricityProviderAtStart();
		scheduler.scheduleAtFixedRate(broadcastingAction, 0L, BROADCAST_PERIOD, TimeUnit.SECONDS);
	}

	/**
	 * At start if there are no available {@link ElectricityProvider}s, the
	 * SolarRadio will use the {@link #solar} provider.
	 */
	protected void setCurrentElectricityProviderAtStart() {
		if (currentElectricityProvider == null) {
			currentElectricityProvider = solar;
		}
	}

	@Override
	public void handleExternalProvidersLack() {
		setCurrentProvider(solar);
	}

	/**
	 * A representation of provider which uses internal power source and it can
	 * always provide energy
	 */
	class SolarSource implements ElectricityProvider {

		@Override
		public ElectricityProviderType getType() {
			return ElectricityProviderType.INTERNAL_POWER_SOURCE;
		}

		@Override
		public boolean provide(int consumerConsumption) {
			return true;
		}
		
		@Override
		public String toString() {
			return "Internal solar source";
		}

		@Override
		public String getEnergy() {
			return "Infinite";
		}
	}
}
