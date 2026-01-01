package org.restaurant;

import org.restaurant.hepler.MenuItem;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class OrderMap {
    Map<Integer,MenuItem> items;

    public OrderMap() {
        items = new HashMap<>();
    }

    public void addItem(int id, MenuItem items){
        this.items.put(id,items);
    }

    public void printOrder(){
        for(Map.Entry<Integer,MenuItem> entry:items.entrySet()){
            System.out.println("ID" + entry.getKey() + " -> " + entry.getValue());
        }
    }

    public double calculateTotal(){
        double total = 0;
        for(Map.Entry<Integer,MenuItem> entry:items.entrySet()){
            total += entry.getValue().getPrice();
        }
        return total;
    }
}

