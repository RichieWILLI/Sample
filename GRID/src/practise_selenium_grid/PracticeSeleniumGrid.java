package practise_selenium_grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PracticeSeleniumGrid {
	
	static {
		System.setProperty("webdriver.gecko.driver","./src/resources/geckodriver.exe");
	}
	
	
	
	public static void main(String[] args) throws MalformedURLException {
		
		
		
		//step no 1: create object of url--mention url in which execution should happen
		URL url=new URL("http://localhost:4444");
		
		//step no 2: create object of desired capability from selenium---set the browser--set platform
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		//step no 3: create remote web driver with 2 argument which accepts url and capability
		
		RemoteWebDriver driver=new RemoteWebDriver(url, cap);
		
		driver.get("https://gmail.com");
		
		
		
		
		
		
		
	}

}
