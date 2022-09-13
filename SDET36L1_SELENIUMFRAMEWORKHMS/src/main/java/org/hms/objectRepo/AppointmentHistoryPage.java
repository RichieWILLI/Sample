package org.hms.objectRepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentHistoryPage {
	
	private WebDriver driver;
	public AppointmentHistoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//table/tbody/tr/td[2]")
	private List<WebElement> doctorNameList;
	
	@FindBy(xpath = "//table/tbody/tr/td[6]")
	private List<WebElement> listOfAppointmentCreationDate;
	
	@FindBy(xpath = "//table/tbody/tr[22]/td[8]/div[@class='visible-md visible-lg hidden-sm hidden-xs']")
	private WebElement cancelBtn;
	
	@FindBy(xpath = "//div[@class='col-md-12']/p")
	private WebElement appointmentCancelledText;
	
	//private String xpath="//table/tbody/tr[%s]/td[8]";
	
	private String xpath="//table/child::tbody/tr/td[.='%s.']/following-sibling::td/div/a";
	
	
	
	
	
	public void checkName(String doctorHarry) {
		for (WebElement listname : doctorNameList) {
			String nameOf = listname.getText();
			if(nameOf.equals(doctorHarry)) {
				
				break;
			}
			}
		System.out.println("Appointment is done");
	}
	
	
	private WebElement converterFromStringXpathToWebelement(String xpathStr, String value ) {
		String valueChange = String.format(xpathStr,value);
		return driver.findElement(By.xpath(valueChange));
	}
	
	
	public void clickcancelAppoint(String dateTime) {
		for(int i=0;i<=listOfAppointmentCreationDate.size();i++) {
			
			String listofTime = listOfAppointmentCreationDate.get(i).getText();
			if(listofTime.equals(dateTime)) {
				
				String dynamicPth = String.format(xpath,i+1);
				driver.findElement(By.xpath(dynamicPth)).click();
		
				//driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).click();
				break;
				
			}
			
		}
		
		
			
	}
	public void clickOnpatircularElementByDynamicPath(String value) {
		converterFromStringXpathToWebelement(xpath,value).click();
	}
	
	
	
	
	
	
	
	
	
	
	public void clickOnCancelLink() {
		cancelBtn.click();	
	}
	
	public void cancelledCheck() {
		boolean cancel = appointmentCancelledText.isDisplayed();
		if(cancel==true) {
			System.out.println("The appointment is cancelled sucessfully");
		}
		
	}


	
	
	
	

}
