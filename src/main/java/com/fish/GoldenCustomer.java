package com.fish;

public class GoldenCustomer extends SilverCustomer{
    public GoldenCustomer(String customer, int spent) {
        super(customer, spent);
        off=0.2f;
    }

}
