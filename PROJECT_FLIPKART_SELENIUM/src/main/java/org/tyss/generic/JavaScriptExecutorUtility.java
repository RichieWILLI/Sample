package org.tyss.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
/**
 * This class is used make method generic for java script executor
 * @author Richard William
 *
 */

public class JavaScriptExecutorUtility {
	JavascriptExecutor js;
	
	
		/**
		 * This method is used to type cast from webdriver to javascript
		 */
		
		public void typeCastingToJavaScriptExecute(WebDriver driver) {
			
			 js=(JavascriptExecutor) driver;
			
		}
		/**
		 * this method is used to scroll down till end
		 */
		
		public void scrollTillDown() {
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		}
		
		public void scroolTillParticularLength() {
			js.executeScript("window.scrollBy(0,300)");
		}
		


}

