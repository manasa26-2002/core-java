package com.xworkz.app.runner;

import java.util.ArrayList;
import java.util.Collection;

public class HotelRunner {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();
        hotel.setHotelId(45);
        hotel.setHotelName("taj");
        hotel.setPlace("mumbai");

        Collection collection =new ArrayList();
        collection.add(hotel);

        System.out.println(collection);

    }
}
