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
        int diff = Math.abs(start.id - destanastion.id);
        System.out.println("diff:"+diff);
        switch (diff) {
            case 100:
                price = 500;
            case 200:
                price = 600;
            case 300:
                price = 1100;
        }
        /*if (start == Station.TAIPEI_STATION){
            if(destinastion == Station.TAICHUNG_STATION){
                price = 500;
            }else {
                price = 1100;
            }
        }else if(start == Station.TAICHUNG_STATION){
            if (destinastion == Station.TAIPEI_STATION){
                price = 500;
            }else{
                price = 600;
            }
        }else {
            if(destinastion == Station.TAIPEI_STATION){
                price = 1100;
            }else {
                price = 600;
            }
        }*/
    }
    public void print(){
        System.out.println(start+"\t"+destinastion+"\t"+price);
    }

}
