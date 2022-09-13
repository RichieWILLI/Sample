package org.maven_examplepractice.practice;

import org.testng.annotations.Test;

public class PracticeMavenTest{
	
	@Test
	public void practiceMavenTest() {

		System.out.println("FirstTest1");
		String browser = System.getProperty("browser");
		System.out.println(browser);
		
	}
	
	
	@Test
	public void practiceMaven2Test() {
		
		String name = System.getProperty("name");
		System.out.println(name);

		System.out.println("FirstTest2");
	}
	
	@Test
	public void practiceMaven3Test() {
		
		String key = System.getProperty("key");
		System.out.println(key);

		System.out.println("FirstTest3");
	}

}
