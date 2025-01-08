package com.xworkz.app.runner;

import java.util.ArrayList;
import java.util.Collection;

public class StringRunner {
    public static void main(String[] args) {

        Collection collection =new ArrayList();
        collection.add("event");
        collection.add("hotel");
        collection.add("classes");
        collection.add("institution");
        collection.add("college");
        collection.add("party");
        collection.add("axis bank");
        collection.add("bakery");
        collection.add("parlour");

        collection.add(collection);
        collection.contains(collection);
        collection.remove("institution");
        collection.clear();
        collection.removeAll(collection);
        System.out.println(collection);
    }
}
