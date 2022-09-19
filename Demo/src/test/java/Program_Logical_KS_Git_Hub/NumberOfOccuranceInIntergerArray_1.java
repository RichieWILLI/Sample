package Program_Logical_KS_Git_Hub;

import java.util.LinkedHashSet;

public class NumberOfOccuranceInIntergerArray_1 {

	public static void main(String[] args) {
			
		
		int a[]= {12,2,3,4,2,3,41,3,3,4,1};
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		
		System.out.println(set);
		
		for (Integer num : set) {
			 int count=0;
			for(int i=0;i<a.length;i++) {
				if(num==a[i]) {
					count++;
				}
			}
			System.out.println(num+"====> "+count+" Times");
			
		}
		
		
	}

}
