package practice;

import java.util.LinkedHashSet;

public class NumberOfOccuranceInCharacterInString {

	public static void main(String[] args) {
		
		String st="RajGopal";
		
		
		
		LinkedHashSet hs= new LinkedHashSet();
		
		for(int i=0;i<st.length();i++) {
			hs.add(st.charAt(i));
		}
		
		
		for (Object it : hs) {
			int count=0;
			for(int i=0;i<st.length();i++) {
				if(it.equals(st.charAt(i))) {
				count++;	
					
				}
				
			}
			System.out.println(it+" "+count);
			
		}
		
		
		
		
	}

}
