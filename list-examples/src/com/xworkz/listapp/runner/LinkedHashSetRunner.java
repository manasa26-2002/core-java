package com.xworkz.listapp.runner;

import java.util.Collection;
import java.util.Stack;
import java.util.TreeSet;

public class LinkedHashSetRunner {
    public static void main(String[] args) {

        Collection collection = new TreeSet();
        collection.add(235);
        collection.add(150);
        collection.add(1003);
        collection.add(788);
        collection.add(760);
        collection.add(399);
        collection.add(1453);
        collection.add(1089);

        System.out.println(collection);
    }
}
