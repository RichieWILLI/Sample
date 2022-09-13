package org.hms.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class XpathPracticePom {

	 
		
		@FindBy(xpath = "//input[@class='_3704LK']")
		private WebElement searchBoxTextBox;
		
		@FindBy(xpath = "//a[@class='_1_3w1N']")
		private WebElement loginBtn;
		
		public XpathPracticePom(WebDriver driver)
		{
			PageFactory.initElements(driver,this);	
		}
		
		public void clickLoginBtn() {
			loginBtn.click();
		}
		
		
		

}
