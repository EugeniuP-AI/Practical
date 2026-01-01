package org.restaurant.data;

import org.restaurant.hepler.MenuItem;
import org.restaurant.interfaces.Deliverable;
import org.restaurant.interfaces.Discountable;

public class Pizza extends MenuItem implements Discountable,Deliverable {

    public Pizza(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Pizza with following ingredients: cheese, chicken, tomatoes, vegetables ");
    }

    @Override
    public void serve() {
        System.out.println("Serving Pizza");

    }

    @Override
    public void deliver(String address) {

    }

    @Override
    public double applyDiscount(double percent) {
        double newPrice = getPrice() * percent / 100;
        setPrice(newPrice);
        return newPrice;
    }
}
