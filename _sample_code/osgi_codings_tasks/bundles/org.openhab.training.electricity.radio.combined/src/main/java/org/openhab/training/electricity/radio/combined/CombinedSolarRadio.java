/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.radio.combined;

import java.util.ArrayList;
import java.util.List;

import org.openhab.training.electricity.consumer.dynamic.DynamicConsumer;
import org.openhab.training.electricity.provider.ElectricityProvider;
import org.openhab.training.electricity.radio.solar.SolarRadio;

/**
 * A representation of radio that does not need an external
 * {@link ElectricityProvider} to function, but will use one if available. When
 * there are more than one {@link ElectricityProvider}s available they will be
 * used with respect to their rating.
 * <p>
 * As a regular java class, it extends {@link SolarRadio}. So in order to work as
 * expected, the solar radio needs the org.openhab.electricity.radio.solar bundle
 * to be active. But we don't want to start the {@link SolarRadio}'s broadcasting.
 * In that case we have several options:
 * <ul>
 * <li>in the RuntimeConfiguration to set the auto-start property of
 * CombinedRadio to true, and the auto-start properties of all other bundles to
 * false. In that case only CombinedRadio will be activated and it will use the
 * solar source until another {@link ElectricityProvider} is activated</li>
 * <li>to add Bundle-ActivationPolicy: lazy to this bundle's MANIFEST.MF file.
 * In that case when CombinedRadio is activated, {@link SolarRadio} will also be
 * activated. Then we can stop the org.openhab.electricity.radio.solar bundle
 * manually.</li>
 * <li>in the RuntimeConfiguration to set the auto-start property of all bundles
 * to false. Then the org.openhab.electricity.radio.combined bundle can be started
 * manually
 * </ul>
 * For this implementation we have chosen the third option.
 * 
 * @author Kiril Atanasov - Initial Contribution
 */
public class CombinedSolarRadio extends SolarRadio implements DynamicConsumer {

	/**
	 * All the external {@link ElectricityProvider}s that have enough energy to
	 * be used by the radio
	 */
	private List<ElectricityProvider> chargedProviders = new ArrayList<>();

	/** All the depleted external {@link ElectricityProvider}s */
	private List<ElectricityProvider> depletedProviders = new ArrayList<>();

	/**
	 * This method is called by default when the bundle is activated. If you
	 * want another method to be called on the activation, you should declare it
	 * in the *.xml file
	 */
	public void activate() {
		startConsuming();
	}

	/**
	 * This method is called by default when the bundle is deactivated. If you
	 * want another method to be called on the deactivation, you should declare
	 * it in the *.xml file
	 */
	public void deactivate() {
		scheduler.shutdownNow();
	}

	/**
	 * Adds an ElectricityProvider to the consumer's available providers and set
	 * the current provider if it's needed
	 */
	@Override
	public void providerAdded(ElectricityProvider electricityProvider) {
		chargedProviders.add(electricityProvider);
		if (currentElectricityProvider == null || currentElectricityProvider == solar) {
			setCurrentProvider();
		}
	}

	/**
	 * Takes care of an {@link ElectricityProvider} when it becomes unavailable
	 * and set the current provider if it's needed
	 */
	@Override
	public void providerRemoved(ElectricityProvider electricityProvider) {

		if (chargedProviders.contains(electricityProvider)) {
			chargedProviders.remove(electricityProvider);
		} else {
			depletedProviders.remove(electricityProvider);
		}

		if (currentElectricityProvider == electricityProvider) {
			setCurrentProvider();
		}
	}

	/**
	 * Returns all available {@link ElectricityProvider}s no matter what is
	 * their current energy amount.
	 */
	@Override
	public List<ElectricityProvider> getAllAvailableProviders() {
		List<ElectricityProvider> allProviders = new ArrayList<>();
		allProviders.addAll(chargedProviders);
		allProviders.addAll(depletedProviders);
		return allProviders;
	}

	@Override
	public void handleExternalProvidersLack() {
		chargedProviders.remove(currentElectricityProvider);
		depletedProviders.add(currentElectricityProvider);
		setCurrentProvider();
	}

	/**
	 * Sets the currentElectricityProvider according to the task specifications.
	 */
	private void setCurrentProvider() {
		if (chargedProviders.isEmpty()) {
			setCurrentProvider(solar);
		} else {
			setCurrentProvider(chargedProviders.get(0));
		}
	}

	@Override
	public void stopConsuming() {
		setCurrentProvider(solar);
	}

	@Override
	public ElectricityProvider getCurrentElectricityProvider() {
		return currentElectricityProvider;
	}
}
