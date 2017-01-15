/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.consumer.dynamic;

import org.openhab.training.electricity.consumer.ElectricityConsumer;
import org.openhab.training.electricity.provider.ElectricityProvider;

/**
 * This interface is used for managing multiple {@link ElectricityProvider}s.
 *
 * @author Kiril Atanasov - Initial contribution
 */
public interface DynamicConsumer extends ElectricityConsumer {

    /**
     * Adds an {@link ElectricityProvider} to the consumer's available
     * providers.
     * 
     * @param electricityProvider
     *            the specific {@link ElectricityProvider} that will be added.
     */
    void providerAdded(ElectricityProvider electricityProvider);

    /**
     * Removes an {@link ElectricityProvider} from the consumer's available
     * providers.
     * 
     * @param electricityProvider
     *            the specific {@link ElectricityProvider} that will be removed.
     */
    void providerRemoved(ElectricityProvider electricityProvider);
}
