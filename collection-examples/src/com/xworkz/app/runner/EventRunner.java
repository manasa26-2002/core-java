package com.xworkz.app.runner;

import com.xworkz.app.runner.comparator.DobComparator;
import com.xworkz.app.runner.comparator.EventIdComparator;
import com.xworkz.app.runner.comparator.WhoComparator;

import java.util.*;
import java.util.stream.Collectors;

public class EventRunner {
    public static void main(String[] args) {

        List<Event> collection = new ArrayList();
        collection.add(new Event(2,"kiran","vacation","2/2/2004"));
        collection.add(new Event(3,"akshay","hospital","13/11/2013"));
        collection.add(new Event(1,"akash","birthday","25/10/2000"));



        //for(Object o : collection)
          //  System.out.println(o);

        Collections.sort(collection);
        System.out.println(collection.stream().sorted(Comparator.comparing(Event::getDescription))
                .collect(Collectors.toList()));



//        Collections.sort(collection,new WhoComparator());
//        Collections.sort(collection,new EventIdComparator());
//        Collections.sort(collection,new DobComparator());
//
    }
}
// theory assignment
//stream
//functional interface