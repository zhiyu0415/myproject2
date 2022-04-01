package com.fish.sales;

public class Tester {
    public static void main(String[] args) {
        Customer c1 = new Customer("0001",1200);
        Customer c2 = new Customer("0002",800);
        Customer c3 = new SilverCustomer("0003",2000);
        Customer c4 = new GoldenCustomer("0004",5000);
        DiscountCustomer c5 = new DiscountCustomer("0005",900);
        PlatinumCustomer c6 = new PlatinumCustomer("0006",2000);
        c1.print();
        c2.print();
        c3.print();
        c4.print();
        c5.print();
        c6.print();
    }
}
