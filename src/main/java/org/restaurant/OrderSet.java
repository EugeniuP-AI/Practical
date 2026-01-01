package org.restaurant;

import org.restaurant.hepler.MenuItem;

import java.util.HashSet;
import java.util.Set;

public class OrderSet {
    Set<MenuItem> items;

    public OrderSet() {
        this.items = new HashSet<>();
    }

    public void addItem(MenuItem items) {
        this.items.add(items);
    }

    public void printOrder() {
        for (MenuItem item : items) {
            System.out.println(item.toString());
        }
    }

    private double calculateTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
