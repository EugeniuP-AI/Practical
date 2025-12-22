package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private Manufacture manufacture;

    static void main() {
       Manufacture iphoneInfo = new Manufacture("iPhone 13 Pro Max", "Apple", "Foxconn");
       Phone iphone = new Phone(iphoneInfo);
       iphone.boot();
       iphone.shutDown();




//        Laptop laptop = new Laptop("DELL Vostro 13", "DELL", "DELL");
//        laptop.boot();
//        laptop.shutDown();
//        Desktop desktop = new Desktop("HP 143", "HP", "HP");
//        desktop.boot();
//        desktop.shutDown();
    }
}