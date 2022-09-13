package org.vtiger.Practise;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IretryAnalyserTest {
	
	@Test(retryAnalyzer =org.tyss.generic.ListnersclassIRetryAnalyserImplementationClass.class )
	public void iRetryAnalyserMethod() {
		
		System.out.println("Print Statement 1");
		System.out.println("print statement 2");
		Assert.fail();
		
		System.out.println("Print statement 3");
		System.out.println("Print Statement 4");
		
		
	}
	
	

}
