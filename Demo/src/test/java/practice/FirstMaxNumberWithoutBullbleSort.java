package practice;

public class FirstMaxNumberWithoutBullbleSort {

	public static void main(String[] args) {
		
		int a[]= {2,9,6,10};
		
		int firstMax=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>firstMax) {
				firstMax=a[i];
			}
		}
		System.out.println(firstMax);
		
		
		
		
	}

}
