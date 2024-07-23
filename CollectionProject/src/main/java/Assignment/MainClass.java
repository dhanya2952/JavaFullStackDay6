package Assignment;

import java.util.ArrayList;
import java.util.List;

import com.graymatter.Item;

public class MainClass {
	public static void main(String[] args) {
	       
		Item i1=new Item("laptop",20,20000,"hp");	
		Item i2=new Item("battery",30,5000,"hp");	
		Item i3=new Item("laptop",10,10000,"dell");	
		Item i4=new Item("battery",20,10000,"dell");	
		Item i5=new Item("laptop",30,50000,"lenovo");

        List<Item> item = new ArrayList<Item>();
        item.add(i1);
        item.add(i2);
        Orders order = new Orders(1, "23/08/2024", item);

        List<Item> items = new ArrayList<Item>();
        items.add(i3);
        Orders order1 = new Orders(2, "23/08/2024", items);

        List<Orders> ord = new ArrayList<Orders>();
        ord.add(order);
        ord.add(order1);

        for (Orders od : ord) {
            System.out.println("Order " + od.getOrderId() + " total cost: Rs." + od.TotalCost()); 
        }

        Orders maxOrder = Orders.MaxOrder(ord);
        if (maxOrder != null) {
            System.out.println("\nMax Order ID " + maxOrder.getOrderId() + " cost - Rs." + maxOrder.TotalCost());
        }
    }

}
