package com.graymatter;

import java.util.ArrayList;

public class DemoOnItem {
	
	public static void main(String[] args)
	{
		ArrayList<Item> itemList = new ArrayList<Item>();
		Item i1=new Item("laptop",20,20000,"hp");	
		Item i2=new Item("battery",30,5000,"hp");	
		Item i3=new Item("laptop",10,10000,"dell");	
		Item i4=new Item("battery",20,10000,"dell");	
		Item i5=new Item("laptop",30,50000,"lenovo");	
		
		itemList.add(i1);
		itemList.add(i2);
		itemList.add(i3);
		itemList.add(i4);
		itemList.add(i5);
		
		itemList.sort(new NameCompare().thenComparing(new BrandComparator()));//multi-level,multi-value comparing
		for(Item itm:itemList)
			System.out.println(itm);


	}

}
