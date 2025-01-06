package com.xworkz.app.runner;

import java.util.*;
import java.util.stream.Collectors;

public class ChocoRunner {
    public static void main(String[] args) {



        List<Chocolates> collection = new ArrayList();
        collection.add(new Chocolates(1,"milkybar","milk",30));
        collection.add(new Chocolates(4,"snickers","chocolate",20));
        collection.add(new Chocolates(5,"dairy milk","chocolate",40));
        collection.add(new Chocolates(8,"ferroro rocher","chocolate",400));
        collection.add(new Chocolates(7,"munch","chocolate",45));


        Collections.sort(collection);

        System.out.println(collection.stream().
                sorted(Comparator.comparing(Chocolates::getPrice)).
                collect(Collectors.toList()));

        System.out.println(collection.stream().
                sorted(Comparator.comparing(Chocolates::getName)).
                collect(Collectors.toList()));
    }
}
