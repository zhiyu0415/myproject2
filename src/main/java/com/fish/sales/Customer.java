package com.fish.sales;

public class Customer {
    String customer;
    int spent;
    float off =0.1f;
    public Customer(String customer,int spent){
        this.customer = customer;
        this.spent = spent;
    }
    public float backMoney(){
        return (spent/1000)*off*1000;
    }
    public void print(){
        System.out.println(customer+"\t"+spent+"\t"+(spent-backMoney())+"\t");
    }
}
