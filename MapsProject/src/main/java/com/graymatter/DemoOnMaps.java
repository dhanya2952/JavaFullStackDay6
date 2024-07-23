package com.graymatter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoOnMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map=new  HashMap<Integer, String>();
		map.put(11, "Mohan");
		map.put(9, "sruthi");
		map.put(8, "swapna");
		map.put(4, "swathi");
		map.put(7, "Sam");
		map.put(6, "dhanya");
		System.out.println(map);
		System.out.println(map.get(11));
		System.out.println(map.keySet());
		System.out.println(map.values());
		
//		map.put(null, "abc");
//		System.out.println(map);
//		System.out.println(map.get(null));
		
		//covert maps to set to use iterators
		Set<Entry<Integer, String>> entSet = map.entrySet();
		Iterator<Entry<Integer, String>> itr = entSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		for(Entry<Integer, String> e:entSet)
			System.out.println(e.getKey()+" "+e.getValue());
		
		entSet.parallelStream();
		System.out.println(entSet);
		
		//treemap can work directly on user define
		
		Employee e1 = new Employee(123,"dhanya",200000,"hyb");
		Employee e2 = new Employee(124,"swapna",290000,"delhi");
		Employee e3 = new Employee(125,"preethi",700000,"hyb");
		Employee e4 = new Employee(126,"mohan",200000,"delhi");
		Employee e5 = new Employee(127,"kriti",500000,"hyb");		
		Employee e6 = new Employee(127,"kriti",300000,"hyb");
		
		TreeMap<Integer, Employee> treeMap = new TreeMap<Integer, Employee>();
		treeMap.put(1, e1);
		treeMap.put(2, e2);
		treeMap.put(6, e3);
		treeMap.put(4, e4);
		treeMap.put(3, e5);
		treeMap.put(5, e6);
		
		for(Entry<Integer, Employee> emp:treeMap.entrySet())
			System.out.println(emp);
		
		TreeMap<Employee, Address>  myMap = new TreeMap<Employee, Address>();
		Address addr= new Address("hyd","Telengana");
		myMap.put(e1, addr);
		myMap.put(e6, addr);
		System.out.println(myMap);
	
		

	}

}
