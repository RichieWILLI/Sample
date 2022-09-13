package org.hms.practise;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeArrayList {

	public static void main(String[] args) {
				
		ArrayList<Object> list=new ArrayList<>();
		list.add(10);
		list.add('A');
		list.add("hello");
		list.add(10);
		System.out.println(list);
		//out put will be like this [10, A, hello, 10]

		
		//after second index insert the value true..for that use list.add(index,value);
		
		list.add(2,true);
		System.out.println(list);
		//out put will be like this [10, A, true, hello, 10]
		
		//use of list.addall
		ArrayList<Object> list2=new ArrayList<>();
		list2.add("A");
		list2.add("B");
		
		list.add(list2);//adding the list2 data into list
		System.out.println(list);//output is like this [10, A, true, hello, 10, [A, B]]

		System.out.println(list2);//output is like this [A,B]
		
		
		if (list.contains('A')) {
			System.out.println("yes");
			
		}
		else {
			System.out.println("no");
		}
		
		//for printing the values present in the array list one by one
		
		ArrayList<Integer> number=new ArrayList<>();
	
		number.add(10);
		number.add(20);
		number.add(40);
		number.add(12);
		
		for (int i : number) {
			System.out.println(i);
		}
//		output		
//		10
//		20
//		40
//		12
		
		Collections.sort(number);
		
		System.out.println("the ascending order of printing the data present in the array list ");
		for (Integer j : number) {
			System.out.println(j);
			
		}
		
		//to remove the duplicate when two array list is combined
		
		ArrayList<Object> b1=new ArrayList<>();
		b1.add(10);
		b1.add("hello");
		b1.add('A');
		b1.add("go and get cup of tea");
		System.out.println("b1 value");
		System.out.println(b1);
		
		ArrayList<Object> b2=new ArrayList<>();
		b2.add("hello");
		b2.add('A');
		b2.add(12);
		b2.add("hi");
		System.out.println("b2 value");
		System.out.println(b2);
		
		
		
		
		System.out.println("retainall b2");
		
		//b1.retainAll(b2);
		//System.out.println(b1);
		
		b1.removeAll(b2);
		System.out.println(b1);
		
		
		//get method in array list
		ArrayList<Object> ar=new ArrayList<>();
		ar.add(10);
		ar.add("My  name Is Richard");

		System.out.println(ar.get(1));
		
		
		

		
	}

}
