package PracticeLogicalProgramforMock;

import java.io.CharConversionException;
import java.util.LinkedHashSet;

public class CountNumberofVowelsinStringArrayRemovingDuplicate {

	public static void main(String[] args) {
		
		String s[]= {"apple","oragne","greenapple","pinapple"};
		
			for(int i=0;i<s.length;i++) {
				char[] ch = s[i].toCharArray();
				int count=0;
				
				LinkedHashSet<Character> lhs =new LinkedHashSet<Character>();
				for(int j=0;j<ch.length;j++) {
					lhs.add(ch[j]);
				}
				
				for (Character it : lhs) {
					if(it=='a' || it=='e' || it=='i' || it=='o' || it=='u') {
						count++;
					}
					
				}
				System.out.println(s[i]+" "+count);
				
			}
		
		
	}

}
