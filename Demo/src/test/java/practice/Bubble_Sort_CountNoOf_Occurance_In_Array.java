package practice;

import java.util.LinkedHashSet;

public class Bubble_Sort_CountNoOf_Occurance_In_Array {

	public static void main(String[] args) {
		
		int arr[]= {1,1,1,9,4,6,3,2,4,2};
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		
		
		for (Integer it : set) {
			
			int count=0;
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i]==it) {
					
					
					count++;
				}
				
				
				
			}
			
			System.out.println(it+":"+count);
			
		}
				
}
}
