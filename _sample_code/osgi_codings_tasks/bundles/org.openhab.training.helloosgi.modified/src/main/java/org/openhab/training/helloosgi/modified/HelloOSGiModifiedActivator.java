/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.helloosgi.modified;

import org.openhab.training.utils.*;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A class used to customize the starting and stopping of our bundle.
 * <p>
 * The only difference between {@link HelloOSGiActivator} and {@link HelloOSGiModifiedActivator}
 * is that here the {@link TimeUtilities} class is used to display the current time stamp on the
 * console when the bundle is started and stopped.
 *
 * @author Kiril Atanasov - Initial contribution
 */
public class HelloOSGiModifiedActivator implements BundleActivator {

	/** Used to display messages on the console */
    final static Logger logger = LoggerFactory.getLogger(HelloOSGiModifiedActivator.class);

    @Override
    public void start(BundleContext context) throws Exception {
        // Print a welcome message ending with the system time in format HH:MM
        logger.info("HelloOSGi modified bundle installed at {}", TimeUtilities.getCurrentTimeStamp());
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        // Print a goodbye message ending with the system time in format HH:MM
        logger.info("HelloOSGi modified bundle uninstalled at {}", TimeUtilities.getCurrentTimeStamp());
    }
}
