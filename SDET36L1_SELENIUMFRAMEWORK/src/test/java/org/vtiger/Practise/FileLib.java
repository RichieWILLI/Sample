package org.vtiger.Practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * this is genric class for data driven testing
 * @author Richard William
 *
 */

public class FileLib {
	/**
	 * this is a genric method to read the data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String getDataFromPrpertyFile(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
		
	}
	
	

}
