package Assignment;

import java.util.ArrayList;
import java.util.List;

import com.graymatter.Item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Orders implements Comparable{
	
	private int orderId;
	private String date;
	private List<Item> itemList;
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double TotalCost() {
        double totalCost = 0.0;
        for (Item item : itemList) {
            totalCost += item.getPricePerUnit() * item.getNoOfUnit();
        }
        return totalCost;
    }

    public static Orders MaxOrder(List<Orders> ords) {
        Orders max = null;
        double maxCost = Double.MIN_VALUE;
        for (Orders order : ords) {
            double ordCost = order.TotalCost();
            if (ordCost > maxCost) {
                maxCost = ordCost;
                max = order;
            }
        }
        return max;
    }

}
