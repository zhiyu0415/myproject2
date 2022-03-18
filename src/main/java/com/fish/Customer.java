package com.fish;

public class Customer {
    String customer;
    int spent;
    int total;
    float off =0.1f;
    public Customer(String customer){
        this.customer = customer;
    }
    public Customer(String customer,int spent){
        this(customer);
        this.spent = spent;
    }
    public void print(){
        float offMoney = (spent/1000)*off*1000;
        System.out.println(customer+"\t"+spent+"\t"+(spent-offMoney)+"\t");
    }
}