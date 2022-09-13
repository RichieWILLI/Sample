package practice;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class PrintTheTwoDuplicateWords {
	
	@Test
	public void printTheTwoDuplicateWords() {
		String s1="Welcome to Bnagalore and Welcome to TestYantra";
		String[] str1 = s1.split(" ");
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for(int i=0;i<str1.length;i++) {
			set.add(str1[i]);
		}
		
		for (String it: set) {
			int count=0;
			for(int i=0;i<str1.length;i++) {
				if(it.equals(str1[i])) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(it+" "+count);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
