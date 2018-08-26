/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.tv.managedservice;

import java.util.Dictionary;

import org.openhab.training.electricity.tv.events.TVEvents;
import org.openhab.training.utils.sender.TimeEventSender;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.osgi.service.event.Event;

/**
 * A representation of TV which receives events and can go to sleep at specified
 * time. That time can be changed by updating the Configuration object for this
 * service. This service will not be used on its own, so we have not created a
 * separate runtime configuration for it. It will be used in the ConsoleReader
 * runtime configuration.
 *
 * @author Kiril Atanasov
 * @author Mihaela Memova
 */
public class TVManagedService extends TVEvents implements ManagedService {

	/** Keeps the property name for setting the sleep time. */
	public static final String SLEEP_PROPERTY_NAME = "autoSleep";

	/** Displayed when the TVD goes to sleep */
	protected final String SLEEP_MESSAGE = "TV is going to sleep";

	/** When the TVDS goes to sleep. */
	protected String sleepTimeStamp = "23:26";

	@SuppressWarnings("rawtypes")
	@Override
	public void updated(Dictionary properties) throws ConfigurationException {
		if (properties != null && !properties.isEmpty()) {
			String newSleepTimeStamp = (String) properties.get("autoSleep");
			if (newSleepTimeStamp != null && !newSleepTimeStamp.isEmpty()) {
				setSleepTime(newSleepTimeStamp);
			}
			logger.info("TV is updated with new sleep time: {}", newSleepTimeStamp);
		}
	}

	public void setSleepTime(String newSleepTime) {
		this.sleepTimeStamp = newSleepTime;
	}

	@Override
	public void handleEvent(Event receivedEvent) {
		if (isTVPowered()) {
			String receivedTimeStamp = (String) receivedEvent.getProperty(TimeEventSender.TIME_PROPERTY_NAME);
			if (isItTimeForSleep(receivedTimeStamp)) {
				logger.info(SLEEP_MESSAGE);
				stopConsuming();
			} else {
				logger.info("Event was registered at {}. Current provider is {}", receivedTimeStamp,
						currentElectricityProvider);
			}
		}
	}

	/**
	 * Determines if it is time for the TV to go to sleep.
	 *
	 * @param currentTimeStamp
	 *            - the current system time
	 * @return true if the TV should be turned off, false otherwise.
	 */
	public boolean isItTimeForSleep(String currentTimeStamp) {
		if (sleepTimeStamp.compareTo(currentTimeStamp) <= 0) {
			return true;
		} else {
			return false;
		}
	}

	public void modified() {
		/*
		 * If we don't implement this method, the bundle would be restarted
		 * (deactivated and then activated again) on every modification. That is
		 * the default behavior. On the other hand, once the received Dictionary
		 * properties are processed in the updated(Dictionary properties)
		 * method, they are stored in permanent storage. So when the bundle is
		 * restarted the method updated(Dictionary properties) will be called
		 * with the last saved dictionary. Since such a behavior is not wanted
		 * in our case, we implement this method and leave it empty.
		 */
	}

	@Override
	public String toString() {
		return "TV Managed service";
	}
}
