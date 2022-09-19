package ProgramPracticeJava;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
	
	
		public static void main(String []arg)
		{

		String s="hello";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		

		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for(Character ch:set)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(ch.equals(s.charAt(j)))
					{
						count++;
					}
			}


			if(count>1)
			{
				System.out.println(ch+"===>"+count);
			
			}
			

		}
		
	
	
		
}
}