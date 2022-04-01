package com.fish.tickets;

public class ElderTicket extends Ticket{
    float off = 0.5f;
    public ElderTicket(Station start, Station destanastion) {
        super(start, destanastion);
        price = price-(int) (price*off);//整數化
    }
}
