package practice;

import java.util.LinkedHashSet;

public class NumberOfOccuranceOfWord {

	public static void main(String[] args) {
		
		String s="welcome to testyantra and welcome to bangalore";
		String[] sp = s.split(" ");
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		
		for(int i=0;i<sp.length;i++) {
			hs.add(sp[i]);
			
		}
		for (String str : hs) {
			int count=0;
			for(int i=0;i<sp.length;i++) {
				if(str.equals(sp[i])) {
					count++;
				}
			}
			System.out.println(str+" "+count);
			
		}
		
		
		
		
	}

}
