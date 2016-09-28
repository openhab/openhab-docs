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
 * An {@link ElectricityConsumer} can consume electricity from any
 * {@link ElectricityProvider} and display messages.
 * 
 * @author Kiril Atanasov - Initial contribution
 */
public interface ElectricityConsumer {

    /**
     * Starts the consumer by getting an {@link ElectricityProvider}. A message
     * will be printed if the consumer is started. The message will be displayed
     * as long as the used {@link ElectricityProvider} can provide enough
     * energy.
     */
    void start();

    /**
     * Stops the device and displays a message
     */
    void stop();

    /**
     * Sets a current provider from a list with available providers
     * 
     * @param electricityProvider
     *            is the new {@link ElectricityProvider}, which the
     *            {@link ElectricityConsumer} will be using
     */
    void setCurrentProvider(ElectricityProvider electricityProvider);

    /**
     * Returns a list with all available {@link ElectricityProvider}s
     * 
     * @return a list with all available {@link ElectricityProvider}s
     */
    List<ElectricityProvider> getAllAvailableProviders();

    /**
     * Gets the {@link ElectricityProvider} that is in use.
     * 
     * @return the {@link ElectricityProvider} the {@link ElectricityConsumer}
     *         is using at the moment.
     */
    public ElectricityProvider getCurrentElectricityProvider();
}
