package com.xworkz.sports.sport;

import com.xworkz.sports.Sport;

public class SportRunner {
    public static void main(String[] args) {
        Sport sport =new Sport();
        sport.sportName();
        System.out.println("the  name is "+ sport.getSportName());
    }
}
