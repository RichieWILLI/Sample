package PracticeLogicalProgramforMock;

import java.util.LinkedHashSet;

public class OccuranceOfWord {

	public static void main(String[] args) {
		
		
		String s="welcome to bangalore and welcome to testyantra";
		String[] str = s.split(" ");
		
			
			LinkedHashSet<String> set=new LinkedHashSet<String>();
			for(int j=0;j<str.length;j++) {
				set.add(str[j]);
			}
			
			for (String ch : set) {
				int count=0;
			for(int j=0;j<str.length;j++) {
				if(ch.equals(str[j]));{
					count++;
				}
			}
			System.out.println(ch+" "+count);
				
			}
			
			
			
			
		}
		
	}

