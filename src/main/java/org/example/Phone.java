package org.example;

public class Phone extends Manufacture implements Computer {
    public Phone(String model, String brand, String manufacturer) {
        super(model, brand, manufacturer);
    }

    public void boot() {
        System.out.println("Phone is booting...starts the applications");
    }

    public void shutDown() {
        System.out.println("Phone is shutting down...stops the applications");
    }
}
