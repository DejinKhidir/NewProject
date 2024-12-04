package com.dejin;

public class Main {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("L123", "Gaming Laptop", 1500.0, 5, 15.6, 16, 512, "Intel i7");
        Table table1 = new Table("T456", "Office Table", 200.0, 4, 1.2, 2.5, 5);
        Lights light1 = new Lights("L789", "LED Light", 25.0, 4, 40.0, 800);


        System.out.println("------Laptop Details------");
        laptop1.displayDetails();
        System.out.println(laptop1.toString());


        System.out.println("------Table Details------");
        table1.displayDetails();
        System.out.println(table1.toString());

        System.out.println("------Lights Details------");
        light1.displayDetails();
        System.out.println(light1.toString());
















    }
}