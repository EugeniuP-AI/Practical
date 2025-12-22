package org.example;

public class Phone implements Computer {
    private Manufacture manufacture;

    public Phone(Manufacture manufacture) {
        this.manufacture = manufacture;

    }

    public void boot() {
        System.out.println("Phone is booting...starts the applications");
    }

    public void shutDown() {
        System.out.println("Phone is shutting down...stops the applications");
    }
}
