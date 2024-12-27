package com.xworkz.listapp.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class LinkedRunner {

    public static void main(String[] args) {


        Collection collection = new LinkedList();
        collection.add(235);
        collection.add(150);
        collection.add(1003);
        collection.add(788);
        collection.add(760);
        collection.add(399);
        collection.add(14523);
        collection.add(15089);

        System.out.println(collection);
    }
}
