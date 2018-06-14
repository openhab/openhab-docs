/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.provider;

/**
 * A representation of electricity provider, which can provide electricity to
 * consumers.
 * 
 * @author Kiril Atanasov - Initial contribution
 */
public interface ElectricityProvider {

	/**
	 * Indicates whether an {@link ElectricityProvider} can provide enough
	 * energy to a consumer. And if it can, this method should care of the
	 * discharging the provider.
	 * 
	 * @param consumerConsumption
	 *            the energy consumption of the consumer
	 * @return true if the provider can satisfy the consumer's energy
	 *         requirements, false otherwise
	 */
	boolean provide(int consumerConsumption);

	/**
	 * Returns the type of the {@link ElectricityProvider}.
	 */
	ElectricityProviderType getType();
	
	/** Displays what is the current amount of energy that can be provided */
	String getEnergy();
}
