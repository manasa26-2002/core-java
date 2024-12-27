package com.xworkz.listapp.runner;

import java.util.Collection;
import java.util.TreeSet;

public class PriorityRunner {
    public static void main(String[] args) {

        Collection collection = new TreeSet();
        collection.add(897);
        collection.add(450);
        collection.add(123);
        collection.add(12);
        collection.add(3);
        collection.add(01);
        collection.add(10000);
        collection.add(10895);

        System.out.println(collection);
    }
}
