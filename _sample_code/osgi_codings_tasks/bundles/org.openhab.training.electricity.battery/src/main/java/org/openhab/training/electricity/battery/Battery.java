/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.battery;

import org.openhab.training.electricity.battery.internal.BatteryActivator;
import org.openhab.training.electricity.provider.ElectricityProvider;
import org.openhab.training.electricity.provider.ElectricityProviderType;
import org.osgi.framework.BundleActivator;

/**
 * Represents an {@link ElectricityProvider} which has a limited amount of
 * energy it can provide.
 * <p>
 * As a regular java class, it can implement {@link ElectricityProvider} and
 * {@link BundleActivator} at the same time but we prefer to create a separate
 * {@link BatteryActivator} class. In that way the code logic would be easier to
 * follow.
 * 
 * @author Kiril Atanasov - Initial contribution
 */
public class Battery implements ElectricityProvider {

	/** The amount of energy the Battery can provide */
	protected int capacity = 20;

	/**
	 * {@inheritDoc}
	 * <p>
	 * The method is synchronized in case there are multiple consumers using the
	 * battery at the same time.
	 */

	@Override
	public synchronized boolean provide(int consumerConsumption) {
		if (consumerConsumption >= 0 && consumerConsumption <= capacity) {
			capacity -= consumerConsumption;
			return true;
		}
		return false;
	}

	@Override
	public ElectricityProviderType getType() {
		return ElectricityProviderType.BATTERY;
	}

	@Override
	public String toString() {
		return "Battery";
	}

	@Override
	public String getEnergy() {
		return new Integer(capacity).toString();
	}
}
