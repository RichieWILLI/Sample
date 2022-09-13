package org.vtiger.Practise;

import java.util.ArrayList;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseString {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the String");
//		String st = sc.nextLine();
//		System.out.println("the enter string is = "+st);
//		
//		//convert string to array
//		char[] ch = st.toCharArray();
//		
//		for(int i=0;i<ch.length/2;i++) {
//			char t;
//			t=ch[i];
//			ch[i]=ch[ch.length-1-i];
//			ch[ch.length-1-i]=t;
//		}
//		st=new String(ch);
//		System.out.println("the reverse of the string is = "+st);
		String s="prasanna";
		String st=" ";
		for(int i=s.length()-1;i>=0;i--) {
			
		st=st+s.charAt(i);
					
			
		}
		System.out.println(st);

	}
	
	
}


	
	
	
	
	
	
	


