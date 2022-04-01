package com.fish.tickets;

public class StudentTicket extends Ticket{
    float off = 0.1f;
    public StudentTicket(Station start, Station destanastion) {
        super(start, destanastion);
        price = price-(int) (price*off);//整數化
    }
}
