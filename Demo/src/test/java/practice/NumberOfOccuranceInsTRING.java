package practice;

import java.util.LinkedHashSet;

public class NumberOfOccuranceInsTRING {

	public static void main(String[] args) {

		String s="bharath";
		LinkedHashSet lhs=new LinkedHashSet();
		
		for(int i=0;i<s.length();i++) {
			lhs.add(s.charAt(i));
		}
		
		for (Object it : lhs) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(it.equals(s.charAt(i))) {
					count++;
				}
			}
			if(count>1)
			System.out.println(it+" "+count);
			
		}
		
		
	}

}
