package complex_Logical_Program;

import org.testng.annotations.Test;

public class AddEachDigitInNumber {
	
static	int n=1234;
static	int sum=0;
	
	@Test
	public void addEachDigitInNumber() {
		
		System.out.println("start");
		add();
		System.out.println(sum);
		
		
	}
	public static void add() {
		
		if(n!=0) {
		int rem=n%10;
		sum=sum+rem;
		n=n/10;
		add();
		}
	}
	
	
	

}
