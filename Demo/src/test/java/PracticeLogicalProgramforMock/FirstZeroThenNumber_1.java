package PracticeLogicalProgramforMock;

public class FirstZeroThenNumber_1 {

	public static void main(String[] args) {

		int arr[]= {2,6,4,4,0,0,3,0};
		int m=0;
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		
		int n=count;
		
		int brr[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				brr[m]=arr[i];
				m++;
			}
			else
			{
				brr[n]=arr[i];
				n++;
			}
		}
		
		for(int i=0;i<brr.length;i++) {
			System.out.print(brr[i]+" ");
		}
	}

}
