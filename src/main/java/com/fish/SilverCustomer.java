package com.fish;

public class SilverCustomer extends Customer {


    public SilverCustomer(String customer, int spent) {
        super(customer, spent);
    }

    public void print(){
        float offMoney = (spent/1000)*off*1000;
        System.out.println(customer+"\t"+spent+"\t"+(spent-offMoney)+"\t"+"("+offMoney+")"+"\t");
    }
}
