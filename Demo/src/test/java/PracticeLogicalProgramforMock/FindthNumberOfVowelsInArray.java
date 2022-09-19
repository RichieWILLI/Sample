package PracticeLogicalProgramforMock;

import java.util.LinkedHashSet;

public class FindthNumberOfVowelsInArray {

	public static void main(String[] args) {
		
		
		String []a= {"apple","mangao","bannana"};
		
		
		
		for(int i=0;i<a.length;i++) {
			char[] s = a[i].toCharArray();
			
			int count=0;
			for(int j=0;j<s.length;j++) {
				if(s[j]=='a' || s[j]=='e' || s[j]=='i' || s[j]=='o' || s[j]=='u') {
					count++;
				}
			}
			System.out.println(a[i]+" "+count);
		}
		
		
		
		
	
	
	}

}
