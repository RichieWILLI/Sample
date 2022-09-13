package practice;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		
		String s="aaaaabbbbbccccdddd";
		LinkedHashSet set=new LinkedHashSet();
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		
		System.out.println(set);
		
		
	}

}
