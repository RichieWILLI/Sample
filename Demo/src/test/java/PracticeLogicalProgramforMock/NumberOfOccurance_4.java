package PracticeLogicalProgramforMock;

import java.util.LinkedHashSet;

public class NumberOfOccurance_4 {

	public static void main(String[] args) {

		int a[]= {1,1,1,1,6,7,3,3,2};
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			lhs.add(a[i]);
		}
		
		for (Integer iter : lhs) {
			int count=0;
			for(int i=0;i<a.length;i++) {
				if(iter==a[i]) {
					count++;
				}
			}
			
			System.out.println(iter+" "+count);
			
		}
		
	}

}
