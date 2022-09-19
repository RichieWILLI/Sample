package ProgramPracticeJava;

public class FirstLetterCapital {
	public static void main(String arg[])
	{

	String s="welcome to bangalore";
	
		String [] str=s.split(" ");

	for(int i=0;i<str.length;i++)
	{
	String word=str[i];	
		String sententce=word.substring(0,1).toUpperCase()+word.substring(1);
		System.out.print(sententce+" ");
	}
	}

	
	
	
}
