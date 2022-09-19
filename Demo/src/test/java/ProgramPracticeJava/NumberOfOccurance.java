package ProgramPracticeJava;

import java.util.LinkedHashSet;

public class NumberOfOccurance {

	public static void main(String[] args) {
		
		
			String s="welcome to bangalore welcome to testyantra";

			String [] str=s.split(" ");
			LinkedHashSet<String> set =new LinkedHashSet();

			for(int j=0;j<str.length;j++){

			set.add(str[j]);

			}
			for(String it:set)
			{
			int count=0;
			for(int i=0;i<str.length;i++){

			if(it.equals(str[i])){

			count++;
			}

			}
			System.out.println(it+""+count);

			}




			}



			}
		
