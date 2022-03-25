package com.fish.tickets;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Station.TAICHUNG_STATION.id, Station.KAOHSIUNG_STATION.id);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your start station: (1)Taipei (2)Taichung (3) Kaohsiung");
        int startStation = Integer.parseInt(scanner.next());
    }
}
