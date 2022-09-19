package Program_Logical_KS_Git_Hub;

import java.util.LinkedHashSet;

public class NumberOfOccuranceOfEachCharacter_2 {

	public static void main(String[] args) {
		
		String s="Richie";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		
		for (Character ch : set) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(ch.equals(s.charAt(j))) {
					count++;
				}
			}
			System.out.println(ch+"===>"+count);
			
		}
		
	}

}
