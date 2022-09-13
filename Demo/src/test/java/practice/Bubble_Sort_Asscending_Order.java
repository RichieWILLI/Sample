package practice;

public class Bubble_Sort_Asscending_Order {

	public static void main(String[] args) {
		
		int arr[]= {3,4,1};
		
		System.out.println("the array element before bubble sort ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int n=arr.length;
		int temp=0;
		
//		for(int i=0;i<n;i++) {
//			for(int j=1;j<(n-i);j++) {
//				
//				if(arr[j-1]>arr[j]) {
//					
//					temp=arr[j-1];
//					arr[j-1]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		System.out.println("the array after  bubble sort ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
	}

}
