package org.hms.objectRepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorPatientManagePage {
	int count;
	
	
	
	public DoctorPatientManagePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//table/tbody/tr/td[@class='hidden-xs']")
	private List<WebElement> patientNameList;
	
	
	public void validateAddedPatient(String expectedName) {
		
//	count=0;
//		for (WebElement allName : patientNameList) {
//			String allNameList = allName.getText();
//			if(allNameList.equals(expectedName)) {
//				break;
//				count++;
//			
//			}
//		
//	
//		System.out.println("the patient created is displaying in the patient manage page");
//		}
		
		int count=0;
		for(int i=0;i<=patientNameList.size();i++) {
			
			String nameList = patientNameList.get(i).getText();
			if(nameList.equals(expectedName)) {


				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println("patient name is present");
				
			}
		else {
			System.out.println("patient name is not present");
			
		}
		
	}
	

}
