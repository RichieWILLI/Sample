package practice;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class FindThePositionOfEachCharacter {

	public static void main(String[] args) {
		
		String s="Pranav";
		for(int i=0;i<s.length();i++) {
		System.out.println(s.charAt(i)+"  "+s.indexOf(s.charAt(i)));
			
			
		}
		
		
	}

}
