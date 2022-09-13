package org.sample_maven.practice;

import org.testng.annotations.Test;

public class ScriptThreeTest {
	
	@Test
	public void thirdMethod() {
		System.out.println("vanakam");
		String browser = System.getProperty("browser");
		System.out.println(browser);
	}

}
