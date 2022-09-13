package org.vtiger.Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;

public class Collection {

	public static void main(String[] args) {
		
		//array list
		ArrayList a1=new ArrayList<>();
		a1.add(10);
		a1.add(11);
		a1.add(10);
		a1.add(3, 2);
		System.out.println(a1);
		
		Collections.sort(a1);
		
		System.out.println(a1);
		
		ArrayList a2=new ArrayList<>();
		a2.add("hi");
		a2.add(2);
		
		//a1.addAll(4, a2);
		
		a1.retainAll(a2);
		System.out.println(a1);
		
		//linked list
		LinkedList l1=new LinkedList<>();
		System.out.println(l1);
		l1.add(11);
		l1.add("Running");
		l1.add("ALL IS WELL");
		System.out.println(l1);
		
		l1.addFirst("ok");
		System.out.println(l1);
		l1.addLast("ahahah");
		System.out.println(l1);
		l1.removeFirst();
		System.out.println(l1);
		System.out.println(l1.getFirst());
	
		
		
		//set
		HashSet hs=new HashSet<>();
		hs.add("helo");
		hs.add("fine");
		hs.add("thank you");
		hs.add("take care");
		hs.add("hi");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		//hs.add("thank you");
		//System.out.println(hs);
		
		Iterator i = hs.iterator();
		while (i.hasNext()) {
			
			System.out.println(i.next());
			
		}
		
		
		
		//linked hashset
		LinkedHashSet lhs=new LinkedHashSet<>();
		lhs.add(13);
		lhs.add(22);
		//lhs.addAll(hs);
		lhs.add("namasakara");
		System.out.println(lhs);
		
		
		//sorted set
		SortedSet st=new TreeSet<>();
		st.add("monday");
		st.add("wednesday");
		st.add("sunday");
		st.add("friday");
		System.out.println(st);
		
		//tree set
		TreeSet ts=new TreeSet();
		ts.add(14);
		ts.add(10);
		ts.add(1);
		ts.add(6);
		
		
		ts.comparator();
		i=ts.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		ArrayList arli=new ArrayList<>(ts);
		System.out.println(arli);
		
		arli.add("hi");
		System.out.println(arli);
		
		
		
		
	}

}
