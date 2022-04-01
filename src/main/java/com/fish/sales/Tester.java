package com.fish.sales;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Customer>customers = new ArrayList<>();
        customers.add(new Customer("0001",1200));
        customers.add(new Customer("0002",800));
        customers.add(new SilverCustomer("0003",2000));
        customers.add(new GoldenCustomer("0004",5000));
        customers.add(new DiscountCustomer("0005",900));
        customers.add(new PlatinumCustomer("0006",2000));
        for (int i = 0; i < 6; i++) {
            customers.get(i).print();
        }

       /* Customer c1 = ;
        Customer c2 = ;
        Customer c3 = ;
        Customer c4 = ;
        DiscountCustomer c5 = ;
        PlatinumCustomer c6 = ;
        c1.print();
        c2.print();
        c3.print();
        c4.print();
        c5.print();
        c6.print();*/
    }
}
