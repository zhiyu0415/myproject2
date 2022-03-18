package com.fish;

public class GoldenCustomer extends SilverCustomer{//SilverCustomer的比Customs重複性更高
    public GoldenCustomer(String customer, int spent) {
        super(customer, spent);
        off=0.2f;//繼承SilverCustomer的off=0.1所以在繼承建構子後改寫off的數值
    }

}
