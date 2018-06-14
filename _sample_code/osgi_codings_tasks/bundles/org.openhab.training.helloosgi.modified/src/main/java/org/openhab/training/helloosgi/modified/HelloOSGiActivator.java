/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.helloosgi.modified;

import org.openhab.training.utils.TimeUtilities;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * "The {@link HelloOSGiActivator} is used to print messages on the console,
 * when current bundle is started and stopped.
 *
 * @author Kiril Atanasov - Initial contribution
 */
public class HelloOSGiActivator implements BundleActivator {

    final static Logger logger = LoggerFactory.getLogger(HelloOSGiActivator.class);

    @Override
    public void start(BundleContext context) throws Exception {
        // Prints welcome message ending with the system time in format HH:MM
        logger.info("HelloOSGi Bundle installed at {}", TimeUtilities.getCurrentTimeStamp());
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        // Prints goodbye message ending with the system time in format HH:MM
        logger.info("HelloOSGi Bundle uninstalled at {}", TimeUtilities.getCurrentTimeStamp());
    }
}
