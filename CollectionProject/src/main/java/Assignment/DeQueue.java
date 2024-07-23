package Assignment;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;

import com.graymatter.NameComparator;

public class DeQueue {

    public static void main(String[] args) {
        ArrayDeque<Customer> customer = new ArrayDeque<Customer>();

        Customer c1 = new Customer(1, "dhanya", 21);
        Customer c2 = new Customer(2, "abc", 16);
        Customer c3 = new Customer(3, "def", 40);
        Customer c4 = new Customer(4, "ghi", 67);
        Customer c5 = new Customer(5, "jkl", 32);
        Customer c6 = new Customer(6, "mno", 56);

        customer.add(c1);
        customer.add(c2);
        customer.add(c3);
        customer.add(c4);
        customer.add(c5);
        customer.add(c6);

        System.out.println(" --------------------------");
        for (Customer cust : customer) 
            System.out.println(cust);
        
        System.out.println("----------Sorting -----------------------");
        for (Customer customer1 : customer) 
            System.out.println(customer1);

        
        System.out.println("----------------------------");
        customer.remove(c1);
        System.out.println(customer);

        System.out.println("----------------------------");
        System.out.println(customer.contains(c1));
        
        

        ArrayList<Customer> cList = new ArrayList<Customer>(customer);

        
        cList.sort(Comparator.comparing(Customer::getName));

        
        System.out.println("========================");
        for (Customer custo : cList) 
            System.out.println(custo);
        
    }
}

