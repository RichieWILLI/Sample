package practice;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class CountNumberOfVowel {

	@Test
	public void countNumberOfVowel()
	
	{
		String s="HarryPotter";
		int count=0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				count++;
			}
			
			
		}
		System.out.println("vowels= "+count);
		
	}
	
	@Test
	public void printVowel() {
		String s="HarryPotter";
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				System.out.print(s.charAt(i)+" ");
			}
			
			
		}
			
	}
	@Test
	public void countVowelAndRemoveDuplicate() {
	
		String s="what is your name";
		s.toLowerCase();
		
		LinkedHashSet hs=new LinkedHashSet();
		for(int i=0;i<s.length();i++) {
			hs.add(s.charAt(i));
		}
		
		int count=0;
		
		for (Object it : hs) {
			
			if(it.equals('a') || it.equals('e') || it.equals('i') || it.equals('o') || it.equals('u')) {
				
				count++;
			}
			System.out.println(it+" : "+count);
		}
		
		

		
	}

}
