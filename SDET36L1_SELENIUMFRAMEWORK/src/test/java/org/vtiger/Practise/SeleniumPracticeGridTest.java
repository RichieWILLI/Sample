package org.vtiger.Practise;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.session.CapabilitiesFilter;

public class SeleniumPracticeGridTest {

	public static void main(String[] args) throws MalformedURLException {

		URL url=new URL("http://13.126.41.110:4444/wd/hub");
		
	DesiredCapabilities cap=new DesiredCapabilities();
	
	cap.setPlatform(Platform.WINDOWS);
	cap.setBrowserName("chrome");
	
	
	RemoteWebDriver remodriver=new RemoteWebDriver(url, cap);
	
	remodriver.get("https://gmail.com");
		
	}

}
