package PracticeLogicalProgramforMock;

import java.util.LinkedHashSet;

public class FindingNumberVowelsWithoutDuplicate {

	public static void main(String[] args) {
		
		
		String[] s= {"bannana","orange","pinapple"};
		
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		for(int i=0;i<s.length;i++) {
			int count=0;
			char[] ch = s[i].toCharArray();
			lhs.add(s[i]);
			
			
			for (Object it : lhs) {
				
				 
					if(it.equals('a') || it.equals('e') || it.equals('i') || it.equals('o') || it.equals('u')) {
						count++;
					
					
				}
				System.out.println(s[i]+" "+count);
				
			}
			
			
		}
		
		
		
		
		
	}

}
