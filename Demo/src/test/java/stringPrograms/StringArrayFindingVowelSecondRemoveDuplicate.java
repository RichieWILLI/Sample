package stringPrograms;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class StringArrayFindingVowelSecondRemoveDuplicate {

	
	@Test
	public void stringArrayFindingVowelSecondRemoveDuplicate() {
		
		
String str[]= {"apple","mango","banana","orange"};
		
		
		for(int i=0;i<str.length;i++) {
			char[] s=str[i].toCharArray();
			int count=0;
			
			LinkedHashSet<Character> set=new LinkedHashSet<Character>();
			for(int j=0;j<s.length;j++) {
				set.add(s[j]);
			}
			
			for (Character character : set) {
				if(character=='a' || character=='u' || character=='e' || character=='i' || character=='o') {
					count++;
				}
				
			}
			System.out.println(str[i]+" "+count);
			
			
			
	}
	}
}
