package com.fish.tickets;

public class Ticket {
    /*public static final int TAIPEI_STATION = 100;//加上public就到處都可以用
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 300;*/
    Station start;
    Station destinastion;
    int price;
    public Ticket(Station start, Station destanastion){
        this.start = start;
        this.destinastion = destanastion;
        if (start == Station.TAIPEI_STATION){
            if(destinastion == Station.TAICHUNG_STATION){
                price = 600;
            }else {
                price = 1500;
            }
        }else if(start == Station.TAICHUNG_STATION){
            if (destinastion == Station.TAIPEI_STATION){
                price = 600;
            }else{
                price = 900;
            }
        }else {
            if(destinastion == Station.TAIPEI_STATION){
                price = 1500;
            }else {
                price = 900;
            }
        }
    }
    public void print(){
        System.out.println(start+"\t"+destinastion+"\t"+price);
    }

}
