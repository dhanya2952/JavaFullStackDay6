package com.graymatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class DemoOnSets {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		//no duplicates,insertion order not preserved
//		for(int i=1;i<=10;i++)
//			hs.add(i);
		hs.add(12);
		hs.add(23);
		hs.add(34);
		hs.add(45);
		hs.add(45);
		hs.add(null); //only one null value can be added
		System.out.println(hs);
		
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		HashSet<Integer> hs1 = (HashSet<Integer>) hs.clone();
		System.out.println(hs1);
		
		System.out.println(hs.getFirst());
		Object arr[]=hs.toArray();
		System.out.println(arr[2]);
		
		List<Object> alist=Arrays.asList(arr);
		
		TreeSet<Integer> ts =new TreeSet<Integer>();
		ts.add(88);
		ts.add(34);
		ts.add(67);
		ts.add(99);
		ts.add(12);
		ts.add(56);
		ts.add(40);
		System.out.println(ts);
		
		Iterator<Integer> it =ts.descendingIterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		Employee e1 = new Employee(123,"dhanya",200000,"hyb");
		Employee e2 = new Employee(124,"swapna",290000,"delhi");
		Employee e3 = new Employee(125,"preethi",700000,"hyb");
		Employee e4 = new Employee(126,"mohan",200000,"delhi");
		Employee e5 = new Employee(127,"kriti",500000,"hyb");		
		Employee e6 = new Employee(127,"kriti",300000,"hyb");
		
		//treeSet will not do replacement when same element or value is encountered
		
		TreeSet<Employee> empTree= new TreeSet<Employee>();
		empTree.add(e1);
		empTree.add(e2);
		empTree.add(e3);
		empTree.add(e4);
		empTree.add(e5);
		empTree.add(e6);
		
		for(Employee emp:empTree)
			System.out.println(emp);
//		System.out.println("--------------------");
//		System.out.println(ts.ceiling(60));
//		System.out.println(ts.floor(60));
//		System.out.println(ts.headSet(56));
//		System.out.println(ts.tailSet(56));
//		System.out.println(ts.pollFirst());
//		System.out.println(ts.descendingSet());
		
		
		
		
		
		
		

		
	}

}
