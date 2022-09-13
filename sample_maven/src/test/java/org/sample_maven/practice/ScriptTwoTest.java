package org.sample_maven.practice;

import org.testng.annotations.Test;

public class ScriptTwoTest {
	
	@Test
	public void secondMethod() {
		
		
		System.out.println("===namasakara===");
		String browser = System.getProperty("browser");
		System.out.println(browser);
	}

}
