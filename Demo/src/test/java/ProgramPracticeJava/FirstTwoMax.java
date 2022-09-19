package ProgramPracticeJava;

public class FirstTwoMax {

	public static void main(String []arg)
	{
	int a[]={191,111,11,412,1099};
	int firstMax=a[0];
	int secondMax=a[1];

	for(int i=1;i<a.length;i++)
	{
		if(firstMax<a[i])
		{
			secondMax=firstMax;
			firstMax=a[i];
			
		}
	}
	System.out.println(firstMax);
	System.out.println(secondMax);
	
	}
}
