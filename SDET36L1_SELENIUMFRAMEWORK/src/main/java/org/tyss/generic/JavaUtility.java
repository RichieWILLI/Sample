package org.tyss.generic;

import java.util.Random;

/**
 * This class contains java reusable methods
 * @author Richard William
 *
 */

public class JavaUtility {
	
	/**
	 * This method is used to generate the Random number
	 * @return
	 */
	
	public int getRandomMethod() {
		
		return new Random().nextInt(1000);
		
	}
	/**
	 * this method is used to convert int to string using parse method (type casting)
	 * @param timeouts
	 * @return
	 */
	
	public long stringToIntConvertUsingParse(String timeouts) {
		
		long longTimeOut = Long.parseLong(timeouts);
		return longTimeOut;
		
	}

	
	
}

