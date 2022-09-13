package org.tyss.generic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ListnersclassIRetryAnalyserImplementationClass implements IRetryAnalyzer {
		
	int count=0;
	int retryTime=3;
	

	
	public boolean retry(ITestResult result) {
		
		while(count<retryTime) {
			count++;
			System.out.println(count);
			return true;
			
		}
		
		
		return false;
	}

}

