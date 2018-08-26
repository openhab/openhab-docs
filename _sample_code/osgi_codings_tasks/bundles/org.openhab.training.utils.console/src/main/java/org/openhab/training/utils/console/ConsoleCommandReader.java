/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.utils.console;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;
import org.openhab.training.electricity.battery.rechargable.RechargableBattery;
import org.openhab.training.electricity.consumer.ElectricityConsumer;
import org.openhab.training.electricity.provider.ElectricityProvider;
import org.openhab.training.electricity.tv.managedservice.*;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Reads commands from the console. It can change the charge of the rechargable
 * battery or configure the TV's sleep time. It can also display all registered
 * {@link ElectricityProvider}s or {@link ElectricityConsumer}s
 *
 * @author Kiril Atanasov
 * @author Mihaela Memova
 */
public class ConsoleCommandReader implements CommandProvider {

	/**
	 * The persistent identifier (PID) of the {@link RechargableBattery}
	 * service. (taken from the rechargableBattery.xml file)
	 */
	public static final String RECHARGABLE_BATTERY_PID = "org.openhab.training.electricity.battery.rechargable";

	/**
	 * The persistent identifier (PID) of the {@link TVManagedService} service.
	 * (taken from the TVManagedService.xml file)
	 */
	public static final String TV_MANAGEDSERVICE_PID = "org.openhab.training.electricity.tv.managedservice";

	/** Used to display messages on the console */
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	private ConfigurationAdmin configAdmin;

	private Configuration batteryConfiguration;

	private Configuration tvConfiguration;

	/** Holds all the registered {@link ElectricityConsumer} services. */
	private List<ElectricityConsumer> consumers = new ArrayList<>();

	/** Holds all the registered {@link ElectricityProvider} services. */
	private List<ElectricityProvider> providers = new ArrayList<>();

	public void activate() {
		System.out.println(getHelp());
	}

	public void deactivate() {
		logger.info("The Console reader is deactivated.");
	}

	@SuppressWarnings("unused")
	/** Called when the {@link ConfigurationAdmin} service is found */
	private void setConfigurationAdmin(ConfigurationAdmin configAdmin) {
		if (configAdmin != null) {
			this.configAdmin = configAdmin;
		}
	}

	/** Called when the {@link ConfigurationAdmin} service is unregistered */
	public void unsetConfigurationAdmin(ConfigurationAdmin configAdmin) {
		this.configAdmin = null;
	}

	@SuppressWarnings("unused")
	/** Called when an {@link ElectricityConsumer} service is found */
	private void addElectricityConsumer(ElectricityConsumer electricityConsumer) {
		consumers.add(electricityConsumer);
	}

	@SuppressWarnings("unused")
	/** Called when an {@link ElectricityConsumer} service is unregistered */
	private void removeElectricityConsumer(ElectricityConsumer electricityConsumer) {
		consumers.remove(electricityConsumer);
	}

	@SuppressWarnings("unused")
	/** Called when an {@link ElectricityProvider} service is found */
	private void addElectricityProvider(ElectricityProvider electricityProvider) {
		providers.add(electricityProvider);
	}

	@SuppressWarnings("unused")
	/** Called when an {@link ElectricityProvider} service is unregistered */
	private void removeElectricityProvider(ElectricityProvider electricityProvider) {
		providers.remove(electricityProvider);
	}

	/** Displays information about a specific {@link ElectricityConsumer}. */
	protected void showConsumerInformation(ElectricityConsumer consumer) {

		System.out.printf("%-30s %-20s\n", "Consumer: ", consumer);
		if (consumer.getCurrentElectricityProvider() != null) {
			System.out.printf("%-30s %-20s\n", "Current Provider:", consumer.getCurrentElectricityProvider());
		}
		List<ElectricityProvider> providers = consumer.getAllAvailableProviders();
		if (providers.isEmpty()) {
			System.out.printf("%-30s\n", "The consumer doens't use any electricity providers");
		} else {
			System.out.printf("%-30s\n", "Available providers:");
			for (ElectricityProvider electricityProvider : providers) {
				System.out.printf("%-30s\n", electricityProvider);
			}
		}
	}

	/**
	 * Displays all the registered services implementing the
	 * {@link ElectricityConsumer} interface.
	 */
	public synchronized void displayAllConsumers(List<ElectricityConsumer> consumers) {
		if (consumers.isEmpty()) {
			System.out.printf("%-30s", "There are no electricity consumers.");
		} else {
			System.out.printf("%-30s\n", "Electricity consumers:");
			for (ElectricityConsumer consumer : consumers) {
				showConsumerInformation(consumer);
			}
		}
	}

	public void _consumers(CommandInterpreter ci) {
		displayAllConsumers(consumers);
	}

	/**
	 * Displays all the registered services implementing the
	 * {@link ElectricityProvider} interface.
	 */
	public synchronized void displayAllProviders(List<ElectricityProvider> providers) {
		if (providers.size() == 0) {
			System.out.printf("%-30s\n", "There are no electricity providers.");
		} else {
			System.out.printf("%-30s\n", "Electricity providers:");

			for (ElectricityProvider provider : providers) {
				System.out.printf("%-30s %-20s\n", provider, "Energy left:" + provider.getEnergy());
			}
		}
	}

	public void _providers(CommandInterpreter ci) {
		displayAllProviders(providers);
	}

	/**
	 * Sets the charge of the {@link Battery} with a specified amount of energy.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void _charge(CommandInterpreter ci) {
		try {
			// get the energy amount from the console
			String additionalEnergy = ci.nextArgument();

			// get the configuration of the Rechargable battery service
			batteryConfiguration = configAdmin.getConfiguration(RECHARGABLE_BATTERY_PID);
			/*
			 * Create a new Dictionary to save the configuration properties and
			 * put the additional energy amount in it
			 */
			Dictionary<String, String> properties = new Hashtable();
			properties.put(RechargableBattery.CHARGE_PROPERTY_NAME, additionalEnergy);

			/*
			 * Each configuration object is bound by default to a bundle
			 * location. So our batteryConfiguration is bound to this bundle
			 * location. And the RechargableBattery service is located in
			 * another bundle. So in order to be able to manage it, we need to
			 * ignore the Configuration object bundle location by setting it to
			 * null.
			 */
			batteryConfiguration.setBundleLocation(null);

			/*
			 * Update the configuration with the new properties (the service
			 * should be updated automatically)
			 */
			batteryConfiguration.update(properties);

		} catch (IOException e) {
			logger.error("Error occured while charging the battery.", e);
		} finally {
			try {
				/*
				 * The Configuration's last used Dictionary is saved in a
				 * persistence storage. In general, it would be updated with the
				 * last saved Dictionary on every bundle restart. Since such a
				 * behavior is not wanted in this case, we should delete the
				 * configuration.
				 */
				batteryConfiguration.delete();
			} catch (IOException e) {
				logger.info("An exception was thrown while trying to delete the battery configuration : {}", e);
			}
		}
	}

	/**
	 * Sets the autoSleep property of the TV.
	 */

	public void _sleep(CommandInterpreter ci) {
		try {
			// get the new sleep time stamp from the console
			String sleepTimeStamp = ci.nextArgument();

			// get the configuration of the TV service
			tvConfiguration = configAdmin.getConfiguration(TV_MANAGEDSERVICE_PID);

			/*
			 * Create a new Dictionary to save the configuration properties and
			 * put the new time stamp in it
			 */
			Dictionary<String, String> properties = new Hashtable<String, String>();
			properties.put(TVManagedService.SLEEP_PROPERTY_NAME, sleepTimeStamp);

			/*
			 * Each configuration object is bound by default to a bundle
			 * location. So our tvConfiguration is bound to this bundle
			 * location. And the TVManagedService service is located in another
			 * bundle. So in order to be able to manage it, we need to ignore
			 * the Configuration object bundle location by setting it to null.
			 */
			tvConfiguration.setBundleLocation(null);

			/*
			 * Update the configuration with the new properties (the service
			 * should be updated automatically)
			 */
			tvConfiguration.update(properties);

		} catch (IOException e) {
			logger.error("Error occured while setting the TV", e);
		} finally {
			try {
				/*
				 * The Configuration's last used Dictionary is saved in a
				 * persistence storage. In general, it would be updated with the
				 * last saved Dictionary on every bundle restart. Since such a
				 * behavior is not wanted in this case, we should delete the
				 * configuration.
				 */
				tvConfiguration.delete();
			} catch (IOException e) {
				logger.info("An exception was thrown while trying to delete the tv configuration : {}", e);
			}
		}
	}

	/**
	 * Displays information about all available commands
	 */
	@Override
	public String getHelp() {
		StringBuilder help = new StringBuilder();
		help.append("Possible Console Commands: \n");
		help.append("\tconsumers -> view all consumers\n");
		help.append("\tproviders -> view all providers\n");
		help.append("\tcharge <int> -> set the energy of the battery to <amount> (for example: charge 15)\n");
		help.append("\tsleep HH:MM -> set the TVDS's autosleep property (for example : sleep 10:00) \n");
		return help.toString();
	}
}
