/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.provider;

public enum ElectricityProviderType {
    
    HOME_NETWORK {
        @Override
        public int getRating() {
            return 1000;
        }
    },
    
    BATTERY {
        @Override
        public int getRating() {
            return 500;
        }
    },
    
    INTERNAL_POWER_SOURCE {
        @Override
        public int getRating() {
            return 250;
        }
    };
	
	/**
	 * Returns the rating of the {@link ElectricityProvider}. It is used to
	 * compare the providers when more than one is available. When two providers
	 * are compared, the one with the bigger rating has a higher priority.
	 * 
	 * @return the {@link ElectricityProvider}'s rating
	 */
    public abstract int getRating();
 }
