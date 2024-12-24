package com.xworkz.movie.theater;

import com.xworkz.movie.Theater;

public class TheaterRunner {
    public static void main(String[] args) {
        Theater theater = new Theater();
        theater.name("slv");
        System.out.println("theater name is:"+theater.getName());
    }
}
