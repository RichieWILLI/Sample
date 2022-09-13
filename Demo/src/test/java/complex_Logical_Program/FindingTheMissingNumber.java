package complex_Logical_Program;

public class FindingTheMissingNumber {

	public static void main(String[] args) {
		
		//i/p a[]={1,2,4,5,7,10} o/p=3,6,8,9 missing elements
		
		int a[]= {1,2,4,5,7,10};
		
		for(int i=0;i<a.length-1;i++)//use for loop for access the each elements
		{
			
			int n=a[i+1]-a[i];	//find the difference between 2nd number and 1st number
			int count=1;		
			while(n>1) {		//if difference is more than 1 then number is missing use while loop if difference is>1
				System.out.print(a[i]+count+" ");	//print the missing number current number +count
				count++;							//increase the next count to print next number
				n--;								// decrease the value n for decrease the while loop
			}
		}
		
		
		
		
		
	}

}
