package com.graymatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DemoOnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
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

		
		System.out.println("from to string");
		System.out.println(empList);
		System.out.println("enhanced for loop");
		for(Employee emp:empList)
			System.out.println(emp);
		System.out.println("Using iteratoe");
		Iterator<Employee> itr = empList.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("using Collections");
		//Collections.sort(empList);
		empList.sort(new CityComparator().thenComparing(new NameComparator()).thenComparing(new SalaryComparator()));//multi-level,multi-value comparing
		for(Employee emp:empList)
			System.out.println(emp);
		
		System.out.println("------------------------------");
		System.out.println("using lambda function");
		empList.forEach((emp) -> System.out.println(emp));
		
		

		

	}

}
