package com.fish;

public class SilverCustomer extends Customer {


    public SilverCustomer(String customer, int spent) {
        super(customer, spent);
    }

    public void print(){
        System.out.println(customer+"\t"+spent+"\t"+(spent-backMoney())+"\t"+"("+backMoney()+")"+"\t");
    }
}
