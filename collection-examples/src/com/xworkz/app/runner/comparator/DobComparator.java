package com.xworkz.app.runner.comparator;

import com.xworkz.app.runner.Event;

import java.util.Comparator;

public class DobComparator implements Comparator<Event> {
    @Override
    public int compare(Event o1, Event o2) {
        return o1.getDob().compareTo(o2.getDob());
    }
}
