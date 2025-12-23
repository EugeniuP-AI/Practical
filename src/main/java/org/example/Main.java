package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private Manufacture manufacture;

    public static void main(String[] args) {
       Manufacture appleManufacture = new Manufacture("Moldova", "Parhalab 63");
       Phone iphone = new Phone(appleManufacture, "IOS 26", "iPhone 14", 4, 52);
       System.out.println(iphone);
       iphone.boot();
       iphone.shutDown();

       System.out.println("---------------------");
       Manufacture samsungManufacture = new Manufacture("South Korea", "Seoul 12");
       Laptop samsungLaptop = new Laptop(samsungManufacture, "Windows 11", 74,  33.2);
       System.out.println(samsungLaptop);
       samsungLaptop.boot();
       samsungLaptop.shutDown();

        System.out.println("---------------------");
        Manufacture lenovoManufacture = new Manufacture("China", "Beijing 7");
        Desktop lenovoTablet = new Desktop(lenovoManufacture, "Android 15", 64, 128);
        System.out.println(lenovoTablet);
        lenovoTablet.boot();
        lenovoTablet.shutDown();
    }
}