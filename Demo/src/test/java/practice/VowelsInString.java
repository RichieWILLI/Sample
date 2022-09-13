package practice;

import java.util.HashSet;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.testng.annotations.Test;

public class VowelsInString {
	
	@Test
	public void vowelsInString()
	 {
		
		String st="my name is richard";
		
		System.out.println("the entered string is :");
		System.out.println(st);
		System.out.println("THE VOWELS IN THE STRINGS ARE");

		
		for(int i=0; i<st.length();i++) {
			
			if(st.charAt(i)=='a'|| st.charAt(i)=='e'|| st.charAt(i)=='i' || st.charAt(i)=='o' || st.charAt(i)=='u') {
					
				System.out.println(st.charAt(i));	
			}
			
		}
		
		
	}

}
