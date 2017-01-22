package org.openhab.training.electricity.tv.internal;

import org.openhab.training.electricity.provider.ElectricityProvider;
import org.openhab.training.electricity.tv.TV;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

/** Tracks all the providers the TV can use. */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class TvPowerProviderTracker implements ServiceTrackerCustomizer {

	BundleContext context;
	TV tv = new TV();

	public TvPowerProviderTracker(BundleContext context, TV tv) {
		this.context = context;
		this.tv = tv;
	}

	@Override
	public Object addingService(ServiceReference reference) {
		ElectricityProvider provider = (ElectricityProvider) context.getService(reference);
		// add the provider to the tv's list (and set the current provider)
		if (provider != null) {
			tv.providerAdded(provider);
			/*
			 * This method should return the service object for the specified
			 * ServiceReference and in our case that is provider.
			 */
		}
		return provider;
	}

	@Override
	public void removedService(ServiceReference reference, Object service) {
		ElectricityProvider provider = (ElectricityProvider) context.getService(reference);
		tv.providerRemoved(provider);
		context.ungetService(reference);
	}

	@Override
	public void modifiedService(ServiceReference reference, Object service) {
		/* This method will not be used in this implementation */
	}

	public TV getTV() {
		return this.tv;
	}
}
