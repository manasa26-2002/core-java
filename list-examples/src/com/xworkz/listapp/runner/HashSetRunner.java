package com.xworkz.listapp.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class HashSetRunner {
    public static void main(String[] args) {


        Collection collection = new HashSet();
        collection.add(23);
        collection.add(50);
        collection.add(100);
        collection.add(78);
        collection.add(76);
        collection.add(99);
        collection.add(123);
        collection.add(150);

        System.out.println(collection);
    }
}
