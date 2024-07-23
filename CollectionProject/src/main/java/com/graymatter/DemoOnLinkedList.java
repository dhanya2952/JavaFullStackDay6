package com.graymatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		LinkedList<String> fruitList =new LinkedList<String>();
//		fruitList.add("apple");
//		fruitList.add("banana");
//		fruitList.add("mango");
//		fruitList.add("orange");
//		System.out.println(fruitList);
//		
//		fruitList.addFirst("watermelon");
//		fruitList.addLast("kiwi");
//		System.out.println(fruitList);
//		
//		fruitList.add("orange");
//		//fruitList.add(null);
//		System.out.println(fruitList);
//
//		Iterator<String> itr = fruitList.listIterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
//		
//		Collections.sort(fruitList);
//		System.out.println(fruitList);
//		
//		fruitList.add(7, "melon");
//		System.out.println(fruitList);
//		
//		System.out.println(fruitList.contains("melon"));
//		
//		LinkedList<String> myFruits = (LinkedList<String>) fruitList.clone();
//		System.out.println(myFruits);
//		System.out.println(fruitList.hashCode());
//		System.out.println(myFruits.hashCode());
//		
//		myFruits.add("pineapple");
//		System.out.println(myFruits.hashCode());

		LinkedList<Employee> empList = new LinkedList<Employee>();
		Employee e1 = new Employee(123,"dhanya",200000,"hyb");
		Employee e2 = new Employee(124,"swapna",290000,"delhi");
		Employee e3 = new Employee(125,"preethi",700000,"hyb");
		Employee e4 = new Employee(126,"mohan",200000,"delhi");
		Employee e5 = new Employee(127,"kriti",500000,"hyb");		
		Employee e6 = new Employee(127,"kriti",300000,"hyb");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		
		LinkedList<Employee> myEmp = (LinkedList<Employee>) empList.clone();
		System.out.println(empList.hashCode());
		System.out.println(myEmp.hashCode());
		Employee e7 = new Employee(127,"kriti",300000,"hyb");
		myEmp.add(e7);
		System.out.println(myEmp);
		

		
		

	}

}
