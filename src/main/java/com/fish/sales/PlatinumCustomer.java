package com.fish.sales;

public class PlatinumCustomer extends SilverCustomer{
    public PlatinumCustomer(String customer, int spent) {
        super(customer, spent);
    }

    @Override
    public float backMoney() {
        return super.backMoney();
    }

    @Override
    public void print() {
        System.out.println(customer+"\t"+spent+"\t"+spent*0.7+"\t"+"("+backMoney()/0.1*0.2+")"+"\t");
    }
}
