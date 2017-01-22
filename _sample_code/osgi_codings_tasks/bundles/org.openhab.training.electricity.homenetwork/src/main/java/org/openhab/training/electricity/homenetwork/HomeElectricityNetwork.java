/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.homenetwork;

import org.openhab.training.electricity.homenetwork.internal.HomeElectricityNetworkActivator;
import org.openhab.training.electricity.provider.ElectricityProvider;
import org.openhab.training.electricity.provider.ElectricityProviderType;
import org.osgi.framework.BundleActivator;

/**
 * Defines a service for an inexhaustible power resource. As a regular java
 * class, it can implement {@link ElectricityProvider} and
 * {@link BundleActivator} at the same time but we prefer to create a separate
 * {@link HomeElectricityNetworkActivator} class. In that way the code logic
 * would be easier to follow.
 * 
 * @author Kiril Atanasov - Initial contribution
 */
public class HomeElectricityNetwork implements ElectricityProvider {

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
	public ElectricityProviderType getType() {
		return ElectricityProviderType.HOME_NETWORK;
	}

	@Override
	public String toString() {
		return "Home electricity network";
	}

	@Override
	public String getEnergy() {
	return "Infinite";
	}
}
