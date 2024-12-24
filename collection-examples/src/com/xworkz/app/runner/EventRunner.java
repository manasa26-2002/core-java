package com.xworkz.app.runner;

import java.util.ArrayList;
import java.util.Collection;

public class EventRunner {
    public static void main(String[] args) {

        Event event = new Event();
        event.setEventId(1);
        event.setWho("babi");
        event.setDescription("birthday leave");

        Collection collection = new ArrayList();
        collection.add(event);


        System.out.println(collection);
    }
}
