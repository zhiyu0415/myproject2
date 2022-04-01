package com.fish.sales;

public class DiscountCustomer extends Customer{

    public DiscountCustomer(String customer, int spent) {
        super(customer, spent);
    }

    @Override
    public float backMoney() {
        return super.backMoney();
    }
    public void print(){
        System.out.println(customer+"\t"+spent+"\t"+(spent*0.9)+"\t");
    }
}
