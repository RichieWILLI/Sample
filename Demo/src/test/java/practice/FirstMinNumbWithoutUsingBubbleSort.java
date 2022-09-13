package practice;

public class FirstMinNumbWithoutUsingBubbleSort {

	public static void main(String[] args) {
		
int a[]= {2,9,6,10};
		
		int firstMin=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<firstMin) {
				firstMin=a[i];
			}
		}
		System.out.println(firstMin);
		
	}

}
