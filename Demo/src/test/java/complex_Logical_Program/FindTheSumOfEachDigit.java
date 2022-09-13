package complex_Logical_Program;

public class FindTheSumOfEachDigit {

	public static void main(String[] args) {
		
		int n=123;
		int sum=0;
		int a=0;
		while(n>0) {
			a=n%10;
			sum=sum+a;
			n=n/10;
		}
		System.out.println(sum);
	}

}
