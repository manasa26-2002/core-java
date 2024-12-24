package com.xworkz.transport;

import com.xworkz.transport.bus.Bus;

public class BusRunner {
    public static void main(String[] args){
        Bus b1 = new Bus();
        b1.setColor("red");
        System.out.println("color of bus is:"+b1.getColor());

        Bus b2 = new Bus();
        b2.setNoOfSeats(65);
        System.out.println("seats present are:"+b2.getNoOfSeats());

        Bus b3 = new Bus();
        b3.setPassengers(55);
        System.out.println("no of passengers are:"+b3.getPassengers());
    }
}
