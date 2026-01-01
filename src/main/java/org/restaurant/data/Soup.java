package org.restaurant.data;

import org.restaurant.hepler.MenuItem;
import org.restaurant.interfaces.Discountable;

public class Soup extends MenuItem implements Discountable{
    private int price;
    public Soup(String name, int price) {
        super(name,price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Soup");
    }

    @Override
    public void serve() {
        System.out.println("Serve hot soup");
    }

    @Override
    public double applyDiscount(double percent) {
        double newPrice = getPrice() - getPrice() * percent / 100;
        setPrice(newPrice);
        return newPrice;
    }
}
