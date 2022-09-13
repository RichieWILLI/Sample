package org.hms.practise;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PractiseTestNgTest {
	
	
	@BeforeSuite
	public void beforeSuitMethod() {
		System.out.println("before suite");
	}
	
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("before test");
	}
	
	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("before class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	
	
	@Test(priority = 2)
	public void practise() {
		Reporter.log("Raj Gopal",true);
		}
	
	
	@Test(priority =-1)
	public void practise1()
	{
		Reporter.log("Gokul Sandel Soap",true);
	}
	
	@Test
	public void practise2()
	{
		Reporter.log("Gokul",true);
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after Test");
	}
	
	@AfterSuite
	public void aftersuit() {
		System.out.println("after suit");
	}
	
	@BeforeMethod
	public void beforeMethod1()
	
	{
		System.out.println("hi");
	}
	
	
}
