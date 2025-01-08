package com.xworkz.app.runner.comparator;

import com.xworkz.app.runner.Event;

import java.util.Comparator;

public class EventIdComparator implements Comparator<Event> {
    @Override
    public int compare(Event o1, Event o2) {
        return o1.getEventId() - (o2.getEventId());
    }
}
