package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Phone phone = new Phone("IPHONE 13 Pro MAX", "Apple", "Apple");
        phone.boot();
        phone.shutDown();
        Laptop laptop = new Laptop("DELL Vostro 13", "DELL", "DELL");
        laptop.boot();
        laptop.shutDown();
        Desktop desktop = new Desktop("HP 143", "HP", "HP");
        desktop.boot();
        desktop.shutDown();
    }
}