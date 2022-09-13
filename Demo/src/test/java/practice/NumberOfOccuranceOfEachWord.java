package practice;

import java.util.LinkedHashSet;

public class NumberOfOccuranceOfEachWord {

	public static void main(String[] args) {
		
		String s="welcome to testyantra and welcome to bangalore and bangalore is beautiful place";
		String[] sp = s.split(" ");
		LinkedHashSet lhs=new LinkedHashSet();
		for(int i=0;i<sp.length;i++) {
			lhs.add(sp[i]);
		}
		
		for (Object it: lhs) {
			int count=0;
			for(int i=0;i<sp.length;i++) {
				if(it.equals(sp[i])) {
					count++;
				}
			}
			System.out.println(it+ "-- " +count+ "times");
			
		}
		
		
	}

}
