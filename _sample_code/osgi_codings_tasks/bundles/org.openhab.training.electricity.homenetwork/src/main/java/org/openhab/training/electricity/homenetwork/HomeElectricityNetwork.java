/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.homenetwork;

import org.openhab.training.electricity.provider.ElectricityProvider;

/**
 * The class {@link HomeElectricityNetwork} defines a service for an
 * inexhaustible power resource.
 * 
 * @author Kiril Atanasov - Initial contribution
 */
public class HomeElectricityNetwork implements ElectricityProvider {

    /**
     * {@inheritDoc}
     * <p>
     * It will always be able to provide enough energy.
     * 
     * @return true
     */
    @Override
    public boolean provide(int value) {
        return true;
    }

}
