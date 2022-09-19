package PracticeLogicalProgramforMock;

import java.util.ArrayList;
import java.util.Collections;

public class AscendingOrderWithoutBubbleSort_3 {

	public static void main(String[] args) {
		
		int a[]= {10,5,3,7};
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			al.add(a[i]);
		}
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
	}

}
