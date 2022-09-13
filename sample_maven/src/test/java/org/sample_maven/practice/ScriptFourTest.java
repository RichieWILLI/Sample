package org.sample_maven.practice;

import org.testng.annotations.Test;

public class ScriptFourTest {

	
	@Test
	public void fourthMethod() {
		System.out.println("namasakaram");
		String browser = System.getProperty("browser");
		System.out.println(browser);
	}
	
}
