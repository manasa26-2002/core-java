package com.xworkz.calenderapp.calender;

import com.xworkz.calenderapp.event.Event;
import com.xworkz.calenderapp.event.EventType;

public interface Calender {

    public  boolean addEvent(Event event);

    public void getDetails();

    public Event getEventById(int id);

    public String getDescriptionByEventType(EventType eventType);

    public String WhoNotFoundException(String who);


}
