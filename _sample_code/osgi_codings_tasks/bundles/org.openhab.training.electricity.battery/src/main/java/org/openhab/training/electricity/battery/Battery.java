/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.battery;

import org.openhab.training.electricity.provider.ElectricityProvider;
import org.openhab.training.electricity.provider.ElectricityProviderType;

/**
 * The class {@link Battery} is an {@link ElectricityProvider} which has a
 * limited amount of energy it can provide.
 * 
 * @author Kiril Atanasov - Initial contribution
 */
public class Battery implements ElectricityProvider {

    /** The amount of energy the Battery can provide */
    protected int energyAmount = 20;

    /**
     * Checks if the {@link Battery} has enough energy to power a consumer,
     * based on its consumption. The method is synchronized in case there are
     * multiple consumers using the {@link Battery} service at the same time.
     * 
     * @param value
     *            the amount of energy that is being demanded.
     * @return true if the {@link Battery} can provide the demanded amount of
     *         energy, false otherwise.
     */
    @Override
    public synchronized boolean provide(int value) {
        if (value >= 0 && value <= energyAmount) {
            energyAmount -= value;
            return true;
        }
        return false;
    }

    @Override
    public ElectricityProviderType getType() {
        return ElectricityProviderType.BATTERY;
    }
}
