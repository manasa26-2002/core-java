package com.xworkz.listapp.runner;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;

public class ArrayRunner {
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

        System.out.println(collection);
    }
}
