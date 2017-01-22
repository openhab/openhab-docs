/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.battery.ds;

import org.openhab.training.electricity.provider.ElectricityProvider;
import org.openhab.training.electricity.provider.ElectricityProviderType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class should be the same as the {@link Battery} class. The only
 * difference is that in this bundle we use Declarative Services, not an
 * Activator class.
 * 
 * @author Kiril Atanasov - Initial contribution
 */
public class BatteryDS implements ElectricityProvider {

	/** The amount of energy the BatteryDS can provide */
	protected int capacity = 20;

	/** Used to display messages on the console */
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

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
		return "BatteryDS";
	}

	@Override
	public String getEnergy() {
		return new Integer(capacity).toString();
	}
}
