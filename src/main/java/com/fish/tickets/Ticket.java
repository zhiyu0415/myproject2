package com.fish.tickets;

public class Ticket {
    /*public static final int TAIPEI_STATION = 100;//加上public就到處都可以用
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 300;*/
    int start;
    int destanastion;
    int price;
    public Ticket(int start, int destanastion){
        this.start = start;
        this.destanastion = destanastion;
    }

}
