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
 * An {@link ElectricityProvider} is a representation of electricity provider,
 * which can provide electricity to consumers.
 * 
 * @author Kiril Atanasov - Initial contribution
 */
public interface ElectricityProvider {

    /**
     * Indicates whether an {@link ElectricityProvider} can provide enough
     * energy to a consumer.
     * 
     * @param value
     *            the energy consumption of the consumer
     * @return true if the provider can satisfy the consumer's energy
     *         requirements, false otherwise
     */
    boolean provide(int value);

    /**
     * Returns the type of the {@link ElectricityProvider} from
     * {@link ElectricityProviderType}.
     * 
     * @return the type of the {@link ElectricityProvider}.
     */
    ElectricityProviderType getType();
}
