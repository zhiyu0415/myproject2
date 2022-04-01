package com.fish.tickets;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        //Ticket ticket = new Ticket(Station.TAICHUNG_STATION.id, Station.KAOHSIUNG_STATION.id);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your start station: (1)Taipei (2)Taichung (3) Kaohsiung");
        int choice = Integer.parseInt(scanner.next());
        Station start = null;
        switch (choice){
            case 1:
                start = Station.TAIPEI_STATION;
                break;
            case 2:
                start = Station.TAICHUNG_STATION;
                break;
            case 3:
                start = Station.KAOHSIUNG_STATION;
        }
        System.out.println("Please enter your destination station: (1)Taipei (2)Taichung (3) Kaohsiung");
        choice = Integer.parseInt(scanner.next());
        Station destination = null;
        switch (choice){
            case 1:
                destination = Station.TAIPEI_STATION;
                break;
            case 2:
                destination = Station.TAICHUNG_STATION;
                break;
            case 3:
                destination= Station.KAOHSIUNG_STATION;
                break;
        }
        System.out.println("Which kind of ticket: (1)normal (2)Student (3)Elder");
        Ticket ticket = null;
        choice = Integer.parseInt(scanner.next());
        switch(choice){
            case 1:
                ticket = new Ticket(start,destination);
                break;
            case 2:
                ticket = new StudentTicket(start,destination);
                break;
            case 3:
                ticket = new ElderTicket(start,destination);
                break;
        }
        ticket.print();
    }
}
