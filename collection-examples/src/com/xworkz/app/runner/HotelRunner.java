package com.xworkz.app.runner;

import java.util.*;
import java.util.stream.Collectors;

public class HotelRunner {
    public static void main(String[] args) {


        List collection =new ArrayList();
        collection.add(new Hotel(3,"Taj","mumbai"));
        collection.add(new Hotel(6,"polas","gujrat"));
        collection.add(new Hotel(4,"Bala recengency","ballari"));
        collection.add(new Hotel(7,"Radission","Bengaluru"));
        collection.add(new Hotel(12,"rasotsav","Bengaluru"));
        collection.add(new Hotel(10,"Bageecha","gujrat"));

        Collections.sort(collection);


        System.out.println(collection.stream().sorted(Comparator.comparing(Hotel::getHotelId)).
                collect(Collectors.toList()));
    }
}
