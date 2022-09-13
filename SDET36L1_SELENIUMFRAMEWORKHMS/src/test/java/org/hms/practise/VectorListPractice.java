package org.hms.practise;

import java.util.Enumeration;
import java.util.Vector;

public class VectorListPractice {

	public static void main(String[] args) {
		
		Vector<String> vec=new Vector<>(4);
		vec.add("Tiger");
		vec.add("deer");
		vec.add("lion");
		vec.add("Elephant");
		
		//checking the size and capacity of vector
		System.out.println("the size of the vector is : "+vec.size());
		System.out.println("Default capacity of vector is : "+vec.capacity());
		
		//display vector elements
		System.out.println("the elements in vector are : "+vec);
		
		//add new elements in vector
		
		vec.addElement("dog");
		vec.addElement("cow");
		
		//checking the size and capacity of vector
		System.out.println("the size of the vector after adding element is : "+vec.size());
		System.out.println("Default capacity of vector after adding element is : "+vec.capacity());
		
		//display the elements in vector
		System.out.println("the elements in vector after adding elements are : "+vec);
		
		//checking the element is present and what index
		
		if (vec.contains("Tiger")) {
			System.out.println("yes the element Tiger is present");
			System.out.println("the element tiger is present in index = "+vec.indexOf("Tiger"));	
		}
		else
		{
			System.out.println("the element tiger is not present");
		}
		
		//using has more elements
		System.out.println("****************");
		System.out.println("                ");
		Vector<Object> v=new Vector<>();
		v.add("hello");
		v.add(20);
		v.add(30);
		v.add(30);
		v.add(40);
		
		Enumeration<Object> ele = v.elements();
		
		while (ele.hasMoreElements()) {
			System.out.println(ele.nextElement());
			
		}
		
		
		
		
	}

}
