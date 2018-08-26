/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.utils;

/**
 * This interface contains only constants.
 * <p>
 * We can add the constants in the {@link TimeEventSender} class. And in our
 * case, since we have few constants it is better what way, but this is done for
 * educational purposes.
 * 
 * @author Kiril Atanasov - Initial Contribution
 */
public interface TimeUtilitiesConstants {
    public static final String MESSAGE_TOPIC = "org/openhab/training/time";
    public static final String TIME_PROPERTY_NAME = "time";
}
