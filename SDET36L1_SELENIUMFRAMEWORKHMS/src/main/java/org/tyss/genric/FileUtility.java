package org.tyss.genric;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * this class is used for file utility like property file which is used to store commondata
 */
public final class FileUtility {
	
	private FileInputStream fis;
	private Properties properties;
	
	/**
	 * This method is used to initilize the property file
	 * @param fileLocation
	 */
	
	public void propertyfileInitilize(String fileLocation) {
	try {
		fis=new FileInputStream(fileLocation);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	properties=new Properties();
	try {
		properties.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	/**
	 * This method is used to get data from commondata like username,password,url,browser,timeout etc
	 * @param key
	 * @return
	 */
	
	public String getDataFromCommonData(String key) {
		String data = properties.getProperty(key);
		return data;
	}
	
	

}
