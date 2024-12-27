package com.xworkz.listapp.runner;

import java.util.Collection;
import java.util.TreeSet;
import java.util.Vector;

public class VectorRunner {
    public static void main(String[] args) {

        Collection collection = new Vector();
        collection.add("library");
        collection.add("event");
        collection.add("runner");
        collection.add(234);
        collection.add(760);
        collection.add(399);
        collection.add("gud mrng");
        collection.add(1089);

        System.out.println(collection);
    }
    }

