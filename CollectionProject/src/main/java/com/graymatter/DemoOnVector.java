package com.graymatter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DemoOnVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vector = new Vector<Integer>();
		//resizeable array,legacy class-enumeration class,initial capacity 10
		//if vector capacity exhausted then capacity becomes double
		
		System.out.println(vector.capacity());
		for(int i=1;i<=10;i++)
			vector.add(i);
		System.out.println(vector.capacity());
		vector.add(11);
		System.out.println(vector.capacity());
		Enumeration<Integer> eNum=vector.elements();
		while(eNum.hasMoreElements())
		{
			int i=eNum.nextElement();
			System.out.println(i);
		}
		
		Iterator<Integer> itr= vector.iterator();
		while(itr.hasNext())
		{
			int i=itr.next();
			if(i==6)
				itr.remove();
			System.out.println(i);
		}
		System.out.println(vector);
		System.out.println(vector.contains(6));
		System.out.println(vector.equals(itr));
		
		
	}

}
