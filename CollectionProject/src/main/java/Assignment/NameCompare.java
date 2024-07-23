package Assignment;

import java.util.Comparator;

//public class NameCompare implements Comparator<Item>{
//
//	@Override
//	public int compare(Item o1, Item o2) {
//		// TODO Auto-generated method stub
//		return o1.getName().compareTo(o2.getName());
//	}
	
public class NameCompare implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

		
	

}
