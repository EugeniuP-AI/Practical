package org.restaurant;

import org.restaurant.hepler.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
    List<MenuItem> items;

    public OrderList() {
        items = new ArrayList<MenuItem>();
    }

    public void addItem(MenuItem item){
        items.add(item);
    }

    public void printOrder(){
        for(MenuItem item:items){
            System.out.println(item);
        }
    }

    public double calculateTotal(){
        double total = 0;
        for(MenuItem item:items){
            total += item.getPrice();
        }
        return total;
    }
}
