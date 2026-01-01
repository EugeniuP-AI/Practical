package org.restaurant.interfaces;

public interface Deliverable {
    void deliver(String address);

    default void deliveryInfo(){
        System.out.println("Delivery in progress...");
    };
}
