/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.training.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A class used for working with the system time.
 *
 * @author Kiril Atanasov - Initial Contribution
 */
public class TimeUtilities {
	
    /** The format that will be applied to the system time. */
    public final static String TIME_FORMAT = "HH:mm";

    /**
     * Gets the current system time and formats it by the given {@link TimeUtilities#TIME_FORMAT}
     * 
     * @return the system time in a {@link TimeUtilities#TIME_FORMAT}
     */
    public static String getCurrentTimeStamp() {
        long timeInMiliseconds = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TIME_FORMAT);
        Date currentTime = new Date(timeInMiliseconds);
        return simpleDateFormat.format(currentTime);
    }
}
