package com.xworkz.aircraft.aeroplane;

public class Aeroplane {
    String company;
    int noOfSeats;
    double ticketPrice;
    String source;
    String destination;

    public Aeroplane(){
        this("indian airways","bangaluru","delhi",5000.34,45);
        System.out.println("no arg cons invoked");
    }
    public Aeroplane(String company,String source,String destination,Double ticketPrice,int noOfSeats){
        this("qatar airways","delhi ","abudhabi");
        System.out.println("all arg cons invoked");
        this.company=company;
        this.source=source;
        this.destination=destination;
        this.ticketPrice=ticketPrice;
        this.noOfSeats=noOfSeats;
    }
    public Aeroplane(String company,String source,String destination){
        System.out.println("3 arg cons invoked");
        this.company=company;
        this.source=source;
        this.destination=destination;
    }
    public Aeroplane(String company,double ticketPrice,String source,String destination){
        System.out.println("3 arg cons invoked");
        this.company=company;
        this.source=source;
        this.destination=destination;
    }
    public void getAeroplaneInfo(){
        System.out.println("aeroplane company is:"+company);
        System.out.println("aeroplane no of seats are:"+noOfSeats);
        System.out.println("aeroplane ticket cost is:"+ticketPrice);
        System.out.println("sorce :"+source);
        System.out.println("destination:"+destination);
    }
}
