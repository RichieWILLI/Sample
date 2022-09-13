package practice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CombinationOfSimilarCharacters {

	public static void main(String[] args) {
		
		String st="zzzlllkkiopannbaaacccbb";
		int n = st.length();
		LinkedList list=new LinkedList();
		for(int i=0;i<n;i++) {
			
			list.add(st.charAt(i));
		}
		
		Collections.sort(list);
		
		for (Object it : list) {
			
			System.out.print(it);
			
		}
	
				
		
	}

}
