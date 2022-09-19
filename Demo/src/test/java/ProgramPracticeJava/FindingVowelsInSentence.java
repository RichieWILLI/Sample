package ProgramPracticeJava;

public class FindingVowelsInSentence {
	
	public static void main(String []arg)
	{

	String s="finding vowels in sentence";

			String [] str=s.split(" ");



	for(int i=0;i<str.length;i++)
	{
		char[] ch=str[i].toCharArray();
		int count=0;

		for(int j=0;j<ch.length;j++)
		{
		if(ch[j]=='a' || ch[j]=='e' || ch[j]=='i' || ch[j]=='o' || ch[j]=='u')
			{
			
				count++;		
			}
		
		}

		System.out.println(str[i]+"---> no of vowels is"+count);
	}
	}
	
	
	
	

}
