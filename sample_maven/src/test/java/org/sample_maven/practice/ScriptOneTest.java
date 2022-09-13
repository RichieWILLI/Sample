package org.sample_maven.practice;

import org.testng.annotations.Test;

public class ScriptOneTest {
	
	@Test
	public void firstMethod() {
		System.out.println("===hello===");
		String browser = System.getProperty("browser");
		System.out.println(browser);
		
	}

}
