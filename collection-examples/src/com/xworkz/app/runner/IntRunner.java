package com.xworkz.app.runner;

import java.util.ArrayList;
import java.util.Collection;

public class IntRunner {
    public static void main(String[] args) {

        Collection collection = new ArrayList();
        collection.add(23);
        collection.add(50);
        collection.add(100);
        collection.add(78);
        collection.add(76);
        collection.add(99);
        collection.add(123);
        collection.add(150);

       collection.add(collection);
       // collection.remove(100);
       // collection.clear();
        //collection.removeAll(collection);
        //collection.contains(collection);
        System.out.println(collection);
    }
}
