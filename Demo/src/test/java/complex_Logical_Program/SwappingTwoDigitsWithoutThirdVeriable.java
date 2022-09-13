package complex_Logical_Program;

public class SwappingTwoDigitsWithoutThirdVeriable {

	public static void main(String[] args) {
		
		
		int a=10;
		int b=20;
		
		a=a+b;	//a=10+20	a=>30;				//a=1+2	a=>3;
		b=a-b;	//b=10-20	b=>10;  no -ve		//b=1-2	b=>1;
		a=a-b;	//a=30-10	a=>20;				//a=3-1	a=>2;
		System.out.println(a);
		System.out.println(b);
	}

}
