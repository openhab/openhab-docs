/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.consumer;

import java.util.List;

import org.openhab.training.electricity.provider.ElectricityProvider;

/**
 * A representation of electricity consumer which needs an
 * {@link ElectricityProvider} to run.
 * 
 * @author Kiril Atanasov - Initial contribution
 */
public interface ElectricityConsumer {

	/**
	 * Starts the consumer.
	 */
	void startConsuming();
	
	/** Defines what to do when the consumer has enough energy */
	void consume();

	/**
	 * Stops the consumer.
	 */
	void stopConsuming();

	/**
	 * Sets the current {@link ElectricityProvider}
	 */
	void setCurrentProvider(ElectricityProvider electricityProvider);

	/**
	 * @return all available {@link ElectricityProvider}s
	 */
	List<ElectricityProvider> getAllAvailableProviders();

	/**
	 * @return the {@link ElectricityProvider} that is currently used.
	 */
	ElectricityProvider getCurrentElectricityProvider();

	/**
	 * Defines how the consumer handles the case when there are no external
	 * providers available
	 */
	void handleExternalProvidersLack();
}
