package org.restaurant;

import org.restaurant.data.Pizza;
import org.restaurant.data.Soup;
import org.restaurant.hepler.MenuItem;
import org.restaurant.interfaces.Deliverable;
import org.restaurant.interfaces.Discountable;

import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    static void main(String[] args)  {
        MenuItem pizza = new Pizza("Margarita", 120);
        pizza.prepare();
        pizza.serve();
        pizza.printReceipt();

        Discountable discountable = new Soup("Chicken soup", 100);
        System.out.println(discountable.applyDiscount(10));

        Deliverable deliverable = new Pizza("Peperoni", 120);
        deliverable.deliver("Chisinau");
        deliverable.deliveryInfo();

        System.out.println("---------------------------------------------");

        //Polimorphism

        List<MenuItem> items = new ArrayList<>();
        items.add(new Pizza("Funghi", 180));
        items.add(new Soup("Shrims soup", 200));
        items.add(new Pizza("Peperoni", 300));

        for (MenuItem item : items) {
            item.prepare();
            item.serve();
            item.printReceipt();
            System.out.println("-------");
        }

        //Collections List
        System.out.println("-----------LIST----------------");
        OrderList order = new OrderList();
        order.addItem(new Pizza("Funghi", 180));
        order.addItem(new Soup("Shrims soup", 200));
        order.addItem(new Pizza("Peperoni", 300));
        order.printOrder();
        System.out.println("Total price for order is: " + order.calculateTotal());

        //Collections Set
        System.out.println("-----------HASHSET----------------");
        OrderSet orderSet = new OrderSet();
        orderSet.addItem(new Pizza("Funghi", 10));
        orderSet.addItem(new Soup("Shrims soup", 20));
        orderSet.addItem(new Pizza("Peperoni", 3000));
        orderSet.addItem(new Pizza("Funghi", 180));
        orderSet.printOrder();
        System.out.println("Total price for order is: " + order.calculateTotal());

        //Collections Map
        System.out.println("-----------HASMAP----------------");
        OrderMap orderMap = new OrderMap();
        orderMap.items.put(1, new Pizza("Funghi", 10));
        orderMap.items.put(2, new Soup("Shrims soup", 200));
        orderMap.items.put(3, new Pizza("Peperoni", 300));
        orderMap.printOrder();
        System.out.println("Total price for order is: " + orderMap.calculateTotal());
    }
}

