/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.electricity.tv;

import org.openhab.training.electricity.provider.ElectricityProvider;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The class {@link TvPowerProviderTracker} is tracking all the services which
 * implement the {@link ElectricityProvider} interface.
 * 
 * @author Kiril Atanasov - Initial contribution
 */
public class TvPowerProviderTracker extends ServiceTracker<Object, Object> {

    /**
     * The ServiceTracker will add/remove/modify providers of the {@link #tv}.
     */
    private TV tv = null;

    /**
     * This constructor sets ServiceTracker to track all the services using the
     * {@link ElectricityProvider} interface.
     * <p>
     * All the services, which don't implement the {@link ElectricityProvider}
     * interface or aren't registered won't be tracked by
     * {@link TvPowerProviderTracker}.
     * 
     * @param context
     *            the bundle context, usually injected by the BundleActivator
     * @param tv
     *            the {@link TV} object to which the ServiceTracker will add,
     *            remove or modify {@link ElectricityProvider}(s).
     */
    public TvPowerProviderTracker(BundleContext context, TV tv) {
        super(context, ElectricityProvider.class.getName(), null);
        this.tv = tv;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public Object addingService(ServiceReference reference) {
        ElectricityProvider provider = (ElectricityProvider) context.getService(reference);
        tv.providerAdded(provider);
        /*
         * This method must return the service object for the specified
         * ServiceReference and in our case that is provider. 
         */
        return provider;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void removedService(ServiceReference reference, Object service) {
        ElectricityProvider provider = (ElectricityProvider) context.getService(reference);
        tv.providerRemoved(provider);
        context.ungetService(reference);
    }

    /**
     * {@inheritDoc}
     * <p>
     * This service will be called when the modified functions of a tracked
     * service is called. The modified function is defined with declarative
     * services.
     */
    @SuppressWarnings("rawtypes")
    @Override
    public void modifiedService(ServiceReference reference, Object service) {
        /* This method will not be used in this implementation */
    }

    public TV getTV() {
        return this.tv;
    }
}
