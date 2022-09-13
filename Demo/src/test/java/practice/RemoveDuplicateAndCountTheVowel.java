package practice;

import java.util.LinkedHashSet;

public class RemoveDuplicateAndCountTheVowel {

	public static void main(String[] args) {
		
		String st="india";
		LinkedHashSet linkedHashSet=new LinkedHashSet();
		
		for(int i=0;i<st.length();i++) {
			linkedHashSet.add(st.charAt(i));
		}
		int count=0;
		
		for (Object hs : linkedHashSet) {
			if(hs.equals('a')|| hs.equals('e')|| hs.equals('i')|| hs.equals('o')|| hs.equals('u')) {
				
				count++;
			}
			
		}
		
		System.out.println("the number of vowels present in the string after removing duplicates :" +count);
		
		
		
		
	}

}
