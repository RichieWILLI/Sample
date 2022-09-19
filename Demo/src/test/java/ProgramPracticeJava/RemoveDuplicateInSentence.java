package ProgramPracticeJava;

import java.util.LinkedHashSet;

public class RemoveDuplicateInSentence {
	
	
	public static void main(String []arg)
	{

	String s="welcome to testyantra and welcome to Bangalore";

			String [] str=s.split(" ");

		

		LinkedHashSet hs=new LinkedHashSet();
	for(int j=0;j<str.length;j++)
	{
		hs.add(str[j]);
	}

	for(Object ch:hs)
	{
	int count=0;
	for(int j=0;j<str.length;j++)
	{
	if(ch.equals(str[j]))
	{
	count++;
	}

	}
	if(count>1) {
	System.out.println(ch+""+count);
	}

	}

	}





	}

	

