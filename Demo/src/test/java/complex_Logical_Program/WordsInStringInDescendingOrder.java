package complex_Logical_Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class WordsInStringInDescendingOrder {

	public static void main(String[] args) {

		String s="emphaysy is working in neywotk";
		String[] str = s.split(" ");
		
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].length()<str[j].length()) {
					String  temp= str[i];
					str[i]=str[j];
					str[j]=temp;
					
					
				}
			}
		}
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		
		
	}
	
	
	

}
