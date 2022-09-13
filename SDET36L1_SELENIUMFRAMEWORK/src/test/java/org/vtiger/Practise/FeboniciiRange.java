package org.vtiger.Practise;

import java.util.Scanner;

import org.testng.annotations.Test;

public class FeboniciiRange {

	@Test
	public void feboniciiRange() {
		
		
		int div=5/10;
		int mod=5%10;
		
		System.out.println(div);
		System.out.println(mod);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		
		
		
		int a=0;
		int b=1;
		int c=0;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2;i<=n;i++) {
			c=a+b;
			
			if(c<=n)
			{
				System.out.println(c);
			
				a=b;
				b=c;
			}
		}
		
		

		
		
		
	}
}
