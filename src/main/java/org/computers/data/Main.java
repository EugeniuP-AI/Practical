package org.computers.data;

import org.computers.enums.OperationalSystem;

public class Main {

    public static void main(String[] args) {
       Manufacture appleManufacture = new Manufacture("Moldova", "Parhalab 63");
       Phone iphone = new Phone(appleManufacture, OperationalSystem.IOS, "iPhone 14", 8, 52);
       System.out.println(iphone);
       iphone.boot();
       iphone.shutDown();

       System.out.println("---------------------");
       Manufacture samsungManufacture = new Manufacture("South Korea", "Seoul 12");
       Laptop samsungLaptop = new Laptop(samsungManufacture,OperationalSystem.LINUX,"Samsung Q-65", 74,  33.2);
       System.out.println(samsungLaptop);
       samsungLaptop.boot();
       samsungLaptop.shutDown();

       System.out.println("---------------------");
       Manufacture lenovoManufacture = new Manufacture("China", "Beijing 7");
       Desktop lenovoDesktop = new Desktop(lenovoManufacture, OperationalSystem.WINDOWS, "Lenovo I-71", 128, 65);
       System.out.println(lenovoDesktop);
       lenovoDesktop.boot();
       lenovoDesktop.shutDown();
    }
}