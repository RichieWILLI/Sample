package PracticeLogicalProgramforMock;

import java.util.LinkedHashSet;

public class DuplicateWordsInTwoString {

	public static void main(String[] args) {
		
		String s1="welcome to bangalore";
		String s2="welcome to testyantra";
		String s3=s1+" "+s2;
		String[] s4 = s3.split(" ");
		
		LinkedHashSet lhs=new LinkedHashSet();
		for(int i=0;i<s4.length;i++) {
			lhs.add(s4[i]);
		}
		
		for (Object it : lhs) {
			
			int count=0;
			for(int i=0;i<s4.length;i++) {
				if(it.equals(s4[i])) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(it+" "+count);
			}
			
			
		}
		
	}

}
