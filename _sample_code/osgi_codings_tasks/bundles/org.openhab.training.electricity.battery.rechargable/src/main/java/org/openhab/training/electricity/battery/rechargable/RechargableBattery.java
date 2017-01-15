/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.battery.rechargable;

import java.util.Dictionary;
import org.openhab.training.electricity.battery.ds.BatteryDS;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A representation of battery that can be recharged with additional amount of
 * energy through the {@link #recharge(int)} method.
 *
 * @author Kiril Atanasov
 * @author Mihaela Memova
 */
public class RechargableBattery extends BatteryDS implements ManagedService {

	/** Holds the property name used for the charging. */
	public static final String CHARGE_PROPERTY_NAME = "additionalEnergy";

	/** Used for displaying messages on the console */
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	/** The initial amount of energy that the rechargable battery can provide */
	private int energyAmount = 30;

	/**
	 * Increases the {@link RechargableBattery}'s energy amount with the given
	 * additional energy amount. This method is synchronized in order to avoid
	 * race conditions with the {@link #provide(int)} method.
	 */
	private synchronized void reCharge(int additionalEnergy) {
		energyAmount += additionalEnergy;
		logger.info("The RechargeableBattery was recharged. Its new amount of energy: {}", energyAmount);
	}

	/**
	 * This method is implicitly called by the framework when the configuration
	 * for this bundle's PID is changed
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void updated(Dictionary properties) throws ConfigurationException {
		if (properties != null) {
			String chargeAsAString = (String) properties.get(CHARGE_PROPERTY_NAME);
			int additionalEnergy = Integer.parseInt(chargeAsAString);
			reCharge(additionalEnergy);
		}
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The method is synchronized in case there are multiple consumers using the
	 * battery at the same time.
	 */
	@Override
	public synchronized boolean provide(int consumerConsumption) {
		if (consumerConsumption >= 0 && consumerConsumption <= energyAmount) {
			this.energyAmount -= consumerConsumption;
			return true;
		}
		return false;
	}
	
	@Override
	public String getEnergy() {
		return new Integer(energyAmount).toString();
	}

	@Override
	public String toString() {
		return "Rechargable battery";
	}

	public void modified() {
		/*
		 * If we don't implement this method, the bundle would be restarted
		 * (deactivated and then activated again) on every modification. That is
		 * the default behavior. And the energyAmount would be set to 30 on
		 * every modification. Since such a behavior is not wanted in our case,
		 * we implement this method and leave it empty.
		 */
	}
}
