package practice;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="Richard";
		String s1=s.toLowerCase();
		

		for(int i=0;i<s1.length();i++)
		{
			Character ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{

				System.out.println(ch);
			}
	

		}

		
		}		
	}


