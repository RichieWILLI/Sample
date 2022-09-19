package PracticeLogicalProgramforMock;

import java.util.LinkedHashSet;

public class SeggregateSimilarLetterInString {

	public static void main(String[] args) {
		
		String s="aaaazzzzccccbbb";
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			lhs.add(s.charAt(i));
			
		}
		
		for (Character it : lhs) {
			for(int i=0;i<s.length();i++) {
				if(it.equals(s.charAt(i))) {
					System.out.print(s.charAt(i));
				}
			}
			System.out.print(",");
		}
	}

}
