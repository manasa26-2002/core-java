package com.xworkz.app.runner.comparator;

import com.xworkz.app.runner.Event;

import java.util.Comparator;

public class WhoComparator implements Comparator<Event> {
    @Override
    public int compare(Event o1, Event o2) {
        return o1.getWho().compareTo(o2.getWho());
    }
}
