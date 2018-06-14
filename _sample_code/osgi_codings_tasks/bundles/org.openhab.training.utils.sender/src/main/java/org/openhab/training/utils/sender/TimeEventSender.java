/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.utils.sender;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.openhab.training.utils.TimeUtilities;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Sends messages periodically.
 * <p>
 * Keep in mind: We do not use Bundle-ActivationPolicy: lazy in the MANIFEST.MF
 * file because it led to problems - the EventAdmin could not be binded and the
 * program did not start.
 *
 * @author Kiril Atanasov - Initial Contribution
 */
public class TimeEventSender {

    public static final String MESSAGE_TOPIC = "org/openhab/training/time";
    public static final String TIME_PROPERTY_NAME = "time";

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    private EventAdmin eventAdmin;

    /** The amount of time, in milliseconds, before sending a message */
    private long waitingPeriod = 5_000L;

    /** Runs one thread at a time. */
    protected final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

    /** Sends a message with the system time stamp. */
    private Runnable sendingAction = new Runnable() {
        @Override
        public void run() {
            if (eventAdmin != null) {
                Map<String, Object> properties = new HashMap<>();
                properties.put(TIME_PROPERTY_NAME, TimeUtilities.getCurrentTimeStamp());
                Event reportGeneratedEvent = new Event(MESSAGE_TOPIC, properties);
                eventAdmin.sendEvent(reportGeneratedEvent);
            } else {
                logger.error("No EventAdmin present.");
            }
        }
    };

    public void bindEventAdmin(EventAdmin eventAdmin) {
        if (eventAdmin != null) {
            this.eventAdmin = eventAdmin;
        }
    }

    public void unbindEventAdmin(EventAdmin eventAdmin) {
        if (this.eventAdmin == eventAdmin) {
            this.eventAdmin = null;
        }
    }

    protected void activate() {
        scheduler.scheduleAtFixedRate(sendingAction, 0L, waitingPeriod, TimeUnit.MILLISECONDS);
    }

    protected void deactivate() {
        scheduler.shutdownNow();
    }

}
