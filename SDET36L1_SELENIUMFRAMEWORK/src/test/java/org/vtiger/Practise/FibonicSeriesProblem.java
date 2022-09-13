package org.vtiger.Practise;

public class FibonicSeriesProblem {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the number");
		int m=sc.nextInt();
		int f=fib(m);
		System.out.println(f);
		
		
		
		
		

	}
	
	static int fib(int n)
	{
	if(n==0)
	return 0;
	if(n==1)
	return 1;
	return fib(n-1)+fib(n-2);
	}

}
