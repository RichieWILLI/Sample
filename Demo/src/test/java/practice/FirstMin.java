package practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class FirstMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int arr[]= {1,9,8,2,10};
		
		int firstMin=arr[0];
		for(int i=0;i<arr.length;i++) {
		if(arr[i]<firstMin) {
			firstMin=arr[i];
			
		}
		}
		
		System.out.println(firstMin);
		
		System.out.println("------------");
		
		
		ArrayList arli=new ArrayList();
		
		
		arli.add(12);
		arli.add(11);
		arli.add(2);
		arli.add(1);
		arli.add(3);
		System.out.println(arli);
		
		
		System.out.println("------------");
		
		LinkedList lk=new LinkedList();
		lk.add(3);
		lk.add(1);
		lk.add(11);
		lk.add(2);
		lk.add(111);
		
		System.out.println(lk);
		
	}

	
	
	
	
	
	
}
