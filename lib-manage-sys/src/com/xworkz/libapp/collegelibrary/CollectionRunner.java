package com.xworkz.libapp.collegelibrary;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionRunner {
    public static void main(String[] args) {

        Collection collection1 = new ArrayList();
        collection1.add("event");
        collection1.add("calender");

        Collection collection = new ArrayList();
        collection.add("library");
        collection.add(5);
        collection.add("there are 5 libraries in city");

        collection.addAll(collection1);
        //collection.clear();
         //collection.remove(5);
        //collection.removeAll(collection);
        System.out.println(collection);

    }
}

