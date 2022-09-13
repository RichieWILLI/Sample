package practice;

public class FirstMax {

	public static void main(String[] args) {
		
		int arr[]= {1,9,8,2,10};
		
		int firstMax=arr[0];
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>firstMax) {
			firstMax=arr[i];
			
		}
		}
		
		System.out.println(firstMax);
	}

}
