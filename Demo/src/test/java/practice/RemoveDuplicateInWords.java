package practice;

import java.util.LinkedHashSet;

public class RemoveDuplicateInWords {

	public static void main(String[] args) {
		
		String s="welcome to bangalore and welcome to testyantra";
		String[] s1 = s.split(" ");
		
		LinkedHashSet hs=new LinkedHashSet();
		for(int i=0;i<s1.length;i++) {
			hs.add(s1[i]);
		}
		System.out.println(hs);
		
		
	}

}
