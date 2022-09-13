package org.vtiger.Practise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		//LIST Collection
		
		//array list
		//three overloading of arraylist
		ArrayList a1=new ArrayList<>();
		ArrayList a2=new ArrayList<>(4);
		ArrayList a3=new ArrayList<>(a2);
		
		//two overload of linked list
		LinkedList l1=new LinkedList<>();
		LinkedList l2=new LinkedList<>(l1);
		
		l1.add(12);
		l1.add("hari");
		l1.add(0,5);
		
		System.out.println(l1);
		
	
		l2.addAll(l1);
		System.out.println(l2);
		
		l1.addAll(3, l2);
		System.out.println(l1);
		
		//set
		
		
		//hashset has 4 overloading constructor
		HashSet hs1=new HashSet<>();
		HashSet hs2=new HashSet<>(hs1);
		HashSet hs3=new HashSet<>(4);
		HashSet hs4=new HashSet<>(4, 45);
		
		hs1.add(1);
		hs1.add(3); //duplicated is not allowed in set (hashset)
		System.out.println(hs1);
		
		hs1.add(null);
		System.out.println(hs1);
		hs1.add(2);
		System.out.println(hs1);
		
		
		
		//comparator method in the treeset
		
		TreeSet ts=new TreeSet<>();
		ts.add(100);
		ts.add(-23);
		ts.add(20);
		ts.add(1);
		
		ts.comparator();//this will sort the elememt in assending order. this method is present in the tree set
		System.out.println(ts);
		
		
		
		
	}

}
