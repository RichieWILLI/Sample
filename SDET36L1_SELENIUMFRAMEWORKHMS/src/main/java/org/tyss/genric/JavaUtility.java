package org.tyss.genric;

import java.util.Random;

/**
 * this class is used to for java genric utilities like parse string to long,random number etc
 * @author Richard William
 *
 */

public class JavaUtility {
	
	/**
	 * this method is used to convert the string to long
	 * @param timeouts
	 * @return 
	 */
	
	public long parseStringToLong(String timeouts) {
		
		long longTimeouts = Long.parseLong(timeouts);
		return longTimeouts;
	}
	
	public int randomNumber() {
		Random ran=new Random();
		int ranNU=ran.nextInt(1000);
		return ranNU;
	}

}
