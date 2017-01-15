/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.helloosgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**A class used to customize the starting and stopping of our bundle.
 * <p>
 * The most straightforward way to control the life cycle of our bundle
 * is to implement the org.osgi.framework.BundleActivator interface.
 * When the bundle is started and stopped, the start and stop methods 
 * of the BundleActivator interface are called. So we use them to
 * print some messages on the console.
 *
 * @author Kiril Atanasov - Initial contribution
 */
public class HelloOSGiActivator implements BundleActivator {

	/** Used to display messages on the console */
    final static Logger logger = LoggerFactory.getLogger(HelloOSGiActivator.class);

    @Override
    public void start(BundleContext context) throws Exception {
    	// Print a welcome message
        logger.info("HelloOSGi Bundle installed");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
    	// Print a goodbye message
        logger.info("HelloOSGi Bundle uninstalled");
    }
}
