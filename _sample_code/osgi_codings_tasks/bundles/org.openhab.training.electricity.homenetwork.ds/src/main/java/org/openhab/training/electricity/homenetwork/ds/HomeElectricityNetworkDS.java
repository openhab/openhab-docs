/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.homenetwork.ds;

import org.openhab.training.electricity.provider.ElectricityProvider;
import org.openhab.training.electricity.provider.ElectricityProviderType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class should be the same as the {@link HomeElectricityNetwork} class.
 * The only difference is that in this bundle we use Declarative Services, not
 * an Activator class.
 * 
 * @author Kiril Atanasov - Initial contribution
 */

public class HomeElectricityNetworkDS implements ElectricityProvider {

	/** Used to display messages on the console */
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * {@inheritDoc}
	 * 
	 * @return true. We assume that the home network has an unlimited amount of
	 *         energy.
	 */
	@Override
	public boolean provide(int consumerConsumption) {
		return true;
	}

	@Override
	public String toString() {
		return "Home electricity network DS";
	}

	@Override
	public ElectricityProviderType getType() {
		return ElectricityProviderType.HOME_NETWORK;
	}

	@Override
	public String getEnergy() {
		return "Infinite";
	}
}
