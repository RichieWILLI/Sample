package ProgramPracticeJava;

import java.util.LinkedHashSet;

public class OccuranceOfWord {
	
	
	public static void main(String []arg)
	{

	String s="hi how are you and where are you";

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

	System.out.println(ch+"=="+count);

	}

	}
	}
	
	
	


